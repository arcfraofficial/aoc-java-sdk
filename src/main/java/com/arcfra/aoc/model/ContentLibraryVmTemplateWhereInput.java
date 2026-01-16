package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ContentLibraryVmTemplateWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ContentLibraryVmTemplateWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ContentLibraryVmTemplateWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ContentLibraryVmTemplateWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
    private Architecture architecture;

    public static final String SERIALIZED_NAME_ARCHITECTURE_IN = "architecture_in";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE_IN)
    private List<Architecture> architectureIn = null;

    public static final String SERIALIZED_NAME_ARCHITECTURE_NOT = "architecture_not";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT)
    private Architecture architectureNot;

    public static final String SERIALIZED_NAME_ARCHITECTURE_NOT_IN = "architecture_not_in";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT_IN)
    private List<Architecture> architectureNotIn = null;

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

    public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
    private Boolean cloudInitSupported;

    public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT =
            "cloud_init_supported_not";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT)
    private Boolean cloudInitSupportedNot;

    public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
    private ClusterWhereInput clustersEvery;

    public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
    private ClusterWhereInput clustersNone;

    public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
    private ClusterWhereInput clustersSome;

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

    public static final String SERIALIZED_NAME_OS = "os";

    @SerializedName(SERIALIZED_NAME_OS)
    private String os;

    public static final String SERIALIZED_NAME_OS_CONTAINS = "os_contains";

    @SerializedName(SERIALIZED_NAME_OS_CONTAINS)
    private String osContains;

    public static final String SERIALIZED_NAME_OS_ENDS_WITH = "os_ends_with";

    @SerializedName(SERIALIZED_NAME_OS_ENDS_WITH)
    private String osEndsWith;

    public static final String SERIALIZED_NAME_OS_GT = "os_gt";

    @SerializedName(SERIALIZED_NAME_OS_GT)
    private String osGt;

    public static final String SERIALIZED_NAME_OS_GTE = "os_gte";

    @SerializedName(SERIALIZED_NAME_OS_GTE)
    private String osGte;

    public static final String SERIALIZED_NAME_OS_IN = "os_in";

    @SerializedName(SERIALIZED_NAME_OS_IN)
    private List<String> osIn = null;

    public static final String SERIALIZED_NAME_OS_LT = "os_lt";

    @SerializedName(SERIALIZED_NAME_OS_LT)
    private String osLt;

    public static final String SERIALIZED_NAME_OS_LTE = "os_lte";

    @SerializedName(SERIALIZED_NAME_OS_LTE)
    private String osLte;

    public static final String SERIALIZED_NAME_OS_NOT = "os_not";

    @SerializedName(SERIALIZED_NAME_OS_NOT)
    private String osNot;

    public static final String SERIALIZED_NAME_OS_NOT_CONTAINS = "os_not_contains";

    @SerializedName(SERIALIZED_NAME_OS_NOT_CONTAINS)
    private String osNotContains;

    public static final String SERIALIZED_NAME_OS_NOT_ENDS_WITH = "os_not_ends_with";

    @SerializedName(SERIALIZED_NAME_OS_NOT_ENDS_WITH)
    private String osNotEndsWith;

    public static final String SERIALIZED_NAME_OS_NOT_IN = "os_not_in";

    @SerializedName(SERIALIZED_NAME_OS_NOT_IN)
    private List<String> osNotIn = null;

    public static final String SERIALIZED_NAME_OS_NOT_STARTS_WITH = "os_not_starts_with";

    @SerializedName(SERIALIZED_NAME_OS_NOT_STARTS_WITH)
    private String osNotStartsWith;

    public static final String SERIALIZED_NAME_OS_STARTS_WITH = "os_starts_with";

    @SerializedName(SERIALIZED_NAME_OS_STARTS_WITH)
    private String osStartsWith;

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

    public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
    private String videoType;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_CONTAINS = "video_type_contains";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS)
    private String videoTypeContains;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH = "video_type_ends_with";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH)
    private String videoTypeEndsWith;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_GT = "video_type_gt";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_GT)
    private String videoTypeGt;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_GTE = "video_type_gte";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_GTE)
    private String videoTypeGte;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_IN = "video_type_in";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_IN)
    private List<String> videoTypeIn = null;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_LT = "video_type_lt";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_LT)
    private String videoTypeLt;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_LTE = "video_type_lte";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_LTE)
    private String videoTypeLte;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT = "video_type_not";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT)
    private String videoTypeNot;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS = "video_type_not_contains";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS)
    private String videoTypeNotContains;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH =
            "video_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH)
    private String videoTypeNotEndsWith;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_IN = "video_type_not_in";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN)
    private List<String> videoTypeNotIn = null;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH =
            "video_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH)
    private String videoTypeNotStartsWith;

    public static final String SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH = "video_type_starts_with";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH)
    private String videoTypeStartsWith;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_EVERY = "vm_templates_every";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_EVERY)
    private VmTemplateWhereInput vmTemplatesEvery;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_NONE = "vm_templates_none";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_NONE)
    private VmTemplateWhereInput vmTemplatesNone;

    public static final String SERIALIZED_NAME_VM_TEMPLATES_SOME = "vm_templates_some";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_SOME)
    private VmTemplateWhereInput vmTemplatesSome;

    public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";

    @SerializedName(SERIALIZED_NAME_WIN_OPT)
    private Boolean winOpt;

    public static final String SERIALIZED_NAME_WIN_OPT_NOT = "win_opt_not";

    @SerializedName(SERIALIZED_NAME_WIN_OPT_NOT)
    private Boolean winOptNot;

    public ContentLibraryVmTemplateWhereInput() {}

    public ContentLibraryVmTemplateWhereInput AND(List<ContentLibraryVmTemplateWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addANDItem(
            ContentLibraryVmTemplateWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ContentLibraryVmTemplateWhereInput>();
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
    public List<ContentLibraryVmTemplateWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ContentLibraryVmTemplateWhereInput> AND) {
        this.AND = AND;
    }

    public ContentLibraryVmTemplateWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput AND_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput NOT(List<ContentLibraryVmTemplateWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addNOTItem(
            ContentLibraryVmTemplateWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ContentLibraryVmTemplateWhereInput>();
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
    public List<ContentLibraryVmTemplateWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ContentLibraryVmTemplateWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ContentLibraryVmTemplateWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput NOT_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput OR(List<ContentLibraryVmTemplateWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addORItem(ContentLibraryVmTemplateWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ContentLibraryVmTemplateWhereInput>();
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
    public List<ContentLibraryVmTemplateWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ContentLibraryVmTemplateWhereInput> OR) {
        this.OR = OR;
    }

    public ContentLibraryVmTemplateWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput OR_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput architecture(Architecture architecture) {

        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     *
     * @return architecture
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Architecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture;
    }

    public ContentLibraryVmTemplateWhereInput architecture_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput architecture_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public void setArchitecture_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        }
    }

    public boolean getArchitecture_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE);
    }

    public ContentLibraryVmTemplateWhereInput architectureIn(List<Architecture> architectureIn) {

        this.architectureIn = architectureIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addArchitectureInItem(
            Architecture architectureInItem) {
        if (this.architectureIn == null) {
            this.architectureIn = new ArrayList<Architecture>();
        }
        this.architectureIn.add(architectureInItem);
        return this;
    }

    /**
     * Get architectureIn
     *
     * @return architectureIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Architecture> getArchitectureIn() {
        return architectureIn;
    }

    public void setArchitectureIn(List<Architecture> architectureIn) {
        this.architectureIn = architectureIn;
    }

    public ContentLibraryVmTemplateWhereInput architectureIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput architectureIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_IN);
        return this;
    }

    public void setArchitectureIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_IN);
        }
    }

    public boolean getArchitectureIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE_IN);
    }

    public ContentLibraryVmTemplateWhereInput architectureNot(Architecture architectureNot) {

        this.architectureNot = architectureNot;
        return this;
    }

    /**
     * Get architectureNot
     *
     * @return architectureNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Architecture getArchitectureNot() {
        return architectureNot;
    }

    public void setArchitectureNot(Architecture architectureNot) {
        this.architectureNot = architectureNot;
    }

    public ContentLibraryVmTemplateWhereInput architectureNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput architectureNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT);
        return this;
    }

    public void setArchitectureNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT);
        }
    }

    public boolean getArchitectureNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE_NOT);
    }

    public ContentLibraryVmTemplateWhereInput architectureNotIn(
            List<Architecture> architectureNotIn) {

        this.architectureNotIn = architectureNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addArchitectureNotInItem(
            Architecture architectureNotInItem) {
        if (this.architectureNotIn == null) {
            this.architectureNotIn = new ArrayList<Architecture>();
        }
        this.architectureNotIn.add(architectureNotInItem);
        return this;
    }

    /**
     * Get architectureNotIn
     *
     * @return architectureNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Architecture> getArchitectureNotIn() {
        return architectureNotIn;
    }

    public void setArchitectureNotIn(List<Architecture> architectureNotIn) {
        this.architectureNotIn = architectureNotIn;
    }

    public ContentLibraryVmTemplateWhereInput architectureNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput architectureNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        return this;
    }

    public void setArchitectureNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        }
    }

    public boolean getArchitectureNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
    }

    public ContentLibraryVmTemplateWhereInput clockOffset(VmClockOffset clockOffset) {

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

    public ContentLibraryVmTemplateWhereInput clockOffset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clockOffset_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput clockOffsetIn(List<VmClockOffset> clockOffsetIn) {

        this.clockOffsetIn = clockOffsetIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addClockOffsetInItem(
            VmClockOffset clockOffsetInItem) {
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

    public ContentLibraryVmTemplateWhereInput clockOffsetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clockOffsetIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput clockOffsetNot(VmClockOffset clockOffsetNot) {

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

    public ContentLibraryVmTemplateWhereInput clockOffsetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clockOffsetNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput clockOffsetNotIn(
            List<VmClockOffset> clockOffsetNotIn) {

        this.clockOffsetNotIn = clockOffsetNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addClockOffsetNotInItem(
            VmClockOffset clockOffsetNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput clockOffsetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clockOffsetNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cloudInitSupported(Boolean cloudInitSupported) {

        this.cloudInitSupported = cloudInitSupported;
        return this;
    }

    /**
     * Get cloudInitSupported
     *
     * @return cloudInitSupported
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCloudInitSupported() {
        return cloudInitSupported;
    }

    public void setCloudInitSupported(Boolean cloudInitSupported) {
        this.cloudInitSupported = cloudInitSupported;
    }

    public ContentLibraryVmTemplateWhereInput cloudInitSupported_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cloudInitSupported_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public void setCloudInitSupported_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        }
    }

    public boolean getCloudInitSupported_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
    }

    public ContentLibraryVmTemplateWhereInput cloudInitSupportedNot(Boolean cloudInitSupportedNot) {

        this.cloudInitSupportedNot = cloudInitSupportedNot;
        return this;
    }

    /**
     * Get cloudInitSupportedNot
     *
     * @return cloudInitSupportedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCloudInitSupportedNot() {
        return cloudInitSupportedNot;
    }

    public void setCloudInitSupportedNot(Boolean cloudInitSupportedNot) {
        this.cloudInitSupportedNot = cloudInitSupportedNot;
    }

    public ContentLibraryVmTemplateWhereInput cloudInitSupportedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cloudInitSupportedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT);
        return this;
    }

    public void setCloudInitSupportedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT);
        }
    }

    public boolean getCloudInitSupportedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT);
    }

    public ContentLibraryVmTemplateWhereInput clustersEvery(ClusterWhereInput clustersEvery) {

        this.clustersEvery = clustersEvery;
        return this;
    }

    /**
     * Get clustersEvery
     *
     * @return clustersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersEvery() {
        return clustersEvery;
    }

    public void setClustersEvery(ClusterWhereInput clustersEvery) {
        this.clustersEvery = clustersEvery;
    }

    public ContentLibraryVmTemplateWhereInput clustersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_EVERY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clustersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_EVERY);
        return this;
    }

    public void setClustersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_EVERY);
        }
    }

    public boolean getClustersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_EVERY);
    }

    public ContentLibraryVmTemplateWhereInput clustersNone(ClusterWhereInput clustersNone) {

        this.clustersNone = clustersNone;
        return this;
    }

    /**
     * Get clustersNone
     *
     * @return clustersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersNone() {
        return clustersNone;
    }

    public void setClustersNone(ClusterWhereInput clustersNone) {
        this.clustersNone = clustersNone;
    }

    public ContentLibraryVmTemplateWhereInput clustersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_NONE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clustersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_NONE);
        return this;
    }

    public void setClustersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_NONE);
        }
    }

    public boolean getClustersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_NONE);
    }

    public ContentLibraryVmTemplateWhereInput clustersSome(ClusterWhereInput clustersSome) {

        this.clustersSome = clustersSome;
        return this;
    }

    /**
     * Get clustersSome
     *
     * @return clustersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersSome() {
        return clustersSome;
    }

    public void setClustersSome(ClusterWhereInput clustersSome) {
        this.clustersSome = clustersSome;
    }

    public ContentLibraryVmTemplateWhereInput clustersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_SOME);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput clustersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_SOME);
        return this;
    }

    public void setClustersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_SOME);
        }
    }

    public boolean getClustersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_SOME);
    }

    public ContentLibraryVmTemplateWhereInput cpuModel(String cpuModel) {

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

    public ContentLibraryVmTemplateWhereInput cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModel_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelContains(String cpuModelContains) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelEndsWith(String cpuModelEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelGt(String cpuModelGt) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelGte(String cpuModelGte) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelIn(List<String> cpuModelIn) {

        this.cpuModelIn = cpuModelIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addCpuModelInItem(String cpuModelInItem) {
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

    public ContentLibraryVmTemplateWhereInput cpuModelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelLt(String cpuModelLt) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelLte(String cpuModelLte) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelNot(String cpuModelNot) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelNotContains(String cpuModelNotContains) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelNotContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelNotEndsWith(String cpuModelNotEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelNotEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelNotIn(List<String> cpuModelNotIn) {

        this.cpuModelNotIn = cpuModelNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addCpuModelNotInItem(String cpuModelNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput cpuModelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelNotStartsWith(String cpuModelNotStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelNotStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput cpuModelStartsWith(String cpuModelStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput cpuModelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput cpuModelStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAt(String createdAt) {

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

    public ContentLibraryVmTemplateWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtGt(String createdAtGt) {

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

    public ContentLibraryVmTemplateWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtGte(String createdAtGte) {

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

    public ContentLibraryVmTemplateWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ContentLibraryVmTemplateWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtLt(String createdAtLt) {

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

    public ContentLibraryVmTemplateWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtLte(String createdAtLte) {

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

    public ContentLibraryVmTemplateWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtNot(String createdAtNot) {

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

    public ContentLibraryVmTemplateWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput description(String description) {

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

    public ContentLibraryVmTemplateWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput description_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionContains(String descriptionContains) {

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

    public ContentLibraryVmTemplateWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionGt(String descriptionGt) {

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

    public ContentLibraryVmTemplateWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionGte(String descriptionGte) {

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

    public ContentLibraryVmTemplateWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public ContentLibraryVmTemplateWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionLt(String descriptionLt) {

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

    public ContentLibraryVmTemplateWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionLte(String descriptionLte) {

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

    public ContentLibraryVmTemplateWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionNot(String descriptionNot) {

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

    public ContentLibraryVmTemplateWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionNotContains(
            String descriptionNotContains) {

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

    public ContentLibraryVmTemplateWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionNotEndsWith(
            String descriptionNotEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionNotStartsWith(
            String descriptionNotStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatus(
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addEntityAsyncStatusInItem(
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusNot(
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addEntityAsyncStatusNotInItem(
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

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput firmware(VmFirmware firmware) {

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

    public ContentLibraryVmTemplateWhereInput firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput firmware_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput firmwareIn(List<VmFirmware> firmwareIn) {

        this.firmwareIn = firmwareIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addFirmwareInItem(VmFirmware firmwareInItem) {
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

    public ContentLibraryVmTemplateWhereInput firmwareIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput firmwareIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput firmwareNot(VmFirmware firmwareNot) {

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

    public ContentLibraryVmTemplateWhereInput firmwareNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput firmwareNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput firmwareNotIn(List<VmFirmware> firmwareNotIn) {

        this.firmwareNotIn = firmwareNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addFirmwareNotInItem(VmFirmware firmwareNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput firmwareNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput firmwareNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput ha(Boolean ha) {

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

    public ContentLibraryVmTemplateWhereInput ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput ha_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput haNot(Boolean haNot) {

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

    public ContentLibraryVmTemplateWhereInput haNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput haNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput id(String id) {

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

    public ContentLibraryVmTemplateWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput id_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idContains(String idContains) {

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

    public ContentLibraryVmTemplateWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idEndsWith(String idEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idGt(String idGt) {

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

    public ContentLibraryVmTemplateWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idGte(String idGte) {

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

    public ContentLibraryVmTemplateWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addIdInItem(String idInItem) {
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

    public ContentLibraryVmTemplateWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idLt(String idLt) {

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

    public ContentLibraryVmTemplateWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idLte(String idLte) {

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

    public ContentLibraryVmTemplateWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idNot(String idNot) {

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

    public ContentLibraryVmTemplateWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idNotContains(String idNotContains) {

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

    public ContentLibraryVmTemplateWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idNotContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addIdNotInItem(String idNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput idStartsWith(String idStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput ioPolicy(VmDiskIoPolicy ioPolicy) {

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

    public ContentLibraryVmTemplateWhereInput ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput ioPolicy_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput ioPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {

        this.ioPolicyIn = ioPolicyIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addIoPolicyInItem(VmDiskIoPolicy ioPolicyInItem) {
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

    public ContentLibraryVmTemplateWhereInput ioPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput ioPolicyIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput ioPolicyNot(VmDiskIoPolicy ioPolicyNot) {

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

    public ContentLibraryVmTemplateWhereInput ioPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput ioPolicyNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput ioPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {

        this.ioPolicyNotIn = ioPolicyNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addIoPolicyNotInItem(
            VmDiskIoPolicy ioPolicyNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput ioPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput ioPolicyNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public ContentLibraryVmTemplateWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput labelsEvery_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public ContentLibraryVmTemplateWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput labelsNone_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public ContentLibraryVmTemplateWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput labelsSome_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidth(Long maxBandwidth) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidth_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthGt(Long maxBandwidthGt) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthGte(Long maxBandwidthGte) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthIn(List<Long> maxBandwidthIn) {

        this.maxBandwidthIn = maxBandwidthIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxBandwidthInItem(Long maxBandwidthInItem) {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthLt(Long maxBandwidthLt) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthLte(Long maxBandwidthLte) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthNot(Long maxBandwidthNot) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthNotIn(List<Long> maxBandwidthNotIn) {

        this.maxBandwidthNotIn = maxBandwidthNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxBandwidthNotInItem(Long maxBandwidthNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicy(
            VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicy_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {

        this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxBandwidthPolicyInItem(
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyNot(
            VmDiskIoRestrictType maxBandwidthPolicyNot) {

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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyNotIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {

        this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxBandwidthPolicyNotInItem(
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

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxBandwidthPolicyNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIops(Integer maxIops) {

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

    public ContentLibraryVmTemplateWhereInput maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIops_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsGt(Integer maxIopsGt) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsGte(Integer maxIopsGte) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsIn(List<Integer> maxIopsIn) {

        this.maxIopsIn = maxIopsIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
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

    public ContentLibraryVmTemplateWhereInput maxIopsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsLt(Integer maxIopsLt) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsLte(Integer maxIopsLte) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsNot(Integer maxIopsNot) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {

        this.maxIopsNotIn = maxIopsNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput maxIopsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsPolicy_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyIn(
            List<VmDiskIoRestrictType> maxIopsPolicyIn) {

        this.maxIopsPolicyIn = maxIopsPolicyIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxIopsPolicyInItem(
            VmDiskIoRestrictType maxIopsPolicyInItem) {
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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyNot(
            VmDiskIoRestrictType maxIopsPolicyNot) {

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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyNotIn(
            List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {

        this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMaxIopsPolicyNotInItem(
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

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput maxIopsPolicyNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memory(Long memory) {

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

    public ContentLibraryVmTemplateWhereInput memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memory_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryGt(Long memoryGt) {

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

    public ContentLibraryVmTemplateWhereInput memoryGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryGte(Long memoryGte) {

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

    public ContentLibraryVmTemplateWhereInput memoryGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryIn(List<Long> memoryIn) {

        this.memoryIn = memoryIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMemoryInItem(Long memoryInItem) {
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

    public ContentLibraryVmTemplateWhereInput memoryIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryLt(Long memoryLt) {

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

    public ContentLibraryVmTemplateWhereInput memoryLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryLte(Long memoryLte) {

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

    public ContentLibraryVmTemplateWhereInput memoryLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryNot(Long memoryNot) {

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

    public ContentLibraryVmTemplateWhereInput memoryNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput memoryNotIn(List<Long> memoryNotIn) {

        this.memoryNotIn = memoryNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addMemoryNotInItem(Long memoryNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput memoryNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput memoryNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput name(String name) {

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

    public ContentLibraryVmTemplateWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput name_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameContains(String nameContains) {

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

    public ContentLibraryVmTemplateWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameEndsWith(String nameEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameGt(String nameGt) {

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

    public ContentLibraryVmTemplateWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameGte(String nameGte) {

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

    public ContentLibraryVmTemplateWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addNameInItem(String nameInItem) {
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

    public ContentLibraryVmTemplateWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameLt(String nameLt) {

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

    public ContentLibraryVmTemplateWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameLte(String nameLte) {

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

    public ContentLibraryVmTemplateWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameNot(String nameNot) {

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

    public ContentLibraryVmTemplateWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameNotContains(String nameNotContains) {

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

    public ContentLibraryVmTemplateWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ContentLibraryVmTemplateWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput nameStartsWith(String nameStartsWith) {

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

    public ContentLibraryVmTemplateWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput os(String os) {

        this.os = os;
        return this;
    }

    /**
     * Get os
     *
     * @return os
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public ContentLibraryVmTemplateWhereInput os_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput os_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS);
        return this;
    }

    public void setOs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS);
        }
    }

    public boolean getOs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS);
    }

    public ContentLibraryVmTemplateWhereInput osContains(String osContains) {

        this.osContains = osContains;
        return this;
    }

    /**
     * Get osContains
     *
     * @return osContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsContains() {
        return osContains;
    }

    public void setOsContains(String osContains) {
        this.osContains = osContains;
    }

    public ContentLibraryVmTemplateWhereInput osContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_CONTAINS);
        return this;
    }

    public void setOsContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_CONTAINS);
        }
    }

    public boolean getOsContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_CONTAINS);
    }

    public ContentLibraryVmTemplateWhereInput osEndsWith(String osEndsWith) {

        this.osEndsWith = osEndsWith;
        return this;
    }

    /**
     * Get osEndsWith
     *
     * @return osEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsEndsWith() {
        return osEndsWith;
    }

    public void setOsEndsWith(String osEndsWith) {
        this.osEndsWith = osEndsWith;
    }

    public ContentLibraryVmTemplateWhereInput osEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_ENDS_WITH);
        return this;
    }

    public void setOsEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_ENDS_WITH);
        }
    }

    public boolean getOsEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_ENDS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput osGt(String osGt) {

        this.osGt = osGt;
        return this;
    }

    /**
     * Get osGt
     *
     * @return osGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsGt() {
        return osGt;
    }

    public void setOsGt(String osGt) {
        this.osGt = osGt;
    }

    public ContentLibraryVmTemplateWhereInput osGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_GT);
        return this;
    }

    public void setOsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_GT);
        }
    }

    public boolean getOsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_GT);
    }

    public ContentLibraryVmTemplateWhereInput osGte(String osGte) {

        this.osGte = osGte;
        return this;
    }

    /**
     * Get osGte
     *
     * @return osGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsGte() {
        return osGte;
    }

    public void setOsGte(String osGte) {
        this.osGte = osGte;
    }

    public ContentLibraryVmTemplateWhereInput osGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_GTE);
        return this;
    }

    public void setOsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_GTE);
        }
    }

    public boolean getOsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_GTE);
    }

    public ContentLibraryVmTemplateWhereInput osIn(List<String> osIn) {

        this.osIn = osIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addOsInItem(String osInItem) {
        if (this.osIn == null) {
            this.osIn = new ArrayList<String>();
        }
        this.osIn.add(osInItem);
        return this;
    }

    /**
     * Get osIn
     *
     * @return osIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOsIn() {
        return osIn;
    }

    public void setOsIn(List<String> osIn) {
        this.osIn = osIn;
    }

    public ContentLibraryVmTemplateWhereInput osIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_IN);
        return this;
    }

    public void setOsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_IN);
        }
    }

    public boolean getOsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_IN);
    }

    public ContentLibraryVmTemplateWhereInput osLt(String osLt) {

        this.osLt = osLt;
        return this;
    }

    /**
     * Get osLt
     *
     * @return osLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsLt() {
        return osLt;
    }

    public void setOsLt(String osLt) {
        this.osLt = osLt;
    }

    public ContentLibraryVmTemplateWhereInput osLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_LT);
        return this;
    }

    public void setOsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_LT);
        }
    }

    public boolean getOsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_LT);
    }

    public ContentLibraryVmTemplateWhereInput osLte(String osLte) {

        this.osLte = osLte;
        return this;
    }

    /**
     * Get osLte
     *
     * @return osLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsLte() {
        return osLte;
    }

    public void setOsLte(String osLte) {
        this.osLte = osLte;
    }

    public ContentLibraryVmTemplateWhereInput osLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_LTE);
        return this;
    }

    public void setOsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_LTE);
        }
    }

    public boolean getOsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_LTE);
    }

    public ContentLibraryVmTemplateWhereInput osNot(String osNot) {

        this.osNot = osNot;
        return this;
    }

    /**
     * Get osNot
     *
     * @return osNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsNot() {
        return osNot;
    }

    public void setOsNot(String osNot) {
        this.osNot = osNot;
    }

    public ContentLibraryVmTemplateWhereInput osNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_NOT);
        return this;
    }

    public void setOsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_NOT);
        }
    }

    public boolean getOsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_NOT);
    }

    public ContentLibraryVmTemplateWhereInput osNotContains(String osNotContains) {

        this.osNotContains = osNotContains;
        return this;
    }

    /**
     * Get osNotContains
     *
     * @return osNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsNotContains() {
        return osNotContains;
    }

    public void setOsNotContains(String osNotContains) {
        this.osNotContains = osNotContains;
    }

    public ContentLibraryVmTemplateWhereInput osNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_CONTAINS);
        return this;
    }

    public void setOsNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_CONTAINS);
        }
    }

    public boolean getOsNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_NOT_CONTAINS);
    }

    public ContentLibraryVmTemplateWhereInput osNotEndsWith(String osNotEndsWith) {

        this.osNotEndsWith = osNotEndsWith;
        return this;
    }

    /**
     * Get osNotEndsWith
     *
     * @return osNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsNotEndsWith() {
        return osNotEndsWith;
    }

    public void setOsNotEndsWith(String osNotEndsWith) {
        this.osNotEndsWith = osNotEndsWith;
    }

    public ContentLibraryVmTemplateWhereInput osNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_ENDS_WITH);
        return this;
    }

    public void setOsNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_ENDS_WITH);
        }
    }

    public boolean getOsNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_NOT_ENDS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput osNotIn(List<String> osNotIn) {

        this.osNotIn = osNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addOsNotInItem(String osNotInItem) {
        if (this.osNotIn == null) {
            this.osNotIn = new ArrayList<String>();
        }
        this.osNotIn.add(osNotInItem);
        return this;
    }

    /**
     * Get osNotIn
     *
     * @return osNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOsNotIn() {
        return osNotIn;
    }

    public void setOsNotIn(List<String> osNotIn) {
        this.osNotIn = osNotIn;
    }

    public ContentLibraryVmTemplateWhereInput osNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_IN);
        return this;
    }

    public void setOsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_IN);
        }
    }

    public boolean getOsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_NOT_IN);
    }

    public ContentLibraryVmTemplateWhereInput osNotStartsWith(String osNotStartsWith) {

        this.osNotStartsWith = osNotStartsWith;
        return this;
    }

    /**
     * Get osNotStartsWith
     *
     * @return osNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsNotStartsWith() {
        return osNotStartsWith;
    }

    public void setOsNotStartsWith(String osNotStartsWith) {
        this.osNotStartsWith = osNotStartsWith;
    }

    public ContentLibraryVmTemplateWhereInput osNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_STARTS_WITH);
        return this;
    }

    public void setOsNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_NOT_STARTS_WITH);
        }
    }

    public boolean getOsNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_NOT_STARTS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput osStartsWith(String osStartsWith) {

        this.osStartsWith = osStartsWith;
        return this;
    }

    /**
     * Get osStartsWith
     *
     * @return osStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsStartsWith() {
        return osStartsWith;
    }

    public void setOsStartsWith(String osStartsWith) {
        this.osStartsWith = osStartsWith;
    }

    public ContentLibraryVmTemplateWhereInput osStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput osStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_STARTS_WITH);
        return this;
    }

    public void setOsStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_STARTS_WITH);
        }
    }

    public boolean getOsStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_STARTS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput size(Long size) {

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

    public ContentLibraryVmTemplateWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput size_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeGt(Long sizeGt) {

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

    public ContentLibraryVmTemplateWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeGte(Long sizeGte) {

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

    public ContentLibraryVmTemplateWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addSizeInItem(Long sizeInItem) {
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

    public ContentLibraryVmTemplateWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeLt(Long sizeLt) {

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

    public ContentLibraryVmTemplateWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeLte(Long sizeLte) {

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

    public ContentLibraryVmTemplateWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeNot(Long sizeNot) {

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

    public ContentLibraryVmTemplateWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addSizeNotInItem(Long sizeNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput sizeNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpu(Integer vcpu) {

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

    public ContentLibraryVmTemplateWhereInput vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpu_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuGt(Integer vcpuGt) {

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

    public ContentLibraryVmTemplateWhereInput vcpuGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuGt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuGte(Integer vcpuGte) {

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

    public ContentLibraryVmTemplateWhereInput vcpuGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuGte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuIn(List<Integer> vcpuIn) {

        this.vcpuIn = vcpuIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addVcpuInItem(Integer vcpuInItem) {
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

    public ContentLibraryVmTemplateWhereInput vcpuIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuLt(Integer vcpuLt) {

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

    public ContentLibraryVmTemplateWhereInput vcpuLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuLt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuLte(Integer vcpuLte) {

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

    public ContentLibraryVmTemplateWhereInput vcpuLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuLte_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuNot(Integer vcpuNot) {

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

    public ContentLibraryVmTemplateWhereInput vcpuNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuNot_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {

        this.vcpuNotIn = vcpuNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
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

    public ContentLibraryVmTemplateWhereInput vcpuNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vcpuNotIn_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput videoType(String videoType) {

        this.videoType = videoType;
        return this;
    }

    /**
     * Get videoType
     *
     * @return videoType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public ContentLibraryVmTemplateWhereInput videoType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public void setVideoType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE);
        }
    }

    public boolean getVideoType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeContains(String videoTypeContains) {

        this.videoTypeContains = videoTypeContains;
        return this;
    }

    /**
     * Get videoTypeContains
     *
     * @return videoTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeContains() {
        return videoTypeContains;
    }

    public void setVideoTypeContains(String videoTypeContains) {
        this.videoTypeContains = videoTypeContains;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS);
        return this;
    }

    public void setVideoTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS);
        }
    }

    public boolean getVideoTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeEndsWith(String videoTypeEndsWith) {

        this.videoTypeEndsWith = videoTypeEndsWith;
        return this;
    }

    /**
     * Get videoTypeEndsWith
     *
     * @return videoTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeEndsWith() {
        return videoTypeEndsWith;
    }

    public void setVideoTypeEndsWith(String videoTypeEndsWith) {
        this.videoTypeEndsWith = videoTypeEndsWith;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH);
        return this;
    }

    public void setVideoTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH);
        }
    }

    public boolean getVideoTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeGt(String videoTypeGt) {

        this.videoTypeGt = videoTypeGt;
        return this;
    }

    /**
     * Get videoTypeGt
     *
     * @return videoTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeGt() {
        return videoTypeGt;
    }

    public void setVideoTypeGt(String videoTypeGt) {
        this.videoTypeGt = videoTypeGt;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_GT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_GT);
        return this;
    }

    public void setVideoTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_GT);
        }
    }

    public boolean getVideoTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_GT);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeGte(String videoTypeGte) {

        this.videoTypeGte = videoTypeGte;
        return this;
    }

    /**
     * Get videoTypeGte
     *
     * @return videoTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeGte() {
        return videoTypeGte;
    }

    public void setVideoTypeGte(String videoTypeGte) {
        this.videoTypeGte = videoTypeGte;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_GTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_GTE);
        return this;
    }

    public void setVideoTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_GTE);
        }
    }

    public boolean getVideoTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_GTE);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeIn(List<String> videoTypeIn) {

        this.videoTypeIn = videoTypeIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addVideoTypeInItem(String videoTypeInItem) {
        if (this.videoTypeIn == null) {
            this.videoTypeIn = new ArrayList<String>();
        }
        this.videoTypeIn.add(videoTypeInItem);
        return this;
    }

    /**
     * Get videoTypeIn
     *
     * @return videoTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVideoTypeIn() {
        return videoTypeIn;
    }

    public void setVideoTypeIn(List<String> videoTypeIn) {
        this.videoTypeIn = videoTypeIn;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_IN);
        return this;
    }

    public void setVideoTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_IN);
        }
    }

    public boolean getVideoTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_IN);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeLt(String videoTypeLt) {

        this.videoTypeLt = videoTypeLt;
        return this;
    }

    /**
     * Get videoTypeLt
     *
     * @return videoTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeLt() {
        return videoTypeLt;
    }

    public void setVideoTypeLt(String videoTypeLt) {
        this.videoTypeLt = videoTypeLt;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_LT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_LT);
        return this;
    }

    public void setVideoTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_LT);
        }
    }

    public boolean getVideoTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_LT);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeLte(String videoTypeLte) {

        this.videoTypeLte = videoTypeLte;
        return this;
    }

    /**
     * Get videoTypeLte
     *
     * @return videoTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeLte() {
        return videoTypeLte;
    }

    public void setVideoTypeLte(String videoTypeLte) {
        this.videoTypeLte = videoTypeLte;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_LTE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_LTE);
        return this;
    }

    public void setVideoTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_LTE);
        }
    }

    public boolean getVideoTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_LTE);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNot(String videoTypeNot) {

        this.videoTypeNot = videoTypeNot;
        return this;
    }

    /**
     * Get videoTypeNot
     *
     * @return videoTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeNot() {
        return videoTypeNot;
    }

    public void setVideoTypeNot(String videoTypeNot) {
        this.videoTypeNot = videoTypeNot;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT);
        return this;
    }

    public void setVideoTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT);
        }
    }

    public boolean getVideoTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_NOT);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotContains(String videoTypeNotContains) {

        this.videoTypeNotContains = videoTypeNotContains;
        return this;
    }

    /**
     * Get videoTypeNotContains
     *
     * @return videoTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeNotContains() {
        return videoTypeNotContains;
    }

    public void setVideoTypeNotContains(String videoTypeNotContains) {
        this.videoTypeNotContains = videoTypeNotContains;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setVideoTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getVideoTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotEndsWith(String videoTypeNotEndsWith) {

        this.videoTypeNotEndsWith = videoTypeNotEndsWith;
        return this;
    }

    /**
     * Get videoTypeNotEndsWith
     *
     * @return videoTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeNotEndsWith() {
        return videoTypeNotEndsWith;
    }

    public void setVideoTypeNotEndsWith(String videoTypeNotEndsWith) {
        this.videoTypeNotEndsWith = videoTypeNotEndsWith;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setVideoTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getVideoTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotIn(List<String> videoTypeNotIn) {

        this.videoTypeNotIn = videoTypeNotIn;
        return this;
    }

    public ContentLibraryVmTemplateWhereInput addVideoTypeNotInItem(String videoTypeNotInItem) {
        if (this.videoTypeNotIn == null) {
            this.videoTypeNotIn = new ArrayList<String>();
        }
        this.videoTypeNotIn.add(videoTypeNotInItem);
        return this;
    }

    /**
     * Get videoTypeNotIn
     *
     * @return videoTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVideoTypeNotIn() {
        return videoTypeNotIn;
    }

    public void setVideoTypeNotIn(List<String> videoTypeNotIn) {
        this.videoTypeNotIn = videoTypeNotIn;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN);
        return this;
    }

    public void setVideoTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN);
        }
    }

    public boolean getVideoTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotStartsWith(
            String videoTypeNotStartsWith) {

        this.videoTypeNotStartsWith = videoTypeNotStartsWith;
        return this;
    }

    /**
     * Get videoTypeNotStartsWith
     *
     * @return videoTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeNotStartsWith() {
        return videoTypeNotStartsWith;
    }

    public void setVideoTypeNotStartsWith(String videoTypeNotStartsWith) {
        this.videoTypeNotStartsWith = videoTypeNotStartsWith;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setVideoTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getVideoTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput videoTypeStartsWith(String videoTypeStartsWith) {

        this.videoTypeStartsWith = videoTypeStartsWith;
        return this;
    }

    /**
     * Get videoTypeStartsWith
     *
     * @return videoTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVideoTypeStartsWith() {
        return videoTypeStartsWith;
    }

    public void setVideoTypeStartsWith(String videoTypeStartsWith) {
        this.videoTypeStartsWith = videoTypeStartsWith;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput videoTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH);
        return this;
    }

    public void setVideoTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH);
        }
    }

    public boolean getVideoTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH);
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesEvery(
            VmTemplateWhereInput vmTemplatesEvery) {

        this.vmTemplatesEvery = vmTemplatesEvery;
        return this;
    }

    /**
     * Get vmTemplatesEvery
     *
     * @return vmTemplatesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesEvery() {
        return vmTemplatesEvery;
    }

    public void setVmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
        this.vmTemplatesEvery = vmTemplatesEvery;
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        return this;
    }

    public void setVmTemplatesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
        }
    }

    public boolean getVmTemplatesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_EVERY);
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesNone(
            VmTemplateWhereInput vmTemplatesNone) {

        this.vmTemplatesNone = vmTemplatesNone;
        return this;
    }

    /**
     * Get vmTemplatesNone
     *
     * @return vmTemplatesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesNone() {
        return vmTemplatesNone;
    }

    public void setVmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
        this.vmTemplatesNone = vmTemplatesNone;
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        return this;
    }

    public void setVmTemplatesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_NONE);
        }
    }

    public boolean getVmTemplatesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_NONE);
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesSome(
            VmTemplateWhereInput vmTemplatesSome) {

        this.vmTemplatesSome = vmTemplatesSome;
        return this;
    }

    /**
     * Get vmTemplatesSome
     *
     * @return vmTemplatesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplatesSome() {
        return vmTemplatesSome;
    }

    public void setVmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
        this.vmTemplatesSome = vmTemplatesSome;
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput vmTemplatesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        return this;
    }

    public void setVmTemplatesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES_SOME);
        }
    }

    public boolean getVmTemplatesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES_SOME);
    }

    public ContentLibraryVmTemplateWhereInput winOpt(Boolean winOpt) {

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

    public ContentLibraryVmTemplateWhereInput winOpt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput winOpt_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateWhereInput winOptNot(Boolean winOptNot) {

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

    public ContentLibraryVmTemplateWhereInput winOptNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT_NOT);
        return this;
    }

    public ContentLibraryVmTemplateWhereInput winOptNot_ExplictlyNonNull() {
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
        ContentLibraryVmTemplateWhereInput contentLibraryVmTemplateWhereInput =
                (ContentLibraryVmTemplateWhereInput) o;
        return Objects.equals(this.AND, contentLibraryVmTemplateWhereInput.AND)
                && Objects.equals(this.NOT, contentLibraryVmTemplateWhereInput.NOT)
                && Objects.equals(this.OR, contentLibraryVmTemplateWhereInput.OR)
                && Objects.equals(
                        this.architecture, contentLibraryVmTemplateWhereInput.architecture)
                && Objects.equals(
                        this.architectureIn, contentLibraryVmTemplateWhereInput.architectureIn)
                && Objects.equals(
                        this.architectureNot, contentLibraryVmTemplateWhereInput.architectureNot)
                && Objects.equals(
                        this.architectureNotIn,
                        contentLibraryVmTemplateWhereInput.architectureNotIn)
                && Objects.equals(this.clockOffset, contentLibraryVmTemplateWhereInput.clockOffset)
                && Objects.equals(
                        this.clockOffsetIn, contentLibraryVmTemplateWhereInput.clockOffsetIn)
                && Objects.equals(
                        this.clockOffsetNot, contentLibraryVmTemplateWhereInput.clockOffsetNot)
                && Objects.equals(
                        this.clockOffsetNotIn, contentLibraryVmTemplateWhereInput.clockOffsetNotIn)
                && Objects.equals(
                        this.cloudInitSupported,
                        contentLibraryVmTemplateWhereInput.cloudInitSupported)
                && Objects.equals(
                        this.cloudInitSupportedNot,
                        contentLibraryVmTemplateWhereInput.cloudInitSupportedNot)
                && Objects.equals(
                        this.clustersEvery, contentLibraryVmTemplateWhereInput.clustersEvery)
                && Objects.equals(
                        this.clustersNone, contentLibraryVmTemplateWhereInput.clustersNone)
                && Objects.equals(
                        this.clustersSome, contentLibraryVmTemplateWhereInput.clustersSome)
                && Objects.equals(this.cpuModel, contentLibraryVmTemplateWhereInput.cpuModel)
                && Objects.equals(
                        this.cpuModelContains, contentLibraryVmTemplateWhereInput.cpuModelContains)
                && Objects.equals(
                        this.cpuModelEndsWith, contentLibraryVmTemplateWhereInput.cpuModelEndsWith)
                && Objects.equals(this.cpuModelGt, contentLibraryVmTemplateWhereInput.cpuModelGt)
                && Objects.equals(this.cpuModelGte, contentLibraryVmTemplateWhereInput.cpuModelGte)
                && Objects.equals(this.cpuModelIn, contentLibraryVmTemplateWhereInput.cpuModelIn)
                && Objects.equals(this.cpuModelLt, contentLibraryVmTemplateWhereInput.cpuModelLt)
                && Objects.equals(this.cpuModelLte, contentLibraryVmTemplateWhereInput.cpuModelLte)
                && Objects.equals(this.cpuModelNot, contentLibraryVmTemplateWhereInput.cpuModelNot)
                && Objects.equals(
                        this.cpuModelNotContains,
                        contentLibraryVmTemplateWhereInput.cpuModelNotContains)
                && Objects.equals(
                        this.cpuModelNotEndsWith,
                        contentLibraryVmTemplateWhereInput.cpuModelNotEndsWith)
                && Objects.equals(
                        this.cpuModelNotIn, contentLibraryVmTemplateWhereInput.cpuModelNotIn)
                && Objects.equals(
                        this.cpuModelNotStartsWith,
                        contentLibraryVmTemplateWhereInput.cpuModelNotStartsWith)
                && Objects.equals(
                        this.cpuModelStartsWith,
                        contentLibraryVmTemplateWhereInput.cpuModelStartsWith)
                && Objects.equals(this.createdAt, contentLibraryVmTemplateWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, contentLibraryVmTemplateWhereInput.createdAtGt)
                && Objects.equals(
                        this.createdAtGte, contentLibraryVmTemplateWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, contentLibraryVmTemplateWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, contentLibraryVmTemplateWhereInput.createdAtLt)
                && Objects.equals(
                        this.createdAtLte, contentLibraryVmTemplateWhereInput.createdAtLte)
                && Objects.equals(
                        this.createdAtNot, contentLibraryVmTemplateWhereInput.createdAtNot)
                && Objects.equals(
                        this.createdAtNotIn, contentLibraryVmTemplateWhereInput.createdAtNotIn)
                && Objects.equals(this.description, contentLibraryVmTemplateWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        contentLibraryVmTemplateWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        contentLibraryVmTemplateWhereInput.descriptionEndsWith)
                && Objects.equals(
                        this.descriptionGt, contentLibraryVmTemplateWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte, contentLibraryVmTemplateWhereInput.descriptionGte)
                && Objects.equals(
                        this.descriptionIn, contentLibraryVmTemplateWhereInput.descriptionIn)
                && Objects.equals(
                        this.descriptionLt, contentLibraryVmTemplateWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte, contentLibraryVmTemplateWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot, contentLibraryVmTemplateWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        contentLibraryVmTemplateWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        contentLibraryVmTemplateWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, contentLibraryVmTemplateWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        contentLibraryVmTemplateWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        contentLibraryVmTemplateWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus,
                        contentLibraryVmTemplateWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        contentLibraryVmTemplateWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        contentLibraryVmTemplateWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        contentLibraryVmTemplateWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.firmware, contentLibraryVmTemplateWhereInput.firmware)
                && Objects.equals(this.firmwareIn, contentLibraryVmTemplateWhereInput.firmwareIn)
                && Objects.equals(this.firmwareNot, contentLibraryVmTemplateWhereInput.firmwareNot)
                && Objects.equals(
                        this.firmwareNotIn, contentLibraryVmTemplateWhereInput.firmwareNotIn)
                && Objects.equals(this.ha, contentLibraryVmTemplateWhereInput.ha)
                && Objects.equals(this.haNot, contentLibraryVmTemplateWhereInput.haNot)
                && Objects.equals(this.id, contentLibraryVmTemplateWhereInput.id)
                && Objects.equals(this.idContains, contentLibraryVmTemplateWhereInput.idContains)
                && Objects.equals(this.idEndsWith, contentLibraryVmTemplateWhereInput.idEndsWith)
                && Objects.equals(this.idGt, contentLibraryVmTemplateWhereInput.idGt)
                && Objects.equals(this.idGte, contentLibraryVmTemplateWhereInput.idGte)
                && Objects.equals(this.idIn, contentLibraryVmTemplateWhereInput.idIn)
                && Objects.equals(this.idLt, contentLibraryVmTemplateWhereInput.idLt)
                && Objects.equals(this.idLte, contentLibraryVmTemplateWhereInput.idLte)
                && Objects.equals(this.idNot, contentLibraryVmTemplateWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, contentLibraryVmTemplateWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, contentLibraryVmTemplateWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, contentLibraryVmTemplateWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, contentLibraryVmTemplateWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, contentLibraryVmTemplateWhereInput.idStartsWith)
                && Objects.equals(this.ioPolicy, contentLibraryVmTemplateWhereInput.ioPolicy)
                && Objects.equals(this.ioPolicyIn, contentLibraryVmTemplateWhereInput.ioPolicyIn)
                && Objects.equals(this.ioPolicyNot, contentLibraryVmTemplateWhereInput.ioPolicyNot)
                && Objects.equals(
                        this.ioPolicyNotIn, contentLibraryVmTemplateWhereInput.ioPolicyNotIn)
                && Objects.equals(this.labelsEvery, contentLibraryVmTemplateWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, contentLibraryVmTemplateWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, contentLibraryVmTemplateWhereInput.labelsSome)
                && Objects.equals(
                        this.maxBandwidth, contentLibraryVmTemplateWhereInput.maxBandwidth)
                && Objects.equals(
                        this.maxBandwidthGt, contentLibraryVmTemplateWhereInput.maxBandwidthGt)
                && Objects.equals(
                        this.maxBandwidthGte, contentLibraryVmTemplateWhereInput.maxBandwidthGte)
                && Objects.equals(
                        this.maxBandwidthIn, contentLibraryVmTemplateWhereInput.maxBandwidthIn)
                && Objects.equals(
                        this.maxBandwidthLt, contentLibraryVmTemplateWhereInput.maxBandwidthLt)
                && Objects.equals(
                        this.maxBandwidthLte, contentLibraryVmTemplateWhereInput.maxBandwidthLte)
                && Objects.equals(
                        this.maxBandwidthNot, contentLibraryVmTemplateWhereInput.maxBandwidthNot)
                && Objects.equals(
                        this.maxBandwidthNotIn,
                        contentLibraryVmTemplateWhereInput.maxBandwidthNotIn)
                && Objects.equals(
                        this.maxBandwidthPolicy,
                        contentLibraryVmTemplateWhereInput.maxBandwidthPolicy)
                && Objects.equals(
                        this.maxBandwidthPolicyIn,
                        contentLibraryVmTemplateWhereInput.maxBandwidthPolicyIn)
                && Objects.equals(
                        this.maxBandwidthPolicyNot,
                        contentLibraryVmTemplateWhereInput.maxBandwidthPolicyNot)
                && Objects.equals(
                        this.maxBandwidthPolicyNotIn,
                        contentLibraryVmTemplateWhereInput.maxBandwidthPolicyNotIn)
                && Objects.equals(this.maxIops, contentLibraryVmTemplateWhereInput.maxIops)
                && Objects.equals(this.maxIopsGt, contentLibraryVmTemplateWhereInput.maxIopsGt)
                && Objects.equals(this.maxIopsGte, contentLibraryVmTemplateWhereInput.maxIopsGte)
                && Objects.equals(this.maxIopsIn, contentLibraryVmTemplateWhereInput.maxIopsIn)
                && Objects.equals(this.maxIopsLt, contentLibraryVmTemplateWhereInput.maxIopsLt)
                && Objects.equals(this.maxIopsLte, contentLibraryVmTemplateWhereInput.maxIopsLte)
                && Objects.equals(this.maxIopsNot, contentLibraryVmTemplateWhereInput.maxIopsNot)
                && Objects.equals(
                        this.maxIopsNotIn, contentLibraryVmTemplateWhereInput.maxIopsNotIn)
                && Objects.equals(
                        this.maxIopsPolicy, contentLibraryVmTemplateWhereInput.maxIopsPolicy)
                && Objects.equals(
                        this.maxIopsPolicyIn, contentLibraryVmTemplateWhereInput.maxIopsPolicyIn)
                && Objects.equals(
                        this.maxIopsPolicyNot, contentLibraryVmTemplateWhereInput.maxIopsPolicyNot)
                && Objects.equals(
                        this.maxIopsPolicyNotIn,
                        contentLibraryVmTemplateWhereInput.maxIopsPolicyNotIn)
                && Objects.equals(this.memory, contentLibraryVmTemplateWhereInput.memory)
                && Objects.equals(this.memoryGt, contentLibraryVmTemplateWhereInput.memoryGt)
                && Objects.equals(this.memoryGte, contentLibraryVmTemplateWhereInput.memoryGte)
                && Objects.equals(this.memoryIn, contentLibraryVmTemplateWhereInput.memoryIn)
                && Objects.equals(this.memoryLt, contentLibraryVmTemplateWhereInput.memoryLt)
                && Objects.equals(this.memoryLte, contentLibraryVmTemplateWhereInput.memoryLte)
                && Objects.equals(this.memoryNot, contentLibraryVmTemplateWhereInput.memoryNot)
                && Objects.equals(this.memoryNotIn, contentLibraryVmTemplateWhereInput.memoryNotIn)
                && Objects.equals(this.name, contentLibraryVmTemplateWhereInput.name)
                && Objects.equals(
                        this.nameContains, contentLibraryVmTemplateWhereInput.nameContains)
                && Objects.equals(
                        this.nameEndsWith, contentLibraryVmTemplateWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, contentLibraryVmTemplateWhereInput.nameGt)
                && Objects.equals(this.nameGte, contentLibraryVmTemplateWhereInput.nameGte)
                && Objects.equals(this.nameIn, contentLibraryVmTemplateWhereInput.nameIn)
                && Objects.equals(this.nameLt, contentLibraryVmTemplateWhereInput.nameLt)
                && Objects.equals(this.nameLte, contentLibraryVmTemplateWhereInput.nameLte)
                && Objects.equals(this.nameNot, contentLibraryVmTemplateWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, contentLibraryVmTemplateWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, contentLibraryVmTemplateWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, contentLibraryVmTemplateWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith,
                        contentLibraryVmTemplateWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, contentLibraryVmTemplateWhereInput.nameStartsWith)
                && Objects.equals(this.os, contentLibraryVmTemplateWhereInput.os)
                && Objects.equals(this.osContains, contentLibraryVmTemplateWhereInput.osContains)
                && Objects.equals(this.osEndsWith, contentLibraryVmTemplateWhereInput.osEndsWith)
                && Objects.equals(this.osGt, contentLibraryVmTemplateWhereInput.osGt)
                && Objects.equals(this.osGte, contentLibraryVmTemplateWhereInput.osGte)
                && Objects.equals(this.osIn, contentLibraryVmTemplateWhereInput.osIn)
                && Objects.equals(this.osLt, contentLibraryVmTemplateWhereInput.osLt)
                && Objects.equals(this.osLte, contentLibraryVmTemplateWhereInput.osLte)
                && Objects.equals(this.osNot, contentLibraryVmTemplateWhereInput.osNot)
                && Objects.equals(
                        this.osNotContains, contentLibraryVmTemplateWhereInput.osNotContains)
                && Objects.equals(
                        this.osNotEndsWith, contentLibraryVmTemplateWhereInput.osNotEndsWith)
                && Objects.equals(this.osNotIn, contentLibraryVmTemplateWhereInput.osNotIn)
                && Objects.equals(
                        this.osNotStartsWith, contentLibraryVmTemplateWhereInput.osNotStartsWith)
                && Objects.equals(
                        this.osStartsWith, contentLibraryVmTemplateWhereInput.osStartsWith)
                && Objects.equals(this.size, contentLibraryVmTemplateWhereInput.size)
                && Objects.equals(this.sizeGt, contentLibraryVmTemplateWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, contentLibraryVmTemplateWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, contentLibraryVmTemplateWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, contentLibraryVmTemplateWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, contentLibraryVmTemplateWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, contentLibraryVmTemplateWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, contentLibraryVmTemplateWhereInput.sizeNotIn)
                && Objects.equals(this.vcpu, contentLibraryVmTemplateWhereInput.vcpu)
                && Objects.equals(this.vcpuGt, contentLibraryVmTemplateWhereInput.vcpuGt)
                && Objects.equals(this.vcpuGte, contentLibraryVmTemplateWhereInput.vcpuGte)
                && Objects.equals(this.vcpuIn, contentLibraryVmTemplateWhereInput.vcpuIn)
                && Objects.equals(this.vcpuLt, contentLibraryVmTemplateWhereInput.vcpuLt)
                && Objects.equals(this.vcpuLte, contentLibraryVmTemplateWhereInput.vcpuLte)
                && Objects.equals(this.vcpuNot, contentLibraryVmTemplateWhereInput.vcpuNot)
                && Objects.equals(this.vcpuNotIn, contentLibraryVmTemplateWhereInput.vcpuNotIn)
                && Objects.equals(this.videoType, contentLibraryVmTemplateWhereInput.videoType)
                && Objects.equals(
                        this.videoTypeContains,
                        contentLibraryVmTemplateWhereInput.videoTypeContains)
                && Objects.equals(
                        this.videoTypeEndsWith,
                        contentLibraryVmTemplateWhereInput.videoTypeEndsWith)
                && Objects.equals(this.videoTypeGt, contentLibraryVmTemplateWhereInput.videoTypeGt)
                && Objects.equals(
                        this.videoTypeGte, contentLibraryVmTemplateWhereInput.videoTypeGte)
                && Objects.equals(this.videoTypeIn, contentLibraryVmTemplateWhereInput.videoTypeIn)
                && Objects.equals(this.videoTypeLt, contentLibraryVmTemplateWhereInput.videoTypeLt)
                && Objects.equals(
                        this.videoTypeLte, contentLibraryVmTemplateWhereInput.videoTypeLte)
                && Objects.equals(
                        this.videoTypeNot, contentLibraryVmTemplateWhereInput.videoTypeNot)
                && Objects.equals(
                        this.videoTypeNotContains,
                        contentLibraryVmTemplateWhereInput.videoTypeNotContains)
                && Objects.equals(
                        this.videoTypeNotEndsWith,
                        contentLibraryVmTemplateWhereInput.videoTypeNotEndsWith)
                && Objects.equals(
                        this.videoTypeNotIn, contentLibraryVmTemplateWhereInput.videoTypeNotIn)
                && Objects.equals(
                        this.videoTypeNotStartsWith,
                        contentLibraryVmTemplateWhereInput.videoTypeNotStartsWith)
                && Objects.equals(
                        this.videoTypeStartsWith,
                        contentLibraryVmTemplateWhereInput.videoTypeStartsWith)
                && Objects.equals(
                        this.vmTemplatesEvery, contentLibraryVmTemplateWhereInput.vmTemplatesEvery)
                && Objects.equals(
                        this.vmTemplatesNone, contentLibraryVmTemplateWhereInput.vmTemplatesNone)
                && Objects.equals(
                        this.vmTemplatesSome, contentLibraryVmTemplateWhereInput.vmTemplatesSome)
                && Objects.equals(this.winOpt, contentLibraryVmTemplateWhereInput.winOpt)
                && Objects.equals(this.winOptNot, contentLibraryVmTemplateWhereInput.winOptNot);
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
                architecture,
                architectureIn,
                architectureNot,
                architectureNotIn,
                clockOffset,
                clockOffsetIn,
                clockOffsetNot,
                clockOffsetNotIn,
                cloudInitSupported,
                cloudInitSupportedNot,
                clustersEvery,
                clustersNone,
                clustersSome,
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
                firmware,
                firmwareIn,
                firmwareNot,
                firmwareNotIn,
                ha,
                haNot,
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
                os,
                osContains,
                osEndsWith,
                osGt,
                osGte,
                osIn,
                osLt,
                osLte,
                osNot,
                osNotContains,
                osNotEndsWith,
                osNotIn,
                osNotStartsWith,
                osStartsWith,
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
                videoType,
                videoTypeContains,
                videoTypeEndsWith,
                videoTypeGt,
                videoTypeGte,
                videoTypeIn,
                videoTypeLt,
                videoTypeLte,
                videoTypeNot,
                videoTypeNotContains,
                videoTypeNotEndsWith,
                videoTypeNotIn,
                videoTypeNotStartsWith,
                videoTypeStartsWith,
                vmTemplatesEvery,
                vmTemplatesNone,
                vmTemplatesSome,
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
        sb.append("class ContentLibraryVmTemplateWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    architectureIn: ").append(toIndentedString(architectureIn)).append("\n");
        sb.append("    architectureNot: ").append(toIndentedString(architectureNot)).append("\n");
        sb.append("    architectureNotIn: ")
                .append(toIndentedString(architectureNotIn))
                .append("\n");
        sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
        sb.append("    clockOffsetIn: ").append(toIndentedString(clockOffsetIn)).append("\n");
        sb.append("    clockOffsetNot: ").append(toIndentedString(clockOffsetNot)).append("\n");
        sb.append("    clockOffsetNotIn: ").append(toIndentedString(clockOffsetNotIn)).append("\n");
        sb.append("    cloudInitSupported: ")
                .append(toIndentedString(cloudInitSupported))
                .append("\n");
        sb.append("    cloudInitSupportedNot: ")
                .append(toIndentedString(cloudInitSupportedNot))
                .append("\n");
        sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
        sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
        sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
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
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    firmwareIn: ").append(toIndentedString(firmwareIn)).append("\n");
        sb.append("    firmwareNot: ").append(toIndentedString(firmwareNot)).append("\n");
        sb.append("    firmwareNotIn: ").append(toIndentedString(firmwareNotIn)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    haNot: ").append(toIndentedString(haNot)).append("\n");
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
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    osContains: ").append(toIndentedString(osContains)).append("\n");
        sb.append("    osEndsWith: ").append(toIndentedString(osEndsWith)).append("\n");
        sb.append("    osGt: ").append(toIndentedString(osGt)).append("\n");
        sb.append("    osGte: ").append(toIndentedString(osGte)).append("\n");
        sb.append("    osIn: ").append(toIndentedString(osIn)).append("\n");
        sb.append("    osLt: ").append(toIndentedString(osLt)).append("\n");
        sb.append("    osLte: ").append(toIndentedString(osLte)).append("\n");
        sb.append("    osNot: ").append(toIndentedString(osNot)).append("\n");
        sb.append("    osNotContains: ").append(toIndentedString(osNotContains)).append("\n");
        sb.append("    osNotEndsWith: ").append(toIndentedString(osNotEndsWith)).append("\n");
        sb.append("    osNotIn: ").append(toIndentedString(osNotIn)).append("\n");
        sb.append("    osNotStartsWith: ").append(toIndentedString(osNotStartsWith)).append("\n");
        sb.append("    osStartsWith: ").append(toIndentedString(osStartsWith)).append("\n");
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
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    videoTypeContains: ")
                .append(toIndentedString(videoTypeContains))
                .append("\n");
        sb.append("    videoTypeEndsWith: ")
                .append(toIndentedString(videoTypeEndsWith))
                .append("\n");
        sb.append("    videoTypeGt: ").append(toIndentedString(videoTypeGt)).append("\n");
        sb.append("    videoTypeGte: ").append(toIndentedString(videoTypeGte)).append("\n");
        sb.append("    videoTypeIn: ").append(toIndentedString(videoTypeIn)).append("\n");
        sb.append("    videoTypeLt: ").append(toIndentedString(videoTypeLt)).append("\n");
        sb.append("    videoTypeLte: ").append(toIndentedString(videoTypeLte)).append("\n");
        sb.append("    videoTypeNot: ").append(toIndentedString(videoTypeNot)).append("\n");
        sb.append("    videoTypeNotContains: ")
                .append(toIndentedString(videoTypeNotContains))
                .append("\n");
        sb.append("    videoTypeNotEndsWith: ")
                .append(toIndentedString(videoTypeNotEndsWith))
                .append("\n");
        sb.append("    videoTypeNotIn: ").append(toIndentedString(videoTypeNotIn)).append("\n");
        sb.append("    videoTypeNotStartsWith: ")
                .append(toIndentedString(videoTypeNotStartsWith))
                .append("\n");
        sb.append("    videoTypeStartsWith: ")
                .append(toIndentedString(videoTypeStartsWith))
                .append("\n");
        sb.append("    vmTemplatesEvery: ").append(toIndentedString(vmTemplatesEvery)).append("\n");
        sb.append("    vmTemplatesNone: ").append(toIndentedString(vmTemplatesNone)).append("\n");
        sb.append("    vmTemplatesSome: ").append(toIndentedString(vmTemplatesSome)).append("\n");
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

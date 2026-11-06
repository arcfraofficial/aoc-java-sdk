package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmTemplateConfigWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmTemplateConfigWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmTemplateConfigWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmTemplateConfigWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmTemplateConfigWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE =
            "content_library_vm_template";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE)
    private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate;

    public static final String SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED =
            "cpu_exclusive_expected_enabled";

    @SerializedName(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED)
    private Boolean cpuExclusiveExpectedEnabled;

    public static final String SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT =
            "cpu_exclusive_expected_enabled_not";

    @SerializedName(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT)
    private Boolean cpuExclusiveExpectedEnabledNot;

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

    public static final String SERIALIZED_NAME_DATASTORE = "datastore";

    @SerializedName(SERIALIZED_NAME_DATASTORE)
    private DatastoreWhereInput datastore;

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

    public static final String SERIALIZED_NAME_DISKS_EVERY = "disks_every";

    @SerializedName(SERIALIZED_NAME_DISKS_EVERY)
    private VmTemplateConfigDiskWhereInput disksEvery;

    public static final String SERIALIZED_NAME_DISKS_NONE = "disks_none";

    @SerializedName(SERIALIZED_NAME_DISKS_NONE)
    private VmTemplateConfigDiskWhereInput disksNone;

    public static final String SERIALIZED_NAME_DISKS_SOME = "disks_some";

    @SerializedName(SERIALIZED_NAME_DISKS_SOME)
    private VmTemplateConfigDiskWhereInput disksSome;

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

    public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";

    @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
    private VmGuestsOperationSystem guestOsType;

    public static final String SERIALIZED_NAME_GUEST_OS_TYPE_IN = "guest_os_type_in";

    @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE_IN)
    private List<VmGuestsOperationSystem> guestOsTypeIn = null;

    public static final String SERIALIZED_NAME_GUEST_OS_TYPE_NOT = "guest_os_type_not";

    @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE_NOT)
    private VmGuestsOperationSystem guestOsTypeNot;

    public static final String SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN = "guest_os_type_not_in";

    @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN)
    private List<VmGuestsOperationSystem> guestOsTypeNotIn = null;

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

    public static final String SERIALIZED_NAME_MACHINE_FAMILY = "machine_family";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY)
    private String machineFamily;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS = "machine_family_contains";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS)
    private String machineFamilyContains;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH =
            "machine_family_ends_with";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH)
    private String machineFamilyEndsWith;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_GT = "machine_family_gt";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_GT)
    private String machineFamilyGt;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_GTE = "machine_family_gte";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_GTE)
    private String machineFamilyGte;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_IN = "machine_family_in";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_IN)
    private List<String> machineFamilyIn = null;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_LT = "machine_family_lt";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_LT)
    private String machineFamilyLt;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_LTE = "machine_family_lte";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_LTE)
    private String machineFamilyLte;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_NOT = "machine_family_not";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_NOT)
    private String machineFamilyNot;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS =
            "machine_family_not_contains";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS)
    private String machineFamilyNotContains;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH =
            "machine_family_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH)
    private String machineFamilyNotEndsWith;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN = "machine_family_not_in";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN)
    private List<String> machineFamilyNotIn = null;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH =
            "machine_family_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH)
    private String machineFamilyNotStartsWith;

    public static final String SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH =
            "machine_family_starts_with";

    @SerializedName(SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH)
    private String machineFamilyStartsWith;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Double maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_GT = "max_bandwidth_gt";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_GT)
    private Double maxBandwidthGt;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_GTE = "max_bandwidth_gte";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_GTE)
    private Double maxBandwidthGte;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_IN = "max_bandwidth_in";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_IN)
    private List<Double> maxBandwidthIn = null;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_LT = "max_bandwidth_lt";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_LT)
    private Double maxBandwidthLt;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_LTE = "max_bandwidth_lte";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_LTE)
    private Double maxBandwidthLte;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_NOT = "max_bandwidth_not";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_NOT)
    private Double maxBandwidthNot;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN = "max_bandwidth_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN)
    private List<Double> maxBandwidthNotIn = null;

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
    private Double memory;

    public static final String SERIALIZED_NAME_MEMORY_GT = "memory_gt";

    @SerializedName(SERIALIZED_NAME_MEMORY_GT)
    private Double memoryGt;

    public static final String SERIALIZED_NAME_MEMORY_GTE = "memory_gte";

    @SerializedName(SERIALIZED_NAME_MEMORY_GTE)
    private Double memoryGte;

    public static final String SERIALIZED_NAME_MEMORY_IN = "memory_in";

    @SerializedName(SERIALIZED_NAME_MEMORY_IN)
    private List<Double> memoryIn = null;

    public static final String SERIALIZED_NAME_MEMORY_LT = "memory_lt";

    @SerializedName(SERIALIZED_NAME_MEMORY_LT)
    private Double memoryLt;

    public static final String SERIALIZED_NAME_MEMORY_LTE = "memory_lte";

    @SerializedName(SERIALIZED_NAME_MEMORY_LTE)
    private Double memoryLte;

    public static final String SERIALIZED_NAME_MEMORY_NOT = "memory_not";

    @SerializedName(SERIALIZED_NAME_MEMORY_NOT)
    private Double memoryNot;

    public static final String SERIALIZED_NAME_MEMORY_NOT_IN = "memory_not_in";

    @SerializedName(SERIALIZED_NAME_MEMORY_NOT_IN)
    private List<Double> memoryNotIn = null;

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

    public static final String SERIALIZED_NAME_SECURE_BOOT_ENABLED = "secure_boot_enabled";

    @SerializedName(SERIALIZED_NAME_SECURE_BOOT_ENABLED)
    private Boolean secureBootEnabled;

    public static final String SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT = "secure_boot_enabled_not";

    @SerializedName(SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT)
    private Boolean secureBootEnabledNot;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Double size;

    public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";

    @SerializedName(SERIALIZED_NAME_SIZE_GT)
    private Double sizeGt;

    public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";

    @SerializedName(SERIALIZED_NAME_SIZE_GTE)
    private Double sizeGte;

    public static final String SERIALIZED_NAME_SIZE_IN = "size_in";

    @SerializedName(SERIALIZED_NAME_SIZE_IN)
    private List<Double> sizeIn = null;

    public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";

    @SerializedName(SERIALIZED_NAME_SIZE_LT)
    private Double sizeLt;

    public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";

    @SerializedName(SERIALIZED_NAME_SIZE_LTE)
    private Double sizeLte;

    public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT)
    private Double sizeNot;

    public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
    private List<Double> sizeNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER = "storage_cluster";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER)
    private ClusterWhereInput storageCluster;

    public static final String SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME = "sync_vm_time_on_resume";

    @SerializedName(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME)
    private Boolean syncVmTimeOnResume;

    public static final String SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT =
            "sync_vm_time_on_resume_not";

    @SerializedName(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT)
    private Boolean syncVmTimeOnResumeNot;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageClusterConfigStorageType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<StorageClusterConfigStorageType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private StorageClusterConfigStorageType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<StorageClusterConfigStorageType> typeNotIn = null;

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

    public static final String SERIALIZED_NAME_VM_TEMPLATE = "vm_template";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE)
    private VmTemplateWhereInput vmTemplate;

    public static final String SERIALIZED_NAME_VM_VERSION = "vm_version";

    @SerializedName(SERIALIZED_NAME_VM_VERSION)
    private String vmVersion;

    public static final String SERIALIZED_NAME_VM_VERSION_CONTAINS = "vm_version_contains";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_CONTAINS)
    private String vmVersionContains;

    public static final String SERIALIZED_NAME_VM_VERSION_ENDS_WITH = "vm_version_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_ENDS_WITH)
    private String vmVersionEndsWith;

    public static final String SERIALIZED_NAME_VM_VERSION_GT = "vm_version_gt";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_GT)
    private String vmVersionGt;

    public static final String SERIALIZED_NAME_VM_VERSION_GTE = "vm_version_gte";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_GTE)
    private String vmVersionGte;

    public static final String SERIALIZED_NAME_VM_VERSION_IN = "vm_version_in";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_IN)
    private List<String> vmVersionIn = null;

    public static final String SERIALIZED_NAME_VM_VERSION_LT = "vm_version_lt";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_LT)
    private String vmVersionLt;

    public static final String SERIALIZED_NAME_VM_VERSION_LTE = "vm_version_lte";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_LTE)
    private String vmVersionLte;

    public static final String SERIALIZED_NAME_VM_VERSION_NOT = "vm_version_not";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_NOT)
    private String vmVersionNot;

    public static final String SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS = "vm_version_not_contains";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS)
    private String vmVersionNotContains;

    public static final String SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH =
            "vm_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH)
    private String vmVersionNotEndsWith;

    public static final String SERIALIZED_NAME_VM_VERSION_NOT_IN = "vm_version_not_in";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_NOT_IN)
    private List<String> vmVersionNotIn = null;

    public static final String SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH =
            "vm_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH)
    private String vmVersionNotStartsWith;

    public static final String SERIALIZED_NAME_VM_VERSION_STARTS_WITH = "vm_version_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_VERSION_STARTS_WITH)
    private String vmVersionStartsWith;

    public static final String SERIALIZED_NAME_VTPM_ENABLED = "vtpm_enabled";

    @SerializedName(SERIALIZED_NAME_VTPM_ENABLED)
    private Boolean vtpmEnabled;

    public static final String SERIALIZED_NAME_VTPM_ENABLED_NOT = "vtpm_enabled_not";

    @SerializedName(SERIALIZED_NAME_VTPM_ENABLED_NOT)
    private Boolean vtpmEnabledNot;

    public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";

    @SerializedName(SERIALIZED_NAME_WIN_OPT)
    private Boolean winOpt;

    public static final String SERIALIZED_NAME_WIN_OPT_NOT = "win_opt_not";

    @SerializedName(SERIALIZED_NAME_WIN_OPT_NOT)
    private Boolean winOptNot;

    public VmTemplateConfigWhereInput() {}

    public VmTemplateConfigWhereInput AND(List<VmTemplateConfigWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmTemplateConfigWhereInput addANDItem(VmTemplateConfigWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmTemplateConfigWhereInput>();
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
    public List<VmTemplateConfigWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmTemplateConfigWhereInput> AND) {
        this.AND = AND;
    }

    public VmTemplateConfigWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmTemplateConfigWhereInput AND_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput NOT(List<VmTemplateConfigWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmTemplateConfigWhereInput addNOTItem(VmTemplateConfigWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmTemplateConfigWhereInput>();
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
    public List<VmTemplateConfigWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmTemplateConfigWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmTemplateConfigWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmTemplateConfigWhereInput NOT_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput OR(List<VmTemplateConfigWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmTemplateConfigWhereInput addORItem(VmTemplateConfigWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmTemplateConfigWhereInput>();
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
    public List<VmTemplateConfigWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmTemplateConfigWhereInput> OR) {
        this.OR = OR;
    }

    public VmTemplateConfigWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmTemplateConfigWhereInput OR_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput architecture(Architecture architecture) {

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

    public VmTemplateConfigWhereInput architecture_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public VmTemplateConfigWhereInput architecture_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput architectureIn(List<Architecture> architectureIn) {

        this.architectureIn = architectureIn;
        return this;
    }

    public VmTemplateConfigWhereInput addArchitectureInItem(Architecture architectureInItem) {
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

    public VmTemplateConfigWhereInput architectureIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_IN);
        return this;
    }

    public VmTemplateConfigWhereInput architectureIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput architectureNot(Architecture architectureNot) {

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

    public VmTemplateConfigWhereInput architectureNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput architectureNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput architectureNotIn(List<Architecture> architectureNotIn) {

        this.architectureNotIn = architectureNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addArchitectureNotInItem(Architecture architectureNotInItem) {
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

    public VmTemplateConfigWhereInput architectureNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput architectureNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput clockOffset(VmClockOffset clockOffset) {

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

    public VmTemplateConfigWhereInput clockOffset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public VmTemplateConfigWhereInput clockOffset_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput clockOffsetIn(List<VmClockOffset> clockOffsetIn) {

        this.clockOffsetIn = clockOffsetIn;
        return this;
    }

    public VmTemplateConfigWhereInput addClockOffsetInItem(VmClockOffset clockOffsetInItem) {
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

    public VmTemplateConfigWhereInput clockOffsetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_IN);
        return this;
    }

    public VmTemplateConfigWhereInput clockOffsetIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput clockOffsetNot(VmClockOffset clockOffsetNot) {

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

    public VmTemplateConfigWhereInput clockOffsetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput clockOffsetNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput clockOffsetNotIn(List<VmClockOffset> clockOffsetNotIn) {

        this.clockOffsetNotIn = clockOffsetNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addClockOffsetNotInItem(VmClockOffset clockOffsetNotInItem) {
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

    public VmTemplateConfigWhereInput clockOffsetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput clockOffsetNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cloudInitSupported(Boolean cloudInitSupported) {

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

    public VmTemplateConfigWhereInput cloudInitSupported_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public VmTemplateConfigWhereInput cloudInitSupported_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cloudInitSupportedNot(Boolean cloudInitSupportedNot) {

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

    public VmTemplateConfigWhereInput cloudInitSupportedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput cloudInitSupportedNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput contentLibraryVmTemplate(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate) {

        this.contentLibraryVmTemplate = contentLibraryVmTemplate;
        return this;
    }

    /**
     * Get contentLibraryVmTemplate
     *
     * @return contentLibraryVmTemplate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplate() {
        return contentLibraryVmTemplate;
    }

    public void setContentLibraryVmTemplate(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate) {
        this.contentLibraryVmTemplate = contentLibraryVmTemplate;
    }

    public VmTemplateConfigWhereInput contentLibraryVmTemplate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        return this;
    }

    public VmTemplateConfigWhereInput contentLibraryVmTemplate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        return this;
    }

    public void setContentLibraryVmTemplate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
        }
    }

    public boolean getContentLibraryVmTemplate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE);
    }

    public VmTemplateConfigWhereInput cpuExclusiveExpectedEnabled(
            Boolean cpuExclusiveExpectedEnabled) {

        this.cpuExclusiveExpectedEnabled = cpuExclusiveExpectedEnabled;
        return this;
    }

    /**
     * Get cpuExclusiveExpectedEnabled
     *
     * @return cpuExclusiveExpectedEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCpuExclusiveExpectedEnabled() {
        return cpuExclusiveExpectedEnabled;
    }

    public void setCpuExclusiveExpectedEnabled(Boolean cpuExclusiveExpectedEnabled) {
        this.cpuExclusiveExpectedEnabled = cpuExclusiveExpectedEnabled;
    }

    public VmTemplateConfigWhereInput cpuExclusiveExpectedEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED);
        return this;
    }

    public VmTemplateConfigWhereInput cpuExclusiveExpectedEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED);
        return this;
    }

    public void setCpuExclusiveExpectedEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED);
        }
    }

    public boolean getCpuExclusiveExpectedEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED);
    }

    public VmTemplateConfigWhereInput cpuExclusiveExpectedEnabledNot(
            Boolean cpuExclusiveExpectedEnabledNot) {

        this.cpuExclusiveExpectedEnabledNot = cpuExclusiveExpectedEnabledNot;
        return this;
    }

    /**
     * Get cpuExclusiveExpectedEnabledNot
     *
     * @return cpuExclusiveExpectedEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCpuExclusiveExpectedEnabledNot() {
        return cpuExclusiveExpectedEnabledNot;
    }

    public void setCpuExclusiveExpectedEnabledNot(Boolean cpuExclusiveExpectedEnabledNot) {
        this.cpuExclusiveExpectedEnabledNot = cpuExclusiveExpectedEnabledNot;
    }

    public VmTemplateConfigWhereInput cpuExclusiveExpectedEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput cpuExclusiveExpectedEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT);
        return this;
    }

    public void setCpuExclusiveExpectedEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT);
        }
    }

    public boolean getCpuExclusiveExpectedEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED_NOT);
    }

    public VmTemplateConfigWhereInput cpuModel(String cpuModel) {

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

    public VmTemplateConfigWhereInput cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModel_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelContains(String cpuModelContains) {

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

    public VmTemplateConfigWhereInput cpuModelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelEndsWith(String cpuModelEndsWith) {

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

    public VmTemplateConfigWhereInput cpuModelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelGt(String cpuModelGt) {

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

    public VmTemplateConfigWhereInput cpuModelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GT);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelGte(String cpuModelGte) {

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

    public VmTemplateConfigWhereInput cpuModelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelIn(List<String> cpuModelIn) {

        this.cpuModelIn = cpuModelIn;
        return this;
    }

    public VmTemplateConfigWhereInput addCpuModelInItem(String cpuModelInItem) {
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

    public VmTemplateConfigWhereInput cpuModelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_IN);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelLt(String cpuModelLt) {

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

    public VmTemplateConfigWhereInput cpuModelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LT);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelLte(String cpuModelLte) {

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

    public VmTemplateConfigWhereInput cpuModelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelNot(String cpuModelNot) {

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

    public VmTemplateConfigWhereInput cpuModelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelNotContains(String cpuModelNotContains) {

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

    public VmTemplateConfigWhereInput cpuModelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelNotEndsWith(String cpuModelNotEndsWith) {

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

    public VmTemplateConfigWhereInput cpuModelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelNotIn(List<String> cpuModelNotIn) {

        this.cpuModelNotIn = cpuModelNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addCpuModelNotInItem(String cpuModelNotInItem) {
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

    public VmTemplateConfigWhereInput cpuModelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelNotStartsWith(String cpuModelNotStartsWith) {

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

    public VmTemplateConfigWhereInput cpuModelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput cpuModelStartsWith(String cpuModelStartsWith) {

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

    public VmTemplateConfigWhereInput cpuModelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput cpuModelStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput datastore(DatastoreWhereInput datastore) {

        this.datastore = datastore;
        return this;
    }

    /**
     * Get datastore
     *
     * @return datastore
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreWhereInput datastore) {
        this.datastore = datastore;
    }

    public VmTemplateConfigWhereInput datastore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public VmTemplateConfigWhereInput datastore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public void setDatastore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        }
    }

    public boolean getDatastore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE);
    }

    public VmTemplateConfigWhereInput description(String description) {

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

    public VmTemplateConfigWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmTemplateConfigWhereInput description_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionContains(String descriptionContains) {

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

    public VmTemplateConfigWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VmTemplateConfigWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionGt(String descriptionGt) {

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

    public VmTemplateConfigWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionGte(String descriptionGte) {

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

    public VmTemplateConfigWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VmTemplateConfigWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VmTemplateConfigWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionLt(String descriptionLt) {

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

    public VmTemplateConfigWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionLte(String descriptionLte) {

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

    public VmTemplateConfigWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionNot(String descriptionNot) {

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

    public VmTemplateConfigWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public VmTemplateConfigWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public VmTemplateConfigWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public VmTemplateConfigWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public VmTemplateConfigWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VmTemplateConfigWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput disksEvery(VmTemplateConfigDiskWhereInput disksEvery) {

        this.disksEvery = disksEvery;
        return this;
    }

    /**
     * Get disksEvery
     *
     * @return disksEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigDiskWhereInput getDisksEvery() {
        return disksEvery;
    }

    public void setDisksEvery(VmTemplateConfigDiskWhereInput disksEvery) {
        this.disksEvery = disksEvery;
    }

    public VmTemplateConfigWhereInput disksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public VmTemplateConfigWhereInput disksEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public void setDisksEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_EVERY);
        }
    }

    public boolean getDisksEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_EVERY);
    }

    public VmTemplateConfigWhereInput disksNone(VmTemplateConfigDiskWhereInput disksNone) {

        this.disksNone = disksNone;
        return this;
    }

    /**
     * Get disksNone
     *
     * @return disksNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigDiskWhereInput getDisksNone() {
        return disksNone;
    }

    public void setDisksNone(VmTemplateConfigDiskWhereInput disksNone) {
        this.disksNone = disksNone;
    }

    public VmTemplateConfigWhereInput disksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public VmTemplateConfigWhereInput disksNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public void setDisksNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_NONE);
        }
    }

    public boolean getDisksNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_NONE);
    }

    public VmTemplateConfigWhereInput disksSome(VmTemplateConfigDiskWhereInput disksSome) {

        this.disksSome = disksSome;
        return this;
    }

    /**
     * Get disksSome
     *
     * @return disksSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigDiskWhereInput getDisksSome() {
        return disksSome;
    }

    public void setDisksSome(VmTemplateConfigDiskWhereInput disksSome) {
        this.disksSome = disksSome;
    }

    public VmTemplateConfigWhereInput disksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public VmTemplateConfigWhereInput disksSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public void setDisksSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_SOME);
        }
    }

    public boolean getDisksSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_SOME);
    }

    public VmTemplateConfigWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmTemplateConfigWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmTemplateConfigWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VmTemplateConfigWhereInput addEntityAsyncStatusInItem(
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

    public VmTemplateConfigWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VmTemplateConfigWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VmTemplateConfigWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addEntityAsyncStatusNotInItem(
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

    public VmTemplateConfigWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput firmware(VmFirmware firmware) {

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

    public VmTemplateConfigWhereInput firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public VmTemplateConfigWhereInput firmware_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput firmwareIn(List<VmFirmware> firmwareIn) {

        this.firmwareIn = firmwareIn;
        return this;
    }

    public VmTemplateConfigWhereInput addFirmwareInItem(VmFirmware firmwareInItem) {
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

    public VmTemplateConfigWhereInput firmwareIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_IN);
        return this;
    }

    public VmTemplateConfigWhereInput firmwareIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput firmwareNot(VmFirmware firmwareNot) {

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

    public VmTemplateConfigWhereInput firmwareNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput firmwareNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput firmwareNotIn(List<VmFirmware> firmwareNotIn) {

        this.firmwareNotIn = firmwareNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addFirmwareNotInItem(VmFirmware firmwareNotInItem) {
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

    public VmTemplateConfigWhereInput firmwareNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput firmwareNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput guestOsType(VmGuestsOperationSystem guestOsType) {

        this.guestOsType = guestOsType;
        return this;
    }

    /**
     * Get guestOsType
     *
     * @return guestOsType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmGuestsOperationSystem getGuestOsType() {
        return guestOsType;
    }

    public void setGuestOsType(VmGuestsOperationSystem guestOsType) {
        this.guestOsType = guestOsType;
    }

    public VmTemplateConfigWhereInput guestOsType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE);
        return this;
    }

    public VmTemplateConfigWhereInput guestOsType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE);
        return this;
    }

    public void setGuestOsType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE);
        }
    }

    public boolean getGuestOsType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_OS_TYPE);
    }

    public VmTemplateConfigWhereInput guestOsTypeIn(List<VmGuestsOperationSystem> guestOsTypeIn) {

        this.guestOsTypeIn = guestOsTypeIn;
        return this;
    }

    public VmTemplateConfigWhereInput addGuestOsTypeInItem(
            VmGuestsOperationSystem guestOsTypeInItem) {
        if (this.guestOsTypeIn == null) {
            this.guestOsTypeIn = new ArrayList<VmGuestsOperationSystem>();
        }
        this.guestOsTypeIn.add(guestOsTypeInItem);
        return this;
    }

    /**
     * Get guestOsTypeIn
     *
     * @return guestOsTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmGuestsOperationSystem> getGuestOsTypeIn() {
        return guestOsTypeIn;
    }

    public void setGuestOsTypeIn(List<VmGuestsOperationSystem> guestOsTypeIn) {
        this.guestOsTypeIn = guestOsTypeIn;
    }

    public VmTemplateConfigWhereInput guestOsTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE_IN);
        return this;
    }

    public VmTemplateConfigWhereInput guestOsTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE_IN);
        return this;
    }

    public void setGuestOsTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE_IN);
        }
    }

    public boolean getGuestOsTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_OS_TYPE_IN);
    }

    public VmTemplateConfigWhereInput guestOsTypeNot(VmGuestsOperationSystem guestOsTypeNot) {

        this.guestOsTypeNot = guestOsTypeNot;
        return this;
    }

    /**
     * Get guestOsTypeNot
     *
     * @return guestOsTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmGuestsOperationSystem getGuestOsTypeNot() {
        return guestOsTypeNot;
    }

    public void setGuestOsTypeNot(VmGuestsOperationSystem guestOsTypeNot) {
        this.guestOsTypeNot = guestOsTypeNot;
    }

    public VmTemplateConfigWhereInput guestOsTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput guestOsTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE_NOT);
        return this;
    }

    public void setGuestOsTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE_NOT);
        }
    }

    public boolean getGuestOsTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_OS_TYPE_NOT);
    }

    public VmTemplateConfigWhereInput guestOsTypeNotIn(
            List<VmGuestsOperationSystem> guestOsTypeNotIn) {

        this.guestOsTypeNotIn = guestOsTypeNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addGuestOsTypeNotInItem(
            VmGuestsOperationSystem guestOsTypeNotInItem) {
        if (this.guestOsTypeNotIn == null) {
            this.guestOsTypeNotIn = new ArrayList<VmGuestsOperationSystem>();
        }
        this.guestOsTypeNotIn.add(guestOsTypeNotInItem);
        return this;
    }

    /**
     * Get guestOsTypeNotIn
     *
     * @return guestOsTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmGuestsOperationSystem> getGuestOsTypeNotIn() {
        return guestOsTypeNotIn;
    }

    public void setGuestOsTypeNotIn(List<VmGuestsOperationSystem> guestOsTypeNotIn) {
        this.guestOsTypeNotIn = guestOsTypeNotIn;
    }

    public VmTemplateConfigWhereInput guestOsTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput guestOsTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN);
        return this;
    }

    public void setGuestOsTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN);
        }
    }

    public boolean getGuestOsTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN);
    }

    public VmTemplateConfigWhereInput ha(Boolean ha) {

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

    public VmTemplateConfigWhereInput ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public VmTemplateConfigWhereInput ha_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput haNot(Boolean haNot) {

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

    public VmTemplateConfigWhereInput haNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput haNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput id(String id) {

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

    public VmTemplateConfigWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmTemplateConfigWhereInput id_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idContains(String idContains) {

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

    public VmTemplateConfigWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput idContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idEndsWith(String idEndsWith) {

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

    public VmTemplateConfigWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idGt(String idGt) {

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

    public VmTemplateConfigWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmTemplateConfigWhereInput idGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idGte(String idGte) {

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

    public VmTemplateConfigWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput idGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmTemplateConfigWhereInput addIdInItem(String idInItem) {
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

    public VmTemplateConfigWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmTemplateConfigWhereInput idIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idLt(String idLt) {

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

    public VmTemplateConfigWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmTemplateConfigWhereInput idLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idLte(String idLte) {

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

    public VmTemplateConfigWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput idLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idNot(String idNot) {

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

    public VmTemplateConfigWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput idNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idNotContains(String idNotContains) {

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

    public VmTemplateConfigWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmTemplateConfigWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmTemplateConfigWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmTemplateConfigWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput idStartsWith(String idStartsWith) {

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

    public VmTemplateConfigWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput ioPolicy(VmDiskIoPolicy ioPolicy) {

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

    public VmTemplateConfigWhereInput ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public VmTemplateConfigWhereInput ioPolicy_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput ioPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {

        this.ioPolicyIn = ioPolicyIn;
        return this;
    }

    public VmTemplateConfigWhereInput addIoPolicyInItem(VmDiskIoPolicy ioPolicyInItem) {
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

    public VmTemplateConfigWhereInput ioPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_IN);
        return this;
    }

    public VmTemplateConfigWhereInput ioPolicyIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput ioPolicyNot(VmDiskIoPolicy ioPolicyNot) {

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

    public VmTemplateConfigWhereInput ioPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput ioPolicyNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput ioPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {

        this.ioPolicyNotIn = ioPolicyNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addIoPolicyNotInItem(VmDiskIoPolicy ioPolicyNotInItem) {
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

    public VmTemplateConfigWhereInput ioPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput ioPolicyNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localId(String localId) {

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

    public VmTemplateConfigWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmTemplateConfigWhereInput localId_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdContains(String localIdContains) {

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

    public VmTemplateConfigWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput localIdContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VmTemplateConfigWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdGt(String localIdGt) {

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

    public VmTemplateConfigWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VmTemplateConfigWhereInput localIdGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdGte(String localIdGte) {

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

    public VmTemplateConfigWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput localIdGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VmTemplateConfigWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VmTemplateConfigWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VmTemplateConfigWhereInput localIdIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdLt(String localIdLt) {

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

    public VmTemplateConfigWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VmTemplateConfigWhereInput localIdLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdLte(String localIdLte) {

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

    public VmTemplateConfigWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput localIdLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdNot(String localIdNot) {

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

    public VmTemplateConfigWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput localIdNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdNotContains(String localIdNotContains) {

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

    public VmTemplateConfigWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VmTemplateConfigWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VmTemplateConfigWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VmTemplateConfigWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VmTemplateConfigWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput machineFamily(String machineFamily) {

        this.machineFamily = machineFamily;
        return this;
    }

    /**
     * Get machineFamily
     *
     * @return machineFamily
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamily() {
        return machineFamily;
    }

    public void setMachineFamily(String machineFamily) {
        this.machineFamily = machineFamily;
    }

    public VmTemplateConfigWhereInput machineFamily_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamily_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY);
        return this;
    }

    public void setMachineFamily_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY);
        }
    }

    public boolean getMachineFamily_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY);
    }

    public VmTemplateConfigWhereInput machineFamilyContains(String machineFamilyContains) {

        this.machineFamilyContains = machineFamilyContains;
        return this;
    }

    /**
     * Get machineFamilyContains
     *
     * @return machineFamilyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyContains() {
        return machineFamilyContains;
    }

    public void setMachineFamilyContains(String machineFamilyContains) {
        this.machineFamilyContains = machineFamilyContains;
    }

    public VmTemplateConfigWhereInput machineFamilyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS);
        return this;
    }

    public void setMachineFamilyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS);
        }
    }

    public boolean getMachineFamilyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_CONTAINS);
    }

    public VmTemplateConfigWhereInput machineFamilyEndsWith(String machineFamilyEndsWith) {

        this.machineFamilyEndsWith = machineFamilyEndsWith;
        return this;
    }

    /**
     * Get machineFamilyEndsWith
     *
     * @return machineFamilyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyEndsWith() {
        return machineFamilyEndsWith;
    }

    public void setMachineFamilyEndsWith(String machineFamilyEndsWith) {
        this.machineFamilyEndsWith = machineFamilyEndsWith;
    }

    public VmTemplateConfigWhereInput machineFamilyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH);
        return this;
    }

    public void setMachineFamilyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH);
        }
    }

    public boolean getMachineFamilyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_ENDS_WITH);
    }

    public VmTemplateConfigWhereInput machineFamilyGt(String machineFamilyGt) {

        this.machineFamilyGt = machineFamilyGt;
        return this;
    }

    /**
     * Get machineFamilyGt
     *
     * @return machineFamilyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyGt() {
        return machineFamilyGt;
    }

    public void setMachineFamilyGt(String machineFamilyGt) {
        this.machineFamilyGt = machineFamilyGt;
    }

    public VmTemplateConfigWhereInput machineFamilyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_GT);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_GT);
        return this;
    }

    public void setMachineFamilyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_GT);
        }
    }

    public boolean getMachineFamilyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_GT);
    }

    public VmTemplateConfigWhereInput machineFamilyGte(String machineFamilyGte) {

        this.machineFamilyGte = machineFamilyGte;
        return this;
    }

    /**
     * Get machineFamilyGte
     *
     * @return machineFamilyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyGte() {
        return machineFamilyGte;
    }

    public void setMachineFamilyGte(String machineFamilyGte) {
        this.machineFamilyGte = machineFamilyGte;
    }

    public VmTemplateConfigWhereInput machineFamilyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_GTE);
        return this;
    }

    public void setMachineFamilyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_GTE);
        }
    }

    public boolean getMachineFamilyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_GTE);
    }

    public VmTemplateConfigWhereInput machineFamilyIn(List<String> machineFamilyIn) {

        this.machineFamilyIn = machineFamilyIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMachineFamilyInItem(String machineFamilyInItem) {
        if (this.machineFamilyIn == null) {
            this.machineFamilyIn = new ArrayList<String>();
        }
        this.machineFamilyIn.add(machineFamilyInItem);
        return this;
    }

    /**
     * Get machineFamilyIn
     *
     * @return machineFamilyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMachineFamilyIn() {
        return machineFamilyIn;
    }

    public void setMachineFamilyIn(List<String> machineFamilyIn) {
        this.machineFamilyIn = machineFamilyIn;
    }

    public VmTemplateConfigWhereInput machineFamilyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_IN);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_IN);
        return this;
    }

    public void setMachineFamilyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_IN);
        }
    }

    public boolean getMachineFamilyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_IN);
    }

    public VmTemplateConfigWhereInput machineFamilyLt(String machineFamilyLt) {

        this.machineFamilyLt = machineFamilyLt;
        return this;
    }

    /**
     * Get machineFamilyLt
     *
     * @return machineFamilyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyLt() {
        return machineFamilyLt;
    }

    public void setMachineFamilyLt(String machineFamilyLt) {
        this.machineFamilyLt = machineFamilyLt;
    }

    public VmTemplateConfigWhereInput machineFamilyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_LT);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_LT);
        return this;
    }

    public void setMachineFamilyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_LT);
        }
    }

    public boolean getMachineFamilyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_LT);
    }

    public VmTemplateConfigWhereInput machineFamilyLte(String machineFamilyLte) {

        this.machineFamilyLte = machineFamilyLte;
        return this;
    }

    /**
     * Get machineFamilyLte
     *
     * @return machineFamilyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyLte() {
        return machineFamilyLte;
    }

    public void setMachineFamilyLte(String machineFamilyLte) {
        this.machineFamilyLte = machineFamilyLte;
    }

    public VmTemplateConfigWhereInput machineFamilyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_LTE);
        return this;
    }

    public void setMachineFamilyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_LTE);
        }
    }

    public boolean getMachineFamilyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_LTE);
    }

    public VmTemplateConfigWhereInput machineFamilyNot(String machineFamilyNot) {

        this.machineFamilyNot = machineFamilyNot;
        return this;
    }

    /**
     * Get machineFamilyNot
     *
     * @return machineFamilyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyNot() {
        return machineFamilyNot;
    }

    public void setMachineFamilyNot(String machineFamilyNot) {
        this.machineFamilyNot = machineFamilyNot;
    }

    public VmTemplateConfigWhereInput machineFamilyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT);
        return this;
    }

    public void setMachineFamilyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT);
        }
    }

    public boolean getMachineFamilyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_NOT);
    }

    public VmTemplateConfigWhereInput machineFamilyNotContains(String machineFamilyNotContains) {

        this.machineFamilyNotContains = machineFamilyNotContains;
        return this;
    }

    /**
     * Get machineFamilyNotContains
     *
     * @return machineFamilyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyNotContains() {
        return machineFamilyNotContains;
    }

    public void setMachineFamilyNotContains(String machineFamilyNotContains) {
        this.machineFamilyNotContains = machineFamilyNotContains;
    }

    public VmTemplateConfigWhereInput machineFamilyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS);
        return this;
    }

    public void setMachineFamilyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS);
        }
    }

    public boolean getMachineFamilyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_NOT_CONTAINS);
    }

    public VmTemplateConfigWhereInput machineFamilyNotEndsWith(String machineFamilyNotEndsWith) {

        this.machineFamilyNotEndsWith = machineFamilyNotEndsWith;
        return this;
    }

    /**
     * Get machineFamilyNotEndsWith
     *
     * @return machineFamilyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyNotEndsWith() {
        return machineFamilyNotEndsWith;
    }

    public void setMachineFamilyNotEndsWith(String machineFamilyNotEndsWith) {
        this.machineFamilyNotEndsWith = machineFamilyNotEndsWith;
    }

    public VmTemplateConfigWhereInput machineFamilyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH);
        return this;
    }

    public void setMachineFamilyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH);
        }
    }

    public boolean getMachineFamilyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_NOT_ENDS_WITH);
    }

    public VmTemplateConfigWhereInput machineFamilyNotIn(List<String> machineFamilyNotIn) {

        this.machineFamilyNotIn = machineFamilyNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMachineFamilyNotInItem(String machineFamilyNotInItem) {
        if (this.machineFamilyNotIn == null) {
            this.machineFamilyNotIn = new ArrayList<String>();
        }
        this.machineFamilyNotIn.add(machineFamilyNotInItem);
        return this;
    }

    /**
     * Get machineFamilyNotIn
     *
     * @return machineFamilyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMachineFamilyNotIn() {
        return machineFamilyNotIn;
    }

    public void setMachineFamilyNotIn(List<String> machineFamilyNotIn) {
        this.machineFamilyNotIn = machineFamilyNotIn;
    }

    public VmTemplateConfigWhereInput machineFamilyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN);
        return this;
    }

    public void setMachineFamilyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN);
        }
    }

    public boolean getMachineFamilyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_NOT_IN);
    }

    public VmTemplateConfigWhereInput machineFamilyNotStartsWith(
            String machineFamilyNotStartsWith) {

        this.machineFamilyNotStartsWith = machineFamilyNotStartsWith;
        return this;
    }

    /**
     * Get machineFamilyNotStartsWith
     *
     * @return machineFamilyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyNotStartsWith() {
        return machineFamilyNotStartsWith;
    }

    public void setMachineFamilyNotStartsWith(String machineFamilyNotStartsWith) {
        this.machineFamilyNotStartsWith = machineFamilyNotStartsWith;
    }

    public VmTemplateConfigWhereInput machineFamilyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH);
        return this;
    }

    public void setMachineFamilyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH);
        }
    }

    public boolean getMachineFamilyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_NOT_STARTS_WITH);
    }

    public VmTemplateConfigWhereInput machineFamilyStartsWith(String machineFamilyStartsWith) {

        this.machineFamilyStartsWith = machineFamilyStartsWith;
        return this;
    }

    /**
     * Get machineFamilyStartsWith
     *
     * @return machineFamilyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMachineFamilyStartsWith() {
        return machineFamilyStartsWith;
    }

    public void setMachineFamilyStartsWith(String machineFamilyStartsWith) {
        this.machineFamilyStartsWith = machineFamilyStartsWith;
    }

    public VmTemplateConfigWhereInput machineFamilyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput machineFamilyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH);
        return this;
    }

    public void setMachineFamilyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH);
        }
    }

    public boolean getMachineFamilyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MACHINE_FAMILY_STARTS_WITH);
    }

    public VmTemplateConfigWhereInput maxBandwidth(Double maxBandwidth) {

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
    public Double getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Double maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public VmTemplateConfigWhereInput maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidth_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthGt(Double maxBandwidthGt) {

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
    public Double getMaxBandwidthGt() {
        return maxBandwidthGt;
    }

    public void setMaxBandwidthGt(Double maxBandwidthGt) {
        this.maxBandwidthGt = maxBandwidthGt;
    }

    public VmTemplateConfigWhereInput maxBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthGte(Double maxBandwidthGte) {

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
    public Double getMaxBandwidthGte() {
        return maxBandwidthGte;
    }

    public void setMaxBandwidthGte(Double maxBandwidthGte) {
        this.maxBandwidthGte = maxBandwidthGte;
    }

    public VmTemplateConfigWhereInput maxBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthIn(List<Double> maxBandwidthIn) {

        this.maxBandwidthIn = maxBandwidthIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxBandwidthInItem(Double maxBandwidthInItem) {
        if (this.maxBandwidthIn == null) {
            this.maxBandwidthIn = new ArrayList<Double>();
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
    public List<Double> getMaxBandwidthIn() {
        return maxBandwidthIn;
    }

    public void setMaxBandwidthIn(List<Double> maxBandwidthIn) {
        this.maxBandwidthIn = maxBandwidthIn;
    }

    public VmTemplateConfigWhereInput maxBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthLt(Double maxBandwidthLt) {

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
    public Double getMaxBandwidthLt() {
        return maxBandwidthLt;
    }

    public void setMaxBandwidthLt(Double maxBandwidthLt) {
        this.maxBandwidthLt = maxBandwidthLt;
    }

    public VmTemplateConfigWhereInput maxBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthLte(Double maxBandwidthLte) {

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
    public Double getMaxBandwidthLte() {
        return maxBandwidthLte;
    }

    public void setMaxBandwidthLte(Double maxBandwidthLte) {
        this.maxBandwidthLte = maxBandwidthLte;
    }

    public VmTemplateConfigWhereInput maxBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthNot(Double maxBandwidthNot) {

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
    public Double getMaxBandwidthNot() {
        return maxBandwidthNot;
    }

    public void setMaxBandwidthNot(Double maxBandwidthNot) {
        this.maxBandwidthNot = maxBandwidthNot;
    }

    public VmTemplateConfigWhereInput maxBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthNotIn(List<Double> maxBandwidthNotIn) {

        this.maxBandwidthNotIn = maxBandwidthNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxBandwidthNotInItem(Double maxBandwidthNotInItem) {
        if (this.maxBandwidthNotIn == null) {
            this.maxBandwidthNotIn = new ArrayList<Double>();
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
    public List<Double> getMaxBandwidthNotIn() {
        return maxBandwidthNotIn;
    }

    public void setMaxBandwidthNotIn(List<Double> maxBandwidthNotIn) {
        this.maxBandwidthNotIn = maxBandwidthNotIn;
    }

    public VmTemplateConfigWhereInput maxBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public VmTemplateConfigWhereInput maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthPolicyIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {

        this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxBandwidthPolicyInItem(
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

    public VmTemplateConfigWhereInput maxBandwidthPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthPolicyIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthPolicyNot(
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

    public VmTemplateConfigWhereInput maxBandwidthPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthPolicyNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxBandwidthPolicyNotIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {

        this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxBandwidthPolicyNotInItem(
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

    public VmTemplateConfigWhereInput maxBandwidthPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxBandwidthPolicyNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIops(Integer maxIops) {

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

    public VmTemplateConfigWhereInput maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmTemplateConfigWhereInput maxIops_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsGt(Integer maxIopsGt) {

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

    public VmTemplateConfigWhereInput maxIopsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GT);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsGte(Integer maxIopsGte) {

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

    public VmTemplateConfigWhereInput maxIopsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsIn(List<Integer> maxIopsIn) {

        this.maxIopsIn = maxIopsIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
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

    public VmTemplateConfigWhereInput maxIopsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsLt(Integer maxIopsLt) {

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

    public VmTemplateConfigWhereInput maxIopsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LT);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsLte(Integer maxIopsLte) {

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

    public VmTemplateConfigWhereInput maxIopsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsNot(Integer maxIopsNot) {

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

    public VmTemplateConfigWhereInput maxIopsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {

        this.maxIopsNotIn = maxIopsNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
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

    public VmTemplateConfigWhereInput maxIopsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmTemplateConfigWhereInput maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsPolicy_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {

        this.maxIopsPolicyIn = maxIopsPolicyIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxIopsPolicyInItem(
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

    public VmTemplateConfigWhereInput maxIopsPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsPolicyIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {

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

    public VmTemplateConfigWhereInput maxIopsPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsPolicyNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput maxIopsPolicyNotIn(
            List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {

        this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMaxIopsPolicyNotInItem(
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

    public VmTemplateConfigWhereInput maxIopsPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput maxIopsPolicyNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memory(Double memory) {

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
    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public VmTemplateConfigWhereInput memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public VmTemplateConfigWhereInput memory_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryGt(Double memoryGt) {

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
    public Double getMemoryGt() {
        return memoryGt;
    }

    public void setMemoryGt(Double memoryGt) {
        this.memoryGt = memoryGt;
    }

    public VmTemplateConfigWhereInput memoryGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GT);
        return this;
    }

    public VmTemplateConfigWhereInput memoryGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryGte(Double memoryGte) {

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
    public Double getMemoryGte() {
        return memoryGte;
    }

    public void setMemoryGte(Double memoryGte) {
        this.memoryGte = memoryGte;
    }

    public VmTemplateConfigWhereInput memoryGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput memoryGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryIn(List<Double> memoryIn) {

        this.memoryIn = memoryIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMemoryInItem(Double memoryInItem) {
        if (this.memoryIn == null) {
            this.memoryIn = new ArrayList<Double>();
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
    public List<Double> getMemoryIn() {
        return memoryIn;
    }

    public void setMemoryIn(List<Double> memoryIn) {
        this.memoryIn = memoryIn;
    }

    public VmTemplateConfigWhereInput memoryIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_IN);
        return this;
    }

    public VmTemplateConfigWhereInput memoryIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryLt(Double memoryLt) {

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
    public Double getMemoryLt() {
        return memoryLt;
    }

    public void setMemoryLt(Double memoryLt) {
        this.memoryLt = memoryLt;
    }

    public VmTemplateConfigWhereInput memoryLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LT);
        return this;
    }

    public VmTemplateConfigWhereInput memoryLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryLte(Double memoryLte) {

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
    public Double getMemoryLte() {
        return memoryLte;
    }

    public void setMemoryLte(Double memoryLte) {
        this.memoryLte = memoryLte;
    }

    public VmTemplateConfigWhereInput memoryLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput memoryLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryNot(Double memoryNot) {

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
    public Double getMemoryNot() {
        return memoryNot;
    }

    public void setMemoryNot(Double memoryNot) {
        this.memoryNot = memoryNot;
    }

    public VmTemplateConfigWhereInput memoryNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput memoryNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput memoryNotIn(List<Double> memoryNotIn) {

        this.memoryNotIn = memoryNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addMemoryNotInItem(Double memoryNotInItem) {
        if (this.memoryNotIn == null) {
            this.memoryNotIn = new ArrayList<Double>();
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
    public List<Double> getMemoryNotIn() {
        return memoryNotIn;
    }

    public void setMemoryNotIn(List<Double> memoryNotIn) {
        this.memoryNotIn = memoryNotIn;
    }

    public VmTemplateConfigWhereInput memoryNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput memoryNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput name(String name) {

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

    public VmTemplateConfigWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmTemplateConfigWhereInput name_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameContains(String nameContains) {

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

    public VmTemplateConfigWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput nameContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameEndsWith(String nameEndsWith) {

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

    public VmTemplateConfigWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameGt(String nameGt) {

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

    public VmTemplateConfigWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VmTemplateConfigWhereInput nameGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameGte(String nameGte) {

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

    public VmTemplateConfigWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput nameGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VmTemplateConfigWhereInput addNameInItem(String nameInItem) {
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

    public VmTemplateConfigWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VmTemplateConfigWhereInput nameIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameLt(String nameLt) {

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

    public VmTemplateConfigWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VmTemplateConfigWhereInput nameLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameLte(String nameLte) {

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

    public VmTemplateConfigWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput nameLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameNot(String nameNot) {

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

    public VmTemplateConfigWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput nameNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameNotContains(String nameNotContains) {

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

    public VmTemplateConfigWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VmTemplateConfigWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VmTemplateConfigWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VmTemplateConfigWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput nameStartsWith(String nameStartsWith) {

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

    public VmTemplateConfigWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput os(String os) {

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

    public VmTemplateConfigWhereInput os_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS);
        return this;
    }

    public VmTemplateConfigWhereInput os_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osContains(String osContains) {

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

    public VmTemplateConfigWhereInput osContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput osContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osEndsWith(String osEndsWith) {

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

    public VmTemplateConfigWhereInput osEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput osEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osGt(String osGt) {

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

    public VmTemplateConfigWhereInput osGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_GT);
        return this;
    }

    public VmTemplateConfigWhereInput osGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osGte(String osGte) {

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

    public VmTemplateConfigWhereInput osGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput osGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osIn(List<String> osIn) {

        this.osIn = osIn;
        return this;
    }

    public VmTemplateConfigWhereInput addOsInItem(String osInItem) {
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

    public VmTemplateConfigWhereInput osIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_IN);
        return this;
    }

    public VmTemplateConfigWhereInput osIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osLt(String osLt) {

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

    public VmTemplateConfigWhereInput osLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_LT);
        return this;
    }

    public VmTemplateConfigWhereInput osLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osLte(String osLte) {

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

    public VmTemplateConfigWhereInput osLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput osLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osNot(String osNot) {

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

    public VmTemplateConfigWhereInput osNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput osNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osNotContains(String osNotContains) {

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

    public VmTemplateConfigWhereInput osNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput osNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osNotEndsWith(String osNotEndsWith) {

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

    public VmTemplateConfigWhereInput osNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput osNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osNotIn(List<String> osNotIn) {

        this.osNotIn = osNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addOsNotInItem(String osNotInItem) {
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

    public VmTemplateConfigWhereInput osNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput osNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osNotStartsWith(String osNotStartsWith) {

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

    public VmTemplateConfigWhereInput osNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput osNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput osStartsWith(String osStartsWith) {

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

    public VmTemplateConfigWhereInput osStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput osStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput path(String path) {

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

    public VmTemplateConfigWhereInput path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public VmTemplateConfigWhereInput path_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathContains(String pathContains) {

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

    public VmTemplateConfigWhereInput pathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput pathContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathEndsWith(String pathEndsWith) {

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

    public VmTemplateConfigWhereInput pathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput pathEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathGt(String pathGt) {

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

    public VmTemplateConfigWhereInput pathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public VmTemplateConfigWhereInput pathGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathGte(String pathGte) {

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

    public VmTemplateConfigWhereInput pathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput pathGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathIn(List<String> pathIn) {

        this.pathIn = pathIn;
        return this;
    }

    public VmTemplateConfigWhereInput addPathInItem(String pathInItem) {
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

    public VmTemplateConfigWhereInput pathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public VmTemplateConfigWhereInput pathIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathLt(String pathLt) {

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

    public VmTemplateConfigWhereInput pathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public VmTemplateConfigWhereInput pathLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathLte(String pathLte) {

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

    public VmTemplateConfigWhereInput pathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput pathLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathNot(String pathNot) {

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

    public VmTemplateConfigWhereInput pathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput pathNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathNotContains(String pathNotContains) {

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

    public VmTemplateConfigWhereInput pathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput pathNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathNotEndsWith(String pathNotEndsWith) {

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

    public VmTemplateConfigWhereInput pathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput pathNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathNotIn(List<String> pathNotIn) {

        this.pathNotIn = pathNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addPathNotInItem(String pathNotInItem) {
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

    public VmTemplateConfigWhereInput pathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput pathNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathNotStartsWith(String pathNotStartsWith) {

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

    public VmTemplateConfigWhereInput pathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput pathNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput pathStartsWith(String pathStartsWith) {

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

    public VmTemplateConfigWhereInput pathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput pathStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput secureBootEnabled(Boolean secureBootEnabled) {

        this.secureBootEnabled = secureBootEnabled;
        return this;
    }

    /**
     * Get secureBootEnabled
     *
     * @return secureBootEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSecureBootEnabled() {
        return secureBootEnabled;
    }

    public void setSecureBootEnabled(Boolean secureBootEnabled) {
        this.secureBootEnabled = secureBootEnabled;
    }

    public VmTemplateConfigWhereInput secureBootEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURE_BOOT_ENABLED);
        return this;
    }

    public VmTemplateConfigWhereInput secureBootEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURE_BOOT_ENABLED);
        return this;
    }

    public void setSecureBootEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURE_BOOT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURE_BOOT_ENABLED);
        }
    }

    public boolean getSecureBootEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURE_BOOT_ENABLED);
    }

    public VmTemplateConfigWhereInput secureBootEnabledNot(Boolean secureBootEnabledNot) {

        this.secureBootEnabledNot = secureBootEnabledNot;
        return this;
    }

    /**
     * Get secureBootEnabledNot
     *
     * @return secureBootEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSecureBootEnabledNot() {
        return secureBootEnabledNot;
    }

    public void setSecureBootEnabledNot(Boolean secureBootEnabledNot) {
        this.secureBootEnabledNot = secureBootEnabledNot;
    }

    public VmTemplateConfigWhereInput secureBootEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput secureBootEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT);
        return this;
    }

    public void setSecureBootEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT);
        }
    }

    public boolean getSecureBootEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURE_BOOT_ENABLED_NOT);
    }

    public VmTemplateConfigWhereInput size(Double size) {

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
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public VmTemplateConfigWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmTemplateConfigWhereInput size_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeGt(Double sizeGt) {

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
    public Double getSizeGt() {
        return sizeGt;
    }

    public void setSizeGt(Double sizeGt) {
        this.sizeGt = sizeGt;
    }

    public VmTemplateConfigWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public VmTemplateConfigWhereInput sizeGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeGte(Double sizeGte) {

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
    public Double getSizeGte() {
        return sizeGte;
    }

    public void setSizeGte(Double sizeGte) {
        this.sizeGte = sizeGte;
    }

    public VmTemplateConfigWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput sizeGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeIn(List<Double> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public VmTemplateConfigWhereInput addSizeInItem(Double sizeInItem) {
        if (this.sizeIn == null) {
            this.sizeIn = new ArrayList<Double>();
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
    public List<Double> getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(List<Double> sizeIn) {
        this.sizeIn = sizeIn;
    }

    public VmTemplateConfigWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public VmTemplateConfigWhereInput sizeIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeLt(Double sizeLt) {

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
    public Double getSizeLt() {
        return sizeLt;
    }

    public void setSizeLt(Double sizeLt) {
        this.sizeLt = sizeLt;
    }

    public VmTemplateConfigWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public VmTemplateConfigWhereInput sizeLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeLte(Double sizeLte) {

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
    public Double getSizeLte() {
        return sizeLte;
    }

    public void setSizeLte(Double sizeLte) {
        this.sizeLte = sizeLte;
    }

    public VmTemplateConfigWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput sizeLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeNot(Double sizeNot) {

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
    public Double getSizeNot() {
        return sizeNot;
    }

    public void setSizeNot(Double sizeNot) {
        this.sizeNot = sizeNot;
    }

    public VmTemplateConfigWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput sizeNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput sizeNotIn(List<Double> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addSizeNotInItem(Double sizeNotInItem) {
        if (this.sizeNotIn == null) {
            this.sizeNotIn = new ArrayList<Double>();
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
    public List<Double> getSizeNotIn() {
        return sizeNotIn;
    }

    public void setSizeNotIn(List<Double> sizeNotIn) {
        this.sizeNotIn = sizeNotIn;
    }

    public VmTemplateConfigWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput sizeNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput storageCluster(ClusterWhereInput storageCluster) {

        this.storageCluster = storageCluster;
        return this;
    }

    /**
     * Get storageCluster
     *
     * @return storageCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getStorageCluster() {
        return storageCluster;
    }

    public void setStorageCluster(ClusterWhereInput storageCluster) {
        this.storageCluster = storageCluster;
    }

    public VmTemplateConfigWhereInput storageCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public VmTemplateConfigWhereInput storageCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public void setStorageCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        }
    }

    public boolean getStorageCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER);
    }

    public VmTemplateConfigWhereInput syncVmTimeOnResume(Boolean syncVmTimeOnResume) {

        this.syncVmTimeOnResume = syncVmTimeOnResume;
        return this;
    }

    /**
     * Get syncVmTimeOnResume
     *
     * @return syncVmTimeOnResume
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSyncVmTimeOnResume() {
        return syncVmTimeOnResume;
    }

    public void setSyncVmTimeOnResume(Boolean syncVmTimeOnResume) {
        this.syncVmTimeOnResume = syncVmTimeOnResume;
    }

    public VmTemplateConfigWhereInput syncVmTimeOnResume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        return this;
    }

    public VmTemplateConfigWhereInput syncVmTimeOnResume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        return this;
    }

    public void setSyncVmTimeOnResume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        }
    }

    public boolean getSyncVmTimeOnResume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
    }

    public VmTemplateConfigWhereInput syncVmTimeOnResumeNot(Boolean syncVmTimeOnResumeNot) {

        this.syncVmTimeOnResumeNot = syncVmTimeOnResumeNot;
        return this;
    }

    /**
     * Get syncVmTimeOnResumeNot
     *
     * @return syncVmTimeOnResumeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSyncVmTimeOnResumeNot() {
        return syncVmTimeOnResumeNot;
    }

    public void setSyncVmTimeOnResumeNot(Boolean syncVmTimeOnResumeNot) {
        this.syncVmTimeOnResumeNot = syncVmTimeOnResumeNot;
    }

    public VmTemplateConfigWhereInput syncVmTimeOnResumeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput syncVmTimeOnResumeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT);
        return this;
    }

    public void setSyncVmTimeOnResumeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT);
        }
    }

    public boolean getSyncVmTimeOnResumeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME_NOT);
    }

    public VmTemplateConfigWhereInput type(StorageClusterConfigStorageType type) {

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
    public StorageClusterConfigStorageType getType() {
        return type;
    }

    public void setType(StorageClusterConfigStorageType type) {
        this.type = type;
    }

    public VmTemplateConfigWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmTemplateConfigWhereInput type_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput typeIn(List<StorageClusterConfigStorageType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmTemplateConfigWhereInput addTypeInItem(StorageClusterConfigStorageType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<StorageClusterConfigStorageType>();
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
    public List<StorageClusterConfigStorageType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<StorageClusterConfigStorageType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmTemplateConfigWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmTemplateConfigWhereInput typeIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput typeNot(StorageClusterConfigStorageType typeNot) {

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
    public StorageClusterConfigStorageType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(StorageClusterConfigStorageType typeNot) {
        this.typeNot = typeNot;
    }

    public VmTemplateConfigWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput typeNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput typeNotIn(List<StorageClusterConfigStorageType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addTypeNotInItem(
            StorageClusterConfigStorageType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<StorageClusterConfigStorageType>();
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
    public List<StorageClusterConfigStorageType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<StorageClusterConfigStorageType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmTemplateConfigWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersion(String vcfsVersion) {

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

    public VmTemplateConfigWhereInput vcfsVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersion_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionContains(String vcfsVersionContains) {

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

    public VmTemplateConfigWhereInput vcfsVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionEndsWith(String vcfsVersionEndsWith) {

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

    public VmTemplateConfigWhereInput vcfsVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionGt(String vcfsVersionGt) {

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

    public VmTemplateConfigWhereInput vcfsVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_GT);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionGte(String vcfsVersionGte) {

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

    public VmTemplateConfigWhereInput vcfsVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionIn(List<String> vcfsVersionIn) {

        this.vcfsVersionIn = vcfsVersionIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVcfsVersionInItem(String vcfsVersionInItem) {
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

    public VmTemplateConfigWhereInput vcfsVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_IN);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionLt(String vcfsVersionLt) {

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

    public VmTemplateConfigWhereInput vcfsVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_LT);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionLte(String vcfsVersionLte) {

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

    public VmTemplateConfigWhereInput vcfsVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionNot(String vcfsVersionNot) {

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

    public VmTemplateConfigWhereInput vcfsVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionNotContains(String vcfsVersionNotContains) {

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

    public VmTemplateConfigWhereInput vcfsVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionNotEndsWith(String vcfsVersionNotEndsWith) {

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

    public VmTemplateConfigWhereInput vcfsVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionNotIn(List<String> vcfsVersionNotIn) {

        this.vcfsVersionNotIn = vcfsVersionNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVcfsVersionNotInItem(String vcfsVersionNotInItem) {
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

    public VmTemplateConfigWhereInput vcfsVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionNotStartsWith(String vcfsVersionNotStartsWith) {

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

    public VmTemplateConfigWhereInput vcfsVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcfsVersionStartsWith(String vcfsVersionStartsWith) {

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

    public VmTemplateConfigWhereInput vcfsVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vcfsVersionStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpu(Integer vcpu) {

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

    public VmTemplateConfigWhereInput vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public VmTemplateConfigWhereInput vcpu_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuGt(Integer vcpuGt) {

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

    public VmTemplateConfigWhereInput vcpuGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GT);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuGte(Integer vcpuGte) {

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

    public VmTemplateConfigWhereInput vcpuGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuIn(List<Integer> vcpuIn) {

        this.vcpuIn = vcpuIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVcpuInItem(Integer vcpuInItem) {
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

    public VmTemplateConfigWhereInput vcpuIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_IN);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuLt(Integer vcpuLt) {

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

    public VmTemplateConfigWhereInput vcpuLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LT);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuLte(Integer vcpuLte) {

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

    public VmTemplateConfigWhereInput vcpuLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuNot(Integer vcpuNot) {

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

    public VmTemplateConfigWhereInput vcpuNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {

        this.vcpuNotIn = vcpuNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
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

    public VmTemplateConfigWhereInput vcpuNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput vcpuNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoType(String videoType) {

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

    public VmTemplateConfigWhereInput videoType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public VmTemplateConfigWhereInput videoType_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeContains(String videoTypeContains) {

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

    public VmTemplateConfigWhereInput videoTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeEndsWith(String videoTypeEndsWith) {

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

    public VmTemplateConfigWhereInput videoTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeGt(String videoTypeGt) {

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

    public VmTemplateConfigWhereInput videoTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_GT);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeGt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeGte(String videoTypeGte) {

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

    public VmTemplateConfigWhereInput videoTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeGte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeIn(List<String> videoTypeIn) {

        this.videoTypeIn = videoTypeIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVideoTypeInItem(String videoTypeInItem) {
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

    public VmTemplateConfigWhereInput videoTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_IN);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeLt(String videoTypeLt) {

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

    public VmTemplateConfigWhereInput videoTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_LT);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeLt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeLte(String videoTypeLte) {

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

    public VmTemplateConfigWhereInput videoTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeLte_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeNot(String videoTypeNot) {

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

    public VmTemplateConfigWhereInput videoTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeNot_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeNotContains(String videoTypeNotContains) {

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

    public VmTemplateConfigWhereInput videoTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeNotEndsWith(String videoTypeNotEndsWith) {

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

    public VmTemplateConfigWhereInput videoTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeNotIn(List<String> videoTypeNotIn) {

        this.videoTypeNotIn = videoTypeNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVideoTypeNotInItem(String videoTypeNotInItem) {
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

    public VmTemplateConfigWhereInput videoTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeNotStartsWith(String videoTypeNotStartsWith) {

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

    public VmTemplateConfigWhereInput videoTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput videoTypeStartsWith(String videoTypeStartsWith) {

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

    public VmTemplateConfigWhereInput videoTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput videoTypeStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput vmTemplate(VmTemplateWhereInput vmTemplate) {

        this.vmTemplate = vmTemplate;
        return this;
    }

    /**
     * Get vmTemplate
     *
     * @return vmTemplate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplate() {
        return vmTemplate;
    }

    public void setVmTemplate(VmTemplateWhereInput vmTemplate) {
        this.vmTemplate = vmTemplate;
    }

    public VmTemplateConfigWhereInput vmTemplate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE);
        return this;
    }

    public VmTemplateConfigWhereInput vmTemplate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE);
        return this;
    }

    public void setVmTemplate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE);
        }
    }

    public boolean getVmTemplate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE);
    }

    public VmTemplateConfigWhereInput vmVersion(String vmVersion) {

        this.vmVersion = vmVersion;
        return this;
    }

    /**
     * Get vmVersion
     *
     * @return vmVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersion() {
        return vmVersion;
    }

    public void setVmVersion(String vmVersion) {
        this.vmVersion = vmVersion;
    }

    public VmTemplateConfigWhereInput vmVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION);
        return this;
    }

    public void setVmVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION);
        }
    }

    public boolean getVmVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION);
    }

    public VmTemplateConfigWhereInput vmVersionContains(String vmVersionContains) {

        this.vmVersionContains = vmVersionContains;
        return this;
    }

    /**
     * Get vmVersionContains
     *
     * @return vmVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionContains() {
        return vmVersionContains;
    }

    public void setVmVersionContains(String vmVersionContains) {
        this.vmVersionContains = vmVersionContains;
    }

    public VmTemplateConfigWhereInput vmVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_CONTAINS);
        return this;
    }

    public void setVmVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_CONTAINS);
        }
    }

    public boolean getVmVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_CONTAINS);
    }

    public VmTemplateConfigWhereInput vmVersionEndsWith(String vmVersionEndsWith) {

        this.vmVersionEndsWith = vmVersionEndsWith;
        return this;
    }

    /**
     * Get vmVersionEndsWith
     *
     * @return vmVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionEndsWith() {
        return vmVersionEndsWith;
    }

    public void setVmVersionEndsWith(String vmVersionEndsWith) {
        this.vmVersionEndsWith = vmVersionEndsWith;
    }

    public VmTemplateConfigWhereInput vmVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_ENDS_WITH);
        return this;
    }

    public void setVmVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_ENDS_WITH);
        }
    }

    public boolean getVmVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_ENDS_WITH);
    }

    public VmTemplateConfigWhereInput vmVersionGt(String vmVersionGt) {

        this.vmVersionGt = vmVersionGt;
        return this;
    }

    /**
     * Get vmVersionGt
     *
     * @return vmVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionGt() {
        return vmVersionGt;
    }

    public void setVmVersionGt(String vmVersionGt) {
        this.vmVersionGt = vmVersionGt;
    }

    public VmTemplateConfigWhereInput vmVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_GT);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_GT);
        return this;
    }

    public void setVmVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_GT);
        }
    }

    public boolean getVmVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_GT);
    }

    public VmTemplateConfigWhereInput vmVersionGte(String vmVersionGte) {

        this.vmVersionGte = vmVersionGte;
        return this;
    }

    /**
     * Get vmVersionGte
     *
     * @return vmVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionGte() {
        return vmVersionGte;
    }

    public void setVmVersionGte(String vmVersionGte) {
        this.vmVersionGte = vmVersionGte;
    }

    public VmTemplateConfigWhereInput vmVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_GTE);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_GTE);
        return this;
    }

    public void setVmVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_GTE);
        }
    }

    public boolean getVmVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_GTE);
    }

    public VmTemplateConfigWhereInput vmVersionIn(List<String> vmVersionIn) {

        this.vmVersionIn = vmVersionIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVmVersionInItem(String vmVersionInItem) {
        if (this.vmVersionIn == null) {
            this.vmVersionIn = new ArrayList<String>();
        }
        this.vmVersionIn.add(vmVersionInItem);
        return this;
    }

    /**
     * Get vmVersionIn
     *
     * @return vmVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmVersionIn() {
        return vmVersionIn;
    }

    public void setVmVersionIn(List<String> vmVersionIn) {
        this.vmVersionIn = vmVersionIn;
    }

    public VmTemplateConfigWhereInput vmVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_IN);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_IN);
        return this;
    }

    public void setVmVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_IN);
        }
    }

    public boolean getVmVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_IN);
    }

    public VmTemplateConfigWhereInput vmVersionLt(String vmVersionLt) {

        this.vmVersionLt = vmVersionLt;
        return this;
    }

    /**
     * Get vmVersionLt
     *
     * @return vmVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionLt() {
        return vmVersionLt;
    }

    public void setVmVersionLt(String vmVersionLt) {
        this.vmVersionLt = vmVersionLt;
    }

    public VmTemplateConfigWhereInput vmVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_LT);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_LT);
        return this;
    }

    public void setVmVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_LT);
        }
    }

    public boolean getVmVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_LT);
    }

    public VmTemplateConfigWhereInput vmVersionLte(String vmVersionLte) {

        this.vmVersionLte = vmVersionLte;
        return this;
    }

    /**
     * Get vmVersionLte
     *
     * @return vmVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionLte() {
        return vmVersionLte;
    }

    public void setVmVersionLte(String vmVersionLte) {
        this.vmVersionLte = vmVersionLte;
    }

    public VmTemplateConfigWhereInput vmVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_LTE);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_LTE);
        return this;
    }

    public void setVmVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_LTE);
        }
    }

    public boolean getVmVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_LTE);
    }

    public VmTemplateConfigWhereInput vmVersionNot(String vmVersionNot) {

        this.vmVersionNot = vmVersionNot;
        return this;
    }

    /**
     * Get vmVersionNot
     *
     * @return vmVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionNot() {
        return vmVersionNot;
    }

    public void setVmVersionNot(String vmVersionNot) {
        this.vmVersionNot = vmVersionNot;
    }

    public VmTemplateConfigWhereInput vmVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT);
        return this;
    }

    public void setVmVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT);
        }
    }

    public boolean getVmVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_NOT);
    }

    public VmTemplateConfigWhereInput vmVersionNotContains(String vmVersionNotContains) {

        this.vmVersionNotContains = vmVersionNotContains;
        return this;
    }

    /**
     * Get vmVersionNotContains
     *
     * @return vmVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionNotContains() {
        return vmVersionNotContains;
    }

    public void setVmVersionNotContains(String vmVersionNotContains) {
        this.vmVersionNotContains = vmVersionNotContains;
    }

    public VmTemplateConfigWhereInput vmVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVmVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVmVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_NOT_CONTAINS);
    }

    public VmTemplateConfigWhereInput vmVersionNotEndsWith(String vmVersionNotEndsWith) {

        this.vmVersionNotEndsWith = vmVersionNotEndsWith;
        return this;
    }

    /**
     * Get vmVersionNotEndsWith
     *
     * @return vmVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionNotEndsWith() {
        return vmVersionNotEndsWith;
    }

    public void setVmVersionNotEndsWith(String vmVersionNotEndsWith) {
        this.vmVersionNotEndsWith = vmVersionNotEndsWith;
    }

    public VmTemplateConfigWhereInput vmVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVmVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVmVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_NOT_ENDS_WITH);
    }

    public VmTemplateConfigWhereInput vmVersionNotIn(List<String> vmVersionNotIn) {

        this.vmVersionNotIn = vmVersionNotIn;
        return this;
    }

    public VmTemplateConfigWhereInput addVmVersionNotInItem(String vmVersionNotInItem) {
        if (this.vmVersionNotIn == null) {
            this.vmVersionNotIn = new ArrayList<String>();
        }
        this.vmVersionNotIn.add(vmVersionNotInItem);
        return this;
    }

    /**
     * Get vmVersionNotIn
     *
     * @return vmVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmVersionNotIn() {
        return vmVersionNotIn;
    }

    public void setVmVersionNotIn(List<String> vmVersionNotIn) {
        this.vmVersionNotIn = vmVersionNotIn;
    }

    public VmTemplateConfigWhereInput vmVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_IN);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_IN);
        return this;
    }

    public void setVmVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_IN);
        }
    }

    public boolean getVmVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_NOT_IN);
    }

    public VmTemplateConfigWhereInput vmVersionNotStartsWith(String vmVersionNotStartsWith) {

        this.vmVersionNotStartsWith = vmVersionNotStartsWith;
        return this;
    }

    /**
     * Get vmVersionNotStartsWith
     *
     * @return vmVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionNotStartsWith() {
        return vmVersionNotStartsWith;
    }

    public void setVmVersionNotStartsWith(String vmVersionNotStartsWith) {
        this.vmVersionNotStartsWith = vmVersionNotStartsWith;
    }

    public VmTemplateConfigWhereInput vmVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVmVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVmVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_NOT_STARTS_WITH);
    }

    public VmTemplateConfigWhereInput vmVersionStartsWith(String vmVersionStartsWith) {

        this.vmVersionStartsWith = vmVersionStartsWith;
        return this;
    }

    /**
     * Get vmVersionStartsWith
     *
     * @return vmVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVersionStartsWith() {
        return vmVersionStartsWith;
    }

    public void setVmVersionStartsWith(String vmVersionStartsWith) {
        this.vmVersionStartsWith = vmVersionStartsWith;
    }

    public VmTemplateConfigWhereInput vmVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigWhereInput vmVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_STARTS_WITH);
        return this;
    }

    public void setVmVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VERSION_STARTS_WITH);
        }
    }

    public boolean getVmVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VERSION_STARTS_WITH);
    }

    public VmTemplateConfigWhereInput vtpmEnabled(Boolean vtpmEnabled) {

        this.vtpmEnabled = vtpmEnabled;
        return this;
    }

    /**
     * Get vtpmEnabled
     *
     * @return vtpmEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVtpmEnabled() {
        return vtpmEnabled;
    }

    public void setVtpmEnabled(Boolean vtpmEnabled) {
        this.vtpmEnabled = vtpmEnabled;
    }

    public VmTemplateConfigWhereInput vtpmEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VTPM_ENABLED);
        return this;
    }

    public VmTemplateConfigWhereInput vtpmEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VTPM_ENABLED);
        return this;
    }

    public void setVtpmEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VTPM_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VTPM_ENABLED);
        }
    }

    public boolean getVtpmEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VTPM_ENABLED);
    }

    public VmTemplateConfigWhereInput vtpmEnabledNot(Boolean vtpmEnabledNot) {

        this.vtpmEnabledNot = vtpmEnabledNot;
        return this;
    }

    /**
     * Get vtpmEnabledNot
     *
     * @return vtpmEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVtpmEnabledNot() {
        return vtpmEnabledNot;
    }

    public void setVtpmEnabledNot(Boolean vtpmEnabledNot) {
        this.vtpmEnabledNot = vtpmEnabledNot;
    }

    public VmTemplateConfigWhereInput vtpmEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VTPM_ENABLED_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput vtpmEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VTPM_ENABLED_NOT);
        return this;
    }

    public void setVtpmEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VTPM_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VTPM_ENABLED_NOT);
        }
    }

    public boolean getVtpmEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VTPM_ENABLED_NOT);
    }

    public VmTemplateConfigWhereInput winOpt(Boolean winOpt) {

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

    public VmTemplateConfigWhereInput winOpt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public VmTemplateConfigWhereInput winOpt_ExplictlyNonNull() {
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

    public VmTemplateConfigWhereInput winOptNot(Boolean winOptNot) {

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

    public VmTemplateConfigWhereInput winOptNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT_NOT);
        return this;
    }

    public VmTemplateConfigWhereInput winOptNot_ExplictlyNonNull() {
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
        VmTemplateConfigWhereInput vmTemplateConfigWhereInput = (VmTemplateConfigWhereInput) o;
        return Objects.equals(this.AND, vmTemplateConfigWhereInput.AND)
                && Objects.equals(this.NOT, vmTemplateConfigWhereInput.NOT)
                && Objects.equals(this.OR, vmTemplateConfigWhereInput.OR)
                && Objects.equals(this.architecture, vmTemplateConfigWhereInput.architecture)
                && Objects.equals(this.architectureIn, vmTemplateConfigWhereInput.architectureIn)
                && Objects.equals(this.architectureNot, vmTemplateConfigWhereInput.architectureNot)
                && Objects.equals(
                        this.architectureNotIn, vmTemplateConfigWhereInput.architectureNotIn)
                && Objects.equals(this.clockOffset, vmTemplateConfigWhereInput.clockOffset)
                && Objects.equals(this.clockOffsetIn, vmTemplateConfigWhereInput.clockOffsetIn)
                && Objects.equals(this.clockOffsetNot, vmTemplateConfigWhereInput.clockOffsetNot)
                && Objects.equals(
                        this.clockOffsetNotIn, vmTemplateConfigWhereInput.clockOffsetNotIn)
                && Objects.equals(
                        this.cloudInitSupported, vmTemplateConfigWhereInput.cloudInitSupported)
                && Objects.equals(
                        this.cloudInitSupportedNot,
                        vmTemplateConfigWhereInput.cloudInitSupportedNot)
                && Objects.equals(
                        this.contentLibraryVmTemplate,
                        vmTemplateConfigWhereInput.contentLibraryVmTemplate)
                && Objects.equals(
                        this.cpuExclusiveExpectedEnabled,
                        vmTemplateConfigWhereInput.cpuExclusiveExpectedEnabled)
                && Objects.equals(
                        this.cpuExclusiveExpectedEnabledNot,
                        vmTemplateConfigWhereInput.cpuExclusiveExpectedEnabledNot)
                && Objects.equals(this.cpuModel, vmTemplateConfigWhereInput.cpuModel)
                && Objects.equals(
                        this.cpuModelContains, vmTemplateConfigWhereInput.cpuModelContains)
                && Objects.equals(
                        this.cpuModelEndsWith, vmTemplateConfigWhereInput.cpuModelEndsWith)
                && Objects.equals(this.cpuModelGt, vmTemplateConfigWhereInput.cpuModelGt)
                && Objects.equals(this.cpuModelGte, vmTemplateConfigWhereInput.cpuModelGte)
                && Objects.equals(this.cpuModelIn, vmTemplateConfigWhereInput.cpuModelIn)
                && Objects.equals(this.cpuModelLt, vmTemplateConfigWhereInput.cpuModelLt)
                && Objects.equals(this.cpuModelLte, vmTemplateConfigWhereInput.cpuModelLte)
                && Objects.equals(this.cpuModelNot, vmTemplateConfigWhereInput.cpuModelNot)
                && Objects.equals(
                        this.cpuModelNotContains, vmTemplateConfigWhereInput.cpuModelNotContains)
                && Objects.equals(
                        this.cpuModelNotEndsWith, vmTemplateConfigWhereInput.cpuModelNotEndsWith)
                && Objects.equals(this.cpuModelNotIn, vmTemplateConfigWhereInput.cpuModelNotIn)
                && Objects.equals(
                        this.cpuModelNotStartsWith,
                        vmTemplateConfigWhereInput.cpuModelNotStartsWith)
                && Objects.equals(
                        this.cpuModelStartsWith, vmTemplateConfigWhereInput.cpuModelStartsWith)
                && Objects.equals(this.datastore, vmTemplateConfigWhereInput.datastore)
                && Objects.equals(this.description, vmTemplateConfigWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, vmTemplateConfigWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, vmTemplateConfigWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, vmTemplateConfigWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, vmTemplateConfigWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, vmTemplateConfigWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, vmTemplateConfigWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, vmTemplateConfigWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, vmTemplateConfigWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        vmTemplateConfigWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        vmTemplateConfigWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, vmTemplateConfigWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        vmTemplateConfigWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        vmTemplateConfigWhereInput.descriptionStartsWith)
                && Objects.equals(this.disksEvery, vmTemplateConfigWhereInput.disksEvery)
                && Objects.equals(this.disksNone, vmTemplateConfigWhereInput.disksNone)
                && Objects.equals(this.disksSome, vmTemplateConfigWhereInput.disksSome)
                && Objects.equals(
                        this.entityAsyncStatus, vmTemplateConfigWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, vmTemplateConfigWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vmTemplateConfigWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        vmTemplateConfigWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.firmware, vmTemplateConfigWhereInput.firmware)
                && Objects.equals(this.firmwareIn, vmTemplateConfigWhereInput.firmwareIn)
                && Objects.equals(this.firmwareNot, vmTemplateConfigWhereInput.firmwareNot)
                && Objects.equals(this.firmwareNotIn, vmTemplateConfigWhereInput.firmwareNotIn)
                && Objects.equals(this.guestOsType, vmTemplateConfigWhereInput.guestOsType)
                && Objects.equals(this.guestOsTypeIn, vmTemplateConfigWhereInput.guestOsTypeIn)
                && Objects.equals(this.guestOsTypeNot, vmTemplateConfigWhereInput.guestOsTypeNot)
                && Objects.equals(
                        this.guestOsTypeNotIn, vmTemplateConfigWhereInput.guestOsTypeNotIn)
                && Objects.equals(this.ha, vmTemplateConfigWhereInput.ha)
                && Objects.equals(this.haNot, vmTemplateConfigWhereInput.haNot)
                && Objects.equals(this.id, vmTemplateConfigWhereInput.id)
                && Objects.equals(this.idContains, vmTemplateConfigWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmTemplateConfigWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmTemplateConfigWhereInput.idGt)
                && Objects.equals(this.idGte, vmTemplateConfigWhereInput.idGte)
                && Objects.equals(this.idIn, vmTemplateConfigWhereInput.idIn)
                && Objects.equals(this.idLt, vmTemplateConfigWhereInput.idLt)
                && Objects.equals(this.idLte, vmTemplateConfigWhereInput.idLte)
                && Objects.equals(this.idNot, vmTemplateConfigWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmTemplateConfigWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmTemplateConfigWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmTemplateConfigWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmTemplateConfigWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmTemplateConfigWhereInput.idStartsWith)
                && Objects.equals(this.ioPolicy, vmTemplateConfigWhereInput.ioPolicy)
                && Objects.equals(this.ioPolicyIn, vmTemplateConfigWhereInput.ioPolicyIn)
                && Objects.equals(this.ioPolicyNot, vmTemplateConfigWhereInput.ioPolicyNot)
                && Objects.equals(this.ioPolicyNotIn, vmTemplateConfigWhereInput.ioPolicyNotIn)
                && Objects.equals(this.localId, vmTemplateConfigWhereInput.localId)
                && Objects.equals(this.localIdContains, vmTemplateConfigWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vmTemplateConfigWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vmTemplateConfigWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vmTemplateConfigWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vmTemplateConfigWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vmTemplateConfigWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vmTemplateConfigWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vmTemplateConfigWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, vmTemplateConfigWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, vmTemplateConfigWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vmTemplateConfigWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, vmTemplateConfigWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, vmTemplateConfigWhereInput.localIdStartsWith)
                && Objects.equals(this.machineFamily, vmTemplateConfigWhereInput.machineFamily)
                && Objects.equals(
                        this.machineFamilyContains,
                        vmTemplateConfigWhereInput.machineFamilyContains)
                && Objects.equals(
                        this.machineFamilyEndsWith,
                        vmTemplateConfigWhereInput.machineFamilyEndsWith)
                && Objects.equals(this.machineFamilyGt, vmTemplateConfigWhereInput.machineFamilyGt)
                && Objects.equals(
                        this.machineFamilyGte, vmTemplateConfigWhereInput.machineFamilyGte)
                && Objects.equals(this.machineFamilyIn, vmTemplateConfigWhereInput.machineFamilyIn)
                && Objects.equals(this.machineFamilyLt, vmTemplateConfigWhereInput.machineFamilyLt)
                && Objects.equals(
                        this.machineFamilyLte, vmTemplateConfigWhereInput.machineFamilyLte)
                && Objects.equals(
                        this.machineFamilyNot, vmTemplateConfigWhereInput.machineFamilyNot)
                && Objects.equals(
                        this.machineFamilyNotContains,
                        vmTemplateConfigWhereInput.machineFamilyNotContains)
                && Objects.equals(
                        this.machineFamilyNotEndsWith,
                        vmTemplateConfigWhereInput.machineFamilyNotEndsWith)
                && Objects.equals(
                        this.machineFamilyNotIn, vmTemplateConfigWhereInput.machineFamilyNotIn)
                && Objects.equals(
                        this.machineFamilyNotStartsWith,
                        vmTemplateConfigWhereInput.machineFamilyNotStartsWith)
                && Objects.equals(
                        this.machineFamilyStartsWith,
                        vmTemplateConfigWhereInput.machineFamilyStartsWith)
                && Objects.equals(this.maxBandwidth, vmTemplateConfigWhereInput.maxBandwidth)
                && Objects.equals(this.maxBandwidthGt, vmTemplateConfigWhereInput.maxBandwidthGt)
                && Objects.equals(this.maxBandwidthGte, vmTemplateConfigWhereInput.maxBandwidthGte)
                && Objects.equals(this.maxBandwidthIn, vmTemplateConfigWhereInput.maxBandwidthIn)
                && Objects.equals(this.maxBandwidthLt, vmTemplateConfigWhereInput.maxBandwidthLt)
                && Objects.equals(this.maxBandwidthLte, vmTemplateConfigWhereInput.maxBandwidthLte)
                && Objects.equals(this.maxBandwidthNot, vmTemplateConfigWhereInput.maxBandwidthNot)
                && Objects.equals(
                        this.maxBandwidthNotIn, vmTemplateConfigWhereInput.maxBandwidthNotIn)
                && Objects.equals(
                        this.maxBandwidthPolicy, vmTemplateConfigWhereInput.maxBandwidthPolicy)
                && Objects.equals(
                        this.maxBandwidthPolicyIn, vmTemplateConfigWhereInput.maxBandwidthPolicyIn)
                && Objects.equals(
                        this.maxBandwidthPolicyNot,
                        vmTemplateConfigWhereInput.maxBandwidthPolicyNot)
                && Objects.equals(
                        this.maxBandwidthPolicyNotIn,
                        vmTemplateConfigWhereInput.maxBandwidthPolicyNotIn)
                && Objects.equals(this.maxIops, vmTemplateConfigWhereInput.maxIops)
                && Objects.equals(this.maxIopsGt, vmTemplateConfigWhereInput.maxIopsGt)
                && Objects.equals(this.maxIopsGte, vmTemplateConfigWhereInput.maxIopsGte)
                && Objects.equals(this.maxIopsIn, vmTemplateConfigWhereInput.maxIopsIn)
                && Objects.equals(this.maxIopsLt, vmTemplateConfigWhereInput.maxIopsLt)
                && Objects.equals(this.maxIopsLte, vmTemplateConfigWhereInput.maxIopsLte)
                && Objects.equals(this.maxIopsNot, vmTemplateConfigWhereInput.maxIopsNot)
                && Objects.equals(this.maxIopsNotIn, vmTemplateConfigWhereInput.maxIopsNotIn)
                && Objects.equals(this.maxIopsPolicy, vmTemplateConfigWhereInput.maxIopsPolicy)
                && Objects.equals(this.maxIopsPolicyIn, vmTemplateConfigWhereInput.maxIopsPolicyIn)
                && Objects.equals(
                        this.maxIopsPolicyNot, vmTemplateConfigWhereInput.maxIopsPolicyNot)
                && Objects.equals(
                        this.maxIopsPolicyNotIn, vmTemplateConfigWhereInput.maxIopsPolicyNotIn)
                && Objects.equals(this.memory, vmTemplateConfigWhereInput.memory)
                && Objects.equals(this.memoryGt, vmTemplateConfigWhereInput.memoryGt)
                && Objects.equals(this.memoryGte, vmTemplateConfigWhereInput.memoryGte)
                && Objects.equals(this.memoryIn, vmTemplateConfigWhereInput.memoryIn)
                && Objects.equals(this.memoryLt, vmTemplateConfigWhereInput.memoryLt)
                && Objects.equals(this.memoryLte, vmTemplateConfigWhereInput.memoryLte)
                && Objects.equals(this.memoryNot, vmTemplateConfigWhereInput.memoryNot)
                && Objects.equals(this.memoryNotIn, vmTemplateConfigWhereInput.memoryNotIn)
                && Objects.equals(this.name, vmTemplateConfigWhereInput.name)
                && Objects.equals(this.nameContains, vmTemplateConfigWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vmTemplateConfigWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vmTemplateConfigWhereInput.nameGt)
                && Objects.equals(this.nameGte, vmTemplateConfigWhereInput.nameGte)
                && Objects.equals(this.nameIn, vmTemplateConfigWhereInput.nameIn)
                && Objects.equals(this.nameLt, vmTemplateConfigWhereInput.nameLt)
                && Objects.equals(this.nameLte, vmTemplateConfigWhereInput.nameLte)
                && Objects.equals(this.nameNot, vmTemplateConfigWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vmTemplateConfigWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vmTemplateConfigWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vmTemplateConfigWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, vmTemplateConfigWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vmTemplateConfigWhereInput.nameStartsWith)
                && Objects.equals(this.os, vmTemplateConfigWhereInput.os)
                && Objects.equals(this.osContains, vmTemplateConfigWhereInput.osContains)
                && Objects.equals(this.osEndsWith, vmTemplateConfigWhereInput.osEndsWith)
                && Objects.equals(this.osGt, vmTemplateConfigWhereInput.osGt)
                && Objects.equals(this.osGte, vmTemplateConfigWhereInput.osGte)
                && Objects.equals(this.osIn, vmTemplateConfigWhereInput.osIn)
                && Objects.equals(this.osLt, vmTemplateConfigWhereInput.osLt)
                && Objects.equals(this.osLte, vmTemplateConfigWhereInput.osLte)
                && Objects.equals(this.osNot, vmTemplateConfigWhereInput.osNot)
                && Objects.equals(this.osNotContains, vmTemplateConfigWhereInput.osNotContains)
                && Objects.equals(this.osNotEndsWith, vmTemplateConfigWhereInput.osNotEndsWith)
                && Objects.equals(this.osNotIn, vmTemplateConfigWhereInput.osNotIn)
                && Objects.equals(this.osNotStartsWith, vmTemplateConfigWhereInput.osNotStartsWith)
                && Objects.equals(this.osStartsWith, vmTemplateConfigWhereInput.osStartsWith)
                && Objects.equals(this.path, vmTemplateConfigWhereInput.path)
                && Objects.equals(this.pathContains, vmTemplateConfigWhereInput.pathContains)
                && Objects.equals(this.pathEndsWith, vmTemplateConfigWhereInput.pathEndsWith)
                && Objects.equals(this.pathGt, vmTemplateConfigWhereInput.pathGt)
                && Objects.equals(this.pathGte, vmTemplateConfigWhereInput.pathGte)
                && Objects.equals(this.pathIn, vmTemplateConfigWhereInput.pathIn)
                && Objects.equals(this.pathLt, vmTemplateConfigWhereInput.pathLt)
                && Objects.equals(this.pathLte, vmTemplateConfigWhereInput.pathLte)
                && Objects.equals(this.pathNot, vmTemplateConfigWhereInput.pathNot)
                && Objects.equals(this.pathNotContains, vmTemplateConfigWhereInput.pathNotContains)
                && Objects.equals(this.pathNotEndsWith, vmTemplateConfigWhereInput.pathNotEndsWith)
                && Objects.equals(this.pathNotIn, vmTemplateConfigWhereInput.pathNotIn)
                && Objects.equals(
                        this.pathNotStartsWith, vmTemplateConfigWhereInput.pathNotStartsWith)
                && Objects.equals(this.pathStartsWith, vmTemplateConfigWhereInput.pathStartsWith)
                && Objects.equals(
                        this.secureBootEnabled, vmTemplateConfigWhereInput.secureBootEnabled)
                && Objects.equals(
                        this.secureBootEnabledNot, vmTemplateConfigWhereInput.secureBootEnabledNot)
                && Objects.equals(this.size, vmTemplateConfigWhereInput.size)
                && Objects.equals(this.sizeGt, vmTemplateConfigWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, vmTemplateConfigWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, vmTemplateConfigWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, vmTemplateConfigWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, vmTemplateConfigWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, vmTemplateConfigWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, vmTemplateConfigWhereInput.sizeNotIn)
                && Objects.equals(this.storageCluster, vmTemplateConfigWhereInput.storageCluster)
                && Objects.equals(
                        this.syncVmTimeOnResume, vmTemplateConfigWhereInput.syncVmTimeOnResume)
                && Objects.equals(
                        this.syncVmTimeOnResumeNot,
                        vmTemplateConfigWhereInput.syncVmTimeOnResumeNot)
                && Objects.equals(this.type, vmTemplateConfigWhereInput.type)
                && Objects.equals(this.typeIn, vmTemplateConfigWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmTemplateConfigWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmTemplateConfigWhereInput.typeNotIn)
                && Objects.equals(this.vcfsVersion, vmTemplateConfigWhereInput.vcfsVersion)
                && Objects.equals(
                        this.vcfsVersionContains, vmTemplateConfigWhereInput.vcfsVersionContains)
                && Objects.equals(
                        this.vcfsVersionEndsWith, vmTemplateConfigWhereInput.vcfsVersionEndsWith)
                && Objects.equals(this.vcfsVersionGt, vmTemplateConfigWhereInput.vcfsVersionGt)
                && Objects.equals(this.vcfsVersionGte, vmTemplateConfigWhereInput.vcfsVersionGte)
                && Objects.equals(this.vcfsVersionIn, vmTemplateConfigWhereInput.vcfsVersionIn)
                && Objects.equals(this.vcfsVersionLt, vmTemplateConfigWhereInput.vcfsVersionLt)
                && Objects.equals(this.vcfsVersionLte, vmTemplateConfigWhereInput.vcfsVersionLte)
                && Objects.equals(this.vcfsVersionNot, vmTemplateConfigWhereInput.vcfsVersionNot)
                && Objects.equals(
                        this.vcfsVersionNotContains,
                        vmTemplateConfigWhereInput.vcfsVersionNotContains)
                && Objects.equals(
                        this.vcfsVersionNotEndsWith,
                        vmTemplateConfigWhereInput.vcfsVersionNotEndsWith)
                && Objects.equals(
                        this.vcfsVersionNotIn, vmTemplateConfigWhereInput.vcfsVersionNotIn)
                && Objects.equals(
                        this.vcfsVersionNotStartsWith,
                        vmTemplateConfigWhereInput.vcfsVersionNotStartsWith)
                && Objects.equals(
                        this.vcfsVersionStartsWith,
                        vmTemplateConfigWhereInput.vcfsVersionStartsWith)
                && Objects.equals(this.vcpu, vmTemplateConfigWhereInput.vcpu)
                && Objects.equals(this.vcpuGt, vmTemplateConfigWhereInput.vcpuGt)
                && Objects.equals(this.vcpuGte, vmTemplateConfigWhereInput.vcpuGte)
                && Objects.equals(this.vcpuIn, vmTemplateConfigWhereInput.vcpuIn)
                && Objects.equals(this.vcpuLt, vmTemplateConfigWhereInput.vcpuLt)
                && Objects.equals(this.vcpuLte, vmTemplateConfigWhereInput.vcpuLte)
                && Objects.equals(this.vcpuNot, vmTemplateConfigWhereInput.vcpuNot)
                && Objects.equals(this.vcpuNotIn, vmTemplateConfigWhereInput.vcpuNotIn)
                && Objects.equals(this.videoType, vmTemplateConfigWhereInput.videoType)
                && Objects.equals(
                        this.videoTypeContains, vmTemplateConfigWhereInput.videoTypeContains)
                && Objects.equals(
                        this.videoTypeEndsWith, vmTemplateConfigWhereInput.videoTypeEndsWith)
                && Objects.equals(this.videoTypeGt, vmTemplateConfigWhereInput.videoTypeGt)
                && Objects.equals(this.videoTypeGte, vmTemplateConfigWhereInput.videoTypeGte)
                && Objects.equals(this.videoTypeIn, vmTemplateConfigWhereInput.videoTypeIn)
                && Objects.equals(this.videoTypeLt, vmTemplateConfigWhereInput.videoTypeLt)
                && Objects.equals(this.videoTypeLte, vmTemplateConfigWhereInput.videoTypeLte)
                && Objects.equals(this.videoTypeNot, vmTemplateConfigWhereInput.videoTypeNot)
                && Objects.equals(
                        this.videoTypeNotContains, vmTemplateConfigWhereInput.videoTypeNotContains)
                && Objects.equals(
                        this.videoTypeNotEndsWith, vmTemplateConfigWhereInput.videoTypeNotEndsWith)
                && Objects.equals(this.videoTypeNotIn, vmTemplateConfigWhereInput.videoTypeNotIn)
                && Objects.equals(
                        this.videoTypeNotStartsWith,
                        vmTemplateConfigWhereInput.videoTypeNotStartsWith)
                && Objects.equals(
                        this.videoTypeStartsWith, vmTemplateConfigWhereInput.videoTypeStartsWith)
                && Objects.equals(this.vmTemplate, vmTemplateConfigWhereInput.vmTemplate)
                && Objects.equals(this.vmVersion, vmTemplateConfigWhereInput.vmVersion)
                && Objects.equals(
                        this.vmVersionContains, vmTemplateConfigWhereInput.vmVersionContains)
                && Objects.equals(
                        this.vmVersionEndsWith, vmTemplateConfigWhereInput.vmVersionEndsWith)
                && Objects.equals(this.vmVersionGt, vmTemplateConfigWhereInput.vmVersionGt)
                && Objects.equals(this.vmVersionGte, vmTemplateConfigWhereInput.vmVersionGte)
                && Objects.equals(this.vmVersionIn, vmTemplateConfigWhereInput.vmVersionIn)
                && Objects.equals(this.vmVersionLt, vmTemplateConfigWhereInput.vmVersionLt)
                && Objects.equals(this.vmVersionLte, vmTemplateConfigWhereInput.vmVersionLte)
                && Objects.equals(this.vmVersionNot, vmTemplateConfigWhereInput.vmVersionNot)
                && Objects.equals(
                        this.vmVersionNotContains, vmTemplateConfigWhereInput.vmVersionNotContains)
                && Objects.equals(
                        this.vmVersionNotEndsWith, vmTemplateConfigWhereInput.vmVersionNotEndsWith)
                && Objects.equals(this.vmVersionNotIn, vmTemplateConfigWhereInput.vmVersionNotIn)
                && Objects.equals(
                        this.vmVersionNotStartsWith,
                        vmTemplateConfigWhereInput.vmVersionNotStartsWith)
                && Objects.equals(
                        this.vmVersionStartsWith, vmTemplateConfigWhereInput.vmVersionStartsWith)
                && Objects.equals(this.vtpmEnabled, vmTemplateConfigWhereInput.vtpmEnabled)
                && Objects.equals(this.vtpmEnabledNot, vmTemplateConfigWhereInput.vtpmEnabledNot)
                && Objects.equals(this.winOpt, vmTemplateConfigWhereInput.winOpt)
                && Objects.equals(this.winOptNot, vmTemplateConfigWhereInput.winOptNot);
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
                contentLibraryVmTemplate,
                cpuExclusiveExpectedEnabled,
                cpuExclusiveExpectedEnabledNot,
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
                datastore,
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
                disksEvery,
                disksNone,
                disksSome,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                firmware,
                firmwareIn,
                firmwareNot,
                firmwareNotIn,
                guestOsType,
                guestOsTypeIn,
                guestOsTypeNot,
                guestOsTypeNotIn,
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
                machineFamily,
                machineFamilyContains,
                machineFamilyEndsWith,
                machineFamilyGt,
                machineFamilyGte,
                machineFamilyIn,
                machineFamilyLt,
                machineFamilyLte,
                machineFamilyNot,
                machineFamilyNotContains,
                machineFamilyNotEndsWith,
                machineFamilyNotIn,
                machineFamilyNotStartsWith,
                machineFamilyStartsWith,
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
                secureBootEnabled,
                secureBootEnabledNot,
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                storageCluster,
                syncVmTimeOnResume,
                syncVmTimeOnResumeNot,
                type,
                typeIn,
                typeNot,
                typeNotIn,
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
                vcfsVersionStartsWith,
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
                vmTemplate,
                vmVersion,
                vmVersionContains,
                vmVersionEndsWith,
                vmVersionGt,
                vmVersionGte,
                vmVersionIn,
                vmVersionLt,
                vmVersionLte,
                vmVersionNot,
                vmVersionNotContains,
                vmVersionNotEndsWith,
                vmVersionNotIn,
                vmVersionNotStartsWith,
                vmVersionStartsWith,
                vtpmEnabled,
                vtpmEnabledNot,
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
        sb.append("class VmTemplateConfigWhereInput {\n");
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
        sb.append("    contentLibraryVmTemplate: ")
                .append(toIndentedString(contentLibraryVmTemplate))
                .append("\n");
        sb.append("    cpuExclusiveExpectedEnabled: ")
                .append(toIndentedString(cpuExclusiveExpectedEnabled))
                .append("\n");
        sb.append("    cpuExclusiveExpectedEnabledNot: ")
                .append(toIndentedString(cpuExclusiveExpectedEnabledNot))
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
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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
        sb.append("    disksEvery: ").append(toIndentedString(disksEvery)).append("\n");
        sb.append("    disksNone: ").append(toIndentedString(disksNone)).append("\n");
        sb.append("    disksSome: ").append(toIndentedString(disksSome)).append("\n");
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
        sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
        sb.append("    guestOsTypeIn: ").append(toIndentedString(guestOsTypeIn)).append("\n");
        sb.append("    guestOsTypeNot: ").append(toIndentedString(guestOsTypeNot)).append("\n");
        sb.append("    guestOsTypeNotIn: ").append(toIndentedString(guestOsTypeNotIn)).append("\n");
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
        sb.append("    machineFamily: ").append(toIndentedString(machineFamily)).append("\n");
        sb.append("    machineFamilyContains: ")
                .append(toIndentedString(machineFamilyContains))
                .append("\n");
        sb.append("    machineFamilyEndsWith: ")
                .append(toIndentedString(machineFamilyEndsWith))
                .append("\n");
        sb.append("    machineFamilyGt: ").append(toIndentedString(machineFamilyGt)).append("\n");
        sb.append("    machineFamilyGte: ").append(toIndentedString(machineFamilyGte)).append("\n");
        sb.append("    machineFamilyIn: ").append(toIndentedString(machineFamilyIn)).append("\n");
        sb.append("    machineFamilyLt: ").append(toIndentedString(machineFamilyLt)).append("\n");
        sb.append("    machineFamilyLte: ").append(toIndentedString(machineFamilyLte)).append("\n");
        sb.append("    machineFamilyNot: ").append(toIndentedString(machineFamilyNot)).append("\n");
        sb.append("    machineFamilyNotContains: ")
                .append(toIndentedString(machineFamilyNotContains))
                .append("\n");
        sb.append("    machineFamilyNotEndsWith: ")
                .append(toIndentedString(machineFamilyNotEndsWith))
                .append("\n");
        sb.append("    machineFamilyNotIn: ")
                .append(toIndentedString(machineFamilyNotIn))
                .append("\n");
        sb.append("    machineFamilyNotStartsWith: ")
                .append(toIndentedString(machineFamilyNotStartsWith))
                .append("\n");
        sb.append("    machineFamilyStartsWith: ")
                .append(toIndentedString(machineFamilyStartsWith))
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
        sb.append("    secureBootEnabled: ")
                .append(toIndentedString(secureBootEnabled))
                .append("\n");
        sb.append("    secureBootEnabledNot: ")
                .append(toIndentedString(secureBootEnabledNot))
                .append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    storageCluster: ").append(toIndentedString(storageCluster)).append("\n");
        sb.append("    syncVmTimeOnResume: ")
                .append(toIndentedString(syncVmTimeOnResume))
                .append("\n");
        sb.append("    syncVmTimeOnResumeNot: ")
                .append(toIndentedString(syncVmTimeOnResumeNot))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
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
        sb.append("    vmTemplate: ").append(toIndentedString(vmTemplate)).append("\n");
        sb.append("    vmVersion: ").append(toIndentedString(vmVersion)).append("\n");
        sb.append("    vmVersionContains: ")
                .append(toIndentedString(vmVersionContains))
                .append("\n");
        sb.append("    vmVersionEndsWith: ")
                .append(toIndentedString(vmVersionEndsWith))
                .append("\n");
        sb.append("    vmVersionGt: ").append(toIndentedString(vmVersionGt)).append("\n");
        sb.append("    vmVersionGte: ").append(toIndentedString(vmVersionGte)).append("\n");
        sb.append("    vmVersionIn: ").append(toIndentedString(vmVersionIn)).append("\n");
        sb.append("    vmVersionLt: ").append(toIndentedString(vmVersionLt)).append("\n");
        sb.append("    vmVersionLte: ").append(toIndentedString(vmVersionLte)).append("\n");
        sb.append("    vmVersionNot: ").append(toIndentedString(vmVersionNot)).append("\n");
        sb.append("    vmVersionNotContains: ")
                .append(toIndentedString(vmVersionNotContains))
                .append("\n");
        sb.append("    vmVersionNotEndsWith: ")
                .append(toIndentedString(vmVersionNotEndsWith))
                .append("\n");
        sb.append("    vmVersionNotIn: ").append(toIndentedString(vmVersionNotIn)).append("\n");
        sb.append("    vmVersionNotStartsWith: ")
                .append(toIndentedString(vmVersionNotStartsWith))
                .append("\n");
        sb.append("    vmVersionStartsWith: ")
                .append(toIndentedString(vmVersionStartsWith))
                .append("\n");
        sb.append("    vtpmEnabled: ").append(toIndentedString(vtpmEnabled)).append("\n");
        sb.append("    vtpmEnabledNot: ").append(toIndentedString(vtpmEnabledNot)).append("\n");
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

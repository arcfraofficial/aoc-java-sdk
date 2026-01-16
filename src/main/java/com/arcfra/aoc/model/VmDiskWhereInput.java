package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmDiskWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDiskWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmDiskWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmDiskWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmDiskWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_BOOT_GT = "boot_gt";

    @SerializedName(SERIALIZED_NAME_BOOT_GT)
    private Integer bootGt;

    public static final String SERIALIZED_NAME_BOOT_GTE = "boot_gte";

    @SerializedName(SERIALIZED_NAME_BOOT_GTE)
    private Integer bootGte;

    public static final String SERIALIZED_NAME_BOOT_IN = "boot_in";

    @SerializedName(SERIALIZED_NAME_BOOT_IN)
    private List<Integer> bootIn = null;

    public static final String SERIALIZED_NAME_BOOT_LT = "boot_lt";

    @SerializedName(SERIALIZED_NAME_BOOT_LT)
    private Integer bootLt;

    public static final String SERIALIZED_NAME_BOOT_LTE = "boot_lte";

    @SerializedName(SERIALIZED_NAME_BOOT_LTE)
    private Integer bootLte;

    public static final String SERIALIZED_NAME_BOOT_NOT = "boot_not";

    @SerializedName(SERIALIZED_NAME_BOOT_NOT)
    private Integer bootNot;

    public static final String SERIALIZED_NAME_BOOT_NOT_IN = "boot_not_in";

    @SerializedName(SERIALIZED_NAME_BOOT_NOT_IN)
    private List<Integer> bootNotIn = null;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_BUS_IN = "bus_in";

    @SerializedName(SERIALIZED_NAME_BUS_IN)
    private List<Bus> busIn = null;

    public static final String SERIALIZED_NAME_BUS_NOT = "bus_not";

    @SerializedName(SERIALIZED_NAME_BUS_NOT)
    private Bus busNot;

    public static final String SERIALIZED_NAME_BUS_NOT_IN = "bus_not_in";

    @SerializedName(SERIALIZED_NAME_BUS_NOT_IN)
    private List<Bus> busNotIn = null;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME = "cloud_init_image_name";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME)
    private String cloudInitImageName;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS =
            "cloud_init_image_name_contains";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS)
    private String cloudInitImageNameContains;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH =
            "cloud_init_image_name_ends_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH)
    private String cloudInitImageNameEndsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT =
            "cloud_init_image_name_gt";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT)
    private String cloudInitImageNameGt;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE =
            "cloud_init_image_name_gte";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE)
    private String cloudInitImageNameGte;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN =
            "cloud_init_image_name_in";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN)
    private List<String> cloudInitImageNameIn = null;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT =
            "cloud_init_image_name_lt";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT)
    private String cloudInitImageNameLt;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE =
            "cloud_init_image_name_lte";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE)
    private String cloudInitImageNameLte;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT =
            "cloud_init_image_name_not";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT)
    private String cloudInitImageNameNot;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS =
            "cloud_init_image_name_not_contains";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS)
    private String cloudInitImageNameNotContains;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH =
            "cloud_init_image_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH)
    private String cloudInitImageNameNotEndsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN =
            "cloud_init_image_name_not_in";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN)
    private List<String> cloudInitImageNameNotIn = null;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH =
            "cloud_init_image_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH)
    private String cloudInitImageNameNotStartsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH =
            "cloud_init_image_name_starts_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH)
    private String cloudInitImageNameStartsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH = "cloud_init_image_path";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH)
    private String cloudInitImagePath;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS =
            "cloud_init_image_path_contains";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS)
    private String cloudInitImagePathContains;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH =
            "cloud_init_image_path_ends_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH)
    private String cloudInitImagePathEndsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT =
            "cloud_init_image_path_gt";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT)
    private String cloudInitImagePathGt;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE =
            "cloud_init_image_path_gte";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE)
    private String cloudInitImagePathGte;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN =
            "cloud_init_image_path_in";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN)
    private List<String> cloudInitImagePathIn = null;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT =
            "cloud_init_image_path_lt";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT)
    private String cloudInitImagePathLt;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE =
            "cloud_init_image_path_lte";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE)
    private String cloudInitImagePathLte;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT =
            "cloud_init_image_path_not";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT)
    private String cloudInitImagePathNot;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS =
            "cloud_init_image_path_not_contains";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS)
    private String cloudInitImagePathNotContains;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH =
            "cloud_init_image_path_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH)
    private String cloudInitImagePathNotEndsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN =
            "cloud_init_image_path_not_in";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN)
    private List<String> cloudInitImagePathNotIn = null;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH =
            "cloud_init_image_path_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH)
    private String cloudInitImagePathNotStartsWith;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH =
            "cloud_init_image_path_starts_with";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH)
    private String cloudInitImagePathStartsWith;

    public static final String SERIALIZED_NAME_DEVICE = "device";

    @SerializedName(SERIALIZED_NAME_DEVICE)
    private String device;

    public static final String SERIALIZED_NAME_DEVICE_CONTAINS = "device_contains";

    @SerializedName(SERIALIZED_NAME_DEVICE_CONTAINS)
    private String deviceContains;

    public static final String SERIALIZED_NAME_DEVICE_ENDS_WITH = "device_ends_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_ENDS_WITH)
    private String deviceEndsWith;

    public static final String SERIALIZED_NAME_DEVICE_GT = "device_gt";

    @SerializedName(SERIALIZED_NAME_DEVICE_GT)
    private String deviceGt;

    public static final String SERIALIZED_NAME_DEVICE_GTE = "device_gte";

    @SerializedName(SERIALIZED_NAME_DEVICE_GTE)
    private String deviceGte;

    public static final String SERIALIZED_NAME_DEVICE_IN = "device_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_IN)
    private List<String> deviceIn = null;

    public static final String SERIALIZED_NAME_DEVICE_LT = "device_lt";

    @SerializedName(SERIALIZED_NAME_DEVICE_LT)
    private String deviceLt;

    public static final String SERIALIZED_NAME_DEVICE_LTE = "device_lte";

    @SerializedName(SERIALIZED_NAME_DEVICE_LTE)
    private String deviceLte;

    public static final String SERIALIZED_NAME_DEVICE_NOT = "device_not";

    @SerializedName(SERIALIZED_NAME_DEVICE_NOT)
    private String deviceNot;

    public static final String SERIALIZED_NAME_DEVICE_NOT_CONTAINS = "device_not_contains";

    @SerializedName(SERIALIZED_NAME_DEVICE_NOT_CONTAINS)
    private String deviceNotContains;

    public static final String SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH = "device_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH)
    private String deviceNotEndsWith;

    public static final String SERIALIZED_NAME_DEVICE_NOT_IN = "device_not_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_NOT_IN)
    private List<String> deviceNotIn = null;

    public static final String SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH = "device_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH)
    private String deviceNotStartsWith;

    public static final String SERIALIZED_NAME_DEVICE_STARTS_WITH = "device_starts_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_STARTS_WITH)
    private String deviceStartsWith;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_DISABLED_NOT = "disabled_not";

    @SerializedName(SERIALIZED_NAME_DISABLED_NOT)
    private Boolean disabledNot;

    public static final String SERIALIZED_NAME_ELF_IMAGE = "elf_image";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE)
    private ElfImageWhereInput elfImage;

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

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private Integer key;

    public static final String SERIALIZED_NAME_KEY_GT = "key_gt";

    @SerializedName(SERIALIZED_NAME_KEY_GT)
    private Integer keyGt;

    public static final String SERIALIZED_NAME_KEY_GTE = "key_gte";

    @SerializedName(SERIALIZED_NAME_KEY_GTE)
    private Integer keyGte;

    public static final String SERIALIZED_NAME_KEY_IN = "key_in";

    @SerializedName(SERIALIZED_NAME_KEY_IN)
    private List<Integer> keyIn = null;

    public static final String SERIALIZED_NAME_KEY_LT = "key_lt";

    @SerializedName(SERIALIZED_NAME_KEY_LT)
    private Integer keyLt;

    public static final String SERIALIZED_NAME_KEY_LTE = "key_lte";

    @SerializedName(SERIALIZED_NAME_KEY_LTE)
    private Integer keyLte;

    public static final String SERIALIZED_NAME_KEY_NOT = "key_not";

    @SerializedName(SERIALIZED_NAME_KEY_NOT)
    private Integer keyNot;

    public static final String SERIALIZED_NAME_KEY_NOT_IN = "key_not_in";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_IN)
    private List<Integer> keyNotIn = null;

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

    public static final String SERIALIZED_NAME_SVT_IMAGE = "svt_image";

    @SerializedName(SERIALIZED_NAME_SVT_IMAGE)
    private SvtImageWhereInput svtImage;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmDiskType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<VmDiskType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private VmDiskType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<VmDiskType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH = "unsafe_image_path";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH)
    private String unsafeImagePath;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS =
            "unsafe_image_path_contains";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS)
    private String unsafeImagePathContains;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH =
            "unsafe_image_path_ends_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH)
    private String unsafeImagePathEndsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT = "unsafe_image_path_gt";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT)
    private String unsafeImagePathGt;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE = "unsafe_image_path_gte";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE)
    private String unsafeImagePathGte;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN = "unsafe_image_path_in";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN)
    private List<String> unsafeImagePathIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT = "unsafe_image_path_lt";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT)
    private String unsafeImagePathLt;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE = "unsafe_image_path_lte";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE)
    private String unsafeImagePathLte;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT = "unsafe_image_path_not";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT)
    private String unsafeImagePathNot;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS =
            "unsafe_image_path_not_contains";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS)
    private String unsafeImagePathNotContains;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH =
            "unsafe_image_path_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH)
    private String unsafeImagePathNotEndsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN =
            "unsafe_image_path_not_in";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN)
    private List<String> unsafeImagePathNotIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH =
            "unsafe_image_path_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH)
    private String unsafeImagePathNotStartsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH =
            "unsafe_image_path_starts_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH)
    private String unsafeImagePathStartsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID = "unsafe_image_uuid";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID)
    private String unsafeImageUuid;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS =
            "unsafe_image_uuid_contains";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS)
    private String unsafeImageUuidContains;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH =
            "unsafe_image_uuid_ends_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH)
    private String unsafeImageUuidEndsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT = "unsafe_image_uuid_gt";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT)
    private String unsafeImageUuidGt;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE = "unsafe_image_uuid_gte";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE)
    private String unsafeImageUuidGte;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN = "unsafe_image_uuid_in";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN)
    private List<String> unsafeImageUuidIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT = "unsafe_image_uuid_lt";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT)
    private String unsafeImageUuidLt;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE = "unsafe_image_uuid_lte";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE)
    private String unsafeImageUuidLte;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT = "unsafe_image_uuid_not";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT)
    private String unsafeImageUuidNot;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS =
            "unsafe_image_uuid_not_contains";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS)
    private String unsafeImageUuidNotContains;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH =
            "unsafe_image_uuid_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH)
    private String unsafeImageUuidNotEndsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN =
            "unsafe_image_uuid_not_in";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN)
    private List<String> unsafeImageUuidNotIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH =
            "unsafe_image_uuid_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH)
    private String unsafeImageUuidNotStartsWith;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH =
            "unsafe_image_uuid_starts_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH)
    private String unsafeImageUuidStartsWith;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION = "unsafe_provision";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION)
    private String unsafeProvision;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS =
            "unsafe_provision_contains";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS)
    private String unsafeProvisionContains;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH =
            "unsafe_provision_ends_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH)
    private String unsafeProvisionEndsWith;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_GT = "unsafe_provision_gt";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_GT)
    private String unsafeProvisionGt;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_GTE = "unsafe_provision_gte";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_GTE)
    private String unsafeProvisionGte;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_IN = "unsafe_provision_in";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_IN)
    private List<String> unsafeProvisionIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_LT = "unsafe_provision_lt";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_LT)
    private String unsafeProvisionLt;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_LTE = "unsafe_provision_lte";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_LTE)
    private String unsafeProvisionLte;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_NOT = "unsafe_provision_not";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_NOT)
    private String unsafeProvisionNot;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS =
            "unsafe_provision_not_contains";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS)
    private String unsafeProvisionNotContains;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH =
            "unsafe_provision_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH)
    private String unsafeProvisionNotEndsWith;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN = "unsafe_provision_not_in";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN)
    private List<String> unsafeProvisionNotIn = null;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH =
            "unsafe_provision_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH)
    private String unsafeProvisionNotStartsWith;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH =
            "unsafe_provision_starts_with";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH)
    private String unsafeProvisionStartsWith;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME)
    private VmVolumeWhereInput vmVolume;

    public VmDiskWhereInput() {}

    public VmDiskWhereInput AND(List<VmDiskWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmDiskWhereInput addANDItem(VmDiskWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmDiskWhereInput>();
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
    public List<VmDiskWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmDiskWhereInput> AND) {
        this.AND = AND;
    }

    public VmDiskWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmDiskWhereInput AND_ExplictlyNonNull() {
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

    public VmDiskWhereInput NOT(List<VmDiskWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmDiskWhereInput addNOTItem(VmDiskWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmDiskWhereInput>();
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
    public List<VmDiskWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmDiskWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmDiskWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmDiskWhereInput NOT_ExplictlyNonNull() {
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

    public VmDiskWhereInput OR(List<VmDiskWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmDiskWhereInput addORItem(VmDiskWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmDiskWhereInput>();
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
    public List<VmDiskWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmDiskWhereInput> OR) {
        this.OR = OR;
    }

    public VmDiskWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmDiskWhereInput OR_ExplictlyNonNull() {
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

    public VmDiskWhereInput boot(Integer boot) {

        this.boot = boot;
        return this;
    }

    /**
     * Get boot
     *
     * @return boot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBoot() {
        return boot;
    }

    public void setBoot(Integer boot) {
        this.boot = boot;
    }

    public VmDiskWhereInput boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public VmDiskWhereInput boot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        return this;
    }

    public void setBoot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        }
    }

    public boolean getBoot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT);
    }

    public VmDiskWhereInput bootGt(Integer bootGt) {

        this.bootGt = bootGt;
        return this;
    }

    /**
     * Get bootGt
     *
     * @return bootGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBootGt() {
        return bootGt;
    }

    public void setBootGt(Integer bootGt) {
        this.bootGt = bootGt;
    }

    public VmDiskWhereInput bootGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_GT);
        return this;
    }

    public VmDiskWhereInput bootGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_GT);
        return this;
    }

    public void setBootGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_GT);
        }
    }

    public boolean getBootGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_GT);
    }

    public VmDiskWhereInput bootGte(Integer bootGte) {

        this.bootGte = bootGte;
        return this;
    }

    /**
     * Get bootGte
     *
     * @return bootGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBootGte() {
        return bootGte;
    }

    public void setBootGte(Integer bootGte) {
        this.bootGte = bootGte;
    }

    public VmDiskWhereInput bootGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_GTE);
        return this;
    }

    public VmDiskWhereInput bootGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_GTE);
        return this;
    }

    public void setBootGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_GTE);
        }
    }

    public boolean getBootGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_GTE);
    }

    public VmDiskWhereInput bootIn(List<Integer> bootIn) {

        this.bootIn = bootIn;
        return this;
    }

    public VmDiskWhereInput addBootInItem(Integer bootInItem) {
        if (this.bootIn == null) {
            this.bootIn = new ArrayList<Integer>();
        }
        this.bootIn.add(bootInItem);
        return this;
    }

    /**
     * Get bootIn
     *
     * @return bootIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getBootIn() {
        return bootIn;
    }

    public void setBootIn(List<Integer> bootIn) {
        this.bootIn = bootIn;
    }

    public VmDiskWhereInput bootIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_IN);
        return this;
    }

    public VmDiskWhereInput bootIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_IN);
        return this;
    }

    public void setBootIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_IN);
        }
    }

    public boolean getBootIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_IN);
    }

    public VmDiskWhereInput bootLt(Integer bootLt) {

        this.bootLt = bootLt;
        return this;
    }

    /**
     * Get bootLt
     *
     * @return bootLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBootLt() {
        return bootLt;
    }

    public void setBootLt(Integer bootLt) {
        this.bootLt = bootLt;
    }

    public VmDiskWhereInput bootLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_LT);
        return this;
    }

    public VmDiskWhereInput bootLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_LT);
        return this;
    }

    public void setBootLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_LT);
        }
    }

    public boolean getBootLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_LT);
    }

    public VmDiskWhereInput bootLte(Integer bootLte) {

        this.bootLte = bootLte;
        return this;
    }

    /**
     * Get bootLte
     *
     * @return bootLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBootLte() {
        return bootLte;
    }

    public void setBootLte(Integer bootLte) {
        this.bootLte = bootLte;
    }

    public VmDiskWhereInput bootLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_LTE);
        return this;
    }

    public VmDiskWhereInput bootLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_LTE);
        return this;
    }

    public void setBootLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_LTE);
        }
    }

    public boolean getBootLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_LTE);
    }

    public VmDiskWhereInput bootNot(Integer bootNot) {

        this.bootNot = bootNot;
        return this;
    }

    /**
     * Get bootNot
     *
     * @return bootNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBootNot() {
        return bootNot;
    }

    public void setBootNot(Integer bootNot) {
        this.bootNot = bootNot;
    }

    public VmDiskWhereInput bootNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_NOT);
        return this;
    }

    public VmDiskWhereInput bootNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_NOT);
        return this;
    }

    public void setBootNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_NOT);
        }
    }

    public boolean getBootNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_NOT);
    }

    public VmDiskWhereInput bootNotIn(List<Integer> bootNotIn) {

        this.bootNotIn = bootNotIn;
        return this;
    }

    public VmDiskWhereInput addBootNotInItem(Integer bootNotInItem) {
        if (this.bootNotIn == null) {
            this.bootNotIn = new ArrayList<Integer>();
        }
        this.bootNotIn.add(bootNotInItem);
        return this;
    }

    /**
     * Get bootNotIn
     *
     * @return bootNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getBootNotIn() {
        return bootNotIn;
    }

    public void setBootNotIn(List<Integer> bootNotIn) {
        this.bootNotIn = bootNotIn;
    }

    public VmDiskWhereInput bootNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_NOT_IN);
        return this;
    }

    public VmDiskWhereInput bootNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT_NOT_IN);
        return this;
    }

    public void setBootNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT_NOT_IN);
        }
    }

    public boolean getBootNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT_NOT_IN);
    }

    public VmDiskWhereInput bus(Bus bus) {

        this.bus = bus;
        return this;
    }

    /**
     * Get bus
     *
     * @return bus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public VmDiskWhereInput bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public VmDiskWhereInput bus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS);
        return this;
    }

    public void setBus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS);
        }
    }

    public boolean getBus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS);
    }

    public VmDiskWhereInput busIn(List<Bus> busIn) {

        this.busIn = busIn;
        return this;
    }

    public VmDiskWhereInput addBusInItem(Bus busInItem) {
        if (this.busIn == null) {
            this.busIn = new ArrayList<Bus>();
        }
        this.busIn.add(busInItem);
        return this;
    }

    /**
     * Get busIn
     *
     * @return busIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Bus> getBusIn() {
        return busIn;
    }

    public void setBusIn(List<Bus> busIn) {
        this.busIn = busIn;
    }

    public VmDiskWhereInput busIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_IN);
        return this;
    }

    public VmDiskWhereInput busIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_IN);
        return this;
    }

    public void setBusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_IN);
        }
    }

    public boolean getBusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_IN);
    }

    public VmDiskWhereInput busNot(Bus busNot) {

        this.busNot = busNot;
        return this;
    }

    /**
     * Get busNot
     *
     * @return busNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Bus getBusNot() {
        return busNot;
    }

    public void setBusNot(Bus busNot) {
        this.busNot = busNot;
    }

    public VmDiskWhereInput busNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT);
        return this;
    }

    public VmDiskWhereInput busNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT);
        return this;
    }

    public void setBusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT);
        }
    }

    public boolean getBusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_NOT);
    }

    public VmDiskWhereInput busNotIn(List<Bus> busNotIn) {

        this.busNotIn = busNotIn;
        return this;
    }

    public VmDiskWhereInput addBusNotInItem(Bus busNotInItem) {
        if (this.busNotIn == null) {
            this.busNotIn = new ArrayList<Bus>();
        }
        this.busNotIn.add(busNotInItem);
        return this;
    }

    /**
     * Get busNotIn
     *
     * @return busNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Bus> getBusNotIn() {
        return busNotIn;
    }

    public void setBusNotIn(List<Bus> busNotIn) {
        this.busNotIn = busNotIn;
    }

    public VmDiskWhereInput busNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_IN);
        return this;
    }

    public VmDiskWhereInput busNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_IN);
        return this;
    }

    public void setBusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_IN);
        }
    }

    public boolean getBusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_NOT_IN);
    }

    public VmDiskWhereInput cloudInitImageName(String cloudInitImageName) {

        this.cloudInitImageName = cloudInitImageName;
        return this;
    }

    /**
     * Get cloudInitImageName
     *
     * @return cloudInitImageName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageName() {
        return cloudInitImageName;
    }

    public void setCloudInitImageName(String cloudInitImageName) {
        this.cloudInitImageName = cloudInitImageName;
    }

    public VmDiskWhereInput cloudInitImageName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        return this;
    }

    public VmDiskWhereInput cloudInitImageName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        return this;
    }

    public void setCloudInitImageName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        }
    }

    public boolean getCloudInitImageName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
    }

    public VmDiskWhereInput cloudInitImageNameContains(String cloudInitImageNameContains) {

        this.cloudInitImageNameContains = cloudInitImageNameContains;
        return this;
    }

    /**
     * Get cloudInitImageNameContains
     *
     * @return cloudInitImageNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameContains() {
        return cloudInitImageNameContains;
    }

    public void setCloudInitImageNameContains(String cloudInitImageNameContains) {
        this.cloudInitImageNameContains = cloudInitImageNameContains;
    }

    public VmDiskWhereInput cloudInitImageNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS);
        return this;
    }

    public void setCloudInitImageNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS);
        }
    }

    public boolean getCloudInitImageNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_CONTAINS);
    }

    public VmDiskWhereInput cloudInitImageNameEndsWith(String cloudInitImageNameEndsWith) {

        this.cloudInitImageNameEndsWith = cloudInitImageNameEndsWith;
        return this;
    }

    /**
     * Get cloudInitImageNameEndsWith
     *
     * @return cloudInitImageNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameEndsWith() {
        return cloudInitImageNameEndsWith;
    }

    public void setCloudInitImageNameEndsWith(String cloudInitImageNameEndsWith) {
        this.cloudInitImageNameEndsWith = cloudInitImageNameEndsWith;
    }

    public VmDiskWhereInput cloudInitImageNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH);
        return this;
    }

    public void setCloudInitImageNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH);
        }
    }

    public boolean getCloudInitImageNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_ENDS_WITH);
    }

    public VmDiskWhereInput cloudInitImageNameGt(String cloudInitImageNameGt) {

        this.cloudInitImageNameGt = cloudInitImageNameGt;
        return this;
    }

    /**
     * Get cloudInitImageNameGt
     *
     * @return cloudInitImageNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameGt() {
        return cloudInitImageNameGt;
    }

    public void setCloudInitImageNameGt(String cloudInitImageNameGt) {
        this.cloudInitImageNameGt = cloudInitImageNameGt;
    }

    public VmDiskWhereInput cloudInitImageNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT);
        return this;
    }

    public void setCloudInitImageNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT);
        }
    }

    public boolean getCloudInitImageNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GT);
    }

    public VmDiskWhereInput cloudInitImageNameGte(String cloudInitImageNameGte) {

        this.cloudInitImageNameGte = cloudInitImageNameGte;
        return this;
    }

    /**
     * Get cloudInitImageNameGte
     *
     * @return cloudInitImageNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameGte() {
        return cloudInitImageNameGte;
    }

    public void setCloudInitImageNameGte(String cloudInitImageNameGte) {
        this.cloudInitImageNameGte = cloudInitImageNameGte;
    }

    public VmDiskWhereInput cloudInitImageNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE);
        return this;
    }

    public void setCloudInitImageNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE);
        }
    }

    public boolean getCloudInitImageNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_GTE);
    }

    public VmDiskWhereInput cloudInitImageNameIn(List<String> cloudInitImageNameIn) {

        this.cloudInitImageNameIn = cloudInitImageNameIn;
        return this;
    }

    public VmDiskWhereInput addCloudInitImageNameInItem(String cloudInitImageNameInItem) {
        if (this.cloudInitImageNameIn == null) {
            this.cloudInitImageNameIn = new ArrayList<String>();
        }
        this.cloudInitImageNameIn.add(cloudInitImageNameInItem);
        return this;
    }

    /**
     * Get cloudInitImageNameIn
     *
     * @return cloudInitImageNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCloudInitImageNameIn() {
        return cloudInitImageNameIn;
    }

    public void setCloudInitImageNameIn(List<String> cloudInitImageNameIn) {
        this.cloudInitImageNameIn = cloudInitImageNameIn;
    }

    public VmDiskWhereInput cloudInitImageNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN);
        return this;
    }

    public void setCloudInitImageNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN);
        }
    }

    public boolean getCloudInitImageNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_IN);
    }

    public VmDiskWhereInput cloudInitImageNameLt(String cloudInitImageNameLt) {

        this.cloudInitImageNameLt = cloudInitImageNameLt;
        return this;
    }

    /**
     * Get cloudInitImageNameLt
     *
     * @return cloudInitImageNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameLt() {
        return cloudInitImageNameLt;
    }

    public void setCloudInitImageNameLt(String cloudInitImageNameLt) {
        this.cloudInitImageNameLt = cloudInitImageNameLt;
    }

    public VmDiskWhereInput cloudInitImageNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT);
        return this;
    }

    public void setCloudInitImageNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT);
        }
    }

    public boolean getCloudInitImageNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LT);
    }

    public VmDiskWhereInput cloudInitImageNameLte(String cloudInitImageNameLte) {

        this.cloudInitImageNameLte = cloudInitImageNameLte;
        return this;
    }

    /**
     * Get cloudInitImageNameLte
     *
     * @return cloudInitImageNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameLte() {
        return cloudInitImageNameLte;
    }

    public void setCloudInitImageNameLte(String cloudInitImageNameLte) {
        this.cloudInitImageNameLte = cloudInitImageNameLte;
    }

    public VmDiskWhereInput cloudInitImageNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE);
        return this;
    }

    public void setCloudInitImageNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE);
        }
    }

    public boolean getCloudInitImageNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_LTE);
    }

    public VmDiskWhereInput cloudInitImageNameNot(String cloudInitImageNameNot) {

        this.cloudInitImageNameNot = cloudInitImageNameNot;
        return this;
    }

    /**
     * Get cloudInitImageNameNot
     *
     * @return cloudInitImageNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameNot() {
        return cloudInitImageNameNot;
    }

    public void setCloudInitImageNameNot(String cloudInitImageNameNot) {
        this.cloudInitImageNameNot = cloudInitImageNameNot;
    }

    public VmDiskWhereInput cloudInitImageNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT);
        return this;
    }

    public void setCloudInitImageNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT);
        }
    }

    public boolean getCloudInitImageNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT);
    }

    public VmDiskWhereInput cloudInitImageNameNotContains(String cloudInitImageNameNotContains) {

        this.cloudInitImageNameNotContains = cloudInitImageNameNotContains;
        return this;
    }

    /**
     * Get cloudInitImageNameNotContains
     *
     * @return cloudInitImageNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameNotContains() {
        return cloudInitImageNameNotContains;
    }

    public void setCloudInitImageNameNotContains(String cloudInitImageNameNotContains) {
        this.cloudInitImageNameNotContains = cloudInitImageNameNotContains;
    }

    public VmDiskWhereInput cloudInitImageNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS);
        return this;
    }

    public void setCloudInitImageNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS);
        }
    }

    public boolean getCloudInitImageNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_CONTAINS);
    }

    public VmDiskWhereInput cloudInitImageNameNotEndsWith(String cloudInitImageNameNotEndsWith) {

        this.cloudInitImageNameNotEndsWith = cloudInitImageNameNotEndsWith;
        return this;
    }

    /**
     * Get cloudInitImageNameNotEndsWith
     *
     * @return cloudInitImageNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameNotEndsWith() {
        return cloudInitImageNameNotEndsWith;
    }

    public void setCloudInitImageNameNotEndsWith(String cloudInitImageNameNotEndsWith) {
        this.cloudInitImageNameNotEndsWith = cloudInitImageNameNotEndsWith;
    }

    public VmDiskWhereInput cloudInitImageNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setCloudInitImageNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getCloudInitImageNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_ENDS_WITH);
    }

    public VmDiskWhereInput cloudInitImageNameNotIn(List<String> cloudInitImageNameNotIn) {

        this.cloudInitImageNameNotIn = cloudInitImageNameNotIn;
        return this;
    }

    public VmDiskWhereInput addCloudInitImageNameNotInItem(String cloudInitImageNameNotInItem) {
        if (this.cloudInitImageNameNotIn == null) {
            this.cloudInitImageNameNotIn = new ArrayList<String>();
        }
        this.cloudInitImageNameNotIn.add(cloudInitImageNameNotInItem);
        return this;
    }

    /**
     * Get cloudInitImageNameNotIn
     *
     * @return cloudInitImageNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCloudInitImageNameNotIn() {
        return cloudInitImageNameNotIn;
    }

    public void setCloudInitImageNameNotIn(List<String> cloudInitImageNameNotIn) {
        this.cloudInitImageNameNotIn = cloudInitImageNameNotIn;
    }

    public VmDiskWhereInput cloudInitImageNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN);
        return this;
    }

    public void setCloudInitImageNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN);
        }
    }

    public boolean getCloudInitImageNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_IN);
    }

    public VmDiskWhereInput cloudInitImageNameNotStartsWith(
            String cloudInitImageNameNotStartsWith) {

        this.cloudInitImageNameNotStartsWith = cloudInitImageNameNotStartsWith;
        return this;
    }

    /**
     * Get cloudInitImageNameNotStartsWith
     *
     * @return cloudInitImageNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameNotStartsWith() {
        return cloudInitImageNameNotStartsWith;
    }

    public void setCloudInitImageNameNotStartsWith(String cloudInitImageNameNotStartsWith) {
        this.cloudInitImageNameNotStartsWith = cloudInitImageNameNotStartsWith;
    }

    public VmDiskWhereInput cloudInitImageNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setCloudInitImageNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getCloudInitImageNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_NOT_STARTS_WITH);
    }

    public VmDiskWhereInput cloudInitImageNameStartsWith(String cloudInitImageNameStartsWith) {

        this.cloudInitImageNameStartsWith = cloudInitImageNameStartsWith;
        return this;
    }

    /**
     * Get cloudInitImageNameStartsWith
     *
     * @return cloudInitImageNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageNameStartsWith() {
        return cloudInitImageNameStartsWith;
    }

    public void setCloudInitImageNameStartsWith(String cloudInitImageNameStartsWith) {
        this.cloudInitImageNameStartsWith = cloudInitImageNameStartsWith;
    }

    public VmDiskWhereInput cloudInitImageNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImageNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH);
        return this;
    }

    public void setCloudInitImageNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH);
        }
    }

    public boolean getCloudInitImageNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME_STARTS_WITH);
    }

    public VmDiskWhereInput cloudInitImagePath(String cloudInitImagePath) {

        this.cloudInitImagePath = cloudInitImagePath;
        return this;
    }

    /**
     * Get cloudInitImagePath
     *
     * @return cloudInitImagePath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePath() {
        return cloudInitImagePath;
    }

    public void setCloudInitImagePath(String cloudInitImagePath) {
        this.cloudInitImagePath = cloudInitImagePath;
    }

    public VmDiskWhereInput cloudInitImagePath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        return this;
    }

    public void setCloudInitImagePath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        }
    }

    public boolean getCloudInitImagePath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
    }

    public VmDiskWhereInput cloudInitImagePathContains(String cloudInitImagePathContains) {

        this.cloudInitImagePathContains = cloudInitImagePathContains;
        return this;
    }

    /**
     * Get cloudInitImagePathContains
     *
     * @return cloudInitImagePathContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathContains() {
        return cloudInitImagePathContains;
    }

    public void setCloudInitImagePathContains(String cloudInitImagePathContains) {
        this.cloudInitImagePathContains = cloudInitImagePathContains;
    }

    public VmDiskWhereInput cloudInitImagePathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS);
        return this;
    }

    public void setCloudInitImagePathContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS);
        }
    }

    public boolean getCloudInitImagePathContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_CONTAINS);
    }

    public VmDiskWhereInput cloudInitImagePathEndsWith(String cloudInitImagePathEndsWith) {

        this.cloudInitImagePathEndsWith = cloudInitImagePathEndsWith;
        return this;
    }

    /**
     * Get cloudInitImagePathEndsWith
     *
     * @return cloudInitImagePathEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathEndsWith() {
        return cloudInitImagePathEndsWith;
    }

    public void setCloudInitImagePathEndsWith(String cloudInitImagePathEndsWith) {
        this.cloudInitImagePathEndsWith = cloudInitImagePathEndsWith;
    }

    public VmDiskWhereInput cloudInitImagePathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH);
        return this;
    }

    public void setCloudInitImagePathEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH);
        }
    }

    public boolean getCloudInitImagePathEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_ENDS_WITH);
    }

    public VmDiskWhereInput cloudInitImagePathGt(String cloudInitImagePathGt) {

        this.cloudInitImagePathGt = cloudInitImagePathGt;
        return this;
    }

    /**
     * Get cloudInitImagePathGt
     *
     * @return cloudInitImagePathGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathGt() {
        return cloudInitImagePathGt;
    }

    public void setCloudInitImagePathGt(String cloudInitImagePathGt) {
        this.cloudInitImagePathGt = cloudInitImagePathGt;
    }

    public VmDiskWhereInput cloudInitImagePathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT);
        return this;
    }

    public void setCloudInitImagePathGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT);
        }
    }

    public boolean getCloudInitImagePathGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GT);
    }

    public VmDiskWhereInput cloudInitImagePathGte(String cloudInitImagePathGte) {

        this.cloudInitImagePathGte = cloudInitImagePathGte;
        return this;
    }

    /**
     * Get cloudInitImagePathGte
     *
     * @return cloudInitImagePathGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathGte() {
        return cloudInitImagePathGte;
    }

    public void setCloudInitImagePathGte(String cloudInitImagePathGte) {
        this.cloudInitImagePathGte = cloudInitImagePathGte;
    }

    public VmDiskWhereInput cloudInitImagePathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE);
        return this;
    }

    public void setCloudInitImagePathGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE);
        }
    }

    public boolean getCloudInitImagePathGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_GTE);
    }

    public VmDiskWhereInput cloudInitImagePathIn(List<String> cloudInitImagePathIn) {

        this.cloudInitImagePathIn = cloudInitImagePathIn;
        return this;
    }

    public VmDiskWhereInput addCloudInitImagePathInItem(String cloudInitImagePathInItem) {
        if (this.cloudInitImagePathIn == null) {
            this.cloudInitImagePathIn = new ArrayList<String>();
        }
        this.cloudInitImagePathIn.add(cloudInitImagePathInItem);
        return this;
    }

    /**
     * Get cloudInitImagePathIn
     *
     * @return cloudInitImagePathIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCloudInitImagePathIn() {
        return cloudInitImagePathIn;
    }

    public void setCloudInitImagePathIn(List<String> cloudInitImagePathIn) {
        this.cloudInitImagePathIn = cloudInitImagePathIn;
    }

    public VmDiskWhereInput cloudInitImagePathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN);
        return this;
    }

    public void setCloudInitImagePathIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN);
        }
    }

    public boolean getCloudInitImagePathIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_IN);
    }

    public VmDiskWhereInput cloudInitImagePathLt(String cloudInitImagePathLt) {

        this.cloudInitImagePathLt = cloudInitImagePathLt;
        return this;
    }

    /**
     * Get cloudInitImagePathLt
     *
     * @return cloudInitImagePathLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathLt() {
        return cloudInitImagePathLt;
    }

    public void setCloudInitImagePathLt(String cloudInitImagePathLt) {
        this.cloudInitImagePathLt = cloudInitImagePathLt;
    }

    public VmDiskWhereInput cloudInitImagePathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT);
        return this;
    }

    public void setCloudInitImagePathLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT);
        }
    }

    public boolean getCloudInitImagePathLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LT);
    }

    public VmDiskWhereInput cloudInitImagePathLte(String cloudInitImagePathLte) {

        this.cloudInitImagePathLte = cloudInitImagePathLte;
        return this;
    }

    /**
     * Get cloudInitImagePathLte
     *
     * @return cloudInitImagePathLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathLte() {
        return cloudInitImagePathLte;
    }

    public void setCloudInitImagePathLte(String cloudInitImagePathLte) {
        this.cloudInitImagePathLte = cloudInitImagePathLte;
    }

    public VmDiskWhereInput cloudInitImagePathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE);
        return this;
    }

    public void setCloudInitImagePathLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE);
        }
    }

    public boolean getCloudInitImagePathLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_LTE);
    }

    public VmDiskWhereInput cloudInitImagePathNot(String cloudInitImagePathNot) {

        this.cloudInitImagePathNot = cloudInitImagePathNot;
        return this;
    }

    /**
     * Get cloudInitImagePathNot
     *
     * @return cloudInitImagePathNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathNot() {
        return cloudInitImagePathNot;
    }

    public void setCloudInitImagePathNot(String cloudInitImagePathNot) {
        this.cloudInitImagePathNot = cloudInitImagePathNot;
    }

    public VmDiskWhereInput cloudInitImagePathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT);
        return this;
    }

    public void setCloudInitImagePathNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT);
        }
    }

    public boolean getCloudInitImagePathNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT);
    }

    public VmDiskWhereInput cloudInitImagePathNotContains(String cloudInitImagePathNotContains) {

        this.cloudInitImagePathNotContains = cloudInitImagePathNotContains;
        return this;
    }

    /**
     * Get cloudInitImagePathNotContains
     *
     * @return cloudInitImagePathNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathNotContains() {
        return cloudInitImagePathNotContains;
    }

    public void setCloudInitImagePathNotContains(String cloudInitImagePathNotContains) {
        this.cloudInitImagePathNotContains = cloudInitImagePathNotContains;
    }

    public VmDiskWhereInput cloudInitImagePathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS);
        return this;
    }

    public void setCloudInitImagePathNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS);
        }
    }

    public boolean getCloudInitImagePathNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_CONTAINS);
    }

    public VmDiskWhereInput cloudInitImagePathNotEndsWith(String cloudInitImagePathNotEndsWith) {

        this.cloudInitImagePathNotEndsWith = cloudInitImagePathNotEndsWith;
        return this;
    }

    /**
     * Get cloudInitImagePathNotEndsWith
     *
     * @return cloudInitImagePathNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathNotEndsWith() {
        return cloudInitImagePathNotEndsWith;
    }

    public void setCloudInitImagePathNotEndsWith(String cloudInitImagePathNotEndsWith) {
        this.cloudInitImagePathNotEndsWith = cloudInitImagePathNotEndsWith;
    }

    public VmDiskWhereInput cloudInitImagePathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH);
        return this;
    }

    public void setCloudInitImagePathNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH);
        }
    }

    public boolean getCloudInitImagePathNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_ENDS_WITH);
    }

    public VmDiskWhereInput cloudInitImagePathNotIn(List<String> cloudInitImagePathNotIn) {

        this.cloudInitImagePathNotIn = cloudInitImagePathNotIn;
        return this;
    }

    public VmDiskWhereInput addCloudInitImagePathNotInItem(String cloudInitImagePathNotInItem) {
        if (this.cloudInitImagePathNotIn == null) {
            this.cloudInitImagePathNotIn = new ArrayList<String>();
        }
        this.cloudInitImagePathNotIn.add(cloudInitImagePathNotInItem);
        return this;
    }

    /**
     * Get cloudInitImagePathNotIn
     *
     * @return cloudInitImagePathNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCloudInitImagePathNotIn() {
        return cloudInitImagePathNotIn;
    }

    public void setCloudInitImagePathNotIn(List<String> cloudInitImagePathNotIn) {
        this.cloudInitImagePathNotIn = cloudInitImagePathNotIn;
    }

    public VmDiskWhereInput cloudInitImagePathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN);
        return this;
    }

    public void setCloudInitImagePathNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN);
        }
    }

    public boolean getCloudInitImagePathNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_IN);
    }

    public VmDiskWhereInput cloudInitImagePathNotStartsWith(
            String cloudInitImagePathNotStartsWith) {

        this.cloudInitImagePathNotStartsWith = cloudInitImagePathNotStartsWith;
        return this;
    }

    /**
     * Get cloudInitImagePathNotStartsWith
     *
     * @return cloudInitImagePathNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathNotStartsWith() {
        return cloudInitImagePathNotStartsWith;
    }

    public void setCloudInitImagePathNotStartsWith(String cloudInitImagePathNotStartsWith) {
        this.cloudInitImagePathNotStartsWith = cloudInitImagePathNotStartsWith;
    }

    public VmDiskWhereInput cloudInitImagePathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH);
        return this;
    }

    public void setCloudInitImagePathNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH);
        }
    }

    public boolean getCloudInitImagePathNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_NOT_STARTS_WITH);
    }

    public VmDiskWhereInput cloudInitImagePathStartsWith(String cloudInitImagePathStartsWith) {

        this.cloudInitImagePathStartsWith = cloudInitImagePathStartsWith;
        return this;
    }

    /**
     * Get cloudInitImagePathStartsWith
     *
     * @return cloudInitImagePathStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePathStartsWith() {
        return cloudInitImagePathStartsWith;
    }

    public void setCloudInitImagePathStartsWith(String cloudInitImagePathStartsWith) {
        this.cloudInitImagePathStartsWith = cloudInitImagePathStartsWith;
    }

    public VmDiskWhereInput cloudInitImagePathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput cloudInitImagePathStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH);
        return this;
    }

    public void setCloudInitImagePathStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH);
        }
    }

    public boolean getCloudInitImagePathStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH_STARTS_WITH);
    }

    public VmDiskWhereInput device(String device) {

        this.device = device;
        return this;
    }

    /**
     * Get device
     *
     * @return device
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public VmDiskWhereInput device_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE);
        return this;
    }

    public VmDiskWhereInput device_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE);
        return this;
    }

    public void setDevice_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE);
        }
    }

    public boolean getDevice_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE);
    }

    public VmDiskWhereInput deviceContains(String deviceContains) {

        this.deviceContains = deviceContains;
        return this;
    }

    /**
     * Get deviceContains
     *
     * @return deviceContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceContains() {
        return deviceContains;
    }

    public void setDeviceContains(String deviceContains) {
        this.deviceContains = deviceContains;
    }

    public VmDiskWhereInput deviceContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_CONTAINS);
        return this;
    }

    public VmDiskWhereInput deviceContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_CONTAINS);
        return this;
    }

    public void setDeviceContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_CONTAINS);
        }
    }

    public boolean getDeviceContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_CONTAINS);
    }

    public VmDiskWhereInput deviceEndsWith(String deviceEndsWith) {

        this.deviceEndsWith = deviceEndsWith;
        return this;
    }

    /**
     * Get deviceEndsWith
     *
     * @return deviceEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceEndsWith() {
        return deviceEndsWith;
    }

    public void setDeviceEndsWith(String deviceEndsWith) {
        this.deviceEndsWith = deviceEndsWith;
    }

    public VmDiskWhereInput deviceEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput deviceEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_ENDS_WITH);
        return this;
    }

    public void setDeviceEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_ENDS_WITH);
        }
    }

    public boolean getDeviceEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_ENDS_WITH);
    }

    public VmDiskWhereInput deviceGt(String deviceGt) {

        this.deviceGt = deviceGt;
        return this;
    }

    /**
     * Get deviceGt
     *
     * @return deviceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceGt() {
        return deviceGt;
    }

    public void setDeviceGt(String deviceGt) {
        this.deviceGt = deviceGt;
    }

    public VmDiskWhereInput deviceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_GT);
        return this;
    }

    public VmDiskWhereInput deviceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_GT);
        return this;
    }

    public void setDeviceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_GT);
        }
    }

    public boolean getDeviceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_GT);
    }

    public VmDiskWhereInput deviceGte(String deviceGte) {

        this.deviceGte = deviceGte;
        return this;
    }

    /**
     * Get deviceGte
     *
     * @return deviceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceGte() {
        return deviceGte;
    }

    public void setDeviceGte(String deviceGte) {
        this.deviceGte = deviceGte;
    }

    public VmDiskWhereInput deviceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_GTE);
        return this;
    }

    public VmDiskWhereInput deviceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_GTE);
        return this;
    }

    public void setDeviceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_GTE);
        }
    }

    public boolean getDeviceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_GTE);
    }

    public VmDiskWhereInput deviceIn(List<String> deviceIn) {

        this.deviceIn = deviceIn;
        return this;
    }

    public VmDiskWhereInput addDeviceInItem(String deviceInItem) {
        if (this.deviceIn == null) {
            this.deviceIn = new ArrayList<String>();
        }
        this.deviceIn.add(deviceInItem);
        return this;
    }

    /**
     * Get deviceIn
     *
     * @return deviceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeviceIn() {
        return deviceIn;
    }

    public void setDeviceIn(List<String> deviceIn) {
        this.deviceIn = deviceIn;
    }

    public VmDiskWhereInput deviceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_IN);
        return this;
    }

    public VmDiskWhereInput deviceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_IN);
        return this;
    }

    public void setDeviceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_IN);
        }
    }

    public boolean getDeviceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_IN);
    }

    public VmDiskWhereInput deviceLt(String deviceLt) {

        this.deviceLt = deviceLt;
        return this;
    }

    /**
     * Get deviceLt
     *
     * @return deviceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLt() {
        return deviceLt;
    }

    public void setDeviceLt(String deviceLt) {
        this.deviceLt = deviceLt;
    }

    public VmDiskWhereInput deviceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LT);
        return this;
    }

    public VmDiskWhereInput deviceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LT);
        return this;
    }

    public void setDeviceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LT);
        }
    }

    public boolean getDeviceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LT);
    }

    public VmDiskWhereInput deviceLte(String deviceLte) {

        this.deviceLte = deviceLte;
        return this;
    }

    /**
     * Get deviceLte
     *
     * @return deviceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceLte() {
        return deviceLte;
    }

    public void setDeviceLte(String deviceLte) {
        this.deviceLte = deviceLte;
    }

    public VmDiskWhereInput deviceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_LTE);
        return this;
    }

    public VmDiskWhereInput deviceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LTE);
        return this;
    }

    public void setDeviceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_LTE);
        }
    }

    public boolean getDeviceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_LTE);
    }

    public VmDiskWhereInput deviceNot(String deviceNot) {

        this.deviceNot = deviceNot;
        return this;
    }

    /**
     * Get deviceNot
     *
     * @return deviceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceNot() {
        return deviceNot;
    }

    public void setDeviceNot(String deviceNot) {
        this.deviceNot = deviceNot;
    }

    public VmDiskWhereInput deviceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT);
        return this;
    }

    public VmDiskWhereInput deviceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT);
        return this;
    }

    public void setDeviceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT);
        }
    }

    public boolean getDeviceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NOT);
    }

    public VmDiskWhereInput deviceNotContains(String deviceNotContains) {

        this.deviceNotContains = deviceNotContains;
        return this;
    }

    /**
     * Get deviceNotContains
     *
     * @return deviceNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceNotContains() {
        return deviceNotContains;
    }

    public void setDeviceNotContains(String deviceNotContains) {
        this.deviceNotContains = deviceNotContains;
    }

    public VmDiskWhereInput deviceNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput deviceNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_CONTAINS);
        return this;
    }

    public void setDeviceNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_CONTAINS);
        }
    }

    public boolean getDeviceNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NOT_CONTAINS);
    }

    public VmDiskWhereInput deviceNotEndsWith(String deviceNotEndsWith) {

        this.deviceNotEndsWith = deviceNotEndsWith;
        return this;
    }

    /**
     * Get deviceNotEndsWith
     *
     * @return deviceNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceNotEndsWith() {
        return deviceNotEndsWith;
    }

    public void setDeviceNotEndsWith(String deviceNotEndsWith) {
        this.deviceNotEndsWith = deviceNotEndsWith;
    }

    public VmDiskWhereInput deviceNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput deviceNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH);
        return this;
    }

    public void setDeviceNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH);
        }
    }

    public boolean getDeviceNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NOT_ENDS_WITH);
    }

    public VmDiskWhereInput deviceNotIn(List<String> deviceNotIn) {

        this.deviceNotIn = deviceNotIn;
        return this;
    }

    public VmDiskWhereInput addDeviceNotInItem(String deviceNotInItem) {
        if (this.deviceNotIn == null) {
            this.deviceNotIn = new ArrayList<String>();
        }
        this.deviceNotIn.add(deviceNotInItem);
        return this;
    }

    /**
     * Get deviceNotIn
     *
     * @return deviceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeviceNotIn() {
        return deviceNotIn;
    }

    public void setDeviceNotIn(List<String> deviceNotIn) {
        this.deviceNotIn = deviceNotIn;
    }

    public VmDiskWhereInput deviceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_IN);
        return this;
    }

    public VmDiskWhereInput deviceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_IN);
        return this;
    }

    public void setDeviceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_IN);
        }
    }

    public boolean getDeviceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NOT_IN);
    }

    public VmDiskWhereInput deviceNotStartsWith(String deviceNotStartsWith) {

        this.deviceNotStartsWith = deviceNotStartsWith;
        return this;
    }

    /**
     * Get deviceNotStartsWith
     *
     * @return deviceNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceNotStartsWith() {
        return deviceNotStartsWith;
    }

    public void setDeviceNotStartsWith(String deviceNotStartsWith) {
        this.deviceNotStartsWith = deviceNotStartsWith;
    }

    public VmDiskWhereInput deviceNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput deviceNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH);
        return this;
    }

    public void setDeviceNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH);
        }
    }

    public boolean getDeviceNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NOT_STARTS_WITH);
    }

    public VmDiskWhereInput deviceStartsWith(String deviceStartsWith) {

        this.deviceStartsWith = deviceStartsWith;
        return this;
    }

    /**
     * Get deviceStartsWith
     *
     * @return deviceStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceStartsWith() {
        return deviceStartsWith;
    }

    public void setDeviceStartsWith(String deviceStartsWith) {
        this.deviceStartsWith = deviceStartsWith;
    }

    public VmDiskWhereInput deviceStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput deviceStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STARTS_WITH);
        return this;
    }

    public void setDeviceStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STARTS_WITH);
        }
    }

    public boolean getDeviceStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_STARTS_WITH);
    }

    public VmDiskWhereInput disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public VmDiskWhereInput disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public VmDiskWhereInput disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public VmDiskWhereInput disabledNot(Boolean disabledNot) {

        this.disabledNot = disabledNot;
        return this;
    }

    /**
     * Get disabledNot
     *
     * @return disabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabledNot() {
        return disabledNot;
    }

    public void setDisabledNot(Boolean disabledNot) {
        this.disabledNot = disabledNot;
    }

    public VmDiskWhereInput disabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public VmDiskWhereInput disabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public void setDisabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED_NOT);
        }
    }

    public boolean getDisabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED_NOT);
    }

    public VmDiskWhereInput elfImage(ElfImageWhereInput elfImage) {

        this.elfImage = elfImage;
        return this;
    }

    /**
     * Get elfImage
     *
     * @return elfImage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfImageWhereInput getElfImage() {
        return elfImage;
    }

    public void setElfImage(ElfImageWhereInput elfImage) {
        this.elfImage = elfImage;
    }

    public VmDiskWhereInput elfImage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE);
        return this;
    }

    public VmDiskWhereInput elfImage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE);
        return this;
    }

    public void setElfImage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE);
        }
    }

    public boolean getElfImage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE);
    }

    public VmDiskWhereInput id(String id) {

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

    public VmDiskWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmDiskWhereInput id_ExplictlyNonNull() {
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

    public VmDiskWhereInput idContains(String idContains) {

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

    public VmDiskWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmDiskWhereInput idContains_ExplictlyNonNull() {
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

    public VmDiskWhereInput idEndsWith(String idEndsWith) {

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

    public VmDiskWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput idGt(String idGt) {

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

    public VmDiskWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmDiskWhereInput idGt_ExplictlyNonNull() {
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

    public VmDiskWhereInput idGte(String idGte) {

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

    public VmDiskWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmDiskWhereInput idGte_ExplictlyNonNull() {
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

    public VmDiskWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmDiskWhereInput addIdInItem(String idInItem) {
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

    public VmDiskWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmDiskWhereInput idIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput idLt(String idLt) {

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

    public VmDiskWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmDiskWhereInput idLt_ExplictlyNonNull() {
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

    public VmDiskWhereInput idLte(String idLte) {

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

    public VmDiskWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmDiskWhereInput idLte_ExplictlyNonNull() {
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

    public VmDiskWhereInput idNot(String idNot) {

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

    public VmDiskWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmDiskWhereInput idNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput idNotContains(String idNotContains) {

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

    public VmDiskWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmDiskWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmDiskWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmDiskWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmDiskWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmDiskWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmDiskWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput idStartsWith(String idStartsWith) {

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

    public VmDiskWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput key(Integer key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public VmDiskWhereInput key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public VmDiskWhereInput key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    public VmDiskWhereInput keyGt(Integer keyGt) {

        this.keyGt = keyGt;
        return this;
    }

    /**
     * Get keyGt
     *
     * @return keyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeyGt() {
        return keyGt;
    }

    public void setKeyGt(Integer keyGt) {
        this.keyGt = keyGt;
    }

    public VmDiskWhereInput keyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public VmDiskWhereInput keyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public void setKeyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_GT);
        }
    }

    public boolean getKeyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_GT);
    }

    public VmDiskWhereInput keyGte(Integer keyGte) {

        this.keyGte = keyGte;
        return this;
    }

    /**
     * Get keyGte
     *
     * @return keyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeyGte() {
        return keyGte;
    }

    public void setKeyGte(Integer keyGte) {
        this.keyGte = keyGte;
    }

    public VmDiskWhereInput keyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public VmDiskWhereInput keyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public void setKeyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_GTE);
        }
    }

    public boolean getKeyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_GTE);
    }

    public VmDiskWhereInput keyIn(List<Integer> keyIn) {

        this.keyIn = keyIn;
        return this;
    }

    public VmDiskWhereInput addKeyInItem(Integer keyInItem) {
        if (this.keyIn == null) {
            this.keyIn = new ArrayList<Integer>();
        }
        this.keyIn.add(keyInItem);
        return this;
    }

    /**
     * Get keyIn
     *
     * @return keyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getKeyIn() {
        return keyIn;
    }

    public void setKeyIn(List<Integer> keyIn) {
        this.keyIn = keyIn;
    }

    public VmDiskWhereInput keyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public VmDiskWhereInput keyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public void setKeyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_IN);
        }
    }

    public boolean getKeyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_IN);
    }

    public VmDiskWhereInput keyLt(Integer keyLt) {

        this.keyLt = keyLt;
        return this;
    }

    /**
     * Get keyLt
     *
     * @return keyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeyLt() {
        return keyLt;
    }

    public void setKeyLt(Integer keyLt) {
        this.keyLt = keyLt;
    }

    public VmDiskWhereInput keyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public VmDiskWhereInput keyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public void setKeyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_LT);
        }
    }

    public boolean getKeyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_LT);
    }

    public VmDiskWhereInput keyLte(Integer keyLte) {

        this.keyLte = keyLte;
        return this;
    }

    /**
     * Get keyLte
     *
     * @return keyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeyLte() {
        return keyLte;
    }

    public void setKeyLte(Integer keyLte) {
        this.keyLte = keyLte;
    }

    public VmDiskWhereInput keyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public VmDiskWhereInput keyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public void setKeyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_LTE);
        }
    }

    public boolean getKeyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_LTE);
    }

    public VmDiskWhereInput keyNot(Integer keyNot) {

        this.keyNot = keyNot;
        return this;
    }

    /**
     * Get keyNot
     *
     * @return keyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeyNot() {
        return keyNot;
    }

    public void setKeyNot(Integer keyNot) {
        this.keyNot = keyNot;
    }

    public VmDiskWhereInput keyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public VmDiskWhereInput keyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public void setKeyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT);
        }
    }

    public boolean getKeyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT);
    }

    public VmDiskWhereInput keyNotIn(List<Integer> keyNotIn) {

        this.keyNotIn = keyNotIn;
        return this;
    }

    public VmDiskWhereInput addKeyNotInItem(Integer keyNotInItem) {
        if (this.keyNotIn == null) {
            this.keyNotIn = new ArrayList<Integer>();
        }
        this.keyNotIn.add(keyNotInItem);
        return this;
    }

    /**
     * Get keyNotIn
     *
     * @return keyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getKeyNotIn() {
        return keyNotIn;
    }

    public void setKeyNotIn(List<Integer> keyNotIn) {
        this.keyNotIn = keyNotIn;
    }

    public VmDiskWhereInput keyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public VmDiskWhereInput keyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public void setKeyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_IN);
        }
    }

    public boolean getKeyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_IN);
    }

    public VmDiskWhereInput maxBandwidth(Long maxBandwidth) {

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

    public VmDiskWhereInput maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmDiskWhereInput maxBandwidth_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthGt(Long maxBandwidthGt) {

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

    public VmDiskWhereInput maxBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        return this;
    }

    public VmDiskWhereInput maxBandwidthGt_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthGte(Long maxBandwidthGte) {

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

    public VmDiskWhereInput maxBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        return this;
    }

    public VmDiskWhereInput maxBandwidthGte_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthIn(List<Long> maxBandwidthIn) {

        this.maxBandwidthIn = maxBandwidthIn;
        return this;
    }

    public VmDiskWhereInput addMaxBandwidthInItem(Long maxBandwidthInItem) {
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

    public VmDiskWhereInput maxBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        return this;
    }

    public VmDiskWhereInput maxBandwidthIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthLt(Long maxBandwidthLt) {

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

    public VmDiskWhereInput maxBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        return this;
    }

    public VmDiskWhereInput maxBandwidthLt_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthLte(Long maxBandwidthLte) {

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

    public VmDiskWhereInput maxBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        return this;
    }

    public VmDiskWhereInput maxBandwidthLte_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthNot(Long maxBandwidthNot) {

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

    public VmDiskWhereInput maxBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        return this;
    }

    public VmDiskWhereInput maxBandwidthNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthNotIn(List<Long> maxBandwidthNotIn) {

        this.maxBandwidthNotIn = maxBandwidthNotIn;
        return this;
    }

    public VmDiskWhereInput addMaxBandwidthNotInItem(Long maxBandwidthNotInItem) {
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

    public VmDiskWhereInput maxBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public VmDiskWhereInput maxBandwidthNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public VmDiskWhereInput maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmDiskWhereInput maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthPolicyIn(List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {

        this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
        return this;
    }

    public VmDiskWhereInput addMaxBandwidthPolicyInItem(
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

    public VmDiskWhereInput maxBandwidthPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        return this;
    }

    public VmDiskWhereInput maxBandwidthPolicyIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthPolicyNot(VmDiskIoRestrictType maxBandwidthPolicyNot) {

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

    public VmDiskWhereInput maxBandwidthPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        return this;
    }

    public VmDiskWhereInput maxBandwidthPolicyNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxBandwidthPolicyNotIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {

        this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
        return this;
    }

    public VmDiskWhereInput addMaxBandwidthPolicyNotInItem(
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

    public VmDiskWhereInput maxBandwidthPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        return this;
    }

    public VmDiskWhereInput maxBandwidthPolicyNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIops(Integer maxIops) {

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

    public VmDiskWhereInput maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmDiskWhereInput maxIops_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsGt(Integer maxIopsGt) {

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

    public VmDiskWhereInput maxIopsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GT);
        return this;
    }

    public VmDiskWhereInput maxIopsGt_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsGte(Integer maxIopsGte) {

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

    public VmDiskWhereInput maxIopsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GTE);
        return this;
    }

    public VmDiskWhereInput maxIopsGte_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsIn(List<Integer> maxIopsIn) {

        this.maxIopsIn = maxIopsIn;
        return this;
    }

    public VmDiskWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
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

    public VmDiskWhereInput maxIopsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_IN);
        return this;
    }

    public VmDiskWhereInput maxIopsIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsLt(Integer maxIopsLt) {

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

    public VmDiskWhereInput maxIopsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LT);
        return this;
    }

    public VmDiskWhereInput maxIopsLt_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsLte(Integer maxIopsLte) {

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

    public VmDiskWhereInput maxIopsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LTE);
        return this;
    }

    public VmDiskWhereInput maxIopsLte_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsNot(Integer maxIopsNot) {

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

    public VmDiskWhereInput maxIopsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT);
        return this;
    }

    public VmDiskWhereInput maxIopsNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {

        this.maxIopsNotIn = maxIopsNotIn;
        return this;
    }

    public VmDiskWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
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

    public VmDiskWhereInput maxIopsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        return this;
    }

    public VmDiskWhereInput maxIopsNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmDiskWhereInput maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmDiskWhereInput maxIopsPolicy_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {

        this.maxIopsPolicyIn = maxIopsPolicyIn;
        return this;
    }

    public VmDiskWhereInput addMaxIopsPolicyInItem(VmDiskIoRestrictType maxIopsPolicyInItem) {
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

    public VmDiskWhereInput maxIopsPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        return this;
    }

    public VmDiskWhereInput maxIopsPolicyIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {

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

    public VmDiskWhereInput maxIopsPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        return this;
    }

    public VmDiskWhereInput maxIopsPolicyNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput maxIopsPolicyNotIn(List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {

        this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
        return this;
    }

    public VmDiskWhereInput addMaxIopsPolicyNotInItem(VmDiskIoRestrictType maxIopsPolicyNotInItem) {
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

    public VmDiskWhereInput maxIopsPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        return this;
    }

    public VmDiskWhereInput maxIopsPolicyNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput serial(String serial) {

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

    public VmDiskWhereInput serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public VmDiskWhereInput serial_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialContains(String serialContains) {

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

    public VmDiskWhereInput serialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public VmDiskWhereInput serialContains_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialEndsWith(String serialEndsWith) {

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

    public VmDiskWhereInput serialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput serialEndsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialGt(String serialGt) {

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

    public VmDiskWhereInput serialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public VmDiskWhereInput serialGt_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialGte(String serialGte) {

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

    public VmDiskWhereInput serialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public VmDiskWhereInput serialGte_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialIn(List<String> serialIn) {

        this.serialIn = serialIn;
        return this;
    }

    public VmDiskWhereInput addSerialInItem(String serialInItem) {
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

    public VmDiskWhereInput serialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public VmDiskWhereInput serialIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialLt(String serialLt) {

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

    public VmDiskWhereInput serialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public VmDiskWhereInput serialLt_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialLte(String serialLte) {

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

    public VmDiskWhereInput serialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public VmDiskWhereInput serialLte_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialNot(String serialNot) {

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

    public VmDiskWhereInput serialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public VmDiskWhereInput serialNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialNotContains(String serialNotContains) {

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

    public VmDiskWhereInput serialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput serialNotContains_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialNotEndsWith(String serialNotEndsWith) {

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

    public VmDiskWhereInput serialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput serialNotEndsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialNotIn(List<String> serialNotIn) {

        this.serialNotIn = serialNotIn;
        return this;
    }

    public VmDiskWhereInput addSerialNotInItem(String serialNotInItem) {
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

    public VmDiskWhereInput serialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public VmDiskWhereInput serialNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialNotStartsWith(String serialNotStartsWith) {

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

    public VmDiskWhereInput serialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput serialNotStartsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput serialStartsWith(String serialStartsWith) {

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

    public VmDiskWhereInput serialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput serialStartsWith_ExplictlyNonNull() {
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

    public VmDiskWhereInput svtImage(SvtImageWhereInput svtImage) {

        this.svtImage = svtImage;
        return this;
    }

    /**
     * Get svtImage
     *
     * @return svtImage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SvtImageWhereInput getSvtImage() {
        return svtImage;
    }

    public void setSvtImage(SvtImageWhereInput svtImage) {
        this.svtImage = svtImage;
    }

    public VmDiskWhereInput svtImage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE);
        return this;
    }

    public VmDiskWhereInput svtImage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE);
        return this;
    }

    public void setSvtImage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE);
        }
    }

    public boolean getSvtImage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SVT_IMAGE);
    }

    public VmDiskWhereInput type(VmDiskType type) {

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
    public VmDiskType getType() {
        return type;
    }

    public void setType(VmDiskType type) {
        this.type = type;
    }

    public VmDiskWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmDiskWhereInput type_ExplictlyNonNull() {
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

    public VmDiskWhereInput typeIn(List<VmDiskType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmDiskWhereInput addTypeInItem(VmDiskType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<VmDiskType>();
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
    public List<VmDiskType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<VmDiskType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmDiskWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmDiskWhereInput typeIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput typeNot(VmDiskType typeNot) {

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
    public VmDiskType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(VmDiskType typeNot) {
        this.typeNot = typeNot;
    }

    public VmDiskWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmDiskWhereInput typeNot_ExplictlyNonNull() {
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

    public VmDiskWhereInput typeNotIn(List<VmDiskType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmDiskWhereInput addTypeNotInItem(VmDiskType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<VmDiskType>();
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
    public List<VmDiskType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<VmDiskType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmDiskWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmDiskWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmDiskWhereInput unsafeImagePath(String unsafeImagePath) {

        this.unsafeImagePath = unsafeImagePath;
        return this;
    }

    /**
     * Get unsafeImagePath
     *
     * @return unsafeImagePath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePath() {
        return unsafeImagePath;
    }

    public void setUnsafeImagePath(String unsafeImagePath) {
        this.unsafeImagePath = unsafeImagePath;
    }

    public VmDiskWhereInput unsafeImagePath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        return this;
    }

    public VmDiskWhereInput unsafeImagePath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        return this;
    }

    public void setUnsafeImagePath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        }
    }

    public boolean getUnsafeImagePath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
    }

    public VmDiskWhereInput unsafeImagePathContains(String unsafeImagePathContains) {

        this.unsafeImagePathContains = unsafeImagePathContains;
        return this;
    }

    /**
     * Get unsafeImagePathContains
     *
     * @return unsafeImagePathContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathContains() {
        return unsafeImagePathContains;
    }

    public void setUnsafeImagePathContains(String unsafeImagePathContains) {
        this.unsafeImagePathContains = unsafeImagePathContains;
    }

    public VmDiskWhereInput unsafeImagePathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS);
        return this;
    }

    public void setUnsafeImagePathContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS);
        }
    }

    public boolean getUnsafeImagePathContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_CONTAINS);
    }

    public VmDiskWhereInput unsafeImagePathEndsWith(String unsafeImagePathEndsWith) {

        this.unsafeImagePathEndsWith = unsafeImagePathEndsWith;
        return this;
    }

    /**
     * Get unsafeImagePathEndsWith
     *
     * @return unsafeImagePathEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathEndsWith() {
        return unsafeImagePathEndsWith;
    }

    public void setUnsafeImagePathEndsWith(String unsafeImagePathEndsWith) {
        this.unsafeImagePathEndsWith = unsafeImagePathEndsWith;
    }

    public VmDiskWhereInput unsafeImagePathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH);
        return this;
    }

    public void setUnsafeImagePathEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH);
        }
    }

    public boolean getUnsafeImagePathEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_ENDS_WITH);
    }

    public VmDiskWhereInput unsafeImagePathGt(String unsafeImagePathGt) {

        this.unsafeImagePathGt = unsafeImagePathGt;
        return this;
    }

    /**
     * Get unsafeImagePathGt
     *
     * @return unsafeImagePathGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathGt() {
        return unsafeImagePathGt;
    }

    public void setUnsafeImagePathGt(String unsafeImagePathGt) {
        this.unsafeImagePathGt = unsafeImagePathGt;
    }

    public VmDiskWhereInput unsafeImagePathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT);
        return this;
    }

    public void setUnsafeImagePathGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT);
        }
    }

    public boolean getUnsafeImagePathGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GT);
    }

    public VmDiskWhereInput unsafeImagePathGte(String unsafeImagePathGte) {

        this.unsafeImagePathGte = unsafeImagePathGte;
        return this;
    }

    /**
     * Get unsafeImagePathGte
     *
     * @return unsafeImagePathGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathGte() {
        return unsafeImagePathGte;
    }

    public void setUnsafeImagePathGte(String unsafeImagePathGte) {
        this.unsafeImagePathGte = unsafeImagePathGte;
    }

    public VmDiskWhereInput unsafeImagePathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE);
        return this;
    }

    public void setUnsafeImagePathGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE);
        }
    }

    public boolean getUnsafeImagePathGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_GTE);
    }

    public VmDiskWhereInput unsafeImagePathIn(List<String> unsafeImagePathIn) {

        this.unsafeImagePathIn = unsafeImagePathIn;
        return this;
    }

    public VmDiskWhereInput addUnsafeImagePathInItem(String unsafeImagePathInItem) {
        if (this.unsafeImagePathIn == null) {
            this.unsafeImagePathIn = new ArrayList<String>();
        }
        this.unsafeImagePathIn.add(unsafeImagePathInItem);
        return this;
    }

    /**
     * Get unsafeImagePathIn
     *
     * @return unsafeImagePathIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUnsafeImagePathIn() {
        return unsafeImagePathIn;
    }

    public void setUnsafeImagePathIn(List<String> unsafeImagePathIn) {
        this.unsafeImagePathIn = unsafeImagePathIn;
    }

    public VmDiskWhereInput unsafeImagePathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN);
        return this;
    }

    public void setUnsafeImagePathIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN);
        }
    }

    public boolean getUnsafeImagePathIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_IN);
    }

    public VmDiskWhereInput unsafeImagePathLt(String unsafeImagePathLt) {

        this.unsafeImagePathLt = unsafeImagePathLt;
        return this;
    }

    /**
     * Get unsafeImagePathLt
     *
     * @return unsafeImagePathLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathLt() {
        return unsafeImagePathLt;
    }

    public void setUnsafeImagePathLt(String unsafeImagePathLt) {
        this.unsafeImagePathLt = unsafeImagePathLt;
    }

    public VmDiskWhereInput unsafeImagePathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT);
        return this;
    }

    public void setUnsafeImagePathLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT);
        }
    }

    public boolean getUnsafeImagePathLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LT);
    }

    public VmDiskWhereInput unsafeImagePathLte(String unsafeImagePathLte) {

        this.unsafeImagePathLte = unsafeImagePathLte;
        return this;
    }

    /**
     * Get unsafeImagePathLte
     *
     * @return unsafeImagePathLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathLte() {
        return unsafeImagePathLte;
    }

    public void setUnsafeImagePathLte(String unsafeImagePathLte) {
        this.unsafeImagePathLte = unsafeImagePathLte;
    }

    public VmDiskWhereInput unsafeImagePathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE);
        return this;
    }

    public void setUnsafeImagePathLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE);
        }
    }

    public boolean getUnsafeImagePathLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_LTE);
    }

    public VmDiskWhereInput unsafeImagePathNot(String unsafeImagePathNot) {

        this.unsafeImagePathNot = unsafeImagePathNot;
        return this;
    }

    /**
     * Get unsafeImagePathNot
     *
     * @return unsafeImagePathNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathNot() {
        return unsafeImagePathNot;
    }

    public void setUnsafeImagePathNot(String unsafeImagePathNot) {
        this.unsafeImagePathNot = unsafeImagePathNot;
    }

    public VmDiskWhereInput unsafeImagePathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT);
        return this;
    }

    public void setUnsafeImagePathNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT);
        }
    }

    public boolean getUnsafeImagePathNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT);
    }

    public VmDiskWhereInput unsafeImagePathNotContains(String unsafeImagePathNotContains) {

        this.unsafeImagePathNotContains = unsafeImagePathNotContains;
        return this;
    }

    /**
     * Get unsafeImagePathNotContains
     *
     * @return unsafeImagePathNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathNotContains() {
        return unsafeImagePathNotContains;
    }

    public void setUnsafeImagePathNotContains(String unsafeImagePathNotContains) {
        this.unsafeImagePathNotContains = unsafeImagePathNotContains;
    }

    public VmDiskWhereInput unsafeImagePathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS);
        return this;
    }

    public void setUnsafeImagePathNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS);
        }
    }

    public boolean getUnsafeImagePathNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_CONTAINS);
    }

    public VmDiskWhereInput unsafeImagePathNotEndsWith(String unsafeImagePathNotEndsWith) {

        this.unsafeImagePathNotEndsWith = unsafeImagePathNotEndsWith;
        return this;
    }

    /**
     * Get unsafeImagePathNotEndsWith
     *
     * @return unsafeImagePathNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathNotEndsWith() {
        return unsafeImagePathNotEndsWith;
    }

    public void setUnsafeImagePathNotEndsWith(String unsafeImagePathNotEndsWith) {
        this.unsafeImagePathNotEndsWith = unsafeImagePathNotEndsWith;
    }

    public VmDiskWhereInput unsafeImagePathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH);
        return this;
    }

    public void setUnsafeImagePathNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH);
        }
    }

    public boolean getUnsafeImagePathNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_ENDS_WITH);
    }

    public VmDiskWhereInput unsafeImagePathNotIn(List<String> unsafeImagePathNotIn) {

        this.unsafeImagePathNotIn = unsafeImagePathNotIn;
        return this;
    }

    public VmDiskWhereInput addUnsafeImagePathNotInItem(String unsafeImagePathNotInItem) {
        if (this.unsafeImagePathNotIn == null) {
            this.unsafeImagePathNotIn = new ArrayList<String>();
        }
        this.unsafeImagePathNotIn.add(unsafeImagePathNotInItem);
        return this;
    }

    /**
     * Get unsafeImagePathNotIn
     *
     * @return unsafeImagePathNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUnsafeImagePathNotIn() {
        return unsafeImagePathNotIn;
    }

    public void setUnsafeImagePathNotIn(List<String> unsafeImagePathNotIn) {
        this.unsafeImagePathNotIn = unsafeImagePathNotIn;
    }

    public VmDiskWhereInput unsafeImagePathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN);
        return this;
    }

    public void setUnsafeImagePathNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN);
        }
    }

    public boolean getUnsafeImagePathNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_IN);
    }

    public VmDiskWhereInput unsafeImagePathNotStartsWith(String unsafeImagePathNotStartsWith) {

        this.unsafeImagePathNotStartsWith = unsafeImagePathNotStartsWith;
        return this;
    }

    /**
     * Get unsafeImagePathNotStartsWith
     *
     * @return unsafeImagePathNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathNotStartsWith() {
        return unsafeImagePathNotStartsWith;
    }

    public void setUnsafeImagePathNotStartsWith(String unsafeImagePathNotStartsWith) {
        this.unsafeImagePathNotStartsWith = unsafeImagePathNotStartsWith;
    }

    public VmDiskWhereInput unsafeImagePathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH);
        return this;
    }

    public void setUnsafeImagePathNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH);
        }
    }

    public boolean getUnsafeImagePathNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_NOT_STARTS_WITH);
    }

    public VmDiskWhereInput unsafeImagePathStartsWith(String unsafeImagePathStartsWith) {

        this.unsafeImagePathStartsWith = unsafeImagePathStartsWith;
        return this;
    }

    /**
     * Get unsafeImagePathStartsWith
     *
     * @return unsafeImagePathStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePathStartsWith() {
        return unsafeImagePathStartsWith;
    }

    public void setUnsafeImagePathStartsWith(String unsafeImagePathStartsWith) {
        this.unsafeImagePathStartsWith = unsafeImagePathStartsWith;
    }

    public VmDiskWhereInput unsafeImagePathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImagePathStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH);
        return this;
    }

    public void setUnsafeImagePathStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH);
        }
    }

    public boolean getUnsafeImagePathStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH_STARTS_WITH);
    }

    public VmDiskWhereInput unsafeImageUuid(String unsafeImageUuid) {

        this.unsafeImageUuid = unsafeImageUuid;
        return this;
    }

    /**
     * Get unsafeImageUuid
     *
     * @return unsafeImageUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuid() {
        return unsafeImageUuid;
    }

    public void setUnsafeImageUuid(String unsafeImageUuid) {
        this.unsafeImageUuid = unsafeImageUuid;
    }

    public VmDiskWhereInput unsafeImageUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        return this;
    }

    public void setUnsafeImageUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        }
    }

    public boolean getUnsafeImageUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
    }

    public VmDiskWhereInput unsafeImageUuidContains(String unsafeImageUuidContains) {

        this.unsafeImageUuidContains = unsafeImageUuidContains;
        return this;
    }

    /**
     * Get unsafeImageUuidContains
     *
     * @return unsafeImageUuidContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidContains() {
        return unsafeImageUuidContains;
    }

    public void setUnsafeImageUuidContains(String unsafeImageUuidContains) {
        this.unsafeImageUuidContains = unsafeImageUuidContains;
    }

    public VmDiskWhereInput unsafeImageUuidContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS);
        return this;
    }

    public void setUnsafeImageUuidContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS);
        }
    }

    public boolean getUnsafeImageUuidContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_CONTAINS);
    }

    public VmDiskWhereInput unsafeImageUuidEndsWith(String unsafeImageUuidEndsWith) {

        this.unsafeImageUuidEndsWith = unsafeImageUuidEndsWith;
        return this;
    }

    /**
     * Get unsafeImageUuidEndsWith
     *
     * @return unsafeImageUuidEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidEndsWith() {
        return unsafeImageUuidEndsWith;
    }

    public void setUnsafeImageUuidEndsWith(String unsafeImageUuidEndsWith) {
        this.unsafeImageUuidEndsWith = unsafeImageUuidEndsWith;
    }

    public VmDiskWhereInput unsafeImageUuidEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH);
        return this;
    }

    public void setUnsafeImageUuidEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH);
        }
    }

    public boolean getUnsafeImageUuidEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_ENDS_WITH);
    }

    public VmDiskWhereInput unsafeImageUuidGt(String unsafeImageUuidGt) {

        this.unsafeImageUuidGt = unsafeImageUuidGt;
        return this;
    }

    /**
     * Get unsafeImageUuidGt
     *
     * @return unsafeImageUuidGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidGt() {
        return unsafeImageUuidGt;
    }

    public void setUnsafeImageUuidGt(String unsafeImageUuidGt) {
        this.unsafeImageUuidGt = unsafeImageUuidGt;
    }

    public VmDiskWhereInput unsafeImageUuidGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT);
        return this;
    }

    public void setUnsafeImageUuidGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT);
        }
    }

    public boolean getUnsafeImageUuidGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GT);
    }

    public VmDiskWhereInput unsafeImageUuidGte(String unsafeImageUuidGte) {

        this.unsafeImageUuidGte = unsafeImageUuidGte;
        return this;
    }

    /**
     * Get unsafeImageUuidGte
     *
     * @return unsafeImageUuidGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidGte() {
        return unsafeImageUuidGte;
    }

    public void setUnsafeImageUuidGte(String unsafeImageUuidGte) {
        this.unsafeImageUuidGte = unsafeImageUuidGte;
    }

    public VmDiskWhereInput unsafeImageUuidGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE);
        return this;
    }

    public void setUnsafeImageUuidGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE);
        }
    }

    public boolean getUnsafeImageUuidGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_GTE);
    }

    public VmDiskWhereInput unsafeImageUuidIn(List<String> unsafeImageUuidIn) {

        this.unsafeImageUuidIn = unsafeImageUuidIn;
        return this;
    }

    public VmDiskWhereInput addUnsafeImageUuidInItem(String unsafeImageUuidInItem) {
        if (this.unsafeImageUuidIn == null) {
            this.unsafeImageUuidIn = new ArrayList<String>();
        }
        this.unsafeImageUuidIn.add(unsafeImageUuidInItem);
        return this;
    }

    /**
     * Get unsafeImageUuidIn
     *
     * @return unsafeImageUuidIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUnsafeImageUuidIn() {
        return unsafeImageUuidIn;
    }

    public void setUnsafeImageUuidIn(List<String> unsafeImageUuidIn) {
        this.unsafeImageUuidIn = unsafeImageUuidIn;
    }

    public VmDiskWhereInput unsafeImageUuidIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN);
        return this;
    }

    public void setUnsafeImageUuidIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN);
        }
    }

    public boolean getUnsafeImageUuidIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_IN);
    }

    public VmDiskWhereInput unsafeImageUuidLt(String unsafeImageUuidLt) {

        this.unsafeImageUuidLt = unsafeImageUuidLt;
        return this;
    }

    /**
     * Get unsafeImageUuidLt
     *
     * @return unsafeImageUuidLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidLt() {
        return unsafeImageUuidLt;
    }

    public void setUnsafeImageUuidLt(String unsafeImageUuidLt) {
        this.unsafeImageUuidLt = unsafeImageUuidLt;
    }

    public VmDiskWhereInput unsafeImageUuidLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT);
        return this;
    }

    public void setUnsafeImageUuidLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT);
        }
    }

    public boolean getUnsafeImageUuidLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LT);
    }

    public VmDiskWhereInput unsafeImageUuidLte(String unsafeImageUuidLte) {

        this.unsafeImageUuidLte = unsafeImageUuidLte;
        return this;
    }

    /**
     * Get unsafeImageUuidLte
     *
     * @return unsafeImageUuidLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidLte() {
        return unsafeImageUuidLte;
    }

    public void setUnsafeImageUuidLte(String unsafeImageUuidLte) {
        this.unsafeImageUuidLte = unsafeImageUuidLte;
    }

    public VmDiskWhereInput unsafeImageUuidLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE);
        return this;
    }

    public void setUnsafeImageUuidLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE);
        }
    }

    public boolean getUnsafeImageUuidLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_LTE);
    }

    public VmDiskWhereInput unsafeImageUuidNot(String unsafeImageUuidNot) {

        this.unsafeImageUuidNot = unsafeImageUuidNot;
        return this;
    }

    /**
     * Get unsafeImageUuidNot
     *
     * @return unsafeImageUuidNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidNot() {
        return unsafeImageUuidNot;
    }

    public void setUnsafeImageUuidNot(String unsafeImageUuidNot) {
        this.unsafeImageUuidNot = unsafeImageUuidNot;
    }

    public VmDiskWhereInput unsafeImageUuidNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT);
        return this;
    }

    public void setUnsafeImageUuidNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT);
        }
    }

    public boolean getUnsafeImageUuidNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT);
    }

    public VmDiskWhereInput unsafeImageUuidNotContains(String unsafeImageUuidNotContains) {

        this.unsafeImageUuidNotContains = unsafeImageUuidNotContains;
        return this;
    }

    /**
     * Get unsafeImageUuidNotContains
     *
     * @return unsafeImageUuidNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidNotContains() {
        return unsafeImageUuidNotContains;
    }

    public void setUnsafeImageUuidNotContains(String unsafeImageUuidNotContains) {
        this.unsafeImageUuidNotContains = unsafeImageUuidNotContains;
    }

    public VmDiskWhereInput unsafeImageUuidNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS);
        return this;
    }

    public void setUnsafeImageUuidNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS);
        }
    }

    public boolean getUnsafeImageUuidNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_CONTAINS);
    }

    public VmDiskWhereInput unsafeImageUuidNotEndsWith(String unsafeImageUuidNotEndsWith) {

        this.unsafeImageUuidNotEndsWith = unsafeImageUuidNotEndsWith;
        return this;
    }

    /**
     * Get unsafeImageUuidNotEndsWith
     *
     * @return unsafeImageUuidNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidNotEndsWith() {
        return unsafeImageUuidNotEndsWith;
    }

    public void setUnsafeImageUuidNotEndsWith(String unsafeImageUuidNotEndsWith) {
        this.unsafeImageUuidNotEndsWith = unsafeImageUuidNotEndsWith;
    }

    public VmDiskWhereInput unsafeImageUuidNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH);
        return this;
    }

    public void setUnsafeImageUuidNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH);
        }
    }

    public boolean getUnsafeImageUuidNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_ENDS_WITH);
    }

    public VmDiskWhereInput unsafeImageUuidNotIn(List<String> unsafeImageUuidNotIn) {

        this.unsafeImageUuidNotIn = unsafeImageUuidNotIn;
        return this;
    }

    public VmDiskWhereInput addUnsafeImageUuidNotInItem(String unsafeImageUuidNotInItem) {
        if (this.unsafeImageUuidNotIn == null) {
            this.unsafeImageUuidNotIn = new ArrayList<String>();
        }
        this.unsafeImageUuidNotIn.add(unsafeImageUuidNotInItem);
        return this;
    }

    /**
     * Get unsafeImageUuidNotIn
     *
     * @return unsafeImageUuidNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUnsafeImageUuidNotIn() {
        return unsafeImageUuidNotIn;
    }

    public void setUnsafeImageUuidNotIn(List<String> unsafeImageUuidNotIn) {
        this.unsafeImageUuidNotIn = unsafeImageUuidNotIn;
    }

    public VmDiskWhereInput unsafeImageUuidNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN);
        return this;
    }

    public void setUnsafeImageUuidNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN);
        }
    }

    public boolean getUnsafeImageUuidNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_IN);
    }

    public VmDiskWhereInput unsafeImageUuidNotStartsWith(String unsafeImageUuidNotStartsWith) {

        this.unsafeImageUuidNotStartsWith = unsafeImageUuidNotStartsWith;
        return this;
    }

    /**
     * Get unsafeImageUuidNotStartsWith
     *
     * @return unsafeImageUuidNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidNotStartsWith() {
        return unsafeImageUuidNotStartsWith;
    }

    public void setUnsafeImageUuidNotStartsWith(String unsafeImageUuidNotStartsWith) {
        this.unsafeImageUuidNotStartsWith = unsafeImageUuidNotStartsWith;
    }

    public VmDiskWhereInput unsafeImageUuidNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH);
        return this;
    }

    public void setUnsafeImageUuidNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH);
        }
    }

    public boolean getUnsafeImageUuidNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_NOT_STARTS_WITH);
    }

    public VmDiskWhereInput unsafeImageUuidStartsWith(String unsafeImageUuidStartsWith) {

        this.unsafeImageUuidStartsWith = unsafeImageUuidStartsWith;
        return this;
    }

    /**
     * Get unsafeImageUuidStartsWith
     *
     * @return unsafeImageUuidStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuidStartsWith() {
        return unsafeImageUuidStartsWith;
    }

    public void setUnsafeImageUuidStartsWith(String unsafeImageUuidStartsWith) {
        this.unsafeImageUuidStartsWith = unsafeImageUuidStartsWith;
    }

    public VmDiskWhereInput unsafeImageUuidStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeImageUuidStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH);
        return this;
    }

    public void setUnsafeImageUuidStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH);
        }
    }

    public boolean getUnsafeImageUuidStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID_STARTS_WITH);
    }

    public VmDiskWhereInput unsafeProvision(String unsafeProvision) {

        this.unsafeProvision = unsafeProvision;
        return this;
    }

    /**
     * Get unsafeProvision
     *
     * @return unsafeProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvision() {
        return unsafeProvision;
    }

    public void setUnsafeProvision(String unsafeProvision) {
        this.unsafeProvision = unsafeProvision;
    }

    public VmDiskWhereInput unsafeProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION);
        return this;
    }

    public VmDiskWhereInput unsafeProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION);
        return this;
    }

    public void setUnsafeProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION);
        }
    }

    public boolean getUnsafeProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION);
    }

    public VmDiskWhereInput unsafeProvisionContains(String unsafeProvisionContains) {

        this.unsafeProvisionContains = unsafeProvisionContains;
        return this;
    }

    /**
     * Get unsafeProvisionContains
     *
     * @return unsafeProvisionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionContains() {
        return unsafeProvisionContains;
    }

    public void setUnsafeProvisionContains(String unsafeProvisionContains) {
        this.unsafeProvisionContains = unsafeProvisionContains;
    }

    public VmDiskWhereInput unsafeProvisionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS);
        return this;
    }

    public void setUnsafeProvisionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS);
        }
    }

    public boolean getUnsafeProvisionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_CONTAINS);
    }

    public VmDiskWhereInput unsafeProvisionEndsWith(String unsafeProvisionEndsWith) {

        this.unsafeProvisionEndsWith = unsafeProvisionEndsWith;
        return this;
    }

    /**
     * Get unsafeProvisionEndsWith
     *
     * @return unsafeProvisionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionEndsWith() {
        return unsafeProvisionEndsWith;
    }

    public void setUnsafeProvisionEndsWith(String unsafeProvisionEndsWith) {
        this.unsafeProvisionEndsWith = unsafeProvisionEndsWith;
    }

    public VmDiskWhereInput unsafeProvisionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH);
        return this;
    }

    public void setUnsafeProvisionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH);
        }
    }

    public boolean getUnsafeProvisionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_ENDS_WITH);
    }

    public VmDiskWhereInput unsafeProvisionGt(String unsafeProvisionGt) {

        this.unsafeProvisionGt = unsafeProvisionGt;
        return this;
    }

    /**
     * Get unsafeProvisionGt
     *
     * @return unsafeProvisionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionGt() {
        return unsafeProvisionGt;
    }

    public void setUnsafeProvisionGt(String unsafeProvisionGt) {
        this.unsafeProvisionGt = unsafeProvisionGt;
    }

    public VmDiskWhereInput unsafeProvisionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_GT);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_GT);
        return this;
    }

    public void setUnsafeProvisionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_GT);
        }
    }

    public boolean getUnsafeProvisionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_GT);
    }

    public VmDiskWhereInput unsafeProvisionGte(String unsafeProvisionGte) {

        this.unsafeProvisionGte = unsafeProvisionGte;
        return this;
    }

    /**
     * Get unsafeProvisionGte
     *
     * @return unsafeProvisionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionGte() {
        return unsafeProvisionGte;
    }

    public void setUnsafeProvisionGte(String unsafeProvisionGte) {
        this.unsafeProvisionGte = unsafeProvisionGte;
    }

    public VmDiskWhereInput unsafeProvisionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_GTE);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_GTE);
        return this;
    }

    public void setUnsafeProvisionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_GTE);
        }
    }

    public boolean getUnsafeProvisionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_GTE);
    }

    public VmDiskWhereInput unsafeProvisionIn(List<String> unsafeProvisionIn) {

        this.unsafeProvisionIn = unsafeProvisionIn;
        return this;
    }

    public VmDiskWhereInput addUnsafeProvisionInItem(String unsafeProvisionInItem) {
        if (this.unsafeProvisionIn == null) {
            this.unsafeProvisionIn = new ArrayList<String>();
        }
        this.unsafeProvisionIn.add(unsafeProvisionInItem);
        return this;
    }

    /**
     * Get unsafeProvisionIn
     *
     * @return unsafeProvisionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUnsafeProvisionIn() {
        return unsafeProvisionIn;
    }

    public void setUnsafeProvisionIn(List<String> unsafeProvisionIn) {
        this.unsafeProvisionIn = unsafeProvisionIn;
    }

    public VmDiskWhereInput unsafeProvisionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_IN);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_IN);
        return this;
    }

    public void setUnsafeProvisionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_IN);
        }
    }

    public boolean getUnsafeProvisionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_IN);
    }

    public VmDiskWhereInput unsafeProvisionLt(String unsafeProvisionLt) {

        this.unsafeProvisionLt = unsafeProvisionLt;
        return this;
    }

    /**
     * Get unsafeProvisionLt
     *
     * @return unsafeProvisionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionLt() {
        return unsafeProvisionLt;
    }

    public void setUnsafeProvisionLt(String unsafeProvisionLt) {
        this.unsafeProvisionLt = unsafeProvisionLt;
    }

    public VmDiskWhereInput unsafeProvisionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_LT);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_LT);
        return this;
    }

    public void setUnsafeProvisionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_LT);
        }
    }

    public boolean getUnsafeProvisionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_LT);
    }

    public VmDiskWhereInput unsafeProvisionLte(String unsafeProvisionLte) {

        this.unsafeProvisionLte = unsafeProvisionLte;
        return this;
    }

    /**
     * Get unsafeProvisionLte
     *
     * @return unsafeProvisionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionLte() {
        return unsafeProvisionLte;
    }

    public void setUnsafeProvisionLte(String unsafeProvisionLte) {
        this.unsafeProvisionLte = unsafeProvisionLte;
    }

    public VmDiskWhereInput unsafeProvisionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_LTE);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_LTE);
        return this;
    }

    public void setUnsafeProvisionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_LTE);
        }
    }

    public boolean getUnsafeProvisionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_LTE);
    }

    public VmDiskWhereInput unsafeProvisionNot(String unsafeProvisionNot) {

        this.unsafeProvisionNot = unsafeProvisionNot;
        return this;
    }

    /**
     * Get unsafeProvisionNot
     *
     * @return unsafeProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionNot() {
        return unsafeProvisionNot;
    }

    public void setUnsafeProvisionNot(String unsafeProvisionNot) {
        this.unsafeProvisionNot = unsafeProvisionNot;
    }

    public VmDiskWhereInput unsafeProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT);
        return this;
    }

    public void setUnsafeProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT);
        }
    }

    public boolean getUnsafeProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_NOT);
    }

    public VmDiskWhereInput unsafeProvisionNotContains(String unsafeProvisionNotContains) {

        this.unsafeProvisionNotContains = unsafeProvisionNotContains;
        return this;
    }

    /**
     * Get unsafeProvisionNotContains
     *
     * @return unsafeProvisionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionNotContains() {
        return unsafeProvisionNotContains;
    }

    public void setUnsafeProvisionNotContains(String unsafeProvisionNotContains) {
        this.unsafeProvisionNotContains = unsafeProvisionNotContains;
    }

    public VmDiskWhereInput unsafeProvisionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS);
        return this;
    }

    public void setUnsafeProvisionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS);
        }
    }

    public boolean getUnsafeProvisionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_CONTAINS);
    }

    public VmDiskWhereInput unsafeProvisionNotEndsWith(String unsafeProvisionNotEndsWith) {

        this.unsafeProvisionNotEndsWith = unsafeProvisionNotEndsWith;
        return this;
    }

    /**
     * Get unsafeProvisionNotEndsWith
     *
     * @return unsafeProvisionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionNotEndsWith() {
        return unsafeProvisionNotEndsWith;
    }

    public void setUnsafeProvisionNotEndsWith(String unsafeProvisionNotEndsWith) {
        this.unsafeProvisionNotEndsWith = unsafeProvisionNotEndsWith;
    }

    public VmDiskWhereInput unsafeProvisionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH);
        return this;
    }

    public void setUnsafeProvisionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH);
        }
    }

    public boolean getUnsafeProvisionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_ENDS_WITH);
    }

    public VmDiskWhereInput unsafeProvisionNotIn(List<String> unsafeProvisionNotIn) {

        this.unsafeProvisionNotIn = unsafeProvisionNotIn;
        return this;
    }

    public VmDiskWhereInput addUnsafeProvisionNotInItem(String unsafeProvisionNotInItem) {
        if (this.unsafeProvisionNotIn == null) {
            this.unsafeProvisionNotIn = new ArrayList<String>();
        }
        this.unsafeProvisionNotIn.add(unsafeProvisionNotInItem);
        return this;
    }

    /**
     * Get unsafeProvisionNotIn
     *
     * @return unsafeProvisionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUnsafeProvisionNotIn() {
        return unsafeProvisionNotIn;
    }

    public void setUnsafeProvisionNotIn(List<String> unsafeProvisionNotIn) {
        this.unsafeProvisionNotIn = unsafeProvisionNotIn;
    }

    public VmDiskWhereInput unsafeProvisionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN);
        return this;
    }

    public void setUnsafeProvisionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN);
        }
    }

    public boolean getUnsafeProvisionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_IN);
    }

    public VmDiskWhereInput unsafeProvisionNotStartsWith(String unsafeProvisionNotStartsWith) {

        this.unsafeProvisionNotStartsWith = unsafeProvisionNotStartsWith;
        return this;
    }

    /**
     * Get unsafeProvisionNotStartsWith
     *
     * @return unsafeProvisionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionNotStartsWith() {
        return unsafeProvisionNotStartsWith;
    }

    public void setUnsafeProvisionNotStartsWith(String unsafeProvisionNotStartsWith) {
        this.unsafeProvisionNotStartsWith = unsafeProvisionNotStartsWith;
    }

    public VmDiskWhereInput unsafeProvisionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH);
        return this;
    }

    public void setUnsafeProvisionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH);
        }
    }

    public boolean getUnsafeProvisionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_NOT_STARTS_WITH);
    }

    public VmDiskWhereInput unsafeProvisionStartsWith(String unsafeProvisionStartsWith) {

        this.unsafeProvisionStartsWith = unsafeProvisionStartsWith;
        return this;
    }

    /**
     * Get unsafeProvisionStartsWith
     *
     * @return unsafeProvisionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvisionStartsWith() {
        return unsafeProvisionStartsWith;
    }

    public void setUnsafeProvisionStartsWith(String unsafeProvisionStartsWith) {
        this.unsafeProvisionStartsWith = unsafeProvisionStartsWith;
    }

    public VmDiskWhereInput unsafeProvisionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH);
        return this;
    }

    public VmDiskWhereInput unsafeProvisionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH);
        return this;
    }

    public void setUnsafeProvisionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH);
        }
    }

    public boolean getUnsafeProvisionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION_STARTS_WITH);
    }

    public VmDiskWhereInput vm(VmWhereInput vm) {

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

    public VmDiskWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmDiskWhereInput vm_ExplictlyNonNull() {
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

    public VmDiskWhereInput vmVolume(VmVolumeWhereInput vmVolume) {

        this.vmVolume = vmVolume;
        return this;
    }

    /**
     * Get vmVolume
     *
     * @return vmVolume
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolume() {
        return vmVolume;
    }

    public void setVmVolume(VmVolumeWhereInput vmVolume) {
        this.vmVolume = vmVolume;
    }

    public VmDiskWhereInput vmVolume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public VmDiskWhereInput vmVolume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public void setVmVolume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        }
    }

    public boolean getVmVolume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmDiskWhereInput vmDiskWhereInput = (VmDiskWhereInput) o;
        return Objects.equals(this.AND, vmDiskWhereInput.AND)
                && Objects.equals(this.NOT, vmDiskWhereInput.NOT)
                && Objects.equals(this.OR, vmDiskWhereInput.OR)
                && Objects.equals(this.boot, vmDiskWhereInput.boot)
                && Objects.equals(this.bootGt, vmDiskWhereInput.bootGt)
                && Objects.equals(this.bootGte, vmDiskWhereInput.bootGte)
                && Objects.equals(this.bootIn, vmDiskWhereInput.bootIn)
                && Objects.equals(this.bootLt, vmDiskWhereInput.bootLt)
                && Objects.equals(this.bootLte, vmDiskWhereInput.bootLte)
                && Objects.equals(this.bootNot, vmDiskWhereInput.bootNot)
                && Objects.equals(this.bootNotIn, vmDiskWhereInput.bootNotIn)
                && Objects.equals(this.bus, vmDiskWhereInput.bus)
                && Objects.equals(this.busIn, vmDiskWhereInput.busIn)
                && Objects.equals(this.busNot, vmDiskWhereInput.busNot)
                && Objects.equals(this.busNotIn, vmDiskWhereInput.busNotIn)
                && Objects.equals(this.cloudInitImageName, vmDiskWhereInput.cloudInitImageName)
                && Objects.equals(
                        this.cloudInitImageNameContains,
                        vmDiskWhereInput.cloudInitImageNameContains)
                && Objects.equals(
                        this.cloudInitImageNameEndsWith,
                        vmDiskWhereInput.cloudInitImageNameEndsWith)
                && Objects.equals(this.cloudInitImageNameGt, vmDiskWhereInput.cloudInitImageNameGt)
                && Objects.equals(
                        this.cloudInitImageNameGte, vmDiskWhereInput.cloudInitImageNameGte)
                && Objects.equals(this.cloudInitImageNameIn, vmDiskWhereInput.cloudInitImageNameIn)
                && Objects.equals(this.cloudInitImageNameLt, vmDiskWhereInput.cloudInitImageNameLt)
                && Objects.equals(
                        this.cloudInitImageNameLte, vmDiskWhereInput.cloudInitImageNameLte)
                && Objects.equals(
                        this.cloudInitImageNameNot, vmDiskWhereInput.cloudInitImageNameNot)
                && Objects.equals(
                        this.cloudInitImageNameNotContains,
                        vmDiskWhereInput.cloudInitImageNameNotContains)
                && Objects.equals(
                        this.cloudInitImageNameNotEndsWith,
                        vmDiskWhereInput.cloudInitImageNameNotEndsWith)
                && Objects.equals(
                        this.cloudInitImageNameNotIn, vmDiskWhereInput.cloudInitImageNameNotIn)
                && Objects.equals(
                        this.cloudInitImageNameNotStartsWith,
                        vmDiskWhereInput.cloudInitImageNameNotStartsWith)
                && Objects.equals(
                        this.cloudInitImageNameStartsWith,
                        vmDiskWhereInput.cloudInitImageNameStartsWith)
                && Objects.equals(this.cloudInitImagePath, vmDiskWhereInput.cloudInitImagePath)
                && Objects.equals(
                        this.cloudInitImagePathContains,
                        vmDiskWhereInput.cloudInitImagePathContains)
                && Objects.equals(
                        this.cloudInitImagePathEndsWith,
                        vmDiskWhereInput.cloudInitImagePathEndsWith)
                && Objects.equals(this.cloudInitImagePathGt, vmDiskWhereInput.cloudInitImagePathGt)
                && Objects.equals(
                        this.cloudInitImagePathGte, vmDiskWhereInput.cloudInitImagePathGte)
                && Objects.equals(this.cloudInitImagePathIn, vmDiskWhereInput.cloudInitImagePathIn)
                && Objects.equals(this.cloudInitImagePathLt, vmDiskWhereInput.cloudInitImagePathLt)
                && Objects.equals(
                        this.cloudInitImagePathLte, vmDiskWhereInput.cloudInitImagePathLte)
                && Objects.equals(
                        this.cloudInitImagePathNot, vmDiskWhereInput.cloudInitImagePathNot)
                && Objects.equals(
                        this.cloudInitImagePathNotContains,
                        vmDiskWhereInput.cloudInitImagePathNotContains)
                && Objects.equals(
                        this.cloudInitImagePathNotEndsWith,
                        vmDiskWhereInput.cloudInitImagePathNotEndsWith)
                && Objects.equals(
                        this.cloudInitImagePathNotIn, vmDiskWhereInput.cloudInitImagePathNotIn)
                && Objects.equals(
                        this.cloudInitImagePathNotStartsWith,
                        vmDiskWhereInput.cloudInitImagePathNotStartsWith)
                && Objects.equals(
                        this.cloudInitImagePathStartsWith,
                        vmDiskWhereInput.cloudInitImagePathStartsWith)
                && Objects.equals(this.device, vmDiskWhereInput.device)
                && Objects.equals(this.deviceContains, vmDiskWhereInput.deviceContains)
                && Objects.equals(this.deviceEndsWith, vmDiskWhereInput.deviceEndsWith)
                && Objects.equals(this.deviceGt, vmDiskWhereInput.deviceGt)
                && Objects.equals(this.deviceGte, vmDiskWhereInput.deviceGte)
                && Objects.equals(this.deviceIn, vmDiskWhereInput.deviceIn)
                && Objects.equals(this.deviceLt, vmDiskWhereInput.deviceLt)
                && Objects.equals(this.deviceLte, vmDiskWhereInput.deviceLte)
                && Objects.equals(this.deviceNot, vmDiskWhereInput.deviceNot)
                && Objects.equals(this.deviceNotContains, vmDiskWhereInput.deviceNotContains)
                && Objects.equals(this.deviceNotEndsWith, vmDiskWhereInput.deviceNotEndsWith)
                && Objects.equals(this.deviceNotIn, vmDiskWhereInput.deviceNotIn)
                && Objects.equals(this.deviceNotStartsWith, vmDiskWhereInput.deviceNotStartsWith)
                && Objects.equals(this.deviceStartsWith, vmDiskWhereInput.deviceStartsWith)
                && Objects.equals(this.disabled, vmDiskWhereInput.disabled)
                && Objects.equals(this.disabledNot, vmDiskWhereInput.disabledNot)
                && Objects.equals(this.elfImage, vmDiskWhereInput.elfImage)
                && Objects.equals(this.id, vmDiskWhereInput.id)
                && Objects.equals(this.idContains, vmDiskWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmDiskWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmDiskWhereInput.idGt)
                && Objects.equals(this.idGte, vmDiskWhereInput.idGte)
                && Objects.equals(this.idIn, vmDiskWhereInput.idIn)
                && Objects.equals(this.idLt, vmDiskWhereInput.idLt)
                && Objects.equals(this.idLte, vmDiskWhereInput.idLte)
                && Objects.equals(this.idNot, vmDiskWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmDiskWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmDiskWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmDiskWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmDiskWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmDiskWhereInput.idStartsWith)
                && Objects.equals(this.key, vmDiskWhereInput.key)
                && Objects.equals(this.keyGt, vmDiskWhereInput.keyGt)
                && Objects.equals(this.keyGte, vmDiskWhereInput.keyGte)
                && Objects.equals(this.keyIn, vmDiskWhereInput.keyIn)
                && Objects.equals(this.keyLt, vmDiskWhereInput.keyLt)
                && Objects.equals(this.keyLte, vmDiskWhereInput.keyLte)
                && Objects.equals(this.keyNot, vmDiskWhereInput.keyNot)
                && Objects.equals(this.keyNotIn, vmDiskWhereInput.keyNotIn)
                && Objects.equals(this.maxBandwidth, vmDiskWhereInput.maxBandwidth)
                && Objects.equals(this.maxBandwidthGt, vmDiskWhereInput.maxBandwidthGt)
                && Objects.equals(this.maxBandwidthGte, vmDiskWhereInput.maxBandwidthGte)
                && Objects.equals(this.maxBandwidthIn, vmDiskWhereInput.maxBandwidthIn)
                && Objects.equals(this.maxBandwidthLt, vmDiskWhereInput.maxBandwidthLt)
                && Objects.equals(this.maxBandwidthLte, vmDiskWhereInput.maxBandwidthLte)
                && Objects.equals(this.maxBandwidthNot, vmDiskWhereInput.maxBandwidthNot)
                && Objects.equals(this.maxBandwidthNotIn, vmDiskWhereInput.maxBandwidthNotIn)
                && Objects.equals(this.maxBandwidthPolicy, vmDiskWhereInput.maxBandwidthPolicy)
                && Objects.equals(this.maxBandwidthPolicyIn, vmDiskWhereInput.maxBandwidthPolicyIn)
                && Objects.equals(
                        this.maxBandwidthPolicyNot, vmDiskWhereInput.maxBandwidthPolicyNot)
                && Objects.equals(
                        this.maxBandwidthPolicyNotIn, vmDiskWhereInput.maxBandwidthPolicyNotIn)
                && Objects.equals(this.maxIops, vmDiskWhereInput.maxIops)
                && Objects.equals(this.maxIopsGt, vmDiskWhereInput.maxIopsGt)
                && Objects.equals(this.maxIopsGte, vmDiskWhereInput.maxIopsGte)
                && Objects.equals(this.maxIopsIn, vmDiskWhereInput.maxIopsIn)
                && Objects.equals(this.maxIopsLt, vmDiskWhereInput.maxIopsLt)
                && Objects.equals(this.maxIopsLte, vmDiskWhereInput.maxIopsLte)
                && Objects.equals(this.maxIopsNot, vmDiskWhereInput.maxIopsNot)
                && Objects.equals(this.maxIopsNotIn, vmDiskWhereInput.maxIopsNotIn)
                && Objects.equals(this.maxIopsPolicy, vmDiskWhereInput.maxIopsPolicy)
                && Objects.equals(this.maxIopsPolicyIn, vmDiskWhereInput.maxIopsPolicyIn)
                && Objects.equals(this.maxIopsPolicyNot, vmDiskWhereInput.maxIopsPolicyNot)
                && Objects.equals(this.maxIopsPolicyNotIn, vmDiskWhereInput.maxIopsPolicyNotIn)
                && Objects.equals(this.serial, vmDiskWhereInput.serial)
                && Objects.equals(this.serialContains, vmDiskWhereInput.serialContains)
                && Objects.equals(this.serialEndsWith, vmDiskWhereInput.serialEndsWith)
                && Objects.equals(this.serialGt, vmDiskWhereInput.serialGt)
                && Objects.equals(this.serialGte, vmDiskWhereInput.serialGte)
                && Objects.equals(this.serialIn, vmDiskWhereInput.serialIn)
                && Objects.equals(this.serialLt, vmDiskWhereInput.serialLt)
                && Objects.equals(this.serialLte, vmDiskWhereInput.serialLte)
                && Objects.equals(this.serialNot, vmDiskWhereInput.serialNot)
                && Objects.equals(this.serialNotContains, vmDiskWhereInput.serialNotContains)
                && Objects.equals(this.serialNotEndsWith, vmDiskWhereInput.serialNotEndsWith)
                && Objects.equals(this.serialNotIn, vmDiskWhereInput.serialNotIn)
                && Objects.equals(this.serialNotStartsWith, vmDiskWhereInput.serialNotStartsWith)
                && Objects.equals(this.serialStartsWith, vmDiskWhereInput.serialStartsWith)
                && Objects.equals(this.svtImage, vmDiskWhereInput.svtImage)
                && Objects.equals(this.type, vmDiskWhereInput.type)
                && Objects.equals(this.typeIn, vmDiskWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmDiskWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmDiskWhereInput.typeNotIn)
                && Objects.equals(this.unsafeImagePath, vmDiskWhereInput.unsafeImagePath)
                && Objects.equals(
                        this.unsafeImagePathContains, vmDiskWhereInput.unsafeImagePathContains)
                && Objects.equals(
                        this.unsafeImagePathEndsWith, vmDiskWhereInput.unsafeImagePathEndsWith)
                && Objects.equals(this.unsafeImagePathGt, vmDiskWhereInput.unsafeImagePathGt)
                && Objects.equals(this.unsafeImagePathGte, vmDiskWhereInput.unsafeImagePathGte)
                && Objects.equals(this.unsafeImagePathIn, vmDiskWhereInput.unsafeImagePathIn)
                && Objects.equals(this.unsafeImagePathLt, vmDiskWhereInput.unsafeImagePathLt)
                && Objects.equals(this.unsafeImagePathLte, vmDiskWhereInput.unsafeImagePathLte)
                && Objects.equals(this.unsafeImagePathNot, vmDiskWhereInput.unsafeImagePathNot)
                && Objects.equals(
                        this.unsafeImagePathNotContains,
                        vmDiskWhereInput.unsafeImagePathNotContains)
                && Objects.equals(
                        this.unsafeImagePathNotEndsWith,
                        vmDiskWhereInput.unsafeImagePathNotEndsWith)
                && Objects.equals(this.unsafeImagePathNotIn, vmDiskWhereInput.unsafeImagePathNotIn)
                && Objects.equals(
                        this.unsafeImagePathNotStartsWith,
                        vmDiskWhereInput.unsafeImagePathNotStartsWith)
                && Objects.equals(
                        this.unsafeImagePathStartsWith, vmDiskWhereInput.unsafeImagePathStartsWith)
                && Objects.equals(this.unsafeImageUuid, vmDiskWhereInput.unsafeImageUuid)
                && Objects.equals(
                        this.unsafeImageUuidContains, vmDiskWhereInput.unsafeImageUuidContains)
                && Objects.equals(
                        this.unsafeImageUuidEndsWith, vmDiskWhereInput.unsafeImageUuidEndsWith)
                && Objects.equals(this.unsafeImageUuidGt, vmDiskWhereInput.unsafeImageUuidGt)
                && Objects.equals(this.unsafeImageUuidGte, vmDiskWhereInput.unsafeImageUuidGte)
                && Objects.equals(this.unsafeImageUuidIn, vmDiskWhereInput.unsafeImageUuidIn)
                && Objects.equals(this.unsafeImageUuidLt, vmDiskWhereInput.unsafeImageUuidLt)
                && Objects.equals(this.unsafeImageUuidLte, vmDiskWhereInput.unsafeImageUuidLte)
                && Objects.equals(this.unsafeImageUuidNot, vmDiskWhereInput.unsafeImageUuidNot)
                && Objects.equals(
                        this.unsafeImageUuidNotContains,
                        vmDiskWhereInput.unsafeImageUuidNotContains)
                && Objects.equals(
                        this.unsafeImageUuidNotEndsWith,
                        vmDiskWhereInput.unsafeImageUuidNotEndsWith)
                && Objects.equals(this.unsafeImageUuidNotIn, vmDiskWhereInput.unsafeImageUuidNotIn)
                && Objects.equals(
                        this.unsafeImageUuidNotStartsWith,
                        vmDiskWhereInput.unsafeImageUuidNotStartsWith)
                && Objects.equals(
                        this.unsafeImageUuidStartsWith, vmDiskWhereInput.unsafeImageUuidStartsWith)
                && Objects.equals(this.unsafeProvision, vmDiskWhereInput.unsafeProvision)
                && Objects.equals(
                        this.unsafeProvisionContains, vmDiskWhereInput.unsafeProvisionContains)
                && Objects.equals(
                        this.unsafeProvisionEndsWith, vmDiskWhereInput.unsafeProvisionEndsWith)
                && Objects.equals(this.unsafeProvisionGt, vmDiskWhereInput.unsafeProvisionGt)
                && Objects.equals(this.unsafeProvisionGte, vmDiskWhereInput.unsafeProvisionGte)
                && Objects.equals(this.unsafeProvisionIn, vmDiskWhereInput.unsafeProvisionIn)
                && Objects.equals(this.unsafeProvisionLt, vmDiskWhereInput.unsafeProvisionLt)
                && Objects.equals(this.unsafeProvisionLte, vmDiskWhereInput.unsafeProvisionLte)
                && Objects.equals(this.unsafeProvisionNot, vmDiskWhereInput.unsafeProvisionNot)
                && Objects.equals(
                        this.unsafeProvisionNotContains,
                        vmDiskWhereInput.unsafeProvisionNotContains)
                && Objects.equals(
                        this.unsafeProvisionNotEndsWith,
                        vmDiskWhereInput.unsafeProvisionNotEndsWith)
                && Objects.equals(this.unsafeProvisionNotIn, vmDiskWhereInput.unsafeProvisionNotIn)
                && Objects.equals(
                        this.unsafeProvisionNotStartsWith,
                        vmDiskWhereInput.unsafeProvisionNotStartsWith)
                && Objects.equals(
                        this.unsafeProvisionStartsWith, vmDiskWhereInput.unsafeProvisionStartsWith)
                && Objects.equals(this.vm, vmDiskWhereInput.vm)
                && Objects.equals(this.vmVolume, vmDiskWhereInput.vmVolume);
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
                boot,
                bootGt,
                bootGte,
                bootIn,
                bootLt,
                bootLte,
                bootNot,
                bootNotIn,
                bus,
                busIn,
                busNot,
                busNotIn,
                cloudInitImageName,
                cloudInitImageNameContains,
                cloudInitImageNameEndsWith,
                cloudInitImageNameGt,
                cloudInitImageNameGte,
                cloudInitImageNameIn,
                cloudInitImageNameLt,
                cloudInitImageNameLte,
                cloudInitImageNameNot,
                cloudInitImageNameNotContains,
                cloudInitImageNameNotEndsWith,
                cloudInitImageNameNotIn,
                cloudInitImageNameNotStartsWith,
                cloudInitImageNameStartsWith,
                cloudInitImagePath,
                cloudInitImagePathContains,
                cloudInitImagePathEndsWith,
                cloudInitImagePathGt,
                cloudInitImagePathGte,
                cloudInitImagePathIn,
                cloudInitImagePathLt,
                cloudInitImagePathLte,
                cloudInitImagePathNot,
                cloudInitImagePathNotContains,
                cloudInitImagePathNotEndsWith,
                cloudInitImagePathNotIn,
                cloudInitImagePathNotStartsWith,
                cloudInitImagePathStartsWith,
                device,
                deviceContains,
                deviceEndsWith,
                deviceGt,
                deviceGte,
                deviceIn,
                deviceLt,
                deviceLte,
                deviceNot,
                deviceNotContains,
                deviceNotEndsWith,
                deviceNotIn,
                deviceNotStartsWith,
                deviceStartsWith,
                disabled,
                disabledNot,
                elfImage,
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
                key,
                keyGt,
                keyGte,
                keyIn,
                keyLt,
                keyLte,
                keyNot,
                keyNotIn,
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
                svtImage,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                unsafeImagePath,
                unsafeImagePathContains,
                unsafeImagePathEndsWith,
                unsafeImagePathGt,
                unsafeImagePathGte,
                unsafeImagePathIn,
                unsafeImagePathLt,
                unsafeImagePathLte,
                unsafeImagePathNot,
                unsafeImagePathNotContains,
                unsafeImagePathNotEndsWith,
                unsafeImagePathNotIn,
                unsafeImagePathNotStartsWith,
                unsafeImagePathStartsWith,
                unsafeImageUuid,
                unsafeImageUuidContains,
                unsafeImageUuidEndsWith,
                unsafeImageUuidGt,
                unsafeImageUuidGte,
                unsafeImageUuidIn,
                unsafeImageUuidLt,
                unsafeImageUuidLte,
                unsafeImageUuidNot,
                unsafeImageUuidNotContains,
                unsafeImageUuidNotEndsWith,
                unsafeImageUuidNotIn,
                unsafeImageUuidNotStartsWith,
                unsafeImageUuidStartsWith,
                unsafeProvision,
                unsafeProvisionContains,
                unsafeProvisionEndsWith,
                unsafeProvisionGt,
                unsafeProvisionGte,
                unsafeProvisionIn,
                unsafeProvisionLt,
                unsafeProvisionLte,
                unsafeProvisionNot,
                unsafeProvisionNotContains,
                unsafeProvisionNotEndsWith,
                unsafeProvisionNotIn,
                unsafeProvisionNotStartsWith,
                unsafeProvisionStartsWith,
                vm,
                vmVolume);
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
        sb.append("class VmDiskWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    bootGt: ").append(toIndentedString(bootGt)).append("\n");
        sb.append("    bootGte: ").append(toIndentedString(bootGte)).append("\n");
        sb.append("    bootIn: ").append(toIndentedString(bootIn)).append("\n");
        sb.append("    bootLt: ").append(toIndentedString(bootLt)).append("\n");
        sb.append("    bootLte: ").append(toIndentedString(bootLte)).append("\n");
        sb.append("    bootNot: ").append(toIndentedString(bootNot)).append("\n");
        sb.append("    bootNotIn: ").append(toIndentedString(bootNotIn)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    busIn: ").append(toIndentedString(busIn)).append("\n");
        sb.append("    busNot: ").append(toIndentedString(busNot)).append("\n");
        sb.append("    busNotIn: ").append(toIndentedString(busNotIn)).append("\n");
        sb.append("    cloudInitImageName: ")
                .append(toIndentedString(cloudInitImageName))
                .append("\n");
        sb.append("    cloudInitImageNameContains: ")
                .append(toIndentedString(cloudInitImageNameContains))
                .append("\n");
        sb.append("    cloudInitImageNameEndsWith: ")
                .append(toIndentedString(cloudInitImageNameEndsWith))
                .append("\n");
        sb.append("    cloudInitImageNameGt: ")
                .append(toIndentedString(cloudInitImageNameGt))
                .append("\n");
        sb.append("    cloudInitImageNameGte: ")
                .append(toIndentedString(cloudInitImageNameGte))
                .append("\n");
        sb.append("    cloudInitImageNameIn: ")
                .append(toIndentedString(cloudInitImageNameIn))
                .append("\n");
        sb.append("    cloudInitImageNameLt: ")
                .append(toIndentedString(cloudInitImageNameLt))
                .append("\n");
        sb.append("    cloudInitImageNameLte: ")
                .append(toIndentedString(cloudInitImageNameLte))
                .append("\n");
        sb.append("    cloudInitImageNameNot: ")
                .append(toIndentedString(cloudInitImageNameNot))
                .append("\n");
        sb.append("    cloudInitImageNameNotContains: ")
                .append(toIndentedString(cloudInitImageNameNotContains))
                .append("\n");
        sb.append("    cloudInitImageNameNotEndsWith: ")
                .append(toIndentedString(cloudInitImageNameNotEndsWith))
                .append("\n");
        sb.append("    cloudInitImageNameNotIn: ")
                .append(toIndentedString(cloudInitImageNameNotIn))
                .append("\n");
        sb.append("    cloudInitImageNameNotStartsWith: ")
                .append(toIndentedString(cloudInitImageNameNotStartsWith))
                .append("\n");
        sb.append("    cloudInitImageNameStartsWith: ")
                .append(toIndentedString(cloudInitImageNameStartsWith))
                .append("\n");
        sb.append("    cloudInitImagePath: ")
                .append(toIndentedString(cloudInitImagePath))
                .append("\n");
        sb.append("    cloudInitImagePathContains: ")
                .append(toIndentedString(cloudInitImagePathContains))
                .append("\n");
        sb.append("    cloudInitImagePathEndsWith: ")
                .append(toIndentedString(cloudInitImagePathEndsWith))
                .append("\n");
        sb.append("    cloudInitImagePathGt: ")
                .append(toIndentedString(cloudInitImagePathGt))
                .append("\n");
        sb.append("    cloudInitImagePathGte: ")
                .append(toIndentedString(cloudInitImagePathGte))
                .append("\n");
        sb.append("    cloudInitImagePathIn: ")
                .append(toIndentedString(cloudInitImagePathIn))
                .append("\n");
        sb.append("    cloudInitImagePathLt: ")
                .append(toIndentedString(cloudInitImagePathLt))
                .append("\n");
        sb.append("    cloudInitImagePathLte: ")
                .append(toIndentedString(cloudInitImagePathLte))
                .append("\n");
        sb.append("    cloudInitImagePathNot: ")
                .append(toIndentedString(cloudInitImagePathNot))
                .append("\n");
        sb.append("    cloudInitImagePathNotContains: ")
                .append(toIndentedString(cloudInitImagePathNotContains))
                .append("\n");
        sb.append("    cloudInitImagePathNotEndsWith: ")
                .append(toIndentedString(cloudInitImagePathNotEndsWith))
                .append("\n");
        sb.append("    cloudInitImagePathNotIn: ")
                .append(toIndentedString(cloudInitImagePathNotIn))
                .append("\n");
        sb.append("    cloudInitImagePathNotStartsWith: ")
                .append(toIndentedString(cloudInitImagePathNotStartsWith))
                .append("\n");
        sb.append("    cloudInitImagePathStartsWith: ")
                .append(toIndentedString(cloudInitImagePathStartsWith))
                .append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    deviceContains: ").append(toIndentedString(deviceContains)).append("\n");
        sb.append("    deviceEndsWith: ").append(toIndentedString(deviceEndsWith)).append("\n");
        sb.append("    deviceGt: ").append(toIndentedString(deviceGt)).append("\n");
        sb.append("    deviceGte: ").append(toIndentedString(deviceGte)).append("\n");
        sb.append("    deviceIn: ").append(toIndentedString(deviceIn)).append("\n");
        sb.append("    deviceLt: ").append(toIndentedString(deviceLt)).append("\n");
        sb.append("    deviceLte: ").append(toIndentedString(deviceLte)).append("\n");
        sb.append("    deviceNot: ").append(toIndentedString(deviceNot)).append("\n");
        sb.append("    deviceNotContains: ")
                .append(toIndentedString(deviceNotContains))
                .append("\n");
        sb.append("    deviceNotEndsWith: ")
                .append(toIndentedString(deviceNotEndsWith))
                .append("\n");
        sb.append("    deviceNotIn: ").append(toIndentedString(deviceNotIn)).append("\n");
        sb.append("    deviceNotStartsWith: ")
                .append(toIndentedString(deviceNotStartsWith))
                .append("\n");
        sb.append("    deviceStartsWith: ").append(toIndentedString(deviceStartsWith)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    disabledNot: ").append(toIndentedString(disabledNot)).append("\n");
        sb.append("    elfImage: ").append(toIndentedString(elfImage)).append("\n");
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
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyGt: ").append(toIndentedString(keyGt)).append("\n");
        sb.append("    keyGte: ").append(toIndentedString(keyGte)).append("\n");
        sb.append("    keyIn: ").append(toIndentedString(keyIn)).append("\n");
        sb.append("    keyLt: ").append(toIndentedString(keyLt)).append("\n");
        sb.append("    keyLte: ").append(toIndentedString(keyLte)).append("\n");
        sb.append("    keyNot: ").append(toIndentedString(keyNot)).append("\n");
        sb.append("    keyNotIn: ").append(toIndentedString(keyNotIn)).append("\n");
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
        sb.append("    svtImage: ").append(toIndentedString(svtImage)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    unsafeImagePath: ").append(toIndentedString(unsafeImagePath)).append("\n");
        sb.append("    unsafeImagePathContains: ")
                .append(toIndentedString(unsafeImagePathContains))
                .append("\n");
        sb.append("    unsafeImagePathEndsWith: ")
                .append(toIndentedString(unsafeImagePathEndsWith))
                .append("\n");
        sb.append("    unsafeImagePathGt: ")
                .append(toIndentedString(unsafeImagePathGt))
                .append("\n");
        sb.append("    unsafeImagePathGte: ")
                .append(toIndentedString(unsafeImagePathGte))
                .append("\n");
        sb.append("    unsafeImagePathIn: ")
                .append(toIndentedString(unsafeImagePathIn))
                .append("\n");
        sb.append("    unsafeImagePathLt: ")
                .append(toIndentedString(unsafeImagePathLt))
                .append("\n");
        sb.append("    unsafeImagePathLte: ")
                .append(toIndentedString(unsafeImagePathLte))
                .append("\n");
        sb.append("    unsafeImagePathNot: ")
                .append(toIndentedString(unsafeImagePathNot))
                .append("\n");
        sb.append("    unsafeImagePathNotContains: ")
                .append(toIndentedString(unsafeImagePathNotContains))
                .append("\n");
        sb.append("    unsafeImagePathNotEndsWith: ")
                .append(toIndentedString(unsafeImagePathNotEndsWith))
                .append("\n");
        sb.append("    unsafeImagePathNotIn: ")
                .append(toIndentedString(unsafeImagePathNotIn))
                .append("\n");
        sb.append("    unsafeImagePathNotStartsWith: ")
                .append(toIndentedString(unsafeImagePathNotStartsWith))
                .append("\n");
        sb.append("    unsafeImagePathStartsWith: ")
                .append(toIndentedString(unsafeImagePathStartsWith))
                .append("\n");
        sb.append("    unsafeImageUuid: ").append(toIndentedString(unsafeImageUuid)).append("\n");
        sb.append("    unsafeImageUuidContains: ")
                .append(toIndentedString(unsafeImageUuidContains))
                .append("\n");
        sb.append("    unsafeImageUuidEndsWith: ")
                .append(toIndentedString(unsafeImageUuidEndsWith))
                .append("\n");
        sb.append("    unsafeImageUuidGt: ")
                .append(toIndentedString(unsafeImageUuidGt))
                .append("\n");
        sb.append("    unsafeImageUuidGte: ")
                .append(toIndentedString(unsafeImageUuidGte))
                .append("\n");
        sb.append("    unsafeImageUuidIn: ")
                .append(toIndentedString(unsafeImageUuidIn))
                .append("\n");
        sb.append("    unsafeImageUuidLt: ")
                .append(toIndentedString(unsafeImageUuidLt))
                .append("\n");
        sb.append("    unsafeImageUuidLte: ")
                .append(toIndentedString(unsafeImageUuidLte))
                .append("\n");
        sb.append("    unsafeImageUuidNot: ")
                .append(toIndentedString(unsafeImageUuidNot))
                .append("\n");
        sb.append("    unsafeImageUuidNotContains: ")
                .append(toIndentedString(unsafeImageUuidNotContains))
                .append("\n");
        sb.append("    unsafeImageUuidNotEndsWith: ")
                .append(toIndentedString(unsafeImageUuidNotEndsWith))
                .append("\n");
        sb.append("    unsafeImageUuidNotIn: ")
                .append(toIndentedString(unsafeImageUuidNotIn))
                .append("\n");
        sb.append("    unsafeImageUuidNotStartsWith: ")
                .append(toIndentedString(unsafeImageUuidNotStartsWith))
                .append("\n");
        sb.append("    unsafeImageUuidStartsWith: ")
                .append(toIndentedString(unsafeImageUuidStartsWith))
                .append("\n");
        sb.append("    unsafeProvision: ").append(toIndentedString(unsafeProvision)).append("\n");
        sb.append("    unsafeProvisionContains: ")
                .append(toIndentedString(unsafeProvisionContains))
                .append("\n");
        sb.append("    unsafeProvisionEndsWith: ")
                .append(toIndentedString(unsafeProvisionEndsWith))
                .append("\n");
        sb.append("    unsafeProvisionGt: ")
                .append(toIndentedString(unsafeProvisionGt))
                .append("\n");
        sb.append("    unsafeProvisionGte: ")
                .append(toIndentedString(unsafeProvisionGte))
                .append("\n");
        sb.append("    unsafeProvisionIn: ")
                .append(toIndentedString(unsafeProvisionIn))
                .append("\n");
        sb.append("    unsafeProvisionLt: ")
                .append(toIndentedString(unsafeProvisionLt))
                .append("\n");
        sb.append("    unsafeProvisionLte: ")
                .append(toIndentedString(unsafeProvisionLte))
                .append("\n");
        sb.append("    unsafeProvisionNot: ")
                .append(toIndentedString(unsafeProvisionNot))
                .append("\n");
        sb.append("    unsafeProvisionNotContains: ")
                .append(toIndentedString(unsafeProvisionNotContains))
                .append("\n");
        sb.append("    unsafeProvisionNotEndsWith: ")
                .append(toIndentedString(unsafeProvisionNotEndsWith))
                .append("\n");
        sb.append("    unsafeProvisionNotIn: ")
                .append(toIndentedString(unsafeProvisionNotIn))
                .append("\n");
        sb.append("    unsafeProvisionNotStartsWith: ")
                .append(toIndentedString(unsafeProvisionNotStartsWith))
                .append("\n");
        sb.append("    unsafeProvisionStartsWith: ")
                .append(toIndentedString(unsafeProvisionStartsWith))
                .append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
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

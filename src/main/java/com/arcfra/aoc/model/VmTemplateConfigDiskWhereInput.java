package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmTemplateConfigDiskWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmTemplateConfigDiskWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmTemplateConfigDiskWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmTemplateConfigDiskWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmTemplateConfigDiskWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_DISABLED_NOT = "disabled_not";

    @SerializedName(SERIALIZED_NAME_DISABLED_NOT)
    private Boolean disabledNot;

    public static final String SERIALIZED_NAME_DISK_NAME = "disk_name";

    @SerializedName(SERIALIZED_NAME_DISK_NAME)
    private String diskName;

    public static final String SERIALIZED_NAME_DISK_NAME_CONTAINS = "disk_name_contains";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_CONTAINS)
    private String diskNameContains;

    public static final String SERIALIZED_NAME_DISK_NAME_ENDS_WITH = "disk_name_ends_with";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_ENDS_WITH)
    private String diskNameEndsWith;

    public static final String SERIALIZED_NAME_DISK_NAME_GT = "disk_name_gt";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_GT)
    private String diskNameGt;

    public static final String SERIALIZED_NAME_DISK_NAME_GTE = "disk_name_gte";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_GTE)
    private String diskNameGte;

    public static final String SERIALIZED_NAME_DISK_NAME_IN = "disk_name_in";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_IN)
    private List<String> diskNameIn = null;

    public static final String SERIALIZED_NAME_DISK_NAME_LT = "disk_name_lt";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_LT)
    private String diskNameLt;

    public static final String SERIALIZED_NAME_DISK_NAME_LTE = "disk_name_lte";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_LTE)
    private String diskNameLte;

    public static final String SERIALIZED_NAME_DISK_NAME_NOT = "disk_name_not";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_NOT)
    private String diskNameNot;

    public static final String SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS = "disk_name_not_contains";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS)
    private String diskNameNotContains;

    public static final String SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH = "disk_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH)
    private String diskNameNotEndsWith;

    public static final String SERIALIZED_NAME_DISK_NAME_NOT_IN = "disk_name_not_in";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_NOT_IN)
    private List<String> diskNameNotIn = null;

    public static final String SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH =
            "disk_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH)
    private String diskNameNotStartsWith;

    public static final String SERIALIZED_NAME_DISK_NAME_STARTS_WITH = "disk_name_starts_with";

    @SerializedName(SERIALIZED_NAME_DISK_NAME_STARTS_WITH)
    private String diskNameStartsWith;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K = "elf_storage_policy_ec_k";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K)
    private Integer elfStoragePolicyEcK;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT =
            "elf_storage_policy_ec_k_gt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT)
    private Integer elfStoragePolicyEcKGt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE =
            "elf_storage_policy_ec_k_gte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE)
    private Integer elfStoragePolicyEcKGte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN =
            "elf_storage_policy_ec_k_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN)
    private List<Integer> elfStoragePolicyEcKIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT =
            "elf_storage_policy_ec_k_lt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT)
    private Integer elfStoragePolicyEcKLt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE =
            "elf_storage_policy_ec_k_lte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE)
    private Integer elfStoragePolicyEcKLte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT =
            "elf_storage_policy_ec_k_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT)
    private Integer elfStoragePolicyEcKNot;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN =
            "elf_storage_policy_ec_k_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN)
    private List<Integer> elfStoragePolicyEcKNotIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M = "elf_storage_policy_ec_m";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M)
    private Integer elfStoragePolicyEcM;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT =
            "elf_storage_policy_ec_m_gt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT)
    private Integer elfStoragePolicyEcMGt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE =
            "elf_storage_policy_ec_m_gte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE)
    private Integer elfStoragePolicyEcMGte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN =
            "elf_storage_policy_ec_m_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN)
    private List<Integer> elfStoragePolicyEcMIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT =
            "elf_storage_policy_ec_m_lt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT)
    private Integer elfStoragePolicyEcMLt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE =
            "elf_storage_policy_ec_m_lte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE)
    private Integer elfStoragePolicyEcMLte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT =
            "elf_storage_policy_ec_m_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT)
    private Integer elfStoragePolicyEcMNot;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN =
            "elf_storage_policy_ec_m_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN)
    private List<Integer> elfStoragePolicyEcMNotIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM =
            "elf_storage_policy_replica_num";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM)
    private Integer elfStoragePolicyReplicaNum;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT =
            "elf_storage_policy_replica_num_gt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT)
    private Integer elfStoragePolicyReplicaNumGt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE =
            "elf_storage_policy_replica_num_gte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE)
    private Integer elfStoragePolicyReplicaNumGte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN =
            "elf_storage_policy_replica_num_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN)
    private List<Integer> elfStoragePolicyReplicaNumIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT =
            "elf_storage_policy_replica_num_lt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT)
    private Integer elfStoragePolicyReplicaNumLt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE =
            "elf_storage_policy_replica_num_lte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE)
    private Integer elfStoragePolicyReplicaNumLte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT =
            "elf_storage_policy_replica_num_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT)
    private Integer elfStoragePolicyReplicaNumNot;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN =
            "elf_storage_policy_replica_num_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN)
    private List<Integer> elfStoragePolicyReplicaNumNotIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM =
            "elf_storage_policy_stripe_num";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM)
    private Integer elfStoragePolicyStripeNum;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT =
            "elf_storage_policy_stripe_num_gt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT)
    private Integer elfStoragePolicyStripeNumGt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE =
            "elf_storage_policy_stripe_num_gte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE)
    private Integer elfStoragePolicyStripeNumGte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN =
            "elf_storage_policy_stripe_num_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN)
    private List<Integer> elfStoragePolicyStripeNumIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT =
            "elf_storage_policy_stripe_num_lt";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT)
    private Integer elfStoragePolicyStripeNumLt;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE =
            "elf_storage_policy_stripe_num_lte";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE)
    private Integer elfStoragePolicyStripeNumLte;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT =
            "elf_storage_policy_stripe_num_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT)
    private Integer elfStoragePolicyStripeNumNot;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN =
            "elf_storage_policy_stripe_num_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN)
    private List<Integer> elfStoragePolicyStripeNumNotIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION =
            "elf_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION)
    private Boolean elfStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT =
            "elf_storage_policy_thin_provision_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT)
    private Boolean elfStoragePolicyThinProvisionNot;

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

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_INDEX_GT = "index_gt";

    @SerializedName(SERIALIZED_NAME_INDEX_GT)
    private Integer indexGt;

    public static final String SERIALIZED_NAME_INDEX_GTE = "index_gte";

    @SerializedName(SERIALIZED_NAME_INDEX_GTE)
    private Integer indexGte;

    public static final String SERIALIZED_NAME_INDEX_IN = "index_in";

    @SerializedName(SERIALIZED_NAME_INDEX_IN)
    private List<Integer> indexIn = null;

    public static final String SERIALIZED_NAME_INDEX_LT = "index_lt";

    @SerializedName(SERIALIZED_NAME_INDEX_LT)
    private Integer indexLt;

    public static final String SERIALIZED_NAME_INDEX_LTE = "index_lte";

    @SerializedName(SERIALIZED_NAME_INDEX_LTE)
    private Integer indexLte;

    public static final String SERIALIZED_NAME_INDEX_NOT = "index_not";

    @SerializedName(SERIALIZED_NAME_INDEX_NOT)
    private Integer indexNot;

    public static final String SERIALIZED_NAME_INDEX_NOT_IN = "index_not_in";

    @SerializedName(SERIALIZED_NAME_INDEX_NOT_IN)
    private List<Integer> indexNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN = "iscsi_lun";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN)
    private IscsiLunWhereInput iscsiLun;

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

    public static final String SERIALIZED_NAME_PROVISION_POLICY = "provision_policy";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY)
    private String provisionPolicy;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_CONTAINS =
            "provision_policy_contains";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_CONTAINS)
    private String provisionPolicyContains;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH =
            "provision_policy_ends_with";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH)
    private String provisionPolicyEndsWith;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_GT = "provision_policy_gt";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_GT)
    private String provisionPolicyGt;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_GTE = "provision_policy_gte";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_GTE)
    private String provisionPolicyGte;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_IN = "provision_policy_in";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_IN)
    private List<String> provisionPolicyIn = null;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_LT = "provision_policy_lt";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_LT)
    private String provisionPolicyLt;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_LTE = "provision_policy_lte";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_LTE)
    private String provisionPolicyLte;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_NOT = "provision_policy_not";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_NOT)
    private String provisionPolicyNot;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS =
            "provision_policy_not_contains";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS)
    private String provisionPolicyNotContains;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH =
            "provision_policy_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH)
    private String provisionPolicyNotEndsWith;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_NOT_IN = "provision_policy_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_NOT_IN)
    private List<String> provisionPolicyNotIn = null;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH =
            "provision_policy_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH)
    private String provisionPolicyNotStartsWith;

    public static final String SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH =
            "provision_policy_starts_with";

    @SerializedName(SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH)
    private String provisionPolicyStartsWith;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT = "resident_in_cache_not";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT)
    private Boolean residentInCacheNot;

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

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "storage_encrypted";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
    private Boolean storageEncrypted;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT = "storage_encrypted_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT)
    private Boolean storageEncryptedNot;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM =
            "storage_encryption_algorithm";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM)
    private String storageEncryptionAlgorithm;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS =
            "storage_encryption_algorithm_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS)
    private String storageEncryptionAlgorithmContains;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH =
            "storage_encryption_algorithm_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH)
    private String storageEncryptionAlgorithmEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT =
            "storage_encryption_algorithm_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT)
    private String storageEncryptionAlgorithmGt;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE =
            "storage_encryption_algorithm_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE)
    private String storageEncryptionAlgorithmGte;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN =
            "storage_encryption_algorithm_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN)
    private List<String> storageEncryptionAlgorithmIn = null;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT =
            "storage_encryption_algorithm_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT)
    private String storageEncryptionAlgorithmLt;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE =
            "storage_encryption_algorithm_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE)
    private String storageEncryptionAlgorithmLte;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT =
            "storage_encryption_algorithm_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT)
    private String storageEncryptionAlgorithmNot;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS =
            "storage_encryption_algorithm_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS)
    private String storageEncryptionAlgorithmNotContains;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH =
            "storage_encryption_algorithm_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH)
    private String storageEncryptionAlgorithmNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN =
            "storage_encryption_algorithm_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN)
    private List<String> storageEncryptionAlgorithmNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH =
            "storage_encryption_algorithm_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH)
    private String storageEncryptionAlgorithmNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH =
            "storage_encryption_algorithm_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH)
    private String storageEncryptionAlgorithmStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType storagePolicy;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_IN = "storage_policy_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_IN)
    private List<VmVolumeElfStoragePolicyType> storagePolicyIn = null;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_NOT = "storage_policy_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NOT)
    private VmVolumeElfStoragePolicyType storagePolicyNot;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_NOT_IN = "storage_policy_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN)
    private List<VmVolumeElfStoragePolicyType> storagePolicyNotIn = null;

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

    public static final String SERIALIZED_NAME_VM_TEMPLATE_CONFIG = "vm_template_config";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_CONFIG)
    private VmTemplateConfigWhereInput vmTemplateConfig;

    public static final String SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE =
            "vm_volume_template_config_file";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE)
    private VmVolumeTemplateConfigFileWhereInput vmVolumeTemplateConfigFile;

    public static final String SERIALIZED_NAME_VOLUME_STORAGE_TYPE = "volume_storage_type";

    @SerializedName(SERIALIZED_NAME_VOLUME_STORAGE_TYPE)
    private VmTemplateConfigDiskVolumeStorageType volumeStorageType;

    public static final String SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN = "volume_storage_type_in";

    @SerializedName(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN)
    private List<VmTemplateConfigDiskVolumeStorageType> volumeStorageTypeIn = null;

    public static final String SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT = "volume_storage_type_not";

    @SerializedName(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT)
    private VmTemplateConfigDiskVolumeStorageType volumeStorageTypeNot;

    public static final String SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN =
            "volume_storage_type_not_in";

    @SerializedName(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN)
    private List<VmTemplateConfigDiskVolumeStorageType> volumeStorageTypeNotIn = null;

    public VmTemplateConfigDiskWhereInput() {}

    public VmTemplateConfigDiskWhereInput AND(List<VmTemplateConfigDiskWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addANDItem(VmTemplateConfigDiskWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmTemplateConfigDiskWhereInput>();
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
    public List<VmTemplateConfigDiskWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmTemplateConfigDiskWhereInput> AND) {
        this.AND = AND;
    }

    public VmTemplateConfigDiskWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmTemplateConfigDiskWhereInput AND_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput NOT(List<VmTemplateConfigDiskWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addNOTItem(VmTemplateConfigDiskWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmTemplateConfigDiskWhereInput>();
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
    public List<VmTemplateConfigDiskWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmTemplateConfigDiskWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmTemplateConfigDiskWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmTemplateConfigDiskWhereInput NOT_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput OR(List<VmTemplateConfigDiskWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addORItem(VmTemplateConfigDiskWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmTemplateConfigDiskWhereInput>();
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
    public List<VmTemplateConfigDiskWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmTemplateConfigDiskWhereInput> OR) {
        this.OR = OR;
    }

    public VmTemplateConfigDiskWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmTemplateConfigDiskWhereInput OR_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput boot(Integer boot) {

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

    public VmTemplateConfigDiskWhereInput boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput boot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootGt(Integer bootGt) {

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

    public VmTemplateConfigDiskWhereInput bootGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootGt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootGte(Integer bootGte) {

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

    public VmTemplateConfigDiskWhereInput bootGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootGte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootIn(List<Integer> bootIn) {

        this.bootIn = bootIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addBootInItem(Integer bootInItem) {
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

    public VmTemplateConfigDiskWhereInput bootIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootLt(Integer bootLt) {

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

    public VmTemplateConfigDiskWhereInput bootLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootLt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootLte(Integer bootLte) {

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

    public VmTemplateConfigDiskWhereInput bootLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootLte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootNot(Integer bootNot) {

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

    public VmTemplateConfigDiskWhereInput bootNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bootNotIn(List<Integer> bootNotIn) {

        this.bootNotIn = bootNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addBootNotInItem(Integer bootNotInItem) {
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

    public VmTemplateConfigDiskWhereInput bootNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bootNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput bus(Bus bus) {

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

    public VmTemplateConfigDiskWhereInput bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput bus_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput busIn(List<Bus> busIn) {

        this.busIn = busIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addBusInItem(Bus busInItem) {
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

    public VmTemplateConfigDiskWhereInput busIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput busIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput busNot(Bus busNot) {

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

    public VmTemplateConfigDiskWhereInput busNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput busNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput busNotIn(List<Bus> busNotIn) {

        this.busNotIn = busNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addBusNotInItem(Bus busNotInItem) {
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

    public VmTemplateConfigDiskWhereInput busNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput busNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput disabled(Boolean disabled) {

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

    public VmTemplateConfigDiskWhereInput disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public VmTemplateConfigDiskWhereInput disabled_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput disabledNot(Boolean disabledNot) {

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

    public VmTemplateConfigDiskWhereInput disabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput disabledNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput diskName(String diskName) {

        this.diskName = diskName;
        return this;
    }

    /**
     * Get diskName
     *
     * @return diskName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public VmTemplateConfigDiskWhereInput diskName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public void setDiskName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME);
        }
    }

    public boolean getDiskName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME);
    }

    public VmTemplateConfigDiskWhereInput diskNameContains(String diskNameContains) {

        this.diskNameContains = diskNameContains;
        return this;
    }

    /**
     * Get diskNameContains
     *
     * @return diskNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameContains() {
        return diskNameContains;
    }

    public void setDiskNameContains(String diskNameContains) {
        this.diskNameContains = diskNameContains;
    }

    public VmTemplateConfigDiskWhereInput diskNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_CONTAINS);
        return this;
    }

    public void setDiskNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_CONTAINS);
        }
    }

    public boolean getDiskNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_CONTAINS);
    }

    public VmTemplateConfigDiskWhereInput diskNameEndsWith(String diskNameEndsWith) {

        this.diskNameEndsWith = diskNameEndsWith;
        return this;
    }

    /**
     * Get diskNameEndsWith
     *
     * @return diskNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameEndsWith() {
        return diskNameEndsWith;
    }

    public void setDiskNameEndsWith(String diskNameEndsWith) {
        this.diskNameEndsWith = diskNameEndsWith;
    }

    public VmTemplateConfigDiskWhereInput diskNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_ENDS_WITH);
        return this;
    }

    public void setDiskNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_ENDS_WITH);
        }
    }

    public boolean getDiskNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_ENDS_WITH);
    }

    public VmTemplateConfigDiskWhereInput diskNameGt(String diskNameGt) {

        this.diskNameGt = diskNameGt;
        return this;
    }

    /**
     * Get diskNameGt
     *
     * @return diskNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameGt() {
        return diskNameGt;
    }

    public void setDiskNameGt(String diskNameGt) {
        this.diskNameGt = diskNameGt;
    }

    public VmTemplateConfigDiskWhereInput diskNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_GT);
        return this;
    }

    public void setDiskNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_GT);
        }
    }

    public boolean getDiskNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_GT);
    }

    public VmTemplateConfigDiskWhereInput diskNameGte(String diskNameGte) {

        this.diskNameGte = diskNameGte;
        return this;
    }

    /**
     * Get diskNameGte
     *
     * @return diskNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameGte() {
        return diskNameGte;
    }

    public void setDiskNameGte(String diskNameGte) {
        this.diskNameGte = diskNameGte;
    }

    public VmTemplateConfigDiskWhereInput diskNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_GTE);
        return this;
    }

    public void setDiskNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_GTE);
        }
    }

    public boolean getDiskNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_GTE);
    }

    public VmTemplateConfigDiskWhereInput diskNameIn(List<String> diskNameIn) {

        this.diskNameIn = diskNameIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addDiskNameInItem(String diskNameInItem) {
        if (this.diskNameIn == null) {
            this.diskNameIn = new ArrayList<String>();
        }
        this.diskNameIn.add(diskNameInItem);
        return this;
    }

    /**
     * Get diskNameIn
     *
     * @return diskNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDiskNameIn() {
        return diskNameIn;
    }

    public void setDiskNameIn(List<String> diskNameIn) {
        this.diskNameIn = diskNameIn;
    }

    public VmTemplateConfigDiskWhereInput diskNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_IN);
        return this;
    }

    public void setDiskNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_IN);
        }
    }

    public boolean getDiskNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_IN);
    }

    public VmTemplateConfigDiskWhereInput diskNameLt(String diskNameLt) {

        this.diskNameLt = diskNameLt;
        return this;
    }

    /**
     * Get diskNameLt
     *
     * @return diskNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameLt() {
        return diskNameLt;
    }

    public void setDiskNameLt(String diskNameLt) {
        this.diskNameLt = diskNameLt;
    }

    public VmTemplateConfigDiskWhereInput diskNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_LT);
        return this;
    }

    public void setDiskNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_LT);
        }
    }

    public boolean getDiskNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_LT);
    }

    public VmTemplateConfigDiskWhereInput diskNameLte(String diskNameLte) {

        this.diskNameLte = diskNameLte;
        return this;
    }

    /**
     * Get diskNameLte
     *
     * @return diskNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameLte() {
        return diskNameLte;
    }

    public void setDiskNameLte(String diskNameLte) {
        this.diskNameLte = diskNameLte;
    }

    public VmTemplateConfigDiskWhereInput diskNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_LTE);
        return this;
    }

    public void setDiskNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_LTE);
        }
    }

    public boolean getDiskNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_LTE);
    }

    public VmTemplateConfigDiskWhereInput diskNameNot(String diskNameNot) {

        this.diskNameNot = diskNameNot;
        return this;
    }

    /**
     * Get diskNameNot
     *
     * @return diskNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameNot() {
        return diskNameNot;
    }

    public void setDiskNameNot(String diskNameNot) {
        this.diskNameNot = diskNameNot;
    }

    public VmTemplateConfigDiskWhereInput diskNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT);
        return this;
    }

    public void setDiskNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT);
        }
    }

    public boolean getDiskNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_NOT);
    }

    public VmTemplateConfigDiskWhereInput diskNameNotContains(String diskNameNotContains) {

        this.diskNameNotContains = diskNameNotContains;
        return this;
    }

    /**
     * Get diskNameNotContains
     *
     * @return diskNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameNotContains() {
        return diskNameNotContains;
    }

    public void setDiskNameNotContains(String diskNameNotContains) {
        this.diskNameNotContains = diskNameNotContains;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS);
        return this;
    }

    public void setDiskNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS);
        }
    }

    public boolean getDiskNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_NOT_CONTAINS);
    }

    public VmTemplateConfigDiskWhereInput diskNameNotEndsWith(String diskNameNotEndsWith) {

        this.diskNameNotEndsWith = diskNameNotEndsWith;
        return this;
    }

    /**
     * Get diskNameNotEndsWith
     *
     * @return diskNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameNotEndsWith() {
        return diskNameNotEndsWith;
    }

    public void setDiskNameNotEndsWith(String diskNameNotEndsWith) {
        this.diskNameNotEndsWith = diskNameNotEndsWith;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setDiskNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getDiskNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_NOT_ENDS_WITH);
    }

    public VmTemplateConfigDiskWhereInput diskNameNotIn(List<String> diskNameNotIn) {

        this.diskNameNotIn = diskNameNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addDiskNameNotInItem(String diskNameNotInItem) {
        if (this.diskNameNotIn == null) {
            this.diskNameNotIn = new ArrayList<String>();
        }
        this.diskNameNotIn.add(diskNameNotInItem);
        return this;
    }

    /**
     * Get diskNameNotIn
     *
     * @return diskNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDiskNameNotIn() {
        return diskNameNotIn;
    }

    public void setDiskNameNotIn(List<String> diskNameNotIn) {
        this.diskNameNotIn = diskNameNotIn;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_IN);
        return this;
    }

    public void setDiskNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_IN);
        }
    }

    public boolean getDiskNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput diskNameNotStartsWith(String diskNameNotStartsWith) {

        this.diskNameNotStartsWith = diskNameNotStartsWith;
        return this;
    }

    /**
     * Get diskNameNotStartsWith
     *
     * @return diskNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameNotStartsWith() {
        return diskNameNotStartsWith;
    }

    public void setDiskNameNotStartsWith(String diskNameNotStartsWith) {
        this.diskNameNotStartsWith = diskNameNotStartsWith;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setDiskNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getDiskNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_NOT_STARTS_WITH);
    }

    public VmTemplateConfigDiskWhereInput diskNameStartsWith(String diskNameStartsWith) {

        this.diskNameStartsWith = diskNameStartsWith;
        return this;
    }

    /**
     * Get diskNameStartsWith
     *
     * @return diskNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskNameStartsWith() {
        return diskNameStartsWith;
    }

    public void setDiskNameStartsWith(String diskNameStartsWith) {
        this.diskNameStartsWith = diskNameStartsWith;
    }

    public VmTemplateConfigDiskWhereInput diskNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput diskNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_STARTS_WITH);
        return this;
    }

    public void setDiskNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME_STARTS_WITH);
        }
    }

    public boolean getDiskNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME_STARTS_WITH);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcK(Integer elfStoragePolicyEcK) {

        this.elfStoragePolicyEcK = elfStoragePolicyEcK;
        return this;
    }

    /**
     * Get elfStoragePolicyEcK
     *
     * @return elfStoragePolicyEcK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcK() {
        return elfStoragePolicyEcK;
    }

    public void setElfStoragePolicyEcK(Integer elfStoragePolicyEcK) {
        this.elfStoragePolicyEcK = elfStoragePolicyEcK;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public void setElfStoragePolicyEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        }
    }

    public boolean getElfStoragePolicyEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKGt(Integer elfStoragePolicyEcKGt) {

        this.elfStoragePolicyEcKGt = elfStoragePolicyEcKGt;
        return this;
    }

    /**
     * Get elfStoragePolicyEcKGt
     *
     * @return elfStoragePolicyEcKGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcKGt() {
        return elfStoragePolicyEcKGt;
    }

    public void setElfStoragePolicyEcKGt(Integer elfStoragePolicyEcKGt) {
        this.elfStoragePolicyEcKGt = elfStoragePolicyEcKGt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public void setElfStoragePolicyEcKGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT);
        }
    }

    public boolean getElfStoragePolicyEcKGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKGte(Integer elfStoragePolicyEcKGte) {

        this.elfStoragePolicyEcKGte = elfStoragePolicyEcKGte;
        return this;
    }

    /**
     * Get elfStoragePolicyEcKGte
     *
     * @return elfStoragePolicyEcKGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcKGte() {
        return elfStoragePolicyEcKGte;
    }

    public void setElfStoragePolicyEcKGte(Integer elfStoragePolicyEcKGte) {
        this.elfStoragePolicyEcKGte = elfStoragePolicyEcKGte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public void setElfStoragePolicyEcKGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE);
        }
    }

    public boolean getElfStoragePolicyEcKGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKIn(
            List<Integer> elfStoragePolicyEcKIn) {

        this.elfStoragePolicyEcKIn = elfStoragePolicyEcKIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyEcKInItem(
            Integer elfStoragePolicyEcKInItem) {
        if (this.elfStoragePolicyEcKIn == null) {
            this.elfStoragePolicyEcKIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyEcKIn.add(elfStoragePolicyEcKInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyEcKIn
     *
     * @return elfStoragePolicyEcKIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyEcKIn() {
        return elfStoragePolicyEcKIn;
    }

    public void setElfStoragePolicyEcKIn(List<Integer> elfStoragePolicyEcKIn) {
        this.elfStoragePolicyEcKIn = elfStoragePolicyEcKIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public void setElfStoragePolicyEcKIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN);
        }
    }

    public boolean getElfStoragePolicyEcKIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKLt(Integer elfStoragePolicyEcKLt) {

        this.elfStoragePolicyEcKLt = elfStoragePolicyEcKLt;
        return this;
    }

    /**
     * Get elfStoragePolicyEcKLt
     *
     * @return elfStoragePolicyEcKLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcKLt() {
        return elfStoragePolicyEcKLt;
    }

    public void setElfStoragePolicyEcKLt(Integer elfStoragePolicyEcKLt) {
        this.elfStoragePolicyEcKLt = elfStoragePolicyEcKLt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public void setElfStoragePolicyEcKLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT);
        }
    }

    public boolean getElfStoragePolicyEcKLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKLte(Integer elfStoragePolicyEcKLte) {

        this.elfStoragePolicyEcKLte = elfStoragePolicyEcKLte;
        return this;
    }

    /**
     * Get elfStoragePolicyEcKLte
     *
     * @return elfStoragePolicyEcKLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcKLte() {
        return elfStoragePolicyEcKLte;
    }

    public void setElfStoragePolicyEcKLte(Integer elfStoragePolicyEcKLte) {
        this.elfStoragePolicyEcKLte = elfStoragePolicyEcKLte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public void setElfStoragePolicyEcKLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE);
        }
    }

    public boolean getElfStoragePolicyEcKLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKNot(Integer elfStoragePolicyEcKNot) {

        this.elfStoragePolicyEcKNot = elfStoragePolicyEcKNot;
        return this;
    }

    /**
     * Get elfStoragePolicyEcKNot
     *
     * @return elfStoragePolicyEcKNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcKNot() {
        return elfStoragePolicyEcKNot;
    }

    public void setElfStoragePolicyEcKNot(Integer elfStoragePolicyEcKNot) {
        this.elfStoragePolicyEcKNot = elfStoragePolicyEcKNot;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public void setElfStoragePolicyEcKNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT);
        }
    }

    public boolean getElfStoragePolicyEcKNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKNotIn(
            List<Integer> elfStoragePolicyEcKNotIn) {

        this.elfStoragePolicyEcKNotIn = elfStoragePolicyEcKNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyEcKNotInItem(
            Integer elfStoragePolicyEcKNotInItem) {
        if (this.elfStoragePolicyEcKNotIn == null) {
            this.elfStoragePolicyEcKNotIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyEcKNotIn.add(elfStoragePolicyEcKNotInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyEcKNotIn
     *
     * @return elfStoragePolicyEcKNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyEcKNotIn() {
        return elfStoragePolicyEcKNotIn;
    }

    public void setElfStoragePolicyEcKNotIn(List<Integer> elfStoragePolicyEcKNotIn) {
        this.elfStoragePolicyEcKNotIn = elfStoragePolicyEcKNotIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcKNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public void setElfStoragePolicyEcKNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN);
        }
    }

    public boolean getElfStoragePolicyEcKNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcM(Integer elfStoragePolicyEcM) {

        this.elfStoragePolicyEcM = elfStoragePolicyEcM;
        return this;
    }

    /**
     * Get elfStoragePolicyEcM
     *
     * @return elfStoragePolicyEcM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcM() {
        return elfStoragePolicyEcM;
    }

    public void setElfStoragePolicyEcM(Integer elfStoragePolicyEcM) {
        this.elfStoragePolicyEcM = elfStoragePolicyEcM;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public void setElfStoragePolicyEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        }
    }

    public boolean getElfStoragePolicyEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMGt(Integer elfStoragePolicyEcMGt) {

        this.elfStoragePolicyEcMGt = elfStoragePolicyEcMGt;
        return this;
    }

    /**
     * Get elfStoragePolicyEcMGt
     *
     * @return elfStoragePolicyEcMGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcMGt() {
        return elfStoragePolicyEcMGt;
    }

    public void setElfStoragePolicyEcMGt(Integer elfStoragePolicyEcMGt) {
        this.elfStoragePolicyEcMGt = elfStoragePolicyEcMGt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public void setElfStoragePolicyEcMGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT);
        }
    }

    public boolean getElfStoragePolicyEcMGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMGte(Integer elfStoragePolicyEcMGte) {

        this.elfStoragePolicyEcMGte = elfStoragePolicyEcMGte;
        return this;
    }

    /**
     * Get elfStoragePolicyEcMGte
     *
     * @return elfStoragePolicyEcMGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcMGte() {
        return elfStoragePolicyEcMGte;
    }

    public void setElfStoragePolicyEcMGte(Integer elfStoragePolicyEcMGte) {
        this.elfStoragePolicyEcMGte = elfStoragePolicyEcMGte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public void setElfStoragePolicyEcMGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE);
        }
    }

    public boolean getElfStoragePolicyEcMGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMIn(
            List<Integer> elfStoragePolicyEcMIn) {

        this.elfStoragePolicyEcMIn = elfStoragePolicyEcMIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyEcMInItem(
            Integer elfStoragePolicyEcMInItem) {
        if (this.elfStoragePolicyEcMIn == null) {
            this.elfStoragePolicyEcMIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyEcMIn.add(elfStoragePolicyEcMInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyEcMIn
     *
     * @return elfStoragePolicyEcMIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyEcMIn() {
        return elfStoragePolicyEcMIn;
    }

    public void setElfStoragePolicyEcMIn(List<Integer> elfStoragePolicyEcMIn) {
        this.elfStoragePolicyEcMIn = elfStoragePolicyEcMIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public void setElfStoragePolicyEcMIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN);
        }
    }

    public boolean getElfStoragePolicyEcMIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMLt(Integer elfStoragePolicyEcMLt) {

        this.elfStoragePolicyEcMLt = elfStoragePolicyEcMLt;
        return this;
    }

    /**
     * Get elfStoragePolicyEcMLt
     *
     * @return elfStoragePolicyEcMLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcMLt() {
        return elfStoragePolicyEcMLt;
    }

    public void setElfStoragePolicyEcMLt(Integer elfStoragePolicyEcMLt) {
        this.elfStoragePolicyEcMLt = elfStoragePolicyEcMLt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public void setElfStoragePolicyEcMLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT);
        }
    }

    public boolean getElfStoragePolicyEcMLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMLte(Integer elfStoragePolicyEcMLte) {

        this.elfStoragePolicyEcMLte = elfStoragePolicyEcMLte;
        return this;
    }

    /**
     * Get elfStoragePolicyEcMLte
     *
     * @return elfStoragePolicyEcMLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcMLte() {
        return elfStoragePolicyEcMLte;
    }

    public void setElfStoragePolicyEcMLte(Integer elfStoragePolicyEcMLte) {
        this.elfStoragePolicyEcMLte = elfStoragePolicyEcMLte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public void setElfStoragePolicyEcMLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE);
        }
    }

    public boolean getElfStoragePolicyEcMLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMNot(Integer elfStoragePolicyEcMNot) {

        this.elfStoragePolicyEcMNot = elfStoragePolicyEcMNot;
        return this;
    }

    /**
     * Get elfStoragePolicyEcMNot
     *
     * @return elfStoragePolicyEcMNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcMNot() {
        return elfStoragePolicyEcMNot;
    }

    public void setElfStoragePolicyEcMNot(Integer elfStoragePolicyEcMNot) {
        this.elfStoragePolicyEcMNot = elfStoragePolicyEcMNot;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public void setElfStoragePolicyEcMNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT);
        }
    }

    public boolean getElfStoragePolicyEcMNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMNotIn(
            List<Integer> elfStoragePolicyEcMNotIn) {

        this.elfStoragePolicyEcMNotIn = elfStoragePolicyEcMNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyEcMNotInItem(
            Integer elfStoragePolicyEcMNotInItem) {
        if (this.elfStoragePolicyEcMNotIn == null) {
            this.elfStoragePolicyEcMNotIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyEcMNotIn.add(elfStoragePolicyEcMNotInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyEcMNotIn
     *
     * @return elfStoragePolicyEcMNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyEcMNotIn() {
        return elfStoragePolicyEcMNotIn;
    }

    public void setElfStoragePolicyEcMNotIn(List<Integer> elfStoragePolicyEcMNotIn) {
        this.elfStoragePolicyEcMNotIn = elfStoragePolicyEcMNotIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyEcMNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public void setElfStoragePolicyEcMNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN);
        }
    }

    public boolean getElfStoragePolicyEcMNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNum(
            Integer elfStoragePolicyReplicaNum) {

        this.elfStoragePolicyReplicaNum = elfStoragePolicyReplicaNum;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNum
     *
     * @return elfStoragePolicyReplicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNum() {
        return elfStoragePolicyReplicaNum;
    }

    public void setElfStoragePolicyReplicaNum(Integer elfStoragePolicyReplicaNum) {
        this.elfStoragePolicyReplicaNum = elfStoragePolicyReplicaNum;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public void setElfStoragePolicyReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        }
    }

    public boolean getElfStoragePolicyReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumGt(
            Integer elfStoragePolicyReplicaNumGt) {

        this.elfStoragePolicyReplicaNumGt = elfStoragePolicyReplicaNumGt;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumGt
     *
     * @return elfStoragePolicyReplicaNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNumGt() {
        return elfStoragePolicyReplicaNumGt;
    }

    public void setElfStoragePolicyReplicaNumGt(Integer elfStoragePolicyReplicaNumGt) {
        this.elfStoragePolicyReplicaNumGt = elfStoragePolicyReplicaNumGt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public void setElfStoragePolicyReplicaNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT);
        }
    }

    public boolean getElfStoragePolicyReplicaNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumGte(
            Integer elfStoragePolicyReplicaNumGte) {

        this.elfStoragePolicyReplicaNumGte = elfStoragePolicyReplicaNumGte;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumGte
     *
     * @return elfStoragePolicyReplicaNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNumGte() {
        return elfStoragePolicyReplicaNumGte;
    }

    public void setElfStoragePolicyReplicaNumGte(Integer elfStoragePolicyReplicaNumGte) {
        this.elfStoragePolicyReplicaNumGte = elfStoragePolicyReplicaNumGte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public void setElfStoragePolicyReplicaNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE);
        }
    }

    public boolean getElfStoragePolicyReplicaNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumIn(
            List<Integer> elfStoragePolicyReplicaNumIn) {

        this.elfStoragePolicyReplicaNumIn = elfStoragePolicyReplicaNumIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyReplicaNumInItem(
            Integer elfStoragePolicyReplicaNumInItem) {
        if (this.elfStoragePolicyReplicaNumIn == null) {
            this.elfStoragePolicyReplicaNumIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyReplicaNumIn.add(elfStoragePolicyReplicaNumInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumIn
     *
     * @return elfStoragePolicyReplicaNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyReplicaNumIn() {
        return elfStoragePolicyReplicaNumIn;
    }

    public void setElfStoragePolicyReplicaNumIn(List<Integer> elfStoragePolicyReplicaNumIn) {
        this.elfStoragePolicyReplicaNumIn = elfStoragePolicyReplicaNumIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public void setElfStoragePolicyReplicaNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN);
        }
    }

    public boolean getElfStoragePolicyReplicaNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumLt(
            Integer elfStoragePolicyReplicaNumLt) {

        this.elfStoragePolicyReplicaNumLt = elfStoragePolicyReplicaNumLt;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumLt
     *
     * @return elfStoragePolicyReplicaNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNumLt() {
        return elfStoragePolicyReplicaNumLt;
    }

    public void setElfStoragePolicyReplicaNumLt(Integer elfStoragePolicyReplicaNumLt) {
        this.elfStoragePolicyReplicaNumLt = elfStoragePolicyReplicaNumLt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public void setElfStoragePolicyReplicaNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT);
        }
    }

    public boolean getElfStoragePolicyReplicaNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumLte(
            Integer elfStoragePolicyReplicaNumLte) {

        this.elfStoragePolicyReplicaNumLte = elfStoragePolicyReplicaNumLte;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumLte
     *
     * @return elfStoragePolicyReplicaNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNumLte() {
        return elfStoragePolicyReplicaNumLte;
    }

    public void setElfStoragePolicyReplicaNumLte(Integer elfStoragePolicyReplicaNumLte) {
        this.elfStoragePolicyReplicaNumLte = elfStoragePolicyReplicaNumLte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public void setElfStoragePolicyReplicaNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE);
        }
    }

    public boolean getElfStoragePolicyReplicaNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumNot(
            Integer elfStoragePolicyReplicaNumNot) {

        this.elfStoragePolicyReplicaNumNot = elfStoragePolicyReplicaNumNot;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumNot
     *
     * @return elfStoragePolicyReplicaNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNumNot() {
        return elfStoragePolicyReplicaNumNot;
    }

    public void setElfStoragePolicyReplicaNumNot(Integer elfStoragePolicyReplicaNumNot) {
        this.elfStoragePolicyReplicaNumNot = elfStoragePolicyReplicaNumNot;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public void setElfStoragePolicyReplicaNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT);
        }
    }

    public boolean getElfStoragePolicyReplicaNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumNotIn(
            List<Integer> elfStoragePolicyReplicaNumNotIn) {

        this.elfStoragePolicyReplicaNumNotIn = elfStoragePolicyReplicaNumNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyReplicaNumNotInItem(
            Integer elfStoragePolicyReplicaNumNotInItem) {
        if (this.elfStoragePolicyReplicaNumNotIn == null) {
            this.elfStoragePolicyReplicaNumNotIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyReplicaNumNotIn.add(elfStoragePolicyReplicaNumNotInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNumNotIn
     *
     * @return elfStoragePolicyReplicaNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyReplicaNumNotIn() {
        return elfStoragePolicyReplicaNumNotIn;
    }

    public void setElfStoragePolicyReplicaNumNotIn(List<Integer> elfStoragePolicyReplicaNumNotIn) {
        this.elfStoragePolicyReplicaNumNotIn = elfStoragePolicyReplicaNumNotIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyReplicaNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public void setElfStoragePolicyReplicaNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        }
    }

    public boolean getElfStoragePolicyReplicaNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNum(
            Integer elfStoragePolicyStripeNum) {

        this.elfStoragePolicyStripeNum = elfStoragePolicyStripeNum;
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNum
     *
     * @return elfStoragePolicyStripeNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyStripeNum() {
        return elfStoragePolicyStripeNum;
    }

    public void setElfStoragePolicyStripeNum(Integer elfStoragePolicyStripeNum) {
        this.elfStoragePolicyStripeNum = elfStoragePolicyStripeNum;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public void setElfStoragePolicyStripeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM);
        }
    }

    public boolean getElfStoragePolicyStripeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumGt(
            Integer elfStoragePolicyStripeNumGt) {

        this.elfStoragePolicyStripeNumGt = elfStoragePolicyStripeNumGt;
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumGt
     *
     * @return elfStoragePolicyStripeNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyStripeNumGt() {
        return elfStoragePolicyStripeNumGt;
    }

    public void setElfStoragePolicyStripeNumGt(Integer elfStoragePolicyStripeNumGt) {
        this.elfStoragePolicyStripeNumGt = elfStoragePolicyStripeNumGt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT);
        return this;
    }

    public void setElfStoragePolicyStripeNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT);
        }
    }

    public boolean getElfStoragePolicyStripeNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumGte(
            Integer elfStoragePolicyStripeNumGte) {

        this.elfStoragePolicyStripeNumGte = elfStoragePolicyStripeNumGte;
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumGte
     *
     * @return elfStoragePolicyStripeNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyStripeNumGte() {
        return elfStoragePolicyStripeNumGte;
    }

    public void setElfStoragePolicyStripeNumGte(Integer elfStoragePolicyStripeNumGte) {
        this.elfStoragePolicyStripeNumGte = elfStoragePolicyStripeNumGte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE);
        return this;
    }

    public void setElfStoragePolicyStripeNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE);
        }
    }

    public boolean getElfStoragePolicyStripeNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_GTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumIn(
            List<Integer> elfStoragePolicyStripeNumIn) {

        this.elfStoragePolicyStripeNumIn = elfStoragePolicyStripeNumIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyStripeNumInItem(
            Integer elfStoragePolicyStripeNumInItem) {
        if (this.elfStoragePolicyStripeNumIn == null) {
            this.elfStoragePolicyStripeNumIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyStripeNumIn.add(elfStoragePolicyStripeNumInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumIn
     *
     * @return elfStoragePolicyStripeNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyStripeNumIn() {
        return elfStoragePolicyStripeNumIn;
    }

    public void setElfStoragePolicyStripeNumIn(List<Integer> elfStoragePolicyStripeNumIn) {
        this.elfStoragePolicyStripeNumIn = elfStoragePolicyStripeNumIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN);
        return this;
    }

    public void setElfStoragePolicyStripeNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN);
        }
    }

    public boolean getElfStoragePolicyStripeNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumLt(
            Integer elfStoragePolicyStripeNumLt) {

        this.elfStoragePolicyStripeNumLt = elfStoragePolicyStripeNumLt;
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumLt
     *
     * @return elfStoragePolicyStripeNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyStripeNumLt() {
        return elfStoragePolicyStripeNumLt;
    }

    public void setElfStoragePolicyStripeNumLt(Integer elfStoragePolicyStripeNumLt) {
        this.elfStoragePolicyStripeNumLt = elfStoragePolicyStripeNumLt;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT);
        return this;
    }

    public void setElfStoragePolicyStripeNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT);
        }
    }

    public boolean getElfStoragePolicyStripeNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumLte(
            Integer elfStoragePolicyStripeNumLte) {

        this.elfStoragePolicyStripeNumLte = elfStoragePolicyStripeNumLte;
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumLte
     *
     * @return elfStoragePolicyStripeNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyStripeNumLte() {
        return elfStoragePolicyStripeNumLte;
    }

    public void setElfStoragePolicyStripeNumLte(Integer elfStoragePolicyStripeNumLte) {
        this.elfStoragePolicyStripeNumLte = elfStoragePolicyStripeNumLte;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE);
        return this;
    }

    public void setElfStoragePolicyStripeNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE);
        }
    }

    public boolean getElfStoragePolicyStripeNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_LTE);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumNot(
            Integer elfStoragePolicyStripeNumNot) {

        this.elfStoragePolicyStripeNumNot = elfStoragePolicyStripeNumNot;
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumNot
     *
     * @return elfStoragePolicyStripeNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyStripeNumNot() {
        return elfStoragePolicyStripeNumNot;
    }

    public void setElfStoragePolicyStripeNumNot(Integer elfStoragePolicyStripeNumNot) {
        this.elfStoragePolicyStripeNumNot = elfStoragePolicyStripeNumNot;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT);
        return this;
    }

    public void setElfStoragePolicyStripeNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT);
        }
    }

    public boolean getElfStoragePolicyStripeNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumNotIn(
            List<Integer> elfStoragePolicyStripeNumNotIn) {

        this.elfStoragePolicyStripeNumNotIn = elfStoragePolicyStripeNumNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addElfStoragePolicyStripeNumNotInItem(
            Integer elfStoragePolicyStripeNumNotInItem) {
        if (this.elfStoragePolicyStripeNumNotIn == null) {
            this.elfStoragePolicyStripeNumNotIn = new ArrayList<Integer>();
        }
        this.elfStoragePolicyStripeNumNotIn.add(elfStoragePolicyStripeNumNotInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyStripeNumNotIn
     *
     * @return elfStoragePolicyStripeNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getElfStoragePolicyStripeNumNotIn() {
        return elfStoragePolicyStripeNumNotIn;
    }

    public void setElfStoragePolicyStripeNumNotIn(List<Integer> elfStoragePolicyStripeNumNotIn) {
        this.elfStoragePolicyStripeNumNotIn = elfStoragePolicyStripeNumNotIn;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyStripeNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        return this;
    }

    public void setElfStoragePolicyStripeNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        }
    }

    public boolean getElfStoragePolicyStripeNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyThinProvision(
            Boolean elfStoragePolicyThinProvision) {

        this.elfStoragePolicyThinProvision = elfStoragePolicyThinProvision;
        return this;
    }

    /**
     * Get elfStoragePolicyThinProvision
     *
     * @return elfStoragePolicyThinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getElfStoragePolicyThinProvision() {
        return elfStoragePolicyThinProvision;
    }

    public void setElfStoragePolicyThinProvision(Boolean elfStoragePolicyThinProvision) {
        this.elfStoragePolicyThinProvision = elfStoragePolicyThinProvision;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyThinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public void setElfStoragePolicyThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        }
    }

    public boolean getElfStoragePolicyThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyThinProvisionNot(
            Boolean elfStoragePolicyThinProvisionNot) {

        this.elfStoragePolicyThinProvisionNot = elfStoragePolicyThinProvisionNot;
        return this;
    }

    /**
     * Get elfStoragePolicyThinProvisionNot
     *
     * @return elfStoragePolicyThinProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getElfStoragePolicyThinProvisionNot() {
        return elfStoragePolicyThinProvisionNot;
    }

    public void setElfStoragePolicyThinProvisionNot(Boolean elfStoragePolicyThinProvisionNot) {
        this.elfStoragePolicyThinProvisionNot = elfStoragePolicyThinProvisionNot;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyThinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput elfStoragePolicyThinProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public void setElfStoragePolicyThinProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT);
        }
    }

    public boolean getElfStoragePolicyThinProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT);
    }

    public VmTemplateConfigDiskWhereInput id(String id) {

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

    public VmTemplateConfigDiskWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmTemplateConfigDiskWhereInput id_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idContains(String idContains) {

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

    public VmTemplateConfigDiskWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idContains_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idEndsWith(String idEndsWith) {

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

    public VmTemplateConfigDiskWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idGt(String idGt) {

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

    public VmTemplateConfigDiskWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idGt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idGte(String idGte) {

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

    public VmTemplateConfigDiskWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idGte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addIdInItem(String idInItem) {
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

    public VmTemplateConfigDiskWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idLt(String idLt) {

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

    public VmTemplateConfigDiskWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idLt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idLte(String idLte) {

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

    public VmTemplateConfigDiskWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idLte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idNot(String idNot) {

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

    public VmTemplateConfigDiskWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idNotContains(String idNotContains) {

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

    public VmTemplateConfigDiskWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmTemplateConfigDiskWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmTemplateConfigDiskWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmTemplateConfigDiskWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput idStartsWith(String idStartsWith) {

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

    public VmTemplateConfigDiskWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public VmTemplateConfigDiskWhereInput index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public VmTemplateConfigDiskWhereInput index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public VmTemplateConfigDiskWhereInput indexGt(Integer indexGt) {

        this.indexGt = indexGt;
        return this;
    }

    /**
     * Get indexGt
     *
     * @return indexGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexGt() {
        return indexGt;
    }

    public void setIndexGt(Integer indexGt) {
        this.indexGt = indexGt;
    }

    public VmTemplateConfigDiskWhereInput indexGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_GT);
        return this;
    }

    public void setIndexGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_GT);
        }
    }

    public boolean getIndexGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_GT);
    }

    public VmTemplateConfigDiskWhereInput indexGte(Integer indexGte) {

        this.indexGte = indexGte;
        return this;
    }

    /**
     * Get indexGte
     *
     * @return indexGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexGte() {
        return indexGte;
    }

    public void setIndexGte(Integer indexGte) {
        this.indexGte = indexGte;
    }

    public VmTemplateConfigDiskWhereInput indexGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_GTE);
        return this;
    }

    public void setIndexGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_GTE);
        }
    }

    public boolean getIndexGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_GTE);
    }

    public VmTemplateConfigDiskWhereInput indexIn(List<Integer> indexIn) {

        this.indexIn = indexIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addIndexInItem(Integer indexInItem) {
        if (this.indexIn == null) {
            this.indexIn = new ArrayList<Integer>();
        }
        this.indexIn.add(indexInItem);
        return this;
    }

    /**
     * Get indexIn
     *
     * @return indexIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIndexIn() {
        return indexIn;
    }

    public void setIndexIn(List<Integer> indexIn) {
        this.indexIn = indexIn;
    }

    public VmTemplateConfigDiskWhereInput indexIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_IN);
        return this;
    }

    public void setIndexIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_IN);
        }
    }

    public boolean getIndexIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_IN);
    }

    public VmTemplateConfigDiskWhereInput indexLt(Integer indexLt) {

        this.indexLt = indexLt;
        return this;
    }

    /**
     * Get indexLt
     *
     * @return indexLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexLt() {
        return indexLt;
    }

    public void setIndexLt(Integer indexLt) {
        this.indexLt = indexLt;
    }

    public VmTemplateConfigDiskWhereInput indexLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_LT);
        return this;
    }

    public void setIndexLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_LT);
        }
    }

    public boolean getIndexLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_LT);
    }

    public VmTemplateConfigDiskWhereInput indexLte(Integer indexLte) {

        this.indexLte = indexLte;
        return this;
    }

    /**
     * Get indexLte
     *
     * @return indexLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexLte() {
        return indexLte;
    }

    public void setIndexLte(Integer indexLte) {
        this.indexLte = indexLte;
    }

    public VmTemplateConfigDiskWhereInput indexLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_LTE);
        return this;
    }

    public void setIndexLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_LTE);
        }
    }

    public boolean getIndexLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_LTE);
    }

    public VmTemplateConfigDiskWhereInput indexNot(Integer indexNot) {

        this.indexNot = indexNot;
        return this;
    }

    /**
     * Get indexNot
     *
     * @return indexNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexNot() {
        return indexNot;
    }

    public void setIndexNot(Integer indexNot) {
        this.indexNot = indexNot;
    }

    public VmTemplateConfigDiskWhereInput indexNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT);
        return this;
    }

    public void setIndexNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT);
        }
    }

    public boolean getIndexNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_NOT);
    }

    public VmTemplateConfigDiskWhereInput indexNotIn(List<Integer> indexNotIn) {

        this.indexNotIn = indexNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addIndexNotInItem(Integer indexNotInItem) {
        if (this.indexNotIn == null) {
            this.indexNotIn = new ArrayList<Integer>();
        }
        this.indexNotIn.add(indexNotInItem);
        return this;
    }

    /**
     * Get indexNotIn
     *
     * @return indexNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIndexNotIn() {
        return indexNotIn;
    }

    public void setIndexNotIn(List<Integer> indexNotIn) {
        this.indexNotIn = indexNotIn;
    }

    public VmTemplateConfigDiskWhereInput indexNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput indexNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT_IN);
        return this;
    }

    public void setIndexNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT_IN);
        }
    }

    public boolean getIndexNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput iscsiLun(IscsiLunWhereInput iscsiLun) {

        this.iscsiLun = iscsiLun;
        return this;
    }

    /**
     * Get iscsiLun
     *
     * @return iscsiLun
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLun() {
        return iscsiLun;
    }

    public void setIscsiLun(IscsiLunWhereInput iscsiLun) {
        this.iscsiLun = iscsiLun;
    }

    public VmTemplateConfigDiskWhereInput iscsiLun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput iscsiLun_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public void setIscsiLun_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN);
        }
    }

    public boolean getIscsiLun_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN);
    }

    public VmTemplateConfigDiskWhereInput maxBandwidth(Double maxBandwidth) {

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

    public VmTemplateConfigDiskWhereInput maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidth_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthGt(Double maxBandwidthGt) {

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

    public VmTemplateConfigDiskWhereInput maxBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthGt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthGte(Double maxBandwidthGte) {

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

    public VmTemplateConfigDiskWhereInput maxBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthGte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthIn(List<Double> maxBandwidthIn) {

        this.maxBandwidthIn = maxBandwidthIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxBandwidthInItem(Double maxBandwidthInItem) {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthLt(Double maxBandwidthLt) {

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

    public VmTemplateConfigDiskWhereInput maxBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthLt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthLte(Double maxBandwidthLte) {

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

    public VmTemplateConfigDiskWhereInput maxBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthLte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthNot(Double maxBandwidthNot) {

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

    public VmTemplateConfigDiskWhereInput maxBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthNotIn(List<Double> maxBandwidthNotIn) {

        this.maxBandwidthNotIn = maxBandwidthNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxBandwidthNotInItem(Double maxBandwidthNotInItem) {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicy(
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {

        this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxBandwidthPolicyInItem(
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyNot(
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyNotIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {

        this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxBandwidthPolicyNotInItem(
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

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxBandwidthPolicyNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIops(Integer maxIops) {

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

    public VmTemplateConfigDiskWhereInput maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIops_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsGt(Integer maxIopsGt) {

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

    public VmTemplateConfigDiskWhereInput maxIopsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsGt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsGte(Integer maxIopsGte) {

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

    public VmTemplateConfigDiskWhereInput maxIopsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsGte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsIn(List<Integer> maxIopsIn) {

        this.maxIopsIn = maxIopsIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
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

    public VmTemplateConfigDiskWhereInput maxIopsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsLt(Integer maxIopsLt) {

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

    public VmTemplateConfigDiskWhereInput maxIopsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsLt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsLte(Integer maxIopsLte) {

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

    public VmTemplateConfigDiskWhereInput maxIopsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsLte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsNot(Integer maxIopsNot) {

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

    public VmTemplateConfigDiskWhereInput maxIopsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {

        this.maxIopsNotIn = maxIopsNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
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

    public VmTemplateConfigDiskWhereInput maxIopsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmTemplateConfigDiskWhereInput maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsPolicy_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsPolicyIn(
            List<VmDiskIoRestrictType> maxIopsPolicyIn) {

        this.maxIopsPolicyIn = maxIopsPolicyIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxIopsPolicyInItem(
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

    public VmTemplateConfigDiskWhereInput maxIopsPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsPolicyIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {

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

    public VmTemplateConfigDiskWhereInput maxIopsPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsPolicyNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput maxIopsPolicyNotIn(
            List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {

        this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addMaxIopsPolicyNotInItem(
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

    public VmTemplateConfigDiskWhereInput maxIopsPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput maxIopsPolicyNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput provisionPolicy(String provisionPolicy) {

        this.provisionPolicy = provisionPolicy;
        return this;
    }

    /**
     * Get provisionPolicy
     *
     * @return provisionPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicy() {
        return provisionPolicy;
    }

    public void setProvisionPolicy(String provisionPolicy) {
        this.provisionPolicy = provisionPolicy;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY);
        return this;
    }

    public void setProvisionPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY);
        }
    }

    public boolean getProvisionPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyContains(String provisionPolicyContains) {

        this.provisionPolicyContains = provisionPolicyContains;
        return this;
    }

    /**
     * Get provisionPolicyContains
     *
     * @return provisionPolicyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyContains() {
        return provisionPolicyContains;
    }

    public void setProvisionPolicyContains(String provisionPolicyContains) {
        this.provisionPolicyContains = provisionPolicyContains;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_CONTAINS);
        return this;
    }

    public void setProvisionPolicyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_CONTAINS);
        }
    }

    public boolean getProvisionPolicyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_CONTAINS);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyEndsWith(String provisionPolicyEndsWith) {

        this.provisionPolicyEndsWith = provisionPolicyEndsWith;
        return this;
    }

    /**
     * Get provisionPolicyEndsWith
     *
     * @return provisionPolicyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyEndsWith() {
        return provisionPolicyEndsWith;
    }

    public void setProvisionPolicyEndsWith(String provisionPolicyEndsWith) {
        this.provisionPolicyEndsWith = provisionPolicyEndsWith;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH);
        return this;
    }

    public void setProvisionPolicyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH);
        }
    }

    public boolean getProvisionPolicyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_ENDS_WITH);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyGt(String provisionPolicyGt) {

        this.provisionPolicyGt = provisionPolicyGt;
        return this;
    }

    /**
     * Get provisionPolicyGt
     *
     * @return provisionPolicyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyGt() {
        return provisionPolicyGt;
    }

    public void setProvisionPolicyGt(String provisionPolicyGt) {
        this.provisionPolicyGt = provisionPolicyGt;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_GT);
        return this;
    }

    public void setProvisionPolicyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_GT);
        }
    }

    public boolean getProvisionPolicyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_GT);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyGte(String provisionPolicyGte) {

        this.provisionPolicyGte = provisionPolicyGte;
        return this;
    }

    /**
     * Get provisionPolicyGte
     *
     * @return provisionPolicyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyGte() {
        return provisionPolicyGte;
    }

    public void setProvisionPolicyGte(String provisionPolicyGte) {
        this.provisionPolicyGte = provisionPolicyGte;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_GTE);
        return this;
    }

    public void setProvisionPolicyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_GTE);
        }
    }

    public boolean getProvisionPolicyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_GTE);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyIn(List<String> provisionPolicyIn) {

        this.provisionPolicyIn = provisionPolicyIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addProvisionPolicyInItem(String provisionPolicyInItem) {
        if (this.provisionPolicyIn == null) {
            this.provisionPolicyIn = new ArrayList<String>();
        }
        this.provisionPolicyIn.add(provisionPolicyInItem);
        return this;
    }

    /**
     * Get provisionPolicyIn
     *
     * @return provisionPolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProvisionPolicyIn() {
        return provisionPolicyIn;
    }

    public void setProvisionPolicyIn(List<String> provisionPolicyIn) {
        this.provisionPolicyIn = provisionPolicyIn;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_IN);
        return this;
    }

    public void setProvisionPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_IN);
        }
    }

    public boolean getProvisionPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_IN);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyLt(String provisionPolicyLt) {

        this.provisionPolicyLt = provisionPolicyLt;
        return this;
    }

    /**
     * Get provisionPolicyLt
     *
     * @return provisionPolicyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyLt() {
        return provisionPolicyLt;
    }

    public void setProvisionPolicyLt(String provisionPolicyLt) {
        this.provisionPolicyLt = provisionPolicyLt;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_LT);
        return this;
    }

    public void setProvisionPolicyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_LT);
        }
    }

    public boolean getProvisionPolicyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_LT);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyLte(String provisionPolicyLte) {

        this.provisionPolicyLte = provisionPolicyLte;
        return this;
    }

    /**
     * Get provisionPolicyLte
     *
     * @return provisionPolicyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyLte() {
        return provisionPolicyLte;
    }

    public void setProvisionPolicyLte(String provisionPolicyLte) {
        this.provisionPolicyLte = provisionPolicyLte;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_LTE);
        return this;
    }

    public void setProvisionPolicyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_LTE);
        }
    }

    public boolean getProvisionPolicyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_LTE);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNot(String provisionPolicyNot) {

        this.provisionPolicyNot = provisionPolicyNot;
        return this;
    }

    /**
     * Get provisionPolicyNot
     *
     * @return provisionPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyNot() {
        return provisionPolicyNot;
    }

    public void setProvisionPolicyNot(String provisionPolicyNot) {
        this.provisionPolicyNot = provisionPolicyNot;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT);
        return this;
    }

    public void setProvisionPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT);
        }
    }

    public boolean getProvisionPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_NOT);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotContains(
            String provisionPolicyNotContains) {

        this.provisionPolicyNotContains = provisionPolicyNotContains;
        return this;
    }

    /**
     * Get provisionPolicyNotContains
     *
     * @return provisionPolicyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyNotContains() {
        return provisionPolicyNotContains;
    }

    public void setProvisionPolicyNotContains(String provisionPolicyNotContains) {
        this.provisionPolicyNotContains = provisionPolicyNotContains;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS);
        return this;
    }

    public void setProvisionPolicyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS);
        }
    }

    public boolean getProvisionPolicyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_NOT_CONTAINS);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotEndsWith(
            String provisionPolicyNotEndsWith) {

        this.provisionPolicyNotEndsWith = provisionPolicyNotEndsWith;
        return this;
    }

    /**
     * Get provisionPolicyNotEndsWith
     *
     * @return provisionPolicyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyNotEndsWith() {
        return provisionPolicyNotEndsWith;
    }

    public void setProvisionPolicyNotEndsWith(String provisionPolicyNotEndsWith) {
        this.provisionPolicyNotEndsWith = provisionPolicyNotEndsWith;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH);
        return this;
    }

    public void setProvisionPolicyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH);
        }
    }

    public boolean getProvisionPolicyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_NOT_ENDS_WITH);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotIn(List<String> provisionPolicyNotIn) {

        this.provisionPolicyNotIn = provisionPolicyNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addProvisionPolicyNotInItem(
            String provisionPolicyNotInItem) {
        if (this.provisionPolicyNotIn == null) {
            this.provisionPolicyNotIn = new ArrayList<String>();
        }
        this.provisionPolicyNotIn.add(provisionPolicyNotInItem);
        return this;
    }

    /**
     * Get provisionPolicyNotIn
     *
     * @return provisionPolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProvisionPolicyNotIn() {
        return provisionPolicyNotIn;
    }

    public void setProvisionPolicyNotIn(List<String> provisionPolicyNotIn) {
        this.provisionPolicyNotIn = provisionPolicyNotIn;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_IN);
        return this;
    }

    public void setProvisionPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_IN);
        }
    }

    public boolean getProvisionPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotStartsWith(
            String provisionPolicyNotStartsWith) {

        this.provisionPolicyNotStartsWith = provisionPolicyNotStartsWith;
        return this;
    }

    /**
     * Get provisionPolicyNotStartsWith
     *
     * @return provisionPolicyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyNotStartsWith() {
        return provisionPolicyNotStartsWith;
    }

    public void setProvisionPolicyNotStartsWith(String provisionPolicyNotStartsWith) {
        this.provisionPolicyNotStartsWith = provisionPolicyNotStartsWith;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH);
        return this;
    }

    public void setProvisionPolicyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH);
        }
    }

    public boolean getProvisionPolicyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_NOT_STARTS_WITH);
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyStartsWith(
            String provisionPolicyStartsWith) {

        this.provisionPolicyStartsWith = provisionPolicyStartsWith;
        return this;
    }

    /**
     * Get provisionPolicyStartsWith
     *
     * @return provisionPolicyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProvisionPolicyStartsWith() {
        return provisionPolicyStartsWith;
    }

    public void setProvisionPolicyStartsWith(String provisionPolicyStartsWith) {
        this.provisionPolicyStartsWith = provisionPolicyStartsWith;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput provisionPolicyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH);
        return this;
    }

    public void setProvisionPolicyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH);
        }
    }

    public boolean getProvisionPolicyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISION_POLICY_STARTS_WITH);
    }

    public VmTemplateConfigDiskWhereInput residentInCache(Boolean residentInCache) {

        this.residentInCache = residentInCache;
        return this;
    }

    /**
     * Get residentInCache
     *
     * @return residentInCache
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResidentInCache() {
        return residentInCache;
    }

    public void setResidentInCache(Boolean residentInCache) {
        this.residentInCache = residentInCache;
    }

    public VmTemplateConfigDiskWhereInput residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput residentInCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public void setResidentInCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        }
    }

    public boolean getResidentInCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESIDENT_IN_CACHE);
    }

    public VmTemplateConfigDiskWhereInput residentInCacheNot(Boolean residentInCacheNot) {

        this.residentInCacheNot = residentInCacheNot;
        return this;
    }

    /**
     * Get residentInCacheNot
     *
     * @return residentInCacheNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResidentInCacheNot() {
        return residentInCacheNot;
    }

    public void setResidentInCacheNot(Boolean residentInCacheNot) {
        this.residentInCacheNot = residentInCacheNot;
    }

    public VmTemplateConfigDiskWhereInput residentInCacheNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput residentInCacheNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT);
        return this;
    }

    public void setResidentInCacheNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT);
        }
    }

    public boolean getResidentInCacheNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT);
    }

    public VmTemplateConfigDiskWhereInput size(Long size) {

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

    public VmTemplateConfigDiskWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput size_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeGt(Long sizeGt) {

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

    public VmTemplateConfigDiskWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeGt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeGte(Long sizeGte) {

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

    public VmTemplateConfigDiskWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeGte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addSizeInItem(Long sizeInItem) {
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

    public VmTemplateConfigDiskWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeLt(Long sizeLt) {

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

    public VmTemplateConfigDiskWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeLt_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeLte(Long sizeLte) {

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

    public VmTemplateConfigDiskWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeLte_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeNot(Long sizeNot) {

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

    public VmTemplateConfigDiskWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addSizeNotInItem(Long sizeNotInItem) {
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

    public VmTemplateConfigDiskWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput sizeNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput storageEncrypted(Boolean storageEncrypted) {

        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Get storageEncrypted
     *
     * @return storageEncrypted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public VmTemplateConfigDiskWhereInput storageEncrypted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncrypted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public void setStorageEncrypted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        }
    }

    public boolean getStorageEncrypted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptedNot(Boolean storageEncryptedNot) {

        this.storageEncryptedNot = storageEncryptedNot;
        return this;
    }

    /**
     * Get storageEncryptedNot
     *
     * @return storageEncryptedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncryptedNot() {
        return storageEncryptedNot;
    }

    public void setStorageEncryptedNot(Boolean storageEncryptedNot) {
        this.storageEncryptedNot = storageEncryptedNot;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        return this;
    }

    public void setStorageEncryptedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        }
    }

    public boolean getStorageEncryptedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithm(
            String storageEncryptionAlgorithm) {

        this.storageEncryptionAlgorithm = storageEncryptionAlgorithm;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithm
     *
     * @return storageEncryptionAlgorithm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithm() {
        return storageEncryptionAlgorithm;
    }

    public void setStorageEncryptionAlgorithm(String storageEncryptionAlgorithm) {
        this.storageEncryptionAlgorithm = storageEncryptionAlgorithm;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM);
        return this;
    }

    public void setStorageEncryptionAlgorithm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM);
        }
    }

    public boolean getStorageEncryptionAlgorithm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmContains(
            String storageEncryptionAlgorithmContains) {

        this.storageEncryptionAlgorithmContains = storageEncryptionAlgorithmContains;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmContains
     *
     * @return storageEncryptionAlgorithmContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmContains() {
        return storageEncryptionAlgorithmContains;
    }

    public void setStorageEncryptionAlgorithmContains(String storageEncryptionAlgorithmContains) {
        this.storageEncryptionAlgorithmContains = storageEncryptionAlgorithmContains;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        return this;
    }

    public void setStorageEncryptionAlgorithmContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
        }
    }

    public boolean getStorageEncryptionAlgorithmContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_CONTAINS);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmEndsWith(
            String storageEncryptionAlgorithmEndsWith) {

        this.storageEncryptionAlgorithmEndsWith = storageEncryptionAlgorithmEndsWith;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmEndsWith
     *
     * @return storageEncryptionAlgorithmEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmEndsWith() {
        return storageEncryptionAlgorithmEndsWith;
    }

    public void setStorageEncryptionAlgorithmEndsWith(String storageEncryptionAlgorithmEndsWith) {
        this.storageEncryptionAlgorithmEndsWith = storageEncryptionAlgorithmEndsWith;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        return this;
    }

    public void setStorageEncryptionAlgorithmEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
        }
    }

    public boolean getStorageEncryptionAlgorithmEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_ENDS_WITH);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmGt(
            String storageEncryptionAlgorithmGt) {

        this.storageEncryptionAlgorithmGt = storageEncryptionAlgorithmGt;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmGt
     *
     * @return storageEncryptionAlgorithmGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmGt() {
        return storageEncryptionAlgorithmGt;
    }

    public void setStorageEncryptionAlgorithmGt(String storageEncryptionAlgorithmGt) {
        this.storageEncryptionAlgorithmGt = storageEncryptionAlgorithmGt;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT);
        return this;
    }

    public void setStorageEncryptionAlgorithmGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT);
        }
    }

    public boolean getStorageEncryptionAlgorithmGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GT);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmGte(
            String storageEncryptionAlgorithmGte) {

        this.storageEncryptionAlgorithmGte = storageEncryptionAlgorithmGte;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmGte
     *
     * @return storageEncryptionAlgorithmGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmGte() {
        return storageEncryptionAlgorithmGte;
    }

    public void setStorageEncryptionAlgorithmGte(String storageEncryptionAlgorithmGte) {
        this.storageEncryptionAlgorithmGte = storageEncryptionAlgorithmGte;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        return this;
    }

    public void setStorageEncryptionAlgorithmGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE);
        }
    }

    public boolean getStorageEncryptionAlgorithmGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_GTE);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmIn(
            List<String> storageEncryptionAlgorithmIn) {

        this.storageEncryptionAlgorithmIn = storageEncryptionAlgorithmIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addStorageEncryptionAlgorithmInItem(
            String storageEncryptionAlgorithmInItem) {
        if (this.storageEncryptionAlgorithmIn == null) {
            this.storageEncryptionAlgorithmIn = new ArrayList<String>();
        }
        this.storageEncryptionAlgorithmIn.add(storageEncryptionAlgorithmInItem);
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmIn
     *
     * @return storageEncryptionAlgorithmIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageEncryptionAlgorithmIn() {
        return storageEncryptionAlgorithmIn;
    }

    public void setStorageEncryptionAlgorithmIn(List<String> storageEncryptionAlgorithmIn) {
        this.storageEncryptionAlgorithmIn = storageEncryptionAlgorithmIn;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN);
        return this;
    }

    public void setStorageEncryptionAlgorithmIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN);
        }
    }

    public boolean getStorageEncryptionAlgorithmIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_IN);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmLt(
            String storageEncryptionAlgorithmLt) {

        this.storageEncryptionAlgorithmLt = storageEncryptionAlgorithmLt;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmLt
     *
     * @return storageEncryptionAlgorithmLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmLt() {
        return storageEncryptionAlgorithmLt;
    }

    public void setStorageEncryptionAlgorithmLt(String storageEncryptionAlgorithmLt) {
        this.storageEncryptionAlgorithmLt = storageEncryptionAlgorithmLt;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT);
        return this;
    }

    public void setStorageEncryptionAlgorithmLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT);
        }
    }

    public boolean getStorageEncryptionAlgorithmLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LT);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmLte(
            String storageEncryptionAlgorithmLte) {

        this.storageEncryptionAlgorithmLte = storageEncryptionAlgorithmLte;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmLte
     *
     * @return storageEncryptionAlgorithmLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmLte() {
        return storageEncryptionAlgorithmLte;
    }

    public void setStorageEncryptionAlgorithmLte(String storageEncryptionAlgorithmLte) {
        this.storageEncryptionAlgorithmLte = storageEncryptionAlgorithmLte;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        return this;
    }

    public void setStorageEncryptionAlgorithmLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE);
        }
    }

    public boolean getStorageEncryptionAlgorithmLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_LTE);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNot(
            String storageEncryptionAlgorithmNot) {

        this.storageEncryptionAlgorithmNot = storageEncryptionAlgorithmNot;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmNot
     *
     * @return storageEncryptionAlgorithmNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmNot() {
        return storageEncryptionAlgorithmNot;
    }

    public void setStorageEncryptionAlgorithmNot(String storageEncryptionAlgorithmNot) {
        this.storageEncryptionAlgorithmNot = storageEncryptionAlgorithmNot;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        return this;
    }

    public void setStorageEncryptionAlgorithmNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT);
        }
    }

    public boolean getStorageEncryptionAlgorithmNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotContains(
            String storageEncryptionAlgorithmNotContains) {

        this.storageEncryptionAlgorithmNotContains = storageEncryptionAlgorithmNotContains;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmNotContains
     *
     * @return storageEncryptionAlgorithmNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmNotContains() {
        return storageEncryptionAlgorithmNotContains;
    }

    public void setStorageEncryptionAlgorithmNotContains(
            String storageEncryptionAlgorithmNotContains) {
        this.storageEncryptionAlgorithmNotContains = storageEncryptionAlgorithmNotContains;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        return this;
    }

    public void setStorageEncryptionAlgorithmNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
        }
    }

    public boolean getStorageEncryptionAlgorithmNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_CONTAINS);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotEndsWith(
            String storageEncryptionAlgorithmNotEndsWith) {

        this.storageEncryptionAlgorithmNotEndsWith = storageEncryptionAlgorithmNotEndsWith;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmNotEndsWith
     *
     * @return storageEncryptionAlgorithmNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmNotEndsWith() {
        return storageEncryptionAlgorithmNotEndsWith;
    }

    public void setStorageEncryptionAlgorithmNotEndsWith(
            String storageEncryptionAlgorithmNotEndsWith) {
        this.storageEncryptionAlgorithmNotEndsWith = storageEncryptionAlgorithmNotEndsWith;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageEncryptionAlgorithmNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageEncryptionAlgorithmNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_ENDS_WITH);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotIn(
            List<String> storageEncryptionAlgorithmNotIn) {

        this.storageEncryptionAlgorithmNotIn = storageEncryptionAlgorithmNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addStorageEncryptionAlgorithmNotInItem(
            String storageEncryptionAlgorithmNotInItem) {
        if (this.storageEncryptionAlgorithmNotIn == null) {
            this.storageEncryptionAlgorithmNotIn = new ArrayList<String>();
        }
        this.storageEncryptionAlgorithmNotIn.add(storageEncryptionAlgorithmNotInItem);
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmNotIn
     *
     * @return storageEncryptionAlgorithmNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageEncryptionAlgorithmNotIn() {
        return storageEncryptionAlgorithmNotIn;
    }

    public void setStorageEncryptionAlgorithmNotIn(List<String> storageEncryptionAlgorithmNotIn) {
        this.storageEncryptionAlgorithmNotIn = storageEncryptionAlgorithmNotIn;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        return this;
    }

    public void setStorageEncryptionAlgorithmNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
        }
    }

    public boolean getStorageEncryptionAlgorithmNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotStartsWith(
            String storageEncryptionAlgorithmNotStartsWith) {

        this.storageEncryptionAlgorithmNotStartsWith = storageEncryptionAlgorithmNotStartsWith;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmNotStartsWith
     *
     * @return storageEncryptionAlgorithmNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmNotStartsWith() {
        return storageEncryptionAlgorithmNotStartsWith;
    }

    public void setStorageEncryptionAlgorithmNotStartsWith(
            String storageEncryptionAlgorithmNotStartsWith) {
        this.storageEncryptionAlgorithmNotStartsWith = storageEncryptionAlgorithmNotStartsWith;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput
            storageEncryptionAlgorithmNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageEncryptionAlgorithmNotStartsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageEncryptionAlgorithmNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_NOT_STARTS_WITH);
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmStartsWith(
            String storageEncryptionAlgorithmStartsWith) {

        this.storageEncryptionAlgorithmStartsWith = storageEncryptionAlgorithmStartsWith;
        return this;
    }

    /**
     * Get storageEncryptionAlgorithmStartsWith
     *
     * @return storageEncryptionAlgorithmStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageEncryptionAlgorithmStartsWith() {
        return storageEncryptionAlgorithmStartsWith;
    }

    public void setStorageEncryptionAlgorithmStartsWith(
            String storageEncryptionAlgorithmStartsWith) {
        this.storageEncryptionAlgorithmStartsWith = storageEncryptionAlgorithmStartsWith;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storageEncryptionAlgorithmStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        return this;
    }

    public void setStorageEncryptionAlgorithmStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
        }
    }

    public boolean getStorageEncryptionAlgorithmStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTION_ALGORITHM_STARTS_WITH);
    }

    public VmTemplateConfigDiskWhereInput storagePolicy(
            VmVolumeElfStoragePolicyType storagePolicy) {

        this.storagePolicy = storagePolicy;
        return this;
    }

    /**
     * Get storagePolicy
     *
     * @return storagePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicy() {
        return storagePolicy;
    }

    public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
        this.storagePolicy = storagePolicy;
    }

    public VmTemplateConfigDiskWhereInput storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storagePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public void setStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        }
    }

    public boolean getStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY);
    }

    public VmTemplateConfigDiskWhereInput storagePolicyIn(
            List<VmVolumeElfStoragePolicyType> storagePolicyIn) {

        this.storagePolicyIn = storagePolicyIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addStoragePolicyInItem(
            VmVolumeElfStoragePolicyType storagePolicyInItem) {
        if (this.storagePolicyIn == null) {
            this.storagePolicyIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.storagePolicyIn.add(storagePolicyInItem);
        return this;
    }

    /**
     * Get storagePolicyIn
     *
     * @return storagePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getStoragePolicyIn() {
        return storagePolicyIn;
    }

    public void setStoragePolicyIn(List<VmVolumeElfStoragePolicyType> storagePolicyIn) {
        this.storagePolicyIn = storagePolicyIn;
    }

    public VmTemplateConfigDiskWhereInput storagePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storagePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_IN);
        return this;
    }

    public void setStoragePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_IN);
        }
    }

    public boolean getStoragePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_IN);
    }

    public VmTemplateConfigDiskWhereInput storagePolicyNot(
            VmVolumeElfStoragePolicyType storagePolicyNot) {

        this.storagePolicyNot = storagePolicyNot;
        return this;
    }

    /**
     * Get storagePolicyNot
     *
     * @return storagePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicyNot() {
        return storagePolicyNot;
    }

    public void setStoragePolicyNot(VmVolumeElfStoragePolicyType storagePolicyNot) {
        this.storagePolicyNot = storagePolicyNot;
    }

    public VmTemplateConfigDiskWhereInput storagePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storagePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        return this;
    }

    public void setStoragePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        }
    }

    public boolean getStoragePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_NOT);
    }

    public VmTemplateConfigDiskWhereInput storagePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> storagePolicyNotIn) {

        this.storagePolicyNotIn = storagePolicyNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addStoragePolicyNotInItem(
            VmVolumeElfStoragePolicyType storagePolicyNotInItem) {
        if (this.storagePolicyNotIn == null) {
            this.storagePolicyNotIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.storagePolicyNotIn.add(storagePolicyNotInItem);
        return this;
    }

    /**
     * Get storagePolicyNotIn
     *
     * @return storagePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getStoragePolicyNotIn() {
        return storagePolicyNotIn;
    }

    public void setStoragePolicyNotIn(List<VmVolumeElfStoragePolicyType> storagePolicyNotIn) {
        this.storagePolicyNotIn = storagePolicyNotIn;
    }

    public VmTemplateConfigDiskWhereInput storagePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput storagePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public void setStoragePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        }
    }

    public boolean getStoragePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
    }

    public VmTemplateConfigDiskWhereInput type(VmDiskType type) {

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

    public VmTemplateConfigDiskWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput type_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput typeIn(List<VmDiskType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addTypeInItem(VmDiskType typeInItem) {
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

    public VmTemplateConfigDiskWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput typeIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput typeNot(VmDiskType typeNot) {

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

    public VmTemplateConfigDiskWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput typeNot_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput typeNotIn(List<VmDiskType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addTypeNotInItem(VmDiskType typeNotInItem) {
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

    public VmTemplateConfigDiskWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmTemplateConfigDiskWhereInput vmTemplateConfig(
            VmTemplateConfigWhereInput vmTemplateConfig) {

        this.vmTemplateConfig = vmTemplateConfig;
        return this;
    }

    /**
     * Get vmTemplateConfig
     *
     * @return vmTemplateConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigWhereInput getVmTemplateConfig() {
        return vmTemplateConfig;
    }

    public void setVmTemplateConfig(VmTemplateConfigWhereInput vmTemplateConfig) {
        this.vmTemplateConfig = vmTemplateConfig;
    }

    public VmTemplateConfigDiskWhereInput vmTemplateConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        return this;
    }

    public VmTemplateConfigDiskWhereInput vmTemplateConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        return this;
    }

    public void setVmTemplateConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        }
    }

    public boolean getVmTemplateConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
    }

    public VmTemplateConfigDiskWhereInput vmVolumeTemplateConfigFile(
            VmVolumeTemplateConfigFileWhereInput vmVolumeTemplateConfigFile) {

        this.vmVolumeTemplateConfigFile = vmVolumeTemplateConfigFile;
        return this;
    }

    /**
     * Get vmVolumeTemplateConfigFile
     *
     * @return vmVolumeTemplateConfigFile
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeTemplateConfigFileWhereInput getVmVolumeTemplateConfigFile() {
        return vmVolumeTemplateConfigFile;
    }

    public void setVmVolumeTemplateConfigFile(
            VmVolumeTemplateConfigFileWhereInput vmVolumeTemplateConfigFile) {
        this.vmVolumeTemplateConfigFile = vmVolumeTemplateConfigFile;
    }

    public VmTemplateConfigDiskWhereInput vmVolumeTemplateConfigFile_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput vmVolumeTemplateConfigFile_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        return this;
    }

    public void setVmVolumeTemplateConfigFile_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        }
    }

    public boolean getVmVolumeTemplateConfigFile_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
    }

    public VmTemplateConfigDiskWhereInput volumeStorageType(
            VmTemplateConfigDiskVolumeStorageType volumeStorageType) {

        this.volumeStorageType = volumeStorageType;
        return this;
    }

    /**
     * Get volumeStorageType
     *
     * @return volumeStorageType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigDiskVolumeStorageType getVolumeStorageType() {
        return volumeStorageType;
    }

    public void setVolumeStorageType(VmTemplateConfigDiskVolumeStorageType volumeStorageType) {
        this.volumeStorageType = volumeStorageType;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        return this;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        return this;
    }

    public void setVolumeStorageType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        }
    }

    public boolean getVolumeStorageType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeIn(
            List<VmTemplateConfigDiskVolumeStorageType> volumeStorageTypeIn) {

        this.volumeStorageTypeIn = volumeStorageTypeIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addVolumeStorageTypeInItem(
            VmTemplateConfigDiskVolumeStorageType volumeStorageTypeInItem) {
        if (this.volumeStorageTypeIn == null) {
            this.volumeStorageTypeIn = new ArrayList<VmTemplateConfigDiskVolumeStorageType>();
        }
        this.volumeStorageTypeIn.add(volumeStorageTypeInItem);
        return this;
    }

    /**
     * Get volumeStorageTypeIn
     *
     * @return volumeStorageTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmTemplateConfigDiskVolumeStorageType> getVolumeStorageTypeIn() {
        return volumeStorageTypeIn;
    }

    public void setVolumeStorageTypeIn(
            List<VmTemplateConfigDiskVolumeStorageType> volumeStorageTypeIn) {
        this.volumeStorageTypeIn = volumeStorageTypeIn;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN);
        return this;
    }

    public void setVolumeStorageTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN);
        }
    }

    public boolean getVolumeStorageTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_IN);
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeNot(
            VmTemplateConfigDiskVolumeStorageType volumeStorageTypeNot) {

        this.volumeStorageTypeNot = volumeStorageTypeNot;
        return this;
    }

    /**
     * Get volumeStorageTypeNot
     *
     * @return volumeStorageTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigDiskVolumeStorageType getVolumeStorageTypeNot() {
        return volumeStorageTypeNot;
    }

    public void setVolumeStorageTypeNot(
            VmTemplateConfigDiskVolumeStorageType volumeStorageTypeNot) {
        this.volumeStorageTypeNot = volumeStorageTypeNot;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT);
        return this;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT);
        return this;
    }

    public void setVolumeStorageTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT);
        }
    }

    public boolean getVolumeStorageTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT);
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeNotIn(
            List<VmTemplateConfigDiskVolumeStorageType> volumeStorageTypeNotIn) {

        this.volumeStorageTypeNotIn = volumeStorageTypeNotIn;
        return this;
    }

    public VmTemplateConfigDiskWhereInput addVolumeStorageTypeNotInItem(
            VmTemplateConfigDiskVolumeStorageType volumeStorageTypeNotInItem) {
        if (this.volumeStorageTypeNotIn == null) {
            this.volumeStorageTypeNotIn = new ArrayList<VmTemplateConfigDiskVolumeStorageType>();
        }
        this.volumeStorageTypeNotIn.add(volumeStorageTypeNotInItem);
        return this;
    }

    /**
     * Get volumeStorageTypeNotIn
     *
     * @return volumeStorageTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmTemplateConfigDiskVolumeStorageType> getVolumeStorageTypeNotIn() {
        return volumeStorageTypeNotIn;
    }

    public void setVolumeStorageTypeNotIn(
            List<VmTemplateConfigDiskVolumeStorageType> volumeStorageTypeNotIn) {
        this.volumeStorageTypeNotIn = volumeStorageTypeNotIn;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN);
        return this;
    }

    public VmTemplateConfigDiskWhereInput volumeStorageTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN);
        return this;
    }

    public void setVolumeStorageTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN);
        }
    }

    public boolean getVolumeStorageTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_STORAGE_TYPE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmTemplateConfigDiskWhereInput vmTemplateConfigDiskWhereInput =
                (VmTemplateConfigDiskWhereInput) o;
        return Objects.equals(this.AND, vmTemplateConfigDiskWhereInput.AND)
                && Objects.equals(this.NOT, vmTemplateConfigDiskWhereInput.NOT)
                && Objects.equals(this.OR, vmTemplateConfigDiskWhereInput.OR)
                && Objects.equals(this.boot, vmTemplateConfigDiskWhereInput.boot)
                && Objects.equals(this.bootGt, vmTemplateConfigDiskWhereInput.bootGt)
                && Objects.equals(this.bootGte, vmTemplateConfigDiskWhereInput.bootGte)
                && Objects.equals(this.bootIn, vmTemplateConfigDiskWhereInput.bootIn)
                && Objects.equals(this.bootLt, vmTemplateConfigDiskWhereInput.bootLt)
                && Objects.equals(this.bootLte, vmTemplateConfigDiskWhereInput.bootLte)
                && Objects.equals(this.bootNot, vmTemplateConfigDiskWhereInput.bootNot)
                && Objects.equals(this.bootNotIn, vmTemplateConfigDiskWhereInput.bootNotIn)
                && Objects.equals(this.bus, vmTemplateConfigDiskWhereInput.bus)
                && Objects.equals(this.busIn, vmTemplateConfigDiskWhereInput.busIn)
                && Objects.equals(this.busNot, vmTemplateConfigDiskWhereInput.busNot)
                && Objects.equals(this.busNotIn, vmTemplateConfigDiskWhereInput.busNotIn)
                && Objects.equals(this.disabled, vmTemplateConfigDiskWhereInput.disabled)
                && Objects.equals(this.disabledNot, vmTemplateConfigDiskWhereInput.disabledNot)
                && Objects.equals(this.diskName, vmTemplateConfigDiskWhereInput.diskName)
                && Objects.equals(
                        this.diskNameContains, vmTemplateConfigDiskWhereInput.diskNameContains)
                && Objects.equals(
                        this.diskNameEndsWith, vmTemplateConfigDiskWhereInput.diskNameEndsWith)
                && Objects.equals(this.diskNameGt, vmTemplateConfigDiskWhereInput.diskNameGt)
                && Objects.equals(this.diskNameGte, vmTemplateConfigDiskWhereInput.diskNameGte)
                && Objects.equals(this.diskNameIn, vmTemplateConfigDiskWhereInput.diskNameIn)
                && Objects.equals(this.diskNameLt, vmTemplateConfigDiskWhereInput.diskNameLt)
                && Objects.equals(this.diskNameLte, vmTemplateConfigDiskWhereInput.diskNameLte)
                && Objects.equals(this.diskNameNot, vmTemplateConfigDiskWhereInput.diskNameNot)
                && Objects.equals(
                        this.diskNameNotContains,
                        vmTemplateConfigDiskWhereInput.diskNameNotContains)
                && Objects.equals(
                        this.diskNameNotEndsWith,
                        vmTemplateConfigDiskWhereInput.diskNameNotEndsWith)
                && Objects.equals(this.diskNameNotIn, vmTemplateConfigDiskWhereInput.diskNameNotIn)
                && Objects.equals(
                        this.diskNameNotStartsWith,
                        vmTemplateConfigDiskWhereInput.diskNameNotStartsWith)
                && Objects.equals(
                        this.diskNameStartsWith, vmTemplateConfigDiskWhereInput.diskNameStartsWith)
                && Objects.equals(
                        this.elfStoragePolicyEcK,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcK)
                && Objects.equals(
                        this.elfStoragePolicyEcKGt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKGt)
                && Objects.equals(
                        this.elfStoragePolicyEcKGte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKGte)
                && Objects.equals(
                        this.elfStoragePolicyEcKIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKIn)
                && Objects.equals(
                        this.elfStoragePolicyEcKLt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKLt)
                && Objects.equals(
                        this.elfStoragePolicyEcKLte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKLte)
                && Objects.equals(
                        this.elfStoragePolicyEcKNot,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKNot)
                && Objects.equals(
                        this.elfStoragePolicyEcKNotIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcKNotIn)
                && Objects.equals(
                        this.elfStoragePolicyEcM,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcM)
                && Objects.equals(
                        this.elfStoragePolicyEcMGt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMGt)
                && Objects.equals(
                        this.elfStoragePolicyEcMGte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMGte)
                && Objects.equals(
                        this.elfStoragePolicyEcMIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMIn)
                && Objects.equals(
                        this.elfStoragePolicyEcMLt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMLt)
                && Objects.equals(
                        this.elfStoragePolicyEcMLte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMLte)
                && Objects.equals(
                        this.elfStoragePolicyEcMNot,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMNot)
                && Objects.equals(
                        this.elfStoragePolicyEcMNotIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyEcMNotIn)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNum,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNum)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumGt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumGt)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumGte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumGte)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumIn)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumLt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumLt)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumLte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumLte)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumNot,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumNot)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumNotIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyReplicaNumNotIn)
                && Objects.equals(
                        this.elfStoragePolicyStripeNum,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNum)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumGt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumGt)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumGte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumGte)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumIn)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumLt,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumLt)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumLte,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumLte)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumNot,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumNot)
                && Objects.equals(
                        this.elfStoragePolicyStripeNumNotIn,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyStripeNumNotIn)
                && Objects.equals(
                        this.elfStoragePolicyThinProvision,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyThinProvision)
                && Objects.equals(
                        this.elfStoragePolicyThinProvisionNot,
                        vmTemplateConfigDiskWhereInput.elfStoragePolicyThinProvisionNot)
                && Objects.equals(this.id, vmTemplateConfigDiskWhereInput.id)
                && Objects.equals(this.idContains, vmTemplateConfigDiskWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmTemplateConfigDiskWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmTemplateConfigDiskWhereInput.idGt)
                && Objects.equals(this.idGte, vmTemplateConfigDiskWhereInput.idGte)
                && Objects.equals(this.idIn, vmTemplateConfigDiskWhereInput.idIn)
                && Objects.equals(this.idLt, vmTemplateConfigDiskWhereInput.idLt)
                && Objects.equals(this.idLte, vmTemplateConfigDiskWhereInput.idLte)
                && Objects.equals(this.idNot, vmTemplateConfigDiskWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmTemplateConfigDiskWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmTemplateConfigDiskWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmTemplateConfigDiskWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, vmTemplateConfigDiskWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmTemplateConfigDiskWhereInput.idStartsWith)
                && Objects.equals(this.index, vmTemplateConfigDiskWhereInput.index)
                && Objects.equals(this.indexGt, vmTemplateConfigDiskWhereInput.indexGt)
                && Objects.equals(this.indexGte, vmTemplateConfigDiskWhereInput.indexGte)
                && Objects.equals(this.indexIn, vmTemplateConfigDiskWhereInput.indexIn)
                && Objects.equals(this.indexLt, vmTemplateConfigDiskWhereInput.indexLt)
                && Objects.equals(this.indexLte, vmTemplateConfigDiskWhereInput.indexLte)
                && Objects.equals(this.indexNot, vmTemplateConfigDiskWhereInput.indexNot)
                && Objects.equals(this.indexNotIn, vmTemplateConfigDiskWhereInput.indexNotIn)
                && Objects.equals(this.iscsiLun, vmTemplateConfigDiskWhereInput.iscsiLun)
                && Objects.equals(this.maxBandwidth, vmTemplateConfigDiskWhereInput.maxBandwidth)
                && Objects.equals(
                        this.maxBandwidthGt, vmTemplateConfigDiskWhereInput.maxBandwidthGt)
                && Objects.equals(
                        this.maxBandwidthGte, vmTemplateConfigDiskWhereInput.maxBandwidthGte)
                && Objects.equals(
                        this.maxBandwidthIn, vmTemplateConfigDiskWhereInput.maxBandwidthIn)
                && Objects.equals(
                        this.maxBandwidthLt, vmTemplateConfigDiskWhereInput.maxBandwidthLt)
                && Objects.equals(
                        this.maxBandwidthLte, vmTemplateConfigDiskWhereInput.maxBandwidthLte)
                && Objects.equals(
                        this.maxBandwidthNot, vmTemplateConfigDiskWhereInput.maxBandwidthNot)
                && Objects.equals(
                        this.maxBandwidthNotIn, vmTemplateConfigDiskWhereInput.maxBandwidthNotIn)
                && Objects.equals(
                        this.maxBandwidthPolicy, vmTemplateConfigDiskWhereInput.maxBandwidthPolicy)
                && Objects.equals(
                        this.maxBandwidthPolicyIn,
                        vmTemplateConfigDiskWhereInput.maxBandwidthPolicyIn)
                && Objects.equals(
                        this.maxBandwidthPolicyNot,
                        vmTemplateConfigDiskWhereInput.maxBandwidthPolicyNot)
                && Objects.equals(
                        this.maxBandwidthPolicyNotIn,
                        vmTemplateConfigDiskWhereInput.maxBandwidthPolicyNotIn)
                && Objects.equals(this.maxIops, vmTemplateConfigDiskWhereInput.maxIops)
                && Objects.equals(this.maxIopsGt, vmTemplateConfigDiskWhereInput.maxIopsGt)
                && Objects.equals(this.maxIopsGte, vmTemplateConfigDiskWhereInput.maxIopsGte)
                && Objects.equals(this.maxIopsIn, vmTemplateConfigDiskWhereInput.maxIopsIn)
                && Objects.equals(this.maxIopsLt, vmTemplateConfigDiskWhereInput.maxIopsLt)
                && Objects.equals(this.maxIopsLte, vmTemplateConfigDiskWhereInput.maxIopsLte)
                && Objects.equals(this.maxIopsNot, vmTemplateConfigDiskWhereInput.maxIopsNot)
                && Objects.equals(this.maxIopsNotIn, vmTemplateConfigDiskWhereInput.maxIopsNotIn)
                && Objects.equals(this.maxIopsPolicy, vmTemplateConfigDiskWhereInput.maxIopsPolicy)
                && Objects.equals(
                        this.maxIopsPolicyIn, vmTemplateConfigDiskWhereInput.maxIopsPolicyIn)
                && Objects.equals(
                        this.maxIopsPolicyNot, vmTemplateConfigDiskWhereInput.maxIopsPolicyNot)
                && Objects.equals(
                        this.maxIopsPolicyNotIn, vmTemplateConfigDiskWhereInput.maxIopsPolicyNotIn)
                && Objects.equals(
                        this.provisionPolicy, vmTemplateConfigDiskWhereInput.provisionPolicy)
                && Objects.equals(
                        this.provisionPolicyContains,
                        vmTemplateConfigDiskWhereInput.provisionPolicyContains)
                && Objects.equals(
                        this.provisionPolicyEndsWith,
                        vmTemplateConfigDiskWhereInput.provisionPolicyEndsWith)
                && Objects.equals(
                        this.provisionPolicyGt, vmTemplateConfigDiskWhereInput.provisionPolicyGt)
                && Objects.equals(
                        this.provisionPolicyGte, vmTemplateConfigDiskWhereInput.provisionPolicyGte)
                && Objects.equals(
                        this.provisionPolicyIn, vmTemplateConfigDiskWhereInput.provisionPolicyIn)
                && Objects.equals(
                        this.provisionPolicyLt, vmTemplateConfigDiskWhereInput.provisionPolicyLt)
                && Objects.equals(
                        this.provisionPolicyLte, vmTemplateConfigDiskWhereInput.provisionPolicyLte)
                && Objects.equals(
                        this.provisionPolicyNot, vmTemplateConfigDiskWhereInput.provisionPolicyNot)
                && Objects.equals(
                        this.provisionPolicyNotContains,
                        vmTemplateConfigDiskWhereInput.provisionPolicyNotContains)
                && Objects.equals(
                        this.provisionPolicyNotEndsWith,
                        vmTemplateConfigDiskWhereInput.provisionPolicyNotEndsWith)
                && Objects.equals(
                        this.provisionPolicyNotIn,
                        vmTemplateConfigDiskWhereInput.provisionPolicyNotIn)
                && Objects.equals(
                        this.provisionPolicyNotStartsWith,
                        vmTemplateConfigDiskWhereInput.provisionPolicyNotStartsWith)
                && Objects.equals(
                        this.provisionPolicyStartsWith,
                        vmTemplateConfigDiskWhereInput.provisionPolicyStartsWith)
                && Objects.equals(
                        this.residentInCache, vmTemplateConfigDiskWhereInput.residentInCache)
                && Objects.equals(
                        this.residentInCacheNot, vmTemplateConfigDiskWhereInput.residentInCacheNot)
                && Objects.equals(this.size, vmTemplateConfigDiskWhereInput.size)
                && Objects.equals(this.sizeGt, vmTemplateConfigDiskWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, vmTemplateConfigDiskWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, vmTemplateConfigDiskWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, vmTemplateConfigDiskWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, vmTemplateConfigDiskWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, vmTemplateConfigDiskWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, vmTemplateConfigDiskWhereInput.sizeNotIn)
                && Objects.equals(
                        this.storageEncrypted, vmTemplateConfigDiskWhereInput.storageEncrypted)
                && Objects.equals(
                        this.storageEncryptedNot,
                        vmTemplateConfigDiskWhereInput.storageEncryptedNot)
                && Objects.equals(
                        this.storageEncryptionAlgorithm,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithm)
                && Objects.equals(
                        this.storageEncryptionAlgorithmContains,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmContains)
                && Objects.equals(
                        this.storageEncryptionAlgorithmEndsWith,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmEndsWith)
                && Objects.equals(
                        this.storageEncryptionAlgorithmGt,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmGt)
                && Objects.equals(
                        this.storageEncryptionAlgorithmGte,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmGte)
                && Objects.equals(
                        this.storageEncryptionAlgorithmIn,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmIn)
                && Objects.equals(
                        this.storageEncryptionAlgorithmLt,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmLt)
                && Objects.equals(
                        this.storageEncryptionAlgorithmLte,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmLte)
                && Objects.equals(
                        this.storageEncryptionAlgorithmNot,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmNot)
                && Objects.equals(
                        this.storageEncryptionAlgorithmNotContains,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmNotContains)
                && Objects.equals(
                        this.storageEncryptionAlgorithmNotEndsWith,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmNotEndsWith)
                && Objects.equals(
                        this.storageEncryptionAlgorithmNotIn,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmNotIn)
                && Objects.equals(
                        this.storageEncryptionAlgorithmNotStartsWith,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmNotStartsWith)
                && Objects.equals(
                        this.storageEncryptionAlgorithmStartsWith,
                        vmTemplateConfigDiskWhereInput.storageEncryptionAlgorithmStartsWith)
                && Objects.equals(this.storagePolicy, vmTemplateConfigDiskWhereInput.storagePolicy)
                && Objects.equals(
                        this.storagePolicyIn, vmTemplateConfigDiskWhereInput.storagePolicyIn)
                && Objects.equals(
                        this.storagePolicyNot, vmTemplateConfigDiskWhereInput.storagePolicyNot)
                && Objects.equals(
                        this.storagePolicyNotIn, vmTemplateConfigDiskWhereInput.storagePolicyNotIn)
                && Objects.equals(this.type, vmTemplateConfigDiskWhereInput.type)
                && Objects.equals(this.typeIn, vmTemplateConfigDiskWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmTemplateConfigDiskWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmTemplateConfigDiskWhereInput.typeNotIn)
                && Objects.equals(
                        this.vmTemplateConfig, vmTemplateConfigDiskWhereInput.vmTemplateConfig)
                && Objects.equals(
                        this.vmVolumeTemplateConfigFile,
                        vmTemplateConfigDiskWhereInput.vmVolumeTemplateConfigFile)
                && Objects.equals(
                        this.volumeStorageType, vmTemplateConfigDiskWhereInput.volumeStorageType)
                && Objects.equals(
                        this.volumeStorageTypeIn,
                        vmTemplateConfigDiskWhereInput.volumeStorageTypeIn)
                && Objects.equals(
                        this.volumeStorageTypeNot,
                        vmTemplateConfigDiskWhereInput.volumeStorageTypeNot)
                && Objects.equals(
                        this.volumeStorageTypeNotIn,
                        vmTemplateConfigDiskWhereInput.volumeStorageTypeNotIn);
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
                disabled,
                disabledNot,
                diskName,
                diskNameContains,
                diskNameEndsWith,
                diskNameGt,
                diskNameGte,
                diskNameIn,
                diskNameLt,
                diskNameLte,
                diskNameNot,
                diskNameNotContains,
                diskNameNotEndsWith,
                diskNameNotIn,
                diskNameNotStartsWith,
                diskNameStartsWith,
                elfStoragePolicyEcK,
                elfStoragePolicyEcKGt,
                elfStoragePolicyEcKGte,
                elfStoragePolicyEcKIn,
                elfStoragePolicyEcKLt,
                elfStoragePolicyEcKLte,
                elfStoragePolicyEcKNot,
                elfStoragePolicyEcKNotIn,
                elfStoragePolicyEcM,
                elfStoragePolicyEcMGt,
                elfStoragePolicyEcMGte,
                elfStoragePolicyEcMIn,
                elfStoragePolicyEcMLt,
                elfStoragePolicyEcMLte,
                elfStoragePolicyEcMNot,
                elfStoragePolicyEcMNotIn,
                elfStoragePolicyReplicaNum,
                elfStoragePolicyReplicaNumGt,
                elfStoragePolicyReplicaNumGte,
                elfStoragePolicyReplicaNumIn,
                elfStoragePolicyReplicaNumLt,
                elfStoragePolicyReplicaNumLte,
                elfStoragePolicyReplicaNumNot,
                elfStoragePolicyReplicaNumNotIn,
                elfStoragePolicyStripeNum,
                elfStoragePolicyStripeNumGt,
                elfStoragePolicyStripeNumGte,
                elfStoragePolicyStripeNumIn,
                elfStoragePolicyStripeNumLt,
                elfStoragePolicyStripeNumLte,
                elfStoragePolicyStripeNumNot,
                elfStoragePolicyStripeNumNotIn,
                elfStoragePolicyThinProvision,
                elfStoragePolicyThinProvisionNot,
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
                index,
                indexGt,
                indexGte,
                indexIn,
                indexLt,
                indexLte,
                indexNot,
                indexNotIn,
                iscsiLun,
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
                provisionPolicy,
                provisionPolicyContains,
                provisionPolicyEndsWith,
                provisionPolicyGt,
                provisionPolicyGte,
                provisionPolicyIn,
                provisionPolicyLt,
                provisionPolicyLte,
                provisionPolicyNot,
                provisionPolicyNotContains,
                provisionPolicyNotEndsWith,
                provisionPolicyNotIn,
                provisionPolicyNotStartsWith,
                provisionPolicyStartsWith,
                residentInCache,
                residentInCacheNot,
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                storageEncrypted,
                storageEncryptedNot,
                storageEncryptionAlgorithm,
                storageEncryptionAlgorithmContains,
                storageEncryptionAlgorithmEndsWith,
                storageEncryptionAlgorithmGt,
                storageEncryptionAlgorithmGte,
                storageEncryptionAlgorithmIn,
                storageEncryptionAlgorithmLt,
                storageEncryptionAlgorithmLte,
                storageEncryptionAlgorithmNot,
                storageEncryptionAlgorithmNotContains,
                storageEncryptionAlgorithmNotEndsWith,
                storageEncryptionAlgorithmNotIn,
                storageEncryptionAlgorithmNotStartsWith,
                storageEncryptionAlgorithmStartsWith,
                storagePolicy,
                storagePolicyIn,
                storagePolicyNot,
                storagePolicyNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vmTemplateConfig,
                vmVolumeTemplateConfigFile,
                volumeStorageType,
                volumeStorageTypeIn,
                volumeStorageTypeNot,
                volumeStorageTypeNotIn);
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
        sb.append("class VmTemplateConfigDiskWhereInput {\n");
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
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    disabledNot: ").append(toIndentedString(disabledNot)).append("\n");
        sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
        sb.append("    diskNameContains: ").append(toIndentedString(diskNameContains)).append("\n");
        sb.append("    diskNameEndsWith: ").append(toIndentedString(diskNameEndsWith)).append("\n");
        sb.append("    diskNameGt: ").append(toIndentedString(diskNameGt)).append("\n");
        sb.append("    diskNameGte: ").append(toIndentedString(diskNameGte)).append("\n");
        sb.append("    diskNameIn: ").append(toIndentedString(diskNameIn)).append("\n");
        sb.append("    diskNameLt: ").append(toIndentedString(diskNameLt)).append("\n");
        sb.append("    diskNameLte: ").append(toIndentedString(diskNameLte)).append("\n");
        sb.append("    diskNameNot: ").append(toIndentedString(diskNameNot)).append("\n");
        sb.append("    diskNameNotContains: ")
                .append(toIndentedString(diskNameNotContains))
                .append("\n");
        sb.append("    diskNameNotEndsWith: ")
                .append(toIndentedString(diskNameNotEndsWith))
                .append("\n");
        sb.append("    diskNameNotIn: ").append(toIndentedString(diskNameNotIn)).append("\n");
        sb.append("    diskNameNotStartsWith: ")
                .append(toIndentedString(diskNameNotStartsWith))
                .append("\n");
        sb.append("    diskNameStartsWith: ")
                .append(toIndentedString(diskNameStartsWith))
                .append("\n");
        sb.append("    elfStoragePolicyEcK: ")
                .append(toIndentedString(elfStoragePolicyEcK))
                .append("\n");
        sb.append("    elfStoragePolicyEcKGt: ")
                .append(toIndentedString(elfStoragePolicyEcKGt))
                .append("\n");
        sb.append("    elfStoragePolicyEcKGte: ")
                .append(toIndentedString(elfStoragePolicyEcKGte))
                .append("\n");
        sb.append("    elfStoragePolicyEcKIn: ")
                .append(toIndentedString(elfStoragePolicyEcKIn))
                .append("\n");
        sb.append("    elfStoragePolicyEcKLt: ")
                .append(toIndentedString(elfStoragePolicyEcKLt))
                .append("\n");
        sb.append("    elfStoragePolicyEcKLte: ")
                .append(toIndentedString(elfStoragePolicyEcKLte))
                .append("\n");
        sb.append("    elfStoragePolicyEcKNot: ")
                .append(toIndentedString(elfStoragePolicyEcKNot))
                .append("\n");
        sb.append("    elfStoragePolicyEcKNotIn: ")
                .append(toIndentedString(elfStoragePolicyEcKNotIn))
                .append("\n");
        sb.append("    elfStoragePolicyEcM: ")
                .append(toIndentedString(elfStoragePolicyEcM))
                .append("\n");
        sb.append("    elfStoragePolicyEcMGt: ")
                .append(toIndentedString(elfStoragePolicyEcMGt))
                .append("\n");
        sb.append("    elfStoragePolicyEcMGte: ")
                .append(toIndentedString(elfStoragePolicyEcMGte))
                .append("\n");
        sb.append("    elfStoragePolicyEcMIn: ")
                .append(toIndentedString(elfStoragePolicyEcMIn))
                .append("\n");
        sb.append("    elfStoragePolicyEcMLt: ")
                .append(toIndentedString(elfStoragePolicyEcMLt))
                .append("\n");
        sb.append("    elfStoragePolicyEcMLte: ")
                .append(toIndentedString(elfStoragePolicyEcMLte))
                .append("\n");
        sb.append("    elfStoragePolicyEcMNot: ")
                .append(toIndentedString(elfStoragePolicyEcMNot))
                .append("\n");
        sb.append("    elfStoragePolicyEcMNotIn: ")
                .append(toIndentedString(elfStoragePolicyEcMNotIn))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNum: ")
                .append(toIndentedString(elfStoragePolicyReplicaNum))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumGt: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumGt))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumGte: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumGte))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumIn: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumIn))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumLt: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumLt))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumLte: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumLte))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumNot: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumNot))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNumNotIn: ")
                .append(toIndentedString(elfStoragePolicyReplicaNumNotIn))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNum: ")
                .append(toIndentedString(elfStoragePolicyStripeNum))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumGt: ")
                .append(toIndentedString(elfStoragePolicyStripeNumGt))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumGte: ")
                .append(toIndentedString(elfStoragePolicyStripeNumGte))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumIn: ")
                .append(toIndentedString(elfStoragePolicyStripeNumIn))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumLt: ")
                .append(toIndentedString(elfStoragePolicyStripeNumLt))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumLte: ")
                .append(toIndentedString(elfStoragePolicyStripeNumLte))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumNot: ")
                .append(toIndentedString(elfStoragePolicyStripeNumNot))
                .append("\n");
        sb.append("    elfStoragePolicyStripeNumNotIn: ")
                .append(toIndentedString(elfStoragePolicyStripeNumNotIn))
                .append("\n");
        sb.append("    elfStoragePolicyThinProvision: ")
                .append(toIndentedString(elfStoragePolicyThinProvision))
                .append("\n");
        sb.append("    elfStoragePolicyThinProvisionNot: ")
                .append(toIndentedString(elfStoragePolicyThinProvisionNot))
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
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    indexGt: ").append(toIndentedString(indexGt)).append("\n");
        sb.append("    indexGte: ").append(toIndentedString(indexGte)).append("\n");
        sb.append("    indexIn: ").append(toIndentedString(indexIn)).append("\n");
        sb.append("    indexLt: ").append(toIndentedString(indexLt)).append("\n");
        sb.append("    indexLte: ").append(toIndentedString(indexLte)).append("\n");
        sb.append("    indexNot: ").append(toIndentedString(indexNot)).append("\n");
        sb.append("    indexNotIn: ").append(toIndentedString(indexNotIn)).append("\n");
        sb.append("    iscsiLun: ").append(toIndentedString(iscsiLun)).append("\n");
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
        sb.append("    provisionPolicy: ").append(toIndentedString(provisionPolicy)).append("\n");
        sb.append("    provisionPolicyContains: ")
                .append(toIndentedString(provisionPolicyContains))
                .append("\n");
        sb.append("    provisionPolicyEndsWith: ")
                .append(toIndentedString(provisionPolicyEndsWith))
                .append("\n");
        sb.append("    provisionPolicyGt: ")
                .append(toIndentedString(provisionPolicyGt))
                .append("\n");
        sb.append("    provisionPolicyGte: ")
                .append(toIndentedString(provisionPolicyGte))
                .append("\n");
        sb.append("    provisionPolicyIn: ")
                .append(toIndentedString(provisionPolicyIn))
                .append("\n");
        sb.append("    provisionPolicyLt: ")
                .append(toIndentedString(provisionPolicyLt))
                .append("\n");
        sb.append("    provisionPolicyLte: ")
                .append(toIndentedString(provisionPolicyLte))
                .append("\n");
        sb.append("    provisionPolicyNot: ")
                .append(toIndentedString(provisionPolicyNot))
                .append("\n");
        sb.append("    provisionPolicyNotContains: ")
                .append(toIndentedString(provisionPolicyNotContains))
                .append("\n");
        sb.append("    provisionPolicyNotEndsWith: ")
                .append(toIndentedString(provisionPolicyNotEndsWith))
                .append("\n");
        sb.append("    provisionPolicyNotIn: ")
                .append(toIndentedString(provisionPolicyNotIn))
                .append("\n");
        sb.append("    provisionPolicyNotStartsWith: ")
                .append(toIndentedString(provisionPolicyNotStartsWith))
                .append("\n");
        sb.append("    provisionPolicyStartsWith: ")
                .append(toIndentedString(provisionPolicyStartsWith))
                .append("\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    residentInCacheNot: ")
                .append(toIndentedString(residentInCacheNot))
                .append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
        sb.append("    storageEncryptedNot: ")
                .append(toIndentedString(storageEncryptedNot))
                .append("\n");
        sb.append("    storageEncryptionAlgorithm: ")
                .append(toIndentedString(storageEncryptionAlgorithm))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmContains: ")
                .append(toIndentedString(storageEncryptionAlgorithmContains))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmEndsWith: ")
                .append(toIndentedString(storageEncryptionAlgorithmEndsWith))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmGt: ")
                .append(toIndentedString(storageEncryptionAlgorithmGt))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmGte: ")
                .append(toIndentedString(storageEncryptionAlgorithmGte))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmIn: ")
                .append(toIndentedString(storageEncryptionAlgorithmIn))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmLt: ")
                .append(toIndentedString(storageEncryptionAlgorithmLt))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmLte: ")
                .append(toIndentedString(storageEncryptionAlgorithmLte))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmNot: ")
                .append(toIndentedString(storageEncryptionAlgorithmNot))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmNotContains: ")
                .append(toIndentedString(storageEncryptionAlgorithmNotContains))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmNotEndsWith: ")
                .append(toIndentedString(storageEncryptionAlgorithmNotEndsWith))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmNotIn: ")
                .append(toIndentedString(storageEncryptionAlgorithmNotIn))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmNotStartsWith: ")
                .append(toIndentedString(storageEncryptionAlgorithmNotStartsWith))
                .append("\n");
        sb.append("    storageEncryptionAlgorithmStartsWith: ")
                .append(toIndentedString(storageEncryptionAlgorithmStartsWith))
                .append("\n");
        sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
        sb.append("    storagePolicyIn: ").append(toIndentedString(storagePolicyIn)).append("\n");
        sb.append("    storagePolicyNot: ").append(toIndentedString(storagePolicyNot)).append("\n");
        sb.append("    storagePolicyNotIn: ")
                .append(toIndentedString(storagePolicyNotIn))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vmTemplateConfig: ").append(toIndentedString(vmTemplateConfig)).append("\n");
        sb.append("    vmVolumeTemplateConfigFile: ")
                .append(toIndentedString(vmVolumeTemplateConfigFile))
                .append("\n");
        sb.append("    volumeStorageType: ")
                .append(toIndentedString(volumeStorageType))
                .append("\n");
        sb.append("    volumeStorageTypeIn: ")
                .append(toIndentedString(volumeStorageTypeIn))
                .append("\n");
        sb.append("    volumeStorageTypeNot: ")
                .append(toIndentedString(volumeStorageTypeNot))
                .append("\n");
        sb.append("    volumeStorageTypeNotIn: ")
                .append(toIndentedString(volumeStorageTypeNotIn))
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

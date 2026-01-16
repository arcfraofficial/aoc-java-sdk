package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmVolumeSnapshotWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolumeSnapshotWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmVolumeSnapshotWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmVolumeSnapshotWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmVolumeSnapshotWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CREATE_AT = "createAt";

    @SerializedName(SERIALIZED_NAME_CREATE_AT)
    private String createAt;

    public static final String SERIALIZED_NAME_CREATE_AT_GT = "createAt_gt";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_GT)
    private String createAtGt;

    public static final String SERIALIZED_NAME_CREATE_AT_GTE = "createAt_gte";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_GTE)
    private String createAtGte;

    public static final String SERIALIZED_NAME_CREATE_AT_IN = "createAt_in";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_IN)
    private List<String> createAtIn = null;

    public static final String SERIALIZED_NAME_CREATE_AT_LT = "createAt_lt";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_LT)
    private String createAtLt;

    public static final String SERIALIZED_NAME_CREATE_AT_LTE = "createAt_lte";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_LTE)
    private String createAtLte;

    public static final String SERIALIZED_NAME_CREATE_AT_NOT = "createAt_not";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_NOT)
    private String createAtNot;

    public static final String SERIALIZED_NAME_CREATE_AT_NOT_IN = "createAt_not_in";

    @SerializedName(SERIALIZED_NAME_CREATE_AT_NOT_IN)
    private List<String> createAtNotIn = null;

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

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

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

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_IN = "elf_storage_policy_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN)
    private List<VmVolumeElfStoragePolicyType> elfStoragePolicyIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT = "elf_storage_policy_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT)
    private VmVolumeElfStoragePolicyType elfStoragePolicyNot;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN =
            "elf_storage_policy_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN)
    private List<VmVolumeElfStoragePolicyType> elfStoragePolicyNotIn = null;

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

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION =
            "elf_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION)
    private Boolean elfStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT =
            "elf_storage_policy_thin_provision_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT)
    private Boolean elfStoragePolicyThinProvisionNot;

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

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT = "resident_in_cache_not";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT)
    private Boolean residentInCacheNot;

    public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
    private Double sharedSize;

    public static final String SERIALIZED_NAME_SHARED_SIZE_GT = "shared_size_gt";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_GT)
    private Double sharedSizeGt;

    public static final String SERIALIZED_NAME_SHARED_SIZE_GTE = "shared_size_gte";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_GTE)
    private Double sharedSizeGte;

    public static final String SERIALIZED_NAME_SHARED_SIZE_IN = "shared_size_in";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_IN)
    private List<Double> sharedSizeIn = null;

    public static final String SERIALIZED_NAME_SHARED_SIZE_LT = "shared_size_lt";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_LT)
    private Double sharedSizeLt;

    public static final String SERIALIZED_NAME_SHARED_SIZE_LTE = "shared_size_lte";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_LTE)
    private Double sharedSizeLte;

    public static final String SERIALIZED_NAME_SHARED_SIZE_NOT = "shared_size_not";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_NOT)
    private Double sharedSizeNot;

    public static final String SERIALIZED_NAME_SHARED_SIZE_NOT_IN = "shared_size_not_in";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_NOT_IN)
    private List<Double> sharedSizeNotIn = null;

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

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmVolumeSnapshotType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<VmVolumeSnapshotType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private VmVolumeSnapshotType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<VmVolumeSnapshotType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Double uniqueSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GT = "unique_size_gt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GT)
    private Double uniqueSizeGt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GTE = "unique_size_gte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GTE)
    private Double uniqueSizeGte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_IN = "unique_size_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_IN)
    private List<Double> uniqueSizeIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LT = "unique_size_lt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LT)
    private Double uniqueSizeLt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LTE = "unique_size_lte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LTE)
    private Double uniqueSizeLte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT = "unique_size_not";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT)
    private Double uniqueSizeNot;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN = "unique_size_not_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN)
    private List<Double> uniqueSizeNotIn = null;

    public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME)
    private VmVolumeWhereInput vmVolume;

    public static final String SERIALIZED_NAME_VOLUME_SHARING = "volume_sharing";

    @SerializedName(SERIALIZED_NAME_VOLUME_SHARING)
    private Boolean volumeSharing;

    public static final String SERIALIZED_NAME_VOLUME_SHARING_NOT = "volume_sharing_not";

    @SerializedName(SERIALIZED_NAME_VOLUME_SHARING_NOT)
    private Boolean volumeSharingNot;

    public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume_size";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
    private Double volumeSize;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_GT = "volume_size_gt";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_GT)
    private Double volumeSizeGt;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_GTE = "volume_size_gte";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_GTE)
    private Double volumeSizeGte;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_IN = "volume_size_in";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_IN)
    private List<Double> volumeSizeIn = null;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_LT = "volume_size_lt";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_LT)
    private Double volumeSizeLt;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_LTE = "volume_size_lte";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_LTE)
    private Double volumeSizeLte;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_NOT = "volume_size_not";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_NOT)
    private Double volumeSizeNot;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_NOT_IN = "volume_size_not_in";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN)
    private List<Double> volumeSizeNotIn = null;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID = "zbs_snapshot_uuid";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID)
    private String zbsSnapshotUuid;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS =
            "zbs_snapshot_uuid_contains";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS)
    private String zbsSnapshotUuidContains;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH =
            "zbs_snapshot_uuid_ends_with";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH)
    private String zbsSnapshotUuidEndsWith;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT = "zbs_snapshot_uuid_gt";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT)
    private String zbsSnapshotUuidGt;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE = "zbs_snapshot_uuid_gte";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE)
    private String zbsSnapshotUuidGte;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN = "zbs_snapshot_uuid_in";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN)
    private List<String> zbsSnapshotUuidIn = null;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT = "zbs_snapshot_uuid_lt";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT)
    private String zbsSnapshotUuidLt;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE = "zbs_snapshot_uuid_lte";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE)
    private String zbsSnapshotUuidLte;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT = "zbs_snapshot_uuid_not";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT)
    private String zbsSnapshotUuidNot;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS =
            "zbs_snapshot_uuid_not_contains";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS)
    private String zbsSnapshotUuidNotContains;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH =
            "zbs_snapshot_uuid_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH)
    private String zbsSnapshotUuidNotEndsWith;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN =
            "zbs_snapshot_uuid_not_in";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN)
    private List<String> zbsSnapshotUuidNotIn = null;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH =
            "zbs_snapshot_uuid_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH)
    private String zbsSnapshotUuidNotStartsWith;

    public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH =
            "zbs_snapshot_uuid_starts_with";

    @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH)
    private String zbsSnapshotUuidStartsWith;

    public VmVolumeSnapshotWhereInput() {}

    public VmVolumeSnapshotWhereInput AND(List<VmVolumeSnapshotWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmVolumeSnapshotWhereInput addANDItem(VmVolumeSnapshotWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmVolumeSnapshotWhereInput>();
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
    public List<VmVolumeSnapshotWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmVolumeSnapshotWhereInput> AND) {
        this.AND = AND;
    }

    public VmVolumeSnapshotWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmVolumeSnapshotWhereInput AND_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput NOT(List<VmVolumeSnapshotWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmVolumeSnapshotWhereInput addNOTItem(VmVolumeSnapshotWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmVolumeSnapshotWhereInput>();
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
    public List<VmVolumeSnapshotWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmVolumeSnapshotWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmVolumeSnapshotWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmVolumeSnapshotWhereInput NOT_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput OR(List<VmVolumeSnapshotWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmVolumeSnapshotWhereInput addORItem(VmVolumeSnapshotWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmVolumeSnapshotWhereInput>();
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
    public List<VmVolumeSnapshotWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmVolumeSnapshotWhereInput> OR) {
        this.OR = OR;
    }

    public VmVolumeSnapshotWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmVolumeSnapshotWhereInput OR_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput cluster(ClusterWhereInput cluster) {

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

    public VmVolumeSnapshotWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmVolumeSnapshotWhereInput cluster_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput createAt(String createAt) {

        this.createAt = createAt;
        return this;
    }

    /**
     * Get createAt
     *
     * @return createAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public VmVolumeSnapshotWhereInput createAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT);
        return this;
    }

    public void setCreateAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT);
        }
    }

    public boolean getCreateAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT);
    }

    public VmVolumeSnapshotWhereInput createAtGt(String createAtGt) {

        this.createAtGt = createAtGt;
        return this;
    }

    /**
     * Get createAtGt
     *
     * @return createAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAtGt() {
        return createAtGt;
    }

    public void setCreateAtGt(String createAtGt) {
        this.createAtGt = createAtGt;
    }

    public VmVolumeSnapshotWhereInput createAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_GT);
        return this;
    }

    public void setCreateAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_GT);
        }
    }

    public boolean getCreateAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_GT);
    }

    public VmVolumeSnapshotWhereInput createAtGte(String createAtGte) {

        this.createAtGte = createAtGte;
        return this;
    }

    /**
     * Get createAtGte
     *
     * @return createAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAtGte() {
        return createAtGte;
    }

    public void setCreateAtGte(String createAtGte) {
        this.createAtGte = createAtGte;
    }

    public VmVolumeSnapshotWhereInput createAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_GTE);
        return this;
    }

    public void setCreateAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_GTE);
        }
    }

    public boolean getCreateAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_GTE);
    }

    public VmVolumeSnapshotWhereInput createAtIn(List<String> createAtIn) {

        this.createAtIn = createAtIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addCreateAtInItem(String createAtInItem) {
        if (this.createAtIn == null) {
            this.createAtIn = new ArrayList<String>();
        }
        this.createAtIn.add(createAtInItem);
        return this;
    }

    /**
     * Get createAtIn
     *
     * @return createAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreateAtIn() {
        return createAtIn;
    }

    public void setCreateAtIn(List<String> createAtIn) {
        this.createAtIn = createAtIn;
    }

    public VmVolumeSnapshotWhereInput createAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_IN);
        return this;
    }

    public void setCreateAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_IN);
        }
    }

    public boolean getCreateAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_IN);
    }

    public VmVolumeSnapshotWhereInput createAtLt(String createAtLt) {

        this.createAtLt = createAtLt;
        return this;
    }

    /**
     * Get createAtLt
     *
     * @return createAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAtLt() {
        return createAtLt;
    }

    public void setCreateAtLt(String createAtLt) {
        this.createAtLt = createAtLt;
    }

    public VmVolumeSnapshotWhereInput createAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_LT);
        return this;
    }

    public void setCreateAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_LT);
        }
    }

    public boolean getCreateAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_LT);
    }

    public VmVolumeSnapshotWhereInput createAtLte(String createAtLte) {

        this.createAtLte = createAtLte;
        return this;
    }

    /**
     * Get createAtLte
     *
     * @return createAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAtLte() {
        return createAtLte;
    }

    public void setCreateAtLte(String createAtLte) {
        this.createAtLte = createAtLte;
    }

    public VmVolumeSnapshotWhereInput createAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_LTE);
        return this;
    }

    public void setCreateAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_LTE);
        }
    }

    public boolean getCreateAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_LTE);
    }

    public VmVolumeSnapshotWhereInput createAtNot(String createAtNot) {

        this.createAtNot = createAtNot;
        return this;
    }

    /**
     * Get createAtNot
     *
     * @return createAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateAtNot() {
        return createAtNot;
    }

    public void setCreateAtNot(String createAtNot) {
        this.createAtNot = createAtNot;
    }

    public VmVolumeSnapshotWhereInput createAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_NOT);
        return this;
    }

    public void setCreateAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_NOT);
        }
    }

    public boolean getCreateAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_NOT);
    }

    public VmVolumeSnapshotWhereInput createAtNotIn(List<String> createAtNotIn) {

        this.createAtNotIn = createAtNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addCreateAtNotInItem(String createAtNotInItem) {
        if (this.createAtNotIn == null) {
            this.createAtNotIn = new ArrayList<String>();
        }
        this.createAtNotIn.add(createAtNotInItem);
        return this;
    }

    /**
     * Get createAtNotIn
     *
     * @return createAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreateAtNotIn() {
        return createAtNotIn;
    }

    public void setCreateAtNotIn(List<String> createAtNotIn) {
        this.createAtNotIn = createAtNotIn;
    }

    public VmVolumeSnapshotWhereInput createAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput createAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_NOT_IN);
        return this;
    }

    public void setCreateAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_AT_NOT_IN);
        }
    }

    public boolean getCreateAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_AT_NOT_IN);
    }

    public VmVolumeSnapshotWhereInput description(String description) {

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

    public VmVolumeSnapshotWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmVolumeSnapshotWhereInput description_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionContains(String descriptionContains) {

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

    public VmVolumeSnapshotWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VmVolumeSnapshotWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionGt(String descriptionGt) {

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

    public VmVolumeSnapshotWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionGte(String descriptionGte) {

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

    public VmVolumeSnapshotWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VmVolumeSnapshotWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionLt(String descriptionLt) {

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

    public VmVolumeSnapshotWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionLte(String descriptionLte) {

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

    public VmVolumeSnapshotWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionNot(String descriptionNot) {

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

    public VmVolumeSnapshotWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public VmVolumeSnapshotWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public VmVolumeSnapshotWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public VmVolumeSnapshotWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public VmVolumeSnapshotWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VmVolumeSnapshotWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicy(
            VmVolumeElfStoragePolicyType elfStoragePolicy) {

        this.elfStoragePolicy = elfStoragePolicy;
        return this;
    }

    /**
     * Get elfStoragePolicy
     *
     * @return elfStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
        return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
        this.elfStoragePolicy = elfStoragePolicy;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public void setElfStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        }
    }

    public boolean getElfStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY);
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcK(Integer elfStoragePolicyEcK) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcK_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKGt(Integer elfStoragePolicyEcKGt) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKGte(Integer elfStoragePolicyEcKGte) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKIn(List<Integer> elfStoragePolicyEcKIn) {

        this.elfStoragePolicyEcKIn = elfStoragePolicyEcKIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyEcKInItem(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKLt(Integer elfStoragePolicyEcKLt) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKLte(Integer elfStoragePolicyEcKLte) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKNot(Integer elfStoragePolicyEcKNot) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKNotIn(
            List<Integer> elfStoragePolicyEcKNotIn) {

        this.elfStoragePolicyEcKNotIn = elfStoragePolicyEcKNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyEcKNotInItem(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcKNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcM(Integer elfStoragePolicyEcM) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcM_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMGt(Integer elfStoragePolicyEcMGt) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMGte(Integer elfStoragePolicyEcMGte) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMIn(List<Integer> elfStoragePolicyEcMIn) {

        this.elfStoragePolicyEcMIn = elfStoragePolicyEcMIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyEcMInItem(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMLt(Integer elfStoragePolicyEcMLt) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMLte(Integer elfStoragePolicyEcMLte) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMNot(Integer elfStoragePolicyEcMNot) {

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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMNotIn(
            List<Integer> elfStoragePolicyEcMNotIn) {

        this.elfStoragePolicyEcMNotIn = elfStoragePolicyEcMNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyEcMNotInItem(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyEcMNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyIn(
            List<VmVolumeElfStoragePolicyType> elfStoragePolicyIn) {

        this.elfStoragePolicyIn = elfStoragePolicyIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyInItem(
            VmVolumeElfStoragePolicyType elfStoragePolicyInItem) {
        if (this.elfStoragePolicyIn == null) {
            this.elfStoragePolicyIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.elfStoragePolicyIn.add(elfStoragePolicyInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyIn
     *
     * @return elfStoragePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getElfStoragePolicyIn() {
        return elfStoragePolicyIn;
    }

    public void setElfStoragePolicyIn(List<VmVolumeElfStoragePolicyType> elfStoragePolicyIn) {
        this.elfStoragePolicyIn = elfStoragePolicyIn;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        return this;
    }

    public void setElfStoragePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        }
    }

    public boolean getElfStoragePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyNot(
            VmVolumeElfStoragePolicyType elfStoragePolicyNot) {

        this.elfStoragePolicyNot = elfStoragePolicyNot;
        return this;
    }

    /**
     * Get elfStoragePolicyNot
     *
     * @return elfStoragePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicyNot() {
        return elfStoragePolicyNot;
    }

    public void setElfStoragePolicyNot(VmVolumeElfStoragePolicyType elfStoragePolicyNot) {
        this.elfStoragePolicyNot = elfStoragePolicyNot;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        return this;
    }

    public void setElfStoragePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        }
    }

    public boolean getElfStoragePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> elfStoragePolicyNotIn) {

        this.elfStoragePolicyNotIn = elfStoragePolicyNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyNotInItem(
            VmVolumeElfStoragePolicyType elfStoragePolicyNotInItem) {
        if (this.elfStoragePolicyNotIn == null) {
            this.elfStoragePolicyNotIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.elfStoragePolicyNotIn.add(elfStoragePolicyNotInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyNotIn
     *
     * @return elfStoragePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getElfStoragePolicyNotIn() {
        return elfStoragePolicyNotIn;
    }

    public void setElfStoragePolicyNotIn(List<VmVolumeElfStoragePolicyType> elfStoragePolicyNotIn) {
        this.elfStoragePolicyNotIn = elfStoragePolicyNotIn;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public void setElfStoragePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        }
    }

    public boolean getElfStoragePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNum(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNum_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumGt(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumGte(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumIn(
            List<Integer> elfStoragePolicyReplicaNumIn) {

        this.elfStoragePolicyReplicaNumIn = elfStoragePolicyReplicaNumIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyReplicaNumInItem(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumLt(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumLte(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumNot(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumNotIn(
            List<Integer> elfStoragePolicyReplicaNumNotIn) {

        this.elfStoragePolicyReplicaNumNotIn = elfStoragePolicyReplicaNumNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addElfStoragePolicyReplicaNumNotInItem(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyReplicaNumNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyThinProvision(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyThinProvision_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyThinProvisionNot(
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

    public VmVolumeSnapshotWhereInput elfStoragePolicyThinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput elfStoragePolicyThinProvisionNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmVolumeSnapshotWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmVolumeSnapshotWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addEntityAsyncStatusInItem(
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

    public VmVolumeSnapshotWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VmVolumeSnapshotWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addEntityAsyncStatusNotInItem(
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

    public VmVolumeSnapshotWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput id(String id) {

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

    public VmVolumeSnapshotWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmVolumeSnapshotWhereInput id_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idContains(String idContains) {

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

    public VmVolumeSnapshotWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput idContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idEndsWith(String idEndsWith) {

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

    public VmVolumeSnapshotWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idGt(String idGt) {

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

    public VmVolumeSnapshotWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput idGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idGte(String idGte) {

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

    public VmVolumeSnapshotWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput idGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addIdInItem(String idInItem) {
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

    public VmVolumeSnapshotWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput idIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idLt(String idLt) {

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

    public VmVolumeSnapshotWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput idLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idLte(String idLte) {

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

    public VmVolumeSnapshotWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput idLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idNot(String idNot) {

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

    public VmVolumeSnapshotWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput idNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idNotContains(String idNotContains) {

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

    public VmVolumeSnapshotWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmVolumeSnapshotWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmVolumeSnapshotWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmVolumeSnapshotWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput idStartsWith(String idStartsWith) {

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

    public VmVolumeSnapshotWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public VmVolumeSnapshotWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public VmVolumeSnapshotWhereInput labelsEvery_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public VmVolumeSnapshotWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public VmVolumeSnapshotWhereInput labelsNone_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public VmVolumeSnapshotWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public VmVolumeSnapshotWhereInput labelsSome_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAt(String localCreatedAt) {

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

    public VmVolumeSnapshotWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtGt(String localCreatedAtGt) {

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

    public VmVolumeSnapshotWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtGte(String localCreatedAtGte) {

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

    public VmVolumeSnapshotWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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

    public VmVolumeSnapshotWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtLt(String localCreatedAtLt) {

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

    public VmVolumeSnapshotWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtLte(String localCreatedAtLte) {

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

    public VmVolumeSnapshotWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtNot(String localCreatedAtNot) {

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

    public VmVolumeSnapshotWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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

    public VmVolumeSnapshotWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localId(String localId) {

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

    public VmVolumeSnapshotWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmVolumeSnapshotWhereInput localId_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdContains(String localIdContains) {

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

    public VmVolumeSnapshotWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VmVolumeSnapshotWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdGt(String localIdGt) {

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

    public VmVolumeSnapshotWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdGte(String localIdGte) {

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

    public VmVolumeSnapshotWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VmVolumeSnapshotWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdLt(String localIdLt) {

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

    public VmVolumeSnapshotWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdLte(String localIdLte) {

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

    public VmVolumeSnapshotWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdNot(String localIdNot) {

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

    public VmVolumeSnapshotWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdNotContains(String localIdNotContains) {

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

    public VmVolumeSnapshotWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VmVolumeSnapshotWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VmVolumeSnapshotWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VmVolumeSnapshotWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VmVolumeSnapshotWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput name(String name) {

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

    public VmVolumeSnapshotWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVolumeSnapshotWhereInput name_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameContains(String nameContains) {

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

    public VmVolumeSnapshotWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameEndsWith(String nameEndsWith) {

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

    public VmVolumeSnapshotWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameGt(String nameGt) {

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

    public VmVolumeSnapshotWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameGte(String nameGte) {

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

    public VmVolumeSnapshotWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addNameInItem(String nameInItem) {
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

    public VmVolumeSnapshotWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameLt(String nameLt) {

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

    public VmVolumeSnapshotWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameLte(String nameLte) {

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

    public VmVolumeSnapshotWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameNot(String nameNot) {

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

    public VmVolumeSnapshotWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameNotContains(String nameNotContains) {

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

    public VmVolumeSnapshotWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VmVolumeSnapshotWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VmVolumeSnapshotWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VmVolumeSnapshotWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput nameStartsWith(String nameStartsWith) {

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

    public VmVolumeSnapshotWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput residentInCache(Boolean residentInCache) {

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

    public VmVolumeSnapshotWhereInput residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public VmVolumeSnapshotWhereInput residentInCache_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput residentInCacheNot(Boolean residentInCacheNot) {

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

    public VmVolumeSnapshotWhereInput residentInCacheNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput residentInCacheNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sharedSize(Double sharedSize) {

        this.sharedSize = sharedSize;
        return this;
    }

    /**
     * Get sharedSize
     *
     * @return sharedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSize() {
        return sharedSize;
    }

    public void setSharedSize(Double sharedSize) {
        this.sharedSize = sharedSize;
    }

    public VmVolumeSnapshotWhereInput sharedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public void setSharedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE);
        }
    }

    public boolean getSharedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE);
    }

    public VmVolumeSnapshotWhereInput sharedSizeGt(Double sharedSizeGt) {

        this.sharedSizeGt = sharedSizeGt;
        return this;
    }

    /**
     * Get sharedSizeGt
     *
     * @return sharedSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSizeGt() {
        return sharedSizeGt;
    }

    public void setSharedSizeGt(Double sharedSizeGt) {
        this.sharedSizeGt = sharedSizeGt;
    }

    public VmVolumeSnapshotWhereInput sharedSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_GT);
        return this;
    }

    public void setSharedSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_GT);
        }
    }

    public boolean getSharedSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_GT);
    }

    public VmVolumeSnapshotWhereInput sharedSizeGte(Double sharedSizeGte) {

        this.sharedSizeGte = sharedSizeGte;
        return this;
    }

    /**
     * Get sharedSizeGte
     *
     * @return sharedSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSizeGte() {
        return sharedSizeGte;
    }

    public void setSharedSizeGte(Double sharedSizeGte) {
        this.sharedSizeGte = sharedSizeGte;
    }

    public VmVolumeSnapshotWhereInput sharedSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_GTE);
        return this;
    }

    public void setSharedSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_GTE);
        }
    }

    public boolean getSharedSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_GTE);
    }

    public VmVolumeSnapshotWhereInput sharedSizeIn(List<Double> sharedSizeIn) {

        this.sharedSizeIn = sharedSizeIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addSharedSizeInItem(Double sharedSizeInItem) {
        if (this.sharedSizeIn == null) {
            this.sharedSizeIn = new ArrayList<Double>();
        }
        this.sharedSizeIn.add(sharedSizeInItem);
        return this;
    }

    /**
     * Get sharedSizeIn
     *
     * @return sharedSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getSharedSizeIn() {
        return sharedSizeIn;
    }

    public void setSharedSizeIn(List<Double> sharedSizeIn) {
        this.sharedSizeIn = sharedSizeIn;
    }

    public VmVolumeSnapshotWhereInput sharedSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_IN);
        return this;
    }

    public void setSharedSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_IN);
        }
    }

    public boolean getSharedSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_IN);
    }

    public VmVolumeSnapshotWhereInput sharedSizeLt(Double sharedSizeLt) {

        this.sharedSizeLt = sharedSizeLt;
        return this;
    }

    /**
     * Get sharedSizeLt
     *
     * @return sharedSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSizeLt() {
        return sharedSizeLt;
    }

    public void setSharedSizeLt(Double sharedSizeLt) {
        this.sharedSizeLt = sharedSizeLt;
    }

    public VmVolumeSnapshotWhereInput sharedSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_LT);
        return this;
    }

    public void setSharedSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_LT);
        }
    }

    public boolean getSharedSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_LT);
    }

    public VmVolumeSnapshotWhereInput sharedSizeLte(Double sharedSizeLte) {

        this.sharedSizeLte = sharedSizeLte;
        return this;
    }

    /**
     * Get sharedSizeLte
     *
     * @return sharedSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSizeLte() {
        return sharedSizeLte;
    }

    public void setSharedSizeLte(Double sharedSizeLte) {
        this.sharedSizeLte = sharedSizeLte;
    }

    public VmVolumeSnapshotWhereInput sharedSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_LTE);
        return this;
    }

    public void setSharedSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_LTE);
        }
    }

    public boolean getSharedSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_LTE);
    }

    public VmVolumeSnapshotWhereInput sharedSizeNot(Double sharedSizeNot) {

        this.sharedSizeNot = sharedSizeNot;
        return this;
    }

    /**
     * Get sharedSizeNot
     *
     * @return sharedSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSharedSizeNot() {
        return sharedSizeNot;
    }

    public void setSharedSizeNot(Double sharedSizeNot) {
        this.sharedSizeNot = sharedSizeNot;
    }

    public VmVolumeSnapshotWhereInput sharedSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_NOT);
        return this;
    }

    public void setSharedSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_NOT);
        }
    }

    public boolean getSharedSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_NOT);
    }

    public VmVolumeSnapshotWhereInput sharedSizeNotIn(List<Double> sharedSizeNotIn) {

        this.sharedSizeNotIn = sharedSizeNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addSharedSizeNotInItem(Double sharedSizeNotInItem) {
        if (this.sharedSizeNotIn == null) {
            this.sharedSizeNotIn = new ArrayList<Double>();
        }
        this.sharedSizeNotIn.add(sharedSizeNotInItem);
        return this;
    }

    /**
     * Get sharedSizeNotIn
     *
     * @return sharedSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getSharedSizeNotIn() {
        return sharedSizeNotIn;
    }

    public void setSharedSizeNotIn(List<Double> sharedSizeNotIn) {
        this.sharedSizeNotIn = sharedSizeNotIn;
    }

    public VmVolumeSnapshotWhereInput sharedSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput sharedSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_NOT_IN);
        return this;
    }

    public void setSharedSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE_NOT_IN);
        }
    }

    public boolean getSharedSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE_NOT_IN);
    }

    public VmVolumeSnapshotWhereInput size(Double size) {

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

    public VmVolumeSnapshotWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmVolumeSnapshotWhereInput size_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeGt(Double sizeGt) {

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

    public VmVolumeSnapshotWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeGt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeGte(Double sizeGte) {

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

    public VmVolumeSnapshotWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeGte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeIn(List<Double> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addSizeInItem(Double sizeInItem) {
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

    public VmVolumeSnapshotWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeLt(Double sizeLt) {

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

    public VmVolumeSnapshotWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeLt_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeLte(Double sizeLte) {

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

    public VmVolumeSnapshotWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeLte_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeNot(Double sizeNot) {

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

    public VmVolumeSnapshotWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput sizeNotIn(List<Double> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addSizeNotInItem(Double sizeNotInItem) {
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

    public VmVolumeSnapshotWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput sizeNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput type(VmVolumeSnapshotType type) {

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
    public VmVolumeSnapshotType getType() {
        return type;
    }

    public void setType(VmVolumeSnapshotType type) {
        this.type = type;
    }

    public VmVolumeSnapshotWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmVolumeSnapshotWhereInput type_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput typeIn(List<VmVolumeSnapshotType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addTypeInItem(VmVolumeSnapshotType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<VmVolumeSnapshotType>();
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
    public List<VmVolumeSnapshotType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<VmVolumeSnapshotType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmVolumeSnapshotWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput typeIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput typeNot(VmVolumeSnapshotType typeNot) {

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
    public VmVolumeSnapshotType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(VmVolumeSnapshotType typeNot) {
        this.typeNot = typeNot;
    }

    public VmVolumeSnapshotWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput typeNot_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput typeNotIn(List<VmVolumeSnapshotType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addTypeNotInItem(VmVolumeSnapshotType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<VmVolumeSnapshotType>();
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
    public List<VmVolumeSnapshotType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<VmVolumeSnapshotType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmVolumeSnapshotWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput uniqueSize(Double uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Double uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public VmVolumeSnapshotWhereInput uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public void setUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        }
    }

    public boolean getUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeGt(Double uniqueSizeGt) {

        this.uniqueSizeGt = uniqueSizeGt;
        return this;
    }

    /**
     * Get uniqueSizeGt
     *
     * @return uniqueSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSizeGt() {
        return uniqueSizeGt;
    }

    public void setUniqueSizeGt(Double uniqueSizeGt) {
        this.uniqueSizeGt = uniqueSizeGt;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public void setUniqueSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        }
    }

    public boolean getUniqueSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_GT);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeGte(Double uniqueSizeGte) {

        this.uniqueSizeGte = uniqueSizeGte;
        return this;
    }

    /**
     * Get uniqueSizeGte
     *
     * @return uniqueSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSizeGte() {
        return uniqueSizeGte;
    }

    public void setUniqueSizeGte(Double uniqueSizeGte) {
        this.uniqueSizeGte = uniqueSizeGte;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public void setUniqueSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        }
    }

    public boolean getUniqueSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeIn(List<Double> uniqueSizeIn) {

        this.uniqueSizeIn = uniqueSizeIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addUniqueSizeInItem(Double uniqueSizeInItem) {
        if (this.uniqueSizeIn == null) {
            this.uniqueSizeIn = new ArrayList<Double>();
        }
        this.uniqueSizeIn.add(uniqueSizeInItem);
        return this;
    }

    /**
     * Get uniqueSizeIn
     *
     * @return uniqueSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUniqueSizeIn() {
        return uniqueSizeIn;
    }

    public void setUniqueSizeIn(List<Double> uniqueSizeIn) {
        this.uniqueSizeIn = uniqueSizeIn;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public void setUniqueSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        }
    }

    public boolean getUniqueSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_IN);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeLt(Double uniqueSizeLt) {

        this.uniqueSizeLt = uniqueSizeLt;
        return this;
    }

    /**
     * Get uniqueSizeLt
     *
     * @return uniqueSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSizeLt() {
        return uniqueSizeLt;
    }

    public void setUniqueSizeLt(Double uniqueSizeLt) {
        this.uniqueSizeLt = uniqueSizeLt;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public void setUniqueSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        }
    }

    public boolean getUniqueSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_LT);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeLte(Double uniqueSizeLte) {

        this.uniqueSizeLte = uniqueSizeLte;
        return this;
    }

    /**
     * Get uniqueSizeLte
     *
     * @return uniqueSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSizeLte() {
        return uniqueSizeLte;
    }

    public void setUniqueSizeLte(Double uniqueSizeLte) {
        this.uniqueSizeLte = uniqueSizeLte;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public void setUniqueSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        }
    }

    public boolean getUniqueSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeNot(Double uniqueSizeNot) {

        this.uniqueSizeNot = uniqueSizeNot;
        return this;
    }

    /**
     * Get uniqueSizeNot
     *
     * @return uniqueSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueSizeNot() {
        return uniqueSizeNot;
    }

    public void setUniqueSizeNot(Double uniqueSizeNot) {
        this.uniqueSizeNot = uniqueSizeNot;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public void setUniqueSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        }
    }

    public boolean getUniqueSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
    }

    public VmVolumeSnapshotWhereInput uniqueSizeNotIn(List<Double> uniqueSizeNotIn) {

        this.uniqueSizeNotIn = uniqueSizeNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addUniqueSizeNotInItem(Double uniqueSizeNotInItem) {
        if (this.uniqueSizeNotIn == null) {
            this.uniqueSizeNotIn = new ArrayList<Double>();
        }
        this.uniqueSizeNotIn.add(uniqueSizeNotInItem);
        return this;
    }

    /**
     * Get uniqueSizeNotIn
     *
     * @return uniqueSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUniqueSizeNotIn() {
        return uniqueSizeNotIn;
    }

    public void setUniqueSizeNotIn(List<Double> uniqueSizeNotIn) {
        this.uniqueSizeNotIn = uniqueSizeNotIn;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput uniqueSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public void setUniqueSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        }
    }

    public boolean getUniqueSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
    }

    public VmVolumeSnapshotWhereInput vmVolume(VmVolumeWhereInput vmVolume) {

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

    public VmVolumeSnapshotWhereInput vmVolume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public VmVolumeSnapshotWhereInput vmVolume_ExplictlyNonNull() {
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

    public VmVolumeSnapshotWhereInput volumeSharing(Boolean volumeSharing) {

        this.volumeSharing = volumeSharing;
        return this;
    }

    /**
     * Get volumeSharing
     *
     * @return volumeSharing
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVolumeSharing() {
        return volumeSharing;
    }

    public void setVolumeSharing(Boolean volumeSharing) {
        this.volumeSharing = volumeSharing;
    }

    public VmVolumeSnapshotWhereInput volumeSharing_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SHARING);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSharing_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SHARING);
        return this;
    }

    public void setVolumeSharing_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SHARING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SHARING);
        }
    }

    public boolean getVolumeSharing_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SHARING);
    }

    public VmVolumeSnapshotWhereInput volumeSharingNot(Boolean volumeSharingNot) {

        this.volumeSharingNot = volumeSharingNot;
        return this;
    }

    /**
     * Get volumeSharingNot
     *
     * @return volumeSharingNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVolumeSharingNot() {
        return volumeSharingNot;
    }

    public void setVolumeSharingNot(Boolean volumeSharingNot) {
        this.volumeSharingNot = volumeSharingNot;
    }

    public VmVolumeSnapshotWhereInput volumeSharingNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SHARING_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSharingNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SHARING_NOT);
        return this;
    }

    public void setVolumeSharingNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SHARING_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SHARING_NOT);
        }
    }

    public boolean getVolumeSharingNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SHARING_NOT);
    }

    public VmVolumeSnapshotWhereInput volumeSize(Double volumeSize) {

        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * Get volumeSize
     *
     * @return volumeSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Double volumeSize) {
        this.volumeSize = volumeSize;
    }

    public VmVolumeSnapshotWhereInput volumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public void setVolumeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE);
        }
    }

    public boolean getVolumeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE);
    }

    public VmVolumeSnapshotWhereInput volumeSizeGt(Double volumeSizeGt) {

        this.volumeSizeGt = volumeSizeGt;
        return this;
    }

    /**
     * Get volumeSizeGt
     *
     * @return volumeSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSizeGt() {
        return volumeSizeGt;
    }

    public void setVolumeSizeGt(Double volumeSizeGt) {
        this.volumeSizeGt = volumeSizeGt;
    }

    public VmVolumeSnapshotWhereInput volumeSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_GT);
        return this;
    }

    public void setVolumeSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_GT);
        }
    }

    public boolean getVolumeSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_GT);
    }

    public VmVolumeSnapshotWhereInput volumeSizeGte(Double volumeSizeGte) {

        this.volumeSizeGte = volumeSizeGte;
        return this;
    }

    /**
     * Get volumeSizeGte
     *
     * @return volumeSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSizeGte() {
        return volumeSizeGte;
    }

    public void setVolumeSizeGte(Double volumeSizeGte) {
        this.volumeSizeGte = volumeSizeGte;
    }

    public VmVolumeSnapshotWhereInput volumeSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_GTE);
        return this;
    }

    public void setVolumeSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_GTE);
        }
    }

    public boolean getVolumeSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_GTE);
    }

    public VmVolumeSnapshotWhereInput volumeSizeIn(List<Double> volumeSizeIn) {

        this.volumeSizeIn = volumeSizeIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addVolumeSizeInItem(Double volumeSizeInItem) {
        if (this.volumeSizeIn == null) {
            this.volumeSizeIn = new ArrayList<Double>();
        }
        this.volumeSizeIn.add(volumeSizeInItem);
        return this;
    }

    /**
     * Get volumeSizeIn
     *
     * @return volumeSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getVolumeSizeIn() {
        return volumeSizeIn;
    }

    public void setVolumeSizeIn(List<Double> volumeSizeIn) {
        this.volumeSizeIn = volumeSizeIn;
    }

    public VmVolumeSnapshotWhereInput volumeSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_IN);
        return this;
    }

    public void setVolumeSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_IN);
        }
    }

    public boolean getVolumeSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_IN);
    }

    public VmVolumeSnapshotWhereInput volumeSizeLt(Double volumeSizeLt) {

        this.volumeSizeLt = volumeSizeLt;
        return this;
    }

    /**
     * Get volumeSizeLt
     *
     * @return volumeSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSizeLt() {
        return volumeSizeLt;
    }

    public void setVolumeSizeLt(Double volumeSizeLt) {
        this.volumeSizeLt = volumeSizeLt;
    }

    public VmVolumeSnapshotWhereInput volumeSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_LT);
        return this;
    }

    public void setVolumeSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_LT);
        }
    }

    public boolean getVolumeSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_LT);
    }

    public VmVolumeSnapshotWhereInput volumeSizeLte(Double volumeSizeLte) {

        this.volumeSizeLte = volumeSizeLte;
        return this;
    }

    /**
     * Get volumeSizeLte
     *
     * @return volumeSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSizeLte() {
        return volumeSizeLte;
    }

    public void setVolumeSizeLte(Double volumeSizeLte) {
        this.volumeSizeLte = volumeSizeLte;
    }

    public VmVolumeSnapshotWhereInput volumeSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_LTE);
        return this;
    }

    public void setVolumeSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_LTE);
        }
    }

    public boolean getVolumeSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_LTE);
    }

    public VmVolumeSnapshotWhereInput volumeSizeNot(Double volumeSizeNot) {

        this.volumeSizeNot = volumeSizeNot;
        return this;
    }

    /**
     * Get volumeSizeNot
     *
     * @return volumeSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVolumeSizeNot() {
        return volumeSizeNot;
    }

    public void setVolumeSizeNot(Double volumeSizeNot) {
        this.volumeSizeNot = volumeSizeNot;
    }

    public VmVolumeSnapshotWhereInput volumeSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_NOT);
        return this;
    }

    public void setVolumeSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_NOT);
        }
    }

    public boolean getVolumeSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_NOT);
    }

    public VmVolumeSnapshotWhereInput volumeSizeNotIn(List<Double> volumeSizeNotIn) {

        this.volumeSizeNotIn = volumeSizeNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addVolumeSizeNotInItem(Double volumeSizeNotInItem) {
        if (this.volumeSizeNotIn == null) {
            this.volumeSizeNotIn = new ArrayList<Double>();
        }
        this.volumeSizeNotIn.add(volumeSizeNotInItem);
        return this;
    }

    /**
     * Get volumeSizeNotIn
     *
     * @return volumeSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getVolumeSizeNotIn() {
        return volumeSizeNotIn;
    }

    public void setVolumeSizeNotIn(List<Double> volumeSizeNotIn) {
        this.volumeSizeNotIn = volumeSizeNotIn;
    }

    public VmVolumeSnapshotWhereInput volumeSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput volumeSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN);
        return this;
    }

    public void setVolumeSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN);
        }
    }

    public boolean getVolumeSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuid(String zbsSnapshotUuid) {

        this.zbsSnapshotUuid = zbsSnapshotUuid;
        return this;
    }

    /**
     * Get zbsSnapshotUuid
     *
     * @return zbsSnapshotUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuid() {
        return zbsSnapshotUuid;
    }

    public void setZbsSnapshotUuid(String zbsSnapshotUuid) {
        this.zbsSnapshotUuid = zbsSnapshotUuid;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        return this;
    }

    public void setZbsSnapshotUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
        }
    }

    public boolean getZbsSnapshotUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidContains(String zbsSnapshotUuidContains) {

        this.zbsSnapshotUuidContains = zbsSnapshotUuidContains;
        return this;
    }

    /**
     * Get zbsSnapshotUuidContains
     *
     * @return zbsSnapshotUuidContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidContains() {
        return zbsSnapshotUuidContains;
    }

    public void setZbsSnapshotUuidContains(String zbsSnapshotUuidContains) {
        this.zbsSnapshotUuidContains = zbsSnapshotUuidContains;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS);
        return this;
    }

    public void setZbsSnapshotUuidContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS);
        }
    }

    public boolean getZbsSnapshotUuidContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_CONTAINS);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidEndsWith(String zbsSnapshotUuidEndsWith) {

        this.zbsSnapshotUuidEndsWith = zbsSnapshotUuidEndsWith;
        return this;
    }

    /**
     * Get zbsSnapshotUuidEndsWith
     *
     * @return zbsSnapshotUuidEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidEndsWith() {
        return zbsSnapshotUuidEndsWith;
    }

    public void setZbsSnapshotUuidEndsWith(String zbsSnapshotUuidEndsWith) {
        this.zbsSnapshotUuidEndsWith = zbsSnapshotUuidEndsWith;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH);
        return this;
    }

    public void setZbsSnapshotUuidEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH);
        }
    }

    public boolean getZbsSnapshotUuidEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_ENDS_WITH);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidGt(String zbsSnapshotUuidGt) {

        this.zbsSnapshotUuidGt = zbsSnapshotUuidGt;
        return this;
    }

    /**
     * Get zbsSnapshotUuidGt
     *
     * @return zbsSnapshotUuidGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidGt() {
        return zbsSnapshotUuidGt;
    }

    public void setZbsSnapshotUuidGt(String zbsSnapshotUuidGt) {
        this.zbsSnapshotUuidGt = zbsSnapshotUuidGt;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT);
        return this;
    }

    public void setZbsSnapshotUuidGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT);
        }
    }

    public boolean getZbsSnapshotUuidGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GT);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidGte(String zbsSnapshotUuidGte) {

        this.zbsSnapshotUuidGte = zbsSnapshotUuidGte;
        return this;
    }

    /**
     * Get zbsSnapshotUuidGte
     *
     * @return zbsSnapshotUuidGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidGte() {
        return zbsSnapshotUuidGte;
    }

    public void setZbsSnapshotUuidGte(String zbsSnapshotUuidGte) {
        this.zbsSnapshotUuidGte = zbsSnapshotUuidGte;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE);
        return this;
    }

    public void setZbsSnapshotUuidGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE);
        }
    }

    public boolean getZbsSnapshotUuidGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_GTE);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidIn(List<String> zbsSnapshotUuidIn) {

        this.zbsSnapshotUuidIn = zbsSnapshotUuidIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addZbsSnapshotUuidInItem(String zbsSnapshotUuidInItem) {
        if (this.zbsSnapshotUuidIn == null) {
            this.zbsSnapshotUuidIn = new ArrayList<String>();
        }
        this.zbsSnapshotUuidIn.add(zbsSnapshotUuidInItem);
        return this;
    }

    /**
     * Get zbsSnapshotUuidIn
     *
     * @return zbsSnapshotUuidIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getZbsSnapshotUuidIn() {
        return zbsSnapshotUuidIn;
    }

    public void setZbsSnapshotUuidIn(List<String> zbsSnapshotUuidIn) {
        this.zbsSnapshotUuidIn = zbsSnapshotUuidIn;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN);
        return this;
    }

    public void setZbsSnapshotUuidIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN);
        }
    }

    public boolean getZbsSnapshotUuidIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_IN);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidLt(String zbsSnapshotUuidLt) {

        this.zbsSnapshotUuidLt = zbsSnapshotUuidLt;
        return this;
    }

    /**
     * Get zbsSnapshotUuidLt
     *
     * @return zbsSnapshotUuidLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidLt() {
        return zbsSnapshotUuidLt;
    }

    public void setZbsSnapshotUuidLt(String zbsSnapshotUuidLt) {
        this.zbsSnapshotUuidLt = zbsSnapshotUuidLt;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT);
        return this;
    }

    public void setZbsSnapshotUuidLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT);
        }
    }

    public boolean getZbsSnapshotUuidLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LT);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidLte(String zbsSnapshotUuidLte) {

        this.zbsSnapshotUuidLte = zbsSnapshotUuidLte;
        return this;
    }

    /**
     * Get zbsSnapshotUuidLte
     *
     * @return zbsSnapshotUuidLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidLte() {
        return zbsSnapshotUuidLte;
    }

    public void setZbsSnapshotUuidLte(String zbsSnapshotUuidLte) {
        this.zbsSnapshotUuidLte = zbsSnapshotUuidLte;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE);
        return this;
    }

    public void setZbsSnapshotUuidLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE);
        }
    }

    public boolean getZbsSnapshotUuidLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_LTE);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNot(String zbsSnapshotUuidNot) {

        this.zbsSnapshotUuidNot = zbsSnapshotUuidNot;
        return this;
    }

    /**
     * Get zbsSnapshotUuidNot
     *
     * @return zbsSnapshotUuidNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidNot() {
        return zbsSnapshotUuidNot;
    }

    public void setZbsSnapshotUuidNot(String zbsSnapshotUuidNot) {
        this.zbsSnapshotUuidNot = zbsSnapshotUuidNot;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT);
        return this;
    }

    public void setZbsSnapshotUuidNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT);
        }
    }

    public boolean getZbsSnapshotUuidNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotContains(
            String zbsSnapshotUuidNotContains) {

        this.zbsSnapshotUuidNotContains = zbsSnapshotUuidNotContains;
        return this;
    }

    /**
     * Get zbsSnapshotUuidNotContains
     *
     * @return zbsSnapshotUuidNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidNotContains() {
        return zbsSnapshotUuidNotContains;
    }

    public void setZbsSnapshotUuidNotContains(String zbsSnapshotUuidNotContains) {
        this.zbsSnapshotUuidNotContains = zbsSnapshotUuidNotContains;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS);
        return this;
    }

    public void setZbsSnapshotUuidNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS);
        }
    }

    public boolean getZbsSnapshotUuidNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_CONTAINS);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotEndsWith(
            String zbsSnapshotUuidNotEndsWith) {

        this.zbsSnapshotUuidNotEndsWith = zbsSnapshotUuidNotEndsWith;
        return this;
    }

    /**
     * Get zbsSnapshotUuidNotEndsWith
     *
     * @return zbsSnapshotUuidNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidNotEndsWith() {
        return zbsSnapshotUuidNotEndsWith;
    }

    public void setZbsSnapshotUuidNotEndsWith(String zbsSnapshotUuidNotEndsWith) {
        this.zbsSnapshotUuidNotEndsWith = zbsSnapshotUuidNotEndsWith;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH);
        return this;
    }

    public void setZbsSnapshotUuidNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH);
        }
    }

    public boolean getZbsSnapshotUuidNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_ENDS_WITH);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotIn(List<String> zbsSnapshotUuidNotIn) {

        this.zbsSnapshotUuidNotIn = zbsSnapshotUuidNotIn;
        return this;
    }

    public VmVolumeSnapshotWhereInput addZbsSnapshotUuidNotInItem(String zbsSnapshotUuidNotInItem) {
        if (this.zbsSnapshotUuidNotIn == null) {
            this.zbsSnapshotUuidNotIn = new ArrayList<String>();
        }
        this.zbsSnapshotUuidNotIn.add(zbsSnapshotUuidNotInItem);
        return this;
    }

    /**
     * Get zbsSnapshotUuidNotIn
     *
     * @return zbsSnapshotUuidNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getZbsSnapshotUuidNotIn() {
        return zbsSnapshotUuidNotIn;
    }

    public void setZbsSnapshotUuidNotIn(List<String> zbsSnapshotUuidNotIn) {
        this.zbsSnapshotUuidNotIn = zbsSnapshotUuidNotIn;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN);
        return this;
    }

    public void setZbsSnapshotUuidNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN);
        }
    }

    public boolean getZbsSnapshotUuidNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_IN);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotStartsWith(
            String zbsSnapshotUuidNotStartsWith) {

        this.zbsSnapshotUuidNotStartsWith = zbsSnapshotUuidNotStartsWith;
        return this;
    }

    /**
     * Get zbsSnapshotUuidNotStartsWith
     *
     * @return zbsSnapshotUuidNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidNotStartsWith() {
        return zbsSnapshotUuidNotStartsWith;
    }

    public void setZbsSnapshotUuidNotStartsWith(String zbsSnapshotUuidNotStartsWith) {
        this.zbsSnapshotUuidNotStartsWith = zbsSnapshotUuidNotStartsWith;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH);
        return this;
    }

    public void setZbsSnapshotUuidNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH);
        }
    }

    public boolean getZbsSnapshotUuidNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_NOT_STARTS_WITH);
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidStartsWith(String zbsSnapshotUuidStartsWith) {

        this.zbsSnapshotUuidStartsWith = zbsSnapshotUuidStartsWith;
        return this;
    }

    /**
     * Get zbsSnapshotUuidStartsWith
     *
     * @return zbsSnapshotUuidStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsSnapshotUuidStartsWith() {
        return zbsSnapshotUuidStartsWith;
    }

    public void setZbsSnapshotUuidStartsWith(String zbsSnapshotUuidStartsWith) {
        this.zbsSnapshotUuidStartsWith = zbsSnapshotUuidStartsWith;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH);
        return this;
    }

    public VmVolumeSnapshotWhereInput zbsSnapshotUuidStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH);
        return this;
    }

    public void setZbsSnapshotUuidStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH);
        }
    }

    public boolean getZbsSnapshotUuidStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmVolumeSnapshotWhereInput vmVolumeSnapshotWhereInput = (VmVolumeSnapshotWhereInput) o;
        return Objects.equals(this.AND, vmVolumeSnapshotWhereInput.AND)
                && Objects.equals(this.NOT, vmVolumeSnapshotWhereInput.NOT)
                && Objects.equals(this.OR, vmVolumeSnapshotWhereInput.OR)
                && Objects.equals(this.cluster, vmVolumeSnapshotWhereInput.cluster)
                && Objects.equals(this.createAt, vmVolumeSnapshotWhereInput.createAt)
                && Objects.equals(this.createAtGt, vmVolumeSnapshotWhereInput.createAtGt)
                && Objects.equals(this.createAtGte, vmVolumeSnapshotWhereInput.createAtGte)
                && Objects.equals(this.createAtIn, vmVolumeSnapshotWhereInput.createAtIn)
                && Objects.equals(this.createAtLt, vmVolumeSnapshotWhereInput.createAtLt)
                && Objects.equals(this.createAtLte, vmVolumeSnapshotWhereInput.createAtLte)
                && Objects.equals(this.createAtNot, vmVolumeSnapshotWhereInput.createAtNot)
                && Objects.equals(this.createAtNotIn, vmVolumeSnapshotWhereInput.createAtNotIn)
                && Objects.equals(this.description, vmVolumeSnapshotWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, vmVolumeSnapshotWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, vmVolumeSnapshotWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, vmVolumeSnapshotWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, vmVolumeSnapshotWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, vmVolumeSnapshotWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, vmVolumeSnapshotWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, vmVolumeSnapshotWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, vmVolumeSnapshotWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        vmVolumeSnapshotWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        vmVolumeSnapshotWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, vmVolumeSnapshotWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        vmVolumeSnapshotWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        vmVolumeSnapshotWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.elfStoragePolicy, vmVolumeSnapshotWhereInput.elfStoragePolicy)
                && Objects.equals(
                        this.elfStoragePolicyEcK, vmVolumeSnapshotWhereInput.elfStoragePolicyEcK)
                && Objects.equals(
                        this.elfStoragePolicyEcKGt,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKGt)
                && Objects.equals(
                        this.elfStoragePolicyEcKGte,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKGte)
                && Objects.equals(
                        this.elfStoragePolicyEcKIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKIn)
                && Objects.equals(
                        this.elfStoragePolicyEcKLt,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKLt)
                && Objects.equals(
                        this.elfStoragePolicyEcKLte,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKLte)
                && Objects.equals(
                        this.elfStoragePolicyEcKNot,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKNot)
                && Objects.equals(
                        this.elfStoragePolicyEcKNotIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcKNotIn)
                && Objects.equals(
                        this.elfStoragePolicyEcM, vmVolumeSnapshotWhereInput.elfStoragePolicyEcM)
                && Objects.equals(
                        this.elfStoragePolicyEcMGt,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMGt)
                && Objects.equals(
                        this.elfStoragePolicyEcMGte,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMGte)
                && Objects.equals(
                        this.elfStoragePolicyEcMIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMIn)
                && Objects.equals(
                        this.elfStoragePolicyEcMLt,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMLt)
                && Objects.equals(
                        this.elfStoragePolicyEcMLte,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMLte)
                && Objects.equals(
                        this.elfStoragePolicyEcMNot,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMNot)
                && Objects.equals(
                        this.elfStoragePolicyEcMNotIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyEcMNotIn)
                && Objects.equals(
                        this.elfStoragePolicyIn, vmVolumeSnapshotWhereInput.elfStoragePolicyIn)
                && Objects.equals(
                        this.elfStoragePolicyNot, vmVolumeSnapshotWhereInput.elfStoragePolicyNot)
                && Objects.equals(
                        this.elfStoragePolicyNotIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyNotIn)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNum,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNum)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumGt,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumGt)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumGte,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumGte)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumIn)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumLt,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumLt)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumLte,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumLte)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumNot,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumNot)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNumNotIn,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyReplicaNumNotIn)
                && Objects.equals(
                        this.elfStoragePolicyThinProvision,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyThinProvision)
                && Objects.equals(
                        this.elfStoragePolicyThinProvisionNot,
                        vmVolumeSnapshotWhereInput.elfStoragePolicyThinProvisionNot)
                && Objects.equals(
                        this.entityAsyncStatus, vmVolumeSnapshotWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, vmVolumeSnapshotWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vmVolumeSnapshotWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        vmVolumeSnapshotWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, vmVolumeSnapshotWhereInput.id)
                && Objects.equals(this.idContains, vmVolumeSnapshotWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmVolumeSnapshotWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmVolumeSnapshotWhereInput.idGt)
                && Objects.equals(this.idGte, vmVolumeSnapshotWhereInput.idGte)
                && Objects.equals(this.idIn, vmVolumeSnapshotWhereInput.idIn)
                && Objects.equals(this.idLt, vmVolumeSnapshotWhereInput.idLt)
                && Objects.equals(this.idLte, vmVolumeSnapshotWhereInput.idLte)
                && Objects.equals(this.idNot, vmVolumeSnapshotWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmVolumeSnapshotWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmVolumeSnapshotWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmVolumeSnapshotWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmVolumeSnapshotWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmVolumeSnapshotWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, vmVolumeSnapshotWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, vmVolumeSnapshotWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, vmVolumeSnapshotWhereInput.labelsSome)
                && Objects.equals(this.localCreatedAt, vmVolumeSnapshotWhereInput.localCreatedAt)
                && Objects.equals(
                        this.localCreatedAtGt, vmVolumeSnapshotWhereInput.localCreatedAtGt)
                && Objects.equals(
                        this.localCreatedAtGte, vmVolumeSnapshotWhereInput.localCreatedAtGte)
                && Objects.equals(
                        this.localCreatedAtIn, vmVolumeSnapshotWhereInput.localCreatedAtIn)
                && Objects.equals(
                        this.localCreatedAtLt, vmVolumeSnapshotWhereInput.localCreatedAtLt)
                && Objects.equals(
                        this.localCreatedAtLte, vmVolumeSnapshotWhereInput.localCreatedAtLte)
                && Objects.equals(
                        this.localCreatedAtNot, vmVolumeSnapshotWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn, vmVolumeSnapshotWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, vmVolumeSnapshotWhereInput.localId)
                && Objects.equals(this.localIdContains, vmVolumeSnapshotWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vmVolumeSnapshotWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vmVolumeSnapshotWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vmVolumeSnapshotWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vmVolumeSnapshotWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vmVolumeSnapshotWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vmVolumeSnapshotWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vmVolumeSnapshotWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, vmVolumeSnapshotWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, vmVolumeSnapshotWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vmVolumeSnapshotWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, vmVolumeSnapshotWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, vmVolumeSnapshotWhereInput.localIdStartsWith)
                && Objects.equals(this.name, vmVolumeSnapshotWhereInput.name)
                && Objects.equals(this.nameContains, vmVolumeSnapshotWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vmVolumeSnapshotWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vmVolumeSnapshotWhereInput.nameGt)
                && Objects.equals(this.nameGte, vmVolumeSnapshotWhereInput.nameGte)
                && Objects.equals(this.nameIn, vmVolumeSnapshotWhereInput.nameIn)
                && Objects.equals(this.nameLt, vmVolumeSnapshotWhereInput.nameLt)
                && Objects.equals(this.nameLte, vmVolumeSnapshotWhereInput.nameLte)
                && Objects.equals(this.nameNot, vmVolumeSnapshotWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vmVolumeSnapshotWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vmVolumeSnapshotWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vmVolumeSnapshotWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, vmVolumeSnapshotWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vmVolumeSnapshotWhereInput.nameStartsWith)
                && Objects.equals(this.residentInCache, vmVolumeSnapshotWhereInput.residentInCache)
                && Objects.equals(
                        this.residentInCacheNot, vmVolumeSnapshotWhereInput.residentInCacheNot)
                && Objects.equals(this.sharedSize, vmVolumeSnapshotWhereInput.sharedSize)
                && Objects.equals(this.sharedSizeGt, vmVolumeSnapshotWhereInput.sharedSizeGt)
                && Objects.equals(this.sharedSizeGte, vmVolumeSnapshotWhereInput.sharedSizeGte)
                && Objects.equals(this.sharedSizeIn, vmVolumeSnapshotWhereInput.sharedSizeIn)
                && Objects.equals(this.sharedSizeLt, vmVolumeSnapshotWhereInput.sharedSizeLt)
                && Objects.equals(this.sharedSizeLte, vmVolumeSnapshotWhereInput.sharedSizeLte)
                && Objects.equals(this.sharedSizeNot, vmVolumeSnapshotWhereInput.sharedSizeNot)
                && Objects.equals(this.sharedSizeNotIn, vmVolumeSnapshotWhereInput.sharedSizeNotIn)
                && Objects.equals(this.size, vmVolumeSnapshotWhereInput.size)
                && Objects.equals(this.sizeGt, vmVolumeSnapshotWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, vmVolumeSnapshotWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, vmVolumeSnapshotWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, vmVolumeSnapshotWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, vmVolumeSnapshotWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, vmVolumeSnapshotWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, vmVolumeSnapshotWhereInput.sizeNotIn)
                && Objects.equals(this.type, vmVolumeSnapshotWhereInput.type)
                && Objects.equals(this.typeIn, vmVolumeSnapshotWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmVolumeSnapshotWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmVolumeSnapshotWhereInput.typeNotIn)
                && Objects.equals(this.uniqueSize, vmVolumeSnapshotWhereInput.uniqueSize)
                && Objects.equals(this.uniqueSizeGt, vmVolumeSnapshotWhereInput.uniqueSizeGt)
                && Objects.equals(this.uniqueSizeGte, vmVolumeSnapshotWhereInput.uniqueSizeGte)
                && Objects.equals(this.uniqueSizeIn, vmVolumeSnapshotWhereInput.uniqueSizeIn)
                && Objects.equals(this.uniqueSizeLt, vmVolumeSnapshotWhereInput.uniqueSizeLt)
                && Objects.equals(this.uniqueSizeLte, vmVolumeSnapshotWhereInput.uniqueSizeLte)
                && Objects.equals(this.uniqueSizeNot, vmVolumeSnapshotWhereInput.uniqueSizeNot)
                && Objects.equals(this.uniqueSizeNotIn, vmVolumeSnapshotWhereInput.uniqueSizeNotIn)
                && Objects.equals(this.vmVolume, vmVolumeSnapshotWhereInput.vmVolume)
                && Objects.equals(this.volumeSharing, vmVolumeSnapshotWhereInput.volumeSharing)
                && Objects.equals(
                        this.volumeSharingNot, vmVolumeSnapshotWhereInput.volumeSharingNot)
                && Objects.equals(this.volumeSize, vmVolumeSnapshotWhereInput.volumeSize)
                && Objects.equals(this.volumeSizeGt, vmVolumeSnapshotWhereInput.volumeSizeGt)
                && Objects.equals(this.volumeSizeGte, vmVolumeSnapshotWhereInput.volumeSizeGte)
                && Objects.equals(this.volumeSizeIn, vmVolumeSnapshotWhereInput.volumeSizeIn)
                && Objects.equals(this.volumeSizeLt, vmVolumeSnapshotWhereInput.volumeSizeLt)
                && Objects.equals(this.volumeSizeLte, vmVolumeSnapshotWhereInput.volumeSizeLte)
                && Objects.equals(this.volumeSizeNot, vmVolumeSnapshotWhereInput.volumeSizeNot)
                && Objects.equals(this.volumeSizeNotIn, vmVolumeSnapshotWhereInput.volumeSizeNotIn)
                && Objects.equals(this.zbsSnapshotUuid, vmVolumeSnapshotWhereInput.zbsSnapshotUuid)
                && Objects.equals(
                        this.zbsSnapshotUuidContains,
                        vmVolumeSnapshotWhereInput.zbsSnapshotUuidContains)
                && Objects.equals(
                        this.zbsSnapshotUuidEndsWith,
                        vmVolumeSnapshotWhereInput.zbsSnapshotUuidEndsWith)
                && Objects.equals(
                        this.zbsSnapshotUuidGt, vmVolumeSnapshotWhereInput.zbsSnapshotUuidGt)
                && Objects.equals(
                        this.zbsSnapshotUuidGte, vmVolumeSnapshotWhereInput.zbsSnapshotUuidGte)
                && Objects.equals(
                        this.zbsSnapshotUuidIn, vmVolumeSnapshotWhereInput.zbsSnapshotUuidIn)
                && Objects.equals(
                        this.zbsSnapshotUuidLt, vmVolumeSnapshotWhereInput.zbsSnapshotUuidLt)
                && Objects.equals(
                        this.zbsSnapshotUuidLte, vmVolumeSnapshotWhereInput.zbsSnapshotUuidLte)
                && Objects.equals(
                        this.zbsSnapshotUuidNot, vmVolumeSnapshotWhereInput.zbsSnapshotUuidNot)
                && Objects.equals(
                        this.zbsSnapshotUuidNotContains,
                        vmVolumeSnapshotWhereInput.zbsSnapshotUuidNotContains)
                && Objects.equals(
                        this.zbsSnapshotUuidNotEndsWith,
                        vmVolumeSnapshotWhereInput.zbsSnapshotUuidNotEndsWith)
                && Objects.equals(
                        this.zbsSnapshotUuidNotIn, vmVolumeSnapshotWhereInput.zbsSnapshotUuidNotIn)
                && Objects.equals(
                        this.zbsSnapshotUuidNotStartsWith,
                        vmVolumeSnapshotWhereInput.zbsSnapshotUuidNotStartsWith)
                && Objects.equals(
                        this.zbsSnapshotUuidStartsWith,
                        vmVolumeSnapshotWhereInput.zbsSnapshotUuidStartsWith);
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
                cluster,
                createAt,
                createAtGt,
                createAtGte,
                createAtIn,
                createAtLt,
                createAtLte,
                createAtNot,
                createAtNotIn,
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
                elfStoragePolicy,
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
                elfStoragePolicyIn,
                elfStoragePolicyNot,
                elfStoragePolicyNotIn,
                elfStoragePolicyReplicaNum,
                elfStoragePolicyReplicaNumGt,
                elfStoragePolicyReplicaNumGte,
                elfStoragePolicyReplicaNumIn,
                elfStoragePolicyReplicaNumLt,
                elfStoragePolicyReplicaNumLte,
                elfStoragePolicyReplicaNumNot,
                elfStoragePolicyReplicaNumNotIn,
                elfStoragePolicyThinProvision,
                elfStoragePolicyThinProvisionNot,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                residentInCache,
                residentInCacheNot,
                sharedSize,
                sharedSizeGt,
                sharedSizeGte,
                sharedSizeIn,
                sharedSizeLt,
                sharedSizeLte,
                sharedSizeNot,
                sharedSizeNotIn,
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
                uniqueSize,
                uniqueSizeGt,
                uniqueSizeGte,
                uniqueSizeIn,
                uniqueSizeLt,
                uniqueSizeLte,
                uniqueSizeNot,
                uniqueSizeNotIn,
                vmVolume,
                volumeSharing,
                volumeSharingNot,
                volumeSize,
                volumeSizeGt,
                volumeSizeGte,
                volumeSizeIn,
                volumeSizeLt,
                volumeSizeLte,
                volumeSizeNot,
                volumeSizeNotIn,
                zbsSnapshotUuid,
                zbsSnapshotUuidContains,
                zbsSnapshotUuidEndsWith,
                zbsSnapshotUuidGt,
                zbsSnapshotUuidGte,
                zbsSnapshotUuidIn,
                zbsSnapshotUuidLt,
                zbsSnapshotUuidLte,
                zbsSnapshotUuidNot,
                zbsSnapshotUuidNotContains,
                zbsSnapshotUuidNotEndsWith,
                zbsSnapshotUuidNotIn,
                zbsSnapshotUuidNotStartsWith,
                zbsSnapshotUuidStartsWith);
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
        sb.append("class VmVolumeSnapshotWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    createAtGt: ").append(toIndentedString(createAtGt)).append("\n");
        sb.append("    createAtGte: ").append(toIndentedString(createAtGte)).append("\n");
        sb.append("    createAtIn: ").append(toIndentedString(createAtIn)).append("\n");
        sb.append("    createAtLt: ").append(toIndentedString(createAtLt)).append("\n");
        sb.append("    createAtLte: ").append(toIndentedString(createAtLte)).append("\n");
        sb.append("    createAtNot: ").append(toIndentedString(createAtNot)).append("\n");
        sb.append("    createAtNotIn: ").append(toIndentedString(createAtNotIn)).append("\n");
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
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
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
        sb.append("    elfStoragePolicyIn: ")
                .append(toIndentedString(elfStoragePolicyIn))
                .append("\n");
        sb.append("    elfStoragePolicyNot: ")
                .append(toIndentedString(elfStoragePolicyNot))
                .append("\n");
        sb.append("    elfStoragePolicyNotIn: ")
                .append(toIndentedString(elfStoragePolicyNotIn))
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
        sb.append("    elfStoragePolicyThinProvision: ")
                .append(toIndentedString(elfStoragePolicyThinProvision))
                .append("\n");
        sb.append("    elfStoragePolicyThinProvisionNot: ")
                .append(toIndentedString(elfStoragePolicyThinProvisionNot))
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
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    residentInCacheNot: ")
                .append(toIndentedString(residentInCacheNot))
                .append("\n");
        sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
        sb.append("    sharedSizeGt: ").append(toIndentedString(sharedSizeGt)).append("\n");
        sb.append("    sharedSizeGte: ").append(toIndentedString(sharedSizeGte)).append("\n");
        sb.append("    sharedSizeIn: ").append(toIndentedString(sharedSizeIn)).append("\n");
        sb.append("    sharedSizeLt: ").append(toIndentedString(sharedSizeLt)).append("\n");
        sb.append("    sharedSizeLte: ").append(toIndentedString(sharedSizeLte)).append("\n");
        sb.append("    sharedSizeNot: ").append(toIndentedString(sharedSizeNot)).append("\n");
        sb.append("    sharedSizeNotIn: ").append(toIndentedString(sharedSizeNotIn)).append("\n");
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
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    uniqueSizeGt: ").append(toIndentedString(uniqueSizeGt)).append("\n");
        sb.append("    uniqueSizeGte: ").append(toIndentedString(uniqueSizeGte)).append("\n");
        sb.append("    uniqueSizeIn: ").append(toIndentedString(uniqueSizeIn)).append("\n");
        sb.append("    uniqueSizeLt: ").append(toIndentedString(uniqueSizeLt)).append("\n");
        sb.append("    uniqueSizeLte: ").append(toIndentedString(uniqueSizeLte)).append("\n");
        sb.append("    uniqueSizeNot: ").append(toIndentedString(uniqueSizeNot)).append("\n");
        sb.append("    uniqueSizeNotIn: ").append(toIndentedString(uniqueSizeNotIn)).append("\n");
        sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
        sb.append("    volumeSharing: ").append(toIndentedString(volumeSharing)).append("\n");
        sb.append("    volumeSharingNot: ").append(toIndentedString(volumeSharingNot)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    volumeSizeGt: ").append(toIndentedString(volumeSizeGt)).append("\n");
        sb.append("    volumeSizeGte: ").append(toIndentedString(volumeSizeGte)).append("\n");
        sb.append("    volumeSizeIn: ").append(toIndentedString(volumeSizeIn)).append("\n");
        sb.append("    volumeSizeLt: ").append(toIndentedString(volumeSizeLt)).append("\n");
        sb.append("    volumeSizeLte: ").append(toIndentedString(volumeSizeLte)).append("\n");
        sb.append("    volumeSizeNot: ").append(toIndentedString(volumeSizeNot)).append("\n");
        sb.append("    volumeSizeNotIn: ").append(toIndentedString(volumeSizeNotIn)).append("\n");
        sb.append("    zbsSnapshotUuid: ").append(toIndentedString(zbsSnapshotUuid)).append("\n");
        sb.append("    zbsSnapshotUuidContains: ")
                .append(toIndentedString(zbsSnapshotUuidContains))
                .append("\n");
        sb.append("    zbsSnapshotUuidEndsWith: ")
                .append(toIndentedString(zbsSnapshotUuidEndsWith))
                .append("\n");
        sb.append("    zbsSnapshotUuidGt: ")
                .append(toIndentedString(zbsSnapshotUuidGt))
                .append("\n");
        sb.append("    zbsSnapshotUuidGte: ")
                .append(toIndentedString(zbsSnapshotUuidGte))
                .append("\n");
        sb.append("    zbsSnapshotUuidIn: ")
                .append(toIndentedString(zbsSnapshotUuidIn))
                .append("\n");
        sb.append("    zbsSnapshotUuidLt: ")
                .append(toIndentedString(zbsSnapshotUuidLt))
                .append("\n");
        sb.append("    zbsSnapshotUuidLte: ")
                .append(toIndentedString(zbsSnapshotUuidLte))
                .append("\n");
        sb.append("    zbsSnapshotUuidNot: ")
                .append(toIndentedString(zbsSnapshotUuidNot))
                .append("\n");
        sb.append("    zbsSnapshotUuidNotContains: ")
                .append(toIndentedString(zbsSnapshotUuidNotContains))
                .append("\n");
        sb.append("    zbsSnapshotUuidNotEndsWith: ")
                .append(toIndentedString(zbsSnapshotUuidNotEndsWith))
                .append("\n");
        sb.append("    zbsSnapshotUuidNotIn: ")
                .append(toIndentedString(zbsSnapshotUuidNotIn))
                .append("\n");
        sb.append("    zbsSnapshotUuidNotStartsWith: ")
                .append(toIndentedString(zbsSnapshotUuidNotStartsWith))
                .append("\n");
        sb.append("    zbsSnapshotUuidStartsWith: ")
                .append(toIndentedString(zbsSnapshotUuidStartsWith))
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

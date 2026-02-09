package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NfsInodeWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NfsInodeWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<NfsInodeWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<NfsInodeWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<NfsInodeWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
    private Long assignedSize;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_GT = "assigned_size_gt";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_GT)
    private Long assignedSizeGt;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_GTE = "assigned_size_gte";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_GTE)
    private Long assignedSizeGte;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_IN = "assigned_size_in";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_IN)
    private List<Long> assignedSizeIn = null;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_LT = "assigned_size_lt";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_LT)
    private Long assignedSizeLt;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_LTE = "assigned_size_lte";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_LTE)
    private Long assignedSizeLte;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_NOT = "assigned_size_not";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_NOT)
    private Long assignedSizeNot;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN = "assigned_size_not_in";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN)
    private List<Long> assignedSizeNotIn = null;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE =
            "downgraded_prioritized_space";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE)
    private Long downgradedPrioritizedSpace;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT =
            "downgraded_prioritized_space_gt";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT)
    private Long downgradedPrioritizedSpaceGt;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE =
            "downgraded_prioritized_space_gte";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE)
    private Long downgradedPrioritizedSpaceGte;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN =
            "downgraded_prioritized_space_in";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN)
    private List<Long> downgradedPrioritizedSpaceIn = null;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT =
            "downgraded_prioritized_space_lt";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT)
    private Long downgradedPrioritizedSpaceLt;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE =
            "downgraded_prioritized_space_lte";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE)
    private Long downgradedPrioritizedSpaceLte;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT =
            "downgraded_prioritized_space_not";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT)
    private Long downgradedPrioritizedSpaceNot;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN =
            "downgraded_prioritized_space_not_in";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN)
    private List<Long> downgradedPrioritizedSpaceNotIn = null;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_K_GT = "ec_k_gt";

    @SerializedName(SERIALIZED_NAME_EC_K_GT)
    private Integer ecKGt;

    public static final String SERIALIZED_NAME_EC_K_GTE = "ec_k_gte";

    @SerializedName(SERIALIZED_NAME_EC_K_GTE)
    private Integer ecKGte;

    public static final String SERIALIZED_NAME_EC_K_IN = "ec_k_in";

    @SerializedName(SERIALIZED_NAME_EC_K_IN)
    private List<Integer> ecKIn = null;

    public static final String SERIALIZED_NAME_EC_K_LT = "ec_k_lt";

    @SerializedName(SERIALIZED_NAME_EC_K_LT)
    private Integer ecKLt;

    public static final String SERIALIZED_NAME_EC_K_LTE = "ec_k_lte";

    @SerializedName(SERIALIZED_NAME_EC_K_LTE)
    private Integer ecKLte;

    public static final String SERIALIZED_NAME_EC_K_NOT = "ec_k_not";

    @SerializedName(SERIALIZED_NAME_EC_K_NOT)
    private Integer ecKNot;

    public static final String SERIALIZED_NAME_EC_K_NOT_IN = "ec_k_not_in";

    @SerializedName(SERIALIZED_NAME_EC_K_NOT_IN)
    private List<Integer> ecKNotIn = null;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

    public static final String SERIALIZED_NAME_EC_M_GT = "ec_m_gt";

    @SerializedName(SERIALIZED_NAME_EC_M_GT)
    private Integer ecMGt;

    public static final String SERIALIZED_NAME_EC_M_GTE = "ec_m_gte";

    @SerializedName(SERIALIZED_NAME_EC_M_GTE)
    private Integer ecMGte;

    public static final String SERIALIZED_NAME_EC_M_IN = "ec_m_in";

    @SerializedName(SERIALIZED_NAME_EC_M_IN)
    private List<Integer> ecMIn = null;

    public static final String SERIALIZED_NAME_EC_M_LT = "ec_m_lt";

    @SerializedName(SERIALIZED_NAME_EC_M_LT)
    private Integer ecMLt;

    public static final String SERIALIZED_NAME_EC_M_LTE = "ec_m_lte";

    @SerializedName(SERIALIZED_NAME_EC_M_LTE)
    private Integer ecMLte;

    public static final String SERIALIZED_NAME_EC_M_NOT = "ec_m_not";

    @SerializedName(SERIALIZED_NAME_EC_M_NOT)
    private Integer ecMNot;

    public static final String SERIALIZED_NAME_EC_M_NOT_IN = "ec_m_not_in";

    @SerializedName(SERIALIZED_NAME_EC_M_NOT_IN)
    private List<Integer> ecMNotIn = null;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD = "encrypt_method";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD)
    private EncryptMethod encryptMethod;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD_IN = "encrypt_method_in";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD_IN)
    private List<EncryptMethod> encryptMethodIn = null;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD_NOT = "encrypt_method_not";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD_NOT)
    private EncryptMethod encryptMethodNot;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN = "encrypt_method_not_in";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN)
    private List<EncryptMethod> encryptMethodNotIn = null;

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

    public static final String SERIALIZED_NAME_FILE = "file";

    @SerializedName(SERIALIZED_NAME_FILE)
    private Boolean _file;

    public static final String SERIALIZED_NAME_FILE_NOT = "file_not";

    @SerializedName(SERIALIZED_NAME_FILE_NOT)
    private Boolean fileNot;

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

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
    private String localUpdatedAt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_GT = "local_updated_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT)
    private String localUpdatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE = "local_updated_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE)
    private String localUpdatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_IN = "local_updated_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN)
    private List<String> localUpdatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_LT = "local_updated_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT)
    private String localUpdatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE = "local_updated_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE)
    private String localUpdatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT = "local_updated_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT)
    private String localUpdatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN = "local_updated_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN)
    private List<String> localUpdatedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_NFS_EXPORT = "nfs_export";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT)
    private NfsExportWhereInput nfsExport;

    public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";

    @SerializedName(SERIALIZED_NAME_PARENT_ID)
    private String parentId;

    public static final String SERIALIZED_NAME_PARENT_ID_CONTAINS = "parent_id_contains";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_CONTAINS)
    private String parentIdContains;

    public static final String SERIALIZED_NAME_PARENT_ID_ENDS_WITH = "parent_id_ends_with";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_ENDS_WITH)
    private String parentIdEndsWith;

    public static final String SERIALIZED_NAME_PARENT_ID_GT = "parent_id_gt";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_GT)
    private String parentIdGt;

    public static final String SERIALIZED_NAME_PARENT_ID_GTE = "parent_id_gte";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_GTE)
    private String parentIdGte;

    public static final String SERIALIZED_NAME_PARENT_ID_IN = "parent_id_in";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_IN)
    private List<String> parentIdIn = null;

    public static final String SERIALIZED_NAME_PARENT_ID_LT = "parent_id_lt";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_LT)
    private String parentIdLt;

    public static final String SERIALIZED_NAME_PARENT_ID_LTE = "parent_id_lte";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_LTE)
    private String parentIdLte;

    public static final String SERIALIZED_NAME_PARENT_ID_NOT = "parent_id_not";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_NOT)
    private String parentIdNot;

    public static final String SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS = "parent_id_not_contains";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS)
    private String parentIdNotContains;

    public static final String SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH = "parent_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH)
    private String parentIdNotEndsWith;

    public static final String SERIALIZED_NAME_PARENT_ID_NOT_IN = "parent_id_not_in";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_NOT_IN)
    private List<String> parentIdNotIn = null;

    public static final String SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH =
            "parent_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH)
    private String parentIdNotStartsWith;

    public static final String SERIALIZED_NAME_PARENT_ID_STARTS_WITH = "parent_id_starts_with";

    @SerializedName(SERIALIZED_NAME_PARENT_ID_STARTS_WITH)
    private String parentIdStartsWith;

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_PRIORITIZED_NOT = "prioritized_not";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED_NOT)
    private Boolean prioritizedNot;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_IN = "resiliency_type_in";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_IN)
    private List<ResiliencyType> resiliencyTypeIn = null;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_NOT = "resiliency_type_not";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_NOT)
    private ResiliencyType resiliencyTypeNot;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN = "resiliency_type_not_in";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN)
    private List<ResiliencyType> resiliencyTypeNotIn = null;

    public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
    private Long sharedSize;

    public static final String SERIALIZED_NAME_SHARED_SIZE_GT = "shared_size_gt";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_GT)
    private Long sharedSizeGt;

    public static final String SERIALIZED_NAME_SHARED_SIZE_GTE = "shared_size_gte";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_GTE)
    private Long sharedSizeGte;

    public static final String SERIALIZED_NAME_SHARED_SIZE_IN = "shared_size_in";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_IN)
    private List<Long> sharedSizeIn = null;

    public static final String SERIALIZED_NAME_SHARED_SIZE_LT = "shared_size_lt";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_LT)
    private Long sharedSizeLt;

    public static final String SERIALIZED_NAME_SHARED_SIZE_LTE = "shared_size_lte";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_LTE)
    private Long sharedSizeLte;

    public static final String SERIALIZED_NAME_SHARED_SIZE_NOT = "shared_size_not";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_NOT)
    private Long sharedSizeNot;

    public static final String SERIALIZED_NAME_SHARED_SIZE_NOT_IN = "shared_size_not_in";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE_NOT_IN)
    private List<Long> sharedSizeNotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM = "snapshot_num";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM)
    private Integer snapshotNum;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_GT = "snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_GT)
    private Integer snapshotNumGt;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_GTE = "snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_GTE)
    private Integer snapshotNumGte;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_IN = "snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_IN)
    private List<Integer> snapshotNumIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_LT = "snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_LT)
    private Integer snapshotNumLt;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_LTE = "snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_LTE)
    private Integer snapshotNumLte;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_NOT = "snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_NOT)
    private Integer snapshotNumNot;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN = "snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> snapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
    private Double uniqueLogicalSize;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT = "unique_logical_size_gt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT)
    private Double uniqueLogicalSizeGt;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE = "unique_logical_size_gte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE)
    private Double uniqueLogicalSizeGte;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN = "unique_logical_size_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN)
    private List<Double> uniqueLogicalSizeIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT = "unique_logical_size_lt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT)
    private Double uniqueLogicalSizeLt;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE = "unique_logical_size_lte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE)
    private Double uniqueLogicalSizeLte;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT = "unique_logical_size_not";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT)
    private Double uniqueLogicalSizeNot;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN =
            "unique_logical_size_not_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN)
    private List<Double> uniqueLogicalSizeNotIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GT = "unique_size_gt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GT)
    private Long uniqueSizeGt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GTE = "unique_size_gte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GTE)
    private Long uniqueSizeGte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_IN = "unique_size_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_IN)
    private List<Long> uniqueSizeIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LT = "unique_size_lt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LT)
    private Long uniqueSizeLt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LTE = "unique_size_lte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LTE)
    private Long uniqueSizeLte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT = "unique_size_not";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT)
    private Long uniqueSizeNot;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN = "unique_size_not_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN)
    private List<Long> uniqueSizeNotIn = null;

    public NfsInodeWhereInput() {}

    public NfsInodeWhereInput AND(List<NfsInodeWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public NfsInodeWhereInput addANDItem(NfsInodeWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<NfsInodeWhereInput>();
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
    public List<NfsInodeWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<NfsInodeWhereInput> AND) {
        this.AND = AND;
    }

    public NfsInodeWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public NfsInodeWhereInput AND_ExplictlyNonNull() {
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

    public NfsInodeWhereInput NOT(List<NfsInodeWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public NfsInodeWhereInput addNOTItem(NfsInodeWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<NfsInodeWhereInput>();
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
    public List<NfsInodeWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<NfsInodeWhereInput> NOT) {
        this.NOT = NOT;
    }

    public NfsInodeWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public NfsInodeWhereInput NOT_ExplictlyNonNull() {
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

    public NfsInodeWhereInput OR(List<NfsInodeWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public NfsInodeWhereInput addORItem(NfsInodeWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<NfsInodeWhereInput>();
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
    public List<NfsInodeWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<NfsInodeWhereInput> OR) {
        this.OR = OR;
    }

    public NfsInodeWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public NfsInodeWhereInput OR_ExplictlyNonNull() {
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

    public NfsInodeWhereInput assignedSize(Long assignedSize) {

        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * Get assignedSize
     *
     * @return assignedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Long assignedSize) {
        this.assignedSize = assignedSize;
    }

    public NfsInodeWhereInput assignedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public NfsInodeWhereInput assignedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public void setAssignedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        }
    }

    public boolean getAssignedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE);
    }

    public NfsInodeWhereInput assignedSizeGt(Long assignedSizeGt) {

        this.assignedSizeGt = assignedSizeGt;
        return this;
    }

    /**
     * Get assignedSizeGt
     *
     * @return assignedSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSizeGt() {
        return assignedSizeGt;
    }

    public void setAssignedSizeGt(Long assignedSizeGt) {
        this.assignedSizeGt = assignedSizeGt;
    }

    public NfsInodeWhereInput assignedSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_GT);
        return this;
    }

    public NfsInodeWhereInput assignedSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_GT);
        return this;
    }

    public void setAssignedSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_GT);
        }
    }

    public boolean getAssignedSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_GT);
    }

    public NfsInodeWhereInput assignedSizeGte(Long assignedSizeGte) {

        this.assignedSizeGte = assignedSizeGte;
        return this;
    }

    /**
     * Get assignedSizeGte
     *
     * @return assignedSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSizeGte() {
        return assignedSizeGte;
    }

    public void setAssignedSizeGte(Long assignedSizeGte) {
        this.assignedSizeGte = assignedSizeGte;
    }

    public NfsInodeWhereInput assignedSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_GTE);
        return this;
    }

    public NfsInodeWhereInput assignedSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_GTE);
        return this;
    }

    public void setAssignedSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_GTE);
        }
    }

    public boolean getAssignedSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_GTE);
    }

    public NfsInodeWhereInput assignedSizeIn(List<Long> assignedSizeIn) {

        this.assignedSizeIn = assignedSizeIn;
        return this;
    }

    public NfsInodeWhereInput addAssignedSizeInItem(Long assignedSizeInItem) {
        if (this.assignedSizeIn == null) {
            this.assignedSizeIn = new ArrayList<Long>();
        }
        this.assignedSizeIn.add(assignedSizeInItem);
        return this;
    }

    /**
     * Get assignedSizeIn
     *
     * @return assignedSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getAssignedSizeIn() {
        return assignedSizeIn;
    }

    public void setAssignedSizeIn(List<Long> assignedSizeIn) {
        this.assignedSizeIn = assignedSizeIn;
    }

    public NfsInodeWhereInput assignedSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_IN);
        return this;
    }

    public NfsInodeWhereInput assignedSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_IN);
        return this;
    }

    public void setAssignedSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_IN);
        }
    }

    public boolean getAssignedSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_IN);
    }

    public NfsInodeWhereInput assignedSizeLt(Long assignedSizeLt) {

        this.assignedSizeLt = assignedSizeLt;
        return this;
    }

    /**
     * Get assignedSizeLt
     *
     * @return assignedSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSizeLt() {
        return assignedSizeLt;
    }

    public void setAssignedSizeLt(Long assignedSizeLt) {
        this.assignedSizeLt = assignedSizeLt;
    }

    public NfsInodeWhereInput assignedSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_LT);
        return this;
    }

    public NfsInodeWhereInput assignedSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_LT);
        return this;
    }

    public void setAssignedSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_LT);
        }
    }

    public boolean getAssignedSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_LT);
    }

    public NfsInodeWhereInput assignedSizeLte(Long assignedSizeLte) {

        this.assignedSizeLte = assignedSizeLte;
        return this;
    }

    /**
     * Get assignedSizeLte
     *
     * @return assignedSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSizeLte() {
        return assignedSizeLte;
    }

    public void setAssignedSizeLte(Long assignedSizeLte) {
        this.assignedSizeLte = assignedSizeLte;
    }

    public NfsInodeWhereInput assignedSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_LTE);
        return this;
    }

    public NfsInodeWhereInput assignedSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_LTE);
        return this;
    }

    public void setAssignedSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_LTE);
        }
    }

    public boolean getAssignedSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_LTE);
    }

    public NfsInodeWhereInput assignedSizeNot(Long assignedSizeNot) {

        this.assignedSizeNot = assignedSizeNot;
        return this;
    }

    /**
     * Get assignedSizeNot
     *
     * @return assignedSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAssignedSizeNot() {
        return assignedSizeNot;
    }

    public void setAssignedSizeNot(Long assignedSizeNot) {
        this.assignedSizeNot = assignedSizeNot;
    }

    public NfsInodeWhereInput assignedSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_NOT);
        return this;
    }

    public NfsInodeWhereInput assignedSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_NOT);
        return this;
    }

    public void setAssignedSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_NOT);
        }
    }

    public boolean getAssignedSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_NOT);
    }

    public NfsInodeWhereInput assignedSizeNotIn(List<Long> assignedSizeNotIn) {

        this.assignedSizeNotIn = assignedSizeNotIn;
        return this;
    }

    public NfsInodeWhereInput addAssignedSizeNotInItem(Long assignedSizeNotInItem) {
        if (this.assignedSizeNotIn == null) {
            this.assignedSizeNotIn = new ArrayList<Long>();
        }
        this.assignedSizeNotIn.add(assignedSizeNotInItem);
        return this;
    }

    /**
     * Get assignedSizeNotIn
     *
     * @return assignedSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getAssignedSizeNotIn() {
        return assignedSizeNotIn;
    }

    public void setAssignedSizeNotIn(List<Long> assignedSizeNotIn) {
        this.assignedSizeNotIn = assignedSizeNotIn;
    }

    public NfsInodeWhereInput assignedSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput assignedSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN);
        return this;
    }

    public void setAssignedSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN);
        }
    }

    public boolean getAssignedSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpace(Long downgradedPrioritizedSpace) {

        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpace
     *
     * @return downgradedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpace() {
        return downgradedPrioritizedSpace;
    }

    public void setDowngradedPrioritizedSpace(Long downgradedPrioritizedSpace) {
        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public void setDowngradedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        }
    }

    public boolean getDowngradedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceGt(Long downgradedPrioritizedSpaceGt) {

        this.downgradedPrioritizedSpaceGt = downgradedPrioritizedSpaceGt;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceGt
     *
     * @return downgradedPrioritizedSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpaceGt() {
        return downgradedPrioritizedSpaceGt;
    }

    public void setDowngradedPrioritizedSpaceGt(Long downgradedPrioritizedSpaceGt) {
        this.downgradedPrioritizedSpaceGt = downgradedPrioritizedSpaceGt;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT);
        return this;
    }

    public void setDowngradedPrioritizedSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT);
        }
    }

    public boolean getDowngradedPrioritizedSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GT);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceGte(Long downgradedPrioritizedSpaceGte) {

        this.downgradedPrioritizedSpaceGte = downgradedPrioritizedSpaceGte;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceGte
     *
     * @return downgradedPrioritizedSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpaceGte() {
        return downgradedPrioritizedSpaceGte;
    }

    public void setDowngradedPrioritizedSpaceGte(Long downgradedPrioritizedSpaceGte) {
        this.downgradedPrioritizedSpaceGte = downgradedPrioritizedSpaceGte;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE);
        return this;
    }

    public void setDowngradedPrioritizedSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE);
        }
    }

    public boolean getDowngradedPrioritizedSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_GTE);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceIn(
            List<Long> downgradedPrioritizedSpaceIn) {

        this.downgradedPrioritizedSpaceIn = downgradedPrioritizedSpaceIn;
        return this;
    }

    public NfsInodeWhereInput addDowngradedPrioritizedSpaceInItem(
            Long downgradedPrioritizedSpaceInItem) {
        if (this.downgradedPrioritizedSpaceIn == null) {
            this.downgradedPrioritizedSpaceIn = new ArrayList<Long>();
        }
        this.downgradedPrioritizedSpaceIn.add(downgradedPrioritizedSpaceInItem);
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceIn
     *
     * @return downgradedPrioritizedSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getDowngradedPrioritizedSpaceIn() {
        return downgradedPrioritizedSpaceIn;
    }

    public void setDowngradedPrioritizedSpaceIn(List<Long> downgradedPrioritizedSpaceIn) {
        this.downgradedPrioritizedSpaceIn = downgradedPrioritizedSpaceIn;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN);
        return this;
    }

    public void setDowngradedPrioritizedSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN);
        }
    }

    public boolean getDowngradedPrioritizedSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_IN);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceLt(Long downgradedPrioritizedSpaceLt) {

        this.downgradedPrioritizedSpaceLt = downgradedPrioritizedSpaceLt;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceLt
     *
     * @return downgradedPrioritizedSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpaceLt() {
        return downgradedPrioritizedSpaceLt;
    }

    public void setDowngradedPrioritizedSpaceLt(Long downgradedPrioritizedSpaceLt) {
        this.downgradedPrioritizedSpaceLt = downgradedPrioritizedSpaceLt;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT);
        return this;
    }

    public void setDowngradedPrioritizedSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT);
        }
    }

    public boolean getDowngradedPrioritizedSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LT);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceLte(Long downgradedPrioritizedSpaceLte) {

        this.downgradedPrioritizedSpaceLte = downgradedPrioritizedSpaceLte;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceLte
     *
     * @return downgradedPrioritizedSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpaceLte() {
        return downgradedPrioritizedSpaceLte;
    }

    public void setDowngradedPrioritizedSpaceLte(Long downgradedPrioritizedSpaceLte) {
        this.downgradedPrioritizedSpaceLte = downgradedPrioritizedSpaceLte;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE);
        return this;
    }

    public void setDowngradedPrioritizedSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE);
        }
    }

    public boolean getDowngradedPrioritizedSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_LTE);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceNot(Long downgradedPrioritizedSpaceNot) {

        this.downgradedPrioritizedSpaceNot = downgradedPrioritizedSpaceNot;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceNot
     *
     * @return downgradedPrioritizedSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpaceNot() {
        return downgradedPrioritizedSpaceNot;
    }

    public void setDowngradedPrioritizedSpaceNot(Long downgradedPrioritizedSpaceNot) {
        this.downgradedPrioritizedSpaceNot = downgradedPrioritizedSpaceNot;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT);
        return this;
    }

    public void setDowngradedPrioritizedSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT);
        }
    }

    public boolean getDowngradedPrioritizedSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT);
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceNotIn(
            List<Long> downgradedPrioritizedSpaceNotIn) {

        this.downgradedPrioritizedSpaceNotIn = downgradedPrioritizedSpaceNotIn;
        return this;
    }

    public NfsInodeWhereInput addDowngradedPrioritizedSpaceNotInItem(
            Long downgradedPrioritizedSpaceNotInItem) {
        if (this.downgradedPrioritizedSpaceNotIn == null) {
            this.downgradedPrioritizedSpaceNotIn = new ArrayList<Long>();
        }
        this.downgradedPrioritizedSpaceNotIn.add(downgradedPrioritizedSpaceNotInItem);
        return this;
    }

    /**
     * Get downgradedPrioritizedSpaceNotIn
     *
     * @return downgradedPrioritizedSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getDowngradedPrioritizedSpaceNotIn() {
        return downgradedPrioritizedSpaceNotIn;
    }

    public void setDowngradedPrioritizedSpaceNotIn(List<Long> downgradedPrioritizedSpaceNotIn) {
        this.downgradedPrioritizedSpaceNotIn = downgradedPrioritizedSpaceNotIn;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput downgradedPrioritizedSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN);
        return this;
    }

    public void setDowngradedPrioritizedSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN);
        }
    }

    public boolean getDowngradedPrioritizedSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE_NOT_IN);
    }

    public NfsInodeWhereInput ecK(Integer ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcK() {
        return ecK;
    }

    public void setEcK(Integer ecK) {
        this.ecK = ecK;
    }

    public NfsInodeWhereInput ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NfsInodeWhereInput ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public NfsInodeWhereInput ecKGt(Integer ecKGt) {

        this.ecKGt = ecKGt;
        return this;
    }

    /**
     * Get ecKGt
     *
     * @return ecKGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKGt() {
        return ecKGt;
    }

    public void setEcKGt(Integer ecKGt) {
        this.ecKGt = ecKGt;
    }

    public NfsInodeWhereInput ecKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public NfsInodeWhereInput ecKGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public void setEcKGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_GT);
        }
    }

    public boolean getEcKGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_GT);
    }

    public NfsInodeWhereInput ecKGte(Integer ecKGte) {

        this.ecKGte = ecKGte;
        return this;
    }

    /**
     * Get ecKGte
     *
     * @return ecKGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKGte() {
        return ecKGte;
    }

    public void setEcKGte(Integer ecKGte) {
        this.ecKGte = ecKGte;
    }

    public NfsInodeWhereInput ecKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public NfsInodeWhereInput ecKGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public void setEcKGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_GTE);
        }
    }

    public boolean getEcKGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_GTE);
    }

    public NfsInodeWhereInput ecKIn(List<Integer> ecKIn) {

        this.ecKIn = ecKIn;
        return this;
    }

    public NfsInodeWhereInput addEcKInItem(Integer ecKInItem) {
        if (this.ecKIn == null) {
            this.ecKIn = new ArrayList<Integer>();
        }
        this.ecKIn.add(ecKInItem);
        return this;
    }

    /**
     * Get ecKIn
     *
     * @return ecKIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcKIn() {
        return ecKIn;
    }

    public void setEcKIn(List<Integer> ecKIn) {
        this.ecKIn = ecKIn;
    }

    public NfsInodeWhereInput ecKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public NfsInodeWhereInput ecKIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public void setEcKIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_IN);
        }
    }

    public boolean getEcKIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_IN);
    }

    public NfsInodeWhereInput ecKLt(Integer ecKLt) {

        this.ecKLt = ecKLt;
        return this;
    }

    /**
     * Get ecKLt
     *
     * @return ecKLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKLt() {
        return ecKLt;
    }

    public void setEcKLt(Integer ecKLt) {
        this.ecKLt = ecKLt;
    }

    public NfsInodeWhereInput ecKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public NfsInodeWhereInput ecKLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public void setEcKLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_LT);
        }
    }

    public boolean getEcKLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_LT);
    }

    public NfsInodeWhereInput ecKLte(Integer ecKLte) {

        this.ecKLte = ecKLte;
        return this;
    }

    /**
     * Get ecKLte
     *
     * @return ecKLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKLte() {
        return ecKLte;
    }

    public void setEcKLte(Integer ecKLte) {
        this.ecKLte = ecKLte;
    }

    public NfsInodeWhereInput ecKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public NfsInodeWhereInput ecKLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public void setEcKLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_LTE);
        }
    }

    public boolean getEcKLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_LTE);
    }

    public NfsInodeWhereInput ecKNot(Integer ecKNot) {

        this.ecKNot = ecKNot;
        return this;
    }

    /**
     * Get ecKNot
     *
     * @return ecKNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKNot() {
        return ecKNot;
    }

    public void setEcKNot(Integer ecKNot) {
        this.ecKNot = ecKNot;
    }

    public NfsInodeWhereInput ecKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public NfsInodeWhereInput ecKNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public void setEcKNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT);
        }
    }

    public boolean getEcKNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_NOT);
    }

    public NfsInodeWhereInput ecKNotIn(List<Integer> ecKNotIn) {

        this.ecKNotIn = ecKNotIn;
        return this;
    }

    public NfsInodeWhereInput addEcKNotInItem(Integer ecKNotInItem) {
        if (this.ecKNotIn == null) {
            this.ecKNotIn = new ArrayList<Integer>();
        }
        this.ecKNotIn.add(ecKNotInItem);
        return this;
    }

    /**
     * Get ecKNotIn
     *
     * @return ecKNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcKNotIn() {
        return ecKNotIn;
    }

    public void setEcKNotIn(List<Integer> ecKNotIn) {
        this.ecKNotIn = ecKNotIn;
    }

    public NfsInodeWhereInput ecKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput ecKNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public void setEcKNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT_IN);
        }
    }

    public boolean getEcKNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_NOT_IN);
    }

    public NfsInodeWhereInput ecM(Integer ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcM() {
        return ecM;
    }

    public void setEcM(Integer ecM) {
        this.ecM = ecM;
    }

    public NfsInodeWhereInput ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NfsInodeWhereInput ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public NfsInodeWhereInput ecMGt(Integer ecMGt) {

        this.ecMGt = ecMGt;
        return this;
    }

    /**
     * Get ecMGt
     *
     * @return ecMGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMGt() {
        return ecMGt;
    }

    public void setEcMGt(Integer ecMGt) {
        this.ecMGt = ecMGt;
    }

    public NfsInodeWhereInput ecMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public NfsInodeWhereInput ecMGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public void setEcMGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_GT);
        }
    }

    public boolean getEcMGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_GT);
    }

    public NfsInodeWhereInput ecMGte(Integer ecMGte) {

        this.ecMGte = ecMGte;
        return this;
    }

    /**
     * Get ecMGte
     *
     * @return ecMGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMGte() {
        return ecMGte;
    }

    public void setEcMGte(Integer ecMGte) {
        this.ecMGte = ecMGte;
    }

    public NfsInodeWhereInput ecMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public NfsInodeWhereInput ecMGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public void setEcMGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_GTE);
        }
    }

    public boolean getEcMGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_GTE);
    }

    public NfsInodeWhereInput ecMIn(List<Integer> ecMIn) {

        this.ecMIn = ecMIn;
        return this;
    }

    public NfsInodeWhereInput addEcMInItem(Integer ecMInItem) {
        if (this.ecMIn == null) {
            this.ecMIn = new ArrayList<Integer>();
        }
        this.ecMIn.add(ecMInItem);
        return this;
    }

    /**
     * Get ecMIn
     *
     * @return ecMIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcMIn() {
        return ecMIn;
    }

    public void setEcMIn(List<Integer> ecMIn) {
        this.ecMIn = ecMIn;
    }

    public NfsInodeWhereInput ecMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public NfsInodeWhereInput ecMIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public void setEcMIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_IN);
        }
    }

    public boolean getEcMIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_IN);
    }

    public NfsInodeWhereInput ecMLt(Integer ecMLt) {

        this.ecMLt = ecMLt;
        return this;
    }

    /**
     * Get ecMLt
     *
     * @return ecMLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMLt() {
        return ecMLt;
    }

    public void setEcMLt(Integer ecMLt) {
        this.ecMLt = ecMLt;
    }

    public NfsInodeWhereInput ecMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public NfsInodeWhereInput ecMLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public void setEcMLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_LT);
        }
    }

    public boolean getEcMLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_LT);
    }

    public NfsInodeWhereInput ecMLte(Integer ecMLte) {

        this.ecMLte = ecMLte;
        return this;
    }

    /**
     * Get ecMLte
     *
     * @return ecMLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMLte() {
        return ecMLte;
    }

    public void setEcMLte(Integer ecMLte) {
        this.ecMLte = ecMLte;
    }

    public NfsInodeWhereInput ecMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public NfsInodeWhereInput ecMLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public void setEcMLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_LTE);
        }
    }

    public boolean getEcMLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_LTE);
    }

    public NfsInodeWhereInput ecMNot(Integer ecMNot) {

        this.ecMNot = ecMNot;
        return this;
    }

    /**
     * Get ecMNot
     *
     * @return ecMNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMNot() {
        return ecMNot;
    }

    public void setEcMNot(Integer ecMNot) {
        this.ecMNot = ecMNot;
    }

    public NfsInodeWhereInput ecMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public NfsInodeWhereInput ecMNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public void setEcMNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT);
        }
    }

    public boolean getEcMNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_NOT);
    }

    public NfsInodeWhereInput ecMNotIn(List<Integer> ecMNotIn) {

        this.ecMNotIn = ecMNotIn;
        return this;
    }

    public NfsInodeWhereInput addEcMNotInItem(Integer ecMNotInItem) {
        if (this.ecMNotIn == null) {
            this.ecMNotIn = new ArrayList<Integer>();
        }
        this.ecMNotIn.add(ecMNotInItem);
        return this;
    }

    /**
     * Get ecMNotIn
     *
     * @return ecMNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcMNotIn() {
        return ecMNotIn;
    }

    public void setEcMNotIn(List<Integer> ecMNotIn) {
        this.ecMNotIn = ecMNotIn;
    }

    public NfsInodeWhereInput ecMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput ecMNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public void setEcMNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT_IN);
        }
    }

    public boolean getEcMNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_NOT_IN);
    }

    public NfsInodeWhereInput encryptMethod(EncryptMethod encryptMethod) {

        this.encryptMethod = encryptMethod;
        return this;
    }

    /**
     * Get encryptMethod
     *
     * @return encryptMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EncryptMethod getEncryptMethod() {
        return encryptMethod;
    }

    public void setEncryptMethod(EncryptMethod encryptMethod) {
        this.encryptMethod = encryptMethod;
    }

    public NfsInodeWhereInput encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NfsInodeWhereInput encryptMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public void setEncryptMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        }
    }

    public boolean getEncryptMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD);
    }

    public NfsInodeWhereInput encryptMethodIn(List<EncryptMethod> encryptMethodIn) {

        this.encryptMethodIn = encryptMethodIn;
        return this;
    }

    public NfsInodeWhereInput addEncryptMethodInItem(EncryptMethod encryptMethodInItem) {
        if (this.encryptMethodIn == null) {
            this.encryptMethodIn = new ArrayList<EncryptMethod>();
        }
        this.encryptMethodIn.add(encryptMethodInItem);
        return this;
    }

    /**
     * Get encryptMethodIn
     *
     * @return encryptMethodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EncryptMethod> getEncryptMethodIn() {
        return encryptMethodIn;
    }

    public void setEncryptMethodIn(List<EncryptMethod> encryptMethodIn) {
        this.encryptMethodIn = encryptMethodIn;
    }

    public NfsInodeWhereInput encryptMethodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
        return this;
    }

    public NfsInodeWhereInput encryptMethodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
        return this;
    }

    public void setEncryptMethodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
        }
    }

    public boolean getEncryptMethodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
    }

    public NfsInodeWhereInput encryptMethodNot(EncryptMethod encryptMethodNot) {

        this.encryptMethodNot = encryptMethodNot;
        return this;
    }

    /**
     * Get encryptMethodNot
     *
     * @return encryptMethodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EncryptMethod getEncryptMethodNot() {
        return encryptMethodNot;
    }

    public void setEncryptMethodNot(EncryptMethod encryptMethodNot) {
        this.encryptMethodNot = encryptMethodNot;
    }

    public NfsInodeWhereInput encryptMethodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
        return this;
    }

    public NfsInodeWhereInput encryptMethodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
        return this;
    }

    public void setEncryptMethodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
        }
    }

    public boolean getEncryptMethodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
    }

    public NfsInodeWhereInput encryptMethodNotIn(List<EncryptMethod> encryptMethodNotIn) {

        this.encryptMethodNotIn = encryptMethodNotIn;
        return this;
    }

    public NfsInodeWhereInput addEncryptMethodNotInItem(EncryptMethod encryptMethodNotInItem) {
        if (this.encryptMethodNotIn == null) {
            this.encryptMethodNotIn = new ArrayList<EncryptMethod>();
        }
        this.encryptMethodNotIn.add(encryptMethodNotInItem);
        return this;
    }

    /**
     * Get encryptMethodNotIn
     *
     * @return encryptMethodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EncryptMethod> getEncryptMethodNotIn() {
        return encryptMethodNotIn;
    }

    public void setEncryptMethodNotIn(List<EncryptMethod> encryptMethodNotIn) {
        this.encryptMethodNotIn = encryptMethodNotIn;
    }

    public NfsInodeWhereInput encryptMethodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput encryptMethodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
        return this;
    }

    public void setEncryptMethodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
        }
    }

    public boolean getEncryptMethodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
    }

    public NfsInodeWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NfsInodeWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NfsInodeWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public NfsInodeWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public NfsInodeWhereInput addEntityAsyncStatusInItem(
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

    public NfsInodeWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public NfsInodeWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public NfsInodeWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public NfsInodeWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public NfsInodeWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public NfsInodeWhereInput addEntityAsyncStatusNotInItem(
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

    public NfsInodeWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput _file(Boolean _file) {

        this._file = _file;
        return this;
    }

    /**
     * Get _file
     *
     * @return _file
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getFile() {
        return _file;
    }

    public void setFile(Boolean _file) {
        this._file = _file;
    }

    public NfsInodeWhereInput _file_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE);
        return this;
    }

    public NfsInodeWhereInput _file_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE);
        return this;
    }

    public void setFile_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE);
        }
    }

    public boolean getFile_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE);
    }

    public NfsInodeWhereInput fileNot(Boolean fileNot) {

        this.fileNot = fileNot;
        return this;
    }

    /**
     * Get fileNot
     *
     * @return fileNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getFileNot() {
        return fileNot;
    }

    public void setFileNot(Boolean fileNot) {
        this.fileNot = fileNot;
    }

    public NfsInodeWhereInput fileNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILE_NOT);
        return this;
    }

    public NfsInodeWhereInput fileNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILE_NOT);
        return this;
    }

    public void setFileNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILE_NOT);
        }
    }

    public boolean getFileNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILE_NOT);
    }

    public NfsInodeWhereInput id(String id) {

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

    public NfsInodeWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NfsInodeWhereInput id_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idContains(String idContains) {

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

    public NfsInodeWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput idContains_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idEndsWith(String idEndsWith) {

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

    public NfsInodeWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput idEndsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idGt(String idGt) {

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

    public NfsInodeWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public NfsInodeWhereInput idGt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idGte(String idGte) {

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

    public NfsInodeWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public NfsInodeWhereInput idGte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public NfsInodeWhereInput addIdInItem(String idInItem) {
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

    public NfsInodeWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public NfsInodeWhereInput idIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idLt(String idLt) {

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

    public NfsInodeWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public NfsInodeWhereInput idLt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idLte(String idLte) {

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

    public NfsInodeWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public NfsInodeWhereInput idLte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idNot(String idNot) {

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

    public NfsInodeWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public NfsInodeWhereInput idNot_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idNotContains(String idNotContains) {

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

    public NfsInodeWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput idNotContains_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public NfsInodeWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public NfsInodeWhereInput addIdNotInItem(String idNotInItem) {
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

    public NfsInodeWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput idNotIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public NfsInodeWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput idStartsWith(String idStartsWith) {

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

    public NfsInodeWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput idStartsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public NfsInodeWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public NfsInodeWhereInput labelsEvery_ExplictlyNonNull() {
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

    public NfsInodeWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public NfsInodeWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public NfsInodeWhereInput labelsNone_ExplictlyNonNull() {
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

    public NfsInodeWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public NfsInodeWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public NfsInodeWhereInput labelsSome_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localId(String localId) {

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

    public NfsInodeWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NfsInodeWhereInput localId_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdContains(String localIdContains) {

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

    public NfsInodeWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput localIdContains_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public NfsInodeWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdGt(String localIdGt) {

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

    public NfsInodeWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public NfsInodeWhereInput localIdGt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdGte(String localIdGte) {

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

    public NfsInodeWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public NfsInodeWhereInput localIdGte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public NfsInodeWhereInput addLocalIdInItem(String localIdInItem) {
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

    public NfsInodeWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public NfsInodeWhereInput localIdIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdLt(String localIdLt) {

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

    public NfsInodeWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public NfsInodeWhereInput localIdLt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdLte(String localIdLte) {

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

    public NfsInodeWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public NfsInodeWhereInput localIdLte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdNot(String localIdNot) {

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

    public NfsInodeWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public NfsInodeWhereInput localIdNot_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdNotContains(String localIdNotContains) {

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

    public NfsInodeWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public NfsInodeWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public NfsInodeWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public NfsInodeWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public NfsInodeWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public NfsInodeWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput localUpdatedAt(String localUpdatedAt) {

        this.localUpdatedAt = localUpdatedAt;
        return this;
    }

    /**
     * Get localUpdatedAt
     *
     * @return localUpdatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAt() {
        return localUpdatedAt;
    }

    public void setLocalUpdatedAt(String localUpdatedAt) {
        this.localUpdatedAt = localUpdatedAt;
    }

    public NfsInodeWhereInput localUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public void setLocalUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        }
    }

    public boolean getLocalUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT);
    }

    public NfsInodeWhereInput localUpdatedAtGt(String localUpdatedAtGt) {

        this.localUpdatedAtGt = localUpdatedAtGt;
        return this;
    }

    /**
     * Get localUpdatedAtGt
     *
     * @return localUpdatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtGt() {
        return localUpdatedAtGt;
    }

    public void setLocalUpdatedAtGt(String localUpdatedAtGt) {
        this.localUpdatedAtGt = localUpdatedAtGt;
    }

    public NfsInodeWhereInput localUpdatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        return this;
    }

    public void setLocalUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        }
    }

    public boolean getLocalUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
    }

    public NfsInodeWhereInput localUpdatedAtGte(String localUpdatedAtGte) {

        this.localUpdatedAtGte = localUpdatedAtGte;
        return this;
    }

    /**
     * Get localUpdatedAtGte
     *
     * @return localUpdatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtGte() {
        return localUpdatedAtGte;
    }

    public void setLocalUpdatedAtGte(String localUpdatedAtGte) {
        this.localUpdatedAtGte = localUpdatedAtGte;
    }

    public NfsInodeWhereInput localUpdatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        return this;
    }

    public void setLocalUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        }
    }

    public boolean getLocalUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
    }

    public NfsInodeWhereInput localUpdatedAtIn(List<String> localUpdatedAtIn) {

        this.localUpdatedAtIn = localUpdatedAtIn;
        return this;
    }

    public NfsInodeWhereInput addLocalUpdatedAtInItem(String localUpdatedAtInItem) {
        if (this.localUpdatedAtIn == null) {
            this.localUpdatedAtIn = new ArrayList<String>();
        }
        this.localUpdatedAtIn.add(localUpdatedAtInItem);
        return this;
    }

    /**
     * Get localUpdatedAtIn
     *
     * @return localUpdatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalUpdatedAtIn() {
        return localUpdatedAtIn;
    }

    public void setLocalUpdatedAtIn(List<String> localUpdatedAtIn) {
        this.localUpdatedAtIn = localUpdatedAtIn;
    }

    public NfsInodeWhereInput localUpdatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        return this;
    }

    public void setLocalUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        }
    }

    public boolean getLocalUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
    }

    public NfsInodeWhereInput localUpdatedAtLt(String localUpdatedAtLt) {

        this.localUpdatedAtLt = localUpdatedAtLt;
        return this;
    }

    /**
     * Get localUpdatedAtLt
     *
     * @return localUpdatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtLt() {
        return localUpdatedAtLt;
    }

    public void setLocalUpdatedAtLt(String localUpdatedAtLt) {
        this.localUpdatedAtLt = localUpdatedAtLt;
    }

    public NfsInodeWhereInput localUpdatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        return this;
    }

    public void setLocalUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        }
    }

    public boolean getLocalUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
    }

    public NfsInodeWhereInput localUpdatedAtLte(String localUpdatedAtLte) {

        this.localUpdatedAtLte = localUpdatedAtLte;
        return this;
    }

    /**
     * Get localUpdatedAtLte
     *
     * @return localUpdatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtLte() {
        return localUpdatedAtLte;
    }

    public void setLocalUpdatedAtLte(String localUpdatedAtLte) {
        this.localUpdatedAtLte = localUpdatedAtLte;
    }

    public NfsInodeWhereInput localUpdatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        return this;
    }

    public void setLocalUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        }
    }

    public boolean getLocalUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
    }

    public NfsInodeWhereInput localUpdatedAtNot(String localUpdatedAtNot) {

        this.localUpdatedAtNot = localUpdatedAtNot;
        return this;
    }

    /**
     * Get localUpdatedAtNot
     *
     * @return localUpdatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtNot() {
        return localUpdatedAtNot;
    }

    public void setLocalUpdatedAtNot(String localUpdatedAtNot) {
        this.localUpdatedAtNot = localUpdatedAtNot;
    }

    public NfsInodeWhereInput localUpdatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        return this;
    }

    public void setLocalUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        }
    }

    public boolean getLocalUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
    }

    public NfsInodeWhereInput localUpdatedAtNotIn(List<String> localUpdatedAtNotIn) {

        this.localUpdatedAtNotIn = localUpdatedAtNotIn;
        return this;
    }

    public NfsInodeWhereInput addLocalUpdatedAtNotInItem(String localUpdatedAtNotInItem) {
        if (this.localUpdatedAtNotIn == null) {
            this.localUpdatedAtNotIn = new ArrayList<String>();
        }
        this.localUpdatedAtNotIn.add(localUpdatedAtNotInItem);
        return this;
    }

    /**
     * Get localUpdatedAtNotIn
     *
     * @return localUpdatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalUpdatedAtNotIn() {
        return localUpdatedAtNotIn;
    }

    public void setLocalUpdatedAtNotIn(List<String> localUpdatedAtNotIn) {
        this.localUpdatedAtNotIn = localUpdatedAtNotIn;
    }

    public NfsInodeWhereInput localUpdatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput localUpdatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setLocalUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getLocalUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
    }

    public NfsInodeWhereInput name(String name) {

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

    public NfsInodeWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NfsInodeWhereInput name_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameContains(String nameContains) {

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

    public NfsInodeWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput nameContains_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameEndsWith(String nameEndsWith) {

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

    public NfsInodeWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameGt(String nameGt) {

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

    public NfsInodeWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public NfsInodeWhereInput nameGt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameGte(String nameGte) {

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

    public NfsInodeWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public NfsInodeWhereInput nameGte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public NfsInodeWhereInput addNameInItem(String nameInItem) {
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

    public NfsInodeWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public NfsInodeWhereInput nameIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameLt(String nameLt) {

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

    public NfsInodeWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public NfsInodeWhereInput nameLt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameLte(String nameLte) {

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

    public NfsInodeWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public NfsInodeWhereInput nameLte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameNot(String nameNot) {

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

    public NfsInodeWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public NfsInodeWhereInput nameNot_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameNotContains(String nameNotContains) {

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

    public NfsInodeWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput nameNotContains_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public NfsInodeWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public NfsInodeWhereInput addNameNotInItem(String nameNotInItem) {
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

    public NfsInodeWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput nameNotIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public NfsInodeWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nameStartsWith(String nameStartsWith) {

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

    public NfsInodeWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public NfsInodeWhereInput nfsExport(NfsExportWhereInput nfsExport) {

        this.nfsExport = nfsExport;
        return this;
    }

    /**
     * Get nfsExport
     *
     * @return nfsExport
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsExportWhereInput getNfsExport() {
        return nfsExport;
    }

    public void setNfsExport(NfsExportWhereInput nfsExport) {
        this.nfsExport = nfsExport;
    }

    public NfsInodeWhereInput nfsExport_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT);
        return this;
    }

    public NfsInodeWhereInput nfsExport_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT);
        return this;
    }

    public void setNfsExport_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT);
        }
    }

    public boolean getNfsExport_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT);
    }

    public NfsInodeWhereInput parentId(String parentId) {

        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     *
     * @return parentId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public NfsInodeWhereInput parentId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID);
        return this;
    }

    public NfsInodeWhereInput parentId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID);
        return this;
    }

    public void setParentId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID);
        }
    }

    public boolean getParentId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID);
    }

    public NfsInodeWhereInput parentIdContains(String parentIdContains) {

        this.parentIdContains = parentIdContains;
        return this;
    }

    /**
     * Get parentIdContains
     *
     * @return parentIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdContains() {
        return parentIdContains;
    }

    public void setParentIdContains(String parentIdContains) {
        this.parentIdContains = parentIdContains;
    }

    public NfsInodeWhereInput parentIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput parentIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_CONTAINS);
        return this;
    }

    public void setParentIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_CONTAINS);
        }
    }

    public boolean getParentIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_CONTAINS);
    }

    public NfsInodeWhereInput parentIdEndsWith(String parentIdEndsWith) {

        this.parentIdEndsWith = parentIdEndsWith;
        return this;
    }

    /**
     * Get parentIdEndsWith
     *
     * @return parentIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdEndsWith() {
        return parentIdEndsWith;
    }

    public void setParentIdEndsWith(String parentIdEndsWith) {
        this.parentIdEndsWith = parentIdEndsWith;
    }

    public NfsInodeWhereInput parentIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput parentIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_ENDS_WITH);
        return this;
    }

    public void setParentIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_ENDS_WITH);
        }
    }

    public boolean getParentIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_ENDS_WITH);
    }

    public NfsInodeWhereInput parentIdGt(String parentIdGt) {

        this.parentIdGt = parentIdGt;
        return this;
    }

    /**
     * Get parentIdGt
     *
     * @return parentIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdGt() {
        return parentIdGt;
    }

    public void setParentIdGt(String parentIdGt) {
        this.parentIdGt = parentIdGt;
    }

    public NfsInodeWhereInput parentIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_GT);
        return this;
    }

    public NfsInodeWhereInput parentIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_GT);
        return this;
    }

    public void setParentIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_GT);
        }
    }

    public boolean getParentIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_GT);
    }

    public NfsInodeWhereInput parentIdGte(String parentIdGte) {

        this.parentIdGte = parentIdGte;
        return this;
    }

    /**
     * Get parentIdGte
     *
     * @return parentIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdGte() {
        return parentIdGte;
    }

    public void setParentIdGte(String parentIdGte) {
        this.parentIdGte = parentIdGte;
    }

    public NfsInodeWhereInput parentIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_GTE);
        return this;
    }

    public NfsInodeWhereInput parentIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_GTE);
        return this;
    }

    public void setParentIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_GTE);
        }
    }

    public boolean getParentIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_GTE);
    }

    public NfsInodeWhereInput parentIdIn(List<String> parentIdIn) {

        this.parentIdIn = parentIdIn;
        return this;
    }

    public NfsInodeWhereInput addParentIdInItem(String parentIdInItem) {
        if (this.parentIdIn == null) {
            this.parentIdIn = new ArrayList<String>();
        }
        this.parentIdIn.add(parentIdInItem);
        return this;
    }

    /**
     * Get parentIdIn
     *
     * @return parentIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getParentIdIn() {
        return parentIdIn;
    }

    public void setParentIdIn(List<String> parentIdIn) {
        this.parentIdIn = parentIdIn;
    }

    public NfsInodeWhereInput parentIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_IN);
        return this;
    }

    public NfsInodeWhereInput parentIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_IN);
        return this;
    }

    public void setParentIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_IN);
        }
    }

    public boolean getParentIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_IN);
    }

    public NfsInodeWhereInput parentIdLt(String parentIdLt) {

        this.parentIdLt = parentIdLt;
        return this;
    }

    /**
     * Get parentIdLt
     *
     * @return parentIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdLt() {
        return parentIdLt;
    }

    public void setParentIdLt(String parentIdLt) {
        this.parentIdLt = parentIdLt;
    }

    public NfsInodeWhereInput parentIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_LT);
        return this;
    }

    public NfsInodeWhereInput parentIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_LT);
        return this;
    }

    public void setParentIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_LT);
        }
    }

    public boolean getParentIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_LT);
    }

    public NfsInodeWhereInput parentIdLte(String parentIdLte) {

        this.parentIdLte = parentIdLte;
        return this;
    }

    /**
     * Get parentIdLte
     *
     * @return parentIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdLte() {
        return parentIdLte;
    }

    public void setParentIdLte(String parentIdLte) {
        this.parentIdLte = parentIdLte;
    }

    public NfsInodeWhereInput parentIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_LTE);
        return this;
    }

    public NfsInodeWhereInput parentIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_LTE);
        return this;
    }

    public void setParentIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_LTE);
        }
    }

    public boolean getParentIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_LTE);
    }

    public NfsInodeWhereInput parentIdNot(String parentIdNot) {

        this.parentIdNot = parentIdNot;
        return this;
    }

    /**
     * Get parentIdNot
     *
     * @return parentIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdNot() {
        return parentIdNot;
    }

    public void setParentIdNot(String parentIdNot) {
        this.parentIdNot = parentIdNot;
    }

    public NfsInodeWhereInput parentIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT);
        return this;
    }

    public NfsInodeWhereInput parentIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT);
        return this;
    }

    public void setParentIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT);
        }
    }

    public boolean getParentIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_NOT);
    }

    public NfsInodeWhereInput parentIdNotContains(String parentIdNotContains) {

        this.parentIdNotContains = parentIdNotContains;
        return this;
    }

    /**
     * Get parentIdNotContains
     *
     * @return parentIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdNotContains() {
        return parentIdNotContains;
    }

    public void setParentIdNotContains(String parentIdNotContains) {
        this.parentIdNotContains = parentIdNotContains;
    }

    public NfsInodeWhereInput parentIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS);
        return this;
    }

    public NfsInodeWhereInput parentIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS);
        return this;
    }

    public void setParentIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS);
        }
    }

    public boolean getParentIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_NOT_CONTAINS);
    }

    public NfsInodeWhereInput parentIdNotEndsWith(String parentIdNotEndsWith) {

        this.parentIdNotEndsWith = parentIdNotEndsWith;
        return this;
    }

    /**
     * Get parentIdNotEndsWith
     *
     * @return parentIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdNotEndsWith() {
        return parentIdNotEndsWith;
    }

    public void setParentIdNotEndsWith(String parentIdNotEndsWith) {
        this.parentIdNotEndsWith = parentIdNotEndsWith;
    }

    public NfsInodeWhereInput parentIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH);
        return this;
    }

    public NfsInodeWhereInput parentIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setParentIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getParentIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_NOT_ENDS_WITH);
    }

    public NfsInodeWhereInput parentIdNotIn(List<String> parentIdNotIn) {

        this.parentIdNotIn = parentIdNotIn;
        return this;
    }

    public NfsInodeWhereInput addParentIdNotInItem(String parentIdNotInItem) {
        if (this.parentIdNotIn == null) {
            this.parentIdNotIn = new ArrayList<String>();
        }
        this.parentIdNotIn.add(parentIdNotInItem);
        return this;
    }

    /**
     * Get parentIdNotIn
     *
     * @return parentIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getParentIdNotIn() {
        return parentIdNotIn;
    }

    public void setParentIdNotIn(List<String> parentIdNotIn) {
        this.parentIdNotIn = parentIdNotIn;
    }

    public NfsInodeWhereInput parentIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput parentIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_IN);
        return this;
    }

    public void setParentIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_IN);
        }
    }

    public boolean getParentIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_NOT_IN);
    }

    public NfsInodeWhereInput parentIdNotStartsWith(String parentIdNotStartsWith) {

        this.parentIdNotStartsWith = parentIdNotStartsWith;
        return this;
    }

    /**
     * Get parentIdNotStartsWith
     *
     * @return parentIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdNotStartsWith() {
        return parentIdNotStartsWith;
    }

    public void setParentIdNotStartsWith(String parentIdNotStartsWith) {
        this.parentIdNotStartsWith = parentIdNotStartsWith;
    }

    public NfsInodeWhereInput parentIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput parentIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setParentIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getParentIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_NOT_STARTS_WITH);
    }

    public NfsInodeWhereInput parentIdStartsWith(String parentIdStartsWith) {

        this.parentIdStartsWith = parentIdStartsWith;
        return this;
    }

    /**
     * Get parentIdStartsWith
     *
     * @return parentIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentIdStartsWith() {
        return parentIdStartsWith;
    }

    public void setParentIdStartsWith(String parentIdStartsWith) {
        this.parentIdStartsWith = parentIdStartsWith;
    }

    public NfsInodeWhereInput parentIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_STARTS_WITH);
        return this;
    }

    public NfsInodeWhereInput parentIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_STARTS_WITH);
        return this;
    }

    public void setParentIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID_STARTS_WITH);
        }
    }

    public boolean getParentIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID_STARTS_WITH);
    }

    public NfsInodeWhereInput prioritized(Boolean prioritized) {

        this.prioritized = prioritized;
        return this;
    }

    /**
     * Get prioritized
     *
     * @return prioritized
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPrioritized() {
        return prioritized;
    }

    public void setPrioritized(Boolean prioritized) {
        this.prioritized = prioritized;
    }

    public NfsInodeWhereInput prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NfsInodeWhereInput prioritized_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public void setPrioritized_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        }
    }

    public boolean getPrioritized_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIORITIZED);
    }

    public NfsInodeWhereInput prioritizedNot(Boolean prioritizedNot) {

        this.prioritizedNot = prioritizedNot;
        return this;
    }

    /**
     * Get prioritizedNot
     *
     * @return prioritizedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPrioritizedNot() {
        return prioritizedNot;
    }

    public void setPrioritizedNot(Boolean prioritizedNot) {
        this.prioritizedNot = prioritizedNot;
    }

    public NfsInodeWhereInput prioritizedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED_NOT);
        return this;
    }

    public NfsInodeWhereInput prioritizedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED_NOT);
        return this;
    }

    public void setPrioritizedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED_NOT);
        }
    }

    public boolean getPrioritizedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIORITIZED_NOT);
    }

    public NfsInodeWhereInput resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public NfsInodeWhereInput resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NfsInodeWhereInput resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public NfsInodeWhereInput resiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {

        this.resiliencyTypeIn = resiliencyTypeIn;
        return this;
    }

    public NfsInodeWhereInput addResiliencyTypeInItem(ResiliencyType resiliencyTypeInItem) {
        if (this.resiliencyTypeIn == null) {
            this.resiliencyTypeIn = new ArrayList<ResiliencyType>();
        }
        this.resiliencyTypeIn.add(resiliencyTypeInItem);
        return this;
    }

    /**
     * Get resiliencyTypeIn
     *
     * @return resiliencyTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResiliencyType> getResiliencyTypeIn() {
        return resiliencyTypeIn;
    }

    public void setResiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {
        this.resiliencyTypeIn = resiliencyTypeIn;
    }

    public NfsInodeWhereInput resiliencyTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public NfsInodeWhereInput resiliencyTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public void setResiliencyTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        }
    }

    public boolean getResiliencyTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
    }

    public NfsInodeWhereInput resiliencyTypeNot(ResiliencyType resiliencyTypeNot) {

        this.resiliencyTypeNot = resiliencyTypeNot;
        return this;
    }

    /**
     * Get resiliencyTypeNot
     *
     * @return resiliencyTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyTypeNot() {
        return resiliencyTypeNot;
    }

    public void setResiliencyTypeNot(ResiliencyType resiliencyTypeNot) {
        this.resiliencyTypeNot = resiliencyTypeNot;
    }

    public NfsInodeWhereInput resiliencyTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public NfsInodeWhereInput resiliencyTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public void setResiliencyTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        }
    }

    public boolean getResiliencyTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
    }

    public NfsInodeWhereInput resiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {

        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
        return this;
    }

    public NfsInodeWhereInput addResiliencyTypeNotInItem(ResiliencyType resiliencyTypeNotInItem) {
        if (this.resiliencyTypeNotIn == null) {
            this.resiliencyTypeNotIn = new ArrayList<ResiliencyType>();
        }
        this.resiliencyTypeNotIn.add(resiliencyTypeNotInItem);
        return this;
    }

    /**
     * Get resiliencyTypeNotIn
     *
     * @return resiliencyTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResiliencyType> getResiliencyTypeNotIn() {
        return resiliencyTypeNotIn;
    }

    public void setResiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {
        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
    }

    public NfsInodeWhereInput resiliencyTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput resiliencyTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public void setResiliencyTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        }
    }

    public boolean getResiliencyTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
    }

    public NfsInodeWhereInput sharedSize(Long sharedSize) {

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
    public Long getSharedSize() {
        return sharedSize;
    }

    public void setSharedSize(Long sharedSize) {
        this.sharedSize = sharedSize;
    }

    public NfsInodeWhereInput sharedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public NfsInodeWhereInput sharedSize_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeGt(Long sharedSizeGt) {

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
    public Long getSharedSizeGt() {
        return sharedSizeGt;
    }

    public void setSharedSizeGt(Long sharedSizeGt) {
        this.sharedSizeGt = sharedSizeGt;
    }

    public NfsInodeWhereInput sharedSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_GT);
        return this;
    }

    public NfsInodeWhereInput sharedSizeGt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeGte(Long sharedSizeGte) {

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
    public Long getSharedSizeGte() {
        return sharedSizeGte;
    }

    public void setSharedSizeGte(Long sharedSizeGte) {
        this.sharedSizeGte = sharedSizeGte;
    }

    public NfsInodeWhereInput sharedSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_GTE);
        return this;
    }

    public NfsInodeWhereInput sharedSizeGte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeIn(List<Long> sharedSizeIn) {

        this.sharedSizeIn = sharedSizeIn;
        return this;
    }

    public NfsInodeWhereInput addSharedSizeInItem(Long sharedSizeInItem) {
        if (this.sharedSizeIn == null) {
            this.sharedSizeIn = new ArrayList<Long>();
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
    public List<Long> getSharedSizeIn() {
        return sharedSizeIn;
    }

    public void setSharedSizeIn(List<Long> sharedSizeIn) {
        this.sharedSizeIn = sharedSizeIn;
    }

    public NfsInodeWhereInput sharedSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_IN);
        return this;
    }

    public NfsInodeWhereInput sharedSizeIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeLt(Long sharedSizeLt) {

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
    public Long getSharedSizeLt() {
        return sharedSizeLt;
    }

    public void setSharedSizeLt(Long sharedSizeLt) {
        this.sharedSizeLt = sharedSizeLt;
    }

    public NfsInodeWhereInput sharedSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_LT);
        return this;
    }

    public NfsInodeWhereInput sharedSizeLt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeLte(Long sharedSizeLte) {

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
    public Long getSharedSizeLte() {
        return sharedSizeLte;
    }

    public void setSharedSizeLte(Long sharedSizeLte) {
        this.sharedSizeLte = sharedSizeLte;
    }

    public NfsInodeWhereInput sharedSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_LTE);
        return this;
    }

    public NfsInodeWhereInput sharedSizeLte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeNot(Long sharedSizeNot) {

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
    public Long getSharedSizeNot() {
        return sharedSizeNot;
    }

    public void setSharedSizeNot(Long sharedSizeNot) {
        this.sharedSizeNot = sharedSizeNot;
    }

    public NfsInodeWhereInput sharedSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_NOT);
        return this;
    }

    public NfsInodeWhereInput sharedSizeNot_ExplictlyNonNull() {
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

    public NfsInodeWhereInput sharedSizeNotIn(List<Long> sharedSizeNotIn) {

        this.sharedSizeNotIn = sharedSizeNotIn;
        return this;
    }

    public NfsInodeWhereInput addSharedSizeNotInItem(Long sharedSizeNotInItem) {
        if (this.sharedSizeNotIn == null) {
            this.sharedSizeNotIn = new ArrayList<Long>();
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
    public List<Long> getSharedSizeNotIn() {
        return sharedSizeNotIn;
    }

    public void setSharedSizeNotIn(List<Long> sharedSizeNotIn) {
        this.sharedSizeNotIn = sharedSizeNotIn;
    }

    public NfsInodeWhereInput sharedSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput sharedSizeNotIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput snapshotNum(Integer snapshotNum) {

        this.snapshotNum = snapshotNum;
        return this;
    }

    /**
     * Get snapshotNum
     *
     * @return snapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotNum() {
        return snapshotNum;
    }

    public void setSnapshotNum(Integer snapshotNum) {
        this.snapshotNum = snapshotNum;
    }

    public NfsInodeWhereInput snapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM);
        return this;
    }

    public NfsInodeWhereInput snapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM);
        return this;
    }

    public void setSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM);
        }
    }

    public boolean getSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM);
    }

    public NfsInodeWhereInput snapshotNumGt(Integer snapshotNumGt) {

        this.snapshotNumGt = snapshotNumGt;
        return this;
    }

    /**
     * Get snapshotNumGt
     *
     * @return snapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotNumGt() {
        return snapshotNumGt;
    }

    public void setSnapshotNumGt(Integer snapshotNumGt) {
        this.snapshotNumGt = snapshotNumGt;
    }

    public NfsInodeWhereInput snapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_GT);
        return this;
    }

    public NfsInodeWhereInput snapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_GT);
    }

    public NfsInodeWhereInput snapshotNumGte(Integer snapshotNumGte) {

        this.snapshotNumGte = snapshotNumGte;
        return this;
    }

    /**
     * Get snapshotNumGte
     *
     * @return snapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotNumGte() {
        return snapshotNumGte;
    }

    public void setSnapshotNumGte(Integer snapshotNumGte) {
        this.snapshotNumGte = snapshotNumGte;
    }

    public NfsInodeWhereInput snapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_GTE);
        return this;
    }

    public NfsInodeWhereInput snapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_GTE);
    }

    public NfsInodeWhereInput snapshotNumIn(List<Integer> snapshotNumIn) {

        this.snapshotNumIn = snapshotNumIn;
        return this;
    }

    public NfsInodeWhereInput addSnapshotNumInItem(Integer snapshotNumInItem) {
        if (this.snapshotNumIn == null) {
            this.snapshotNumIn = new ArrayList<Integer>();
        }
        this.snapshotNumIn.add(snapshotNumInItem);
        return this;
    }

    /**
     * Get snapshotNumIn
     *
     * @return snapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSnapshotNumIn() {
        return snapshotNumIn;
    }

    public void setSnapshotNumIn(List<Integer> snapshotNumIn) {
        this.snapshotNumIn = snapshotNumIn;
    }

    public NfsInodeWhereInput snapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_IN);
        return this;
    }

    public NfsInodeWhereInput snapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_IN);
    }

    public NfsInodeWhereInput snapshotNumLt(Integer snapshotNumLt) {

        this.snapshotNumLt = snapshotNumLt;
        return this;
    }

    /**
     * Get snapshotNumLt
     *
     * @return snapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotNumLt() {
        return snapshotNumLt;
    }

    public void setSnapshotNumLt(Integer snapshotNumLt) {
        this.snapshotNumLt = snapshotNumLt;
    }

    public NfsInodeWhereInput snapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_LT);
        return this;
    }

    public NfsInodeWhereInput snapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_LT);
    }

    public NfsInodeWhereInput snapshotNumLte(Integer snapshotNumLte) {

        this.snapshotNumLte = snapshotNumLte;
        return this;
    }

    /**
     * Get snapshotNumLte
     *
     * @return snapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotNumLte() {
        return snapshotNumLte;
    }

    public void setSnapshotNumLte(Integer snapshotNumLte) {
        this.snapshotNumLte = snapshotNumLte;
    }

    public NfsInodeWhereInput snapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_LTE);
        return this;
    }

    public NfsInodeWhereInput snapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_LTE);
    }

    public NfsInodeWhereInput snapshotNumNot(Integer snapshotNumNot) {

        this.snapshotNumNot = snapshotNumNot;
        return this;
    }

    /**
     * Get snapshotNumNot
     *
     * @return snapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotNumNot() {
        return snapshotNumNot;
    }

    public void setSnapshotNumNot(Integer snapshotNumNot) {
        this.snapshotNumNot = snapshotNumNot;
    }

    public NfsInodeWhereInput snapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_NOT);
        return this;
    }

    public NfsInodeWhereInput snapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_NOT);
    }

    public NfsInodeWhereInput snapshotNumNotIn(List<Integer> snapshotNumNotIn) {

        this.snapshotNumNotIn = snapshotNumNotIn;
        return this;
    }

    public NfsInodeWhereInput addSnapshotNumNotInItem(Integer snapshotNumNotInItem) {
        if (this.snapshotNumNotIn == null) {
            this.snapshotNumNotIn = new ArrayList<Integer>();
        }
        this.snapshotNumNotIn.add(snapshotNumNotInItem);
        return this;
    }

    /**
     * Get snapshotNumNotIn
     *
     * @return snapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSnapshotNumNotIn() {
        return snapshotNumNotIn;
    }

    public void setSnapshotNumNotIn(List<Integer> snapshotNumNotIn) {
        this.snapshotNumNotIn = snapshotNumNotIn;
    }

    public NfsInodeWhereInput snapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput snapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN);
    }

    public NfsInodeWhereInput uniqueLogicalSize(Double uniqueLogicalSize) {

        this.uniqueLogicalSize = uniqueLogicalSize;
        return this;
    }

    /**
     * Get uniqueLogicalSize
     *
     * @return uniqueLogicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSize() {
        return uniqueLogicalSize;
    }

    public void setUniqueLogicalSize(Double uniqueLogicalSize) {
        this.uniqueLogicalSize = uniqueLogicalSize;
    }

    public NfsInodeWhereInput uniqueLogicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public void setUniqueLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        }
    }

    public boolean getUniqueLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
    }

    public NfsInodeWhereInput uniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {

        this.uniqueLogicalSizeGt = uniqueLogicalSizeGt;
        return this;
    }

    /**
     * Get uniqueLogicalSizeGt
     *
     * @return uniqueLogicalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeGt() {
        return uniqueLogicalSizeGt;
    }

    public void setUniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {
        this.uniqueLogicalSizeGt = uniqueLogicalSizeGt;
    }

    public NfsInodeWhereInput uniqueLogicalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        return this;
    }

    public void setUniqueLogicalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        }
    }

    public boolean getUniqueLogicalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
    }

    public NfsInodeWhereInput uniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {

        this.uniqueLogicalSizeGte = uniqueLogicalSizeGte;
        return this;
    }

    /**
     * Get uniqueLogicalSizeGte
     *
     * @return uniqueLogicalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeGte() {
        return uniqueLogicalSizeGte;
    }

    public void setUniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {
        this.uniqueLogicalSizeGte = uniqueLogicalSizeGte;
    }

    public NfsInodeWhereInput uniqueLogicalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        return this;
    }

    public void setUniqueLogicalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        }
    }

    public boolean getUniqueLogicalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
    }

    public NfsInodeWhereInput uniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {

        this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
        return this;
    }

    public NfsInodeWhereInput addUniqueLogicalSizeInItem(Double uniqueLogicalSizeInItem) {
        if (this.uniqueLogicalSizeIn == null) {
            this.uniqueLogicalSizeIn = new ArrayList<Double>();
        }
        this.uniqueLogicalSizeIn.add(uniqueLogicalSizeInItem);
        return this;
    }

    /**
     * Get uniqueLogicalSizeIn
     *
     * @return uniqueLogicalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUniqueLogicalSizeIn() {
        return uniqueLogicalSizeIn;
    }

    public void setUniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {
        this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
    }

    public NfsInodeWhereInput uniqueLogicalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        return this;
    }

    public void setUniqueLogicalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        }
    }

    public boolean getUniqueLogicalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
    }

    public NfsInodeWhereInput uniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {

        this.uniqueLogicalSizeLt = uniqueLogicalSizeLt;
        return this;
    }

    /**
     * Get uniqueLogicalSizeLt
     *
     * @return uniqueLogicalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeLt() {
        return uniqueLogicalSizeLt;
    }

    public void setUniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {
        this.uniqueLogicalSizeLt = uniqueLogicalSizeLt;
    }

    public NfsInodeWhereInput uniqueLogicalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        return this;
    }

    public void setUniqueLogicalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        }
    }

    public boolean getUniqueLogicalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
    }

    public NfsInodeWhereInput uniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {

        this.uniqueLogicalSizeLte = uniqueLogicalSizeLte;
        return this;
    }

    /**
     * Get uniqueLogicalSizeLte
     *
     * @return uniqueLogicalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeLte() {
        return uniqueLogicalSizeLte;
    }

    public void setUniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {
        this.uniqueLogicalSizeLte = uniqueLogicalSizeLte;
    }

    public NfsInodeWhereInput uniqueLogicalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        return this;
    }

    public void setUniqueLogicalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        }
    }

    public boolean getUniqueLogicalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
    }

    public NfsInodeWhereInput uniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {

        this.uniqueLogicalSizeNot = uniqueLogicalSizeNot;
        return this;
    }

    /**
     * Get uniqueLogicalSizeNot
     *
     * @return uniqueLogicalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeNot() {
        return uniqueLogicalSizeNot;
    }

    public void setUniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {
        this.uniqueLogicalSizeNot = uniqueLogicalSizeNot;
    }

    public NfsInodeWhereInput uniqueLogicalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        return this;
    }

    public void setUniqueLogicalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        }
    }

    public boolean getUniqueLogicalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
    }

    public NfsInodeWhereInput uniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {

        this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
        return this;
    }

    public NfsInodeWhereInput addUniqueLogicalSizeNotInItem(Double uniqueLogicalSizeNotInItem) {
        if (this.uniqueLogicalSizeNotIn == null) {
            this.uniqueLogicalSizeNotIn = new ArrayList<Double>();
        }
        this.uniqueLogicalSizeNotIn.add(uniqueLogicalSizeNotInItem);
        return this;
    }

    /**
     * Get uniqueLogicalSizeNotIn
     *
     * @return uniqueLogicalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUniqueLogicalSizeNotIn() {
        return uniqueLogicalSizeNotIn;
    }

    public void setUniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {
        this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
    }

    public NfsInodeWhereInput uniqueLogicalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput uniqueLogicalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public void setUniqueLogicalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        }
    }

    public boolean getUniqueLogicalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
    }

    public NfsInodeWhereInput uniqueSize(Long uniqueSize) {

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
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public NfsInodeWhereInput uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public NfsInodeWhereInput uniqueSize_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeGt(Long uniqueSizeGt) {

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
    public Long getUniqueSizeGt() {
        return uniqueSizeGt;
    }

    public void setUniqueSizeGt(Long uniqueSizeGt) {
        this.uniqueSizeGt = uniqueSizeGt;
    }

    public NfsInodeWhereInput uniqueSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeGt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeGte(Long uniqueSizeGte) {

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
    public Long getUniqueSizeGte() {
        return uniqueSizeGte;
    }

    public void setUniqueSizeGte(Long uniqueSizeGte) {
        this.uniqueSizeGte = uniqueSizeGte;
    }

    public NfsInodeWhereInput uniqueSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeGte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeIn(List<Long> uniqueSizeIn) {

        this.uniqueSizeIn = uniqueSizeIn;
        return this;
    }

    public NfsInodeWhereInput addUniqueSizeInItem(Long uniqueSizeInItem) {
        if (this.uniqueSizeIn == null) {
            this.uniqueSizeIn = new ArrayList<Long>();
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
    public List<Long> getUniqueSizeIn() {
        return uniqueSizeIn;
    }

    public void setUniqueSizeIn(List<Long> uniqueSizeIn) {
        this.uniqueSizeIn = uniqueSizeIn;
    }

    public NfsInodeWhereInput uniqueSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeIn_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeLt(Long uniqueSizeLt) {

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
    public Long getUniqueSizeLt() {
        return uniqueSizeLt;
    }

    public void setUniqueSizeLt(Long uniqueSizeLt) {
        this.uniqueSizeLt = uniqueSizeLt;
    }

    public NfsInodeWhereInput uniqueSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeLt_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeLte(Long uniqueSizeLte) {

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
    public Long getUniqueSizeLte() {
        return uniqueSizeLte;
    }

    public void setUniqueSizeLte(Long uniqueSizeLte) {
        this.uniqueSizeLte = uniqueSizeLte;
    }

    public NfsInodeWhereInput uniqueSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeLte_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeNot(Long uniqueSizeNot) {

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
    public Long getUniqueSizeNot() {
        return uniqueSizeNot;
    }

    public void setUniqueSizeNot(Long uniqueSizeNot) {
        this.uniqueSizeNot = uniqueSizeNot;
    }

    public NfsInodeWhereInput uniqueSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeNot_ExplictlyNonNull() {
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

    public NfsInodeWhereInput uniqueSizeNotIn(List<Long> uniqueSizeNotIn) {

        this.uniqueSizeNotIn = uniqueSizeNotIn;
        return this;
    }

    public NfsInodeWhereInput addUniqueSizeNotInItem(Long uniqueSizeNotInItem) {
        if (this.uniqueSizeNotIn == null) {
            this.uniqueSizeNotIn = new ArrayList<Long>();
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
    public List<Long> getUniqueSizeNotIn() {
        return uniqueSizeNotIn;
    }

    public void setUniqueSizeNotIn(List<Long> uniqueSizeNotIn) {
        this.uniqueSizeNotIn = uniqueSizeNotIn;
    }

    public NfsInodeWhereInput uniqueSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public NfsInodeWhereInput uniqueSizeNotIn_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NfsInodeWhereInput nfsInodeWhereInput = (NfsInodeWhereInput) o;
        return Objects.equals(this.AND, nfsInodeWhereInput.AND)
                && Objects.equals(this.NOT, nfsInodeWhereInput.NOT)
                && Objects.equals(this.OR, nfsInodeWhereInput.OR)
                && Objects.equals(this.assignedSize, nfsInodeWhereInput.assignedSize)
                && Objects.equals(this.assignedSizeGt, nfsInodeWhereInput.assignedSizeGt)
                && Objects.equals(this.assignedSizeGte, nfsInodeWhereInput.assignedSizeGte)
                && Objects.equals(this.assignedSizeIn, nfsInodeWhereInput.assignedSizeIn)
                && Objects.equals(this.assignedSizeLt, nfsInodeWhereInput.assignedSizeLt)
                && Objects.equals(this.assignedSizeLte, nfsInodeWhereInput.assignedSizeLte)
                && Objects.equals(this.assignedSizeNot, nfsInodeWhereInput.assignedSizeNot)
                && Objects.equals(this.assignedSizeNotIn, nfsInodeWhereInput.assignedSizeNotIn)
                && Objects.equals(
                        this.downgradedPrioritizedSpace,
                        nfsInodeWhereInput.downgradedPrioritizedSpace)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceGt,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceGt)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceGte,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceGte)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceIn,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceIn)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceLt,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceLt)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceLte,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceLte)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceNot,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceNot)
                && Objects.equals(
                        this.downgradedPrioritizedSpaceNotIn,
                        nfsInodeWhereInput.downgradedPrioritizedSpaceNotIn)
                && Objects.equals(this.ecK, nfsInodeWhereInput.ecK)
                && Objects.equals(this.ecKGt, nfsInodeWhereInput.ecKGt)
                && Objects.equals(this.ecKGte, nfsInodeWhereInput.ecKGte)
                && Objects.equals(this.ecKIn, nfsInodeWhereInput.ecKIn)
                && Objects.equals(this.ecKLt, nfsInodeWhereInput.ecKLt)
                && Objects.equals(this.ecKLte, nfsInodeWhereInput.ecKLte)
                && Objects.equals(this.ecKNot, nfsInodeWhereInput.ecKNot)
                && Objects.equals(this.ecKNotIn, nfsInodeWhereInput.ecKNotIn)
                && Objects.equals(this.ecM, nfsInodeWhereInput.ecM)
                && Objects.equals(this.ecMGt, nfsInodeWhereInput.ecMGt)
                && Objects.equals(this.ecMGte, nfsInodeWhereInput.ecMGte)
                && Objects.equals(this.ecMIn, nfsInodeWhereInput.ecMIn)
                && Objects.equals(this.ecMLt, nfsInodeWhereInput.ecMLt)
                && Objects.equals(this.ecMLte, nfsInodeWhereInput.ecMLte)
                && Objects.equals(this.ecMNot, nfsInodeWhereInput.ecMNot)
                && Objects.equals(this.ecMNotIn, nfsInodeWhereInput.ecMNotIn)
                && Objects.equals(this.encryptMethod, nfsInodeWhereInput.encryptMethod)
                && Objects.equals(this.encryptMethodIn, nfsInodeWhereInput.encryptMethodIn)
                && Objects.equals(this.encryptMethodNot, nfsInodeWhereInput.encryptMethodNot)
                && Objects.equals(this.encryptMethodNotIn, nfsInodeWhereInput.encryptMethodNotIn)
                && Objects.equals(this.entityAsyncStatus, nfsInodeWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, nfsInodeWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, nfsInodeWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, nfsInodeWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this._file, nfsInodeWhereInput._file)
                && Objects.equals(this.fileNot, nfsInodeWhereInput.fileNot)
                && Objects.equals(this.id, nfsInodeWhereInput.id)
                && Objects.equals(this.idContains, nfsInodeWhereInput.idContains)
                && Objects.equals(this.idEndsWith, nfsInodeWhereInput.idEndsWith)
                && Objects.equals(this.idGt, nfsInodeWhereInput.idGt)
                && Objects.equals(this.idGte, nfsInodeWhereInput.idGte)
                && Objects.equals(this.idIn, nfsInodeWhereInput.idIn)
                && Objects.equals(this.idLt, nfsInodeWhereInput.idLt)
                && Objects.equals(this.idLte, nfsInodeWhereInput.idLte)
                && Objects.equals(this.idNot, nfsInodeWhereInput.idNot)
                && Objects.equals(this.idNotContains, nfsInodeWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, nfsInodeWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, nfsInodeWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, nfsInodeWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, nfsInodeWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, nfsInodeWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, nfsInodeWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, nfsInodeWhereInput.labelsSome)
                && Objects.equals(this.localId, nfsInodeWhereInput.localId)
                && Objects.equals(this.localIdContains, nfsInodeWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, nfsInodeWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, nfsInodeWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, nfsInodeWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, nfsInodeWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, nfsInodeWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, nfsInodeWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, nfsInodeWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, nfsInodeWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, nfsInodeWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, nfsInodeWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, nfsInodeWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, nfsInodeWhereInput.localIdStartsWith)
                && Objects.equals(this.localUpdatedAt, nfsInodeWhereInput.localUpdatedAt)
                && Objects.equals(this.localUpdatedAtGt, nfsInodeWhereInput.localUpdatedAtGt)
                && Objects.equals(this.localUpdatedAtGte, nfsInodeWhereInput.localUpdatedAtGte)
                && Objects.equals(this.localUpdatedAtIn, nfsInodeWhereInput.localUpdatedAtIn)
                && Objects.equals(this.localUpdatedAtLt, nfsInodeWhereInput.localUpdatedAtLt)
                && Objects.equals(this.localUpdatedAtLte, nfsInodeWhereInput.localUpdatedAtLte)
                && Objects.equals(this.localUpdatedAtNot, nfsInodeWhereInput.localUpdatedAtNot)
                && Objects.equals(this.localUpdatedAtNotIn, nfsInodeWhereInput.localUpdatedAtNotIn)
                && Objects.equals(this.name, nfsInodeWhereInput.name)
                && Objects.equals(this.nameContains, nfsInodeWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, nfsInodeWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, nfsInodeWhereInput.nameGt)
                && Objects.equals(this.nameGte, nfsInodeWhereInput.nameGte)
                && Objects.equals(this.nameIn, nfsInodeWhereInput.nameIn)
                && Objects.equals(this.nameLt, nfsInodeWhereInput.nameLt)
                && Objects.equals(this.nameLte, nfsInodeWhereInput.nameLte)
                && Objects.equals(this.nameNot, nfsInodeWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, nfsInodeWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, nfsInodeWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, nfsInodeWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, nfsInodeWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, nfsInodeWhereInput.nameStartsWith)
                && Objects.equals(this.nfsExport, nfsInodeWhereInput.nfsExport)
                && Objects.equals(this.parentId, nfsInodeWhereInput.parentId)
                && Objects.equals(this.parentIdContains, nfsInodeWhereInput.parentIdContains)
                && Objects.equals(this.parentIdEndsWith, nfsInodeWhereInput.parentIdEndsWith)
                && Objects.equals(this.parentIdGt, nfsInodeWhereInput.parentIdGt)
                && Objects.equals(this.parentIdGte, nfsInodeWhereInput.parentIdGte)
                && Objects.equals(this.parentIdIn, nfsInodeWhereInput.parentIdIn)
                && Objects.equals(this.parentIdLt, nfsInodeWhereInput.parentIdLt)
                && Objects.equals(this.parentIdLte, nfsInodeWhereInput.parentIdLte)
                && Objects.equals(this.parentIdNot, nfsInodeWhereInput.parentIdNot)
                && Objects.equals(this.parentIdNotContains, nfsInodeWhereInput.parentIdNotContains)
                && Objects.equals(this.parentIdNotEndsWith, nfsInodeWhereInput.parentIdNotEndsWith)
                && Objects.equals(this.parentIdNotIn, nfsInodeWhereInput.parentIdNotIn)
                && Objects.equals(
                        this.parentIdNotStartsWith, nfsInodeWhereInput.parentIdNotStartsWith)
                && Objects.equals(this.parentIdStartsWith, nfsInodeWhereInput.parentIdStartsWith)
                && Objects.equals(this.prioritized, nfsInodeWhereInput.prioritized)
                && Objects.equals(this.prioritizedNot, nfsInodeWhereInput.prioritizedNot)
                && Objects.equals(this.resiliencyType, nfsInodeWhereInput.resiliencyType)
                && Objects.equals(this.resiliencyTypeIn, nfsInodeWhereInput.resiliencyTypeIn)
                && Objects.equals(this.resiliencyTypeNot, nfsInodeWhereInput.resiliencyTypeNot)
                && Objects.equals(this.resiliencyTypeNotIn, nfsInodeWhereInput.resiliencyTypeNotIn)
                && Objects.equals(this.sharedSize, nfsInodeWhereInput.sharedSize)
                && Objects.equals(this.sharedSizeGt, nfsInodeWhereInput.sharedSizeGt)
                && Objects.equals(this.sharedSizeGte, nfsInodeWhereInput.sharedSizeGte)
                && Objects.equals(this.sharedSizeIn, nfsInodeWhereInput.sharedSizeIn)
                && Objects.equals(this.sharedSizeLt, nfsInodeWhereInput.sharedSizeLt)
                && Objects.equals(this.sharedSizeLte, nfsInodeWhereInput.sharedSizeLte)
                && Objects.equals(this.sharedSizeNot, nfsInodeWhereInput.sharedSizeNot)
                && Objects.equals(this.sharedSizeNotIn, nfsInodeWhereInput.sharedSizeNotIn)
                && Objects.equals(this.snapshotNum, nfsInodeWhereInput.snapshotNum)
                && Objects.equals(this.snapshotNumGt, nfsInodeWhereInput.snapshotNumGt)
                && Objects.equals(this.snapshotNumGte, nfsInodeWhereInput.snapshotNumGte)
                && Objects.equals(this.snapshotNumIn, nfsInodeWhereInput.snapshotNumIn)
                && Objects.equals(this.snapshotNumLt, nfsInodeWhereInput.snapshotNumLt)
                && Objects.equals(this.snapshotNumLte, nfsInodeWhereInput.snapshotNumLte)
                && Objects.equals(this.snapshotNumNot, nfsInodeWhereInput.snapshotNumNot)
                && Objects.equals(this.snapshotNumNotIn, nfsInodeWhereInput.snapshotNumNotIn)
                && Objects.equals(this.uniqueLogicalSize, nfsInodeWhereInput.uniqueLogicalSize)
                && Objects.equals(this.uniqueLogicalSizeGt, nfsInodeWhereInput.uniqueLogicalSizeGt)
                && Objects.equals(
                        this.uniqueLogicalSizeGte, nfsInodeWhereInput.uniqueLogicalSizeGte)
                && Objects.equals(this.uniqueLogicalSizeIn, nfsInodeWhereInput.uniqueLogicalSizeIn)
                && Objects.equals(this.uniqueLogicalSizeLt, nfsInodeWhereInput.uniqueLogicalSizeLt)
                && Objects.equals(
                        this.uniqueLogicalSizeLte, nfsInodeWhereInput.uniqueLogicalSizeLte)
                && Objects.equals(
                        this.uniqueLogicalSizeNot, nfsInodeWhereInput.uniqueLogicalSizeNot)
                && Objects.equals(
                        this.uniqueLogicalSizeNotIn, nfsInodeWhereInput.uniqueLogicalSizeNotIn)
                && Objects.equals(this.uniqueSize, nfsInodeWhereInput.uniqueSize)
                && Objects.equals(this.uniqueSizeGt, nfsInodeWhereInput.uniqueSizeGt)
                && Objects.equals(this.uniqueSizeGte, nfsInodeWhereInput.uniqueSizeGte)
                && Objects.equals(this.uniqueSizeIn, nfsInodeWhereInput.uniqueSizeIn)
                && Objects.equals(this.uniqueSizeLt, nfsInodeWhereInput.uniqueSizeLt)
                && Objects.equals(this.uniqueSizeLte, nfsInodeWhereInput.uniqueSizeLte)
                && Objects.equals(this.uniqueSizeNot, nfsInodeWhereInput.uniqueSizeNot)
                && Objects.equals(this.uniqueSizeNotIn, nfsInodeWhereInput.uniqueSizeNotIn);
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
                assignedSize,
                assignedSizeGt,
                assignedSizeGte,
                assignedSizeIn,
                assignedSizeLt,
                assignedSizeLte,
                assignedSizeNot,
                assignedSizeNotIn,
                downgradedPrioritizedSpace,
                downgradedPrioritizedSpaceGt,
                downgradedPrioritizedSpaceGte,
                downgradedPrioritizedSpaceIn,
                downgradedPrioritizedSpaceLt,
                downgradedPrioritizedSpaceLte,
                downgradedPrioritizedSpaceNot,
                downgradedPrioritizedSpaceNotIn,
                ecK,
                ecKGt,
                ecKGte,
                ecKIn,
                ecKLt,
                ecKLte,
                ecKNot,
                ecKNotIn,
                ecM,
                ecMGt,
                ecMGte,
                ecMIn,
                ecMLt,
                ecMLte,
                ecMNot,
                ecMNotIn,
                encryptMethod,
                encryptMethodIn,
                encryptMethodNot,
                encryptMethodNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                _file,
                fileNot,
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
                localUpdatedAt,
                localUpdatedAtGt,
                localUpdatedAtGte,
                localUpdatedAtIn,
                localUpdatedAtLt,
                localUpdatedAtLte,
                localUpdatedAtNot,
                localUpdatedAtNotIn,
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
                nfsExport,
                parentId,
                parentIdContains,
                parentIdEndsWith,
                parentIdGt,
                parentIdGte,
                parentIdIn,
                parentIdLt,
                parentIdLte,
                parentIdNot,
                parentIdNotContains,
                parentIdNotEndsWith,
                parentIdNotIn,
                parentIdNotStartsWith,
                parentIdStartsWith,
                prioritized,
                prioritizedNot,
                resiliencyType,
                resiliencyTypeIn,
                resiliencyTypeNot,
                resiliencyTypeNotIn,
                sharedSize,
                sharedSizeGt,
                sharedSizeGte,
                sharedSizeIn,
                sharedSizeLt,
                sharedSizeLte,
                sharedSizeNot,
                sharedSizeNotIn,
                snapshotNum,
                snapshotNumGt,
                snapshotNumGte,
                snapshotNumIn,
                snapshotNumLt,
                snapshotNumLte,
                snapshotNumNot,
                snapshotNumNotIn,
                uniqueLogicalSize,
                uniqueLogicalSizeGt,
                uniqueLogicalSizeGte,
                uniqueLogicalSizeIn,
                uniqueLogicalSizeLt,
                uniqueLogicalSizeLte,
                uniqueLogicalSizeNot,
                uniqueLogicalSizeNotIn,
                uniqueSize,
                uniqueSizeGt,
                uniqueSizeGte,
                uniqueSizeIn,
                uniqueSizeLt,
                uniqueSizeLte,
                uniqueSizeNot,
                uniqueSizeNotIn);
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
        sb.append("class NfsInodeWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
        sb.append("    assignedSizeGt: ").append(toIndentedString(assignedSizeGt)).append("\n");
        sb.append("    assignedSizeGte: ").append(toIndentedString(assignedSizeGte)).append("\n");
        sb.append("    assignedSizeIn: ").append(toIndentedString(assignedSizeIn)).append("\n");
        sb.append("    assignedSizeLt: ").append(toIndentedString(assignedSizeLt)).append("\n");
        sb.append("    assignedSizeLte: ").append(toIndentedString(assignedSizeLte)).append("\n");
        sb.append("    assignedSizeNot: ").append(toIndentedString(assignedSizeNot)).append("\n");
        sb.append("    assignedSizeNotIn: ")
                .append(toIndentedString(assignedSizeNotIn))
                .append("\n");
        sb.append("    downgradedPrioritizedSpace: ")
                .append(toIndentedString(downgradedPrioritizedSpace))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceGt: ")
                .append(toIndentedString(downgradedPrioritizedSpaceGt))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceGte: ")
                .append(toIndentedString(downgradedPrioritizedSpaceGte))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceIn: ")
                .append(toIndentedString(downgradedPrioritizedSpaceIn))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceLt: ")
                .append(toIndentedString(downgradedPrioritizedSpaceLt))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceLte: ")
                .append(toIndentedString(downgradedPrioritizedSpaceLte))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceNot: ")
                .append(toIndentedString(downgradedPrioritizedSpaceNot))
                .append("\n");
        sb.append("    downgradedPrioritizedSpaceNotIn: ")
                .append(toIndentedString(downgradedPrioritizedSpaceNotIn))
                .append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecKGt: ").append(toIndentedString(ecKGt)).append("\n");
        sb.append("    ecKGte: ").append(toIndentedString(ecKGte)).append("\n");
        sb.append("    ecKIn: ").append(toIndentedString(ecKIn)).append("\n");
        sb.append("    ecKLt: ").append(toIndentedString(ecKLt)).append("\n");
        sb.append("    ecKLte: ").append(toIndentedString(ecKLte)).append("\n");
        sb.append("    ecKNot: ").append(toIndentedString(ecKNot)).append("\n");
        sb.append("    ecKNotIn: ").append(toIndentedString(ecKNotIn)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    ecMGt: ").append(toIndentedString(ecMGt)).append("\n");
        sb.append("    ecMGte: ").append(toIndentedString(ecMGte)).append("\n");
        sb.append("    ecMIn: ").append(toIndentedString(ecMIn)).append("\n");
        sb.append("    ecMLt: ").append(toIndentedString(ecMLt)).append("\n");
        sb.append("    ecMLte: ").append(toIndentedString(ecMLte)).append("\n");
        sb.append("    ecMNot: ").append(toIndentedString(ecMNot)).append("\n");
        sb.append("    ecMNotIn: ").append(toIndentedString(ecMNotIn)).append("\n");
        sb.append("    encryptMethod: ").append(toIndentedString(encryptMethod)).append("\n");
        sb.append("    encryptMethodIn: ").append(toIndentedString(encryptMethodIn)).append("\n");
        sb.append("    encryptMethodNot: ").append(toIndentedString(encryptMethodNot)).append("\n");
        sb.append("    encryptMethodNotIn: ")
                .append(toIndentedString(encryptMethodNotIn))
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
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
        sb.append("    fileNot: ").append(toIndentedString(fileNot)).append("\n");
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
        sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
        sb.append("    localUpdatedAtGt: ").append(toIndentedString(localUpdatedAtGt)).append("\n");
        sb.append("    localUpdatedAtGte: ")
                .append(toIndentedString(localUpdatedAtGte))
                .append("\n");
        sb.append("    localUpdatedAtIn: ").append(toIndentedString(localUpdatedAtIn)).append("\n");
        sb.append("    localUpdatedAtLt: ").append(toIndentedString(localUpdatedAtLt)).append("\n");
        sb.append("    localUpdatedAtLte: ")
                .append(toIndentedString(localUpdatedAtLte))
                .append("\n");
        sb.append("    localUpdatedAtNot: ")
                .append(toIndentedString(localUpdatedAtNot))
                .append("\n");
        sb.append("    localUpdatedAtNotIn: ")
                .append(toIndentedString(localUpdatedAtNotIn))
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
        sb.append("    nfsExport: ").append(toIndentedString(nfsExport)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    parentIdContains: ").append(toIndentedString(parentIdContains)).append("\n");
        sb.append("    parentIdEndsWith: ").append(toIndentedString(parentIdEndsWith)).append("\n");
        sb.append("    parentIdGt: ").append(toIndentedString(parentIdGt)).append("\n");
        sb.append("    parentIdGte: ").append(toIndentedString(parentIdGte)).append("\n");
        sb.append("    parentIdIn: ").append(toIndentedString(parentIdIn)).append("\n");
        sb.append("    parentIdLt: ").append(toIndentedString(parentIdLt)).append("\n");
        sb.append("    parentIdLte: ").append(toIndentedString(parentIdLte)).append("\n");
        sb.append("    parentIdNot: ").append(toIndentedString(parentIdNot)).append("\n");
        sb.append("    parentIdNotContains: ")
                .append(toIndentedString(parentIdNotContains))
                .append("\n");
        sb.append("    parentIdNotEndsWith: ")
                .append(toIndentedString(parentIdNotEndsWith))
                .append("\n");
        sb.append("    parentIdNotIn: ").append(toIndentedString(parentIdNotIn)).append("\n");
        sb.append("    parentIdNotStartsWith: ")
                .append(toIndentedString(parentIdNotStartsWith))
                .append("\n");
        sb.append("    parentIdStartsWith: ")
                .append(toIndentedString(parentIdStartsWith))
                .append("\n");
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    prioritizedNot: ").append(toIndentedString(prioritizedNot)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    resiliencyTypeIn: ").append(toIndentedString(resiliencyTypeIn)).append("\n");
        sb.append("    resiliencyTypeNot: ")
                .append(toIndentedString(resiliencyTypeNot))
                .append("\n");
        sb.append("    resiliencyTypeNotIn: ")
                .append(toIndentedString(resiliencyTypeNotIn))
                .append("\n");
        sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
        sb.append("    sharedSizeGt: ").append(toIndentedString(sharedSizeGt)).append("\n");
        sb.append("    sharedSizeGte: ").append(toIndentedString(sharedSizeGte)).append("\n");
        sb.append("    sharedSizeIn: ").append(toIndentedString(sharedSizeIn)).append("\n");
        sb.append("    sharedSizeLt: ").append(toIndentedString(sharedSizeLt)).append("\n");
        sb.append("    sharedSizeLte: ").append(toIndentedString(sharedSizeLte)).append("\n");
        sb.append("    sharedSizeNot: ").append(toIndentedString(sharedSizeNot)).append("\n");
        sb.append("    sharedSizeNotIn: ").append(toIndentedString(sharedSizeNotIn)).append("\n");
        sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
        sb.append("    snapshotNumGt: ").append(toIndentedString(snapshotNumGt)).append("\n");
        sb.append("    snapshotNumGte: ").append(toIndentedString(snapshotNumGte)).append("\n");
        sb.append("    snapshotNumIn: ").append(toIndentedString(snapshotNumIn)).append("\n");
        sb.append("    snapshotNumLt: ").append(toIndentedString(snapshotNumLt)).append("\n");
        sb.append("    snapshotNumLte: ").append(toIndentedString(snapshotNumLte)).append("\n");
        sb.append("    snapshotNumNot: ").append(toIndentedString(snapshotNumNot)).append("\n");
        sb.append("    snapshotNumNotIn: ").append(toIndentedString(snapshotNumNotIn)).append("\n");
        sb.append("    uniqueLogicalSize: ")
                .append(toIndentedString(uniqueLogicalSize))
                .append("\n");
        sb.append("    uniqueLogicalSizeGt: ")
                .append(toIndentedString(uniqueLogicalSizeGt))
                .append("\n");
        sb.append("    uniqueLogicalSizeGte: ")
                .append(toIndentedString(uniqueLogicalSizeGte))
                .append("\n");
        sb.append("    uniqueLogicalSizeIn: ")
                .append(toIndentedString(uniqueLogicalSizeIn))
                .append("\n");
        sb.append("    uniqueLogicalSizeLt: ")
                .append(toIndentedString(uniqueLogicalSizeLt))
                .append("\n");
        sb.append("    uniqueLogicalSizeLte: ")
                .append(toIndentedString(uniqueLogicalSizeLte))
                .append("\n");
        sb.append("    uniqueLogicalSizeNot: ")
                .append(toIndentedString(uniqueLogicalSizeNot))
                .append("\n");
        sb.append("    uniqueLogicalSizeNotIn: ")
                .append(toIndentedString(uniqueLogicalSizeNotIn))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    uniqueSizeGt: ").append(toIndentedString(uniqueSizeGt)).append("\n");
        sb.append("    uniqueSizeGte: ").append(toIndentedString(uniqueSizeGte)).append("\n");
        sb.append("    uniqueSizeIn: ").append(toIndentedString(uniqueSizeIn)).append("\n");
        sb.append("    uniqueSizeLt: ").append(toIndentedString(uniqueSizeLt)).append("\n");
        sb.append("    uniqueSizeLte: ").append(toIndentedString(uniqueSizeLte)).append("\n");
        sb.append("    uniqueSizeNot: ").append(toIndentedString(uniqueSizeNot)).append("\n");
        sb.append("    uniqueSizeNotIn: ").append(toIndentedString(uniqueSizeNotIn)).append("\n");
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

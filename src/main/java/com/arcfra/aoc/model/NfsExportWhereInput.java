package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NfsExportWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NfsExportWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<NfsExportWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<NfsExportWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<NfsExportWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

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

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID = "export_inode_id";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID)
    private String exportInodeId;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS =
            "export_inode_id_contains";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS)
    private String exportInodeIdContains;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH =
            "export_inode_id_ends_with";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH)
    private String exportInodeIdEndsWith;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_GT = "export_inode_id_gt";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_GT)
    private String exportInodeIdGt;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_GTE = "export_inode_id_gte";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_GTE)
    private String exportInodeIdGte;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_IN = "export_inode_id_in";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_IN)
    private List<String> exportInodeIdIn = null;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_LT = "export_inode_id_lt";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_LT)
    private String exportInodeIdLt;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_LTE = "export_inode_id_lte";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_LTE)
    private String exportInodeIdLte;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT = "export_inode_id_not";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT)
    private String exportInodeIdNot;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS =
            "export_inode_id_not_contains";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS)
    private String exportInodeIdNotContains;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH =
            "export_inode_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH)
    private String exportInodeIdNotEndsWith;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN = "export_inode_id_not_in";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN)
    private List<String> exportInodeIdNotIn = null;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH =
            "export_inode_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH)
    private String exportInodeIdNotStartsWith;

    public static final String SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH =
            "export_inode_id_starts_with";

    @SerializedName(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH)
    private String exportInodeIdStartsWith;

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

    public static final String SERIALIZED_NAME_INODES_EVERY = "inodes_every";

    @SerializedName(SERIALIZED_NAME_INODES_EVERY)
    private NfsInodeWhereInput inodesEvery;

    public static final String SERIALIZED_NAME_INODES_NONE = "inodes_none";

    @SerializedName(SERIALIZED_NAME_INODES_NONE)
    private NfsInodeWhereInput inodesNone;

    public static final String SERIALIZED_NAME_INODES_SOME = "inodes_some";

    @SerializedName(SERIALIZED_NAME_INODES_SOME)
    private NfsInodeWhereInput inodesSome;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

    public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
    private String ipWhitelist;

    public static final String SERIALIZED_NAME_IP_WHITELIST_CONTAINS = "ip_whitelist_contains";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_CONTAINS)
    private String ipWhitelistContains;

    public static final String SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH = "ip_whitelist_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH)
    private String ipWhitelistEndsWith;

    public static final String SERIALIZED_NAME_IP_WHITELIST_GT = "ip_whitelist_gt";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GT)
    private String ipWhitelistGt;

    public static final String SERIALIZED_NAME_IP_WHITELIST_GTE = "ip_whitelist_gte";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GTE)
    private String ipWhitelistGte;

    public static final String SERIALIZED_NAME_IP_WHITELIST_IN = "ip_whitelist_in";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_IN)
    private List<String> ipWhitelistIn = null;

    public static final String SERIALIZED_NAME_IP_WHITELIST_LT = "ip_whitelist_lt";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LT)
    private String ipWhitelistLt;

    public static final String SERIALIZED_NAME_IP_WHITELIST_LTE = "ip_whitelist_lte";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LTE)
    private String ipWhitelistLte;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT = "ip_whitelist_not";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT)
    private String ipWhitelistNot;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS =
            "ip_whitelist_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS)
    private String ipWhitelistNotContains;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH =
            "ip_whitelist_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH)
    private String ipWhitelistNotEndsWith;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_IN = "ip_whitelist_not_in";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_IN)
    private List<String> ipWhitelistNotIn = null;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH =
            "ip_whitelist_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH)
    private String ipWhitelistNotStartsWith;

    public static final String SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH =
            "ip_whitelist_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH)
    private String ipWhitelistStartsWith;

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

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_PRIORITIZED_NOT = "prioritized_not";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED_NOT)
    private Boolean prioritizedNot;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_REPLICA_NUM_GT = "replica_num_gt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GT)
    private Integer replicaNumGt;

    public static final String SERIALIZED_NAME_REPLICA_NUM_GTE = "replica_num_gte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GTE)
    private Integer replicaNumGte;

    public static final String SERIALIZED_NAME_REPLICA_NUM_IN = "replica_num_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_IN)
    private List<Integer> replicaNumIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NUM_LT = "replica_num_lt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LT)
    private Integer replicaNumLt;

    public static final String SERIALIZED_NAME_REPLICA_NUM_LTE = "replica_num_lte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LTE)
    private Integer replicaNumLte;

    public static final String SERIALIZED_NAME_REPLICA_NUM_NOT = "replica_num_not";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT)
    private Integer replicaNumNot;

    public static final String SERIALIZED_NAME_REPLICA_NUM_NOT_IN = "replica_num_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT_IN)
    private List<Integer> replicaNumNotIn = null;

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

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_THIN_PROVISION_NOT = "thin_provision_not";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION_NOT)
    private Boolean thinProvisionNot;

    public NfsExportWhereInput() {}

    public NfsExportWhereInput AND(List<NfsExportWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public NfsExportWhereInput addANDItem(NfsExportWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<NfsExportWhereInput>();
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
    public List<NfsExportWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<NfsExportWhereInput> AND) {
        this.AND = AND;
    }

    public NfsExportWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public NfsExportWhereInput AND_ExplictlyNonNull() {
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

    public NfsExportWhereInput NOT(List<NfsExportWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public NfsExportWhereInput addNOTItem(NfsExportWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<NfsExportWhereInput>();
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
    public List<NfsExportWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<NfsExportWhereInput> NOT) {
        this.NOT = NOT;
    }

    public NfsExportWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public NfsExportWhereInput NOT_ExplictlyNonNull() {
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

    public NfsExportWhereInput OR(List<NfsExportWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public NfsExportWhereInput addORItem(NfsExportWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<NfsExportWhereInput>();
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
    public List<NfsExportWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<NfsExportWhereInput> OR) {
        this.OR = OR;
    }

    public NfsExportWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public NfsExportWhereInput OR_ExplictlyNonNull() {
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

    public NfsExportWhereInput cluster(ClusterWhereInput cluster) {

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

    public NfsExportWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public NfsExportWhereInput cluster_ExplictlyNonNull() {
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

    public NfsExportWhereInput description(String description) {

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

    public NfsExportWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public NfsExportWhereInput description_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionContains(String descriptionContains) {

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

    public NfsExportWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public NfsExportWhereInput descriptionContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public NfsExportWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionGt(String descriptionGt) {

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

    public NfsExportWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public NfsExportWhereInput descriptionGt_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionGte(String descriptionGte) {

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

    public NfsExportWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public NfsExportWhereInput descriptionGte_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public NfsExportWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public NfsExportWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public NfsExportWhereInput descriptionIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionLt(String descriptionLt) {

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

    public NfsExportWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public NfsExportWhereInput descriptionLt_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionLte(String descriptionLte) {

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

    public NfsExportWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public NfsExportWhereInput descriptionLte_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionNot(String descriptionNot) {

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

    public NfsExportWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public NfsExportWhereInput descriptionNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public NfsExportWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public NfsExportWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public NfsExportWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public NfsExportWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public NfsExportWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public NfsExportWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public NfsExportWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public NfsExportWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecK(Integer ecK) {

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

    public NfsExportWhereInput ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NfsExportWhereInput ecK_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKGt(Integer ecKGt) {

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

    public NfsExportWhereInput ecKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public NfsExportWhereInput ecKGt_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKGte(Integer ecKGte) {

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

    public NfsExportWhereInput ecKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public NfsExportWhereInput ecKGte_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKIn(List<Integer> ecKIn) {

        this.ecKIn = ecKIn;
        return this;
    }

    public NfsExportWhereInput addEcKInItem(Integer ecKInItem) {
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

    public NfsExportWhereInput ecKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public NfsExportWhereInput ecKIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKLt(Integer ecKLt) {

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

    public NfsExportWhereInput ecKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public NfsExportWhereInput ecKLt_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKLte(Integer ecKLte) {

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

    public NfsExportWhereInput ecKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public NfsExportWhereInput ecKLte_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKNot(Integer ecKNot) {

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

    public NfsExportWhereInput ecKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public NfsExportWhereInput ecKNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecKNotIn(List<Integer> ecKNotIn) {

        this.ecKNotIn = ecKNotIn;
        return this;
    }

    public NfsExportWhereInput addEcKNotInItem(Integer ecKNotInItem) {
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

    public NfsExportWhereInput ecKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public NfsExportWhereInput ecKNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecM(Integer ecM) {

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

    public NfsExportWhereInput ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NfsExportWhereInput ecM_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMGt(Integer ecMGt) {

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

    public NfsExportWhereInput ecMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public NfsExportWhereInput ecMGt_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMGte(Integer ecMGte) {

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

    public NfsExportWhereInput ecMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public NfsExportWhereInput ecMGte_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMIn(List<Integer> ecMIn) {

        this.ecMIn = ecMIn;
        return this;
    }

    public NfsExportWhereInput addEcMInItem(Integer ecMInItem) {
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

    public NfsExportWhereInput ecMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public NfsExportWhereInput ecMIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMLt(Integer ecMLt) {

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

    public NfsExportWhereInput ecMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public NfsExportWhereInput ecMLt_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMLte(Integer ecMLte) {

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

    public NfsExportWhereInput ecMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public NfsExportWhereInput ecMLte_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMNot(Integer ecMNot) {

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

    public NfsExportWhereInput ecMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public NfsExportWhereInput ecMNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput ecMNotIn(List<Integer> ecMNotIn) {

        this.ecMNotIn = ecMNotIn;
        return this;
    }

    public NfsExportWhereInput addEcMNotInItem(Integer ecMNotInItem) {
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

    public NfsExportWhereInput ecMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public NfsExportWhereInput ecMNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput encryptMethod(EncryptMethod encryptMethod) {

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

    public NfsExportWhereInput encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NfsExportWhereInput encryptMethod_ExplictlyNonNull() {
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

    public NfsExportWhereInput encryptMethodIn(List<EncryptMethod> encryptMethodIn) {

        this.encryptMethodIn = encryptMethodIn;
        return this;
    }

    public NfsExportWhereInput addEncryptMethodInItem(EncryptMethod encryptMethodInItem) {
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

    public NfsExportWhereInput encryptMethodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
        return this;
    }

    public NfsExportWhereInput encryptMethodIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput encryptMethodNot(EncryptMethod encryptMethodNot) {

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

    public NfsExportWhereInput encryptMethodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
        return this;
    }

    public NfsExportWhereInput encryptMethodNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput encryptMethodNotIn(List<EncryptMethod> encryptMethodNotIn) {

        this.encryptMethodNotIn = encryptMethodNotIn;
        return this;
    }

    public NfsExportWhereInput addEncryptMethodNotInItem(EncryptMethod encryptMethodNotInItem) {
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

    public NfsExportWhereInput encryptMethodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
        return this;
    }

    public NfsExportWhereInput encryptMethodNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NfsExportWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NfsExportWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public NfsExportWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public NfsExportWhereInput addEntityAsyncStatusInItem(
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

    public NfsExportWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public NfsExportWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public NfsExportWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public NfsExportWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public NfsExportWhereInput addEntityAsyncStatusNotInItem(
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

    public NfsExportWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public NfsExportWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput exportInodeId(String exportInodeId) {

        this.exportInodeId = exportInodeId;
        return this;
    }

    /**
     * Get exportInodeId
     *
     * @return exportInodeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeId() {
        return exportInodeId;
    }

    public void setExportInodeId(String exportInodeId) {
        this.exportInodeId = exportInodeId;
    }

    public NfsExportWhereInput exportInodeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID);
        return this;
    }

    public NfsExportWhereInput exportInodeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID);
        return this;
    }

    public void setExportInodeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID);
        }
    }

    public boolean getExportInodeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID);
    }

    public NfsExportWhereInput exportInodeIdContains(String exportInodeIdContains) {

        this.exportInodeIdContains = exportInodeIdContains;
        return this;
    }

    /**
     * Get exportInodeIdContains
     *
     * @return exportInodeIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdContains() {
        return exportInodeIdContains;
    }

    public void setExportInodeIdContains(String exportInodeIdContains) {
        this.exportInodeIdContains = exportInodeIdContains;
    }

    public NfsExportWhereInput exportInodeIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS);
        return this;
    }

    public NfsExportWhereInput exportInodeIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS);
        return this;
    }

    public void setExportInodeIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS);
        }
    }

    public boolean getExportInodeIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_CONTAINS);
    }

    public NfsExportWhereInput exportInodeIdEndsWith(String exportInodeIdEndsWith) {

        this.exportInodeIdEndsWith = exportInodeIdEndsWith;
        return this;
    }

    /**
     * Get exportInodeIdEndsWith
     *
     * @return exportInodeIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdEndsWith() {
        return exportInodeIdEndsWith;
    }

    public void setExportInodeIdEndsWith(String exportInodeIdEndsWith) {
        this.exportInodeIdEndsWith = exportInodeIdEndsWith;
    }

    public NfsExportWhereInput exportInodeIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput exportInodeIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH);
        return this;
    }

    public void setExportInodeIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH);
        }
    }

    public boolean getExportInodeIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_ENDS_WITH);
    }

    public NfsExportWhereInput exportInodeIdGt(String exportInodeIdGt) {

        this.exportInodeIdGt = exportInodeIdGt;
        return this;
    }

    /**
     * Get exportInodeIdGt
     *
     * @return exportInodeIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdGt() {
        return exportInodeIdGt;
    }

    public void setExportInodeIdGt(String exportInodeIdGt) {
        this.exportInodeIdGt = exportInodeIdGt;
    }

    public NfsExportWhereInput exportInodeIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_GT);
        return this;
    }

    public NfsExportWhereInput exportInodeIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_GT);
        return this;
    }

    public void setExportInodeIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_GT);
        }
    }

    public boolean getExportInodeIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_GT);
    }

    public NfsExportWhereInput exportInodeIdGte(String exportInodeIdGte) {

        this.exportInodeIdGte = exportInodeIdGte;
        return this;
    }

    /**
     * Get exportInodeIdGte
     *
     * @return exportInodeIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdGte() {
        return exportInodeIdGte;
    }

    public void setExportInodeIdGte(String exportInodeIdGte) {
        this.exportInodeIdGte = exportInodeIdGte;
    }

    public NfsExportWhereInput exportInodeIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_GTE);
        return this;
    }

    public NfsExportWhereInput exportInodeIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_GTE);
        return this;
    }

    public void setExportInodeIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_GTE);
        }
    }

    public boolean getExportInodeIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_GTE);
    }

    public NfsExportWhereInput exportInodeIdIn(List<String> exportInodeIdIn) {

        this.exportInodeIdIn = exportInodeIdIn;
        return this;
    }

    public NfsExportWhereInput addExportInodeIdInItem(String exportInodeIdInItem) {
        if (this.exportInodeIdIn == null) {
            this.exportInodeIdIn = new ArrayList<String>();
        }
        this.exportInodeIdIn.add(exportInodeIdInItem);
        return this;
    }

    /**
     * Get exportInodeIdIn
     *
     * @return exportInodeIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExportInodeIdIn() {
        return exportInodeIdIn;
    }

    public void setExportInodeIdIn(List<String> exportInodeIdIn) {
        this.exportInodeIdIn = exportInodeIdIn;
    }

    public NfsExportWhereInput exportInodeIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_IN);
        return this;
    }

    public NfsExportWhereInput exportInodeIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_IN);
        return this;
    }

    public void setExportInodeIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_IN);
        }
    }

    public boolean getExportInodeIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_IN);
    }

    public NfsExportWhereInput exportInodeIdLt(String exportInodeIdLt) {

        this.exportInodeIdLt = exportInodeIdLt;
        return this;
    }

    /**
     * Get exportInodeIdLt
     *
     * @return exportInodeIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdLt() {
        return exportInodeIdLt;
    }

    public void setExportInodeIdLt(String exportInodeIdLt) {
        this.exportInodeIdLt = exportInodeIdLt;
    }

    public NfsExportWhereInput exportInodeIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_LT);
        return this;
    }

    public NfsExportWhereInput exportInodeIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_LT);
        return this;
    }

    public void setExportInodeIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_LT);
        }
    }

    public boolean getExportInodeIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_LT);
    }

    public NfsExportWhereInput exportInodeIdLte(String exportInodeIdLte) {

        this.exportInodeIdLte = exportInodeIdLte;
        return this;
    }

    /**
     * Get exportInodeIdLte
     *
     * @return exportInodeIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdLte() {
        return exportInodeIdLte;
    }

    public void setExportInodeIdLte(String exportInodeIdLte) {
        this.exportInodeIdLte = exportInodeIdLte;
    }

    public NfsExportWhereInput exportInodeIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_LTE);
        return this;
    }

    public NfsExportWhereInput exportInodeIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_LTE);
        return this;
    }

    public void setExportInodeIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_LTE);
        }
    }

    public boolean getExportInodeIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_LTE);
    }

    public NfsExportWhereInput exportInodeIdNot(String exportInodeIdNot) {

        this.exportInodeIdNot = exportInodeIdNot;
        return this;
    }

    /**
     * Get exportInodeIdNot
     *
     * @return exportInodeIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdNot() {
        return exportInodeIdNot;
    }

    public void setExportInodeIdNot(String exportInodeIdNot) {
        this.exportInodeIdNot = exportInodeIdNot;
    }

    public NfsExportWhereInput exportInodeIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT);
        return this;
    }

    public NfsExportWhereInput exportInodeIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT);
        return this;
    }

    public void setExportInodeIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT);
        }
    }

    public boolean getExportInodeIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_NOT);
    }

    public NfsExportWhereInput exportInodeIdNotContains(String exportInodeIdNotContains) {

        this.exportInodeIdNotContains = exportInodeIdNotContains;
        return this;
    }

    /**
     * Get exportInodeIdNotContains
     *
     * @return exportInodeIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdNotContains() {
        return exportInodeIdNotContains;
    }

    public void setExportInodeIdNotContains(String exportInodeIdNotContains) {
        this.exportInodeIdNotContains = exportInodeIdNotContains;
    }

    public NfsExportWhereInput exportInodeIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS);
        return this;
    }

    public NfsExportWhereInput exportInodeIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS);
        return this;
    }

    public void setExportInodeIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS);
        }
    }

    public boolean getExportInodeIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_CONTAINS);
    }

    public NfsExportWhereInput exportInodeIdNotEndsWith(String exportInodeIdNotEndsWith) {

        this.exportInodeIdNotEndsWith = exportInodeIdNotEndsWith;
        return this;
    }

    /**
     * Get exportInodeIdNotEndsWith
     *
     * @return exportInodeIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdNotEndsWith() {
        return exportInodeIdNotEndsWith;
    }

    public void setExportInodeIdNotEndsWith(String exportInodeIdNotEndsWith) {
        this.exportInodeIdNotEndsWith = exportInodeIdNotEndsWith;
    }

    public NfsExportWhereInput exportInodeIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput exportInodeIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setExportInodeIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getExportInodeIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_ENDS_WITH);
    }

    public NfsExportWhereInput exportInodeIdNotIn(List<String> exportInodeIdNotIn) {

        this.exportInodeIdNotIn = exportInodeIdNotIn;
        return this;
    }

    public NfsExportWhereInput addExportInodeIdNotInItem(String exportInodeIdNotInItem) {
        if (this.exportInodeIdNotIn == null) {
            this.exportInodeIdNotIn = new ArrayList<String>();
        }
        this.exportInodeIdNotIn.add(exportInodeIdNotInItem);
        return this;
    }

    /**
     * Get exportInodeIdNotIn
     *
     * @return exportInodeIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExportInodeIdNotIn() {
        return exportInodeIdNotIn;
    }

    public void setExportInodeIdNotIn(List<String> exportInodeIdNotIn) {
        this.exportInodeIdNotIn = exportInodeIdNotIn;
    }

    public NfsExportWhereInput exportInodeIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN);
        return this;
    }

    public NfsExportWhereInput exportInodeIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN);
        return this;
    }

    public void setExportInodeIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN);
        }
    }

    public boolean getExportInodeIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_IN);
    }

    public NfsExportWhereInput exportInodeIdNotStartsWith(String exportInodeIdNotStartsWith) {

        this.exportInodeIdNotStartsWith = exportInodeIdNotStartsWith;
        return this;
    }

    /**
     * Get exportInodeIdNotStartsWith
     *
     * @return exportInodeIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdNotStartsWith() {
        return exportInodeIdNotStartsWith;
    }

    public void setExportInodeIdNotStartsWith(String exportInodeIdNotStartsWith) {
        this.exportInodeIdNotStartsWith = exportInodeIdNotStartsWith;
    }

    public NfsExportWhereInput exportInodeIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput exportInodeIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setExportInodeIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getExportInodeIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_NOT_STARTS_WITH);
    }

    public NfsExportWhereInput exportInodeIdStartsWith(String exportInodeIdStartsWith) {

        this.exportInodeIdStartsWith = exportInodeIdStartsWith;
        return this;
    }

    /**
     * Get exportInodeIdStartsWith
     *
     * @return exportInodeIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExportInodeIdStartsWith() {
        return exportInodeIdStartsWith;
    }

    public void setExportInodeIdStartsWith(String exportInodeIdStartsWith) {
        this.exportInodeIdStartsWith = exportInodeIdStartsWith;
    }

    public NfsExportWhereInput exportInodeIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput exportInodeIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH);
        return this;
    }

    public void setExportInodeIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH);
        }
    }

    public boolean getExportInodeIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPORT_INODE_ID_STARTS_WITH);
    }

    public NfsExportWhereInput id(String id) {

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

    public NfsExportWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NfsExportWhereInput id_ExplictlyNonNull() {
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

    public NfsExportWhereInput idContains(String idContains) {

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

    public NfsExportWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public NfsExportWhereInput idContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput idEndsWith(String idEndsWith) {

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

    public NfsExportWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput idEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput idGt(String idGt) {

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

    public NfsExportWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public NfsExportWhereInput idGt_ExplictlyNonNull() {
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

    public NfsExportWhereInput idGte(String idGte) {

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

    public NfsExportWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public NfsExportWhereInput idGte_ExplictlyNonNull() {
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

    public NfsExportWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public NfsExportWhereInput addIdInItem(String idInItem) {
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

    public NfsExportWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public NfsExportWhereInput idIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput idLt(String idLt) {

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

    public NfsExportWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public NfsExportWhereInput idLt_ExplictlyNonNull() {
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

    public NfsExportWhereInput idLte(String idLte) {

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

    public NfsExportWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public NfsExportWhereInput idLte_ExplictlyNonNull() {
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

    public NfsExportWhereInput idNot(String idNot) {

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

    public NfsExportWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public NfsExportWhereInput idNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput idNotContains(String idNotContains) {

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

    public NfsExportWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public NfsExportWhereInput idNotContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public NfsExportWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public NfsExportWhereInput addIdNotInItem(String idNotInItem) {
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

    public NfsExportWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public NfsExportWhereInput idNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public NfsExportWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput idStartsWith(String idStartsWith) {

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

    public NfsExportWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput idStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput inodesEvery(NfsInodeWhereInput inodesEvery) {

        this.inodesEvery = inodesEvery;
        return this;
    }

    /**
     * Get inodesEvery
     *
     * @return inodesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getInodesEvery() {
        return inodesEvery;
    }

    public void setInodesEvery(NfsInodeWhereInput inodesEvery) {
        this.inodesEvery = inodesEvery;
    }

    public NfsExportWhereInput inodesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INODES_EVERY);
        return this;
    }

    public NfsExportWhereInput inodesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INODES_EVERY);
        return this;
    }

    public void setInodesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INODES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INODES_EVERY);
        }
    }

    public boolean getInodesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INODES_EVERY);
    }

    public NfsExportWhereInput inodesNone(NfsInodeWhereInput inodesNone) {

        this.inodesNone = inodesNone;
        return this;
    }

    /**
     * Get inodesNone
     *
     * @return inodesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getInodesNone() {
        return inodesNone;
    }

    public void setInodesNone(NfsInodeWhereInput inodesNone) {
        this.inodesNone = inodesNone;
    }

    public NfsExportWhereInput inodesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INODES_NONE);
        return this;
    }

    public NfsExportWhereInput inodesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INODES_NONE);
        return this;
    }

    public void setInodesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INODES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INODES_NONE);
        }
    }

    public boolean getInodesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INODES_NONE);
    }

    public NfsExportWhereInput inodesSome(NfsInodeWhereInput inodesSome) {

        this.inodesSome = inodesSome;
        return this;
    }

    /**
     * Get inodesSome
     *
     * @return inodesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getInodesSome() {
        return inodesSome;
    }

    public void setInodesSome(NfsInodeWhereInput inodesSome) {
        this.inodesSome = inodesSome;
    }

    public NfsExportWhereInput inodesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INODES_SOME);
        return this;
    }

    public NfsExportWhereInput inodesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INODES_SOME);
        return this;
    }

    public void setInodesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INODES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INODES_SOME);
        }
    }

    public boolean getInodesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INODES_SOME);
    }

    public NfsExportWhereInput internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public NfsExportWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public NfsExportWhereInput internal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public void setInternal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        }
    }

    public boolean getInternal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL);
    }

    public NfsExportWhereInput internalNot(Boolean internalNot) {

        this.internalNot = internalNot;
        return this;
    }

    /**
     * Get internalNot
     *
     * @return internalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternalNot() {
        return internalNot;
    }

    public void setInternalNot(Boolean internalNot) {
        this.internalNot = internalNot;
    }

    public NfsExportWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public NfsExportWhereInput internalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public void setInternalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        }
    }

    public boolean getInternalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_NOT);
    }

    public NfsExportWhereInput ipWhitelist(String ipWhitelist) {

        this.ipWhitelist = ipWhitelist;
        return this;
    }

    /**
     * Get ipWhitelist
     *
     * @return ipWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public NfsExportWhereInput ipWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public NfsExportWhereInput ipWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public void setIpWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST);
        }
    }

    public boolean getIpWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST);
    }

    public NfsExportWhereInput ipWhitelistContains(String ipWhitelistContains) {

        this.ipWhitelistContains = ipWhitelistContains;
        return this;
    }

    /**
     * Get ipWhitelistContains
     *
     * @return ipWhitelistContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistContains() {
        return ipWhitelistContains;
    }

    public void setIpWhitelistContains(String ipWhitelistContains) {
        this.ipWhitelistContains = ipWhitelistContains;
    }

    public NfsExportWhereInput ipWhitelistContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        return this;
    }

    public NfsExportWhereInput ipWhitelistContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        return this;
    }

    public void setIpWhitelistContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        }
    }

    public boolean getIpWhitelistContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
    }

    public NfsExportWhereInput ipWhitelistEndsWith(String ipWhitelistEndsWith) {

        this.ipWhitelistEndsWith = ipWhitelistEndsWith;
        return this;
    }

    /**
     * Get ipWhitelistEndsWith
     *
     * @return ipWhitelistEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistEndsWith() {
        return ipWhitelistEndsWith;
    }

    public void setIpWhitelistEndsWith(String ipWhitelistEndsWith) {
        this.ipWhitelistEndsWith = ipWhitelistEndsWith;
    }

    public NfsExportWhereInput ipWhitelistEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput ipWhitelistEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        return this;
    }

    public void setIpWhitelistEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        }
    }

    public boolean getIpWhitelistEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
    }

    public NfsExportWhereInput ipWhitelistGt(String ipWhitelistGt) {

        this.ipWhitelistGt = ipWhitelistGt;
        return this;
    }

    /**
     * Get ipWhitelistGt
     *
     * @return ipWhitelistGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistGt() {
        return ipWhitelistGt;
    }

    public void setIpWhitelistGt(String ipWhitelistGt) {
        this.ipWhitelistGt = ipWhitelistGt;
    }

    public NfsExportWhereInput ipWhitelistGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GT);
        return this;
    }

    public NfsExportWhereInput ipWhitelistGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GT);
        return this;
    }

    public void setIpWhitelistGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GT);
        }
    }

    public boolean getIpWhitelistGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_GT);
    }

    public NfsExportWhereInput ipWhitelistGte(String ipWhitelistGte) {

        this.ipWhitelistGte = ipWhitelistGte;
        return this;
    }

    /**
     * Get ipWhitelistGte
     *
     * @return ipWhitelistGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistGte() {
        return ipWhitelistGte;
    }

    public void setIpWhitelistGte(String ipWhitelistGte) {
        this.ipWhitelistGte = ipWhitelistGte;
    }

    public NfsExportWhereInput ipWhitelistGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GTE);
        return this;
    }

    public NfsExportWhereInput ipWhitelistGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GTE);
        return this;
    }

    public void setIpWhitelistGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GTE);
        }
    }

    public boolean getIpWhitelistGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_GTE);
    }

    public NfsExportWhereInput ipWhitelistIn(List<String> ipWhitelistIn) {

        this.ipWhitelistIn = ipWhitelistIn;
        return this;
    }

    public NfsExportWhereInput addIpWhitelistInItem(String ipWhitelistInItem) {
        if (this.ipWhitelistIn == null) {
            this.ipWhitelistIn = new ArrayList<String>();
        }
        this.ipWhitelistIn.add(ipWhitelistInItem);
        return this;
    }

    /**
     * Get ipWhitelistIn
     *
     * @return ipWhitelistIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpWhitelistIn() {
        return ipWhitelistIn;
    }

    public void setIpWhitelistIn(List<String> ipWhitelistIn) {
        this.ipWhitelistIn = ipWhitelistIn;
    }

    public NfsExportWhereInput ipWhitelistIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_IN);
        return this;
    }

    public NfsExportWhereInput ipWhitelistIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_IN);
        return this;
    }

    public void setIpWhitelistIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_IN);
        }
    }

    public boolean getIpWhitelistIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_IN);
    }

    public NfsExportWhereInput ipWhitelistLt(String ipWhitelistLt) {

        this.ipWhitelistLt = ipWhitelistLt;
        return this;
    }

    /**
     * Get ipWhitelistLt
     *
     * @return ipWhitelistLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistLt() {
        return ipWhitelistLt;
    }

    public void setIpWhitelistLt(String ipWhitelistLt) {
        this.ipWhitelistLt = ipWhitelistLt;
    }

    public NfsExportWhereInput ipWhitelistLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LT);
        return this;
    }

    public NfsExportWhereInput ipWhitelistLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LT);
        return this;
    }

    public void setIpWhitelistLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LT);
        }
    }

    public boolean getIpWhitelistLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_LT);
    }

    public NfsExportWhereInput ipWhitelistLte(String ipWhitelistLte) {

        this.ipWhitelistLte = ipWhitelistLte;
        return this;
    }

    /**
     * Get ipWhitelistLte
     *
     * @return ipWhitelistLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistLte() {
        return ipWhitelistLte;
    }

    public void setIpWhitelistLte(String ipWhitelistLte) {
        this.ipWhitelistLte = ipWhitelistLte;
    }

    public NfsExportWhereInput ipWhitelistLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LTE);
        return this;
    }

    public NfsExportWhereInput ipWhitelistLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LTE);
        return this;
    }

    public void setIpWhitelistLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LTE);
        }
    }

    public boolean getIpWhitelistLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_LTE);
    }

    public NfsExportWhereInput ipWhitelistNot(String ipWhitelistNot) {

        this.ipWhitelistNot = ipWhitelistNot;
        return this;
    }

    /**
     * Get ipWhitelistNot
     *
     * @return ipWhitelistNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNot() {
        return ipWhitelistNot;
    }

    public void setIpWhitelistNot(String ipWhitelistNot) {
        this.ipWhitelistNot = ipWhitelistNot;
    }

    public NfsExportWhereInput ipWhitelistNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT);
        return this;
    }

    public NfsExportWhereInput ipWhitelistNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT);
        return this;
    }

    public void setIpWhitelistNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT);
        }
    }

    public boolean getIpWhitelistNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT);
    }

    public NfsExportWhereInput ipWhitelistNotContains(String ipWhitelistNotContains) {

        this.ipWhitelistNotContains = ipWhitelistNotContains;
        return this;
    }

    /**
     * Get ipWhitelistNotContains
     *
     * @return ipWhitelistNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNotContains() {
        return ipWhitelistNotContains;
    }

    public void setIpWhitelistNotContains(String ipWhitelistNotContains) {
        this.ipWhitelistNotContains = ipWhitelistNotContains;
    }

    public NfsExportWhereInput ipWhitelistNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public NfsExportWhereInput ipWhitelistNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public void setIpWhitelistNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        }
    }

    public boolean getIpWhitelistNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
    }

    public NfsExportWhereInput ipWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {

        this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
        return this;
    }

    /**
     * Get ipWhitelistNotEndsWith
     *
     * @return ipWhitelistNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNotEndsWith() {
        return ipWhitelistNotEndsWith;
    }

    public void setIpWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {
        this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
    }

    public NfsExportWhereInput ipWhitelistNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput ipWhitelistNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public void setIpWhitelistNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        }
    }

    public boolean getIpWhitelistNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
    }

    public NfsExportWhereInput ipWhitelistNotIn(List<String> ipWhitelistNotIn) {

        this.ipWhitelistNotIn = ipWhitelistNotIn;
        return this;
    }

    public NfsExportWhereInput addIpWhitelistNotInItem(String ipWhitelistNotInItem) {
        if (this.ipWhitelistNotIn == null) {
            this.ipWhitelistNotIn = new ArrayList<String>();
        }
        this.ipWhitelistNotIn.add(ipWhitelistNotInItem);
        return this;
    }

    /**
     * Get ipWhitelistNotIn
     *
     * @return ipWhitelistNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpWhitelistNotIn() {
        return ipWhitelistNotIn;
    }

    public void setIpWhitelistNotIn(List<String> ipWhitelistNotIn) {
        this.ipWhitelistNotIn = ipWhitelistNotIn;
    }

    public NfsExportWhereInput ipWhitelistNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        return this;
    }

    public NfsExportWhereInput ipWhitelistNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        return this;
    }

    public void setIpWhitelistNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        }
    }

    public boolean getIpWhitelistNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
    }

    public NfsExportWhereInput ipWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {

        this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
        return this;
    }

    /**
     * Get ipWhitelistNotStartsWith
     *
     * @return ipWhitelistNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNotStartsWith() {
        return ipWhitelistNotStartsWith;
    }

    public void setIpWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {
        this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
    }

    public NfsExportWhereInput ipWhitelistNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput ipWhitelistNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public void setIpWhitelistNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        }
    }

    public boolean getIpWhitelistNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
    }

    public NfsExportWhereInput ipWhitelistStartsWith(String ipWhitelistStartsWith) {

        this.ipWhitelistStartsWith = ipWhitelistStartsWith;
        return this;
    }

    /**
     * Get ipWhitelistStartsWith
     *
     * @return ipWhitelistStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistStartsWith() {
        return ipWhitelistStartsWith;
    }

    public void setIpWhitelistStartsWith(String ipWhitelistStartsWith) {
        this.ipWhitelistStartsWith = ipWhitelistStartsWith;
    }

    public NfsExportWhereInput ipWhitelistStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput ipWhitelistStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        return this;
    }

    public void setIpWhitelistStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        }
    }

    public boolean getIpWhitelistStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
    }

    public NfsExportWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public NfsExportWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public NfsExportWhereInput labelsEvery_ExplictlyNonNull() {
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

    public NfsExportWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public NfsExportWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public NfsExportWhereInput labelsNone_ExplictlyNonNull() {
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

    public NfsExportWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public NfsExportWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public NfsExportWhereInput labelsSome_ExplictlyNonNull() {
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

    public NfsExportWhereInput localId(String localId) {

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

    public NfsExportWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NfsExportWhereInput localId_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdContains(String localIdContains) {

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

    public NfsExportWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public NfsExportWhereInput localIdContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public NfsExportWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdGt(String localIdGt) {

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

    public NfsExportWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public NfsExportWhereInput localIdGt_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdGte(String localIdGte) {

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

    public NfsExportWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public NfsExportWhereInput localIdGte_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public NfsExportWhereInput addLocalIdInItem(String localIdInItem) {
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

    public NfsExportWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public NfsExportWhereInput localIdIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdLt(String localIdLt) {

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

    public NfsExportWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public NfsExportWhereInput localIdLt_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdLte(String localIdLte) {

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

    public NfsExportWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public NfsExportWhereInput localIdLte_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdNot(String localIdNot) {

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

    public NfsExportWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public NfsExportWhereInput localIdNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdNotContains(String localIdNotContains) {

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

    public NfsExportWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public NfsExportWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public NfsExportWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public NfsExportWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public NfsExportWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public NfsExportWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public NfsExportWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public NfsExportWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput name(String name) {

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

    public NfsExportWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NfsExportWhereInput name_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameContains(String nameContains) {

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

    public NfsExportWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public NfsExportWhereInput nameContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameEndsWith(String nameEndsWith) {

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

    public NfsExportWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameGt(String nameGt) {

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

    public NfsExportWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public NfsExportWhereInput nameGt_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameGte(String nameGte) {

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

    public NfsExportWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public NfsExportWhereInput nameGte_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public NfsExportWhereInput addNameInItem(String nameInItem) {
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

    public NfsExportWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public NfsExportWhereInput nameIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameLt(String nameLt) {

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

    public NfsExportWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public NfsExportWhereInput nameLt_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameLte(String nameLte) {

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

    public NfsExportWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public NfsExportWhereInput nameLte_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameNot(String nameNot) {

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

    public NfsExportWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public NfsExportWhereInput nameNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameNotContains(String nameNotContains) {

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

    public NfsExportWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public NfsExportWhereInput nameNotContains_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public NfsExportWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public NfsExportWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public NfsExportWhereInput addNameNotInItem(String nameNotInItem) {
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

    public NfsExportWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public NfsExportWhereInput nameNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public NfsExportWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput nameStartsWith(String nameStartsWith) {

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

    public NfsExportWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public NfsExportWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public NfsExportWhereInput prioritized(Boolean prioritized) {

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

    public NfsExportWhereInput prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NfsExportWhereInput prioritized_ExplictlyNonNull() {
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

    public NfsExportWhereInput prioritizedNot(Boolean prioritizedNot) {

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

    public NfsExportWhereInput prioritizedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED_NOT);
        return this;
    }

    public NfsExportWhereInput prioritizedNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public NfsExportWhereInput replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NfsExportWhereInput replicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public void setReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        }
    }

    public boolean getReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM);
    }

    public NfsExportWhereInput replicaNumGt(Integer replicaNumGt) {

        this.replicaNumGt = replicaNumGt;
        return this;
    }

    /**
     * Get replicaNumGt
     *
     * @return replicaNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumGt() {
        return replicaNumGt;
    }

    public void setReplicaNumGt(Integer replicaNumGt) {
        this.replicaNumGt = replicaNumGt;
    }

    public NfsExportWhereInput replicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public NfsExportWhereInput replicaNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public void setReplicaNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GT);
        }
    }

    public boolean getReplicaNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_GT);
    }

    public NfsExportWhereInput replicaNumGte(Integer replicaNumGte) {

        this.replicaNumGte = replicaNumGte;
        return this;
    }

    /**
     * Get replicaNumGte
     *
     * @return replicaNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumGte() {
        return replicaNumGte;
    }

    public void setReplicaNumGte(Integer replicaNumGte) {
        this.replicaNumGte = replicaNumGte;
    }

    public NfsExportWhereInput replicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public NfsExportWhereInput replicaNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public void setReplicaNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GTE);
        }
    }

    public boolean getReplicaNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_GTE);
    }

    public NfsExportWhereInput replicaNumIn(List<Integer> replicaNumIn) {

        this.replicaNumIn = replicaNumIn;
        return this;
    }

    public NfsExportWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
        if (this.replicaNumIn == null) {
            this.replicaNumIn = new ArrayList<Integer>();
        }
        this.replicaNumIn.add(replicaNumInItem);
        return this;
    }

    /**
     * Get replicaNumIn
     *
     * @return replicaNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReplicaNumIn() {
        return replicaNumIn;
    }

    public void setReplicaNumIn(List<Integer> replicaNumIn) {
        this.replicaNumIn = replicaNumIn;
    }

    public NfsExportWhereInput replicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public NfsExportWhereInput replicaNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public void setReplicaNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_IN);
        }
    }

    public boolean getReplicaNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_IN);
    }

    public NfsExportWhereInput replicaNumLt(Integer replicaNumLt) {

        this.replicaNumLt = replicaNumLt;
        return this;
    }

    /**
     * Get replicaNumLt
     *
     * @return replicaNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumLt() {
        return replicaNumLt;
    }

    public void setReplicaNumLt(Integer replicaNumLt) {
        this.replicaNumLt = replicaNumLt;
    }

    public NfsExportWhereInput replicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public NfsExportWhereInput replicaNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public void setReplicaNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LT);
        }
    }

    public boolean getReplicaNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_LT);
    }

    public NfsExportWhereInput replicaNumLte(Integer replicaNumLte) {

        this.replicaNumLte = replicaNumLte;
        return this;
    }

    /**
     * Get replicaNumLte
     *
     * @return replicaNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumLte() {
        return replicaNumLte;
    }

    public void setReplicaNumLte(Integer replicaNumLte) {
        this.replicaNumLte = replicaNumLte;
    }

    public NfsExportWhereInput replicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public NfsExportWhereInput replicaNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public void setReplicaNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LTE);
        }
    }

    public boolean getReplicaNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_LTE);
    }

    public NfsExportWhereInput replicaNumNot(Integer replicaNumNot) {

        this.replicaNumNot = replicaNumNot;
        return this;
    }

    /**
     * Get replicaNumNot
     *
     * @return replicaNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumNot() {
        return replicaNumNot;
    }

    public void setReplicaNumNot(Integer replicaNumNot) {
        this.replicaNumNot = replicaNumNot;
    }

    public NfsExportWhereInput replicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public NfsExportWhereInput replicaNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public void setReplicaNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT);
        }
    }

    public boolean getReplicaNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_NOT);
    }

    public NfsExportWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {

        this.replicaNumNotIn = replicaNumNotIn;
        return this;
    }

    public NfsExportWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
        if (this.replicaNumNotIn == null) {
            this.replicaNumNotIn = new ArrayList<Integer>();
        }
        this.replicaNumNotIn.add(replicaNumNotInItem);
        return this;
    }

    /**
     * Get replicaNumNotIn
     *
     * @return replicaNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReplicaNumNotIn() {
        return replicaNumNotIn;
    }

    public void setReplicaNumNotIn(List<Integer> replicaNumNotIn) {
        this.replicaNumNotIn = replicaNumNotIn;
    }

    public NfsExportWhereInput replicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public NfsExportWhereInput replicaNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public void setReplicaNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        }
    }

    public boolean getReplicaNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
    }

    public NfsExportWhereInput resiliencyType(ResiliencyType resiliencyType) {

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

    public NfsExportWhereInput resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NfsExportWhereInput resiliencyType_ExplictlyNonNull() {
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

    public NfsExportWhereInput resiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {

        this.resiliencyTypeIn = resiliencyTypeIn;
        return this;
    }

    public NfsExportWhereInput addResiliencyTypeInItem(ResiliencyType resiliencyTypeInItem) {
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

    public NfsExportWhereInput resiliencyTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public NfsExportWhereInput resiliencyTypeIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput resiliencyTypeNot(ResiliencyType resiliencyTypeNot) {

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

    public NfsExportWhereInput resiliencyTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public NfsExportWhereInput resiliencyTypeNot_ExplictlyNonNull() {
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

    public NfsExportWhereInput resiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {

        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
        return this;
    }

    public NfsExportWhereInput addResiliencyTypeNotInItem(ResiliencyType resiliencyTypeNotInItem) {
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

    public NfsExportWhereInput resiliencyTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public NfsExportWhereInput resiliencyTypeNotIn_ExplictlyNonNull() {
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

    public NfsExportWhereInput thinProvision(Boolean thinProvision) {

        this.thinProvision = thinProvision;
        return this;
    }

    /**
     * Get thinProvision
     *
     * @return thinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvision() {
        return thinProvision;
    }

    public void setThinProvision(Boolean thinProvision) {
        this.thinProvision = thinProvision;
    }

    public NfsExportWhereInput thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public NfsExportWhereInput thinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public void setThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        }
    }

    public boolean getThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION);
    }

    public NfsExportWhereInput thinProvisionNot(Boolean thinProvisionNot) {

        this.thinProvisionNot = thinProvisionNot;
        return this;
    }

    /**
     * Get thinProvisionNot
     *
     * @return thinProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvisionNot() {
        return thinProvisionNot;
    }

    public void setThinProvisionNot(Boolean thinProvisionNot) {
        this.thinProvisionNot = thinProvisionNot;
    }

    public NfsExportWhereInput thinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public NfsExportWhereInput thinProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public void setThinProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION_NOT);
        }
    }

    public boolean getThinProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION_NOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NfsExportWhereInput nfsExportWhereInput = (NfsExportWhereInput) o;
        return Objects.equals(this.AND, nfsExportWhereInput.AND)
                && Objects.equals(this.NOT, nfsExportWhereInput.NOT)
                && Objects.equals(this.OR, nfsExportWhereInput.OR)
                && Objects.equals(this.cluster, nfsExportWhereInput.cluster)
                && Objects.equals(this.description, nfsExportWhereInput.description)
                && Objects.equals(this.descriptionContains, nfsExportWhereInput.descriptionContains)
                && Objects.equals(this.descriptionEndsWith, nfsExportWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, nfsExportWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, nfsExportWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, nfsExportWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, nfsExportWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, nfsExportWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, nfsExportWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, nfsExportWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, nfsExportWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, nfsExportWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith, nfsExportWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, nfsExportWhereInput.descriptionStartsWith)
                && Objects.equals(this.ecK, nfsExportWhereInput.ecK)
                && Objects.equals(this.ecKGt, nfsExportWhereInput.ecKGt)
                && Objects.equals(this.ecKGte, nfsExportWhereInput.ecKGte)
                && Objects.equals(this.ecKIn, nfsExportWhereInput.ecKIn)
                && Objects.equals(this.ecKLt, nfsExportWhereInput.ecKLt)
                && Objects.equals(this.ecKLte, nfsExportWhereInput.ecKLte)
                && Objects.equals(this.ecKNot, nfsExportWhereInput.ecKNot)
                && Objects.equals(this.ecKNotIn, nfsExportWhereInput.ecKNotIn)
                && Objects.equals(this.ecM, nfsExportWhereInput.ecM)
                && Objects.equals(this.ecMGt, nfsExportWhereInput.ecMGt)
                && Objects.equals(this.ecMGte, nfsExportWhereInput.ecMGte)
                && Objects.equals(this.ecMIn, nfsExportWhereInput.ecMIn)
                && Objects.equals(this.ecMLt, nfsExportWhereInput.ecMLt)
                && Objects.equals(this.ecMLte, nfsExportWhereInput.ecMLte)
                && Objects.equals(this.ecMNot, nfsExportWhereInput.ecMNot)
                && Objects.equals(this.ecMNotIn, nfsExportWhereInput.ecMNotIn)
                && Objects.equals(this.encryptMethod, nfsExportWhereInput.encryptMethod)
                && Objects.equals(this.encryptMethodIn, nfsExportWhereInput.encryptMethodIn)
                && Objects.equals(this.encryptMethodNot, nfsExportWhereInput.encryptMethodNot)
                && Objects.equals(this.encryptMethodNotIn, nfsExportWhereInput.encryptMethodNotIn)
                && Objects.equals(this.entityAsyncStatus, nfsExportWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, nfsExportWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, nfsExportWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, nfsExportWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.exportInodeId, nfsExportWhereInput.exportInodeId)
                && Objects.equals(
                        this.exportInodeIdContains, nfsExportWhereInput.exportInodeIdContains)
                && Objects.equals(
                        this.exportInodeIdEndsWith, nfsExportWhereInput.exportInodeIdEndsWith)
                && Objects.equals(this.exportInodeIdGt, nfsExportWhereInput.exportInodeIdGt)
                && Objects.equals(this.exportInodeIdGte, nfsExportWhereInput.exportInodeIdGte)
                && Objects.equals(this.exportInodeIdIn, nfsExportWhereInput.exportInodeIdIn)
                && Objects.equals(this.exportInodeIdLt, nfsExportWhereInput.exportInodeIdLt)
                && Objects.equals(this.exportInodeIdLte, nfsExportWhereInput.exportInodeIdLte)
                && Objects.equals(this.exportInodeIdNot, nfsExportWhereInput.exportInodeIdNot)
                && Objects.equals(
                        this.exportInodeIdNotContains, nfsExportWhereInput.exportInodeIdNotContains)
                && Objects.equals(
                        this.exportInodeIdNotEndsWith, nfsExportWhereInput.exportInodeIdNotEndsWith)
                && Objects.equals(this.exportInodeIdNotIn, nfsExportWhereInput.exportInodeIdNotIn)
                && Objects.equals(
                        this.exportInodeIdNotStartsWith,
                        nfsExportWhereInput.exportInodeIdNotStartsWith)
                && Objects.equals(
                        this.exportInodeIdStartsWith, nfsExportWhereInput.exportInodeIdStartsWith)
                && Objects.equals(this.id, nfsExportWhereInput.id)
                && Objects.equals(this.idContains, nfsExportWhereInput.idContains)
                && Objects.equals(this.idEndsWith, nfsExportWhereInput.idEndsWith)
                && Objects.equals(this.idGt, nfsExportWhereInput.idGt)
                && Objects.equals(this.idGte, nfsExportWhereInput.idGte)
                && Objects.equals(this.idIn, nfsExportWhereInput.idIn)
                && Objects.equals(this.idLt, nfsExportWhereInput.idLt)
                && Objects.equals(this.idLte, nfsExportWhereInput.idLte)
                && Objects.equals(this.idNot, nfsExportWhereInput.idNot)
                && Objects.equals(this.idNotContains, nfsExportWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, nfsExportWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, nfsExportWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, nfsExportWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, nfsExportWhereInput.idStartsWith)
                && Objects.equals(this.inodesEvery, nfsExportWhereInput.inodesEvery)
                && Objects.equals(this.inodesNone, nfsExportWhereInput.inodesNone)
                && Objects.equals(this.inodesSome, nfsExportWhereInput.inodesSome)
                && Objects.equals(this.internal, nfsExportWhereInput.internal)
                && Objects.equals(this.internalNot, nfsExportWhereInput.internalNot)
                && Objects.equals(this.ipWhitelist, nfsExportWhereInput.ipWhitelist)
                && Objects.equals(this.ipWhitelistContains, nfsExportWhereInput.ipWhitelistContains)
                && Objects.equals(this.ipWhitelistEndsWith, nfsExportWhereInput.ipWhitelistEndsWith)
                && Objects.equals(this.ipWhitelistGt, nfsExportWhereInput.ipWhitelistGt)
                && Objects.equals(this.ipWhitelistGte, nfsExportWhereInput.ipWhitelistGte)
                && Objects.equals(this.ipWhitelistIn, nfsExportWhereInput.ipWhitelistIn)
                && Objects.equals(this.ipWhitelistLt, nfsExportWhereInput.ipWhitelistLt)
                && Objects.equals(this.ipWhitelistLte, nfsExportWhereInput.ipWhitelistLte)
                && Objects.equals(this.ipWhitelistNot, nfsExportWhereInput.ipWhitelistNot)
                && Objects.equals(
                        this.ipWhitelistNotContains, nfsExportWhereInput.ipWhitelistNotContains)
                && Objects.equals(
                        this.ipWhitelistNotEndsWith, nfsExportWhereInput.ipWhitelistNotEndsWith)
                && Objects.equals(this.ipWhitelistNotIn, nfsExportWhereInput.ipWhitelistNotIn)
                && Objects.equals(
                        this.ipWhitelistNotStartsWith, nfsExportWhereInput.ipWhitelistNotStartsWith)
                && Objects.equals(
                        this.ipWhitelistStartsWith, nfsExportWhereInput.ipWhitelistStartsWith)
                && Objects.equals(this.labelsEvery, nfsExportWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, nfsExportWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, nfsExportWhereInput.labelsSome)
                && Objects.equals(this.localId, nfsExportWhereInput.localId)
                && Objects.equals(this.localIdContains, nfsExportWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, nfsExportWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, nfsExportWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, nfsExportWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, nfsExportWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, nfsExportWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, nfsExportWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, nfsExportWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, nfsExportWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, nfsExportWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, nfsExportWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, nfsExportWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, nfsExportWhereInput.localIdStartsWith)
                && Objects.equals(this.name, nfsExportWhereInput.name)
                && Objects.equals(this.nameContains, nfsExportWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, nfsExportWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, nfsExportWhereInput.nameGt)
                && Objects.equals(this.nameGte, nfsExportWhereInput.nameGte)
                && Objects.equals(this.nameIn, nfsExportWhereInput.nameIn)
                && Objects.equals(this.nameLt, nfsExportWhereInput.nameLt)
                && Objects.equals(this.nameLte, nfsExportWhereInput.nameLte)
                && Objects.equals(this.nameNot, nfsExportWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, nfsExportWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, nfsExportWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, nfsExportWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, nfsExportWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, nfsExportWhereInput.nameStartsWith)
                && Objects.equals(this.prioritized, nfsExportWhereInput.prioritized)
                && Objects.equals(this.prioritizedNot, nfsExportWhereInput.prioritizedNot)
                && Objects.equals(this.replicaNum, nfsExportWhereInput.replicaNum)
                && Objects.equals(this.replicaNumGt, nfsExportWhereInput.replicaNumGt)
                && Objects.equals(this.replicaNumGte, nfsExportWhereInput.replicaNumGte)
                && Objects.equals(this.replicaNumIn, nfsExportWhereInput.replicaNumIn)
                && Objects.equals(this.replicaNumLt, nfsExportWhereInput.replicaNumLt)
                && Objects.equals(this.replicaNumLte, nfsExportWhereInput.replicaNumLte)
                && Objects.equals(this.replicaNumNot, nfsExportWhereInput.replicaNumNot)
                && Objects.equals(this.replicaNumNotIn, nfsExportWhereInput.replicaNumNotIn)
                && Objects.equals(this.resiliencyType, nfsExportWhereInput.resiliencyType)
                && Objects.equals(this.resiliencyTypeIn, nfsExportWhereInput.resiliencyTypeIn)
                && Objects.equals(this.resiliencyTypeNot, nfsExportWhereInput.resiliencyTypeNot)
                && Objects.equals(this.resiliencyTypeNotIn, nfsExportWhereInput.resiliencyTypeNotIn)
                && Objects.equals(this.thinProvision, nfsExportWhereInput.thinProvision)
                && Objects.equals(this.thinProvisionNot, nfsExportWhereInput.thinProvisionNot);
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
                exportInodeId,
                exportInodeIdContains,
                exportInodeIdEndsWith,
                exportInodeIdGt,
                exportInodeIdGte,
                exportInodeIdIn,
                exportInodeIdLt,
                exportInodeIdLte,
                exportInodeIdNot,
                exportInodeIdNotContains,
                exportInodeIdNotEndsWith,
                exportInodeIdNotIn,
                exportInodeIdNotStartsWith,
                exportInodeIdStartsWith,
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
                inodesEvery,
                inodesNone,
                inodesSome,
                internal,
                internalNot,
                ipWhitelist,
                ipWhitelistContains,
                ipWhitelistEndsWith,
                ipWhitelistGt,
                ipWhitelistGte,
                ipWhitelistIn,
                ipWhitelistLt,
                ipWhitelistLte,
                ipWhitelistNot,
                ipWhitelistNotContains,
                ipWhitelistNotEndsWith,
                ipWhitelistNotIn,
                ipWhitelistNotStartsWith,
                ipWhitelistStartsWith,
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
                prioritized,
                prioritizedNot,
                replicaNum,
                replicaNumGt,
                replicaNumGte,
                replicaNumIn,
                replicaNumLt,
                replicaNumLte,
                replicaNumNot,
                replicaNumNotIn,
                resiliencyType,
                resiliencyTypeIn,
                resiliencyTypeNot,
                resiliencyTypeNotIn,
                thinProvision,
                thinProvisionNot);
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
        sb.append("class NfsExportWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
        sb.append("    exportInodeId: ").append(toIndentedString(exportInodeId)).append("\n");
        sb.append("    exportInodeIdContains: ")
                .append(toIndentedString(exportInodeIdContains))
                .append("\n");
        sb.append("    exportInodeIdEndsWith: ")
                .append(toIndentedString(exportInodeIdEndsWith))
                .append("\n");
        sb.append("    exportInodeIdGt: ").append(toIndentedString(exportInodeIdGt)).append("\n");
        sb.append("    exportInodeIdGte: ").append(toIndentedString(exportInodeIdGte)).append("\n");
        sb.append("    exportInodeIdIn: ").append(toIndentedString(exportInodeIdIn)).append("\n");
        sb.append("    exportInodeIdLt: ").append(toIndentedString(exportInodeIdLt)).append("\n");
        sb.append("    exportInodeIdLte: ").append(toIndentedString(exportInodeIdLte)).append("\n");
        sb.append("    exportInodeIdNot: ").append(toIndentedString(exportInodeIdNot)).append("\n");
        sb.append("    exportInodeIdNotContains: ")
                .append(toIndentedString(exportInodeIdNotContains))
                .append("\n");
        sb.append("    exportInodeIdNotEndsWith: ")
                .append(toIndentedString(exportInodeIdNotEndsWith))
                .append("\n");
        sb.append("    exportInodeIdNotIn: ")
                .append(toIndentedString(exportInodeIdNotIn))
                .append("\n");
        sb.append("    exportInodeIdNotStartsWith: ")
                .append(toIndentedString(exportInodeIdNotStartsWith))
                .append("\n");
        sb.append("    exportInodeIdStartsWith: ")
                .append(toIndentedString(exportInodeIdStartsWith))
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
        sb.append("    inodesEvery: ").append(toIndentedString(inodesEvery)).append("\n");
        sb.append("    inodesNone: ").append(toIndentedString(inodesNone)).append("\n");
        sb.append("    inodesSome: ").append(toIndentedString(inodesSome)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
        sb.append("    ipWhitelistContains: ")
                .append(toIndentedString(ipWhitelistContains))
                .append("\n");
        sb.append("    ipWhitelistEndsWith: ")
                .append(toIndentedString(ipWhitelistEndsWith))
                .append("\n");
        sb.append("    ipWhitelistGt: ").append(toIndentedString(ipWhitelistGt)).append("\n");
        sb.append("    ipWhitelistGte: ").append(toIndentedString(ipWhitelistGte)).append("\n");
        sb.append("    ipWhitelistIn: ").append(toIndentedString(ipWhitelistIn)).append("\n");
        sb.append("    ipWhitelistLt: ").append(toIndentedString(ipWhitelistLt)).append("\n");
        sb.append("    ipWhitelistLte: ").append(toIndentedString(ipWhitelistLte)).append("\n");
        sb.append("    ipWhitelistNot: ").append(toIndentedString(ipWhitelistNot)).append("\n");
        sb.append("    ipWhitelistNotContains: ")
                .append(toIndentedString(ipWhitelistNotContains))
                .append("\n");
        sb.append("    ipWhitelistNotEndsWith: ")
                .append(toIndentedString(ipWhitelistNotEndsWith))
                .append("\n");
        sb.append("    ipWhitelistNotIn: ").append(toIndentedString(ipWhitelistNotIn)).append("\n");
        sb.append("    ipWhitelistNotStartsWith: ")
                .append(toIndentedString(ipWhitelistNotStartsWith))
                .append("\n");
        sb.append("    ipWhitelistStartsWith: ")
                .append(toIndentedString(ipWhitelistStartsWith))
                .append("\n");
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
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    prioritizedNot: ").append(toIndentedString(prioritizedNot)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    replicaNumGt: ").append(toIndentedString(replicaNumGt)).append("\n");
        sb.append("    replicaNumGte: ").append(toIndentedString(replicaNumGte)).append("\n");
        sb.append("    replicaNumIn: ").append(toIndentedString(replicaNumIn)).append("\n");
        sb.append("    replicaNumLt: ").append(toIndentedString(replicaNumLt)).append("\n");
        sb.append("    replicaNumLte: ").append(toIndentedString(replicaNumLte)).append("\n");
        sb.append("    replicaNumNot: ").append(toIndentedString(replicaNumNot)).append("\n");
        sb.append("    replicaNumNotIn: ").append(toIndentedString(replicaNumNotIn)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    resiliencyTypeIn: ").append(toIndentedString(resiliencyTypeIn)).append("\n");
        sb.append("    resiliencyTypeNot: ")
                .append(toIndentedString(resiliencyTypeNot))
                .append("\n");
        sb.append("    resiliencyTypeNotIn: ")
                .append(toIndentedString(resiliencyTypeNotIn))
                .append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    thinProvisionNot: ").append(toIndentedString(thinProvisionNot)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NvmfSubsystemWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfSubsystemWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<NvmfSubsystemWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<NvmfSubsystemWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<NvmfSubsystemWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BPS = "bps";

    @SerializedName(SERIALIZED_NAME_BPS)
    private Long bps;

    public static final String SERIALIZED_NAME_BPS_GT = "bps_gt";

    @SerializedName(SERIALIZED_NAME_BPS_GT)
    private Long bpsGt;

    public static final String SERIALIZED_NAME_BPS_GTE = "bps_gte";

    @SerializedName(SERIALIZED_NAME_BPS_GTE)
    private Long bpsGte;

    public static final String SERIALIZED_NAME_BPS_IN = "bps_in";

    @SerializedName(SERIALIZED_NAME_BPS_IN)
    private List<Long> bpsIn = null;

    public static final String SERIALIZED_NAME_BPS_LT = "bps_lt";

    @SerializedName(SERIALIZED_NAME_BPS_LT)
    private Long bpsLt;

    public static final String SERIALIZED_NAME_BPS_LTE = "bps_lte";

    @SerializedName(SERIALIZED_NAME_BPS_LTE)
    private Long bpsLte;

    public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";

    @SerializedName(SERIALIZED_NAME_BPS_MAX)
    private Long bpsMax;

    public static final String SERIALIZED_NAME_BPS_MAX_GT = "bps_max_gt";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_GT)
    private Long bpsMaxGt;

    public static final String SERIALIZED_NAME_BPS_MAX_GTE = "bps_max_gte";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_GTE)
    private Long bpsMaxGte;

    public static final String SERIALIZED_NAME_BPS_MAX_IN = "bps_max_in";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_IN)
    private List<Long> bpsMaxIn = null;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
    private Long bpsMaxLength;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_GT = "bps_max_length_gt";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_GT)
    private Long bpsMaxLengthGt;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_GTE = "bps_max_length_gte";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE)
    private Long bpsMaxLengthGte;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_IN = "bps_max_length_in";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_IN)
    private List<Long> bpsMaxLengthIn = null;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_LT = "bps_max_length_lt";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_LT)
    private Long bpsMaxLengthLt;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_LTE = "bps_max_length_lte";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE)
    private Long bpsMaxLengthLte;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_NOT = "bps_max_length_not";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT)
    private Long bpsMaxLengthNot;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN = "bps_max_length_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN)
    private List<Long> bpsMaxLengthNotIn = null;

    public static final String SERIALIZED_NAME_BPS_MAX_LT = "bps_max_lt";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LT)
    private Long bpsMaxLt;

    public static final String SERIALIZED_NAME_BPS_MAX_LTE = "bps_max_lte";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LTE)
    private Long bpsMaxLte;

    public static final String SERIALIZED_NAME_BPS_MAX_NOT = "bps_max_not";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_NOT)
    private Long bpsMaxNot;

    public static final String SERIALIZED_NAME_BPS_MAX_NOT_IN = "bps_max_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_NOT_IN)
    private List<Long> bpsMaxNotIn = null;

    public static final String SERIALIZED_NAME_BPS_NOT = "bps_not";

    @SerializedName(SERIALIZED_NAME_BPS_NOT)
    private Long bpsNot;

    public static final String SERIALIZED_NAME_BPS_NOT_IN = "bps_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_NOT_IN)
    private List<Long> bpsNotIn = null;

    public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";

    @SerializedName(SERIALIZED_NAME_BPS_RD)
    private Long bpsRd;

    public static final String SERIALIZED_NAME_BPS_RD_GT = "bps_rd_gt";

    @SerializedName(SERIALIZED_NAME_BPS_RD_GT)
    private Long bpsRdGt;

    public static final String SERIALIZED_NAME_BPS_RD_GTE = "bps_rd_gte";

    @SerializedName(SERIALIZED_NAME_BPS_RD_GTE)
    private Long bpsRdGte;

    public static final String SERIALIZED_NAME_BPS_RD_IN = "bps_rd_in";

    @SerializedName(SERIALIZED_NAME_BPS_RD_IN)
    private List<Long> bpsRdIn = null;

    public static final String SERIALIZED_NAME_BPS_RD_LT = "bps_rd_lt";

    @SerializedName(SERIALIZED_NAME_BPS_RD_LT)
    private Long bpsRdLt;

    public static final String SERIALIZED_NAME_BPS_RD_LTE = "bps_rd_lte";

    @SerializedName(SERIALIZED_NAME_BPS_RD_LTE)
    private Long bpsRdLte;

    public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
    private Long bpsRdMax;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_GT = "bps_rd_max_gt";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_GT)
    private Long bpsRdMaxGt;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_GTE = "bps_rd_max_gte";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_GTE)
    private Long bpsRdMaxGte;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_IN = "bps_rd_max_in";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_IN)
    private List<Long> bpsRdMaxIn = null;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
    private Long bpsRdMaxLength;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT = "bps_rd_max_length_gt";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT)
    private Long bpsRdMaxLengthGt;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE = "bps_rd_max_length_gte";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE)
    private Long bpsRdMaxLengthGte;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN = "bps_rd_max_length_in";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN)
    private List<Long> bpsRdMaxLengthIn = null;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT = "bps_rd_max_length_lt";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT)
    private Long bpsRdMaxLengthLt;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE = "bps_rd_max_length_lte";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE)
    private Long bpsRdMaxLengthLte;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT = "bps_rd_max_length_not";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT)
    private Long bpsRdMaxLengthNot;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN =
            "bps_rd_max_length_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN)
    private List<Long> bpsRdMaxLengthNotIn = null;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LT = "bps_rd_max_lt";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LT)
    private Long bpsRdMaxLt;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LTE = "bps_rd_max_lte";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LTE)
    private Long bpsRdMaxLte;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_NOT = "bps_rd_max_not";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_NOT)
    private Long bpsRdMaxNot;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_NOT_IN = "bps_rd_max_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN)
    private List<Long> bpsRdMaxNotIn = null;

    public static final String SERIALIZED_NAME_BPS_RD_NOT = "bps_rd_not";

    @SerializedName(SERIALIZED_NAME_BPS_RD_NOT)
    private Long bpsRdNot;

    public static final String SERIALIZED_NAME_BPS_RD_NOT_IN = "bps_rd_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_RD_NOT_IN)
    private List<Long> bpsRdNotIn = null;

    public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";

    @SerializedName(SERIALIZED_NAME_BPS_WR)
    private Long bpsWr;

    public static final String SERIALIZED_NAME_BPS_WR_GT = "bps_wr_gt";

    @SerializedName(SERIALIZED_NAME_BPS_WR_GT)
    private Long bpsWrGt;

    public static final String SERIALIZED_NAME_BPS_WR_GTE = "bps_wr_gte";

    @SerializedName(SERIALIZED_NAME_BPS_WR_GTE)
    private Long bpsWrGte;

    public static final String SERIALIZED_NAME_BPS_WR_IN = "bps_wr_in";

    @SerializedName(SERIALIZED_NAME_BPS_WR_IN)
    private List<Long> bpsWrIn = null;

    public static final String SERIALIZED_NAME_BPS_WR_LT = "bps_wr_lt";

    @SerializedName(SERIALIZED_NAME_BPS_WR_LT)
    private Long bpsWrLt;

    public static final String SERIALIZED_NAME_BPS_WR_LTE = "bps_wr_lte";

    @SerializedName(SERIALIZED_NAME_BPS_WR_LTE)
    private Long bpsWrLte;

    public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
    private Long bpsWrMax;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_GT = "bps_wr_max_gt";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_GT)
    private Long bpsWrMaxGt;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_GTE = "bps_wr_max_gte";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_GTE)
    private Long bpsWrMaxGte;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_IN = "bps_wr_max_in";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_IN)
    private List<Long> bpsWrMaxIn = null;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
    private Long bpsWrMaxLength;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT = "bps_wr_max_length_gt";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT)
    private Long bpsWrMaxLengthGt;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE = "bps_wr_max_length_gte";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE)
    private Long bpsWrMaxLengthGte;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN = "bps_wr_max_length_in";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN)
    private List<Long> bpsWrMaxLengthIn = null;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT = "bps_wr_max_length_lt";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT)
    private Long bpsWrMaxLengthLt;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE = "bps_wr_max_length_lte";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE)
    private Long bpsWrMaxLengthLte;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT = "bps_wr_max_length_not";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT)
    private Long bpsWrMaxLengthNot;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN =
            "bps_wr_max_length_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN)
    private List<Long> bpsWrMaxLengthNotIn = null;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LT = "bps_wr_max_lt";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LT)
    private Long bpsWrMaxLt;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LTE = "bps_wr_max_lte";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LTE)
    private Long bpsWrMaxLte;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_NOT = "bps_wr_max_not";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_NOT)
    private Long bpsWrMaxNot;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_NOT_IN = "bps_wr_max_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN)
    private List<Long> bpsWrMaxNotIn = null;

    public static final String SERIALIZED_NAME_BPS_WR_NOT = "bps_wr_not";

    @SerializedName(SERIALIZED_NAME_BPS_WR_NOT)
    private Long bpsWrNot;

    public static final String SERIALIZED_NAME_BPS_WR_NOT_IN = "bps_wr_not_in";

    @SerializedName(SERIALIZED_NAME_BPS_WR_NOT_IN)
    private List<Long> bpsWrNotIn = null;

    public static final String SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY =
            "business_host_groups_every";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY)
    private BusinessHostGroupWhereInput businessHostGroupsEvery;

    public static final String SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE =
            "business_host_groups_none";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE)
    private BusinessHostGroupWhereInput businessHostGroupsNone;

    public static final String SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME =
            "business_host_groups_some";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME)
    private BusinessHostGroupWhereInput businessHostGroupsSome;

    public static final String SERIALIZED_NAME_BUSINESS_HOSTS_EVERY = "business_hosts_every";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS_EVERY)
    private BusinessHostWhereInput businessHostsEvery;

    public static final String SERIALIZED_NAME_BUSINESS_HOSTS_NONE = "business_hosts_none";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS_NONE)
    private BusinessHostWhereInput businessHostsNone;

    public static final String SERIALIZED_NAME_BUSINESS_HOSTS_SOME = "business_hosts_some";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS_SOME)
    private BusinessHostWhereInput businessHostsSome;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CONFIGURATION_ADAPTIVE = "configuration_adaptive";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE)
    private Boolean configurationAdaptive;

    public static final String SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT =
            "configuration_adaptive_not";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT)
    private Boolean configurationAdaptiveNot;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
    private ConfigurationMethod configurationMethod;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD_IN = "configuration_method_in";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD_IN)
    private List<ConfigurationMethod> configurationMethodIn = null;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD_NOT =
            "configuration_method_not";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT)
    private ConfigurationMethod configurationMethodNot;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN =
            "configuration_method_not_in";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN)
    private List<ConfigurationMethod> configurationMethodNotIn = null;

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

    public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
    private Boolean externalUse;

    public static final String SERIALIZED_NAME_EXTERNAL_USE_NOT = "external_use_not";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_USE_NOT)
    private Boolean externalUseNot;

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

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

    public static final String SERIALIZED_NAME_IO_SIZE = "io_size";

    @SerializedName(SERIALIZED_NAME_IO_SIZE)
    private Long ioSize;

    public static final String SERIALIZED_NAME_IO_SIZE_GT = "io_size_gt";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_GT)
    private Long ioSizeGt;

    public static final String SERIALIZED_NAME_IO_SIZE_GTE = "io_size_gte";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_GTE)
    private Long ioSizeGte;

    public static final String SERIALIZED_NAME_IO_SIZE_IN = "io_size_in";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_IN)
    private List<Long> ioSizeIn = null;

    public static final String SERIALIZED_NAME_IO_SIZE_LT = "io_size_lt";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_LT)
    private Long ioSizeLt;

    public static final String SERIALIZED_NAME_IO_SIZE_LTE = "io_size_lte";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_LTE)
    private Long ioSizeLte;

    public static final String SERIALIZED_NAME_IO_SIZE_NOT = "io_size_not";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_NOT)
    private Long ioSizeNot;

    public static final String SERIALIZED_NAME_IO_SIZE_NOT_IN = "io_size_not_in";

    @SerializedName(SERIALIZED_NAME_IO_SIZE_NOT_IN)
    private List<Long> ioSizeNotIn = null;

    public static final String SERIALIZED_NAME_IOPS = "iops";

    @SerializedName(SERIALIZED_NAME_IOPS)
    private Long iops;

    public static final String SERIALIZED_NAME_IOPS_GT = "iops_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_GT)
    private Long iopsGt;

    public static final String SERIALIZED_NAME_IOPS_GTE = "iops_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_GTE)
    private Long iopsGte;

    public static final String SERIALIZED_NAME_IOPS_IN = "iops_in";

    @SerializedName(SERIALIZED_NAME_IOPS_IN)
    private List<Long> iopsIn = null;

    public static final String SERIALIZED_NAME_IOPS_LT = "iops_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_LT)
    private Long iopsLt;

    public static final String SERIALIZED_NAME_IOPS_LTE = "iops_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_LTE)
    private Long iopsLte;

    public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX)
    private Long iopsMax;

    public static final String SERIALIZED_NAME_IOPS_MAX_GT = "iops_max_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_GT)
    private Long iopsMaxGt;

    public static final String SERIALIZED_NAME_IOPS_MAX_GTE = "iops_max_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_GTE)
    private Long iopsMaxGte;

    public static final String SERIALIZED_NAME_IOPS_MAX_IN = "iops_max_in";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_IN)
    private List<Long> iopsMaxIn = null;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
    private Long iopsMaxLength;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_GT = "iops_max_length_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT)
    private Long iopsMaxLengthGt;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE = "iops_max_length_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE)
    private Long iopsMaxLengthGte;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_IN = "iops_max_length_in";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN)
    private List<Long> iopsMaxLengthIn = null;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_LT = "iops_max_length_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT)
    private Long iopsMaxLengthLt;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE = "iops_max_length_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE)
    private Long iopsMaxLengthLte;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT = "iops_max_length_not";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT)
    private Long iopsMaxLengthNot;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN = "iops_max_length_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN)
    private List<Long> iopsMaxLengthNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_MAX_LT = "iops_max_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LT)
    private Long iopsMaxLt;

    public static final String SERIALIZED_NAME_IOPS_MAX_LTE = "iops_max_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LTE)
    private Long iopsMaxLte;

    public static final String SERIALIZED_NAME_IOPS_MAX_NOT = "iops_max_not";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_NOT)
    private Long iopsMaxNot;

    public static final String SERIALIZED_NAME_IOPS_MAX_NOT_IN = "iops_max_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_NOT_IN)
    private List<Long> iopsMaxNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_NOT = "iops_not";

    @SerializedName(SERIALIZED_NAME_IOPS_NOT)
    private Long iopsNot;

    public static final String SERIALIZED_NAME_IOPS_NOT_IN = "iops_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_NOT_IN)
    private List<Long> iopsNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";

    @SerializedName(SERIALIZED_NAME_IOPS_RD)
    private Long iopsRd;

    public static final String SERIALIZED_NAME_IOPS_RD_GT = "iops_rd_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_GT)
    private Long iopsRdGt;

    public static final String SERIALIZED_NAME_IOPS_RD_GTE = "iops_rd_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_GTE)
    private Long iopsRdGte;

    public static final String SERIALIZED_NAME_IOPS_RD_IN = "iops_rd_in";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_IN)
    private List<Long> iopsRdIn = null;

    public static final String SERIALIZED_NAME_IOPS_RD_LT = "iops_rd_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_LT)
    private Long iopsRdLt;

    public static final String SERIALIZED_NAME_IOPS_RD_LTE = "iops_rd_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_LTE)
    private Long iopsRdLte;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
    private Long iopsRdMax;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_GT = "iops_rd_max_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_GT)
    private Long iopsRdMaxGt;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_GTE = "iops_rd_max_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_GTE)
    private Long iopsRdMaxGte;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_IN = "iops_rd_max_in";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_IN)
    private List<Long> iopsRdMaxIn = null;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
    private Long iopsRdMaxLength;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT = "iops_rd_max_length_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT)
    private Long iopsRdMaxLengthGt;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE = "iops_rd_max_length_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE)
    private Long iopsRdMaxLengthGte;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN = "iops_rd_max_length_in";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN)
    private List<Long> iopsRdMaxLengthIn = null;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT = "iops_rd_max_length_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT)
    private Long iopsRdMaxLengthLt;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE = "iops_rd_max_length_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE)
    private Long iopsRdMaxLengthLte;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT = "iops_rd_max_length_not";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT)
    private Long iopsRdMaxLengthNot;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN =
            "iops_rd_max_length_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN)
    private List<Long> iopsRdMaxLengthNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LT = "iops_rd_max_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LT)
    private Long iopsRdMaxLt;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LTE = "iops_rd_max_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LTE)
    private Long iopsRdMaxLte;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_NOT = "iops_rd_max_not";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_NOT)
    private Long iopsRdMaxNot;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN = "iops_rd_max_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN)
    private List<Long> iopsRdMaxNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_RD_NOT = "iops_rd_not";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_NOT)
    private Long iopsRdNot;

    public static final String SERIALIZED_NAME_IOPS_RD_NOT_IN = "iops_rd_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_NOT_IN)
    private List<Long> iopsRdNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";

    @SerializedName(SERIALIZED_NAME_IOPS_WR)
    private Long iopsWr;

    public static final String SERIALIZED_NAME_IOPS_WR_GT = "iops_wr_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_GT)
    private Long iopsWrGt;

    public static final String SERIALIZED_NAME_IOPS_WR_GTE = "iops_wr_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_GTE)
    private Long iopsWrGte;

    public static final String SERIALIZED_NAME_IOPS_WR_IN = "iops_wr_in";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_IN)
    private List<Long> iopsWrIn = null;

    public static final String SERIALIZED_NAME_IOPS_WR_LT = "iops_wr_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_LT)
    private Long iopsWrLt;

    public static final String SERIALIZED_NAME_IOPS_WR_LTE = "iops_wr_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_LTE)
    private Long iopsWrLte;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
    private Long iopsWrMax;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_GT = "iops_wr_max_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_GT)
    private Long iopsWrMaxGt;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_GTE = "iops_wr_max_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_GTE)
    private Long iopsWrMaxGte;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_IN = "iops_wr_max_in";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_IN)
    private List<Long> iopsWrMaxIn = null;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
    private Long iopsWrMaxLength;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT = "iops_wr_max_length_gt";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT)
    private Long iopsWrMaxLengthGt;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE = "iops_wr_max_length_gte";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE)
    private Long iopsWrMaxLengthGte;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN = "iops_wr_max_length_in";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN)
    private List<Long> iopsWrMaxLengthIn = null;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT = "iops_wr_max_length_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT)
    private Long iopsWrMaxLengthLt;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE = "iops_wr_max_length_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE)
    private Long iopsWrMaxLengthLte;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT = "iops_wr_max_length_not";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT)
    private Long iopsWrMaxLengthNot;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN =
            "iops_wr_max_length_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN)
    private List<Long> iopsWrMaxLengthNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LT = "iops_wr_max_lt";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LT)
    private Long iopsWrMaxLt;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LTE = "iops_wr_max_lte";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LTE)
    private Long iopsWrMaxLte;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_NOT = "iops_wr_max_not";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_NOT)
    private Long iopsWrMaxNot;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN = "iops_wr_max_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN)
    private List<Long> iopsWrMaxNotIn = null;

    public static final String SERIALIZED_NAME_IOPS_WR_NOT = "iops_wr_not";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_NOT)
    private Long iopsWrNot;

    public static final String SERIALIZED_NAME_IOPS_WR_NOT_IN = "iops_wr_not_in";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_NOT_IN)
    private List<Long> iopsWrNotIn = null;

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

    public static final String SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY = "iscsi_connections_every";

    @SerializedName(SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY)
    private IscsiConnectionWhereInput iscsiConnectionsEvery;

    public static final String SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE = "iscsi_connections_none";

    @SerializedName(SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE)
    private IscsiConnectionWhereInput iscsiConnectionsNone;

    public static final String SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME = "iscsi_connections_some";

    @SerializedName(SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME)
    private IscsiConnectionWhereInput iscsiConnectionsSome;

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

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY = "namespace_groups_every";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY)
    private NamespaceGroupWhereInput namespaceGroupsEvery;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS_NONE = "namespace_groups_none";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE)
    private NamespaceGroupWhereInput namespaceGroupsNone;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS_SOME = "namespace_groups_some";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME)
    private NamespaceGroupWhereInput namespaceGroupsSome;

    public static final String SERIALIZED_NAME_NAMESPACES_EVERY = "namespaces_every";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_EVERY)
    private NvmfNamespaceWhereInput namespacesEvery;

    public static final String SERIALIZED_NAME_NAMESPACES_NONE = "namespaces_none";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_NONE)
    private NvmfNamespaceWhereInput namespacesNone;

    public static final String SERIALIZED_NAME_NAMESPACES_SOME = "namespaces_some";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_SOME)
    private NvmfNamespaceWhereInput namespacesSome;

    public static final String SERIALIZED_NAME_NQN_NAME = "nqn_name";

    @SerializedName(SERIALIZED_NAME_NQN_NAME)
    private String nqnName;

    public static final String SERIALIZED_NAME_NQN_NAME_CONTAINS = "nqn_name_contains";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_CONTAINS)
    private String nqnNameContains;

    public static final String SERIALIZED_NAME_NQN_NAME_ENDS_WITH = "nqn_name_ends_with";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_ENDS_WITH)
    private String nqnNameEndsWith;

    public static final String SERIALIZED_NAME_NQN_NAME_GT = "nqn_name_gt";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_GT)
    private String nqnNameGt;

    public static final String SERIALIZED_NAME_NQN_NAME_GTE = "nqn_name_gte";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_GTE)
    private String nqnNameGte;

    public static final String SERIALIZED_NAME_NQN_NAME_IN = "nqn_name_in";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_IN)
    private List<String> nqnNameIn = null;

    public static final String SERIALIZED_NAME_NQN_NAME_LT = "nqn_name_lt";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_LT)
    private String nqnNameLt;

    public static final String SERIALIZED_NAME_NQN_NAME_LTE = "nqn_name_lte";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_LTE)
    private String nqnNameLte;

    public static final String SERIALIZED_NAME_NQN_NAME_NOT = "nqn_name_not";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_NOT)
    private String nqnNameNot;

    public static final String SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS = "nqn_name_not_contains";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS)
    private String nqnNameNotContains;

    public static final String SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH = "nqn_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH)
    private String nqnNameNotEndsWith;

    public static final String SERIALIZED_NAME_NQN_NAME_NOT_IN = "nqn_name_not_in";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_NOT_IN)
    private List<String> nqnNameNotIn = null;

    public static final String SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH =
            "nqn_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH)
    private String nqnNameNotStartsWith;

    public static final String SERIALIZED_NAME_NQN_NAME_STARTS_WITH = "nqn_name_starts_with";

    @SerializedName(SERIALIZED_NAME_NQN_NAME_STARTS_WITH)
    private String nqnNameStartsWith;

    public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
    private String nqnWhitelist;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_CONTAINS = "nqn_whitelist_contains";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_CONTAINS)
    private String nqnWhitelistContains;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH = "nqn_whitelist_ends_with";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH)
    private String nqnWhitelistEndsWith;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_GT = "nqn_whitelist_gt";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_GT)
    private String nqnWhitelistGt;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_GTE = "nqn_whitelist_gte";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_GTE)
    private String nqnWhitelistGte;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_IN = "nqn_whitelist_in";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_IN)
    private List<String> nqnWhitelistIn = null;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_LT = "nqn_whitelist_lt";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_LT)
    private String nqnWhitelistLt;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_LTE = "nqn_whitelist_lte";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_LTE)
    private String nqnWhitelistLte;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_NOT = "nqn_whitelist_not";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_NOT)
    private String nqnWhitelistNot;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS =
            "nqn_whitelist_not_contains";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS)
    private String nqnWhitelistNotContains;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH =
            "nqn_whitelist_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH)
    private String nqnWhitelistNotEndsWith;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_NOT_IN = "nqn_whitelist_not_in";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_NOT_IN)
    private List<String> nqnWhitelistNotIn = null;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH =
            "nqn_whitelist_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH)
    private String nqnWhitelistNotStartsWith;

    public static final String SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH =
            "nqn_whitelist_starts_with";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH)
    private String nqnWhitelistStartsWith;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM = "nvmf_namespaces_num";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM)
    private Integer nvmfNamespacesNum;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT = "nvmf_namespaces_num_gt";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT)
    private Integer nvmfNamespacesNumGt;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE = "nvmf_namespaces_num_gte";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE)
    private Integer nvmfNamespacesNumGte;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN = "nvmf_namespaces_num_in";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN)
    private List<Integer> nvmfNamespacesNumIn = null;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT = "nvmf_namespaces_num_lt";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT)
    private Integer nvmfNamespacesNumLt;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE = "nvmf_namespaces_num_lte";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE)
    private Integer nvmfNamespacesNumLte;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT = "nvmf_namespaces_num_not";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT)
    private Integer nvmfNamespacesNumNot;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN =
            "nvmf_namespaces_num_not_in";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN)
    private List<Integer> nvmfNamespacesNumNotIn = null;

    public static final String SERIALIZED_NAME_POLICY = "policy";

    @SerializedName(SERIALIZED_NAME_POLICY)
    private NvmfSubsystemPolicyType policy;

    public static final String SERIALIZED_NAME_POLICY_IN = "policy_in";

    @SerializedName(SERIALIZED_NAME_POLICY_IN)
    private List<NvmfSubsystemPolicyType> policyIn = null;

    public static final String SERIALIZED_NAME_POLICY_NOT = "policy_not";

    @SerializedName(SERIALIZED_NAME_POLICY_NOT)
    private NvmfSubsystemPolicyType policyNot;

    public static final String SERIALIZED_NAME_POLICY_NOT_IN = "policy_not_in";

    @SerializedName(SERIALIZED_NAME_POLICY_NOT_IN)
    private List<NvmfSubsystemPolicyType> policyNotIn = null;

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

    public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
    private Integer stripeNum;

    public static final String SERIALIZED_NAME_STRIPE_NUM_GT = "stripe_num_gt";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_GT)
    private Integer stripeNumGt;

    public static final String SERIALIZED_NAME_STRIPE_NUM_GTE = "stripe_num_gte";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_GTE)
    private Integer stripeNumGte;

    public static final String SERIALIZED_NAME_STRIPE_NUM_IN = "stripe_num_in";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_IN)
    private List<Integer> stripeNumIn = null;

    public static final String SERIALIZED_NAME_STRIPE_NUM_LT = "stripe_num_lt";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_LT)
    private Integer stripeNumLt;

    public static final String SERIALIZED_NAME_STRIPE_NUM_LTE = "stripe_num_lte";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_LTE)
    private Integer stripeNumLte;

    public static final String SERIALIZED_NAME_STRIPE_NUM_NOT = "stripe_num_not";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_NOT)
    private Integer stripeNumNot;

    public static final String SERIALIZED_NAME_STRIPE_NUM_NOT_IN = "stripe_num_not_in";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM_NOT_IN)
    private List<Integer> stripeNumNotIn = null;

    public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
    private Long stripeSize;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_GT = "stripe_size_gt";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_GT)
    private Long stripeSizeGt;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_GTE = "stripe_size_gte";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_GTE)
    private Long stripeSizeGte;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_IN = "stripe_size_in";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_IN)
    private List<Long> stripeSizeIn = null;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_LT = "stripe_size_lt";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_LT)
    private Long stripeSizeLt;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_LTE = "stripe_size_lte";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_LTE)
    private Long stripeSizeLte;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_NOT = "stripe_size_not";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_NOT)
    private Long stripeSizeNot;

    public static final String SERIALIZED_NAME_STRIPE_SIZE_NOT_IN = "stripe_size_not_in";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN)
    private List<Long> stripeSizeNotIn = null;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_THIN_PROVISION_NOT = "thin_provision_not";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION_NOT)
    private Boolean thinProvisionNot;

    public NvmfSubsystemWhereInput() {}

    public NvmfSubsystemWhereInput AND(List<NvmfSubsystemWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public NvmfSubsystemWhereInput addANDItem(NvmfSubsystemWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<NvmfSubsystemWhereInput>();
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
    public List<NvmfSubsystemWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<NvmfSubsystemWhereInput> AND) {
        this.AND = AND;
    }

    public NvmfSubsystemWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public NvmfSubsystemWhereInput AND_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput NOT(List<NvmfSubsystemWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public NvmfSubsystemWhereInput addNOTItem(NvmfSubsystemWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<NvmfSubsystemWhereInput>();
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
    public List<NvmfSubsystemWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<NvmfSubsystemWhereInput> NOT) {
        this.NOT = NOT;
    }

    public NvmfSubsystemWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public NvmfSubsystemWhereInput NOT_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput OR(List<NvmfSubsystemWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public NvmfSubsystemWhereInput addORItem(NvmfSubsystemWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<NvmfSubsystemWhereInput>();
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
    public List<NvmfSubsystemWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<NvmfSubsystemWhereInput> OR) {
        this.OR = OR;
    }

    public NvmfSubsystemWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public NvmfSubsystemWhereInput OR_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput bps(Long bps) {

        this.bps = bps;
        return this;
    }

    /**
     * Get bps
     *
     * @return bps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBps() {
        return bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public NvmfSubsystemWhereInput bps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS);
        return this;
    }

    public NvmfSubsystemWhereInput bps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS);
        return this;
    }

    public void setBps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS);
        }
    }

    public boolean getBps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS);
    }

    public NvmfSubsystemWhereInput bpsGt(Long bpsGt) {

        this.bpsGt = bpsGt;
        return this;
    }

    /**
     * Get bpsGt
     *
     * @return bpsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsGt() {
        return bpsGt;
    }

    public void setBpsGt(Long bpsGt) {
        this.bpsGt = bpsGt;
    }

    public NvmfSubsystemWhereInput bpsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_GT);
        return this;
    }

    public void setBpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_GT);
        }
    }

    public boolean getBpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_GT);
    }

    public NvmfSubsystemWhereInput bpsGte(Long bpsGte) {

        this.bpsGte = bpsGte;
        return this;
    }

    /**
     * Get bpsGte
     *
     * @return bpsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsGte() {
        return bpsGte;
    }

    public void setBpsGte(Long bpsGte) {
        this.bpsGte = bpsGte;
    }

    public NvmfSubsystemWhereInput bpsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_GTE);
        return this;
    }

    public void setBpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_GTE);
        }
    }

    public boolean getBpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_GTE);
    }

    public NvmfSubsystemWhereInput bpsIn(List<Long> bpsIn) {

        this.bpsIn = bpsIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsInItem(Long bpsInItem) {
        if (this.bpsIn == null) {
            this.bpsIn = new ArrayList<Long>();
        }
        this.bpsIn.add(bpsInItem);
        return this;
    }

    /**
     * Get bpsIn
     *
     * @return bpsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsIn() {
        return bpsIn;
    }

    public void setBpsIn(List<Long> bpsIn) {
        this.bpsIn = bpsIn;
    }

    public NvmfSubsystemWhereInput bpsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_IN);
        return this;
    }

    public void setBpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_IN);
        }
    }

    public boolean getBpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_IN);
    }

    public NvmfSubsystemWhereInput bpsLt(Long bpsLt) {

        this.bpsLt = bpsLt;
        return this;
    }

    /**
     * Get bpsLt
     *
     * @return bpsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsLt() {
        return bpsLt;
    }

    public void setBpsLt(Long bpsLt) {
        this.bpsLt = bpsLt;
    }

    public NvmfSubsystemWhereInput bpsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_LT);
        return this;
    }

    public void setBpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_LT);
        }
    }

    public boolean getBpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_LT);
    }

    public NvmfSubsystemWhereInput bpsLte(Long bpsLte) {

        this.bpsLte = bpsLte;
        return this;
    }

    /**
     * Get bpsLte
     *
     * @return bpsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsLte() {
        return bpsLte;
    }

    public void setBpsLte(Long bpsLte) {
        this.bpsLte = bpsLte;
    }

    public NvmfSubsystemWhereInput bpsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_LTE);
        return this;
    }

    public void setBpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_LTE);
        }
    }

    public boolean getBpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_LTE);
    }

    public NvmfSubsystemWhereInput bpsMax(Long bpsMax) {

        this.bpsMax = bpsMax;
        return this;
    }

    /**
     * Get bpsMax
     *
     * @return bpsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMax() {
        return bpsMax;
    }

    public void setBpsMax(Long bpsMax) {
        this.bpsMax = bpsMax;
    }

    public NvmfSubsystemWhereInput bpsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public void setBpsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX);
        }
    }

    public boolean getBpsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX);
    }

    public NvmfSubsystemWhereInput bpsMaxGt(Long bpsMaxGt) {

        this.bpsMaxGt = bpsMaxGt;
        return this;
    }

    /**
     * Get bpsMaxGt
     *
     * @return bpsMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxGt() {
        return bpsMaxGt;
    }

    public void setBpsMaxGt(Long bpsMaxGt) {
        this.bpsMaxGt = bpsMaxGt;
    }

    public NvmfSubsystemWhereInput bpsMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_GT);
        return this;
    }

    public void setBpsMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_GT);
        }
    }

    public boolean getBpsMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_GT);
    }

    public NvmfSubsystemWhereInput bpsMaxGte(Long bpsMaxGte) {

        this.bpsMaxGte = bpsMaxGte;
        return this;
    }

    /**
     * Get bpsMaxGte
     *
     * @return bpsMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxGte() {
        return bpsMaxGte;
    }

    public void setBpsMaxGte(Long bpsMaxGte) {
        this.bpsMaxGte = bpsMaxGte;
    }

    public NvmfSubsystemWhereInput bpsMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_GTE);
        return this;
    }

    public void setBpsMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_GTE);
        }
    }

    public boolean getBpsMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_GTE);
    }

    public NvmfSubsystemWhereInput bpsMaxIn(List<Long> bpsMaxIn) {

        this.bpsMaxIn = bpsMaxIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsMaxInItem(Long bpsMaxInItem) {
        if (this.bpsMaxIn == null) {
            this.bpsMaxIn = new ArrayList<Long>();
        }
        this.bpsMaxIn.add(bpsMaxInItem);
        return this;
    }

    /**
     * Get bpsMaxIn
     *
     * @return bpsMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsMaxIn() {
        return bpsMaxIn;
    }

    public void setBpsMaxIn(List<Long> bpsMaxIn) {
        this.bpsMaxIn = bpsMaxIn;
    }

    public NvmfSubsystemWhereInput bpsMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_IN);
        return this;
    }

    public void setBpsMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_IN);
        }
    }

    public boolean getBpsMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_IN);
    }

    public NvmfSubsystemWhereInput bpsMaxLength(Long bpsMaxLength) {

        this.bpsMaxLength = bpsMaxLength;
        return this;
    }

    /**
     * Get bpsMaxLength
     *
     * @return bpsMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLength() {
        return bpsMaxLength;
    }

    public void setBpsMaxLength(Long bpsMaxLength) {
        this.bpsMaxLength = bpsMaxLength;
    }

    public NvmfSubsystemWhereInput bpsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public void setBpsMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH);
        }
    }

    public boolean getBpsMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthGt(Long bpsMaxLengthGt) {

        this.bpsMaxLengthGt = bpsMaxLengthGt;
        return this;
    }

    /**
     * Get bpsMaxLengthGt
     *
     * @return bpsMaxLengthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLengthGt() {
        return bpsMaxLengthGt;
    }

    public void setBpsMaxLengthGt(Long bpsMaxLengthGt) {
        this.bpsMaxLengthGt = bpsMaxLengthGt;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_GT);
        return this;
    }

    public void setBpsMaxLengthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_GT);
        }
    }

    public boolean getBpsMaxLengthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_GT);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthGte(Long bpsMaxLengthGte) {

        this.bpsMaxLengthGte = bpsMaxLengthGte;
        return this;
    }

    /**
     * Get bpsMaxLengthGte
     *
     * @return bpsMaxLengthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLengthGte() {
        return bpsMaxLengthGte;
    }

    public void setBpsMaxLengthGte(Long bpsMaxLengthGte) {
        this.bpsMaxLengthGte = bpsMaxLengthGte;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE);
        return this;
    }

    public void setBpsMaxLengthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE);
        }
    }

    public boolean getBpsMaxLengthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthIn(List<Long> bpsMaxLengthIn) {

        this.bpsMaxLengthIn = bpsMaxLengthIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsMaxLengthInItem(Long bpsMaxLengthInItem) {
        if (this.bpsMaxLengthIn == null) {
            this.bpsMaxLengthIn = new ArrayList<Long>();
        }
        this.bpsMaxLengthIn.add(bpsMaxLengthInItem);
        return this;
    }

    /**
     * Get bpsMaxLengthIn
     *
     * @return bpsMaxLengthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsMaxLengthIn() {
        return bpsMaxLengthIn;
    }

    public void setBpsMaxLengthIn(List<Long> bpsMaxLengthIn) {
        this.bpsMaxLengthIn = bpsMaxLengthIn;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_IN);
        return this;
    }

    public void setBpsMaxLengthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_IN);
        }
    }

    public boolean getBpsMaxLengthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_IN);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthLt(Long bpsMaxLengthLt) {

        this.bpsMaxLengthLt = bpsMaxLengthLt;
        return this;
    }

    /**
     * Get bpsMaxLengthLt
     *
     * @return bpsMaxLengthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLengthLt() {
        return bpsMaxLengthLt;
    }

    public void setBpsMaxLengthLt(Long bpsMaxLengthLt) {
        this.bpsMaxLengthLt = bpsMaxLengthLt;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_LT);
        return this;
    }

    public void setBpsMaxLengthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_LT);
        }
    }

    public boolean getBpsMaxLengthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_LT);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthLte(Long bpsMaxLengthLte) {

        this.bpsMaxLengthLte = bpsMaxLengthLte;
        return this;
    }

    /**
     * Get bpsMaxLengthLte
     *
     * @return bpsMaxLengthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLengthLte() {
        return bpsMaxLengthLte;
    }

    public void setBpsMaxLengthLte(Long bpsMaxLengthLte) {
        this.bpsMaxLengthLte = bpsMaxLengthLte;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE);
        return this;
    }

    public void setBpsMaxLengthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE);
        }
    }

    public boolean getBpsMaxLengthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthNot(Long bpsMaxLengthNot) {

        this.bpsMaxLengthNot = bpsMaxLengthNot;
        return this;
    }

    /**
     * Get bpsMaxLengthNot
     *
     * @return bpsMaxLengthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLengthNot() {
        return bpsMaxLengthNot;
    }

    public void setBpsMaxLengthNot(Long bpsMaxLengthNot) {
        this.bpsMaxLengthNot = bpsMaxLengthNot;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT);
        return this;
    }

    public void setBpsMaxLengthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT);
        }
    }

    public boolean getBpsMaxLengthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT);
    }

    public NvmfSubsystemWhereInput bpsMaxLengthNotIn(List<Long> bpsMaxLengthNotIn) {

        this.bpsMaxLengthNotIn = bpsMaxLengthNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsMaxLengthNotInItem(Long bpsMaxLengthNotInItem) {
        if (this.bpsMaxLengthNotIn == null) {
            this.bpsMaxLengthNotIn = new ArrayList<Long>();
        }
        this.bpsMaxLengthNotIn.add(bpsMaxLengthNotInItem);
        return this;
    }

    /**
     * Get bpsMaxLengthNotIn
     *
     * @return bpsMaxLengthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsMaxLengthNotIn() {
        return bpsMaxLengthNotIn;
    }

    public void setBpsMaxLengthNotIn(List<Long> bpsMaxLengthNotIn) {
        this.bpsMaxLengthNotIn = bpsMaxLengthNotIn;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLengthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN);
        return this;
    }

    public void setBpsMaxLengthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN);
        }
    }

    public boolean getBpsMaxLengthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsMaxLt(Long bpsMaxLt) {

        this.bpsMaxLt = bpsMaxLt;
        return this;
    }

    /**
     * Get bpsMaxLt
     *
     * @return bpsMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLt() {
        return bpsMaxLt;
    }

    public void setBpsMaxLt(Long bpsMaxLt) {
        this.bpsMaxLt = bpsMaxLt;
    }

    public NvmfSubsystemWhereInput bpsMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LT);
        return this;
    }

    public void setBpsMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LT);
        }
    }

    public boolean getBpsMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LT);
    }

    public NvmfSubsystemWhereInput bpsMaxLte(Long bpsMaxLte) {

        this.bpsMaxLte = bpsMaxLte;
        return this;
    }

    /**
     * Get bpsMaxLte
     *
     * @return bpsMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLte() {
        return bpsMaxLte;
    }

    public void setBpsMaxLte(Long bpsMaxLte) {
        this.bpsMaxLte = bpsMaxLte;
    }

    public NvmfSubsystemWhereInput bpsMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LTE);
        return this;
    }

    public void setBpsMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LTE);
        }
    }

    public boolean getBpsMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LTE);
    }

    public NvmfSubsystemWhereInput bpsMaxNot(Long bpsMaxNot) {

        this.bpsMaxNot = bpsMaxNot;
        return this;
    }

    /**
     * Get bpsMaxNot
     *
     * @return bpsMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxNot() {
        return bpsMaxNot;
    }

    public void setBpsMaxNot(Long bpsMaxNot) {
        this.bpsMaxNot = bpsMaxNot;
    }

    public NvmfSubsystemWhereInput bpsMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_NOT);
        return this;
    }

    public void setBpsMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_NOT);
        }
    }

    public boolean getBpsMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_NOT);
    }

    public NvmfSubsystemWhereInput bpsMaxNotIn(List<Long> bpsMaxNotIn) {

        this.bpsMaxNotIn = bpsMaxNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsMaxNotInItem(Long bpsMaxNotInItem) {
        if (this.bpsMaxNotIn == null) {
            this.bpsMaxNotIn = new ArrayList<Long>();
        }
        this.bpsMaxNotIn.add(bpsMaxNotInItem);
        return this;
    }

    /**
     * Get bpsMaxNotIn
     *
     * @return bpsMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsMaxNotIn() {
        return bpsMaxNotIn;
    }

    public void setBpsMaxNotIn(List<Long> bpsMaxNotIn) {
        this.bpsMaxNotIn = bpsMaxNotIn;
    }

    public NvmfSubsystemWhereInput bpsMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_NOT_IN);
        return this;
    }

    public void setBpsMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_NOT_IN);
        }
    }

    public boolean getBpsMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsNot(Long bpsNot) {

        this.bpsNot = bpsNot;
        return this;
    }

    /**
     * Get bpsNot
     *
     * @return bpsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsNot() {
        return bpsNot;
    }

    public void setBpsNot(Long bpsNot) {
        this.bpsNot = bpsNot;
    }

    public NvmfSubsystemWhereInput bpsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_NOT);
        return this;
    }

    public void setBpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_NOT);
        }
    }

    public boolean getBpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_NOT);
    }

    public NvmfSubsystemWhereInput bpsNotIn(List<Long> bpsNotIn) {

        this.bpsNotIn = bpsNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsNotInItem(Long bpsNotInItem) {
        if (this.bpsNotIn == null) {
            this.bpsNotIn = new ArrayList<Long>();
        }
        this.bpsNotIn.add(bpsNotInItem);
        return this;
    }

    /**
     * Get bpsNotIn
     *
     * @return bpsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsNotIn() {
        return bpsNotIn;
    }

    public void setBpsNotIn(List<Long> bpsNotIn) {
        this.bpsNotIn = bpsNotIn;
    }

    public NvmfSubsystemWhereInput bpsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_NOT_IN);
        return this;
    }

    public void setBpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_NOT_IN);
        }
    }

    public boolean getBpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsRd(Long bpsRd) {

        this.bpsRd = bpsRd;
        return this;
    }

    /**
     * Get bpsRd
     *
     * @return bpsRd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRd() {
        return bpsRd;
    }

    public void setBpsRd(Long bpsRd) {
        this.bpsRd = bpsRd;
    }

    public NvmfSubsystemWhereInput bpsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public void setBpsRd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD);
        }
    }

    public boolean getBpsRd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD);
    }

    public NvmfSubsystemWhereInput bpsRdGt(Long bpsRdGt) {

        this.bpsRdGt = bpsRdGt;
        return this;
    }

    /**
     * Get bpsRdGt
     *
     * @return bpsRdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdGt() {
        return bpsRdGt;
    }

    public void setBpsRdGt(Long bpsRdGt) {
        this.bpsRdGt = bpsRdGt;
    }

    public NvmfSubsystemWhereInput bpsRdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_GT);
        return this;
    }

    public void setBpsRdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_GT);
        }
    }

    public boolean getBpsRdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_GT);
    }

    public NvmfSubsystemWhereInput bpsRdGte(Long bpsRdGte) {

        this.bpsRdGte = bpsRdGte;
        return this;
    }

    /**
     * Get bpsRdGte
     *
     * @return bpsRdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdGte() {
        return bpsRdGte;
    }

    public void setBpsRdGte(Long bpsRdGte) {
        this.bpsRdGte = bpsRdGte;
    }

    public NvmfSubsystemWhereInput bpsRdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_GTE);
        return this;
    }

    public void setBpsRdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_GTE);
        }
    }

    public boolean getBpsRdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_GTE);
    }

    public NvmfSubsystemWhereInput bpsRdIn(List<Long> bpsRdIn) {

        this.bpsRdIn = bpsRdIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsRdInItem(Long bpsRdInItem) {
        if (this.bpsRdIn == null) {
            this.bpsRdIn = new ArrayList<Long>();
        }
        this.bpsRdIn.add(bpsRdInItem);
        return this;
    }

    /**
     * Get bpsRdIn
     *
     * @return bpsRdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsRdIn() {
        return bpsRdIn;
    }

    public void setBpsRdIn(List<Long> bpsRdIn) {
        this.bpsRdIn = bpsRdIn;
    }

    public NvmfSubsystemWhereInput bpsRdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_IN);
        return this;
    }

    public void setBpsRdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_IN);
        }
    }

    public boolean getBpsRdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_IN);
    }

    public NvmfSubsystemWhereInput bpsRdLt(Long bpsRdLt) {

        this.bpsRdLt = bpsRdLt;
        return this;
    }

    /**
     * Get bpsRdLt
     *
     * @return bpsRdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdLt() {
        return bpsRdLt;
    }

    public void setBpsRdLt(Long bpsRdLt) {
        this.bpsRdLt = bpsRdLt;
    }

    public NvmfSubsystemWhereInput bpsRdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_LT);
        return this;
    }

    public void setBpsRdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_LT);
        }
    }

    public boolean getBpsRdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_LT);
    }

    public NvmfSubsystemWhereInput bpsRdLte(Long bpsRdLte) {

        this.bpsRdLte = bpsRdLte;
        return this;
    }

    /**
     * Get bpsRdLte
     *
     * @return bpsRdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdLte() {
        return bpsRdLte;
    }

    public void setBpsRdLte(Long bpsRdLte) {
        this.bpsRdLte = bpsRdLte;
    }

    public NvmfSubsystemWhereInput bpsRdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_LTE);
        return this;
    }

    public void setBpsRdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_LTE);
        }
    }

    public boolean getBpsRdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_LTE);
    }

    public NvmfSubsystemWhereInput bpsRdMax(Long bpsRdMax) {

        this.bpsRdMax = bpsRdMax;
        return this;
    }

    /**
     * Get bpsRdMax
     *
     * @return bpsRdMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMax() {
        return bpsRdMax;
    }

    public void setBpsRdMax(Long bpsRdMax) {
        this.bpsRdMax = bpsRdMax;
    }

    public NvmfSubsystemWhereInput bpsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public void setBpsRdMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX);
        }
    }

    public boolean getBpsRdMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX);
    }

    public NvmfSubsystemWhereInput bpsRdMaxGt(Long bpsRdMaxGt) {

        this.bpsRdMaxGt = bpsRdMaxGt;
        return this;
    }

    /**
     * Get bpsRdMaxGt
     *
     * @return bpsRdMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxGt() {
        return bpsRdMaxGt;
    }

    public void setBpsRdMaxGt(Long bpsRdMaxGt) {
        this.bpsRdMaxGt = bpsRdMaxGt;
    }

    public NvmfSubsystemWhereInput bpsRdMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_GT);
        return this;
    }

    public void setBpsRdMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_GT);
        }
    }

    public boolean getBpsRdMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_GT);
    }

    public NvmfSubsystemWhereInput bpsRdMaxGte(Long bpsRdMaxGte) {

        this.bpsRdMaxGte = bpsRdMaxGte;
        return this;
    }

    /**
     * Get bpsRdMaxGte
     *
     * @return bpsRdMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxGte() {
        return bpsRdMaxGte;
    }

    public void setBpsRdMaxGte(Long bpsRdMaxGte) {
        this.bpsRdMaxGte = bpsRdMaxGte;
    }

    public NvmfSubsystemWhereInput bpsRdMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_GTE);
        return this;
    }

    public void setBpsRdMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_GTE);
        }
    }

    public boolean getBpsRdMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_GTE);
    }

    public NvmfSubsystemWhereInput bpsRdMaxIn(List<Long> bpsRdMaxIn) {

        this.bpsRdMaxIn = bpsRdMaxIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsRdMaxInItem(Long bpsRdMaxInItem) {
        if (this.bpsRdMaxIn == null) {
            this.bpsRdMaxIn = new ArrayList<Long>();
        }
        this.bpsRdMaxIn.add(bpsRdMaxInItem);
        return this;
    }

    /**
     * Get bpsRdMaxIn
     *
     * @return bpsRdMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsRdMaxIn() {
        return bpsRdMaxIn;
    }

    public void setBpsRdMaxIn(List<Long> bpsRdMaxIn) {
        this.bpsRdMaxIn = bpsRdMaxIn;
    }

    public NvmfSubsystemWhereInput bpsRdMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_IN);
        return this;
    }

    public void setBpsRdMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_IN);
        }
    }

    public boolean getBpsRdMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_IN);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLength(Long bpsRdMaxLength) {

        this.bpsRdMaxLength = bpsRdMaxLength;
        return this;
    }

    /**
     * Get bpsRdMaxLength
     *
     * @return bpsRdMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLength() {
        return bpsRdMaxLength;
    }

    public void setBpsRdMaxLength(Long bpsRdMaxLength) {
        this.bpsRdMaxLength = bpsRdMaxLength;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public void setBpsRdMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        }
    }

    public boolean getBpsRdMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthGt(Long bpsRdMaxLengthGt) {

        this.bpsRdMaxLengthGt = bpsRdMaxLengthGt;
        return this;
    }

    /**
     * Get bpsRdMaxLengthGt
     *
     * @return bpsRdMaxLengthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLengthGt() {
        return bpsRdMaxLengthGt;
    }

    public void setBpsRdMaxLengthGt(Long bpsRdMaxLengthGt) {
        this.bpsRdMaxLengthGt = bpsRdMaxLengthGt;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT);
        return this;
    }

    public void setBpsRdMaxLengthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT);
        }
    }

    public boolean getBpsRdMaxLengthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthGte(Long bpsRdMaxLengthGte) {

        this.bpsRdMaxLengthGte = bpsRdMaxLengthGte;
        return this;
    }

    /**
     * Get bpsRdMaxLengthGte
     *
     * @return bpsRdMaxLengthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLengthGte() {
        return bpsRdMaxLengthGte;
    }

    public void setBpsRdMaxLengthGte(Long bpsRdMaxLengthGte) {
        this.bpsRdMaxLengthGte = bpsRdMaxLengthGte;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE);
        return this;
    }

    public void setBpsRdMaxLengthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE);
        }
    }

    public boolean getBpsRdMaxLengthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthIn(List<Long> bpsRdMaxLengthIn) {

        this.bpsRdMaxLengthIn = bpsRdMaxLengthIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsRdMaxLengthInItem(Long bpsRdMaxLengthInItem) {
        if (this.bpsRdMaxLengthIn == null) {
            this.bpsRdMaxLengthIn = new ArrayList<Long>();
        }
        this.bpsRdMaxLengthIn.add(bpsRdMaxLengthInItem);
        return this;
    }

    /**
     * Get bpsRdMaxLengthIn
     *
     * @return bpsRdMaxLengthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsRdMaxLengthIn() {
        return bpsRdMaxLengthIn;
    }

    public void setBpsRdMaxLengthIn(List<Long> bpsRdMaxLengthIn) {
        this.bpsRdMaxLengthIn = bpsRdMaxLengthIn;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN);
        return this;
    }

    public void setBpsRdMaxLengthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN);
        }
    }

    public boolean getBpsRdMaxLengthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthLt(Long bpsRdMaxLengthLt) {

        this.bpsRdMaxLengthLt = bpsRdMaxLengthLt;
        return this;
    }

    /**
     * Get bpsRdMaxLengthLt
     *
     * @return bpsRdMaxLengthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLengthLt() {
        return bpsRdMaxLengthLt;
    }

    public void setBpsRdMaxLengthLt(Long bpsRdMaxLengthLt) {
        this.bpsRdMaxLengthLt = bpsRdMaxLengthLt;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT);
        return this;
    }

    public void setBpsRdMaxLengthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT);
        }
    }

    public boolean getBpsRdMaxLengthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthLte(Long bpsRdMaxLengthLte) {

        this.bpsRdMaxLengthLte = bpsRdMaxLengthLte;
        return this;
    }

    /**
     * Get bpsRdMaxLengthLte
     *
     * @return bpsRdMaxLengthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLengthLte() {
        return bpsRdMaxLengthLte;
    }

    public void setBpsRdMaxLengthLte(Long bpsRdMaxLengthLte) {
        this.bpsRdMaxLengthLte = bpsRdMaxLengthLte;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE);
        return this;
    }

    public void setBpsRdMaxLengthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE);
        }
    }

    public boolean getBpsRdMaxLengthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthNot(Long bpsRdMaxLengthNot) {

        this.bpsRdMaxLengthNot = bpsRdMaxLengthNot;
        return this;
    }

    /**
     * Get bpsRdMaxLengthNot
     *
     * @return bpsRdMaxLengthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLengthNot() {
        return bpsRdMaxLengthNot;
    }

    public void setBpsRdMaxLengthNot(Long bpsRdMaxLengthNot) {
        this.bpsRdMaxLengthNot = bpsRdMaxLengthNot;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT);
        return this;
    }

    public void setBpsRdMaxLengthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT);
        }
    }

    public boolean getBpsRdMaxLengthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthNotIn(List<Long> bpsRdMaxLengthNotIn) {

        this.bpsRdMaxLengthNotIn = bpsRdMaxLengthNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsRdMaxLengthNotInItem(Long bpsRdMaxLengthNotInItem) {
        if (this.bpsRdMaxLengthNotIn == null) {
            this.bpsRdMaxLengthNotIn = new ArrayList<Long>();
        }
        this.bpsRdMaxLengthNotIn.add(bpsRdMaxLengthNotInItem);
        return this;
    }

    /**
     * Get bpsRdMaxLengthNotIn
     *
     * @return bpsRdMaxLengthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsRdMaxLengthNotIn() {
        return bpsRdMaxLengthNotIn;
    }

    public void setBpsRdMaxLengthNotIn(List<Long> bpsRdMaxLengthNotIn) {
        this.bpsRdMaxLengthNotIn = bpsRdMaxLengthNotIn;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLengthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN);
        return this;
    }

    public void setBpsRdMaxLengthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN);
        }
    }

    public boolean getBpsRdMaxLengthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLt(Long bpsRdMaxLt) {

        this.bpsRdMaxLt = bpsRdMaxLt;
        return this;
    }

    /**
     * Get bpsRdMaxLt
     *
     * @return bpsRdMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLt() {
        return bpsRdMaxLt;
    }

    public void setBpsRdMaxLt(Long bpsRdMaxLt) {
        this.bpsRdMaxLt = bpsRdMaxLt;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LT);
        return this;
    }

    public void setBpsRdMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LT);
        }
    }

    public boolean getBpsRdMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LT);
    }

    public NvmfSubsystemWhereInput bpsRdMaxLte(Long bpsRdMaxLte) {

        this.bpsRdMaxLte = bpsRdMaxLte;
        return this;
    }

    /**
     * Get bpsRdMaxLte
     *
     * @return bpsRdMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLte() {
        return bpsRdMaxLte;
    }

    public void setBpsRdMaxLte(Long bpsRdMaxLte) {
        this.bpsRdMaxLte = bpsRdMaxLte;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LTE);
        return this;
    }

    public void setBpsRdMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LTE);
        }
    }

    public boolean getBpsRdMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LTE);
    }

    public NvmfSubsystemWhereInput bpsRdMaxNot(Long bpsRdMaxNot) {

        this.bpsRdMaxNot = bpsRdMaxNot;
        return this;
    }

    /**
     * Get bpsRdMaxNot
     *
     * @return bpsRdMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxNot() {
        return bpsRdMaxNot;
    }

    public void setBpsRdMaxNot(Long bpsRdMaxNot) {
        this.bpsRdMaxNot = bpsRdMaxNot;
    }

    public NvmfSubsystemWhereInput bpsRdMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_NOT);
        return this;
    }

    public void setBpsRdMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_NOT);
        }
    }

    public boolean getBpsRdMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_NOT);
    }

    public NvmfSubsystemWhereInput bpsRdMaxNotIn(List<Long> bpsRdMaxNotIn) {

        this.bpsRdMaxNotIn = bpsRdMaxNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsRdMaxNotInItem(Long bpsRdMaxNotInItem) {
        if (this.bpsRdMaxNotIn == null) {
            this.bpsRdMaxNotIn = new ArrayList<Long>();
        }
        this.bpsRdMaxNotIn.add(bpsRdMaxNotInItem);
        return this;
    }

    /**
     * Get bpsRdMaxNotIn
     *
     * @return bpsRdMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsRdMaxNotIn() {
        return bpsRdMaxNotIn;
    }

    public void setBpsRdMaxNotIn(List<Long> bpsRdMaxNotIn) {
        this.bpsRdMaxNotIn = bpsRdMaxNotIn;
    }

    public NvmfSubsystemWhereInput bpsRdMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN);
        return this;
    }

    public void setBpsRdMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN);
        }
    }

    public boolean getBpsRdMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsRdNot(Long bpsRdNot) {

        this.bpsRdNot = bpsRdNot;
        return this;
    }

    /**
     * Get bpsRdNot
     *
     * @return bpsRdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdNot() {
        return bpsRdNot;
    }

    public void setBpsRdNot(Long bpsRdNot) {
        this.bpsRdNot = bpsRdNot;
    }

    public NvmfSubsystemWhereInput bpsRdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_NOT);
        return this;
    }

    public void setBpsRdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_NOT);
        }
    }

    public boolean getBpsRdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_NOT);
    }

    public NvmfSubsystemWhereInput bpsRdNotIn(List<Long> bpsRdNotIn) {

        this.bpsRdNotIn = bpsRdNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsRdNotInItem(Long bpsRdNotInItem) {
        if (this.bpsRdNotIn == null) {
            this.bpsRdNotIn = new ArrayList<Long>();
        }
        this.bpsRdNotIn.add(bpsRdNotInItem);
        return this;
    }

    /**
     * Get bpsRdNotIn
     *
     * @return bpsRdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsRdNotIn() {
        return bpsRdNotIn;
    }

    public void setBpsRdNotIn(List<Long> bpsRdNotIn) {
        this.bpsRdNotIn = bpsRdNotIn;
    }

    public NvmfSubsystemWhereInput bpsRdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsRdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_NOT_IN);
        return this;
    }

    public void setBpsRdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_NOT_IN);
        }
    }

    public boolean getBpsRdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsWr(Long bpsWr) {

        this.bpsWr = bpsWr;
        return this;
    }

    /**
     * Get bpsWr
     *
     * @return bpsWr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWr() {
        return bpsWr;
    }

    public void setBpsWr(Long bpsWr) {
        this.bpsWr = bpsWr;
    }

    public NvmfSubsystemWhereInput bpsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public void setBpsWr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR);
        }
    }

    public boolean getBpsWr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR);
    }

    public NvmfSubsystemWhereInput bpsWrGt(Long bpsWrGt) {

        this.bpsWrGt = bpsWrGt;
        return this;
    }

    /**
     * Get bpsWrGt
     *
     * @return bpsWrGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrGt() {
        return bpsWrGt;
    }

    public void setBpsWrGt(Long bpsWrGt) {
        this.bpsWrGt = bpsWrGt;
    }

    public NvmfSubsystemWhereInput bpsWrGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_GT);
        return this;
    }

    public void setBpsWrGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_GT);
        }
    }

    public boolean getBpsWrGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_GT);
    }

    public NvmfSubsystemWhereInput bpsWrGte(Long bpsWrGte) {

        this.bpsWrGte = bpsWrGte;
        return this;
    }

    /**
     * Get bpsWrGte
     *
     * @return bpsWrGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrGte() {
        return bpsWrGte;
    }

    public void setBpsWrGte(Long bpsWrGte) {
        this.bpsWrGte = bpsWrGte;
    }

    public NvmfSubsystemWhereInput bpsWrGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_GTE);
        return this;
    }

    public void setBpsWrGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_GTE);
        }
    }

    public boolean getBpsWrGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_GTE);
    }

    public NvmfSubsystemWhereInput bpsWrIn(List<Long> bpsWrIn) {

        this.bpsWrIn = bpsWrIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsWrInItem(Long bpsWrInItem) {
        if (this.bpsWrIn == null) {
            this.bpsWrIn = new ArrayList<Long>();
        }
        this.bpsWrIn.add(bpsWrInItem);
        return this;
    }

    /**
     * Get bpsWrIn
     *
     * @return bpsWrIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsWrIn() {
        return bpsWrIn;
    }

    public void setBpsWrIn(List<Long> bpsWrIn) {
        this.bpsWrIn = bpsWrIn;
    }

    public NvmfSubsystemWhereInput bpsWrIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_IN);
        return this;
    }

    public void setBpsWrIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_IN);
        }
    }

    public boolean getBpsWrIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_IN);
    }

    public NvmfSubsystemWhereInput bpsWrLt(Long bpsWrLt) {

        this.bpsWrLt = bpsWrLt;
        return this;
    }

    /**
     * Get bpsWrLt
     *
     * @return bpsWrLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrLt() {
        return bpsWrLt;
    }

    public void setBpsWrLt(Long bpsWrLt) {
        this.bpsWrLt = bpsWrLt;
    }

    public NvmfSubsystemWhereInput bpsWrLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_LT);
        return this;
    }

    public void setBpsWrLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_LT);
        }
    }

    public boolean getBpsWrLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_LT);
    }

    public NvmfSubsystemWhereInput bpsWrLte(Long bpsWrLte) {

        this.bpsWrLte = bpsWrLte;
        return this;
    }

    /**
     * Get bpsWrLte
     *
     * @return bpsWrLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrLte() {
        return bpsWrLte;
    }

    public void setBpsWrLte(Long bpsWrLte) {
        this.bpsWrLte = bpsWrLte;
    }

    public NvmfSubsystemWhereInput bpsWrLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_LTE);
        return this;
    }

    public void setBpsWrLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_LTE);
        }
    }

    public boolean getBpsWrLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_LTE);
    }

    public NvmfSubsystemWhereInput bpsWrMax(Long bpsWrMax) {

        this.bpsWrMax = bpsWrMax;
        return this;
    }

    /**
     * Get bpsWrMax
     *
     * @return bpsWrMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMax() {
        return bpsWrMax;
    }

    public void setBpsWrMax(Long bpsWrMax) {
        this.bpsWrMax = bpsWrMax;
    }

    public NvmfSubsystemWhereInput bpsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public void setBpsWrMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX);
        }
    }

    public boolean getBpsWrMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX);
    }

    public NvmfSubsystemWhereInput bpsWrMaxGt(Long bpsWrMaxGt) {

        this.bpsWrMaxGt = bpsWrMaxGt;
        return this;
    }

    /**
     * Get bpsWrMaxGt
     *
     * @return bpsWrMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxGt() {
        return bpsWrMaxGt;
    }

    public void setBpsWrMaxGt(Long bpsWrMaxGt) {
        this.bpsWrMaxGt = bpsWrMaxGt;
    }

    public NvmfSubsystemWhereInput bpsWrMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_GT);
        return this;
    }

    public void setBpsWrMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_GT);
        }
    }

    public boolean getBpsWrMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_GT);
    }

    public NvmfSubsystemWhereInput bpsWrMaxGte(Long bpsWrMaxGte) {

        this.bpsWrMaxGte = bpsWrMaxGte;
        return this;
    }

    /**
     * Get bpsWrMaxGte
     *
     * @return bpsWrMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxGte() {
        return bpsWrMaxGte;
    }

    public void setBpsWrMaxGte(Long bpsWrMaxGte) {
        this.bpsWrMaxGte = bpsWrMaxGte;
    }

    public NvmfSubsystemWhereInput bpsWrMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_GTE);
        return this;
    }

    public void setBpsWrMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_GTE);
        }
    }

    public boolean getBpsWrMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_GTE);
    }

    public NvmfSubsystemWhereInput bpsWrMaxIn(List<Long> bpsWrMaxIn) {

        this.bpsWrMaxIn = bpsWrMaxIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsWrMaxInItem(Long bpsWrMaxInItem) {
        if (this.bpsWrMaxIn == null) {
            this.bpsWrMaxIn = new ArrayList<Long>();
        }
        this.bpsWrMaxIn.add(bpsWrMaxInItem);
        return this;
    }

    /**
     * Get bpsWrMaxIn
     *
     * @return bpsWrMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsWrMaxIn() {
        return bpsWrMaxIn;
    }

    public void setBpsWrMaxIn(List<Long> bpsWrMaxIn) {
        this.bpsWrMaxIn = bpsWrMaxIn;
    }

    public NvmfSubsystemWhereInput bpsWrMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_IN);
        return this;
    }

    public void setBpsWrMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_IN);
        }
    }

    public boolean getBpsWrMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_IN);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLength(Long bpsWrMaxLength) {

        this.bpsWrMaxLength = bpsWrMaxLength;
        return this;
    }

    /**
     * Get bpsWrMaxLength
     *
     * @return bpsWrMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLength() {
        return bpsWrMaxLength;
    }

    public void setBpsWrMaxLength(Long bpsWrMaxLength) {
        this.bpsWrMaxLength = bpsWrMaxLength;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public void setBpsWrMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        }
    }

    public boolean getBpsWrMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthGt(Long bpsWrMaxLengthGt) {

        this.bpsWrMaxLengthGt = bpsWrMaxLengthGt;
        return this;
    }

    /**
     * Get bpsWrMaxLengthGt
     *
     * @return bpsWrMaxLengthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLengthGt() {
        return bpsWrMaxLengthGt;
    }

    public void setBpsWrMaxLengthGt(Long bpsWrMaxLengthGt) {
        this.bpsWrMaxLengthGt = bpsWrMaxLengthGt;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT);
        return this;
    }

    public void setBpsWrMaxLengthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT);
        }
    }

    public boolean getBpsWrMaxLengthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthGte(Long bpsWrMaxLengthGte) {

        this.bpsWrMaxLengthGte = bpsWrMaxLengthGte;
        return this;
    }

    /**
     * Get bpsWrMaxLengthGte
     *
     * @return bpsWrMaxLengthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLengthGte() {
        return bpsWrMaxLengthGte;
    }

    public void setBpsWrMaxLengthGte(Long bpsWrMaxLengthGte) {
        this.bpsWrMaxLengthGte = bpsWrMaxLengthGte;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE);
        return this;
    }

    public void setBpsWrMaxLengthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE);
        }
    }

    public boolean getBpsWrMaxLengthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthIn(List<Long> bpsWrMaxLengthIn) {

        this.bpsWrMaxLengthIn = bpsWrMaxLengthIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsWrMaxLengthInItem(Long bpsWrMaxLengthInItem) {
        if (this.bpsWrMaxLengthIn == null) {
            this.bpsWrMaxLengthIn = new ArrayList<Long>();
        }
        this.bpsWrMaxLengthIn.add(bpsWrMaxLengthInItem);
        return this;
    }

    /**
     * Get bpsWrMaxLengthIn
     *
     * @return bpsWrMaxLengthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsWrMaxLengthIn() {
        return bpsWrMaxLengthIn;
    }

    public void setBpsWrMaxLengthIn(List<Long> bpsWrMaxLengthIn) {
        this.bpsWrMaxLengthIn = bpsWrMaxLengthIn;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN);
        return this;
    }

    public void setBpsWrMaxLengthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN);
        }
    }

    public boolean getBpsWrMaxLengthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthLt(Long bpsWrMaxLengthLt) {

        this.bpsWrMaxLengthLt = bpsWrMaxLengthLt;
        return this;
    }

    /**
     * Get bpsWrMaxLengthLt
     *
     * @return bpsWrMaxLengthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLengthLt() {
        return bpsWrMaxLengthLt;
    }

    public void setBpsWrMaxLengthLt(Long bpsWrMaxLengthLt) {
        this.bpsWrMaxLengthLt = bpsWrMaxLengthLt;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT);
        return this;
    }

    public void setBpsWrMaxLengthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT);
        }
    }

    public boolean getBpsWrMaxLengthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthLte(Long bpsWrMaxLengthLte) {

        this.bpsWrMaxLengthLte = bpsWrMaxLengthLte;
        return this;
    }

    /**
     * Get bpsWrMaxLengthLte
     *
     * @return bpsWrMaxLengthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLengthLte() {
        return bpsWrMaxLengthLte;
    }

    public void setBpsWrMaxLengthLte(Long bpsWrMaxLengthLte) {
        this.bpsWrMaxLengthLte = bpsWrMaxLengthLte;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE);
        return this;
    }

    public void setBpsWrMaxLengthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE);
        }
    }

    public boolean getBpsWrMaxLengthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthNot(Long bpsWrMaxLengthNot) {

        this.bpsWrMaxLengthNot = bpsWrMaxLengthNot;
        return this;
    }

    /**
     * Get bpsWrMaxLengthNot
     *
     * @return bpsWrMaxLengthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLengthNot() {
        return bpsWrMaxLengthNot;
    }

    public void setBpsWrMaxLengthNot(Long bpsWrMaxLengthNot) {
        this.bpsWrMaxLengthNot = bpsWrMaxLengthNot;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT);
        return this;
    }

    public void setBpsWrMaxLengthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT);
        }
    }

    public boolean getBpsWrMaxLengthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthNotIn(List<Long> bpsWrMaxLengthNotIn) {

        this.bpsWrMaxLengthNotIn = bpsWrMaxLengthNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsWrMaxLengthNotInItem(Long bpsWrMaxLengthNotInItem) {
        if (this.bpsWrMaxLengthNotIn == null) {
            this.bpsWrMaxLengthNotIn = new ArrayList<Long>();
        }
        this.bpsWrMaxLengthNotIn.add(bpsWrMaxLengthNotInItem);
        return this;
    }

    /**
     * Get bpsWrMaxLengthNotIn
     *
     * @return bpsWrMaxLengthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsWrMaxLengthNotIn() {
        return bpsWrMaxLengthNotIn;
    }

    public void setBpsWrMaxLengthNotIn(List<Long> bpsWrMaxLengthNotIn) {
        this.bpsWrMaxLengthNotIn = bpsWrMaxLengthNotIn;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLengthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN);
        return this;
    }

    public void setBpsWrMaxLengthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN);
        }
    }

    public boolean getBpsWrMaxLengthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLt(Long bpsWrMaxLt) {

        this.bpsWrMaxLt = bpsWrMaxLt;
        return this;
    }

    /**
     * Get bpsWrMaxLt
     *
     * @return bpsWrMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLt() {
        return bpsWrMaxLt;
    }

    public void setBpsWrMaxLt(Long bpsWrMaxLt) {
        this.bpsWrMaxLt = bpsWrMaxLt;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LT);
        return this;
    }

    public void setBpsWrMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LT);
        }
    }

    public boolean getBpsWrMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LT);
    }

    public NvmfSubsystemWhereInput bpsWrMaxLte(Long bpsWrMaxLte) {

        this.bpsWrMaxLte = bpsWrMaxLte;
        return this;
    }

    /**
     * Get bpsWrMaxLte
     *
     * @return bpsWrMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLte() {
        return bpsWrMaxLte;
    }

    public void setBpsWrMaxLte(Long bpsWrMaxLte) {
        this.bpsWrMaxLte = bpsWrMaxLte;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LTE);
        return this;
    }

    public void setBpsWrMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LTE);
        }
    }

    public boolean getBpsWrMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LTE);
    }

    public NvmfSubsystemWhereInput bpsWrMaxNot(Long bpsWrMaxNot) {

        this.bpsWrMaxNot = bpsWrMaxNot;
        return this;
    }

    /**
     * Get bpsWrMaxNot
     *
     * @return bpsWrMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxNot() {
        return bpsWrMaxNot;
    }

    public void setBpsWrMaxNot(Long bpsWrMaxNot) {
        this.bpsWrMaxNot = bpsWrMaxNot;
    }

    public NvmfSubsystemWhereInput bpsWrMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_NOT);
        return this;
    }

    public void setBpsWrMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_NOT);
        }
    }

    public boolean getBpsWrMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_NOT);
    }

    public NvmfSubsystemWhereInput bpsWrMaxNotIn(List<Long> bpsWrMaxNotIn) {

        this.bpsWrMaxNotIn = bpsWrMaxNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsWrMaxNotInItem(Long bpsWrMaxNotInItem) {
        if (this.bpsWrMaxNotIn == null) {
            this.bpsWrMaxNotIn = new ArrayList<Long>();
        }
        this.bpsWrMaxNotIn.add(bpsWrMaxNotInItem);
        return this;
    }

    /**
     * Get bpsWrMaxNotIn
     *
     * @return bpsWrMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsWrMaxNotIn() {
        return bpsWrMaxNotIn;
    }

    public void setBpsWrMaxNotIn(List<Long> bpsWrMaxNotIn) {
        this.bpsWrMaxNotIn = bpsWrMaxNotIn;
    }

    public NvmfSubsystemWhereInput bpsWrMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN);
        return this;
    }

    public void setBpsWrMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN);
        }
    }

    public boolean getBpsWrMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN);
    }

    public NvmfSubsystemWhereInput bpsWrNot(Long bpsWrNot) {

        this.bpsWrNot = bpsWrNot;
        return this;
    }

    /**
     * Get bpsWrNot
     *
     * @return bpsWrNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrNot() {
        return bpsWrNot;
    }

    public void setBpsWrNot(Long bpsWrNot) {
        this.bpsWrNot = bpsWrNot;
    }

    public NvmfSubsystemWhereInput bpsWrNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_NOT);
        return this;
    }

    public void setBpsWrNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_NOT);
        }
    }

    public boolean getBpsWrNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_NOT);
    }

    public NvmfSubsystemWhereInput bpsWrNotIn(List<Long> bpsWrNotIn) {

        this.bpsWrNotIn = bpsWrNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addBpsWrNotInItem(Long bpsWrNotInItem) {
        if (this.bpsWrNotIn == null) {
            this.bpsWrNotIn = new ArrayList<Long>();
        }
        this.bpsWrNotIn.add(bpsWrNotInItem);
        return this;
    }

    /**
     * Get bpsWrNotIn
     *
     * @return bpsWrNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBpsWrNotIn() {
        return bpsWrNotIn;
    }

    public void setBpsWrNotIn(List<Long> bpsWrNotIn) {
        this.bpsWrNotIn = bpsWrNotIn;
    }

    public NvmfSubsystemWhereInput bpsWrNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput bpsWrNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_NOT_IN);
        return this;
    }

    public void setBpsWrNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_NOT_IN);
        }
    }

    public boolean getBpsWrNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_NOT_IN);
    }

    public NvmfSubsystemWhereInput businessHostGroupsEvery(
            BusinessHostGroupWhereInput businessHostGroupsEvery) {

        this.businessHostGroupsEvery = businessHostGroupsEvery;
        return this;
    }

    /**
     * Get businessHostGroupsEvery
     *
     * @return businessHostGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostGroupWhereInput getBusinessHostGroupsEvery() {
        return businessHostGroupsEvery;
    }

    public void setBusinessHostGroupsEvery(BusinessHostGroupWhereInput businessHostGroupsEvery) {
        this.businessHostGroupsEvery = businessHostGroupsEvery;
    }

    public NvmfSubsystemWhereInput businessHostGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY);
        return this;
    }

    public NvmfSubsystemWhereInput businessHostGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY);
        return this;
    }

    public void setBusinessHostGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY);
        }
    }

    public boolean getBusinessHostGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_EVERY);
    }

    public NvmfSubsystemWhereInput businessHostGroupsNone(
            BusinessHostGroupWhereInput businessHostGroupsNone) {

        this.businessHostGroupsNone = businessHostGroupsNone;
        return this;
    }

    /**
     * Get businessHostGroupsNone
     *
     * @return businessHostGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostGroupWhereInput getBusinessHostGroupsNone() {
        return businessHostGroupsNone;
    }

    public void setBusinessHostGroupsNone(BusinessHostGroupWhereInput businessHostGroupsNone) {
        this.businessHostGroupsNone = businessHostGroupsNone;
    }

    public NvmfSubsystemWhereInput businessHostGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE);
        return this;
    }

    public NvmfSubsystemWhereInput businessHostGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE);
        return this;
    }

    public void setBusinessHostGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE);
        }
    }

    public boolean getBusinessHostGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_NONE);
    }

    public NvmfSubsystemWhereInput businessHostGroupsSome(
            BusinessHostGroupWhereInput businessHostGroupsSome) {

        this.businessHostGroupsSome = businessHostGroupsSome;
        return this;
    }

    /**
     * Get businessHostGroupsSome
     *
     * @return businessHostGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostGroupWhereInput getBusinessHostGroupsSome() {
        return businessHostGroupsSome;
    }

    public void setBusinessHostGroupsSome(BusinessHostGroupWhereInput businessHostGroupsSome) {
        this.businessHostGroupsSome = businessHostGroupsSome;
    }

    public NvmfSubsystemWhereInput businessHostGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME);
        return this;
    }

    public NvmfSubsystemWhereInput businessHostGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME);
        return this;
    }

    public void setBusinessHostGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME);
        }
    }

    public boolean getBusinessHostGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_GROUPS_SOME);
    }

    public NvmfSubsystemWhereInput businessHostsEvery(BusinessHostWhereInput businessHostsEvery) {

        this.businessHostsEvery = businessHostsEvery;
        return this;
    }

    /**
     * Get businessHostsEvery
     *
     * @return businessHostsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostWhereInput getBusinessHostsEvery() {
        return businessHostsEvery;
    }

    public void setBusinessHostsEvery(BusinessHostWhereInput businessHostsEvery) {
        this.businessHostsEvery = businessHostsEvery;
    }

    public NvmfSubsystemWhereInput businessHostsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS_EVERY);
        return this;
    }

    public NvmfSubsystemWhereInput businessHostsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS_EVERY);
        return this;
    }

    public void setBusinessHostsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS_EVERY);
        }
    }

    public boolean getBusinessHostsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOSTS_EVERY);
    }

    public NvmfSubsystemWhereInput businessHostsNone(BusinessHostWhereInput businessHostsNone) {

        this.businessHostsNone = businessHostsNone;
        return this;
    }

    /**
     * Get businessHostsNone
     *
     * @return businessHostsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostWhereInput getBusinessHostsNone() {
        return businessHostsNone;
    }

    public void setBusinessHostsNone(BusinessHostWhereInput businessHostsNone) {
        this.businessHostsNone = businessHostsNone;
    }

    public NvmfSubsystemWhereInput businessHostsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS_NONE);
        return this;
    }

    public NvmfSubsystemWhereInput businessHostsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS_NONE);
        return this;
    }

    public void setBusinessHostsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS_NONE);
        }
    }

    public boolean getBusinessHostsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOSTS_NONE);
    }

    public NvmfSubsystemWhereInput businessHostsSome(BusinessHostWhereInput businessHostsSome) {

        this.businessHostsSome = businessHostsSome;
        return this;
    }

    /**
     * Get businessHostsSome
     *
     * @return businessHostsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BusinessHostWhereInput getBusinessHostsSome() {
        return businessHostsSome;
    }

    public void setBusinessHostsSome(BusinessHostWhereInput businessHostsSome) {
        this.businessHostsSome = businessHostsSome;
    }

    public NvmfSubsystemWhereInput businessHostsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS_SOME);
        return this;
    }

    public NvmfSubsystemWhereInput businessHostsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS_SOME);
        return this;
    }

    public void setBusinessHostsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS_SOME);
        }
    }

    public boolean getBusinessHostsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOSTS_SOME);
    }

    public NvmfSubsystemWhereInput cluster(ClusterWhereInput cluster) {

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

    public NvmfSubsystemWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public NvmfSubsystemWhereInput cluster_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput configurationAdaptive(Boolean configurationAdaptive) {

        this.configurationAdaptive = configurationAdaptive;
        return this;
    }

    /**
     * Get configurationAdaptive
     *
     * @return configurationAdaptive
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getConfigurationAdaptive() {
        return configurationAdaptive;
    }

    public void setConfigurationAdaptive(Boolean configurationAdaptive) {
        this.configurationAdaptive = configurationAdaptive;
    }

    public NvmfSubsystemWhereInput configurationAdaptive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        return this;
    }

    public NvmfSubsystemWhereInput configurationAdaptive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        return this;
    }

    public void setConfigurationAdaptive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        }
    }

    public boolean getConfigurationAdaptive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
    }

    public NvmfSubsystemWhereInput configurationAdaptiveNot(Boolean configurationAdaptiveNot) {

        this.configurationAdaptiveNot = configurationAdaptiveNot;
        return this;
    }

    /**
     * Get configurationAdaptiveNot
     *
     * @return configurationAdaptiveNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getConfigurationAdaptiveNot() {
        return configurationAdaptiveNot;
    }

    public void setConfigurationAdaptiveNot(Boolean configurationAdaptiveNot) {
        this.configurationAdaptiveNot = configurationAdaptiveNot;
    }

    public NvmfSubsystemWhereInput configurationAdaptiveNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput configurationAdaptiveNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT);
        return this;
    }

    public void setConfigurationAdaptiveNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT);
        }
    }

    public boolean getConfigurationAdaptiveNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE_NOT);
    }

    public NvmfSubsystemWhereInput configurationMethod(ConfigurationMethod configurationMethod) {

        this.configurationMethod = configurationMethod;
        return this;
    }

    /**
     * Get configurationMethod
     *
     * @return configurationMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConfigurationMethod getConfigurationMethod() {
        return configurationMethod;
    }

    public void setConfigurationMethod(ConfigurationMethod configurationMethod) {
        this.configurationMethod = configurationMethod;
    }

    public NvmfSubsystemWhereInput configurationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public NvmfSubsystemWhereInput configurationMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public void setConfigurationMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD);
        }
    }

    public boolean getConfigurationMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_METHOD);
    }

    public NvmfSubsystemWhereInput configurationMethodIn(
            List<ConfigurationMethod> configurationMethodIn) {

        this.configurationMethodIn = configurationMethodIn;
        return this;
    }

    public NvmfSubsystemWhereInput addConfigurationMethodInItem(
            ConfigurationMethod configurationMethodInItem) {
        if (this.configurationMethodIn == null) {
            this.configurationMethodIn = new ArrayList<ConfigurationMethod>();
        }
        this.configurationMethodIn.add(configurationMethodInItem);
        return this;
    }

    /**
     * Get configurationMethodIn
     *
     * @return configurationMethodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConfigurationMethod> getConfigurationMethodIn() {
        return configurationMethodIn;
    }

    public void setConfigurationMethodIn(List<ConfigurationMethod> configurationMethodIn) {
        this.configurationMethodIn = configurationMethodIn;
    }

    public NvmfSubsystemWhereInput configurationMethodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD_IN);
        return this;
    }

    public NvmfSubsystemWhereInput configurationMethodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD_IN);
        return this;
    }

    public void setConfigurationMethodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD_IN);
        }
    }

    public boolean getConfigurationMethodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_METHOD_IN);
    }

    public NvmfSubsystemWhereInput configurationMethodNot(
            ConfigurationMethod configurationMethodNot) {

        this.configurationMethodNot = configurationMethodNot;
        return this;
    }

    /**
     * Get configurationMethodNot
     *
     * @return configurationMethodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConfigurationMethod getConfigurationMethodNot() {
        return configurationMethodNot;
    }

    public void setConfigurationMethodNot(ConfigurationMethod configurationMethodNot) {
        this.configurationMethodNot = configurationMethodNot;
    }

    public NvmfSubsystemWhereInput configurationMethodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput configurationMethodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT);
        return this;
    }

    public void setConfigurationMethodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT);
        }
    }

    public boolean getConfigurationMethodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT);
    }

    public NvmfSubsystemWhereInput configurationMethodNotIn(
            List<ConfigurationMethod> configurationMethodNotIn) {

        this.configurationMethodNotIn = configurationMethodNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addConfigurationMethodNotInItem(
            ConfigurationMethod configurationMethodNotInItem) {
        if (this.configurationMethodNotIn == null) {
            this.configurationMethodNotIn = new ArrayList<ConfigurationMethod>();
        }
        this.configurationMethodNotIn.add(configurationMethodNotInItem);
        return this;
    }

    /**
     * Get configurationMethodNotIn
     *
     * @return configurationMethodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConfigurationMethod> getConfigurationMethodNotIn() {
        return configurationMethodNotIn;
    }

    public void setConfigurationMethodNotIn(List<ConfigurationMethod> configurationMethodNotIn) {
        this.configurationMethodNotIn = configurationMethodNotIn;
    }

    public NvmfSubsystemWhereInput configurationMethodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput configurationMethodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN);
        return this;
    }

    public void setConfigurationMethodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN);
        }
    }

    public boolean getConfigurationMethodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_METHOD_NOT_IN);
    }

    public NvmfSubsystemWhereInput description(String description) {

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

    public NvmfSubsystemWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public NvmfSubsystemWhereInput description_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionContains(String descriptionContains) {

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

    public NvmfSubsystemWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public NvmfSubsystemWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionGt(String descriptionGt) {

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

    public NvmfSubsystemWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionGte(String descriptionGte) {

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

    public NvmfSubsystemWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public NvmfSubsystemWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public NvmfSubsystemWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionLt(String descriptionLt) {

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

    public NvmfSubsystemWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionLte(String descriptionLte) {

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

    public NvmfSubsystemWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionNot(String descriptionNot) {

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

    public NvmfSubsystemWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public NvmfSubsystemWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public NvmfSubsystemWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public NvmfSubsystemWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public NvmfSubsystemWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public NvmfSubsystemWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecK(Integer ecK) {

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

    public NvmfSubsystemWhereInput ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NvmfSubsystemWhereInput ecK_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKGt(Integer ecKGt) {

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

    public NvmfSubsystemWhereInput ecKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public NvmfSubsystemWhereInput ecKGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKGte(Integer ecKGte) {

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

    public NvmfSubsystemWhereInput ecKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput ecKGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKIn(List<Integer> ecKIn) {

        this.ecKIn = ecKIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEcKInItem(Integer ecKInItem) {
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

    public NvmfSubsystemWhereInput ecKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ecKIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKLt(Integer ecKLt) {

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

    public NvmfSubsystemWhereInput ecKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public NvmfSubsystemWhereInput ecKLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKLte(Integer ecKLte) {

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

    public NvmfSubsystemWhereInput ecKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput ecKLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKNot(Integer ecKNot) {

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

    public NvmfSubsystemWhereInput ecKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput ecKNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecKNotIn(List<Integer> ecKNotIn) {

        this.ecKNotIn = ecKNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEcKNotInItem(Integer ecKNotInItem) {
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

    public NvmfSubsystemWhereInput ecKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ecKNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecM(Integer ecM) {

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

    public NvmfSubsystemWhereInput ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NvmfSubsystemWhereInput ecM_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMGt(Integer ecMGt) {

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

    public NvmfSubsystemWhereInput ecMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public NvmfSubsystemWhereInput ecMGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMGte(Integer ecMGte) {

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

    public NvmfSubsystemWhereInput ecMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput ecMGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMIn(List<Integer> ecMIn) {

        this.ecMIn = ecMIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEcMInItem(Integer ecMInItem) {
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

    public NvmfSubsystemWhereInput ecMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ecMIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMLt(Integer ecMLt) {

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

    public NvmfSubsystemWhereInput ecMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public NvmfSubsystemWhereInput ecMLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMLte(Integer ecMLte) {

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

    public NvmfSubsystemWhereInput ecMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput ecMLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMNot(Integer ecMNot) {

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

    public NvmfSubsystemWhereInput ecMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput ecMNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ecMNotIn(List<Integer> ecMNotIn) {

        this.ecMNotIn = ecMNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEcMNotInItem(Integer ecMNotInItem) {
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

    public NvmfSubsystemWhereInput ecMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ecMNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput encryptMethod(EncryptMethod encryptMethod) {

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

    public NvmfSubsystemWhereInput encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NvmfSubsystemWhereInput encryptMethod_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput encryptMethodIn(List<EncryptMethod> encryptMethodIn) {

        this.encryptMethodIn = encryptMethodIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEncryptMethodInItem(EncryptMethod encryptMethodInItem) {
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

    public NvmfSubsystemWhereInput encryptMethodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_IN);
        return this;
    }

    public NvmfSubsystemWhereInput encryptMethodIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput encryptMethodNot(EncryptMethod encryptMethodNot) {

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

    public NvmfSubsystemWhereInput encryptMethodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput encryptMethodNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput encryptMethodNotIn(List<EncryptMethod> encryptMethodNotIn) {

        this.encryptMethodNotIn = encryptMethodNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEncryptMethodNotInItem(EncryptMethod encryptMethodNotInItem) {
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

    public NvmfSubsystemWhereInput encryptMethodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput encryptMethodNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NvmfSubsystemWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NvmfSubsystemWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEntityAsyncStatusInItem(
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

    public NvmfSubsystemWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public NvmfSubsystemWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public NvmfSubsystemWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addEntityAsyncStatusNotInItem(
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

    public NvmfSubsystemWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput externalUse(Boolean externalUse) {

        this.externalUse = externalUse;
        return this;
    }

    /**
     * Get externalUse
     *
     * @return externalUse
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExternalUse() {
        return externalUse;
    }

    public void setExternalUse(Boolean externalUse) {
        this.externalUse = externalUse;
    }

    public NvmfSubsystemWhereInput externalUse_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE);
        return this;
    }

    public NvmfSubsystemWhereInput externalUse_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE);
        return this;
    }

    public void setExternalUse_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE);
        }
    }

    public boolean getExternalUse_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_USE);
    }

    public NvmfSubsystemWhereInput externalUseNot(Boolean externalUseNot) {

        this.externalUseNot = externalUseNot;
        return this;
    }

    /**
     * Get externalUseNot
     *
     * @return externalUseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExternalUseNot() {
        return externalUseNot;
    }

    public void setExternalUseNot(Boolean externalUseNot) {
        this.externalUseNot = externalUseNot;
    }

    public NvmfSubsystemWhereInput externalUseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput externalUseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        return this;
    }

    public void setExternalUseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        }
    }

    public boolean getExternalUseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_USE_NOT);
    }

    public NvmfSubsystemWhereInput id(String id) {

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

    public NvmfSubsystemWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NvmfSubsystemWhereInput id_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idContains(String idContains) {

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

    public NvmfSubsystemWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput idContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idEndsWith(String idEndsWith) {

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

    public NvmfSubsystemWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput idEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idGt(String idGt) {

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

    public NvmfSubsystemWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public NvmfSubsystemWhereInput idGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idGte(String idGte) {

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

    public NvmfSubsystemWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput idGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIdInItem(String idInItem) {
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

    public NvmfSubsystemWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public NvmfSubsystemWhereInput idIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idLt(String idLt) {

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

    public NvmfSubsystemWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public NvmfSubsystemWhereInput idLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idLte(String idLte) {

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

    public NvmfSubsystemWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput idLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idNot(String idNot) {

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

    public NvmfSubsystemWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput idNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idNotContains(String idNotContains) {

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

    public NvmfSubsystemWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput idNotContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public NvmfSubsystemWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIdNotInItem(String idNotInItem) {
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

    public NvmfSubsystemWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput idNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public NvmfSubsystemWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput idStartsWith(String idStartsWith) {

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

    public NvmfSubsystemWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput idStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput internal(Boolean internal) {

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

    public NvmfSubsystemWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public NvmfSubsystemWhereInput internal_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput internalNot(Boolean internalNot) {

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

    public NvmfSubsystemWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput internalNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ioSize(Long ioSize) {

        this.ioSize = ioSize;
        return this;
    }

    /**
     * Get ioSize
     *
     * @return ioSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSize() {
        return ioSize;
    }

    public void setIoSize(Long ioSize) {
        this.ioSize = ioSize;
    }

    public NvmfSubsystemWhereInput ioSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE);
        return this;
    }

    public NvmfSubsystemWhereInput ioSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE);
        return this;
    }

    public void setIoSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE);
        }
    }

    public boolean getIoSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE);
    }

    public NvmfSubsystemWhereInput ioSizeGt(Long ioSizeGt) {

        this.ioSizeGt = ioSizeGt;
        return this;
    }

    /**
     * Get ioSizeGt
     *
     * @return ioSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSizeGt() {
        return ioSizeGt;
    }

    public void setIoSizeGt(Long ioSizeGt) {
        this.ioSizeGt = ioSizeGt;
    }

    public NvmfSubsystemWhereInput ioSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_GT);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_GT);
        return this;
    }

    public void setIoSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_GT);
        }
    }

    public boolean getIoSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_GT);
    }

    public NvmfSubsystemWhereInput ioSizeGte(Long ioSizeGte) {

        this.ioSizeGte = ioSizeGte;
        return this;
    }

    /**
     * Get ioSizeGte
     *
     * @return ioSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSizeGte() {
        return ioSizeGte;
    }

    public void setIoSizeGte(Long ioSizeGte) {
        this.ioSizeGte = ioSizeGte;
    }

    public NvmfSubsystemWhereInput ioSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_GTE);
        return this;
    }

    public void setIoSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_GTE);
        }
    }

    public boolean getIoSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_GTE);
    }

    public NvmfSubsystemWhereInput ioSizeIn(List<Long> ioSizeIn) {

        this.ioSizeIn = ioSizeIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIoSizeInItem(Long ioSizeInItem) {
        if (this.ioSizeIn == null) {
            this.ioSizeIn = new ArrayList<Long>();
        }
        this.ioSizeIn.add(ioSizeInItem);
        return this;
    }

    /**
     * Get ioSizeIn
     *
     * @return ioSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIoSizeIn() {
        return ioSizeIn;
    }

    public void setIoSizeIn(List<Long> ioSizeIn) {
        this.ioSizeIn = ioSizeIn;
    }

    public NvmfSubsystemWhereInput ioSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_IN);
        return this;
    }

    public void setIoSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_IN);
        }
    }

    public boolean getIoSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_IN);
    }

    public NvmfSubsystemWhereInput ioSizeLt(Long ioSizeLt) {

        this.ioSizeLt = ioSizeLt;
        return this;
    }

    /**
     * Get ioSizeLt
     *
     * @return ioSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSizeLt() {
        return ioSizeLt;
    }

    public void setIoSizeLt(Long ioSizeLt) {
        this.ioSizeLt = ioSizeLt;
    }

    public NvmfSubsystemWhereInput ioSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_LT);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_LT);
        return this;
    }

    public void setIoSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_LT);
        }
    }

    public boolean getIoSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_LT);
    }

    public NvmfSubsystemWhereInput ioSizeLte(Long ioSizeLte) {

        this.ioSizeLte = ioSizeLte;
        return this;
    }

    /**
     * Get ioSizeLte
     *
     * @return ioSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSizeLte() {
        return ioSizeLte;
    }

    public void setIoSizeLte(Long ioSizeLte) {
        this.ioSizeLte = ioSizeLte;
    }

    public NvmfSubsystemWhereInput ioSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_LTE);
        return this;
    }

    public void setIoSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_LTE);
        }
    }

    public boolean getIoSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_LTE);
    }

    public NvmfSubsystemWhereInput ioSizeNot(Long ioSizeNot) {

        this.ioSizeNot = ioSizeNot;
        return this;
    }

    /**
     * Get ioSizeNot
     *
     * @return ioSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSizeNot() {
        return ioSizeNot;
    }

    public void setIoSizeNot(Long ioSizeNot) {
        this.ioSizeNot = ioSizeNot;
    }

    public NvmfSubsystemWhereInput ioSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_NOT);
        return this;
    }

    public void setIoSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_NOT);
        }
    }

    public boolean getIoSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_NOT);
    }

    public NvmfSubsystemWhereInput ioSizeNotIn(List<Long> ioSizeNotIn) {

        this.ioSizeNotIn = ioSizeNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIoSizeNotInItem(Long ioSizeNotInItem) {
        if (this.ioSizeNotIn == null) {
            this.ioSizeNotIn = new ArrayList<Long>();
        }
        this.ioSizeNotIn.add(ioSizeNotInItem);
        return this;
    }

    /**
     * Get ioSizeNotIn
     *
     * @return ioSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIoSizeNotIn() {
        return ioSizeNotIn;
    }

    public void setIoSizeNotIn(List<Long> ioSizeNotIn) {
        this.ioSizeNotIn = ioSizeNotIn;
    }

    public NvmfSubsystemWhereInput ioSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ioSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_NOT_IN);
        return this;
    }

    public void setIoSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE_NOT_IN);
        }
    }

    public boolean getIoSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE_NOT_IN);
    }

    public NvmfSubsystemWhereInput iops(Long iops) {

        this.iops = iops;
        return this;
    }

    /**
     * Get iops
     *
     * @return iops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIops() {
        return iops;
    }

    public void setIops(Long iops) {
        this.iops = iops;
    }

    public NvmfSubsystemWhereInput iops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS);
        return this;
    }

    public NvmfSubsystemWhereInput iops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS);
        return this;
    }

    public void setIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS);
        }
    }

    public boolean getIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS);
    }

    public NvmfSubsystemWhereInput iopsGt(Long iopsGt) {

        this.iopsGt = iopsGt;
        return this;
    }

    /**
     * Get iopsGt
     *
     * @return iopsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsGt() {
        return iopsGt;
    }

    public void setIopsGt(Long iopsGt) {
        this.iopsGt = iopsGt;
    }

    public NvmfSubsystemWhereInput iopsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_GT);
        return this;
    }

    public void setIopsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_GT);
        }
    }

    public boolean getIopsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_GT);
    }

    public NvmfSubsystemWhereInput iopsGte(Long iopsGte) {

        this.iopsGte = iopsGte;
        return this;
    }

    /**
     * Get iopsGte
     *
     * @return iopsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsGte() {
        return iopsGte;
    }

    public void setIopsGte(Long iopsGte) {
        this.iopsGte = iopsGte;
    }

    public NvmfSubsystemWhereInput iopsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_GTE);
        return this;
    }

    public void setIopsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_GTE);
        }
    }

    public boolean getIopsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_GTE);
    }

    public NvmfSubsystemWhereInput iopsIn(List<Long> iopsIn) {

        this.iopsIn = iopsIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsInItem(Long iopsInItem) {
        if (this.iopsIn == null) {
            this.iopsIn = new ArrayList<Long>();
        }
        this.iopsIn.add(iopsInItem);
        return this;
    }

    /**
     * Get iopsIn
     *
     * @return iopsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsIn() {
        return iopsIn;
    }

    public void setIopsIn(List<Long> iopsIn) {
        this.iopsIn = iopsIn;
    }

    public NvmfSubsystemWhereInput iopsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_IN);
        return this;
    }

    public void setIopsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_IN);
        }
    }

    public boolean getIopsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_IN);
    }

    public NvmfSubsystemWhereInput iopsLt(Long iopsLt) {

        this.iopsLt = iopsLt;
        return this;
    }

    /**
     * Get iopsLt
     *
     * @return iopsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsLt() {
        return iopsLt;
    }

    public void setIopsLt(Long iopsLt) {
        this.iopsLt = iopsLt;
    }

    public NvmfSubsystemWhereInput iopsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_LT);
        return this;
    }

    public void setIopsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_LT);
        }
    }

    public boolean getIopsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_LT);
    }

    public NvmfSubsystemWhereInput iopsLte(Long iopsLte) {

        this.iopsLte = iopsLte;
        return this;
    }

    /**
     * Get iopsLte
     *
     * @return iopsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsLte() {
        return iopsLte;
    }

    public void setIopsLte(Long iopsLte) {
        this.iopsLte = iopsLte;
    }

    public NvmfSubsystemWhereInput iopsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_LTE);
        return this;
    }

    public void setIopsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_LTE);
        }
    }

    public boolean getIopsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_LTE);
    }

    public NvmfSubsystemWhereInput iopsMax(Long iopsMax) {

        this.iopsMax = iopsMax;
        return this;
    }

    /**
     * Get iopsMax
     *
     * @return iopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMax() {
        return iopsMax;
    }

    public void setIopsMax(Long iopsMax) {
        this.iopsMax = iopsMax;
    }

    public NvmfSubsystemWhereInput iopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public void setIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX);
        }
    }

    public boolean getIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX);
    }

    public NvmfSubsystemWhereInput iopsMaxGt(Long iopsMaxGt) {

        this.iopsMaxGt = iopsMaxGt;
        return this;
    }

    /**
     * Get iopsMaxGt
     *
     * @return iopsMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxGt() {
        return iopsMaxGt;
    }

    public void setIopsMaxGt(Long iopsMaxGt) {
        this.iopsMaxGt = iopsMaxGt;
    }

    public NvmfSubsystemWhereInput iopsMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_GT);
        return this;
    }

    public void setIopsMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_GT);
        }
    }

    public boolean getIopsMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_GT);
    }

    public NvmfSubsystemWhereInput iopsMaxGte(Long iopsMaxGte) {

        this.iopsMaxGte = iopsMaxGte;
        return this;
    }

    /**
     * Get iopsMaxGte
     *
     * @return iopsMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxGte() {
        return iopsMaxGte;
    }

    public void setIopsMaxGte(Long iopsMaxGte) {
        this.iopsMaxGte = iopsMaxGte;
    }

    public NvmfSubsystemWhereInput iopsMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_GTE);
        return this;
    }

    public void setIopsMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_GTE);
        }
    }

    public boolean getIopsMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_GTE);
    }

    public NvmfSubsystemWhereInput iopsMaxIn(List<Long> iopsMaxIn) {

        this.iopsMaxIn = iopsMaxIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsMaxInItem(Long iopsMaxInItem) {
        if (this.iopsMaxIn == null) {
            this.iopsMaxIn = new ArrayList<Long>();
        }
        this.iopsMaxIn.add(iopsMaxInItem);
        return this;
    }

    /**
     * Get iopsMaxIn
     *
     * @return iopsMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsMaxIn() {
        return iopsMaxIn;
    }

    public void setIopsMaxIn(List<Long> iopsMaxIn) {
        this.iopsMaxIn = iopsMaxIn;
    }

    public NvmfSubsystemWhereInput iopsMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_IN);
        return this;
    }

    public void setIopsMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_IN);
        }
    }

    public boolean getIopsMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_IN);
    }

    public NvmfSubsystemWhereInput iopsMaxLength(Long iopsMaxLength) {

        this.iopsMaxLength = iopsMaxLength;
        return this;
    }

    /**
     * Get iopsMaxLength
     *
     * @return iopsMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLength() {
        return iopsMaxLength;
    }

    public void setIopsMaxLength(Long iopsMaxLength) {
        this.iopsMaxLength = iopsMaxLength;
    }

    public NvmfSubsystemWhereInput iopsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public void setIopsMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        }
    }

    public boolean getIopsMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthGt(Long iopsMaxLengthGt) {

        this.iopsMaxLengthGt = iopsMaxLengthGt;
        return this;
    }

    /**
     * Get iopsMaxLengthGt
     *
     * @return iopsMaxLengthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLengthGt() {
        return iopsMaxLengthGt;
    }

    public void setIopsMaxLengthGt(Long iopsMaxLengthGt) {
        this.iopsMaxLengthGt = iopsMaxLengthGt;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT);
        return this;
    }

    public void setIopsMaxLengthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT);
        }
    }

    public boolean getIopsMaxLengthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthGte(Long iopsMaxLengthGte) {

        this.iopsMaxLengthGte = iopsMaxLengthGte;
        return this;
    }

    /**
     * Get iopsMaxLengthGte
     *
     * @return iopsMaxLengthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLengthGte() {
        return iopsMaxLengthGte;
    }

    public void setIopsMaxLengthGte(Long iopsMaxLengthGte) {
        this.iopsMaxLengthGte = iopsMaxLengthGte;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE);
        return this;
    }

    public void setIopsMaxLengthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE);
        }
    }

    public boolean getIopsMaxLengthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthIn(List<Long> iopsMaxLengthIn) {

        this.iopsMaxLengthIn = iopsMaxLengthIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsMaxLengthInItem(Long iopsMaxLengthInItem) {
        if (this.iopsMaxLengthIn == null) {
            this.iopsMaxLengthIn = new ArrayList<Long>();
        }
        this.iopsMaxLengthIn.add(iopsMaxLengthInItem);
        return this;
    }

    /**
     * Get iopsMaxLengthIn
     *
     * @return iopsMaxLengthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsMaxLengthIn() {
        return iopsMaxLengthIn;
    }

    public void setIopsMaxLengthIn(List<Long> iopsMaxLengthIn) {
        this.iopsMaxLengthIn = iopsMaxLengthIn;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN);
        return this;
    }

    public void setIopsMaxLengthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN);
        }
    }

    public boolean getIopsMaxLengthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthLt(Long iopsMaxLengthLt) {

        this.iopsMaxLengthLt = iopsMaxLengthLt;
        return this;
    }

    /**
     * Get iopsMaxLengthLt
     *
     * @return iopsMaxLengthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLengthLt() {
        return iopsMaxLengthLt;
    }

    public void setIopsMaxLengthLt(Long iopsMaxLengthLt) {
        this.iopsMaxLengthLt = iopsMaxLengthLt;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT);
        return this;
    }

    public void setIopsMaxLengthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT);
        }
    }

    public boolean getIopsMaxLengthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthLte(Long iopsMaxLengthLte) {

        this.iopsMaxLengthLte = iopsMaxLengthLte;
        return this;
    }

    /**
     * Get iopsMaxLengthLte
     *
     * @return iopsMaxLengthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLengthLte() {
        return iopsMaxLengthLte;
    }

    public void setIopsMaxLengthLte(Long iopsMaxLengthLte) {
        this.iopsMaxLengthLte = iopsMaxLengthLte;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE);
        return this;
    }

    public void setIopsMaxLengthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE);
        }
    }

    public boolean getIopsMaxLengthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthNot(Long iopsMaxLengthNot) {

        this.iopsMaxLengthNot = iopsMaxLengthNot;
        return this;
    }

    /**
     * Get iopsMaxLengthNot
     *
     * @return iopsMaxLengthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLengthNot() {
        return iopsMaxLengthNot;
    }

    public void setIopsMaxLengthNot(Long iopsMaxLengthNot) {
        this.iopsMaxLengthNot = iopsMaxLengthNot;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT);
        return this;
    }

    public void setIopsMaxLengthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT);
        }
    }

    public boolean getIopsMaxLengthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT);
    }

    public NvmfSubsystemWhereInput iopsMaxLengthNotIn(List<Long> iopsMaxLengthNotIn) {

        this.iopsMaxLengthNotIn = iopsMaxLengthNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsMaxLengthNotInItem(Long iopsMaxLengthNotInItem) {
        if (this.iopsMaxLengthNotIn == null) {
            this.iopsMaxLengthNotIn = new ArrayList<Long>();
        }
        this.iopsMaxLengthNotIn.add(iopsMaxLengthNotInItem);
        return this;
    }

    /**
     * Get iopsMaxLengthNotIn
     *
     * @return iopsMaxLengthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsMaxLengthNotIn() {
        return iopsMaxLengthNotIn;
    }

    public void setIopsMaxLengthNotIn(List<Long> iopsMaxLengthNotIn) {
        this.iopsMaxLengthNotIn = iopsMaxLengthNotIn;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLengthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN);
        return this;
    }

    public void setIopsMaxLengthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN);
        }
    }

    public boolean getIopsMaxLengthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsMaxLt(Long iopsMaxLt) {

        this.iopsMaxLt = iopsMaxLt;
        return this;
    }

    /**
     * Get iopsMaxLt
     *
     * @return iopsMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLt() {
        return iopsMaxLt;
    }

    public void setIopsMaxLt(Long iopsMaxLt) {
        this.iopsMaxLt = iopsMaxLt;
    }

    public NvmfSubsystemWhereInput iopsMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LT);
        return this;
    }

    public void setIopsMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LT);
        }
    }

    public boolean getIopsMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LT);
    }

    public NvmfSubsystemWhereInput iopsMaxLte(Long iopsMaxLte) {

        this.iopsMaxLte = iopsMaxLte;
        return this;
    }

    /**
     * Get iopsMaxLte
     *
     * @return iopsMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLte() {
        return iopsMaxLte;
    }

    public void setIopsMaxLte(Long iopsMaxLte) {
        this.iopsMaxLte = iopsMaxLte;
    }

    public NvmfSubsystemWhereInput iopsMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LTE);
        return this;
    }

    public void setIopsMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LTE);
        }
    }

    public boolean getIopsMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LTE);
    }

    public NvmfSubsystemWhereInput iopsMaxNot(Long iopsMaxNot) {

        this.iopsMaxNot = iopsMaxNot;
        return this;
    }

    /**
     * Get iopsMaxNot
     *
     * @return iopsMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxNot() {
        return iopsMaxNot;
    }

    public void setIopsMaxNot(Long iopsMaxNot) {
        this.iopsMaxNot = iopsMaxNot;
    }

    public NvmfSubsystemWhereInput iopsMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_NOT);
        return this;
    }

    public void setIopsMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_NOT);
        }
    }

    public boolean getIopsMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_NOT);
    }

    public NvmfSubsystemWhereInput iopsMaxNotIn(List<Long> iopsMaxNotIn) {

        this.iopsMaxNotIn = iopsMaxNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsMaxNotInItem(Long iopsMaxNotInItem) {
        if (this.iopsMaxNotIn == null) {
            this.iopsMaxNotIn = new ArrayList<Long>();
        }
        this.iopsMaxNotIn.add(iopsMaxNotInItem);
        return this;
    }

    /**
     * Get iopsMaxNotIn
     *
     * @return iopsMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsMaxNotIn() {
        return iopsMaxNotIn;
    }

    public void setIopsMaxNotIn(List<Long> iopsMaxNotIn) {
        this.iopsMaxNotIn = iopsMaxNotIn;
    }

    public NvmfSubsystemWhereInput iopsMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_NOT_IN);
        return this;
    }

    public void setIopsMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_NOT_IN);
        }
    }

    public boolean getIopsMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsNot(Long iopsNot) {

        this.iopsNot = iopsNot;
        return this;
    }

    /**
     * Get iopsNot
     *
     * @return iopsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsNot() {
        return iopsNot;
    }

    public void setIopsNot(Long iopsNot) {
        this.iopsNot = iopsNot;
    }

    public NvmfSubsystemWhereInput iopsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_NOT);
        return this;
    }

    public void setIopsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_NOT);
        }
    }

    public boolean getIopsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_NOT);
    }

    public NvmfSubsystemWhereInput iopsNotIn(List<Long> iopsNotIn) {

        this.iopsNotIn = iopsNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsNotInItem(Long iopsNotInItem) {
        if (this.iopsNotIn == null) {
            this.iopsNotIn = new ArrayList<Long>();
        }
        this.iopsNotIn.add(iopsNotInItem);
        return this;
    }

    /**
     * Get iopsNotIn
     *
     * @return iopsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsNotIn() {
        return iopsNotIn;
    }

    public void setIopsNotIn(List<Long> iopsNotIn) {
        this.iopsNotIn = iopsNotIn;
    }

    public NvmfSubsystemWhereInput iopsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_NOT_IN);
        return this;
    }

    public void setIopsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_NOT_IN);
        }
    }

    public boolean getIopsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsRd(Long iopsRd) {

        this.iopsRd = iopsRd;
        return this;
    }

    /**
     * Get iopsRd
     *
     * @return iopsRd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRd() {
        return iopsRd;
    }

    public void setIopsRd(Long iopsRd) {
        this.iopsRd = iopsRd;
    }

    public NvmfSubsystemWhereInput iopsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public void setIopsRd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD);
        }
    }

    public boolean getIopsRd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD);
    }

    public NvmfSubsystemWhereInput iopsRdGt(Long iopsRdGt) {

        this.iopsRdGt = iopsRdGt;
        return this;
    }

    /**
     * Get iopsRdGt
     *
     * @return iopsRdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdGt() {
        return iopsRdGt;
    }

    public void setIopsRdGt(Long iopsRdGt) {
        this.iopsRdGt = iopsRdGt;
    }

    public NvmfSubsystemWhereInput iopsRdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_GT);
        return this;
    }

    public void setIopsRdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_GT);
        }
    }

    public boolean getIopsRdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_GT);
    }

    public NvmfSubsystemWhereInput iopsRdGte(Long iopsRdGte) {

        this.iopsRdGte = iopsRdGte;
        return this;
    }

    /**
     * Get iopsRdGte
     *
     * @return iopsRdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdGte() {
        return iopsRdGte;
    }

    public void setIopsRdGte(Long iopsRdGte) {
        this.iopsRdGte = iopsRdGte;
    }

    public NvmfSubsystemWhereInput iopsRdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_GTE);
        return this;
    }

    public void setIopsRdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_GTE);
        }
    }

    public boolean getIopsRdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_GTE);
    }

    public NvmfSubsystemWhereInput iopsRdIn(List<Long> iopsRdIn) {

        this.iopsRdIn = iopsRdIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsRdInItem(Long iopsRdInItem) {
        if (this.iopsRdIn == null) {
            this.iopsRdIn = new ArrayList<Long>();
        }
        this.iopsRdIn.add(iopsRdInItem);
        return this;
    }

    /**
     * Get iopsRdIn
     *
     * @return iopsRdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsRdIn() {
        return iopsRdIn;
    }

    public void setIopsRdIn(List<Long> iopsRdIn) {
        this.iopsRdIn = iopsRdIn;
    }

    public NvmfSubsystemWhereInput iopsRdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_IN);
        return this;
    }

    public void setIopsRdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_IN);
        }
    }

    public boolean getIopsRdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_IN);
    }

    public NvmfSubsystemWhereInput iopsRdLt(Long iopsRdLt) {

        this.iopsRdLt = iopsRdLt;
        return this;
    }

    /**
     * Get iopsRdLt
     *
     * @return iopsRdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdLt() {
        return iopsRdLt;
    }

    public void setIopsRdLt(Long iopsRdLt) {
        this.iopsRdLt = iopsRdLt;
    }

    public NvmfSubsystemWhereInput iopsRdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_LT);
        return this;
    }

    public void setIopsRdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_LT);
        }
    }

    public boolean getIopsRdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_LT);
    }

    public NvmfSubsystemWhereInput iopsRdLte(Long iopsRdLte) {

        this.iopsRdLte = iopsRdLte;
        return this;
    }

    /**
     * Get iopsRdLte
     *
     * @return iopsRdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdLte() {
        return iopsRdLte;
    }

    public void setIopsRdLte(Long iopsRdLte) {
        this.iopsRdLte = iopsRdLte;
    }

    public NvmfSubsystemWhereInput iopsRdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_LTE);
        return this;
    }

    public void setIopsRdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_LTE);
        }
    }

    public boolean getIopsRdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_LTE);
    }

    public NvmfSubsystemWhereInput iopsRdMax(Long iopsRdMax) {

        this.iopsRdMax = iopsRdMax;
        return this;
    }

    /**
     * Get iopsRdMax
     *
     * @return iopsRdMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMax() {
        return iopsRdMax;
    }

    public void setIopsRdMax(Long iopsRdMax) {
        this.iopsRdMax = iopsRdMax;
    }

    public NvmfSubsystemWhereInput iopsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public void setIopsRdMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX);
        }
    }

    public boolean getIopsRdMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX);
    }

    public NvmfSubsystemWhereInput iopsRdMaxGt(Long iopsRdMaxGt) {

        this.iopsRdMaxGt = iopsRdMaxGt;
        return this;
    }

    /**
     * Get iopsRdMaxGt
     *
     * @return iopsRdMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxGt() {
        return iopsRdMaxGt;
    }

    public void setIopsRdMaxGt(Long iopsRdMaxGt) {
        this.iopsRdMaxGt = iopsRdMaxGt;
    }

    public NvmfSubsystemWhereInput iopsRdMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_GT);
        return this;
    }

    public void setIopsRdMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_GT);
        }
    }

    public boolean getIopsRdMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_GT);
    }

    public NvmfSubsystemWhereInput iopsRdMaxGte(Long iopsRdMaxGte) {

        this.iopsRdMaxGte = iopsRdMaxGte;
        return this;
    }

    /**
     * Get iopsRdMaxGte
     *
     * @return iopsRdMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxGte() {
        return iopsRdMaxGte;
    }

    public void setIopsRdMaxGte(Long iopsRdMaxGte) {
        this.iopsRdMaxGte = iopsRdMaxGte;
    }

    public NvmfSubsystemWhereInput iopsRdMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_GTE);
        return this;
    }

    public void setIopsRdMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_GTE);
        }
    }

    public boolean getIopsRdMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_GTE);
    }

    public NvmfSubsystemWhereInput iopsRdMaxIn(List<Long> iopsRdMaxIn) {

        this.iopsRdMaxIn = iopsRdMaxIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsRdMaxInItem(Long iopsRdMaxInItem) {
        if (this.iopsRdMaxIn == null) {
            this.iopsRdMaxIn = new ArrayList<Long>();
        }
        this.iopsRdMaxIn.add(iopsRdMaxInItem);
        return this;
    }

    /**
     * Get iopsRdMaxIn
     *
     * @return iopsRdMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsRdMaxIn() {
        return iopsRdMaxIn;
    }

    public void setIopsRdMaxIn(List<Long> iopsRdMaxIn) {
        this.iopsRdMaxIn = iopsRdMaxIn;
    }

    public NvmfSubsystemWhereInput iopsRdMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_IN);
        return this;
    }

    public void setIopsRdMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_IN);
        }
    }

    public boolean getIopsRdMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_IN);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLength(Long iopsRdMaxLength) {

        this.iopsRdMaxLength = iopsRdMaxLength;
        return this;
    }

    /**
     * Get iopsRdMaxLength
     *
     * @return iopsRdMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLength() {
        return iopsRdMaxLength;
    }

    public void setIopsRdMaxLength(Long iopsRdMaxLength) {
        this.iopsRdMaxLength = iopsRdMaxLength;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public void setIopsRdMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        }
    }

    public boolean getIopsRdMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthGt(Long iopsRdMaxLengthGt) {

        this.iopsRdMaxLengthGt = iopsRdMaxLengthGt;
        return this;
    }

    /**
     * Get iopsRdMaxLengthGt
     *
     * @return iopsRdMaxLengthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLengthGt() {
        return iopsRdMaxLengthGt;
    }

    public void setIopsRdMaxLengthGt(Long iopsRdMaxLengthGt) {
        this.iopsRdMaxLengthGt = iopsRdMaxLengthGt;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT);
        return this;
    }

    public void setIopsRdMaxLengthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT);
        }
    }

    public boolean getIopsRdMaxLengthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthGte(Long iopsRdMaxLengthGte) {

        this.iopsRdMaxLengthGte = iopsRdMaxLengthGte;
        return this;
    }

    /**
     * Get iopsRdMaxLengthGte
     *
     * @return iopsRdMaxLengthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLengthGte() {
        return iopsRdMaxLengthGte;
    }

    public void setIopsRdMaxLengthGte(Long iopsRdMaxLengthGte) {
        this.iopsRdMaxLengthGte = iopsRdMaxLengthGte;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE);
        return this;
    }

    public void setIopsRdMaxLengthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE);
        }
    }

    public boolean getIopsRdMaxLengthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthIn(List<Long> iopsRdMaxLengthIn) {

        this.iopsRdMaxLengthIn = iopsRdMaxLengthIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsRdMaxLengthInItem(Long iopsRdMaxLengthInItem) {
        if (this.iopsRdMaxLengthIn == null) {
            this.iopsRdMaxLengthIn = new ArrayList<Long>();
        }
        this.iopsRdMaxLengthIn.add(iopsRdMaxLengthInItem);
        return this;
    }

    /**
     * Get iopsRdMaxLengthIn
     *
     * @return iopsRdMaxLengthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsRdMaxLengthIn() {
        return iopsRdMaxLengthIn;
    }

    public void setIopsRdMaxLengthIn(List<Long> iopsRdMaxLengthIn) {
        this.iopsRdMaxLengthIn = iopsRdMaxLengthIn;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN);
        return this;
    }

    public void setIopsRdMaxLengthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN);
        }
    }

    public boolean getIopsRdMaxLengthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthLt(Long iopsRdMaxLengthLt) {

        this.iopsRdMaxLengthLt = iopsRdMaxLengthLt;
        return this;
    }

    /**
     * Get iopsRdMaxLengthLt
     *
     * @return iopsRdMaxLengthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLengthLt() {
        return iopsRdMaxLengthLt;
    }

    public void setIopsRdMaxLengthLt(Long iopsRdMaxLengthLt) {
        this.iopsRdMaxLengthLt = iopsRdMaxLengthLt;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT);
        return this;
    }

    public void setIopsRdMaxLengthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT);
        }
    }

    public boolean getIopsRdMaxLengthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthLte(Long iopsRdMaxLengthLte) {

        this.iopsRdMaxLengthLte = iopsRdMaxLengthLte;
        return this;
    }

    /**
     * Get iopsRdMaxLengthLte
     *
     * @return iopsRdMaxLengthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLengthLte() {
        return iopsRdMaxLengthLte;
    }

    public void setIopsRdMaxLengthLte(Long iopsRdMaxLengthLte) {
        this.iopsRdMaxLengthLte = iopsRdMaxLengthLte;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE);
        return this;
    }

    public void setIopsRdMaxLengthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE);
        }
    }

    public boolean getIopsRdMaxLengthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthNot(Long iopsRdMaxLengthNot) {

        this.iopsRdMaxLengthNot = iopsRdMaxLengthNot;
        return this;
    }

    /**
     * Get iopsRdMaxLengthNot
     *
     * @return iopsRdMaxLengthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLengthNot() {
        return iopsRdMaxLengthNot;
    }

    public void setIopsRdMaxLengthNot(Long iopsRdMaxLengthNot) {
        this.iopsRdMaxLengthNot = iopsRdMaxLengthNot;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT);
        return this;
    }

    public void setIopsRdMaxLengthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT);
        }
    }

    public boolean getIopsRdMaxLengthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthNotIn(List<Long> iopsRdMaxLengthNotIn) {

        this.iopsRdMaxLengthNotIn = iopsRdMaxLengthNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsRdMaxLengthNotInItem(Long iopsRdMaxLengthNotInItem) {
        if (this.iopsRdMaxLengthNotIn == null) {
            this.iopsRdMaxLengthNotIn = new ArrayList<Long>();
        }
        this.iopsRdMaxLengthNotIn.add(iopsRdMaxLengthNotInItem);
        return this;
    }

    /**
     * Get iopsRdMaxLengthNotIn
     *
     * @return iopsRdMaxLengthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsRdMaxLengthNotIn() {
        return iopsRdMaxLengthNotIn;
    }

    public void setIopsRdMaxLengthNotIn(List<Long> iopsRdMaxLengthNotIn) {
        this.iopsRdMaxLengthNotIn = iopsRdMaxLengthNotIn;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLengthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN);
        return this;
    }

    public void setIopsRdMaxLengthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN);
        }
    }

    public boolean getIopsRdMaxLengthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLt(Long iopsRdMaxLt) {

        this.iopsRdMaxLt = iopsRdMaxLt;
        return this;
    }

    /**
     * Get iopsRdMaxLt
     *
     * @return iopsRdMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLt() {
        return iopsRdMaxLt;
    }

    public void setIopsRdMaxLt(Long iopsRdMaxLt) {
        this.iopsRdMaxLt = iopsRdMaxLt;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LT);
        return this;
    }

    public void setIopsRdMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LT);
        }
    }

    public boolean getIopsRdMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LT);
    }

    public NvmfSubsystemWhereInput iopsRdMaxLte(Long iopsRdMaxLte) {

        this.iopsRdMaxLte = iopsRdMaxLte;
        return this;
    }

    /**
     * Get iopsRdMaxLte
     *
     * @return iopsRdMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLte() {
        return iopsRdMaxLte;
    }

    public void setIopsRdMaxLte(Long iopsRdMaxLte) {
        this.iopsRdMaxLte = iopsRdMaxLte;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LTE);
        return this;
    }

    public void setIopsRdMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LTE);
        }
    }

    public boolean getIopsRdMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LTE);
    }

    public NvmfSubsystemWhereInput iopsRdMaxNot(Long iopsRdMaxNot) {

        this.iopsRdMaxNot = iopsRdMaxNot;
        return this;
    }

    /**
     * Get iopsRdMaxNot
     *
     * @return iopsRdMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxNot() {
        return iopsRdMaxNot;
    }

    public void setIopsRdMaxNot(Long iopsRdMaxNot) {
        this.iopsRdMaxNot = iopsRdMaxNot;
    }

    public NvmfSubsystemWhereInput iopsRdMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_NOT);
        return this;
    }

    public void setIopsRdMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_NOT);
        }
    }

    public boolean getIopsRdMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_NOT);
    }

    public NvmfSubsystemWhereInput iopsRdMaxNotIn(List<Long> iopsRdMaxNotIn) {

        this.iopsRdMaxNotIn = iopsRdMaxNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsRdMaxNotInItem(Long iopsRdMaxNotInItem) {
        if (this.iopsRdMaxNotIn == null) {
            this.iopsRdMaxNotIn = new ArrayList<Long>();
        }
        this.iopsRdMaxNotIn.add(iopsRdMaxNotInItem);
        return this;
    }

    /**
     * Get iopsRdMaxNotIn
     *
     * @return iopsRdMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsRdMaxNotIn() {
        return iopsRdMaxNotIn;
    }

    public void setIopsRdMaxNotIn(List<Long> iopsRdMaxNotIn) {
        this.iopsRdMaxNotIn = iopsRdMaxNotIn;
    }

    public NvmfSubsystemWhereInput iopsRdMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN);
        return this;
    }

    public void setIopsRdMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN);
        }
    }

    public boolean getIopsRdMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsRdNot(Long iopsRdNot) {

        this.iopsRdNot = iopsRdNot;
        return this;
    }

    /**
     * Get iopsRdNot
     *
     * @return iopsRdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdNot() {
        return iopsRdNot;
    }

    public void setIopsRdNot(Long iopsRdNot) {
        this.iopsRdNot = iopsRdNot;
    }

    public NvmfSubsystemWhereInput iopsRdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_NOT);
        return this;
    }

    public void setIopsRdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_NOT);
        }
    }

    public boolean getIopsRdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_NOT);
    }

    public NvmfSubsystemWhereInput iopsRdNotIn(List<Long> iopsRdNotIn) {

        this.iopsRdNotIn = iopsRdNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsRdNotInItem(Long iopsRdNotInItem) {
        if (this.iopsRdNotIn == null) {
            this.iopsRdNotIn = new ArrayList<Long>();
        }
        this.iopsRdNotIn.add(iopsRdNotInItem);
        return this;
    }

    /**
     * Get iopsRdNotIn
     *
     * @return iopsRdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsRdNotIn() {
        return iopsRdNotIn;
    }

    public void setIopsRdNotIn(List<Long> iopsRdNotIn) {
        this.iopsRdNotIn = iopsRdNotIn;
    }

    public NvmfSubsystemWhereInput iopsRdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsRdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_NOT_IN);
        return this;
    }

    public void setIopsRdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_NOT_IN);
        }
    }

    public boolean getIopsRdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsWr(Long iopsWr) {

        this.iopsWr = iopsWr;
        return this;
    }

    /**
     * Get iopsWr
     *
     * @return iopsWr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWr() {
        return iopsWr;
    }

    public void setIopsWr(Long iopsWr) {
        this.iopsWr = iopsWr;
    }

    public NvmfSubsystemWhereInput iopsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public void setIopsWr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR);
        }
    }

    public boolean getIopsWr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR);
    }

    public NvmfSubsystemWhereInput iopsWrGt(Long iopsWrGt) {

        this.iopsWrGt = iopsWrGt;
        return this;
    }

    /**
     * Get iopsWrGt
     *
     * @return iopsWrGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrGt() {
        return iopsWrGt;
    }

    public void setIopsWrGt(Long iopsWrGt) {
        this.iopsWrGt = iopsWrGt;
    }

    public NvmfSubsystemWhereInput iopsWrGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_GT);
        return this;
    }

    public void setIopsWrGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_GT);
        }
    }

    public boolean getIopsWrGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_GT);
    }

    public NvmfSubsystemWhereInput iopsWrGte(Long iopsWrGte) {

        this.iopsWrGte = iopsWrGte;
        return this;
    }

    /**
     * Get iopsWrGte
     *
     * @return iopsWrGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrGte() {
        return iopsWrGte;
    }

    public void setIopsWrGte(Long iopsWrGte) {
        this.iopsWrGte = iopsWrGte;
    }

    public NvmfSubsystemWhereInput iopsWrGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_GTE);
        return this;
    }

    public void setIopsWrGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_GTE);
        }
    }

    public boolean getIopsWrGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_GTE);
    }

    public NvmfSubsystemWhereInput iopsWrIn(List<Long> iopsWrIn) {

        this.iopsWrIn = iopsWrIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsWrInItem(Long iopsWrInItem) {
        if (this.iopsWrIn == null) {
            this.iopsWrIn = new ArrayList<Long>();
        }
        this.iopsWrIn.add(iopsWrInItem);
        return this;
    }

    /**
     * Get iopsWrIn
     *
     * @return iopsWrIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsWrIn() {
        return iopsWrIn;
    }

    public void setIopsWrIn(List<Long> iopsWrIn) {
        this.iopsWrIn = iopsWrIn;
    }

    public NvmfSubsystemWhereInput iopsWrIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_IN);
        return this;
    }

    public void setIopsWrIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_IN);
        }
    }

    public boolean getIopsWrIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_IN);
    }

    public NvmfSubsystemWhereInput iopsWrLt(Long iopsWrLt) {

        this.iopsWrLt = iopsWrLt;
        return this;
    }

    /**
     * Get iopsWrLt
     *
     * @return iopsWrLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrLt() {
        return iopsWrLt;
    }

    public void setIopsWrLt(Long iopsWrLt) {
        this.iopsWrLt = iopsWrLt;
    }

    public NvmfSubsystemWhereInput iopsWrLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_LT);
        return this;
    }

    public void setIopsWrLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_LT);
        }
    }

    public boolean getIopsWrLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_LT);
    }

    public NvmfSubsystemWhereInput iopsWrLte(Long iopsWrLte) {

        this.iopsWrLte = iopsWrLte;
        return this;
    }

    /**
     * Get iopsWrLte
     *
     * @return iopsWrLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrLte() {
        return iopsWrLte;
    }

    public void setIopsWrLte(Long iopsWrLte) {
        this.iopsWrLte = iopsWrLte;
    }

    public NvmfSubsystemWhereInput iopsWrLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_LTE);
        return this;
    }

    public void setIopsWrLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_LTE);
        }
    }

    public boolean getIopsWrLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_LTE);
    }

    public NvmfSubsystemWhereInput iopsWrMax(Long iopsWrMax) {

        this.iopsWrMax = iopsWrMax;
        return this;
    }

    /**
     * Get iopsWrMax
     *
     * @return iopsWrMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMax() {
        return iopsWrMax;
    }

    public void setIopsWrMax(Long iopsWrMax) {
        this.iopsWrMax = iopsWrMax;
    }

    public NvmfSubsystemWhereInput iopsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public void setIopsWrMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX);
        }
    }

    public boolean getIopsWrMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX);
    }

    public NvmfSubsystemWhereInput iopsWrMaxGt(Long iopsWrMaxGt) {

        this.iopsWrMaxGt = iopsWrMaxGt;
        return this;
    }

    /**
     * Get iopsWrMaxGt
     *
     * @return iopsWrMaxGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxGt() {
        return iopsWrMaxGt;
    }

    public void setIopsWrMaxGt(Long iopsWrMaxGt) {
        this.iopsWrMaxGt = iopsWrMaxGt;
    }

    public NvmfSubsystemWhereInput iopsWrMaxGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_GT);
        return this;
    }

    public void setIopsWrMaxGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_GT);
        }
    }

    public boolean getIopsWrMaxGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_GT);
    }

    public NvmfSubsystemWhereInput iopsWrMaxGte(Long iopsWrMaxGte) {

        this.iopsWrMaxGte = iopsWrMaxGte;
        return this;
    }

    /**
     * Get iopsWrMaxGte
     *
     * @return iopsWrMaxGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxGte() {
        return iopsWrMaxGte;
    }

    public void setIopsWrMaxGte(Long iopsWrMaxGte) {
        this.iopsWrMaxGte = iopsWrMaxGte;
    }

    public NvmfSubsystemWhereInput iopsWrMaxGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_GTE);
        return this;
    }

    public void setIopsWrMaxGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_GTE);
        }
    }

    public boolean getIopsWrMaxGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_GTE);
    }

    public NvmfSubsystemWhereInput iopsWrMaxIn(List<Long> iopsWrMaxIn) {

        this.iopsWrMaxIn = iopsWrMaxIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsWrMaxInItem(Long iopsWrMaxInItem) {
        if (this.iopsWrMaxIn == null) {
            this.iopsWrMaxIn = new ArrayList<Long>();
        }
        this.iopsWrMaxIn.add(iopsWrMaxInItem);
        return this;
    }

    /**
     * Get iopsWrMaxIn
     *
     * @return iopsWrMaxIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsWrMaxIn() {
        return iopsWrMaxIn;
    }

    public void setIopsWrMaxIn(List<Long> iopsWrMaxIn) {
        this.iopsWrMaxIn = iopsWrMaxIn;
    }

    public NvmfSubsystemWhereInput iopsWrMaxIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_IN);
        return this;
    }

    public void setIopsWrMaxIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_IN);
        }
    }

    public boolean getIopsWrMaxIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_IN);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLength(Long iopsWrMaxLength) {

        this.iopsWrMaxLength = iopsWrMaxLength;
        return this;
    }

    /**
     * Get iopsWrMaxLength
     *
     * @return iopsWrMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLength() {
        return iopsWrMaxLength;
    }

    public void setIopsWrMaxLength(Long iopsWrMaxLength) {
        this.iopsWrMaxLength = iopsWrMaxLength;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public void setIopsWrMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        }
    }

    public boolean getIopsWrMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthGt(Long iopsWrMaxLengthGt) {

        this.iopsWrMaxLengthGt = iopsWrMaxLengthGt;
        return this;
    }

    /**
     * Get iopsWrMaxLengthGt
     *
     * @return iopsWrMaxLengthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLengthGt() {
        return iopsWrMaxLengthGt;
    }

    public void setIopsWrMaxLengthGt(Long iopsWrMaxLengthGt) {
        this.iopsWrMaxLengthGt = iopsWrMaxLengthGt;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT);
        return this;
    }

    public void setIopsWrMaxLengthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT);
        }
    }

    public boolean getIopsWrMaxLengthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthGte(Long iopsWrMaxLengthGte) {

        this.iopsWrMaxLengthGte = iopsWrMaxLengthGte;
        return this;
    }

    /**
     * Get iopsWrMaxLengthGte
     *
     * @return iopsWrMaxLengthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLengthGte() {
        return iopsWrMaxLengthGte;
    }

    public void setIopsWrMaxLengthGte(Long iopsWrMaxLengthGte) {
        this.iopsWrMaxLengthGte = iopsWrMaxLengthGte;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE);
        return this;
    }

    public void setIopsWrMaxLengthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE);
        }
    }

    public boolean getIopsWrMaxLengthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthIn(List<Long> iopsWrMaxLengthIn) {

        this.iopsWrMaxLengthIn = iopsWrMaxLengthIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsWrMaxLengthInItem(Long iopsWrMaxLengthInItem) {
        if (this.iopsWrMaxLengthIn == null) {
            this.iopsWrMaxLengthIn = new ArrayList<Long>();
        }
        this.iopsWrMaxLengthIn.add(iopsWrMaxLengthInItem);
        return this;
    }

    /**
     * Get iopsWrMaxLengthIn
     *
     * @return iopsWrMaxLengthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsWrMaxLengthIn() {
        return iopsWrMaxLengthIn;
    }

    public void setIopsWrMaxLengthIn(List<Long> iopsWrMaxLengthIn) {
        this.iopsWrMaxLengthIn = iopsWrMaxLengthIn;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN);
        return this;
    }

    public void setIopsWrMaxLengthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN);
        }
    }

    public boolean getIopsWrMaxLengthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthLt(Long iopsWrMaxLengthLt) {

        this.iopsWrMaxLengthLt = iopsWrMaxLengthLt;
        return this;
    }

    /**
     * Get iopsWrMaxLengthLt
     *
     * @return iopsWrMaxLengthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLengthLt() {
        return iopsWrMaxLengthLt;
    }

    public void setIopsWrMaxLengthLt(Long iopsWrMaxLengthLt) {
        this.iopsWrMaxLengthLt = iopsWrMaxLengthLt;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT);
        return this;
    }

    public void setIopsWrMaxLengthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT);
        }
    }

    public boolean getIopsWrMaxLengthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthLte(Long iopsWrMaxLengthLte) {

        this.iopsWrMaxLengthLte = iopsWrMaxLengthLte;
        return this;
    }

    /**
     * Get iopsWrMaxLengthLte
     *
     * @return iopsWrMaxLengthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLengthLte() {
        return iopsWrMaxLengthLte;
    }

    public void setIopsWrMaxLengthLte(Long iopsWrMaxLengthLte) {
        this.iopsWrMaxLengthLte = iopsWrMaxLengthLte;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE);
        return this;
    }

    public void setIopsWrMaxLengthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE);
        }
    }

    public boolean getIopsWrMaxLengthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthNot(Long iopsWrMaxLengthNot) {

        this.iopsWrMaxLengthNot = iopsWrMaxLengthNot;
        return this;
    }

    /**
     * Get iopsWrMaxLengthNot
     *
     * @return iopsWrMaxLengthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLengthNot() {
        return iopsWrMaxLengthNot;
    }

    public void setIopsWrMaxLengthNot(Long iopsWrMaxLengthNot) {
        this.iopsWrMaxLengthNot = iopsWrMaxLengthNot;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT);
        return this;
    }

    public void setIopsWrMaxLengthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT);
        }
    }

    public boolean getIopsWrMaxLengthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthNotIn(List<Long> iopsWrMaxLengthNotIn) {

        this.iopsWrMaxLengthNotIn = iopsWrMaxLengthNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsWrMaxLengthNotInItem(Long iopsWrMaxLengthNotInItem) {
        if (this.iopsWrMaxLengthNotIn == null) {
            this.iopsWrMaxLengthNotIn = new ArrayList<Long>();
        }
        this.iopsWrMaxLengthNotIn.add(iopsWrMaxLengthNotInItem);
        return this;
    }

    /**
     * Get iopsWrMaxLengthNotIn
     *
     * @return iopsWrMaxLengthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsWrMaxLengthNotIn() {
        return iopsWrMaxLengthNotIn;
    }

    public void setIopsWrMaxLengthNotIn(List<Long> iopsWrMaxLengthNotIn) {
        this.iopsWrMaxLengthNotIn = iopsWrMaxLengthNotIn;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLengthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN);
        return this;
    }

    public void setIopsWrMaxLengthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN);
        }
    }

    public boolean getIopsWrMaxLengthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLt(Long iopsWrMaxLt) {

        this.iopsWrMaxLt = iopsWrMaxLt;
        return this;
    }

    /**
     * Get iopsWrMaxLt
     *
     * @return iopsWrMaxLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLt() {
        return iopsWrMaxLt;
    }

    public void setIopsWrMaxLt(Long iopsWrMaxLt) {
        this.iopsWrMaxLt = iopsWrMaxLt;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LT);
        return this;
    }

    public void setIopsWrMaxLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LT);
        }
    }

    public boolean getIopsWrMaxLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LT);
    }

    public NvmfSubsystemWhereInput iopsWrMaxLte(Long iopsWrMaxLte) {

        this.iopsWrMaxLte = iopsWrMaxLte;
        return this;
    }

    /**
     * Get iopsWrMaxLte
     *
     * @return iopsWrMaxLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLte() {
        return iopsWrMaxLte;
    }

    public void setIopsWrMaxLte(Long iopsWrMaxLte) {
        this.iopsWrMaxLte = iopsWrMaxLte;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LTE);
        return this;
    }

    public void setIopsWrMaxLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LTE);
        }
    }

    public boolean getIopsWrMaxLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LTE);
    }

    public NvmfSubsystemWhereInput iopsWrMaxNot(Long iopsWrMaxNot) {

        this.iopsWrMaxNot = iopsWrMaxNot;
        return this;
    }

    /**
     * Get iopsWrMaxNot
     *
     * @return iopsWrMaxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxNot() {
        return iopsWrMaxNot;
    }

    public void setIopsWrMaxNot(Long iopsWrMaxNot) {
        this.iopsWrMaxNot = iopsWrMaxNot;
    }

    public NvmfSubsystemWhereInput iopsWrMaxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_NOT);
        return this;
    }

    public void setIopsWrMaxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_NOT);
        }
    }

    public boolean getIopsWrMaxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_NOT);
    }

    public NvmfSubsystemWhereInput iopsWrMaxNotIn(List<Long> iopsWrMaxNotIn) {

        this.iopsWrMaxNotIn = iopsWrMaxNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsWrMaxNotInItem(Long iopsWrMaxNotInItem) {
        if (this.iopsWrMaxNotIn == null) {
            this.iopsWrMaxNotIn = new ArrayList<Long>();
        }
        this.iopsWrMaxNotIn.add(iopsWrMaxNotInItem);
        return this;
    }

    /**
     * Get iopsWrMaxNotIn
     *
     * @return iopsWrMaxNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsWrMaxNotIn() {
        return iopsWrMaxNotIn;
    }

    public void setIopsWrMaxNotIn(List<Long> iopsWrMaxNotIn) {
        this.iopsWrMaxNotIn = iopsWrMaxNotIn;
    }

    public NvmfSubsystemWhereInput iopsWrMaxNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrMaxNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN);
        return this;
    }

    public void setIopsWrMaxNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN);
        }
    }

    public boolean getIopsWrMaxNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN);
    }

    public NvmfSubsystemWhereInput iopsWrNot(Long iopsWrNot) {

        this.iopsWrNot = iopsWrNot;
        return this;
    }

    /**
     * Get iopsWrNot
     *
     * @return iopsWrNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrNot() {
        return iopsWrNot;
    }

    public void setIopsWrNot(Long iopsWrNot) {
        this.iopsWrNot = iopsWrNot;
    }

    public NvmfSubsystemWhereInput iopsWrNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_NOT);
        return this;
    }

    public void setIopsWrNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_NOT);
        }
    }

    public boolean getIopsWrNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_NOT);
    }

    public NvmfSubsystemWhereInput iopsWrNotIn(List<Long> iopsWrNotIn) {

        this.iopsWrNotIn = iopsWrNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIopsWrNotInItem(Long iopsWrNotInItem) {
        if (this.iopsWrNotIn == null) {
            this.iopsWrNotIn = new ArrayList<Long>();
        }
        this.iopsWrNotIn.add(iopsWrNotInItem);
        return this;
    }

    /**
     * Get iopsWrNotIn
     *
     * @return iopsWrNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getIopsWrNotIn() {
        return iopsWrNotIn;
    }

    public void setIopsWrNotIn(List<Long> iopsWrNotIn) {
        this.iopsWrNotIn = iopsWrNotIn;
    }

    public NvmfSubsystemWhereInput iopsWrNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput iopsWrNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_NOT_IN);
        return this;
    }

    public void setIopsWrNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_NOT_IN);
        }
    }

    public boolean getIopsWrNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_NOT_IN);
    }

    public NvmfSubsystemWhereInput ipWhitelist(String ipWhitelist) {

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

    public NvmfSubsystemWhereInput ipWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelist_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistContains(String ipWhitelistContains) {

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

    public NvmfSubsystemWhereInput ipWhitelistContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistEndsWith(String ipWhitelistEndsWith) {

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

    public NvmfSubsystemWhereInput ipWhitelistEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistGt(String ipWhitelistGt) {

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

    public NvmfSubsystemWhereInput ipWhitelistGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GT);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistGte(String ipWhitelistGte) {

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

    public NvmfSubsystemWhereInput ipWhitelistGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistIn(List<String> ipWhitelistIn) {

        this.ipWhitelistIn = ipWhitelistIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIpWhitelistInItem(String ipWhitelistInItem) {
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

    public NvmfSubsystemWhereInput ipWhitelistIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistLt(String ipWhitelistLt) {

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

    public NvmfSubsystemWhereInput ipWhitelistLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LT);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistLte(String ipWhitelistLte) {

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

    public NvmfSubsystemWhereInput ipWhitelistLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistNot(String ipWhitelistNot) {

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

    public NvmfSubsystemWhereInput ipWhitelistNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistNotContains(String ipWhitelistNotContains) {

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

    public NvmfSubsystemWhereInput ipWhitelistNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistNotContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {

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

    public NvmfSubsystemWhereInput ipWhitelistNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistNotEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistNotIn(List<String> ipWhitelistNotIn) {

        this.ipWhitelistNotIn = ipWhitelistNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addIpWhitelistNotInItem(String ipWhitelistNotInItem) {
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

    public NvmfSubsystemWhereInput ipWhitelistNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {

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

    public NvmfSubsystemWhereInput ipWhitelistNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistNotStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput ipWhitelistStartsWith(String ipWhitelistStartsWith) {

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

    public NvmfSubsystemWhereInput ipWhitelistStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput ipWhitelistStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput iscsiConnectionsEvery(
            IscsiConnectionWhereInput iscsiConnectionsEvery) {

        this.iscsiConnectionsEvery = iscsiConnectionsEvery;
        return this;
    }

    /**
     * Get iscsiConnectionsEvery
     *
     * @return iscsiConnectionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiConnectionWhereInput getIscsiConnectionsEvery() {
        return iscsiConnectionsEvery;
    }

    public void setIscsiConnectionsEvery(IscsiConnectionWhereInput iscsiConnectionsEvery) {
        this.iscsiConnectionsEvery = iscsiConnectionsEvery;
    }

    public NvmfSubsystemWhereInput iscsiConnectionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY);
        return this;
    }

    public NvmfSubsystemWhereInput iscsiConnectionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY);
        return this;
    }

    public void setIscsiConnectionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY);
        }
    }

    public boolean getIscsiConnectionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CONNECTIONS_EVERY);
    }

    public NvmfSubsystemWhereInput iscsiConnectionsNone(
            IscsiConnectionWhereInput iscsiConnectionsNone) {

        this.iscsiConnectionsNone = iscsiConnectionsNone;
        return this;
    }

    /**
     * Get iscsiConnectionsNone
     *
     * @return iscsiConnectionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiConnectionWhereInput getIscsiConnectionsNone() {
        return iscsiConnectionsNone;
    }

    public void setIscsiConnectionsNone(IscsiConnectionWhereInput iscsiConnectionsNone) {
        this.iscsiConnectionsNone = iscsiConnectionsNone;
    }

    public NvmfSubsystemWhereInput iscsiConnectionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE);
        return this;
    }

    public NvmfSubsystemWhereInput iscsiConnectionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE);
        return this;
    }

    public void setIscsiConnectionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE);
        }
    }

    public boolean getIscsiConnectionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CONNECTIONS_NONE);
    }

    public NvmfSubsystemWhereInput iscsiConnectionsSome(
            IscsiConnectionWhereInput iscsiConnectionsSome) {

        this.iscsiConnectionsSome = iscsiConnectionsSome;
        return this;
    }

    /**
     * Get iscsiConnectionsSome
     *
     * @return iscsiConnectionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiConnectionWhereInput getIscsiConnectionsSome() {
        return iscsiConnectionsSome;
    }

    public void setIscsiConnectionsSome(IscsiConnectionWhereInput iscsiConnectionsSome) {
        this.iscsiConnectionsSome = iscsiConnectionsSome;
    }

    public NvmfSubsystemWhereInput iscsiConnectionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME);
        return this;
    }

    public NvmfSubsystemWhereInput iscsiConnectionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME);
        return this;
    }

    public void setIscsiConnectionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME);
        }
    }

    public boolean getIscsiConnectionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CONNECTIONS_SOME);
    }

    public NvmfSubsystemWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public NvmfSubsystemWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public NvmfSubsystemWhereInput labelsEvery_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public NvmfSubsystemWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public NvmfSubsystemWhereInput labelsNone_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public NvmfSubsystemWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public NvmfSubsystemWhereInput labelsSome_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localId(String localId) {

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

    public NvmfSubsystemWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NvmfSubsystemWhereInput localId_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdContains(String localIdContains) {

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

    public NvmfSubsystemWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput localIdContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public NvmfSubsystemWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdGt(String localIdGt) {

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

    public NvmfSubsystemWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public NvmfSubsystemWhereInput localIdGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdGte(String localIdGte) {

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

    public NvmfSubsystemWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput localIdGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public NvmfSubsystemWhereInput addLocalIdInItem(String localIdInItem) {
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

    public NvmfSubsystemWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public NvmfSubsystemWhereInput localIdIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdLt(String localIdLt) {

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

    public NvmfSubsystemWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public NvmfSubsystemWhereInput localIdLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdLte(String localIdLte) {

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

    public NvmfSubsystemWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput localIdLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdNot(String localIdNot) {

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

    public NvmfSubsystemWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput localIdNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdNotContains(String localIdNotContains) {

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

    public NvmfSubsystemWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public NvmfSubsystemWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public NvmfSubsystemWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public NvmfSubsystemWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public NvmfSubsystemWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput name(String name) {

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

    public NvmfSubsystemWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfSubsystemWhereInput name_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameContains(String nameContains) {

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

    public NvmfSubsystemWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput nameContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameEndsWith(String nameEndsWith) {

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

    public NvmfSubsystemWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameGt(String nameGt) {

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

    public NvmfSubsystemWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public NvmfSubsystemWhereInput nameGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameGte(String nameGte) {

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

    public NvmfSubsystemWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput nameGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNameInItem(String nameInItem) {
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

    public NvmfSubsystemWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nameIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameLt(String nameLt) {

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

    public NvmfSubsystemWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public NvmfSubsystemWhereInput nameLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameLte(String nameLte) {

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

    public NvmfSubsystemWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput nameLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameNot(String nameNot) {

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

    public NvmfSubsystemWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput nameNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameNotContains(String nameNotContains) {

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

    public NvmfSubsystemWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput nameNotContains_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public NvmfSubsystemWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNameNotInItem(String nameNotInItem) {
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

    public NvmfSubsystemWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nameNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public NvmfSubsystemWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput nameStartsWith(String nameStartsWith) {

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

    public NvmfSubsystemWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput namespaceGroupsEvery(
            NamespaceGroupWhereInput namespaceGroupsEvery) {

        this.namespaceGroupsEvery = namespaceGroupsEvery;
        return this;
    }

    /**
     * Get namespaceGroupsEvery
     *
     * @return namespaceGroupsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroupsEvery() {
        return namespaceGroupsEvery;
    }

    public void setNamespaceGroupsEvery(NamespaceGroupWhereInput namespaceGroupsEvery) {
        this.namespaceGroupsEvery = namespaceGroupsEvery;
    }

    public NvmfSubsystemWhereInput namespaceGroupsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        return this;
    }

    public NvmfSubsystemWhereInput namespaceGroupsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        return this;
    }

    public void setNamespaceGroupsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
        }
    }

    public boolean getNamespaceGroupsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS_EVERY);
    }

    public NvmfSubsystemWhereInput namespaceGroupsNone(
            NamespaceGroupWhereInput namespaceGroupsNone) {

        this.namespaceGroupsNone = namespaceGroupsNone;
        return this;
    }

    /**
     * Get namespaceGroupsNone
     *
     * @return namespaceGroupsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroupsNone() {
        return namespaceGroupsNone;
    }

    public void setNamespaceGroupsNone(NamespaceGroupWhereInput namespaceGroupsNone) {
        this.namespaceGroupsNone = namespaceGroupsNone;
    }

    public NvmfSubsystemWhereInput namespaceGroupsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        return this;
    }

    public NvmfSubsystemWhereInput namespaceGroupsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        return this;
    }

    public void setNamespaceGroupsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
        }
    }

    public boolean getNamespaceGroupsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS_NONE);
    }

    public NvmfSubsystemWhereInput namespaceGroupsSome(
            NamespaceGroupWhereInput namespaceGroupsSome) {

        this.namespaceGroupsSome = namespaceGroupsSome;
        return this;
    }

    /**
     * Get namespaceGroupsSome
     *
     * @return namespaceGroupsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroupsSome() {
        return namespaceGroupsSome;
    }

    public void setNamespaceGroupsSome(NamespaceGroupWhereInput namespaceGroupsSome) {
        this.namespaceGroupsSome = namespaceGroupsSome;
    }

    public NvmfSubsystemWhereInput namespaceGroupsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        return this;
    }

    public NvmfSubsystemWhereInput namespaceGroupsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        return this;
    }

    public void setNamespaceGroupsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
        }
    }

    public boolean getNamespaceGroupsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS_SOME);
    }

    public NvmfSubsystemWhereInput namespacesEvery(NvmfNamespaceWhereInput namespacesEvery) {

        this.namespacesEvery = namespacesEvery;
        return this;
    }

    /**
     * Get namespacesEvery
     *
     * @return namespacesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNamespacesEvery() {
        return namespacesEvery;
    }

    public void setNamespacesEvery(NvmfNamespaceWhereInput namespacesEvery) {
        this.namespacesEvery = namespacesEvery;
    }

    public NvmfSubsystemWhereInput namespacesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_EVERY);
        return this;
    }

    public NvmfSubsystemWhereInput namespacesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_EVERY);
        return this;
    }

    public void setNamespacesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_EVERY);
        }
    }

    public boolean getNamespacesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_EVERY);
    }

    public NvmfSubsystemWhereInput namespacesNone(NvmfNamespaceWhereInput namespacesNone) {

        this.namespacesNone = namespacesNone;
        return this;
    }

    /**
     * Get namespacesNone
     *
     * @return namespacesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNamespacesNone() {
        return namespacesNone;
    }

    public void setNamespacesNone(NvmfNamespaceWhereInput namespacesNone) {
        this.namespacesNone = namespacesNone;
    }

    public NvmfSubsystemWhereInput namespacesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_NONE);
        return this;
    }

    public NvmfSubsystemWhereInput namespacesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_NONE);
        return this;
    }

    public void setNamespacesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_NONE);
        }
    }

    public boolean getNamespacesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_NONE);
    }

    public NvmfSubsystemWhereInput namespacesSome(NvmfNamespaceWhereInput namespacesSome) {

        this.namespacesSome = namespacesSome;
        return this;
    }

    /**
     * Get namespacesSome
     *
     * @return namespacesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNamespacesSome() {
        return namespacesSome;
    }

    public void setNamespacesSome(NvmfNamespaceWhereInput namespacesSome) {
        this.namespacesSome = namespacesSome;
    }

    public NvmfSubsystemWhereInput namespacesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_SOME);
        return this;
    }

    public NvmfSubsystemWhereInput namespacesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_SOME);
        return this;
    }

    public void setNamespacesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_SOME);
        }
    }

    public boolean getNamespacesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_SOME);
    }

    public NvmfSubsystemWhereInput nqnName(String nqnName) {

        this.nqnName = nqnName;
        return this;
    }

    /**
     * Get nqnName
     *
     * @return nqnName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnName() {
        return nqnName;
    }

    public void setNqnName(String nqnName) {
        this.nqnName = nqnName;
    }

    public NvmfSubsystemWhereInput nqnName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME);
        return this;
    }

    public NvmfSubsystemWhereInput nqnName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME);
        return this;
    }

    public void setNqnName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME);
        }
    }

    public boolean getNqnName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME);
    }

    public NvmfSubsystemWhereInput nqnNameContains(String nqnNameContains) {

        this.nqnNameContains = nqnNameContains;
        return this;
    }

    /**
     * Get nqnNameContains
     *
     * @return nqnNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameContains() {
        return nqnNameContains;
    }

    public void setNqnNameContains(String nqnNameContains) {
        this.nqnNameContains = nqnNameContains;
    }

    public NvmfSubsystemWhereInput nqnNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_CONTAINS);
        return this;
    }

    public void setNqnNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_CONTAINS);
        }
    }

    public boolean getNqnNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_CONTAINS);
    }

    public NvmfSubsystemWhereInput nqnNameEndsWith(String nqnNameEndsWith) {

        this.nqnNameEndsWith = nqnNameEndsWith;
        return this;
    }

    /**
     * Get nqnNameEndsWith
     *
     * @return nqnNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameEndsWith() {
        return nqnNameEndsWith;
    }

    public void setNqnNameEndsWith(String nqnNameEndsWith) {
        this.nqnNameEndsWith = nqnNameEndsWith;
    }

    public NvmfSubsystemWhereInput nqnNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_ENDS_WITH);
        return this;
    }

    public void setNqnNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_ENDS_WITH);
        }
    }

    public boolean getNqnNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_ENDS_WITH);
    }

    public NvmfSubsystemWhereInput nqnNameGt(String nqnNameGt) {

        this.nqnNameGt = nqnNameGt;
        return this;
    }

    /**
     * Get nqnNameGt
     *
     * @return nqnNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameGt() {
        return nqnNameGt;
    }

    public void setNqnNameGt(String nqnNameGt) {
        this.nqnNameGt = nqnNameGt;
    }

    public NvmfSubsystemWhereInput nqnNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_GT);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_GT);
        return this;
    }

    public void setNqnNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_GT);
        }
    }

    public boolean getNqnNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_GT);
    }

    public NvmfSubsystemWhereInput nqnNameGte(String nqnNameGte) {

        this.nqnNameGte = nqnNameGte;
        return this;
    }

    /**
     * Get nqnNameGte
     *
     * @return nqnNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameGte() {
        return nqnNameGte;
    }

    public void setNqnNameGte(String nqnNameGte) {
        this.nqnNameGte = nqnNameGte;
    }

    public NvmfSubsystemWhereInput nqnNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_GTE);
        return this;
    }

    public void setNqnNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_GTE);
        }
    }

    public boolean getNqnNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_GTE);
    }

    public NvmfSubsystemWhereInput nqnNameIn(List<String> nqnNameIn) {

        this.nqnNameIn = nqnNameIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNqnNameInItem(String nqnNameInItem) {
        if (this.nqnNameIn == null) {
            this.nqnNameIn = new ArrayList<String>();
        }
        this.nqnNameIn.add(nqnNameInItem);
        return this;
    }

    /**
     * Get nqnNameIn
     *
     * @return nqnNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNqnNameIn() {
        return nqnNameIn;
    }

    public void setNqnNameIn(List<String> nqnNameIn) {
        this.nqnNameIn = nqnNameIn;
    }

    public NvmfSubsystemWhereInput nqnNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_IN);
        return this;
    }

    public void setNqnNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_IN);
        }
    }

    public boolean getNqnNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_IN);
    }

    public NvmfSubsystemWhereInput nqnNameLt(String nqnNameLt) {

        this.nqnNameLt = nqnNameLt;
        return this;
    }

    /**
     * Get nqnNameLt
     *
     * @return nqnNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameLt() {
        return nqnNameLt;
    }

    public void setNqnNameLt(String nqnNameLt) {
        this.nqnNameLt = nqnNameLt;
    }

    public NvmfSubsystemWhereInput nqnNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_LT);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_LT);
        return this;
    }

    public void setNqnNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_LT);
        }
    }

    public boolean getNqnNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_LT);
    }

    public NvmfSubsystemWhereInput nqnNameLte(String nqnNameLte) {

        this.nqnNameLte = nqnNameLte;
        return this;
    }

    /**
     * Get nqnNameLte
     *
     * @return nqnNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameLte() {
        return nqnNameLte;
    }

    public void setNqnNameLte(String nqnNameLte) {
        this.nqnNameLte = nqnNameLte;
    }

    public NvmfSubsystemWhereInput nqnNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_LTE);
        return this;
    }

    public void setNqnNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_LTE);
        }
    }

    public boolean getNqnNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_LTE);
    }

    public NvmfSubsystemWhereInput nqnNameNot(String nqnNameNot) {

        this.nqnNameNot = nqnNameNot;
        return this;
    }

    /**
     * Get nqnNameNot
     *
     * @return nqnNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameNot() {
        return nqnNameNot;
    }

    public void setNqnNameNot(String nqnNameNot) {
        this.nqnNameNot = nqnNameNot;
    }

    public NvmfSubsystemWhereInput nqnNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT);
        return this;
    }

    public void setNqnNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT);
        }
    }

    public boolean getNqnNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_NOT);
    }

    public NvmfSubsystemWhereInput nqnNameNotContains(String nqnNameNotContains) {

        this.nqnNameNotContains = nqnNameNotContains;
        return this;
    }

    /**
     * Get nqnNameNotContains
     *
     * @return nqnNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameNotContains() {
        return nqnNameNotContains;
    }

    public void setNqnNameNotContains(String nqnNameNotContains) {
        this.nqnNameNotContains = nqnNameNotContains;
    }

    public NvmfSubsystemWhereInput nqnNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNqnNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNqnNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_NOT_CONTAINS);
    }

    public NvmfSubsystemWhereInput nqnNameNotEndsWith(String nqnNameNotEndsWith) {

        this.nqnNameNotEndsWith = nqnNameNotEndsWith;
        return this;
    }

    /**
     * Get nqnNameNotEndsWith
     *
     * @return nqnNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameNotEndsWith() {
        return nqnNameNotEndsWith;
    }

    public void setNqnNameNotEndsWith(String nqnNameNotEndsWith) {
        this.nqnNameNotEndsWith = nqnNameNotEndsWith;
    }

    public NvmfSubsystemWhereInput nqnNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNqnNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNqnNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_NOT_ENDS_WITH);
    }

    public NvmfSubsystemWhereInput nqnNameNotIn(List<String> nqnNameNotIn) {

        this.nqnNameNotIn = nqnNameNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNqnNameNotInItem(String nqnNameNotInItem) {
        if (this.nqnNameNotIn == null) {
            this.nqnNameNotIn = new ArrayList<String>();
        }
        this.nqnNameNotIn.add(nqnNameNotInItem);
        return this;
    }

    /**
     * Get nqnNameNotIn
     *
     * @return nqnNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNqnNameNotIn() {
        return nqnNameNotIn;
    }

    public void setNqnNameNotIn(List<String> nqnNameNotIn) {
        this.nqnNameNotIn = nqnNameNotIn;
    }

    public NvmfSubsystemWhereInput nqnNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_IN);
        return this;
    }

    public void setNqnNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_IN);
        }
    }

    public boolean getNqnNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_NOT_IN);
    }

    public NvmfSubsystemWhereInput nqnNameNotStartsWith(String nqnNameNotStartsWith) {

        this.nqnNameNotStartsWith = nqnNameNotStartsWith;
        return this;
    }

    /**
     * Get nqnNameNotStartsWith
     *
     * @return nqnNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameNotStartsWith() {
        return nqnNameNotStartsWith;
    }

    public void setNqnNameNotStartsWith(String nqnNameNotStartsWith) {
        this.nqnNameNotStartsWith = nqnNameNotStartsWith;
    }

    public NvmfSubsystemWhereInput nqnNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNqnNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNqnNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_NOT_STARTS_WITH);
    }

    public NvmfSubsystemWhereInput nqnNameStartsWith(String nqnNameStartsWith) {

        this.nqnNameStartsWith = nqnNameStartsWith;
        return this;
    }

    /**
     * Get nqnNameStartsWith
     *
     * @return nqnNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnNameStartsWith() {
        return nqnNameStartsWith;
    }

    public void setNqnNameStartsWith(String nqnNameStartsWith) {
        this.nqnNameStartsWith = nqnNameStartsWith;
    }

    public NvmfSubsystemWhereInput nqnNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_STARTS_WITH);
        return this;
    }

    public void setNqnNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME_STARTS_WITH);
        }
    }

    public boolean getNqnNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME_STARTS_WITH);
    }

    public NvmfSubsystemWhereInput nqnWhitelist(String nqnWhitelist) {

        this.nqnWhitelist = nqnWhitelist;
        return this;
    }

    /**
     * Get nqnWhitelist
     *
     * @return nqnWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelist() {
        return nqnWhitelist;
    }

    public void setNqnWhitelist(String nqnWhitelist) {
        this.nqnWhitelist = nqnWhitelist;
    }

    public NvmfSubsystemWhereInput nqnWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public void setNqnWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST);
        }
    }

    public boolean getNqnWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST);
    }

    public NvmfSubsystemWhereInput nqnWhitelistContains(String nqnWhitelistContains) {

        this.nqnWhitelistContains = nqnWhitelistContains;
        return this;
    }

    /**
     * Get nqnWhitelistContains
     *
     * @return nqnWhitelistContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistContains() {
        return nqnWhitelistContains;
    }

    public void setNqnWhitelistContains(String nqnWhitelistContains) {
        this.nqnWhitelistContains = nqnWhitelistContains;
    }

    public NvmfSubsystemWhereInput nqnWhitelistContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_CONTAINS);
        return this;
    }

    public void setNqnWhitelistContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_CONTAINS);
        }
    }

    public boolean getNqnWhitelistContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_CONTAINS);
    }

    public NvmfSubsystemWhereInput nqnWhitelistEndsWith(String nqnWhitelistEndsWith) {

        this.nqnWhitelistEndsWith = nqnWhitelistEndsWith;
        return this;
    }

    /**
     * Get nqnWhitelistEndsWith
     *
     * @return nqnWhitelistEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistEndsWith() {
        return nqnWhitelistEndsWith;
    }

    public void setNqnWhitelistEndsWith(String nqnWhitelistEndsWith) {
        this.nqnWhitelistEndsWith = nqnWhitelistEndsWith;
    }

    public NvmfSubsystemWhereInput nqnWhitelistEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH);
        return this;
    }

    public void setNqnWhitelistEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH);
        }
    }

    public boolean getNqnWhitelistEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_ENDS_WITH);
    }

    public NvmfSubsystemWhereInput nqnWhitelistGt(String nqnWhitelistGt) {

        this.nqnWhitelistGt = nqnWhitelistGt;
        return this;
    }

    /**
     * Get nqnWhitelistGt
     *
     * @return nqnWhitelistGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistGt() {
        return nqnWhitelistGt;
    }

    public void setNqnWhitelistGt(String nqnWhitelistGt) {
        this.nqnWhitelistGt = nqnWhitelistGt;
    }

    public NvmfSubsystemWhereInput nqnWhitelistGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_GT);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_GT);
        return this;
    }

    public void setNqnWhitelistGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_GT);
        }
    }

    public boolean getNqnWhitelistGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_GT);
    }

    public NvmfSubsystemWhereInput nqnWhitelistGte(String nqnWhitelistGte) {

        this.nqnWhitelistGte = nqnWhitelistGte;
        return this;
    }

    /**
     * Get nqnWhitelistGte
     *
     * @return nqnWhitelistGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistGte() {
        return nqnWhitelistGte;
    }

    public void setNqnWhitelistGte(String nqnWhitelistGte) {
        this.nqnWhitelistGte = nqnWhitelistGte;
    }

    public NvmfSubsystemWhereInput nqnWhitelistGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_GTE);
        return this;
    }

    public void setNqnWhitelistGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_GTE);
        }
    }

    public boolean getNqnWhitelistGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_GTE);
    }

    public NvmfSubsystemWhereInput nqnWhitelistIn(List<String> nqnWhitelistIn) {

        this.nqnWhitelistIn = nqnWhitelistIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNqnWhitelistInItem(String nqnWhitelistInItem) {
        if (this.nqnWhitelistIn == null) {
            this.nqnWhitelistIn = new ArrayList<String>();
        }
        this.nqnWhitelistIn.add(nqnWhitelistInItem);
        return this;
    }

    /**
     * Get nqnWhitelistIn
     *
     * @return nqnWhitelistIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNqnWhitelistIn() {
        return nqnWhitelistIn;
    }

    public void setNqnWhitelistIn(List<String> nqnWhitelistIn) {
        this.nqnWhitelistIn = nqnWhitelistIn;
    }

    public NvmfSubsystemWhereInput nqnWhitelistIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_IN);
        return this;
    }

    public void setNqnWhitelistIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_IN);
        }
    }

    public boolean getNqnWhitelistIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_IN);
    }

    public NvmfSubsystemWhereInput nqnWhitelistLt(String nqnWhitelistLt) {

        this.nqnWhitelistLt = nqnWhitelistLt;
        return this;
    }

    /**
     * Get nqnWhitelistLt
     *
     * @return nqnWhitelistLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistLt() {
        return nqnWhitelistLt;
    }

    public void setNqnWhitelistLt(String nqnWhitelistLt) {
        this.nqnWhitelistLt = nqnWhitelistLt;
    }

    public NvmfSubsystemWhereInput nqnWhitelistLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_LT);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_LT);
        return this;
    }

    public void setNqnWhitelistLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_LT);
        }
    }

    public boolean getNqnWhitelistLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_LT);
    }

    public NvmfSubsystemWhereInput nqnWhitelistLte(String nqnWhitelistLte) {

        this.nqnWhitelistLte = nqnWhitelistLte;
        return this;
    }

    /**
     * Get nqnWhitelistLte
     *
     * @return nqnWhitelistLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistLte() {
        return nqnWhitelistLte;
    }

    public void setNqnWhitelistLte(String nqnWhitelistLte) {
        this.nqnWhitelistLte = nqnWhitelistLte;
    }

    public NvmfSubsystemWhereInput nqnWhitelistLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_LTE);
        return this;
    }

    public void setNqnWhitelistLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_LTE);
        }
    }

    public boolean getNqnWhitelistLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_LTE);
    }

    public NvmfSubsystemWhereInput nqnWhitelistNot(String nqnWhitelistNot) {

        this.nqnWhitelistNot = nqnWhitelistNot;
        return this;
    }

    /**
     * Get nqnWhitelistNot
     *
     * @return nqnWhitelistNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistNot() {
        return nqnWhitelistNot;
    }

    public void setNqnWhitelistNot(String nqnWhitelistNot) {
        this.nqnWhitelistNot = nqnWhitelistNot;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT);
        return this;
    }

    public void setNqnWhitelistNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT);
        }
    }

    public boolean getNqnWhitelistNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_NOT);
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotContains(String nqnWhitelistNotContains) {

        this.nqnWhitelistNotContains = nqnWhitelistNotContains;
        return this;
    }

    /**
     * Get nqnWhitelistNotContains
     *
     * @return nqnWhitelistNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistNotContains() {
        return nqnWhitelistNotContains;
    }

    public void setNqnWhitelistNotContains(String nqnWhitelistNotContains) {
        this.nqnWhitelistNotContains = nqnWhitelistNotContains;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public void setNqnWhitelistNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS);
        }
    }

    public boolean getNqnWhitelistNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_NOT_CONTAINS);
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotEndsWith(String nqnWhitelistNotEndsWith) {

        this.nqnWhitelistNotEndsWith = nqnWhitelistNotEndsWith;
        return this;
    }

    /**
     * Get nqnWhitelistNotEndsWith
     *
     * @return nqnWhitelistNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistNotEndsWith() {
        return nqnWhitelistNotEndsWith;
    }

    public void setNqnWhitelistNotEndsWith(String nqnWhitelistNotEndsWith) {
        this.nqnWhitelistNotEndsWith = nqnWhitelistNotEndsWith;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public void setNqnWhitelistNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH);
        }
    }

    public boolean getNqnWhitelistNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_NOT_ENDS_WITH);
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotIn(List<String> nqnWhitelistNotIn) {

        this.nqnWhitelistNotIn = nqnWhitelistNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNqnWhitelistNotInItem(String nqnWhitelistNotInItem) {
        if (this.nqnWhitelistNotIn == null) {
            this.nqnWhitelistNotIn = new ArrayList<String>();
        }
        this.nqnWhitelistNotIn.add(nqnWhitelistNotInItem);
        return this;
    }

    /**
     * Get nqnWhitelistNotIn
     *
     * @return nqnWhitelistNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNqnWhitelistNotIn() {
        return nqnWhitelistNotIn;
    }

    public void setNqnWhitelistNotIn(List<String> nqnWhitelistNotIn) {
        this.nqnWhitelistNotIn = nqnWhitelistNotIn;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_IN);
        return this;
    }

    public void setNqnWhitelistNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_IN);
        }
    }

    public boolean getNqnWhitelistNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_NOT_IN);
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotStartsWith(String nqnWhitelistNotStartsWith) {

        this.nqnWhitelistNotStartsWith = nqnWhitelistNotStartsWith;
        return this;
    }

    /**
     * Get nqnWhitelistNotStartsWith
     *
     * @return nqnWhitelistNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistNotStartsWith() {
        return nqnWhitelistNotStartsWith;
    }

    public void setNqnWhitelistNotStartsWith(String nqnWhitelistNotStartsWith) {
        this.nqnWhitelistNotStartsWith = nqnWhitelistNotStartsWith;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public void setNqnWhitelistNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH);
        }
    }

    public boolean getNqnWhitelistNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_NOT_STARTS_WITH);
    }

    public NvmfSubsystemWhereInput nqnWhitelistStartsWith(String nqnWhitelistStartsWith) {

        this.nqnWhitelistStartsWith = nqnWhitelistStartsWith;
        return this;
    }

    /**
     * Get nqnWhitelistStartsWith
     *
     * @return nqnWhitelistStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNqnWhitelistStartsWith() {
        return nqnWhitelistStartsWith;
    }

    public void setNqnWhitelistStartsWith(String nqnWhitelistStartsWith) {
        this.nqnWhitelistStartsWith = nqnWhitelistStartsWith;
    }

    public NvmfSubsystemWhereInput nqnWhitelistStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH);
        return this;
    }

    public NvmfSubsystemWhereInput nqnWhitelistStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH);
        return this;
    }

    public void setNqnWhitelistStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH);
        }
    }

    public boolean getNqnWhitelistStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST_STARTS_WITH);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNum(Integer nvmfNamespacesNum) {

        this.nvmfNamespacesNum = nvmfNamespacesNum;
        return this;
    }

    /**
     * Get nvmfNamespacesNum
     *
     * @return nvmfNamespacesNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNum() {
        return nvmfNamespacesNum;
    }

    public void setNvmfNamespacesNum(Integer nvmfNamespacesNum) {
        this.nvmfNamespacesNum = nvmfNamespacesNum;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        return this;
    }

    public void setNvmfNamespacesNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        }
    }

    public boolean getNvmfNamespacesNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumGt(Integer nvmfNamespacesNumGt) {

        this.nvmfNamespacesNumGt = nvmfNamespacesNumGt;
        return this;
    }

    /**
     * Get nvmfNamespacesNumGt
     *
     * @return nvmfNamespacesNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNumGt() {
        return nvmfNamespacesNumGt;
    }

    public void setNvmfNamespacesNumGt(Integer nvmfNamespacesNumGt) {
        this.nvmfNamespacesNumGt = nvmfNamespacesNumGt;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT);
        return this;
    }

    public void setNvmfNamespacesNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT);
        }
    }

    public boolean getNvmfNamespacesNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GT);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumGte(Integer nvmfNamespacesNumGte) {

        this.nvmfNamespacesNumGte = nvmfNamespacesNumGte;
        return this;
    }

    /**
     * Get nvmfNamespacesNumGte
     *
     * @return nvmfNamespacesNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNumGte() {
        return nvmfNamespacesNumGte;
    }

    public void setNvmfNamespacesNumGte(Integer nvmfNamespacesNumGte) {
        this.nvmfNamespacesNumGte = nvmfNamespacesNumGte;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE);
        return this;
    }

    public void setNvmfNamespacesNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE);
        }
    }

    public boolean getNvmfNamespacesNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_GTE);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumIn(List<Integer> nvmfNamespacesNumIn) {

        this.nvmfNamespacesNumIn = nvmfNamespacesNumIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNvmfNamespacesNumInItem(Integer nvmfNamespacesNumInItem) {
        if (this.nvmfNamespacesNumIn == null) {
            this.nvmfNamespacesNumIn = new ArrayList<Integer>();
        }
        this.nvmfNamespacesNumIn.add(nvmfNamespacesNumInItem);
        return this;
    }

    /**
     * Get nvmfNamespacesNumIn
     *
     * @return nvmfNamespacesNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfNamespacesNumIn() {
        return nvmfNamespacesNumIn;
    }

    public void setNvmfNamespacesNumIn(List<Integer> nvmfNamespacesNumIn) {
        this.nvmfNamespacesNumIn = nvmfNamespacesNumIn;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN);
        return this;
    }

    public void setNvmfNamespacesNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN);
        }
    }

    public boolean getNvmfNamespacesNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_IN);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumLt(Integer nvmfNamespacesNumLt) {

        this.nvmfNamespacesNumLt = nvmfNamespacesNumLt;
        return this;
    }

    /**
     * Get nvmfNamespacesNumLt
     *
     * @return nvmfNamespacesNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNumLt() {
        return nvmfNamespacesNumLt;
    }

    public void setNvmfNamespacesNumLt(Integer nvmfNamespacesNumLt) {
        this.nvmfNamespacesNumLt = nvmfNamespacesNumLt;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT);
        return this;
    }

    public void setNvmfNamespacesNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT);
        }
    }

    public boolean getNvmfNamespacesNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LT);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumLte(Integer nvmfNamespacesNumLte) {

        this.nvmfNamespacesNumLte = nvmfNamespacesNumLte;
        return this;
    }

    /**
     * Get nvmfNamespacesNumLte
     *
     * @return nvmfNamespacesNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNumLte() {
        return nvmfNamespacesNumLte;
    }

    public void setNvmfNamespacesNumLte(Integer nvmfNamespacesNumLte) {
        this.nvmfNamespacesNumLte = nvmfNamespacesNumLte;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE);
        return this;
    }

    public void setNvmfNamespacesNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE);
        }
    }

    public boolean getNvmfNamespacesNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_LTE);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumNot(Integer nvmfNamespacesNumNot) {

        this.nvmfNamespacesNumNot = nvmfNamespacesNumNot;
        return this;
    }

    /**
     * Get nvmfNamespacesNumNot
     *
     * @return nvmfNamespacesNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNumNot() {
        return nvmfNamespacesNumNot;
    }

    public void setNvmfNamespacesNumNot(Integer nvmfNamespacesNumNot) {
        this.nvmfNamespacesNumNot = nvmfNamespacesNumNot;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT);
        return this;
    }

    public void setNvmfNamespacesNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT);
        }
    }

    public boolean getNvmfNamespacesNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT);
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumNotIn(List<Integer> nvmfNamespacesNumNotIn) {

        this.nvmfNamespacesNumNotIn = nvmfNamespacesNumNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addNvmfNamespacesNumNotInItem(
            Integer nvmfNamespacesNumNotInItem) {
        if (this.nvmfNamespacesNumNotIn == null) {
            this.nvmfNamespacesNumNotIn = new ArrayList<Integer>();
        }
        this.nvmfNamespacesNumNotIn.add(nvmfNamespacesNumNotInItem);
        return this;
    }

    /**
     * Get nvmfNamespacesNumNotIn
     *
     * @return nvmfNamespacesNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmfNamespacesNumNotIn() {
        return nvmfNamespacesNumNotIn;
    }

    public void setNvmfNamespacesNumNotIn(List<Integer> nvmfNamespacesNumNotIn) {
        this.nvmfNamespacesNumNotIn = nvmfNamespacesNumNotIn;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput nvmfNamespacesNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN);
        return this;
    }

    public void setNvmfNamespacesNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN);
        }
    }

    public boolean getNvmfNamespacesNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM_NOT_IN);
    }

    public NvmfSubsystemWhereInput policy(NvmfSubsystemPolicyType policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Get policy
     *
     * @return policy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemPolicyType getPolicy() {
        return policy;
    }

    public void setPolicy(NvmfSubsystemPolicyType policy) {
        this.policy = policy;
    }

    public NvmfSubsystemWhereInput policy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY);
        return this;
    }

    public NvmfSubsystemWhereInput policy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY);
        return this;
    }

    public void setPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY);
        }
    }

    public boolean getPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY);
    }

    public NvmfSubsystemWhereInput policyIn(List<NvmfSubsystemPolicyType> policyIn) {

        this.policyIn = policyIn;
        return this;
    }

    public NvmfSubsystemWhereInput addPolicyInItem(NvmfSubsystemPolicyType policyInItem) {
        if (this.policyIn == null) {
            this.policyIn = new ArrayList<NvmfSubsystemPolicyType>();
        }
        this.policyIn.add(policyInItem);
        return this;
    }

    /**
     * Get policyIn
     *
     * @return policyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NvmfSubsystemPolicyType> getPolicyIn() {
        return policyIn;
    }

    public void setPolicyIn(List<NvmfSubsystemPolicyType> policyIn) {
        this.policyIn = policyIn;
    }

    public NvmfSubsystemWhereInput policyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_IN);
        return this;
    }

    public NvmfSubsystemWhereInput policyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY_IN);
        return this;
    }

    public void setPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY_IN);
        }
    }

    public boolean getPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY_IN);
    }

    public NvmfSubsystemWhereInput policyNot(NvmfSubsystemPolicyType policyNot) {

        this.policyNot = policyNot;
        return this;
    }

    /**
     * Get policyNot
     *
     * @return policyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemPolicyType getPolicyNot() {
        return policyNot;
    }

    public void setPolicyNot(NvmfSubsystemPolicyType policyNot) {
        this.policyNot = policyNot;
    }

    public NvmfSubsystemWhereInput policyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput policyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY_NOT);
        return this;
    }

    public void setPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY_NOT);
        }
    }

    public boolean getPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY_NOT);
    }

    public NvmfSubsystemWhereInput policyNotIn(List<NvmfSubsystemPolicyType> policyNotIn) {

        this.policyNotIn = policyNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addPolicyNotInItem(NvmfSubsystemPolicyType policyNotInItem) {
        if (this.policyNotIn == null) {
            this.policyNotIn = new ArrayList<NvmfSubsystemPolicyType>();
        }
        this.policyNotIn.add(policyNotInItem);
        return this;
    }

    /**
     * Get policyNotIn
     *
     * @return policyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NvmfSubsystemPolicyType> getPolicyNotIn() {
        return policyNotIn;
    }

    public void setPolicyNotIn(List<NvmfSubsystemPolicyType> policyNotIn) {
        this.policyNotIn = policyNotIn;
    }

    public NvmfSubsystemWhereInput policyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput policyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY_NOT_IN);
        return this;
    }

    public void setPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY_NOT_IN);
        }
    }

    public boolean getPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY_NOT_IN);
    }

    public NvmfSubsystemWhereInput prioritized(Boolean prioritized) {

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

    public NvmfSubsystemWhereInput prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NvmfSubsystemWhereInput prioritized_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput prioritizedNot(Boolean prioritizedNot) {

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

    public NvmfSubsystemWhereInput prioritizedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput prioritizedNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNum(Integer replicaNum) {

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

    public NvmfSubsystemWhereInput replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNum_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumGt(Integer replicaNumGt) {

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

    public NvmfSubsystemWhereInput replicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumGt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumGte(Integer replicaNumGte) {

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

    public NvmfSubsystemWhereInput replicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumGte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumIn(List<Integer> replicaNumIn) {

        this.replicaNumIn = replicaNumIn;
        return this;
    }

    public NvmfSubsystemWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
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

    public NvmfSubsystemWhereInput replicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumLt(Integer replicaNumLt) {

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

    public NvmfSubsystemWhereInput replicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumLt_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumLte(Integer replicaNumLte) {

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

    public NvmfSubsystemWhereInput replicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumLte_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumNot(Integer replicaNumNot) {

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

    public NvmfSubsystemWhereInput replicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {

        this.replicaNumNotIn = replicaNumNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
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

    public NvmfSubsystemWhereInput replicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput replicaNumNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput resiliencyType(ResiliencyType resiliencyType) {

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

    public NvmfSubsystemWhereInput resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NvmfSubsystemWhereInput resiliencyType_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput resiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {

        this.resiliencyTypeIn = resiliencyTypeIn;
        return this;
    }

    public NvmfSubsystemWhereInput addResiliencyTypeInItem(ResiliencyType resiliencyTypeInItem) {
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

    public NvmfSubsystemWhereInput resiliencyTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public NvmfSubsystemWhereInput resiliencyTypeIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput resiliencyTypeNot(ResiliencyType resiliencyTypeNot) {

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

    public NvmfSubsystemWhereInput resiliencyTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput resiliencyTypeNot_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput resiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {

        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addResiliencyTypeNotInItem(
            ResiliencyType resiliencyTypeNotInItem) {
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

    public NvmfSubsystemWhereInput resiliencyTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput resiliencyTypeNotIn_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput stripeNum(Integer stripeNum) {

        this.stripeNum = stripeNum;
        return this;
    }

    /**
     * Get stripeNum
     *
     * @return stripeNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStripeNum() {
        return stripeNum;
    }

    public void setStripeNum(Integer stripeNum) {
        this.stripeNum = stripeNum;
    }

    public NvmfSubsystemWhereInput stripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public void setStripeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM);
        }
    }

    public boolean getStripeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM);
    }

    public NvmfSubsystemWhereInput stripeNumGt(Integer stripeNumGt) {

        this.stripeNumGt = stripeNumGt;
        return this;
    }

    /**
     * Get stripeNumGt
     *
     * @return stripeNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStripeNumGt() {
        return stripeNumGt;
    }

    public void setStripeNumGt(Integer stripeNumGt) {
        this.stripeNumGt = stripeNumGt;
    }

    public NvmfSubsystemWhereInput stripeNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_GT);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_GT);
        return this;
    }

    public void setStripeNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_GT);
        }
    }

    public boolean getStripeNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_GT);
    }

    public NvmfSubsystemWhereInput stripeNumGte(Integer stripeNumGte) {

        this.stripeNumGte = stripeNumGte;
        return this;
    }

    /**
     * Get stripeNumGte
     *
     * @return stripeNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStripeNumGte() {
        return stripeNumGte;
    }

    public void setStripeNumGte(Integer stripeNumGte) {
        this.stripeNumGte = stripeNumGte;
    }

    public NvmfSubsystemWhereInput stripeNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_GTE);
        return this;
    }

    public void setStripeNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_GTE);
        }
    }

    public boolean getStripeNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_GTE);
    }

    public NvmfSubsystemWhereInput stripeNumIn(List<Integer> stripeNumIn) {

        this.stripeNumIn = stripeNumIn;
        return this;
    }

    public NvmfSubsystemWhereInput addStripeNumInItem(Integer stripeNumInItem) {
        if (this.stripeNumIn == null) {
            this.stripeNumIn = new ArrayList<Integer>();
        }
        this.stripeNumIn.add(stripeNumInItem);
        return this;
    }

    /**
     * Get stripeNumIn
     *
     * @return stripeNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getStripeNumIn() {
        return stripeNumIn;
    }

    public void setStripeNumIn(List<Integer> stripeNumIn) {
        this.stripeNumIn = stripeNumIn;
    }

    public NvmfSubsystemWhereInput stripeNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_IN);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_IN);
        return this;
    }

    public void setStripeNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_IN);
        }
    }

    public boolean getStripeNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_IN);
    }

    public NvmfSubsystemWhereInput stripeNumLt(Integer stripeNumLt) {

        this.stripeNumLt = stripeNumLt;
        return this;
    }

    /**
     * Get stripeNumLt
     *
     * @return stripeNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStripeNumLt() {
        return stripeNumLt;
    }

    public void setStripeNumLt(Integer stripeNumLt) {
        this.stripeNumLt = stripeNumLt;
    }

    public NvmfSubsystemWhereInput stripeNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_LT);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_LT);
        return this;
    }

    public void setStripeNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_LT);
        }
    }

    public boolean getStripeNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_LT);
    }

    public NvmfSubsystemWhereInput stripeNumLte(Integer stripeNumLte) {

        this.stripeNumLte = stripeNumLte;
        return this;
    }

    /**
     * Get stripeNumLte
     *
     * @return stripeNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStripeNumLte() {
        return stripeNumLte;
    }

    public void setStripeNumLte(Integer stripeNumLte) {
        this.stripeNumLte = stripeNumLte;
    }

    public NvmfSubsystemWhereInput stripeNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_LTE);
        return this;
    }

    public void setStripeNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_LTE);
        }
    }

    public boolean getStripeNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_LTE);
    }

    public NvmfSubsystemWhereInput stripeNumNot(Integer stripeNumNot) {

        this.stripeNumNot = stripeNumNot;
        return this;
    }

    /**
     * Get stripeNumNot
     *
     * @return stripeNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStripeNumNot() {
        return stripeNumNot;
    }

    public void setStripeNumNot(Integer stripeNumNot) {
        this.stripeNumNot = stripeNumNot;
    }

    public NvmfSubsystemWhereInput stripeNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_NOT);
        return this;
    }

    public void setStripeNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_NOT);
        }
    }

    public boolean getStripeNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_NOT);
    }

    public NvmfSubsystemWhereInput stripeNumNotIn(List<Integer> stripeNumNotIn) {

        this.stripeNumNotIn = stripeNumNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addStripeNumNotInItem(Integer stripeNumNotInItem) {
        if (this.stripeNumNotIn == null) {
            this.stripeNumNotIn = new ArrayList<Integer>();
        }
        this.stripeNumNotIn.add(stripeNumNotInItem);
        return this;
    }

    /**
     * Get stripeNumNotIn
     *
     * @return stripeNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getStripeNumNotIn() {
        return stripeNumNotIn;
    }

    public void setStripeNumNotIn(List<Integer> stripeNumNotIn) {
        this.stripeNumNotIn = stripeNumNotIn;
    }

    public NvmfSubsystemWhereInput stripeNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput stripeNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_NOT_IN);
        return this;
    }

    public void setStripeNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM_NOT_IN);
        }
    }

    public boolean getStripeNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM_NOT_IN);
    }

    public NvmfSubsystemWhereInput stripeSize(Long stripeSize) {

        this.stripeSize = stripeSize;
        return this;
    }

    /**
     * Get stripeSize
     *
     * @return stripeSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getStripeSize() {
        return stripeSize;
    }

    public void setStripeSize(Long stripeSize) {
        this.stripeSize = stripeSize;
    }

    public NvmfSubsystemWhereInput stripeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public void setStripeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE);
        }
    }

    public boolean getStripeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE);
    }

    public NvmfSubsystemWhereInput stripeSizeGt(Long stripeSizeGt) {

        this.stripeSizeGt = stripeSizeGt;
        return this;
    }

    /**
     * Get stripeSizeGt
     *
     * @return stripeSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getStripeSizeGt() {
        return stripeSizeGt;
    }

    public void setStripeSizeGt(Long stripeSizeGt) {
        this.stripeSizeGt = stripeSizeGt;
    }

    public NvmfSubsystemWhereInput stripeSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_GT);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_GT);
        return this;
    }

    public void setStripeSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_GT);
        }
    }

    public boolean getStripeSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_GT);
    }

    public NvmfSubsystemWhereInput stripeSizeGte(Long stripeSizeGte) {

        this.stripeSizeGte = stripeSizeGte;
        return this;
    }

    /**
     * Get stripeSizeGte
     *
     * @return stripeSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getStripeSizeGte() {
        return stripeSizeGte;
    }

    public void setStripeSizeGte(Long stripeSizeGte) {
        this.stripeSizeGte = stripeSizeGte;
    }

    public NvmfSubsystemWhereInput stripeSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_GTE);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_GTE);
        return this;
    }

    public void setStripeSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_GTE);
        }
    }

    public boolean getStripeSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_GTE);
    }

    public NvmfSubsystemWhereInput stripeSizeIn(List<Long> stripeSizeIn) {

        this.stripeSizeIn = stripeSizeIn;
        return this;
    }

    public NvmfSubsystemWhereInput addStripeSizeInItem(Long stripeSizeInItem) {
        if (this.stripeSizeIn == null) {
            this.stripeSizeIn = new ArrayList<Long>();
        }
        this.stripeSizeIn.add(stripeSizeInItem);
        return this;
    }

    /**
     * Get stripeSizeIn
     *
     * @return stripeSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getStripeSizeIn() {
        return stripeSizeIn;
    }

    public void setStripeSizeIn(List<Long> stripeSizeIn) {
        this.stripeSizeIn = stripeSizeIn;
    }

    public NvmfSubsystemWhereInput stripeSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_IN);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_IN);
        return this;
    }

    public void setStripeSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_IN);
        }
    }

    public boolean getStripeSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_IN);
    }

    public NvmfSubsystemWhereInput stripeSizeLt(Long stripeSizeLt) {

        this.stripeSizeLt = stripeSizeLt;
        return this;
    }

    /**
     * Get stripeSizeLt
     *
     * @return stripeSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getStripeSizeLt() {
        return stripeSizeLt;
    }

    public void setStripeSizeLt(Long stripeSizeLt) {
        this.stripeSizeLt = stripeSizeLt;
    }

    public NvmfSubsystemWhereInput stripeSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_LT);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_LT);
        return this;
    }

    public void setStripeSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_LT);
        }
    }

    public boolean getStripeSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_LT);
    }

    public NvmfSubsystemWhereInput stripeSizeLte(Long stripeSizeLte) {

        this.stripeSizeLte = stripeSizeLte;
        return this;
    }

    /**
     * Get stripeSizeLte
     *
     * @return stripeSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getStripeSizeLte() {
        return stripeSizeLte;
    }

    public void setStripeSizeLte(Long stripeSizeLte) {
        this.stripeSizeLte = stripeSizeLte;
    }

    public NvmfSubsystemWhereInput stripeSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_LTE);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_LTE);
        return this;
    }

    public void setStripeSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_LTE);
        }
    }

    public boolean getStripeSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_LTE);
    }

    public NvmfSubsystemWhereInput stripeSizeNot(Long stripeSizeNot) {

        this.stripeSizeNot = stripeSizeNot;
        return this;
    }

    /**
     * Get stripeSizeNot
     *
     * @return stripeSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getStripeSizeNot() {
        return stripeSizeNot;
    }

    public void setStripeSizeNot(Long stripeSizeNot) {
        this.stripeSizeNot = stripeSizeNot;
    }

    public NvmfSubsystemWhereInput stripeSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_NOT);
        return this;
    }

    public void setStripeSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_NOT);
        }
    }

    public boolean getStripeSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_NOT);
    }

    public NvmfSubsystemWhereInput stripeSizeNotIn(List<Long> stripeSizeNotIn) {

        this.stripeSizeNotIn = stripeSizeNotIn;
        return this;
    }

    public NvmfSubsystemWhereInput addStripeSizeNotInItem(Long stripeSizeNotInItem) {
        if (this.stripeSizeNotIn == null) {
            this.stripeSizeNotIn = new ArrayList<Long>();
        }
        this.stripeSizeNotIn.add(stripeSizeNotInItem);
        return this;
    }

    /**
     * Get stripeSizeNotIn
     *
     * @return stripeSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getStripeSizeNotIn() {
        return stripeSizeNotIn;
    }

    public void setStripeSizeNotIn(List<Long> stripeSizeNotIn) {
        this.stripeSizeNotIn = stripeSizeNotIn;
    }

    public NvmfSubsystemWhereInput stripeSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN);
        return this;
    }

    public NvmfSubsystemWhereInput stripeSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN);
        return this;
    }

    public void setStripeSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN);
        }
    }

    public boolean getStripeSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN);
    }

    public NvmfSubsystemWhereInput thinProvision(Boolean thinProvision) {

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

    public NvmfSubsystemWhereInput thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public NvmfSubsystemWhereInput thinProvision_ExplictlyNonNull() {
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

    public NvmfSubsystemWhereInput thinProvisionNot(Boolean thinProvisionNot) {

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

    public NvmfSubsystemWhereInput thinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public NvmfSubsystemWhereInput thinProvisionNot_ExplictlyNonNull() {
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
        NvmfSubsystemWhereInput nvmfSubsystemWhereInput = (NvmfSubsystemWhereInput) o;
        return Objects.equals(this.AND, nvmfSubsystemWhereInput.AND)
                && Objects.equals(this.NOT, nvmfSubsystemWhereInput.NOT)
                && Objects.equals(this.OR, nvmfSubsystemWhereInput.OR)
                && Objects.equals(this.bps, nvmfSubsystemWhereInput.bps)
                && Objects.equals(this.bpsGt, nvmfSubsystemWhereInput.bpsGt)
                && Objects.equals(this.bpsGte, nvmfSubsystemWhereInput.bpsGte)
                && Objects.equals(this.bpsIn, nvmfSubsystemWhereInput.bpsIn)
                && Objects.equals(this.bpsLt, nvmfSubsystemWhereInput.bpsLt)
                && Objects.equals(this.bpsLte, nvmfSubsystemWhereInput.bpsLte)
                && Objects.equals(this.bpsMax, nvmfSubsystemWhereInput.bpsMax)
                && Objects.equals(this.bpsMaxGt, nvmfSubsystemWhereInput.bpsMaxGt)
                && Objects.equals(this.bpsMaxGte, nvmfSubsystemWhereInput.bpsMaxGte)
                && Objects.equals(this.bpsMaxIn, nvmfSubsystemWhereInput.bpsMaxIn)
                && Objects.equals(this.bpsMaxLength, nvmfSubsystemWhereInput.bpsMaxLength)
                && Objects.equals(this.bpsMaxLengthGt, nvmfSubsystemWhereInput.bpsMaxLengthGt)
                && Objects.equals(this.bpsMaxLengthGte, nvmfSubsystemWhereInput.bpsMaxLengthGte)
                && Objects.equals(this.bpsMaxLengthIn, nvmfSubsystemWhereInput.bpsMaxLengthIn)
                && Objects.equals(this.bpsMaxLengthLt, nvmfSubsystemWhereInput.bpsMaxLengthLt)
                && Objects.equals(this.bpsMaxLengthLte, nvmfSubsystemWhereInput.bpsMaxLengthLte)
                && Objects.equals(this.bpsMaxLengthNot, nvmfSubsystemWhereInput.bpsMaxLengthNot)
                && Objects.equals(this.bpsMaxLengthNotIn, nvmfSubsystemWhereInput.bpsMaxLengthNotIn)
                && Objects.equals(this.bpsMaxLt, nvmfSubsystemWhereInput.bpsMaxLt)
                && Objects.equals(this.bpsMaxLte, nvmfSubsystemWhereInput.bpsMaxLte)
                && Objects.equals(this.bpsMaxNot, nvmfSubsystemWhereInput.bpsMaxNot)
                && Objects.equals(this.bpsMaxNotIn, nvmfSubsystemWhereInput.bpsMaxNotIn)
                && Objects.equals(this.bpsNot, nvmfSubsystemWhereInput.bpsNot)
                && Objects.equals(this.bpsNotIn, nvmfSubsystemWhereInput.bpsNotIn)
                && Objects.equals(this.bpsRd, nvmfSubsystemWhereInput.bpsRd)
                && Objects.equals(this.bpsRdGt, nvmfSubsystemWhereInput.bpsRdGt)
                && Objects.equals(this.bpsRdGte, nvmfSubsystemWhereInput.bpsRdGte)
                && Objects.equals(this.bpsRdIn, nvmfSubsystemWhereInput.bpsRdIn)
                && Objects.equals(this.bpsRdLt, nvmfSubsystemWhereInput.bpsRdLt)
                && Objects.equals(this.bpsRdLte, nvmfSubsystemWhereInput.bpsRdLte)
                && Objects.equals(this.bpsRdMax, nvmfSubsystemWhereInput.bpsRdMax)
                && Objects.equals(this.bpsRdMaxGt, nvmfSubsystemWhereInput.bpsRdMaxGt)
                && Objects.equals(this.bpsRdMaxGte, nvmfSubsystemWhereInput.bpsRdMaxGte)
                && Objects.equals(this.bpsRdMaxIn, nvmfSubsystemWhereInput.bpsRdMaxIn)
                && Objects.equals(this.bpsRdMaxLength, nvmfSubsystemWhereInput.bpsRdMaxLength)
                && Objects.equals(this.bpsRdMaxLengthGt, nvmfSubsystemWhereInput.bpsRdMaxLengthGt)
                && Objects.equals(this.bpsRdMaxLengthGte, nvmfSubsystemWhereInput.bpsRdMaxLengthGte)
                && Objects.equals(this.bpsRdMaxLengthIn, nvmfSubsystemWhereInput.bpsRdMaxLengthIn)
                && Objects.equals(this.bpsRdMaxLengthLt, nvmfSubsystemWhereInput.bpsRdMaxLengthLt)
                && Objects.equals(this.bpsRdMaxLengthLte, nvmfSubsystemWhereInput.bpsRdMaxLengthLte)
                && Objects.equals(this.bpsRdMaxLengthNot, nvmfSubsystemWhereInput.bpsRdMaxLengthNot)
                && Objects.equals(
                        this.bpsRdMaxLengthNotIn, nvmfSubsystemWhereInput.bpsRdMaxLengthNotIn)
                && Objects.equals(this.bpsRdMaxLt, nvmfSubsystemWhereInput.bpsRdMaxLt)
                && Objects.equals(this.bpsRdMaxLte, nvmfSubsystemWhereInput.bpsRdMaxLte)
                && Objects.equals(this.bpsRdMaxNot, nvmfSubsystemWhereInput.bpsRdMaxNot)
                && Objects.equals(this.bpsRdMaxNotIn, nvmfSubsystemWhereInput.bpsRdMaxNotIn)
                && Objects.equals(this.bpsRdNot, nvmfSubsystemWhereInput.bpsRdNot)
                && Objects.equals(this.bpsRdNotIn, nvmfSubsystemWhereInput.bpsRdNotIn)
                && Objects.equals(this.bpsWr, nvmfSubsystemWhereInput.bpsWr)
                && Objects.equals(this.bpsWrGt, nvmfSubsystemWhereInput.bpsWrGt)
                && Objects.equals(this.bpsWrGte, nvmfSubsystemWhereInput.bpsWrGte)
                && Objects.equals(this.bpsWrIn, nvmfSubsystemWhereInput.bpsWrIn)
                && Objects.equals(this.bpsWrLt, nvmfSubsystemWhereInput.bpsWrLt)
                && Objects.equals(this.bpsWrLte, nvmfSubsystemWhereInput.bpsWrLte)
                && Objects.equals(this.bpsWrMax, nvmfSubsystemWhereInput.bpsWrMax)
                && Objects.equals(this.bpsWrMaxGt, nvmfSubsystemWhereInput.bpsWrMaxGt)
                && Objects.equals(this.bpsWrMaxGte, nvmfSubsystemWhereInput.bpsWrMaxGte)
                && Objects.equals(this.bpsWrMaxIn, nvmfSubsystemWhereInput.bpsWrMaxIn)
                && Objects.equals(this.bpsWrMaxLength, nvmfSubsystemWhereInput.bpsWrMaxLength)
                && Objects.equals(this.bpsWrMaxLengthGt, nvmfSubsystemWhereInput.bpsWrMaxLengthGt)
                && Objects.equals(this.bpsWrMaxLengthGte, nvmfSubsystemWhereInput.bpsWrMaxLengthGte)
                && Objects.equals(this.bpsWrMaxLengthIn, nvmfSubsystemWhereInput.bpsWrMaxLengthIn)
                && Objects.equals(this.bpsWrMaxLengthLt, nvmfSubsystemWhereInput.bpsWrMaxLengthLt)
                && Objects.equals(this.bpsWrMaxLengthLte, nvmfSubsystemWhereInput.bpsWrMaxLengthLte)
                && Objects.equals(this.bpsWrMaxLengthNot, nvmfSubsystemWhereInput.bpsWrMaxLengthNot)
                && Objects.equals(
                        this.bpsWrMaxLengthNotIn, nvmfSubsystemWhereInput.bpsWrMaxLengthNotIn)
                && Objects.equals(this.bpsWrMaxLt, nvmfSubsystemWhereInput.bpsWrMaxLt)
                && Objects.equals(this.bpsWrMaxLte, nvmfSubsystemWhereInput.bpsWrMaxLte)
                && Objects.equals(this.bpsWrMaxNot, nvmfSubsystemWhereInput.bpsWrMaxNot)
                && Objects.equals(this.bpsWrMaxNotIn, nvmfSubsystemWhereInput.bpsWrMaxNotIn)
                && Objects.equals(this.bpsWrNot, nvmfSubsystemWhereInput.bpsWrNot)
                && Objects.equals(this.bpsWrNotIn, nvmfSubsystemWhereInput.bpsWrNotIn)
                && Objects.equals(
                        this.businessHostGroupsEvery,
                        nvmfSubsystemWhereInput.businessHostGroupsEvery)
                && Objects.equals(
                        this.businessHostGroupsNone, nvmfSubsystemWhereInput.businessHostGroupsNone)
                && Objects.equals(
                        this.businessHostGroupsSome, nvmfSubsystemWhereInput.businessHostGroupsSome)
                && Objects.equals(
                        this.businessHostsEvery, nvmfSubsystemWhereInput.businessHostsEvery)
                && Objects.equals(this.businessHostsNone, nvmfSubsystemWhereInput.businessHostsNone)
                && Objects.equals(this.businessHostsSome, nvmfSubsystemWhereInput.businessHostsSome)
                && Objects.equals(this.cluster, nvmfSubsystemWhereInput.cluster)
                && Objects.equals(
                        this.configurationAdaptive, nvmfSubsystemWhereInput.configurationAdaptive)
                && Objects.equals(
                        this.configurationAdaptiveNot,
                        nvmfSubsystemWhereInput.configurationAdaptiveNot)
                && Objects.equals(
                        this.configurationMethod, nvmfSubsystemWhereInput.configurationMethod)
                && Objects.equals(
                        this.configurationMethodIn, nvmfSubsystemWhereInput.configurationMethodIn)
                && Objects.equals(
                        this.configurationMethodNot, nvmfSubsystemWhereInput.configurationMethodNot)
                && Objects.equals(
                        this.configurationMethodNotIn,
                        nvmfSubsystemWhereInput.configurationMethodNotIn)
                && Objects.equals(this.description, nvmfSubsystemWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, nvmfSubsystemWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, nvmfSubsystemWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, nvmfSubsystemWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, nvmfSubsystemWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, nvmfSubsystemWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, nvmfSubsystemWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, nvmfSubsystemWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, nvmfSubsystemWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, nvmfSubsystemWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, nvmfSubsystemWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, nvmfSubsystemWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        nvmfSubsystemWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, nvmfSubsystemWhereInput.descriptionStartsWith)
                && Objects.equals(this.ecK, nvmfSubsystemWhereInput.ecK)
                && Objects.equals(this.ecKGt, nvmfSubsystemWhereInput.ecKGt)
                && Objects.equals(this.ecKGte, nvmfSubsystemWhereInput.ecKGte)
                && Objects.equals(this.ecKIn, nvmfSubsystemWhereInput.ecKIn)
                && Objects.equals(this.ecKLt, nvmfSubsystemWhereInput.ecKLt)
                && Objects.equals(this.ecKLte, nvmfSubsystemWhereInput.ecKLte)
                && Objects.equals(this.ecKNot, nvmfSubsystemWhereInput.ecKNot)
                && Objects.equals(this.ecKNotIn, nvmfSubsystemWhereInput.ecKNotIn)
                && Objects.equals(this.ecM, nvmfSubsystemWhereInput.ecM)
                && Objects.equals(this.ecMGt, nvmfSubsystemWhereInput.ecMGt)
                && Objects.equals(this.ecMGte, nvmfSubsystemWhereInput.ecMGte)
                && Objects.equals(this.ecMIn, nvmfSubsystemWhereInput.ecMIn)
                && Objects.equals(this.ecMLt, nvmfSubsystemWhereInput.ecMLt)
                && Objects.equals(this.ecMLte, nvmfSubsystemWhereInput.ecMLte)
                && Objects.equals(this.ecMNot, nvmfSubsystemWhereInput.ecMNot)
                && Objects.equals(this.ecMNotIn, nvmfSubsystemWhereInput.ecMNotIn)
                && Objects.equals(this.encryptMethod, nvmfSubsystemWhereInput.encryptMethod)
                && Objects.equals(this.encryptMethodIn, nvmfSubsystemWhereInput.encryptMethodIn)
                && Objects.equals(this.encryptMethodNot, nvmfSubsystemWhereInput.encryptMethodNot)
                && Objects.equals(
                        this.encryptMethodNotIn, nvmfSubsystemWhereInput.encryptMethodNotIn)
                && Objects.equals(this.entityAsyncStatus, nvmfSubsystemWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, nvmfSubsystemWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, nvmfSubsystemWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, nvmfSubsystemWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.externalUse, nvmfSubsystemWhereInput.externalUse)
                && Objects.equals(this.externalUseNot, nvmfSubsystemWhereInput.externalUseNot)
                && Objects.equals(this.id, nvmfSubsystemWhereInput.id)
                && Objects.equals(this.idContains, nvmfSubsystemWhereInput.idContains)
                && Objects.equals(this.idEndsWith, nvmfSubsystemWhereInput.idEndsWith)
                && Objects.equals(this.idGt, nvmfSubsystemWhereInput.idGt)
                && Objects.equals(this.idGte, nvmfSubsystemWhereInput.idGte)
                && Objects.equals(this.idIn, nvmfSubsystemWhereInput.idIn)
                && Objects.equals(this.idLt, nvmfSubsystemWhereInput.idLt)
                && Objects.equals(this.idLte, nvmfSubsystemWhereInput.idLte)
                && Objects.equals(this.idNot, nvmfSubsystemWhereInput.idNot)
                && Objects.equals(this.idNotContains, nvmfSubsystemWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, nvmfSubsystemWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, nvmfSubsystemWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, nvmfSubsystemWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, nvmfSubsystemWhereInput.idStartsWith)
                && Objects.equals(this.internal, nvmfSubsystemWhereInput.internal)
                && Objects.equals(this.internalNot, nvmfSubsystemWhereInput.internalNot)
                && Objects.equals(this.ioSize, nvmfSubsystemWhereInput.ioSize)
                && Objects.equals(this.ioSizeGt, nvmfSubsystemWhereInput.ioSizeGt)
                && Objects.equals(this.ioSizeGte, nvmfSubsystemWhereInput.ioSizeGte)
                && Objects.equals(this.ioSizeIn, nvmfSubsystemWhereInput.ioSizeIn)
                && Objects.equals(this.ioSizeLt, nvmfSubsystemWhereInput.ioSizeLt)
                && Objects.equals(this.ioSizeLte, nvmfSubsystemWhereInput.ioSizeLte)
                && Objects.equals(this.ioSizeNot, nvmfSubsystemWhereInput.ioSizeNot)
                && Objects.equals(this.ioSizeNotIn, nvmfSubsystemWhereInput.ioSizeNotIn)
                && Objects.equals(this.iops, nvmfSubsystemWhereInput.iops)
                && Objects.equals(this.iopsGt, nvmfSubsystemWhereInput.iopsGt)
                && Objects.equals(this.iopsGte, nvmfSubsystemWhereInput.iopsGte)
                && Objects.equals(this.iopsIn, nvmfSubsystemWhereInput.iopsIn)
                && Objects.equals(this.iopsLt, nvmfSubsystemWhereInput.iopsLt)
                && Objects.equals(this.iopsLte, nvmfSubsystemWhereInput.iopsLte)
                && Objects.equals(this.iopsMax, nvmfSubsystemWhereInput.iopsMax)
                && Objects.equals(this.iopsMaxGt, nvmfSubsystemWhereInput.iopsMaxGt)
                && Objects.equals(this.iopsMaxGte, nvmfSubsystemWhereInput.iopsMaxGte)
                && Objects.equals(this.iopsMaxIn, nvmfSubsystemWhereInput.iopsMaxIn)
                && Objects.equals(this.iopsMaxLength, nvmfSubsystemWhereInput.iopsMaxLength)
                && Objects.equals(this.iopsMaxLengthGt, nvmfSubsystemWhereInput.iopsMaxLengthGt)
                && Objects.equals(this.iopsMaxLengthGte, nvmfSubsystemWhereInput.iopsMaxLengthGte)
                && Objects.equals(this.iopsMaxLengthIn, nvmfSubsystemWhereInput.iopsMaxLengthIn)
                && Objects.equals(this.iopsMaxLengthLt, nvmfSubsystemWhereInput.iopsMaxLengthLt)
                && Objects.equals(this.iopsMaxLengthLte, nvmfSubsystemWhereInput.iopsMaxLengthLte)
                && Objects.equals(this.iopsMaxLengthNot, nvmfSubsystemWhereInput.iopsMaxLengthNot)
                && Objects.equals(
                        this.iopsMaxLengthNotIn, nvmfSubsystemWhereInput.iopsMaxLengthNotIn)
                && Objects.equals(this.iopsMaxLt, nvmfSubsystemWhereInput.iopsMaxLt)
                && Objects.equals(this.iopsMaxLte, nvmfSubsystemWhereInput.iopsMaxLte)
                && Objects.equals(this.iopsMaxNot, nvmfSubsystemWhereInput.iopsMaxNot)
                && Objects.equals(this.iopsMaxNotIn, nvmfSubsystemWhereInput.iopsMaxNotIn)
                && Objects.equals(this.iopsNot, nvmfSubsystemWhereInput.iopsNot)
                && Objects.equals(this.iopsNotIn, nvmfSubsystemWhereInput.iopsNotIn)
                && Objects.equals(this.iopsRd, nvmfSubsystemWhereInput.iopsRd)
                && Objects.equals(this.iopsRdGt, nvmfSubsystemWhereInput.iopsRdGt)
                && Objects.equals(this.iopsRdGte, nvmfSubsystemWhereInput.iopsRdGte)
                && Objects.equals(this.iopsRdIn, nvmfSubsystemWhereInput.iopsRdIn)
                && Objects.equals(this.iopsRdLt, nvmfSubsystemWhereInput.iopsRdLt)
                && Objects.equals(this.iopsRdLte, nvmfSubsystemWhereInput.iopsRdLte)
                && Objects.equals(this.iopsRdMax, nvmfSubsystemWhereInput.iopsRdMax)
                && Objects.equals(this.iopsRdMaxGt, nvmfSubsystemWhereInput.iopsRdMaxGt)
                && Objects.equals(this.iopsRdMaxGte, nvmfSubsystemWhereInput.iopsRdMaxGte)
                && Objects.equals(this.iopsRdMaxIn, nvmfSubsystemWhereInput.iopsRdMaxIn)
                && Objects.equals(this.iopsRdMaxLength, nvmfSubsystemWhereInput.iopsRdMaxLength)
                && Objects.equals(this.iopsRdMaxLengthGt, nvmfSubsystemWhereInput.iopsRdMaxLengthGt)
                && Objects.equals(
                        this.iopsRdMaxLengthGte, nvmfSubsystemWhereInput.iopsRdMaxLengthGte)
                && Objects.equals(this.iopsRdMaxLengthIn, nvmfSubsystemWhereInput.iopsRdMaxLengthIn)
                && Objects.equals(this.iopsRdMaxLengthLt, nvmfSubsystemWhereInput.iopsRdMaxLengthLt)
                && Objects.equals(
                        this.iopsRdMaxLengthLte, nvmfSubsystemWhereInput.iopsRdMaxLengthLte)
                && Objects.equals(
                        this.iopsRdMaxLengthNot, nvmfSubsystemWhereInput.iopsRdMaxLengthNot)
                && Objects.equals(
                        this.iopsRdMaxLengthNotIn, nvmfSubsystemWhereInput.iopsRdMaxLengthNotIn)
                && Objects.equals(this.iopsRdMaxLt, nvmfSubsystemWhereInput.iopsRdMaxLt)
                && Objects.equals(this.iopsRdMaxLte, nvmfSubsystemWhereInput.iopsRdMaxLte)
                && Objects.equals(this.iopsRdMaxNot, nvmfSubsystemWhereInput.iopsRdMaxNot)
                && Objects.equals(this.iopsRdMaxNotIn, nvmfSubsystemWhereInput.iopsRdMaxNotIn)
                && Objects.equals(this.iopsRdNot, nvmfSubsystemWhereInput.iopsRdNot)
                && Objects.equals(this.iopsRdNotIn, nvmfSubsystemWhereInput.iopsRdNotIn)
                && Objects.equals(this.iopsWr, nvmfSubsystemWhereInput.iopsWr)
                && Objects.equals(this.iopsWrGt, nvmfSubsystemWhereInput.iopsWrGt)
                && Objects.equals(this.iopsWrGte, nvmfSubsystemWhereInput.iopsWrGte)
                && Objects.equals(this.iopsWrIn, nvmfSubsystemWhereInput.iopsWrIn)
                && Objects.equals(this.iopsWrLt, nvmfSubsystemWhereInput.iopsWrLt)
                && Objects.equals(this.iopsWrLte, nvmfSubsystemWhereInput.iopsWrLte)
                && Objects.equals(this.iopsWrMax, nvmfSubsystemWhereInput.iopsWrMax)
                && Objects.equals(this.iopsWrMaxGt, nvmfSubsystemWhereInput.iopsWrMaxGt)
                && Objects.equals(this.iopsWrMaxGte, nvmfSubsystemWhereInput.iopsWrMaxGte)
                && Objects.equals(this.iopsWrMaxIn, nvmfSubsystemWhereInput.iopsWrMaxIn)
                && Objects.equals(this.iopsWrMaxLength, nvmfSubsystemWhereInput.iopsWrMaxLength)
                && Objects.equals(this.iopsWrMaxLengthGt, nvmfSubsystemWhereInput.iopsWrMaxLengthGt)
                && Objects.equals(
                        this.iopsWrMaxLengthGte, nvmfSubsystemWhereInput.iopsWrMaxLengthGte)
                && Objects.equals(this.iopsWrMaxLengthIn, nvmfSubsystemWhereInput.iopsWrMaxLengthIn)
                && Objects.equals(this.iopsWrMaxLengthLt, nvmfSubsystemWhereInput.iopsWrMaxLengthLt)
                && Objects.equals(
                        this.iopsWrMaxLengthLte, nvmfSubsystemWhereInput.iopsWrMaxLengthLte)
                && Objects.equals(
                        this.iopsWrMaxLengthNot, nvmfSubsystemWhereInput.iopsWrMaxLengthNot)
                && Objects.equals(
                        this.iopsWrMaxLengthNotIn, nvmfSubsystemWhereInput.iopsWrMaxLengthNotIn)
                && Objects.equals(this.iopsWrMaxLt, nvmfSubsystemWhereInput.iopsWrMaxLt)
                && Objects.equals(this.iopsWrMaxLte, nvmfSubsystemWhereInput.iopsWrMaxLte)
                && Objects.equals(this.iopsWrMaxNot, nvmfSubsystemWhereInput.iopsWrMaxNot)
                && Objects.equals(this.iopsWrMaxNotIn, nvmfSubsystemWhereInput.iopsWrMaxNotIn)
                && Objects.equals(this.iopsWrNot, nvmfSubsystemWhereInput.iopsWrNot)
                && Objects.equals(this.iopsWrNotIn, nvmfSubsystemWhereInput.iopsWrNotIn)
                && Objects.equals(this.ipWhitelist, nvmfSubsystemWhereInput.ipWhitelist)
                && Objects.equals(
                        this.ipWhitelistContains, nvmfSubsystemWhereInput.ipWhitelistContains)
                && Objects.equals(
                        this.ipWhitelistEndsWith, nvmfSubsystemWhereInput.ipWhitelistEndsWith)
                && Objects.equals(this.ipWhitelistGt, nvmfSubsystemWhereInput.ipWhitelistGt)
                && Objects.equals(this.ipWhitelistGte, nvmfSubsystemWhereInput.ipWhitelistGte)
                && Objects.equals(this.ipWhitelistIn, nvmfSubsystemWhereInput.ipWhitelistIn)
                && Objects.equals(this.ipWhitelistLt, nvmfSubsystemWhereInput.ipWhitelistLt)
                && Objects.equals(this.ipWhitelistLte, nvmfSubsystemWhereInput.ipWhitelistLte)
                && Objects.equals(this.ipWhitelistNot, nvmfSubsystemWhereInput.ipWhitelistNot)
                && Objects.equals(
                        this.ipWhitelistNotContains, nvmfSubsystemWhereInput.ipWhitelistNotContains)
                && Objects.equals(
                        this.ipWhitelistNotEndsWith, nvmfSubsystemWhereInput.ipWhitelistNotEndsWith)
                && Objects.equals(this.ipWhitelistNotIn, nvmfSubsystemWhereInput.ipWhitelistNotIn)
                && Objects.equals(
                        this.ipWhitelistNotStartsWith,
                        nvmfSubsystemWhereInput.ipWhitelistNotStartsWith)
                && Objects.equals(
                        this.ipWhitelistStartsWith, nvmfSubsystemWhereInput.ipWhitelistStartsWith)
                && Objects.equals(
                        this.iscsiConnectionsEvery, nvmfSubsystemWhereInput.iscsiConnectionsEvery)
                && Objects.equals(
                        this.iscsiConnectionsNone, nvmfSubsystemWhereInput.iscsiConnectionsNone)
                && Objects.equals(
                        this.iscsiConnectionsSome, nvmfSubsystemWhereInput.iscsiConnectionsSome)
                && Objects.equals(this.labelsEvery, nvmfSubsystemWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, nvmfSubsystemWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, nvmfSubsystemWhereInput.labelsSome)
                && Objects.equals(this.localId, nvmfSubsystemWhereInput.localId)
                && Objects.equals(this.localIdContains, nvmfSubsystemWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, nvmfSubsystemWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, nvmfSubsystemWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, nvmfSubsystemWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, nvmfSubsystemWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, nvmfSubsystemWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, nvmfSubsystemWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, nvmfSubsystemWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, nvmfSubsystemWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, nvmfSubsystemWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, nvmfSubsystemWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, nvmfSubsystemWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, nvmfSubsystemWhereInput.localIdStartsWith)
                && Objects.equals(this.name, nvmfSubsystemWhereInput.name)
                && Objects.equals(this.nameContains, nvmfSubsystemWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, nvmfSubsystemWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, nvmfSubsystemWhereInput.nameGt)
                && Objects.equals(this.nameGte, nvmfSubsystemWhereInput.nameGte)
                && Objects.equals(this.nameIn, nvmfSubsystemWhereInput.nameIn)
                && Objects.equals(this.nameLt, nvmfSubsystemWhereInput.nameLt)
                && Objects.equals(this.nameLte, nvmfSubsystemWhereInput.nameLte)
                && Objects.equals(this.nameNot, nvmfSubsystemWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, nvmfSubsystemWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, nvmfSubsystemWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, nvmfSubsystemWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, nvmfSubsystemWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, nvmfSubsystemWhereInput.nameStartsWith)
                && Objects.equals(
                        this.namespaceGroupsEvery, nvmfSubsystemWhereInput.namespaceGroupsEvery)
                && Objects.equals(
                        this.namespaceGroupsNone, nvmfSubsystemWhereInput.namespaceGroupsNone)
                && Objects.equals(
                        this.namespaceGroupsSome, nvmfSubsystemWhereInput.namespaceGroupsSome)
                && Objects.equals(this.namespacesEvery, nvmfSubsystemWhereInput.namespacesEvery)
                && Objects.equals(this.namespacesNone, nvmfSubsystemWhereInput.namespacesNone)
                && Objects.equals(this.namespacesSome, nvmfSubsystemWhereInput.namespacesSome)
                && Objects.equals(this.nqnName, nvmfSubsystemWhereInput.nqnName)
                && Objects.equals(this.nqnNameContains, nvmfSubsystemWhereInput.nqnNameContains)
                && Objects.equals(this.nqnNameEndsWith, nvmfSubsystemWhereInput.nqnNameEndsWith)
                && Objects.equals(this.nqnNameGt, nvmfSubsystemWhereInput.nqnNameGt)
                && Objects.equals(this.nqnNameGte, nvmfSubsystemWhereInput.nqnNameGte)
                && Objects.equals(this.nqnNameIn, nvmfSubsystemWhereInput.nqnNameIn)
                && Objects.equals(this.nqnNameLt, nvmfSubsystemWhereInput.nqnNameLt)
                && Objects.equals(this.nqnNameLte, nvmfSubsystemWhereInput.nqnNameLte)
                && Objects.equals(this.nqnNameNot, nvmfSubsystemWhereInput.nqnNameNot)
                && Objects.equals(
                        this.nqnNameNotContains, nvmfSubsystemWhereInput.nqnNameNotContains)
                && Objects.equals(
                        this.nqnNameNotEndsWith, nvmfSubsystemWhereInput.nqnNameNotEndsWith)
                && Objects.equals(this.nqnNameNotIn, nvmfSubsystemWhereInput.nqnNameNotIn)
                && Objects.equals(
                        this.nqnNameNotStartsWith, nvmfSubsystemWhereInput.nqnNameNotStartsWith)
                && Objects.equals(this.nqnNameStartsWith, nvmfSubsystemWhereInput.nqnNameStartsWith)
                && Objects.equals(this.nqnWhitelist, nvmfSubsystemWhereInput.nqnWhitelist)
                && Objects.equals(
                        this.nqnWhitelistContains, nvmfSubsystemWhereInput.nqnWhitelistContains)
                && Objects.equals(
                        this.nqnWhitelistEndsWith, nvmfSubsystemWhereInput.nqnWhitelistEndsWith)
                && Objects.equals(this.nqnWhitelistGt, nvmfSubsystemWhereInput.nqnWhitelistGt)
                && Objects.equals(this.nqnWhitelistGte, nvmfSubsystemWhereInput.nqnWhitelistGte)
                && Objects.equals(this.nqnWhitelistIn, nvmfSubsystemWhereInput.nqnWhitelistIn)
                && Objects.equals(this.nqnWhitelistLt, nvmfSubsystemWhereInput.nqnWhitelistLt)
                && Objects.equals(this.nqnWhitelistLte, nvmfSubsystemWhereInput.nqnWhitelistLte)
                && Objects.equals(this.nqnWhitelistNot, nvmfSubsystemWhereInput.nqnWhitelistNot)
                && Objects.equals(
                        this.nqnWhitelistNotContains,
                        nvmfSubsystemWhereInput.nqnWhitelistNotContains)
                && Objects.equals(
                        this.nqnWhitelistNotEndsWith,
                        nvmfSubsystemWhereInput.nqnWhitelistNotEndsWith)
                && Objects.equals(this.nqnWhitelistNotIn, nvmfSubsystemWhereInput.nqnWhitelistNotIn)
                && Objects.equals(
                        this.nqnWhitelistNotStartsWith,
                        nvmfSubsystemWhereInput.nqnWhitelistNotStartsWith)
                && Objects.equals(
                        this.nqnWhitelistStartsWith, nvmfSubsystemWhereInput.nqnWhitelistStartsWith)
                && Objects.equals(this.nvmfNamespacesNum, nvmfSubsystemWhereInput.nvmfNamespacesNum)
                && Objects.equals(
                        this.nvmfNamespacesNumGt, nvmfSubsystemWhereInput.nvmfNamespacesNumGt)
                && Objects.equals(
                        this.nvmfNamespacesNumGte, nvmfSubsystemWhereInput.nvmfNamespacesNumGte)
                && Objects.equals(
                        this.nvmfNamespacesNumIn, nvmfSubsystemWhereInput.nvmfNamespacesNumIn)
                && Objects.equals(
                        this.nvmfNamespacesNumLt, nvmfSubsystemWhereInput.nvmfNamespacesNumLt)
                && Objects.equals(
                        this.nvmfNamespacesNumLte, nvmfSubsystemWhereInput.nvmfNamespacesNumLte)
                && Objects.equals(
                        this.nvmfNamespacesNumNot, nvmfSubsystemWhereInput.nvmfNamespacesNumNot)
                && Objects.equals(
                        this.nvmfNamespacesNumNotIn, nvmfSubsystemWhereInput.nvmfNamespacesNumNotIn)
                && Objects.equals(this.policy, nvmfSubsystemWhereInput.policy)
                && Objects.equals(this.policyIn, nvmfSubsystemWhereInput.policyIn)
                && Objects.equals(this.policyNot, nvmfSubsystemWhereInput.policyNot)
                && Objects.equals(this.policyNotIn, nvmfSubsystemWhereInput.policyNotIn)
                && Objects.equals(this.prioritized, nvmfSubsystemWhereInput.prioritized)
                && Objects.equals(this.prioritizedNot, nvmfSubsystemWhereInput.prioritizedNot)
                && Objects.equals(this.replicaNum, nvmfSubsystemWhereInput.replicaNum)
                && Objects.equals(this.replicaNumGt, nvmfSubsystemWhereInput.replicaNumGt)
                && Objects.equals(this.replicaNumGte, nvmfSubsystemWhereInput.replicaNumGte)
                && Objects.equals(this.replicaNumIn, nvmfSubsystemWhereInput.replicaNumIn)
                && Objects.equals(this.replicaNumLt, nvmfSubsystemWhereInput.replicaNumLt)
                && Objects.equals(this.replicaNumLte, nvmfSubsystemWhereInput.replicaNumLte)
                && Objects.equals(this.replicaNumNot, nvmfSubsystemWhereInput.replicaNumNot)
                && Objects.equals(this.replicaNumNotIn, nvmfSubsystemWhereInput.replicaNumNotIn)
                && Objects.equals(this.resiliencyType, nvmfSubsystemWhereInput.resiliencyType)
                && Objects.equals(this.resiliencyTypeIn, nvmfSubsystemWhereInput.resiliencyTypeIn)
                && Objects.equals(this.resiliencyTypeNot, nvmfSubsystemWhereInput.resiliencyTypeNot)
                && Objects.equals(
                        this.resiliencyTypeNotIn, nvmfSubsystemWhereInput.resiliencyTypeNotIn)
                && Objects.equals(this.stripeNum, nvmfSubsystemWhereInput.stripeNum)
                && Objects.equals(this.stripeNumGt, nvmfSubsystemWhereInput.stripeNumGt)
                && Objects.equals(this.stripeNumGte, nvmfSubsystemWhereInput.stripeNumGte)
                && Objects.equals(this.stripeNumIn, nvmfSubsystemWhereInput.stripeNumIn)
                && Objects.equals(this.stripeNumLt, nvmfSubsystemWhereInput.stripeNumLt)
                && Objects.equals(this.stripeNumLte, nvmfSubsystemWhereInput.stripeNumLte)
                && Objects.equals(this.stripeNumNot, nvmfSubsystemWhereInput.stripeNumNot)
                && Objects.equals(this.stripeNumNotIn, nvmfSubsystemWhereInput.stripeNumNotIn)
                && Objects.equals(this.stripeSize, nvmfSubsystemWhereInput.stripeSize)
                && Objects.equals(this.stripeSizeGt, nvmfSubsystemWhereInput.stripeSizeGt)
                && Objects.equals(this.stripeSizeGte, nvmfSubsystemWhereInput.stripeSizeGte)
                && Objects.equals(this.stripeSizeIn, nvmfSubsystemWhereInput.stripeSizeIn)
                && Objects.equals(this.stripeSizeLt, nvmfSubsystemWhereInput.stripeSizeLt)
                && Objects.equals(this.stripeSizeLte, nvmfSubsystemWhereInput.stripeSizeLte)
                && Objects.equals(this.stripeSizeNot, nvmfSubsystemWhereInput.stripeSizeNot)
                && Objects.equals(this.stripeSizeNotIn, nvmfSubsystemWhereInput.stripeSizeNotIn)
                && Objects.equals(this.thinProvision, nvmfSubsystemWhereInput.thinProvision)
                && Objects.equals(this.thinProvisionNot, nvmfSubsystemWhereInput.thinProvisionNot);
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
                bps,
                bpsGt,
                bpsGte,
                bpsIn,
                bpsLt,
                bpsLte,
                bpsMax,
                bpsMaxGt,
                bpsMaxGte,
                bpsMaxIn,
                bpsMaxLength,
                bpsMaxLengthGt,
                bpsMaxLengthGte,
                bpsMaxLengthIn,
                bpsMaxLengthLt,
                bpsMaxLengthLte,
                bpsMaxLengthNot,
                bpsMaxLengthNotIn,
                bpsMaxLt,
                bpsMaxLte,
                bpsMaxNot,
                bpsMaxNotIn,
                bpsNot,
                bpsNotIn,
                bpsRd,
                bpsRdGt,
                bpsRdGte,
                bpsRdIn,
                bpsRdLt,
                bpsRdLte,
                bpsRdMax,
                bpsRdMaxGt,
                bpsRdMaxGte,
                bpsRdMaxIn,
                bpsRdMaxLength,
                bpsRdMaxLengthGt,
                bpsRdMaxLengthGte,
                bpsRdMaxLengthIn,
                bpsRdMaxLengthLt,
                bpsRdMaxLengthLte,
                bpsRdMaxLengthNot,
                bpsRdMaxLengthNotIn,
                bpsRdMaxLt,
                bpsRdMaxLte,
                bpsRdMaxNot,
                bpsRdMaxNotIn,
                bpsRdNot,
                bpsRdNotIn,
                bpsWr,
                bpsWrGt,
                bpsWrGte,
                bpsWrIn,
                bpsWrLt,
                bpsWrLte,
                bpsWrMax,
                bpsWrMaxGt,
                bpsWrMaxGte,
                bpsWrMaxIn,
                bpsWrMaxLength,
                bpsWrMaxLengthGt,
                bpsWrMaxLengthGte,
                bpsWrMaxLengthIn,
                bpsWrMaxLengthLt,
                bpsWrMaxLengthLte,
                bpsWrMaxLengthNot,
                bpsWrMaxLengthNotIn,
                bpsWrMaxLt,
                bpsWrMaxLte,
                bpsWrMaxNot,
                bpsWrMaxNotIn,
                bpsWrNot,
                bpsWrNotIn,
                businessHostGroupsEvery,
                businessHostGroupsNone,
                businessHostGroupsSome,
                businessHostsEvery,
                businessHostsNone,
                businessHostsSome,
                cluster,
                configurationAdaptive,
                configurationAdaptiveNot,
                configurationMethod,
                configurationMethodIn,
                configurationMethodNot,
                configurationMethodNotIn,
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
                externalUse,
                externalUseNot,
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
                internal,
                internalNot,
                ioSize,
                ioSizeGt,
                ioSizeGte,
                ioSizeIn,
                ioSizeLt,
                ioSizeLte,
                ioSizeNot,
                ioSizeNotIn,
                iops,
                iopsGt,
                iopsGte,
                iopsIn,
                iopsLt,
                iopsLte,
                iopsMax,
                iopsMaxGt,
                iopsMaxGte,
                iopsMaxIn,
                iopsMaxLength,
                iopsMaxLengthGt,
                iopsMaxLengthGte,
                iopsMaxLengthIn,
                iopsMaxLengthLt,
                iopsMaxLengthLte,
                iopsMaxLengthNot,
                iopsMaxLengthNotIn,
                iopsMaxLt,
                iopsMaxLte,
                iopsMaxNot,
                iopsMaxNotIn,
                iopsNot,
                iopsNotIn,
                iopsRd,
                iopsRdGt,
                iopsRdGte,
                iopsRdIn,
                iopsRdLt,
                iopsRdLte,
                iopsRdMax,
                iopsRdMaxGt,
                iopsRdMaxGte,
                iopsRdMaxIn,
                iopsRdMaxLength,
                iopsRdMaxLengthGt,
                iopsRdMaxLengthGte,
                iopsRdMaxLengthIn,
                iopsRdMaxLengthLt,
                iopsRdMaxLengthLte,
                iopsRdMaxLengthNot,
                iopsRdMaxLengthNotIn,
                iopsRdMaxLt,
                iopsRdMaxLte,
                iopsRdMaxNot,
                iopsRdMaxNotIn,
                iopsRdNot,
                iopsRdNotIn,
                iopsWr,
                iopsWrGt,
                iopsWrGte,
                iopsWrIn,
                iopsWrLt,
                iopsWrLte,
                iopsWrMax,
                iopsWrMaxGt,
                iopsWrMaxGte,
                iopsWrMaxIn,
                iopsWrMaxLength,
                iopsWrMaxLengthGt,
                iopsWrMaxLengthGte,
                iopsWrMaxLengthIn,
                iopsWrMaxLengthLt,
                iopsWrMaxLengthLte,
                iopsWrMaxLengthNot,
                iopsWrMaxLengthNotIn,
                iopsWrMaxLt,
                iopsWrMaxLte,
                iopsWrMaxNot,
                iopsWrMaxNotIn,
                iopsWrNot,
                iopsWrNotIn,
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
                iscsiConnectionsEvery,
                iscsiConnectionsNone,
                iscsiConnectionsSome,
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
                namespaceGroupsEvery,
                namespaceGroupsNone,
                namespaceGroupsSome,
                namespacesEvery,
                namespacesNone,
                namespacesSome,
                nqnName,
                nqnNameContains,
                nqnNameEndsWith,
                nqnNameGt,
                nqnNameGte,
                nqnNameIn,
                nqnNameLt,
                nqnNameLte,
                nqnNameNot,
                nqnNameNotContains,
                nqnNameNotEndsWith,
                nqnNameNotIn,
                nqnNameNotStartsWith,
                nqnNameStartsWith,
                nqnWhitelist,
                nqnWhitelistContains,
                nqnWhitelistEndsWith,
                nqnWhitelistGt,
                nqnWhitelistGte,
                nqnWhitelistIn,
                nqnWhitelistLt,
                nqnWhitelistLte,
                nqnWhitelistNot,
                nqnWhitelistNotContains,
                nqnWhitelistNotEndsWith,
                nqnWhitelistNotIn,
                nqnWhitelistNotStartsWith,
                nqnWhitelistStartsWith,
                nvmfNamespacesNum,
                nvmfNamespacesNumGt,
                nvmfNamespacesNumGte,
                nvmfNamespacesNumIn,
                nvmfNamespacesNumLt,
                nvmfNamespacesNumLte,
                nvmfNamespacesNumNot,
                nvmfNamespacesNumNotIn,
                policy,
                policyIn,
                policyNot,
                policyNotIn,
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
                stripeNum,
                stripeNumGt,
                stripeNumGte,
                stripeNumIn,
                stripeNumLt,
                stripeNumLte,
                stripeNumNot,
                stripeNumNotIn,
                stripeSize,
                stripeSizeGt,
                stripeSizeGte,
                stripeSizeIn,
                stripeSizeLt,
                stripeSizeLte,
                stripeSizeNot,
                stripeSizeNotIn,
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
        sb.append("class NvmfSubsystemWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
        sb.append("    bpsGt: ").append(toIndentedString(bpsGt)).append("\n");
        sb.append("    bpsGte: ").append(toIndentedString(bpsGte)).append("\n");
        sb.append("    bpsIn: ").append(toIndentedString(bpsIn)).append("\n");
        sb.append("    bpsLt: ").append(toIndentedString(bpsLt)).append("\n");
        sb.append("    bpsLte: ").append(toIndentedString(bpsLte)).append("\n");
        sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
        sb.append("    bpsMaxGt: ").append(toIndentedString(bpsMaxGt)).append("\n");
        sb.append("    bpsMaxGte: ").append(toIndentedString(bpsMaxGte)).append("\n");
        sb.append("    bpsMaxIn: ").append(toIndentedString(bpsMaxIn)).append("\n");
        sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
        sb.append("    bpsMaxLengthGt: ").append(toIndentedString(bpsMaxLengthGt)).append("\n");
        sb.append("    bpsMaxLengthGte: ").append(toIndentedString(bpsMaxLengthGte)).append("\n");
        sb.append("    bpsMaxLengthIn: ").append(toIndentedString(bpsMaxLengthIn)).append("\n");
        sb.append("    bpsMaxLengthLt: ").append(toIndentedString(bpsMaxLengthLt)).append("\n");
        sb.append("    bpsMaxLengthLte: ").append(toIndentedString(bpsMaxLengthLte)).append("\n");
        sb.append("    bpsMaxLengthNot: ").append(toIndentedString(bpsMaxLengthNot)).append("\n");
        sb.append("    bpsMaxLengthNotIn: ")
                .append(toIndentedString(bpsMaxLengthNotIn))
                .append("\n");
        sb.append("    bpsMaxLt: ").append(toIndentedString(bpsMaxLt)).append("\n");
        sb.append("    bpsMaxLte: ").append(toIndentedString(bpsMaxLte)).append("\n");
        sb.append("    bpsMaxNot: ").append(toIndentedString(bpsMaxNot)).append("\n");
        sb.append("    bpsMaxNotIn: ").append(toIndentedString(bpsMaxNotIn)).append("\n");
        sb.append("    bpsNot: ").append(toIndentedString(bpsNot)).append("\n");
        sb.append("    bpsNotIn: ").append(toIndentedString(bpsNotIn)).append("\n");
        sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
        sb.append("    bpsRdGt: ").append(toIndentedString(bpsRdGt)).append("\n");
        sb.append("    bpsRdGte: ").append(toIndentedString(bpsRdGte)).append("\n");
        sb.append("    bpsRdIn: ").append(toIndentedString(bpsRdIn)).append("\n");
        sb.append("    bpsRdLt: ").append(toIndentedString(bpsRdLt)).append("\n");
        sb.append("    bpsRdLte: ").append(toIndentedString(bpsRdLte)).append("\n");
        sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
        sb.append("    bpsRdMaxGt: ").append(toIndentedString(bpsRdMaxGt)).append("\n");
        sb.append("    bpsRdMaxGte: ").append(toIndentedString(bpsRdMaxGte)).append("\n");
        sb.append("    bpsRdMaxIn: ").append(toIndentedString(bpsRdMaxIn)).append("\n");
        sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
        sb.append("    bpsRdMaxLengthGt: ").append(toIndentedString(bpsRdMaxLengthGt)).append("\n");
        sb.append("    bpsRdMaxLengthGte: ")
                .append(toIndentedString(bpsRdMaxLengthGte))
                .append("\n");
        sb.append("    bpsRdMaxLengthIn: ").append(toIndentedString(bpsRdMaxLengthIn)).append("\n");
        sb.append("    bpsRdMaxLengthLt: ").append(toIndentedString(bpsRdMaxLengthLt)).append("\n");
        sb.append("    bpsRdMaxLengthLte: ")
                .append(toIndentedString(bpsRdMaxLengthLte))
                .append("\n");
        sb.append("    bpsRdMaxLengthNot: ")
                .append(toIndentedString(bpsRdMaxLengthNot))
                .append("\n");
        sb.append("    bpsRdMaxLengthNotIn: ")
                .append(toIndentedString(bpsRdMaxLengthNotIn))
                .append("\n");
        sb.append("    bpsRdMaxLt: ").append(toIndentedString(bpsRdMaxLt)).append("\n");
        sb.append("    bpsRdMaxLte: ").append(toIndentedString(bpsRdMaxLte)).append("\n");
        sb.append("    bpsRdMaxNot: ").append(toIndentedString(bpsRdMaxNot)).append("\n");
        sb.append("    bpsRdMaxNotIn: ").append(toIndentedString(bpsRdMaxNotIn)).append("\n");
        sb.append("    bpsRdNot: ").append(toIndentedString(bpsRdNot)).append("\n");
        sb.append("    bpsRdNotIn: ").append(toIndentedString(bpsRdNotIn)).append("\n");
        sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
        sb.append("    bpsWrGt: ").append(toIndentedString(bpsWrGt)).append("\n");
        sb.append("    bpsWrGte: ").append(toIndentedString(bpsWrGte)).append("\n");
        sb.append("    bpsWrIn: ").append(toIndentedString(bpsWrIn)).append("\n");
        sb.append("    bpsWrLt: ").append(toIndentedString(bpsWrLt)).append("\n");
        sb.append("    bpsWrLte: ").append(toIndentedString(bpsWrLte)).append("\n");
        sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
        sb.append("    bpsWrMaxGt: ").append(toIndentedString(bpsWrMaxGt)).append("\n");
        sb.append("    bpsWrMaxGte: ").append(toIndentedString(bpsWrMaxGte)).append("\n");
        sb.append("    bpsWrMaxIn: ").append(toIndentedString(bpsWrMaxIn)).append("\n");
        sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
        sb.append("    bpsWrMaxLengthGt: ").append(toIndentedString(bpsWrMaxLengthGt)).append("\n");
        sb.append("    bpsWrMaxLengthGte: ")
                .append(toIndentedString(bpsWrMaxLengthGte))
                .append("\n");
        sb.append("    bpsWrMaxLengthIn: ").append(toIndentedString(bpsWrMaxLengthIn)).append("\n");
        sb.append("    bpsWrMaxLengthLt: ").append(toIndentedString(bpsWrMaxLengthLt)).append("\n");
        sb.append("    bpsWrMaxLengthLte: ")
                .append(toIndentedString(bpsWrMaxLengthLte))
                .append("\n");
        sb.append("    bpsWrMaxLengthNot: ")
                .append(toIndentedString(bpsWrMaxLengthNot))
                .append("\n");
        sb.append("    bpsWrMaxLengthNotIn: ")
                .append(toIndentedString(bpsWrMaxLengthNotIn))
                .append("\n");
        sb.append("    bpsWrMaxLt: ").append(toIndentedString(bpsWrMaxLt)).append("\n");
        sb.append("    bpsWrMaxLte: ").append(toIndentedString(bpsWrMaxLte)).append("\n");
        sb.append("    bpsWrMaxNot: ").append(toIndentedString(bpsWrMaxNot)).append("\n");
        sb.append("    bpsWrMaxNotIn: ").append(toIndentedString(bpsWrMaxNotIn)).append("\n");
        sb.append("    bpsWrNot: ").append(toIndentedString(bpsWrNot)).append("\n");
        sb.append("    bpsWrNotIn: ").append(toIndentedString(bpsWrNotIn)).append("\n");
        sb.append("    businessHostGroupsEvery: ")
                .append(toIndentedString(businessHostGroupsEvery))
                .append("\n");
        sb.append("    businessHostGroupsNone: ")
                .append(toIndentedString(businessHostGroupsNone))
                .append("\n");
        sb.append("    businessHostGroupsSome: ")
                .append(toIndentedString(businessHostGroupsSome))
                .append("\n");
        sb.append("    businessHostsEvery: ")
                .append(toIndentedString(businessHostsEvery))
                .append("\n");
        sb.append("    businessHostsNone: ")
                .append(toIndentedString(businessHostsNone))
                .append("\n");
        sb.append("    businessHostsSome: ")
                .append(toIndentedString(businessHostsSome))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    configurationAdaptive: ")
                .append(toIndentedString(configurationAdaptive))
                .append("\n");
        sb.append("    configurationAdaptiveNot: ")
                .append(toIndentedString(configurationAdaptiveNot))
                .append("\n");
        sb.append("    configurationMethod: ")
                .append(toIndentedString(configurationMethod))
                .append("\n");
        sb.append("    configurationMethodIn: ")
                .append(toIndentedString(configurationMethodIn))
                .append("\n");
        sb.append("    configurationMethodNot: ")
                .append(toIndentedString(configurationMethodNot))
                .append("\n");
        sb.append("    configurationMethodNotIn: ")
                .append(toIndentedString(configurationMethodNotIn))
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
        sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
        sb.append("    externalUseNot: ").append(toIndentedString(externalUseNot)).append("\n");
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
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
        sb.append("    ioSize: ").append(toIndentedString(ioSize)).append("\n");
        sb.append("    ioSizeGt: ").append(toIndentedString(ioSizeGt)).append("\n");
        sb.append("    ioSizeGte: ").append(toIndentedString(ioSizeGte)).append("\n");
        sb.append("    ioSizeIn: ").append(toIndentedString(ioSizeIn)).append("\n");
        sb.append("    ioSizeLt: ").append(toIndentedString(ioSizeLt)).append("\n");
        sb.append("    ioSizeLte: ").append(toIndentedString(ioSizeLte)).append("\n");
        sb.append("    ioSizeNot: ").append(toIndentedString(ioSizeNot)).append("\n");
        sb.append("    ioSizeNotIn: ").append(toIndentedString(ioSizeNotIn)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    iopsGt: ").append(toIndentedString(iopsGt)).append("\n");
        sb.append("    iopsGte: ").append(toIndentedString(iopsGte)).append("\n");
        sb.append("    iopsIn: ").append(toIndentedString(iopsIn)).append("\n");
        sb.append("    iopsLt: ").append(toIndentedString(iopsLt)).append("\n");
        sb.append("    iopsLte: ").append(toIndentedString(iopsLte)).append("\n");
        sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
        sb.append("    iopsMaxGt: ").append(toIndentedString(iopsMaxGt)).append("\n");
        sb.append("    iopsMaxGte: ").append(toIndentedString(iopsMaxGte)).append("\n");
        sb.append("    iopsMaxIn: ").append(toIndentedString(iopsMaxIn)).append("\n");
        sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
        sb.append("    iopsMaxLengthGt: ").append(toIndentedString(iopsMaxLengthGt)).append("\n");
        sb.append("    iopsMaxLengthGte: ").append(toIndentedString(iopsMaxLengthGte)).append("\n");
        sb.append("    iopsMaxLengthIn: ").append(toIndentedString(iopsMaxLengthIn)).append("\n");
        sb.append("    iopsMaxLengthLt: ").append(toIndentedString(iopsMaxLengthLt)).append("\n");
        sb.append("    iopsMaxLengthLte: ").append(toIndentedString(iopsMaxLengthLte)).append("\n");
        sb.append("    iopsMaxLengthNot: ").append(toIndentedString(iopsMaxLengthNot)).append("\n");
        sb.append("    iopsMaxLengthNotIn: ")
                .append(toIndentedString(iopsMaxLengthNotIn))
                .append("\n");
        sb.append("    iopsMaxLt: ").append(toIndentedString(iopsMaxLt)).append("\n");
        sb.append("    iopsMaxLte: ").append(toIndentedString(iopsMaxLte)).append("\n");
        sb.append("    iopsMaxNot: ").append(toIndentedString(iopsMaxNot)).append("\n");
        sb.append("    iopsMaxNotIn: ").append(toIndentedString(iopsMaxNotIn)).append("\n");
        sb.append("    iopsNot: ").append(toIndentedString(iopsNot)).append("\n");
        sb.append("    iopsNotIn: ").append(toIndentedString(iopsNotIn)).append("\n");
        sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
        sb.append("    iopsRdGt: ").append(toIndentedString(iopsRdGt)).append("\n");
        sb.append("    iopsRdGte: ").append(toIndentedString(iopsRdGte)).append("\n");
        sb.append("    iopsRdIn: ").append(toIndentedString(iopsRdIn)).append("\n");
        sb.append("    iopsRdLt: ").append(toIndentedString(iopsRdLt)).append("\n");
        sb.append("    iopsRdLte: ").append(toIndentedString(iopsRdLte)).append("\n");
        sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
        sb.append("    iopsRdMaxGt: ").append(toIndentedString(iopsRdMaxGt)).append("\n");
        sb.append("    iopsRdMaxGte: ").append(toIndentedString(iopsRdMaxGte)).append("\n");
        sb.append("    iopsRdMaxIn: ").append(toIndentedString(iopsRdMaxIn)).append("\n");
        sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
        sb.append("    iopsRdMaxLengthGt: ")
                .append(toIndentedString(iopsRdMaxLengthGt))
                .append("\n");
        sb.append("    iopsRdMaxLengthGte: ")
                .append(toIndentedString(iopsRdMaxLengthGte))
                .append("\n");
        sb.append("    iopsRdMaxLengthIn: ")
                .append(toIndentedString(iopsRdMaxLengthIn))
                .append("\n");
        sb.append("    iopsRdMaxLengthLt: ")
                .append(toIndentedString(iopsRdMaxLengthLt))
                .append("\n");
        sb.append("    iopsRdMaxLengthLte: ")
                .append(toIndentedString(iopsRdMaxLengthLte))
                .append("\n");
        sb.append("    iopsRdMaxLengthNot: ")
                .append(toIndentedString(iopsRdMaxLengthNot))
                .append("\n");
        sb.append("    iopsRdMaxLengthNotIn: ")
                .append(toIndentedString(iopsRdMaxLengthNotIn))
                .append("\n");
        sb.append("    iopsRdMaxLt: ").append(toIndentedString(iopsRdMaxLt)).append("\n");
        sb.append("    iopsRdMaxLte: ").append(toIndentedString(iopsRdMaxLte)).append("\n");
        sb.append("    iopsRdMaxNot: ").append(toIndentedString(iopsRdMaxNot)).append("\n");
        sb.append("    iopsRdMaxNotIn: ").append(toIndentedString(iopsRdMaxNotIn)).append("\n");
        sb.append("    iopsRdNot: ").append(toIndentedString(iopsRdNot)).append("\n");
        sb.append("    iopsRdNotIn: ").append(toIndentedString(iopsRdNotIn)).append("\n");
        sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
        sb.append("    iopsWrGt: ").append(toIndentedString(iopsWrGt)).append("\n");
        sb.append("    iopsWrGte: ").append(toIndentedString(iopsWrGte)).append("\n");
        sb.append("    iopsWrIn: ").append(toIndentedString(iopsWrIn)).append("\n");
        sb.append("    iopsWrLt: ").append(toIndentedString(iopsWrLt)).append("\n");
        sb.append("    iopsWrLte: ").append(toIndentedString(iopsWrLte)).append("\n");
        sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
        sb.append("    iopsWrMaxGt: ").append(toIndentedString(iopsWrMaxGt)).append("\n");
        sb.append("    iopsWrMaxGte: ").append(toIndentedString(iopsWrMaxGte)).append("\n");
        sb.append("    iopsWrMaxIn: ").append(toIndentedString(iopsWrMaxIn)).append("\n");
        sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
        sb.append("    iopsWrMaxLengthGt: ")
                .append(toIndentedString(iopsWrMaxLengthGt))
                .append("\n");
        sb.append("    iopsWrMaxLengthGte: ")
                .append(toIndentedString(iopsWrMaxLengthGte))
                .append("\n");
        sb.append("    iopsWrMaxLengthIn: ")
                .append(toIndentedString(iopsWrMaxLengthIn))
                .append("\n");
        sb.append("    iopsWrMaxLengthLt: ")
                .append(toIndentedString(iopsWrMaxLengthLt))
                .append("\n");
        sb.append("    iopsWrMaxLengthLte: ")
                .append(toIndentedString(iopsWrMaxLengthLte))
                .append("\n");
        sb.append("    iopsWrMaxLengthNot: ")
                .append(toIndentedString(iopsWrMaxLengthNot))
                .append("\n");
        sb.append("    iopsWrMaxLengthNotIn: ")
                .append(toIndentedString(iopsWrMaxLengthNotIn))
                .append("\n");
        sb.append("    iopsWrMaxLt: ").append(toIndentedString(iopsWrMaxLt)).append("\n");
        sb.append("    iopsWrMaxLte: ").append(toIndentedString(iopsWrMaxLte)).append("\n");
        sb.append("    iopsWrMaxNot: ").append(toIndentedString(iopsWrMaxNot)).append("\n");
        sb.append("    iopsWrMaxNotIn: ").append(toIndentedString(iopsWrMaxNotIn)).append("\n");
        sb.append("    iopsWrNot: ").append(toIndentedString(iopsWrNot)).append("\n");
        sb.append("    iopsWrNotIn: ").append(toIndentedString(iopsWrNotIn)).append("\n");
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
        sb.append("    iscsiConnectionsEvery: ")
                .append(toIndentedString(iscsiConnectionsEvery))
                .append("\n");
        sb.append("    iscsiConnectionsNone: ")
                .append(toIndentedString(iscsiConnectionsNone))
                .append("\n");
        sb.append("    iscsiConnectionsSome: ")
                .append(toIndentedString(iscsiConnectionsSome))
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
        sb.append("    namespaceGroupsEvery: ")
                .append(toIndentedString(namespaceGroupsEvery))
                .append("\n");
        sb.append("    namespaceGroupsNone: ")
                .append(toIndentedString(namespaceGroupsNone))
                .append("\n");
        sb.append("    namespaceGroupsSome: ")
                .append(toIndentedString(namespaceGroupsSome))
                .append("\n");
        sb.append("    namespacesEvery: ").append(toIndentedString(namespacesEvery)).append("\n");
        sb.append("    namespacesNone: ").append(toIndentedString(namespacesNone)).append("\n");
        sb.append("    namespacesSome: ").append(toIndentedString(namespacesSome)).append("\n");
        sb.append("    nqnName: ").append(toIndentedString(nqnName)).append("\n");
        sb.append("    nqnNameContains: ").append(toIndentedString(nqnNameContains)).append("\n");
        sb.append("    nqnNameEndsWith: ").append(toIndentedString(nqnNameEndsWith)).append("\n");
        sb.append("    nqnNameGt: ").append(toIndentedString(nqnNameGt)).append("\n");
        sb.append("    nqnNameGte: ").append(toIndentedString(nqnNameGte)).append("\n");
        sb.append("    nqnNameIn: ").append(toIndentedString(nqnNameIn)).append("\n");
        sb.append("    nqnNameLt: ").append(toIndentedString(nqnNameLt)).append("\n");
        sb.append("    nqnNameLte: ").append(toIndentedString(nqnNameLte)).append("\n");
        sb.append("    nqnNameNot: ").append(toIndentedString(nqnNameNot)).append("\n");
        sb.append("    nqnNameNotContains: ")
                .append(toIndentedString(nqnNameNotContains))
                .append("\n");
        sb.append("    nqnNameNotEndsWith: ")
                .append(toIndentedString(nqnNameNotEndsWith))
                .append("\n");
        sb.append("    nqnNameNotIn: ").append(toIndentedString(nqnNameNotIn)).append("\n");
        sb.append("    nqnNameNotStartsWith: ")
                .append(toIndentedString(nqnNameNotStartsWith))
                .append("\n");
        sb.append("    nqnNameStartsWith: ")
                .append(toIndentedString(nqnNameStartsWith))
                .append("\n");
        sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
        sb.append("    nqnWhitelistContains: ")
                .append(toIndentedString(nqnWhitelistContains))
                .append("\n");
        sb.append("    nqnWhitelistEndsWith: ")
                .append(toIndentedString(nqnWhitelistEndsWith))
                .append("\n");
        sb.append("    nqnWhitelistGt: ").append(toIndentedString(nqnWhitelistGt)).append("\n");
        sb.append("    nqnWhitelistGte: ").append(toIndentedString(nqnWhitelistGte)).append("\n");
        sb.append("    nqnWhitelistIn: ").append(toIndentedString(nqnWhitelistIn)).append("\n");
        sb.append("    nqnWhitelistLt: ").append(toIndentedString(nqnWhitelistLt)).append("\n");
        sb.append("    nqnWhitelistLte: ").append(toIndentedString(nqnWhitelistLte)).append("\n");
        sb.append("    nqnWhitelistNot: ").append(toIndentedString(nqnWhitelistNot)).append("\n");
        sb.append("    nqnWhitelistNotContains: ")
                .append(toIndentedString(nqnWhitelistNotContains))
                .append("\n");
        sb.append("    nqnWhitelistNotEndsWith: ")
                .append(toIndentedString(nqnWhitelistNotEndsWith))
                .append("\n");
        sb.append("    nqnWhitelistNotIn: ")
                .append(toIndentedString(nqnWhitelistNotIn))
                .append("\n");
        sb.append("    nqnWhitelistNotStartsWith: ")
                .append(toIndentedString(nqnWhitelistNotStartsWith))
                .append("\n");
        sb.append("    nqnWhitelistStartsWith: ")
                .append(toIndentedString(nqnWhitelistStartsWith))
                .append("\n");
        sb.append("    nvmfNamespacesNum: ")
                .append(toIndentedString(nvmfNamespacesNum))
                .append("\n");
        sb.append("    nvmfNamespacesNumGt: ")
                .append(toIndentedString(nvmfNamespacesNumGt))
                .append("\n");
        sb.append("    nvmfNamespacesNumGte: ")
                .append(toIndentedString(nvmfNamespacesNumGte))
                .append("\n");
        sb.append("    nvmfNamespacesNumIn: ")
                .append(toIndentedString(nvmfNamespacesNumIn))
                .append("\n");
        sb.append("    nvmfNamespacesNumLt: ")
                .append(toIndentedString(nvmfNamespacesNumLt))
                .append("\n");
        sb.append("    nvmfNamespacesNumLte: ")
                .append(toIndentedString(nvmfNamespacesNumLte))
                .append("\n");
        sb.append("    nvmfNamespacesNumNot: ")
                .append(toIndentedString(nvmfNamespacesNumNot))
                .append("\n");
        sb.append("    nvmfNamespacesNumNotIn: ")
                .append(toIndentedString(nvmfNamespacesNumNotIn))
                .append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    policyIn: ").append(toIndentedString(policyIn)).append("\n");
        sb.append("    policyNot: ").append(toIndentedString(policyNot)).append("\n");
        sb.append("    policyNotIn: ").append(toIndentedString(policyNotIn)).append("\n");
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
        sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
        sb.append("    stripeNumGt: ").append(toIndentedString(stripeNumGt)).append("\n");
        sb.append("    stripeNumGte: ").append(toIndentedString(stripeNumGte)).append("\n");
        sb.append("    stripeNumIn: ").append(toIndentedString(stripeNumIn)).append("\n");
        sb.append("    stripeNumLt: ").append(toIndentedString(stripeNumLt)).append("\n");
        sb.append("    stripeNumLte: ").append(toIndentedString(stripeNumLte)).append("\n");
        sb.append("    stripeNumNot: ").append(toIndentedString(stripeNumNot)).append("\n");
        sb.append("    stripeNumNotIn: ").append(toIndentedString(stripeNumNotIn)).append("\n");
        sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
        sb.append("    stripeSizeGt: ").append(toIndentedString(stripeSizeGt)).append("\n");
        sb.append("    stripeSizeGte: ").append(toIndentedString(stripeSizeGte)).append("\n");
        sb.append("    stripeSizeIn: ").append(toIndentedString(stripeSizeIn)).append("\n");
        sb.append("    stripeSizeLt: ").append(toIndentedString(stripeSizeLt)).append("\n");
        sb.append("    stripeSizeLte: ").append(toIndentedString(stripeSizeLte)).append("\n");
        sb.append("    stripeSizeNot: ").append(toIndentedString(stripeSizeNot)).append("\n");
        sb.append("    stripeSizeNotIn: ").append(toIndentedString(stripeSizeNotIn)).append("\n");
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

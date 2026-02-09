package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EcpLicenseWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EcpLicenseWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<EcpLicenseWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<EcpLicenseWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<EcpLicenseWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS =
            "cluster_local_id_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS)
    private String clusterLocalIdContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH =
            "cluster_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH)
    private String clusterLocalIdEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT = "cluster_local_id_gt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT)
    private String clusterLocalIdGt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE = "cluster_local_id_gte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE)
    private String clusterLocalIdGte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN = "cluster_local_id_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN)
    private List<String> clusterLocalIdIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT = "cluster_local_id_lt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT)
    private String clusterLocalIdLt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE = "cluster_local_id_lte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE)
    private String clusterLocalIdLte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT = "cluster_local_id_not";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT)
    private String clusterLocalIdNot;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS =
            "cluster_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS)
    private String clusterLocalIdNotContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH =
            "cluster_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH)
    private String clusterLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN = "cluster_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN)
    private List<String> clusterLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH =
            "cluster_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH)
    private String clusterLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH =
            "cluster_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH)
    private String clusterLocalIdStartsWith;

    public static final String SERIALIZED_NAME_ECP_EDITION = "ecp_edition";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION)
    private EcpEdition ecpEdition;

    public static final String SERIALIZED_NAME_ECP_EDITION_IN = "ecp_edition_in";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION_IN)
    private List<EcpEdition> ecpEditionIn = null;

    public static final String SERIALIZED_NAME_ECP_EDITION_NOT = "ecp_edition_not";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION_NOT)
    private EcpEdition ecpEditionNot;

    public static final String SERIALIZED_NAME_ECP_EDITION_NOT_IN = "ecp_edition_not_in";

    @SerializedName(SERIALIZED_NAME_ECP_EDITION_NOT_IN)
    private List<EcpEdition> ecpEditionNotIn = null;

    public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
    private String expireDate;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_GT = "expire_date_gt";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GT)
    private String expireDateGt;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_GTE = "expire_date_gte";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GTE)
    private String expireDateGte;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_IN = "expire_date_in";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_IN)
    private List<String> expireDateIn = null;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_LT = "expire_date_lt";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LT)
    private String expireDateLt;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_LTE = "expire_date_lte";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LTE)
    private String expireDateLte;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT = "expire_date_not";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT)
    private String expireDateNot;

    public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT_IN = "expire_date_not_in";

    @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN)
    private List<String> expireDateNotIn = null;

    public static final String SERIALIZED_NAME_HAS_METROX = "has_metrox";

    @SerializedName(SERIALIZED_NAME_HAS_METROX)
    private Boolean hasMetrox;

    public static final String SERIALIZED_NAME_HAS_METROX_NOT = "has_metrox_not";

    @SerializedName(SERIALIZED_NAME_HAS_METROX_NOT)
    private Boolean hasMetroxNot;

    public static final String SERIALIZED_NAME_HAS_REMOTE_BACKUP = "has_remote_backup";

    @SerializedName(SERIALIZED_NAME_HAS_REMOTE_BACKUP)
    private Boolean hasRemoteBackup;

    public static final String SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT = "has_remote_backup_not";

    @SerializedName(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT)
    private Boolean hasRemoteBackupNot;

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

    public static final String SERIALIZED_NAME_LICENSE_TYPE = "license_type";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
    private LicenseType licenseType;

    public static final String SERIALIZED_NAME_LICENSE_TYPE_IN = "license_type_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE_IN)
    private List<LicenseType> licenseTypeIn = null;

    public static final String SERIALIZED_NAME_LICENSE_TYPE_NOT = "license_type_not";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE_NOT)
    private LicenseType licenseTypeNot;

    public static final String SERIALIZED_NAME_LICENSE_TYPE_NOT_IN = "license_type_not_in";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN)
    private List<LicenseType> licenseTypeNotIn = null;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM = "max_core_num";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM)
    private Integer maxCoreNum;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_GT = "max_core_num_gt";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_GT)
    private Integer maxCoreNumGt;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_GTE = "max_core_num_gte";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_GTE)
    private Integer maxCoreNumGte;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_IN = "max_core_num_in";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_IN)
    private List<Integer> maxCoreNumIn = null;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_LT = "max_core_num_lt";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_LT)
    private Integer maxCoreNumLt;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_LTE = "max_core_num_lte";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_LTE)
    private Integer maxCoreNumLte;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_NOT = "max_core_num_not";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_NOT)
    private Integer maxCoreNumNot;

    public static final String SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN = "max_core_num_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN)
    private List<Integer> maxCoreNumNotIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY =
            "max_physical_data_capacity";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY)
    private Double maxPhysicalDataCapacity;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT =
            "max_physical_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT)
    private Double maxPhysicalDataCapacityGt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE =
            "max_physical_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE)
    private Double maxPhysicalDataCapacityGte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN =
            "max_physical_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN)
    private List<Double> maxPhysicalDataCapacityIn = null;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT =
            "max_physical_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT)
    private Double maxPhysicalDataCapacityLt;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE =
            "max_physical_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE)
    private Double maxPhysicalDataCapacityLte;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT =
            "max_physical_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT)
    private Double maxPhysicalDataCapacityNot;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN =
            "max_physical_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN)
    private List<Double> maxPhysicalDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE = "original_code";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE)
    private String originalCode;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS = "original_code_contains";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS)
    private String originalCodeContains;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH = "original_code_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH)
    private String originalCodeEndsWith;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_GT = "original_code_gt";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_GT)
    private String originalCodeGt;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_GTE = "original_code_gte";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_GTE)
    private String originalCodeGte;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_IN = "original_code_in";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_IN)
    private List<String> originalCodeIn = null;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_LT = "original_code_lt";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_LT)
    private String originalCodeLt;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_LTE = "original_code_lte";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_LTE)
    private String originalCodeLte;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT = "original_code_not";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT)
    private String originalCodeNot;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS =
            "original_code_not_contains";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS)
    private String originalCodeNotContains;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH =
            "original_code_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH)
    private String originalCodeNotEndsWith;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN = "original_code_not_in";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN)
    private List<String> originalCodeNotIn = null;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH =
            "original_code_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH)
    private String originalCodeNotStartsWith;

    public static final String SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH =
            "original_code_starts_with";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH)
    private String originalCodeStartsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
    private String productName;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_CONTAINS = "product_name_contains";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS)
    private String productNameContains;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH = "product_name_ends_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH)
    private String productNameEndsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_GT = "product_name_gt";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_GT)
    private String productNameGt;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_GTE = "product_name_gte";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_GTE)
    private String productNameGte;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_IN = "product_name_in";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_IN)
    private List<String> productNameIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_LT = "product_name_lt";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_LT)
    private String productNameLt;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_LTE = "product_name_lte";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_LTE)
    private String productNameLte;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT = "product_name_not";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT)
    private String productNameNot;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS =
            "product_name_not_contains";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS)
    private String productNameNotContains;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH =
            "product_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH)
    private String productNameNotEndsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_IN = "product_name_not_in";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN)
    private List<String> productNameNotIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH =
            "product_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH)
    private String productNameNotStartsWith;

    public static final String SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH =
            "product_name_starts_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH)
    private String productNameStartsWith;

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

    public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE)
    private String signDate;

    public static final String SERIALIZED_NAME_SIGN_DATE_GT = "sign_date_gt";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_GT)
    private String signDateGt;

    public static final String SERIALIZED_NAME_SIGN_DATE_GTE = "sign_date_gte";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_GTE)
    private String signDateGte;

    public static final String SERIALIZED_NAME_SIGN_DATE_IN = "sign_date_in";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_IN)
    private List<String> signDateIn = null;

    public static final String SERIALIZED_NAME_SIGN_DATE_LT = "sign_date_lt";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_LT)
    private String signDateLt;

    public static final String SERIALIZED_NAME_SIGN_DATE_LTE = "sign_date_lte";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_LTE)
    private String signDateLte;

    public static final String SERIALIZED_NAME_SIGN_DATE_NOT = "sign_date_not";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT)
    private String signDateNot;

    public static final String SERIALIZED_NAME_SIGN_DATE_NOT_IN = "sign_date_not_in";

    @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT_IN)
    private List<String> signDateNotIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE =
            "subscription_expire_date";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE)
    private String subscriptionExpireDate;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT =
            "subscription_expire_date_gt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT)
    private String subscriptionExpireDateGt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE =
            "subscription_expire_date_gte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE)
    private String subscriptionExpireDateGte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN =
            "subscription_expire_date_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN)
    private List<String> subscriptionExpireDateIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT =
            "subscription_expire_date_lt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT)
    private String subscriptionExpireDateLt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE =
            "subscription_expire_date_lte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE)
    private String subscriptionExpireDateLte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT =
            "subscription_expire_date_not";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT)
    private String subscriptionExpireDateNot;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN =
            "subscription_expire_date_not_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN)
    private List<String> subscriptionExpireDateNotIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE = "subscription_start_date";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE)
    private String subscriptionStartDate;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT =
            "subscription_start_date_gt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT)
    private String subscriptionStartDateGt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE =
            "subscription_start_date_gte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE)
    private String subscriptionStartDateGte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN =
            "subscription_start_date_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN)
    private List<String> subscriptionStartDateIn = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT =
            "subscription_start_date_lt";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT)
    private String subscriptionStartDateLt;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE =
            "subscription_start_date_lte";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE)
    private String subscriptionStartDateLte;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT =
            "subscription_start_date_not";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT)
    private String subscriptionStartDateNot;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN =
            "subscription_start_date_not_in";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN)
    private List<String> subscriptionStartDateNotIn = null;

    public static final String SERIALIZED_NAME_VENDOR = "vendor";

    @SerializedName(SERIALIZED_NAME_VENDOR)
    private String vendor;

    public static final String SERIALIZED_NAME_VENDOR_CONTAINS = "vendor_contains";

    @SerializedName(SERIALIZED_NAME_VENDOR_CONTAINS)
    private String vendorContains;

    public static final String SERIALIZED_NAME_VENDOR_ENDS_WITH = "vendor_ends_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_ENDS_WITH)
    private String vendorEndsWith;

    public static final String SERIALIZED_NAME_VENDOR_GT = "vendor_gt";

    @SerializedName(SERIALIZED_NAME_VENDOR_GT)
    private String vendorGt;

    public static final String SERIALIZED_NAME_VENDOR_GTE = "vendor_gte";

    @SerializedName(SERIALIZED_NAME_VENDOR_GTE)
    private String vendorGte;

    public static final String SERIALIZED_NAME_VENDOR_IN = "vendor_in";

    @SerializedName(SERIALIZED_NAME_VENDOR_IN)
    private List<String> vendorIn = null;

    public static final String SERIALIZED_NAME_VENDOR_LT = "vendor_lt";

    @SerializedName(SERIALIZED_NAME_VENDOR_LT)
    private String vendorLt;

    public static final String SERIALIZED_NAME_VENDOR_LTE = "vendor_lte";

    @SerializedName(SERIALIZED_NAME_VENDOR_LTE)
    private String vendorLte;

    public static final String SERIALIZED_NAME_VENDOR_NOT = "vendor_not";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT)
    private String vendorNot;

    public static final String SERIALIZED_NAME_VENDOR_NOT_CONTAINS = "vendor_not_contains";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_CONTAINS)
    private String vendorNotContains;

    public static final String SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH = "vendor_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH)
    private String vendorNotEndsWith;

    public static final String SERIALIZED_NAME_VENDOR_NOT_IN = "vendor_not_in";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_IN)
    private List<String> vendorNotIn = null;

    public static final String SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH = "vendor_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH)
    private String vendorNotStartsWith;

    public static final String SERIALIZED_NAME_VENDOR_STARTS_WITH = "vendor_starts_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_STARTS_WITH)
    private String vendorStartsWith;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private Integer version;

    public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_GT)
    private Integer versionGt;

    public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_GTE)
    private Integer versionGte;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<Integer> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_LT)
    private Integer versionLt;

    public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_LTE)
    private Integer versionLte;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private Integer versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<Integer> versionNotIn = null;

    public EcpLicenseWhereInput() {}

    public EcpLicenseWhereInput AND(List<EcpLicenseWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public EcpLicenseWhereInput addANDItem(EcpLicenseWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<EcpLicenseWhereInput>();
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
    public List<EcpLicenseWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<EcpLicenseWhereInput> AND) {
        this.AND = AND;
    }

    public EcpLicenseWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public EcpLicenseWhereInput AND_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput NOT(List<EcpLicenseWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public EcpLicenseWhereInput addNOTItem(EcpLicenseWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<EcpLicenseWhereInput>();
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
    public List<EcpLicenseWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<EcpLicenseWhereInput> NOT) {
        this.NOT = NOT;
    }

    public EcpLicenseWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public EcpLicenseWhereInput NOT_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput OR(List<EcpLicenseWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public EcpLicenseWhereInput addORItem(EcpLicenseWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<EcpLicenseWhereInput>();
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
    public List<EcpLicenseWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<EcpLicenseWhereInput> OR) {
        this.OR = OR;
    }

    public EcpLicenseWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public EcpLicenseWhereInput OR_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput cluster(ClusterWhereInput cluster) {

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

    public EcpLicenseWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public EcpLicenseWhereInput cluster_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public EcpLicenseWhereInput clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public EcpLicenseWhereInput clusterLocalIdContains(String clusterLocalIdContains) {

        this.clusterLocalIdContains = clusterLocalIdContains;
        return this;
    }

    /**
     * Get clusterLocalIdContains
     *
     * @return clusterLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdContains() {
        return clusterLocalIdContains;
    }

    public void setClusterLocalIdContains(String clusterLocalIdContains) {
        this.clusterLocalIdContains = clusterLocalIdContains;
    }

    public EcpLicenseWhereInput clusterLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setClusterLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getClusterLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
    }

    public EcpLicenseWhereInput clusterLocalIdEndsWith(String clusterLocalIdEndsWith) {

        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdEndsWith
     *
     * @return clusterLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdEndsWith() {
        return clusterLocalIdEndsWith;
    }

    public void setClusterLocalIdEndsWith(String clusterLocalIdEndsWith) {
        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
    }

    public EcpLicenseWhereInput clusterLocalIdGt(String clusterLocalIdGt) {

        this.clusterLocalIdGt = clusterLocalIdGt;
        return this;
    }

    /**
     * Get clusterLocalIdGt
     *
     * @return clusterLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGt() {
        return clusterLocalIdGt;
    }

    public void setClusterLocalIdGt(String clusterLocalIdGt) {
        this.clusterLocalIdGt = clusterLocalIdGt;
    }

    public EcpLicenseWhereInput clusterLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public void setClusterLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        }
    }

    public boolean getClusterLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
    }

    public EcpLicenseWhereInput clusterLocalIdGte(String clusterLocalIdGte) {

        this.clusterLocalIdGte = clusterLocalIdGte;
        return this;
    }

    /**
     * Get clusterLocalIdGte
     *
     * @return clusterLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGte() {
        return clusterLocalIdGte;
    }

    public void setClusterLocalIdGte(String clusterLocalIdGte) {
        this.clusterLocalIdGte = clusterLocalIdGte;
    }

    public EcpLicenseWhereInput clusterLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public void setClusterLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        }
    }

    public boolean getClusterLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
    }

    public EcpLicenseWhereInput clusterLocalIdIn(List<String> clusterLocalIdIn) {

        this.clusterLocalIdIn = clusterLocalIdIn;
        return this;
    }

    public EcpLicenseWhereInput addClusterLocalIdInItem(String clusterLocalIdInItem) {
        if (this.clusterLocalIdIn == null) {
            this.clusterLocalIdIn = new ArrayList<String>();
        }
        this.clusterLocalIdIn.add(clusterLocalIdInItem);
        return this;
    }

    /**
     * Get clusterLocalIdIn
     *
     * @return clusterLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdIn() {
        return clusterLocalIdIn;
    }

    public void setClusterLocalIdIn(List<String> clusterLocalIdIn) {
        this.clusterLocalIdIn = clusterLocalIdIn;
    }

    public EcpLicenseWhereInput clusterLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public void setClusterLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        }
    }

    public boolean getClusterLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
    }

    public EcpLicenseWhereInput clusterLocalIdLt(String clusterLocalIdLt) {

        this.clusterLocalIdLt = clusterLocalIdLt;
        return this;
    }

    /**
     * Get clusterLocalIdLt
     *
     * @return clusterLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLt() {
        return clusterLocalIdLt;
    }

    public void setClusterLocalIdLt(String clusterLocalIdLt) {
        this.clusterLocalIdLt = clusterLocalIdLt;
    }

    public EcpLicenseWhereInput clusterLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public void setClusterLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        }
    }

    public boolean getClusterLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
    }

    public EcpLicenseWhereInput clusterLocalIdLte(String clusterLocalIdLte) {

        this.clusterLocalIdLte = clusterLocalIdLte;
        return this;
    }

    /**
     * Get clusterLocalIdLte
     *
     * @return clusterLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLte() {
        return clusterLocalIdLte;
    }

    public void setClusterLocalIdLte(String clusterLocalIdLte) {
        this.clusterLocalIdLte = clusterLocalIdLte;
    }

    public EcpLicenseWhereInput clusterLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public void setClusterLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        }
    }

    public boolean getClusterLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
    }

    public EcpLicenseWhereInput clusterLocalIdNot(String clusterLocalIdNot) {

        this.clusterLocalIdNot = clusterLocalIdNot;
        return this;
    }

    /**
     * Get clusterLocalIdNot
     *
     * @return clusterLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNot() {
        return clusterLocalIdNot;
    }

    public void setClusterLocalIdNot(String clusterLocalIdNot) {
        this.clusterLocalIdNot = clusterLocalIdNot;
    }

    public EcpLicenseWhereInput clusterLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public void setClusterLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        }
    }

    public boolean getClusterLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
    }

    public EcpLicenseWhereInput clusterLocalIdNotContains(String clusterLocalIdNotContains) {

        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
        return this;
    }

    /**
     * Get clusterLocalIdNotContains
     *
     * @return clusterLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotContains() {
        return clusterLocalIdNotContains;
    }

    public void setClusterLocalIdNotContains(String clusterLocalIdNotContains) {
        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
    }

    public EcpLicenseWhereInput clusterLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setClusterLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getClusterLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput clusterLocalIdNotEndsWith(String clusterLocalIdNotEndsWith) {

        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotEndsWith
     *
     * @return clusterLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotEndsWith() {
        return clusterLocalIdNotEndsWith;
    }

    public void setClusterLocalIdNotEndsWith(String clusterLocalIdNotEndsWith) {
        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput clusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {

        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
        return this;
    }

    public EcpLicenseWhereInput addClusterLocalIdNotInItem(String clusterLocalIdNotInItem) {
        if (this.clusterLocalIdNotIn == null) {
            this.clusterLocalIdNotIn = new ArrayList<String>();
        }
        this.clusterLocalIdNotIn.add(clusterLocalIdNotInItem);
        return this;
    }

    /**
     * Get clusterLocalIdNotIn
     *
     * @return clusterLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdNotIn() {
        return clusterLocalIdNotIn;
    }

    public void setClusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {
        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
    }

    public EcpLicenseWhereInput clusterLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setClusterLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getClusterLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
    }

    public EcpLicenseWhereInput clusterLocalIdNotStartsWith(String clusterLocalIdNotStartsWith) {

        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotStartsWith
     *
     * @return clusterLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotStartsWith() {
        return clusterLocalIdNotStartsWith;
    }

    public void setClusterLocalIdNotStartsWith(String clusterLocalIdNotStartsWith) {
        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput clusterLocalIdStartsWith(String clusterLocalIdStartsWith) {

        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdStartsWith
     *
     * @return clusterLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdStartsWith() {
        return clusterLocalIdStartsWith;
    }

    public void setClusterLocalIdStartsWith(String clusterLocalIdStartsWith) {
        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
    }

    public EcpLicenseWhereInput clusterLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput clusterLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
    }

    public EcpLicenseWhereInput ecpEdition(EcpEdition ecpEdition) {

        this.ecpEdition = ecpEdition;
        return this;
    }

    /**
     * Get ecpEdition
     *
     * @return ecpEdition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EcpEdition getEcpEdition() {
        return ecpEdition;
    }

    public void setEcpEdition(EcpEdition ecpEdition) {
        this.ecpEdition = ecpEdition;
    }

    public EcpLicenseWhereInput ecpEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION);
        return this;
    }

    public EcpLicenseWhereInput ecpEdition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION);
        return this;
    }

    public void setEcpEdition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION);
        }
    }

    public boolean getEcpEdition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION);
    }

    public EcpLicenseWhereInput ecpEditionIn(List<EcpEdition> ecpEditionIn) {

        this.ecpEditionIn = ecpEditionIn;
        return this;
    }

    public EcpLicenseWhereInput addEcpEditionInItem(EcpEdition ecpEditionInItem) {
        if (this.ecpEditionIn == null) {
            this.ecpEditionIn = new ArrayList<EcpEdition>();
        }
        this.ecpEditionIn.add(ecpEditionInItem);
        return this;
    }

    /**
     * Get ecpEditionIn
     *
     * @return ecpEditionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EcpEdition> getEcpEditionIn() {
        return ecpEditionIn;
    }

    public void setEcpEditionIn(List<EcpEdition> ecpEditionIn) {
        this.ecpEditionIn = ecpEditionIn;
    }

    public EcpLicenseWhereInput ecpEditionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_IN);
        return this;
    }

    public EcpLicenseWhereInput ecpEditionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_IN);
        return this;
    }

    public void setEcpEditionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_IN);
        }
    }

    public boolean getEcpEditionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION_IN);
    }

    public EcpLicenseWhereInput ecpEditionNot(EcpEdition ecpEditionNot) {

        this.ecpEditionNot = ecpEditionNot;
        return this;
    }

    /**
     * Get ecpEditionNot
     *
     * @return ecpEditionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EcpEdition getEcpEditionNot() {
        return ecpEditionNot;
    }

    public void setEcpEditionNot(EcpEdition ecpEditionNot) {
        this.ecpEditionNot = ecpEditionNot;
    }

    public EcpLicenseWhereInput ecpEditionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT);
        return this;
    }

    public EcpLicenseWhereInput ecpEditionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT);
        return this;
    }

    public void setEcpEditionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT);
        }
    }

    public boolean getEcpEditionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION_NOT);
    }

    public EcpLicenseWhereInput ecpEditionNotIn(List<EcpEdition> ecpEditionNotIn) {

        this.ecpEditionNotIn = ecpEditionNotIn;
        return this;
    }

    public EcpLicenseWhereInput addEcpEditionNotInItem(EcpEdition ecpEditionNotInItem) {
        if (this.ecpEditionNotIn == null) {
            this.ecpEditionNotIn = new ArrayList<EcpEdition>();
        }
        this.ecpEditionNotIn.add(ecpEditionNotInItem);
        return this;
    }

    /**
     * Get ecpEditionNotIn
     *
     * @return ecpEditionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EcpEdition> getEcpEditionNotIn() {
        return ecpEditionNotIn;
    }

    public void setEcpEditionNotIn(List<EcpEdition> ecpEditionNotIn) {
        this.ecpEditionNotIn = ecpEditionNotIn;
    }

    public EcpLicenseWhereInput ecpEditionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput ecpEditionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        return this;
    }

    public void setEcpEditionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
        }
    }

    public boolean getEcpEditionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ECP_EDITION_NOT_IN);
    }

    public EcpLicenseWhereInput expireDate(String expireDate) {

        this.expireDate = expireDate;
        return this;
    }

    /**
     * Get expireDate
     *
     * @return expireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public EcpLicenseWhereInput expireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public EcpLicenseWhereInput expireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE);
        return this;
    }

    public void setExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE);
        }
    }

    public boolean getExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE);
    }

    public EcpLicenseWhereInput expireDateGt(String expireDateGt) {

        this.expireDateGt = expireDateGt;
        return this;
    }

    /**
     * Get expireDateGt
     *
     * @return expireDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateGt() {
        return expireDateGt;
    }

    public void setExpireDateGt(String expireDateGt) {
        this.expireDateGt = expireDateGt;
    }

    public EcpLicenseWhereInput expireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput expireDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GT);
        return this;
    }

    public void setExpireDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GT);
        }
    }

    public boolean getExpireDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_GT);
    }

    public EcpLicenseWhereInput expireDateGte(String expireDateGte) {

        this.expireDateGte = expireDateGte;
        return this;
    }

    /**
     * Get expireDateGte
     *
     * @return expireDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateGte() {
        return expireDateGte;
    }

    public void setExpireDateGte(String expireDateGte) {
        this.expireDateGte = expireDateGte;
    }

    public EcpLicenseWhereInput expireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput expireDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        return this;
    }

    public void setExpireDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_GTE);
        }
    }

    public boolean getExpireDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_GTE);
    }

    public EcpLicenseWhereInput expireDateIn(List<String> expireDateIn) {

        this.expireDateIn = expireDateIn;
        return this;
    }

    public EcpLicenseWhereInput addExpireDateInItem(String expireDateInItem) {
        if (this.expireDateIn == null) {
            this.expireDateIn = new ArrayList<String>();
        }
        this.expireDateIn.add(expireDateInItem);
        return this;
    }

    /**
     * Get expireDateIn
     *
     * @return expireDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExpireDateIn() {
        return expireDateIn;
    }

    public void setExpireDateIn(List<String> expireDateIn) {
        this.expireDateIn = expireDateIn;
    }

    public EcpLicenseWhereInput expireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput expireDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_IN);
        return this;
    }

    public void setExpireDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_IN);
        }
    }

    public boolean getExpireDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_IN);
    }

    public EcpLicenseWhereInput expireDateLt(String expireDateLt) {

        this.expireDateLt = expireDateLt;
        return this;
    }

    /**
     * Get expireDateLt
     *
     * @return expireDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateLt() {
        return expireDateLt;
    }

    public void setExpireDateLt(String expireDateLt) {
        this.expireDateLt = expireDateLt;
    }

    public EcpLicenseWhereInput expireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput expireDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LT);
        return this;
    }

    public void setExpireDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LT);
        }
    }

    public boolean getExpireDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_LT);
    }

    public EcpLicenseWhereInput expireDateLte(String expireDateLte) {

        this.expireDateLte = expireDateLte;
        return this;
    }

    /**
     * Get expireDateLte
     *
     * @return expireDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateLte() {
        return expireDateLte;
    }

    public void setExpireDateLte(String expireDateLte) {
        this.expireDateLte = expireDateLte;
    }

    public EcpLicenseWhereInput expireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput expireDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        return this;
    }

    public void setExpireDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_LTE);
        }
    }

    public boolean getExpireDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_LTE);
    }

    public EcpLicenseWhereInput expireDateNot(String expireDateNot) {

        this.expireDateNot = expireDateNot;
        return this;
    }

    /**
     * Get expireDateNot
     *
     * @return expireDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExpireDateNot() {
        return expireDateNot;
    }

    public void setExpireDateNot(String expireDateNot) {
        this.expireDateNot = expireDateNot;
    }

    public EcpLicenseWhereInput expireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput expireDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        return this;
    }

    public void setExpireDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT);
        }
    }

    public boolean getExpireDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_NOT);
    }

    public EcpLicenseWhereInput expireDateNotIn(List<String> expireDateNotIn) {

        this.expireDateNotIn = expireDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addExpireDateNotInItem(String expireDateNotInItem) {
        if (this.expireDateNotIn == null) {
            this.expireDateNotIn = new ArrayList<String>();
        }
        this.expireDateNotIn.add(expireDateNotInItem);
        return this;
    }

    /**
     * Get expireDateNotIn
     *
     * @return expireDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExpireDateNotIn() {
        return expireDateNotIn;
    }

    public void setExpireDateNotIn(List<String> expireDateNotIn) {
        this.expireDateNotIn = expireDateNotIn;
    }

    public EcpLicenseWhereInput expireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput expireDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public void setExpireDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
        }
    }

    public boolean getExpireDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput hasMetrox(Boolean hasMetrox) {

        this.hasMetrox = hasMetrox;
        return this;
    }

    /**
     * Get hasMetrox
     *
     * @return hasMetrox
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasMetrox() {
        return hasMetrox;
    }

    public void setHasMetrox(Boolean hasMetrox) {
        this.hasMetrox = hasMetrox;
    }

    public EcpLicenseWhereInput hasMetrox_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public EcpLicenseWhereInput hasMetrox_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public void setHasMetrox_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX);
        }
    }

    public boolean getHasMetrox_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_METROX);
    }

    public EcpLicenseWhereInput hasMetroxNot(Boolean hasMetroxNot) {

        this.hasMetroxNot = hasMetroxNot;
        return this;
    }

    /**
     * Get hasMetroxNot
     *
     * @return hasMetroxNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasMetroxNot() {
        return hasMetroxNot;
    }

    public void setHasMetroxNot(Boolean hasMetroxNot) {
        this.hasMetroxNot = hasMetroxNot;
    }

    public EcpLicenseWhereInput hasMetroxNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX_NOT);
        return this;
    }

    public EcpLicenseWhereInput hasMetroxNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX_NOT);
        return this;
    }

    public void setHasMetroxNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_METROX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX_NOT);
        }
    }

    public boolean getHasMetroxNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_METROX_NOT);
    }

    public EcpLicenseWhereInput hasRemoteBackup(Boolean hasRemoteBackup) {

        this.hasRemoteBackup = hasRemoteBackup;
        return this;
    }

    /**
     * Get hasRemoteBackup
     *
     * @return hasRemoteBackup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasRemoteBackup() {
        return hasRemoteBackup;
    }

    public void setHasRemoteBackup(Boolean hasRemoteBackup) {
        this.hasRemoteBackup = hasRemoteBackup;
    }

    public EcpLicenseWhereInput hasRemoteBackup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        return this;
    }

    public EcpLicenseWhereInput hasRemoteBackup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        return this;
    }

    public void setHasRemoteBackup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
        }
    }

    public boolean getHasRemoteBackup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_REMOTE_BACKUP);
    }

    public EcpLicenseWhereInput hasRemoteBackupNot(Boolean hasRemoteBackupNot) {

        this.hasRemoteBackupNot = hasRemoteBackupNot;
        return this;
    }

    /**
     * Get hasRemoteBackupNot
     *
     * @return hasRemoteBackupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasRemoteBackupNot() {
        return hasRemoteBackupNot;
    }

    public void setHasRemoteBackupNot(Boolean hasRemoteBackupNot) {
        this.hasRemoteBackupNot = hasRemoteBackupNot;
    }

    public EcpLicenseWhereInput hasRemoteBackupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        return this;
    }

    public EcpLicenseWhereInput hasRemoteBackupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        return this;
    }

    public void setHasRemoteBackupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
        }
    }

    public boolean getHasRemoteBackupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_REMOTE_BACKUP_NOT);
    }

    public EcpLicenseWhereInput id(String id) {

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

    public EcpLicenseWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EcpLicenseWhereInput id_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idContains(String idContains) {

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

    public EcpLicenseWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput idContains_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idEndsWith(String idEndsWith) {

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

    public EcpLicenseWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idEndsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idGt(String idGt) {

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

    public EcpLicenseWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public EcpLicenseWhereInput idGt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idGte(String idGte) {

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

    public EcpLicenseWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public EcpLicenseWhereInput idGte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public EcpLicenseWhereInput addIdInItem(String idInItem) {
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

    public EcpLicenseWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public EcpLicenseWhereInput idIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idLt(String idLt) {

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

    public EcpLicenseWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public EcpLicenseWhereInput idLt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idLte(String idLte) {

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

    public EcpLicenseWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public EcpLicenseWhereInput idLte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNot(String idNot) {

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

    public EcpLicenseWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public EcpLicenseWhereInput idNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotContains(String idNotContains) {

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

    public EcpLicenseWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput idNotContains_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public EcpLicenseWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public EcpLicenseWhereInput addIdNotInItem(String idNotInItem) {
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

    public EcpLicenseWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput idNotIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public EcpLicenseWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput idStartsWith(String idStartsWith) {

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

    public EcpLicenseWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput idStartsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput licenseType(LicenseType licenseType) {

        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get licenseType
     *
     * @return licenseType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public EcpLicenseWhereInput licenseType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public EcpLicenseWhereInput licenseType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public void setLicenseType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE);
        }
    }

    public boolean getLicenseType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE);
    }

    public EcpLicenseWhereInput licenseTypeIn(List<LicenseType> licenseTypeIn) {

        this.licenseTypeIn = licenseTypeIn;
        return this;
    }

    public EcpLicenseWhereInput addLicenseTypeInItem(LicenseType licenseTypeInItem) {
        if (this.licenseTypeIn == null) {
            this.licenseTypeIn = new ArrayList<LicenseType>();
        }
        this.licenseTypeIn.add(licenseTypeInItem);
        return this;
    }

    /**
     * Get licenseTypeIn
     *
     * @return licenseTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseType> getLicenseTypeIn() {
        return licenseTypeIn;
    }

    public void setLicenseTypeIn(List<LicenseType> licenseTypeIn) {
        this.licenseTypeIn = licenseTypeIn;
    }

    public EcpLicenseWhereInput licenseTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_IN);
        return this;
    }

    public EcpLicenseWhereInput licenseTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_IN);
        return this;
    }

    public void setLicenseTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_IN);
        }
    }

    public boolean getLicenseTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE_IN);
    }

    public EcpLicenseWhereInput licenseTypeNot(LicenseType licenseTypeNot) {

        this.licenseTypeNot = licenseTypeNot;
        return this;
    }

    /**
     * Get licenseTypeNot
     *
     * @return licenseTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getLicenseTypeNot() {
        return licenseTypeNot;
    }

    public void setLicenseTypeNot(LicenseType licenseTypeNot) {
        this.licenseTypeNot = licenseTypeNot;
    }

    public EcpLicenseWhereInput licenseTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        return this;
    }

    public EcpLicenseWhereInput licenseTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        return this;
    }

    public void setLicenseTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT);
        }
    }

    public boolean getLicenseTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE_NOT);
    }

    public EcpLicenseWhereInput licenseTypeNotIn(List<LicenseType> licenseTypeNotIn) {

        this.licenseTypeNotIn = licenseTypeNotIn;
        return this;
    }

    public EcpLicenseWhereInput addLicenseTypeNotInItem(LicenseType licenseTypeNotInItem) {
        if (this.licenseTypeNotIn == null) {
            this.licenseTypeNotIn = new ArrayList<LicenseType>();
        }
        this.licenseTypeNotIn.add(licenseTypeNotInItem);
        return this;
    }

    /**
     * Get licenseTypeNotIn
     *
     * @return licenseTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<LicenseType> getLicenseTypeNotIn() {
        return licenseTypeNotIn;
    }

    public void setLicenseTypeNotIn(List<LicenseType> licenseTypeNotIn) {
        this.licenseTypeNotIn = licenseTypeNotIn;
    }

    public EcpLicenseWhereInput licenseTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput licenseTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        return this;
    }

    public void setLicenseTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
        }
    }

    public boolean getLicenseTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE_NOT_IN);
    }

    public EcpLicenseWhereInput maxCoreNum(Integer maxCoreNum) {

        this.maxCoreNum = maxCoreNum;
        return this;
    }

    /**
     * Get maxCoreNum
     *
     * @return maxCoreNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNum() {
        return maxCoreNum;
    }

    public void setMaxCoreNum(Integer maxCoreNum) {
        this.maxCoreNum = maxCoreNum;
    }

    public EcpLicenseWhereInput maxCoreNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM);
        return this;
    }

    public void setMaxCoreNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM);
        }
    }

    public boolean getMaxCoreNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM);
    }

    public EcpLicenseWhereInput maxCoreNumGt(Integer maxCoreNumGt) {

        this.maxCoreNumGt = maxCoreNumGt;
        return this;
    }

    /**
     * Get maxCoreNumGt
     *
     * @return maxCoreNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumGt() {
        return maxCoreNumGt;
    }

    public void setMaxCoreNumGt(Integer maxCoreNumGt) {
        this.maxCoreNumGt = maxCoreNumGt;
    }

    public EcpLicenseWhereInput maxCoreNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        return this;
    }

    public void setMaxCoreNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GT);
        }
    }

    public boolean getMaxCoreNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_GT);
    }

    public EcpLicenseWhereInput maxCoreNumGte(Integer maxCoreNumGte) {

        this.maxCoreNumGte = maxCoreNumGte;
        return this;
    }

    /**
     * Get maxCoreNumGte
     *
     * @return maxCoreNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumGte() {
        return maxCoreNumGte;
    }

    public void setMaxCoreNumGte(Integer maxCoreNumGte) {
        this.maxCoreNumGte = maxCoreNumGte;
    }

    public EcpLicenseWhereInput maxCoreNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        return this;
    }

    public void setMaxCoreNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
        }
    }

    public boolean getMaxCoreNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_GTE);
    }

    public EcpLicenseWhereInput maxCoreNumIn(List<Integer> maxCoreNumIn) {

        this.maxCoreNumIn = maxCoreNumIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxCoreNumInItem(Integer maxCoreNumInItem) {
        if (this.maxCoreNumIn == null) {
            this.maxCoreNumIn = new ArrayList<Integer>();
        }
        this.maxCoreNumIn.add(maxCoreNumInItem);
        return this;
    }

    /**
     * Get maxCoreNumIn
     *
     * @return maxCoreNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxCoreNumIn() {
        return maxCoreNumIn;
    }

    public void setMaxCoreNumIn(List<Integer> maxCoreNumIn) {
        this.maxCoreNumIn = maxCoreNumIn;
    }

    public EcpLicenseWhereInput maxCoreNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        return this;
    }

    public void setMaxCoreNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_IN);
        }
    }

    public boolean getMaxCoreNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_IN);
    }

    public EcpLicenseWhereInput maxCoreNumLt(Integer maxCoreNumLt) {

        this.maxCoreNumLt = maxCoreNumLt;
        return this;
    }

    /**
     * Get maxCoreNumLt
     *
     * @return maxCoreNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumLt() {
        return maxCoreNumLt;
    }

    public void setMaxCoreNumLt(Integer maxCoreNumLt) {
        this.maxCoreNumLt = maxCoreNumLt;
    }

    public EcpLicenseWhereInput maxCoreNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        return this;
    }

    public void setMaxCoreNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LT);
        }
    }

    public boolean getMaxCoreNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_LT);
    }

    public EcpLicenseWhereInput maxCoreNumLte(Integer maxCoreNumLte) {

        this.maxCoreNumLte = maxCoreNumLte;
        return this;
    }

    /**
     * Get maxCoreNumLte
     *
     * @return maxCoreNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumLte() {
        return maxCoreNumLte;
    }

    public void setMaxCoreNumLte(Integer maxCoreNumLte) {
        this.maxCoreNumLte = maxCoreNumLte;
    }

    public EcpLicenseWhereInput maxCoreNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        return this;
    }

    public void setMaxCoreNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
        }
    }

    public boolean getMaxCoreNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_LTE);
    }

    public EcpLicenseWhereInput maxCoreNumNot(Integer maxCoreNumNot) {

        this.maxCoreNumNot = maxCoreNumNot;
        return this;
    }

    /**
     * Get maxCoreNumNot
     *
     * @return maxCoreNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxCoreNumNot() {
        return maxCoreNumNot;
    }

    public void setMaxCoreNumNot(Integer maxCoreNumNot) {
        this.maxCoreNumNot = maxCoreNumNot;
    }

    public EcpLicenseWhereInput maxCoreNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        return this;
    }

    public void setMaxCoreNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
        }
    }

    public boolean getMaxCoreNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_NOT);
    }

    public EcpLicenseWhereInput maxCoreNumNotIn(List<Integer> maxCoreNumNotIn) {

        this.maxCoreNumNotIn = maxCoreNumNotIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxCoreNumNotInItem(Integer maxCoreNumNotInItem) {
        if (this.maxCoreNumNotIn == null) {
            this.maxCoreNumNotIn = new ArrayList<Integer>();
        }
        this.maxCoreNumNotIn.add(maxCoreNumNotInItem);
        return this;
    }

    /**
     * Get maxCoreNumNotIn
     *
     * @return maxCoreNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxCoreNumNotIn() {
        return maxCoreNumNotIn;
    }

    public void setMaxCoreNumNotIn(List<Integer> maxCoreNumNotIn) {
        this.maxCoreNumNotIn = maxCoreNumNotIn;
    }

    public EcpLicenseWhereInput maxCoreNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput maxCoreNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        return this;
    }

    public void setMaxCoreNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
        }
    }

    public boolean getMaxCoreNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CORE_NUM_NOT_IN);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacity(Double maxPhysicalDataCapacity) {

        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacity
     *
     * @return maxPhysicalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxPhysicalDataCapacity() {
        return maxPhysicalDataCapacity;
    }

    public void setMaxPhysicalDataCapacity(Double maxPhysicalDataCapacity) {
        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public void setMaxPhysicalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        }
    }

    public boolean getMaxPhysicalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGt(Double maxPhysicalDataCapacityGt) {

        this.maxPhysicalDataCapacityGt = maxPhysicalDataCapacityGt;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityGt
     *
     * @return maxPhysicalDataCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxPhysicalDataCapacityGt() {
        return maxPhysicalDataCapacityGt;
    }

    public void setMaxPhysicalDataCapacityGt(Double maxPhysicalDataCapacityGt) {
        this.maxPhysicalDataCapacityGt = maxPhysicalDataCapacityGt;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        return this;
    }

    public void setMaxPhysicalDataCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
        }
    }

    public boolean getMaxPhysicalDataCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GT);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGte(Double maxPhysicalDataCapacityGte) {

        this.maxPhysicalDataCapacityGte = maxPhysicalDataCapacityGte;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityGte
     *
     * @return maxPhysicalDataCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxPhysicalDataCapacityGte() {
        return maxPhysicalDataCapacityGte;
    }

    public void setMaxPhysicalDataCapacityGte(Double maxPhysicalDataCapacityGte) {
        this.maxPhysicalDataCapacityGte = maxPhysicalDataCapacityGte;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        return this;
    }

    public void setMaxPhysicalDataCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
        }
    }

    public boolean getMaxPhysicalDataCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_GTE);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityIn(List<Double> maxPhysicalDataCapacityIn) {

        this.maxPhysicalDataCapacityIn = maxPhysicalDataCapacityIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxPhysicalDataCapacityInItem(
            Double maxPhysicalDataCapacityInItem) {
        if (this.maxPhysicalDataCapacityIn == null) {
            this.maxPhysicalDataCapacityIn = new ArrayList<Double>();
        }
        this.maxPhysicalDataCapacityIn.add(maxPhysicalDataCapacityInItem);
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityIn
     *
     * @return maxPhysicalDataCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getMaxPhysicalDataCapacityIn() {
        return maxPhysicalDataCapacityIn;
    }

    public void setMaxPhysicalDataCapacityIn(List<Double> maxPhysicalDataCapacityIn) {
        this.maxPhysicalDataCapacityIn = maxPhysicalDataCapacityIn;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        return this;
    }

    public void setMaxPhysicalDataCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
        }
    }

    public boolean getMaxPhysicalDataCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_IN);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLt(Double maxPhysicalDataCapacityLt) {

        this.maxPhysicalDataCapacityLt = maxPhysicalDataCapacityLt;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityLt
     *
     * @return maxPhysicalDataCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxPhysicalDataCapacityLt() {
        return maxPhysicalDataCapacityLt;
    }

    public void setMaxPhysicalDataCapacityLt(Double maxPhysicalDataCapacityLt) {
        this.maxPhysicalDataCapacityLt = maxPhysicalDataCapacityLt;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        return this;
    }

    public void setMaxPhysicalDataCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
        }
    }

    public boolean getMaxPhysicalDataCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LT);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLte(Double maxPhysicalDataCapacityLte) {

        this.maxPhysicalDataCapacityLte = maxPhysicalDataCapacityLte;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityLte
     *
     * @return maxPhysicalDataCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxPhysicalDataCapacityLte() {
        return maxPhysicalDataCapacityLte;
    }

    public void setMaxPhysicalDataCapacityLte(Double maxPhysicalDataCapacityLte) {
        this.maxPhysicalDataCapacityLte = maxPhysicalDataCapacityLte;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        return this;
    }

    public void setMaxPhysicalDataCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
        }
    }

    public boolean getMaxPhysicalDataCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_LTE);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNot(Double maxPhysicalDataCapacityNot) {

        this.maxPhysicalDataCapacityNot = maxPhysicalDataCapacityNot;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityNot
     *
     * @return maxPhysicalDataCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxPhysicalDataCapacityNot() {
        return maxPhysicalDataCapacityNot;
    }

    public void setMaxPhysicalDataCapacityNot(Double maxPhysicalDataCapacityNot) {
        this.maxPhysicalDataCapacityNot = maxPhysicalDataCapacityNot;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        return this;
    }

    public void setMaxPhysicalDataCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
        }
    }

    public boolean getMaxPhysicalDataCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT);
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNotIn(
            List<Double> maxPhysicalDataCapacityNotIn) {

        this.maxPhysicalDataCapacityNotIn = maxPhysicalDataCapacityNotIn;
        return this;
    }

    public EcpLicenseWhereInput addMaxPhysicalDataCapacityNotInItem(
            Double maxPhysicalDataCapacityNotInItem) {
        if (this.maxPhysicalDataCapacityNotIn == null) {
            this.maxPhysicalDataCapacityNotIn = new ArrayList<Double>();
        }
        this.maxPhysicalDataCapacityNotIn.add(maxPhysicalDataCapacityNotInItem);
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityNotIn
     *
     * @return maxPhysicalDataCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getMaxPhysicalDataCapacityNotIn() {
        return maxPhysicalDataCapacityNotIn;
    }

    public void setMaxPhysicalDataCapacityNotIn(List<Double> maxPhysicalDataCapacityNotIn) {
        this.maxPhysicalDataCapacityNotIn = maxPhysicalDataCapacityNotIn;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput maxPhysicalDataCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public void setMaxPhysicalDataCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
        }
    }

    public boolean getMaxPhysicalDataCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_NOT_IN);
    }

    public EcpLicenseWhereInput originalCode(String originalCode) {

        this.originalCode = originalCode;
        return this;
    }

    /**
     * Get originalCode
     *
     * @return originalCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode;
    }

    public EcpLicenseWhereInput originalCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE);
        return this;
    }

    public EcpLicenseWhereInput originalCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE);
        return this;
    }

    public void setOriginalCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE);
        }
    }

    public boolean getOriginalCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE);
    }

    public EcpLicenseWhereInput originalCodeContains(String originalCodeContains) {

        this.originalCodeContains = originalCodeContains;
        return this;
    }

    /**
     * Get originalCodeContains
     *
     * @return originalCodeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeContains() {
        return originalCodeContains;
    }

    public void setOriginalCodeContains(String originalCodeContains) {
        this.originalCodeContains = originalCodeContains;
    }

    public EcpLicenseWhereInput originalCodeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput originalCodeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        return this;
    }

    public void setOriginalCodeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
        }
    }

    public boolean getOriginalCodeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_CONTAINS);
    }

    public EcpLicenseWhereInput originalCodeEndsWith(String originalCodeEndsWith) {

        this.originalCodeEndsWith = originalCodeEndsWith;
        return this;
    }

    /**
     * Get originalCodeEndsWith
     *
     * @return originalCodeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeEndsWith() {
        return originalCodeEndsWith;
    }

    public void setOriginalCodeEndsWith(String originalCodeEndsWith) {
        this.originalCodeEndsWith = originalCodeEndsWith;
    }

    public EcpLicenseWhereInput originalCodeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        return this;
    }

    public void setOriginalCodeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
        }
    }

    public boolean getOriginalCodeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_ENDS_WITH);
    }

    public EcpLicenseWhereInput originalCodeGt(String originalCodeGt) {

        this.originalCodeGt = originalCodeGt;
        return this;
    }

    /**
     * Get originalCodeGt
     *
     * @return originalCodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeGt() {
        return originalCodeGt;
    }

    public void setOriginalCodeGt(String originalCodeGt) {
        this.originalCodeGt = originalCodeGt;
    }

    public EcpLicenseWhereInput originalCodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        return this;
    }

    public EcpLicenseWhereInput originalCodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        return this;
    }

    public void setOriginalCodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GT);
        }
    }

    public boolean getOriginalCodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_GT);
    }

    public EcpLicenseWhereInput originalCodeGte(String originalCodeGte) {

        this.originalCodeGte = originalCodeGte;
        return this;
    }

    /**
     * Get originalCodeGte
     *
     * @return originalCodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeGte() {
        return originalCodeGte;
    }

    public void setOriginalCodeGte(String originalCodeGte) {
        this.originalCodeGte = originalCodeGte;
    }

    public EcpLicenseWhereInput originalCodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        return this;
    }

    public EcpLicenseWhereInput originalCodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        return this;
    }

    public void setOriginalCodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
        }
    }

    public boolean getOriginalCodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_GTE);
    }

    public EcpLicenseWhereInput originalCodeIn(List<String> originalCodeIn) {

        this.originalCodeIn = originalCodeIn;
        return this;
    }

    public EcpLicenseWhereInput addOriginalCodeInItem(String originalCodeInItem) {
        if (this.originalCodeIn == null) {
            this.originalCodeIn = new ArrayList<String>();
        }
        this.originalCodeIn.add(originalCodeInItem);
        return this;
    }

    /**
     * Get originalCodeIn
     *
     * @return originalCodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginalCodeIn() {
        return originalCodeIn;
    }

    public void setOriginalCodeIn(List<String> originalCodeIn) {
        this.originalCodeIn = originalCodeIn;
    }

    public EcpLicenseWhereInput originalCodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        return this;
    }

    public EcpLicenseWhereInput originalCodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        return this;
    }

    public void setOriginalCodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_IN);
        }
    }

    public boolean getOriginalCodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_IN);
    }

    public EcpLicenseWhereInput originalCodeLt(String originalCodeLt) {

        this.originalCodeLt = originalCodeLt;
        return this;
    }

    /**
     * Get originalCodeLt
     *
     * @return originalCodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeLt() {
        return originalCodeLt;
    }

    public void setOriginalCodeLt(String originalCodeLt) {
        this.originalCodeLt = originalCodeLt;
    }

    public EcpLicenseWhereInput originalCodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        return this;
    }

    public EcpLicenseWhereInput originalCodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        return this;
    }

    public void setOriginalCodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LT);
        }
    }

    public boolean getOriginalCodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_LT);
    }

    public EcpLicenseWhereInput originalCodeLte(String originalCodeLte) {

        this.originalCodeLte = originalCodeLte;
        return this;
    }

    /**
     * Get originalCodeLte
     *
     * @return originalCodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeLte() {
        return originalCodeLte;
    }

    public void setOriginalCodeLte(String originalCodeLte) {
        this.originalCodeLte = originalCodeLte;
    }

    public EcpLicenseWhereInput originalCodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        return this;
    }

    public EcpLicenseWhereInput originalCodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        return this;
    }

    public void setOriginalCodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
        }
    }

    public boolean getOriginalCodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_LTE);
    }

    public EcpLicenseWhereInput originalCodeNot(String originalCodeNot) {

        this.originalCodeNot = originalCodeNot;
        return this;
    }

    /**
     * Get originalCodeNot
     *
     * @return originalCodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNot() {
        return originalCodeNot;
    }

    public void setOriginalCodeNot(String originalCodeNot) {
        this.originalCodeNot = originalCodeNot;
    }

    public EcpLicenseWhereInput originalCodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        return this;
    }

    public void setOriginalCodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
        }
    }

    public boolean getOriginalCodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT);
    }

    public EcpLicenseWhereInput originalCodeNotContains(String originalCodeNotContains) {

        this.originalCodeNotContains = originalCodeNotContains;
        return this;
    }

    /**
     * Get originalCodeNotContains
     *
     * @return originalCodeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNotContains() {
        return originalCodeNotContains;
    }

    public void setOriginalCodeNotContains(String originalCodeNotContains) {
        this.originalCodeNotContains = originalCodeNotContains;
    }

    public EcpLicenseWhereInput originalCodeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        return this;
    }

    public void setOriginalCodeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
        }
    }

    public boolean getOriginalCodeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput originalCodeNotEndsWith(String originalCodeNotEndsWith) {

        this.originalCodeNotEndsWith = originalCodeNotEndsWith;
        return this;
    }

    /**
     * Get originalCodeNotEndsWith
     *
     * @return originalCodeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNotEndsWith() {
        return originalCodeNotEndsWith;
    }

    public void setOriginalCodeNotEndsWith(String originalCodeNotEndsWith) {
        this.originalCodeNotEndsWith = originalCodeNotEndsWith;
    }

    public EcpLicenseWhereInput originalCodeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        return this;
    }

    public void setOriginalCodeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
        }
    }

    public boolean getOriginalCodeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput originalCodeNotIn(List<String> originalCodeNotIn) {

        this.originalCodeNotIn = originalCodeNotIn;
        return this;
    }

    public EcpLicenseWhereInput addOriginalCodeNotInItem(String originalCodeNotInItem) {
        if (this.originalCodeNotIn == null) {
            this.originalCodeNotIn = new ArrayList<String>();
        }
        this.originalCodeNotIn.add(originalCodeNotInItem);
        return this;
    }

    /**
     * Get originalCodeNotIn
     *
     * @return originalCodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getOriginalCodeNotIn() {
        return originalCodeNotIn;
    }

    public void setOriginalCodeNotIn(List<String> originalCodeNotIn) {
        this.originalCodeNotIn = originalCodeNotIn;
    }

    public EcpLicenseWhereInput originalCodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        return this;
    }

    public void setOriginalCodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
        }
    }

    public boolean getOriginalCodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_IN);
    }

    public EcpLicenseWhereInput originalCodeNotStartsWith(String originalCodeNotStartsWith) {

        this.originalCodeNotStartsWith = originalCodeNotStartsWith;
        return this;
    }

    /**
     * Get originalCodeNotStartsWith
     *
     * @return originalCodeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeNotStartsWith() {
        return originalCodeNotStartsWith;
    }

    public void setOriginalCodeNotStartsWith(String originalCodeNotStartsWith) {
        this.originalCodeNotStartsWith = originalCodeNotStartsWith;
    }

    public EcpLicenseWhereInput originalCodeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        return this;
    }

    public void setOriginalCodeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
        }
    }

    public boolean getOriginalCodeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput originalCodeStartsWith(String originalCodeStartsWith) {

        this.originalCodeStartsWith = originalCodeStartsWith;
        return this;
    }

    /**
     * Get originalCodeStartsWith
     *
     * @return originalCodeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalCodeStartsWith() {
        return originalCodeStartsWith;
    }

    public void setOriginalCodeStartsWith(String originalCodeStartsWith) {
        this.originalCodeStartsWith = originalCodeStartsWith;
    }

    public EcpLicenseWhereInput originalCodeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput originalCodeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        return this;
    }

    public void setOriginalCodeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
        }
    }

    public boolean getOriginalCodeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_CODE_STARTS_WITH);
    }

    public EcpLicenseWhereInput productName(String productName) {

        this.productName = productName;
        return this;
    }

    /**
     * Get productName
     *
     * @return productName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public EcpLicenseWhereInput productName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME);
        return this;
    }

    public EcpLicenseWhereInput productName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME);
        return this;
    }

    public void setProductName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME);
        }
    }

    public boolean getProductName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME);
    }

    public EcpLicenseWhereInput productNameContains(String productNameContains) {

        this.productNameContains = productNameContains;
        return this;
    }

    /**
     * Get productNameContains
     *
     * @return productNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameContains() {
        return productNameContains;
    }

    public void setProductNameContains(String productNameContains) {
        this.productNameContains = productNameContains;
    }

    public EcpLicenseWhereInput productNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput productNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        return this;
    }

    public void setProductNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
        }
    }

    public boolean getProductNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_CONTAINS);
    }

    public EcpLicenseWhereInput productNameEndsWith(String productNameEndsWith) {

        this.productNameEndsWith = productNameEndsWith;
        return this;
    }

    /**
     * Get productNameEndsWith
     *
     * @return productNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameEndsWith() {
        return productNameEndsWith;
    }

    public void setProductNameEndsWith(String productNameEndsWith) {
        this.productNameEndsWith = productNameEndsWith;
    }

    public EcpLicenseWhereInput productNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        return this;
    }

    public void setProductNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
        }
    }

    public boolean getProductNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_ENDS_WITH);
    }

    public EcpLicenseWhereInput productNameGt(String productNameGt) {

        this.productNameGt = productNameGt;
        return this;
    }

    /**
     * Get productNameGt
     *
     * @return productNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameGt() {
        return productNameGt;
    }

    public void setProductNameGt(String productNameGt) {
        this.productNameGt = productNameGt;
    }

    public EcpLicenseWhereInput productNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GT);
        return this;
    }

    public EcpLicenseWhereInput productNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GT);
        return this;
    }

    public void setProductNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GT);
        }
    }

    public boolean getProductNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_GT);
    }

    public EcpLicenseWhereInput productNameGte(String productNameGte) {

        this.productNameGte = productNameGte;
        return this;
    }

    /**
     * Get productNameGte
     *
     * @return productNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameGte() {
        return productNameGte;
    }

    public void setProductNameGte(String productNameGte) {
        this.productNameGte = productNameGte;
    }

    public EcpLicenseWhereInput productNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        return this;
    }

    public EcpLicenseWhereInput productNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        return this;
    }

    public void setProductNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_GTE);
        }
    }

    public boolean getProductNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_GTE);
    }

    public EcpLicenseWhereInput productNameIn(List<String> productNameIn) {

        this.productNameIn = productNameIn;
        return this;
    }

    public EcpLicenseWhereInput addProductNameInItem(String productNameInItem) {
        if (this.productNameIn == null) {
            this.productNameIn = new ArrayList<String>();
        }
        this.productNameIn.add(productNameInItem);
        return this;
    }

    /**
     * Get productNameIn
     *
     * @return productNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProductNameIn() {
        return productNameIn;
    }

    public void setProductNameIn(List<String> productNameIn) {
        this.productNameIn = productNameIn;
    }

    public EcpLicenseWhereInput productNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_IN);
        return this;
    }

    public EcpLicenseWhereInput productNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_IN);
        return this;
    }

    public void setProductNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_IN);
        }
    }

    public boolean getProductNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_IN);
    }

    public EcpLicenseWhereInput productNameLt(String productNameLt) {

        this.productNameLt = productNameLt;
        return this;
    }

    /**
     * Get productNameLt
     *
     * @return productNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameLt() {
        return productNameLt;
    }

    public void setProductNameLt(String productNameLt) {
        this.productNameLt = productNameLt;
    }

    public EcpLicenseWhereInput productNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LT);
        return this;
    }

    public EcpLicenseWhereInput productNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LT);
        return this;
    }

    public void setProductNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LT);
        }
    }

    public boolean getProductNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_LT);
    }

    public EcpLicenseWhereInput productNameLte(String productNameLte) {

        this.productNameLte = productNameLte;
        return this;
    }

    /**
     * Get productNameLte
     *
     * @return productNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameLte() {
        return productNameLte;
    }

    public void setProductNameLte(String productNameLte) {
        this.productNameLte = productNameLte;
    }

    public EcpLicenseWhereInput productNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        return this;
    }

    public EcpLicenseWhereInput productNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        return this;
    }

    public void setProductNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_LTE);
        }
    }

    public boolean getProductNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_LTE);
    }

    public EcpLicenseWhereInput productNameNot(String productNameNot) {

        this.productNameNot = productNameNot;
        return this;
    }

    /**
     * Get productNameNot
     *
     * @return productNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNot() {
        return productNameNot;
    }

    public void setProductNameNot(String productNameNot) {
        this.productNameNot = productNameNot;
    }

    public EcpLicenseWhereInput productNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        return this;
    }

    public EcpLicenseWhereInput productNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        return this;
    }

    public void setProductNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT);
        }
    }

    public boolean getProductNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT);
    }

    public EcpLicenseWhereInput productNameNotContains(String productNameNotContains) {

        this.productNameNotContains = productNameNotContains;
        return this;
    }

    /**
     * Get productNameNotContains
     *
     * @return productNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNotContains() {
        return productNameNotContains;
    }

    public void setProductNameNotContains(String productNameNotContains) {
        this.productNameNotContains = productNameNotContains;
    }

    public EcpLicenseWhereInput productNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput productNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        return this;
    }

    public void setProductNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
        }
    }

    public boolean getProductNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput productNameNotEndsWith(String productNameNotEndsWith) {

        this.productNameNotEndsWith = productNameNotEndsWith;
        return this;
    }

    /**
     * Get productNameNotEndsWith
     *
     * @return productNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNotEndsWith() {
        return productNameNotEndsWith;
    }

    public void setProductNameNotEndsWith(String productNameNotEndsWith) {
        this.productNameNotEndsWith = productNameNotEndsWith;
    }

    public EcpLicenseWhereInput productNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setProductNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getProductNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput productNameNotIn(List<String> productNameNotIn) {

        this.productNameNotIn = productNameNotIn;
        return this;
    }

    public EcpLicenseWhereInput addProductNameNotInItem(String productNameNotInItem) {
        if (this.productNameNotIn == null) {
            this.productNameNotIn = new ArrayList<String>();
        }
        this.productNameNotIn.add(productNameNotInItem);
        return this;
    }

    /**
     * Get productNameNotIn
     *
     * @return productNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProductNameNotIn() {
        return productNameNotIn;
    }

    public void setProductNameNotIn(List<String> productNameNotIn) {
        this.productNameNotIn = productNameNotIn;
    }

    public EcpLicenseWhereInput productNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput productNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        return this;
    }

    public void setProductNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
        }
    }

    public boolean getProductNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_IN);
    }

    public EcpLicenseWhereInput productNameNotStartsWith(String productNameNotStartsWith) {

        this.productNameNotStartsWith = productNameNotStartsWith;
        return this;
    }

    /**
     * Get productNameNotStartsWith
     *
     * @return productNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameNotStartsWith() {
        return productNameNotStartsWith;
    }

    public void setProductNameNotStartsWith(String productNameNotStartsWith) {
        this.productNameNotStartsWith = productNameNotStartsWith;
    }

    public EcpLicenseWhereInput productNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setProductNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getProductNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput productNameStartsWith(String productNameStartsWith) {

        this.productNameStartsWith = productNameStartsWith;
        return this;
    }

    /**
     * Get productNameStartsWith
     *
     * @return productNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductNameStartsWith() {
        return productNameStartsWith;
    }

    public void setProductNameStartsWith(String productNameStartsWith) {
        this.productNameStartsWith = productNameStartsWith;
    }

    public EcpLicenseWhereInput productNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput productNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        return this;
    }

    public void setProductNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
        }
    }

    public boolean getProductNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_NAME_STARTS_WITH);
    }

    public EcpLicenseWhereInput serial(String serial) {

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

    public EcpLicenseWhereInput serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public EcpLicenseWhereInput serial_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialContains(String serialContains) {

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

    public EcpLicenseWhereInput serialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput serialContains_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialEndsWith(String serialEndsWith) {

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

    public EcpLicenseWhereInput serialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialEndsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialGt(String serialGt) {

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

    public EcpLicenseWhereInput serialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public EcpLicenseWhereInput serialGt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialGte(String serialGte) {

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

    public EcpLicenseWhereInput serialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public EcpLicenseWhereInput serialGte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialIn(List<String> serialIn) {

        this.serialIn = serialIn;
        return this;
    }

    public EcpLicenseWhereInput addSerialInItem(String serialInItem) {
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

    public EcpLicenseWhereInput serialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public EcpLicenseWhereInput serialIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialLt(String serialLt) {

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

    public EcpLicenseWhereInput serialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public EcpLicenseWhereInput serialLt_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialLte(String serialLte) {

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

    public EcpLicenseWhereInput serialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public EcpLicenseWhereInput serialLte_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialNot(String serialNot) {

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

    public EcpLicenseWhereInput serialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public EcpLicenseWhereInput serialNot_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialNotContains(String serialNotContains) {

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

    public EcpLicenseWhereInput serialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput serialNotContains_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialNotEndsWith(String serialNotEndsWith) {

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

    public EcpLicenseWhereInput serialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialNotEndsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialNotIn(List<String> serialNotIn) {

        this.serialNotIn = serialNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSerialNotInItem(String serialNotInItem) {
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

    public EcpLicenseWhereInput serialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput serialNotIn_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialNotStartsWith(String serialNotStartsWith) {

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

    public EcpLicenseWhereInput serialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialNotStartsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput serialStartsWith(String serialStartsWith) {

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

    public EcpLicenseWhereInput serialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput serialStartsWith_ExplictlyNonNull() {
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

    public EcpLicenseWhereInput signDate(String signDate) {

        this.signDate = signDate;
        return this;
    }

    /**
     * Get signDate
     *
     * @return signDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public EcpLicenseWhereInput signDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public EcpLicenseWhereInput signDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE);
        return this;
    }

    public void setSignDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE);
        }
    }

    public boolean getSignDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE);
    }

    public EcpLicenseWhereInput signDateGt(String signDateGt) {

        this.signDateGt = signDateGt;
        return this;
    }

    /**
     * Get signDateGt
     *
     * @return signDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateGt() {
        return signDateGt;
    }

    public void setSignDateGt(String signDateGt) {
        this.signDateGt = signDateGt;
    }

    public EcpLicenseWhereInput signDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput signDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GT);
        return this;
    }

    public void setSignDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GT);
        }
    }

    public boolean getSignDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_GT);
    }

    public EcpLicenseWhereInput signDateGte(String signDateGte) {

        this.signDateGte = signDateGte;
        return this;
    }

    /**
     * Get signDateGte
     *
     * @return signDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateGte() {
        return signDateGte;
    }

    public void setSignDateGte(String signDateGte) {
        this.signDateGte = signDateGte;
    }

    public EcpLicenseWhereInput signDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput signDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GTE);
        return this;
    }

    public void setSignDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_GTE);
        }
    }

    public boolean getSignDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_GTE);
    }

    public EcpLicenseWhereInput signDateIn(List<String> signDateIn) {

        this.signDateIn = signDateIn;
        return this;
    }

    public EcpLicenseWhereInput addSignDateInItem(String signDateInItem) {
        if (this.signDateIn == null) {
            this.signDateIn = new ArrayList<String>();
        }
        this.signDateIn.add(signDateInItem);
        return this;
    }

    /**
     * Get signDateIn
     *
     * @return signDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSignDateIn() {
        return signDateIn;
    }

    public void setSignDateIn(List<String> signDateIn) {
        this.signDateIn = signDateIn;
    }

    public EcpLicenseWhereInput signDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput signDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_IN);
        return this;
    }

    public void setSignDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_IN);
        }
    }

    public boolean getSignDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_IN);
    }

    public EcpLicenseWhereInput signDateLt(String signDateLt) {

        this.signDateLt = signDateLt;
        return this;
    }

    /**
     * Get signDateLt
     *
     * @return signDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateLt() {
        return signDateLt;
    }

    public void setSignDateLt(String signDateLt) {
        this.signDateLt = signDateLt;
    }

    public EcpLicenseWhereInput signDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput signDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LT);
        return this;
    }

    public void setSignDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LT);
        }
    }

    public boolean getSignDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_LT);
    }

    public EcpLicenseWhereInput signDateLte(String signDateLte) {

        this.signDateLte = signDateLte;
        return this;
    }

    /**
     * Get signDateLte
     *
     * @return signDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateLte() {
        return signDateLte;
    }

    public void setSignDateLte(String signDateLte) {
        this.signDateLte = signDateLte;
    }

    public EcpLicenseWhereInput signDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput signDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LTE);
        return this;
    }

    public void setSignDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_LTE);
        }
    }

    public boolean getSignDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_LTE);
    }

    public EcpLicenseWhereInput signDateNot(String signDateNot) {

        this.signDateNot = signDateNot;
        return this;
    }

    /**
     * Get signDateNot
     *
     * @return signDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSignDateNot() {
        return signDateNot;
    }

    public void setSignDateNot(String signDateNot) {
        this.signDateNot = signDateNot;
    }

    public EcpLicenseWhereInput signDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput signDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT);
        return this;
    }

    public void setSignDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT);
        }
    }

    public boolean getSignDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_NOT);
    }

    public EcpLicenseWhereInput signDateNotIn(List<String> signDateNotIn) {

        this.signDateNotIn = signDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSignDateNotInItem(String signDateNotInItem) {
        if (this.signDateNotIn == null) {
            this.signDateNotIn = new ArrayList<String>();
        }
        this.signDateNotIn.add(signDateNotInItem);
        return this;
    }

    /**
     * Get signDateNotIn
     *
     * @return signDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSignDateNotIn() {
        return signDateNotIn;
    }

    public void setSignDateNotIn(List<String> signDateNotIn) {
        this.signDateNotIn = signDateNotIn;
    }

    public EcpLicenseWhereInput signDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput signDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        return this;
    }

    public void setSignDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
        }
    }

    public boolean getSignDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGN_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput subscriptionExpireDate(String subscriptionExpireDate) {

        this.subscriptionExpireDate = subscriptionExpireDate;
        return this;
    }

    /**
     * Get subscriptionExpireDate
     *
     * @return subscriptionExpireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDate() {
        return subscriptionExpireDate;
    }

    public void setSubscriptionExpireDate(String subscriptionExpireDate) {
        this.subscriptionExpireDate = subscriptionExpireDate;
    }

    public EcpLicenseWhereInput subscriptionExpireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        return this;
    }

    public void setSubscriptionExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
        }
    }

    public boolean getSubscriptionExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE);
    }

    public EcpLicenseWhereInput subscriptionExpireDateGt(String subscriptionExpireDateGt) {

        this.subscriptionExpireDateGt = subscriptionExpireDateGt;
        return this;
    }

    /**
     * Get subscriptionExpireDateGt
     *
     * @return subscriptionExpireDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateGt() {
        return subscriptionExpireDateGt;
    }

    public void setSubscriptionExpireDateGt(String subscriptionExpireDateGt) {
        this.subscriptionExpireDateGt = subscriptionExpireDateGt;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        return this;
    }

    public void setSubscriptionExpireDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
        }
    }

    public boolean getSubscriptionExpireDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GT);
    }

    public EcpLicenseWhereInput subscriptionExpireDateGte(String subscriptionExpireDateGte) {

        this.subscriptionExpireDateGte = subscriptionExpireDateGte;
        return this;
    }

    /**
     * Get subscriptionExpireDateGte
     *
     * @return subscriptionExpireDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateGte() {
        return subscriptionExpireDateGte;
    }

    public void setSubscriptionExpireDateGte(String subscriptionExpireDateGte) {
        this.subscriptionExpireDateGte = subscriptionExpireDateGte;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        return this;
    }

    public void setSubscriptionExpireDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
        }
    }

    public boolean getSubscriptionExpireDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_GTE);
    }

    public EcpLicenseWhereInput subscriptionExpireDateIn(List<String> subscriptionExpireDateIn) {

        this.subscriptionExpireDateIn = subscriptionExpireDateIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionExpireDateInItem(
            String subscriptionExpireDateInItem) {
        if (this.subscriptionExpireDateIn == null) {
            this.subscriptionExpireDateIn = new ArrayList<String>();
        }
        this.subscriptionExpireDateIn.add(subscriptionExpireDateInItem);
        return this;
    }

    /**
     * Get subscriptionExpireDateIn
     *
     * @return subscriptionExpireDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionExpireDateIn() {
        return subscriptionExpireDateIn;
    }

    public void setSubscriptionExpireDateIn(List<String> subscriptionExpireDateIn) {
        this.subscriptionExpireDateIn = subscriptionExpireDateIn;
    }

    public EcpLicenseWhereInput subscriptionExpireDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        return this;
    }

    public void setSubscriptionExpireDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
        }
    }

    public boolean getSubscriptionExpireDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_IN);
    }

    public EcpLicenseWhereInput subscriptionExpireDateLt(String subscriptionExpireDateLt) {

        this.subscriptionExpireDateLt = subscriptionExpireDateLt;
        return this;
    }

    /**
     * Get subscriptionExpireDateLt
     *
     * @return subscriptionExpireDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateLt() {
        return subscriptionExpireDateLt;
    }

    public void setSubscriptionExpireDateLt(String subscriptionExpireDateLt) {
        this.subscriptionExpireDateLt = subscriptionExpireDateLt;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        return this;
    }

    public void setSubscriptionExpireDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
        }
    }

    public boolean getSubscriptionExpireDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LT);
    }

    public EcpLicenseWhereInput subscriptionExpireDateLte(String subscriptionExpireDateLte) {

        this.subscriptionExpireDateLte = subscriptionExpireDateLte;
        return this;
    }

    /**
     * Get subscriptionExpireDateLte
     *
     * @return subscriptionExpireDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateLte() {
        return subscriptionExpireDateLte;
    }

    public void setSubscriptionExpireDateLte(String subscriptionExpireDateLte) {
        this.subscriptionExpireDateLte = subscriptionExpireDateLte;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        return this;
    }

    public void setSubscriptionExpireDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
        }
    }

    public boolean getSubscriptionExpireDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_LTE);
    }

    public EcpLicenseWhereInput subscriptionExpireDateNot(String subscriptionExpireDateNot) {

        this.subscriptionExpireDateNot = subscriptionExpireDateNot;
        return this;
    }

    /**
     * Get subscriptionExpireDateNot
     *
     * @return subscriptionExpireDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionExpireDateNot() {
        return subscriptionExpireDateNot;
    }

    public void setSubscriptionExpireDateNot(String subscriptionExpireDateNot) {
        this.subscriptionExpireDateNot = subscriptionExpireDateNot;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        return this;
    }

    public void setSubscriptionExpireDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
        }
    }

    public boolean getSubscriptionExpireDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT);
    }

    public EcpLicenseWhereInput subscriptionExpireDateNotIn(
            List<String> subscriptionExpireDateNotIn) {

        this.subscriptionExpireDateNotIn = subscriptionExpireDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionExpireDateNotInItem(
            String subscriptionExpireDateNotInItem) {
        if (this.subscriptionExpireDateNotIn == null) {
            this.subscriptionExpireDateNotIn = new ArrayList<String>();
        }
        this.subscriptionExpireDateNotIn.add(subscriptionExpireDateNotInItem);
        return this;
    }

    /**
     * Get subscriptionExpireDateNotIn
     *
     * @return subscriptionExpireDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionExpireDateNotIn() {
        return subscriptionExpireDateNotIn;
    }

    public void setSubscriptionExpireDateNotIn(List<String> subscriptionExpireDateNotIn) {
        this.subscriptionExpireDateNotIn = subscriptionExpireDateNotIn;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionExpireDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        return this;
    }

    public void setSubscriptionExpireDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
        }
    }

    public boolean getSubscriptionExpireDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_EXPIRE_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput subscriptionStartDate(String subscriptionStartDate) {

        this.subscriptionStartDate = subscriptionStartDate;
        return this;
    }

    /**
     * Get subscriptionStartDate
     *
     * @return subscriptionStartDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(String subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public EcpLicenseWhereInput subscriptionStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        return this;
    }

    public void setSubscriptionStartDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
        }
    }

    public boolean getSubscriptionStartDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE);
    }

    public EcpLicenseWhereInput subscriptionStartDateGt(String subscriptionStartDateGt) {

        this.subscriptionStartDateGt = subscriptionStartDateGt;
        return this;
    }

    /**
     * Get subscriptionStartDateGt
     *
     * @return subscriptionStartDateGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateGt() {
        return subscriptionStartDateGt;
    }

    public void setSubscriptionStartDateGt(String subscriptionStartDateGt) {
        this.subscriptionStartDateGt = subscriptionStartDateGt;
    }

    public EcpLicenseWhereInput subscriptionStartDateGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        return this;
    }

    public void setSubscriptionStartDateGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
        }
    }

    public boolean getSubscriptionStartDateGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GT);
    }

    public EcpLicenseWhereInput subscriptionStartDateGte(String subscriptionStartDateGte) {

        this.subscriptionStartDateGte = subscriptionStartDateGte;
        return this;
    }

    /**
     * Get subscriptionStartDateGte
     *
     * @return subscriptionStartDateGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateGte() {
        return subscriptionStartDateGte;
    }

    public void setSubscriptionStartDateGte(String subscriptionStartDateGte) {
        this.subscriptionStartDateGte = subscriptionStartDateGte;
    }

    public EcpLicenseWhereInput subscriptionStartDateGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        return this;
    }

    public void setSubscriptionStartDateGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
        }
    }

    public boolean getSubscriptionStartDateGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_GTE);
    }

    public EcpLicenseWhereInput subscriptionStartDateIn(List<String> subscriptionStartDateIn) {

        this.subscriptionStartDateIn = subscriptionStartDateIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionStartDateInItem(String subscriptionStartDateInItem) {
        if (this.subscriptionStartDateIn == null) {
            this.subscriptionStartDateIn = new ArrayList<String>();
        }
        this.subscriptionStartDateIn.add(subscriptionStartDateInItem);
        return this;
    }

    /**
     * Get subscriptionStartDateIn
     *
     * @return subscriptionStartDateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionStartDateIn() {
        return subscriptionStartDateIn;
    }

    public void setSubscriptionStartDateIn(List<String> subscriptionStartDateIn) {
        this.subscriptionStartDateIn = subscriptionStartDateIn;
    }

    public EcpLicenseWhereInput subscriptionStartDateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        return this;
    }

    public void setSubscriptionStartDateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
        }
    }

    public boolean getSubscriptionStartDateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_IN);
    }

    public EcpLicenseWhereInput subscriptionStartDateLt(String subscriptionStartDateLt) {

        this.subscriptionStartDateLt = subscriptionStartDateLt;
        return this;
    }

    /**
     * Get subscriptionStartDateLt
     *
     * @return subscriptionStartDateLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateLt() {
        return subscriptionStartDateLt;
    }

    public void setSubscriptionStartDateLt(String subscriptionStartDateLt) {
        this.subscriptionStartDateLt = subscriptionStartDateLt;
    }

    public EcpLicenseWhereInput subscriptionStartDateLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        return this;
    }

    public void setSubscriptionStartDateLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
        }
    }

    public boolean getSubscriptionStartDateLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LT);
    }

    public EcpLicenseWhereInput subscriptionStartDateLte(String subscriptionStartDateLte) {

        this.subscriptionStartDateLte = subscriptionStartDateLte;
        return this;
    }

    /**
     * Get subscriptionStartDateLte
     *
     * @return subscriptionStartDateLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateLte() {
        return subscriptionStartDateLte;
    }

    public void setSubscriptionStartDateLte(String subscriptionStartDateLte) {
        this.subscriptionStartDateLte = subscriptionStartDateLte;
    }

    public EcpLicenseWhereInput subscriptionStartDateLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        return this;
    }

    public void setSubscriptionStartDateLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
        }
    }

    public boolean getSubscriptionStartDateLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_LTE);
    }

    public EcpLicenseWhereInput subscriptionStartDateNot(String subscriptionStartDateNot) {

        this.subscriptionStartDateNot = subscriptionStartDateNot;
        return this;
    }

    /**
     * Get subscriptionStartDateNot
     *
     * @return subscriptionStartDateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubscriptionStartDateNot() {
        return subscriptionStartDateNot;
    }

    public void setSubscriptionStartDateNot(String subscriptionStartDateNot) {
        this.subscriptionStartDateNot = subscriptionStartDateNot;
    }

    public EcpLicenseWhereInput subscriptionStartDateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        return this;
    }

    public void setSubscriptionStartDateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
        }
    }

    public boolean getSubscriptionStartDateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT);
    }

    public EcpLicenseWhereInput subscriptionStartDateNotIn(
            List<String> subscriptionStartDateNotIn) {

        this.subscriptionStartDateNotIn = subscriptionStartDateNotIn;
        return this;
    }

    public EcpLicenseWhereInput addSubscriptionStartDateNotInItem(
            String subscriptionStartDateNotInItem) {
        if (this.subscriptionStartDateNotIn == null) {
            this.subscriptionStartDateNotIn = new ArrayList<String>();
        }
        this.subscriptionStartDateNotIn.add(subscriptionStartDateNotInItem);
        return this;
    }

    /**
     * Get subscriptionStartDateNotIn
     *
     * @return subscriptionStartDateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubscriptionStartDateNotIn() {
        return subscriptionStartDateNotIn;
    }

    public void setSubscriptionStartDateNotIn(List<String> subscriptionStartDateNotIn) {
        this.subscriptionStartDateNotIn = subscriptionStartDateNotIn;
    }

    public EcpLicenseWhereInput subscriptionStartDateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput subscriptionStartDateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        return this;
    }

    public void setSubscriptionStartDateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
        }
    }

    public boolean getSubscriptionStartDateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSCRIPTION_START_DATE_NOT_IN);
    }

    public EcpLicenseWhereInput vendor(String vendor) {

        this.vendor = vendor;
        return this;
    }

    /**
     * Get vendor
     *
     * @return vendor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public EcpLicenseWhereInput vendor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR);
        return this;
    }

    public EcpLicenseWhereInput vendor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR);
        return this;
    }

    public void setVendor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR);
        }
    }

    public boolean getVendor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR);
    }

    public EcpLicenseWhereInput vendorContains(String vendorContains) {

        this.vendorContains = vendorContains;
        return this;
    }

    /**
     * Get vendorContains
     *
     * @return vendorContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorContains() {
        return vendorContains;
    }

    public void setVendorContains(String vendorContains) {
        this.vendorContains = vendorContains;
    }

    public EcpLicenseWhereInput vendorContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput vendorContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_CONTAINS);
        return this;
    }

    public void setVendorContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_CONTAINS);
        }
    }

    public boolean getVendorContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_CONTAINS);
    }

    public EcpLicenseWhereInput vendorEndsWith(String vendorEndsWith) {

        this.vendorEndsWith = vendorEndsWith;
        return this;
    }

    /**
     * Get vendorEndsWith
     *
     * @return vendorEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorEndsWith() {
        return vendorEndsWith;
    }

    public void setVendorEndsWith(String vendorEndsWith) {
        this.vendorEndsWith = vendorEndsWith;
    }

    public EcpLicenseWhereInput vendorEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        return this;
    }

    public void setVendorEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ENDS_WITH);
        }
    }

    public boolean getVendorEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ENDS_WITH);
    }

    public EcpLicenseWhereInput vendorGt(String vendorGt) {

        this.vendorGt = vendorGt;
        return this;
    }

    /**
     * Get vendorGt
     *
     * @return vendorGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorGt() {
        return vendorGt;
    }

    public void setVendorGt(String vendorGt) {
        this.vendorGt = vendorGt;
    }

    public EcpLicenseWhereInput vendorGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_GT);
        return this;
    }

    public EcpLicenseWhereInput vendorGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GT);
        return this;
    }

    public void setVendorGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GT);
        }
    }

    public boolean getVendorGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_GT);
    }

    public EcpLicenseWhereInput vendorGte(String vendorGte) {

        this.vendorGte = vendorGte;
        return this;
    }

    /**
     * Get vendorGte
     *
     * @return vendorGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorGte() {
        return vendorGte;
    }

    public void setVendorGte(String vendorGte) {
        this.vendorGte = vendorGte;
    }

    public EcpLicenseWhereInput vendorGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_GTE);
        return this;
    }

    public EcpLicenseWhereInput vendorGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GTE);
        return this;
    }

    public void setVendorGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_GTE);
        }
    }

    public boolean getVendorGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_GTE);
    }

    public EcpLicenseWhereInput vendorIn(List<String> vendorIn) {

        this.vendorIn = vendorIn;
        return this;
    }

    public EcpLicenseWhereInput addVendorInItem(String vendorInItem) {
        if (this.vendorIn == null) {
            this.vendorIn = new ArrayList<String>();
        }
        this.vendorIn.add(vendorInItem);
        return this;
    }

    /**
     * Get vendorIn
     *
     * @return vendorIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVendorIn() {
        return vendorIn;
    }

    public void setVendorIn(List<String> vendorIn) {
        this.vendorIn = vendorIn;
    }

    public EcpLicenseWhereInput vendorIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_IN);
        return this;
    }

    public EcpLicenseWhereInput vendorIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_IN);
        return this;
    }

    public void setVendorIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_IN);
        }
    }

    public boolean getVendorIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_IN);
    }

    public EcpLicenseWhereInput vendorLt(String vendorLt) {

        this.vendorLt = vendorLt;
        return this;
    }

    /**
     * Get vendorLt
     *
     * @return vendorLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorLt() {
        return vendorLt;
    }

    public void setVendorLt(String vendorLt) {
        this.vendorLt = vendorLt;
    }

    public EcpLicenseWhereInput vendorLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_LT);
        return this;
    }

    public EcpLicenseWhereInput vendorLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LT);
        return this;
    }

    public void setVendorLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LT);
        }
    }

    public boolean getVendorLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_LT);
    }

    public EcpLicenseWhereInput vendorLte(String vendorLte) {

        this.vendorLte = vendorLte;
        return this;
    }

    /**
     * Get vendorLte
     *
     * @return vendorLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorLte() {
        return vendorLte;
    }

    public void setVendorLte(String vendorLte) {
        this.vendorLte = vendorLte;
    }

    public EcpLicenseWhereInput vendorLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_LTE);
        return this;
    }

    public EcpLicenseWhereInput vendorLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LTE);
        return this;
    }

    public void setVendorLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_LTE);
        }
    }

    public boolean getVendorLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_LTE);
    }

    public EcpLicenseWhereInput vendorNot(String vendorNot) {

        this.vendorNot = vendorNot;
        return this;
    }

    /**
     * Get vendorNot
     *
     * @return vendorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNot() {
        return vendorNot;
    }

    public void setVendorNot(String vendorNot) {
        this.vendorNot = vendorNot;
    }

    public EcpLicenseWhereInput vendorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT);
        return this;
    }

    public EcpLicenseWhereInput vendorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT);
        return this;
    }

    public void setVendorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT);
        }
    }

    public boolean getVendorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT);
    }

    public EcpLicenseWhereInput vendorNotContains(String vendorNotContains) {

        this.vendorNotContains = vendorNotContains;
        return this;
    }

    /**
     * Get vendorNotContains
     *
     * @return vendorNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNotContains() {
        return vendorNotContains;
    }

    public void setVendorNotContains(String vendorNotContains) {
        this.vendorNotContains = vendorNotContains;
    }

    public EcpLicenseWhereInput vendorNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        return this;
    }

    public EcpLicenseWhereInput vendorNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        return this;
    }

    public void setVendorNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
        }
    }

    public boolean getVendorNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_CONTAINS);
    }

    public EcpLicenseWhereInput vendorNotEndsWith(String vendorNotEndsWith) {

        this.vendorNotEndsWith = vendorNotEndsWith;
        return this;
    }

    /**
     * Get vendorNotEndsWith
     *
     * @return vendorNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNotEndsWith() {
        return vendorNotEndsWith;
    }

    public void setVendorNotEndsWith(String vendorNotEndsWith) {
        this.vendorNotEndsWith = vendorNotEndsWith;
    }

    public EcpLicenseWhereInput vendorNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        return this;
    }

    public void setVendorNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
        }
    }

    public boolean getVendorNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_ENDS_WITH);
    }

    public EcpLicenseWhereInput vendorNotIn(List<String> vendorNotIn) {

        this.vendorNotIn = vendorNotIn;
        return this;
    }

    public EcpLicenseWhereInput addVendorNotInItem(String vendorNotInItem) {
        if (this.vendorNotIn == null) {
            this.vendorNotIn = new ArrayList<String>();
        }
        this.vendorNotIn.add(vendorNotInItem);
        return this;
    }

    /**
     * Get vendorNotIn
     *
     * @return vendorNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVendorNotIn() {
        return vendorNotIn;
    }

    public void setVendorNotIn(List<String> vendorNotIn) {
        this.vendorNotIn = vendorNotIn;
    }

    public EcpLicenseWhereInput vendorNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput vendorNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_IN);
        return this;
    }

    public void setVendorNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_IN);
        }
    }

    public boolean getVendorNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_IN);
    }

    public EcpLicenseWhereInput vendorNotStartsWith(String vendorNotStartsWith) {

        this.vendorNotStartsWith = vendorNotStartsWith;
        return this;
    }

    /**
     * Get vendorNotStartsWith
     *
     * @return vendorNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorNotStartsWith() {
        return vendorNotStartsWith;
    }

    public void setVendorNotStartsWith(String vendorNotStartsWith) {
        this.vendorNotStartsWith = vendorNotStartsWith;
    }

    public EcpLicenseWhereInput vendorNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        return this;
    }

    public void setVendorNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
        }
    }

    public boolean getVendorNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_NOT_STARTS_WITH);
    }

    public EcpLicenseWhereInput vendorStartsWith(String vendorStartsWith) {

        this.vendorStartsWith = vendorStartsWith;
        return this;
    }

    /**
     * Get vendorStartsWith
     *
     * @return vendorStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorStartsWith() {
        return vendorStartsWith;
    }

    public void setVendorStartsWith(String vendorStartsWith) {
        this.vendorStartsWith = vendorStartsWith;
    }

    public EcpLicenseWhereInput vendorStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        return this;
    }

    public EcpLicenseWhereInput vendorStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        return this;
    }

    public void setVendorStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_STARTS_WITH);
        }
    }

    public boolean getVendorStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_STARTS_WITH);
    }

    public EcpLicenseWhereInput version(Integer version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public EcpLicenseWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public EcpLicenseWhereInput version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public EcpLicenseWhereInput versionGt(Integer versionGt) {

        this.versionGt = versionGt;
        return this;
    }

    /**
     * Get versionGt
     *
     * @return versionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(Integer versionGt) {
        this.versionGt = versionGt;
    }

    public EcpLicenseWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public EcpLicenseWhereInput versionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public void setVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        }
    }

    public boolean getVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GT);
    }

    public EcpLicenseWhereInput versionGte(Integer versionGte) {

        this.versionGte = versionGte;
        return this;
    }

    /**
     * Get versionGte
     *
     * @return versionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(Integer versionGte) {
        this.versionGte = versionGte;
    }

    public EcpLicenseWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public EcpLicenseWhereInput versionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public void setVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        }
    }

    public boolean getVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GTE);
    }

    public EcpLicenseWhereInput versionIn(List<Integer> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public EcpLicenseWhereInput addVersionInItem(Integer versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<Integer>();
        }
        this.versionIn.add(versionInItem);
        return this;
    }

    /**
     * Get versionIn
     *
     * @return versionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<Integer> versionIn) {
        this.versionIn = versionIn;
    }

    public EcpLicenseWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public EcpLicenseWhereInput versionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public void setVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        }
    }

    public boolean getVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_IN);
    }

    public EcpLicenseWhereInput versionLt(Integer versionLt) {

        this.versionLt = versionLt;
        return this;
    }

    /**
     * Get versionLt
     *
     * @return versionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(Integer versionLt) {
        this.versionLt = versionLt;
    }

    public EcpLicenseWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public EcpLicenseWhereInput versionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public void setVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        }
    }

    public boolean getVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LT);
    }

    public EcpLicenseWhereInput versionLte(Integer versionLte) {

        this.versionLte = versionLte;
        return this;
    }

    /**
     * Get versionLte
     *
     * @return versionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(Integer versionLte) {
        this.versionLte = versionLte;
    }

    public EcpLicenseWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public EcpLicenseWhereInput versionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public void setVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        }
    }

    public boolean getVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LTE);
    }

    public EcpLicenseWhereInput versionNot(Integer versionNot) {

        this.versionNot = versionNot;
        return this;
    }

    /**
     * Get versionNot
     *
     * @return versionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(Integer versionNot) {
        this.versionNot = versionNot;
    }

    public EcpLicenseWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public EcpLicenseWhereInput versionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public void setVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        }
    }

    public boolean getVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT);
    }

    public EcpLicenseWhereInput versionNotIn(List<Integer> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public EcpLicenseWhereInput addVersionNotInItem(Integer versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<Integer>();
        }
        this.versionNotIn.add(versionNotInItem);
        return this;
    }

    /**
     * Get versionNotIn
     *
     * @return versionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<Integer> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public EcpLicenseWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public EcpLicenseWhereInput versionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public void setVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        }
    }

    public boolean getVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EcpLicenseWhereInput ecpLicenseWhereInput = (EcpLicenseWhereInput) o;
        return Objects.equals(this.AND, ecpLicenseWhereInput.AND)
                && Objects.equals(this.NOT, ecpLicenseWhereInput.NOT)
                && Objects.equals(this.OR, ecpLicenseWhereInput.OR)
                && Objects.equals(this.cluster, ecpLicenseWhereInput.cluster)
                && Objects.equals(this.clusterLocalId, ecpLicenseWhereInput.clusterLocalId)
                && Objects.equals(
                        this.clusterLocalIdContains, ecpLicenseWhereInput.clusterLocalIdContains)
                && Objects.equals(
                        this.clusterLocalIdEndsWith, ecpLicenseWhereInput.clusterLocalIdEndsWith)
                && Objects.equals(this.clusterLocalIdGt, ecpLicenseWhereInput.clusterLocalIdGt)
                && Objects.equals(this.clusterLocalIdGte, ecpLicenseWhereInput.clusterLocalIdGte)
                && Objects.equals(this.clusterLocalIdIn, ecpLicenseWhereInput.clusterLocalIdIn)
                && Objects.equals(this.clusterLocalIdLt, ecpLicenseWhereInput.clusterLocalIdLt)
                && Objects.equals(this.clusterLocalIdLte, ecpLicenseWhereInput.clusterLocalIdLte)
                && Objects.equals(this.clusterLocalIdNot, ecpLicenseWhereInput.clusterLocalIdNot)
                && Objects.equals(
                        this.clusterLocalIdNotContains,
                        ecpLicenseWhereInput.clusterLocalIdNotContains)
                && Objects.equals(
                        this.clusterLocalIdNotEndsWith,
                        ecpLicenseWhereInput.clusterLocalIdNotEndsWith)
                && Objects.equals(
                        this.clusterLocalIdNotIn, ecpLicenseWhereInput.clusterLocalIdNotIn)
                && Objects.equals(
                        this.clusterLocalIdNotStartsWith,
                        ecpLicenseWhereInput.clusterLocalIdNotStartsWith)
                && Objects.equals(
                        this.clusterLocalIdStartsWith,
                        ecpLicenseWhereInput.clusterLocalIdStartsWith)
                && Objects.equals(this.ecpEdition, ecpLicenseWhereInput.ecpEdition)
                && Objects.equals(this.ecpEditionIn, ecpLicenseWhereInput.ecpEditionIn)
                && Objects.equals(this.ecpEditionNot, ecpLicenseWhereInput.ecpEditionNot)
                && Objects.equals(this.ecpEditionNotIn, ecpLicenseWhereInput.ecpEditionNotIn)
                && Objects.equals(this.expireDate, ecpLicenseWhereInput.expireDate)
                && Objects.equals(this.expireDateGt, ecpLicenseWhereInput.expireDateGt)
                && Objects.equals(this.expireDateGte, ecpLicenseWhereInput.expireDateGte)
                && Objects.equals(this.expireDateIn, ecpLicenseWhereInput.expireDateIn)
                && Objects.equals(this.expireDateLt, ecpLicenseWhereInput.expireDateLt)
                && Objects.equals(this.expireDateLte, ecpLicenseWhereInput.expireDateLte)
                && Objects.equals(this.expireDateNot, ecpLicenseWhereInput.expireDateNot)
                && Objects.equals(this.expireDateNotIn, ecpLicenseWhereInput.expireDateNotIn)
                && Objects.equals(this.hasMetrox, ecpLicenseWhereInput.hasMetrox)
                && Objects.equals(this.hasMetroxNot, ecpLicenseWhereInput.hasMetroxNot)
                && Objects.equals(this.hasRemoteBackup, ecpLicenseWhereInput.hasRemoteBackup)
                && Objects.equals(this.hasRemoteBackupNot, ecpLicenseWhereInput.hasRemoteBackupNot)
                && Objects.equals(this.id, ecpLicenseWhereInput.id)
                && Objects.equals(this.idContains, ecpLicenseWhereInput.idContains)
                && Objects.equals(this.idEndsWith, ecpLicenseWhereInput.idEndsWith)
                && Objects.equals(this.idGt, ecpLicenseWhereInput.idGt)
                && Objects.equals(this.idGte, ecpLicenseWhereInput.idGte)
                && Objects.equals(this.idIn, ecpLicenseWhereInput.idIn)
                && Objects.equals(this.idLt, ecpLicenseWhereInput.idLt)
                && Objects.equals(this.idLte, ecpLicenseWhereInput.idLte)
                && Objects.equals(this.idNot, ecpLicenseWhereInput.idNot)
                && Objects.equals(this.idNotContains, ecpLicenseWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, ecpLicenseWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, ecpLicenseWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, ecpLicenseWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, ecpLicenseWhereInput.idStartsWith)
                && Objects.equals(this.licenseType, ecpLicenseWhereInput.licenseType)
                && Objects.equals(this.licenseTypeIn, ecpLicenseWhereInput.licenseTypeIn)
                && Objects.equals(this.licenseTypeNot, ecpLicenseWhereInput.licenseTypeNot)
                && Objects.equals(this.licenseTypeNotIn, ecpLicenseWhereInput.licenseTypeNotIn)
                && Objects.equals(this.maxCoreNum, ecpLicenseWhereInput.maxCoreNum)
                && Objects.equals(this.maxCoreNumGt, ecpLicenseWhereInput.maxCoreNumGt)
                && Objects.equals(this.maxCoreNumGte, ecpLicenseWhereInput.maxCoreNumGte)
                && Objects.equals(this.maxCoreNumIn, ecpLicenseWhereInput.maxCoreNumIn)
                && Objects.equals(this.maxCoreNumLt, ecpLicenseWhereInput.maxCoreNumLt)
                && Objects.equals(this.maxCoreNumLte, ecpLicenseWhereInput.maxCoreNumLte)
                && Objects.equals(this.maxCoreNumNot, ecpLicenseWhereInput.maxCoreNumNot)
                && Objects.equals(this.maxCoreNumNotIn, ecpLicenseWhereInput.maxCoreNumNotIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacity, ecpLicenseWhereInput.maxPhysicalDataCapacity)
                && Objects.equals(
                        this.maxPhysicalDataCapacityGt,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityGt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityGte,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityGte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityIn,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityIn)
                && Objects.equals(
                        this.maxPhysicalDataCapacityLt,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityLt)
                && Objects.equals(
                        this.maxPhysicalDataCapacityLte,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityLte)
                && Objects.equals(
                        this.maxPhysicalDataCapacityNot,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityNot)
                && Objects.equals(
                        this.maxPhysicalDataCapacityNotIn,
                        ecpLicenseWhereInput.maxPhysicalDataCapacityNotIn)
                && Objects.equals(this.originalCode, ecpLicenseWhereInput.originalCode)
                && Objects.equals(
                        this.originalCodeContains, ecpLicenseWhereInput.originalCodeContains)
                && Objects.equals(
                        this.originalCodeEndsWith, ecpLicenseWhereInput.originalCodeEndsWith)
                && Objects.equals(this.originalCodeGt, ecpLicenseWhereInput.originalCodeGt)
                && Objects.equals(this.originalCodeGte, ecpLicenseWhereInput.originalCodeGte)
                && Objects.equals(this.originalCodeIn, ecpLicenseWhereInput.originalCodeIn)
                && Objects.equals(this.originalCodeLt, ecpLicenseWhereInput.originalCodeLt)
                && Objects.equals(this.originalCodeLte, ecpLicenseWhereInput.originalCodeLte)
                && Objects.equals(this.originalCodeNot, ecpLicenseWhereInput.originalCodeNot)
                && Objects.equals(
                        this.originalCodeNotContains, ecpLicenseWhereInput.originalCodeNotContains)
                && Objects.equals(
                        this.originalCodeNotEndsWith, ecpLicenseWhereInput.originalCodeNotEndsWith)
                && Objects.equals(this.originalCodeNotIn, ecpLicenseWhereInput.originalCodeNotIn)
                && Objects.equals(
                        this.originalCodeNotStartsWith,
                        ecpLicenseWhereInput.originalCodeNotStartsWith)
                && Objects.equals(
                        this.originalCodeStartsWith, ecpLicenseWhereInput.originalCodeStartsWith)
                && Objects.equals(this.productName, ecpLicenseWhereInput.productName)
                && Objects.equals(
                        this.productNameContains, ecpLicenseWhereInput.productNameContains)
                && Objects.equals(
                        this.productNameEndsWith, ecpLicenseWhereInput.productNameEndsWith)
                && Objects.equals(this.productNameGt, ecpLicenseWhereInput.productNameGt)
                && Objects.equals(this.productNameGte, ecpLicenseWhereInput.productNameGte)
                && Objects.equals(this.productNameIn, ecpLicenseWhereInput.productNameIn)
                && Objects.equals(this.productNameLt, ecpLicenseWhereInput.productNameLt)
                && Objects.equals(this.productNameLte, ecpLicenseWhereInput.productNameLte)
                && Objects.equals(this.productNameNot, ecpLicenseWhereInput.productNameNot)
                && Objects.equals(
                        this.productNameNotContains, ecpLicenseWhereInput.productNameNotContains)
                && Objects.equals(
                        this.productNameNotEndsWith, ecpLicenseWhereInput.productNameNotEndsWith)
                && Objects.equals(this.productNameNotIn, ecpLicenseWhereInput.productNameNotIn)
                && Objects.equals(
                        this.productNameNotStartsWith,
                        ecpLicenseWhereInput.productNameNotStartsWith)
                && Objects.equals(
                        this.productNameStartsWith, ecpLicenseWhereInput.productNameStartsWith)
                && Objects.equals(this.serial, ecpLicenseWhereInput.serial)
                && Objects.equals(this.serialContains, ecpLicenseWhereInput.serialContains)
                && Objects.equals(this.serialEndsWith, ecpLicenseWhereInput.serialEndsWith)
                && Objects.equals(this.serialGt, ecpLicenseWhereInput.serialGt)
                && Objects.equals(this.serialGte, ecpLicenseWhereInput.serialGte)
                && Objects.equals(this.serialIn, ecpLicenseWhereInput.serialIn)
                && Objects.equals(this.serialLt, ecpLicenseWhereInput.serialLt)
                && Objects.equals(this.serialLte, ecpLicenseWhereInput.serialLte)
                && Objects.equals(this.serialNot, ecpLicenseWhereInput.serialNot)
                && Objects.equals(this.serialNotContains, ecpLicenseWhereInput.serialNotContains)
                && Objects.equals(this.serialNotEndsWith, ecpLicenseWhereInput.serialNotEndsWith)
                && Objects.equals(this.serialNotIn, ecpLicenseWhereInput.serialNotIn)
                && Objects.equals(
                        this.serialNotStartsWith, ecpLicenseWhereInput.serialNotStartsWith)
                && Objects.equals(this.serialStartsWith, ecpLicenseWhereInput.serialStartsWith)
                && Objects.equals(this.signDate, ecpLicenseWhereInput.signDate)
                && Objects.equals(this.signDateGt, ecpLicenseWhereInput.signDateGt)
                && Objects.equals(this.signDateGte, ecpLicenseWhereInput.signDateGte)
                && Objects.equals(this.signDateIn, ecpLicenseWhereInput.signDateIn)
                && Objects.equals(this.signDateLt, ecpLicenseWhereInput.signDateLt)
                && Objects.equals(this.signDateLte, ecpLicenseWhereInput.signDateLte)
                && Objects.equals(this.signDateNot, ecpLicenseWhereInput.signDateNot)
                && Objects.equals(this.signDateNotIn, ecpLicenseWhereInput.signDateNotIn)
                && Objects.equals(
                        this.subscriptionExpireDate, ecpLicenseWhereInput.subscriptionExpireDate)
                && Objects.equals(
                        this.subscriptionExpireDateGt,
                        ecpLicenseWhereInput.subscriptionExpireDateGt)
                && Objects.equals(
                        this.subscriptionExpireDateGte,
                        ecpLicenseWhereInput.subscriptionExpireDateGte)
                && Objects.equals(
                        this.subscriptionExpireDateIn,
                        ecpLicenseWhereInput.subscriptionExpireDateIn)
                && Objects.equals(
                        this.subscriptionExpireDateLt,
                        ecpLicenseWhereInput.subscriptionExpireDateLt)
                && Objects.equals(
                        this.subscriptionExpireDateLte,
                        ecpLicenseWhereInput.subscriptionExpireDateLte)
                && Objects.equals(
                        this.subscriptionExpireDateNot,
                        ecpLicenseWhereInput.subscriptionExpireDateNot)
                && Objects.equals(
                        this.subscriptionExpireDateNotIn,
                        ecpLicenseWhereInput.subscriptionExpireDateNotIn)
                && Objects.equals(
                        this.subscriptionStartDate, ecpLicenseWhereInput.subscriptionStartDate)
                && Objects.equals(
                        this.subscriptionStartDateGt, ecpLicenseWhereInput.subscriptionStartDateGt)
                && Objects.equals(
                        this.subscriptionStartDateGte,
                        ecpLicenseWhereInput.subscriptionStartDateGte)
                && Objects.equals(
                        this.subscriptionStartDateIn, ecpLicenseWhereInput.subscriptionStartDateIn)
                && Objects.equals(
                        this.subscriptionStartDateLt, ecpLicenseWhereInput.subscriptionStartDateLt)
                && Objects.equals(
                        this.subscriptionStartDateLte,
                        ecpLicenseWhereInput.subscriptionStartDateLte)
                && Objects.equals(
                        this.subscriptionStartDateNot,
                        ecpLicenseWhereInput.subscriptionStartDateNot)
                && Objects.equals(
                        this.subscriptionStartDateNotIn,
                        ecpLicenseWhereInput.subscriptionStartDateNotIn)
                && Objects.equals(this.vendor, ecpLicenseWhereInput.vendor)
                && Objects.equals(this.vendorContains, ecpLicenseWhereInput.vendorContains)
                && Objects.equals(this.vendorEndsWith, ecpLicenseWhereInput.vendorEndsWith)
                && Objects.equals(this.vendorGt, ecpLicenseWhereInput.vendorGt)
                && Objects.equals(this.vendorGte, ecpLicenseWhereInput.vendorGte)
                && Objects.equals(this.vendorIn, ecpLicenseWhereInput.vendorIn)
                && Objects.equals(this.vendorLt, ecpLicenseWhereInput.vendorLt)
                && Objects.equals(this.vendorLte, ecpLicenseWhereInput.vendorLte)
                && Objects.equals(this.vendorNot, ecpLicenseWhereInput.vendorNot)
                && Objects.equals(this.vendorNotContains, ecpLicenseWhereInput.vendorNotContains)
                && Objects.equals(this.vendorNotEndsWith, ecpLicenseWhereInput.vendorNotEndsWith)
                && Objects.equals(this.vendorNotIn, ecpLicenseWhereInput.vendorNotIn)
                && Objects.equals(
                        this.vendorNotStartsWith, ecpLicenseWhereInput.vendorNotStartsWith)
                && Objects.equals(this.vendorStartsWith, ecpLicenseWhereInput.vendorStartsWith)
                && Objects.equals(this.version, ecpLicenseWhereInput.version)
                && Objects.equals(this.versionGt, ecpLicenseWhereInput.versionGt)
                && Objects.equals(this.versionGte, ecpLicenseWhereInput.versionGte)
                && Objects.equals(this.versionIn, ecpLicenseWhereInput.versionIn)
                && Objects.equals(this.versionLt, ecpLicenseWhereInput.versionLt)
                && Objects.equals(this.versionLte, ecpLicenseWhereInput.versionLte)
                && Objects.equals(this.versionNot, ecpLicenseWhereInput.versionNot)
                && Objects.equals(this.versionNotIn, ecpLicenseWhereInput.versionNotIn);
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
                clusterLocalId,
                clusterLocalIdContains,
                clusterLocalIdEndsWith,
                clusterLocalIdGt,
                clusterLocalIdGte,
                clusterLocalIdIn,
                clusterLocalIdLt,
                clusterLocalIdLte,
                clusterLocalIdNot,
                clusterLocalIdNotContains,
                clusterLocalIdNotEndsWith,
                clusterLocalIdNotIn,
                clusterLocalIdNotStartsWith,
                clusterLocalIdStartsWith,
                ecpEdition,
                ecpEditionIn,
                ecpEditionNot,
                ecpEditionNotIn,
                expireDate,
                expireDateGt,
                expireDateGte,
                expireDateIn,
                expireDateLt,
                expireDateLte,
                expireDateNot,
                expireDateNotIn,
                hasMetrox,
                hasMetroxNot,
                hasRemoteBackup,
                hasRemoteBackupNot,
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
                licenseType,
                licenseTypeIn,
                licenseTypeNot,
                licenseTypeNotIn,
                maxCoreNum,
                maxCoreNumGt,
                maxCoreNumGte,
                maxCoreNumIn,
                maxCoreNumLt,
                maxCoreNumLte,
                maxCoreNumNot,
                maxCoreNumNotIn,
                maxPhysicalDataCapacity,
                maxPhysicalDataCapacityGt,
                maxPhysicalDataCapacityGte,
                maxPhysicalDataCapacityIn,
                maxPhysicalDataCapacityLt,
                maxPhysicalDataCapacityLte,
                maxPhysicalDataCapacityNot,
                maxPhysicalDataCapacityNotIn,
                originalCode,
                originalCodeContains,
                originalCodeEndsWith,
                originalCodeGt,
                originalCodeGte,
                originalCodeIn,
                originalCodeLt,
                originalCodeLte,
                originalCodeNot,
                originalCodeNotContains,
                originalCodeNotEndsWith,
                originalCodeNotIn,
                originalCodeNotStartsWith,
                originalCodeStartsWith,
                productName,
                productNameContains,
                productNameEndsWith,
                productNameGt,
                productNameGte,
                productNameIn,
                productNameLt,
                productNameLte,
                productNameNot,
                productNameNotContains,
                productNameNotEndsWith,
                productNameNotIn,
                productNameNotStartsWith,
                productNameStartsWith,
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
                signDate,
                signDateGt,
                signDateGte,
                signDateIn,
                signDateLt,
                signDateLte,
                signDateNot,
                signDateNotIn,
                subscriptionExpireDate,
                subscriptionExpireDateGt,
                subscriptionExpireDateGte,
                subscriptionExpireDateIn,
                subscriptionExpireDateLt,
                subscriptionExpireDateLte,
                subscriptionExpireDateNot,
                subscriptionExpireDateNotIn,
                subscriptionStartDate,
                subscriptionStartDateGt,
                subscriptionStartDateGte,
                subscriptionStartDateIn,
                subscriptionStartDateLt,
                subscriptionStartDateLte,
                subscriptionStartDateNot,
                subscriptionStartDateNotIn,
                vendor,
                vendorContains,
                vendorEndsWith,
                vendorGt,
                vendorGte,
                vendorIn,
                vendorLt,
                vendorLte,
                vendorNot,
                vendorNotContains,
                vendorNotEndsWith,
                vendorNotIn,
                vendorNotStartsWith,
                vendorStartsWith,
                version,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotIn);
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
        sb.append("class EcpLicenseWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterLocalIdContains: ")
                .append(toIndentedString(clusterLocalIdContains))
                .append("\n");
        sb.append("    clusterLocalIdEndsWith: ")
                .append(toIndentedString(clusterLocalIdEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdGt: ").append(toIndentedString(clusterLocalIdGt)).append("\n");
        sb.append("    clusterLocalIdGte: ")
                .append(toIndentedString(clusterLocalIdGte))
                .append("\n");
        sb.append("    clusterLocalIdIn: ").append(toIndentedString(clusterLocalIdIn)).append("\n");
        sb.append("    clusterLocalIdLt: ").append(toIndentedString(clusterLocalIdLt)).append("\n");
        sb.append("    clusterLocalIdLte: ")
                .append(toIndentedString(clusterLocalIdLte))
                .append("\n");
        sb.append("    clusterLocalIdNot: ")
                .append(toIndentedString(clusterLocalIdNot))
                .append("\n");
        sb.append("    clusterLocalIdNotContains: ")
                .append(toIndentedString(clusterLocalIdNotContains))
                .append("\n");
        sb.append("    clusterLocalIdNotEndsWith: ")
                .append(toIndentedString(clusterLocalIdNotEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdNotIn: ")
                .append(toIndentedString(clusterLocalIdNotIn))
                .append("\n");
        sb.append("    clusterLocalIdNotStartsWith: ")
                .append(toIndentedString(clusterLocalIdNotStartsWith))
                .append("\n");
        sb.append("    clusterLocalIdStartsWith: ")
                .append(toIndentedString(clusterLocalIdStartsWith))
                .append("\n");
        sb.append("    ecpEdition: ").append(toIndentedString(ecpEdition)).append("\n");
        sb.append("    ecpEditionIn: ").append(toIndentedString(ecpEditionIn)).append("\n");
        sb.append("    ecpEditionNot: ").append(toIndentedString(ecpEditionNot)).append("\n");
        sb.append("    ecpEditionNotIn: ").append(toIndentedString(ecpEditionNotIn)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    expireDateGt: ").append(toIndentedString(expireDateGt)).append("\n");
        sb.append("    expireDateGte: ").append(toIndentedString(expireDateGte)).append("\n");
        sb.append("    expireDateIn: ").append(toIndentedString(expireDateIn)).append("\n");
        sb.append("    expireDateLt: ").append(toIndentedString(expireDateLt)).append("\n");
        sb.append("    expireDateLte: ").append(toIndentedString(expireDateLte)).append("\n");
        sb.append("    expireDateNot: ").append(toIndentedString(expireDateNot)).append("\n");
        sb.append("    expireDateNotIn: ").append(toIndentedString(expireDateNotIn)).append("\n");
        sb.append("    hasMetrox: ").append(toIndentedString(hasMetrox)).append("\n");
        sb.append("    hasMetroxNot: ").append(toIndentedString(hasMetroxNot)).append("\n");
        sb.append("    hasRemoteBackup: ").append(toIndentedString(hasRemoteBackup)).append("\n");
        sb.append("    hasRemoteBackupNot: ")
                .append(toIndentedString(hasRemoteBackupNot))
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
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    licenseTypeIn: ").append(toIndentedString(licenseTypeIn)).append("\n");
        sb.append("    licenseTypeNot: ").append(toIndentedString(licenseTypeNot)).append("\n");
        sb.append("    licenseTypeNotIn: ").append(toIndentedString(licenseTypeNotIn)).append("\n");
        sb.append("    maxCoreNum: ").append(toIndentedString(maxCoreNum)).append("\n");
        sb.append("    maxCoreNumGt: ").append(toIndentedString(maxCoreNumGt)).append("\n");
        sb.append("    maxCoreNumGte: ").append(toIndentedString(maxCoreNumGte)).append("\n");
        sb.append("    maxCoreNumIn: ").append(toIndentedString(maxCoreNumIn)).append("\n");
        sb.append("    maxCoreNumLt: ").append(toIndentedString(maxCoreNumLt)).append("\n");
        sb.append("    maxCoreNumLte: ").append(toIndentedString(maxCoreNumLte)).append("\n");
        sb.append("    maxCoreNumNot: ").append(toIndentedString(maxCoreNumNot)).append("\n");
        sb.append("    maxCoreNumNotIn: ").append(toIndentedString(maxCoreNumNotIn)).append("\n");
        sb.append("    maxPhysicalDataCapacity: ")
                .append(toIndentedString(maxPhysicalDataCapacity))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityGt: ")
                .append(toIndentedString(maxPhysicalDataCapacityGt))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityGte: ")
                .append(toIndentedString(maxPhysicalDataCapacityGte))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityIn: ")
                .append(toIndentedString(maxPhysicalDataCapacityIn))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityLt: ")
                .append(toIndentedString(maxPhysicalDataCapacityLt))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityLte: ")
                .append(toIndentedString(maxPhysicalDataCapacityLte))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityNot: ")
                .append(toIndentedString(maxPhysicalDataCapacityNot))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityNotIn: ")
                .append(toIndentedString(maxPhysicalDataCapacityNotIn))
                .append("\n");
        sb.append("    originalCode: ").append(toIndentedString(originalCode)).append("\n");
        sb.append("    originalCodeContains: ")
                .append(toIndentedString(originalCodeContains))
                .append("\n");
        sb.append("    originalCodeEndsWith: ")
                .append(toIndentedString(originalCodeEndsWith))
                .append("\n");
        sb.append("    originalCodeGt: ").append(toIndentedString(originalCodeGt)).append("\n");
        sb.append("    originalCodeGte: ").append(toIndentedString(originalCodeGte)).append("\n");
        sb.append("    originalCodeIn: ").append(toIndentedString(originalCodeIn)).append("\n");
        sb.append("    originalCodeLt: ").append(toIndentedString(originalCodeLt)).append("\n");
        sb.append("    originalCodeLte: ").append(toIndentedString(originalCodeLte)).append("\n");
        sb.append("    originalCodeNot: ").append(toIndentedString(originalCodeNot)).append("\n");
        sb.append("    originalCodeNotContains: ")
                .append(toIndentedString(originalCodeNotContains))
                .append("\n");
        sb.append("    originalCodeNotEndsWith: ")
                .append(toIndentedString(originalCodeNotEndsWith))
                .append("\n");
        sb.append("    originalCodeNotIn: ")
                .append(toIndentedString(originalCodeNotIn))
                .append("\n");
        sb.append("    originalCodeNotStartsWith: ")
                .append(toIndentedString(originalCodeNotStartsWith))
                .append("\n");
        sb.append("    originalCodeStartsWith: ")
                .append(toIndentedString(originalCodeStartsWith))
                .append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productNameContains: ")
                .append(toIndentedString(productNameContains))
                .append("\n");
        sb.append("    productNameEndsWith: ")
                .append(toIndentedString(productNameEndsWith))
                .append("\n");
        sb.append("    productNameGt: ").append(toIndentedString(productNameGt)).append("\n");
        sb.append("    productNameGte: ").append(toIndentedString(productNameGte)).append("\n");
        sb.append("    productNameIn: ").append(toIndentedString(productNameIn)).append("\n");
        sb.append("    productNameLt: ").append(toIndentedString(productNameLt)).append("\n");
        sb.append("    productNameLte: ").append(toIndentedString(productNameLte)).append("\n");
        sb.append("    productNameNot: ").append(toIndentedString(productNameNot)).append("\n");
        sb.append("    productNameNotContains: ")
                .append(toIndentedString(productNameNotContains))
                .append("\n");
        sb.append("    productNameNotEndsWith: ")
                .append(toIndentedString(productNameNotEndsWith))
                .append("\n");
        sb.append("    productNameNotIn: ").append(toIndentedString(productNameNotIn)).append("\n");
        sb.append("    productNameNotStartsWith: ")
                .append(toIndentedString(productNameNotStartsWith))
                .append("\n");
        sb.append("    productNameStartsWith: ")
                .append(toIndentedString(productNameStartsWith))
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
        sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
        sb.append("    signDateGt: ").append(toIndentedString(signDateGt)).append("\n");
        sb.append("    signDateGte: ").append(toIndentedString(signDateGte)).append("\n");
        sb.append("    signDateIn: ").append(toIndentedString(signDateIn)).append("\n");
        sb.append("    signDateLt: ").append(toIndentedString(signDateLt)).append("\n");
        sb.append("    signDateLte: ").append(toIndentedString(signDateLte)).append("\n");
        sb.append("    signDateNot: ").append(toIndentedString(signDateNot)).append("\n");
        sb.append("    signDateNotIn: ").append(toIndentedString(signDateNotIn)).append("\n");
        sb.append("    subscriptionExpireDate: ")
                .append(toIndentedString(subscriptionExpireDate))
                .append("\n");
        sb.append("    subscriptionExpireDateGt: ")
                .append(toIndentedString(subscriptionExpireDateGt))
                .append("\n");
        sb.append("    subscriptionExpireDateGte: ")
                .append(toIndentedString(subscriptionExpireDateGte))
                .append("\n");
        sb.append("    subscriptionExpireDateIn: ")
                .append(toIndentedString(subscriptionExpireDateIn))
                .append("\n");
        sb.append("    subscriptionExpireDateLt: ")
                .append(toIndentedString(subscriptionExpireDateLt))
                .append("\n");
        sb.append("    subscriptionExpireDateLte: ")
                .append(toIndentedString(subscriptionExpireDateLte))
                .append("\n");
        sb.append("    subscriptionExpireDateNot: ")
                .append(toIndentedString(subscriptionExpireDateNot))
                .append("\n");
        sb.append("    subscriptionExpireDateNotIn: ")
                .append(toIndentedString(subscriptionExpireDateNotIn))
                .append("\n");
        sb.append("    subscriptionStartDate: ")
                .append(toIndentedString(subscriptionStartDate))
                .append("\n");
        sb.append("    subscriptionStartDateGt: ")
                .append(toIndentedString(subscriptionStartDateGt))
                .append("\n");
        sb.append("    subscriptionStartDateGte: ")
                .append(toIndentedString(subscriptionStartDateGte))
                .append("\n");
        sb.append("    subscriptionStartDateIn: ")
                .append(toIndentedString(subscriptionStartDateIn))
                .append("\n");
        sb.append("    subscriptionStartDateLt: ")
                .append(toIndentedString(subscriptionStartDateLt))
                .append("\n");
        sb.append("    subscriptionStartDateLte: ")
                .append(toIndentedString(subscriptionStartDateLte))
                .append("\n");
        sb.append("    subscriptionStartDateNot: ")
                .append(toIndentedString(subscriptionStartDateNot))
                .append("\n");
        sb.append("    subscriptionStartDateNotIn: ")
                .append(toIndentedString(subscriptionStartDateNotIn))
                .append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    vendorContains: ").append(toIndentedString(vendorContains)).append("\n");
        sb.append("    vendorEndsWith: ").append(toIndentedString(vendorEndsWith)).append("\n");
        sb.append("    vendorGt: ").append(toIndentedString(vendorGt)).append("\n");
        sb.append("    vendorGte: ").append(toIndentedString(vendorGte)).append("\n");
        sb.append("    vendorIn: ").append(toIndentedString(vendorIn)).append("\n");
        sb.append("    vendorLt: ").append(toIndentedString(vendorLt)).append("\n");
        sb.append("    vendorLte: ").append(toIndentedString(vendorLte)).append("\n");
        sb.append("    vendorNot: ").append(toIndentedString(vendorNot)).append("\n");
        sb.append("    vendorNotContains: ")
                .append(toIndentedString(vendorNotContains))
                .append("\n");
        sb.append("    vendorNotEndsWith: ")
                .append(toIndentedString(vendorNotEndsWith))
                .append("\n");
        sb.append("    vendorNotIn: ").append(toIndentedString(vendorNotIn)).append("\n");
        sb.append("    vendorNotStartsWith: ")
                .append(toIndentedString(vendorNotStartsWith))
                .append("\n");
        sb.append("    vendorStartsWith: ").append(toIndentedString(vendorStartsWith)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
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

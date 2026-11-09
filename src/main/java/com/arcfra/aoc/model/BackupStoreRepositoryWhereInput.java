package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupStoreRepositoryWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupStoreRepositoryWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BackupStoreRepositoryWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BackupStoreRepositoryWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BackupStoreRepositoryWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BACKUP_PLANS_EVERY = "backup_plans_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_EVERY)
    private BackupPlanWhereInput backupPlansEvery;

    public static final String SERIALIZED_NAME_BACKUP_PLANS_NONE = "backup_plans_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_NONE)
    private BackupPlanWhereInput backupPlansNone;

    public static final String SERIALIZED_NAME_BACKUP_PLANS_SOME = "backup_plans_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_SOME)
    private BackupPlanWhereInput backupPlansSome;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY =
            "backup_restore_points_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY)
    private BackupRestorePointWhereInput backupRestorePointsEvery;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE =
            "backup_restore_points_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE)
    private BackupRestorePointWhereInput backupRestorePointsNone;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME =
            "backup_restore_points_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME)
    private BackupRestorePointWhereInput backupRestorePointsSome;

    public static final String SERIALIZED_NAME_BACKUP_SERVICE = "backup_service";

    @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE)
    private BackupServiceWhereInput backupService;

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

    public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE)
    private String errorCode;

    public static final String SERIALIZED_NAME_ERROR_CODE_CONTAINS = "error_code_contains";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_CONTAINS)
    private String errorCodeContains;

    public static final String SERIALIZED_NAME_ERROR_CODE_ENDS_WITH = "error_code_ends_with";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH)
    private String errorCodeEndsWith;

    public static final String SERIALIZED_NAME_ERROR_CODE_GT = "error_code_gt";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_GT)
    private String errorCodeGt;

    public static final String SERIALIZED_NAME_ERROR_CODE_GTE = "error_code_gte";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_GTE)
    private String errorCodeGte;

    public static final String SERIALIZED_NAME_ERROR_CODE_IN = "error_code_in";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_IN)
    private List<String> errorCodeIn = null;

    public static final String SERIALIZED_NAME_ERROR_CODE_LT = "error_code_lt";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_LT)
    private String errorCodeLt;

    public static final String SERIALIZED_NAME_ERROR_CODE_LTE = "error_code_lte";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_LTE)
    private String errorCodeLte;

    public static final String SERIALIZED_NAME_ERROR_CODE_NOT = "error_code_not";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT)
    private String errorCodeNot;

    public static final String SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS = "error_code_not_contains";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS)
    private String errorCodeNotContains;

    public static final String SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH =
            "error_code_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH)
    private String errorCodeNotEndsWith;

    public static final String SERIALIZED_NAME_ERROR_CODE_NOT_IN = "error_code_not_in";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_IN)
    private List<String> errorCodeNotIn = null;

    public static final String SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH =
            "error_code_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH)
    private String errorCodeNotStartsWith;

    public static final String SERIALIZED_NAME_ERROR_CODE_STARTS_WITH = "error_code_starts_with";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH)
    private String errorCodeStartsWith;

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

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME = "iscsi_chap_name";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME)
    private String iscsiChapName;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS =
            "iscsi_chap_name_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS)
    private String iscsiChapNameContains;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH =
            "iscsi_chap_name_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH)
    private String iscsiChapNameEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_GT = "iscsi_chap_name_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT)
    private String iscsiChapNameGt;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE = "iscsi_chap_name_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE)
    private String iscsiChapNameGte;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_IN = "iscsi_chap_name_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN)
    private List<String> iscsiChapNameIn = null;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_LT = "iscsi_chap_name_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT)
    private String iscsiChapNameLt;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE = "iscsi_chap_name_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE)
    private String iscsiChapNameLte;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT = "iscsi_chap_name_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT)
    private String iscsiChapNameNot;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS =
            "iscsi_chap_name_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS)
    private String iscsiChapNameNotContains;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH =
            "iscsi_chap_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH)
    private String iscsiChapNameNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN = "iscsi_chap_name_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN)
    private List<String> iscsiChapNameNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH =
            "iscsi_chap_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH)
    private String iscsiChapNameNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH =
            "iscsi_chap_name_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH)
    private String iscsiChapNameStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET = "iscsi_chap_secret";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET)
    private String iscsiChapSecret;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS =
            "iscsi_chap_secret_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS)
    private String iscsiChapSecretContains;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH =
            "iscsi_chap_secret_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH)
    private String iscsiChapSecretEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT = "iscsi_chap_secret_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT)
    private String iscsiChapSecretGt;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE = "iscsi_chap_secret_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE)
    private String iscsiChapSecretGte;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN = "iscsi_chap_secret_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN)
    private List<String> iscsiChapSecretIn = null;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT = "iscsi_chap_secret_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT)
    private String iscsiChapSecretLt;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE = "iscsi_chap_secret_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE)
    private String iscsiChapSecretLte;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT = "iscsi_chap_secret_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT)
    private String iscsiChapSecretNot;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS =
            "iscsi_chap_secret_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS)
    private String iscsiChapSecretNotContains;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH =
            "iscsi_chap_secret_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH)
    private String iscsiChapSecretNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN =
            "iscsi_chap_secret_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN)
    private List<String> iscsiChapSecretNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH =
            "iscsi_chap_secret_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH)
    private String iscsiChapSecretNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH =
            "iscsi_chap_secret_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH)
    private String iscsiChapSecretStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_IP = "iscsi_ip";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP)
    private String iscsiIp;

    public static final String SERIALIZED_NAME_ISCSI_IP_CONTAINS = "iscsi_ip_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_CONTAINS)
    private String iscsiIpContains;

    public static final String SERIALIZED_NAME_ISCSI_IP_ENDS_WITH = "iscsi_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH)
    private String iscsiIpEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_IP_GT = "iscsi_ip_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_GT)
    private String iscsiIpGt;

    public static final String SERIALIZED_NAME_ISCSI_IP_GTE = "iscsi_ip_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_GTE)
    private String iscsiIpGte;

    public static final String SERIALIZED_NAME_ISCSI_IP_IN = "iscsi_ip_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_IN)
    private List<String> iscsiIpIn = null;

    public static final String SERIALIZED_NAME_ISCSI_IP_LT = "iscsi_ip_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_LT)
    private String iscsiIpLt;

    public static final String SERIALIZED_NAME_ISCSI_IP_LTE = "iscsi_ip_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_LTE)
    private String iscsiIpLte;

    public static final String SERIALIZED_NAME_ISCSI_IP_NOT = "iscsi_ip_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT)
    private String iscsiIpNot;

    public static final String SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS = "iscsi_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS)
    private String iscsiIpNotContains;

    public static final String SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH = "iscsi_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH)
    private String iscsiIpNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_IP_NOT_IN = "iscsi_ip_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_IN)
    private List<String> iscsiIpNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH =
            "iscsi_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH)
    private String iscsiIpNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_IP_STARTS_WITH = "iscsi_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH)
    private String iscsiIpStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID = "iscsi_lun_id";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID)
    private String iscsiLunId;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS = "iscsi_lun_id_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS)
    private String iscsiLunIdContains;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH = "iscsi_lun_id_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH)
    private String iscsiLunIdEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_GT = "iscsi_lun_id_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_GT)
    private String iscsiLunIdGt;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_GTE = "iscsi_lun_id_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_GTE)
    private String iscsiLunIdGte;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_IN = "iscsi_lun_id_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_IN)
    private List<String> iscsiLunIdIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_LT = "iscsi_lun_id_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_LT)
    private String iscsiLunIdLt;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_LTE = "iscsi_lun_id_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_LTE)
    private String iscsiLunIdLte;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT = "iscsi_lun_id_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT)
    private String iscsiLunIdNot;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS =
            "iscsi_lun_id_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS)
    private String iscsiLunIdNotContains;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH =
            "iscsi_lun_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH)
    private String iscsiLunIdNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN = "iscsi_lun_id_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN)
    private List<String> iscsiLunIdNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH =
            "iscsi_lun_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH)
    private String iscsiLunIdNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH =
            "iscsi_lun_id_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH)
    private String iscsiLunIdStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_PORT = "iscsi_port";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT)
    private Integer iscsiPort;

    public static final String SERIALIZED_NAME_ISCSI_PORT_GT = "iscsi_port_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_GT)
    private Integer iscsiPortGt;

    public static final String SERIALIZED_NAME_ISCSI_PORT_GTE = "iscsi_port_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_GTE)
    private Integer iscsiPortGte;

    public static final String SERIALIZED_NAME_ISCSI_PORT_IN = "iscsi_port_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_IN)
    private List<Integer> iscsiPortIn = null;

    public static final String SERIALIZED_NAME_ISCSI_PORT_LT = "iscsi_port_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_LT)
    private Integer iscsiPortLt;

    public static final String SERIALIZED_NAME_ISCSI_PORT_LTE = "iscsi_port_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_LTE)
    private Integer iscsiPortLte;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT = "iscsi_port_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT)
    private Integer iscsiPortNot;

    public static final String SERIALIZED_NAME_ISCSI_PORT_NOT_IN = "iscsi_port_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT_IN)
    private List<Integer> iscsiPortNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN = "iscsi_target_iqn";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN)
    private String iscsiTargetIqn;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS =
            "iscsi_target_iqn_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS)
    private String iscsiTargetIqnContains;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH =
            "iscsi_target_iqn_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH)
    private String iscsiTargetIqnEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_GT = "iscsi_target_iqn_gt";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT)
    private String iscsiTargetIqnGt;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE = "iscsi_target_iqn_gte";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE)
    private String iscsiTargetIqnGte;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_IN = "iscsi_target_iqn_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN)
    private List<String> iscsiTargetIqnIn = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_LT = "iscsi_target_iqn_lt";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT)
    private String iscsiTargetIqnLt;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE = "iscsi_target_iqn_lte";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE)
    private String iscsiTargetIqnLte;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT = "iscsi_target_iqn_not";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT)
    private String iscsiTargetIqnNot;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS =
            "iscsi_target_iqn_not_contains";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS)
    private String iscsiTargetIqnNotContains;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH =
            "iscsi_target_iqn_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH)
    private String iscsiTargetIqnNotEndsWith;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN = "iscsi_target_iqn_not_in";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN)
    private List<String> iscsiTargetIqnNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH =
            "iscsi_target_iqn_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH)
    private String iscsiTargetIqnNotStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH =
            "iscsi_target_iqn_starts_with";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH)
    private String iscsiTargetIqnStartsWith;

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

    public static final String SERIALIZED_NAME_NFS_PATH = "nfs_path";

    @SerializedName(SERIALIZED_NAME_NFS_PATH)
    private String nfsPath;

    public static final String SERIALIZED_NAME_NFS_PATH_CONTAINS = "nfs_path_contains";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_CONTAINS)
    private String nfsPathContains;

    public static final String SERIALIZED_NAME_NFS_PATH_ENDS_WITH = "nfs_path_ends_with";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_ENDS_WITH)
    private String nfsPathEndsWith;

    public static final String SERIALIZED_NAME_NFS_PATH_GT = "nfs_path_gt";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_GT)
    private String nfsPathGt;

    public static final String SERIALIZED_NAME_NFS_PATH_GTE = "nfs_path_gte";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_GTE)
    private String nfsPathGte;

    public static final String SERIALIZED_NAME_NFS_PATH_IN = "nfs_path_in";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_IN)
    private List<String> nfsPathIn = null;

    public static final String SERIALIZED_NAME_NFS_PATH_LT = "nfs_path_lt";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_LT)
    private String nfsPathLt;

    public static final String SERIALIZED_NAME_NFS_PATH_LTE = "nfs_path_lte";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_LTE)
    private String nfsPathLte;

    public static final String SERIALIZED_NAME_NFS_PATH_NOT = "nfs_path_not";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT)
    private String nfsPathNot;

    public static final String SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS = "nfs_path_not_contains";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS)
    private String nfsPathNotContains;

    public static final String SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH = "nfs_path_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH)
    private String nfsPathNotEndsWith;

    public static final String SERIALIZED_NAME_NFS_PATH_NOT_IN = "nfs_path_not_in";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_IN)
    private List<String> nfsPathNotIn = null;

    public static final String SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH =
            "nfs_path_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH)
    private String nfsPathNotStartsWith;

    public static final String SERIALIZED_NAME_NFS_PATH_STARTS_WITH = "nfs_path_starts_with";

    @SerializedName(SERIALIZED_NAME_NFS_PATH_STARTS_WITH)
    private String nfsPathStartsWith;

    public static final String SERIALIZED_NAME_NFS_SERVER = "nfs_server";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER)
    private String nfsServer;

    public static final String SERIALIZED_NAME_NFS_SERVER_CONTAINS = "nfs_server_contains";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_CONTAINS)
    private String nfsServerContains;

    public static final String SERIALIZED_NAME_NFS_SERVER_ENDS_WITH = "nfs_server_ends_with";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH)
    private String nfsServerEndsWith;

    public static final String SERIALIZED_NAME_NFS_SERVER_GT = "nfs_server_gt";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_GT)
    private String nfsServerGt;

    public static final String SERIALIZED_NAME_NFS_SERVER_GTE = "nfs_server_gte";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_GTE)
    private String nfsServerGte;

    public static final String SERIALIZED_NAME_NFS_SERVER_IN = "nfs_server_in";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_IN)
    private List<String> nfsServerIn = null;

    public static final String SERIALIZED_NAME_NFS_SERVER_LT = "nfs_server_lt";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_LT)
    private String nfsServerLt;

    public static final String SERIALIZED_NAME_NFS_SERVER_LTE = "nfs_server_lte";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_LTE)
    private String nfsServerLte;

    public static final String SERIALIZED_NAME_NFS_SERVER_NOT = "nfs_server_not";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT)
    private String nfsServerNot;

    public static final String SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS = "nfs_server_not_contains";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS)
    private String nfsServerNotContains;

    public static final String SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH =
            "nfs_server_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH)
    private String nfsServerNotEndsWith;

    public static final String SERIALIZED_NAME_NFS_SERVER_NOT_IN = "nfs_server_not_in";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_IN)
    private List<String> nfsServerNotIn = null;

    public static final String SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH =
            "nfs_server_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH)
    private String nfsServerNotStartsWith;

    public static final String SERIALIZED_NAME_NFS_SERVER_STARTS_WITH = "nfs_server_starts_with";

    @SerializedName(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH)
    private String nfsServerStartsWith;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupStoreStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<BackupStoreStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private BackupStoreStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<BackupStoreStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY = "total_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY)
    private Long totalCapacity;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_GT = "total_capacity_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_GT)
    private Long totalCapacityGt;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_GTE = "total_capacity_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_GTE)
    private Long totalCapacityGte;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_IN = "total_capacity_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_IN)
    private List<Long> totalCapacityIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_LT = "total_capacity_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_LT)
    private Long totalCapacityLt;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_LTE = "total_capacity_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_LTE)
    private Long totalCapacityLte;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_NOT = "total_capacity_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_NOT)
    private Long totalCapacityNot;

    public static final String SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN = "total_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN)
    private List<Long> totalCapacityNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private BackupStoreType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<BackupStoreType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private BackupStoreType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<BackupStoreType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP = "update_timestamp";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP)
    private String updateTimestamp;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS =
            "update_timestamp_contains";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS)
    private String updateTimestampContains;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH =
            "update_timestamp_ends_with";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH)
    private String updateTimestampEndsWith;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_GT = "update_timestamp_gt";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT)
    private String updateTimestampGt;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE = "update_timestamp_gte";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE)
    private String updateTimestampGte;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_IN = "update_timestamp_in";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN)
    private List<String> updateTimestampIn = null;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_LT = "update_timestamp_lt";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT)
    private String updateTimestampLt;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE = "update_timestamp_lte";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE)
    private String updateTimestampLte;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT = "update_timestamp_not";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT)
    private String updateTimestampNot;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS =
            "update_timestamp_not_contains";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS)
    private String updateTimestampNotContains;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH =
            "update_timestamp_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH)
    private String updateTimestampNotEndsWith;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN = "update_timestamp_not_in";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN)
    private List<String> updateTimestampNotIn = null;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH =
            "update_timestamp_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH)
    private String updateTimestampNotStartsWith;

    public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH =
            "update_timestamp_starts_with";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH)
    private String updateTimestampStartsWith;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_GT = "used_data_space_gt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GT)
    private Long usedDataSpaceGt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_GTE = "used_data_space_gte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GTE)
    private Long usedDataSpaceGte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_IN = "used_data_space_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_IN)
    private List<Long> usedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_LT = "used_data_space_lt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LT)
    private Long usedDataSpaceLt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_LTE = "used_data_space_lte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LTE)
    private Long usedDataSpaceLte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT = "used_data_space_not";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT)
    private Long usedDataSpaceNot;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN = "used_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN)
    private List<Long> usedDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE = "used_data_space_usage";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE)
    private Double usedDataSpaceUsage;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT =
            "used_data_space_usage_gt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT)
    private Double usedDataSpaceUsageGt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE =
            "used_data_space_usage_gte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE)
    private Double usedDataSpaceUsageGte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN =
            "used_data_space_usage_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN)
    private List<Double> usedDataSpaceUsageIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT =
            "used_data_space_usage_lt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT)
    private Double usedDataSpaceUsageLt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE =
            "used_data_space_usage_lte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE)
    private Double usedDataSpaceUsageLte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT =
            "used_data_space_usage_not";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT)
    private Double usedDataSpaceUsageNot;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN =
            "used_data_space_usage_not_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN)
    private List<Double> usedDataSpaceUsageNotIn = null;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
    private Long validDataSpace;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GT = "valid_data_space_gt";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GT)
    private Long validDataSpaceGt;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GTE = "valid_data_space_gte";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GTE)
    private Long validDataSpaceGte;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_IN = "valid_data_space_in";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_IN)
    private List<Long> validDataSpaceIn = null;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LT = "valid_data_space_lt";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LT)
    private Long validDataSpaceLt;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LTE = "valid_data_space_lte";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LTE)
    private Long validDataSpaceLte;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT = "valid_data_space_not";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT)
    private Long validDataSpaceNot;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN = "valid_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN)
    private List<Long> validDataSpaceNotIn = null;

    public BackupStoreRepositoryWhereInput() {}

    public BackupStoreRepositoryWhereInput AND(List<BackupStoreRepositoryWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BackupStoreRepositoryWhereInput addANDItem(BackupStoreRepositoryWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BackupStoreRepositoryWhereInput>();
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
    public List<BackupStoreRepositoryWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BackupStoreRepositoryWhereInput> AND) {
        this.AND = AND;
    }

    public BackupStoreRepositoryWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BackupStoreRepositoryWhereInput AND_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput NOT(List<BackupStoreRepositoryWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNOTItem(BackupStoreRepositoryWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BackupStoreRepositoryWhereInput>();
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
    public List<BackupStoreRepositoryWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BackupStoreRepositoryWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BackupStoreRepositoryWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BackupStoreRepositoryWhereInput NOT_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput OR(List<BackupStoreRepositoryWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BackupStoreRepositoryWhereInput addORItem(BackupStoreRepositoryWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BackupStoreRepositoryWhereInput>();
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
    public List<BackupStoreRepositoryWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BackupStoreRepositoryWhereInput> OR) {
        this.OR = OR;
    }

    public BackupStoreRepositoryWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BackupStoreRepositoryWhereInput OR_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput backupPlansEvery(BackupPlanWhereInput backupPlansEvery) {

        this.backupPlansEvery = backupPlansEvery;
        return this;
    }

    /**
     * Get backupPlansEvery
     *
     * @return backupPlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlansEvery() {
        return backupPlansEvery;
    }

    public void setBackupPlansEvery(BackupPlanWhereInput backupPlansEvery) {
        this.backupPlansEvery = backupPlansEvery;
    }

    public BackupStoreRepositoryWhereInput backupPlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupPlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        return this;
    }

    public void setBackupPlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
        }
    }

    public boolean getBackupPlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS_EVERY);
    }

    public BackupStoreRepositoryWhereInput backupPlansNone(BackupPlanWhereInput backupPlansNone) {

        this.backupPlansNone = backupPlansNone;
        return this;
    }

    /**
     * Get backupPlansNone
     *
     * @return backupPlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlansNone() {
        return backupPlansNone;
    }

    public void setBackupPlansNone(BackupPlanWhereInput backupPlansNone) {
        this.backupPlansNone = backupPlansNone;
    }

    public BackupStoreRepositoryWhereInput backupPlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupPlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        return this;
    }

    public void setBackupPlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_NONE);
        }
    }

    public boolean getBackupPlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS_NONE);
    }

    public BackupStoreRepositoryWhereInput backupPlansSome(BackupPlanWhereInput backupPlansSome) {

        this.backupPlansSome = backupPlansSome;
        return this;
    }

    /**
     * Get backupPlansSome
     *
     * @return backupPlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlansSome() {
        return backupPlansSome;
    }

    public void setBackupPlansSome(BackupPlanWhereInput backupPlansSome) {
        this.backupPlansSome = backupPlansSome;
    }

    public BackupStoreRepositoryWhereInput backupPlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupPlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        return this;
    }

    public void setBackupPlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLANS_SOME);
        }
    }

    public boolean getBackupPlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLANS_SOME);
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsEvery(
            BackupRestorePointWhereInput backupRestorePointsEvery) {

        this.backupRestorePointsEvery = backupRestorePointsEvery;
        return this;
    }

    /**
     * Get backupRestorePointsEvery
     *
     * @return backupRestorePointsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePointsEvery() {
        return backupRestorePointsEvery;
    }

    public void setBackupRestorePointsEvery(BackupRestorePointWhereInput backupRestorePointsEvery) {
        this.backupRestorePointsEvery = backupRestorePointsEvery;
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        return this;
    }

    public void setBackupRestorePointsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        }
    }

    public boolean getBackupRestorePointsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsNone(
            BackupRestorePointWhereInput backupRestorePointsNone) {

        this.backupRestorePointsNone = backupRestorePointsNone;
        return this;
    }

    /**
     * Get backupRestorePointsNone
     *
     * @return backupRestorePointsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePointsNone() {
        return backupRestorePointsNone;
    }

    public void setBackupRestorePointsNone(BackupRestorePointWhereInput backupRestorePointsNone) {
        this.backupRestorePointsNone = backupRestorePointsNone;
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        return this;
    }

    public void setBackupRestorePointsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        }
    }

    public boolean getBackupRestorePointsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsSome(
            BackupRestorePointWhereInput backupRestorePointsSome) {

        this.backupRestorePointsSome = backupRestorePointsSome;
        return this;
    }

    /**
     * Get backupRestorePointsSome
     *
     * @return backupRestorePointsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePointsSome() {
        return backupRestorePointsSome;
    }

    public void setBackupRestorePointsSome(BackupRestorePointWhereInput backupRestorePointsSome) {
        this.backupRestorePointsSome = backupRestorePointsSome;
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupRestorePointsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        return this;
    }

    public void setBackupRestorePointsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        }
    }

    public boolean getBackupRestorePointsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
    }

    public BackupStoreRepositoryWhereInput backupService(BackupServiceWhereInput backupService) {

        this.backupService = backupService;
        return this;
    }

    /**
     * Get backupService
     *
     * @return backupService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceWhereInput getBackupService() {
        return backupService;
    }

    public void setBackupService(BackupServiceWhereInput backupService) {
        this.backupService = backupService;
    }

    public BackupStoreRepositoryWhereInput backupService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public BackupStoreRepositoryWhereInput backupService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public void setBackupService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE);
        }
    }

    public boolean getBackupService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_SERVICE);
    }

    public BackupStoreRepositoryWhereInput createdAt(String createdAt) {

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

    public BackupStoreRepositoryWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtGt(String createdAtGt) {

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

    public BackupStoreRepositoryWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtGt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtGte(String createdAtGte) {

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

    public BackupStoreRepositoryWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtGte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public BackupStoreRepositoryWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtLt(String createdAtLt) {

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

    public BackupStoreRepositoryWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtLt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtLte(String createdAtLte) {

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

    public BackupStoreRepositoryWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtLte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtNot(String createdAtNot) {

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

    public BackupStoreRepositoryWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtNot_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public BackupStoreRepositoryWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput description(String description) {

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

    public BackupStoreRepositoryWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupStoreRepositoryWhereInput description_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionContains(String descriptionContains) {

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

    public BackupStoreRepositoryWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionContains_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public BackupStoreRepositoryWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionGt(String descriptionGt) {

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

    public BackupStoreRepositoryWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionGt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionGte(String descriptionGte) {

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

    public BackupStoreRepositoryWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionGte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public BackupStoreRepositoryWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionLt(String descriptionLt) {

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

    public BackupStoreRepositoryWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionLt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionLte(String descriptionLte) {

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

    public BackupStoreRepositoryWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionLte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionNot(String descriptionNot) {

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

    public BackupStoreRepositoryWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionNot_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public BackupStoreRepositoryWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public BackupStoreRepositoryWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public BackupStoreRepositoryWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionNotStartsWith(
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

    public BackupStoreRepositoryWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public BackupStoreRepositoryWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupStoreRepositoryWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupStoreRepositoryWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addEntityAsyncStatusInItem(
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

    public BackupStoreRepositoryWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput entityAsyncStatusNot(
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

    public BackupStoreRepositoryWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addEntityAsyncStatusNotInItem(
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

    public BackupStoreRepositoryWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput errorCode(String errorCode) {

        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     *
     * @return errorCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BackupStoreRepositoryWhereInput errorCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public void setErrorCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        }
    }

    public boolean getErrorCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE);
    }

    public BackupStoreRepositoryWhereInput errorCodeContains(String errorCodeContains) {

        this.errorCodeContains = errorCodeContains;
        return this;
    }

    /**
     * Get errorCodeContains
     *
     * @return errorCodeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeContains() {
        return errorCodeContains;
    }

    public void setErrorCodeContains(String errorCodeContains) {
        this.errorCodeContains = errorCodeContains;
    }

    public BackupStoreRepositoryWhereInput errorCodeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_CONTAINS);
        return this;
    }

    public void setErrorCodeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_CONTAINS);
        }
    }

    public boolean getErrorCodeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput errorCodeEndsWith(String errorCodeEndsWith) {

        this.errorCodeEndsWith = errorCodeEndsWith;
        return this;
    }

    /**
     * Get errorCodeEndsWith
     *
     * @return errorCodeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeEndsWith() {
        return errorCodeEndsWith;
    }

    public void setErrorCodeEndsWith(String errorCodeEndsWith) {
        this.errorCodeEndsWith = errorCodeEndsWith;
    }

    public BackupStoreRepositoryWhereInput errorCodeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH);
        return this;
    }

    public void setErrorCodeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH);
        }
    }

    public boolean getErrorCodeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput errorCodeGt(String errorCodeGt) {

        this.errorCodeGt = errorCodeGt;
        return this;
    }

    /**
     * Get errorCodeGt
     *
     * @return errorCodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeGt() {
        return errorCodeGt;
    }

    public void setErrorCodeGt(String errorCodeGt) {
        this.errorCodeGt = errorCodeGt;
    }

    public BackupStoreRepositoryWhereInput errorCodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_GT);
        return this;
    }

    public void setErrorCodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_GT);
        }
    }

    public boolean getErrorCodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_GT);
    }

    public BackupStoreRepositoryWhereInput errorCodeGte(String errorCodeGte) {

        this.errorCodeGte = errorCodeGte;
        return this;
    }

    /**
     * Get errorCodeGte
     *
     * @return errorCodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeGte() {
        return errorCodeGte;
    }

    public void setErrorCodeGte(String errorCodeGte) {
        this.errorCodeGte = errorCodeGte;
    }

    public BackupStoreRepositoryWhereInput errorCodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_GTE);
        return this;
    }

    public void setErrorCodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_GTE);
        }
    }

    public boolean getErrorCodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_GTE);
    }

    public BackupStoreRepositoryWhereInput errorCodeIn(List<String> errorCodeIn) {

        this.errorCodeIn = errorCodeIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addErrorCodeInItem(String errorCodeInItem) {
        if (this.errorCodeIn == null) {
            this.errorCodeIn = new ArrayList<String>();
        }
        this.errorCodeIn.add(errorCodeInItem);
        return this;
    }

    /**
     * Get errorCodeIn
     *
     * @return errorCodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getErrorCodeIn() {
        return errorCodeIn;
    }

    public void setErrorCodeIn(List<String> errorCodeIn) {
        this.errorCodeIn = errorCodeIn;
    }

    public BackupStoreRepositoryWhereInput errorCodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_IN);
        return this;
    }

    public void setErrorCodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_IN);
        }
    }

    public boolean getErrorCodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_IN);
    }

    public BackupStoreRepositoryWhereInput errorCodeLt(String errorCodeLt) {

        this.errorCodeLt = errorCodeLt;
        return this;
    }

    /**
     * Get errorCodeLt
     *
     * @return errorCodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeLt() {
        return errorCodeLt;
    }

    public void setErrorCodeLt(String errorCodeLt) {
        this.errorCodeLt = errorCodeLt;
    }

    public BackupStoreRepositoryWhereInput errorCodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_LT);
        return this;
    }

    public void setErrorCodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_LT);
        }
    }

    public boolean getErrorCodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_LT);
    }

    public BackupStoreRepositoryWhereInput errorCodeLte(String errorCodeLte) {

        this.errorCodeLte = errorCodeLte;
        return this;
    }

    /**
     * Get errorCodeLte
     *
     * @return errorCodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeLte() {
        return errorCodeLte;
    }

    public void setErrorCodeLte(String errorCodeLte) {
        this.errorCodeLte = errorCodeLte;
    }

    public BackupStoreRepositoryWhereInput errorCodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_LTE);
        return this;
    }

    public void setErrorCodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_LTE);
        }
    }

    public boolean getErrorCodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_LTE);
    }

    public BackupStoreRepositoryWhereInput errorCodeNot(String errorCodeNot) {

        this.errorCodeNot = errorCodeNot;
        return this;
    }

    /**
     * Get errorCodeNot
     *
     * @return errorCodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeNot() {
        return errorCodeNot;
    }

    public void setErrorCodeNot(String errorCodeNot) {
        this.errorCodeNot = errorCodeNot;
    }

    public BackupStoreRepositoryWhereInput errorCodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT);
        return this;
    }

    public void setErrorCodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT);
        }
    }

    public boolean getErrorCodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_NOT);
    }

    public BackupStoreRepositoryWhereInput errorCodeNotContains(String errorCodeNotContains) {

        this.errorCodeNotContains = errorCodeNotContains;
        return this;
    }

    /**
     * Get errorCodeNotContains
     *
     * @return errorCodeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeNotContains() {
        return errorCodeNotContains;
    }

    public void setErrorCodeNotContains(String errorCodeNotContains) {
        this.errorCodeNotContains = errorCodeNotContains;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS);
        return this;
    }

    public void setErrorCodeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS);
        }
    }

    public boolean getErrorCodeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput errorCodeNotEndsWith(String errorCodeNotEndsWith) {

        this.errorCodeNotEndsWith = errorCodeNotEndsWith;
        return this;
    }

    /**
     * Get errorCodeNotEndsWith
     *
     * @return errorCodeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeNotEndsWith() {
        return errorCodeNotEndsWith;
    }

    public void setErrorCodeNotEndsWith(String errorCodeNotEndsWith) {
        this.errorCodeNotEndsWith = errorCodeNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH);
        return this;
    }

    public void setErrorCodeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH);
        }
    }

    public boolean getErrorCodeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput errorCodeNotIn(List<String> errorCodeNotIn) {

        this.errorCodeNotIn = errorCodeNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addErrorCodeNotInItem(String errorCodeNotInItem) {
        if (this.errorCodeNotIn == null) {
            this.errorCodeNotIn = new ArrayList<String>();
        }
        this.errorCodeNotIn.add(errorCodeNotInItem);
        return this;
    }

    /**
     * Get errorCodeNotIn
     *
     * @return errorCodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getErrorCodeNotIn() {
        return errorCodeNotIn;
    }

    public void setErrorCodeNotIn(List<String> errorCodeNotIn) {
        this.errorCodeNotIn = errorCodeNotIn;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_IN);
        return this;
    }

    public void setErrorCodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_IN);
        }
    }

    public boolean getErrorCodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput errorCodeNotStartsWith(String errorCodeNotStartsWith) {

        this.errorCodeNotStartsWith = errorCodeNotStartsWith;
        return this;
    }

    /**
     * Get errorCodeNotStartsWith
     *
     * @return errorCodeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeNotStartsWith() {
        return errorCodeNotStartsWith;
    }

    public void setErrorCodeNotStartsWith(String errorCodeNotStartsWith) {
        this.errorCodeNotStartsWith = errorCodeNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH);
        return this;
    }

    public void setErrorCodeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH);
        }
    }

    public boolean getErrorCodeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput errorCodeStartsWith(String errorCodeStartsWith) {

        this.errorCodeStartsWith = errorCodeStartsWith;
        return this;
    }

    /**
     * Get errorCodeStartsWith
     *
     * @return errorCodeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCodeStartsWith() {
        return errorCodeStartsWith;
    }

    public void setErrorCodeStartsWith(String errorCodeStartsWith) {
        this.errorCodeStartsWith = errorCodeStartsWith;
    }

    public BackupStoreRepositoryWhereInput errorCodeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput errorCodeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH);
        return this;
    }

    public void setErrorCodeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH);
        }
    }

    public boolean getErrorCodeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput id(String id) {

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

    public BackupStoreRepositoryWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupStoreRepositoryWhereInput id_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idContains(String idContains) {

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

    public BackupStoreRepositoryWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput idContains_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idEndsWith(String idEndsWith) {

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

    public BackupStoreRepositoryWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput idEndsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idGt(String idGt) {

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

    public BackupStoreRepositoryWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput idGt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idGte(String idGte) {

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

    public BackupStoreRepositoryWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput idGte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIdInItem(String idInItem) {
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

    public BackupStoreRepositoryWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput idIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idLt(String idLt) {

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

    public BackupStoreRepositoryWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput idLt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idLte(String idLte) {

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

    public BackupStoreRepositoryWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput idLte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idNot(String idNot) {

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

    public BackupStoreRepositoryWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput idNot_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idNotContains(String idNotContains) {

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

    public BackupStoreRepositoryWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput idNotContains_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public BackupStoreRepositoryWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIdNotInItem(String idNotInItem) {
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

    public BackupStoreRepositoryWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput idNotIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public BackupStoreRepositoryWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput idStartsWith(String idStartsWith) {

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

    public BackupStoreRepositoryWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput idStartsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput iscsiChapName(String iscsiChapName) {

        this.iscsiChapName = iscsiChapName;
        return this;
    }

    /**
     * Get iscsiChapName
     *
     * @return iscsiChapName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapName() {
        return iscsiChapName;
    }

    public void setIscsiChapName(String iscsiChapName) {
        this.iscsiChapName = iscsiChapName;
    }

    public BackupStoreRepositoryWhereInput iscsiChapName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        return this;
    }

    public void setIscsiChapName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME);
        }
    }

    public boolean getIscsiChapName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameContains(String iscsiChapNameContains) {

        this.iscsiChapNameContains = iscsiChapNameContains;
        return this;
    }

    /**
     * Get iscsiChapNameContains
     *
     * @return iscsiChapNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameContains() {
        return iscsiChapNameContains;
    }

    public void setIscsiChapNameContains(String iscsiChapNameContains) {
        this.iscsiChapNameContains = iscsiChapNameContains;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS);
        return this;
    }

    public void setIscsiChapNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS);
        }
    }

    public boolean getIscsiChapNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameEndsWith(String iscsiChapNameEndsWith) {

        this.iscsiChapNameEndsWith = iscsiChapNameEndsWith;
        return this;
    }

    /**
     * Get iscsiChapNameEndsWith
     *
     * @return iscsiChapNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameEndsWith() {
        return iscsiChapNameEndsWith;
    }

    public void setIscsiChapNameEndsWith(String iscsiChapNameEndsWith) {
        this.iscsiChapNameEndsWith = iscsiChapNameEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH);
        return this;
    }

    public void setIscsiChapNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH);
        }
    }

    public boolean getIscsiChapNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameGt(String iscsiChapNameGt) {

        this.iscsiChapNameGt = iscsiChapNameGt;
        return this;
    }

    /**
     * Get iscsiChapNameGt
     *
     * @return iscsiChapNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameGt() {
        return iscsiChapNameGt;
    }

    public void setIscsiChapNameGt(String iscsiChapNameGt) {
        this.iscsiChapNameGt = iscsiChapNameGt;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT);
        return this;
    }

    public void setIscsiChapNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT);
        }
    }

    public boolean getIscsiChapNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameGte(String iscsiChapNameGte) {

        this.iscsiChapNameGte = iscsiChapNameGte;
        return this;
    }

    /**
     * Get iscsiChapNameGte
     *
     * @return iscsiChapNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameGte() {
        return iscsiChapNameGte;
    }

    public void setIscsiChapNameGte(String iscsiChapNameGte) {
        this.iscsiChapNameGte = iscsiChapNameGte;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE);
        return this;
    }

    public void setIscsiChapNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE);
        }
    }

    public boolean getIscsiChapNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameIn(List<String> iscsiChapNameIn) {

        this.iscsiChapNameIn = iscsiChapNameIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiChapNameInItem(String iscsiChapNameInItem) {
        if (this.iscsiChapNameIn == null) {
            this.iscsiChapNameIn = new ArrayList<String>();
        }
        this.iscsiChapNameIn.add(iscsiChapNameInItem);
        return this;
    }

    /**
     * Get iscsiChapNameIn
     *
     * @return iscsiChapNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiChapNameIn() {
        return iscsiChapNameIn;
    }

    public void setIscsiChapNameIn(List<String> iscsiChapNameIn) {
        this.iscsiChapNameIn = iscsiChapNameIn;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN);
        return this;
    }

    public void setIscsiChapNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN);
        }
    }

    public boolean getIscsiChapNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameLt(String iscsiChapNameLt) {

        this.iscsiChapNameLt = iscsiChapNameLt;
        return this;
    }

    /**
     * Get iscsiChapNameLt
     *
     * @return iscsiChapNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameLt() {
        return iscsiChapNameLt;
    }

    public void setIscsiChapNameLt(String iscsiChapNameLt) {
        this.iscsiChapNameLt = iscsiChapNameLt;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT);
        return this;
    }

    public void setIscsiChapNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT);
        }
    }

    public boolean getIscsiChapNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameLte(String iscsiChapNameLte) {

        this.iscsiChapNameLte = iscsiChapNameLte;
        return this;
    }

    /**
     * Get iscsiChapNameLte
     *
     * @return iscsiChapNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameLte() {
        return iscsiChapNameLte;
    }

    public void setIscsiChapNameLte(String iscsiChapNameLte) {
        this.iscsiChapNameLte = iscsiChapNameLte;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE);
        return this;
    }

    public void setIscsiChapNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE);
        }
    }

    public boolean getIscsiChapNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNot(String iscsiChapNameNot) {

        this.iscsiChapNameNot = iscsiChapNameNot;
        return this;
    }

    /**
     * Get iscsiChapNameNot
     *
     * @return iscsiChapNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameNot() {
        return iscsiChapNameNot;
    }

    public void setIscsiChapNameNot(String iscsiChapNameNot) {
        this.iscsiChapNameNot = iscsiChapNameNot;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT);
        return this;
    }

    public void setIscsiChapNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT);
        }
    }

    public boolean getIscsiChapNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotContains(
            String iscsiChapNameNotContains) {

        this.iscsiChapNameNotContains = iscsiChapNameNotContains;
        return this;
    }

    /**
     * Get iscsiChapNameNotContains
     *
     * @return iscsiChapNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameNotContains() {
        return iscsiChapNameNotContains;
    }

    public void setIscsiChapNameNotContains(String iscsiChapNameNotContains) {
        this.iscsiChapNameNotContains = iscsiChapNameNotContains;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS);
        return this;
    }

    public void setIscsiChapNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS);
        }
    }

    public boolean getIscsiChapNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotEndsWith(
            String iscsiChapNameNotEndsWith) {

        this.iscsiChapNameNotEndsWith = iscsiChapNameNotEndsWith;
        return this;
    }

    /**
     * Get iscsiChapNameNotEndsWith
     *
     * @return iscsiChapNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameNotEndsWith() {
        return iscsiChapNameNotEndsWith;
    }

    public void setIscsiChapNameNotEndsWith(String iscsiChapNameNotEndsWith) {
        this.iscsiChapNameNotEndsWith = iscsiChapNameNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiChapNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiChapNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotIn(List<String> iscsiChapNameNotIn) {

        this.iscsiChapNameNotIn = iscsiChapNameNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiChapNameNotInItem(
            String iscsiChapNameNotInItem) {
        if (this.iscsiChapNameNotIn == null) {
            this.iscsiChapNameNotIn = new ArrayList<String>();
        }
        this.iscsiChapNameNotIn.add(iscsiChapNameNotInItem);
        return this;
    }

    /**
     * Get iscsiChapNameNotIn
     *
     * @return iscsiChapNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiChapNameNotIn() {
        return iscsiChapNameNotIn;
    }

    public void setIscsiChapNameNotIn(List<String> iscsiChapNameNotIn) {
        this.iscsiChapNameNotIn = iscsiChapNameNotIn;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN);
        return this;
    }

    public void setIscsiChapNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN);
        }
    }

    public boolean getIscsiChapNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotStartsWith(
            String iscsiChapNameNotStartsWith) {

        this.iscsiChapNameNotStartsWith = iscsiChapNameNotStartsWith;
        return this;
    }

    /**
     * Get iscsiChapNameNotStartsWith
     *
     * @return iscsiChapNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameNotStartsWith() {
        return iscsiChapNameNotStartsWith;
    }

    public void setIscsiChapNameNotStartsWith(String iscsiChapNameNotStartsWith) {
        this.iscsiChapNameNotStartsWith = iscsiChapNameNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiChapNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiChapNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameStartsWith(String iscsiChapNameStartsWith) {

        this.iscsiChapNameStartsWith = iscsiChapNameStartsWith;
        return this;
    }

    /**
     * Get iscsiChapNameStartsWith
     *
     * @return iscsiChapNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapNameStartsWith() {
        return iscsiChapNameStartsWith;
    }

    public void setIscsiChapNameStartsWith(String iscsiChapNameStartsWith) {
        this.iscsiChapNameStartsWith = iscsiChapNameStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH);
        return this;
    }

    public void setIscsiChapNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH);
        }
    }

    public boolean getIscsiChapNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecret(String iscsiChapSecret) {

        this.iscsiChapSecret = iscsiChapSecret;
        return this;
    }

    /**
     * Get iscsiChapSecret
     *
     * @return iscsiChapSecret
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecret() {
        return iscsiChapSecret;
    }

    public void setIscsiChapSecret(String iscsiChapSecret) {
        this.iscsiChapSecret = iscsiChapSecret;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecret_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecret_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        return this;
    }

    public void setIscsiChapSecret_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
        }
    }

    public boolean getIscsiChapSecret_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretContains(String iscsiChapSecretContains) {

        this.iscsiChapSecretContains = iscsiChapSecretContains;
        return this;
    }

    /**
     * Get iscsiChapSecretContains
     *
     * @return iscsiChapSecretContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretContains() {
        return iscsiChapSecretContains;
    }

    public void setIscsiChapSecretContains(String iscsiChapSecretContains) {
        this.iscsiChapSecretContains = iscsiChapSecretContains;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS);
        return this;
    }

    public void setIscsiChapSecretContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS);
        }
    }

    public boolean getIscsiChapSecretContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretEndsWith(String iscsiChapSecretEndsWith) {

        this.iscsiChapSecretEndsWith = iscsiChapSecretEndsWith;
        return this;
    }

    /**
     * Get iscsiChapSecretEndsWith
     *
     * @return iscsiChapSecretEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretEndsWith() {
        return iscsiChapSecretEndsWith;
    }

    public void setIscsiChapSecretEndsWith(String iscsiChapSecretEndsWith) {
        this.iscsiChapSecretEndsWith = iscsiChapSecretEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH);
        return this;
    }

    public void setIscsiChapSecretEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH);
        }
    }

    public boolean getIscsiChapSecretEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretGt(String iscsiChapSecretGt) {

        this.iscsiChapSecretGt = iscsiChapSecretGt;
        return this;
    }

    /**
     * Get iscsiChapSecretGt
     *
     * @return iscsiChapSecretGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretGt() {
        return iscsiChapSecretGt;
    }

    public void setIscsiChapSecretGt(String iscsiChapSecretGt) {
        this.iscsiChapSecretGt = iscsiChapSecretGt;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT);
        return this;
    }

    public void setIscsiChapSecretGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT);
        }
    }

    public boolean getIscsiChapSecretGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretGte(String iscsiChapSecretGte) {

        this.iscsiChapSecretGte = iscsiChapSecretGte;
        return this;
    }

    /**
     * Get iscsiChapSecretGte
     *
     * @return iscsiChapSecretGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretGte() {
        return iscsiChapSecretGte;
    }

    public void setIscsiChapSecretGte(String iscsiChapSecretGte) {
        this.iscsiChapSecretGte = iscsiChapSecretGte;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE);
        return this;
    }

    public void setIscsiChapSecretGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE);
        }
    }

    public boolean getIscsiChapSecretGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretIn(List<String> iscsiChapSecretIn) {

        this.iscsiChapSecretIn = iscsiChapSecretIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiChapSecretInItem(String iscsiChapSecretInItem) {
        if (this.iscsiChapSecretIn == null) {
            this.iscsiChapSecretIn = new ArrayList<String>();
        }
        this.iscsiChapSecretIn.add(iscsiChapSecretInItem);
        return this;
    }

    /**
     * Get iscsiChapSecretIn
     *
     * @return iscsiChapSecretIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiChapSecretIn() {
        return iscsiChapSecretIn;
    }

    public void setIscsiChapSecretIn(List<String> iscsiChapSecretIn) {
        this.iscsiChapSecretIn = iscsiChapSecretIn;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN);
        return this;
    }

    public void setIscsiChapSecretIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN);
        }
    }

    public boolean getIscsiChapSecretIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretLt(String iscsiChapSecretLt) {

        this.iscsiChapSecretLt = iscsiChapSecretLt;
        return this;
    }

    /**
     * Get iscsiChapSecretLt
     *
     * @return iscsiChapSecretLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretLt() {
        return iscsiChapSecretLt;
    }

    public void setIscsiChapSecretLt(String iscsiChapSecretLt) {
        this.iscsiChapSecretLt = iscsiChapSecretLt;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT);
        return this;
    }

    public void setIscsiChapSecretLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT);
        }
    }

    public boolean getIscsiChapSecretLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretLte(String iscsiChapSecretLte) {

        this.iscsiChapSecretLte = iscsiChapSecretLte;
        return this;
    }

    /**
     * Get iscsiChapSecretLte
     *
     * @return iscsiChapSecretLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretLte() {
        return iscsiChapSecretLte;
    }

    public void setIscsiChapSecretLte(String iscsiChapSecretLte) {
        this.iscsiChapSecretLte = iscsiChapSecretLte;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE);
        return this;
    }

    public void setIscsiChapSecretLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE);
        }
    }

    public boolean getIscsiChapSecretLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNot(String iscsiChapSecretNot) {

        this.iscsiChapSecretNot = iscsiChapSecretNot;
        return this;
    }

    /**
     * Get iscsiChapSecretNot
     *
     * @return iscsiChapSecretNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretNot() {
        return iscsiChapSecretNot;
    }

    public void setIscsiChapSecretNot(String iscsiChapSecretNot) {
        this.iscsiChapSecretNot = iscsiChapSecretNot;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT);
        return this;
    }

    public void setIscsiChapSecretNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT);
        }
    }

    public boolean getIscsiChapSecretNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotContains(
            String iscsiChapSecretNotContains) {

        this.iscsiChapSecretNotContains = iscsiChapSecretNotContains;
        return this;
    }

    /**
     * Get iscsiChapSecretNotContains
     *
     * @return iscsiChapSecretNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretNotContains() {
        return iscsiChapSecretNotContains;
    }

    public void setIscsiChapSecretNotContains(String iscsiChapSecretNotContains) {
        this.iscsiChapSecretNotContains = iscsiChapSecretNotContains;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS);
        return this;
    }

    public void setIscsiChapSecretNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS);
        }
    }

    public boolean getIscsiChapSecretNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotEndsWith(
            String iscsiChapSecretNotEndsWith) {

        this.iscsiChapSecretNotEndsWith = iscsiChapSecretNotEndsWith;
        return this;
    }

    /**
     * Get iscsiChapSecretNotEndsWith
     *
     * @return iscsiChapSecretNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretNotEndsWith() {
        return iscsiChapSecretNotEndsWith;
    }

    public void setIscsiChapSecretNotEndsWith(String iscsiChapSecretNotEndsWith) {
        this.iscsiChapSecretNotEndsWith = iscsiChapSecretNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiChapSecretNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiChapSecretNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotIn(List<String> iscsiChapSecretNotIn) {

        this.iscsiChapSecretNotIn = iscsiChapSecretNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiChapSecretNotInItem(
            String iscsiChapSecretNotInItem) {
        if (this.iscsiChapSecretNotIn == null) {
            this.iscsiChapSecretNotIn = new ArrayList<String>();
        }
        this.iscsiChapSecretNotIn.add(iscsiChapSecretNotInItem);
        return this;
    }

    /**
     * Get iscsiChapSecretNotIn
     *
     * @return iscsiChapSecretNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiChapSecretNotIn() {
        return iscsiChapSecretNotIn;
    }

    public void setIscsiChapSecretNotIn(List<String> iscsiChapSecretNotIn) {
        this.iscsiChapSecretNotIn = iscsiChapSecretNotIn;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN);
        return this;
    }

    public void setIscsiChapSecretNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN);
        }
    }

    public boolean getIscsiChapSecretNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotStartsWith(
            String iscsiChapSecretNotStartsWith) {

        this.iscsiChapSecretNotStartsWith = iscsiChapSecretNotStartsWith;
        return this;
    }

    /**
     * Get iscsiChapSecretNotStartsWith
     *
     * @return iscsiChapSecretNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretNotStartsWith() {
        return iscsiChapSecretNotStartsWith;
    }

    public void setIscsiChapSecretNotStartsWith(String iscsiChapSecretNotStartsWith) {
        this.iscsiChapSecretNotStartsWith = iscsiChapSecretNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiChapSecretNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiChapSecretNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretStartsWith(
            String iscsiChapSecretStartsWith) {

        this.iscsiChapSecretStartsWith = iscsiChapSecretStartsWith;
        return this;
    }

    /**
     * Get iscsiChapSecretStartsWith
     *
     * @return iscsiChapSecretStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiChapSecretStartsWith() {
        return iscsiChapSecretStartsWith;
    }

    public void setIscsiChapSecretStartsWith(String iscsiChapSecretStartsWith) {
        this.iscsiChapSecretStartsWith = iscsiChapSecretStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiChapSecretStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH);
        return this;
    }

    public void setIscsiChapSecretStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH);
        }
    }

    public boolean getIscsiChapSecretStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiIp(String iscsiIp) {

        this.iscsiIp = iscsiIp;
        return this;
    }

    /**
     * Get iscsiIp
     *
     * @return iscsiIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIp() {
        return iscsiIp;
    }

    public void setIscsiIp(String iscsiIp) {
        this.iscsiIp = iscsiIp;
    }

    public BackupStoreRepositoryWhereInput iscsiIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP);
        return this;
    }

    public void setIscsiIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP);
        }
    }

    public boolean getIscsiIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP);
    }

    public BackupStoreRepositoryWhereInput iscsiIpContains(String iscsiIpContains) {

        this.iscsiIpContains = iscsiIpContains;
        return this;
    }

    /**
     * Get iscsiIpContains
     *
     * @return iscsiIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpContains() {
        return iscsiIpContains;
    }

    public void setIscsiIpContains(String iscsiIpContains) {
        this.iscsiIpContains = iscsiIpContains;
    }

    public BackupStoreRepositoryWhereInput iscsiIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_CONTAINS);
        return this;
    }

    public void setIscsiIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_CONTAINS);
        }
    }

    public boolean getIscsiIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiIpEndsWith(String iscsiIpEndsWith) {

        this.iscsiIpEndsWith = iscsiIpEndsWith;
        return this;
    }

    /**
     * Get iscsiIpEndsWith
     *
     * @return iscsiIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpEndsWith() {
        return iscsiIpEndsWith;
    }

    public void setIscsiIpEndsWith(String iscsiIpEndsWith) {
        this.iscsiIpEndsWith = iscsiIpEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH);
        return this;
    }

    public void setIscsiIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH);
        }
    }

    public boolean getIscsiIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiIpGt(String iscsiIpGt) {

        this.iscsiIpGt = iscsiIpGt;
        return this;
    }

    /**
     * Get iscsiIpGt
     *
     * @return iscsiIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpGt() {
        return iscsiIpGt;
    }

    public void setIscsiIpGt(String iscsiIpGt) {
        this.iscsiIpGt = iscsiIpGt;
    }

    public BackupStoreRepositoryWhereInput iscsiIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_GT);
        return this;
    }

    public void setIscsiIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_GT);
        }
    }

    public boolean getIscsiIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_GT);
    }

    public BackupStoreRepositoryWhereInput iscsiIpGte(String iscsiIpGte) {

        this.iscsiIpGte = iscsiIpGte;
        return this;
    }

    /**
     * Get iscsiIpGte
     *
     * @return iscsiIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpGte() {
        return iscsiIpGte;
    }

    public void setIscsiIpGte(String iscsiIpGte) {
        this.iscsiIpGte = iscsiIpGte;
    }

    public BackupStoreRepositoryWhereInput iscsiIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_GTE);
        return this;
    }

    public void setIscsiIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_GTE);
        }
    }

    public boolean getIscsiIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_GTE);
    }

    public BackupStoreRepositoryWhereInput iscsiIpIn(List<String> iscsiIpIn) {

        this.iscsiIpIn = iscsiIpIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiIpInItem(String iscsiIpInItem) {
        if (this.iscsiIpIn == null) {
            this.iscsiIpIn = new ArrayList<String>();
        }
        this.iscsiIpIn.add(iscsiIpInItem);
        return this;
    }

    /**
     * Get iscsiIpIn
     *
     * @return iscsiIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiIpIn() {
        return iscsiIpIn;
    }

    public void setIscsiIpIn(List<String> iscsiIpIn) {
        this.iscsiIpIn = iscsiIpIn;
    }

    public BackupStoreRepositoryWhereInput iscsiIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_IN);
        return this;
    }

    public void setIscsiIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_IN);
        }
    }

    public boolean getIscsiIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiIpLt(String iscsiIpLt) {

        this.iscsiIpLt = iscsiIpLt;
        return this;
    }

    /**
     * Get iscsiIpLt
     *
     * @return iscsiIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpLt() {
        return iscsiIpLt;
    }

    public void setIscsiIpLt(String iscsiIpLt) {
        this.iscsiIpLt = iscsiIpLt;
    }

    public BackupStoreRepositoryWhereInput iscsiIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_LT);
        return this;
    }

    public void setIscsiIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_LT);
        }
    }

    public boolean getIscsiIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_LT);
    }

    public BackupStoreRepositoryWhereInput iscsiIpLte(String iscsiIpLte) {

        this.iscsiIpLte = iscsiIpLte;
        return this;
    }

    /**
     * Get iscsiIpLte
     *
     * @return iscsiIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpLte() {
        return iscsiIpLte;
    }

    public void setIscsiIpLte(String iscsiIpLte) {
        this.iscsiIpLte = iscsiIpLte;
    }

    public BackupStoreRepositoryWhereInput iscsiIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_LTE);
        return this;
    }

    public void setIscsiIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_LTE);
        }
    }

    public boolean getIscsiIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_LTE);
    }

    public BackupStoreRepositoryWhereInput iscsiIpNot(String iscsiIpNot) {

        this.iscsiIpNot = iscsiIpNot;
        return this;
    }

    /**
     * Get iscsiIpNot
     *
     * @return iscsiIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpNot() {
        return iscsiIpNot;
    }

    public void setIscsiIpNot(String iscsiIpNot) {
        this.iscsiIpNot = iscsiIpNot;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT);
        return this;
    }

    public void setIscsiIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT);
        }
    }

    public boolean getIscsiIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_NOT);
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotContains(String iscsiIpNotContains) {

        this.iscsiIpNotContains = iscsiIpNotContains;
        return this;
    }

    /**
     * Get iscsiIpNotContains
     *
     * @return iscsiIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpNotContains() {
        return iscsiIpNotContains;
    }

    public void setIscsiIpNotContains(String iscsiIpNotContains) {
        this.iscsiIpNotContains = iscsiIpNotContains;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS);
        return this;
    }

    public void setIscsiIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS);
        }
    }

    public boolean getIscsiIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotEndsWith(String iscsiIpNotEndsWith) {

        this.iscsiIpNotEndsWith = iscsiIpNotEndsWith;
        return this;
    }

    /**
     * Get iscsiIpNotEndsWith
     *
     * @return iscsiIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpNotEndsWith() {
        return iscsiIpNotEndsWith;
    }

    public void setIscsiIpNotEndsWith(String iscsiIpNotEndsWith) {
        this.iscsiIpNotEndsWith = iscsiIpNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotIn(List<String> iscsiIpNotIn) {

        this.iscsiIpNotIn = iscsiIpNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiIpNotInItem(String iscsiIpNotInItem) {
        if (this.iscsiIpNotIn == null) {
            this.iscsiIpNotIn = new ArrayList<String>();
        }
        this.iscsiIpNotIn.add(iscsiIpNotInItem);
        return this;
    }

    /**
     * Get iscsiIpNotIn
     *
     * @return iscsiIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiIpNotIn() {
        return iscsiIpNotIn;
    }

    public void setIscsiIpNotIn(List<String> iscsiIpNotIn) {
        this.iscsiIpNotIn = iscsiIpNotIn;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_IN);
        return this;
    }

    public void setIscsiIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_IN);
        }
    }

    public boolean getIscsiIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotStartsWith(String iscsiIpNotStartsWith) {

        this.iscsiIpNotStartsWith = iscsiIpNotStartsWith;
        return this;
    }

    /**
     * Get iscsiIpNotStartsWith
     *
     * @return iscsiIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpNotStartsWith() {
        return iscsiIpNotStartsWith;
    }

    public void setIscsiIpNotStartsWith(String iscsiIpNotStartsWith) {
        this.iscsiIpNotStartsWith = iscsiIpNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiIpStartsWith(String iscsiIpStartsWith) {

        this.iscsiIpStartsWith = iscsiIpStartsWith;
        return this;
    }

    /**
     * Get iscsiIpStartsWith
     *
     * @return iscsiIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiIpStartsWith() {
        return iscsiIpStartsWith;
    }

    public void setIscsiIpStartsWith(String iscsiIpStartsWith) {
        this.iscsiIpStartsWith = iscsiIpStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH);
        return this;
    }

    public void setIscsiIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH);
        }
    }

    public boolean getIscsiIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiLunId(String iscsiLunId) {

        this.iscsiLunId = iscsiLunId;
        return this;
    }

    /**
     * Get iscsiLunId
     *
     * @return iscsiLunId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunId() {
        return iscsiLunId;
    }

    public void setIscsiLunId(String iscsiLunId) {
        this.iscsiLunId = iscsiLunId;
    }

    public BackupStoreRepositoryWhereInput iscsiLunId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID);
        return this;
    }

    public void setIscsiLunId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID);
        }
    }

    public boolean getIscsiLunId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdContains(String iscsiLunIdContains) {

        this.iscsiLunIdContains = iscsiLunIdContains;
        return this;
    }

    /**
     * Get iscsiLunIdContains
     *
     * @return iscsiLunIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdContains() {
        return iscsiLunIdContains;
    }

    public void setIscsiLunIdContains(String iscsiLunIdContains) {
        this.iscsiLunIdContains = iscsiLunIdContains;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS);
        return this;
    }

    public void setIscsiLunIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS);
        }
    }

    public boolean getIscsiLunIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdEndsWith(String iscsiLunIdEndsWith) {

        this.iscsiLunIdEndsWith = iscsiLunIdEndsWith;
        return this;
    }

    /**
     * Get iscsiLunIdEndsWith
     *
     * @return iscsiLunIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdEndsWith() {
        return iscsiLunIdEndsWith;
    }

    public void setIscsiLunIdEndsWith(String iscsiLunIdEndsWith) {
        this.iscsiLunIdEndsWith = iscsiLunIdEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH);
        return this;
    }

    public void setIscsiLunIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH);
        }
    }

    public boolean getIscsiLunIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdGt(String iscsiLunIdGt) {

        this.iscsiLunIdGt = iscsiLunIdGt;
        return this;
    }

    /**
     * Get iscsiLunIdGt
     *
     * @return iscsiLunIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdGt() {
        return iscsiLunIdGt;
    }

    public void setIscsiLunIdGt(String iscsiLunIdGt) {
        this.iscsiLunIdGt = iscsiLunIdGt;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_GT);
        return this;
    }

    public void setIscsiLunIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_GT);
        }
    }

    public boolean getIscsiLunIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_GT);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdGte(String iscsiLunIdGte) {

        this.iscsiLunIdGte = iscsiLunIdGte;
        return this;
    }

    /**
     * Get iscsiLunIdGte
     *
     * @return iscsiLunIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdGte() {
        return iscsiLunIdGte;
    }

    public void setIscsiLunIdGte(String iscsiLunIdGte) {
        this.iscsiLunIdGte = iscsiLunIdGte;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_GTE);
        return this;
    }

    public void setIscsiLunIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_GTE);
        }
    }

    public boolean getIscsiLunIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_GTE);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdIn(List<String> iscsiLunIdIn) {

        this.iscsiLunIdIn = iscsiLunIdIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiLunIdInItem(String iscsiLunIdInItem) {
        if (this.iscsiLunIdIn == null) {
            this.iscsiLunIdIn = new ArrayList<String>();
        }
        this.iscsiLunIdIn.add(iscsiLunIdInItem);
        return this;
    }

    /**
     * Get iscsiLunIdIn
     *
     * @return iscsiLunIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiLunIdIn() {
        return iscsiLunIdIn;
    }

    public void setIscsiLunIdIn(List<String> iscsiLunIdIn) {
        this.iscsiLunIdIn = iscsiLunIdIn;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_IN);
        return this;
    }

    public void setIscsiLunIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_IN);
        }
    }

    public boolean getIscsiLunIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdLt(String iscsiLunIdLt) {

        this.iscsiLunIdLt = iscsiLunIdLt;
        return this;
    }

    /**
     * Get iscsiLunIdLt
     *
     * @return iscsiLunIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdLt() {
        return iscsiLunIdLt;
    }

    public void setIscsiLunIdLt(String iscsiLunIdLt) {
        this.iscsiLunIdLt = iscsiLunIdLt;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_LT);
        return this;
    }

    public void setIscsiLunIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_LT);
        }
    }

    public boolean getIscsiLunIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_LT);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdLte(String iscsiLunIdLte) {

        this.iscsiLunIdLte = iscsiLunIdLte;
        return this;
    }

    /**
     * Get iscsiLunIdLte
     *
     * @return iscsiLunIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdLte() {
        return iscsiLunIdLte;
    }

    public void setIscsiLunIdLte(String iscsiLunIdLte) {
        this.iscsiLunIdLte = iscsiLunIdLte;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_LTE);
        return this;
    }

    public void setIscsiLunIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_LTE);
        }
    }

    public boolean getIscsiLunIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_LTE);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNot(String iscsiLunIdNot) {

        this.iscsiLunIdNot = iscsiLunIdNot;
        return this;
    }

    /**
     * Get iscsiLunIdNot
     *
     * @return iscsiLunIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdNot() {
        return iscsiLunIdNot;
    }

    public void setIscsiLunIdNot(String iscsiLunIdNot) {
        this.iscsiLunIdNot = iscsiLunIdNot;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT);
        return this;
    }

    public void setIscsiLunIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT);
        }
    }

    public boolean getIscsiLunIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_NOT);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotContains(String iscsiLunIdNotContains) {

        this.iscsiLunIdNotContains = iscsiLunIdNotContains;
        return this;
    }

    /**
     * Get iscsiLunIdNotContains
     *
     * @return iscsiLunIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdNotContains() {
        return iscsiLunIdNotContains;
    }

    public void setIscsiLunIdNotContains(String iscsiLunIdNotContains) {
        this.iscsiLunIdNotContains = iscsiLunIdNotContains;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS);
        return this;
    }

    public void setIscsiLunIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS);
        }
    }

    public boolean getIscsiLunIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotEndsWith(String iscsiLunIdNotEndsWith) {

        this.iscsiLunIdNotEndsWith = iscsiLunIdNotEndsWith;
        return this;
    }

    /**
     * Get iscsiLunIdNotEndsWith
     *
     * @return iscsiLunIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdNotEndsWith() {
        return iscsiLunIdNotEndsWith;
    }

    public void setIscsiLunIdNotEndsWith(String iscsiLunIdNotEndsWith) {
        this.iscsiLunIdNotEndsWith = iscsiLunIdNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiLunIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiLunIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotIn(List<String> iscsiLunIdNotIn) {

        this.iscsiLunIdNotIn = iscsiLunIdNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiLunIdNotInItem(String iscsiLunIdNotInItem) {
        if (this.iscsiLunIdNotIn == null) {
            this.iscsiLunIdNotIn = new ArrayList<String>();
        }
        this.iscsiLunIdNotIn.add(iscsiLunIdNotInItem);
        return this;
    }

    /**
     * Get iscsiLunIdNotIn
     *
     * @return iscsiLunIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiLunIdNotIn() {
        return iscsiLunIdNotIn;
    }

    public void setIscsiLunIdNotIn(List<String> iscsiLunIdNotIn) {
        this.iscsiLunIdNotIn = iscsiLunIdNotIn;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN);
        return this;
    }

    public void setIscsiLunIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN);
        }
    }

    public boolean getIscsiLunIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotStartsWith(String iscsiLunIdNotStartsWith) {

        this.iscsiLunIdNotStartsWith = iscsiLunIdNotStartsWith;
        return this;
    }

    /**
     * Get iscsiLunIdNotStartsWith
     *
     * @return iscsiLunIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdNotStartsWith() {
        return iscsiLunIdNotStartsWith;
    }

    public void setIscsiLunIdNotStartsWith(String iscsiLunIdNotStartsWith) {
        this.iscsiLunIdNotStartsWith = iscsiLunIdNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiLunIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiLunIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdStartsWith(String iscsiLunIdStartsWith) {

        this.iscsiLunIdStartsWith = iscsiLunIdStartsWith;
        return this;
    }

    /**
     * Get iscsiLunIdStartsWith
     *
     * @return iscsiLunIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiLunIdStartsWith() {
        return iscsiLunIdStartsWith;
    }

    public void setIscsiLunIdStartsWith(String iscsiLunIdStartsWith) {
        this.iscsiLunIdStartsWith = iscsiLunIdStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiLunIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH);
        return this;
    }

    public void setIscsiLunIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH);
        }
    }

    public boolean getIscsiLunIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiPort(Integer iscsiPort) {

        this.iscsiPort = iscsiPort;
        return this;
    }

    /**
     * Get iscsiPort
     *
     * @return iscsiPort
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPort() {
        return iscsiPort;
    }

    public void setIscsiPort(Integer iscsiPort) {
        this.iscsiPort = iscsiPort;
    }

    public BackupStoreRepositoryWhereInput iscsiPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT);
        return this;
    }

    public void setIscsiPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT);
        }
    }

    public boolean getIscsiPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT);
    }

    public BackupStoreRepositoryWhereInput iscsiPortGt(Integer iscsiPortGt) {

        this.iscsiPortGt = iscsiPortGt;
        return this;
    }

    /**
     * Get iscsiPortGt
     *
     * @return iscsiPortGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPortGt() {
        return iscsiPortGt;
    }

    public void setIscsiPortGt(Integer iscsiPortGt) {
        this.iscsiPortGt = iscsiPortGt;
    }

    public BackupStoreRepositoryWhereInput iscsiPortGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GT);
        return this;
    }

    public void setIscsiPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GT);
        }
    }

    public boolean getIscsiPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_GT);
    }

    public BackupStoreRepositoryWhereInput iscsiPortGte(Integer iscsiPortGte) {

        this.iscsiPortGte = iscsiPortGte;
        return this;
    }

    /**
     * Get iscsiPortGte
     *
     * @return iscsiPortGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPortGte() {
        return iscsiPortGte;
    }

    public void setIscsiPortGte(Integer iscsiPortGte) {
        this.iscsiPortGte = iscsiPortGte;
    }

    public BackupStoreRepositoryWhereInput iscsiPortGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GTE);
        return this;
    }

    public void setIscsiPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_GTE);
        }
    }

    public boolean getIscsiPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_GTE);
    }

    public BackupStoreRepositoryWhereInput iscsiPortIn(List<Integer> iscsiPortIn) {

        this.iscsiPortIn = iscsiPortIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiPortInItem(Integer iscsiPortInItem) {
        if (this.iscsiPortIn == null) {
            this.iscsiPortIn = new ArrayList<Integer>();
        }
        this.iscsiPortIn.add(iscsiPortInItem);
        return this;
    }

    /**
     * Get iscsiPortIn
     *
     * @return iscsiPortIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiPortIn() {
        return iscsiPortIn;
    }

    public void setIscsiPortIn(List<Integer> iscsiPortIn) {
        this.iscsiPortIn = iscsiPortIn;
    }

    public BackupStoreRepositoryWhereInput iscsiPortIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_IN);
        return this;
    }

    public void setIscsiPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_IN);
        }
    }

    public boolean getIscsiPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiPortLt(Integer iscsiPortLt) {

        this.iscsiPortLt = iscsiPortLt;
        return this;
    }

    /**
     * Get iscsiPortLt
     *
     * @return iscsiPortLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPortLt() {
        return iscsiPortLt;
    }

    public void setIscsiPortLt(Integer iscsiPortLt) {
        this.iscsiPortLt = iscsiPortLt;
    }

    public BackupStoreRepositoryWhereInput iscsiPortLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LT);
        return this;
    }

    public void setIscsiPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LT);
        }
    }

    public boolean getIscsiPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_LT);
    }

    public BackupStoreRepositoryWhereInput iscsiPortLte(Integer iscsiPortLte) {

        this.iscsiPortLte = iscsiPortLte;
        return this;
    }

    /**
     * Get iscsiPortLte
     *
     * @return iscsiPortLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPortLte() {
        return iscsiPortLte;
    }

    public void setIscsiPortLte(Integer iscsiPortLte) {
        this.iscsiPortLte = iscsiPortLte;
    }

    public BackupStoreRepositoryWhereInput iscsiPortLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LTE);
        return this;
    }

    public void setIscsiPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_LTE);
        }
    }

    public boolean getIscsiPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_LTE);
    }

    public BackupStoreRepositoryWhereInput iscsiPortNot(Integer iscsiPortNot) {

        this.iscsiPortNot = iscsiPortNot;
        return this;
    }

    /**
     * Get iscsiPortNot
     *
     * @return iscsiPortNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIscsiPortNot() {
        return iscsiPortNot;
    }

    public void setIscsiPortNot(Integer iscsiPortNot) {
        this.iscsiPortNot = iscsiPortNot;
    }

    public BackupStoreRepositoryWhereInput iscsiPortNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT);
        return this;
    }

    public void setIscsiPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT);
        }
    }

    public boolean getIscsiPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT);
    }

    public BackupStoreRepositoryWhereInput iscsiPortNotIn(List<Integer> iscsiPortNotIn) {

        this.iscsiPortNotIn = iscsiPortNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiPortNotInItem(Integer iscsiPortNotInItem) {
        if (this.iscsiPortNotIn == null) {
            this.iscsiPortNotIn = new ArrayList<Integer>();
        }
        this.iscsiPortNotIn.add(iscsiPortNotInItem);
        return this;
    }

    /**
     * Get iscsiPortNotIn
     *
     * @return iscsiPortNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIscsiPortNotIn() {
        return iscsiPortNotIn;
    }

    public void setIscsiPortNotIn(List<Integer> iscsiPortNotIn) {
        this.iscsiPortNotIn = iscsiPortNotIn;
    }

    public BackupStoreRepositoryWhereInput iscsiPortNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiPortNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        return this;
    }

    public void setIscsiPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
        }
    }

    public boolean getIscsiPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_PORT_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqn(String iscsiTargetIqn) {

        this.iscsiTargetIqn = iscsiTargetIqn;
        return this;
    }

    /**
     * Get iscsiTargetIqn
     *
     * @return iscsiTargetIqn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqn() {
        return iscsiTargetIqn;
    }

    public void setIscsiTargetIqn(String iscsiTargetIqn) {
        this.iscsiTargetIqn = iscsiTargetIqn;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        return this;
    }

    public void setIscsiTargetIqn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN);
        }
    }

    public boolean getIscsiTargetIqn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnContains(String iscsiTargetIqnContains) {

        this.iscsiTargetIqnContains = iscsiTargetIqnContains;
        return this;
    }

    /**
     * Get iscsiTargetIqnContains
     *
     * @return iscsiTargetIqnContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnContains() {
        return iscsiTargetIqnContains;
    }

    public void setIscsiTargetIqnContains(String iscsiTargetIqnContains) {
        this.iscsiTargetIqnContains = iscsiTargetIqnContains;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS);
        return this;
    }

    public void setIscsiTargetIqnContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS);
        }
    }

    public boolean getIscsiTargetIqnContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnEndsWith(String iscsiTargetIqnEndsWith) {

        this.iscsiTargetIqnEndsWith = iscsiTargetIqnEndsWith;
        return this;
    }

    /**
     * Get iscsiTargetIqnEndsWith
     *
     * @return iscsiTargetIqnEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnEndsWith() {
        return iscsiTargetIqnEndsWith;
    }

    public void setIscsiTargetIqnEndsWith(String iscsiTargetIqnEndsWith) {
        this.iscsiTargetIqnEndsWith = iscsiTargetIqnEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH);
        return this;
    }

    public void setIscsiTargetIqnEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH);
        }
    }

    public boolean getIscsiTargetIqnEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnGt(String iscsiTargetIqnGt) {

        this.iscsiTargetIqnGt = iscsiTargetIqnGt;
        return this;
    }

    /**
     * Get iscsiTargetIqnGt
     *
     * @return iscsiTargetIqnGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnGt() {
        return iscsiTargetIqnGt;
    }

    public void setIscsiTargetIqnGt(String iscsiTargetIqnGt) {
        this.iscsiTargetIqnGt = iscsiTargetIqnGt;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT);
        return this;
    }

    public void setIscsiTargetIqnGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT);
        }
    }

    public boolean getIscsiTargetIqnGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnGte(String iscsiTargetIqnGte) {

        this.iscsiTargetIqnGte = iscsiTargetIqnGte;
        return this;
    }

    /**
     * Get iscsiTargetIqnGte
     *
     * @return iscsiTargetIqnGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnGte() {
        return iscsiTargetIqnGte;
    }

    public void setIscsiTargetIqnGte(String iscsiTargetIqnGte) {
        this.iscsiTargetIqnGte = iscsiTargetIqnGte;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE);
        return this;
    }

    public void setIscsiTargetIqnGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE);
        }
    }

    public boolean getIscsiTargetIqnGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnIn(List<String> iscsiTargetIqnIn) {

        this.iscsiTargetIqnIn = iscsiTargetIqnIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiTargetIqnInItem(String iscsiTargetIqnInItem) {
        if (this.iscsiTargetIqnIn == null) {
            this.iscsiTargetIqnIn = new ArrayList<String>();
        }
        this.iscsiTargetIqnIn.add(iscsiTargetIqnInItem);
        return this;
    }

    /**
     * Get iscsiTargetIqnIn
     *
     * @return iscsiTargetIqnIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiTargetIqnIn() {
        return iscsiTargetIqnIn;
    }

    public void setIscsiTargetIqnIn(List<String> iscsiTargetIqnIn) {
        this.iscsiTargetIqnIn = iscsiTargetIqnIn;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN);
        return this;
    }

    public void setIscsiTargetIqnIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN);
        }
    }

    public boolean getIscsiTargetIqnIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnLt(String iscsiTargetIqnLt) {

        this.iscsiTargetIqnLt = iscsiTargetIqnLt;
        return this;
    }

    /**
     * Get iscsiTargetIqnLt
     *
     * @return iscsiTargetIqnLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnLt() {
        return iscsiTargetIqnLt;
    }

    public void setIscsiTargetIqnLt(String iscsiTargetIqnLt) {
        this.iscsiTargetIqnLt = iscsiTargetIqnLt;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT);
        return this;
    }

    public void setIscsiTargetIqnLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT);
        }
    }

    public boolean getIscsiTargetIqnLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnLte(String iscsiTargetIqnLte) {

        this.iscsiTargetIqnLte = iscsiTargetIqnLte;
        return this;
    }

    /**
     * Get iscsiTargetIqnLte
     *
     * @return iscsiTargetIqnLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnLte() {
        return iscsiTargetIqnLte;
    }

    public void setIscsiTargetIqnLte(String iscsiTargetIqnLte) {
        this.iscsiTargetIqnLte = iscsiTargetIqnLte;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE);
        return this;
    }

    public void setIscsiTargetIqnLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE);
        }
    }

    public boolean getIscsiTargetIqnLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNot(String iscsiTargetIqnNot) {

        this.iscsiTargetIqnNot = iscsiTargetIqnNot;
        return this;
    }

    /**
     * Get iscsiTargetIqnNot
     *
     * @return iscsiTargetIqnNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnNot() {
        return iscsiTargetIqnNot;
    }

    public void setIscsiTargetIqnNot(String iscsiTargetIqnNot) {
        this.iscsiTargetIqnNot = iscsiTargetIqnNot;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT);
        return this;
    }

    public void setIscsiTargetIqnNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT);
        }
    }

    public boolean getIscsiTargetIqnNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotContains(
            String iscsiTargetIqnNotContains) {

        this.iscsiTargetIqnNotContains = iscsiTargetIqnNotContains;
        return this;
    }

    /**
     * Get iscsiTargetIqnNotContains
     *
     * @return iscsiTargetIqnNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnNotContains() {
        return iscsiTargetIqnNotContains;
    }

    public void setIscsiTargetIqnNotContains(String iscsiTargetIqnNotContains) {
        this.iscsiTargetIqnNotContains = iscsiTargetIqnNotContains;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS);
        return this;
    }

    public void setIscsiTargetIqnNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS);
        }
    }

    public boolean getIscsiTargetIqnNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotEndsWith(
            String iscsiTargetIqnNotEndsWith) {

        this.iscsiTargetIqnNotEndsWith = iscsiTargetIqnNotEndsWith;
        return this;
    }

    /**
     * Get iscsiTargetIqnNotEndsWith
     *
     * @return iscsiTargetIqnNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnNotEndsWith() {
        return iscsiTargetIqnNotEndsWith;
    }

    public void setIscsiTargetIqnNotEndsWith(String iscsiTargetIqnNotEndsWith) {
        this.iscsiTargetIqnNotEndsWith = iscsiTargetIqnNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH);
        return this;
    }

    public void setIscsiTargetIqnNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH);
        }
    }

    public boolean getIscsiTargetIqnNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotIn(List<String> iscsiTargetIqnNotIn) {

        this.iscsiTargetIqnNotIn = iscsiTargetIqnNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addIscsiTargetIqnNotInItem(
            String iscsiTargetIqnNotInItem) {
        if (this.iscsiTargetIqnNotIn == null) {
            this.iscsiTargetIqnNotIn = new ArrayList<String>();
        }
        this.iscsiTargetIqnNotIn.add(iscsiTargetIqnNotInItem);
        return this;
    }

    /**
     * Get iscsiTargetIqnNotIn
     *
     * @return iscsiTargetIqnNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIscsiTargetIqnNotIn() {
        return iscsiTargetIqnNotIn;
    }

    public void setIscsiTargetIqnNotIn(List<String> iscsiTargetIqnNotIn) {
        this.iscsiTargetIqnNotIn = iscsiTargetIqnNotIn;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN);
        return this;
    }

    public void setIscsiTargetIqnNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN);
        }
    }

    public boolean getIscsiTargetIqnNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotStartsWith(
            String iscsiTargetIqnNotStartsWith) {

        this.iscsiTargetIqnNotStartsWith = iscsiTargetIqnNotStartsWith;
        return this;
    }

    /**
     * Get iscsiTargetIqnNotStartsWith
     *
     * @return iscsiTargetIqnNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnNotStartsWith() {
        return iscsiTargetIqnNotStartsWith;
    }

    public void setIscsiTargetIqnNotStartsWith(String iscsiTargetIqnNotStartsWith) {
        this.iscsiTargetIqnNotStartsWith = iscsiTargetIqnNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH);
        return this;
    }

    public void setIscsiTargetIqnNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH);
        }
    }

    public boolean getIscsiTargetIqnNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnStartsWith(
            String iscsiTargetIqnStartsWith) {

        this.iscsiTargetIqnStartsWith = iscsiTargetIqnStartsWith;
        return this;
    }

    /**
     * Get iscsiTargetIqnStartsWith
     *
     * @return iscsiTargetIqnStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiTargetIqnStartsWith() {
        return iscsiTargetIqnStartsWith;
    }

    public void setIscsiTargetIqnStartsWith(String iscsiTargetIqnStartsWith) {
        this.iscsiTargetIqnStartsWith = iscsiTargetIqnStartsWith;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput iscsiTargetIqnStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH);
        return this;
    }

    public void setIscsiTargetIqnStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH);
        }
    }

    public boolean getIscsiTargetIqnStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput name(String name) {

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

    public BackupStoreRepositoryWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupStoreRepositoryWhereInput name_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameContains(String nameContains) {

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

    public BackupStoreRepositoryWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameContains_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameEndsWith(String nameEndsWith) {

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

    public BackupStoreRepositoryWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameGt(String nameGt) {

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

    public BackupStoreRepositoryWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameGt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameGte(String nameGte) {

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

    public BackupStoreRepositoryWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameGte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNameInItem(String nameInItem) {
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

    public BackupStoreRepositoryWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameLt(String nameLt) {

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

    public BackupStoreRepositoryWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameLt_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameLte(String nameLte) {

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

    public BackupStoreRepositoryWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameLte_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameNot(String nameNot) {

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

    public BackupStoreRepositoryWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameNot_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameNotContains(String nameNotContains) {

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

    public BackupStoreRepositoryWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameNotContains_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public BackupStoreRepositoryWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNameNotInItem(String nameNotInItem) {
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

    public BackupStoreRepositoryWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameNotIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public BackupStoreRepositoryWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nameStartsWith(String nameStartsWith) {

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

    public BackupStoreRepositoryWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput nfsPath(String nfsPath) {

        this.nfsPath = nfsPath;
        return this;
    }

    /**
     * Get nfsPath
     *
     * @return nfsPath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPath() {
        return nfsPath;
    }

    public void setNfsPath(String nfsPath) {
        this.nfsPath = nfsPath;
    }

    public BackupStoreRepositoryWhereInput nfsPath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH);
        return this;
    }

    public void setNfsPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH);
        }
    }

    public boolean getNfsPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH);
    }

    public BackupStoreRepositoryWhereInput nfsPathContains(String nfsPathContains) {

        this.nfsPathContains = nfsPathContains;
        return this;
    }

    /**
     * Get nfsPathContains
     *
     * @return nfsPathContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathContains() {
        return nfsPathContains;
    }

    public void setNfsPathContains(String nfsPathContains) {
        this.nfsPathContains = nfsPathContains;
    }

    public BackupStoreRepositoryWhereInput nfsPathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_CONTAINS);
        return this;
    }

    public void setNfsPathContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_CONTAINS);
        }
    }

    public boolean getNfsPathContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput nfsPathEndsWith(String nfsPathEndsWith) {

        this.nfsPathEndsWith = nfsPathEndsWith;
        return this;
    }

    /**
     * Get nfsPathEndsWith
     *
     * @return nfsPathEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathEndsWith() {
        return nfsPathEndsWith;
    }

    public void setNfsPathEndsWith(String nfsPathEndsWith) {
        this.nfsPathEndsWith = nfsPathEndsWith;
    }

    public BackupStoreRepositoryWhereInput nfsPathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_ENDS_WITH);
        return this;
    }

    public void setNfsPathEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_ENDS_WITH);
        }
    }

    public boolean getNfsPathEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsPathGt(String nfsPathGt) {

        this.nfsPathGt = nfsPathGt;
        return this;
    }

    /**
     * Get nfsPathGt
     *
     * @return nfsPathGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathGt() {
        return nfsPathGt;
    }

    public void setNfsPathGt(String nfsPathGt) {
        this.nfsPathGt = nfsPathGt;
    }

    public BackupStoreRepositoryWhereInput nfsPathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_GT);
        return this;
    }

    public void setNfsPathGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_GT);
        }
    }

    public boolean getNfsPathGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_GT);
    }

    public BackupStoreRepositoryWhereInput nfsPathGte(String nfsPathGte) {

        this.nfsPathGte = nfsPathGte;
        return this;
    }

    /**
     * Get nfsPathGte
     *
     * @return nfsPathGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathGte() {
        return nfsPathGte;
    }

    public void setNfsPathGte(String nfsPathGte) {
        this.nfsPathGte = nfsPathGte;
    }

    public BackupStoreRepositoryWhereInput nfsPathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_GTE);
        return this;
    }

    public void setNfsPathGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_GTE);
        }
    }

    public boolean getNfsPathGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_GTE);
    }

    public BackupStoreRepositoryWhereInput nfsPathIn(List<String> nfsPathIn) {

        this.nfsPathIn = nfsPathIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNfsPathInItem(String nfsPathInItem) {
        if (this.nfsPathIn == null) {
            this.nfsPathIn = new ArrayList<String>();
        }
        this.nfsPathIn.add(nfsPathInItem);
        return this;
    }

    /**
     * Get nfsPathIn
     *
     * @return nfsPathIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNfsPathIn() {
        return nfsPathIn;
    }

    public void setNfsPathIn(List<String> nfsPathIn) {
        this.nfsPathIn = nfsPathIn;
    }

    public BackupStoreRepositoryWhereInput nfsPathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_IN);
        return this;
    }

    public void setNfsPathIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_IN);
        }
    }

    public boolean getNfsPathIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_IN);
    }

    public BackupStoreRepositoryWhereInput nfsPathLt(String nfsPathLt) {

        this.nfsPathLt = nfsPathLt;
        return this;
    }

    /**
     * Get nfsPathLt
     *
     * @return nfsPathLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathLt() {
        return nfsPathLt;
    }

    public void setNfsPathLt(String nfsPathLt) {
        this.nfsPathLt = nfsPathLt;
    }

    public BackupStoreRepositoryWhereInput nfsPathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_LT);
        return this;
    }

    public void setNfsPathLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_LT);
        }
    }

    public boolean getNfsPathLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_LT);
    }

    public BackupStoreRepositoryWhereInput nfsPathLte(String nfsPathLte) {

        this.nfsPathLte = nfsPathLte;
        return this;
    }

    /**
     * Get nfsPathLte
     *
     * @return nfsPathLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathLte() {
        return nfsPathLte;
    }

    public void setNfsPathLte(String nfsPathLte) {
        this.nfsPathLte = nfsPathLte;
    }

    public BackupStoreRepositoryWhereInput nfsPathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_LTE);
        return this;
    }

    public void setNfsPathLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_LTE);
        }
    }

    public boolean getNfsPathLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_LTE);
    }

    public BackupStoreRepositoryWhereInput nfsPathNot(String nfsPathNot) {

        this.nfsPathNot = nfsPathNot;
        return this;
    }

    /**
     * Get nfsPathNot
     *
     * @return nfsPathNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathNot() {
        return nfsPathNot;
    }

    public void setNfsPathNot(String nfsPathNot) {
        this.nfsPathNot = nfsPathNot;
    }

    public BackupStoreRepositoryWhereInput nfsPathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT);
        return this;
    }

    public void setNfsPathNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT);
        }
    }

    public boolean getNfsPathNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_NOT);
    }

    public BackupStoreRepositoryWhereInput nfsPathNotContains(String nfsPathNotContains) {

        this.nfsPathNotContains = nfsPathNotContains;
        return this;
    }

    /**
     * Get nfsPathNotContains
     *
     * @return nfsPathNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathNotContains() {
        return nfsPathNotContains;
    }

    public void setNfsPathNotContains(String nfsPathNotContains) {
        this.nfsPathNotContains = nfsPathNotContains;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS);
        return this;
    }

    public void setNfsPathNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS);
        }
    }

    public boolean getNfsPathNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput nfsPathNotEndsWith(String nfsPathNotEndsWith) {

        this.nfsPathNotEndsWith = nfsPathNotEndsWith;
        return this;
    }

    /**
     * Get nfsPathNotEndsWith
     *
     * @return nfsPathNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathNotEndsWith() {
        return nfsPathNotEndsWith;
    }

    public void setNfsPathNotEndsWith(String nfsPathNotEndsWith) {
        this.nfsPathNotEndsWith = nfsPathNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH);
        return this;
    }

    public void setNfsPathNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH);
        }
    }

    public boolean getNfsPathNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsPathNotIn(List<String> nfsPathNotIn) {

        this.nfsPathNotIn = nfsPathNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNfsPathNotInItem(String nfsPathNotInItem) {
        if (this.nfsPathNotIn == null) {
            this.nfsPathNotIn = new ArrayList<String>();
        }
        this.nfsPathNotIn.add(nfsPathNotInItem);
        return this;
    }

    /**
     * Get nfsPathNotIn
     *
     * @return nfsPathNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNfsPathNotIn() {
        return nfsPathNotIn;
    }

    public void setNfsPathNotIn(List<String> nfsPathNotIn) {
        this.nfsPathNotIn = nfsPathNotIn;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_IN);
        return this;
    }

    public void setNfsPathNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_IN);
        }
    }

    public boolean getNfsPathNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput nfsPathNotStartsWith(String nfsPathNotStartsWith) {

        this.nfsPathNotStartsWith = nfsPathNotStartsWith;
        return this;
    }

    /**
     * Get nfsPathNotStartsWith
     *
     * @return nfsPathNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathNotStartsWith() {
        return nfsPathNotStartsWith;
    }

    public void setNfsPathNotStartsWith(String nfsPathNotStartsWith) {
        this.nfsPathNotStartsWith = nfsPathNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH);
        return this;
    }

    public void setNfsPathNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH);
        }
    }

    public boolean getNfsPathNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsPathStartsWith(String nfsPathStartsWith) {

        this.nfsPathStartsWith = nfsPathStartsWith;
        return this;
    }

    /**
     * Get nfsPathStartsWith
     *
     * @return nfsPathStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsPathStartsWith() {
        return nfsPathStartsWith;
    }

    public void setNfsPathStartsWith(String nfsPathStartsWith) {
        this.nfsPathStartsWith = nfsPathStartsWith;
    }

    public BackupStoreRepositoryWhereInput nfsPathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsPathStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_STARTS_WITH);
        return this;
    }

    public void setNfsPathStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_PATH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_PATH_STARTS_WITH);
        }
    }

    public boolean getNfsPathStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_PATH_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsServer(String nfsServer) {

        this.nfsServer = nfsServer;
        return this;
    }

    /**
     * Get nfsServer
     *
     * @return nfsServer
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServer() {
        return nfsServer;
    }

    public void setNfsServer(String nfsServer) {
        this.nfsServer = nfsServer;
    }

    public BackupStoreRepositoryWhereInput nfsServer_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServer_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER);
        return this;
    }

    public void setNfsServer_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER);
        }
    }

    public boolean getNfsServer_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER);
    }

    public BackupStoreRepositoryWhereInput nfsServerContains(String nfsServerContains) {

        this.nfsServerContains = nfsServerContains;
        return this;
    }

    /**
     * Get nfsServerContains
     *
     * @return nfsServerContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerContains() {
        return nfsServerContains;
    }

    public void setNfsServerContains(String nfsServerContains) {
        this.nfsServerContains = nfsServerContains;
    }

    public BackupStoreRepositoryWhereInput nfsServerContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_CONTAINS);
        return this;
    }

    public void setNfsServerContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_CONTAINS);
        }
    }

    public boolean getNfsServerContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput nfsServerEndsWith(String nfsServerEndsWith) {

        this.nfsServerEndsWith = nfsServerEndsWith;
        return this;
    }

    /**
     * Get nfsServerEndsWith
     *
     * @return nfsServerEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerEndsWith() {
        return nfsServerEndsWith;
    }

    public void setNfsServerEndsWith(String nfsServerEndsWith) {
        this.nfsServerEndsWith = nfsServerEndsWith;
    }

    public BackupStoreRepositoryWhereInput nfsServerEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH);
        return this;
    }

    public void setNfsServerEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH);
        }
    }

    public boolean getNfsServerEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsServerGt(String nfsServerGt) {

        this.nfsServerGt = nfsServerGt;
        return this;
    }

    /**
     * Get nfsServerGt
     *
     * @return nfsServerGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerGt() {
        return nfsServerGt;
    }

    public void setNfsServerGt(String nfsServerGt) {
        this.nfsServerGt = nfsServerGt;
    }

    public BackupStoreRepositoryWhereInput nfsServerGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_GT);
        return this;
    }

    public void setNfsServerGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_GT);
        }
    }

    public boolean getNfsServerGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_GT);
    }

    public BackupStoreRepositoryWhereInput nfsServerGte(String nfsServerGte) {

        this.nfsServerGte = nfsServerGte;
        return this;
    }

    /**
     * Get nfsServerGte
     *
     * @return nfsServerGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerGte() {
        return nfsServerGte;
    }

    public void setNfsServerGte(String nfsServerGte) {
        this.nfsServerGte = nfsServerGte;
    }

    public BackupStoreRepositoryWhereInput nfsServerGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_GTE);
        return this;
    }

    public void setNfsServerGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_GTE);
        }
    }

    public boolean getNfsServerGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_GTE);
    }

    public BackupStoreRepositoryWhereInput nfsServerIn(List<String> nfsServerIn) {

        this.nfsServerIn = nfsServerIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNfsServerInItem(String nfsServerInItem) {
        if (this.nfsServerIn == null) {
            this.nfsServerIn = new ArrayList<String>();
        }
        this.nfsServerIn.add(nfsServerInItem);
        return this;
    }

    /**
     * Get nfsServerIn
     *
     * @return nfsServerIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNfsServerIn() {
        return nfsServerIn;
    }

    public void setNfsServerIn(List<String> nfsServerIn) {
        this.nfsServerIn = nfsServerIn;
    }

    public BackupStoreRepositoryWhereInput nfsServerIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_IN);
        return this;
    }

    public void setNfsServerIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_IN);
        }
    }

    public boolean getNfsServerIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_IN);
    }

    public BackupStoreRepositoryWhereInput nfsServerLt(String nfsServerLt) {

        this.nfsServerLt = nfsServerLt;
        return this;
    }

    /**
     * Get nfsServerLt
     *
     * @return nfsServerLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerLt() {
        return nfsServerLt;
    }

    public void setNfsServerLt(String nfsServerLt) {
        this.nfsServerLt = nfsServerLt;
    }

    public BackupStoreRepositoryWhereInput nfsServerLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_LT);
        return this;
    }

    public void setNfsServerLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_LT);
        }
    }

    public boolean getNfsServerLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_LT);
    }

    public BackupStoreRepositoryWhereInput nfsServerLte(String nfsServerLte) {

        this.nfsServerLte = nfsServerLte;
        return this;
    }

    /**
     * Get nfsServerLte
     *
     * @return nfsServerLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerLte() {
        return nfsServerLte;
    }

    public void setNfsServerLte(String nfsServerLte) {
        this.nfsServerLte = nfsServerLte;
    }

    public BackupStoreRepositoryWhereInput nfsServerLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_LTE);
        return this;
    }

    public void setNfsServerLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_LTE);
        }
    }

    public boolean getNfsServerLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_LTE);
    }

    public BackupStoreRepositoryWhereInput nfsServerNot(String nfsServerNot) {

        this.nfsServerNot = nfsServerNot;
        return this;
    }

    /**
     * Get nfsServerNot
     *
     * @return nfsServerNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerNot() {
        return nfsServerNot;
    }

    public void setNfsServerNot(String nfsServerNot) {
        this.nfsServerNot = nfsServerNot;
    }

    public BackupStoreRepositoryWhereInput nfsServerNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT);
        return this;
    }

    public void setNfsServerNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT);
        }
    }

    public boolean getNfsServerNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_NOT);
    }

    public BackupStoreRepositoryWhereInput nfsServerNotContains(String nfsServerNotContains) {

        this.nfsServerNotContains = nfsServerNotContains;
        return this;
    }

    /**
     * Get nfsServerNotContains
     *
     * @return nfsServerNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerNotContains() {
        return nfsServerNotContains;
    }

    public void setNfsServerNotContains(String nfsServerNotContains) {
        this.nfsServerNotContains = nfsServerNotContains;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS);
        return this;
    }

    public void setNfsServerNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS);
        }
    }

    public boolean getNfsServerNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput nfsServerNotEndsWith(String nfsServerNotEndsWith) {

        this.nfsServerNotEndsWith = nfsServerNotEndsWith;
        return this;
    }

    /**
     * Get nfsServerNotEndsWith
     *
     * @return nfsServerNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerNotEndsWith() {
        return nfsServerNotEndsWith;
    }

    public void setNfsServerNotEndsWith(String nfsServerNotEndsWith) {
        this.nfsServerNotEndsWith = nfsServerNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH);
        return this;
    }

    public void setNfsServerNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH);
        }
    }

    public boolean getNfsServerNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsServerNotIn(List<String> nfsServerNotIn) {

        this.nfsServerNotIn = nfsServerNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addNfsServerNotInItem(String nfsServerNotInItem) {
        if (this.nfsServerNotIn == null) {
            this.nfsServerNotIn = new ArrayList<String>();
        }
        this.nfsServerNotIn.add(nfsServerNotInItem);
        return this;
    }

    /**
     * Get nfsServerNotIn
     *
     * @return nfsServerNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNfsServerNotIn() {
        return nfsServerNotIn;
    }

    public void setNfsServerNotIn(List<String> nfsServerNotIn) {
        this.nfsServerNotIn = nfsServerNotIn;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_IN);
        return this;
    }

    public void setNfsServerNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_IN);
        }
    }

    public boolean getNfsServerNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput nfsServerNotStartsWith(String nfsServerNotStartsWith) {

        this.nfsServerNotStartsWith = nfsServerNotStartsWith;
        return this;
    }

    /**
     * Get nfsServerNotStartsWith
     *
     * @return nfsServerNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerNotStartsWith() {
        return nfsServerNotStartsWith;
    }

    public void setNfsServerNotStartsWith(String nfsServerNotStartsWith) {
        this.nfsServerNotStartsWith = nfsServerNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH);
        return this;
    }

    public void setNfsServerNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH);
        }
    }

    public boolean getNfsServerNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput nfsServerStartsWith(String nfsServerStartsWith) {

        this.nfsServerStartsWith = nfsServerStartsWith;
        return this;
    }

    /**
     * Get nfsServerStartsWith
     *
     * @return nfsServerStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNfsServerStartsWith() {
        return nfsServerStartsWith;
    }

    public void setNfsServerStartsWith(String nfsServerStartsWith) {
        this.nfsServerStartsWith = nfsServerStartsWith;
    }

    public BackupStoreRepositoryWhereInput nfsServerStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput nfsServerStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH);
        return this;
    }

    public void setNfsServerStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH);
        }
    }

    public boolean getNfsServerStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput status(BackupStoreStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupStoreStatus getStatus() {
        return status;
    }

    public void setStatus(BackupStoreStatus status) {
        this.status = status;
    }

    public BackupStoreRepositoryWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupStoreRepositoryWhereInput status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public BackupStoreRepositoryWhereInput statusIn(List<BackupStoreStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addStatusInItem(BackupStoreStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<BackupStoreStatus>();
        }
        this.statusIn.add(statusInItem);
        return this;
    }

    /**
     * Get statusIn
     *
     * @return statusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupStoreStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<BackupStoreStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public BackupStoreRepositoryWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput statusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public void setStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        }
    }

    public boolean getStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_IN);
    }

    public BackupStoreRepositoryWhereInput statusNot(BackupStoreStatus statusNot) {

        this.statusNot = statusNot;
        return this;
    }

    /**
     * Get statusNot
     *
     * @return statusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupStoreStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(BackupStoreStatus statusNot) {
        this.statusNot = statusNot;
    }

    public BackupStoreRepositoryWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput statusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public void setStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        }
    }

    public boolean getStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT);
    }

    public BackupStoreRepositoryWhereInput statusNotIn(List<BackupStoreStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addStatusNotInItem(BackupStoreStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<BackupStoreStatus>();
        }
        this.statusNotIn.add(statusNotInItem);
        return this;
    }

    /**
     * Get statusNotIn
     *
     * @return statusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupStoreStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<BackupStoreStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public BackupStoreRepositoryWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput statusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public void setStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        }
    }

    public boolean getStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput totalCapacity(Long totalCapacity) {

        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get totalCapacity
     *
     * @return totalCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public BackupStoreRepositoryWhereInput totalCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY);
        return this;
    }

    public void setTotalCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY);
        }
    }

    public boolean getTotalCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY);
    }

    public BackupStoreRepositoryWhereInput totalCapacityGt(Long totalCapacityGt) {

        this.totalCapacityGt = totalCapacityGt;
        return this;
    }

    /**
     * Get totalCapacityGt
     *
     * @return totalCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCapacityGt() {
        return totalCapacityGt;
    }

    public void setTotalCapacityGt(Long totalCapacityGt) {
        this.totalCapacityGt = totalCapacityGt;
    }

    public BackupStoreRepositoryWhereInput totalCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_GT);
        return this;
    }

    public void setTotalCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_GT);
        }
    }

    public boolean getTotalCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_GT);
    }

    public BackupStoreRepositoryWhereInput totalCapacityGte(Long totalCapacityGte) {

        this.totalCapacityGte = totalCapacityGte;
        return this;
    }

    /**
     * Get totalCapacityGte
     *
     * @return totalCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCapacityGte() {
        return totalCapacityGte;
    }

    public void setTotalCapacityGte(Long totalCapacityGte) {
        this.totalCapacityGte = totalCapacityGte;
    }

    public BackupStoreRepositoryWhereInput totalCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_GTE);
        return this;
    }

    public void setTotalCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_GTE);
        }
    }

    public boolean getTotalCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_GTE);
    }

    public BackupStoreRepositoryWhereInput totalCapacityIn(List<Long> totalCapacityIn) {

        this.totalCapacityIn = totalCapacityIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addTotalCapacityInItem(Long totalCapacityInItem) {
        if (this.totalCapacityIn == null) {
            this.totalCapacityIn = new ArrayList<Long>();
        }
        this.totalCapacityIn.add(totalCapacityInItem);
        return this;
    }

    /**
     * Get totalCapacityIn
     *
     * @return totalCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCapacityIn() {
        return totalCapacityIn;
    }

    public void setTotalCapacityIn(List<Long> totalCapacityIn) {
        this.totalCapacityIn = totalCapacityIn;
    }

    public BackupStoreRepositoryWhereInput totalCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_IN);
        return this;
    }

    public void setTotalCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_IN);
        }
    }

    public boolean getTotalCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_IN);
    }

    public BackupStoreRepositoryWhereInput totalCapacityLt(Long totalCapacityLt) {

        this.totalCapacityLt = totalCapacityLt;
        return this;
    }

    /**
     * Get totalCapacityLt
     *
     * @return totalCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCapacityLt() {
        return totalCapacityLt;
    }

    public void setTotalCapacityLt(Long totalCapacityLt) {
        this.totalCapacityLt = totalCapacityLt;
    }

    public BackupStoreRepositoryWhereInput totalCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_LT);
        return this;
    }

    public void setTotalCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_LT);
        }
    }

    public boolean getTotalCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_LT);
    }

    public BackupStoreRepositoryWhereInput totalCapacityLte(Long totalCapacityLte) {

        this.totalCapacityLte = totalCapacityLte;
        return this;
    }

    /**
     * Get totalCapacityLte
     *
     * @return totalCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCapacityLte() {
        return totalCapacityLte;
    }

    public void setTotalCapacityLte(Long totalCapacityLte) {
        this.totalCapacityLte = totalCapacityLte;
    }

    public BackupStoreRepositoryWhereInput totalCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_LTE);
        return this;
    }

    public void setTotalCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_LTE);
        }
    }

    public boolean getTotalCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_LTE);
    }

    public BackupStoreRepositoryWhereInput totalCapacityNot(Long totalCapacityNot) {

        this.totalCapacityNot = totalCapacityNot;
        return this;
    }

    /**
     * Get totalCapacityNot
     *
     * @return totalCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCapacityNot() {
        return totalCapacityNot;
    }

    public void setTotalCapacityNot(Long totalCapacityNot) {
        this.totalCapacityNot = totalCapacityNot;
    }

    public BackupStoreRepositoryWhereInput totalCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_NOT);
        return this;
    }

    public void setTotalCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_NOT);
        }
    }

    public boolean getTotalCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_NOT);
    }

    public BackupStoreRepositoryWhereInput totalCapacityNotIn(List<Long> totalCapacityNotIn) {

        this.totalCapacityNotIn = totalCapacityNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addTotalCapacityNotInItem(Long totalCapacityNotInItem) {
        if (this.totalCapacityNotIn == null) {
            this.totalCapacityNotIn = new ArrayList<Long>();
        }
        this.totalCapacityNotIn.add(totalCapacityNotInItem);
        return this;
    }

    /**
     * Get totalCapacityNotIn
     *
     * @return totalCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCapacityNotIn() {
        return totalCapacityNotIn;
    }

    public void setTotalCapacityNotIn(List<Long> totalCapacityNotIn) {
        this.totalCapacityNotIn = totalCapacityNotIn;
    }

    public BackupStoreRepositoryWhereInput totalCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput totalCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN);
        return this;
    }

    public void setTotalCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN);
        }
    }

    public boolean getTotalCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput type(BackupStoreType type) {

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
    public BackupStoreType getType() {
        return type;
    }

    public void setType(BackupStoreType type) {
        this.type = type;
    }

    public BackupStoreRepositoryWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupStoreRepositoryWhereInput type_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput typeIn(List<BackupStoreType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addTypeInItem(BackupStoreType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<BackupStoreType>();
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
    public List<BackupStoreType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<BackupStoreType> typeIn) {
        this.typeIn = typeIn;
    }

    public BackupStoreRepositoryWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput typeIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput typeNot(BackupStoreType typeNot) {

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
    public BackupStoreType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(BackupStoreType typeNot) {
        this.typeNot = typeNot;
    }

    public BackupStoreRepositoryWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput typeNot_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput typeNotIn(List<BackupStoreType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addTypeNotInItem(BackupStoreType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<BackupStoreType>();
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
    public List<BackupStoreType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<BackupStoreType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public BackupStoreRepositoryWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput typeNotIn_ExplictlyNonNull() {
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

    public BackupStoreRepositoryWhereInput updateTimestamp(String updateTimestamp) {

        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * Get updateTimestamp
     *
     * @return updateTimestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public BackupStoreRepositoryWhereInput updateTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestamp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        return this;
    }

    public void setUpdateTimestamp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP);
        }
    }

    public boolean getUpdateTimestamp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP);
    }

    public BackupStoreRepositoryWhereInput updateTimestampContains(String updateTimestampContains) {

        this.updateTimestampContains = updateTimestampContains;
        return this;
    }

    /**
     * Get updateTimestampContains
     *
     * @return updateTimestampContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampContains() {
        return updateTimestampContains;
    }

    public void setUpdateTimestampContains(String updateTimestampContains) {
        this.updateTimestampContains = updateTimestampContains;
    }

    public BackupStoreRepositoryWhereInput updateTimestampContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS);
        return this;
    }

    public void setUpdateTimestampContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS);
        }
    }

    public boolean getUpdateTimestampContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput updateTimestampEndsWith(String updateTimestampEndsWith) {

        this.updateTimestampEndsWith = updateTimestampEndsWith;
        return this;
    }

    /**
     * Get updateTimestampEndsWith
     *
     * @return updateTimestampEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampEndsWith() {
        return updateTimestampEndsWith;
    }

    public void setUpdateTimestampEndsWith(String updateTimestampEndsWith) {
        this.updateTimestampEndsWith = updateTimestampEndsWith;
    }

    public BackupStoreRepositoryWhereInput updateTimestampEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH);
        return this;
    }

    public void setUpdateTimestampEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH);
        }
    }

    public boolean getUpdateTimestampEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput updateTimestampGt(String updateTimestampGt) {

        this.updateTimestampGt = updateTimestampGt;
        return this;
    }

    /**
     * Get updateTimestampGt
     *
     * @return updateTimestampGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampGt() {
        return updateTimestampGt;
    }

    public void setUpdateTimestampGt(String updateTimestampGt) {
        this.updateTimestampGt = updateTimestampGt;
    }

    public BackupStoreRepositoryWhereInput updateTimestampGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT);
        return this;
    }

    public void setUpdateTimestampGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT);
        }
    }

    public boolean getUpdateTimestampGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT);
    }

    public BackupStoreRepositoryWhereInput updateTimestampGte(String updateTimestampGte) {

        this.updateTimestampGte = updateTimestampGte;
        return this;
    }

    /**
     * Get updateTimestampGte
     *
     * @return updateTimestampGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampGte() {
        return updateTimestampGte;
    }

    public void setUpdateTimestampGte(String updateTimestampGte) {
        this.updateTimestampGte = updateTimestampGte;
    }

    public BackupStoreRepositoryWhereInput updateTimestampGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE);
        return this;
    }

    public void setUpdateTimestampGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE);
        }
    }

    public boolean getUpdateTimestampGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE);
    }

    public BackupStoreRepositoryWhereInput updateTimestampIn(List<String> updateTimestampIn) {

        this.updateTimestampIn = updateTimestampIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addUpdateTimestampInItem(String updateTimestampInItem) {
        if (this.updateTimestampIn == null) {
            this.updateTimestampIn = new ArrayList<String>();
        }
        this.updateTimestampIn.add(updateTimestampInItem);
        return this;
    }

    /**
     * Get updateTimestampIn
     *
     * @return updateTimestampIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdateTimestampIn() {
        return updateTimestampIn;
    }

    public void setUpdateTimestampIn(List<String> updateTimestampIn) {
        this.updateTimestampIn = updateTimestampIn;
    }

    public BackupStoreRepositoryWhereInput updateTimestampIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN);
        return this;
    }

    public void setUpdateTimestampIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN);
        }
    }

    public boolean getUpdateTimestampIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN);
    }

    public BackupStoreRepositoryWhereInput updateTimestampLt(String updateTimestampLt) {

        this.updateTimestampLt = updateTimestampLt;
        return this;
    }

    /**
     * Get updateTimestampLt
     *
     * @return updateTimestampLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampLt() {
        return updateTimestampLt;
    }

    public void setUpdateTimestampLt(String updateTimestampLt) {
        this.updateTimestampLt = updateTimestampLt;
    }

    public BackupStoreRepositoryWhereInput updateTimestampLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT);
        return this;
    }

    public void setUpdateTimestampLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT);
        }
    }

    public boolean getUpdateTimestampLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT);
    }

    public BackupStoreRepositoryWhereInput updateTimestampLte(String updateTimestampLte) {

        this.updateTimestampLte = updateTimestampLte;
        return this;
    }

    /**
     * Get updateTimestampLte
     *
     * @return updateTimestampLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampLte() {
        return updateTimestampLte;
    }

    public void setUpdateTimestampLte(String updateTimestampLte) {
        this.updateTimestampLte = updateTimestampLte;
    }

    public BackupStoreRepositoryWhereInput updateTimestampLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE);
        return this;
    }

    public void setUpdateTimestampLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE);
        }
    }

    public boolean getUpdateTimestampLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE);
    }

    public BackupStoreRepositoryWhereInput updateTimestampNot(String updateTimestampNot) {

        this.updateTimestampNot = updateTimestampNot;
        return this;
    }

    /**
     * Get updateTimestampNot
     *
     * @return updateTimestampNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampNot() {
        return updateTimestampNot;
    }

    public void setUpdateTimestampNot(String updateTimestampNot) {
        this.updateTimestampNot = updateTimestampNot;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT);
        return this;
    }

    public void setUpdateTimestampNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT);
        }
    }

    public boolean getUpdateTimestampNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT);
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotContains(
            String updateTimestampNotContains) {

        this.updateTimestampNotContains = updateTimestampNotContains;
        return this;
    }

    /**
     * Get updateTimestampNotContains
     *
     * @return updateTimestampNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampNotContains() {
        return updateTimestampNotContains;
    }

    public void setUpdateTimestampNotContains(String updateTimestampNotContains) {
        this.updateTimestampNotContains = updateTimestampNotContains;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS);
        return this;
    }

    public void setUpdateTimestampNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS);
        }
    }

    public boolean getUpdateTimestampNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS);
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotEndsWith(
            String updateTimestampNotEndsWith) {

        this.updateTimestampNotEndsWith = updateTimestampNotEndsWith;
        return this;
    }

    /**
     * Get updateTimestampNotEndsWith
     *
     * @return updateTimestampNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampNotEndsWith() {
        return updateTimestampNotEndsWith;
    }

    public void setUpdateTimestampNotEndsWith(String updateTimestampNotEndsWith) {
        this.updateTimestampNotEndsWith = updateTimestampNotEndsWith;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH);
        return this;
    }

    public void setUpdateTimestampNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH);
        }
    }

    public boolean getUpdateTimestampNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH);
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotIn(List<String> updateTimestampNotIn) {

        this.updateTimestampNotIn = updateTimestampNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addUpdateTimestampNotInItem(
            String updateTimestampNotInItem) {
        if (this.updateTimestampNotIn == null) {
            this.updateTimestampNotIn = new ArrayList<String>();
        }
        this.updateTimestampNotIn.add(updateTimestampNotInItem);
        return this;
    }

    /**
     * Get updateTimestampNotIn
     *
     * @return updateTimestampNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdateTimestampNotIn() {
        return updateTimestampNotIn;
    }

    public void setUpdateTimestampNotIn(List<String> updateTimestampNotIn) {
        this.updateTimestampNotIn = updateTimestampNotIn;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN);
        return this;
    }

    public void setUpdateTimestampNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN);
        }
    }

    public boolean getUpdateTimestampNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotStartsWith(
            String updateTimestampNotStartsWith) {

        this.updateTimestampNotStartsWith = updateTimestampNotStartsWith;
        return this;
    }

    /**
     * Get updateTimestampNotStartsWith
     *
     * @return updateTimestampNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampNotStartsWith() {
        return updateTimestampNotStartsWith;
    }

    public void setUpdateTimestampNotStartsWith(String updateTimestampNotStartsWith) {
        this.updateTimestampNotStartsWith = updateTimestampNotStartsWith;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH);
        return this;
    }

    public void setUpdateTimestampNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH);
        }
    }

    public boolean getUpdateTimestampNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput updateTimestampStartsWith(
            String updateTimestampStartsWith) {

        this.updateTimestampStartsWith = updateTimestampStartsWith;
        return this;
    }

    /**
     * Get updateTimestampStartsWith
     *
     * @return updateTimestampStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimestampStartsWith() {
        return updateTimestampStartsWith;
    }

    public void setUpdateTimestampStartsWith(String updateTimestampStartsWith) {
        this.updateTimestampStartsWith = updateTimestampStartsWith;
    }

    public BackupStoreRepositoryWhereInput updateTimestampStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH);
        return this;
    }

    public BackupStoreRepositoryWhereInput updateTimestampStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH);
        return this;
    }

    public void setUpdateTimestampStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH);
        }
    }

    public boolean getUpdateTimestampStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH);
    }

    public BackupStoreRepositoryWhereInput usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public BackupStoreRepositoryWhereInput usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public void setUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        }
    }

    public boolean getUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {

        this.usedDataSpaceGt = usedDataSpaceGt;
        return this;
    }

    /**
     * Get usedDataSpaceGt
     *
     * @return usedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceGt() {
        return usedDataSpaceGt;
    }

    public void setUsedDataSpaceGt(Long usedDataSpaceGt) {
        this.usedDataSpaceGt = usedDataSpaceGt;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public void setUsedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        }
    }

    public boolean getUsedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_GT);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {

        this.usedDataSpaceGte = usedDataSpaceGte;
        return this;
    }

    /**
     * Get usedDataSpaceGte
     *
     * @return usedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceGte() {
        return usedDataSpaceGte;
    }

    public void setUsedDataSpaceGte(Long usedDataSpaceGte) {
        this.usedDataSpaceGte = usedDataSpaceGte;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public void setUsedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        }
    }

    public boolean getUsedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {

        this.usedDataSpaceIn = usedDataSpaceIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
        if (this.usedDataSpaceIn == null) {
            this.usedDataSpaceIn = new ArrayList<Long>();
        }
        this.usedDataSpaceIn.add(usedDataSpaceInItem);
        return this;
    }

    /**
     * Get usedDataSpaceIn
     *
     * @return usedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedDataSpaceIn() {
        return usedDataSpaceIn;
    }

    public void setUsedDataSpaceIn(List<Long> usedDataSpaceIn) {
        this.usedDataSpaceIn = usedDataSpaceIn;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public void setUsedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        }
    }

    public boolean getUsedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_IN);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {

        this.usedDataSpaceLt = usedDataSpaceLt;
        return this;
    }

    /**
     * Get usedDataSpaceLt
     *
     * @return usedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceLt() {
        return usedDataSpaceLt;
    }

    public void setUsedDataSpaceLt(Long usedDataSpaceLt) {
        this.usedDataSpaceLt = usedDataSpaceLt;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public void setUsedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        }
    }

    public boolean getUsedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_LT);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {

        this.usedDataSpaceLte = usedDataSpaceLte;
        return this;
    }

    /**
     * Get usedDataSpaceLte
     *
     * @return usedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceLte() {
        return usedDataSpaceLte;
    }

    public void setUsedDataSpaceLte(Long usedDataSpaceLte) {
        this.usedDataSpaceLte = usedDataSpaceLte;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public void setUsedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        }
    }

    public boolean getUsedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {

        this.usedDataSpaceNot = usedDataSpaceNot;
        return this;
    }

    /**
     * Get usedDataSpaceNot
     *
     * @return usedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceNot() {
        return usedDataSpaceNot;
    }

    public void setUsedDataSpaceNot(Long usedDataSpaceNot) {
        this.usedDataSpaceNot = usedDataSpaceNot;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public void setUsedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        }
    }

    public boolean getUsedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {

        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
        if (this.usedDataSpaceNotIn == null) {
            this.usedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.usedDataSpaceNotIn.add(usedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get usedDataSpaceNotIn
     *
     * @return usedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedDataSpaceNotIn() {
        return usedDataSpaceNotIn;
    }

    public void setUsedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setUsedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getUsedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsage(Double usedDataSpaceUsage) {

        this.usedDataSpaceUsage = usedDataSpaceUsage;
        return this;
    }

    /**
     * Get usedDataSpaceUsage
     *
     * @return usedDataSpaceUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsage() {
        return usedDataSpaceUsage;
    }

    public void setUsedDataSpaceUsage(Double usedDataSpaceUsage) {
        this.usedDataSpaceUsage = usedDataSpaceUsage;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        return this;
    }

    public void setUsedDataSpaceUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
        }
    }

    public boolean getUsedDataSpaceUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageGt(Double usedDataSpaceUsageGt) {

        this.usedDataSpaceUsageGt = usedDataSpaceUsageGt;
        return this;
    }

    /**
     * Get usedDataSpaceUsageGt
     *
     * @return usedDataSpaceUsageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsageGt() {
        return usedDataSpaceUsageGt;
    }

    public void setUsedDataSpaceUsageGt(Double usedDataSpaceUsageGt) {
        this.usedDataSpaceUsageGt = usedDataSpaceUsageGt;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT);
        return this;
    }

    public void setUsedDataSpaceUsageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT);
        }
    }

    public boolean getUsedDataSpaceUsageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageGte(Double usedDataSpaceUsageGte) {

        this.usedDataSpaceUsageGte = usedDataSpaceUsageGte;
        return this;
    }

    /**
     * Get usedDataSpaceUsageGte
     *
     * @return usedDataSpaceUsageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsageGte() {
        return usedDataSpaceUsageGte;
    }

    public void setUsedDataSpaceUsageGte(Double usedDataSpaceUsageGte) {
        this.usedDataSpaceUsageGte = usedDataSpaceUsageGte;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE);
        return this;
    }

    public void setUsedDataSpaceUsageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE);
        }
    }

    public boolean getUsedDataSpaceUsageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageIn(List<Double> usedDataSpaceUsageIn) {

        this.usedDataSpaceUsageIn = usedDataSpaceUsageIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addUsedDataSpaceUsageInItem(
            Double usedDataSpaceUsageInItem) {
        if (this.usedDataSpaceUsageIn == null) {
            this.usedDataSpaceUsageIn = new ArrayList<Double>();
        }
        this.usedDataSpaceUsageIn.add(usedDataSpaceUsageInItem);
        return this;
    }

    /**
     * Get usedDataSpaceUsageIn
     *
     * @return usedDataSpaceUsageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUsedDataSpaceUsageIn() {
        return usedDataSpaceUsageIn;
    }

    public void setUsedDataSpaceUsageIn(List<Double> usedDataSpaceUsageIn) {
        this.usedDataSpaceUsageIn = usedDataSpaceUsageIn;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN);
        return this;
    }

    public void setUsedDataSpaceUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN);
        }
    }

    public boolean getUsedDataSpaceUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageLt(Double usedDataSpaceUsageLt) {

        this.usedDataSpaceUsageLt = usedDataSpaceUsageLt;
        return this;
    }

    /**
     * Get usedDataSpaceUsageLt
     *
     * @return usedDataSpaceUsageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsageLt() {
        return usedDataSpaceUsageLt;
    }

    public void setUsedDataSpaceUsageLt(Double usedDataSpaceUsageLt) {
        this.usedDataSpaceUsageLt = usedDataSpaceUsageLt;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT);
        return this;
    }

    public void setUsedDataSpaceUsageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT);
        }
    }

    public boolean getUsedDataSpaceUsageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageLte(Double usedDataSpaceUsageLte) {

        this.usedDataSpaceUsageLte = usedDataSpaceUsageLte;
        return this;
    }

    /**
     * Get usedDataSpaceUsageLte
     *
     * @return usedDataSpaceUsageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsageLte() {
        return usedDataSpaceUsageLte;
    }

    public void setUsedDataSpaceUsageLte(Double usedDataSpaceUsageLte) {
        this.usedDataSpaceUsageLte = usedDataSpaceUsageLte;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE);
        return this;
    }

    public void setUsedDataSpaceUsageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE);
        }
    }

    public boolean getUsedDataSpaceUsageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageNot(Double usedDataSpaceUsageNot) {

        this.usedDataSpaceUsageNot = usedDataSpaceUsageNot;
        return this;
    }

    /**
     * Get usedDataSpaceUsageNot
     *
     * @return usedDataSpaceUsageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedDataSpaceUsageNot() {
        return usedDataSpaceUsageNot;
    }

    public void setUsedDataSpaceUsageNot(Double usedDataSpaceUsageNot) {
        this.usedDataSpaceUsageNot = usedDataSpaceUsageNot;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT);
        return this;
    }

    public void setUsedDataSpaceUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT);
        }
    }

    public boolean getUsedDataSpaceUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT);
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageNotIn(
            List<Double> usedDataSpaceUsageNotIn) {

        this.usedDataSpaceUsageNotIn = usedDataSpaceUsageNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addUsedDataSpaceUsageNotInItem(
            Double usedDataSpaceUsageNotInItem) {
        if (this.usedDataSpaceUsageNotIn == null) {
            this.usedDataSpaceUsageNotIn = new ArrayList<Double>();
        }
        this.usedDataSpaceUsageNotIn.add(usedDataSpaceUsageNotInItem);
        return this;
    }

    /**
     * Get usedDataSpaceUsageNotIn
     *
     * @return usedDataSpaceUsageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUsedDataSpaceUsageNotIn() {
        return usedDataSpaceUsageNotIn;
    }

    public void setUsedDataSpaceUsageNotIn(List<Double> usedDataSpaceUsageNotIn) {
        this.usedDataSpaceUsageNotIn = usedDataSpaceUsageNotIn;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput usedDataSpaceUsageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN);
        return this;
    }

    public void setUsedDataSpaceUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN);
        }
    }

    public boolean getUsedDataSpaceUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN);
    }

    public BackupStoreRepositoryWhereInput validDataSpace(Long validDataSpace) {

        this.validDataSpace = validDataSpace;
        return this;
    }

    /**
     * Get validDataSpace
     *
     * @return validDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpace() {
        return validDataSpace;
    }

    public void setValidDataSpace(Long validDataSpace) {
        this.validDataSpace = validDataSpace;
    }

    public BackupStoreRepositoryWhereInput validDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public void setValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        }
    }

    public boolean getValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceGt(Long validDataSpaceGt) {

        this.validDataSpaceGt = validDataSpaceGt;
        return this;
    }

    /**
     * Get validDataSpaceGt
     *
     * @return validDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceGt() {
        return validDataSpaceGt;
    }

    public void setValidDataSpaceGt(Long validDataSpaceGt) {
        this.validDataSpaceGt = validDataSpaceGt;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        return this;
    }

    public void setValidDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        }
    }

    public boolean getValidDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceGte(Long validDataSpaceGte) {

        this.validDataSpaceGte = validDataSpaceGte;
        return this;
    }

    /**
     * Get validDataSpaceGte
     *
     * @return validDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceGte() {
        return validDataSpaceGte;
    }

    public void setValidDataSpaceGte(Long validDataSpaceGte) {
        this.validDataSpaceGte = validDataSpaceGte;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        return this;
    }

    public void setValidDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        }
    }

    public boolean getValidDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceIn(List<Long> validDataSpaceIn) {

        this.validDataSpaceIn = validDataSpaceIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addValidDataSpaceInItem(Long validDataSpaceInItem) {
        if (this.validDataSpaceIn == null) {
            this.validDataSpaceIn = new ArrayList<Long>();
        }
        this.validDataSpaceIn.add(validDataSpaceInItem);
        return this;
    }

    /**
     * Get validDataSpaceIn
     *
     * @return validDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidDataSpaceIn() {
        return validDataSpaceIn;
    }

    public void setValidDataSpaceIn(List<Long> validDataSpaceIn) {
        this.validDataSpaceIn = validDataSpaceIn;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        return this;
    }

    public void setValidDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        }
    }

    public boolean getValidDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceLt(Long validDataSpaceLt) {

        this.validDataSpaceLt = validDataSpaceLt;
        return this;
    }

    /**
     * Get validDataSpaceLt
     *
     * @return validDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceLt() {
        return validDataSpaceLt;
    }

    public void setValidDataSpaceLt(Long validDataSpaceLt) {
        this.validDataSpaceLt = validDataSpaceLt;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        return this;
    }

    public void setValidDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        }
    }

    public boolean getValidDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceLte(Long validDataSpaceLte) {

        this.validDataSpaceLte = validDataSpaceLte;
        return this;
    }

    /**
     * Get validDataSpaceLte
     *
     * @return validDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceLte() {
        return validDataSpaceLte;
    }

    public void setValidDataSpaceLte(Long validDataSpaceLte) {
        this.validDataSpaceLte = validDataSpaceLte;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        return this;
    }

    public void setValidDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        }
    }

    public boolean getValidDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceNot(Long validDataSpaceNot) {

        this.validDataSpaceNot = validDataSpaceNot;
        return this;
    }

    /**
     * Get validDataSpaceNot
     *
     * @return validDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceNot() {
        return validDataSpaceNot;
    }

    public void setValidDataSpaceNot(Long validDataSpaceNot) {
        this.validDataSpaceNot = validDataSpaceNot;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        return this;
    }

    public void setValidDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        }
    }

    public boolean getValidDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
    }

    public BackupStoreRepositoryWhereInput validDataSpaceNotIn(List<Long> validDataSpaceNotIn) {

        this.validDataSpaceNotIn = validDataSpaceNotIn;
        return this;
    }

    public BackupStoreRepositoryWhereInput addValidDataSpaceNotInItem(
            Long validDataSpaceNotInItem) {
        if (this.validDataSpaceNotIn == null) {
            this.validDataSpaceNotIn = new ArrayList<Long>();
        }
        this.validDataSpaceNotIn.add(validDataSpaceNotInItem);
        return this;
    }

    /**
     * Get validDataSpaceNotIn
     *
     * @return validDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidDataSpaceNotIn() {
        return validDataSpaceNotIn;
    }

    public void setValidDataSpaceNotIn(List<Long> validDataSpaceNotIn) {
        this.validDataSpaceNotIn = validDataSpaceNotIn;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public BackupStoreRepositoryWhereInput validDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setValidDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getValidDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupStoreRepositoryWhereInput backupStoreRepositoryWhereInput =
                (BackupStoreRepositoryWhereInput) o;
        return Objects.equals(this.AND, backupStoreRepositoryWhereInput.AND)
                && Objects.equals(this.NOT, backupStoreRepositoryWhereInput.NOT)
                && Objects.equals(this.OR, backupStoreRepositoryWhereInput.OR)
                && Objects.equals(
                        this.backupPlansEvery, backupStoreRepositoryWhereInput.backupPlansEvery)
                && Objects.equals(
                        this.backupPlansNone, backupStoreRepositoryWhereInput.backupPlansNone)
                && Objects.equals(
                        this.backupPlansSome, backupStoreRepositoryWhereInput.backupPlansSome)
                && Objects.equals(
                        this.backupRestorePointsEvery,
                        backupStoreRepositoryWhereInput.backupRestorePointsEvery)
                && Objects.equals(
                        this.backupRestorePointsNone,
                        backupStoreRepositoryWhereInput.backupRestorePointsNone)
                && Objects.equals(
                        this.backupRestorePointsSome,
                        backupStoreRepositoryWhereInput.backupRestorePointsSome)
                && Objects.equals(this.backupService, backupStoreRepositoryWhereInput.backupService)
                && Objects.equals(this.createdAt, backupStoreRepositoryWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, backupStoreRepositoryWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, backupStoreRepositoryWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, backupStoreRepositoryWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, backupStoreRepositoryWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, backupStoreRepositoryWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, backupStoreRepositoryWhereInput.createdAtNot)
                && Objects.equals(
                        this.createdAtNotIn, backupStoreRepositoryWhereInput.createdAtNotIn)
                && Objects.equals(this.description, backupStoreRepositoryWhereInput.description)
                && Objects.equals(
                        this.descriptionContains,
                        backupStoreRepositoryWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith,
                        backupStoreRepositoryWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, backupStoreRepositoryWhereInput.descriptionGt)
                && Objects.equals(
                        this.descriptionGte, backupStoreRepositoryWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, backupStoreRepositoryWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, backupStoreRepositoryWhereInput.descriptionLt)
                && Objects.equals(
                        this.descriptionLte, backupStoreRepositoryWhereInput.descriptionLte)
                && Objects.equals(
                        this.descriptionNot, backupStoreRepositoryWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        backupStoreRepositoryWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        backupStoreRepositoryWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, backupStoreRepositoryWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        backupStoreRepositoryWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        backupStoreRepositoryWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus, backupStoreRepositoryWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        backupStoreRepositoryWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        backupStoreRepositoryWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        backupStoreRepositoryWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.errorCode, backupStoreRepositoryWhereInput.errorCode)
                && Objects.equals(
                        this.errorCodeContains, backupStoreRepositoryWhereInput.errorCodeContains)
                && Objects.equals(
                        this.errorCodeEndsWith, backupStoreRepositoryWhereInput.errorCodeEndsWith)
                && Objects.equals(this.errorCodeGt, backupStoreRepositoryWhereInput.errorCodeGt)
                && Objects.equals(this.errorCodeGte, backupStoreRepositoryWhereInput.errorCodeGte)
                && Objects.equals(this.errorCodeIn, backupStoreRepositoryWhereInput.errorCodeIn)
                && Objects.equals(this.errorCodeLt, backupStoreRepositoryWhereInput.errorCodeLt)
                && Objects.equals(this.errorCodeLte, backupStoreRepositoryWhereInput.errorCodeLte)
                && Objects.equals(this.errorCodeNot, backupStoreRepositoryWhereInput.errorCodeNot)
                && Objects.equals(
                        this.errorCodeNotContains,
                        backupStoreRepositoryWhereInput.errorCodeNotContains)
                && Objects.equals(
                        this.errorCodeNotEndsWith,
                        backupStoreRepositoryWhereInput.errorCodeNotEndsWith)
                && Objects.equals(
                        this.errorCodeNotIn, backupStoreRepositoryWhereInput.errorCodeNotIn)
                && Objects.equals(
                        this.errorCodeNotStartsWith,
                        backupStoreRepositoryWhereInput.errorCodeNotStartsWith)
                && Objects.equals(
                        this.errorCodeStartsWith,
                        backupStoreRepositoryWhereInput.errorCodeStartsWith)
                && Objects.equals(this.id, backupStoreRepositoryWhereInput.id)
                && Objects.equals(this.idContains, backupStoreRepositoryWhereInput.idContains)
                && Objects.equals(this.idEndsWith, backupStoreRepositoryWhereInput.idEndsWith)
                && Objects.equals(this.idGt, backupStoreRepositoryWhereInput.idGt)
                && Objects.equals(this.idGte, backupStoreRepositoryWhereInput.idGte)
                && Objects.equals(this.idIn, backupStoreRepositoryWhereInput.idIn)
                && Objects.equals(this.idLt, backupStoreRepositoryWhereInput.idLt)
                && Objects.equals(this.idLte, backupStoreRepositoryWhereInput.idLte)
                && Objects.equals(this.idNot, backupStoreRepositoryWhereInput.idNot)
                && Objects.equals(this.idNotContains, backupStoreRepositoryWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, backupStoreRepositoryWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, backupStoreRepositoryWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, backupStoreRepositoryWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, backupStoreRepositoryWhereInput.idStartsWith)
                && Objects.equals(this.iscsiChapName, backupStoreRepositoryWhereInput.iscsiChapName)
                && Objects.equals(
                        this.iscsiChapNameContains,
                        backupStoreRepositoryWhereInput.iscsiChapNameContains)
                && Objects.equals(
                        this.iscsiChapNameEndsWith,
                        backupStoreRepositoryWhereInput.iscsiChapNameEndsWith)
                && Objects.equals(
                        this.iscsiChapNameGt, backupStoreRepositoryWhereInput.iscsiChapNameGt)
                && Objects.equals(
                        this.iscsiChapNameGte, backupStoreRepositoryWhereInput.iscsiChapNameGte)
                && Objects.equals(
                        this.iscsiChapNameIn, backupStoreRepositoryWhereInput.iscsiChapNameIn)
                && Objects.equals(
                        this.iscsiChapNameLt, backupStoreRepositoryWhereInput.iscsiChapNameLt)
                && Objects.equals(
                        this.iscsiChapNameLte, backupStoreRepositoryWhereInput.iscsiChapNameLte)
                && Objects.equals(
                        this.iscsiChapNameNot, backupStoreRepositoryWhereInput.iscsiChapNameNot)
                && Objects.equals(
                        this.iscsiChapNameNotContains,
                        backupStoreRepositoryWhereInput.iscsiChapNameNotContains)
                && Objects.equals(
                        this.iscsiChapNameNotEndsWith,
                        backupStoreRepositoryWhereInput.iscsiChapNameNotEndsWith)
                && Objects.equals(
                        this.iscsiChapNameNotIn, backupStoreRepositoryWhereInput.iscsiChapNameNotIn)
                && Objects.equals(
                        this.iscsiChapNameNotStartsWith,
                        backupStoreRepositoryWhereInput.iscsiChapNameNotStartsWith)
                && Objects.equals(
                        this.iscsiChapNameStartsWith,
                        backupStoreRepositoryWhereInput.iscsiChapNameStartsWith)
                && Objects.equals(
                        this.iscsiChapSecret, backupStoreRepositoryWhereInput.iscsiChapSecret)
                && Objects.equals(
                        this.iscsiChapSecretContains,
                        backupStoreRepositoryWhereInput.iscsiChapSecretContains)
                && Objects.equals(
                        this.iscsiChapSecretEndsWith,
                        backupStoreRepositoryWhereInput.iscsiChapSecretEndsWith)
                && Objects.equals(
                        this.iscsiChapSecretGt, backupStoreRepositoryWhereInput.iscsiChapSecretGt)
                && Objects.equals(
                        this.iscsiChapSecretGte, backupStoreRepositoryWhereInput.iscsiChapSecretGte)
                && Objects.equals(
                        this.iscsiChapSecretIn, backupStoreRepositoryWhereInput.iscsiChapSecretIn)
                && Objects.equals(
                        this.iscsiChapSecretLt, backupStoreRepositoryWhereInput.iscsiChapSecretLt)
                && Objects.equals(
                        this.iscsiChapSecretLte, backupStoreRepositoryWhereInput.iscsiChapSecretLte)
                && Objects.equals(
                        this.iscsiChapSecretNot, backupStoreRepositoryWhereInput.iscsiChapSecretNot)
                && Objects.equals(
                        this.iscsiChapSecretNotContains,
                        backupStoreRepositoryWhereInput.iscsiChapSecretNotContains)
                && Objects.equals(
                        this.iscsiChapSecretNotEndsWith,
                        backupStoreRepositoryWhereInput.iscsiChapSecretNotEndsWith)
                && Objects.equals(
                        this.iscsiChapSecretNotIn,
                        backupStoreRepositoryWhereInput.iscsiChapSecretNotIn)
                && Objects.equals(
                        this.iscsiChapSecretNotStartsWith,
                        backupStoreRepositoryWhereInput.iscsiChapSecretNotStartsWith)
                && Objects.equals(
                        this.iscsiChapSecretStartsWith,
                        backupStoreRepositoryWhereInput.iscsiChapSecretStartsWith)
                && Objects.equals(this.iscsiIp, backupStoreRepositoryWhereInput.iscsiIp)
                && Objects.equals(
                        this.iscsiIpContains, backupStoreRepositoryWhereInput.iscsiIpContains)
                && Objects.equals(
                        this.iscsiIpEndsWith, backupStoreRepositoryWhereInput.iscsiIpEndsWith)
                && Objects.equals(this.iscsiIpGt, backupStoreRepositoryWhereInput.iscsiIpGt)
                && Objects.equals(this.iscsiIpGte, backupStoreRepositoryWhereInput.iscsiIpGte)
                && Objects.equals(this.iscsiIpIn, backupStoreRepositoryWhereInput.iscsiIpIn)
                && Objects.equals(this.iscsiIpLt, backupStoreRepositoryWhereInput.iscsiIpLt)
                && Objects.equals(this.iscsiIpLte, backupStoreRepositoryWhereInput.iscsiIpLte)
                && Objects.equals(this.iscsiIpNot, backupStoreRepositoryWhereInput.iscsiIpNot)
                && Objects.equals(
                        this.iscsiIpNotContains, backupStoreRepositoryWhereInput.iscsiIpNotContains)
                && Objects.equals(
                        this.iscsiIpNotEndsWith, backupStoreRepositoryWhereInput.iscsiIpNotEndsWith)
                && Objects.equals(this.iscsiIpNotIn, backupStoreRepositoryWhereInput.iscsiIpNotIn)
                && Objects.equals(
                        this.iscsiIpNotStartsWith,
                        backupStoreRepositoryWhereInput.iscsiIpNotStartsWith)
                && Objects.equals(
                        this.iscsiIpStartsWith, backupStoreRepositoryWhereInput.iscsiIpStartsWith)
                && Objects.equals(this.iscsiLunId, backupStoreRepositoryWhereInput.iscsiLunId)
                && Objects.equals(
                        this.iscsiLunIdContains, backupStoreRepositoryWhereInput.iscsiLunIdContains)
                && Objects.equals(
                        this.iscsiLunIdEndsWith, backupStoreRepositoryWhereInput.iscsiLunIdEndsWith)
                && Objects.equals(this.iscsiLunIdGt, backupStoreRepositoryWhereInput.iscsiLunIdGt)
                && Objects.equals(this.iscsiLunIdGte, backupStoreRepositoryWhereInput.iscsiLunIdGte)
                && Objects.equals(this.iscsiLunIdIn, backupStoreRepositoryWhereInput.iscsiLunIdIn)
                && Objects.equals(this.iscsiLunIdLt, backupStoreRepositoryWhereInput.iscsiLunIdLt)
                && Objects.equals(this.iscsiLunIdLte, backupStoreRepositoryWhereInput.iscsiLunIdLte)
                && Objects.equals(this.iscsiLunIdNot, backupStoreRepositoryWhereInput.iscsiLunIdNot)
                && Objects.equals(
                        this.iscsiLunIdNotContains,
                        backupStoreRepositoryWhereInput.iscsiLunIdNotContains)
                && Objects.equals(
                        this.iscsiLunIdNotEndsWith,
                        backupStoreRepositoryWhereInput.iscsiLunIdNotEndsWith)
                && Objects.equals(
                        this.iscsiLunIdNotIn, backupStoreRepositoryWhereInput.iscsiLunIdNotIn)
                && Objects.equals(
                        this.iscsiLunIdNotStartsWith,
                        backupStoreRepositoryWhereInput.iscsiLunIdNotStartsWith)
                && Objects.equals(
                        this.iscsiLunIdStartsWith,
                        backupStoreRepositoryWhereInput.iscsiLunIdStartsWith)
                && Objects.equals(this.iscsiPort, backupStoreRepositoryWhereInput.iscsiPort)
                && Objects.equals(this.iscsiPortGt, backupStoreRepositoryWhereInput.iscsiPortGt)
                && Objects.equals(this.iscsiPortGte, backupStoreRepositoryWhereInput.iscsiPortGte)
                && Objects.equals(this.iscsiPortIn, backupStoreRepositoryWhereInput.iscsiPortIn)
                && Objects.equals(this.iscsiPortLt, backupStoreRepositoryWhereInput.iscsiPortLt)
                && Objects.equals(this.iscsiPortLte, backupStoreRepositoryWhereInput.iscsiPortLte)
                && Objects.equals(this.iscsiPortNot, backupStoreRepositoryWhereInput.iscsiPortNot)
                && Objects.equals(
                        this.iscsiPortNotIn, backupStoreRepositoryWhereInput.iscsiPortNotIn)
                && Objects.equals(
                        this.iscsiTargetIqn, backupStoreRepositoryWhereInput.iscsiTargetIqn)
                && Objects.equals(
                        this.iscsiTargetIqnContains,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnContains)
                && Objects.equals(
                        this.iscsiTargetIqnEndsWith,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnEndsWith)
                && Objects.equals(
                        this.iscsiTargetIqnGt, backupStoreRepositoryWhereInput.iscsiTargetIqnGt)
                && Objects.equals(
                        this.iscsiTargetIqnGte, backupStoreRepositoryWhereInput.iscsiTargetIqnGte)
                && Objects.equals(
                        this.iscsiTargetIqnIn, backupStoreRepositoryWhereInput.iscsiTargetIqnIn)
                && Objects.equals(
                        this.iscsiTargetIqnLt, backupStoreRepositoryWhereInput.iscsiTargetIqnLt)
                && Objects.equals(
                        this.iscsiTargetIqnLte, backupStoreRepositoryWhereInput.iscsiTargetIqnLte)
                && Objects.equals(
                        this.iscsiTargetIqnNot, backupStoreRepositoryWhereInput.iscsiTargetIqnNot)
                && Objects.equals(
                        this.iscsiTargetIqnNotContains,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnNotContains)
                && Objects.equals(
                        this.iscsiTargetIqnNotEndsWith,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnNotEndsWith)
                && Objects.equals(
                        this.iscsiTargetIqnNotIn,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnNotIn)
                && Objects.equals(
                        this.iscsiTargetIqnNotStartsWith,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnNotStartsWith)
                && Objects.equals(
                        this.iscsiTargetIqnStartsWith,
                        backupStoreRepositoryWhereInput.iscsiTargetIqnStartsWith)
                && Objects.equals(this.name, backupStoreRepositoryWhereInput.name)
                && Objects.equals(this.nameContains, backupStoreRepositoryWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, backupStoreRepositoryWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, backupStoreRepositoryWhereInput.nameGt)
                && Objects.equals(this.nameGte, backupStoreRepositoryWhereInput.nameGte)
                && Objects.equals(this.nameIn, backupStoreRepositoryWhereInput.nameIn)
                && Objects.equals(this.nameLt, backupStoreRepositoryWhereInput.nameLt)
                && Objects.equals(this.nameLte, backupStoreRepositoryWhereInput.nameLte)
                && Objects.equals(this.nameNot, backupStoreRepositoryWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, backupStoreRepositoryWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, backupStoreRepositoryWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, backupStoreRepositoryWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, backupStoreRepositoryWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, backupStoreRepositoryWhereInput.nameStartsWith)
                && Objects.equals(this.nfsPath, backupStoreRepositoryWhereInput.nfsPath)
                && Objects.equals(
                        this.nfsPathContains, backupStoreRepositoryWhereInput.nfsPathContains)
                && Objects.equals(
                        this.nfsPathEndsWith, backupStoreRepositoryWhereInput.nfsPathEndsWith)
                && Objects.equals(this.nfsPathGt, backupStoreRepositoryWhereInput.nfsPathGt)
                && Objects.equals(this.nfsPathGte, backupStoreRepositoryWhereInput.nfsPathGte)
                && Objects.equals(this.nfsPathIn, backupStoreRepositoryWhereInput.nfsPathIn)
                && Objects.equals(this.nfsPathLt, backupStoreRepositoryWhereInput.nfsPathLt)
                && Objects.equals(this.nfsPathLte, backupStoreRepositoryWhereInput.nfsPathLte)
                && Objects.equals(this.nfsPathNot, backupStoreRepositoryWhereInput.nfsPathNot)
                && Objects.equals(
                        this.nfsPathNotContains, backupStoreRepositoryWhereInput.nfsPathNotContains)
                && Objects.equals(
                        this.nfsPathNotEndsWith, backupStoreRepositoryWhereInput.nfsPathNotEndsWith)
                && Objects.equals(this.nfsPathNotIn, backupStoreRepositoryWhereInput.nfsPathNotIn)
                && Objects.equals(
                        this.nfsPathNotStartsWith,
                        backupStoreRepositoryWhereInput.nfsPathNotStartsWith)
                && Objects.equals(
                        this.nfsPathStartsWith, backupStoreRepositoryWhereInput.nfsPathStartsWith)
                && Objects.equals(this.nfsServer, backupStoreRepositoryWhereInput.nfsServer)
                && Objects.equals(
                        this.nfsServerContains, backupStoreRepositoryWhereInput.nfsServerContains)
                && Objects.equals(
                        this.nfsServerEndsWith, backupStoreRepositoryWhereInput.nfsServerEndsWith)
                && Objects.equals(this.nfsServerGt, backupStoreRepositoryWhereInput.nfsServerGt)
                && Objects.equals(this.nfsServerGte, backupStoreRepositoryWhereInput.nfsServerGte)
                && Objects.equals(this.nfsServerIn, backupStoreRepositoryWhereInput.nfsServerIn)
                && Objects.equals(this.nfsServerLt, backupStoreRepositoryWhereInput.nfsServerLt)
                && Objects.equals(this.nfsServerLte, backupStoreRepositoryWhereInput.nfsServerLte)
                && Objects.equals(this.nfsServerNot, backupStoreRepositoryWhereInput.nfsServerNot)
                && Objects.equals(
                        this.nfsServerNotContains,
                        backupStoreRepositoryWhereInput.nfsServerNotContains)
                && Objects.equals(
                        this.nfsServerNotEndsWith,
                        backupStoreRepositoryWhereInput.nfsServerNotEndsWith)
                && Objects.equals(
                        this.nfsServerNotIn, backupStoreRepositoryWhereInput.nfsServerNotIn)
                && Objects.equals(
                        this.nfsServerNotStartsWith,
                        backupStoreRepositoryWhereInput.nfsServerNotStartsWith)
                && Objects.equals(
                        this.nfsServerStartsWith,
                        backupStoreRepositoryWhereInput.nfsServerStartsWith)
                && Objects.equals(this.status, backupStoreRepositoryWhereInput.status)
                && Objects.equals(this.statusIn, backupStoreRepositoryWhereInput.statusIn)
                && Objects.equals(this.statusNot, backupStoreRepositoryWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, backupStoreRepositoryWhereInput.statusNotIn)
                && Objects.equals(this.totalCapacity, backupStoreRepositoryWhereInput.totalCapacity)
                && Objects.equals(
                        this.totalCapacityGt, backupStoreRepositoryWhereInput.totalCapacityGt)
                && Objects.equals(
                        this.totalCapacityGte, backupStoreRepositoryWhereInput.totalCapacityGte)
                && Objects.equals(
                        this.totalCapacityIn, backupStoreRepositoryWhereInput.totalCapacityIn)
                && Objects.equals(
                        this.totalCapacityLt, backupStoreRepositoryWhereInput.totalCapacityLt)
                && Objects.equals(
                        this.totalCapacityLte, backupStoreRepositoryWhereInput.totalCapacityLte)
                && Objects.equals(
                        this.totalCapacityNot, backupStoreRepositoryWhereInput.totalCapacityNot)
                && Objects.equals(
                        this.totalCapacityNotIn, backupStoreRepositoryWhereInput.totalCapacityNotIn)
                && Objects.equals(this.type, backupStoreRepositoryWhereInput.type)
                && Objects.equals(this.typeIn, backupStoreRepositoryWhereInput.typeIn)
                && Objects.equals(this.typeNot, backupStoreRepositoryWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, backupStoreRepositoryWhereInput.typeNotIn)
                && Objects.equals(
                        this.updateTimestamp, backupStoreRepositoryWhereInput.updateTimestamp)
                && Objects.equals(
                        this.updateTimestampContains,
                        backupStoreRepositoryWhereInput.updateTimestampContains)
                && Objects.equals(
                        this.updateTimestampEndsWith,
                        backupStoreRepositoryWhereInput.updateTimestampEndsWith)
                && Objects.equals(
                        this.updateTimestampGt, backupStoreRepositoryWhereInput.updateTimestampGt)
                && Objects.equals(
                        this.updateTimestampGte, backupStoreRepositoryWhereInput.updateTimestampGte)
                && Objects.equals(
                        this.updateTimestampIn, backupStoreRepositoryWhereInput.updateTimestampIn)
                && Objects.equals(
                        this.updateTimestampLt, backupStoreRepositoryWhereInput.updateTimestampLt)
                && Objects.equals(
                        this.updateTimestampLte, backupStoreRepositoryWhereInput.updateTimestampLte)
                && Objects.equals(
                        this.updateTimestampNot, backupStoreRepositoryWhereInput.updateTimestampNot)
                && Objects.equals(
                        this.updateTimestampNotContains,
                        backupStoreRepositoryWhereInput.updateTimestampNotContains)
                && Objects.equals(
                        this.updateTimestampNotEndsWith,
                        backupStoreRepositoryWhereInput.updateTimestampNotEndsWith)
                && Objects.equals(
                        this.updateTimestampNotIn,
                        backupStoreRepositoryWhereInput.updateTimestampNotIn)
                && Objects.equals(
                        this.updateTimestampNotStartsWith,
                        backupStoreRepositoryWhereInput.updateTimestampNotStartsWith)
                && Objects.equals(
                        this.updateTimestampStartsWith,
                        backupStoreRepositoryWhereInput.updateTimestampStartsWith)
                && Objects.equals(this.usedDataSpace, backupStoreRepositoryWhereInput.usedDataSpace)
                && Objects.equals(
                        this.usedDataSpaceGt, backupStoreRepositoryWhereInput.usedDataSpaceGt)
                && Objects.equals(
                        this.usedDataSpaceGte, backupStoreRepositoryWhereInput.usedDataSpaceGte)
                && Objects.equals(
                        this.usedDataSpaceIn, backupStoreRepositoryWhereInput.usedDataSpaceIn)
                && Objects.equals(
                        this.usedDataSpaceLt, backupStoreRepositoryWhereInput.usedDataSpaceLt)
                && Objects.equals(
                        this.usedDataSpaceLte, backupStoreRepositoryWhereInput.usedDataSpaceLte)
                && Objects.equals(
                        this.usedDataSpaceNot, backupStoreRepositoryWhereInput.usedDataSpaceNot)
                && Objects.equals(
                        this.usedDataSpaceNotIn, backupStoreRepositoryWhereInput.usedDataSpaceNotIn)
                && Objects.equals(
                        this.usedDataSpaceUsage, backupStoreRepositoryWhereInput.usedDataSpaceUsage)
                && Objects.equals(
                        this.usedDataSpaceUsageGt,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageGt)
                && Objects.equals(
                        this.usedDataSpaceUsageGte,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageGte)
                && Objects.equals(
                        this.usedDataSpaceUsageIn,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageIn)
                && Objects.equals(
                        this.usedDataSpaceUsageLt,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageLt)
                && Objects.equals(
                        this.usedDataSpaceUsageLte,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageLte)
                && Objects.equals(
                        this.usedDataSpaceUsageNot,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageNot)
                && Objects.equals(
                        this.usedDataSpaceUsageNotIn,
                        backupStoreRepositoryWhereInput.usedDataSpaceUsageNotIn)
                && Objects.equals(
                        this.validDataSpace, backupStoreRepositoryWhereInput.validDataSpace)
                && Objects.equals(
                        this.validDataSpaceGt, backupStoreRepositoryWhereInput.validDataSpaceGt)
                && Objects.equals(
                        this.validDataSpaceGte, backupStoreRepositoryWhereInput.validDataSpaceGte)
                && Objects.equals(
                        this.validDataSpaceIn, backupStoreRepositoryWhereInput.validDataSpaceIn)
                && Objects.equals(
                        this.validDataSpaceLt, backupStoreRepositoryWhereInput.validDataSpaceLt)
                && Objects.equals(
                        this.validDataSpaceLte, backupStoreRepositoryWhereInput.validDataSpaceLte)
                && Objects.equals(
                        this.validDataSpaceNot, backupStoreRepositoryWhereInput.validDataSpaceNot)
                && Objects.equals(
                        this.validDataSpaceNotIn,
                        backupStoreRepositoryWhereInput.validDataSpaceNotIn);
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
                backupPlansEvery,
                backupPlansNone,
                backupPlansSome,
                backupRestorePointsEvery,
                backupRestorePointsNone,
                backupRestorePointsSome,
                backupService,
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
                errorCode,
                errorCodeContains,
                errorCodeEndsWith,
                errorCodeGt,
                errorCodeGte,
                errorCodeIn,
                errorCodeLt,
                errorCodeLte,
                errorCodeNot,
                errorCodeNotContains,
                errorCodeNotEndsWith,
                errorCodeNotIn,
                errorCodeNotStartsWith,
                errorCodeStartsWith,
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
                iscsiChapName,
                iscsiChapNameContains,
                iscsiChapNameEndsWith,
                iscsiChapNameGt,
                iscsiChapNameGte,
                iscsiChapNameIn,
                iscsiChapNameLt,
                iscsiChapNameLte,
                iscsiChapNameNot,
                iscsiChapNameNotContains,
                iscsiChapNameNotEndsWith,
                iscsiChapNameNotIn,
                iscsiChapNameNotStartsWith,
                iscsiChapNameStartsWith,
                iscsiChapSecret,
                iscsiChapSecretContains,
                iscsiChapSecretEndsWith,
                iscsiChapSecretGt,
                iscsiChapSecretGte,
                iscsiChapSecretIn,
                iscsiChapSecretLt,
                iscsiChapSecretLte,
                iscsiChapSecretNot,
                iscsiChapSecretNotContains,
                iscsiChapSecretNotEndsWith,
                iscsiChapSecretNotIn,
                iscsiChapSecretNotStartsWith,
                iscsiChapSecretStartsWith,
                iscsiIp,
                iscsiIpContains,
                iscsiIpEndsWith,
                iscsiIpGt,
                iscsiIpGte,
                iscsiIpIn,
                iscsiIpLt,
                iscsiIpLte,
                iscsiIpNot,
                iscsiIpNotContains,
                iscsiIpNotEndsWith,
                iscsiIpNotIn,
                iscsiIpNotStartsWith,
                iscsiIpStartsWith,
                iscsiLunId,
                iscsiLunIdContains,
                iscsiLunIdEndsWith,
                iscsiLunIdGt,
                iscsiLunIdGte,
                iscsiLunIdIn,
                iscsiLunIdLt,
                iscsiLunIdLte,
                iscsiLunIdNot,
                iscsiLunIdNotContains,
                iscsiLunIdNotEndsWith,
                iscsiLunIdNotIn,
                iscsiLunIdNotStartsWith,
                iscsiLunIdStartsWith,
                iscsiPort,
                iscsiPortGt,
                iscsiPortGte,
                iscsiPortIn,
                iscsiPortLt,
                iscsiPortLte,
                iscsiPortNot,
                iscsiPortNotIn,
                iscsiTargetIqn,
                iscsiTargetIqnContains,
                iscsiTargetIqnEndsWith,
                iscsiTargetIqnGt,
                iscsiTargetIqnGte,
                iscsiTargetIqnIn,
                iscsiTargetIqnLt,
                iscsiTargetIqnLte,
                iscsiTargetIqnNot,
                iscsiTargetIqnNotContains,
                iscsiTargetIqnNotEndsWith,
                iscsiTargetIqnNotIn,
                iscsiTargetIqnNotStartsWith,
                iscsiTargetIqnStartsWith,
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
                nfsPath,
                nfsPathContains,
                nfsPathEndsWith,
                nfsPathGt,
                nfsPathGte,
                nfsPathIn,
                nfsPathLt,
                nfsPathLte,
                nfsPathNot,
                nfsPathNotContains,
                nfsPathNotEndsWith,
                nfsPathNotIn,
                nfsPathNotStartsWith,
                nfsPathStartsWith,
                nfsServer,
                nfsServerContains,
                nfsServerEndsWith,
                nfsServerGt,
                nfsServerGte,
                nfsServerIn,
                nfsServerLt,
                nfsServerLte,
                nfsServerNot,
                nfsServerNotContains,
                nfsServerNotEndsWith,
                nfsServerNotIn,
                nfsServerNotStartsWith,
                nfsServerStartsWith,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                totalCapacity,
                totalCapacityGt,
                totalCapacityGte,
                totalCapacityIn,
                totalCapacityLt,
                totalCapacityLte,
                totalCapacityNot,
                totalCapacityNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                updateTimestamp,
                updateTimestampContains,
                updateTimestampEndsWith,
                updateTimestampGt,
                updateTimestampGte,
                updateTimestampIn,
                updateTimestampLt,
                updateTimestampLte,
                updateTimestampNot,
                updateTimestampNotContains,
                updateTimestampNotEndsWith,
                updateTimestampNotIn,
                updateTimestampNotStartsWith,
                updateTimestampStartsWith,
                usedDataSpace,
                usedDataSpaceGt,
                usedDataSpaceGte,
                usedDataSpaceIn,
                usedDataSpaceLt,
                usedDataSpaceLte,
                usedDataSpaceNot,
                usedDataSpaceNotIn,
                usedDataSpaceUsage,
                usedDataSpaceUsageGt,
                usedDataSpaceUsageGte,
                usedDataSpaceUsageIn,
                usedDataSpaceUsageLt,
                usedDataSpaceUsageLte,
                usedDataSpaceUsageNot,
                usedDataSpaceUsageNotIn,
                validDataSpace,
                validDataSpaceGt,
                validDataSpaceGte,
                validDataSpaceIn,
                validDataSpaceLt,
                validDataSpaceLte,
                validDataSpaceNot,
                validDataSpaceNotIn);
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
        sb.append("class BackupStoreRepositoryWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    backupPlansEvery: ").append(toIndentedString(backupPlansEvery)).append("\n");
        sb.append("    backupPlansNone: ").append(toIndentedString(backupPlansNone)).append("\n");
        sb.append("    backupPlansSome: ").append(toIndentedString(backupPlansSome)).append("\n");
        sb.append("    backupRestorePointsEvery: ")
                .append(toIndentedString(backupRestorePointsEvery))
                .append("\n");
        sb.append("    backupRestorePointsNone: ")
                .append(toIndentedString(backupRestorePointsNone))
                .append("\n");
        sb.append("    backupRestorePointsSome: ")
                .append(toIndentedString(backupRestorePointsSome))
                .append("\n");
        sb.append("    backupService: ").append(toIndentedString(backupService)).append("\n");
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
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorCodeContains: ")
                .append(toIndentedString(errorCodeContains))
                .append("\n");
        sb.append("    errorCodeEndsWith: ")
                .append(toIndentedString(errorCodeEndsWith))
                .append("\n");
        sb.append("    errorCodeGt: ").append(toIndentedString(errorCodeGt)).append("\n");
        sb.append("    errorCodeGte: ").append(toIndentedString(errorCodeGte)).append("\n");
        sb.append("    errorCodeIn: ").append(toIndentedString(errorCodeIn)).append("\n");
        sb.append("    errorCodeLt: ").append(toIndentedString(errorCodeLt)).append("\n");
        sb.append("    errorCodeLte: ").append(toIndentedString(errorCodeLte)).append("\n");
        sb.append("    errorCodeNot: ").append(toIndentedString(errorCodeNot)).append("\n");
        sb.append("    errorCodeNotContains: ")
                .append(toIndentedString(errorCodeNotContains))
                .append("\n");
        sb.append("    errorCodeNotEndsWith: ")
                .append(toIndentedString(errorCodeNotEndsWith))
                .append("\n");
        sb.append("    errorCodeNotIn: ").append(toIndentedString(errorCodeNotIn)).append("\n");
        sb.append("    errorCodeNotStartsWith: ")
                .append(toIndentedString(errorCodeNotStartsWith))
                .append("\n");
        sb.append("    errorCodeStartsWith: ")
                .append(toIndentedString(errorCodeStartsWith))
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
        sb.append("    iscsiChapName: ").append(toIndentedString(iscsiChapName)).append("\n");
        sb.append("    iscsiChapNameContains: ")
                .append(toIndentedString(iscsiChapNameContains))
                .append("\n");
        sb.append("    iscsiChapNameEndsWith: ")
                .append(toIndentedString(iscsiChapNameEndsWith))
                .append("\n");
        sb.append("    iscsiChapNameGt: ").append(toIndentedString(iscsiChapNameGt)).append("\n");
        sb.append("    iscsiChapNameGte: ").append(toIndentedString(iscsiChapNameGte)).append("\n");
        sb.append("    iscsiChapNameIn: ").append(toIndentedString(iscsiChapNameIn)).append("\n");
        sb.append("    iscsiChapNameLt: ").append(toIndentedString(iscsiChapNameLt)).append("\n");
        sb.append("    iscsiChapNameLte: ").append(toIndentedString(iscsiChapNameLte)).append("\n");
        sb.append("    iscsiChapNameNot: ").append(toIndentedString(iscsiChapNameNot)).append("\n");
        sb.append("    iscsiChapNameNotContains: ")
                .append(toIndentedString(iscsiChapNameNotContains))
                .append("\n");
        sb.append("    iscsiChapNameNotEndsWith: ")
                .append(toIndentedString(iscsiChapNameNotEndsWith))
                .append("\n");
        sb.append("    iscsiChapNameNotIn: ")
                .append(toIndentedString(iscsiChapNameNotIn))
                .append("\n");
        sb.append("    iscsiChapNameNotStartsWith: ")
                .append(toIndentedString(iscsiChapNameNotStartsWith))
                .append("\n");
        sb.append("    iscsiChapNameStartsWith: ")
                .append(toIndentedString(iscsiChapNameStartsWith))
                .append("\n");
        sb.append("    iscsiChapSecret: ").append(toIndentedString(iscsiChapSecret)).append("\n");
        sb.append("    iscsiChapSecretContains: ")
                .append(toIndentedString(iscsiChapSecretContains))
                .append("\n");
        sb.append("    iscsiChapSecretEndsWith: ")
                .append(toIndentedString(iscsiChapSecretEndsWith))
                .append("\n");
        sb.append("    iscsiChapSecretGt: ")
                .append(toIndentedString(iscsiChapSecretGt))
                .append("\n");
        sb.append("    iscsiChapSecretGte: ")
                .append(toIndentedString(iscsiChapSecretGte))
                .append("\n");
        sb.append("    iscsiChapSecretIn: ")
                .append(toIndentedString(iscsiChapSecretIn))
                .append("\n");
        sb.append("    iscsiChapSecretLt: ")
                .append(toIndentedString(iscsiChapSecretLt))
                .append("\n");
        sb.append("    iscsiChapSecretLte: ")
                .append(toIndentedString(iscsiChapSecretLte))
                .append("\n");
        sb.append("    iscsiChapSecretNot: ")
                .append(toIndentedString(iscsiChapSecretNot))
                .append("\n");
        sb.append("    iscsiChapSecretNotContains: ")
                .append(toIndentedString(iscsiChapSecretNotContains))
                .append("\n");
        sb.append("    iscsiChapSecretNotEndsWith: ")
                .append(toIndentedString(iscsiChapSecretNotEndsWith))
                .append("\n");
        sb.append("    iscsiChapSecretNotIn: ")
                .append(toIndentedString(iscsiChapSecretNotIn))
                .append("\n");
        sb.append("    iscsiChapSecretNotStartsWith: ")
                .append(toIndentedString(iscsiChapSecretNotStartsWith))
                .append("\n");
        sb.append("    iscsiChapSecretStartsWith: ")
                .append(toIndentedString(iscsiChapSecretStartsWith))
                .append("\n");
        sb.append("    iscsiIp: ").append(toIndentedString(iscsiIp)).append("\n");
        sb.append("    iscsiIpContains: ").append(toIndentedString(iscsiIpContains)).append("\n");
        sb.append("    iscsiIpEndsWith: ").append(toIndentedString(iscsiIpEndsWith)).append("\n");
        sb.append("    iscsiIpGt: ").append(toIndentedString(iscsiIpGt)).append("\n");
        sb.append("    iscsiIpGte: ").append(toIndentedString(iscsiIpGte)).append("\n");
        sb.append("    iscsiIpIn: ").append(toIndentedString(iscsiIpIn)).append("\n");
        sb.append("    iscsiIpLt: ").append(toIndentedString(iscsiIpLt)).append("\n");
        sb.append("    iscsiIpLte: ").append(toIndentedString(iscsiIpLte)).append("\n");
        sb.append("    iscsiIpNot: ").append(toIndentedString(iscsiIpNot)).append("\n");
        sb.append("    iscsiIpNotContains: ")
                .append(toIndentedString(iscsiIpNotContains))
                .append("\n");
        sb.append("    iscsiIpNotEndsWith: ")
                .append(toIndentedString(iscsiIpNotEndsWith))
                .append("\n");
        sb.append("    iscsiIpNotIn: ").append(toIndentedString(iscsiIpNotIn)).append("\n");
        sb.append("    iscsiIpNotStartsWith: ")
                .append(toIndentedString(iscsiIpNotStartsWith))
                .append("\n");
        sb.append("    iscsiIpStartsWith: ")
                .append(toIndentedString(iscsiIpStartsWith))
                .append("\n");
        sb.append("    iscsiLunId: ").append(toIndentedString(iscsiLunId)).append("\n");
        sb.append("    iscsiLunIdContains: ")
                .append(toIndentedString(iscsiLunIdContains))
                .append("\n");
        sb.append("    iscsiLunIdEndsWith: ")
                .append(toIndentedString(iscsiLunIdEndsWith))
                .append("\n");
        sb.append("    iscsiLunIdGt: ").append(toIndentedString(iscsiLunIdGt)).append("\n");
        sb.append("    iscsiLunIdGte: ").append(toIndentedString(iscsiLunIdGte)).append("\n");
        sb.append("    iscsiLunIdIn: ").append(toIndentedString(iscsiLunIdIn)).append("\n");
        sb.append("    iscsiLunIdLt: ").append(toIndentedString(iscsiLunIdLt)).append("\n");
        sb.append("    iscsiLunIdLte: ").append(toIndentedString(iscsiLunIdLte)).append("\n");
        sb.append("    iscsiLunIdNot: ").append(toIndentedString(iscsiLunIdNot)).append("\n");
        sb.append("    iscsiLunIdNotContains: ")
                .append(toIndentedString(iscsiLunIdNotContains))
                .append("\n");
        sb.append("    iscsiLunIdNotEndsWith: ")
                .append(toIndentedString(iscsiLunIdNotEndsWith))
                .append("\n");
        sb.append("    iscsiLunIdNotIn: ").append(toIndentedString(iscsiLunIdNotIn)).append("\n");
        sb.append("    iscsiLunIdNotStartsWith: ")
                .append(toIndentedString(iscsiLunIdNotStartsWith))
                .append("\n");
        sb.append("    iscsiLunIdStartsWith: ")
                .append(toIndentedString(iscsiLunIdStartsWith))
                .append("\n");
        sb.append("    iscsiPort: ").append(toIndentedString(iscsiPort)).append("\n");
        sb.append("    iscsiPortGt: ").append(toIndentedString(iscsiPortGt)).append("\n");
        sb.append("    iscsiPortGte: ").append(toIndentedString(iscsiPortGte)).append("\n");
        sb.append("    iscsiPortIn: ").append(toIndentedString(iscsiPortIn)).append("\n");
        sb.append("    iscsiPortLt: ").append(toIndentedString(iscsiPortLt)).append("\n");
        sb.append("    iscsiPortLte: ").append(toIndentedString(iscsiPortLte)).append("\n");
        sb.append("    iscsiPortNot: ").append(toIndentedString(iscsiPortNot)).append("\n");
        sb.append("    iscsiPortNotIn: ").append(toIndentedString(iscsiPortNotIn)).append("\n");
        sb.append("    iscsiTargetIqn: ").append(toIndentedString(iscsiTargetIqn)).append("\n");
        sb.append("    iscsiTargetIqnContains: ")
                .append(toIndentedString(iscsiTargetIqnContains))
                .append("\n");
        sb.append("    iscsiTargetIqnEndsWith: ")
                .append(toIndentedString(iscsiTargetIqnEndsWith))
                .append("\n");
        sb.append("    iscsiTargetIqnGt: ").append(toIndentedString(iscsiTargetIqnGt)).append("\n");
        sb.append("    iscsiTargetIqnGte: ")
                .append(toIndentedString(iscsiTargetIqnGte))
                .append("\n");
        sb.append("    iscsiTargetIqnIn: ").append(toIndentedString(iscsiTargetIqnIn)).append("\n");
        sb.append("    iscsiTargetIqnLt: ").append(toIndentedString(iscsiTargetIqnLt)).append("\n");
        sb.append("    iscsiTargetIqnLte: ")
                .append(toIndentedString(iscsiTargetIqnLte))
                .append("\n");
        sb.append("    iscsiTargetIqnNot: ")
                .append(toIndentedString(iscsiTargetIqnNot))
                .append("\n");
        sb.append("    iscsiTargetIqnNotContains: ")
                .append(toIndentedString(iscsiTargetIqnNotContains))
                .append("\n");
        sb.append("    iscsiTargetIqnNotEndsWith: ")
                .append(toIndentedString(iscsiTargetIqnNotEndsWith))
                .append("\n");
        sb.append("    iscsiTargetIqnNotIn: ")
                .append(toIndentedString(iscsiTargetIqnNotIn))
                .append("\n");
        sb.append("    iscsiTargetIqnNotStartsWith: ")
                .append(toIndentedString(iscsiTargetIqnNotStartsWith))
                .append("\n");
        sb.append("    iscsiTargetIqnStartsWith: ")
                .append(toIndentedString(iscsiTargetIqnStartsWith))
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
        sb.append("    nfsPath: ").append(toIndentedString(nfsPath)).append("\n");
        sb.append("    nfsPathContains: ").append(toIndentedString(nfsPathContains)).append("\n");
        sb.append("    nfsPathEndsWith: ").append(toIndentedString(nfsPathEndsWith)).append("\n");
        sb.append("    nfsPathGt: ").append(toIndentedString(nfsPathGt)).append("\n");
        sb.append("    nfsPathGte: ").append(toIndentedString(nfsPathGte)).append("\n");
        sb.append("    nfsPathIn: ").append(toIndentedString(nfsPathIn)).append("\n");
        sb.append("    nfsPathLt: ").append(toIndentedString(nfsPathLt)).append("\n");
        sb.append("    nfsPathLte: ").append(toIndentedString(nfsPathLte)).append("\n");
        sb.append("    nfsPathNot: ").append(toIndentedString(nfsPathNot)).append("\n");
        sb.append("    nfsPathNotContains: ")
                .append(toIndentedString(nfsPathNotContains))
                .append("\n");
        sb.append("    nfsPathNotEndsWith: ")
                .append(toIndentedString(nfsPathNotEndsWith))
                .append("\n");
        sb.append("    nfsPathNotIn: ").append(toIndentedString(nfsPathNotIn)).append("\n");
        sb.append("    nfsPathNotStartsWith: ")
                .append(toIndentedString(nfsPathNotStartsWith))
                .append("\n");
        sb.append("    nfsPathStartsWith: ")
                .append(toIndentedString(nfsPathStartsWith))
                .append("\n");
        sb.append("    nfsServer: ").append(toIndentedString(nfsServer)).append("\n");
        sb.append("    nfsServerContains: ")
                .append(toIndentedString(nfsServerContains))
                .append("\n");
        sb.append("    nfsServerEndsWith: ")
                .append(toIndentedString(nfsServerEndsWith))
                .append("\n");
        sb.append("    nfsServerGt: ").append(toIndentedString(nfsServerGt)).append("\n");
        sb.append("    nfsServerGte: ").append(toIndentedString(nfsServerGte)).append("\n");
        sb.append("    nfsServerIn: ").append(toIndentedString(nfsServerIn)).append("\n");
        sb.append("    nfsServerLt: ").append(toIndentedString(nfsServerLt)).append("\n");
        sb.append("    nfsServerLte: ").append(toIndentedString(nfsServerLte)).append("\n");
        sb.append("    nfsServerNot: ").append(toIndentedString(nfsServerNot)).append("\n");
        sb.append("    nfsServerNotContains: ")
                .append(toIndentedString(nfsServerNotContains))
                .append("\n");
        sb.append("    nfsServerNotEndsWith: ")
                .append(toIndentedString(nfsServerNotEndsWith))
                .append("\n");
        sb.append("    nfsServerNotIn: ").append(toIndentedString(nfsServerNotIn)).append("\n");
        sb.append("    nfsServerNotStartsWith: ")
                .append(toIndentedString(nfsServerNotStartsWith))
                .append("\n");
        sb.append("    nfsServerStartsWith: ")
                .append(toIndentedString(nfsServerStartsWith))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
        sb.append("    totalCapacityGt: ").append(toIndentedString(totalCapacityGt)).append("\n");
        sb.append("    totalCapacityGte: ").append(toIndentedString(totalCapacityGte)).append("\n");
        sb.append("    totalCapacityIn: ").append(toIndentedString(totalCapacityIn)).append("\n");
        sb.append("    totalCapacityLt: ").append(toIndentedString(totalCapacityLt)).append("\n");
        sb.append("    totalCapacityLte: ").append(toIndentedString(totalCapacityLte)).append("\n");
        sb.append("    totalCapacityNot: ").append(toIndentedString(totalCapacityNot)).append("\n");
        sb.append("    totalCapacityNotIn: ")
                .append(toIndentedString(totalCapacityNotIn))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    updateTimestampContains: ")
                .append(toIndentedString(updateTimestampContains))
                .append("\n");
        sb.append("    updateTimestampEndsWith: ")
                .append(toIndentedString(updateTimestampEndsWith))
                .append("\n");
        sb.append("    updateTimestampGt: ")
                .append(toIndentedString(updateTimestampGt))
                .append("\n");
        sb.append("    updateTimestampGte: ")
                .append(toIndentedString(updateTimestampGte))
                .append("\n");
        sb.append("    updateTimestampIn: ")
                .append(toIndentedString(updateTimestampIn))
                .append("\n");
        sb.append("    updateTimestampLt: ")
                .append(toIndentedString(updateTimestampLt))
                .append("\n");
        sb.append("    updateTimestampLte: ")
                .append(toIndentedString(updateTimestampLte))
                .append("\n");
        sb.append("    updateTimestampNot: ")
                .append(toIndentedString(updateTimestampNot))
                .append("\n");
        sb.append("    updateTimestampNotContains: ")
                .append(toIndentedString(updateTimestampNotContains))
                .append("\n");
        sb.append("    updateTimestampNotEndsWith: ")
                .append(toIndentedString(updateTimestampNotEndsWith))
                .append("\n");
        sb.append("    updateTimestampNotIn: ")
                .append(toIndentedString(updateTimestampNotIn))
                .append("\n");
        sb.append("    updateTimestampNotStartsWith: ")
                .append(toIndentedString(updateTimestampNotStartsWith))
                .append("\n");
        sb.append("    updateTimestampStartsWith: ")
                .append(toIndentedString(updateTimestampStartsWith))
                .append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    usedDataSpaceGt: ").append(toIndentedString(usedDataSpaceGt)).append("\n");
        sb.append("    usedDataSpaceGte: ").append(toIndentedString(usedDataSpaceGte)).append("\n");
        sb.append("    usedDataSpaceIn: ").append(toIndentedString(usedDataSpaceIn)).append("\n");
        sb.append("    usedDataSpaceLt: ").append(toIndentedString(usedDataSpaceLt)).append("\n");
        sb.append("    usedDataSpaceLte: ").append(toIndentedString(usedDataSpaceLte)).append("\n");
        sb.append("    usedDataSpaceNot: ").append(toIndentedString(usedDataSpaceNot)).append("\n");
        sb.append("    usedDataSpaceNotIn: ")
                .append(toIndentedString(usedDataSpaceNotIn))
                .append("\n");
        sb.append("    usedDataSpaceUsage: ")
                .append(toIndentedString(usedDataSpaceUsage))
                .append("\n");
        sb.append("    usedDataSpaceUsageGt: ")
                .append(toIndentedString(usedDataSpaceUsageGt))
                .append("\n");
        sb.append("    usedDataSpaceUsageGte: ")
                .append(toIndentedString(usedDataSpaceUsageGte))
                .append("\n");
        sb.append("    usedDataSpaceUsageIn: ")
                .append(toIndentedString(usedDataSpaceUsageIn))
                .append("\n");
        sb.append("    usedDataSpaceUsageLt: ")
                .append(toIndentedString(usedDataSpaceUsageLt))
                .append("\n");
        sb.append("    usedDataSpaceUsageLte: ")
                .append(toIndentedString(usedDataSpaceUsageLte))
                .append("\n");
        sb.append("    usedDataSpaceUsageNot: ")
                .append(toIndentedString(usedDataSpaceUsageNot))
                .append("\n");
        sb.append("    usedDataSpaceUsageNotIn: ")
                .append(toIndentedString(usedDataSpaceUsageNotIn))
                .append("\n");
        sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
        sb.append("    validDataSpaceGt: ").append(toIndentedString(validDataSpaceGt)).append("\n");
        sb.append("    validDataSpaceGte: ")
                .append(toIndentedString(validDataSpaceGte))
                .append("\n");
        sb.append("    validDataSpaceIn: ").append(toIndentedString(validDataSpaceIn)).append("\n");
        sb.append("    validDataSpaceLt: ").append(toIndentedString(validDataSpaceLt)).append("\n");
        sb.append("    validDataSpaceLte: ")
                .append(toIndentedString(validDataSpaceLte))
                .append("\n");
        sb.append("    validDataSpaceNot: ")
                .append(toIndentedString(validDataSpaceNot))
                .append("\n");
        sb.append("    validDataSpaceNotIn: ")
                .append(toIndentedString(validDataSpaceNotIn))
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

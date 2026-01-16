package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** TaskWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TaskWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<TaskWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<TaskWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<TaskWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
    private String errorMessage;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS = "error_message_contains";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS)
    private String errorMessageContains;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH = "error_message_ends_with";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH)
    private String errorMessageEndsWith;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_GT = "error_message_gt";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_GT)
    private String errorMessageGt;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_GTE = "error_message_gte";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_GTE)
    private String errorMessageGte;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_IN = "error_message_in";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_IN)
    private List<String> errorMessageIn = null;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_LT = "error_message_lt";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_LT)
    private String errorMessageLt;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_LTE = "error_message_lte";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_LTE)
    private String errorMessageLte;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_NOT = "error_message_not";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_NOT)
    private String errorMessageNot;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS =
            "error_message_not_contains";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS)
    private String errorMessageNotContains;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH =
            "error_message_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH)
    private String errorMessageNotEndsWith;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN = "error_message_not_in";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN)
    private List<String> errorMessageNotIn = null;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH =
            "error_message_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH)
    private String errorMessageNotStartsWith;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH =
            "error_message_starts_with";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH)
    private String errorMessageStartsWith;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_FINISHED_AT_GT = "finished_at_gt";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_GT)
    private String finishedAtGt;

    public static final String SERIALIZED_NAME_FINISHED_AT_GTE = "finished_at_gte";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_GTE)
    private String finishedAtGte;

    public static final String SERIALIZED_NAME_FINISHED_AT_IN = "finished_at_in";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_IN)
    private List<String> finishedAtIn = null;

    public static final String SERIALIZED_NAME_FINISHED_AT_LT = "finished_at_lt";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_LT)
    private String finishedAtLt;

    public static final String SERIALIZED_NAME_FINISHED_AT_LTE = "finished_at_lte";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_LTE)
    private String finishedAtLte;

    public static final String SERIALIZED_NAME_FINISHED_AT_NOT = "finished_at_not";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT)
    private String finishedAtNot;

    public static final String SERIALIZED_NAME_FINISHED_AT_NOT_IN = "finished_at_not_in";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT_IN)
    private List<String> finishedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_KEY_CONTAINS = "key_contains";

    @SerializedName(SERIALIZED_NAME_KEY_CONTAINS)
    private String keyContains;

    public static final String SERIALIZED_NAME_KEY_ENDS_WITH = "key_ends_with";

    @SerializedName(SERIALIZED_NAME_KEY_ENDS_WITH)
    private String keyEndsWith;

    public static final String SERIALIZED_NAME_KEY_GT = "key_gt";

    @SerializedName(SERIALIZED_NAME_KEY_GT)
    private String keyGt;

    public static final String SERIALIZED_NAME_KEY_GTE = "key_gte";

    @SerializedName(SERIALIZED_NAME_KEY_GTE)
    private String keyGte;

    public static final String SERIALIZED_NAME_KEY_IN = "key_in";

    @SerializedName(SERIALIZED_NAME_KEY_IN)
    private List<String> keyIn = null;

    public static final String SERIALIZED_NAME_KEY_LT = "key_lt";

    @SerializedName(SERIALIZED_NAME_KEY_LT)
    private String keyLt;

    public static final String SERIALIZED_NAME_KEY_LTE = "key_lte";

    @SerializedName(SERIALIZED_NAME_KEY_LTE)
    private String keyLte;

    public static final String SERIALIZED_NAME_KEY_NOT = "key_not";

    @SerializedName(SERIALIZED_NAME_KEY_NOT)
    private String keyNot;

    public static final String SERIALIZED_NAME_KEY_NOT_CONTAINS = "key_not_contains";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_CONTAINS)
    private String keyNotContains;

    public static final String SERIALIZED_NAME_KEY_NOT_ENDS_WITH = "key_not_ends_with";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_ENDS_WITH)
    private String keyNotEndsWith;

    public static final String SERIALIZED_NAME_KEY_NOT_IN = "key_not_in";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_IN)
    private List<String> keyNotIn = null;

    public static final String SERIALIZED_NAME_KEY_NOT_STARTS_WITH = "key_not_starts_with";

    @SerializedName(SERIALIZED_NAME_KEY_NOT_STARTS_WITH)
    private String keyNotStartsWith;

    public static final String SERIALIZED_NAME_KEY_STARTS_WITH = "key_starts_with";

    @SerializedName(SERIALIZED_NAME_KEY_STARTS_WITH)
    private String keyStartsWith;

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

    public static final String SERIALIZED_NAME_PROGRESS = "progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Double progress;

    public static final String SERIALIZED_NAME_PROGRESS_GT = "progress_gt";

    @SerializedName(SERIALIZED_NAME_PROGRESS_GT)
    private Double progressGt;

    public static final String SERIALIZED_NAME_PROGRESS_GTE = "progress_gte";

    @SerializedName(SERIALIZED_NAME_PROGRESS_GTE)
    private Double progressGte;

    public static final String SERIALIZED_NAME_PROGRESS_IN = "progress_in";

    @SerializedName(SERIALIZED_NAME_PROGRESS_IN)
    private List<Double> progressIn = null;

    public static final String SERIALIZED_NAME_PROGRESS_LT = "progress_lt";

    @SerializedName(SERIALIZED_NAME_PROGRESS_LT)
    private Double progressLt;

    public static final String SERIALIZED_NAME_PROGRESS_LTE = "progress_lte";

    @SerializedName(SERIALIZED_NAME_PROGRESS_LTE)
    private Double progressLte;

    public static final String SERIALIZED_NAME_PROGRESS_NOT = "progress_not";

    @SerializedName(SERIALIZED_NAME_PROGRESS_NOT)
    private Double progressNot;

    public static final String SERIALIZED_NAME_PROGRESS_NOT_IN = "progress_not_in";

    @SerializedName(SERIALIZED_NAME_PROGRESS_NOT_IN)
    private List<Double> progressNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_RESOURCE_ID_CONTAINS = "resource_id_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_CONTAINS)
    private String resourceIdContains;

    public static final String SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH = "resource_id_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH)
    private String resourceIdEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID_GT = "resource_id_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_GT)
    private String resourceIdGt;

    public static final String SERIALIZED_NAME_RESOURCE_ID_GTE = "resource_id_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_GTE)
    private String resourceIdGte;

    public static final String SERIALIZED_NAME_RESOURCE_ID_IN = "resource_id_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_IN)
    private List<String> resourceIdIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ID_LT = "resource_id_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_LT)
    private String resourceIdLt;

    public static final String SERIALIZED_NAME_RESOURCE_ID_LTE = "resource_id_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_LTE)
    private String resourceIdLte;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT = "resource_id_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT)
    private String resourceIdNot;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS =
            "resource_id_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS)
    private String resourceIdNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH =
            "resource_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH)
    private String resourceIdNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_IN = "resource_id_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_IN)
    private List<String> resourceIdNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH =
            "resource_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH)
    private String resourceIdNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH = "resource_id_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH)
    private String resourceIdStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
    private String resourceMutation;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS =
            "resource_mutation_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS)
    private String resourceMutationContains;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH =
            "resource_mutation_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH)
    private String resourceMutationEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_GT = "resource_mutation_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_GT)
    private String resourceMutationGt;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_GTE = "resource_mutation_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_GTE)
    private String resourceMutationGte;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_IN = "resource_mutation_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_IN)
    private List<String> resourceMutationIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_LT = "resource_mutation_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_LT)
    private String resourceMutationLt;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_LTE = "resource_mutation_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_LTE)
    private String resourceMutationLte;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_NOT = "resource_mutation_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_NOT)
    private String resourceMutationNot;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS =
            "resource_mutation_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS)
    private String resourceMutationNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH =
            "resource_mutation_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH)
    private String resourceMutationNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN =
            "resource_mutation_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN)
    private List<String> resourceMutationNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH =
            "resource_mutation_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH)
    private String resourceMutationNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH =
            "resource_mutation_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH)
    private String resourceMutationStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR = "resource_rollback_error";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR)
    private String resourceRollbackError;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS =
            "resource_rollback_error_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS)
    private String resourceRollbackErrorContains;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH =
            "resource_rollback_error_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH)
    private String resourceRollbackErrorEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT =
            "resource_rollback_error_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT)
    private String resourceRollbackErrorGt;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE =
            "resource_rollback_error_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE)
    private String resourceRollbackErrorGte;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN =
            "resource_rollback_error_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN)
    private List<String> resourceRollbackErrorIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT =
            "resource_rollback_error_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT)
    private String resourceRollbackErrorLt;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE =
            "resource_rollback_error_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE)
    private String resourceRollbackErrorLte;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT =
            "resource_rollback_error_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT)
    private String resourceRollbackErrorNot;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS =
            "resource_rollback_error_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS)
    private String resourceRollbackErrorNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH =
            "resource_rollback_error_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH)
    private String resourceRollbackErrorNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN =
            "resource_rollback_error_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN)
    private List<String> resourceRollbackErrorNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH =
            "resource_rollback_error_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH)
    private String resourceRollbackErrorNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH =
            "resource_rollback_error_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH)
    private String resourceRollbackErrorStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT =
            "resource_rollback_retry_count";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT)
    private Integer resourceRollbackRetryCount;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT =
            "resource_rollback_retry_count_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT)
    private Integer resourceRollbackRetryCountGt;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE =
            "resource_rollback_retry_count_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE)
    private Integer resourceRollbackRetryCountGte;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN =
            "resource_rollback_retry_count_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN)
    private List<Integer> resourceRollbackRetryCountIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT =
            "resource_rollback_retry_count_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT)
    private Integer resourceRollbackRetryCountLt;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE =
            "resource_rollback_retry_count_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE)
    private Integer resourceRollbackRetryCountLte;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT =
            "resource_rollback_retry_count_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT)
    private Integer resourceRollbackRetryCountNot;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN =
            "resource_rollback_retry_count_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN)
    private List<Integer> resourceRollbackRetryCountNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACKED = "resource_rollbacked";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACKED)
    private Boolean resourceRollbacked;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT = "resource_rollbacked_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT)
    private Boolean resourceRollbackedNot;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS = "resource_type_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS)
    private String resourceTypeContains;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH = "resource_type_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH)
    private String resourceTypeEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_GT = "resource_type_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GT)
    private String resourceTypeGt;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_GTE = "resource_type_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GTE)
    private String resourceTypeGte;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_IN = "resource_type_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_IN)
    private List<String> resourceTypeIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_LT = "resource_type_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LT)
    private String resourceTypeLt;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_LTE = "resource_type_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LTE)
    private String resourceTypeLte;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT = "resource_type_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT)
    private String resourceTypeNot;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS =
            "resource_type_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS)
    private String resourceTypeNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH =
            "resource_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH)
    private String resourceTypeNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN = "resource_type_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN)
    private List<String> resourceTypeNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH =
            "resource_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH)
    private String resourceTypeNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH =
            "resource_type_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH)
    private String resourceTypeStartsWith;

    public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT)
    private String snapshot;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONTAINS = "snapshot_contains";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONTAINS)
    private String snapshotContains;

    public static final String SERIALIZED_NAME_SNAPSHOT_ENDS_WITH = "snapshot_ends_with";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ENDS_WITH)
    private String snapshotEndsWith;

    public static final String SERIALIZED_NAME_SNAPSHOT_GT = "snapshot_gt";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GT)
    private String snapshotGt;

    public static final String SERIALIZED_NAME_SNAPSHOT_GTE = "snapshot_gte";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GTE)
    private String snapshotGte;

    public static final String SERIALIZED_NAME_SNAPSHOT_IN = "snapshot_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_IN)
    private List<String> snapshotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_LT = "snapshot_lt";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_LT)
    private String snapshotLt;

    public static final String SERIALIZED_NAME_SNAPSHOT_LTE = "snapshot_lte";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_LTE)
    private String snapshotLte;

    public static final String SERIALIZED_NAME_SNAPSHOT_NOT = "snapshot_not";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NOT)
    private String snapshotNot;

    public static final String SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS = "snapshot_not_contains";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS)
    private String snapshotNotContains;

    public static final String SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH = "snapshot_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH)
    private String snapshotNotEndsWith;

    public static final String SERIALIZED_NAME_SNAPSHOT_NOT_IN = "snapshot_not_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NOT_IN)
    private List<String> snapshotNotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH =
            "snapshot_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH)
    private String snapshotNotStartsWith;

    public static final String SERIALIZED_NAME_SNAPSHOT_STARTS_WITH = "snapshot_starts_with";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_STARTS_WITH)
    private String snapshotStartsWith;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STARTED_AT_GT = "started_at_gt";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_GT)
    private String startedAtGt;

    public static final String SERIALIZED_NAME_STARTED_AT_GTE = "started_at_gte";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_GTE)
    private String startedAtGte;

    public static final String SERIALIZED_NAME_STARTED_AT_IN = "started_at_in";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_IN)
    private List<String> startedAtIn = null;

    public static final String SERIALIZED_NAME_STARTED_AT_LT = "started_at_lt";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_LT)
    private String startedAtLt;

    public static final String SERIALIZED_NAME_STARTED_AT_LTE = "started_at_lte";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_LTE)
    private String startedAtLte;

    public static final String SERIALIZED_NAME_STARTED_AT_NOT = "started_at_not";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT)
    private String startedAtNot;

    public static final String SERIALIZED_NAME_STARTED_AT_NOT_IN = "started_at_not_in";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT_IN)
    private List<String> startedAtNotIn = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private TaskStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<TaskStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private TaskStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<TaskStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private TaskType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<TaskType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private TaskType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<TaskType> typeNotIn = null;

    public static final String SERIALIZED_NAME_USER = "user";

    @SerializedName(SERIALIZED_NAME_USER)
    private UserWhereInput user;

    public TaskWhereInput() {}

    public TaskWhereInput AND(List<TaskWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public TaskWhereInput addANDItem(TaskWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<TaskWhereInput>();
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
    public List<TaskWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<TaskWhereInput> AND) {
        this.AND = AND;
    }

    public TaskWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public TaskWhereInput AND_ExplictlyNonNull() {
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

    public TaskWhereInput NOT(List<TaskWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public TaskWhereInput addNOTItem(TaskWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<TaskWhereInput>();
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
    public List<TaskWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<TaskWhereInput> NOT) {
        this.NOT = NOT;
    }

    public TaskWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public TaskWhereInput NOT_ExplictlyNonNull() {
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

    public TaskWhereInput OR(List<TaskWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public TaskWhereInput addORItem(TaskWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<TaskWhereInput>();
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
    public List<TaskWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<TaskWhereInput> OR) {
        this.OR = OR;
    }

    public TaskWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public TaskWhereInput OR_ExplictlyNonNull() {
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

    public TaskWhereInput cluster(ClusterWhereInput cluster) {

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

    public TaskWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public TaskWhereInput cluster_ExplictlyNonNull() {
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

    public TaskWhereInput description(String description) {

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

    public TaskWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public TaskWhereInput description_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionContains(String descriptionContains) {

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

    public TaskWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public TaskWhereInput descriptionContains_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public TaskWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public TaskWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionGt(String descriptionGt) {

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

    public TaskWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public TaskWhereInput descriptionGt_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionGte(String descriptionGte) {

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

    public TaskWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public TaskWhereInput descriptionGte_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public TaskWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public TaskWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public TaskWhereInput descriptionIn_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionLt(String descriptionLt) {

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

    public TaskWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public TaskWhereInput descriptionLt_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionLte(String descriptionLte) {

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

    public TaskWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public TaskWhereInput descriptionLte_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionNot(String descriptionNot) {

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

    public TaskWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public TaskWhereInput descriptionNot_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public TaskWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public TaskWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public TaskWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public TaskWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public TaskWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public TaskWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public TaskWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public TaskWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public TaskWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public TaskWhereInput errorCode(String errorCode) {

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

    public TaskWhereInput errorCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public TaskWhereInput errorCode_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeContains(String errorCodeContains) {

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

    public TaskWhereInput errorCodeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_CONTAINS);
        return this;
    }

    public TaskWhereInput errorCodeContains_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeEndsWith(String errorCodeEndsWith) {

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

    public TaskWhereInput errorCodeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH);
        return this;
    }

    public TaskWhereInput errorCodeEndsWith_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeGt(String errorCodeGt) {

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

    public TaskWhereInput errorCodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_GT);
        return this;
    }

    public TaskWhereInput errorCodeGt_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeGte(String errorCodeGte) {

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

    public TaskWhereInput errorCodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_GTE);
        return this;
    }

    public TaskWhereInput errorCodeGte_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeIn(List<String> errorCodeIn) {

        this.errorCodeIn = errorCodeIn;
        return this;
    }

    public TaskWhereInput addErrorCodeInItem(String errorCodeInItem) {
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

    public TaskWhereInput errorCodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_IN);
        return this;
    }

    public TaskWhereInput errorCodeIn_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeLt(String errorCodeLt) {

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

    public TaskWhereInput errorCodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_LT);
        return this;
    }

    public TaskWhereInput errorCodeLt_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeLte(String errorCodeLte) {

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

    public TaskWhereInput errorCodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_LTE);
        return this;
    }

    public TaskWhereInput errorCodeLte_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeNot(String errorCodeNot) {

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

    public TaskWhereInput errorCodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT);
        return this;
    }

    public TaskWhereInput errorCodeNot_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeNotContains(String errorCodeNotContains) {

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

    public TaskWhereInput errorCodeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput errorCodeNotContains_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeNotEndsWith(String errorCodeNotEndsWith) {

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

    public TaskWhereInput errorCodeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput errorCodeNotEndsWith_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeNotIn(List<String> errorCodeNotIn) {

        this.errorCodeNotIn = errorCodeNotIn;
        return this;
    }

    public TaskWhereInput addErrorCodeNotInItem(String errorCodeNotInItem) {
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

    public TaskWhereInput errorCodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_IN);
        return this;
    }

    public TaskWhereInput errorCodeNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeNotStartsWith(String errorCodeNotStartsWith) {

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

    public TaskWhereInput errorCodeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput errorCodeNotStartsWith_ExplictlyNonNull() {
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

    public TaskWhereInput errorCodeStartsWith(String errorCodeStartsWith) {

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

    public TaskWhereInput errorCodeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH);
        return this;
    }

    public TaskWhereInput errorCodeStartsWith_ExplictlyNonNull() {
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

    public TaskWhereInput errorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public TaskWhereInput errorMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public TaskWhereInput errorMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public void setErrorMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE);
        }
    }

    public boolean getErrorMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE);
    }

    public TaskWhereInput errorMessageContains(String errorMessageContains) {

        this.errorMessageContains = errorMessageContains;
        return this;
    }

    /**
     * Get errorMessageContains
     *
     * @return errorMessageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageContains() {
        return errorMessageContains;
    }

    public void setErrorMessageContains(String errorMessageContains) {
        this.errorMessageContains = errorMessageContains;
    }

    public TaskWhereInput errorMessageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS);
        return this;
    }

    public TaskWhereInput errorMessageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS);
        return this;
    }

    public void setErrorMessageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS);
        }
    }

    public boolean getErrorMessageContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS);
    }

    public TaskWhereInput errorMessageEndsWith(String errorMessageEndsWith) {

        this.errorMessageEndsWith = errorMessageEndsWith;
        return this;
    }

    /**
     * Get errorMessageEndsWith
     *
     * @return errorMessageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageEndsWith() {
        return errorMessageEndsWith;
    }

    public void setErrorMessageEndsWith(String errorMessageEndsWith) {
        this.errorMessageEndsWith = errorMessageEndsWith;
    }

    public TaskWhereInput errorMessageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH);
        return this;
    }

    public TaskWhereInput errorMessageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH);
        return this;
    }

    public void setErrorMessageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH);
        }
    }

    public boolean getErrorMessageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH);
    }

    public TaskWhereInput errorMessageGt(String errorMessageGt) {

        this.errorMessageGt = errorMessageGt;
        return this;
    }

    /**
     * Get errorMessageGt
     *
     * @return errorMessageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageGt() {
        return errorMessageGt;
    }

    public void setErrorMessageGt(String errorMessageGt) {
        this.errorMessageGt = errorMessageGt;
    }

    public TaskWhereInput errorMessageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_GT);
        return this;
    }

    public TaskWhereInput errorMessageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_GT);
        return this;
    }

    public void setErrorMessageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_GT);
        }
    }

    public boolean getErrorMessageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_GT);
    }

    public TaskWhereInput errorMessageGte(String errorMessageGte) {

        this.errorMessageGte = errorMessageGte;
        return this;
    }

    /**
     * Get errorMessageGte
     *
     * @return errorMessageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageGte() {
        return errorMessageGte;
    }

    public void setErrorMessageGte(String errorMessageGte) {
        this.errorMessageGte = errorMessageGte;
    }

    public TaskWhereInput errorMessageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_GTE);
        return this;
    }

    public TaskWhereInput errorMessageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_GTE);
        return this;
    }

    public void setErrorMessageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_GTE);
        }
    }

    public boolean getErrorMessageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_GTE);
    }

    public TaskWhereInput errorMessageIn(List<String> errorMessageIn) {

        this.errorMessageIn = errorMessageIn;
        return this;
    }

    public TaskWhereInput addErrorMessageInItem(String errorMessageInItem) {
        if (this.errorMessageIn == null) {
            this.errorMessageIn = new ArrayList<String>();
        }
        this.errorMessageIn.add(errorMessageInItem);
        return this;
    }

    /**
     * Get errorMessageIn
     *
     * @return errorMessageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getErrorMessageIn() {
        return errorMessageIn;
    }

    public void setErrorMessageIn(List<String> errorMessageIn) {
        this.errorMessageIn = errorMessageIn;
    }

    public TaskWhereInput errorMessageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_IN);
        return this;
    }

    public TaskWhereInput errorMessageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_IN);
        return this;
    }

    public void setErrorMessageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_IN);
        }
    }

    public boolean getErrorMessageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_IN);
    }

    public TaskWhereInput errorMessageLt(String errorMessageLt) {

        this.errorMessageLt = errorMessageLt;
        return this;
    }

    /**
     * Get errorMessageLt
     *
     * @return errorMessageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageLt() {
        return errorMessageLt;
    }

    public void setErrorMessageLt(String errorMessageLt) {
        this.errorMessageLt = errorMessageLt;
    }

    public TaskWhereInput errorMessageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_LT);
        return this;
    }

    public TaskWhereInput errorMessageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_LT);
        return this;
    }

    public void setErrorMessageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_LT);
        }
    }

    public boolean getErrorMessageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_LT);
    }

    public TaskWhereInput errorMessageLte(String errorMessageLte) {

        this.errorMessageLte = errorMessageLte;
        return this;
    }

    /**
     * Get errorMessageLte
     *
     * @return errorMessageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageLte() {
        return errorMessageLte;
    }

    public void setErrorMessageLte(String errorMessageLte) {
        this.errorMessageLte = errorMessageLte;
    }

    public TaskWhereInput errorMessageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_LTE);
        return this;
    }

    public TaskWhereInput errorMessageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_LTE);
        return this;
    }

    public void setErrorMessageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_LTE);
        }
    }

    public boolean getErrorMessageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_LTE);
    }

    public TaskWhereInput errorMessageNot(String errorMessageNot) {

        this.errorMessageNot = errorMessageNot;
        return this;
    }

    /**
     * Get errorMessageNot
     *
     * @return errorMessageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageNot() {
        return errorMessageNot;
    }

    public void setErrorMessageNot(String errorMessageNot) {
        this.errorMessageNot = errorMessageNot;
    }

    public TaskWhereInput errorMessageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT);
        return this;
    }

    public TaskWhereInput errorMessageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT);
        return this;
    }

    public void setErrorMessageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT);
        }
    }

    public boolean getErrorMessageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_NOT);
    }

    public TaskWhereInput errorMessageNotContains(String errorMessageNotContains) {

        this.errorMessageNotContains = errorMessageNotContains;
        return this;
    }

    /**
     * Get errorMessageNotContains
     *
     * @return errorMessageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageNotContains() {
        return errorMessageNotContains;
    }

    public void setErrorMessageNotContains(String errorMessageNotContains) {
        this.errorMessageNotContains = errorMessageNotContains;
    }

    public TaskWhereInput errorMessageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput errorMessageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public void setErrorMessageNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS);
        }
    }

    public boolean getErrorMessageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS);
    }

    public TaskWhereInput errorMessageNotEndsWith(String errorMessageNotEndsWith) {

        this.errorMessageNotEndsWith = errorMessageNotEndsWith;
        return this;
    }

    /**
     * Get errorMessageNotEndsWith
     *
     * @return errorMessageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageNotEndsWith() {
        return errorMessageNotEndsWith;
    }

    public void setErrorMessageNotEndsWith(String errorMessageNotEndsWith) {
        this.errorMessageNotEndsWith = errorMessageNotEndsWith;
    }

    public TaskWhereInput errorMessageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput errorMessageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setErrorMessageNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getErrorMessageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH);
    }

    public TaskWhereInput errorMessageNotIn(List<String> errorMessageNotIn) {

        this.errorMessageNotIn = errorMessageNotIn;
        return this;
    }

    public TaskWhereInput addErrorMessageNotInItem(String errorMessageNotInItem) {
        if (this.errorMessageNotIn == null) {
            this.errorMessageNotIn = new ArrayList<String>();
        }
        this.errorMessageNotIn.add(errorMessageNotInItem);
        return this;
    }

    /**
     * Get errorMessageNotIn
     *
     * @return errorMessageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getErrorMessageNotIn() {
        return errorMessageNotIn;
    }

    public void setErrorMessageNotIn(List<String> errorMessageNotIn) {
        this.errorMessageNotIn = errorMessageNotIn;
    }

    public TaskWhereInput errorMessageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN);
        return this;
    }

    public TaskWhereInput errorMessageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN);
        return this;
    }

    public void setErrorMessageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN);
        }
    }

    public boolean getErrorMessageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN);
    }

    public TaskWhereInput errorMessageNotStartsWith(String errorMessageNotStartsWith) {

        this.errorMessageNotStartsWith = errorMessageNotStartsWith;
        return this;
    }

    /**
     * Get errorMessageNotStartsWith
     *
     * @return errorMessageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageNotStartsWith() {
        return errorMessageNotStartsWith;
    }

    public void setErrorMessageNotStartsWith(String errorMessageNotStartsWith) {
        this.errorMessageNotStartsWith = errorMessageNotStartsWith;
    }

    public TaskWhereInput errorMessageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput errorMessageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setErrorMessageNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getErrorMessageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH);
    }

    public TaskWhereInput errorMessageStartsWith(String errorMessageStartsWith) {

        this.errorMessageStartsWith = errorMessageStartsWith;
        return this;
    }

    /**
     * Get errorMessageStartsWith
     *
     * @return errorMessageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessageStartsWith() {
        return errorMessageStartsWith;
    }

    public void setErrorMessageStartsWith(String errorMessageStartsWith) {
        this.errorMessageStartsWith = errorMessageStartsWith;
    }

    public TaskWhereInput errorMessageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH);
        return this;
    }

    public TaskWhereInput errorMessageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH);
        return this;
    }

    public void setErrorMessageStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH);
        }
    }

    public boolean getErrorMessageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH);
    }

    public TaskWhereInput finishedAt(String finishedAt) {

        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public TaskWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public TaskWhereInput finishedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public void setFinishedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        }
    }

    public boolean getFinishedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT);
    }

    public TaskWhereInput finishedAtGt(String finishedAtGt) {

        this.finishedAtGt = finishedAtGt;
        return this;
    }

    /**
     * Get finishedAtGt
     *
     * @return finishedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtGt() {
        return finishedAtGt;
    }

    public void setFinishedAtGt(String finishedAtGt) {
        this.finishedAtGt = finishedAtGt;
    }

    public TaskWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public TaskWhereInput finishedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public void setFinishedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GT);
        }
    }

    public boolean getFinishedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_GT);
    }

    public TaskWhereInput finishedAtGte(String finishedAtGte) {

        this.finishedAtGte = finishedAtGte;
        return this;
    }

    /**
     * Get finishedAtGte
     *
     * @return finishedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtGte() {
        return finishedAtGte;
    }

    public void setFinishedAtGte(String finishedAtGte) {
        this.finishedAtGte = finishedAtGte;
    }

    public TaskWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public TaskWhereInput finishedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public void setFinishedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GTE);
        }
    }

    public boolean getFinishedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_GTE);
    }

    public TaskWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public TaskWhereInput addFinishedAtInItem(String finishedAtInItem) {
        if (this.finishedAtIn == null) {
            this.finishedAtIn = new ArrayList<String>();
        }
        this.finishedAtIn.add(finishedAtInItem);
        return this;
    }

    /**
     * Get finishedAtIn
     *
     * @return finishedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFinishedAtIn() {
        return finishedAtIn;
    }

    public void setFinishedAtIn(List<String> finishedAtIn) {
        this.finishedAtIn = finishedAtIn;
    }

    public TaskWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public TaskWhereInput finishedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public void setFinishedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_IN);
        }
    }

    public boolean getFinishedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_IN);
    }

    public TaskWhereInput finishedAtLt(String finishedAtLt) {

        this.finishedAtLt = finishedAtLt;
        return this;
    }

    /**
     * Get finishedAtLt
     *
     * @return finishedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtLt() {
        return finishedAtLt;
    }

    public void setFinishedAtLt(String finishedAtLt) {
        this.finishedAtLt = finishedAtLt;
    }

    public TaskWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public TaskWhereInput finishedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public void setFinishedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LT);
        }
    }

    public boolean getFinishedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_LT);
    }

    public TaskWhereInput finishedAtLte(String finishedAtLte) {

        this.finishedAtLte = finishedAtLte;
        return this;
    }

    /**
     * Get finishedAtLte
     *
     * @return finishedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtLte() {
        return finishedAtLte;
    }

    public void setFinishedAtLte(String finishedAtLte) {
        this.finishedAtLte = finishedAtLte;
    }

    public TaskWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public TaskWhereInput finishedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public void setFinishedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LTE);
        }
    }

    public boolean getFinishedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_LTE);
    }

    public TaskWhereInput finishedAtNot(String finishedAtNot) {

        this.finishedAtNot = finishedAtNot;
        return this;
    }

    /**
     * Get finishedAtNot
     *
     * @return finishedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtNot() {
        return finishedAtNot;
    }

    public void setFinishedAtNot(String finishedAtNot) {
        this.finishedAtNot = finishedAtNot;
    }

    public TaskWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public TaskWhereInput finishedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public void setFinishedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT);
        }
    }

    public boolean getFinishedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_NOT);
    }

    public TaskWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public TaskWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
        if (this.finishedAtNotIn == null) {
            this.finishedAtNotIn = new ArrayList<String>();
        }
        this.finishedAtNotIn.add(finishedAtNotInItem);
        return this;
    }

    /**
     * Get finishedAtNotIn
     *
     * @return finishedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFinishedAtNotIn() {
        return finishedAtNotIn;
    }

    public void setFinishedAtNotIn(List<String> finishedAtNotIn) {
        this.finishedAtNotIn = finishedAtNotIn;
    }

    public TaskWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public TaskWhereInput finishedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public void setFinishedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        }
    }

    public boolean getFinishedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
    }

    public TaskWhereInput id(String id) {

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

    public TaskWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public TaskWhereInput id_ExplictlyNonNull() {
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

    public TaskWhereInput idContains(String idContains) {

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

    public TaskWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public TaskWhereInput idContains_ExplictlyNonNull() {
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

    public TaskWhereInput idEndsWith(String idEndsWith) {

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

    public TaskWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public TaskWhereInput idEndsWith_ExplictlyNonNull() {
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

    public TaskWhereInput idGt(String idGt) {

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

    public TaskWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public TaskWhereInput idGt_ExplictlyNonNull() {
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

    public TaskWhereInput idGte(String idGte) {

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

    public TaskWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public TaskWhereInput idGte_ExplictlyNonNull() {
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

    public TaskWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public TaskWhereInput addIdInItem(String idInItem) {
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

    public TaskWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public TaskWhereInput idIn_ExplictlyNonNull() {
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

    public TaskWhereInput idLt(String idLt) {

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

    public TaskWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public TaskWhereInput idLt_ExplictlyNonNull() {
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

    public TaskWhereInput idLte(String idLte) {

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

    public TaskWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public TaskWhereInput idLte_ExplictlyNonNull() {
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

    public TaskWhereInput idNot(String idNot) {

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

    public TaskWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public TaskWhereInput idNot_ExplictlyNonNull() {
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

    public TaskWhereInput idNotContains(String idNotContains) {

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

    public TaskWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput idNotContains_ExplictlyNonNull() {
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

    public TaskWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public TaskWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public TaskWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public TaskWhereInput addIdNotInItem(String idNotInItem) {
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

    public TaskWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public TaskWhereInput idNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public TaskWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public TaskWhereInput idStartsWith(String idStartsWith) {

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

    public TaskWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public TaskWhereInput idStartsWith_ExplictlyNonNull() {
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

    public TaskWhereInput internal(Boolean internal) {

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

    public TaskWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public TaskWhereInput internal_ExplictlyNonNull() {
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

    public TaskWhereInput internalNot(Boolean internalNot) {

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

    public TaskWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public TaskWhereInput internalNot_ExplictlyNonNull() {
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

    public TaskWhereInput key(String key) {

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
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TaskWhereInput key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public TaskWhereInput key_ExplictlyNonNull() {
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

    public TaskWhereInput keyContains(String keyContains) {

        this.keyContains = keyContains;
        return this;
    }

    /**
     * Get keyContains
     *
     * @return keyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyContains() {
        return keyContains;
    }

    public void setKeyContains(String keyContains) {
        this.keyContains = keyContains;
    }

    public TaskWhereInput keyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_CONTAINS);
        return this;
    }

    public TaskWhereInput keyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_CONTAINS);
        return this;
    }

    public void setKeyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_CONTAINS);
        }
    }

    public boolean getKeyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_CONTAINS);
    }

    public TaskWhereInput keyEndsWith(String keyEndsWith) {

        this.keyEndsWith = keyEndsWith;
        return this;
    }

    /**
     * Get keyEndsWith
     *
     * @return keyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyEndsWith() {
        return keyEndsWith;
    }

    public void setKeyEndsWith(String keyEndsWith) {
        this.keyEndsWith = keyEndsWith;
    }

    public TaskWhereInput keyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_ENDS_WITH);
        return this;
    }

    public TaskWhereInput keyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_ENDS_WITH);
        return this;
    }

    public void setKeyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_ENDS_WITH);
        }
    }

    public boolean getKeyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_ENDS_WITH);
    }

    public TaskWhereInput keyGt(String keyGt) {

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
    public String getKeyGt() {
        return keyGt;
    }

    public void setKeyGt(String keyGt) {
        this.keyGt = keyGt;
    }

    public TaskWhereInput keyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GT);
        return this;
    }

    public TaskWhereInput keyGt_ExplictlyNonNull() {
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

    public TaskWhereInput keyGte(String keyGte) {

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
    public String getKeyGte() {
        return keyGte;
    }

    public void setKeyGte(String keyGte) {
        this.keyGte = keyGte;
    }

    public TaskWhereInput keyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_GTE);
        return this;
    }

    public TaskWhereInput keyGte_ExplictlyNonNull() {
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

    public TaskWhereInput keyIn(List<String> keyIn) {

        this.keyIn = keyIn;
        return this;
    }

    public TaskWhereInput addKeyInItem(String keyInItem) {
        if (this.keyIn == null) {
            this.keyIn = new ArrayList<String>();
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
    public List<String> getKeyIn() {
        return keyIn;
    }

    public void setKeyIn(List<String> keyIn) {
        this.keyIn = keyIn;
    }

    public TaskWhereInput keyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_IN);
        return this;
    }

    public TaskWhereInput keyIn_ExplictlyNonNull() {
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

    public TaskWhereInput keyLt(String keyLt) {

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
    public String getKeyLt() {
        return keyLt;
    }

    public void setKeyLt(String keyLt) {
        this.keyLt = keyLt;
    }

    public TaskWhereInput keyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LT);
        return this;
    }

    public TaskWhereInput keyLt_ExplictlyNonNull() {
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

    public TaskWhereInput keyLte(String keyLte) {

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
    public String getKeyLte() {
        return keyLte;
    }

    public void setKeyLte(String keyLte) {
        this.keyLte = keyLte;
    }

    public TaskWhereInput keyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_LTE);
        return this;
    }

    public TaskWhereInput keyLte_ExplictlyNonNull() {
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

    public TaskWhereInput keyNot(String keyNot) {

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
    public String getKeyNot() {
        return keyNot;
    }

    public void setKeyNot(String keyNot) {
        this.keyNot = keyNot;
    }

    public TaskWhereInput keyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT);
        return this;
    }

    public TaskWhereInput keyNot_ExplictlyNonNull() {
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

    public TaskWhereInput keyNotContains(String keyNotContains) {

        this.keyNotContains = keyNotContains;
        return this;
    }

    /**
     * Get keyNotContains
     *
     * @return keyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotContains() {
        return keyNotContains;
    }

    public void setKeyNotContains(String keyNotContains) {
        this.keyNotContains = keyNotContains;
    }

    public TaskWhereInput keyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput keyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        return this;
    }

    public void setKeyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_CONTAINS);
        }
    }

    public boolean getKeyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_CONTAINS);
    }

    public TaskWhereInput keyNotEndsWith(String keyNotEndsWith) {

        this.keyNotEndsWith = keyNotEndsWith;
        return this;
    }

    /**
     * Get keyNotEndsWith
     *
     * @return keyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotEndsWith() {
        return keyNotEndsWith;
    }

    public void setKeyNotEndsWith(String keyNotEndsWith) {
        this.keyNotEndsWith = keyNotEndsWith;
    }

    public TaskWhereInput keyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput keyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        return this;
    }

    public void setKeyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
        }
    }

    public boolean getKeyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_ENDS_WITH);
    }

    public TaskWhereInput keyNotIn(List<String> keyNotIn) {

        this.keyNotIn = keyNotIn;
        return this;
    }

    public TaskWhereInput addKeyNotInItem(String keyNotInItem) {
        if (this.keyNotIn == null) {
            this.keyNotIn = new ArrayList<String>();
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
    public List<String> getKeyNotIn() {
        return keyNotIn;
    }

    public void setKeyNotIn(List<String> keyNotIn) {
        this.keyNotIn = keyNotIn;
    }

    public TaskWhereInput keyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_IN);
        return this;
    }

    public TaskWhereInput keyNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput keyNotStartsWith(String keyNotStartsWith) {

        this.keyNotStartsWith = keyNotStartsWith;
        return this;
    }

    /**
     * Get keyNotStartsWith
     *
     * @return keyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyNotStartsWith() {
        return keyNotStartsWith;
    }

    public void setKeyNotStartsWith(String keyNotStartsWith) {
        this.keyNotStartsWith = keyNotStartsWith;
    }

    public TaskWhereInput keyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput keyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        return this;
    }

    public void setKeyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
        }
    }

    public boolean getKeyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_NOT_STARTS_WITH);
    }

    public TaskWhereInput keyStartsWith(String keyStartsWith) {

        this.keyStartsWith = keyStartsWith;
        return this;
    }

    /**
     * Get keyStartsWith
     *
     * @return keyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKeyStartsWith() {
        return keyStartsWith;
    }

    public void setKeyStartsWith(String keyStartsWith) {
        this.keyStartsWith = keyStartsWith;
    }

    public TaskWhereInput keyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY_STARTS_WITH);
        return this;
    }

    public TaskWhereInput keyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY_STARTS_WITH);
        return this;
    }

    public void setKeyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY_STARTS_WITH);
        }
    }

    public boolean getKeyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY_STARTS_WITH);
    }

    public TaskWhereInput localCreatedAt(String localCreatedAt) {

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

    public TaskWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public TaskWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtGt(String localCreatedAtGt) {

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

    public TaskWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public TaskWhereInput localCreatedAtGt_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtGte(String localCreatedAtGte) {

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

    public TaskWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public TaskWhereInput localCreatedAtGte_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public TaskWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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

    public TaskWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public TaskWhereInput localCreatedAtIn_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtLt(String localCreatedAtLt) {

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

    public TaskWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public TaskWhereInput localCreatedAtLt_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtLte(String localCreatedAtLte) {

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

    public TaskWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public TaskWhereInput localCreatedAtLte_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtNot(String localCreatedAtNot) {

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

    public TaskWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public TaskWhereInput localCreatedAtNot_ExplictlyNonNull() {
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

    public TaskWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public TaskWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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

    public TaskWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public TaskWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput progress(Double progress) {

        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     *
     * @return progress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public TaskWhereInput progress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public TaskWhereInput progress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public void setProgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS);
        }
    }

    public boolean getProgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS);
    }

    public TaskWhereInput progressGt(Double progressGt) {

        this.progressGt = progressGt;
        return this;
    }

    /**
     * Get progressGt
     *
     * @return progressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProgressGt() {
        return progressGt;
    }

    public void setProgressGt(Double progressGt) {
        this.progressGt = progressGt;
    }

    public TaskWhereInput progressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_GT);
        return this;
    }

    public TaskWhereInput progressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_GT);
        return this;
    }

    public void setProgressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_GT);
        }
    }

    public boolean getProgressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_GT);
    }

    public TaskWhereInput progressGte(Double progressGte) {

        this.progressGte = progressGte;
        return this;
    }

    /**
     * Get progressGte
     *
     * @return progressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProgressGte() {
        return progressGte;
    }

    public void setProgressGte(Double progressGte) {
        this.progressGte = progressGte;
    }

    public TaskWhereInput progressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_GTE);
        return this;
    }

    public TaskWhereInput progressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_GTE);
        return this;
    }

    public void setProgressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_GTE);
        }
    }

    public boolean getProgressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_GTE);
    }

    public TaskWhereInput progressIn(List<Double> progressIn) {

        this.progressIn = progressIn;
        return this;
    }

    public TaskWhereInput addProgressInItem(Double progressInItem) {
        if (this.progressIn == null) {
            this.progressIn = new ArrayList<Double>();
        }
        this.progressIn.add(progressInItem);
        return this;
    }

    /**
     * Get progressIn
     *
     * @return progressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getProgressIn() {
        return progressIn;
    }

    public void setProgressIn(List<Double> progressIn) {
        this.progressIn = progressIn;
    }

    public TaskWhereInput progressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_IN);
        return this;
    }

    public TaskWhereInput progressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_IN);
        return this;
    }

    public void setProgressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_IN);
        }
    }

    public boolean getProgressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_IN);
    }

    public TaskWhereInput progressLt(Double progressLt) {

        this.progressLt = progressLt;
        return this;
    }

    /**
     * Get progressLt
     *
     * @return progressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProgressLt() {
        return progressLt;
    }

    public void setProgressLt(Double progressLt) {
        this.progressLt = progressLt;
    }

    public TaskWhereInput progressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_LT);
        return this;
    }

    public TaskWhereInput progressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_LT);
        return this;
    }

    public void setProgressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_LT);
        }
    }

    public boolean getProgressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_LT);
    }

    public TaskWhereInput progressLte(Double progressLte) {

        this.progressLte = progressLte;
        return this;
    }

    /**
     * Get progressLte
     *
     * @return progressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProgressLte() {
        return progressLte;
    }

    public void setProgressLte(Double progressLte) {
        this.progressLte = progressLte;
    }

    public TaskWhereInput progressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_LTE);
        return this;
    }

    public TaskWhereInput progressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_LTE);
        return this;
    }

    public void setProgressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_LTE);
        }
    }

    public boolean getProgressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_LTE);
    }

    public TaskWhereInput progressNot(Double progressNot) {

        this.progressNot = progressNot;
        return this;
    }

    /**
     * Get progressNot
     *
     * @return progressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProgressNot() {
        return progressNot;
    }

    public void setProgressNot(Double progressNot) {
        this.progressNot = progressNot;
    }

    public TaskWhereInput progressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_NOT);
        return this;
    }

    public TaskWhereInput progressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_NOT);
        return this;
    }

    public void setProgressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_NOT);
        }
    }

    public boolean getProgressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_NOT);
    }

    public TaskWhereInput progressNotIn(List<Double> progressNotIn) {

        this.progressNotIn = progressNotIn;
        return this;
    }

    public TaskWhereInput addProgressNotInItem(Double progressNotInItem) {
        if (this.progressNotIn == null) {
            this.progressNotIn = new ArrayList<Double>();
        }
        this.progressNotIn.add(progressNotInItem);
        return this;
    }

    /**
     * Get progressNotIn
     *
     * @return progressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getProgressNotIn() {
        return progressNotIn;
    }

    public void setProgressNotIn(List<Double> progressNotIn) {
        this.progressNotIn = progressNotIn;
    }

    public TaskWhereInput progressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS_NOT_IN);
        return this;
    }

    public TaskWhereInput progressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_NOT_IN);
        return this;
    }

    public void setProgressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS_NOT_IN);
        }
    }

    public boolean getProgressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS_NOT_IN);
    }

    public TaskWhereInput resourceId(String resourceId) {

        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     *
     * @return resourceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public TaskWhereInput resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public TaskWhereInput resourceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public void setResourceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        }
    }

    public boolean getResourceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID);
    }

    public TaskWhereInput resourceIdContains(String resourceIdContains) {

        this.resourceIdContains = resourceIdContains;
        return this;
    }

    /**
     * Get resourceIdContains
     *
     * @return resourceIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdContains() {
        return resourceIdContains;
    }

    public void setResourceIdContains(String resourceIdContains) {
        this.resourceIdContains = resourceIdContains;
    }

    public TaskWhereInput resourceIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        return this;
    }

    public void setResourceIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        }
    }

    public boolean getResourceIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
    }

    public TaskWhereInput resourceIdEndsWith(String resourceIdEndsWith) {

        this.resourceIdEndsWith = resourceIdEndsWith;
        return this;
    }

    /**
     * Get resourceIdEndsWith
     *
     * @return resourceIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdEndsWith() {
        return resourceIdEndsWith;
    }

    public void setResourceIdEndsWith(String resourceIdEndsWith) {
        this.resourceIdEndsWith = resourceIdEndsWith;
    }

    public TaskWhereInput resourceIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        return this;
    }

    public void setResourceIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        }
    }

    public boolean getResourceIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
    }

    public TaskWhereInput resourceIdGt(String resourceIdGt) {

        this.resourceIdGt = resourceIdGt;
        return this;
    }

    /**
     * Get resourceIdGt
     *
     * @return resourceIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdGt() {
        return resourceIdGt;
    }

    public void setResourceIdGt(String resourceIdGt) {
        this.resourceIdGt = resourceIdGt;
    }

    public TaskWhereInput resourceIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GT);
        return this;
    }

    public TaskWhereInput resourceIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GT);
        return this;
    }

    public void setResourceIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GT);
        }
    }

    public boolean getResourceIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_GT);
    }

    public TaskWhereInput resourceIdGte(String resourceIdGte) {

        this.resourceIdGte = resourceIdGte;
        return this;
    }

    /**
     * Get resourceIdGte
     *
     * @return resourceIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdGte() {
        return resourceIdGte;
    }

    public void setResourceIdGte(String resourceIdGte) {
        this.resourceIdGte = resourceIdGte;
    }

    public TaskWhereInput resourceIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GTE);
        return this;
    }

    public TaskWhereInput resourceIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GTE);
        return this;
    }

    public void setResourceIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GTE);
        }
    }

    public boolean getResourceIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_GTE);
    }

    public TaskWhereInput resourceIdIn(List<String> resourceIdIn) {

        this.resourceIdIn = resourceIdIn;
        return this;
    }

    public TaskWhereInput addResourceIdInItem(String resourceIdInItem) {
        if (this.resourceIdIn == null) {
            this.resourceIdIn = new ArrayList<String>();
        }
        this.resourceIdIn.add(resourceIdInItem);
        return this;
    }

    /**
     * Get resourceIdIn
     *
     * @return resourceIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceIdIn() {
        return resourceIdIn;
    }

    public void setResourceIdIn(List<String> resourceIdIn) {
        this.resourceIdIn = resourceIdIn;
    }

    public TaskWhereInput resourceIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_IN);
        return this;
    }

    public TaskWhereInput resourceIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_IN);
        return this;
    }

    public void setResourceIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_IN);
        }
    }

    public boolean getResourceIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_IN);
    }

    public TaskWhereInput resourceIdLt(String resourceIdLt) {

        this.resourceIdLt = resourceIdLt;
        return this;
    }

    /**
     * Get resourceIdLt
     *
     * @return resourceIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdLt() {
        return resourceIdLt;
    }

    public void setResourceIdLt(String resourceIdLt) {
        this.resourceIdLt = resourceIdLt;
    }

    public TaskWhereInput resourceIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LT);
        return this;
    }

    public TaskWhereInput resourceIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LT);
        return this;
    }

    public void setResourceIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LT);
        }
    }

    public boolean getResourceIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_LT);
    }

    public TaskWhereInput resourceIdLte(String resourceIdLte) {

        this.resourceIdLte = resourceIdLte;
        return this;
    }

    /**
     * Get resourceIdLte
     *
     * @return resourceIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdLte() {
        return resourceIdLte;
    }

    public void setResourceIdLte(String resourceIdLte) {
        this.resourceIdLte = resourceIdLte;
    }

    public TaskWhereInput resourceIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LTE);
        return this;
    }

    public TaskWhereInput resourceIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LTE);
        return this;
    }

    public void setResourceIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LTE);
        }
    }

    public boolean getResourceIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_LTE);
    }

    public TaskWhereInput resourceIdNot(String resourceIdNot) {

        this.resourceIdNot = resourceIdNot;
        return this;
    }

    /**
     * Get resourceIdNot
     *
     * @return resourceIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNot() {
        return resourceIdNot;
    }

    public void setResourceIdNot(String resourceIdNot) {
        this.resourceIdNot = resourceIdNot;
    }

    public TaskWhereInput resourceIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT);
        return this;
    }

    public TaskWhereInput resourceIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT);
        return this;
    }

    public void setResourceIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT);
        }
    }

    public boolean getResourceIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT);
    }

    public TaskWhereInput resourceIdNotContains(String resourceIdNotContains) {

        this.resourceIdNotContains = resourceIdNotContains;
        return this;
    }

    /**
     * Get resourceIdNotContains
     *
     * @return resourceIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNotContains() {
        return resourceIdNotContains;
    }

    public void setResourceIdNotContains(String resourceIdNotContains) {
        this.resourceIdNotContains = resourceIdNotContains;
    }

    public TaskWhereInput resourceIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        return this;
    }

    public void setResourceIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        }
    }

    public boolean getResourceIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
    }

    public TaskWhereInput resourceIdNotEndsWith(String resourceIdNotEndsWith) {

        this.resourceIdNotEndsWith = resourceIdNotEndsWith;
        return this;
    }

    /**
     * Get resourceIdNotEndsWith
     *
     * @return resourceIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNotEndsWith() {
        return resourceIdNotEndsWith;
    }

    public void setResourceIdNotEndsWith(String resourceIdNotEndsWith) {
        this.resourceIdNotEndsWith = resourceIdNotEndsWith;
    }

    public TaskWhereInput resourceIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
    }

    public TaskWhereInput resourceIdNotIn(List<String> resourceIdNotIn) {

        this.resourceIdNotIn = resourceIdNotIn;
        return this;
    }

    public TaskWhereInput addResourceIdNotInItem(String resourceIdNotInItem) {
        if (this.resourceIdNotIn == null) {
            this.resourceIdNotIn = new ArrayList<String>();
        }
        this.resourceIdNotIn.add(resourceIdNotInItem);
        return this;
    }

    /**
     * Get resourceIdNotIn
     *
     * @return resourceIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceIdNotIn() {
        return resourceIdNotIn;
    }

    public void setResourceIdNotIn(List<String> resourceIdNotIn) {
        this.resourceIdNotIn = resourceIdNotIn;
    }

    public TaskWhereInput resourceIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        return this;
    }

    public TaskWhereInput resourceIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        return this;
    }

    public void setResourceIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        }
    }

    public boolean getResourceIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
    }

    public TaskWhereInput resourceIdNotStartsWith(String resourceIdNotStartsWith) {

        this.resourceIdNotStartsWith = resourceIdNotStartsWith;
        return this;
    }

    /**
     * Get resourceIdNotStartsWith
     *
     * @return resourceIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNotStartsWith() {
        return resourceIdNotStartsWith;
    }

    public void setResourceIdNotStartsWith(String resourceIdNotStartsWith) {
        this.resourceIdNotStartsWith = resourceIdNotStartsWith;
    }

    public TaskWhereInput resourceIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
    }

    public TaskWhereInput resourceIdStartsWith(String resourceIdStartsWith) {

        this.resourceIdStartsWith = resourceIdStartsWith;
        return this;
    }

    /**
     * Get resourceIdStartsWith
     *
     * @return resourceIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdStartsWith() {
        return resourceIdStartsWith;
    }

    public void setResourceIdStartsWith(String resourceIdStartsWith) {
        this.resourceIdStartsWith = resourceIdStartsWith;
    }

    public TaskWhereInput resourceIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        return this;
    }

    public void setResourceIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        }
    }

    public boolean getResourceIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
    }

    public TaskWhereInput resourceMutation(String resourceMutation) {

        this.resourceMutation = resourceMutation;
        return this;
    }

    /**
     * Get resourceMutation
     *
     * @return resourceMutation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutation() {
        return resourceMutation;
    }

    public void setResourceMutation(String resourceMutation) {
        this.resourceMutation = resourceMutation;
    }

    public TaskWhereInput resourceMutation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION);
        return this;
    }

    public TaskWhereInput resourceMutation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION);
        return this;
    }

    public void setResourceMutation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION);
        }
    }

    public boolean getResourceMutation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION);
    }

    public TaskWhereInput resourceMutationContains(String resourceMutationContains) {

        this.resourceMutationContains = resourceMutationContains;
        return this;
    }

    /**
     * Get resourceMutationContains
     *
     * @return resourceMutationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationContains() {
        return resourceMutationContains;
    }

    public void setResourceMutationContains(String resourceMutationContains) {
        this.resourceMutationContains = resourceMutationContains;
    }

    public TaskWhereInput resourceMutationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceMutationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS);
        return this;
    }

    public void setResourceMutationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS);
        }
    }

    public boolean getResourceMutationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_CONTAINS);
    }

    public TaskWhereInput resourceMutationEndsWith(String resourceMutationEndsWith) {

        this.resourceMutationEndsWith = resourceMutationEndsWith;
        return this;
    }

    /**
     * Get resourceMutationEndsWith
     *
     * @return resourceMutationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationEndsWith() {
        return resourceMutationEndsWith;
    }

    public void setResourceMutationEndsWith(String resourceMutationEndsWith) {
        this.resourceMutationEndsWith = resourceMutationEndsWith;
    }

    public TaskWhereInput resourceMutationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceMutationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH);
        return this;
    }

    public void setResourceMutationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH);
        }
    }

    public boolean getResourceMutationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_ENDS_WITH);
    }

    public TaskWhereInput resourceMutationGt(String resourceMutationGt) {

        this.resourceMutationGt = resourceMutationGt;
        return this;
    }

    /**
     * Get resourceMutationGt
     *
     * @return resourceMutationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationGt() {
        return resourceMutationGt;
    }

    public void setResourceMutationGt(String resourceMutationGt) {
        this.resourceMutationGt = resourceMutationGt;
    }

    public TaskWhereInput resourceMutationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_GT);
        return this;
    }

    public TaskWhereInput resourceMutationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_GT);
        return this;
    }

    public void setResourceMutationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_GT);
        }
    }

    public boolean getResourceMutationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_GT);
    }

    public TaskWhereInput resourceMutationGte(String resourceMutationGte) {

        this.resourceMutationGte = resourceMutationGte;
        return this;
    }

    /**
     * Get resourceMutationGte
     *
     * @return resourceMutationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationGte() {
        return resourceMutationGte;
    }

    public void setResourceMutationGte(String resourceMutationGte) {
        this.resourceMutationGte = resourceMutationGte;
    }

    public TaskWhereInput resourceMutationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_GTE);
        return this;
    }

    public TaskWhereInput resourceMutationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_GTE);
        return this;
    }

    public void setResourceMutationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_GTE);
        }
    }

    public boolean getResourceMutationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_GTE);
    }

    public TaskWhereInput resourceMutationIn(List<String> resourceMutationIn) {

        this.resourceMutationIn = resourceMutationIn;
        return this;
    }

    public TaskWhereInput addResourceMutationInItem(String resourceMutationInItem) {
        if (this.resourceMutationIn == null) {
            this.resourceMutationIn = new ArrayList<String>();
        }
        this.resourceMutationIn.add(resourceMutationInItem);
        return this;
    }

    /**
     * Get resourceMutationIn
     *
     * @return resourceMutationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceMutationIn() {
        return resourceMutationIn;
    }

    public void setResourceMutationIn(List<String> resourceMutationIn) {
        this.resourceMutationIn = resourceMutationIn;
    }

    public TaskWhereInput resourceMutationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_IN);
        return this;
    }

    public TaskWhereInput resourceMutationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_IN);
        return this;
    }

    public void setResourceMutationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_IN);
        }
    }

    public boolean getResourceMutationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_IN);
    }

    public TaskWhereInput resourceMutationLt(String resourceMutationLt) {

        this.resourceMutationLt = resourceMutationLt;
        return this;
    }

    /**
     * Get resourceMutationLt
     *
     * @return resourceMutationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationLt() {
        return resourceMutationLt;
    }

    public void setResourceMutationLt(String resourceMutationLt) {
        this.resourceMutationLt = resourceMutationLt;
    }

    public TaskWhereInput resourceMutationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_LT);
        return this;
    }

    public TaskWhereInput resourceMutationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_LT);
        return this;
    }

    public void setResourceMutationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_LT);
        }
    }

    public boolean getResourceMutationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_LT);
    }

    public TaskWhereInput resourceMutationLte(String resourceMutationLte) {

        this.resourceMutationLte = resourceMutationLte;
        return this;
    }

    /**
     * Get resourceMutationLte
     *
     * @return resourceMutationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationLte() {
        return resourceMutationLte;
    }

    public void setResourceMutationLte(String resourceMutationLte) {
        this.resourceMutationLte = resourceMutationLte;
    }

    public TaskWhereInput resourceMutationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_LTE);
        return this;
    }

    public TaskWhereInput resourceMutationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_LTE);
        return this;
    }

    public void setResourceMutationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_LTE);
        }
    }

    public boolean getResourceMutationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_LTE);
    }

    public TaskWhereInput resourceMutationNot(String resourceMutationNot) {

        this.resourceMutationNot = resourceMutationNot;
        return this;
    }

    /**
     * Get resourceMutationNot
     *
     * @return resourceMutationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationNot() {
        return resourceMutationNot;
    }

    public void setResourceMutationNot(String resourceMutationNot) {
        this.resourceMutationNot = resourceMutationNot;
    }

    public TaskWhereInput resourceMutationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT);
        return this;
    }

    public TaskWhereInput resourceMutationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT);
        return this;
    }

    public void setResourceMutationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT);
        }
    }

    public boolean getResourceMutationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_NOT);
    }

    public TaskWhereInput resourceMutationNotContains(String resourceMutationNotContains) {

        this.resourceMutationNotContains = resourceMutationNotContains;
        return this;
    }

    /**
     * Get resourceMutationNotContains
     *
     * @return resourceMutationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationNotContains() {
        return resourceMutationNotContains;
    }

    public void setResourceMutationNotContains(String resourceMutationNotContains) {
        this.resourceMutationNotContains = resourceMutationNotContains;
    }

    public TaskWhereInput resourceMutationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceMutationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS);
        return this;
    }

    public void setResourceMutationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS);
        }
    }

    public boolean getResourceMutationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_CONTAINS);
    }

    public TaskWhereInput resourceMutationNotEndsWith(String resourceMutationNotEndsWith) {

        this.resourceMutationNotEndsWith = resourceMutationNotEndsWith;
        return this;
    }

    /**
     * Get resourceMutationNotEndsWith
     *
     * @return resourceMutationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationNotEndsWith() {
        return resourceMutationNotEndsWith;
    }

    public void setResourceMutationNotEndsWith(String resourceMutationNotEndsWith) {
        this.resourceMutationNotEndsWith = resourceMutationNotEndsWith;
    }

    public TaskWhereInput resourceMutationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceMutationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceMutationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceMutationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_ENDS_WITH);
    }

    public TaskWhereInput resourceMutationNotIn(List<String> resourceMutationNotIn) {

        this.resourceMutationNotIn = resourceMutationNotIn;
        return this;
    }

    public TaskWhereInput addResourceMutationNotInItem(String resourceMutationNotInItem) {
        if (this.resourceMutationNotIn == null) {
            this.resourceMutationNotIn = new ArrayList<String>();
        }
        this.resourceMutationNotIn.add(resourceMutationNotInItem);
        return this;
    }

    /**
     * Get resourceMutationNotIn
     *
     * @return resourceMutationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceMutationNotIn() {
        return resourceMutationNotIn;
    }

    public void setResourceMutationNotIn(List<String> resourceMutationNotIn) {
        this.resourceMutationNotIn = resourceMutationNotIn;
    }

    public TaskWhereInput resourceMutationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN);
        return this;
    }

    public TaskWhereInput resourceMutationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN);
        return this;
    }

    public void setResourceMutationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN);
        }
    }

    public boolean getResourceMutationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_IN);
    }

    public TaskWhereInput resourceMutationNotStartsWith(String resourceMutationNotStartsWith) {

        this.resourceMutationNotStartsWith = resourceMutationNotStartsWith;
        return this;
    }

    /**
     * Get resourceMutationNotStartsWith
     *
     * @return resourceMutationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationNotStartsWith() {
        return resourceMutationNotStartsWith;
    }

    public void setResourceMutationNotStartsWith(String resourceMutationNotStartsWith) {
        this.resourceMutationNotStartsWith = resourceMutationNotStartsWith;
    }

    public TaskWhereInput resourceMutationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceMutationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceMutationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceMutationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_NOT_STARTS_WITH);
    }

    public TaskWhereInput resourceMutationStartsWith(String resourceMutationStartsWith) {

        this.resourceMutationStartsWith = resourceMutationStartsWith;
        return this;
    }

    /**
     * Get resourceMutationStartsWith
     *
     * @return resourceMutationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutationStartsWith() {
        return resourceMutationStartsWith;
    }

    public void setResourceMutationStartsWith(String resourceMutationStartsWith) {
        this.resourceMutationStartsWith = resourceMutationStartsWith;
    }

    public TaskWhereInput resourceMutationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceMutationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH);
        return this;
    }

    public void setResourceMutationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH);
        }
    }

    public boolean getResourceMutationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION_STARTS_WITH);
    }

    public TaskWhereInput resourceRollbackError(String resourceRollbackError) {

        this.resourceRollbackError = resourceRollbackError;
        return this;
    }

    /**
     * Get resourceRollbackError
     *
     * @return resourceRollbackError
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackError() {
        return resourceRollbackError;
    }

    public void setResourceRollbackError(String resourceRollbackError) {
        this.resourceRollbackError = resourceRollbackError;
    }

    public TaskWhereInput resourceRollbackError_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        return this;
    }

    public TaskWhereInput resourceRollbackError_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        return this;
    }

    public void setResourceRollbackError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        }
    }

    public boolean getResourceRollbackError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
    }

    public TaskWhereInput resourceRollbackErrorContains(String resourceRollbackErrorContains) {

        this.resourceRollbackErrorContains = resourceRollbackErrorContains;
        return this;
    }

    /**
     * Get resourceRollbackErrorContains
     *
     * @return resourceRollbackErrorContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorContains() {
        return resourceRollbackErrorContains;
    }

    public void setResourceRollbackErrorContains(String resourceRollbackErrorContains) {
        this.resourceRollbackErrorContains = resourceRollbackErrorContains;
    }

    public TaskWhereInput resourceRollbackErrorContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS);
        return this;
    }

    public void setResourceRollbackErrorContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS);
        }
    }

    public boolean getResourceRollbackErrorContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_CONTAINS);
    }

    public TaskWhereInput resourceRollbackErrorEndsWith(String resourceRollbackErrorEndsWith) {

        this.resourceRollbackErrorEndsWith = resourceRollbackErrorEndsWith;
        return this;
    }

    /**
     * Get resourceRollbackErrorEndsWith
     *
     * @return resourceRollbackErrorEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorEndsWith() {
        return resourceRollbackErrorEndsWith;
    }

    public void setResourceRollbackErrorEndsWith(String resourceRollbackErrorEndsWith) {
        this.resourceRollbackErrorEndsWith = resourceRollbackErrorEndsWith;
    }

    public TaskWhereInput resourceRollbackErrorEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH);
        return this;
    }

    public void setResourceRollbackErrorEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH);
        }
    }

    public boolean getResourceRollbackErrorEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_ENDS_WITH);
    }

    public TaskWhereInput resourceRollbackErrorGt(String resourceRollbackErrorGt) {

        this.resourceRollbackErrorGt = resourceRollbackErrorGt;
        return this;
    }

    /**
     * Get resourceRollbackErrorGt
     *
     * @return resourceRollbackErrorGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorGt() {
        return resourceRollbackErrorGt;
    }

    public void setResourceRollbackErrorGt(String resourceRollbackErrorGt) {
        this.resourceRollbackErrorGt = resourceRollbackErrorGt;
    }

    public TaskWhereInput resourceRollbackErrorGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT);
        return this;
    }

    public void setResourceRollbackErrorGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT);
        }
    }

    public boolean getResourceRollbackErrorGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GT);
    }

    public TaskWhereInput resourceRollbackErrorGte(String resourceRollbackErrorGte) {

        this.resourceRollbackErrorGte = resourceRollbackErrorGte;
        return this;
    }

    /**
     * Get resourceRollbackErrorGte
     *
     * @return resourceRollbackErrorGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorGte() {
        return resourceRollbackErrorGte;
    }

    public void setResourceRollbackErrorGte(String resourceRollbackErrorGte) {
        this.resourceRollbackErrorGte = resourceRollbackErrorGte;
    }

    public TaskWhereInput resourceRollbackErrorGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE);
        return this;
    }

    public void setResourceRollbackErrorGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE);
        }
    }

    public boolean getResourceRollbackErrorGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_GTE);
    }

    public TaskWhereInput resourceRollbackErrorIn(List<String> resourceRollbackErrorIn) {

        this.resourceRollbackErrorIn = resourceRollbackErrorIn;
        return this;
    }

    public TaskWhereInput addResourceRollbackErrorInItem(String resourceRollbackErrorInItem) {
        if (this.resourceRollbackErrorIn == null) {
            this.resourceRollbackErrorIn = new ArrayList<String>();
        }
        this.resourceRollbackErrorIn.add(resourceRollbackErrorInItem);
        return this;
    }

    /**
     * Get resourceRollbackErrorIn
     *
     * @return resourceRollbackErrorIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceRollbackErrorIn() {
        return resourceRollbackErrorIn;
    }

    public void setResourceRollbackErrorIn(List<String> resourceRollbackErrorIn) {
        this.resourceRollbackErrorIn = resourceRollbackErrorIn;
    }

    public TaskWhereInput resourceRollbackErrorIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN);
        return this;
    }

    public void setResourceRollbackErrorIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN);
        }
    }

    public boolean getResourceRollbackErrorIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_IN);
    }

    public TaskWhereInput resourceRollbackErrorLt(String resourceRollbackErrorLt) {

        this.resourceRollbackErrorLt = resourceRollbackErrorLt;
        return this;
    }

    /**
     * Get resourceRollbackErrorLt
     *
     * @return resourceRollbackErrorLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorLt() {
        return resourceRollbackErrorLt;
    }

    public void setResourceRollbackErrorLt(String resourceRollbackErrorLt) {
        this.resourceRollbackErrorLt = resourceRollbackErrorLt;
    }

    public TaskWhereInput resourceRollbackErrorLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT);
        return this;
    }

    public void setResourceRollbackErrorLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT);
        }
    }

    public boolean getResourceRollbackErrorLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LT);
    }

    public TaskWhereInput resourceRollbackErrorLte(String resourceRollbackErrorLte) {

        this.resourceRollbackErrorLte = resourceRollbackErrorLte;
        return this;
    }

    /**
     * Get resourceRollbackErrorLte
     *
     * @return resourceRollbackErrorLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorLte() {
        return resourceRollbackErrorLte;
    }

    public void setResourceRollbackErrorLte(String resourceRollbackErrorLte) {
        this.resourceRollbackErrorLte = resourceRollbackErrorLte;
    }

    public TaskWhereInput resourceRollbackErrorLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE);
        return this;
    }

    public void setResourceRollbackErrorLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE);
        }
    }

    public boolean getResourceRollbackErrorLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_LTE);
    }

    public TaskWhereInput resourceRollbackErrorNot(String resourceRollbackErrorNot) {

        this.resourceRollbackErrorNot = resourceRollbackErrorNot;
        return this;
    }

    /**
     * Get resourceRollbackErrorNot
     *
     * @return resourceRollbackErrorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorNot() {
        return resourceRollbackErrorNot;
    }

    public void setResourceRollbackErrorNot(String resourceRollbackErrorNot) {
        this.resourceRollbackErrorNot = resourceRollbackErrorNot;
    }

    public TaskWhereInput resourceRollbackErrorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT);
        return this;
    }

    public void setResourceRollbackErrorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT);
        }
    }

    public boolean getResourceRollbackErrorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT);
    }

    public TaskWhereInput resourceRollbackErrorNotContains(
            String resourceRollbackErrorNotContains) {

        this.resourceRollbackErrorNotContains = resourceRollbackErrorNotContains;
        return this;
    }

    /**
     * Get resourceRollbackErrorNotContains
     *
     * @return resourceRollbackErrorNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorNotContains() {
        return resourceRollbackErrorNotContains;
    }

    public void setResourceRollbackErrorNotContains(String resourceRollbackErrorNotContains) {
        this.resourceRollbackErrorNotContains = resourceRollbackErrorNotContains;
    }

    public TaskWhereInput resourceRollbackErrorNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS);
        return this;
    }

    public void setResourceRollbackErrorNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS);
        }
    }

    public boolean getResourceRollbackErrorNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_CONTAINS);
    }

    public TaskWhereInput resourceRollbackErrorNotEndsWith(
            String resourceRollbackErrorNotEndsWith) {

        this.resourceRollbackErrorNotEndsWith = resourceRollbackErrorNotEndsWith;
        return this;
    }

    /**
     * Get resourceRollbackErrorNotEndsWith
     *
     * @return resourceRollbackErrorNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorNotEndsWith() {
        return resourceRollbackErrorNotEndsWith;
    }

    public void setResourceRollbackErrorNotEndsWith(String resourceRollbackErrorNotEndsWith) {
        this.resourceRollbackErrorNotEndsWith = resourceRollbackErrorNotEndsWith;
    }

    public TaskWhereInput resourceRollbackErrorNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceRollbackErrorNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceRollbackErrorNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_ENDS_WITH);
    }

    public TaskWhereInput resourceRollbackErrorNotIn(List<String> resourceRollbackErrorNotIn) {

        this.resourceRollbackErrorNotIn = resourceRollbackErrorNotIn;
        return this;
    }

    public TaskWhereInput addResourceRollbackErrorNotInItem(String resourceRollbackErrorNotInItem) {
        if (this.resourceRollbackErrorNotIn == null) {
            this.resourceRollbackErrorNotIn = new ArrayList<String>();
        }
        this.resourceRollbackErrorNotIn.add(resourceRollbackErrorNotInItem);
        return this;
    }

    /**
     * Get resourceRollbackErrorNotIn
     *
     * @return resourceRollbackErrorNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceRollbackErrorNotIn() {
        return resourceRollbackErrorNotIn;
    }

    public void setResourceRollbackErrorNotIn(List<String> resourceRollbackErrorNotIn) {
        this.resourceRollbackErrorNotIn = resourceRollbackErrorNotIn;
    }

    public TaskWhereInput resourceRollbackErrorNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN);
        return this;
    }

    public void setResourceRollbackErrorNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN);
        }
    }

    public boolean getResourceRollbackErrorNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_IN);
    }

    public TaskWhereInput resourceRollbackErrorNotStartsWith(
            String resourceRollbackErrorNotStartsWith) {

        this.resourceRollbackErrorNotStartsWith = resourceRollbackErrorNotStartsWith;
        return this;
    }

    /**
     * Get resourceRollbackErrorNotStartsWith
     *
     * @return resourceRollbackErrorNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorNotStartsWith() {
        return resourceRollbackErrorNotStartsWith;
    }

    public void setResourceRollbackErrorNotStartsWith(String resourceRollbackErrorNotStartsWith) {
        this.resourceRollbackErrorNotStartsWith = resourceRollbackErrorNotStartsWith;
    }

    public TaskWhereInput resourceRollbackErrorNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceRollbackErrorNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceRollbackErrorNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_NOT_STARTS_WITH);
    }

    public TaskWhereInput resourceRollbackErrorStartsWith(String resourceRollbackErrorStartsWith) {

        this.resourceRollbackErrorStartsWith = resourceRollbackErrorStartsWith;
        return this;
    }

    /**
     * Get resourceRollbackErrorStartsWith
     *
     * @return resourceRollbackErrorStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackErrorStartsWith() {
        return resourceRollbackErrorStartsWith;
    }

    public void setResourceRollbackErrorStartsWith(String resourceRollbackErrorStartsWith) {
        this.resourceRollbackErrorStartsWith = resourceRollbackErrorStartsWith;
    }

    public TaskWhereInput resourceRollbackErrorStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceRollbackErrorStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH);
        return this;
    }

    public void setResourceRollbackErrorStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH);
        }
    }

    public boolean getResourceRollbackErrorStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR_STARTS_WITH);
    }

    public TaskWhereInput resourceRollbackRetryCount(Integer resourceRollbackRetryCount) {

        this.resourceRollbackRetryCount = resourceRollbackRetryCount;
        return this;
    }

    /**
     * Get resourceRollbackRetryCount
     *
     * @return resourceRollbackRetryCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCount() {
        return resourceRollbackRetryCount;
    }

    public void setResourceRollbackRetryCount(Integer resourceRollbackRetryCount) {
        this.resourceRollbackRetryCount = resourceRollbackRetryCount;
    }

    public TaskWhereInput resourceRollbackRetryCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        return this;
    }

    public void setResourceRollbackRetryCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        }
    }

    public boolean getResourceRollbackRetryCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
    }

    public TaskWhereInput resourceRollbackRetryCountGt(Integer resourceRollbackRetryCountGt) {

        this.resourceRollbackRetryCountGt = resourceRollbackRetryCountGt;
        return this;
    }

    /**
     * Get resourceRollbackRetryCountGt
     *
     * @return resourceRollbackRetryCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCountGt() {
        return resourceRollbackRetryCountGt;
    }

    public void setResourceRollbackRetryCountGt(Integer resourceRollbackRetryCountGt) {
        this.resourceRollbackRetryCountGt = resourceRollbackRetryCountGt;
    }

    public TaskWhereInput resourceRollbackRetryCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT);
        return this;
    }

    public void setResourceRollbackRetryCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT);
        }
    }

    public boolean getResourceRollbackRetryCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GT);
    }

    public TaskWhereInput resourceRollbackRetryCountGte(Integer resourceRollbackRetryCountGte) {

        this.resourceRollbackRetryCountGte = resourceRollbackRetryCountGte;
        return this;
    }

    /**
     * Get resourceRollbackRetryCountGte
     *
     * @return resourceRollbackRetryCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCountGte() {
        return resourceRollbackRetryCountGte;
    }

    public void setResourceRollbackRetryCountGte(Integer resourceRollbackRetryCountGte) {
        this.resourceRollbackRetryCountGte = resourceRollbackRetryCountGte;
    }

    public TaskWhereInput resourceRollbackRetryCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE);
        return this;
    }

    public void setResourceRollbackRetryCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE);
        }
    }

    public boolean getResourceRollbackRetryCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_GTE);
    }

    public TaskWhereInput resourceRollbackRetryCountIn(List<Integer> resourceRollbackRetryCountIn) {

        this.resourceRollbackRetryCountIn = resourceRollbackRetryCountIn;
        return this;
    }

    public TaskWhereInput addResourceRollbackRetryCountInItem(
            Integer resourceRollbackRetryCountInItem) {
        if (this.resourceRollbackRetryCountIn == null) {
            this.resourceRollbackRetryCountIn = new ArrayList<Integer>();
        }
        this.resourceRollbackRetryCountIn.add(resourceRollbackRetryCountInItem);
        return this;
    }

    /**
     * Get resourceRollbackRetryCountIn
     *
     * @return resourceRollbackRetryCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceRollbackRetryCountIn() {
        return resourceRollbackRetryCountIn;
    }

    public void setResourceRollbackRetryCountIn(List<Integer> resourceRollbackRetryCountIn) {
        this.resourceRollbackRetryCountIn = resourceRollbackRetryCountIn;
    }

    public TaskWhereInput resourceRollbackRetryCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN);
        return this;
    }

    public void setResourceRollbackRetryCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN);
        }
    }

    public boolean getResourceRollbackRetryCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_IN);
    }

    public TaskWhereInput resourceRollbackRetryCountLt(Integer resourceRollbackRetryCountLt) {

        this.resourceRollbackRetryCountLt = resourceRollbackRetryCountLt;
        return this;
    }

    /**
     * Get resourceRollbackRetryCountLt
     *
     * @return resourceRollbackRetryCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCountLt() {
        return resourceRollbackRetryCountLt;
    }

    public void setResourceRollbackRetryCountLt(Integer resourceRollbackRetryCountLt) {
        this.resourceRollbackRetryCountLt = resourceRollbackRetryCountLt;
    }

    public TaskWhereInput resourceRollbackRetryCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT);
        return this;
    }

    public void setResourceRollbackRetryCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT);
        }
    }

    public boolean getResourceRollbackRetryCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LT);
    }

    public TaskWhereInput resourceRollbackRetryCountLte(Integer resourceRollbackRetryCountLte) {

        this.resourceRollbackRetryCountLte = resourceRollbackRetryCountLte;
        return this;
    }

    /**
     * Get resourceRollbackRetryCountLte
     *
     * @return resourceRollbackRetryCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCountLte() {
        return resourceRollbackRetryCountLte;
    }

    public void setResourceRollbackRetryCountLte(Integer resourceRollbackRetryCountLte) {
        this.resourceRollbackRetryCountLte = resourceRollbackRetryCountLte;
    }

    public TaskWhereInput resourceRollbackRetryCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE);
        return this;
    }

    public void setResourceRollbackRetryCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE);
        }
    }

    public boolean getResourceRollbackRetryCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_LTE);
    }

    public TaskWhereInput resourceRollbackRetryCountNot(Integer resourceRollbackRetryCountNot) {

        this.resourceRollbackRetryCountNot = resourceRollbackRetryCountNot;
        return this;
    }

    /**
     * Get resourceRollbackRetryCountNot
     *
     * @return resourceRollbackRetryCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCountNot() {
        return resourceRollbackRetryCountNot;
    }

    public void setResourceRollbackRetryCountNot(Integer resourceRollbackRetryCountNot) {
        this.resourceRollbackRetryCountNot = resourceRollbackRetryCountNot;
    }

    public TaskWhereInput resourceRollbackRetryCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT);
        return this;
    }

    public void setResourceRollbackRetryCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT);
        }
    }

    public boolean getResourceRollbackRetryCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT);
    }

    public TaskWhereInput resourceRollbackRetryCountNotIn(
            List<Integer> resourceRollbackRetryCountNotIn) {

        this.resourceRollbackRetryCountNotIn = resourceRollbackRetryCountNotIn;
        return this;
    }

    public TaskWhereInput addResourceRollbackRetryCountNotInItem(
            Integer resourceRollbackRetryCountNotInItem) {
        if (this.resourceRollbackRetryCountNotIn == null) {
            this.resourceRollbackRetryCountNotIn = new ArrayList<Integer>();
        }
        this.resourceRollbackRetryCountNotIn.add(resourceRollbackRetryCountNotInItem);
        return this;
    }

    /**
     * Get resourceRollbackRetryCountNotIn
     *
     * @return resourceRollbackRetryCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceRollbackRetryCountNotIn() {
        return resourceRollbackRetryCountNotIn;
    }

    public void setResourceRollbackRetryCountNotIn(List<Integer> resourceRollbackRetryCountNotIn) {
        this.resourceRollbackRetryCountNotIn = resourceRollbackRetryCountNotIn;
    }

    public TaskWhereInput resourceRollbackRetryCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN);
        return this;
    }

    public TaskWhereInput resourceRollbackRetryCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN);
        return this;
    }

    public void setResourceRollbackRetryCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN);
        }
    }

    public boolean getResourceRollbackRetryCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT_NOT_IN);
    }

    public TaskWhereInput resourceRollbacked(Boolean resourceRollbacked) {

        this.resourceRollbacked = resourceRollbacked;
        return this;
    }

    /**
     * Get resourceRollbacked
     *
     * @return resourceRollbacked
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResourceRollbacked() {
        return resourceRollbacked;
    }

    public void setResourceRollbacked(Boolean resourceRollbacked) {
        this.resourceRollbacked = resourceRollbacked;
    }

    public TaskWhereInput resourceRollbacked_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        return this;
    }

    public TaskWhereInput resourceRollbacked_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        return this;
    }

    public void setResourceRollbacked_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        }
    }

    public boolean getResourceRollbacked_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
    }

    public TaskWhereInput resourceRollbackedNot(Boolean resourceRollbackedNot) {

        this.resourceRollbackedNot = resourceRollbackedNot;
        return this;
    }

    /**
     * Get resourceRollbackedNot
     *
     * @return resourceRollbackedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResourceRollbackedNot() {
        return resourceRollbackedNot;
    }

    public void setResourceRollbackedNot(Boolean resourceRollbackedNot) {
        this.resourceRollbackedNot = resourceRollbackedNot;
    }

    public TaskWhereInput resourceRollbackedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT);
        return this;
    }

    public TaskWhereInput resourceRollbackedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT);
        return this;
    }

    public void setResourceRollbackedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT);
        }
    }

    public boolean getResourceRollbackedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACKED_NOT);
    }

    public TaskWhereInput resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public TaskWhereInput resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public TaskWhereInput resourceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public void setResourceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        }
    }

    public boolean getResourceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE);
    }

    public TaskWhereInput resourceTypeContains(String resourceTypeContains) {

        this.resourceTypeContains = resourceTypeContains;
        return this;
    }

    /**
     * Get resourceTypeContains
     *
     * @return resourceTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeContains() {
        return resourceTypeContains;
    }

    public void setResourceTypeContains(String resourceTypeContains) {
        this.resourceTypeContains = resourceTypeContains;
    }

    public TaskWhereInput resourceTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        return this;
    }

    public void setResourceTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        }
    }

    public boolean getResourceTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
    }

    public TaskWhereInput resourceTypeEndsWith(String resourceTypeEndsWith) {

        this.resourceTypeEndsWith = resourceTypeEndsWith;
        return this;
    }

    /**
     * Get resourceTypeEndsWith
     *
     * @return resourceTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeEndsWith() {
        return resourceTypeEndsWith;
    }

    public void setResourceTypeEndsWith(String resourceTypeEndsWith) {
        this.resourceTypeEndsWith = resourceTypeEndsWith;
    }

    public TaskWhereInput resourceTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        return this;
    }

    public void setResourceTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        }
    }

    public boolean getResourceTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
    }

    public TaskWhereInput resourceTypeGt(String resourceTypeGt) {

        this.resourceTypeGt = resourceTypeGt;
        return this;
    }

    /**
     * Get resourceTypeGt
     *
     * @return resourceTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeGt() {
        return resourceTypeGt;
    }

    public void setResourceTypeGt(String resourceTypeGt) {
        this.resourceTypeGt = resourceTypeGt;
    }

    public TaskWhereInput resourceTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        return this;
    }

    public TaskWhereInput resourceTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        return this;
    }

    public void setResourceTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        }
    }

    public boolean getResourceTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_GT);
    }

    public TaskWhereInput resourceTypeGte(String resourceTypeGte) {

        this.resourceTypeGte = resourceTypeGte;
        return this;
    }

    /**
     * Get resourceTypeGte
     *
     * @return resourceTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeGte() {
        return resourceTypeGte;
    }

    public void setResourceTypeGte(String resourceTypeGte) {
        this.resourceTypeGte = resourceTypeGte;
    }

    public TaskWhereInput resourceTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        return this;
    }

    public TaskWhereInput resourceTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        return this;
    }

    public void setResourceTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        }
    }

    public boolean getResourceTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
    }

    public TaskWhereInput resourceTypeIn(List<String> resourceTypeIn) {

        this.resourceTypeIn = resourceTypeIn;
        return this;
    }

    public TaskWhereInput addResourceTypeInItem(String resourceTypeInItem) {
        if (this.resourceTypeIn == null) {
            this.resourceTypeIn = new ArrayList<String>();
        }
        this.resourceTypeIn.add(resourceTypeInItem);
        return this;
    }

    /**
     * Get resourceTypeIn
     *
     * @return resourceTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceTypeIn() {
        return resourceTypeIn;
    }

    public void setResourceTypeIn(List<String> resourceTypeIn) {
        this.resourceTypeIn = resourceTypeIn;
    }

    public TaskWhereInput resourceTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        return this;
    }

    public TaskWhereInput resourceTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        return this;
    }

    public void setResourceTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        }
    }

    public boolean getResourceTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_IN);
    }

    public TaskWhereInput resourceTypeLt(String resourceTypeLt) {

        this.resourceTypeLt = resourceTypeLt;
        return this;
    }

    /**
     * Get resourceTypeLt
     *
     * @return resourceTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeLt() {
        return resourceTypeLt;
    }

    public void setResourceTypeLt(String resourceTypeLt) {
        this.resourceTypeLt = resourceTypeLt;
    }

    public TaskWhereInput resourceTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        return this;
    }

    public TaskWhereInput resourceTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        return this;
    }

    public void setResourceTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        }
    }

    public boolean getResourceTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_LT);
    }

    public TaskWhereInput resourceTypeLte(String resourceTypeLte) {

        this.resourceTypeLte = resourceTypeLte;
        return this;
    }

    /**
     * Get resourceTypeLte
     *
     * @return resourceTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeLte() {
        return resourceTypeLte;
    }

    public void setResourceTypeLte(String resourceTypeLte) {
        this.resourceTypeLte = resourceTypeLte;
    }

    public TaskWhereInput resourceTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        return this;
    }

    public TaskWhereInput resourceTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        return this;
    }

    public void setResourceTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        }
    }

    public boolean getResourceTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
    }

    public TaskWhereInput resourceTypeNot(String resourceTypeNot) {

        this.resourceTypeNot = resourceTypeNot;
        return this;
    }

    /**
     * Get resourceTypeNot
     *
     * @return resourceTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNot() {
        return resourceTypeNot;
    }

    public void setResourceTypeNot(String resourceTypeNot) {
        this.resourceTypeNot = resourceTypeNot;
    }

    public TaskWhereInput resourceTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        return this;
    }

    public TaskWhereInput resourceTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        return this;
    }

    public void setResourceTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        }
    }

    public boolean getResourceTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
    }

    public TaskWhereInput resourceTypeNotContains(String resourceTypeNotContains) {

        this.resourceTypeNotContains = resourceTypeNotContains;
        return this;
    }

    /**
     * Get resourceTypeNotContains
     *
     * @return resourceTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotContains() {
        return resourceTypeNotContains;
    }

    public void setResourceTypeNotContains(String resourceTypeNotContains) {
        this.resourceTypeNotContains = resourceTypeNotContains;
    }

    public TaskWhereInput resourceTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput resourceTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setResourceTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getResourceTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
    }

    public TaskWhereInput resourceTypeNotEndsWith(String resourceTypeNotEndsWith) {

        this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
        return this;
    }

    /**
     * Get resourceTypeNotEndsWith
     *
     * @return resourceTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotEndsWith() {
        return resourceTypeNotEndsWith;
    }

    public void setResourceTypeNotEndsWith(String resourceTypeNotEndsWith) {
        this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
    }

    public TaskWhereInput resourceTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput resourceTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
    }

    public TaskWhereInput resourceTypeNotIn(List<String> resourceTypeNotIn) {

        this.resourceTypeNotIn = resourceTypeNotIn;
        return this;
    }

    public TaskWhereInput addResourceTypeNotInItem(String resourceTypeNotInItem) {
        if (this.resourceTypeNotIn == null) {
            this.resourceTypeNotIn = new ArrayList<String>();
        }
        this.resourceTypeNotIn.add(resourceTypeNotInItem);
        return this;
    }

    /**
     * Get resourceTypeNotIn
     *
     * @return resourceTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceTypeNotIn() {
        return resourceTypeNotIn;
    }

    public void setResourceTypeNotIn(List<String> resourceTypeNotIn) {
        this.resourceTypeNotIn = resourceTypeNotIn;
    }

    public TaskWhereInput resourceTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        return this;
    }

    public TaskWhereInput resourceTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        return this;
    }

    public void setResourceTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        }
    }

    public boolean getResourceTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
    }

    public TaskWhereInput resourceTypeNotStartsWith(String resourceTypeNotStartsWith) {

        this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
        return this;
    }

    /**
     * Get resourceTypeNotStartsWith
     *
     * @return resourceTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotStartsWith() {
        return resourceTypeNotStartsWith;
    }

    public void setResourceTypeNotStartsWith(String resourceTypeNotStartsWith) {
        this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
    }

    public TaskWhereInput resourceTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
    }

    public TaskWhereInput resourceTypeStartsWith(String resourceTypeStartsWith) {

        this.resourceTypeStartsWith = resourceTypeStartsWith;
        return this;
    }

    /**
     * Get resourceTypeStartsWith
     *
     * @return resourceTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeStartsWith() {
        return resourceTypeStartsWith;
    }

    public void setResourceTypeStartsWith(String resourceTypeStartsWith) {
        this.resourceTypeStartsWith = resourceTypeStartsWith;
    }

    public TaskWhereInput resourceTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        return this;
    }

    public TaskWhereInput resourceTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        return this;
    }

    public void setResourceTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        }
    }

    public boolean getResourceTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
    }

    public TaskWhereInput snapshot(String snapshot) {

        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get snapshot
     *
     * @return snapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public TaskWhereInput snapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public TaskWhereInput snapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public void setSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT);
        }
    }

    public boolean getSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT);
    }

    public TaskWhereInput snapshotContains(String snapshotContains) {

        this.snapshotContains = snapshotContains;
        return this;
    }

    /**
     * Get snapshotContains
     *
     * @return snapshotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotContains() {
        return snapshotContains;
    }

    public void setSnapshotContains(String snapshotContains) {
        this.snapshotContains = snapshotContains;
    }

    public TaskWhereInput snapshotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONTAINS);
        return this;
    }

    public TaskWhereInput snapshotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONTAINS);
        return this;
    }

    public void setSnapshotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONTAINS);
        }
    }

    public boolean getSnapshotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONTAINS);
    }

    public TaskWhereInput snapshotEndsWith(String snapshotEndsWith) {

        this.snapshotEndsWith = snapshotEndsWith;
        return this;
    }

    /**
     * Get snapshotEndsWith
     *
     * @return snapshotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotEndsWith() {
        return snapshotEndsWith;
    }

    public void setSnapshotEndsWith(String snapshotEndsWith) {
        this.snapshotEndsWith = snapshotEndsWith;
    }

    public TaskWhereInput snapshotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput snapshotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_ENDS_WITH);
        return this;
    }

    public void setSnapshotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_ENDS_WITH);
        }
    }

    public boolean getSnapshotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_ENDS_WITH);
    }

    public TaskWhereInput snapshotGt(String snapshotGt) {

        this.snapshotGt = snapshotGt;
        return this;
    }

    /**
     * Get snapshotGt
     *
     * @return snapshotGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotGt() {
        return snapshotGt;
    }

    public void setSnapshotGt(String snapshotGt) {
        this.snapshotGt = snapshotGt;
    }

    public TaskWhereInput snapshotGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GT);
        return this;
    }

    public TaskWhereInput snapshotGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GT);
        return this;
    }

    public void setSnapshotGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GT);
        }
    }

    public boolean getSnapshotGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GT);
    }

    public TaskWhereInput snapshotGte(String snapshotGte) {

        this.snapshotGte = snapshotGte;
        return this;
    }

    /**
     * Get snapshotGte
     *
     * @return snapshotGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotGte() {
        return snapshotGte;
    }

    public void setSnapshotGte(String snapshotGte) {
        this.snapshotGte = snapshotGte;
    }

    public TaskWhereInput snapshotGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GTE);
        return this;
    }

    public TaskWhereInput snapshotGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GTE);
        return this;
    }

    public void setSnapshotGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GTE);
        }
    }

    public boolean getSnapshotGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GTE);
    }

    public TaskWhereInput snapshotIn(List<String> snapshotIn) {

        this.snapshotIn = snapshotIn;
        return this;
    }

    public TaskWhereInput addSnapshotInItem(String snapshotInItem) {
        if (this.snapshotIn == null) {
            this.snapshotIn = new ArrayList<String>();
        }
        this.snapshotIn.add(snapshotInItem);
        return this;
    }

    /**
     * Get snapshotIn
     *
     * @return snapshotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSnapshotIn() {
        return snapshotIn;
    }

    public void setSnapshotIn(List<String> snapshotIn) {
        this.snapshotIn = snapshotIn;
    }

    public TaskWhereInput snapshotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_IN);
        return this;
    }

    public TaskWhereInput snapshotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_IN);
        return this;
    }

    public void setSnapshotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_IN);
        }
    }

    public boolean getSnapshotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_IN);
    }

    public TaskWhereInput snapshotLt(String snapshotLt) {

        this.snapshotLt = snapshotLt;
        return this;
    }

    /**
     * Get snapshotLt
     *
     * @return snapshotLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotLt() {
        return snapshotLt;
    }

    public void setSnapshotLt(String snapshotLt) {
        this.snapshotLt = snapshotLt;
    }

    public TaskWhereInput snapshotLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_LT);
        return this;
    }

    public TaskWhereInput snapshotLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_LT);
        return this;
    }

    public void setSnapshotLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_LT);
        }
    }

    public boolean getSnapshotLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_LT);
    }

    public TaskWhereInput snapshotLte(String snapshotLte) {

        this.snapshotLte = snapshotLte;
        return this;
    }

    /**
     * Get snapshotLte
     *
     * @return snapshotLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotLte() {
        return snapshotLte;
    }

    public void setSnapshotLte(String snapshotLte) {
        this.snapshotLte = snapshotLte;
    }

    public TaskWhereInput snapshotLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_LTE);
        return this;
    }

    public TaskWhereInput snapshotLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_LTE);
        return this;
    }

    public void setSnapshotLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_LTE);
        }
    }

    public boolean getSnapshotLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_LTE);
    }

    public TaskWhereInput snapshotNot(String snapshotNot) {

        this.snapshotNot = snapshotNot;
        return this;
    }

    /**
     * Get snapshotNot
     *
     * @return snapshotNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotNot() {
        return snapshotNot;
    }

    public void setSnapshotNot(String snapshotNot) {
        this.snapshotNot = snapshotNot;
    }

    public TaskWhereInput snapshotNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT);
        return this;
    }

    public TaskWhereInput snapshotNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT);
        return this;
    }

    public void setSnapshotNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT);
        }
    }

    public boolean getSnapshotNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NOT);
    }

    public TaskWhereInput snapshotNotContains(String snapshotNotContains) {

        this.snapshotNotContains = snapshotNotContains;
        return this;
    }

    /**
     * Get snapshotNotContains
     *
     * @return snapshotNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotNotContains() {
        return snapshotNotContains;
    }

    public void setSnapshotNotContains(String snapshotNotContains) {
        this.snapshotNotContains = snapshotNotContains;
    }

    public TaskWhereInput snapshotNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS);
        return this;
    }

    public TaskWhereInput snapshotNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS);
        return this;
    }

    public void setSnapshotNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS);
        }
    }

    public boolean getSnapshotNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NOT_CONTAINS);
    }

    public TaskWhereInput snapshotNotEndsWith(String snapshotNotEndsWith) {

        this.snapshotNotEndsWith = snapshotNotEndsWith;
        return this;
    }

    /**
     * Get snapshotNotEndsWith
     *
     * @return snapshotNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotNotEndsWith() {
        return snapshotNotEndsWith;
    }

    public void setSnapshotNotEndsWith(String snapshotNotEndsWith) {
        this.snapshotNotEndsWith = snapshotNotEndsWith;
    }

    public TaskWhereInput snapshotNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH);
        return this;
    }

    public TaskWhereInput snapshotNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH);
        return this;
    }

    public void setSnapshotNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH);
        }
    }

    public boolean getSnapshotNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NOT_ENDS_WITH);
    }

    public TaskWhereInput snapshotNotIn(List<String> snapshotNotIn) {

        this.snapshotNotIn = snapshotNotIn;
        return this;
    }

    public TaskWhereInput addSnapshotNotInItem(String snapshotNotInItem) {
        if (this.snapshotNotIn == null) {
            this.snapshotNotIn = new ArrayList<String>();
        }
        this.snapshotNotIn.add(snapshotNotInItem);
        return this;
    }

    /**
     * Get snapshotNotIn
     *
     * @return snapshotNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSnapshotNotIn() {
        return snapshotNotIn;
    }

    public void setSnapshotNotIn(List<String> snapshotNotIn) {
        this.snapshotNotIn = snapshotNotIn;
    }

    public TaskWhereInput snapshotNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_IN);
        return this;
    }

    public TaskWhereInput snapshotNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_IN);
        return this;
    }

    public void setSnapshotNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_IN);
        }
    }

    public boolean getSnapshotNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NOT_IN);
    }

    public TaskWhereInput snapshotNotStartsWith(String snapshotNotStartsWith) {

        this.snapshotNotStartsWith = snapshotNotStartsWith;
        return this;
    }

    /**
     * Get snapshotNotStartsWith
     *
     * @return snapshotNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotNotStartsWith() {
        return snapshotNotStartsWith;
    }

    public void setSnapshotNotStartsWith(String snapshotNotStartsWith) {
        this.snapshotNotStartsWith = snapshotNotStartsWith;
    }

    public TaskWhereInput snapshotNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput snapshotNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH);
        return this;
    }

    public void setSnapshotNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH);
        }
    }

    public boolean getSnapshotNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NOT_STARTS_WITH);
    }

    public TaskWhereInput snapshotStartsWith(String snapshotStartsWith) {

        this.snapshotStartsWith = snapshotStartsWith;
        return this;
    }

    /**
     * Get snapshotStartsWith
     *
     * @return snapshotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotStartsWith() {
        return snapshotStartsWith;
    }

    public void setSnapshotStartsWith(String snapshotStartsWith) {
        this.snapshotStartsWith = snapshotStartsWith;
    }

    public TaskWhereInput snapshotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_STARTS_WITH);
        return this;
    }

    public TaskWhereInput snapshotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_STARTS_WITH);
        return this;
    }

    public void setSnapshotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_STARTS_WITH);
        }
    }

    public boolean getSnapshotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_STARTS_WITH);
    }

    public TaskWhereInput startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public TaskWhereInput startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public TaskWhereInput startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public TaskWhereInput startedAtGt(String startedAtGt) {

        this.startedAtGt = startedAtGt;
        return this;
    }

    /**
     * Get startedAtGt
     *
     * @return startedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtGt() {
        return startedAtGt;
    }

    public void setStartedAtGt(String startedAtGt) {
        this.startedAtGt = startedAtGt;
    }

    public TaskWhereInput startedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public TaskWhereInput startedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public void setStartedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GT);
        }
    }

    public boolean getStartedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_GT);
    }

    public TaskWhereInput startedAtGte(String startedAtGte) {

        this.startedAtGte = startedAtGte;
        return this;
    }

    /**
     * Get startedAtGte
     *
     * @return startedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtGte() {
        return startedAtGte;
    }

    public void setStartedAtGte(String startedAtGte) {
        this.startedAtGte = startedAtGte;
    }

    public TaskWhereInput startedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public TaskWhereInput startedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public void setStartedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GTE);
        }
    }

    public boolean getStartedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_GTE);
    }

    public TaskWhereInput startedAtIn(List<String> startedAtIn) {

        this.startedAtIn = startedAtIn;
        return this;
    }

    public TaskWhereInput addStartedAtInItem(String startedAtInItem) {
        if (this.startedAtIn == null) {
            this.startedAtIn = new ArrayList<String>();
        }
        this.startedAtIn.add(startedAtInItem);
        return this;
    }

    /**
     * Get startedAtIn
     *
     * @return startedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartedAtIn() {
        return startedAtIn;
    }

    public void setStartedAtIn(List<String> startedAtIn) {
        this.startedAtIn = startedAtIn;
    }

    public TaskWhereInput startedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public TaskWhereInput startedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public void setStartedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_IN);
        }
    }

    public boolean getStartedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_IN);
    }

    public TaskWhereInput startedAtLt(String startedAtLt) {

        this.startedAtLt = startedAtLt;
        return this;
    }

    /**
     * Get startedAtLt
     *
     * @return startedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtLt() {
        return startedAtLt;
    }

    public void setStartedAtLt(String startedAtLt) {
        this.startedAtLt = startedAtLt;
    }

    public TaskWhereInput startedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public TaskWhereInput startedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public void setStartedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LT);
        }
    }

    public boolean getStartedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_LT);
    }

    public TaskWhereInput startedAtLte(String startedAtLte) {

        this.startedAtLte = startedAtLte;
        return this;
    }

    /**
     * Get startedAtLte
     *
     * @return startedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtLte() {
        return startedAtLte;
    }

    public void setStartedAtLte(String startedAtLte) {
        this.startedAtLte = startedAtLte;
    }

    public TaskWhereInput startedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public TaskWhereInput startedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public void setStartedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LTE);
        }
    }

    public boolean getStartedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_LTE);
    }

    public TaskWhereInput startedAtNot(String startedAtNot) {

        this.startedAtNot = startedAtNot;
        return this;
    }

    /**
     * Get startedAtNot
     *
     * @return startedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtNot() {
        return startedAtNot;
    }

    public void setStartedAtNot(String startedAtNot) {
        this.startedAtNot = startedAtNot;
    }

    public TaskWhereInput startedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public TaskWhereInput startedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public void setStartedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT);
        }
    }

    public boolean getStartedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_NOT);
    }

    public TaskWhereInput startedAtNotIn(List<String> startedAtNotIn) {

        this.startedAtNotIn = startedAtNotIn;
        return this;
    }

    public TaskWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
        if (this.startedAtNotIn == null) {
            this.startedAtNotIn = new ArrayList<String>();
        }
        this.startedAtNotIn.add(startedAtNotInItem);
        return this;
    }

    /**
     * Get startedAtNotIn
     *
     * @return startedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartedAtNotIn() {
        return startedAtNotIn;
    }

    public void setStartedAtNotIn(List<String> startedAtNotIn) {
        this.startedAtNotIn = startedAtNotIn;
    }

    public TaskWhereInput startedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public TaskWhereInput startedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public void setStartedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        }
    }

    public boolean getStartedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_NOT_IN);
    }

    public TaskWhereInput status(TaskStatus status) {

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
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public TaskWhereInput status_ExplictlyNonNull() {
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

    public TaskWhereInput statusIn(List<TaskStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public TaskWhereInput addStatusInItem(TaskStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<TaskStatus>();
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
    public List<TaskStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<TaskStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public TaskWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public TaskWhereInput statusIn_ExplictlyNonNull() {
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

    public TaskWhereInput statusNot(TaskStatus statusNot) {

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
    public TaskStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(TaskStatus statusNot) {
        this.statusNot = statusNot;
    }

    public TaskWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public TaskWhereInput statusNot_ExplictlyNonNull() {
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

    public TaskWhereInput statusNotIn(List<TaskStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public TaskWhereInput addStatusNotInItem(TaskStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<TaskStatus>();
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
    public List<TaskStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<TaskStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public TaskWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public TaskWhereInput statusNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput type(TaskType type) {

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
    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public TaskWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public TaskWhereInput type_ExplictlyNonNull() {
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

    public TaskWhereInput typeIn(List<TaskType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public TaskWhereInput addTypeInItem(TaskType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<TaskType>();
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
    public List<TaskType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<TaskType> typeIn) {
        this.typeIn = typeIn;
    }

    public TaskWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public TaskWhereInput typeIn_ExplictlyNonNull() {
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

    public TaskWhereInput typeNot(TaskType typeNot) {

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
    public TaskType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(TaskType typeNot) {
        this.typeNot = typeNot;
    }

    public TaskWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public TaskWhereInput typeNot_ExplictlyNonNull() {
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

    public TaskWhereInput typeNotIn(List<TaskType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public TaskWhereInput addTypeNotInItem(TaskType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<TaskType>();
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
    public List<TaskType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<TaskType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public TaskWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public TaskWhereInput typeNotIn_ExplictlyNonNull() {
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

    public TaskWhereInput user(UserWhereInput user) {

        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserWhereInput getUser() {
        return user;
    }

    public void setUser(UserWhereInput user) {
        this.user = user;
    }

    public TaskWhereInput user_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER);
        return this;
    }

    public TaskWhereInput user_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER);
        return this;
    }

    public void setUser_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER);
        }
    }

    public boolean getUser_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskWhereInput taskWhereInput = (TaskWhereInput) o;
        return Objects.equals(this.AND, taskWhereInput.AND)
                && Objects.equals(this.NOT, taskWhereInput.NOT)
                && Objects.equals(this.OR, taskWhereInput.OR)
                && Objects.equals(this.cluster, taskWhereInput.cluster)
                && Objects.equals(this.description, taskWhereInput.description)
                && Objects.equals(this.descriptionContains, taskWhereInput.descriptionContains)
                && Objects.equals(this.descriptionEndsWith, taskWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, taskWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, taskWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, taskWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, taskWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, taskWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, taskWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, taskWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, taskWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, taskWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith, taskWhereInput.descriptionNotStartsWith)
                && Objects.equals(this.descriptionStartsWith, taskWhereInput.descriptionStartsWith)
                && Objects.equals(this.errorCode, taskWhereInput.errorCode)
                && Objects.equals(this.errorCodeContains, taskWhereInput.errorCodeContains)
                && Objects.equals(this.errorCodeEndsWith, taskWhereInput.errorCodeEndsWith)
                && Objects.equals(this.errorCodeGt, taskWhereInput.errorCodeGt)
                && Objects.equals(this.errorCodeGte, taskWhereInput.errorCodeGte)
                && Objects.equals(this.errorCodeIn, taskWhereInput.errorCodeIn)
                && Objects.equals(this.errorCodeLt, taskWhereInput.errorCodeLt)
                && Objects.equals(this.errorCodeLte, taskWhereInput.errorCodeLte)
                && Objects.equals(this.errorCodeNot, taskWhereInput.errorCodeNot)
                && Objects.equals(this.errorCodeNotContains, taskWhereInput.errorCodeNotContains)
                && Objects.equals(this.errorCodeNotEndsWith, taskWhereInput.errorCodeNotEndsWith)
                && Objects.equals(this.errorCodeNotIn, taskWhereInput.errorCodeNotIn)
                && Objects.equals(
                        this.errorCodeNotStartsWith, taskWhereInput.errorCodeNotStartsWith)
                && Objects.equals(this.errorCodeStartsWith, taskWhereInput.errorCodeStartsWith)
                && Objects.equals(this.errorMessage, taskWhereInput.errorMessage)
                && Objects.equals(this.errorMessageContains, taskWhereInput.errorMessageContains)
                && Objects.equals(this.errorMessageEndsWith, taskWhereInput.errorMessageEndsWith)
                && Objects.equals(this.errorMessageGt, taskWhereInput.errorMessageGt)
                && Objects.equals(this.errorMessageGte, taskWhereInput.errorMessageGte)
                && Objects.equals(this.errorMessageIn, taskWhereInput.errorMessageIn)
                && Objects.equals(this.errorMessageLt, taskWhereInput.errorMessageLt)
                && Objects.equals(this.errorMessageLte, taskWhereInput.errorMessageLte)
                && Objects.equals(this.errorMessageNot, taskWhereInput.errorMessageNot)
                && Objects.equals(
                        this.errorMessageNotContains, taskWhereInput.errorMessageNotContains)
                && Objects.equals(
                        this.errorMessageNotEndsWith, taskWhereInput.errorMessageNotEndsWith)
                && Objects.equals(this.errorMessageNotIn, taskWhereInput.errorMessageNotIn)
                && Objects.equals(
                        this.errorMessageNotStartsWith, taskWhereInput.errorMessageNotStartsWith)
                && Objects.equals(
                        this.errorMessageStartsWith, taskWhereInput.errorMessageStartsWith)
                && Objects.equals(this.finishedAt, taskWhereInput.finishedAt)
                && Objects.equals(this.finishedAtGt, taskWhereInput.finishedAtGt)
                && Objects.equals(this.finishedAtGte, taskWhereInput.finishedAtGte)
                && Objects.equals(this.finishedAtIn, taskWhereInput.finishedAtIn)
                && Objects.equals(this.finishedAtLt, taskWhereInput.finishedAtLt)
                && Objects.equals(this.finishedAtLte, taskWhereInput.finishedAtLte)
                && Objects.equals(this.finishedAtNot, taskWhereInput.finishedAtNot)
                && Objects.equals(this.finishedAtNotIn, taskWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, taskWhereInput.id)
                && Objects.equals(this.idContains, taskWhereInput.idContains)
                && Objects.equals(this.idEndsWith, taskWhereInput.idEndsWith)
                && Objects.equals(this.idGt, taskWhereInput.idGt)
                && Objects.equals(this.idGte, taskWhereInput.idGte)
                && Objects.equals(this.idIn, taskWhereInput.idIn)
                && Objects.equals(this.idLt, taskWhereInput.idLt)
                && Objects.equals(this.idLte, taskWhereInput.idLte)
                && Objects.equals(this.idNot, taskWhereInput.idNot)
                && Objects.equals(this.idNotContains, taskWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, taskWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, taskWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, taskWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, taskWhereInput.idStartsWith)
                && Objects.equals(this.internal, taskWhereInput.internal)
                && Objects.equals(this.internalNot, taskWhereInput.internalNot)
                && Objects.equals(this.key, taskWhereInput.key)
                && Objects.equals(this.keyContains, taskWhereInput.keyContains)
                && Objects.equals(this.keyEndsWith, taskWhereInput.keyEndsWith)
                && Objects.equals(this.keyGt, taskWhereInput.keyGt)
                && Objects.equals(this.keyGte, taskWhereInput.keyGte)
                && Objects.equals(this.keyIn, taskWhereInput.keyIn)
                && Objects.equals(this.keyLt, taskWhereInput.keyLt)
                && Objects.equals(this.keyLte, taskWhereInput.keyLte)
                && Objects.equals(this.keyNot, taskWhereInput.keyNot)
                && Objects.equals(this.keyNotContains, taskWhereInput.keyNotContains)
                && Objects.equals(this.keyNotEndsWith, taskWhereInput.keyNotEndsWith)
                && Objects.equals(this.keyNotIn, taskWhereInput.keyNotIn)
                && Objects.equals(this.keyNotStartsWith, taskWhereInput.keyNotStartsWith)
                && Objects.equals(this.keyStartsWith, taskWhereInput.keyStartsWith)
                && Objects.equals(this.localCreatedAt, taskWhereInput.localCreatedAt)
                && Objects.equals(this.localCreatedAtGt, taskWhereInput.localCreatedAtGt)
                && Objects.equals(this.localCreatedAtGte, taskWhereInput.localCreatedAtGte)
                && Objects.equals(this.localCreatedAtIn, taskWhereInput.localCreatedAtIn)
                && Objects.equals(this.localCreatedAtLt, taskWhereInput.localCreatedAtLt)
                && Objects.equals(this.localCreatedAtLte, taskWhereInput.localCreatedAtLte)
                && Objects.equals(this.localCreatedAtNot, taskWhereInput.localCreatedAtNot)
                && Objects.equals(this.localCreatedAtNotIn, taskWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.progress, taskWhereInput.progress)
                && Objects.equals(this.progressGt, taskWhereInput.progressGt)
                && Objects.equals(this.progressGte, taskWhereInput.progressGte)
                && Objects.equals(this.progressIn, taskWhereInput.progressIn)
                && Objects.equals(this.progressLt, taskWhereInput.progressLt)
                && Objects.equals(this.progressLte, taskWhereInput.progressLte)
                && Objects.equals(this.progressNot, taskWhereInput.progressNot)
                && Objects.equals(this.progressNotIn, taskWhereInput.progressNotIn)
                && Objects.equals(this.resourceId, taskWhereInput.resourceId)
                && Objects.equals(this.resourceIdContains, taskWhereInput.resourceIdContains)
                && Objects.equals(this.resourceIdEndsWith, taskWhereInput.resourceIdEndsWith)
                && Objects.equals(this.resourceIdGt, taskWhereInput.resourceIdGt)
                && Objects.equals(this.resourceIdGte, taskWhereInput.resourceIdGte)
                && Objects.equals(this.resourceIdIn, taskWhereInput.resourceIdIn)
                && Objects.equals(this.resourceIdLt, taskWhereInput.resourceIdLt)
                && Objects.equals(this.resourceIdLte, taskWhereInput.resourceIdLte)
                && Objects.equals(this.resourceIdNot, taskWhereInput.resourceIdNot)
                && Objects.equals(this.resourceIdNotContains, taskWhereInput.resourceIdNotContains)
                && Objects.equals(this.resourceIdNotEndsWith, taskWhereInput.resourceIdNotEndsWith)
                && Objects.equals(this.resourceIdNotIn, taskWhereInput.resourceIdNotIn)
                && Objects.equals(
                        this.resourceIdNotStartsWith, taskWhereInput.resourceIdNotStartsWith)
                && Objects.equals(this.resourceIdStartsWith, taskWhereInput.resourceIdStartsWith)
                && Objects.equals(this.resourceMutation, taskWhereInput.resourceMutation)
                && Objects.equals(
                        this.resourceMutationContains, taskWhereInput.resourceMutationContains)
                && Objects.equals(
                        this.resourceMutationEndsWith, taskWhereInput.resourceMutationEndsWith)
                && Objects.equals(this.resourceMutationGt, taskWhereInput.resourceMutationGt)
                && Objects.equals(this.resourceMutationGte, taskWhereInput.resourceMutationGte)
                && Objects.equals(this.resourceMutationIn, taskWhereInput.resourceMutationIn)
                && Objects.equals(this.resourceMutationLt, taskWhereInput.resourceMutationLt)
                && Objects.equals(this.resourceMutationLte, taskWhereInput.resourceMutationLte)
                && Objects.equals(this.resourceMutationNot, taskWhereInput.resourceMutationNot)
                && Objects.equals(
                        this.resourceMutationNotContains,
                        taskWhereInput.resourceMutationNotContains)
                && Objects.equals(
                        this.resourceMutationNotEndsWith,
                        taskWhereInput.resourceMutationNotEndsWith)
                && Objects.equals(this.resourceMutationNotIn, taskWhereInput.resourceMutationNotIn)
                && Objects.equals(
                        this.resourceMutationNotStartsWith,
                        taskWhereInput.resourceMutationNotStartsWith)
                && Objects.equals(
                        this.resourceMutationStartsWith, taskWhereInput.resourceMutationStartsWith)
                && Objects.equals(this.resourceRollbackError, taskWhereInput.resourceRollbackError)
                && Objects.equals(
                        this.resourceRollbackErrorContains,
                        taskWhereInput.resourceRollbackErrorContains)
                && Objects.equals(
                        this.resourceRollbackErrorEndsWith,
                        taskWhereInput.resourceRollbackErrorEndsWith)
                && Objects.equals(
                        this.resourceRollbackErrorGt, taskWhereInput.resourceRollbackErrorGt)
                && Objects.equals(
                        this.resourceRollbackErrorGte, taskWhereInput.resourceRollbackErrorGte)
                && Objects.equals(
                        this.resourceRollbackErrorIn, taskWhereInput.resourceRollbackErrorIn)
                && Objects.equals(
                        this.resourceRollbackErrorLt, taskWhereInput.resourceRollbackErrorLt)
                && Objects.equals(
                        this.resourceRollbackErrorLte, taskWhereInput.resourceRollbackErrorLte)
                && Objects.equals(
                        this.resourceRollbackErrorNot, taskWhereInput.resourceRollbackErrorNot)
                && Objects.equals(
                        this.resourceRollbackErrorNotContains,
                        taskWhereInput.resourceRollbackErrorNotContains)
                && Objects.equals(
                        this.resourceRollbackErrorNotEndsWith,
                        taskWhereInput.resourceRollbackErrorNotEndsWith)
                && Objects.equals(
                        this.resourceRollbackErrorNotIn, taskWhereInput.resourceRollbackErrorNotIn)
                && Objects.equals(
                        this.resourceRollbackErrorNotStartsWith,
                        taskWhereInput.resourceRollbackErrorNotStartsWith)
                && Objects.equals(
                        this.resourceRollbackErrorStartsWith,
                        taskWhereInput.resourceRollbackErrorStartsWith)
                && Objects.equals(
                        this.resourceRollbackRetryCount, taskWhereInput.resourceRollbackRetryCount)
                && Objects.equals(
                        this.resourceRollbackRetryCountGt,
                        taskWhereInput.resourceRollbackRetryCountGt)
                && Objects.equals(
                        this.resourceRollbackRetryCountGte,
                        taskWhereInput.resourceRollbackRetryCountGte)
                && Objects.equals(
                        this.resourceRollbackRetryCountIn,
                        taskWhereInput.resourceRollbackRetryCountIn)
                && Objects.equals(
                        this.resourceRollbackRetryCountLt,
                        taskWhereInput.resourceRollbackRetryCountLt)
                && Objects.equals(
                        this.resourceRollbackRetryCountLte,
                        taskWhereInput.resourceRollbackRetryCountLte)
                && Objects.equals(
                        this.resourceRollbackRetryCountNot,
                        taskWhereInput.resourceRollbackRetryCountNot)
                && Objects.equals(
                        this.resourceRollbackRetryCountNotIn,
                        taskWhereInput.resourceRollbackRetryCountNotIn)
                && Objects.equals(this.resourceRollbacked, taskWhereInput.resourceRollbacked)
                && Objects.equals(this.resourceRollbackedNot, taskWhereInput.resourceRollbackedNot)
                && Objects.equals(this.resourceType, taskWhereInput.resourceType)
                && Objects.equals(this.resourceTypeContains, taskWhereInput.resourceTypeContains)
                && Objects.equals(this.resourceTypeEndsWith, taskWhereInput.resourceTypeEndsWith)
                && Objects.equals(this.resourceTypeGt, taskWhereInput.resourceTypeGt)
                && Objects.equals(this.resourceTypeGte, taskWhereInput.resourceTypeGte)
                && Objects.equals(this.resourceTypeIn, taskWhereInput.resourceTypeIn)
                && Objects.equals(this.resourceTypeLt, taskWhereInput.resourceTypeLt)
                && Objects.equals(this.resourceTypeLte, taskWhereInput.resourceTypeLte)
                && Objects.equals(this.resourceTypeNot, taskWhereInput.resourceTypeNot)
                && Objects.equals(
                        this.resourceTypeNotContains, taskWhereInput.resourceTypeNotContains)
                && Objects.equals(
                        this.resourceTypeNotEndsWith, taskWhereInput.resourceTypeNotEndsWith)
                && Objects.equals(this.resourceTypeNotIn, taskWhereInput.resourceTypeNotIn)
                && Objects.equals(
                        this.resourceTypeNotStartsWith, taskWhereInput.resourceTypeNotStartsWith)
                && Objects.equals(
                        this.resourceTypeStartsWith, taskWhereInput.resourceTypeStartsWith)
                && Objects.equals(this.snapshot, taskWhereInput.snapshot)
                && Objects.equals(this.snapshotContains, taskWhereInput.snapshotContains)
                && Objects.equals(this.snapshotEndsWith, taskWhereInput.snapshotEndsWith)
                && Objects.equals(this.snapshotGt, taskWhereInput.snapshotGt)
                && Objects.equals(this.snapshotGte, taskWhereInput.snapshotGte)
                && Objects.equals(this.snapshotIn, taskWhereInput.snapshotIn)
                && Objects.equals(this.snapshotLt, taskWhereInput.snapshotLt)
                && Objects.equals(this.snapshotLte, taskWhereInput.snapshotLte)
                && Objects.equals(this.snapshotNot, taskWhereInput.snapshotNot)
                && Objects.equals(this.snapshotNotContains, taskWhereInput.snapshotNotContains)
                && Objects.equals(this.snapshotNotEndsWith, taskWhereInput.snapshotNotEndsWith)
                && Objects.equals(this.snapshotNotIn, taskWhereInput.snapshotNotIn)
                && Objects.equals(this.snapshotNotStartsWith, taskWhereInput.snapshotNotStartsWith)
                && Objects.equals(this.snapshotStartsWith, taskWhereInput.snapshotStartsWith)
                && Objects.equals(this.startedAt, taskWhereInput.startedAt)
                && Objects.equals(this.startedAtGt, taskWhereInput.startedAtGt)
                && Objects.equals(this.startedAtGte, taskWhereInput.startedAtGte)
                && Objects.equals(this.startedAtIn, taskWhereInput.startedAtIn)
                && Objects.equals(this.startedAtLt, taskWhereInput.startedAtLt)
                && Objects.equals(this.startedAtLte, taskWhereInput.startedAtLte)
                && Objects.equals(this.startedAtNot, taskWhereInput.startedAtNot)
                && Objects.equals(this.startedAtNotIn, taskWhereInput.startedAtNotIn)
                && Objects.equals(this.status, taskWhereInput.status)
                && Objects.equals(this.statusIn, taskWhereInput.statusIn)
                && Objects.equals(this.statusNot, taskWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, taskWhereInput.statusNotIn)
                && Objects.equals(this.type, taskWhereInput.type)
                && Objects.equals(this.typeIn, taskWhereInput.typeIn)
                && Objects.equals(this.typeNot, taskWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, taskWhereInput.typeNotIn)
                && Objects.equals(this.user, taskWhereInput.user);
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
                errorMessage,
                errorMessageContains,
                errorMessageEndsWith,
                errorMessageGt,
                errorMessageGte,
                errorMessageIn,
                errorMessageLt,
                errorMessageLte,
                errorMessageNot,
                errorMessageNotContains,
                errorMessageNotEndsWith,
                errorMessageNotIn,
                errorMessageNotStartsWith,
                errorMessageStartsWith,
                finishedAt,
                finishedAtGt,
                finishedAtGte,
                finishedAtIn,
                finishedAtLt,
                finishedAtLte,
                finishedAtNot,
                finishedAtNotIn,
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
                key,
                keyContains,
                keyEndsWith,
                keyGt,
                keyGte,
                keyIn,
                keyLt,
                keyLte,
                keyNot,
                keyNotContains,
                keyNotEndsWith,
                keyNotIn,
                keyNotStartsWith,
                keyStartsWith,
                localCreatedAt,
                localCreatedAtGt,
                localCreatedAtGte,
                localCreatedAtIn,
                localCreatedAtLt,
                localCreatedAtLte,
                localCreatedAtNot,
                localCreatedAtNotIn,
                progress,
                progressGt,
                progressGte,
                progressIn,
                progressLt,
                progressLte,
                progressNot,
                progressNotIn,
                resourceId,
                resourceIdContains,
                resourceIdEndsWith,
                resourceIdGt,
                resourceIdGte,
                resourceIdIn,
                resourceIdLt,
                resourceIdLte,
                resourceIdNot,
                resourceIdNotContains,
                resourceIdNotEndsWith,
                resourceIdNotIn,
                resourceIdNotStartsWith,
                resourceIdStartsWith,
                resourceMutation,
                resourceMutationContains,
                resourceMutationEndsWith,
                resourceMutationGt,
                resourceMutationGte,
                resourceMutationIn,
                resourceMutationLt,
                resourceMutationLte,
                resourceMutationNot,
                resourceMutationNotContains,
                resourceMutationNotEndsWith,
                resourceMutationNotIn,
                resourceMutationNotStartsWith,
                resourceMutationStartsWith,
                resourceRollbackError,
                resourceRollbackErrorContains,
                resourceRollbackErrorEndsWith,
                resourceRollbackErrorGt,
                resourceRollbackErrorGte,
                resourceRollbackErrorIn,
                resourceRollbackErrorLt,
                resourceRollbackErrorLte,
                resourceRollbackErrorNot,
                resourceRollbackErrorNotContains,
                resourceRollbackErrorNotEndsWith,
                resourceRollbackErrorNotIn,
                resourceRollbackErrorNotStartsWith,
                resourceRollbackErrorStartsWith,
                resourceRollbackRetryCount,
                resourceRollbackRetryCountGt,
                resourceRollbackRetryCountGte,
                resourceRollbackRetryCountIn,
                resourceRollbackRetryCountLt,
                resourceRollbackRetryCountLte,
                resourceRollbackRetryCountNot,
                resourceRollbackRetryCountNotIn,
                resourceRollbacked,
                resourceRollbackedNot,
                resourceType,
                resourceTypeContains,
                resourceTypeEndsWith,
                resourceTypeGt,
                resourceTypeGte,
                resourceTypeIn,
                resourceTypeLt,
                resourceTypeLte,
                resourceTypeNot,
                resourceTypeNotContains,
                resourceTypeNotEndsWith,
                resourceTypeNotIn,
                resourceTypeNotStartsWith,
                resourceTypeStartsWith,
                snapshot,
                snapshotContains,
                snapshotEndsWith,
                snapshotGt,
                snapshotGte,
                snapshotIn,
                snapshotLt,
                snapshotLte,
                snapshotNot,
                snapshotNotContains,
                snapshotNotEndsWith,
                snapshotNotIn,
                snapshotNotStartsWith,
                snapshotStartsWith,
                startedAt,
                startedAtGt,
                startedAtGte,
                startedAtIn,
                startedAtLt,
                startedAtLte,
                startedAtNot,
                startedAtNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                user);
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
        sb.append("class TaskWhereInput {\n");
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
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorMessageContains: ")
                .append(toIndentedString(errorMessageContains))
                .append("\n");
        sb.append("    errorMessageEndsWith: ")
                .append(toIndentedString(errorMessageEndsWith))
                .append("\n");
        sb.append("    errorMessageGt: ").append(toIndentedString(errorMessageGt)).append("\n");
        sb.append("    errorMessageGte: ").append(toIndentedString(errorMessageGte)).append("\n");
        sb.append("    errorMessageIn: ").append(toIndentedString(errorMessageIn)).append("\n");
        sb.append("    errorMessageLt: ").append(toIndentedString(errorMessageLt)).append("\n");
        sb.append("    errorMessageLte: ").append(toIndentedString(errorMessageLte)).append("\n");
        sb.append("    errorMessageNot: ").append(toIndentedString(errorMessageNot)).append("\n");
        sb.append("    errorMessageNotContains: ")
                .append(toIndentedString(errorMessageNotContains))
                .append("\n");
        sb.append("    errorMessageNotEndsWith: ")
                .append(toIndentedString(errorMessageNotEndsWith))
                .append("\n");
        sb.append("    errorMessageNotIn: ")
                .append(toIndentedString(errorMessageNotIn))
                .append("\n");
        sb.append("    errorMessageNotStartsWith: ")
                .append(toIndentedString(errorMessageNotStartsWith))
                .append("\n");
        sb.append("    errorMessageStartsWith: ")
                .append(toIndentedString(errorMessageStartsWith))
                .append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    finishedAtGt: ").append(toIndentedString(finishedAtGt)).append("\n");
        sb.append("    finishedAtGte: ").append(toIndentedString(finishedAtGte)).append("\n");
        sb.append("    finishedAtIn: ").append(toIndentedString(finishedAtIn)).append("\n");
        sb.append("    finishedAtLt: ").append(toIndentedString(finishedAtLt)).append("\n");
        sb.append("    finishedAtLte: ").append(toIndentedString(finishedAtLte)).append("\n");
        sb.append("    finishedAtNot: ").append(toIndentedString(finishedAtNot)).append("\n");
        sb.append("    finishedAtNotIn: ").append(toIndentedString(finishedAtNotIn)).append("\n");
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
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyContains: ").append(toIndentedString(keyContains)).append("\n");
        sb.append("    keyEndsWith: ").append(toIndentedString(keyEndsWith)).append("\n");
        sb.append("    keyGt: ").append(toIndentedString(keyGt)).append("\n");
        sb.append("    keyGte: ").append(toIndentedString(keyGte)).append("\n");
        sb.append("    keyIn: ").append(toIndentedString(keyIn)).append("\n");
        sb.append("    keyLt: ").append(toIndentedString(keyLt)).append("\n");
        sb.append("    keyLte: ").append(toIndentedString(keyLte)).append("\n");
        sb.append("    keyNot: ").append(toIndentedString(keyNot)).append("\n");
        sb.append("    keyNotContains: ").append(toIndentedString(keyNotContains)).append("\n");
        sb.append("    keyNotEndsWith: ").append(toIndentedString(keyNotEndsWith)).append("\n");
        sb.append("    keyNotIn: ").append(toIndentedString(keyNotIn)).append("\n");
        sb.append("    keyNotStartsWith: ").append(toIndentedString(keyNotStartsWith)).append("\n");
        sb.append("    keyStartsWith: ").append(toIndentedString(keyStartsWith)).append("\n");
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
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    progressGt: ").append(toIndentedString(progressGt)).append("\n");
        sb.append("    progressGte: ").append(toIndentedString(progressGte)).append("\n");
        sb.append("    progressIn: ").append(toIndentedString(progressIn)).append("\n");
        sb.append("    progressLt: ").append(toIndentedString(progressLt)).append("\n");
        sb.append("    progressLte: ").append(toIndentedString(progressLte)).append("\n");
        sb.append("    progressNot: ").append(toIndentedString(progressNot)).append("\n");
        sb.append("    progressNotIn: ").append(toIndentedString(progressNotIn)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceIdContains: ")
                .append(toIndentedString(resourceIdContains))
                .append("\n");
        sb.append("    resourceIdEndsWith: ")
                .append(toIndentedString(resourceIdEndsWith))
                .append("\n");
        sb.append("    resourceIdGt: ").append(toIndentedString(resourceIdGt)).append("\n");
        sb.append("    resourceIdGte: ").append(toIndentedString(resourceIdGte)).append("\n");
        sb.append("    resourceIdIn: ").append(toIndentedString(resourceIdIn)).append("\n");
        sb.append("    resourceIdLt: ").append(toIndentedString(resourceIdLt)).append("\n");
        sb.append("    resourceIdLte: ").append(toIndentedString(resourceIdLte)).append("\n");
        sb.append("    resourceIdNot: ").append(toIndentedString(resourceIdNot)).append("\n");
        sb.append("    resourceIdNotContains: ")
                .append(toIndentedString(resourceIdNotContains))
                .append("\n");
        sb.append("    resourceIdNotEndsWith: ")
                .append(toIndentedString(resourceIdNotEndsWith))
                .append("\n");
        sb.append("    resourceIdNotIn: ").append(toIndentedString(resourceIdNotIn)).append("\n");
        sb.append("    resourceIdNotStartsWith: ")
                .append(toIndentedString(resourceIdNotStartsWith))
                .append("\n");
        sb.append("    resourceIdStartsWith: ")
                .append(toIndentedString(resourceIdStartsWith))
                .append("\n");
        sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
        sb.append("    resourceMutationContains: ")
                .append(toIndentedString(resourceMutationContains))
                .append("\n");
        sb.append("    resourceMutationEndsWith: ")
                .append(toIndentedString(resourceMutationEndsWith))
                .append("\n");
        sb.append("    resourceMutationGt: ")
                .append(toIndentedString(resourceMutationGt))
                .append("\n");
        sb.append("    resourceMutationGte: ")
                .append(toIndentedString(resourceMutationGte))
                .append("\n");
        sb.append("    resourceMutationIn: ")
                .append(toIndentedString(resourceMutationIn))
                .append("\n");
        sb.append("    resourceMutationLt: ")
                .append(toIndentedString(resourceMutationLt))
                .append("\n");
        sb.append("    resourceMutationLte: ")
                .append(toIndentedString(resourceMutationLte))
                .append("\n");
        sb.append("    resourceMutationNot: ")
                .append(toIndentedString(resourceMutationNot))
                .append("\n");
        sb.append("    resourceMutationNotContains: ")
                .append(toIndentedString(resourceMutationNotContains))
                .append("\n");
        sb.append("    resourceMutationNotEndsWith: ")
                .append(toIndentedString(resourceMutationNotEndsWith))
                .append("\n");
        sb.append("    resourceMutationNotIn: ")
                .append(toIndentedString(resourceMutationNotIn))
                .append("\n");
        sb.append("    resourceMutationNotStartsWith: ")
                .append(toIndentedString(resourceMutationNotStartsWith))
                .append("\n");
        sb.append("    resourceMutationStartsWith: ")
                .append(toIndentedString(resourceMutationStartsWith))
                .append("\n");
        sb.append("    resourceRollbackError: ")
                .append(toIndentedString(resourceRollbackError))
                .append("\n");
        sb.append("    resourceRollbackErrorContains: ")
                .append(toIndentedString(resourceRollbackErrorContains))
                .append("\n");
        sb.append("    resourceRollbackErrorEndsWith: ")
                .append(toIndentedString(resourceRollbackErrorEndsWith))
                .append("\n");
        sb.append("    resourceRollbackErrorGt: ")
                .append(toIndentedString(resourceRollbackErrorGt))
                .append("\n");
        sb.append("    resourceRollbackErrorGte: ")
                .append(toIndentedString(resourceRollbackErrorGte))
                .append("\n");
        sb.append("    resourceRollbackErrorIn: ")
                .append(toIndentedString(resourceRollbackErrorIn))
                .append("\n");
        sb.append("    resourceRollbackErrorLt: ")
                .append(toIndentedString(resourceRollbackErrorLt))
                .append("\n");
        sb.append("    resourceRollbackErrorLte: ")
                .append(toIndentedString(resourceRollbackErrorLte))
                .append("\n");
        sb.append("    resourceRollbackErrorNot: ")
                .append(toIndentedString(resourceRollbackErrorNot))
                .append("\n");
        sb.append("    resourceRollbackErrorNotContains: ")
                .append(toIndentedString(resourceRollbackErrorNotContains))
                .append("\n");
        sb.append("    resourceRollbackErrorNotEndsWith: ")
                .append(toIndentedString(resourceRollbackErrorNotEndsWith))
                .append("\n");
        sb.append("    resourceRollbackErrorNotIn: ")
                .append(toIndentedString(resourceRollbackErrorNotIn))
                .append("\n");
        sb.append("    resourceRollbackErrorNotStartsWith: ")
                .append(toIndentedString(resourceRollbackErrorNotStartsWith))
                .append("\n");
        sb.append("    resourceRollbackErrorStartsWith: ")
                .append(toIndentedString(resourceRollbackErrorStartsWith))
                .append("\n");
        sb.append("    resourceRollbackRetryCount: ")
                .append(toIndentedString(resourceRollbackRetryCount))
                .append("\n");
        sb.append("    resourceRollbackRetryCountGt: ")
                .append(toIndentedString(resourceRollbackRetryCountGt))
                .append("\n");
        sb.append("    resourceRollbackRetryCountGte: ")
                .append(toIndentedString(resourceRollbackRetryCountGte))
                .append("\n");
        sb.append("    resourceRollbackRetryCountIn: ")
                .append(toIndentedString(resourceRollbackRetryCountIn))
                .append("\n");
        sb.append("    resourceRollbackRetryCountLt: ")
                .append(toIndentedString(resourceRollbackRetryCountLt))
                .append("\n");
        sb.append("    resourceRollbackRetryCountLte: ")
                .append(toIndentedString(resourceRollbackRetryCountLte))
                .append("\n");
        sb.append("    resourceRollbackRetryCountNot: ")
                .append(toIndentedString(resourceRollbackRetryCountNot))
                .append("\n");
        sb.append("    resourceRollbackRetryCountNotIn: ")
                .append(toIndentedString(resourceRollbackRetryCountNotIn))
                .append("\n");
        sb.append("    resourceRollbacked: ")
                .append(toIndentedString(resourceRollbacked))
                .append("\n");
        sb.append("    resourceRollbackedNot: ")
                .append(toIndentedString(resourceRollbackedNot))
                .append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceTypeContains: ")
                .append(toIndentedString(resourceTypeContains))
                .append("\n");
        sb.append("    resourceTypeEndsWith: ")
                .append(toIndentedString(resourceTypeEndsWith))
                .append("\n");
        sb.append("    resourceTypeGt: ").append(toIndentedString(resourceTypeGt)).append("\n");
        sb.append("    resourceTypeGte: ").append(toIndentedString(resourceTypeGte)).append("\n");
        sb.append("    resourceTypeIn: ").append(toIndentedString(resourceTypeIn)).append("\n");
        sb.append("    resourceTypeLt: ").append(toIndentedString(resourceTypeLt)).append("\n");
        sb.append("    resourceTypeLte: ").append(toIndentedString(resourceTypeLte)).append("\n");
        sb.append("    resourceTypeNot: ").append(toIndentedString(resourceTypeNot)).append("\n");
        sb.append("    resourceTypeNotContains: ")
                .append(toIndentedString(resourceTypeNotContains))
                .append("\n");
        sb.append("    resourceTypeNotEndsWith: ")
                .append(toIndentedString(resourceTypeNotEndsWith))
                .append("\n");
        sb.append("    resourceTypeNotIn: ")
                .append(toIndentedString(resourceTypeNotIn))
                .append("\n");
        sb.append("    resourceTypeNotStartsWith: ")
                .append(toIndentedString(resourceTypeNotStartsWith))
                .append("\n");
        sb.append("    resourceTypeStartsWith: ")
                .append(toIndentedString(resourceTypeStartsWith))
                .append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    snapshotContains: ").append(toIndentedString(snapshotContains)).append("\n");
        sb.append("    snapshotEndsWith: ").append(toIndentedString(snapshotEndsWith)).append("\n");
        sb.append("    snapshotGt: ").append(toIndentedString(snapshotGt)).append("\n");
        sb.append("    snapshotGte: ").append(toIndentedString(snapshotGte)).append("\n");
        sb.append("    snapshotIn: ").append(toIndentedString(snapshotIn)).append("\n");
        sb.append("    snapshotLt: ").append(toIndentedString(snapshotLt)).append("\n");
        sb.append("    snapshotLte: ").append(toIndentedString(snapshotLte)).append("\n");
        sb.append("    snapshotNot: ").append(toIndentedString(snapshotNot)).append("\n");
        sb.append("    snapshotNotContains: ")
                .append(toIndentedString(snapshotNotContains))
                .append("\n");
        sb.append("    snapshotNotEndsWith: ")
                .append(toIndentedString(snapshotNotEndsWith))
                .append("\n");
        sb.append("    snapshotNotIn: ").append(toIndentedString(snapshotNotIn)).append("\n");
        sb.append("    snapshotNotStartsWith: ")
                .append(toIndentedString(snapshotNotStartsWith))
                .append("\n");
        sb.append("    snapshotStartsWith: ")
                .append(toIndentedString(snapshotStartsWith))
                .append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
        sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
        sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
        sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
        sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
        sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
        sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

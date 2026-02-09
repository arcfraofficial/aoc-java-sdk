package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ApplicationWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ApplicationWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ApplicationWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ApplicationWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

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

    public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
    private String imageName;

    public static final String SERIALIZED_NAME_IMAGE_NAME_CONTAINS = "image_name_contains";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_CONTAINS)
    private String imageNameContains;

    public static final String SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH = "image_name_ends_with";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH)
    private String imageNameEndsWith;

    public static final String SERIALIZED_NAME_IMAGE_NAME_GT = "image_name_gt";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_GT)
    private String imageNameGt;

    public static final String SERIALIZED_NAME_IMAGE_NAME_GTE = "image_name_gte";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_GTE)
    private String imageNameGte;

    public static final String SERIALIZED_NAME_IMAGE_NAME_IN = "image_name_in";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_IN)
    private List<String> imageNameIn = null;

    public static final String SERIALIZED_NAME_IMAGE_NAME_LT = "image_name_lt";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_LT)
    private String imageNameLt;

    public static final String SERIALIZED_NAME_IMAGE_NAME_LTE = "image_name_lte";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_LTE)
    private String imageNameLte;

    public static final String SERIALIZED_NAME_IMAGE_NAME_NOT = "image_name_not";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_NOT)
    private String imageNameNot;

    public static final String SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS = "image_name_not_contains";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS)
    private String imageNameNotContains;

    public static final String SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH =
            "image_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH)
    private String imageNameNotEndsWith;

    public static final String SERIALIZED_NAME_IMAGE_NAME_NOT_IN = "image_name_not_in";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_NOT_IN)
    private List<String> imageNameNotIn = null;

    public static final String SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH =
            "image_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH)
    private String imageNameNotStartsWith;

    public static final String SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH = "image_name_starts_with";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH)
    private String imageNameStartsWith;

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

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_MEMORY_GT = "memory_gt";

    @SerializedName(SERIALIZED_NAME_MEMORY_GT)
    private Long memoryGt;

    public static final String SERIALIZED_NAME_MEMORY_GTE = "memory_gte";

    @SerializedName(SERIALIZED_NAME_MEMORY_GTE)
    private Long memoryGte;

    public static final String SERIALIZED_NAME_MEMORY_IN = "memory_in";

    @SerializedName(SERIALIZED_NAME_MEMORY_IN)
    private List<Long> memoryIn = null;

    public static final String SERIALIZED_NAME_MEMORY_LT = "memory_lt";

    @SerializedName(SERIALIZED_NAME_MEMORY_LT)
    private Long memoryLt;

    public static final String SERIALIZED_NAME_MEMORY_LTE = "memory_lte";

    @SerializedName(SERIALIZED_NAME_MEMORY_LTE)
    private Long memoryLte;

    public static final String SERIALIZED_NAME_MEMORY_NOT = "memory_not";

    @SerializedName(SERIALIZED_NAME_MEMORY_NOT)
    private Long memoryNot;

    public static final String SERIALIZED_NAME_MEMORY_NOT_IN = "memory_not_in";

    @SerializedName(SERIALIZED_NAME_MEMORY_NOT_IN)
    private List<Long> memoryNotIn = null;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private ApplicationState state;

    public static final String SERIALIZED_NAME_STATE_IN = "state_in";

    @SerializedName(SERIALIZED_NAME_STATE_IN)
    private List<ApplicationState> stateIn = null;

    public static final String SERIALIZED_NAME_STATE_NOT = "state_not";

    @SerializedName(SERIALIZED_NAME_STATE_NOT)
    private ApplicationState stateNot;

    public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";

    @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
    private List<ApplicationState> stateNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_IP = "storage_ip";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP)
    private String storageIp;

    public static final String SERIALIZED_NAME_STORAGE_IP_CONTAINS = "storage_ip_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_CONTAINS)
    private String storageIpContains;

    public static final String SERIALIZED_NAME_STORAGE_IP_ENDS_WITH = "storage_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_ENDS_WITH)
    private String storageIpEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_IP_GT = "storage_ip_gt";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_GT)
    private String storageIpGt;

    public static final String SERIALIZED_NAME_STORAGE_IP_GTE = "storage_ip_gte";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_GTE)
    private String storageIpGte;

    public static final String SERIALIZED_NAME_STORAGE_IP_IN = "storage_ip_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_IN)
    private List<String> storageIpIn = null;

    public static final String SERIALIZED_NAME_STORAGE_IP_LT = "storage_ip_lt";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_LT)
    private String storageIpLt;

    public static final String SERIALIZED_NAME_STORAGE_IP_LTE = "storage_ip_lte";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_LTE)
    private String storageIpLte;

    public static final String SERIALIZED_NAME_STORAGE_IP_NOT = "storage_ip_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_NOT)
    private String storageIpNot;

    public static final String SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS = "storage_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS)
    private String storageIpNotContains;

    public static final String SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH =
            "storage_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH)
    private String storageIpNotEndsWith;

    public static final String SERIALIZED_NAME_STORAGE_IP_NOT_IN = "storage_ip_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_NOT_IN)
    private List<String> storageIpNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH =
            "storage_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH)
    private String storageIpNotStartsWith;

    public static final String SERIALIZED_NAME_STORAGE_IP_STARTS_WITH = "storage_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP_STARTS_WITH)
    private String storageIpStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ApplicationType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<ApplicationType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private ApplicationType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<ApplicationType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    private String updateTime;

    public static final String SERIALIZED_NAME_UPDATE_TIME_GT = "update_time_gt";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_GT)
    private String updateTimeGt;

    public static final String SERIALIZED_NAME_UPDATE_TIME_GTE = "update_time_gte";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_GTE)
    private String updateTimeGte;

    public static final String SERIALIZED_NAME_UPDATE_TIME_IN = "update_time_in";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_IN)
    private List<String> updateTimeIn = null;

    public static final String SERIALIZED_NAME_UPDATE_TIME_LT = "update_time_lt";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_LT)
    private String updateTimeLt;

    public static final String SERIALIZED_NAME_UPDATE_TIME_LTE = "update_time_lte";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_LTE)
    private String updateTimeLte;

    public static final String SERIALIZED_NAME_UPDATE_TIME_NOT = "update_time_not";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_NOT)
    private String updateTimeNot;

    public static final String SERIALIZED_NAME_UPDATE_TIME_NOT_IN = "update_time_not_in";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME_NOT_IN)
    private List<String> updateTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VERSION_CONTAINS = "version_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_CONTAINS)
    private String versionContains;

    public static final String SERIALIZED_NAME_VERSION_ENDS_WITH = "version_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_ENDS_WITH)
    private String versionEndsWith;

    public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_GT)
    private String versionGt;

    public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_GTE)
    private String versionGte;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<String> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_LT)
    private String versionLt;

    public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_LTE)
    private String versionLte;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private String versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_CONTAINS = "version_not_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_CONTAINS)
    private String versionNotContains;

    public static final String SERIALIZED_NAME_VERSION_NOT_ENDS_WITH = "version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH)
    private String versionNotEndsWith;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<String> versionNotIn = null;

    public static final String SERIALIZED_NAME_VERSION_NOT_STARTS_WITH = "version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH)
    private String versionNotStartsWith;

    public static final String SERIALIZED_NAME_VERSION_STARTS_WITH = "version_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_STARTS_WITH)
    private String versionStartsWith;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume_size";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
    private Long volumeSize;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_GT = "volume_size_gt";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_GT)
    private Long volumeSizeGt;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_GTE = "volume_size_gte";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_GTE)
    private Long volumeSizeGte;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_IN = "volume_size_in";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_IN)
    private List<Long> volumeSizeIn = null;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_LT = "volume_size_lt";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_LT)
    private Long volumeSizeLt;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_LTE = "volume_size_lte";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_LTE)
    private Long volumeSizeLte;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_NOT = "volume_size_not";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_NOT)
    private Long volumeSizeNot;

    public static final String SERIALIZED_NAME_VOLUME_SIZE_NOT_IN = "volume_size_not_in";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN)
    private List<Long> volumeSizeNotIn = null;

    public ApplicationWhereInput() {}

    public ApplicationWhereInput AND(List<ApplicationWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ApplicationWhereInput addANDItem(ApplicationWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ApplicationWhereInput>();
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
    public List<ApplicationWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ApplicationWhereInput> AND) {
        this.AND = AND;
    }

    public ApplicationWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ApplicationWhereInput AND_ExplictlyNonNull() {
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

    public ApplicationWhereInput NOT(List<ApplicationWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ApplicationWhereInput addNOTItem(ApplicationWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ApplicationWhereInput>();
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
    public List<ApplicationWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ApplicationWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ApplicationWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ApplicationWhereInput NOT_ExplictlyNonNull() {
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

    public ApplicationWhereInput OR(List<ApplicationWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ApplicationWhereInput addORItem(ApplicationWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ApplicationWhereInput>();
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
    public List<ApplicationWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ApplicationWhereInput> OR) {
        this.OR = OR;
    }

    public ApplicationWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ApplicationWhereInput OR_ExplictlyNonNull() {
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

    public ApplicationWhereInput cluster(ClusterWhereInput cluster) {

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

    public ApplicationWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ApplicationWhereInput cluster_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessage(String errorMessage) {

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

    public ApplicationWhereInput errorMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public ApplicationWhereInput errorMessage_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageContains(String errorMessageContains) {

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

    public ApplicationWhereInput errorMessageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_CONTAINS);
        return this;
    }

    public ApplicationWhereInput errorMessageContains_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageEndsWith(String errorMessageEndsWith) {

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

    public ApplicationWhereInput errorMessageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput errorMessageEndsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageGt(String errorMessageGt) {

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

    public ApplicationWhereInput errorMessageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_GT);
        return this;
    }

    public ApplicationWhereInput errorMessageGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageGte(String errorMessageGte) {

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

    public ApplicationWhereInput errorMessageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_GTE);
        return this;
    }

    public ApplicationWhereInput errorMessageGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageIn(List<String> errorMessageIn) {

        this.errorMessageIn = errorMessageIn;
        return this;
    }

    public ApplicationWhereInput addErrorMessageInItem(String errorMessageInItem) {
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

    public ApplicationWhereInput errorMessageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_IN);
        return this;
    }

    public ApplicationWhereInput errorMessageIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageLt(String errorMessageLt) {

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

    public ApplicationWhereInput errorMessageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_LT);
        return this;
    }

    public ApplicationWhereInput errorMessageLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageLte(String errorMessageLte) {

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

    public ApplicationWhereInput errorMessageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_LTE);
        return this;
    }

    public ApplicationWhereInput errorMessageLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageNot(String errorMessageNot) {

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

    public ApplicationWhereInput errorMessageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT);
        return this;
    }

    public ApplicationWhereInput errorMessageNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageNotContains(String errorMessageNotContains) {

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

    public ApplicationWhereInput errorMessageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public ApplicationWhereInput errorMessageNotContains_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageNotEndsWith(String errorMessageNotEndsWith) {

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

    public ApplicationWhereInput errorMessageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput errorMessageNotEndsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageNotIn(List<String> errorMessageNotIn) {

        this.errorMessageNotIn = errorMessageNotIn;
        return this;
    }

    public ApplicationWhereInput addErrorMessageNotInItem(String errorMessageNotInItem) {
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

    public ApplicationWhereInput errorMessageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_IN);
        return this;
    }

    public ApplicationWhereInput errorMessageNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageNotStartsWith(String errorMessageNotStartsWith) {

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

    public ApplicationWhereInput errorMessageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput errorMessageNotStartsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput errorMessageStartsWith(String errorMessageStartsWith) {

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

    public ApplicationWhereInput errorMessageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput errorMessageStartsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput id(String id) {

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

    public ApplicationWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ApplicationWhereInput id_ExplictlyNonNull() {
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

    public ApplicationWhereInput idContains(String idContains) {

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

    public ApplicationWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ApplicationWhereInput idContains_ExplictlyNonNull() {
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

    public ApplicationWhereInput idEndsWith(String idEndsWith) {

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

    public ApplicationWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput idGt(String idGt) {

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

    public ApplicationWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ApplicationWhereInput idGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput idGte(String idGte) {

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

    public ApplicationWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ApplicationWhereInput idGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ApplicationWhereInput addIdInItem(String idInItem) {
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

    public ApplicationWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ApplicationWhereInput idIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput idLt(String idLt) {

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

    public ApplicationWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ApplicationWhereInput idLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput idLte(String idLte) {

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

    public ApplicationWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ApplicationWhereInput idLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput idNot(String idNot) {

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

    public ApplicationWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ApplicationWhereInput idNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput idNotContains(String idNotContains) {

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

    public ApplicationWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ApplicationWhereInput idNotContains_ExplictlyNonNull() {
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

    public ApplicationWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ApplicationWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ApplicationWhereInput addIdNotInItem(String idNotInItem) {
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

    public ApplicationWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ApplicationWhereInput idNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ApplicationWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput idStartsWith(String idStartsWith) {

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

    public ApplicationWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput imageName(String imageName) {

        this.imageName = imageName;
        return this;
    }

    /**
     * Get imageName
     *
     * @return imageName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ApplicationWhereInput imageName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME);
        return this;
    }

    public ApplicationWhereInput imageName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME);
        return this;
    }

    public void setImageName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME);
        }
    }

    public boolean getImageName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME);
    }

    public ApplicationWhereInput imageNameContains(String imageNameContains) {

        this.imageNameContains = imageNameContains;
        return this;
    }

    /**
     * Get imageNameContains
     *
     * @return imageNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameContains() {
        return imageNameContains;
    }

    public void setImageNameContains(String imageNameContains) {
        this.imageNameContains = imageNameContains;
    }

    public ApplicationWhereInput imageNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_CONTAINS);
        return this;
    }

    public ApplicationWhereInput imageNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_CONTAINS);
        return this;
    }

    public void setImageNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_CONTAINS);
        }
    }

    public boolean getImageNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_CONTAINS);
    }

    public ApplicationWhereInput imageNameEndsWith(String imageNameEndsWith) {

        this.imageNameEndsWith = imageNameEndsWith;
        return this;
    }

    /**
     * Get imageNameEndsWith
     *
     * @return imageNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameEndsWith() {
        return imageNameEndsWith;
    }

    public void setImageNameEndsWith(String imageNameEndsWith) {
        this.imageNameEndsWith = imageNameEndsWith;
    }

    public ApplicationWhereInput imageNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput imageNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH);
        return this;
    }

    public void setImageNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH);
        }
    }

    public boolean getImageNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_ENDS_WITH);
    }

    public ApplicationWhereInput imageNameGt(String imageNameGt) {

        this.imageNameGt = imageNameGt;
        return this;
    }

    /**
     * Get imageNameGt
     *
     * @return imageNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameGt() {
        return imageNameGt;
    }

    public void setImageNameGt(String imageNameGt) {
        this.imageNameGt = imageNameGt;
    }

    public ApplicationWhereInput imageNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_GT);
        return this;
    }

    public ApplicationWhereInput imageNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_GT);
        return this;
    }

    public void setImageNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_GT);
        }
    }

    public boolean getImageNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_GT);
    }

    public ApplicationWhereInput imageNameGte(String imageNameGte) {

        this.imageNameGte = imageNameGte;
        return this;
    }

    /**
     * Get imageNameGte
     *
     * @return imageNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameGte() {
        return imageNameGte;
    }

    public void setImageNameGte(String imageNameGte) {
        this.imageNameGte = imageNameGte;
    }

    public ApplicationWhereInput imageNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_GTE);
        return this;
    }

    public ApplicationWhereInput imageNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_GTE);
        return this;
    }

    public void setImageNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_GTE);
        }
    }

    public boolean getImageNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_GTE);
    }

    public ApplicationWhereInput imageNameIn(List<String> imageNameIn) {

        this.imageNameIn = imageNameIn;
        return this;
    }

    public ApplicationWhereInput addImageNameInItem(String imageNameInItem) {
        if (this.imageNameIn == null) {
            this.imageNameIn = new ArrayList<String>();
        }
        this.imageNameIn.add(imageNameInItem);
        return this;
    }

    /**
     * Get imageNameIn
     *
     * @return imageNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getImageNameIn() {
        return imageNameIn;
    }

    public void setImageNameIn(List<String> imageNameIn) {
        this.imageNameIn = imageNameIn;
    }

    public ApplicationWhereInput imageNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_IN);
        return this;
    }

    public ApplicationWhereInput imageNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_IN);
        return this;
    }

    public void setImageNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_IN);
        }
    }

    public boolean getImageNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_IN);
    }

    public ApplicationWhereInput imageNameLt(String imageNameLt) {

        this.imageNameLt = imageNameLt;
        return this;
    }

    /**
     * Get imageNameLt
     *
     * @return imageNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameLt() {
        return imageNameLt;
    }

    public void setImageNameLt(String imageNameLt) {
        this.imageNameLt = imageNameLt;
    }

    public ApplicationWhereInput imageNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_LT);
        return this;
    }

    public ApplicationWhereInput imageNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_LT);
        return this;
    }

    public void setImageNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_LT);
        }
    }

    public boolean getImageNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_LT);
    }

    public ApplicationWhereInput imageNameLte(String imageNameLte) {

        this.imageNameLte = imageNameLte;
        return this;
    }

    /**
     * Get imageNameLte
     *
     * @return imageNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameLte() {
        return imageNameLte;
    }

    public void setImageNameLte(String imageNameLte) {
        this.imageNameLte = imageNameLte;
    }

    public ApplicationWhereInput imageNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_LTE);
        return this;
    }

    public ApplicationWhereInput imageNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_LTE);
        return this;
    }

    public void setImageNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_LTE);
        }
    }

    public boolean getImageNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_LTE);
    }

    public ApplicationWhereInput imageNameNot(String imageNameNot) {

        this.imageNameNot = imageNameNot;
        return this;
    }

    /**
     * Get imageNameNot
     *
     * @return imageNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameNot() {
        return imageNameNot;
    }

    public void setImageNameNot(String imageNameNot) {
        this.imageNameNot = imageNameNot;
    }

    public ApplicationWhereInput imageNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT);
        return this;
    }

    public ApplicationWhereInput imageNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT);
        return this;
    }

    public void setImageNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT);
        }
    }

    public boolean getImageNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_NOT);
    }

    public ApplicationWhereInput imageNameNotContains(String imageNameNotContains) {

        this.imageNameNotContains = imageNameNotContains;
        return this;
    }

    /**
     * Get imageNameNotContains
     *
     * @return imageNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameNotContains() {
        return imageNameNotContains;
    }

    public void setImageNameNotContains(String imageNameNotContains) {
        this.imageNameNotContains = imageNameNotContains;
    }

    public ApplicationWhereInput imageNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS);
        return this;
    }

    public ApplicationWhereInput imageNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS);
        return this;
    }

    public void setImageNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS);
        }
    }

    public boolean getImageNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_NOT_CONTAINS);
    }

    public ApplicationWhereInput imageNameNotEndsWith(String imageNameNotEndsWith) {

        this.imageNameNotEndsWith = imageNameNotEndsWith;
        return this;
    }

    /**
     * Get imageNameNotEndsWith
     *
     * @return imageNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameNotEndsWith() {
        return imageNameNotEndsWith;
    }

    public void setImageNameNotEndsWith(String imageNameNotEndsWith) {
        this.imageNameNotEndsWith = imageNameNotEndsWith;
    }

    public ApplicationWhereInput imageNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput imageNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setImageNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getImageNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_NOT_ENDS_WITH);
    }

    public ApplicationWhereInput imageNameNotIn(List<String> imageNameNotIn) {

        this.imageNameNotIn = imageNameNotIn;
        return this;
    }

    public ApplicationWhereInput addImageNameNotInItem(String imageNameNotInItem) {
        if (this.imageNameNotIn == null) {
            this.imageNameNotIn = new ArrayList<String>();
        }
        this.imageNameNotIn.add(imageNameNotInItem);
        return this;
    }

    /**
     * Get imageNameNotIn
     *
     * @return imageNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getImageNameNotIn() {
        return imageNameNotIn;
    }

    public void setImageNameNotIn(List<String> imageNameNotIn) {
        this.imageNameNotIn = imageNameNotIn;
    }

    public ApplicationWhereInput imageNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_IN);
        return this;
    }

    public ApplicationWhereInput imageNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_IN);
        return this;
    }

    public void setImageNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_IN);
        }
    }

    public boolean getImageNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_NOT_IN);
    }

    public ApplicationWhereInput imageNameNotStartsWith(String imageNameNotStartsWith) {

        this.imageNameNotStartsWith = imageNameNotStartsWith;
        return this;
    }

    /**
     * Get imageNameNotStartsWith
     *
     * @return imageNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameNotStartsWith() {
        return imageNameNotStartsWith;
    }

    public void setImageNameNotStartsWith(String imageNameNotStartsWith) {
        this.imageNameNotStartsWith = imageNameNotStartsWith;
    }

    public ApplicationWhereInput imageNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput imageNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setImageNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getImageNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_NOT_STARTS_WITH);
    }

    public ApplicationWhereInput imageNameStartsWith(String imageNameStartsWith) {

        this.imageNameStartsWith = imageNameStartsWith;
        return this;
    }

    /**
     * Get imageNameStartsWith
     *
     * @return imageNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageNameStartsWith() {
        return imageNameStartsWith;
    }

    public void setImageNameStartsWith(String imageNameStartsWith) {
        this.imageNameStartsWith = imageNameStartsWith;
    }

    public ApplicationWhereInput imageNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput imageNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH);
        return this;
    }

    public void setImageNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH);
        }
    }

    public boolean getImageNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME_STARTS_WITH);
    }

    public ApplicationWhereInput localId(String localId) {

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

    public ApplicationWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ApplicationWhereInput localId_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdContains(String localIdContains) {

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

    public ApplicationWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ApplicationWhereInput localIdContains_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ApplicationWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdGt(String localIdGt) {

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

    public ApplicationWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ApplicationWhereInput localIdGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdGte(String localIdGte) {

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

    public ApplicationWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ApplicationWhereInput localIdGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ApplicationWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ApplicationWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ApplicationWhereInput localIdIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdLt(String localIdLt) {

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

    public ApplicationWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ApplicationWhereInput localIdLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdLte(String localIdLte) {

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

    public ApplicationWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ApplicationWhereInput localIdLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdNot(String localIdNot) {

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

    public ApplicationWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ApplicationWhereInput localIdNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdNotContains(String localIdNotContains) {

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

    public ApplicationWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ApplicationWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public ApplicationWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ApplicationWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public ApplicationWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ApplicationWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public ApplicationWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public ApplicationWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ApplicationWhereInput memory(Long memory) {

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
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public ApplicationWhereInput memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public ApplicationWhereInput memory_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryGt(Long memoryGt) {

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
    public Long getMemoryGt() {
        return memoryGt;
    }

    public void setMemoryGt(Long memoryGt) {
        this.memoryGt = memoryGt;
    }

    public ApplicationWhereInput memoryGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GT);
        return this;
    }

    public ApplicationWhereInput memoryGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryGte(Long memoryGte) {

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
    public Long getMemoryGte() {
        return memoryGte;
    }

    public void setMemoryGte(Long memoryGte) {
        this.memoryGte = memoryGte;
    }

    public ApplicationWhereInput memoryGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GTE);
        return this;
    }

    public ApplicationWhereInput memoryGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryIn(List<Long> memoryIn) {

        this.memoryIn = memoryIn;
        return this;
    }

    public ApplicationWhereInput addMemoryInItem(Long memoryInItem) {
        if (this.memoryIn == null) {
            this.memoryIn = new ArrayList<Long>();
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
    public List<Long> getMemoryIn() {
        return memoryIn;
    }

    public void setMemoryIn(List<Long> memoryIn) {
        this.memoryIn = memoryIn;
    }

    public ApplicationWhereInput memoryIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_IN);
        return this;
    }

    public ApplicationWhereInput memoryIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryLt(Long memoryLt) {

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
    public Long getMemoryLt() {
        return memoryLt;
    }

    public void setMemoryLt(Long memoryLt) {
        this.memoryLt = memoryLt;
    }

    public ApplicationWhereInput memoryLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LT);
        return this;
    }

    public ApplicationWhereInput memoryLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryLte(Long memoryLte) {

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
    public Long getMemoryLte() {
        return memoryLte;
    }

    public void setMemoryLte(Long memoryLte) {
        this.memoryLte = memoryLte;
    }

    public ApplicationWhereInput memoryLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LTE);
        return this;
    }

    public ApplicationWhereInput memoryLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryNot(Long memoryNot) {

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
    public Long getMemoryNot() {
        return memoryNot;
    }

    public void setMemoryNot(Long memoryNot) {
        this.memoryNot = memoryNot;
    }

    public ApplicationWhereInput memoryNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT);
        return this;
    }

    public ApplicationWhereInput memoryNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput memoryNotIn(List<Long> memoryNotIn) {

        this.memoryNotIn = memoryNotIn;
        return this;
    }

    public ApplicationWhereInput addMemoryNotInItem(Long memoryNotInItem) {
        if (this.memoryNotIn == null) {
            this.memoryNotIn = new ArrayList<Long>();
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
    public List<Long> getMemoryNotIn() {
        return memoryNotIn;
    }

    public void setMemoryNotIn(List<Long> memoryNotIn) {
        this.memoryNotIn = memoryNotIn;
    }

    public ApplicationWhereInput memoryNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT_IN);
        return this;
    }

    public ApplicationWhereInput memoryNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput state(ApplicationState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationState getState() {
        return state;
    }

    public void setState(ApplicationState state) {
        this.state = state;
    }

    public ApplicationWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public ApplicationWhereInput state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public ApplicationWhereInput stateIn(List<ApplicationState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public ApplicationWhereInput addStateInItem(ApplicationState stateInItem) {
        if (this.stateIn == null) {
            this.stateIn = new ArrayList<ApplicationState>();
        }
        this.stateIn.add(stateInItem);
        return this;
    }

    /**
     * Get stateIn
     *
     * @return stateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ApplicationState> getStateIn() {
        return stateIn;
    }

    public void setStateIn(List<ApplicationState> stateIn) {
        this.stateIn = stateIn;
    }

    public ApplicationWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public ApplicationWhereInput stateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public void setStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        }
    }

    public boolean getStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_IN);
    }

    public ApplicationWhereInput stateNot(ApplicationState stateNot) {

        this.stateNot = stateNot;
        return this;
    }

    /**
     * Get stateNot
     *
     * @return stateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationState getStateNot() {
        return stateNot;
    }

    public void setStateNot(ApplicationState stateNot) {
        this.stateNot = stateNot;
    }

    public ApplicationWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public ApplicationWhereInput stateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public void setStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        }
    }

    public boolean getStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT);
    }

    public ApplicationWhereInput stateNotIn(List<ApplicationState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public ApplicationWhereInput addStateNotInItem(ApplicationState stateNotInItem) {
        if (this.stateNotIn == null) {
            this.stateNotIn = new ArrayList<ApplicationState>();
        }
        this.stateNotIn.add(stateNotInItem);
        return this;
    }

    /**
     * Get stateNotIn
     *
     * @return stateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ApplicationState> getStateNotIn() {
        return stateNotIn;
    }

    public void setStateNotIn(List<ApplicationState> stateNotIn) {
        this.stateNotIn = stateNotIn;
    }

    public ApplicationWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public ApplicationWhereInput stateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public void setStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        }
    }

    public boolean getStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT_IN);
    }

    public ApplicationWhereInput storageIp(String storageIp) {

        this.storageIp = storageIp;
        return this;
    }

    /**
     * Get storageIp
     *
     * @return storageIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIp() {
        return storageIp;
    }

    public void setStorageIp(String storageIp) {
        this.storageIp = storageIp;
    }

    public ApplicationWhereInput storageIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP);
        return this;
    }

    public ApplicationWhereInput storageIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP);
        return this;
    }

    public void setStorageIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP);
        }
    }

    public boolean getStorageIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP);
    }

    public ApplicationWhereInput storageIpContains(String storageIpContains) {

        this.storageIpContains = storageIpContains;
        return this;
    }

    /**
     * Get storageIpContains
     *
     * @return storageIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpContains() {
        return storageIpContains;
    }

    public void setStorageIpContains(String storageIpContains) {
        this.storageIpContains = storageIpContains;
    }

    public ApplicationWhereInput storageIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_CONTAINS);
        return this;
    }

    public ApplicationWhereInput storageIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_CONTAINS);
        return this;
    }

    public void setStorageIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_CONTAINS);
        }
    }

    public boolean getStorageIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_CONTAINS);
    }

    public ApplicationWhereInput storageIpEndsWith(String storageIpEndsWith) {

        this.storageIpEndsWith = storageIpEndsWith;
        return this;
    }

    /**
     * Get storageIpEndsWith
     *
     * @return storageIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpEndsWith() {
        return storageIpEndsWith;
    }

    public void setStorageIpEndsWith(String storageIpEndsWith) {
        this.storageIpEndsWith = storageIpEndsWith;
    }

    public ApplicationWhereInput storageIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput storageIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_ENDS_WITH);
        return this;
    }

    public void setStorageIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_ENDS_WITH);
        }
    }

    public boolean getStorageIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_ENDS_WITH);
    }

    public ApplicationWhereInput storageIpGt(String storageIpGt) {

        this.storageIpGt = storageIpGt;
        return this;
    }

    /**
     * Get storageIpGt
     *
     * @return storageIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpGt() {
        return storageIpGt;
    }

    public void setStorageIpGt(String storageIpGt) {
        this.storageIpGt = storageIpGt;
    }

    public ApplicationWhereInput storageIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_GT);
        return this;
    }

    public ApplicationWhereInput storageIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_GT);
        return this;
    }

    public void setStorageIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_GT);
        }
    }

    public boolean getStorageIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_GT);
    }

    public ApplicationWhereInput storageIpGte(String storageIpGte) {

        this.storageIpGte = storageIpGte;
        return this;
    }

    /**
     * Get storageIpGte
     *
     * @return storageIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpGte() {
        return storageIpGte;
    }

    public void setStorageIpGte(String storageIpGte) {
        this.storageIpGte = storageIpGte;
    }

    public ApplicationWhereInput storageIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_GTE);
        return this;
    }

    public ApplicationWhereInput storageIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_GTE);
        return this;
    }

    public void setStorageIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_GTE);
        }
    }

    public boolean getStorageIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_GTE);
    }

    public ApplicationWhereInput storageIpIn(List<String> storageIpIn) {

        this.storageIpIn = storageIpIn;
        return this;
    }

    public ApplicationWhereInput addStorageIpInItem(String storageIpInItem) {
        if (this.storageIpIn == null) {
            this.storageIpIn = new ArrayList<String>();
        }
        this.storageIpIn.add(storageIpInItem);
        return this;
    }

    /**
     * Get storageIpIn
     *
     * @return storageIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageIpIn() {
        return storageIpIn;
    }

    public void setStorageIpIn(List<String> storageIpIn) {
        this.storageIpIn = storageIpIn;
    }

    public ApplicationWhereInput storageIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_IN);
        return this;
    }

    public ApplicationWhereInput storageIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_IN);
        return this;
    }

    public void setStorageIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_IN);
        }
    }

    public boolean getStorageIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_IN);
    }

    public ApplicationWhereInput storageIpLt(String storageIpLt) {

        this.storageIpLt = storageIpLt;
        return this;
    }

    /**
     * Get storageIpLt
     *
     * @return storageIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpLt() {
        return storageIpLt;
    }

    public void setStorageIpLt(String storageIpLt) {
        this.storageIpLt = storageIpLt;
    }

    public ApplicationWhereInput storageIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_LT);
        return this;
    }

    public ApplicationWhereInput storageIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_LT);
        return this;
    }

    public void setStorageIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_LT);
        }
    }

    public boolean getStorageIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_LT);
    }

    public ApplicationWhereInput storageIpLte(String storageIpLte) {

        this.storageIpLte = storageIpLte;
        return this;
    }

    /**
     * Get storageIpLte
     *
     * @return storageIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpLte() {
        return storageIpLte;
    }

    public void setStorageIpLte(String storageIpLte) {
        this.storageIpLte = storageIpLte;
    }

    public ApplicationWhereInput storageIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_LTE);
        return this;
    }

    public ApplicationWhereInput storageIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_LTE);
        return this;
    }

    public void setStorageIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_LTE);
        }
    }

    public boolean getStorageIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_LTE);
    }

    public ApplicationWhereInput storageIpNot(String storageIpNot) {

        this.storageIpNot = storageIpNot;
        return this;
    }

    /**
     * Get storageIpNot
     *
     * @return storageIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpNot() {
        return storageIpNot;
    }

    public void setStorageIpNot(String storageIpNot) {
        this.storageIpNot = storageIpNot;
    }

    public ApplicationWhereInput storageIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT);
        return this;
    }

    public ApplicationWhereInput storageIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT);
        return this;
    }

    public void setStorageIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT);
        }
    }

    public boolean getStorageIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_NOT);
    }

    public ApplicationWhereInput storageIpNotContains(String storageIpNotContains) {

        this.storageIpNotContains = storageIpNotContains;
        return this;
    }

    /**
     * Get storageIpNotContains
     *
     * @return storageIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpNotContains() {
        return storageIpNotContains;
    }

    public void setStorageIpNotContains(String storageIpNotContains) {
        this.storageIpNotContains = storageIpNotContains;
    }

    public ApplicationWhereInput storageIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS);
        return this;
    }

    public ApplicationWhereInput storageIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS);
        return this;
    }

    public void setStorageIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS);
        }
    }

    public boolean getStorageIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_NOT_CONTAINS);
    }

    public ApplicationWhereInput storageIpNotEndsWith(String storageIpNotEndsWith) {

        this.storageIpNotEndsWith = storageIpNotEndsWith;
        return this;
    }

    /**
     * Get storageIpNotEndsWith
     *
     * @return storageIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpNotEndsWith() {
        return storageIpNotEndsWith;
    }

    public void setStorageIpNotEndsWith(String storageIpNotEndsWith) {
        this.storageIpNotEndsWith = storageIpNotEndsWith;
    }

    public ApplicationWhereInput storageIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput storageIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setStorageIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getStorageIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_NOT_ENDS_WITH);
    }

    public ApplicationWhereInput storageIpNotIn(List<String> storageIpNotIn) {

        this.storageIpNotIn = storageIpNotIn;
        return this;
    }

    public ApplicationWhereInput addStorageIpNotInItem(String storageIpNotInItem) {
        if (this.storageIpNotIn == null) {
            this.storageIpNotIn = new ArrayList<String>();
        }
        this.storageIpNotIn.add(storageIpNotInItem);
        return this;
    }

    /**
     * Get storageIpNotIn
     *
     * @return storageIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStorageIpNotIn() {
        return storageIpNotIn;
    }

    public void setStorageIpNotIn(List<String> storageIpNotIn) {
        this.storageIpNotIn = storageIpNotIn;
    }

    public ApplicationWhereInput storageIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_IN);
        return this;
    }

    public ApplicationWhereInput storageIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_IN);
        return this;
    }

    public void setStorageIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_IN);
        }
    }

    public boolean getStorageIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_NOT_IN);
    }

    public ApplicationWhereInput storageIpNotStartsWith(String storageIpNotStartsWith) {

        this.storageIpNotStartsWith = storageIpNotStartsWith;
        return this;
    }

    /**
     * Get storageIpNotStartsWith
     *
     * @return storageIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpNotStartsWith() {
        return storageIpNotStartsWith;
    }

    public void setStorageIpNotStartsWith(String storageIpNotStartsWith) {
        this.storageIpNotStartsWith = storageIpNotStartsWith;
    }

    public ApplicationWhereInput storageIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput storageIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setStorageIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getStorageIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_NOT_STARTS_WITH);
    }

    public ApplicationWhereInput storageIpStartsWith(String storageIpStartsWith) {

        this.storageIpStartsWith = storageIpStartsWith;
        return this;
    }

    /**
     * Get storageIpStartsWith
     *
     * @return storageIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStorageIpStartsWith() {
        return storageIpStartsWith;
    }

    public void setStorageIpStartsWith(String storageIpStartsWith) {
        this.storageIpStartsWith = storageIpStartsWith;
    }

    public ApplicationWhereInput storageIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput storageIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_STARTS_WITH);
        return this;
    }

    public void setStorageIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP_STARTS_WITH);
        }
    }

    public boolean getStorageIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP_STARTS_WITH);
    }

    public ApplicationWhereInput type(ApplicationType type) {

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
    public ApplicationType getType() {
        return type;
    }

    public void setType(ApplicationType type) {
        this.type = type;
    }

    public ApplicationWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ApplicationWhereInput type_ExplictlyNonNull() {
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

    public ApplicationWhereInput typeIn(List<ApplicationType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ApplicationWhereInput addTypeInItem(ApplicationType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<ApplicationType>();
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
    public List<ApplicationType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<ApplicationType> typeIn) {
        this.typeIn = typeIn;
    }

    public ApplicationWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ApplicationWhereInput typeIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput typeNot(ApplicationType typeNot) {

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
    public ApplicationType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(ApplicationType typeNot) {
        this.typeNot = typeNot;
    }

    public ApplicationWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ApplicationWhereInput typeNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput typeNotIn(List<ApplicationType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ApplicationWhereInput addTypeNotInItem(ApplicationType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<ApplicationType>();
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
    public List<ApplicationType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<ApplicationType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public ApplicationWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ApplicationWhereInput typeNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput updateTime(String updateTime) {

        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ApplicationWhereInput updateTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME);
        return this;
    }

    public ApplicationWhereInput updateTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME);
        return this;
    }

    public void setUpdateTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME);
        }
    }

    public boolean getUpdateTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME);
    }

    public ApplicationWhereInput updateTimeGt(String updateTimeGt) {

        this.updateTimeGt = updateTimeGt;
        return this;
    }

    /**
     * Get updateTimeGt
     *
     * @return updateTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimeGt() {
        return updateTimeGt;
    }

    public void setUpdateTimeGt(String updateTimeGt) {
        this.updateTimeGt = updateTimeGt;
    }

    public ApplicationWhereInput updateTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_GT);
        return this;
    }

    public ApplicationWhereInput updateTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_GT);
        return this;
    }

    public void setUpdateTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_GT);
        }
    }

    public boolean getUpdateTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_GT);
    }

    public ApplicationWhereInput updateTimeGte(String updateTimeGte) {

        this.updateTimeGte = updateTimeGte;
        return this;
    }

    /**
     * Get updateTimeGte
     *
     * @return updateTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimeGte() {
        return updateTimeGte;
    }

    public void setUpdateTimeGte(String updateTimeGte) {
        this.updateTimeGte = updateTimeGte;
    }

    public ApplicationWhereInput updateTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_GTE);
        return this;
    }

    public ApplicationWhereInput updateTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_GTE);
        return this;
    }

    public void setUpdateTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_GTE);
        }
    }

    public boolean getUpdateTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_GTE);
    }

    public ApplicationWhereInput updateTimeIn(List<String> updateTimeIn) {

        this.updateTimeIn = updateTimeIn;
        return this;
    }

    public ApplicationWhereInput addUpdateTimeInItem(String updateTimeInItem) {
        if (this.updateTimeIn == null) {
            this.updateTimeIn = new ArrayList<String>();
        }
        this.updateTimeIn.add(updateTimeInItem);
        return this;
    }

    /**
     * Get updateTimeIn
     *
     * @return updateTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdateTimeIn() {
        return updateTimeIn;
    }

    public void setUpdateTimeIn(List<String> updateTimeIn) {
        this.updateTimeIn = updateTimeIn;
    }

    public ApplicationWhereInput updateTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_IN);
        return this;
    }

    public ApplicationWhereInput updateTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_IN);
        return this;
    }

    public void setUpdateTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_IN);
        }
    }

    public boolean getUpdateTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_IN);
    }

    public ApplicationWhereInput updateTimeLt(String updateTimeLt) {

        this.updateTimeLt = updateTimeLt;
        return this;
    }

    /**
     * Get updateTimeLt
     *
     * @return updateTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimeLt() {
        return updateTimeLt;
    }

    public void setUpdateTimeLt(String updateTimeLt) {
        this.updateTimeLt = updateTimeLt;
    }

    public ApplicationWhereInput updateTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_LT);
        return this;
    }

    public ApplicationWhereInput updateTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_LT);
        return this;
    }

    public void setUpdateTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_LT);
        }
    }

    public boolean getUpdateTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_LT);
    }

    public ApplicationWhereInput updateTimeLte(String updateTimeLte) {

        this.updateTimeLte = updateTimeLte;
        return this;
    }

    /**
     * Get updateTimeLte
     *
     * @return updateTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimeLte() {
        return updateTimeLte;
    }

    public void setUpdateTimeLte(String updateTimeLte) {
        this.updateTimeLte = updateTimeLte;
    }

    public ApplicationWhereInput updateTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_LTE);
        return this;
    }

    public ApplicationWhereInput updateTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_LTE);
        return this;
    }

    public void setUpdateTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_LTE);
        }
    }

    public boolean getUpdateTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_LTE);
    }

    public ApplicationWhereInput updateTimeNot(String updateTimeNot) {

        this.updateTimeNot = updateTimeNot;
        return this;
    }

    /**
     * Get updateTimeNot
     *
     * @return updateTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTimeNot() {
        return updateTimeNot;
    }

    public void setUpdateTimeNot(String updateTimeNot) {
        this.updateTimeNot = updateTimeNot;
    }

    public ApplicationWhereInput updateTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_NOT);
        return this;
    }

    public ApplicationWhereInput updateTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_NOT);
        return this;
    }

    public void setUpdateTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_NOT);
        }
    }

    public boolean getUpdateTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_NOT);
    }

    public ApplicationWhereInput updateTimeNotIn(List<String> updateTimeNotIn) {

        this.updateTimeNotIn = updateTimeNotIn;
        return this;
    }

    public ApplicationWhereInput addUpdateTimeNotInItem(String updateTimeNotInItem) {
        if (this.updateTimeNotIn == null) {
            this.updateTimeNotIn = new ArrayList<String>();
        }
        this.updateTimeNotIn.add(updateTimeNotInItem);
        return this;
    }

    /**
     * Get updateTimeNotIn
     *
     * @return updateTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdateTimeNotIn() {
        return updateTimeNotIn;
    }

    public void setUpdateTimeNotIn(List<String> updateTimeNotIn) {
        this.updateTimeNotIn = updateTimeNotIn;
    }

    public ApplicationWhereInput updateTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_NOT_IN);
        return this;
    }

    public ApplicationWhereInput updateTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_NOT_IN);
        return this;
    }

    public void setUpdateTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME_NOT_IN);
        }
    }

    public boolean getUpdateTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME_NOT_IN);
    }

    public ApplicationWhereInput vcpu(Integer vcpu) {

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

    public ApplicationWhereInput vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public ApplicationWhereInput vcpu_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuGt(Integer vcpuGt) {

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

    public ApplicationWhereInput vcpuGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GT);
        return this;
    }

    public ApplicationWhereInput vcpuGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuGte(Integer vcpuGte) {

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

    public ApplicationWhereInput vcpuGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GTE);
        return this;
    }

    public ApplicationWhereInput vcpuGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuIn(List<Integer> vcpuIn) {

        this.vcpuIn = vcpuIn;
        return this;
    }

    public ApplicationWhereInput addVcpuInItem(Integer vcpuInItem) {
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

    public ApplicationWhereInput vcpuIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_IN);
        return this;
    }

    public ApplicationWhereInput vcpuIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuLt(Integer vcpuLt) {

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

    public ApplicationWhereInput vcpuLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LT);
        return this;
    }

    public ApplicationWhereInput vcpuLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuLte(Integer vcpuLte) {

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

    public ApplicationWhereInput vcpuLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LTE);
        return this;
    }

    public ApplicationWhereInput vcpuLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuNot(Integer vcpuNot) {

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

    public ApplicationWhereInput vcpuNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT);
        return this;
    }

    public ApplicationWhereInput vcpuNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {

        this.vcpuNotIn = vcpuNotIn;
        return this;
    }

    public ApplicationWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
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

    public ApplicationWhereInput vcpuNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT_IN);
        return this;
    }

    public ApplicationWhereInput vcpuNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput version(String version) {

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
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApplicationWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public ApplicationWhereInput version_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionContains(String versionContains) {

        this.versionContains = versionContains;
        return this;
    }

    /**
     * Get versionContains
     *
     * @return versionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionContains() {
        return versionContains;
    }

    public void setVersionContains(String versionContains) {
        this.versionContains = versionContains;
    }

    public ApplicationWhereInput versionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public ApplicationWhereInput versionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public void setVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        }
    }

    public boolean getVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_CONTAINS);
    }

    public ApplicationWhereInput versionEndsWith(String versionEndsWith) {

        this.versionEndsWith = versionEndsWith;
        return this;
    }

    /**
     * Get versionEndsWith
     *
     * @return versionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionEndsWith() {
        return versionEndsWith;
    }

    public void setVersionEndsWith(String versionEndsWith) {
        this.versionEndsWith = versionEndsWith;
    }

    public ApplicationWhereInput versionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput versionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public void setVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        }
    }

    public boolean getVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_ENDS_WITH);
    }

    public ApplicationWhereInput versionGt(String versionGt) {

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
    public String getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(String versionGt) {
        this.versionGt = versionGt;
    }

    public ApplicationWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public ApplicationWhereInput versionGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionGte(String versionGte) {

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
    public String getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(String versionGte) {
        this.versionGte = versionGte;
    }

    public ApplicationWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public ApplicationWhereInput versionGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionIn(List<String> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public ApplicationWhereInput addVersionInItem(String versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<String>();
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
    public List<String> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<String> versionIn) {
        this.versionIn = versionIn;
    }

    public ApplicationWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public ApplicationWhereInput versionIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionLt(String versionLt) {

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
    public String getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(String versionLt) {
        this.versionLt = versionLt;
    }

    public ApplicationWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public ApplicationWhereInput versionLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionLte(String versionLte) {

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
    public String getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(String versionLte) {
        this.versionLte = versionLte;
    }

    public ApplicationWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public ApplicationWhereInput versionLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionNot(String versionNot) {

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
    public String getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(String versionNot) {
        this.versionNot = versionNot;
    }

    public ApplicationWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public ApplicationWhereInput versionNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionNotContains(String versionNotContains) {

        this.versionNotContains = versionNotContains;
        return this;
    }

    /**
     * Get versionNotContains
     *
     * @return versionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotContains() {
        return versionNotContains;
    }

    public void setVersionNotContains(String versionNotContains) {
        this.versionNotContains = versionNotContains;
    }

    public ApplicationWhereInput versionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public ApplicationWhereInput versionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
    }

    public ApplicationWhereInput versionNotEndsWith(String versionNotEndsWith) {

        this.versionNotEndsWith = versionNotEndsWith;
        return this;
    }

    /**
     * Get versionNotEndsWith
     *
     * @return versionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotEndsWith() {
        return versionNotEndsWith;
    }

    public void setVersionNotEndsWith(String versionNotEndsWith) {
        this.versionNotEndsWith = versionNotEndsWith;
    }

    public ApplicationWhereInput versionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ApplicationWhereInput versionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
    }

    public ApplicationWhereInput versionNotIn(List<String> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public ApplicationWhereInput addVersionNotInItem(String versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<String>();
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
    public List<String> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<String> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public ApplicationWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public ApplicationWhereInput versionNotIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput versionNotStartsWith(String versionNotStartsWith) {

        this.versionNotStartsWith = versionNotStartsWith;
        return this;
    }

    /**
     * Get versionNotStartsWith
     *
     * @return versionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotStartsWith() {
        return versionNotStartsWith;
    }

    public void setVersionNotStartsWith(String versionNotStartsWith) {
        this.versionNotStartsWith = versionNotStartsWith;
    }

    public ApplicationWhereInput versionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput versionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
    }

    public ApplicationWhereInput versionStartsWith(String versionStartsWith) {

        this.versionStartsWith = versionStartsWith;
        return this;
    }

    /**
     * Get versionStartsWith
     *
     * @return versionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionStartsWith() {
        return versionStartsWith;
    }

    public void setVersionStartsWith(String versionStartsWith) {
        this.versionStartsWith = versionStartsWith;
    }

    public ApplicationWhereInput versionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public ApplicationWhereInput versionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public void setVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        }
    }

    public boolean getVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_STARTS_WITH);
    }

    public ApplicationWhereInput vm(VmWhereInput vm) {

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

    public ApplicationWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public ApplicationWhereInput vm_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSize(Long volumeSize) {

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
    public Long getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
    }

    public ApplicationWhereInput volumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public ApplicationWhereInput volumeSize_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeGt(Long volumeSizeGt) {

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
    public Long getVolumeSizeGt() {
        return volumeSizeGt;
    }

    public void setVolumeSizeGt(Long volumeSizeGt) {
        this.volumeSizeGt = volumeSizeGt;
    }

    public ApplicationWhereInput volumeSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_GT);
        return this;
    }

    public ApplicationWhereInput volumeSizeGt_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeGte(Long volumeSizeGte) {

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
    public Long getVolumeSizeGte() {
        return volumeSizeGte;
    }

    public void setVolumeSizeGte(Long volumeSizeGte) {
        this.volumeSizeGte = volumeSizeGte;
    }

    public ApplicationWhereInput volumeSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_GTE);
        return this;
    }

    public ApplicationWhereInput volumeSizeGte_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeIn(List<Long> volumeSizeIn) {

        this.volumeSizeIn = volumeSizeIn;
        return this;
    }

    public ApplicationWhereInput addVolumeSizeInItem(Long volumeSizeInItem) {
        if (this.volumeSizeIn == null) {
            this.volumeSizeIn = new ArrayList<Long>();
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
    public List<Long> getVolumeSizeIn() {
        return volumeSizeIn;
    }

    public void setVolumeSizeIn(List<Long> volumeSizeIn) {
        this.volumeSizeIn = volumeSizeIn;
    }

    public ApplicationWhereInput volumeSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_IN);
        return this;
    }

    public ApplicationWhereInput volumeSizeIn_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeLt(Long volumeSizeLt) {

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
    public Long getVolumeSizeLt() {
        return volumeSizeLt;
    }

    public void setVolumeSizeLt(Long volumeSizeLt) {
        this.volumeSizeLt = volumeSizeLt;
    }

    public ApplicationWhereInput volumeSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_LT);
        return this;
    }

    public ApplicationWhereInput volumeSizeLt_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeLte(Long volumeSizeLte) {

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
    public Long getVolumeSizeLte() {
        return volumeSizeLte;
    }

    public void setVolumeSizeLte(Long volumeSizeLte) {
        this.volumeSizeLte = volumeSizeLte;
    }

    public ApplicationWhereInput volumeSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_LTE);
        return this;
    }

    public ApplicationWhereInput volumeSizeLte_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeNot(Long volumeSizeNot) {

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
    public Long getVolumeSizeNot() {
        return volumeSizeNot;
    }

    public void setVolumeSizeNot(Long volumeSizeNot) {
        this.volumeSizeNot = volumeSizeNot;
    }

    public ApplicationWhereInput volumeSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_NOT);
        return this;
    }

    public ApplicationWhereInput volumeSizeNot_ExplictlyNonNull() {
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

    public ApplicationWhereInput volumeSizeNotIn(List<Long> volumeSizeNotIn) {

        this.volumeSizeNotIn = volumeSizeNotIn;
        return this;
    }

    public ApplicationWhereInput addVolumeSizeNotInItem(Long volumeSizeNotInItem) {
        if (this.volumeSizeNotIn == null) {
            this.volumeSizeNotIn = new ArrayList<Long>();
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
    public List<Long> getVolumeSizeNotIn() {
        return volumeSizeNotIn;
    }

    public void setVolumeSizeNotIn(List<Long> volumeSizeNotIn) {
        this.volumeSizeNotIn = volumeSizeNotIn;
    }

    public ApplicationWhereInput volumeSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE_NOT_IN);
        return this;
    }

    public ApplicationWhereInput volumeSizeNotIn_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationWhereInput applicationWhereInput = (ApplicationWhereInput) o;
        return Objects.equals(this.AND, applicationWhereInput.AND)
                && Objects.equals(this.NOT, applicationWhereInput.NOT)
                && Objects.equals(this.OR, applicationWhereInput.OR)
                && Objects.equals(this.cluster, applicationWhereInput.cluster)
                && Objects.equals(this.errorMessage, applicationWhereInput.errorMessage)
                && Objects.equals(
                        this.errorMessageContains, applicationWhereInput.errorMessageContains)
                && Objects.equals(
                        this.errorMessageEndsWith, applicationWhereInput.errorMessageEndsWith)
                && Objects.equals(this.errorMessageGt, applicationWhereInput.errorMessageGt)
                && Objects.equals(this.errorMessageGte, applicationWhereInput.errorMessageGte)
                && Objects.equals(this.errorMessageIn, applicationWhereInput.errorMessageIn)
                && Objects.equals(this.errorMessageLt, applicationWhereInput.errorMessageLt)
                && Objects.equals(this.errorMessageLte, applicationWhereInput.errorMessageLte)
                && Objects.equals(this.errorMessageNot, applicationWhereInput.errorMessageNot)
                && Objects.equals(
                        this.errorMessageNotContains, applicationWhereInput.errorMessageNotContains)
                && Objects.equals(
                        this.errorMessageNotEndsWith, applicationWhereInput.errorMessageNotEndsWith)
                && Objects.equals(this.errorMessageNotIn, applicationWhereInput.errorMessageNotIn)
                && Objects.equals(
                        this.errorMessageNotStartsWith,
                        applicationWhereInput.errorMessageNotStartsWith)
                && Objects.equals(
                        this.errorMessageStartsWith, applicationWhereInput.errorMessageStartsWith)
                && Objects.equals(this.id, applicationWhereInput.id)
                && Objects.equals(this.idContains, applicationWhereInput.idContains)
                && Objects.equals(this.idEndsWith, applicationWhereInput.idEndsWith)
                && Objects.equals(this.idGt, applicationWhereInput.idGt)
                && Objects.equals(this.idGte, applicationWhereInput.idGte)
                && Objects.equals(this.idIn, applicationWhereInput.idIn)
                && Objects.equals(this.idLt, applicationWhereInput.idLt)
                && Objects.equals(this.idLte, applicationWhereInput.idLte)
                && Objects.equals(this.idNot, applicationWhereInput.idNot)
                && Objects.equals(this.idNotContains, applicationWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, applicationWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, applicationWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, applicationWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, applicationWhereInput.idStartsWith)
                && Objects.equals(this.imageName, applicationWhereInput.imageName)
                && Objects.equals(this.imageNameContains, applicationWhereInput.imageNameContains)
                && Objects.equals(this.imageNameEndsWith, applicationWhereInput.imageNameEndsWith)
                && Objects.equals(this.imageNameGt, applicationWhereInput.imageNameGt)
                && Objects.equals(this.imageNameGte, applicationWhereInput.imageNameGte)
                && Objects.equals(this.imageNameIn, applicationWhereInput.imageNameIn)
                && Objects.equals(this.imageNameLt, applicationWhereInput.imageNameLt)
                && Objects.equals(this.imageNameLte, applicationWhereInput.imageNameLte)
                && Objects.equals(this.imageNameNot, applicationWhereInput.imageNameNot)
                && Objects.equals(
                        this.imageNameNotContains, applicationWhereInput.imageNameNotContains)
                && Objects.equals(
                        this.imageNameNotEndsWith, applicationWhereInput.imageNameNotEndsWith)
                && Objects.equals(this.imageNameNotIn, applicationWhereInput.imageNameNotIn)
                && Objects.equals(
                        this.imageNameNotStartsWith, applicationWhereInput.imageNameNotStartsWith)
                && Objects.equals(
                        this.imageNameStartsWith, applicationWhereInput.imageNameStartsWith)
                && Objects.equals(this.localId, applicationWhereInput.localId)
                && Objects.equals(this.localIdContains, applicationWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, applicationWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, applicationWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, applicationWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, applicationWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, applicationWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, applicationWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, applicationWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, applicationWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, applicationWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, applicationWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, applicationWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, applicationWhereInput.localIdStartsWith)
                && Objects.equals(this.memory, applicationWhereInput.memory)
                && Objects.equals(this.memoryGt, applicationWhereInput.memoryGt)
                && Objects.equals(this.memoryGte, applicationWhereInput.memoryGte)
                && Objects.equals(this.memoryIn, applicationWhereInput.memoryIn)
                && Objects.equals(this.memoryLt, applicationWhereInput.memoryLt)
                && Objects.equals(this.memoryLte, applicationWhereInput.memoryLte)
                && Objects.equals(this.memoryNot, applicationWhereInput.memoryNot)
                && Objects.equals(this.memoryNotIn, applicationWhereInput.memoryNotIn)
                && Objects.equals(this.state, applicationWhereInput.state)
                && Objects.equals(this.stateIn, applicationWhereInput.stateIn)
                && Objects.equals(this.stateNot, applicationWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, applicationWhereInput.stateNotIn)
                && Objects.equals(this.storageIp, applicationWhereInput.storageIp)
                && Objects.equals(this.storageIpContains, applicationWhereInput.storageIpContains)
                && Objects.equals(this.storageIpEndsWith, applicationWhereInput.storageIpEndsWith)
                && Objects.equals(this.storageIpGt, applicationWhereInput.storageIpGt)
                && Objects.equals(this.storageIpGte, applicationWhereInput.storageIpGte)
                && Objects.equals(this.storageIpIn, applicationWhereInput.storageIpIn)
                && Objects.equals(this.storageIpLt, applicationWhereInput.storageIpLt)
                && Objects.equals(this.storageIpLte, applicationWhereInput.storageIpLte)
                && Objects.equals(this.storageIpNot, applicationWhereInput.storageIpNot)
                && Objects.equals(
                        this.storageIpNotContains, applicationWhereInput.storageIpNotContains)
                && Objects.equals(
                        this.storageIpNotEndsWith, applicationWhereInput.storageIpNotEndsWith)
                && Objects.equals(this.storageIpNotIn, applicationWhereInput.storageIpNotIn)
                && Objects.equals(
                        this.storageIpNotStartsWith, applicationWhereInput.storageIpNotStartsWith)
                && Objects.equals(
                        this.storageIpStartsWith, applicationWhereInput.storageIpStartsWith)
                && Objects.equals(this.type, applicationWhereInput.type)
                && Objects.equals(this.typeIn, applicationWhereInput.typeIn)
                && Objects.equals(this.typeNot, applicationWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, applicationWhereInput.typeNotIn)
                && Objects.equals(this.updateTime, applicationWhereInput.updateTime)
                && Objects.equals(this.updateTimeGt, applicationWhereInput.updateTimeGt)
                && Objects.equals(this.updateTimeGte, applicationWhereInput.updateTimeGte)
                && Objects.equals(this.updateTimeIn, applicationWhereInput.updateTimeIn)
                && Objects.equals(this.updateTimeLt, applicationWhereInput.updateTimeLt)
                && Objects.equals(this.updateTimeLte, applicationWhereInput.updateTimeLte)
                && Objects.equals(this.updateTimeNot, applicationWhereInput.updateTimeNot)
                && Objects.equals(this.updateTimeNotIn, applicationWhereInput.updateTimeNotIn)
                && Objects.equals(this.vcpu, applicationWhereInput.vcpu)
                && Objects.equals(this.vcpuGt, applicationWhereInput.vcpuGt)
                && Objects.equals(this.vcpuGte, applicationWhereInput.vcpuGte)
                && Objects.equals(this.vcpuIn, applicationWhereInput.vcpuIn)
                && Objects.equals(this.vcpuLt, applicationWhereInput.vcpuLt)
                && Objects.equals(this.vcpuLte, applicationWhereInput.vcpuLte)
                && Objects.equals(this.vcpuNot, applicationWhereInput.vcpuNot)
                && Objects.equals(this.vcpuNotIn, applicationWhereInput.vcpuNotIn)
                && Objects.equals(this.version, applicationWhereInput.version)
                && Objects.equals(this.versionContains, applicationWhereInput.versionContains)
                && Objects.equals(this.versionEndsWith, applicationWhereInput.versionEndsWith)
                && Objects.equals(this.versionGt, applicationWhereInput.versionGt)
                && Objects.equals(this.versionGte, applicationWhereInput.versionGte)
                && Objects.equals(this.versionIn, applicationWhereInput.versionIn)
                && Objects.equals(this.versionLt, applicationWhereInput.versionLt)
                && Objects.equals(this.versionLte, applicationWhereInput.versionLte)
                && Objects.equals(this.versionNot, applicationWhereInput.versionNot)
                && Objects.equals(this.versionNotContains, applicationWhereInput.versionNotContains)
                && Objects.equals(this.versionNotEndsWith, applicationWhereInput.versionNotEndsWith)
                && Objects.equals(this.versionNotIn, applicationWhereInput.versionNotIn)
                && Objects.equals(
                        this.versionNotStartsWith, applicationWhereInput.versionNotStartsWith)
                && Objects.equals(this.versionStartsWith, applicationWhereInput.versionStartsWith)
                && Objects.equals(this.vm, applicationWhereInput.vm)
                && Objects.equals(this.volumeSize, applicationWhereInput.volumeSize)
                && Objects.equals(this.volumeSizeGt, applicationWhereInput.volumeSizeGt)
                && Objects.equals(this.volumeSizeGte, applicationWhereInput.volumeSizeGte)
                && Objects.equals(this.volumeSizeIn, applicationWhereInput.volumeSizeIn)
                && Objects.equals(this.volumeSizeLt, applicationWhereInput.volumeSizeLt)
                && Objects.equals(this.volumeSizeLte, applicationWhereInput.volumeSizeLte)
                && Objects.equals(this.volumeSizeNot, applicationWhereInput.volumeSizeNot)
                && Objects.equals(this.volumeSizeNotIn, applicationWhereInput.volumeSizeNotIn);
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
                imageName,
                imageNameContains,
                imageNameEndsWith,
                imageNameGt,
                imageNameGte,
                imageNameIn,
                imageNameLt,
                imageNameLte,
                imageNameNot,
                imageNameNotContains,
                imageNameNotEndsWith,
                imageNameNotIn,
                imageNameNotStartsWith,
                imageNameStartsWith,
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
                memory,
                memoryGt,
                memoryGte,
                memoryIn,
                memoryLt,
                memoryLte,
                memoryNot,
                memoryNotIn,
                state,
                stateIn,
                stateNot,
                stateNotIn,
                storageIp,
                storageIpContains,
                storageIpEndsWith,
                storageIpGt,
                storageIpGte,
                storageIpIn,
                storageIpLt,
                storageIpLte,
                storageIpNot,
                storageIpNotContains,
                storageIpNotEndsWith,
                storageIpNotIn,
                storageIpNotStartsWith,
                storageIpStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                updateTime,
                updateTimeGt,
                updateTimeGte,
                updateTimeIn,
                updateTimeLt,
                updateTimeLte,
                updateTimeNot,
                updateTimeNotIn,
                vcpu,
                vcpuGt,
                vcpuGte,
                vcpuIn,
                vcpuLt,
                vcpuLte,
                vcpuNot,
                vcpuNotIn,
                version,
                versionContains,
                versionEndsWith,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotContains,
                versionNotEndsWith,
                versionNotIn,
                versionNotStartsWith,
                versionStartsWith,
                vm,
                volumeSize,
                volumeSizeGt,
                volumeSizeGte,
                volumeSizeIn,
                volumeSizeLt,
                volumeSizeLte,
                volumeSizeNot,
                volumeSizeNotIn);
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
        sb.append("class ApplicationWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageNameContains: ")
                .append(toIndentedString(imageNameContains))
                .append("\n");
        sb.append("    imageNameEndsWith: ")
                .append(toIndentedString(imageNameEndsWith))
                .append("\n");
        sb.append("    imageNameGt: ").append(toIndentedString(imageNameGt)).append("\n");
        sb.append("    imageNameGte: ").append(toIndentedString(imageNameGte)).append("\n");
        sb.append("    imageNameIn: ").append(toIndentedString(imageNameIn)).append("\n");
        sb.append("    imageNameLt: ").append(toIndentedString(imageNameLt)).append("\n");
        sb.append("    imageNameLte: ").append(toIndentedString(imageNameLte)).append("\n");
        sb.append("    imageNameNot: ").append(toIndentedString(imageNameNot)).append("\n");
        sb.append("    imageNameNotContains: ")
                .append(toIndentedString(imageNameNotContains))
                .append("\n");
        sb.append("    imageNameNotEndsWith: ")
                .append(toIndentedString(imageNameNotEndsWith))
                .append("\n");
        sb.append("    imageNameNotIn: ").append(toIndentedString(imageNameNotIn)).append("\n");
        sb.append("    imageNameNotStartsWith: ")
                .append(toIndentedString(imageNameNotStartsWith))
                .append("\n");
        sb.append("    imageNameStartsWith: ")
                .append(toIndentedString(imageNameStartsWith))
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
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    memoryGt: ").append(toIndentedString(memoryGt)).append("\n");
        sb.append("    memoryGte: ").append(toIndentedString(memoryGte)).append("\n");
        sb.append("    memoryIn: ").append(toIndentedString(memoryIn)).append("\n");
        sb.append("    memoryLt: ").append(toIndentedString(memoryLt)).append("\n");
        sb.append("    memoryLte: ").append(toIndentedString(memoryLte)).append("\n");
        sb.append("    memoryNot: ").append(toIndentedString(memoryNot)).append("\n");
        sb.append("    memoryNotIn: ").append(toIndentedString(memoryNotIn)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
        sb.append("    storageIp: ").append(toIndentedString(storageIp)).append("\n");
        sb.append("    storageIpContains: ")
                .append(toIndentedString(storageIpContains))
                .append("\n");
        sb.append("    storageIpEndsWith: ")
                .append(toIndentedString(storageIpEndsWith))
                .append("\n");
        sb.append("    storageIpGt: ").append(toIndentedString(storageIpGt)).append("\n");
        sb.append("    storageIpGte: ").append(toIndentedString(storageIpGte)).append("\n");
        sb.append("    storageIpIn: ").append(toIndentedString(storageIpIn)).append("\n");
        sb.append("    storageIpLt: ").append(toIndentedString(storageIpLt)).append("\n");
        sb.append("    storageIpLte: ").append(toIndentedString(storageIpLte)).append("\n");
        sb.append("    storageIpNot: ").append(toIndentedString(storageIpNot)).append("\n");
        sb.append("    storageIpNotContains: ")
                .append(toIndentedString(storageIpNotContains))
                .append("\n");
        sb.append("    storageIpNotEndsWith: ")
                .append(toIndentedString(storageIpNotEndsWith))
                .append("\n");
        sb.append("    storageIpNotIn: ").append(toIndentedString(storageIpNotIn)).append("\n");
        sb.append("    storageIpNotStartsWith: ")
                .append(toIndentedString(storageIpNotStartsWith))
                .append("\n");
        sb.append("    storageIpStartsWith: ")
                .append(toIndentedString(storageIpStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeGt: ").append(toIndentedString(updateTimeGt)).append("\n");
        sb.append("    updateTimeGte: ").append(toIndentedString(updateTimeGte)).append("\n");
        sb.append("    updateTimeIn: ").append(toIndentedString(updateTimeIn)).append("\n");
        sb.append("    updateTimeLt: ").append(toIndentedString(updateTimeLt)).append("\n");
        sb.append("    updateTimeLte: ").append(toIndentedString(updateTimeLte)).append("\n");
        sb.append("    updateTimeNot: ").append(toIndentedString(updateTimeNot)).append("\n");
        sb.append("    updateTimeNotIn: ").append(toIndentedString(updateTimeNotIn)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    vcpuGt: ").append(toIndentedString(vcpuGt)).append("\n");
        sb.append("    vcpuGte: ").append(toIndentedString(vcpuGte)).append("\n");
        sb.append("    vcpuIn: ").append(toIndentedString(vcpuIn)).append("\n");
        sb.append("    vcpuLt: ").append(toIndentedString(vcpuLt)).append("\n");
        sb.append("    vcpuLte: ").append(toIndentedString(vcpuLte)).append("\n");
        sb.append("    vcpuNot: ").append(toIndentedString(vcpuNot)).append("\n");
        sb.append("    vcpuNotIn: ").append(toIndentedString(vcpuNotIn)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
        sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotContains: ")
                .append(toIndentedString(versionNotContains))
                .append("\n");
        sb.append("    versionNotEndsWith: ")
                .append(toIndentedString(versionNotEndsWith))
                .append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("    versionNotStartsWith: ")
                .append(toIndentedString(versionNotStartsWith))
                .append("\n");
        sb.append("    versionStartsWith: ")
                .append(toIndentedString(versionStartsWith))
                .append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    volumeSizeGt: ").append(toIndentedString(volumeSizeGt)).append("\n");
        sb.append("    volumeSizeGte: ").append(toIndentedString(volumeSizeGte)).append("\n");
        sb.append("    volumeSizeIn: ").append(toIndentedString(volumeSizeIn)).append("\n");
        sb.append("    volumeSizeLt: ").append(toIndentedString(volumeSizeLt)).append("\n");
        sb.append("    volumeSizeLte: ").append(toIndentedString(volumeSizeLte)).append("\n");
        sb.append("    volumeSizeNot: ").append(toIndentedString(volumeSizeNot)).append("\n");
        sb.append("    volumeSizeNotIn: ").append(toIndentedString(volumeSizeNotIn)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PciDeviceWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class PciDeviceWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<PciDeviceWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<PciDeviceWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<PciDeviceWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private String bus;

    public static final String SERIALIZED_NAME_BUS_CONTAINS = "bus_contains";

    @SerializedName(SERIALIZED_NAME_BUS_CONTAINS)
    private String busContains;

    public static final String SERIALIZED_NAME_BUS_ENDS_WITH = "bus_ends_with";

    @SerializedName(SERIALIZED_NAME_BUS_ENDS_WITH)
    private String busEndsWith;

    public static final String SERIALIZED_NAME_BUS_GT = "bus_gt";

    @SerializedName(SERIALIZED_NAME_BUS_GT)
    private String busGt;

    public static final String SERIALIZED_NAME_BUS_GTE = "bus_gte";

    @SerializedName(SERIALIZED_NAME_BUS_GTE)
    private String busGte;

    public static final String SERIALIZED_NAME_BUS_IN = "bus_in";

    @SerializedName(SERIALIZED_NAME_BUS_IN)
    private List<String> busIn = null;

    public static final String SERIALIZED_NAME_BUS_LOCATION = "bus_location";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION)
    private String busLocation;

    public static final String SERIALIZED_NAME_BUS_LOCATION_CONTAINS = "bus_location_contains";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_CONTAINS)
    private String busLocationContains;

    public static final String SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH = "bus_location_ends_with";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH)
    private String busLocationEndsWith;

    public static final String SERIALIZED_NAME_BUS_LOCATION_GT = "bus_location_gt";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_GT)
    private String busLocationGt;

    public static final String SERIALIZED_NAME_BUS_LOCATION_GTE = "bus_location_gte";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_GTE)
    private String busLocationGte;

    public static final String SERIALIZED_NAME_BUS_LOCATION_IN = "bus_location_in";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_IN)
    private List<String> busLocationIn = null;

    public static final String SERIALIZED_NAME_BUS_LOCATION_LT = "bus_location_lt";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_LT)
    private String busLocationLt;

    public static final String SERIALIZED_NAME_BUS_LOCATION_LTE = "bus_location_lte";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_LTE)
    private String busLocationLte;

    public static final String SERIALIZED_NAME_BUS_LOCATION_NOT = "bus_location_not";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT)
    private String busLocationNot;

    public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS =
            "bus_location_not_contains";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS)
    private String busLocationNotContains;

    public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH =
            "bus_location_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH)
    private String busLocationNotEndsWith;

    public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_IN = "bus_location_not_in";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_IN)
    private List<String> busLocationNotIn = null;

    public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH =
            "bus_location_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH)
    private String busLocationNotStartsWith;

    public static final String SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH =
            "bus_location_starts_with";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH)
    private String busLocationStartsWith;

    public static final String SERIALIZED_NAME_BUS_LT = "bus_lt";

    @SerializedName(SERIALIZED_NAME_BUS_LT)
    private String busLt;

    public static final String SERIALIZED_NAME_BUS_LTE = "bus_lte";

    @SerializedName(SERIALIZED_NAME_BUS_LTE)
    private String busLte;

    public static final String SERIALIZED_NAME_BUS_NOT = "bus_not";

    @SerializedName(SERIALIZED_NAME_BUS_NOT)
    private String busNot;

    public static final String SERIALIZED_NAME_BUS_NOT_CONTAINS = "bus_not_contains";

    @SerializedName(SERIALIZED_NAME_BUS_NOT_CONTAINS)
    private String busNotContains;

    public static final String SERIALIZED_NAME_BUS_NOT_ENDS_WITH = "bus_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BUS_NOT_ENDS_WITH)
    private String busNotEndsWith;

    public static final String SERIALIZED_NAME_BUS_NOT_IN = "bus_not_in";

    @SerializedName(SERIALIZED_NAME_BUS_NOT_IN)
    private List<String> busNotIn = null;

    public static final String SERIALIZED_NAME_BUS_NOT_STARTS_WITH = "bus_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BUS_NOT_STARTS_WITH)
    private String busNotStartsWith;

    public static final String SERIALIZED_NAME_BUS_STARTS_WITH = "bus_starts_with";

    @SerializedName(SERIALIZED_NAME_BUS_STARTS_WITH)
    private String busStartsWith;

    public static final String SERIALIZED_NAME_CLASS_CODE = "class_code";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE)
    private String classCode;

    public static final String SERIALIZED_NAME_CLASS_CODE_CONTAINS = "class_code_contains";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_CONTAINS)
    private String classCodeContains;

    public static final String SERIALIZED_NAME_CLASS_CODE_ENDS_WITH = "class_code_ends_with";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_ENDS_WITH)
    private String classCodeEndsWith;

    public static final String SERIALIZED_NAME_CLASS_CODE_GT = "class_code_gt";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_GT)
    private String classCodeGt;

    public static final String SERIALIZED_NAME_CLASS_CODE_GTE = "class_code_gte";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_GTE)
    private String classCodeGte;

    public static final String SERIALIZED_NAME_CLASS_CODE_IN = "class_code_in";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_IN)
    private List<String> classCodeIn = null;

    public static final String SERIALIZED_NAME_CLASS_CODE_LT = "class_code_lt";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_LT)
    private String classCodeLt;

    public static final String SERIALIZED_NAME_CLASS_CODE_LTE = "class_code_lte";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_LTE)
    private String classCodeLte;

    public static final String SERIALIZED_NAME_CLASS_CODE_NOT = "class_code_not";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_NOT)
    private String classCodeNot;

    public static final String SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS = "class_code_not_contains";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS)
    private String classCodeNotContains;

    public static final String SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH =
            "class_code_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH)
    private String classCodeNotEndsWith;

    public static final String SERIALIZED_NAME_CLASS_CODE_NOT_IN = "class_code_not_in";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_NOT_IN)
    private List<String> classCodeNotIn = null;

    public static final String SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH =
            "class_code_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH)
    private String classCodeNotStartsWith;

    public static final String SERIALIZED_NAME_CLASS_CODE_STARTS_WITH = "class_code_starts_with";

    @SerializedName(SERIALIZED_NAME_CLASS_CODE_STARTS_WITH)
    private String classCodeStartsWith;

    public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
    private String deviceType;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_CONTAINS = "device_type_contains";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_CONTAINS)
    private String deviceTypeContains;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH = "device_type_ends_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH)
    private String deviceTypeEndsWith;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_GT = "device_type_gt";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_GT)
    private String deviceTypeGt;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_GTE = "device_type_gte";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_GTE)
    private String deviceTypeGte;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_IN = "device_type_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_IN)
    private List<String> deviceTypeIn = null;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_LT = "device_type_lt";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_LT)
    private String deviceTypeLt;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_LTE = "device_type_lte";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_LTE)
    private String deviceTypeLte;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_NOT = "device_type_not";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_NOT)
    private String deviceTypeNot;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS =
            "device_type_not_contains";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS)
    private String deviceTypeNotContains;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH =
            "device_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH)
    private String deviceTypeNotEndsWith;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_NOT_IN = "device_type_not_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_NOT_IN)
    private List<String> deviceTypeNotIn = null;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH =
            "device_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH)
    private String deviceTypeNotStartsWith;

    public static final String SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH = "device_type_starts_with";

    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH)
    private String deviceTypeStartsWith;

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

    public static final String SERIALIZED_NAME_FUNCTION_NUM = "function_num";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM)
    private String functionNum;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_CONTAINS = "function_num_contains";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_CONTAINS)
    private String functionNumContains;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH = "function_num_ends_with";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH)
    private String functionNumEndsWith;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_GT = "function_num_gt";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_GT)
    private String functionNumGt;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_GTE = "function_num_gte";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_GTE)
    private String functionNumGte;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_IN = "function_num_in";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_IN)
    private List<String> functionNumIn = null;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_LT = "function_num_lt";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_LT)
    private String functionNumLt;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_LTE = "function_num_lte";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_LTE)
    private String functionNumLte;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_NOT = "function_num_not";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_NOT)
    private String functionNumNot;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS =
            "function_num_not_contains";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS)
    private String functionNumNotContains;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH =
            "function_num_not_ends_with";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH)
    private String functionNumNotEndsWith;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_NOT_IN = "function_num_not_in";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_NOT_IN)
    private List<String> functionNumNotIn = null;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH =
            "function_num_not_starts_with";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH)
    private String functionNumNotStartsWith;

    public static final String SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH =
            "function_num_starts_with";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH)
    private String functionNumStartsWith;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private HostWhereInput host;

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

    public static final String SERIALIZED_NAME_IOMMU_STATUS = "iommu_status";

    @SerializedName(SERIALIZED_NAME_IOMMU_STATUS)
    private IommuStatus iommuStatus;

    public static final String SERIALIZED_NAME_IOMMU_STATUS_IN = "iommu_status_in";

    @SerializedName(SERIALIZED_NAME_IOMMU_STATUS_IN)
    private List<IommuStatus> iommuStatusIn = null;

    public static final String SERIALIZED_NAME_IOMMU_STATUS_NOT = "iommu_status_not";

    @SerializedName(SERIALIZED_NAME_IOMMU_STATUS_NOT)
    private IommuStatus iommuStatusNot;

    public static final String SERIALIZED_NAME_IOMMU_STATUS_NOT_IN = "iommu_status_not_in";

    @SerializedName(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN)
    private List<IommuStatus> iommuStatusNotIn = null;

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

    public static final String SERIALIZED_NAME_MDEV_STATE = "mdev_state";

    @SerializedName(SERIALIZED_NAME_MDEV_STATE)
    private PciDeviceMdevState mdevState;

    public static final String SERIALIZED_NAME_MDEV_STATE_IN = "mdev_state_in";

    @SerializedName(SERIALIZED_NAME_MDEV_STATE_IN)
    private List<PciDeviceMdevState> mdevStateIn = null;

    public static final String SERIALIZED_NAME_MDEV_STATE_NOT = "mdev_state_not";

    @SerializedName(SERIALIZED_NAME_MDEV_STATE_NOT)
    private PciDeviceMdevState mdevStateNot;

    public static final String SERIALIZED_NAME_MDEV_STATE_NOT_IN = "mdev_state_not_in";

    @SerializedName(SERIALIZED_NAME_MDEV_STATE_NOT_IN)
    private List<PciDeviceMdevState> mdevStateNotIn = null;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID = "mdev_type_id";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID)
    private String mdevTypeId;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS = "mdev_type_id_contains";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS)
    private String mdevTypeIdContains;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH = "mdev_type_id_ends_with";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH)
    private String mdevTypeIdEndsWith;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_GT = "mdev_type_id_gt";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_GT)
    private String mdevTypeIdGt;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_GTE = "mdev_type_id_gte";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_GTE)
    private String mdevTypeIdGte;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_IN = "mdev_type_id_in";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_IN)
    private List<String> mdevTypeIdIn = null;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_LT = "mdev_type_id_lt";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_LT)
    private String mdevTypeIdLt;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_LTE = "mdev_type_id_lte";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_LTE)
    private String mdevTypeIdLte;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_NOT = "mdev_type_id_not";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_NOT)
    private String mdevTypeIdNot;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS =
            "mdev_type_id_not_contains";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS)
    private String mdevTypeIdNotContains;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH =
            "mdev_type_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH)
    private String mdevTypeIdNotEndsWith;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN = "mdev_type_id_not_in";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN)
    private List<String> mdevTypeIdNotIn = null;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH =
            "mdev_type_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH)
    private String mdevTypeIdNotStartsWith;

    public static final String SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH =
            "mdev_type_id_starts_with";

    @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH)
    private String mdevTypeIdStartsWith;

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

    public static final String SERIALIZED_NAME_PARTITIONING_STATE = "partitioning_state";

    @SerializedName(SERIALIZED_NAME_PARTITIONING_STATE)
    private PciDevicePartitionState partitioningState;

    public static final String SERIALIZED_NAME_PARTITIONING_STATE_IN = "partitioning_state_in";

    @SerializedName(SERIALIZED_NAME_PARTITIONING_STATE_IN)
    private List<PciDevicePartitionState> partitioningStateIn = null;

    public static final String SERIALIZED_NAME_PARTITIONING_STATE_NOT = "partitioning_state_not";

    @SerializedName(SERIALIZED_NAME_PARTITIONING_STATE_NOT)
    private PciDevicePartitionState partitioningStateNot;

    public static final String SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN =
            "partitioning_state_not_in";

    @SerializedName(SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN)
    private List<PciDevicePartitionState> partitioningStateNotIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
    private String productId;

    public static final String SERIALIZED_NAME_PRODUCT_ID_CONTAINS = "product_id_contains";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_CONTAINS)
    private String productIdContains;

    public static final String SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH = "product_id_ends_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH)
    private String productIdEndsWith;

    public static final String SERIALIZED_NAME_PRODUCT_ID_GT = "product_id_gt";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_GT)
    private String productIdGt;

    public static final String SERIALIZED_NAME_PRODUCT_ID_GTE = "product_id_gte";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_GTE)
    private String productIdGte;

    public static final String SERIALIZED_NAME_PRODUCT_ID_IN = "product_id_in";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_IN)
    private List<String> productIdIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_ID_LT = "product_id_lt";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_LT)
    private String productIdLt;

    public static final String SERIALIZED_NAME_PRODUCT_ID_LTE = "product_id_lte";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_LTE)
    private String productIdLte;

    public static final String SERIALIZED_NAME_PRODUCT_ID_NOT = "product_id_not";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_NOT)
    private String productIdNot;

    public static final String SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS = "product_id_not_contains";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS)
    private String productIdNotContains;

    public static final String SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH =
            "product_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH)
    private String productIdNotEndsWith;

    public static final String SERIALIZED_NAME_PRODUCT_ID_NOT_IN = "product_id_not_in";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_NOT_IN)
    private List<String> productIdNotIn = null;

    public static final String SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH =
            "product_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH)
    private String productIdNotStartsWith;

    public static final String SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH = "product_id_starts_with";

    @SerializedName(SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH)
    private String productIdStartsWith;

    public static final String SERIALIZED_NAME_SLOT = "slot";

    @SerializedName(SERIALIZED_NAME_SLOT)
    private String slot;

    public static final String SERIALIZED_NAME_SLOT_CONTAINS = "slot_contains";

    @SerializedName(SERIALIZED_NAME_SLOT_CONTAINS)
    private String slotContains;

    public static final String SERIALIZED_NAME_SLOT_ENDS_WITH = "slot_ends_with";

    @SerializedName(SERIALIZED_NAME_SLOT_ENDS_WITH)
    private String slotEndsWith;

    public static final String SERIALIZED_NAME_SLOT_GT = "slot_gt";

    @SerializedName(SERIALIZED_NAME_SLOT_GT)
    private String slotGt;

    public static final String SERIALIZED_NAME_SLOT_GTE = "slot_gte";

    @SerializedName(SERIALIZED_NAME_SLOT_GTE)
    private String slotGte;

    public static final String SERIALIZED_NAME_SLOT_IN = "slot_in";

    @SerializedName(SERIALIZED_NAME_SLOT_IN)
    private List<String> slotIn = null;

    public static final String SERIALIZED_NAME_SLOT_LT = "slot_lt";

    @SerializedName(SERIALIZED_NAME_SLOT_LT)
    private String slotLt;

    public static final String SERIALIZED_NAME_SLOT_LTE = "slot_lte";

    @SerializedName(SERIALIZED_NAME_SLOT_LTE)
    private String slotLte;

    public static final String SERIALIZED_NAME_SLOT_NOT = "slot_not";

    @SerializedName(SERIALIZED_NAME_SLOT_NOT)
    private String slotNot;

    public static final String SERIALIZED_NAME_SLOT_NOT_CONTAINS = "slot_not_contains";

    @SerializedName(SERIALIZED_NAME_SLOT_NOT_CONTAINS)
    private String slotNotContains;

    public static final String SERIALIZED_NAME_SLOT_NOT_ENDS_WITH = "slot_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SLOT_NOT_ENDS_WITH)
    private String slotNotEndsWith;

    public static final String SERIALIZED_NAME_SLOT_NOT_IN = "slot_not_in";

    @SerializedName(SERIALIZED_NAME_SLOT_NOT_IN)
    private List<String> slotNotIn = null;

    public static final String SERIALIZED_NAME_SLOT_NOT_STARTS_WITH = "slot_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SLOT_NOT_STARTS_WITH)
    private String slotNotStartsWith;

    public static final String SERIALIZED_NAME_SLOT_STARTS_WITH = "slot_starts_with";

    @SerializedName(SERIALIZED_NAME_SLOT_STARTS_WITH)
    private String slotStartsWith;

    public static final String SERIALIZED_NAME_SRIOV_STATE = "sriov_state";

    @SerializedName(SERIALIZED_NAME_SRIOV_STATE)
    private PciDeviceSriovState sriovState;

    public static final String SERIALIZED_NAME_SRIOV_STATE_IN = "sriov_state_in";

    @SerializedName(SERIALIZED_NAME_SRIOV_STATE_IN)
    private List<PciDeviceSriovState> sriovStateIn = null;

    public static final String SERIALIZED_NAME_SRIOV_STATE_NOT = "sriov_state_not";

    @SerializedName(SERIALIZED_NAME_SRIOV_STATE_NOT)
    private PciDeviceSriovState sriovStateNot;

    public static final String SERIALIZED_NAME_SRIOV_STATE_NOT_IN = "sriov_state_not_in";

    @SerializedName(SERIALIZED_NAME_SRIOV_STATE_NOT_IN)
    private List<PciDeviceSriovState> sriovStateNotIn = null;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID = "subsystem_product_id";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID)
    private String subsystemProductId;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS =
            "subsystem_product_id_contains";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS)
    private String subsystemProductIdContains;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH =
            "subsystem_product_id_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH)
    private String subsystemProductIdEndsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT = "subsystem_product_id_gt";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT)
    private String subsystemProductIdGt;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE =
            "subsystem_product_id_gte";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE)
    private String subsystemProductIdGte;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN = "subsystem_product_id_in";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN)
    private List<String> subsystemProductIdIn = null;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT = "subsystem_product_id_lt";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT)
    private String subsystemProductIdLt;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE =
            "subsystem_product_id_lte";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE)
    private String subsystemProductIdLte;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT =
            "subsystem_product_id_not";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT)
    private String subsystemProductIdNot;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS =
            "subsystem_product_id_not_contains";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS)
    private String subsystemProductIdNotContains;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH =
            "subsystem_product_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH)
    private String subsystemProductIdNotEndsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN =
            "subsystem_product_id_not_in";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN)
    private List<String> subsystemProductIdNotIn = null;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH =
            "subsystem_product_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH)
    private String subsystemProductIdNotStartsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH =
            "subsystem_product_id_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH)
    private String subsystemProductIdStartsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID = "subsystem_vendor_id";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID)
    private String subsystemVendorId;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS =
            "subsystem_vendor_id_contains";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS)
    private String subsystemVendorIdContains;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH =
            "subsystem_vendor_id_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH)
    private String subsystemVendorIdEndsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT = "subsystem_vendor_id_gt";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT)
    private String subsystemVendorIdGt;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE = "subsystem_vendor_id_gte";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE)
    private String subsystemVendorIdGte;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN = "subsystem_vendor_id_in";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN)
    private List<String> subsystemVendorIdIn = null;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT = "subsystem_vendor_id_lt";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT)
    private String subsystemVendorIdLt;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE = "subsystem_vendor_id_lte";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE)
    private String subsystemVendorIdLte;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT = "subsystem_vendor_id_not";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT)
    private String subsystemVendorIdNot;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS =
            "subsystem_vendor_id_not_contains";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS)
    private String subsystemVendorIdNotContains;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH =
            "subsystem_vendor_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH)
    private String subsystemVendorIdNotEndsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN =
            "subsystem_vendor_id_not_in";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN)
    private List<String> subsystemVendorIdNotIn = null;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH =
            "subsystem_vendor_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH)
    private String subsystemVendorIdNotStartsWith;

    public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH =
            "subsystem_vendor_id_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH)
    private String subsystemVendorIdStartsWith;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM = "total_mdev_num";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM)
    private Integer totalMdevNum;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_GT = "total_mdev_num_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_GT)
    private Integer totalMdevNumGt;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE = "total_mdev_num_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE)
    private Integer totalMdevNumGte;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_IN = "total_mdev_num_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_IN)
    private List<Integer> totalMdevNumIn = null;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_LT = "total_mdev_num_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_LT)
    private Integer totalMdevNumLt;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE = "total_mdev_num_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE)
    private Integer totalMdevNumLte;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT = "total_mdev_num_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT)
    private Integer totalMdevNumNot;

    public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN = "total_mdev_num_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN)
    private List<Integer> totalMdevNumNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM = "total_partitioning_num";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM)
    private Integer totalPartitioningNum;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT =
            "total_partitioning_num_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT)
    private Integer totalPartitioningNumGt;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE =
            "total_partitioning_num_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE)
    private Integer totalPartitioningNumGte;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN =
            "total_partitioning_num_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN)
    private List<Integer> totalPartitioningNumIn = null;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT =
            "total_partitioning_num_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT)
    private Integer totalPartitioningNumLt;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE =
            "total_partitioning_num_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE)
    private Integer totalPartitioningNumLte;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT =
            "total_partitioning_num_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT)
    private Integer totalPartitioningNumNot;

    public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN =
            "total_partitioning_num_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN)
    private List<Integer> totalPartitioningNumNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
    private Integer totalVfNum;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_GT = "total_vf_num_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_GT)
    private Integer totalVfNumGt;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_GTE = "total_vf_num_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_GTE)
    private Integer totalVfNumGte;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_IN = "total_vf_num_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_IN)
    private List<Integer> totalVfNumIn = null;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_LT = "total_vf_num_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_LT)
    private Integer totalVfNumLt;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_LTE = "total_vf_num_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_LTE)
    private Integer totalVfNumLte;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_NOT = "total_vf_num_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_NOT)
    private Integer totalVfNumNot;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN = "total_vf_num_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN)
    private List<Integer> totalVfNumNotIn = null;

    public static final String SERIALIZED_NAME_USAGE_TYPE = "usage_type";

    @SerializedName(SERIALIZED_NAME_USAGE_TYPE)
    private PciDeviceType usageType;

    public static final String SERIALIZED_NAME_USAGE_TYPE_IN = "usage_type_in";

    @SerializedName(SERIALIZED_NAME_USAGE_TYPE_IN)
    private List<PciDeviceType> usageTypeIn = null;

    public static final String SERIALIZED_NAME_USAGE_TYPE_NOT = "usage_type_not";

    @SerializedName(SERIALIZED_NAME_USAGE_TYPE_NOT)
    private PciDeviceType usageTypeNot;

    public static final String SERIALIZED_NAME_USAGE_TYPE_NOT_IN = "usage_type_not_in";

    @SerializedName(SERIALIZED_NAME_USAGE_TYPE_NOT_IN)
    private List<PciDeviceType> usageTypeNotIn = null;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM = "used_mdev_num";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM)
    private Integer usedMdevNum;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_GT = "used_mdev_num_gt";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_GT)
    private Integer usedMdevNumGt;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_GTE = "used_mdev_num_gte";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_GTE)
    private Integer usedMdevNumGte;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_IN = "used_mdev_num_in";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_IN)
    private List<Integer> usedMdevNumIn = null;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_LT = "used_mdev_num_lt";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_LT)
    private Integer usedMdevNumLt;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_LTE = "used_mdev_num_lte";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_LTE)
    private Integer usedMdevNumLte;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_NOT = "used_mdev_num_not";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_NOT)
    private Integer usedMdevNumNot;

    public static final String SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN = "used_mdev_num_not_in";

    @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN)
    private List<Integer> usedMdevNumNotIn = null;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM = "used_partitioning_num";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM)
    private Integer usedPartitioningNum;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_GT =
            "used_partitioning_num_gt";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_GT)
    private Integer usedPartitioningNumGt;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE =
            "used_partitioning_num_gte";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE)
    private Integer usedPartitioningNumGte;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_IN =
            "used_partitioning_num_in";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_IN)
    private List<Integer> usedPartitioningNumIn = null;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_LT =
            "used_partitioning_num_lt";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_LT)
    private Integer usedPartitioningNumLt;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE =
            "used_partitioning_num_lte";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE)
    private Integer usedPartitioningNumLte;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT =
            "used_partitioning_num_not";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT)
    private Integer usedPartitioningNumNot;

    public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN =
            "used_partitioning_num_not_in";

    @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN)
    private List<Integer> usedPartitioningNumNotIn = null;

    public static final String SERIALIZED_NAME_USED_VF_NUM = "used_vf_num";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM)
    private Integer usedVfNum;

    public static final String SERIALIZED_NAME_USED_VF_NUM_GT = "used_vf_num_gt";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_GT)
    private Integer usedVfNumGt;

    public static final String SERIALIZED_NAME_USED_VF_NUM_GTE = "used_vf_num_gte";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_GTE)
    private Integer usedVfNumGte;

    public static final String SERIALIZED_NAME_USED_VF_NUM_IN = "used_vf_num_in";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_IN)
    private List<Integer> usedVfNumIn = null;

    public static final String SERIALIZED_NAME_USED_VF_NUM_LT = "used_vf_num_lt";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_LT)
    private Integer usedVfNumLt;

    public static final String SERIALIZED_NAME_USED_VF_NUM_LTE = "used_vf_num_lte";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_LTE)
    private Integer usedVfNumLte;

    public static final String SERIALIZED_NAME_USED_VF_NUM_NOT = "used_vf_num_not";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_NOT)
    private Integer usedVfNumNot;

    public static final String SERIALIZED_NAME_USED_VF_NUM_NOT_IN = "used_vf_num_not_in";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM_NOT_IN)
    private List<Integer> usedVfNumNotIn = null;

    public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";

    @SerializedName(SERIALIZED_NAME_USER_USAGE)
    private PciDeviceUsage userUsage;

    public static final String SERIALIZED_NAME_USER_USAGE_IN = "user_usage_in";

    @SerializedName(SERIALIZED_NAME_USER_USAGE_IN)
    private List<PciDeviceUsage> userUsageIn = null;

    public static final String SERIALIZED_NAME_USER_USAGE_NOT = "user_usage_not";

    @SerializedName(SERIALIZED_NAME_USER_USAGE_NOT)
    private PciDeviceUsage userUsageNot;

    public static final String SERIALIZED_NAME_USER_USAGE_NOT_IN = "user_usage_not_in";

    @SerializedName(SERIALIZED_NAME_USER_USAGE_NOT_IN)
    private List<PciDeviceUsage> userUsageNotIn = null;

    public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID)
    private String vendorId;

    public static final String SERIALIZED_NAME_VENDOR_ID_CONTAINS = "vendor_id_contains";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_CONTAINS)
    private String vendorIdContains;

    public static final String SERIALIZED_NAME_VENDOR_ID_ENDS_WITH = "vendor_id_ends_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_ENDS_WITH)
    private String vendorIdEndsWith;

    public static final String SERIALIZED_NAME_VENDOR_ID_GT = "vendor_id_gt";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_GT)
    private String vendorIdGt;

    public static final String SERIALIZED_NAME_VENDOR_ID_GTE = "vendor_id_gte";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_GTE)
    private String vendorIdGte;

    public static final String SERIALIZED_NAME_VENDOR_ID_IN = "vendor_id_in";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_IN)
    private List<String> vendorIdIn = null;

    public static final String SERIALIZED_NAME_VENDOR_ID_LT = "vendor_id_lt";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_LT)
    private String vendorIdLt;

    public static final String SERIALIZED_NAME_VENDOR_ID_LTE = "vendor_id_lte";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_LTE)
    private String vendorIdLte;

    public static final String SERIALIZED_NAME_VENDOR_ID_NOT = "vendor_id_not";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_NOT)
    private String vendorIdNot;

    public static final String SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS = "vendor_id_not_contains";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS)
    private String vendorIdNotContains;

    public static final String SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH = "vendor_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH)
    private String vendorIdNotEndsWith;

    public static final String SERIALIZED_NAME_VENDOR_ID_NOT_IN = "vendor_id_not_in";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_NOT_IN)
    private List<String> vendorIdNotIn = null;

    public static final String SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH =
            "vendor_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH)
    private String vendorIdNotStartsWith;

    public static final String SERIALIZED_NAME_VENDOR_ID_STARTS_WITH = "vendor_id_starts_with";

    @SerializedName(SERIALIZED_NAME_VENDOR_ID_STARTS_WITH)
    private String vendorIdStartsWith;

    public static final String SERIALIZED_NAME_VERDOR_NAME = "verdor_name";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME)
    private String verdorName;

    public static final String SERIALIZED_NAME_VERDOR_NAME_CONTAINS = "verdor_name_contains";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_CONTAINS)
    private String verdorNameContains;

    public static final String SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH = "verdor_name_ends_with";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH)
    private String verdorNameEndsWith;

    public static final String SERIALIZED_NAME_VERDOR_NAME_GT = "verdor_name_gt";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_GT)
    private String verdorNameGt;

    public static final String SERIALIZED_NAME_VERDOR_NAME_GTE = "verdor_name_gte";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_GTE)
    private String verdorNameGte;

    public static final String SERIALIZED_NAME_VERDOR_NAME_IN = "verdor_name_in";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_IN)
    private List<String> verdorNameIn = null;

    public static final String SERIALIZED_NAME_VERDOR_NAME_LT = "verdor_name_lt";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_LT)
    private String verdorNameLt;

    public static final String SERIALIZED_NAME_VERDOR_NAME_LTE = "verdor_name_lte";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_LTE)
    private String verdorNameLte;

    public static final String SERIALIZED_NAME_VERDOR_NAME_NOT = "verdor_name_not";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_NOT)
    private String verdorNameNot;

    public static final String SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS =
            "verdor_name_not_contains";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS)
    private String verdorNameNotContains;

    public static final String SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH =
            "verdor_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH)
    private String verdorNameNotEndsWith;

    public static final String SERIALIZED_NAME_VERDOR_NAME_NOT_IN = "verdor_name_not_in";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_NOT_IN)
    private List<String> verdorNameNotIn = null;

    public static final String SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH =
            "verdor_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH)
    private String verdorNameNotStartsWith;

    public static final String SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH = "verdor_name_starts_with";

    @SerializedName(SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH)
    private String verdorNameStartsWith;

    public PciDeviceWhereInput() {}

    public PciDeviceWhereInput AND(List<PciDeviceWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public PciDeviceWhereInput addANDItem(PciDeviceWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<PciDeviceWhereInput>();
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
    public List<PciDeviceWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<PciDeviceWhereInput> AND) {
        this.AND = AND;
    }

    public PciDeviceWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public PciDeviceWhereInput AND_ExplictlyNonNull() {
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

    public PciDeviceWhereInput NOT(List<PciDeviceWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public PciDeviceWhereInput addNOTItem(PciDeviceWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<PciDeviceWhereInput>();
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
    public List<PciDeviceWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<PciDeviceWhereInput> NOT) {
        this.NOT = NOT;
    }

    public PciDeviceWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public PciDeviceWhereInput NOT_ExplictlyNonNull() {
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

    public PciDeviceWhereInput OR(List<PciDeviceWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public PciDeviceWhereInput addORItem(PciDeviceWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<PciDeviceWhereInput>();
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
    public List<PciDeviceWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<PciDeviceWhereInput> OR) {
        this.OR = OR;
    }

    public PciDeviceWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public PciDeviceWhereInput OR_ExplictlyNonNull() {
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

    public PciDeviceWhereInput bus(String bus) {

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
    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public PciDeviceWhereInput bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public PciDeviceWhereInput bus_ExplictlyNonNull() {
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

    public PciDeviceWhereInput busContains(String busContains) {

        this.busContains = busContains;
        return this;
    }

    /**
     * Get busContains
     *
     * @return busContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusContains() {
        return busContains;
    }

    public void setBusContains(String busContains) {
        this.busContains = busContains;
    }

    public PciDeviceWhereInput busContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput busContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_CONTAINS);
        return this;
    }

    public void setBusContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_CONTAINS);
        }
    }

    public boolean getBusContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_CONTAINS);
    }

    public PciDeviceWhereInput busEndsWith(String busEndsWith) {

        this.busEndsWith = busEndsWith;
        return this;
    }

    /**
     * Get busEndsWith
     *
     * @return busEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusEndsWith() {
        return busEndsWith;
    }

    public void setBusEndsWith(String busEndsWith) {
        this.busEndsWith = busEndsWith;
    }

    public PciDeviceWhereInput busEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput busEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_ENDS_WITH);
        return this;
    }

    public void setBusEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_ENDS_WITH);
        }
    }

    public boolean getBusEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_ENDS_WITH);
    }

    public PciDeviceWhereInput busGt(String busGt) {

        this.busGt = busGt;
        return this;
    }

    /**
     * Get busGt
     *
     * @return busGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusGt() {
        return busGt;
    }

    public void setBusGt(String busGt) {
        this.busGt = busGt;
    }

    public PciDeviceWhereInput busGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_GT);
        return this;
    }

    public PciDeviceWhereInput busGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_GT);
        return this;
    }

    public void setBusGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_GT);
        }
    }

    public boolean getBusGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_GT);
    }

    public PciDeviceWhereInput busGte(String busGte) {

        this.busGte = busGte;
        return this;
    }

    /**
     * Get busGte
     *
     * @return busGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusGte() {
        return busGte;
    }

    public void setBusGte(String busGte) {
        this.busGte = busGte;
    }

    public PciDeviceWhereInput busGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_GTE);
        return this;
    }

    public PciDeviceWhereInput busGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_GTE);
        return this;
    }

    public void setBusGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_GTE);
        }
    }

    public boolean getBusGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_GTE);
    }

    public PciDeviceWhereInput busIn(List<String> busIn) {

        this.busIn = busIn;
        return this;
    }

    public PciDeviceWhereInput addBusInItem(String busInItem) {
        if (this.busIn == null) {
            this.busIn = new ArrayList<String>();
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
    public List<String> getBusIn() {
        return busIn;
    }

    public void setBusIn(List<String> busIn) {
        this.busIn = busIn;
    }

    public PciDeviceWhereInput busIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_IN);
        return this;
    }

    public PciDeviceWhereInput busIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput busLocation(String busLocation) {

        this.busLocation = busLocation;
        return this;
    }

    /**
     * Get busLocation
     *
     * @return busLocation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocation() {
        return busLocation;
    }

    public void setBusLocation(String busLocation) {
        this.busLocation = busLocation;
    }

    public PciDeviceWhereInput busLocation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION);
        return this;
    }

    public PciDeviceWhereInput busLocation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION);
        return this;
    }

    public void setBusLocation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION);
        }
    }

    public boolean getBusLocation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION);
    }

    public PciDeviceWhereInput busLocationContains(String busLocationContains) {

        this.busLocationContains = busLocationContains;
        return this;
    }

    /**
     * Get busLocationContains
     *
     * @return busLocationContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationContains() {
        return busLocationContains;
    }

    public void setBusLocationContains(String busLocationContains) {
        this.busLocationContains = busLocationContains;
    }

    public PciDeviceWhereInput busLocationContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput busLocationContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_CONTAINS);
        return this;
    }

    public void setBusLocationContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_CONTAINS);
        }
    }

    public boolean getBusLocationContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_CONTAINS);
    }

    public PciDeviceWhereInput busLocationEndsWith(String busLocationEndsWith) {

        this.busLocationEndsWith = busLocationEndsWith;
        return this;
    }

    /**
     * Get busLocationEndsWith
     *
     * @return busLocationEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationEndsWith() {
        return busLocationEndsWith;
    }

    public void setBusLocationEndsWith(String busLocationEndsWith) {
        this.busLocationEndsWith = busLocationEndsWith;
    }

    public PciDeviceWhereInput busLocationEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput busLocationEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH);
        return this;
    }

    public void setBusLocationEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH);
        }
    }

    public boolean getBusLocationEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH);
    }

    public PciDeviceWhereInput busLocationGt(String busLocationGt) {

        this.busLocationGt = busLocationGt;
        return this;
    }

    /**
     * Get busLocationGt
     *
     * @return busLocationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationGt() {
        return busLocationGt;
    }

    public void setBusLocationGt(String busLocationGt) {
        this.busLocationGt = busLocationGt;
    }

    public PciDeviceWhereInput busLocationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_GT);
        return this;
    }

    public PciDeviceWhereInput busLocationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_GT);
        return this;
    }

    public void setBusLocationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_GT);
        }
    }

    public boolean getBusLocationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_GT);
    }

    public PciDeviceWhereInput busLocationGte(String busLocationGte) {

        this.busLocationGte = busLocationGte;
        return this;
    }

    /**
     * Get busLocationGte
     *
     * @return busLocationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationGte() {
        return busLocationGte;
    }

    public void setBusLocationGte(String busLocationGte) {
        this.busLocationGte = busLocationGte;
    }

    public PciDeviceWhereInput busLocationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_GTE);
        return this;
    }

    public PciDeviceWhereInput busLocationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_GTE);
        return this;
    }

    public void setBusLocationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_GTE);
        }
    }

    public boolean getBusLocationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_GTE);
    }

    public PciDeviceWhereInput busLocationIn(List<String> busLocationIn) {

        this.busLocationIn = busLocationIn;
        return this;
    }

    public PciDeviceWhereInput addBusLocationInItem(String busLocationInItem) {
        if (this.busLocationIn == null) {
            this.busLocationIn = new ArrayList<String>();
        }
        this.busLocationIn.add(busLocationInItem);
        return this;
    }

    /**
     * Get busLocationIn
     *
     * @return busLocationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBusLocationIn() {
        return busLocationIn;
    }

    public void setBusLocationIn(List<String> busLocationIn) {
        this.busLocationIn = busLocationIn;
    }

    public PciDeviceWhereInput busLocationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_IN);
        return this;
    }

    public PciDeviceWhereInput busLocationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_IN);
        return this;
    }

    public void setBusLocationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_IN);
        }
    }

    public boolean getBusLocationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_IN);
    }

    public PciDeviceWhereInput busLocationLt(String busLocationLt) {

        this.busLocationLt = busLocationLt;
        return this;
    }

    /**
     * Get busLocationLt
     *
     * @return busLocationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationLt() {
        return busLocationLt;
    }

    public void setBusLocationLt(String busLocationLt) {
        this.busLocationLt = busLocationLt;
    }

    public PciDeviceWhereInput busLocationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_LT);
        return this;
    }

    public PciDeviceWhereInput busLocationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_LT);
        return this;
    }

    public void setBusLocationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_LT);
        }
    }

    public boolean getBusLocationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_LT);
    }

    public PciDeviceWhereInput busLocationLte(String busLocationLte) {

        this.busLocationLte = busLocationLte;
        return this;
    }

    /**
     * Get busLocationLte
     *
     * @return busLocationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationLte() {
        return busLocationLte;
    }

    public void setBusLocationLte(String busLocationLte) {
        this.busLocationLte = busLocationLte;
    }

    public PciDeviceWhereInput busLocationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_LTE);
        return this;
    }

    public PciDeviceWhereInput busLocationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_LTE);
        return this;
    }

    public void setBusLocationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_LTE);
        }
    }

    public boolean getBusLocationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_LTE);
    }

    public PciDeviceWhereInput busLocationNot(String busLocationNot) {

        this.busLocationNot = busLocationNot;
        return this;
    }

    /**
     * Get busLocationNot
     *
     * @return busLocationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationNot() {
        return busLocationNot;
    }

    public void setBusLocationNot(String busLocationNot) {
        this.busLocationNot = busLocationNot;
    }

    public PciDeviceWhereInput busLocationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT);
        return this;
    }

    public PciDeviceWhereInput busLocationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT);
        return this;
    }

    public void setBusLocationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT);
        }
    }

    public boolean getBusLocationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_NOT);
    }

    public PciDeviceWhereInput busLocationNotContains(String busLocationNotContains) {

        this.busLocationNotContains = busLocationNotContains;
        return this;
    }

    /**
     * Get busLocationNotContains
     *
     * @return busLocationNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationNotContains() {
        return busLocationNotContains;
    }

    public void setBusLocationNotContains(String busLocationNotContains) {
        this.busLocationNotContains = busLocationNotContains;
    }

    public PciDeviceWhereInput busLocationNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput busLocationNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS);
        return this;
    }

    public void setBusLocationNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS);
        }
    }

    public boolean getBusLocationNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS);
    }

    public PciDeviceWhereInput busLocationNotEndsWith(String busLocationNotEndsWith) {

        this.busLocationNotEndsWith = busLocationNotEndsWith;
        return this;
    }

    /**
     * Get busLocationNotEndsWith
     *
     * @return busLocationNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationNotEndsWith() {
        return busLocationNotEndsWith;
    }

    public void setBusLocationNotEndsWith(String busLocationNotEndsWith) {
        this.busLocationNotEndsWith = busLocationNotEndsWith;
    }

    public PciDeviceWhereInput busLocationNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput busLocationNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH);
        return this;
    }

    public void setBusLocationNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH);
        }
    }

    public boolean getBusLocationNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput busLocationNotIn(List<String> busLocationNotIn) {

        this.busLocationNotIn = busLocationNotIn;
        return this;
    }

    public PciDeviceWhereInput addBusLocationNotInItem(String busLocationNotInItem) {
        if (this.busLocationNotIn == null) {
            this.busLocationNotIn = new ArrayList<String>();
        }
        this.busLocationNotIn.add(busLocationNotInItem);
        return this;
    }

    /**
     * Get busLocationNotIn
     *
     * @return busLocationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBusLocationNotIn() {
        return busLocationNotIn;
    }

    public void setBusLocationNotIn(List<String> busLocationNotIn) {
        this.busLocationNotIn = busLocationNotIn;
    }

    public PciDeviceWhereInput busLocationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput busLocationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_IN);
        return this;
    }

    public void setBusLocationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_IN);
        }
    }

    public boolean getBusLocationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_NOT_IN);
    }

    public PciDeviceWhereInput busLocationNotStartsWith(String busLocationNotStartsWith) {

        this.busLocationNotStartsWith = busLocationNotStartsWith;
        return this;
    }

    /**
     * Get busLocationNotStartsWith
     *
     * @return busLocationNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationNotStartsWith() {
        return busLocationNotStartsWith;
    }

    public void setBusLocationNotStartsWith(String busLocationNotStartsWith) {
        this.busLocationNotStartsWith = busLocationNotStartsWith;
    }

    public PciDeviceWhereInput busLocationNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput busLocationNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH);
        return this;
    }

    public void setBusLocationNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH);
        }
    }

    public boolean getBusLocationNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput busLocationStartsWith(String busLocationStartsWith) {

        this.busLocationStartsWith = busLocationStartsWith;
        return this;
    }

    /**
     * Get busLocationStartsWith
     *
     * @return busLocationStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLocationStartsWith() {
        return busLocationStartsWith;
    }

    public void setBusLocationStartsWith(String busLocationStartsWith) {
        this.busLocationStartsWith = busLocationStartsWith;
    }

    public PciDeviceWhereInput busLocationStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput busLocationStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH);
        return this;
    }

    public void setBusLocationStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH);
        }
    }

    public boolean getBusLocationStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH);
    }

    public PciDeviceWhereInput busLt(String busLt) {

        this.busLt = busLt;
        return this;
    }

    /**
     * Get busLt
     *
     * @return busLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLt() {
        return busLt;
    }

    public void setBusLt(String busLt) {
        this.busLt = busLt;
    }

    public PciDeviceWhereInput busLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LT);
        return this;
    }

    public PciDeviceWhereInput busLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LT);
        return this;
    }

    public void setBusLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LT);
        }
    }

    public boolean getBusLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LT);
    }

    public PciDeviceWhereInput busLte(String busLte) {

        this.busLte = busLte;
        return this;
    }

    /**
     * Get busLte
     *
     * @return busLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusLte() {
        return busLte;
    }

    public void setBusLte(String busLte) {
        this.busLte = busLte;
    }

    public PciDeviceWhereInput busLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LTE);
        return this;
    }

    public PciDeviceWhereInput busLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_LTE);
        return this;
    }

    public void setBusLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_LTE);
        }
    }

    public boolean getBusLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_LTE);
    }

    public PciDeviceWhereInput busNot(String busNot) {

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
    public String getBusNot() {
        return busNot;
    }

    public void setBusNot(String busNot) {
        this.busNot = busNot;
    }

    public PciDeviceWhereInput busNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT);
        return this;
    }

    public PciDeviceWhereInput busNot_ExplictlyNonNull() {
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

    public PciDeviceWhereInput busNotContains(String busNotContains) {

        this.busNotContains = busNotContains;
        return this;
    }

    /**
     * Get busNotContains
     *
     * @return busNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusNotContains() {
        return busNotContains;
    }

    public void setBusNotContains(String busNotContains) {
        this.busNotContains = busNotContains;
    }

    public PciDeviceWhereInput busNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput busNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_CONTAINS);
        return this;
    }

    public void setBusNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_CONTAINS);
        }
    }

    public boolean getBusNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_NOT_CONTAINS);
    }

    public PciDeviceWhereInput busNotEndsWith(String busNotEndsWith) {

        this.busNotEndsWith = busNotEndsWith;
        return this;
    }

    /**
     * Get busNotEndsWith
     *
     * @return busNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusNotEndsWith() {
        return busNotEndsWith;
    }

    public void setBusNotEndsWith(String busNotEndsWith) {
        this.busNotEndsWith = busNotEndsWith;
    }

    public PciDeviceWhereInput busNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput busNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_ENDS_WITH);
        return this;
    }

    public void setBusNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_ENDS_WITH);
        }
    }

    public boolean getBusNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput busNotIn(List<String> busNotIn) {

        this.busNotIn = busNotIn;
        return this;
    }

    public PciDeviceWhereInput addBusNotInItem(String busNotInItem) {
        if (this.busNotIn == null) {
            this.busNotIn = new ArrayList<String>();
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
    public List<String> getBusNotIn() {
        return busNotIn;
    }

    public void setBusNotIn(List<String> busNotIn) {
        this.busNotIn = busNotIn;
    }

    public PciDeviceWhereInput busNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput busNotIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput busNotStartsWith(String busNotStartsWith) {

        this.busNotStartsWith = busNotStartsWith;
        return this;
    }

    /**
     * Get busNotStartsWith
     *
     * @return busNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusNotStartsWith() {
        return busNotStartsWith;
    }

    public void setBusNotStartsWith(String busNotStartsWith) {
        this.busNotStartsWith = busNotStartsWith;
    }

    public PciDeviceWhereInput busNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput busNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_STARTS_WITH);
        return this;
    }

    public void setBusNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_NOT_STARTS_WITH);
        }
    }

    public boolean getBusNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput busStartsWith(String busStartsWith) {

        this.busStartsWith = busStartsWith;
        return this;
    }

    /**
     * Get busStartsWith
     *
     * @return busStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBusStartsWith() {
        return busStartsWith;
    }

    public void setBusStartsWith(String busStartsWith) {
        this.busStartsWith = busStartsWith;
    }

    public PciDeviceWhereInput busStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput busStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS_STARTS_WITH);
        return this;
    }

    public void setBusStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS_STARTS_WITH);
        }
    }

    public boolean getBusStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS_STARTS_WITH);
    }

    public PciDeviceWhereInput classCode(String classCode) {

        this.classCode = classCode;
        return this;
    }

    /**
     * Get classCode
     *
     * @return classCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public PciDeviceWhereInput classCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE);
        return this;
    }

    public PciDeviceWhereInput classCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE);
        return this;
    }

    public void setClassCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE);
        }
    }

    public boolean getClassCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE);
    }

    public PciDeviceWhereInput classCodeContains(String classCodeContains) {

        this.classCodeContains = classCodeContains;
        return this;
    }

    /**
     * Get classCodeContains
     *
     * @return classCodeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeContains() {
        return classCodeContains;
    }

    public void setClassCodeContains(String classCodeContains) {
        this.classCodeContains = classCodeContains;
    }

    public PciDeviceWhereInput classCodeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput classCodeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_CONTAINS);
        return this;
    }

    public void setClassCodeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_CONTAINS);
        }
    }

    public boolean getClassCodeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_CONTAINS);
    }

    public PciDeviceWhereInput classCodeEndsWith(String classCodeEndsWith) {

        this.classCodeEndsWith = classCodeEndsWith;
        return this;
    }

    /**
     * Get classCodeEndsWith
     *
     * @return classCodeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeEndsWith() {
        return classCodeEndsWith;
    }

    public void setClassCodeEndsWith(String classCodeEndsWith) {
        this.classCodeEndsWith = classCodeEndsWith;
    }

    public PciDeviceWhereInput classCodeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput classCodeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_ENDS_WITH);
        return this;
    }

    public void setClassCodeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_ENDS_WITH);
        }
    }

    public boolean getClassCodeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_ENDS_WITH);
    }

    public PciDeviceWhereInput classCodeGt(String classCodeGt) {

        this.classCodeGt = classCodeGt;
        return this;
    }

    /**
     * Get classCodeGt
     *
     * @return classCodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeGt() {
        return classCodeGt;
    }

    public void setClassCodeGt(String classCodeGt) {
        this.classCodeGt = classCodeGt;
    }

    public PciDeviceWhereInput classCodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_GT);
        return this;
    }

    public PciDeviceWhereInput classCodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_GT);
        return this;
    }

    public void setClassCodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_GT);
        }
    }

    public boolean getClassCodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_GT);
    }

    public PciDeviceWhereInput classCodeGte(String classCodeGte) {

        this.classCodeGte = classCodeGte;
        return this;
    }

    /**
     * Get classCodeGte
     *
     * @return classCodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeGte() {
        return classCodeGte;
    }

    public void setClassCodeGte(String classCodeGte) {
        this.classCodeGte = classCodeGte;
    }

    public PciDeviceWhereInput classCodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_GTE);
        return this;
    }

    public PciDeviceWhereInput classCodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_GTE);
        return this;
    }

    public void setClassCodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_GTE);
        }
    }

    public boolean getClassCodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_GTE);
    }

    public PciDeviceWhereInput classCodeIn(List<String> classCodeIn) {

        this.classCodeIn = classCodeIn;
        return this;
    }

    public PciDeviceWhereInput addClassCodeInItem(String classCodeInItem) {
        if (this.classCodeIn == null) {
            this.classCodeIn = new ArrayList<String>();
        }
        this.classCodeIn.add(classCodeInItem);
        return this;
    }

    /**
     * Get classCodeIn
     *
     * @return classCodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClassCodeIn() {
        return classCodeIn;
    }

    public void setClassCodeIn(List<String> classCodeIn) {
        this.classCodeIn = classCodeIn;
    }

    public PciDeviceWhereInput classCodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_IN);
        return this;
    }

    public PciDeviceWhereInput classCodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_IN);
        return this;
    }

    public void setClassCodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_IN);
        }
    }

    public boolean getClassCodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_IN);
    }

    public PciDeviceWhereInput classCodeLt(String classCodeLt) {

        this.classCodeLt = classCodeLt;
        return this;
    }

    /**
     * Get classCodeLt
     *
     * @return classCodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeLt() {
        return classCodeLt;
    }

    public void setClassCodeLt(String classCodeLt) {
        this.classCodeLt = classCodeLt;
    }

    public PciDeviceWhereInput classCodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_LT);
        return this;
    }

    public PciDeviceWhereInput classCodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_LT);
        return this;
    }

    public void setClassCodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_LT);
        }
    }

    public boolean getClassCodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_LT);
    }

    public PciDeviceWhereInput classCodeLte(String classCodeLte) {

        this.classCodeLte = classCodeLte;
        return this;
    }

    /**
     * Get classCodeLte
     *
     * @return classCodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeLte() {
        return classCodeLte;
    }

    public void setClassCodeLte(String classCodeLte) {
        this.classCodeLte = classCodeLte;
    }

    public PciDeviceWhereInput classCodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_LTE);
        return this;
    }

    public PciDeviceWhereInput classCodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_LTE);
        return this;
    }

    public void setClassCodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_LTE);
        }
    }

    public boolean getClassCodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_LTE);
    }

    public PciDeviceWhereInput classCodeNot(String classCodeNot) {

        this.classCodeNot = classCodeNot;
        return this;
    }

    /**
     * Get classCodeNot
     *
     * @return classCodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeNot() {
        return classCodeNot;
    }

    public void setClassCodeNot(String classCodeNot) {
        this.classCodeNot = classCodeNot;
    }

    public PciDeviceWhereInput classCodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT);
        return this;
    }

    public PciDeviceWhereInput classCodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT);
        return this;
    }

    public void setClassCodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT);
        }
    }

    public boolean getClassCodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_NOT);
    }

    public PciDeviceWhereInput classCodeNotContains(String classCodeNotContains) {

        this.classCodeNotContains = classCodeNotContains;
        return this;
    }

    /**
     * Get classCodeNotContains
     *
     * @return classCodeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeNotContains() {
        return classCodeNotContains;
    }

    public void setClassCodeNotContains(String classCodeNotContains) {
        this.classCodeNotContains = classCodeNotContains;
    }

    public PciDeviceWhereInput classCodeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput classCodeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS);
        return this;
    }

    public void setClassCodeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS);
        }
    }

    public boolean getClassCodeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_NOT_CONTAINS);
    }

    public PciDeviceWhereInput classCodeNotEndsWith(String classCodeNotEndsWith) {

        this.classCodeNotEndsWith = classCodeNotEndsWith;
        return this;
    }

    /**
     * Get classCodeNotEndsWith
     *
     * @return classCodeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeNotEndsWith() {
        return classCodeNotEndsWith;
    }

    public void setClassCodeNotEndsWith(String classCodeNotEndsWith) {
        this.classCodeNotEndsWith = classCodeNotEndsWith;
    }

    public PciDeviceWhereInput classCodeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput classCodeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH);
        return this;
    }

    public void setClassCodeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH);
        }
    }

    public boolean getClassCodeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput classCodeNotIn(List<String> classCodeNotIn) {

        this.classCodeNotIn = classCodeNotIn;
        return this;
    }

    public PciDeviceWhereInput addClassCodeNotInItem(String classCodeNotInItem) {
        if (this.classCodeNotIn == null) {
            this.classCodeNotIn = new ArrayList<String>();
        }
        this.classCodeNotIn.add(classCodeNotInItem);
        return this;
    }

    /**
     * Get classCodeNotIn
     *
     * @return classCodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClassCodeNotIn() {
        return classCodeNotIn;
    }

    public void setClassCodeNotIn(List<String> classCodeNotIn) {
        this.classCodeNotIn = classCodeNotIn;
    }

    public PciDeviceWhereInput classCodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput classCodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_IN);
        return this;
    }

    public void setClassCodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_IN);
        }
    }

    public boolean getClassCodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_NOT_IN);
    }

    public PciDeviceWhereInput classCodeNotStartsWith(String classCodeNotStartsWith) {

        this.classCodeNotStartsWith = classCodeNotStartsWith;
        return this;
    }

    /**
     * Get classCodeNotStartsWith
     *
     * @return classCodeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeNotStartsWith() {
        return classCodeNotStartsWith;
    }

    public void setClassCodeNotStartsWith(String classCodeNotStartsWith) {
        this.classCodeNotStartsWith = classCodeNotStartsWith;
    }

    public PciDeviceWhereInput classCodeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput classCodeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH);
        return this;
    }

    public void setClassCodeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH);
        }
    }

    public boolean getClassCodeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput classCodeStartsWith(String classCodeStartsWith) {

        this.classCodeStartsWith = classCodeStartsWith;
        return this;
    }

    /**
     * Get classCodeStartsWith
     *
     * @return classCodeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClassCodeStartsWith() {
        return classCodeStartsWith;
    }

    public void setClassCodeStartsWith(String classCodeStartsWith) {
        this.classCodeStartsWith = classCodeStartsWith;
    }

    public PciDeviceWhereInput classCodeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput classCodeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_STARTS_WITH);
        return this;
    }

    public void setClassCodeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLASS_CODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLASS_CODE_STARTS_WITH);
        }
    }

    public boolean getClassCodeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLASS_CODE_STARTS_WITH);
    }

    public PciDeviceWhereInput deviceType(String deviceType) {

        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get deviceType
     *
     * @return deviceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public PciDeviceWhereInput deviceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE);
        return this;
    }

    public PciDeviceWhereInput deviceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE);
        return this;
    }

    public void setDeviceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE);
        }
    }

    public boolean getDeviceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE);
    }

    public PciDeviceWhereInput deviceTypeContains(String deviceTypeContains) {

        this.deviceTypeContains = deviceTypeContains;
        return this;
    }

    /**
     * Get deviceTypeContains
     *
     * @return deviceTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeContains() {
        return deviceTypeContains;
    }

    public void setDeviceTypeContains(String deviceTypeContains) {
        this.deviceTypeContains = deviceTypeContains;
    }

    public PciDeviceWhereInput deviceTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput deviceTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_CONTAINS);
        return this;
    }

    public void setDeviceTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_CONTAINS);
        }
    }

    public boolean getDeviceTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_CONTAINS);
    }

    public PciDeviceWhereInput deviceTypeEndsWith(String deviceTypeEndsWith) {

        this.deviceTypeEndsWith = deviceTypeEndsWith;
        return this;
    }

    /**
     * Get deviceTypeEndsWith
     *
     * @return deviceTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeEndsWith() {
        return deviceTypeEndsWith;
    }

    public void setDeviceTypeEndsWith(String deviceTypeEndsWith) {
        this.deviceTypeEndsWith = deviceTypeEndsWith;
    }

    public PciDeviceWhereInput deviceTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput deviceTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH);
        return this;
    }

    public void setDeviceTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH);
        }
    }

    public boolean getDeviceTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_ENDS_WITH);
    }

    public PciDeviceWhereInput deviceTypeGt(String deviceTypeGt) {

        this.deviceTypeGt = deviceTypeGt;
        return this;
    }

    /**
     * Get deviceTypeGt
     *
     * @return deviceTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeGt() {
        return deviceTypeGt;
    }

    public void setDeviceTypeGt(String deviceTypeGt) {
        this.deviceTypeGt = deviceTypeGt;
    }

    public PciDeviceWhereInput deviceTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_GT);
        return this;
    }

    public PciDeviceWhereInput deviceTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_GT);
        return this;
    }

    public void setDeviceTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_GT);
        }
    }

    public boolean getDeviceTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_GT);
    }

    public PciDeviceWhereInput deviceTypeGte(String deviceTypeGte) {

        this.deviceTypeGte = deviceTypeGte;
        return this;
    }

    /**
     * Get deviceTypeGte
     *
     * @return deviceTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeGte() {
        return deviceTypeGte;
    }

    public void setDeviceTypeGte(String deviceTypeGte) {
        this.deviceTypeGte = deviceTypeGte;
    }

    public PciDeviceWhereInput deviceTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_GTE);
        return this;
    }

    public PciDeviceWhereInput deviceTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_GTE);
        return this;
    }

    public void setDeviceTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_GTE);
        }
    }

    public boolean getDeviceTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_GTE);
    }

    public PciDeviceWhereInput deviceTypeIn(List<String> deviceTypeIn) {

        this.deviceTypeIn = deviceTypeIn;
        return this;
    }

    public PciDeviceWhereInput addDeviceTypeInItem(String deviceTypeInItem) {
        if (this.deviceTypeIn == null) {
            this.deviceTypeIn = new ArrayList<String>();
        }
        this.deviceTypeIn.add(deviceTypeInItem);
        return this;
    }

    /**
     * Get deviceTypeIn
     *
     * @return deviceTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeviceTypeIn() {
        return deviceTypeIn;
    }

    public void setDeviceTypeIn(List<String> deviceTypeIn) {
        this.deviceTypeIn = deviceTypeIn;
    }

    public PciDeviceWhereInput deviceTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_IN);
        return this;
    }

    public PciDeviceWhereInput deviceTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_IN);
        return this;
    }

    public void setDeviceTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_IN);
        }
    }

    public boolean getDeviceTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_IN);
    }

    public PciDeviceWhereInput deviceTypeLt(String deviceTypeLt) {

        this.deviceTypeLt = deviceTypeLt;
        return this;
    }

    /**
     * Get deviceTypeLt
     *
     * @return deviceTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeLt() {
        return deviceTypeLt;
    }

    public void setDeviceTypeLt(String deviceTypeLt) {
        this.deviceTypeLt = deviceTypeLt;
    }

    public PciDeviceWhereInput deviceTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_LT);
        return this;
    }

    public PciDeviceWhereInput deviceTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_LT);
        return this;
    }

    public void setDeviceTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_LT);
        }
    }

    public boolean getDeviceTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_LT);
    }

    public PciDeviceWhereInput deviceTypeLte(String deviceTypeLte) {

        this.deviceTypeLte = deviceTypeLte;
        return this;
    }

    /**
     * Get deviceTypeLte
     *
     * @return deviceTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeLte() {
        return deviceTypeLte;
    }

    public void setDeviceTypeLte(String deviceTypeLte) {
        this.deviceTypeLte = deviceTypeLte;
    }

    public PciDeviceWhereInput deviceTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_LTE);
        return this;
    }

    public PciDeviceWhereInput deviceTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_LTE);
        return this;
    }

    public void setDeviceTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_LTE);
        }
    }

    public boolean getDeviceTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_LTE);
    }

    public PciDeviceWhereInput deviceTypeNot(String deviceTypeNot) {

        this.deviceTypeNot = deviceTypeNot;
        return this;
    }

    /**
     * Get deviceTypeNot
     *
     * @return deviceTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeNot() {
        return deviceTypeNot;
    }

    public void setDeviceTypeNot(String deviceTypeNot) {
        this.deviceTypeNot = deviceTypeNot;
    }

    public PciDeviceWhereInput deviceTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT);
        return this;
    }

    public PciDeviceWhereInput deviceTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT);
        return this;
    }

    public void setDeviceTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT);
        }
    }

    public boolean getDeviceTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_NOT);
    }

    public PciDeviceWhereInput deviceTypeNotContains(String deviceTypeNotContains) {

        this.deviceTypeNotContains = deviceTypeNotContains;
        return this;
    }

    /**
     * Get deviceTypeNotContains
     *
     * @return deviceTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeNotContains() {
        return deviceTypeNotContains;
    }

    public void setDeviceTypeNotContains(String deviceTypeNotContains) {
        this.deviceTypeNotContains = deviceTypeNotContains;
    }

    public PciDeviceWhereInput deviceTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput deviceTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setDeviceTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getDeviceTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_NOT_CONTAINS);
    }

    public PciDeviceWhereInput deviceTypeNotEndsWith(String deviceTypeNotEndsWith) {

        this.deviceTypeNotEndsWith = deviceTypeNotEndsWith;
        return this;
    }

    /**
     * Get deviceTypeNotEndsWith
     *
     * @return deviceTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeNotEndsWith() {
        return deviceTypeNotEndsWith;
    }

    public void setDeviceTypeNotEndsWith(String deviceTypeNotEndsWith) {
        this.deviceTypeNotEndsWith = deviceTypeNotEndsWith;
    }

    public PciDeviceWhereInput deviceTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput deviceTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setDeviceTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getDeviceTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput deviceTypeNotIn(List<String> deviceTypeNotIn) {

        this.deviceTypeNotIn = deviceTypeNotIn;
        return this;
    }

    public PciDeviceWhereInput addDeviceTypeNotInItem(String deviceTypeNotInItem) {
        if (this.deviceTypeNotIn == null) {
            this.deviceTypeNotIn = new ArrayList<String>();
        }
        this.deviceTypeNotIn.add(deviceTypeNotInItem);
        return this;
    }

    /**
     * Get deviceTypeNotIn
     *
     * @return deviceTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeviceTypeNotIn() {
        return deviceTypeNotIn;
    }

    public void setDeviceTypeNotIn(List<String> deviceTypeNotIn) {
        this.deviceTypeNotIn = deviceTypeNotIn;
    }

    public PciDeviceWhereInput deviceTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput deviceTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_IN);
        return this;
    }

    public void setDeviceTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_IN);
        }
    }

    public boolean getDeviceTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_NOT_IN);
    }

    public PciDeviceWhereInput deviceTypeNotStartsWith(String deviceTypeNotStartsWith) {

        this.deviceTypeNotStartsWith = deviceTypeNotStartsWith;
        return this;
    }

    /**
     * Get deviceTypeNotStartsWith
     *
     * @return deviceTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeNotStartsWith() {
        return deviceTypeNotStartsWith;
    }

    public void setDeviceTypeNotStartsWith(String deviceTypeNotStartsWith) {
        this.deviceTypeNotStartsWith = deviceTypeNotStartsWith;
    }

    public PciDeviceWhereInput deviceTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput deviceTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setDeviceTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getDeviceTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput deviceTypeStartsWith(String deviceTypeStartsWith) {

        this.deviceTypeStartsWith = deviceTypeStartsWith;
        return this;
    }

    /**
     * Get deviceTypeStartsWith
     *
     * @return deviceTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeviceTypeStartsWith() {
        return deviceTypeStartsWith;
    }

    public void setDeviceTypeStartsWith(String deviceTypeStartsWith) {
        this.deviceTypeStartsWith = deviceTypeStartsWith;
    }

    public PciDeviceWhereInput deviceTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput deviceTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH);
        return this;
    }

    public void setDeviceTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH);
        }
    }

    public boolean getDeviceTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_TYPE_STARTS_WITH);
    }

    public PciDeviceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public PciDeviceWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public PciDeviceWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public PciDeviceWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public PciDeviceWhereInput addEntityAsyncStatusInItem(
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

    public PciDeviceWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public PciDeviceWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public PciDeviceWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public PciDeviceWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public PciDeviceWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public PciDeviceWhereInput addEntityAsyncStatusNotInItem(
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

    public PciDeviceWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput functionNum(String functionNum) {

        this.functionNum = functionNum;
        return this;
    }

    /**
     * Get functionNum
     *
     * @return functionNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNum() {
        return functionNum;
    }

    public void setFunctionNum(String functionNum) {
        this.functionNum = functionNum;
    }

    public PciDeviceWhereInput functionNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM);
        return this;
    }

    public PciDeviceWhereInput functionNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM);
        return this;
    }

    public void setFunctionNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM);
        }
    }

    public boolean getFunctionNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM);
    }

    public PciDeviceWhereInput functionNumContains(String functionNumContains) {

        this.functionNumContains = functionNumContains;
        return this;
    }

    /**
     * Get functionNumContains
     *
     * @return functionNumContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumContains() {
        return functionNumContains;
    }

    public void setFunctionNumContains(String functionNumContains) {
        this.functionNumContains = functionNumContains;
    }

    public PciDeviceWhereInput functionNumContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput functionNumContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_CONTAINS);
        return this;
    }

    public void setFunctionNumContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_CONTAINS);
        }
    }

    public boolean getFunctionNumContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_CONTAINS);
    }

    public PciDeviceWhereInput functionNumEndsWith(String functionNumEndsWith) {

        this.functionNumEndsWith = functionNumEndsWith;
        return this;
    }

    /**
     * Get functionNumEndsWith
     *
     * @return functionNumEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumEndsWith() {
        return functionNumEndsWith;
    }

    public void setFunctionNumEndsWith(String functionNumEndsWith) {
        this.functionNumEndsWith = functionNumEndsWith;
    }

    public PciDeviceWhereInput functionNumEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput functionNumEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH);
        return this;
    }

    public void setFunctionNumEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH);
        }
    }

    public boolean getFunctionNumEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_ENDS_WITH);
    }

    public PciDeviceWhereInput functionNumGt(String functionNumGt) {

        this.functionNumGt = functionNumGt;
        return this;
    }

    /**
     * Get functionNumGt
     *
     * @return functionNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumGt() {
        return functionNumGt;
    }

    public void setFunctionNumGt(String functionNumGt) {
        this.functionNumGt = functionNumGt;
    }

    public PciDeviceWhereInput functionNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput functionNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_GT);
        return this;
    }

    public void setFunctionNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_GT);
        }
    }

    public boolean getFunctionNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_GT);
    }

    public PciDeviceWhereInput functionNumGte(String functionNumGte) {

        this.functionNumGte = functionNumGte;
        return this;
    }

    /**
     * Get functionNumGte
     *
     * @return functionNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumGte() {
        return functionNumGte;
    }

    public void setFunctionNumGte(String functionNumGte) {
        this.functionNumGte = functionNumGte;
    }

    public PciDeviceWhereInput functionNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput functionNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_GTE);
        return this;
    }

    public void setFunctionNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_GTE);
        }
    }

    public boolean getFunctionNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_GTE);
    }

    public PciDeviceWhereInput functionNumIn(List<String> functionNumIn) {

        this.functionNumIn = functionNumIn;
        return this;
    }

    public PciDeviceWhereInput addFunctionNumInItem(String functionNumInItem) {
        if (this.functionNumIn == null) {
            this.functionNumIn = new ArrayList<String>();
        }
        this.functionNumIn.add(functionNumInItem);
        return this;
    }

    /**
     * Get functionNumIn
     *
     * @return functionNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFunctionNumIn() {
        return functionNumIn;
    }

    public void setFunctionNumIn(List<String> functionNumIn) {
        this.functionNumIn = functionNumIn;
    }

    public PciDeviceWhereInput functionNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput functionNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_IN);
        return this;
    }

    public void setFunctionNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_IN);
        }
    }

    public boolean getFunctionNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_IN);
    }

    public PciDeviceWhereInput functionNumLt(String functionNumLt) {

        this.functionNumLt = functionNumLt;
        return this;
    }

    /**
     * Get functionNumLt
     *
     * @return functionNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumLt() {
        return functionNumLt;
    }

    public void setFunctionNumLt(String functionNumLt) {
        this.functionNumLt = functionNumLt;
    }

    public PciDeviceWhereInput functionNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput functionNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_LT);
        return this;
    }

    public void setFunctionNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_LT);
        }
    }

    public boolean getFunctionNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_LT);
    }

    public PciDeviceWhereInput functionNumLte(String functionNumLte) {

        this.functionNumLte = functionNumLte;
        return this;
    }

    /**
     * Get functionNumLte
     *
     * @return functionNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumLte() {
        return functionNumLte;
    }

    public void setFunctionNumLte(String functionNumLte) {
        this.functionNumLte = functionNumLte;
    }

    public PciDeviceWhereInput functionNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput functionNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_LTE);
        return this;
    }

    public void setFunctionNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_LTE);
        }
    }

    public boolean getFunctionNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_LTE);
    }

    public PciDeviceWhereInput functionNumNot(String functionNumNot) {

        this.functionNumNot = functionNumNot;
        return this;
    }

    /**
     * Get functionNumNot
     *
     * @return functionNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumNot() {
        return functionNumNot;
    }

    public void setFunctionNumNot(String functionNumNot) {
        this.functionNumNot = functionNumNot;
    }

    public PciDeviceWhereInput functionNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput functionNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT);
        return this;
    }

    public void setFunctionNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT);
        }
    }

    public boolean getFunctionNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_NOT);
    }

    public PciDeviceWhereInput functionNumNotContains(String functionNumNotContains) {

        this.functionNumNotContains = functionNumNotContains;
        return this;
    }

    /**
     * Get functionNumNotContains
     *
     * @return functionNumNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumNotContains() {
        return functionNumNotContains;
    }

    public void setFunctionNumNotContains(String functionNumNotContains) {
        this.functionNumNotContains = functionNumNotContains;
    }

    public PciDeviceWhereInput functionNumNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput functionNumNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS);
        return this;
    }

    public void setFunctionNumNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS);
        }
    }

    public boolean getFunctionNumNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_NOT_CONTAINS);
    }

    public PciDeviceWhereInput functionNumNotEndsWith(String functionNumNotEndsWith) {

        this.functionNumNotEndsWith = functionNumNotEndsWith;
        return this;
    }

    /**
     * Get functionNumNotEndsWith
     *
     * @return functionNumNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumNotEndsWith() {
        return functionNumNotEndsWith;
    }

    public void setFunctionNumNotEndsWith(String functionNumNotEndsWith) {
        this.functionNumNotEndsWith = functionNumNotEndsWith;
    }

    public PciDeviceWhereInput functionNumNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput functionNumNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH);
        return this;
    }

    public void setFunctionNumNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH);
        }
    }

    public boolean getFunctionNumNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput functionNumNotIn(List<String> functionNumNotIn) {

        this.functionNumNotIn = functionNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addFunctionNumNotInItem(String functionNumNotInItem) {
        if (this.functionNumNotIn == null) {
            this.functionNumNotIn = new ArrayList<String>();
        }
        this.functionNumNotIn.add(functionNumNotInItem);
        return this;
    }

    /**
     * Get functionNumNotIn
     *
     * @return functionNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFunctionNumNotIn() {
        return functionNumNotIn;
    }

    public void setFunctionNumNotIn(List<String> functionNumNotIn) {
        this.functionNumNotIn = functionNumNotIn;
    }

    public PciDeviceWhereInput functionNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput functionNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_IN);
        return this;
    }

    public void setFunctionNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_IN);
        }
    }

    public boolean getFunctionNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_NOT_IN);
    }

    public PciDeviceWhereInput functionNumNotStartsWith(String functionNumNotStartsWith) {

        this.functionNumNotStartsWith = functionNumNotStartsWith;
        return this;
    }

    /**
     * Get functionNumNotStartsWith
     *
     * @return functionNumNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumNotStartsWith() {
        return functionNumNotStartsWith;
    }

    public void setFunctionNumNotStartsWith(String functionNumNotStartsWith) {
        this.functionNumNotStartsWith = functionNumNotStartsWith;
    }

    public PciDeviceWhereInput functionNumNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput functionNumNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH);
        return this;
    }

    public void setFunctionNumNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH);
        }
    }

    public boolean getFunctionNumNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput functionNumStartsWith(String functionNumStartsWith) {

        this.functionNumStartsWith = functionNumStartsWith;
        return this;
    }

    /**
     * Get functionNumStartsWith
     *
     * @return functionNumStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFunctionNumStartsWith() {
        return functionNumStartsWith;
    }

    public void setFunctionNumStartsWith(String functionNumStartsWith) {
        this.functionNumStartsWith = functionNumStartsWith;
    }

    public PciDeviceWhereInput functionNumStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput functionNumStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH);
        return this;
    }

    public void setFunctionNumStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH);
        }
    }

    public boolean getFunctionNumStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NUM_STARTS_WITH);
    }

    public PciDeviceWhereInput host(HostWhereInput host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHost() {
        return host;
    }

    public void setHost(HostWhereInput host) {
        this.host = host;
    }

    public PciDeviceWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public PciDeviceWhereInput host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public PciDeviceWhereInput id(String id) {

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

    public PciDeviceWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public PciDeviceWhereInput id_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idContains(String idContains) {

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

    public PciDeviceWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput idContains_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idEndsWith(String idEndsWith) {

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

    public PciDeviceWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput idEndsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idGt(String idGt) {

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

    public PciDeviceWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public PciDeviceWhereInput idGt_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idGte(String idGte) {

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

    public PciDeviceWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput idGte_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public PciDeviceWhereInput addIdInItem(String idInItem) {
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

    public PciDeviceWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public PciDeviceWhereInput idIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idLt(String idLt) {

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

    public PciDeviceWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public PciDeviceWhereInput idLt_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idLte(String idLte) {

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

    public PciDeviceWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput idLte_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idNot(String idNot) {

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

    public PciDeviceWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput idNot_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idNotContains(String idNotContains) {

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

    public PciDeviceWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput idNotContains_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public PciDeviceWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public PciDeviceWhereInput addIdNotInItem(String idNotInItem) {
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

    public PciDeviceWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput idNotIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public PciDeviceWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput idStartsWith(String idStartsWith) {

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

    public PciDeviceWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput idStartsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput iommuStatus(IommuStatus iommuStatus) {

        this.iommuStatus = iommuStatus;
        return this;
    }

    /**
     * Get iommuStatus
     *
     * @return iommuStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IommuStatus getIommuStatus() {
        return iommuStatus;
    }

    public void setIommuStatus(IommuStatus iommuStatus) {
        this.iommuStatus = iommuStatus;
    }

    public PciDeviceWhereInput iommuStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS);
        return this;
    }

    public PciDeviceWhereInput iommuStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS);
        return this;
    }

    public void setIommuStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS);
        }
    }

    public boolean getIommuStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOMMU_STATUS);
    }

    public PciDeviceWhereInput iommuStatusIn(List<IommuStatus> iommuStatusIn) {

        this.iommuStatusIn = iommuStatusIn;
        return this;
    }

    public PciDeviceWhereInput addIommuStatusInItem(IommuStatus iommuStatusInItem) {
        if (this.iommuStatusIn == null) {
            this.iommuStatusIn = new ArrayList<IommuStatus>();
        }
        this.iommuStatusIn.add(iommuStatusInItem);
        return this;
    }

    /**
     * Get iommuStatusIn
     *
     * @return iommuStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IommuStatus> getIommuStatusIn() {
        return iommuStatusIn;
    }

    public void setIommuStatusIn(List<IommuStatus> iommuStatusIn) {
        this.iommuStatusIn = iommuStatusIn;
    }

    public PciDeviceWhereInput iommuStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS_IN);
        return this;
    }

    public PciDeviceWhereInput iommuStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS_IN);
        return this;
    }

    public void setIommuStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS_IN);
        }
    }

    public boolean getIommuStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOMMU_STATUS_IN);
    }

    public PciDeviceWhereInput iommuStatusNot(IommuStatus iommuStatusNot) {

        this.iommuStatusNot = iommuStatusNot;
        return this;
    }

    /**
     * Get iommuStatusNot
     *
     * @return iommuStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IommuStatus getIommuStatusNot() {
        return iommuStatusNot;
    }

    public void setIommuStatusNot(IommuStatus iommuStatusNot) {
        this.iommuStatusNot = iommuStatusNot;
    }

    public PciDeviceWhereInput iommuStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS_NOT);
        return this;
    }

    public PciDeviceWhereInput iommuStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS_NOT);
        return this;
    }

    public void setIommuStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS_NOT);
        }
    }

    public boolean getIommuStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOMMU_STATUS_NOT);
    }

    public PciDeviceWhereInput iommuStatusNotIn(List<IommuStatus> iommuStatusNotIn) {

        this.iommuStatusNotIn = iommuStatusNotIn;
        return this;
    }

    public PciDeviceWhereInput addIommuStatusNotInItem(IommuStatus iommuStatusNotInItem) {
        if (this.iommuStatusNotIn == null) {
            this.iommuStatusNotIn = new ArrayList<IommuStatus>();
        }
        this.iommuStatusNotIn.add(iommuStatusNotInItem);
        return this;
    }

    /**
     * Get iommuStatusNotIn
     *
     * @return iommuStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IommuStatus> getIommuStatusNotIn() {
        return iommuStatusNotIn;
    }

    public void setIommuStatusNotIn(List<IommuStatus> iommuStatusNotIn) {
        this.iommuStatusNotIn = iommuStatusNotIn;
    }

    public PciDeviceWhereInput iommuStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput iommuStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN);
        return this;
    }

    public void setIommuStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN);
        }
    }

    public boolean getIommuStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOMMU_STATUS_NOT_IN);
    }

    public PciDeviceWhereInput localId(String localId) {

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

    public PciDeviceWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public PciDeviceWhereInput localId_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdContains(String localIdContains) {

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

    public PciDeviceWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput localIdContains_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public PciDeviceWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdGt(String localIdGt) {

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

    public PciDeviceWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public PciDeviceWhereInput localIdGt_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdGte(String localIdGte) {

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

    public PciDeviceWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput localIdGte_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public PciDeviceWhereInput addLocalIdInItem(String localIdInItem) {
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

    public PciDeviceWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public PciDeviceWhereInput localIdIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdLt(String localIdLt) {

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

    public PciDeviceWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public PciDeviceWhereInput localIdLt_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdLte(String localIdLte) {

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

    public PciDeviceWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput localIdLte_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdNot(String localIdNot) {

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

    public PciDeviceWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput localIdNot_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdNotContains(String localIdNotContains) {

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

    public PciDeviceWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public PciDeviceWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public PciDeviceWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public PciDeviceWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public PciDeviceWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public PciDeviceWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput mdevState(PciDeviceMdevState mdevState) {

        this.mdevState = mdevState;
        return this;
    }

    /**
     * Get mdevState
     *
     * @return mdevState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceMdevState getMdevState() {
        return mdevState;
    }

    public void setMdevState(PciDeviceMdevState mdevState) {
        this.mdevState = mdevState;
    }

    public PciDeviceWhereInput mdevState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE);
        return this;
    }

    public PciDeviceWhereInput mdevState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE);
        return this;
    }

    public void setMdevState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE);
        }
    }

    public boolean getMdevState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_STATE);
    }

    public PciDeviceWhereInput mdevStateIn(List<PciDeviceMdevState> mdevStateIn) {

        this.mdevStateIn = mdevStateIn;
        return this;
    }

    public PciDeviceWhereInput addMdevStateInItem(PciDeviceMdevState mdevStateInItem) {
        if (this.mdevStateIn == null) {
            this.mdevStateIn = new ArrayList<PciDeviceMdevState>();
        }
        this.mdevStateIn.add(mdevStateInItem);
        return this;
    }

    /**
     * Get mdevStateIn
     *
     * @return mdevStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceMdevState> getMdevStateIn() {
        return mdevStateIn;
    }

    public void setMdevStateIn(List<PciDeviceMdevState> mdevStateIn) {
        this.mdevStateIn = mdevStateIn;
    }

    public PciDeviceWhereInput mdevStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE_IN);
        return this;
    }

    public PciDeviceWhereInput mdevStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE_IN);
        return this;
    }

    public void setMdevStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE_IN);
        }
    }

    public boolean getMdevStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_STATE_IN);
    }

    public PciDeviceWhereInput mdevStateNot(PciDeviceMdevState mdevStateNot) {

        this.mdevStateNot = mdevStateNot;
        return this;
    }

    /**
     * Get mdevStateNot
     *
     * @return mdevStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceMdevState getMdevStateNot() {
        return mdevStateNot;
    }

    public void setMdevStateNot(PciDeviceMdevState mdevStateNot) {
        this.mdevStateNot = mdevStateNot;
    }

    public PciDeviceWhereInput mdevStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE_NOT);
        return this;
    }

    public PciDeviceWhereInput mdevStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE_NOT);
        return this;
    }

    public void setMdevStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE_NOT);
        }
    }

    public boolean getMdevStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_STATE_NOT);
    }

    public PciDeviceWhereInput mdevStateNotIn(List<PciDeviceMdevState> mdevStateNotIn) {

        this.mdevStateNotIn = mdevStateNotIn;
        return this;
    }

    public PciDeviceWhereInput addMdevStateNotInItem(PciDeviceMdevState mdevStateNotInItem) {
        if (this.mdevStateNotIn == null) {
            this.mdevStateNotIn = new ArrayList<PciDeviceMdevState>();
        }
        this.mdevStateNotIn.add(mdevStateNotInItem);
        return this;
    }

    /**
     * Get mdevStateNotIn
     *
     * @return mdevStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceMdevState> getMdevStateNotIn() {
        return mdevStateNotIn;
    }

    public void setMdevStateNotIn(List<PciDeviceMdevState> mdevStateNotIn) {
        this.mdevStateNotIn = mdevStateNotIn;
    }

    public PciDeviceWhereInput mdevStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput mdevStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE_NOT_IN);
        return this;
    }

    public void setMdevStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_STATE_NOT_IN);
        }
    }

    public boolean getMdevStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_STATE_NOT_IN);
    }

    public PciDeviceWhereInput mdevTypeId(String mdevTypeId) {

        this.mdevTypeId = mdevTypeId;
        return this;
    }

    /**
     * Get mdevTypeId
     *
     * @return mdevTypeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeId() {
        return mdevTypeId;
    }

    public void setMdevTypeId(String mdevTypeId) {
        this.mdevTypeId = mdevTypeId;
    }

    public PciDeviceWhereInput mdevTypeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID);
        return this;
    }

    public PciDeviceWhereInput mdevTypeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID);
        return this;
    }

    public void setMdevTypeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID);
        }
    }

    public boolean getMdevTypeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID);
    }

    public PciDeviceWhereInput mdevTypeIdContains(String mdevTypeIdContains) {

        this.mdevTypeIdContains = mdevTypeIdContains;
        return this;
    }

    /**
     * Get mdevTypeIdContains
     *
     * @return mdevTypeIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdContains() {
        return mdevTypeIdContains;
    }

    public void setMdevTypeIdContains(String mdevTypeIdContains) {
        this.mdevTypeIdContains = mdevTypeIdContains;
    }

    public PciDeviceWhereInput mdevTypeIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS);
        return this;
    }

    public void setMdevTypeIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS);
        }
    }

    public boolean getMdevTypeIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_CONTAINS);
    }

    public PciDeviceWhereInput mdevTypeIdEndsWith(String mdevTypeIdEndsWith) {

        this.mdevTypeIdEndsWith = mdevTypeIdEndsWith;
        return this;
    }

    /**
     * Get mdevTypeIdEndsWith
     *
     * @return mdevTypeIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdEndsWith() {
        return mdevTypeIdEndsWith;
    }

    public void setMdevTypeIdEndsWith(String mdevTypeIdEndsWith) {
        this.mdevTypeIdEndsWith = mdevTypeIdEndsWith;
    }

    public PciDeviceWhereInput mdevTypeIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH);
        return this;
    }

    public void setMdevTypeIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH);
        }
    }

    public boolean getMdevTypeIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_ENDS_WITH);
    }

    public PciDeviceWhereInput mdevTypeIdGt(String mdevTypeIdGt) {

        this.mdevTypeIdGt = mdevTypeIdGt;
        return this;
    }

    /**
     * Get mdevTypeIdGt
     *
     * @return mdevTypeIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdGt() {
        return mdevTypeIdGt;
    }

    public void setMdevTypeIdGt(String mdevTypeIdGt) {
        this.mdevTypeIdGt = mdevTypeIdGt;
    }

    public PciDeviceWhereInput mdevTypeIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_GT);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_GT);
        return this;
    }

    public void setMdevTypeIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_GT);
        }
    }

    public boolean getMdevTypeIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_GT);
    }

    public PciDeviceWhereInput mdevTypeIdGte(String mdevTypeIdGte) {

        this.mdevTypeIdGte = mdevTypeIdGte;
        return this;
    }

    /**
     * Get mdevTypeIdGte
     *
     * @return mdevTypeIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdGte() {
        return mdevTypeIdGte;
    }

    public void setMdevTypeIdGte(String mdevTypeIdGte) {
        this.mdevTypeIdGte = mdevTypeIdGte;
    }

    public PciDeviceWhereInput mdevTypeIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_GTE);
        return this;
    }

    public void setMdevTypeIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_GTE);
        }
    }

    public boolean getMdevTypeIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_GTE);
    }

    public PciDeviceWhereInput mdevTypeIdIn(List<String> mdevTypeIdIn) {

        this.mdevTypeIdIn = mdevTypeIdIn;
        return this;
    }

    public PciDeviceWhereInput addMdevTypeIdInItem(String mdevTypeIdInItem) {
        if (this.mdevTypeIdIn == null) {
            this.mdevTypeIdIn = new ArrayList<String>();
        }
        this.mdevTypeIdIn.add(mdevTypeIdInItem);
        return this;
    }

    /**
     * Get mdevTypeIdIn
     *
     * @return mdevTypeIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMdevTypeIdIn() {
        return mdevTypeIdIn;
    }

    public void setMdevTypeIdIn(List<String> mdevTypeIdIn) {
        this.mdevTypeIdIn = mdevTypeIdIn;
    }

    public PciDeviceWhereInput mdevTypeIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_IN);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_IN);
        return this;
    }

    public void setMdevTypeIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_IN);
        }
    }

    public boolean getMdevTypeIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_IN);
    }

    public PciDeviceWhereInput mdevTypeIdLt(String mdevTypeIdLt) {

        this.mdevTypeIdLt = mdevTypeIdLt;
        return this;
    }

    /**
     * Get mdevTypeIdLt
     *
     * @return mdevTypeIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdLt() {
        return mdevTypeIdLt;
    }

    public void setMdevTypeIdLt(String mdevTypeIdLt) {
        this.mdevTypeIdLt = mdevTypeIdLt;
    }

    public PciDeviceWhereInput mdevTypeIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_LT);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_LT);
        return this;
    }

    public void setMdevTypeIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_LT);
        }
    }

    public boolean getMdevTypeIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_LT);
    }

    public PciDeviceWhereInput mdevTypeIdLte(String mdevTypeIdLte) {

        this.mdevTypeIdLte = mdevTypeIdLte;
        return this;
    }

    /**
     * Get mdevTypeIdLte
     *
     * @return mdevTypeIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdLte() {
        return mdevTypeIdLte;
    }

    public void setMdevTypeIdLte(String mdevTypeIdLte) {
        this.mdevTypeIdLte = mdevTypeIdLte;
    }

    public PciDeviceWhereInput mdevTypeIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_LTE);
        return this;
    }

    public void setMdevTypeIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_LTE);
        }
    }

    public boolean getMdevTypeIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_LTE);
    }

    public PciDeviceWhereInput mdevTypeIdNot(String mdevTypeIdNot) {

        this.mdevTypeIdNot = mdevTypeIdNot;
        return this;
    }

    /**
     * Get mdevTypeIdNot
     *
     * @return mdevTypeIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdNot() {
        return mdevTypeIdNot;
    }

    public void setMdevTypeIdNot(String mdevTypeIdNot) {
        this.mdevTypeIdNot = mdevTypeIdNot;
    }

    public PciDeviceWhereInput mdevTypeIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT);
        return this;
    }

    public void setMdevTypeIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT);
        }
    }

    public boolean getMdevTypeIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_NOT);
    }

    public PciDeviceWhereInput mdevTypeIdNotContains(String mdevTypeIdNotContains) {

        this.mdevTypeIdNotContains = mdevTypeIdNotContains;
        return this;
    }

    /**
     * Get mdevTypeIdNotContains
     *
     * @return mdevTypeIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdNotContains() {
        return mdevTypeIdNotContains;
    }

    public void setMdevTypeIdNotContains(String mdevTypeIdNotContains) {
        this.mdevTypeIdNotContains = mdevTypeIdNotContains;
    }

    public PciDeviceWhereInput mdevTypeIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS);
        return this;
    }

    public void setMdevTypeIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS);
        }
    }

    public boolean getMdevTypeIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_CONTAINS);
    }

    public PciDeviceWhereInput mdevTypeIdNotEndsWith(String mdevTypeIdNotEndsWith) {

        this.mdevTypeIdNotEndsWith = mdevTypeIdNotEndsWith;
        return this;
    }

    /**
     * Get mdevTypeIdNotEndsWith
     *
     * @return mdevTypeIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdNotEndsWith() {
        return mdevTypeIdNotEndsWith;
    }

    public void setMdevTypeIdNotEndsWith(String mdevTypeIdNotEndsWith) {
        this.mdevTypeIdNotEndsWith = mdevTypeIdNotEndsWith;
    }

    public PciDeviceWhereInput mdevTypeIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setMdevTypeIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getMdevTypeIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput mdevTypeIdNotIn(List<String> mdevTypeIdNotIn) {

        this.mdevTypeIdNotIn = mdevTypeIdNotIn;
        return this;
    }

    public PciDeviceWhereInput addMdevTypeIdNotInItem(String mdevTypeIdNotInItem) {
        if (this.mdevTypeIdNotIn == null) {
            this.mdevTypeIdNotIn = new ArrayList<String>();
        }
        this.mdevTypeIdNotIn.add(mdevTypeIdNotInItem);
        return this;
    }

    /**
     * Get mdevTypeIdNotIn
     *
     * @return mdevTypeIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMdevTypeIdNotIn() {
        return mdevTypeIdNotIn;
    }

    public void setMdevTypeIdNotIn(List<String> mdevTypeIdNotIn) {
        this.mdevTypeIdNotIn = mdevTypeIdNotIn;
    }

    public PciDeviceWhereInput mdevTypeIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN);
        return this;
    }

    public void setMdevTypeIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN);
        }
    }

    public boolean getMdevTypeIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_IN);
    }

    public PciDeviceWhereInput mdevTypeIdNotStartsWith(String mdevTypeIdNotStartsWith) {

        this.mdevTypeIdNotStartsWith = mdevTypeIdNotStartsWith;
        return this;
    }

    /**
     * Get mdevTypeIdNotStartsWith
     *
     * @return mdevTypeIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdNotStartsWith() {
        return mdevTypeIdNotStartsWith;
    }

    public void setMdevTypeIdNotStartsWith(String mdevTypeIdNotStartsWith) {
        this.mdevTypeIdNotStartsWith = mdevTypeIdNotStartsWith;
    }

    public PciDeviceWhereInput mdevTypeIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setMdevTypeIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getMdevTypeIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput mdevTypeIdStartsWith(String mdevTypeIdStartsWith) {

        this.mdevTypeIdStartsWith = mdevTypeIdStartsWith;
        return this;
    }

    /**
     * Get mdevTypeIdStartsWith
     *
     * @return mdevTypeIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMdevTypeIdStartsWith() {
        return mdevTypeIdStartsWith;
    }

    public void setMdevTypeIdStartsWith(String mdevTypeIdStartsWith) {
        this.mdevTypeIdStartsWith = mdevTypeIdStartsWith;
    }

    public PciDeviceWhereInput mdevTypeIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput mdevTypeIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH);
        return this;
    }

    public void setMdevTypeIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH);
        }
    }

    public boolean getMdevTypeIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_TYPE_ID_STARTS_WITH);
    }

    public PciDeviceWhereInput name(String name) {

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

    public PciDeviceWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public PciDeviceWhereInput name_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameContains(String nameContains) {

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

    public PciDeviceWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput nameContains_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameEndsWith(String nameEndsWith) {

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

    public PciDeviceWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameGt(String nameGt) {

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

    public PciDeviceWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public PciDeviceWhereInput nameGt_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameGte(String nameGte) {

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

    public PciDeviceWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public PciDeviceWhereInput nameGte_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public PciDeviceWhereInput addNameInItem(String nameInItem) {
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

    public PciDeviceWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public PciDeviceWhereInput nameIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameLt(String nameLt) {

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

    public PciDeviceWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public PciDeviceWhereInput nameLt_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameLte(String nameLte) {

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

    public PciDeviceWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public PciDeviceWhereInput nameLte_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameNot(String nameNot) {

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

    public PciDeviceWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public PciDeviceWhereInput nameNot_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameNotContains(String nameNotContains) {

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

    public PciDeviceWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput nameNotContains_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public PciDeviceWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public PciDeviceWhereInput addNameNotInItem(String nameNotInItem) {
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

    public PciDeviceWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput nameNotIn_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public PciDeviceWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput nameStartsWith(String nameStartsWith) {

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

    public PciDeviceWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public PciDeviceWhereInput partitioningState(PciDevicePartitionState partitioningState) {

        this.partitioningState = partitioningState;
        return this;
    }

    /**
     * Get partitioningState
     *
     * @return partitioningState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDevicePartitionState getPartitioningState() {
        return partitioningState;
    }

    public void setPartitioningState(PciDevicePartitionState partitioningState) {
        this.partitioningState = partitioningState;
    }

    public PciDeviceWhereInput partitioningState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE);
        return this;
    }

    public PciDeviceWhereInput partitioningState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE);
        return this;
    }

    public void setPartitioningState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE);
        }
    }

    public boolean getPartitioningState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARTITIONING_STATE);
    }

    public PciDeviceWhereInput partitioningStateIn(
            List<PciDevicePartitionState> partitioningStateIn) {

        this.partitioningStateIn = partitioningStateIn;
        return this;
    }

    public PciDeviceWhereInput addPartitioningStateInItem(
            PciDevicePartitionState partitioningStateInItem) {
        if (this.partitioningStateIn == null) {
            this.partitioningStateIn = new ArrayList<PciDevicePartitionState>();
        }
        this.partitioningStateIn.add(partitioningStateInItem);
        return this;
    }

    /**
     * Get partitioningStateIn
     *
     * @return partitioningStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDevicePartitionState> getPartitioningStateIn() {
        return partitioningStateIn;
    }

    public void setPartitioningStateIn(List<PciDevicePartitionState> partitioningStateIn) {
        this.partitioningStateIn = partitioningStateIn;
    }

    public PciDeviceWhereInput partitioningStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE_IN);
        return this;
    }

    public PciDeviceWhereInput partitioningStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE_IN);
        return this;
    }

    public void setPartitioningStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE_IN);
        }
    }

    public boolean getPartitioningStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARTITIONING_STATE_IN);
    }

    public PciDeviceWhereInput partitioningStateNot(PciDevicePartitionState partitioningStateNot) {

        this.partitioningStateNot = partitioningStateNot;
        return this;
    }

    /**
     * Get partitioningStateNot
     *
     * @return partitioningStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDevicePartitionState getPartitioningStateNot() {
        return partitioningStateNot;
    }

    public void setPartitioningStateNot(PciDevicePartitionState partitioningStateNot) {
        this.partitioningStateNot = partitioningStateNot;
    }

    public PciDeviceWhereInput partitioningStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE_NOT);
        return this;
    }

    public PciDeviceWhereInput partitioningStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE_NOT);
        return this;
    }

    public void setPartitioningStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE_NOT);
        }
    }

    public boolean getPartitioningStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARTITIONING_STATE_NOT);
    }

    public PciDeviceWhereInput partitioningStateNotIn(
            List<PciDevicePartitionState> partitioningStateNotIn) {

        this.partitioningStateNotIn = partitioningStateNotIn;
        return this;
    }

    public PciDeviceWhereInput addPartitioningStateNotInItem(
            PciDevicePartitionState partitioningStateNotInItem) {
        if (this.partitioningStateNotIn == null) {
            this.partitioningStateNotIn = new ArrayList<PciDevicePartitionState>();
        }
        this.partitioningStateNotIn.add(partitioningStateNotInItem);
        return this;
    }

    /**
     * Get partitioningStateNotIn
     *
     * @return partitioningStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDevicePartitionState> getPartitioningStateNotIn() {
        return partitioningStateNotIn;
    }

    public void setPartitioningStateNotIn(List<PciDevicePartitionState> partitioningStateNotIn) {
        this.partitioningStateNotIn = partitioningStateNotIn;
    }

    public PciDeviceWhereInput partitioningStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput partitioningStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN);
        return this;
    }

    public void setPartitioningStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN);
        }
    }

    public boolean getPartitioningStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARTITIONING_STATE_NOT_IN);
    }

    public PciDeviceWhereInput productId(String productId) {

        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public PciDeviceWhereInput productId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID);
        return this;
    }

    public PciDeviceWhereInput productId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID);
        return this;
    }

    public void setProductId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID);
        }
    }

    public boolean getProductId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID);
    }

    public PciDeviceWhereInput productIdContains(String productIdContains) {

        this.productIdContains = productIdContains;
        return this;
    }

    /**
     * Get productIdContains
     *
     * @return productIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdContains() {
        return productIdContains;
    }

    public void setProductIdContains(String productIdContains) {
        this.productIdContains = productIdContains;
    }

    public PciDeviceWhereInput productIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput productIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_CONTAINS);
        return this;
    }

    public void setProductIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_CONTAINS);
        }
    }

    public boolean getProductIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_CONTAINS);
    }

    public PciDeviceWhereInput productIdEndsWith(String productIdEndsWith) {

        this.productIdEndsWith = productIdEndsWith;
        return this;
    }

    /**
     * Get productIdEndsWith
     *
     * @return productIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdEndsWith() {
        return productIdEndsWith;
    }

    public void setProductIdEndsWith(String productIdEndsWith) {
        this.productIdEndsWith = productIdEndsWith;
    }

    public PciDeviceWhereInput productIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput productIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH);
        return this;
    }

    public void setProductIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH);
        }
    }

    public boolean getProductIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_ENDS_WITH);
    }

    public PciDeviceWhereInput productIdGt(String productIdGt) {

        this.productIdGt = productIdGt;
        return this;
    }

    /**
     * Get productIdGt
     *
     * @return productIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdGt() {
        return productIdGt;
    }

    public void setProductIdGt(String productIdGt) {
        this.productIdGt = productIdGt;
    }

    public PciDeviceWhereInput productIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_GT);
        return this;
    }

    public PciDeviceWhereInput productIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_GT);
        return this;
    }

    public void setProductIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_GT);
        }
    }

    public boolean getProductIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_GT);
    }

    public PciDeviceWhereInput productIdGte(String productIdGte) {

        this.productIdGte = productIdGte;
        return this;
    }

    /**
     * Get productIdGte
     *
     * @return productIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdGte() {
        return productIdGte;
    }

    public void setProductIdGte(String productIdGte) {
        this.productIdGte = productIdGte;
    }

    public PciDeviceWhereInput productIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput productIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_GTE);
        return this;
    }

    public void setProductIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_GTE);
        }
    }

    public boolean getProductIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_GTE);
    }

    public PciDeviceWhereInput productIdIn(List<String> productIdIn) {

        this.productIdIn = productIdIn;
        return this;
    }

    public PciDeviceWhereInput addProductIdInItem(String productIdInItem) {
        if (this.productIdIn == null) {
            this.productIdIn = new ArrayList<String>();
        }
        this.productIdIn.add(productIdInItem);
        return this;
    }

    /**
     * Get productIdIn
     *
     * @return productIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProductIdIn() {
        return productIdIn;
    }

    public void setProductIdIn(List<String> productIdIn) {
        this.productIdIn = productIdIn;
    }

    public PciDeviceWhereInput productIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_IN);
        return this;
    }

    public PciDeviceWhereInput productIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_IN);
        return this;
    }

    public void setProductIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_IN);
        }
    }

    public boolean getProductIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_IN);
    }

    public PciDeviceWhereInput productIdLt(String productIdLt) {

        this.productIdLt = productIdLt;
        return this;
    }

    /**
     * Get productIdLt
     *
     * @return productIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdLt() {
        return productIdLt;
    }

    public void setProductIdLt(String productIdLt) {
        this.productIdLt = productIdLt;
    }

    public PciDeviceWhereInput productIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_LT);
        return this;
    }

    public PciDeviceWhereInput productIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_LT);
        return this;
    }

    public void setProductIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_LT);
        }
    }

    public boolean getProductIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_LT);
    }

    public PciDeviceWhereInput productIdLte(String productIdLte) {

        this.productIdLte = productIdLte;
        return this;
    }

    /**
     * Get productIdLte
     *
     * @return productIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdLte() {
        return productIdLte;
    }

    public void setProductIdLte(String productIdLte) {
        this.productIdLte = productIdLte;
    }

    public PciDeviceWhereInput productIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput productIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_LTE);
        return this;
    }

    public void setProductIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_LTE);
        }
    }

    public boolean getProductIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_LTE);
    }

    public PciDeviceWhereInput productIdNot(String productIdNot) {

        this.productIdNot = productIdNot;
        return this;
    }

    /**
     * Get productIdNot
     *
     * @return productIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdNot() {
        return productIdNot;
    }

    public void setProductIdNot(String productIdNot) {
        this.productIdNot = productIdNot;
    }

    public PciDeviceWhereInput productIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput productIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT);
        return this;
    }

    public void setProductIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT);
        }
    }

    public boolean getProductIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_NOT);
    }

    public PciDeviceWhereInput productIdNotContains(String productIdNotContains) {

        this.productIdNotContains = productIdNotContains;
        return this;
    }

    /**
     * Get productIdNotContains
     *
     * @return productIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdNotContains() {
        return productIdNotContains;
    }

    public void setProductIdNotContains(String productIdNotContains) {
        this.productIdNotContains = productIdNotContains;
    }

    public PciDeviceWhereInput productIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput productIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS);
        return this;
    }

    public void setProductIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS);
        }
    }

    public boolean getProductIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_NOT_CONTAINS);
    }

    public PciDeviceWhereInput productIdNotEndsWith(String productIdNotEndsWith) {

        this.productIdNotEndsWith = productIdNotEndsWith;
        return this;
    }

    /**
     * Get productIdNotEndsWith
     *
     * @return productIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdNotEndsWith() {
        return productIdNotEndsWith;
    }

    public void setProductIdNotEndsWith(String productIdNotEndsWith) {
        this.productIdNotEndsWith = productIdNotEndsWith;
    }

    public PciDeviceWhereInput productIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput productIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setProductIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getProductIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput productIdNotIn(List<String> productIdNotIn) {

        this.productIdNotIn = productIdNotIn;
        return this;
    }

    public PciDeviceWhereInput addProductIdNotInItem(String productIdNotInItem) {
        if (this.productIdNotIn == null) {
            this.productIdNotIn = new ArrayList<String>();
        }
        this.productIdNotIn.add(productIdNotInItem);
        return this;
    }

    /**
     * Get productIdNotIn
     *
     * @return productIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getProductIdNotIn() {
        return productIdNotIn;
    }

    public void setProductIdNotIn(List<String> productIdNotIn) {
        this.productIdNotIn = productIdNotIn;
    }

    public PciDeviceWhereInput productIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput productIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_IN);
        return this;
    }

    public void setProductIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_IN);
        }
    }

    public boolean getProductIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_NOT_IN);
    }

    public PciDeviceWhereInput productIdNotStartsWith(String productIdNotStartsWith) {

        this.productIdNotStartsWith = productIdNotStartsWith;
        return this;
    }

    /**
     * Get productIdNotStartsWith
     *
     * @return productIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdNotStartsWith() {
        return productIdNotStartsWith;
    }

    public void setProductIdNotStartsWith(String productIdNotStartsWith) {
        this.productIdNotStartsWith = productIdNotStartsWith;
    }

    public PciDeviceWhereInput productIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput productIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setProductIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getProductIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput productIdStartsWith(String productIdStartsWith) {

        this.productIdStartsWith = productIdStartsWith;
        return this;
    }

    /**
     * Get productIdStartsWith
     *
     * @return productIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getProductIdStartsWith() {
        return productIdStartsWith;
    }

    public void setProductIdStartsWith(String productIdStartsWith) {
        this.productIdStartsWith = productIdStartsWith;
    }

    public PciDeviceWhereInput productIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput productIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH);
        return this;
    }

    public void setProductIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH);
        }
    }

    public boolean getProductIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRODUCT_ID_STARTS_WITH);
    }

    public PciDeviceWhereInput slot(String slot) {

        this.slot = slot;
        return this;
    }

    /**
     * Get slot
     *
     * @return slot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public PciDeviceWhereInput slot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT);
        return this;
    }

    public PciDeviceWhereInput slot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT);
        return this;
    }

    public void setSlot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT);
        }
    }

    public boolean getSlot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT);
    }

    public PciDeviceWhereInput slotContains(String slotContains) {

        this.slotContains = slotContains;
        return this;
    }

    /**
     * Get slotContains
     *
     * @return slotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotContains() {
        return slotContains;
    }

    public void setSlotContains(String slotContains) {
        this.slotContains = slotContains;
    }

    public PciDeviceWhereInput slotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput slotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_CONTAINS);
        return this;
    }

    public void setSlotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_CONTAINS);
        }
    }

    public boolean getSlotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_CONTAINS);
    }

    public PciDeviceWhereInput slotEndsWith(String slotEndsWith) {

        this.slotEndsWith = slotEndsWith;
        return this;
    }

    /**
     * Get slotEndsWith
     *
     * @return slotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotEndsWith() {
        return slotEndsWith;
    }

    public void setSlotEndsWith(String slotEndsWith) {
        this.slotEndsWith = slotEndsWith;
    }

    public PciDeviceWhereInput slotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput slotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_ENDS_WITH);
        return this;
    }

    public void setSlotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_ENDS_WITH);
        }
    }

    public boolean getSlotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_ENDS_WITH);
    }

    public PciDeviceWhereInput slotGt(String slotGt) {

        this.slotGt = slotGt;
        return this;
    }

    /**
     * Get slotGt
     *
     * @return slotGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotGt() {
        return slotGt;
    }

    public void setSlotGt(String slotGt) {
        this.slotGt = slotGt;
    }

    public PciDeviceWhereInput slotGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_GT);
        return this;
    }

    public PciDeviceWhereInput slotGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_GT);
        return this;
    }

    public void setSlotGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_GT);
        }
    }

    public boolean getSlotGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_GT);
    }

    public PciDeviceWhereInput slotGte(String slotGte) {

        this.slotGte = slotGte;
        return this;
    }

    /**
     * Get slotGte
     *
     * @return slotGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotGte() {
        return slotGte;
    }

    public void setSlotGte(String slotGte) {
        this.slotGte = slotGte;
    }

    public PciDeviceWhereInput slotGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_GTE);
        return this;
    }

    public PciDeviceWhereInput slotGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_GTE);
        return this;
    }

    public void setSlotGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_GTE);
        }
    }

    public boolean getSlotGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_GTE);
    }

    public PciDeviceWhereInput slotIn(List<String> slotIn) {

        this.slotIn = slotIn;
        return this;
    }

    public PciDeviceWhereInput addSlotInItem(String slotInItem) {
        if (this.slotIn == null) {
            this.slotIn = new ArrayList<String>();
        }
        this.slotIn.add(slotInItem);
        return this;
    }

    /**
     * Get slotIn
     *
     * @return slotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSlotIn() {
        return slotIn;
    }

    public void setSlotIn(List<String> slotIn) {
        this.slotIn = slotIn;
    }

    public PciDeviceWhereInput slotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_IN);
        return this;
    }

    public PciDeviceWhereInput slotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_IN);
        return this;
    }

    public void setSlotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_IN);
        }
    }

    public boolean getSlotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_IN);
    }

    public PciDeviceWhereInput slotLt(String slotLt) {

        this.slotLt = slotLt;
        return this;
    }

    /**
     * Get slotLt
     *
     * @return slotLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotLt() {
        return slotLt;
    }

    public void setSlotLt(String slotLt) {
        this.slotLt = slotLt;
    }

    public PciDeviceWhereInput slotLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_LT);
        return this;
    }

    public PciDeviceWhereInput slotLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_LT);
        return this;
    }

    public void setSlotLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_LT);
        }
    }

    public boolean getSlotLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_LT);
    }

    public PciDeviceWhereInput slotLte(String slotLte) {

        this.slotLte = slotLte;
        return this;
    }

    /**
     * Get slotLte
     *
     * @return slotLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotLte() {
        return slotLte;
    }

    public void setSlotLte(String slotLte) {
        this.slotLte = slotLte;
    }

    public PciDeviceWhereInput slotLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_LTE);
        return this;
    }

    public PciDeviceWhereInput slotLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_LTE);
        return this;
    }

    public void setSlotLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_LTE);
        }
    }

    public boolean getSlotLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_LTE);
    }

    public PciDeviceWhereInput slotNot(String slotNot) {

        this.slotNot = slotNot;
        return this;
    }

    /**
     * Get slotNot
     *
     * @return slotNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotNot() {
        return slotNot;
    }

    public void setSlotNot(String slotNot) {
        this.slotNot = slotNot;
    }

    public PciDeviceWhereInput slotNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT);
        return this;
    }

    public PciDeviceWhereInput slotNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT);
        return this;
    }

    public void setSlotNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT);
        }
    }

    public boolean getSlotNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_NOT);
    }

    public PciDeviceWhereInput slotNotContains(String slotNotContains) {

        this.slotNotContains = slotNotContains;
        return this;
    }

    /**
     * Get slotNotContains
     *
     * @return slotNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotNotContains() {
        return slotNotContains;
    }

    public void setSlotNotContains(String slotNotContains) {
        this.slotNotContains = slotNotContains;
    }

    public PciDeviceWhereInput slotNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput slotNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_CONTAINS);
        return this;
    }

    public void setSlotNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_CONTAINS);
        }
    }

    public boolean getSlotNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_NOT_CONTAINS);
    }

    public PciDeviceWhereInput slotNotEndsWith(String slotNotEndsWith) {

        this.slotNotEndsWith = slotNotEndsWith;
        return this;
    }

    /**
     * Get slotNotEndsWith
     *
     * @return slotNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotNotEndsWith() {
        return slotNotEndsWith;
    }

    public void setSlotNotEndsWith(String slotNotEndsWith) {
        this.slotNotEndsWith = slotNotEndsWith;
    }

    public PciDeviceWhereInput slotNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput slotNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_ENDS_WITH);
        return this;
    }

    public void setSlotNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_ENDS_WITH);
        }
    }

    public boolean getSlotNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput slotNotIn(List<String> slotNotIn) {

        this.slotNotIn = slotNotIn;
        return this;
    }

    public PciDeviceWhereInput addSlotNotInItem(String slotNotInItem) {
        if (this.slotNotIn == null) {
            this.slotNotIn = new ArrayList<String>();
        }
        this.slotNotIn.add(slotNotInItem);
        return this;
    }

    /**
     * Get slotNotIn
     *
     * @return slotNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSlotNotIn() {
        return slotNotIn;
    }

    public void setSlotNotIn(List<String> slotNotIn) {
        this.slotNotIn = slotNotIn;
    }

    public PciDeviceWhereInput slotNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput slotNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_IN);
        return this;
    }

    public void setSlotNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_IN);
        }
    }

    public boolean getSlotNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_NOT_IN);
    }

    public PciDeviceWhereInput slotNotStartsWith(String slotNotStartsWith) {

        this.slotNotStartsWith = slotNotStartsWith;
        return this;
    }

    /**
     * Get slotNotStartsWith
     *
     * @return slotNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotNotStartsWith() {
        return slotNotStartsWith;
    }

    public void setSlotNotStartsWith(String slotNotStartsWith) {
        this.slotNotStartsWith = slotNotStartsWith;
    }

    public PciDeviceWhereInput slotNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput slotNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_STARTS_WITH);
        return this;
    }

    public void setSlotNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_NOT_STARTS_WITH);
        }
    }

    public boolean getSlotNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput slotStartsWith(String slotStartsWith) {

        this.slotStartsWith = slotStartsWith;
        return this;
    }

    /**
     * Get slotStartsWith
     *
     * @return slotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlotStartsWith() {
        return slotStartsWith;
    }

    public void setSlotStartsWith(String slotStartsWith) {
        this.slotStartsWith = slotStartsWith;
    }

    public PciDeviceWhereInput slotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput slotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLOT_STARTS_WITH);
        return this;
    }

    public void setSlotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLOT_STARTS_WITH);
        }
    }

    public boolean getSlotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLOT_STARTS_WITH);
    }

    public PciDeviceWhereInput sriovState(PciDeviceSriovState sriovState) {

        this.sriovState = sriovState;
        return this;
    }

    /**
     * Get sriovState
     *
     * @return sriovState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceSriovState getSriovState() {
        return sriovState;
    }

    public void setSriovState(PciDeviceSriovState sriovState) {
        this.sriovState = sriovState;
    }

    public PciDeviceWhereInput sriovState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE);
        return this;
    }

    public PciDeviceWhereInput sriovState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE);
        return this;
    }

    public void setSriovState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE);
        }
    }

    public boolean getSriovState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRIOV_STATE);
    }

    public PciDeviceWhereInput sriovStateIn(List<PciDeviceSriovState> sriovStateIn) {

        this.sriovStateIn = sriovStateIn;
        return this;
    }

    public PciDeviceWhereInput addSriovStateInItem(PciDeviceSriovState sriovStateInItem) {
        if (this.sriovStateIn == null) {
            this.sriovStateIn = new ArrayList<PciDeviceSriovState>();
        }
        this.sriovStateIn.add(sriovStateInItem);
        return this;
    }

    /**
     * Get sriovStateIn
     *
     * @return sriovStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceSriovState> getSriovStateIn() {
        return sriovStateIn;
    }

    public void setSriovStateIn(List<PciDeviceSriovState> sriovStateIn) {
        this.sriovStateIn = sriovStateIn;
    }

    public PciDeviceWhereInput sriovStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE_IN);
        return this;
    }

    public PciDeviceWhereInput sriovStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE_IN);
        return this;
    }

    public void setSriovStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE_IN);
        }
    }

    public boolean getSriovStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRIOV_STATE_IN);
    }

    public PciDeviceWhereInput sriovStateNot(PciDeviceSriovState sriovStateNot) {

        this.sriovStateNot = sriovStateNot;
        return this;
    }

    /**
     * Get sriovStateNot
     *
     * @return sriovStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceSriovState getSriovStateNot() {
        return sriovStateNot;
    }

    public void setSriovStateNot(PciDeviceSriovState sriovStateNot) {
        this.sriovStateNot = sriovStateNot;
    }

    public PciDeviceWhereInput sriovStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE_NOT);
        return this;
    }

    public PciDeviceWhereInput sriovStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE_NOT);
        return this;
    }

    public void setSriovStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE_NOT);
        }
    }

    public boolean getSriovStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRIOV_STATE_NOT);
    }

    public PciDeviceWhereInput sriovStateNotIn(List<PciDeviceSriovState> sriovStateNotIn) {

        this.sriovStateNotIn = sriovStateNotIn;
        return this;
    }

    public PciDeviceWhereInput addSriovStateNotInItem(PciDeviceSriovState sriovStateNotInItem) {
        if (this.sriovStateNotIn == null) {
            this.sriovStateNotIn = new ArrayList<PciDeviceSriovState>();
        }
        this.sriovStateNotIn.add(sriovStateNotInItem);
        return this;
    }

    /**
     * Get sriovStateNotIn
     *
     * @return sriovStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceSriovState> getSriovStateNotIn() {
        return sriovStateNotIn;
    }

    public void setSriovStateNotIn(List<PciDeviceSriovState> sriovStateNotIn) {
        this.sriovStateNotIn = sriovStateNotIn;
    }

    public PciDeviceWhereInput sriovStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput sriovStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE_NOT_IN);
        return this;
    }

    public void setSriovStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRIOV_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRIOV_STATE_NOT_IN);
        }
    }

    public boolean getSriovStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRIOV_STATE_NOT_IN);
    }

    public PciDeviceWhereInput subsystemProductId(String subsystemProductId) {

        this.subsystemProductId = subsystemProductId;
        return this;
    }

    /**
     * Get subsystemProductId
     *
     * @return subsystemProductId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductId() {
        return subsystemProductId;
    }

    public void setSubsystemProductId(String subsystemProductId) {
        this.subsystemProductId = subsystemProductId;
    }

    public PciDeviceWhereInput subsystemProductId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID);
        return this;
    }

    public PciDeviceWhereInput subsystemProductId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID);
        return this;
    }

    public void setSubsystemProductId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID);
        }
    }

    public boolean getSubsystemProductId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID);
    }

    public PciDeviceWhereInput subsystemProductIdContains(String subsystemProductIdContains) {

        this.subsystemProductIdContains = subsystemProductIdContains;
        return this;
    }

    /**
     * Get subsystemProductIdContains
     *
     * @return subsystemProductIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdContains() {
        return subsystemProductIdContains;
    }

    public void setSubsystemProductIdContains(String subsystemProductIdContains) {
        this.subsystemProductIdContains = subsystemProductIdContains;
    }

    public PciDeviceWhereInput subsystemProductIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS);
        return this;
    }

    public void setSubsystemProductIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS);
        }
    }

    public boolean getSubsystemProductIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_CONTAINS);
    }

    public PciDeviceWhereInput subsystemProductIdEndsWith(String subsystemProductIdEndsWith) {

        this.subsystemProductIdEndsWith = subsystemProductIdEndsWith;
        return this;
    }

    /**
     * Get subsystemProductIdEndsWith
     *
     * @return subsystemProductIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdEndsWith() {
        return subsystemProductIdEndsWith;
    }

    public void setSubsystemProductIdEndsWith(String subsystemProductIdEndsWith) {
        this.subsystemProductIdEndsWith = subsystemProductIdEndsWith;
    }

    public PciDeviceWhereInput subsystemProductIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH);
        return this;
    }

    public void setSubsystemProductIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH);
        }
    }

    public boolean getSubsystemProductIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_ENDS_WITH);
    }

    public PciDeviceWhereInput subsystemProductIdGt(String subsystemProductIdGt) {

        this.subsystemProductIdGt = subsystemProductIdGt;
        return this;
    }

    /**
     * Get subsystemProductIdGt
     *
     * @return subsystemProductIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdGt() {
        return subsystemProductIdGt;
    }

    public void setSubsystemProductIdGt(String subsystemProductIdGt) {
        this.subsystemProductIdGt = subsystemProductIdGt;
    }

    public PciDeviceWhereInput subsystemProductIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT);
        return this;
    }

    public void setSubsystemProductIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT);
        }
    }

    public boolean getSubsystemProductIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GT);
    }

    public PciDeviceWhereInput subsystemProductIdGte(String subsystemProductIdGte) {

        this.subsystemProductIdGte = subsystemProductIdGte;
        return this;
    }

    /**
     * Get subsystemProductIdGte
     *
     * @return subsystemProductIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdGte() {
        return subsystemProductIdGte;
    }

    public void setSubsystemProductIdGte(String subsystemProductIdGte) {
        this.subsystemProductIdGte = subsystemProductIdGte;
    }

    public PciDeviceWhereInput subsystemProductIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE);
        return this;
    }

    public void setSubsystemProductIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE);
        }
    }

    public boolean getSubsystemProductIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_GTE);
    }

    public PciDeviceWhereInput subsystemProductIdIn(List<String> subsystemProductIdIn) {

        this.subsystemProductIdIn = subsystemProductIdIn;
        return this;
    }

    public PciDeviceWhereInput addSubsystemProductIdInItem(String subsystemProductIdInItem) {
        if (this.subsystemProductIdIn == null) {
            this.subsystemProductIdIn = new ArrayList<String>();
        }
        this.subsystemProductIdIn.add(subsystemProductIdInItem);
        return this;
    }

    /**
     * Get subsystemProductIdIn
     *
     * @return subsystemProductIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubsystemProductIdIn() {
        return subsystemProductIdIn;
    }

    public void setSubsystemProductIdIn(List<String> subsystemProductIdIn) {
        this.subsystemProductIdIn = subsystemProductIdIn;
    }

    public PciDeviceWhereInput subsystemProductIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN);
        return this;
    }

    public void setSubsystemProductIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN);
        }
    }

    public boolean getSubsystemProductIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_IN);
    }

    public PciDeviceWhereInput subsystemProductIdLt(String subsystemProductIdLt) {

        this.subsystemProductIdLt = subsystemProductIdLt;
        return this;
    }

    /**
     * Get subsystemProductIdLt
     *
     * @return subsystemProductIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdLt() {
        return subsystemProductIdLt;
    }

    public void setSubsystemProductIdLt(String subsystemProductIdLt) {
        this.subsystemProductIdLt = subsystemProductIdLt;
    }

    public PciDeviceWhereInput subsystemProductIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT);
        return this;
    }

    public void setSubsystemProductIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT);
        }
    }

    public boolean getSubsystemProductIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LT);
    }

    public PciDeviceWhereInput subsystemProductIdLte(String subsystemProductIdLte) {

        this.subsystemProductIdLte = subsystemProductIdLte;
        return this;
    }

    /**
     * Get subsystemProductIdLte
     *
     * @return subsystemProductIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdLte() {
        return subsystemProductIdLte;
    }

    public void setSubsystemProductIdLte(String subsystemProductIdLte) {
        this.subsystemProductIdLte = subsystemProductIdLte;
    }

    public PciDeviceWhereInput subsystemProductIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE);
        return this;
    }

    public void setSubsystemProductIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE);
        }
    }

    public boolean getSubsystemProductIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_LTE);
    }

    public PciDeviceWhereInput subsystemProductIdNot(String subsystemProductIdNot) {

        this.subsystemProductIdNot = subsystemProductIdNot;
        return this;
    }

    /**
     * Get subsystemProductIdNot
     *
     * @return subsystemProductIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdNot() {
        return subsystemProductIdNot;
    }

    public void setSubsystemProductIdNot(String subsystemProductIdNot) {
        this.subsystemProductIdNot = subsystemProductIdNot;
    }

    public PciDeviceWhereInput subsystemProductIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT);
        return this;
    }

    public void setSubsystemProductIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT);
        }
    }

    public boolean getSubsystemProductIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT);
    }

    public PciDeviceWhereInput subsystemProductIdNotContains(String subsystemProductIdNotContains) {

        this.subsystemProductIdNotContains = subsystemProductIdNotContains;
        return this;
    }

    /**
     * Get subsystemProductIdNotContains
     *
     * @return subsystemProductIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdNotContains() {
        return subsystemProductIdNotContains;
    }

    public void setSubsystemProductIdNotContains(String subsystemProductIdNotContains) {
        this.subsystemProductIdNotContains = subsystemProductIdNotContains;
    }

    public PciDeviceWhereInput subsystemProductIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS);
        return this;
    }

    public void setSubsystemProductIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS);
        }
    }

    public boolean getSubsystemProductIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_CONTAINS);
    }

    public PciDeviceWhereInput subsystemProductIdNotEndsWith(String subsystemProductIdNotEndsWith) {

        this.subsystemProductIdNotEndsWith = subsystemProductIdNotEndsWith;
        return this;
    }

    /**
     * Get subsystemProductIdNotEndsWith
     *
     * @return subsystemProductIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdNotEndsWith() {
        return subsystemProductIdNotEndsWith;
    }

    public void setSubsystemProductIdNotEndsWith(String subsystemProductIdNotEndsWith) {
        this.subsystemProductIdNotEndsWith = subsystemProductIdNotEndsWith;
    }

    public PciDeviceWhereInput subsystemProductIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setSubsystemProductIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getSubsystemProductIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput subsystemProductIdNotIn(List<String> subsystemProductIdNotIn) {

        this.subsystemProductIdNotIn = subsystemProductIdNotIn;
        return this;
    }

    public PciDeviceWhereInput addSubsystemProductIdNotInItem(String subsystemProductIdNotInItem) {
        if (this.subsystemProductIdNotIn == null) {
            this.subsystemProductIdNotIn = new ArrayList<String>();
        }
        this.subsystemProductIdNotIn.add(subsystemProductIdNotInItem);
        return this;
    }

    /**
     * Get subsystemProductIdNotIn
     *
     * @return subsystemProductIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubsystemProductIdNotIn() {
        return subsystemProductIdNotIn;
    }

    public void setSubsystemProductIdNotIn(List<String> subsystemProductIdNotIn) {
        this.subsystemProductIdNotIn = subsystemProductIdNotIn;
    }

    public PciDeviceWhereInput subsystemProductIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN);
        return this;
    }

    public void setSubsystemProductIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN);
        }
    }

    public boolean getSubsystemProductIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_IN);
    }

    public PciDeviceWhereInput subsystemProductIdNotStartsWith(
            String subsystemProductIdNotStartsWith) {

        this.subsystemProductIdNotStartsWith = subsystemProductIdNotStartsWith;
        return this;
    }

    /**
     * Get subsystemProductIdNotStartsWith
     *
     * @return subsystemProductIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdNotStartsWith() {
        return subsystemProductIdNotStartsWith;
    }

    public void setSubsystemProductIdNotStartsWith(String subsystemProductIdNotStartsWith) {
        this.subsystemProductIdNotStartsWith = subsystemProductIdNotStartsWith;
    }

    public PciDeviceWhereInput subsystemProductIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setSubsystemProductIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getSubsystemProductIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput subsystemProductIdStartsWith(String subsystemProductIdStartsWith) {

        this.subsystemProductIdStartsWith = subsystemProductIdStartsWith;
        return this;
    }

    /**
     * Get subsystemProductIdStartsWith
     *
     * @return subsystemProductIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemProductIdStartsWith() {
        return subsystemProductIdStartsWith;
    }

    public void setSubsystemProductIdStartsWith(String subsystemProductIdStartsWith) {
        this.subsystemProductIdStartsWith = subsystemProductIdStartsWith;
    }

    public PciDeviceWhereInput subsystemProductIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemProductIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH);
        return this;
    }

    public void setSubsystemProductIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH);
        }
    }

    public boolean getSubsystemProductIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID_STARTS_WITH);
    }

    public PciDeviceWhereInput subsystemVendorId(String subsystemVendorId) {

        this.subsystemVendorId = subsystemVendorId;
        return this;
    }

    /**
     * Get subsystemVendorId
     *
     * @return subsystemVendorId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorId() {
        return subsystemVendorId;
    }

    public void setSubsystemVendorId(String subsystemVendorId) {
        this.subsystemVendorId = subsystemVendorId;
    }

    public PciDeviceWhereInput subsystemVendorId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID);
        return this;
    }

    public void setSubsystemVendorId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID);
        }
    }

    public boolean getSubsystemVendorId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID);
    }

    public PciDeviceWhereInput subsystemVendorIdContains(String subsystemVendorIdContains) {

        this.subsystemVendorIdContains = subsystemVendorIdContains;
        return this;
    }

    /**
     * Get subsystemVendorIdContains
     *
     * @return subsystemVendorIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdContains() {
        return subsystemVendorIdContains;
    }

    public void setSubsystemVendorIdContains(String subsystemVendorIdContains) {
        this.subsystemVendorIdContains = subsystemVendorIdContains;
    }

    public PciDeviceWhereInput subsystemVendorIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS);
        return this;
    }

    public void setSubsystemVendorIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS);
        }
    }

    public boolean getSubsystemVendorIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_CONTAINS);
    }

    public PciDeviceWhereInput subsystemVendorIdEndsWith(String subsystemVendorIdEndsWith) {

        this.subsystemVendorIdEndsWith = subsystemVendorIdEndsWith;
        return this;
    }

    /**
     * Get subsystemVendorIdEndsWith
     *
     * @return subsystemVendorIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdEndsWith() {
        return subsystemVendorIdEndsWith;
    }

    public void setSubsystemVendorIdEndsWith(String subsystemVendorIdEndsWith) {
        this.subsystemVendorIdEndsWith = subsystemVendorIdEndsWith;
    }

    public PciDeviceWhereInput subsystemVendorIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH);
        return this;
    }

    public void setSubsystemVendorIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH);
        }
    }

    public boolean getSubsystemVendorIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_ENDS_WITH);
    }

    public PciDeviceWhereInput subsystemVendorIdGt(String subsystemVendorIdGt) {

        this.subsystemVendorIdGt = subsystemVendorIdGt;
        return this;
    }

    /**
     * Get subsystemVendorIdGt
     *
     * @return subsystemVendorIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdGt() {
        return subsystemVendorIdGt;
    }

    public void setSubsystemVendorIdGt(String subsystemVendorIdGt) {
        this.subsystemVendorIdGt = subsystemVendorIdGt;
    }

    public PciDeviceWhereInput subsystemVendorIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT);
        return this;
    }

    public void setSubsystemVendorIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT);
        }
    }

    public boolean getSubsystemVendorIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GT);
    }

    public PciDeviceWhereInput subsystemVendorIdGte(String subsystemVendorIdGte) {

        this.subsystemVendorIdGte = subsystemVendorIdGte;
        return this;
    }

    /**
     * Get subsystemVendorIdGte
     *
     * @return subsystemVendorIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdGte() {
        return subsystemVendorIdGte;
    }

    public void setSubsystemVendorIdGte(String subsystemVendorIdGte) {
        this.subsystemVendorIdGte = subsystemVendorIdGte;
    }

    public PciDeviceWhereInput subsystemVendorIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE);
        return this;
    }

    public void setSubsystemVendorIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE);
        }
    }

    public boolean getSubsystemVendorIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_GTE);
    }

    public PciDeviceWhereInput subsystemVendorIdIn(List<String> subsystemVendorIdIn) {

        this.subsystemVendorIdIn = subsystemVendorIdIn;
        return this;
    }

    public PciDeviceWhereInput addSubsystemVendorIdInItem(String subsystemVendorIdInItem) {
        if (this.subsystemVendorIdIn == null) {
            this.subsystemVendorIdIn = new ArrayList<String>();
        }
        this.subsystemVendorIdIn.add(subsystemVendorIdInItem);
        return this;
    }

    /**
     * Get subsystemVendorIdIn
     *
     * @return subsystemVendorIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubsystemVendorIdIn() {
        return subsystemVendorIdIn;
    }

    public void setSubsystemVendorIdIn(List<String> subsystemVendorIdIn) {
        this.subsystemVendorIdIn = subsystemVendorIdIn;
    }

    public PciDeviceWhereInput subsystemVendorIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN);
        return this;
    }

    public void setSubsystemVendorIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN);
        }
    }

    public boolean getSubsystemVendorIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_IN);
    }

    public PciDeviceWhereInput subsystemVendorIdLt(String subsystemVendorIdLt) {

        this.subsystemVendorIdLt = subsystemVendorIdLt;
        return this;
    }

    /**
     * Get subsystemVendorIdLt
     *
     * @return subsystemVendorIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdLt() {
        return subsystemVendorIdLt;
    }

    public void setSubsystemVendorIdLt(String subsystemVendorIdLt) {
        this.subsystemVendorIdLt = subsystemVendorIdLt;
    }

    public PciDeviceWhereInput subsystemVendorIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT);
        return this;
    }

    public void setSubsystemVendorIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT);
        }
    }

    public boolean getSubsystemVendorIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LT);
    }

    public PciDeviceWhereInput subsystemVendorIdLte(String subsystemVendorIdLte) {

        this.subsystemVendorIdLte = subsystemVendorIdLte;
        return this;
    }

    /**
     * Get subsystemVendorIdLte
     *
     * @return subsystemVendorIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdLte() {
        return subsystemVendorIdLte;
    }

    public void setSubsystemVendorIdLte(String subsystemVendorIdLte) {
        this.subsystemVendorIdLte = subsystemVendorIdLte;
    }

    public PciDeviceWhereInput subsystemVendorIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE);
        return this;
    }

    public void setSubsystemVendorIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE);
        }
    }

    public boolean getSubsystemVendorIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_LTE);
    }

    public PciDeviceWhereInput subsystemVendorIdNot(String subsystemVendorIdNot) {

        this.subsystemVendorIdNot = subsystemVendorIdNot;
        return this;
    }

    /**
     * Get subsystemVendorIdNot
     *
     * @return subsystemVendorIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdNot() {
        return subsystemVendorIdNot;
    }

    public void setSubsystemVendorIdNot(String subsystemVendorIdNot) {
        this.subsystemVendorIdNot = subsystemVendorIdNot;
    }

    public PciDeviceWhereInput subsystemVendorIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT);
        return this;
    }

    public void setSubsystemVendorIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT);
        }
    }

    public boolean getSubsystemVendorIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT);
    }

    public PciDeviceWhereInput subsystemVendorIdNotContains(String subsystemVendorIdNotContains) {

        this.subsystemVendorIdNotContains = subsystemVendorIdNotContains;
        return this;
    }

    /**
     * Get subsystemVendorIdNotContains
     *
     * @return subsystemVendorIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdNotContains() {
        return subsystemVendorIdNotContains;
    }

    public void setSubsystemVendorIdNotContains(String subsystemVendorIdNotContains) {
        this.subsystemVendorIdNotContains = subsystemVendorIdNotContains;
    }

    public PciDeviceWhereInput subsystemVendorIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS);
        return this;
    }

    public void setSubsystemVendorIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS);
        }
    }

    public boolean getSubsystemVendorIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_CONTAINS);
    }

    public PciDeviceWhereInput subsystemVendorIdNotEndsWith(String subsystemVendorIdNotEndsWith) {

        this.subsystemVendorIdNotEndsWith = subsystemVendorIdNotEndsWith;
        return this;
    }

    /**
     * Get subsystemVendorIdNotEndsWith
     *
     * @return subsystemVendorIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdNotEndsWith() {
        return subsystemVendorIdNotEndsWith;
    }

    public void setSubsystemVendorIdNotEndsWith(String subsystemVendorIdNotEndsWith) {
        this.subsystemVendorIdNotEndsWith = subsystemVendorIdNotEndsWith;
    }

    public PciDeviceWhereInput subsystemVendorIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setSubsystemVendorIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getSubsystemVendorIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput subsystemVendorIdNotIn(List<String> subsystemVendorIdNotIn) {

        this.subsystemVendorIdNotIn = subsystemVendorIdNotIn;
        return this;
    }

    public PciDeviceWhereInput addSubsystemVendorIdNotInItem(String subsystemVendorIdNotInItem) {
        if (this.subsystemVendorIdNotIn == null) {
            this.subsystemVendorIdNotIn = new ArrayList<String>();
        }
        this.subsystemVendorIdNotIn.add(subsystemVendorIdNotInItem);
        return this;
    }

    /**
     * Get subsystemVendorIdNotIn
     *
     * @return subsystemVendorIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubsystemVendorIdNotIn() {
        return subsystemVendorIdNotIn;
    }

    public void setSubsystemVendorIdNotIn(List<String> subsystemVendorIdNotIn) {
        this.subsystemVendorIdNotIn = subsystemVendorIdNotIn;
    }

    public PciDeviceWhereInput subsystemVendorIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN);
        return this;
    }

    public void setSubsystemVendorIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN);
        }
    }

    public boolean getSubsystemVendorIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_IN);
    }

    public PciDeviceWhereInput subsystemVendorIdNotStartsWith(
            String subsystemVendorIdNotStartsWith) {

        this.subsystemVendorIdNotStartsWith = subsystemVendorIdNotStartsWith;
        return this;
    }

    /**
     * Get subsystemVendorIdNotStartsWith
     *
     * @return subsystemVendorIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdNotStartsWith() {
        return subsystemVendorIdNotStartsWith;
    }

    public void setSubsystemVendorIdNotStartsWith(String subsystemVendorIdNotStartsWith) {
        this.subsystemVendorIdNotStartsWith = subsystemVendorIdNotStartsWith;
    }

    public PciDeviceWhereInput subsystemVendorIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setSubsystemVendorIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getSubsystemVendorIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput subsystemVendorIdStartsWith(String subsystemVendorIdStartsWith) {

        this.subsystemVendorIdStartsWith = subsystemVendorIdStartsWith;
        return this;
    }

    /**
     * Get subsystemVendorIdStartsWith
     *
     * @return subsystemVendorIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubsystemVendorIdStartsWith() {
        return subsystemVendorIdStartsWith;
    }

    public void setSubsystemVendorIdStartsWith(String subsystemVendorIdStartsWith) {
        this.subsystemVendorIdStartsWith = subsystemVendorIdStartsWith;
    }

    public PciDeviceWhereInput subsystemVendorIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput subsystemVendorIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH);
        return this;
    }

    public void setSubsystemVendorIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH);
        }
    }

    public boolean getSubsystemVendorIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID_STARTS_WITH);
    }

    public PciDeviceWhereInput totalMdevNum(Integer totalMdevNum) {

        this.totalMdevNum = totalMdevNum;
        return this;
    }

    /**
     * Get totalMdevNum
     *
     * @return totalMdevNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalMdevNum() {
        return totalMdevNum;
    }

    public void setTotalMdevNum(Integer totalMdevNum) {
        this.totalMdevNum = totalMdevNum;
    }

    public PciDeviceWhereInput totalMdevNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM);
        return this;
    }

    public PciDeviceWhereInput totalMdevNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM);
        return this;
    }

    public void setTotalMdevNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM);
        }
    }

    public boolean getTotalMdevNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM);
    }

    public PciDeviceWhereInput totalMdevNumGt(Integer totalMdevNumGt) {

        this.totalMdevNumGt = totalMdevNumGt;
        return this;
    }

    /**
     * Get totalMdevNumGt
     *
     * @return totalMdevNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalMdevNumGt() {
        return totalMdevNumGt;
    }

    public void setTotalMdevNumGt(Integer totalMdevNumGt) {
        this.totalMdevNumGt = totalMdevNumGt;
    }

    public PciDeviceWhereInput totalMdevNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_GT);
        return this;
    }

    public void setTotalMdevNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_GT);
        }
    }

    public boolean getTotalMdevNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_GT);
    }

    public PciDeviceWhereInput totalMdevNumGte(Integer totalMdevNumGte) {

        this.totalMdevNumGte = totalMdevNumGte;
        return this;
    }

    /**
     * Get totalMdevNumGte
     *
     * @return totalMdevNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalMdevNumGte() {
        return totalMdevNumGte;
    }

    public void setTotalMdevNumGte(Integer totalMdevNumGte) {
        this.totalMdevNumGte = totalMdevNumGte;
    }

    public PciDeviceWhereInput totalMdevNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE);
        return this;
    }

    public void setTotalMdevNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE);
        }
    }

    public boolean getTotalMdevNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_GTE);
    }

    public PciDeviceWhereInput totalMdevNumIn(List<Integer> totalMdevNumIn) {

        this.totalMdevNumIn = totalMdevNumIn;
        return this;
    }

    public PciDeviceWhereInput addTotalMdevNumInItem(Integer totalMdevNumInItem) {
        if (this.totalMdevNumIn == null) {
            this.totalMdevNumIn = new ArrayList<Integer>();
        }
        this.totalMdevNumIn.add(totalMdevNumInItem);
        return this;
    }

    /**
     * Get totalMdevNumIn
     *
     * @return totalMdevNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalMdevNumIn() {
        return totalMdevNumIn;
    }

    public void setTotalMdevNumIn(List<Integer> totalMdevNumIn) {
        this.totalMdevNumIn = totalMdevNumIn;
    }

    public PciDeviceWhereInput totalMdevNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_IN);
        return this;
    }

    public void setTotalMdevNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_IN);
        }
    }

    public boolean getTotalMdevNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_IN);
    }

    public PciDeviceWhereInput totalMdevNumLt(Integer totalMdevNumLt) {

        this.totalMdevNumLt = totalMdevNumLt;
        return this;
    }

    /**
     * Get totalMdevNumLt
     *
     * @return totalMdevNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalMdevNumLt() {
        return totalMdevNumLt;
    }

    public void setTotalMdevNumLt(Integer totalMdevNumLt) {
        this.totalMdevNumLt = totalMdevNumLt;
    }

    public PciDeviceWhereInput totalMdevNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_LT);
        return this;
    }

    public void setTotalMdevNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_LT);
        }
    }

    public boolean getTotalMdevNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_LT);
    }

    public PciDeviceWhereInput totalMdevNumLte(Integer totalMdevNumLte) {

        this.totalMdevNumLte = totalMdevNumLte;
        return this;
    }

    /**
     * Get totalMdevNumLte
     *
     * @return totalMdevNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalMdevNumLte() {
        return totalMdevNumLte;
    }

    public void setTotalMdevNumLte(Integer totalMdevNumLte) {
        this.totalMdevNumLte = totalMdevNumLte;
    }

    public PciDeviceWhereInput totalMdevNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE);
        return this;
    }

    public void setTotalMdevNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE);
        }
    }

    public boolean getTotalMdevNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_LTE);
    }

    public PciDeviceWhereInput totalMdevNumNot(Integer totalMdevNumNot) {

        this.totalMdevNumNot = totalMdevNumNot;
        return this;
    }

    /**
     * Get totalMdevNumNot
     *
     * @return totalMdevNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalMdevNumNot() {
        return totalMdevNumNot;
    }

    public void setTotalMdevNumNot(Integer totalMdevNumNot) {
        this.totalMdevNumNot = totalMdevNumNot;
    }

    public PciDeviceWhereInput totalMdevNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT);
        return this;
    }

    public void setTotalMdevNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT);
        }
    }

    public boolean getTotalMdevNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT);
    }

    public PciDeviceWhereInput totalMdevNumNotIn(List<Integer> totalMdevNumNotIn) {

        this.totalMdevNumNotIn = totalMdevNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addTotalMdevNumNotInItem(Integer totalMdevNumNotInItem) {
        if (this.totalMdevNumNotIn == null) {
            this.totalMdevNumNotIn = new ArrayList<Integer>();
        }
        this.totalMdevNumNotIn.add(totalMdevNumNotInItem);
        return this;
    }

    /**
     * Get totalMdevNumNotIn
     *
     * @return totalMdevNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalMdevNumNotIn() {
        return totalMdevNumNotIn;
    }

    public void setTotalMdevNumNotIn(List<Integer> totalMdevNumNotIn) {
        this.totalMdevNumNotIn = totalMdevNumNotIn;
    }

    public PciDeviceWhereInput totalMdevNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput totalMdevNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN);
        return this;
    }

    public void setTotalMdevNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN);
        }
    }

    public boolean getTotalMdevNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MDEV_NUM_NOT_IN);
    }

    public PciDeviceWhereInput totalPartitioningNum(Integer totalPartitioningNum) {

        this.totalPartitioningNum = totalPartitioningNum;
        return this;
    }

    /**
     * Get totalPartitioningNum
     *
     * @return totalPartitioningNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalPartitioningNum() {
        return totalPartitioningNum;
    }

    public void setTotalPartitioningNum(Integer totalPartitioningNum) {
        this.totalPartitioningNum = totalPartitioningNum;
    }

    public PciDeviceWhereInput totalPartitioningNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM);
        return this;
    }

    public void setTotalPartitioningNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM);
        }
    }

    public boolean getTotalPartitioningNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM);
    }

    public PciDeviceWhereInput totalPartitioningNumGt(Integer totalPartitioningNumGt) {

        this.totalPartitioningNumGt = totalPartitioningNumGt;
        return this;
    }

    /**
     * Get totalPartitioningNumGt
     *
     * @return totalPartitioningNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalPartitioningNumGt() {
        return totalPartitioningNumGt;
    }

    public void setTotalPartitioningNumGt(Integer totalPartitioningNumGt) {
        this.totalPartitioningNumGt = totalPartitioningNumGt;
    }

    public PciDeviceWhereInput totalPartitioningNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT);
        return this;
    }

    public void setTotalPartitioningNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT);
        }
    }

    public boolean getTotalPartitioningNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GT);
    }

    public PciDeviceWhereInput totalPartitioningNumGte(Integer totalPartitioningNumGte) {

        this.totalPartitioningNumGte = totalPartitioningNumGte;
        return this;
    }

    /**
     * Get totalPartitioningNumGte
     *
     * @return totalPartitioningNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalPartitioningNumGte() {
        return totalPartitioningNumGte;
    }

    public void setTotalPartitioningNumGte(Integer totalPartitioningNumGte) {
        this.totalPartitioningNumGte = totalPartitioningNumGte;
    }

    public PciDeviceWhereInput totalPartitioningNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE);
        return this;
    }

    public void setTotalPartitioningNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE);
        }
    }

    public boolean getTotalPartitioningNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_GTE);
    }

    public PciDeviceWhereInput totalPartitioningNumIn(List<Integer> totalPartitioningNumIn) {

        this.totalPartitioningNumIn = totalPartitioningNumIn;
        return this;
    }

    public PciDeviceWhereInput addTotalPartitioningNumInItem(Integer totalPartitioningNumInItem) {
        if (this.totalPartitioningNumIn == null) {
            this.totalPartitioningNumIn = new ArrayList<Integer>();
        }
        this.totalPartitioningNumIn.add(totalPartitioningNumInItem);
        return this;
    }

    /**
     * Get totalPartitioningNumIn
     *
     * @return totalPartitioningNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalPartitioningNumIn() {
        return totalPartitioningNumIn;
    }

    public void setTotalPartitioningNumIn(List<Integer> totalPartitioningNumIn) {
        this.totalPartitioningNumIn = totalPartitioningNumIn;
    }

    public PciDeviceWhereInput totalPartitioningNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN);
        return this;
    }

    public void setTotalPartitioningNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN);
        }
    }

    public boolean getTotalPartitioningNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_IN);
    }

    public PciDeviceWhereInput totalPartitioningNumLt(Integer totalPartitioningNumLt) {

        this.totalPartitioningNumLt = totalPartitioningNumLt;
        return this;
    }

    /**
     * Get totalPartitioningNumLt
     *
     * @return totalPartitioningNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalPartitioningNumLt() {
        return totalPartitioningNumLt;
    }

    public void setTotalPartitioningNumLt(Integer totalPartitioningNumLt) {
        this.totalPartitioningNumLt = totalPartitioningNumLt;
    }

    public PciDeviceWhereInput totalPartitioningNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT);
        return this;
    }

    public void setTotalPartitioningNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT);
        }
    }

    public boolean getTotalPartitioningNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LT);
    }

    public PciDeviceWhereInput totalPartitioningNumLte(Integer totalPartitioningNumLte) {

        this.totalPartitioningNumLte = totalPartitioningNumLte;
        return this;
    }

    /**
     * Get totalPartitioningNumLte
     *
     * @return totalPartitioningNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalPartitioningNumLte() {
        return totalPartitioningNumLte;
    }

    public void setTotalPartitioningNumLte(Integer totalPartitioningNumLte) {
        this.totalPartitioningNumLte = totalPartitioningNumLte;
    }

    public PciDeviceWhereInput totalPartitioningNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE);
        return this;
    }

    public void setTotalPartitioningNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE);
        }
    }

    public boolean getTotalPartitioningNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_LTE);
    }

    public PciDeviceWhereInput totalPartitioningNumNot(Integer totalPartitioningNumNot) {

        this.totalPartitioningNumNot = totalPartitioningNumNot;
        return this;
    }

    /**
     * Get totalPartitioningNumNot
     *
     * @return totalPartitioningNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalPartitioningNumNot() {
        return totalPartitioningNumNot;
    }

    public void setTotalPartitioningNumNot(Integer totalPartitioningNumNot) {
        this.totalPartitioningNumNot = totalPartitioningNumNot;
    }

    public PciDeviceWhereInput totalPartitioningNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT);
        return this;
    }

    public void setTotalPartitioningNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT);
        }
    }

    public boolean getTotalPartitioningNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT);
    }

    public PciDeviceWhereInput totalPartitioningNumNotIn(List<Integer> totalPartitioningNumNotIn) {

        this.totalPartitioningNumNotIn = totalPartitioningNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addTotalPartitioningNumNotInItem(
            Integer totalPartitioningNumNotInItem) {
        if (this.totalPartitioningNumNotIn == null) {
            this.totalPartitioningNumNotIn = new ArrayList<Integer>();
        }
        this.totalPartitioningNumNotIn.add(totalPartitioningNumNotInItem);
        return this;
    }

    /**
     * Get totalPartitioningNumNotIn
     *
     * @return totalPartitioningNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalPartitioningNumNotIn() {
        return totalPartitioningNumNotIn;
    }

    public void setTotalPartitioningNumNotIn(List<Integer> totalPartitioningNumNotIn) {
        this.totalPartitioningNumNotIn = totalPartitioningNumNotIn;
    }

    public PciDeviceWhereInput totalPartitioningNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput totalPartitioningNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN);
        return this;
    }

    public void setTotalPartitioningNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN);
        }
    }

    public boolean getTotalPartitioningNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM_NOT_IN);
    }

    public PciDeviceWhereInput totalVfNum(Integer totalVfNum) {

        this.totalVfNum = totalVfNum;
        return this;
    }

    /**
     * Get totalVfNum
     *
     * @return totalVfNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNum() {
        return totalVfNum;
    }

    public void setTotalVfNum(Integer totalVfNum) {
        this.totalVfNum = totalVfNum;
    }

    public PciDeviceWhereInput totalVfNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM);
        return this;
    }

    public PciDeviceWhereInput totalVfNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM);
        return this;
    }

    public void setTotalVfNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM);
        }
    }

    public boolean getTotalVfNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM);
    }

    public PciDeviceWhereInput totalVfNumGt(Integer totalVfNumGt) {

        this.totalVfNumGt = totalVfNumGt;
        return this;
    }

    /**
     * Get totalVfNumGt
     *
     * @return totalVfNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNumGt() {
        return totalVfNumGt;
    }

    public void setTotalVfNumGt(Integer totalVfNumGt) {
        this.totalVfNumGt = totalVfNumGt;
    }

    public PciDeviceWhereInput totalVfNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput totalVfNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_GT);
        return this;
    }

    public void setTotalVfNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_GT);
        }
    }

    public boolean getTotalVfNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_GT);
    }

    public PciDeviceWhereInput totalVfNumGte(Integer totalVfNumGte) {

        this.totalVfNumGte = totalVfNumGte;
        return this;
    }

    /**
     * Get totalVfNumGte
     *
     * @return totalVfNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNumGte() {
        return totalVfNumGte;
    }

    public void setTotalVfNumGte(Integer totalVfNumGte) {
        this.totalVfNumGte = totalVfNumGte;
    }

    public PciDeviceWhereInput totalVfNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput totalVfNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_GTE);
        return this;
    }

    public void setTotalVfNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_GTE);
        }
    }

    public boolean getTotalVfNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_GTE);
    }

    public PciDeviceWhereInput totalVfNumIn(List<Integer> totalVfNumIn) {

        this.totalVfNumIn = totalVfNumIn;
        return this;
    }

    public PciDeviceWhereInput addTotalVfNumInItem(Integer totalVfNumInItem) {
        if (this.totalVfNumIn == null) {
            this.totalVfNumIn = new ArrayList<Integer>();
        }
        this.totalVfNumIn.add(totalVfNumInItem);
        return this;
    }

    /**
     * Get totalVfNumIn
     *
     * @return totalVfNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalVfNumIn() {
        return totalVfNumIn;
    }

    public void setTotalVfNumIn(List<Integer> totalVfNumIn) {
        this.totalVfNumIn = totalVfNumIn;
    }

    public PciDeviceWhereInput totalVfNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput totalVfNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_IN);
        return this;
    }

    public void setTotalVfNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_IN);
        }
    }

    public boolean getTotalVfNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_IN);
    }

    public PciDeviceWhereInput totalVfNumLt(Integer totalVfNumLt) {

        this.totalVfNumLt = totalVfNumLt;
        return this;
    }

    /**
     * Get totalVfNumLt
     *
     * @return totalVfNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNumLt() {
        return totalVfNumLt;
    }

    public void setTotalVfNumLt(Integer totalVfNumLt) {
        this.totalVfNumLt = totalVfNumLt;
    }

    public PciDeviceWhereInput totalVfNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput totalVfNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_LT);
        return this;
    }

    public void setTotalVfNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_LT);
        }
    }

    public boolean getTotalVfNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_LT);
    }

    public PciDeviceWhereInput totalVfNumLte(Integer totalVfNumLte) {

        this.totalVfNumLte = totalVfNumLte;
        return this;
    }

    /**
     * Get totalVfNumLte
     *
     * @return totalVfNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNumLte() {
        return totalVfNumLte;
    }

    public void setTotalVfNumLte(Integer totalVfNumLte) {
        this.totalVfNumLte = totalVfNumLte;
    }

    public PciDeviceWhereInput totalVfNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput totalVfNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_LTE);
        return this;
    }

    public void setTotalVfNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_LTE);
        }
    }

    public boolean getTotalVfNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_LTE);
    }

    public PciDeviceWhereInput totalVfNumNot(Integer totalVfNumNot) {

        this.totalVfNumNot = totalVfNumNot;
        return this;
    }

    /**
     * Get totalVfNumNot
     *
     * @return totalVfNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNumNot() {
        return totalVfNumNot;
    }

    public void setTotalVfNumNot(Integer totalVfNumNot) {
        this.totalVfNumNot = totalVfNumNot;
    }

    public PciDeviceWhereInput totalVfNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput totalVfNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_NOT);
        return this;
    }

    public void setTotalVfNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_NOT);
        }
    }

    public boolean getTotalVfNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_NOT);
    }

    public PciDeviceWhereInput totalVfNumNotIn(List<Integer> totalVfNumNotIn) {

        this.totalVfNumNotIn = totalVfNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addTotalVfNumNotInItem(Integer totalVfNumNotInItem) {
        if (this.totalVfNumNotIn == null) {
            this.totalVfNumNotIn = new ArrayList<Integer>();
        }
        this.totalVfNumNotIn.add(totalVfNumNotInItem);
        return this;
    }

    /**
     * Get totalVfNumNotIn
     *
     * @return totalVfNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalVfNumNotIn() {
        return totalVfNumNotIn;
    }

    public void setTotalVfNumNotIn(List<Integer> totalVfNumNotIn) {
        this.totalVfNumNotIn = totalVfNumNotIn;
    }

    public PciDeviceWhereInput totalVfNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput totalVfNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN);
        return this;
    }

    public void setTotalVfNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN);
        }
    }

    public boolean getTotalVfNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM_NOT_IN);
    }

    public PciDeviceWhereInput usageType(PciDeviceType usageType) {

        this.usageType = usageType;
        return this;
    }

    /**
     * Get usageType
     *
     * @return usageType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceType getUsageType() {
        return usageType;
    }

    public void setUsageType(PciDeviceType usageType) {
        this.usageType = usageType;
    }

    public PciDeviceWhereInput usageType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE);
        return this;
    }

    public PciDeviceWhereInput usageType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE);
        return this;
    }

    public void setUsageType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE);
        }
    }

    public boolean getUsageType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_TYPE);
    }

    public PciDeviceWhereInput usageTypeIn(List<PciDeviceType> usageTypeIn) {

        this.usageTypeIn = usageTypeIn;
        return this;
    }

    public PciDeviceWhereInput addUsageTypeInItem(PciDeviceType usageTypeInItem) {
        if (this.usageTypeIn == null) {
            this.usageTypeIn = new ArrayList<PciDeviceType>();
        }
        this.usageTypeIn.add(usageTypeInItem);
        return this;
    }

    /**
     * Get usageTypeIn
     *
     * @return usageTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceType> getUsageTypeIn() {
        return usageTypeIn;
    }

    public void setUsageTypeIn(List<PciDeviceType> usageTypeIn) {
        this.usageTypeIn = usageTypeIn;
    }

    public PciDeviceWhereInput usageTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE_IN);
        return this;
    }

    public PciDeviceWhereInput usageTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE_IN);
        return this;
    }

    public void setUsageTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE_IN);
        }
    }

    public boolean getUsageTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_TYPE_IN);
    }

    public PciDeviceWhereInput usageTypeNot(PciDeviceType usageTypeNot) {

        this.usageTypeNot = usageTypeNot;
        return this;
    }

    /**
     * Get usageTypeNot
     *
     * @return usageTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceType getUsageTypeNot() {
        return usageTypeNot;
    }

    public void setUsageTypeNot(PciDeviceType usageTypeNot) {
        this.usageTypeNot = usageTypeNot;
    }

    public PciDeviceWhereInput usageTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE_NOT);
        return this;
    }

    public PciDeviceWhereInput usageTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE_NOT);
        return this;
    }

    public void setUsageTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE_NOT);
        }
    }

    public boolean getUsageTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_TYPE_NOT);
    }

    public PciDeviceWhereInput usageTypeNotIn(List<PciDeviceType> usageTypeNotIn) {

        this.usageTypeNotIn = usageTypeNotIn;
        return this;
    }

    public PciDeviceWhereInput addUsageTypeNotInItem(PciDeviceType usageTypeNotInItem) {
        if (this.usageTypeNotIn == null) {
            this.usageTypeNotIn = new ArrayList<PciDeviceType>();
        }
        this.usageTypeNotIn.add(usageTypeNotInItem);
        return this;
    }

    /**
     * Get usageTypeNotIn
     *
     * @return usageTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceType> getUsageTypeNotIn() {
        return usageTypeNotIn;
    }

    public void setUsageTypeNotIn(List<PciDeviceType> usageTypeNotIn) {
        this.usageTypeNotIn = usageTypeNotIn;
    }

    public PciDeviceWhereInput usageTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput usageTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE_NOT_IN);
        return this;
    }

    public void setUsageTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_TYPE_NOT_IN);
        }
    }

    public boolean getUsageTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_TYPE_NOT_IN);
    }

    public PciDeviceWhereInput usedMdevNum(Integer usedMdevNum) {

        this.usedMdevNum = usedMdevNum;
        return this;
    }

    /**
     * Get usedMdevNum
     *
     * @return usedMdevNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedMdevNum() {
        return usedMdevNum;
    }

    public void setUsedMdevNum(Integer usedMdevNum) {
        this.usedMdevNum = usedMdevNum;
    }

    public PciDeviceWhereInput usedMdevNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM);
        return this;
    }

    public PciDeviceWhereInput usedMdevNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM);
        return this;
    }

    public void setUsedMdevNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM);
        }
    }

    public boolean getUsedMdevNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM);
    }

    public PciDeviceWhereInput usedMdevNumGt(Integer usedMdevNumGt) {

        this.usedMdevNumGt = usedMdevNumGt;
        return this;
    }

    /**
     * Get usedMdevNumGt
     *
     * @return usedMdevNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedMdevNumGt() {
        return usedMdevNumGt;
    }

    public void setUsedMdevNumGt(Integer usedMdevNumGt) {
        this.usedMdevNumGt = usedMdevNumGt;
    }

    public PciDeviceWhereInput usedMdevNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_GT);
        return this;
    }

    public void setUsedMdevNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_GT);
        }
    }

    public boolean getUsedMdevNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_GT);
    }

    public PciDeviceWhereInput usedMdevNumGte(Integer usedMdevNumGte) {

        this.usedMdevNumGte = usedMdevNumGte;
        return this;
    }

    /**
     * Get usedMdevNumGte
     *
     * @return usedMdevNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedMdevNumGte() {
        return usedMdevNumGte;
    }

    public void setUsedMdevNumGte(Integer usedMdevNumGte) {
        this.usedMdevNumGte = usedMdevNumGte;
    }

    public PciDeviceWhereInput usedMdevNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_GTE);
        return this;
    }

    public void setUsedMdevNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_GTE);
        }
    }

    public boolean getUsedMdevNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_GTE);
    }

    public PciDeviceWhereInput usedMdevNumIn(List<Integer> usedMdevNumIn) {

        this.usedMdevNumIn = usedMdevNumIn;
        return this;
    }

    public PciDeviceWhereInput addUsedMdevNumInItem(Integer usedMdevNumInItem) {
        if (this.usedMdevNumIn == null) {
            this.usedMdevNumIn = new ArrayList<Integer>();
        }
        this.usedMdevNumIn.add(usedMdevNumInItem);
        return this;
    }

    /**
     * Get usedMdevNumIn
     *
     * @return usedMdevNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUsedMdevNumIn() {
        return usedMdevNumIn;
    }

    public void setUsedMdevNumIn(List<Integer> usedMdevNumIn) {
        this.usedMdevNumIn = usedMdevNumIn;
    }

    public PciDeviceWhereInput usedMdevNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_IN);
        return this;
    }

    public void setUsedMdevNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_IN);
        }
    }

    public boolean getUsedMdevNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_IN);
    }

    public PciDeviceWhereInput usedMdevNumLt(Integer usedMdevNumLt) {

        this.usedMdevNumLt = usedMdevNumLt;
        return this;
    }

    /**
     * Get usedMdevNumLt
     *
     * @return usedMdevNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedMdevNumLt() {
        return usedMdevNumLt;
    }

    public void setUsedMdevNumLt(Integer usedMdevNumLt) {
        this.usedMdevNumLt = usedMdevNumLt;
    }

    public PciDeviceWhereInput usedMdevNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_LT);
        return this;
    }

    public void setUsedMdevNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_LT);
        }
    }

    public boolean getUsedMdevNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_LT);
    }

    public PciDeviceWhereInput usedMdevNumLte(Integer usedMdevNumLte) {

        this.usedMdevNumLte = usedMdevNumLte;
        return this;
    }

    /**
     * Get usedMdevNumLte
     *
     * @return usedMdevNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedMdevNumLte() {
        return usedMdevNumLte;
    }

    public void setUsedMdevNumLte(Integer usedMdevNumLte) {
        this.usedMdevNumLte = usedMdevNumLte;
    }

    public PciDeviceWhereInput usedMdevNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_LTE);
        return this;
    }

    public void setUsedMdevNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_LTE);
        }
    }

    public boolean getUsedMdevNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_LTE);
    }

    public PciDeviceWhereInput usedMdevNumNot(Integer usedMdevNumNot) {

        this.usedMdevNumNot = usedMdevNumNot;
        return this;
    }

    /**
     * Get usedMdevNumNot
     *
     * @return usedMdevNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedMdevNumNot() {
        return usedMdevNumNot;
    }

    public void setUsedMdevNumNot(Integer usedMdevNumNot) {
        this.usedMdevNumNot = usedMdevNumNot;
    }

    public PciDeviceWhereInput usedMdevNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_NOT);
        return this;
    }

    public void setUsedMdevNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_NOT);
        }
    }

    public boolean getUsedMdevNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_NOT);
    }

    public PciDeviceWhereInput usedMdevNumNotIn(List<Integer> usedMdevNumNotIn) {

        this.usedMdevNumNotIn = usedMdevNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addUsedMdevNumNotInItem(Integer usedMdevNumNotInItem) {
        if (this.usedMdevNumNotIn == null) {
            this.usedMdevNumNotIn = new ArrayList<Integer>();
        }
        this.usedMdevNumNotIn.add(usedMdevNumNotInItem);
        return this;
    }

    /**
     * Get usedMdevNumNotIn
     *
     * @return usedMdevNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUsedMdevNumNotIn() {
        return usedMdevNumNotIn;
    }

    public void setUsedMdevNumNotIn(List<Integer> usedMdevNumNotIn) {
        this.usedMdevNumNotIn = usedMdevNumNotIn;
    }

    public PciDeviceWhereInput usedMdevNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput usedMdevNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN);
        return this;
    }

    public void setUsedMdevNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN);
        }
    }

    public boolean getUsedMdevNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MDEV_NUM_NOT_IN);
    }

    public PciDeviceWhereInput usedPartitioningNum(Integer usedPartitioningNum) {

        this.usedPartitioningNum = usedPartitioningNum;
        return this;
    }

    /**
     * Get usedPartitioningNum
     *
     * @return usedPartitioningNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedPartitioningNum() {
        return usedPartitioningNum;
    }

    public void setUsedPartitioningNum(Integer usedPartitioningNum) {
        this.usedPartitioningNum = usedPartitioningNum;
    }

    public PciDeviceWhereInput usedPartitioningNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM);
        return this;
    }

    public void setUsedPartitioningNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM);
        }
    }

    public boolean getUsedPartitioningNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM);
    }

    public PciDeviceWhereInput usedPartitioningNumGt(Integer usedPartitioningNumGt) {

        this.usedPartitioningNumGt = usedPartitioningNumGt;
        return this;
    }

    /**
     * Get usedPartitioningNumGt
     *
     * @return usedPartitioningNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedPartitioningNumGt() {
        return usedPartitioningNumGt;
    }

    public void setUsedPartitioningNumGt(Integer usedPartitioningNumGt) {
        this.usedPartitioningNumGt = usedPartitioningNumGt;
    }

    public PciDeviceWhereInput usedPartitioningNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_GT);
        return this;
    }

    public void setUsedPartitioningNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_GT);
        }
    }

    public boolean getUsedPartitioningNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_GT);
    }

    public PciDeviceWhereInput usedPartitioningNumGte(Integer usedPartitioningNumGte) {

        this.usedPartitioningNumGte = usedPartitioningNumGte;
        return this;
    }

    /**
     * Get usedPartitioningNumGte
     *
     * @return usedPartitioningNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedPartitioningNumGte() {
        return usedPartitioningNumGte;
    }

    public void setUsedPartitioningNumGte(Integer usedPartitioningNumGte) {
        this.usedPartitioningNumGte = usedPartitioningNumGte;
    }

    public PciDeviceWhereInput usedPartitioningNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE);
        return this;
    }

    public void setUsedPartitioningNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE);
        }
    }

    public boolean getUsedPartitioningNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_GTE);
    }

    public PciDeviceWhereInput usedPartitioningNumIn(List<Integer> usedPartitioningNumIn) {

        this.usedPartitioningNumIn = usedPartitioningNumIn;
        return this;
    }

    public PciDeviceWhereInput addUsedPartitioningNumInItem(Integer usedPartitioningNumInItem) {
        if (this.usedPartitioningNumIn == null) {
            this.usedPartitioningNumIn = new ArrayList<Integer>();
        }
        this.usedPartitioningNumIn.add(usedPartitioningNumInItem);
        return this;
    }

    /**
     * Get usedPartitioningNumIn
     *
     * @return usedPartitioningNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUsedPartitioningNumIn() {
        return usedPartitioningNumIn;
    }

    public void setUsedPartitioningNumIn(List<Integer> usedPartitioningNumIn) {
        this.usedPartitioningNumIn = usedPartitioningNumIn;
    }

    public PciDeviceWhereInput usedPartitioningNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_IN);
        return this;
    }

    public void setUsedPartitioningNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_IN);
        }
    }

    public boolean getUsedPartitioningNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_IN);
    }

    public PciDeviceWhereInput usedPartitioningNumLt(Integer usedPartitioningNumLt) {

        this.usedPartitioningNumLt = usedPartitioningNumLt;
        return this;
    }

    /**
     * Get usedPartitioningNumLt
     *
     * @return usedPartitioningNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedPartitioningNumLt() {
        return usedPartitioningNumLt;
    }

    public void setUsedPartitioningNumLt(Integer usedPartitioningNumLt) {
        this.usedPartitioningNumLt = usedPartitioningNumLt;
    }

    public PciDeviceWhereInput usedPartitioningNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_LT);
        return this;
    }

    public void setUsedPartitioningNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_LT);
        }
    }

    public boolean getUsedPartitioningNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_LT);
    }

    public PciDeviceWhereInput usedPartitioningNumLte(Integer usedPartitioningNumLte) {

        this.usedPartitioningNumLte = usedPartitioningNumLte;
        return this;
    }

    /**
     * Get usedPartitioningNumLte
     *
     * @return usedPartitioningNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedPartitioningNumLte() {
        return usedPartitioningNumLte;
    }

    public void setUsedPartitioningNumLte(Integer usedPartitioningNumLte) {
        this.usedPartitioningNumLte = usedPartitioningNumLte;
    }

    public PciDeviceWhereInput usedPartitioningNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE);
        return this;
    }

    public void setUsedPartitioningNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE);
        }
    }

    public boolean getUsedPartitioningNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_LTE);
    }

    public PciDeviceWhereInput usedPartitioningNumNot(Integer usedPartitioningNumNot) {

        this.usedPartitioningNumNot = usedPartitioningNumNot;
        return this;
    }

    /**
     * Get usedPartitioningNumNot
     *
     * @return usedPartitioningNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedPartitioningNumNot() {
        return usedPartitioningNumNot;
    }

    public void setUsedPartitioningNumNot(Integer usedPartitioningNumNot) {
        this.usedPartitioningNumNot = usedPartitioningNumNot;
    }

    public PciDeviceWhereInput usedPartitioningNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT);
        return this;
    }

    public void setUsedPartitioningNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT);
        }
    }

    public boolean getUsedPartitioningNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT);
    }

    public PciDeviceWhereInput usedPartitioningNumNotIn(List<Integer> usedPartitioningNumNotIn) {

        this.usedPartitioningNumNotIn = usedPartitioningNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addUsedPartitioningNumNotInItem(
            Integer usedPartitioningNumNotInItem) {
        if (this.usedPartitioningNumNotIn == null) {
            this.usedPartitioningNumNotIn = new ArrayList<Integer>();
        }
        this.usedPartitioningNumNotIn.add(usedPartitioningNumNotInItem);
        return this;
    }

    /**
     * Get usedPartitioningNumNotIn
     *
     * @return usedPartitioningNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUsedPartitioningNumNotIn() {
        return usedPartitioningNumNotIn;
    }

    public void setUsedPartitioningNumNotIn(List<Integer> usedPartitioningNumNotIn) {
        this.usedPartitioningNumNotIn = usedPartitioningNumNotIn;
    }

    public PciDeviceWhereInput usedPartitioningNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput usedPartitioningNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN);
        return this;
    }

    public void setUsedPartitioningNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN);
        }
    }

    public boolean getUsedPartitioningNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_PARTITIONING_NUM_NOT_IN);
    }

    public PciDeviceWhereInput usedVfNum(Integer usedVfNum) {

        this.usedVfNum = usedVfNum;
        return this;
    }

    /**
     * Get usedVfNum
     *
     * @return usedVfNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedVfNum() {
        return usedVfNum;
    }

    public void setUsedVfNum(Integer usedVfNum) {
        this.usedVfNum = usedVfNum;
    }

    public PciDeviceWhereInput usedVfNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM);
        return this;
    }

    public PciDeviceWhereInput usedVfNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM);
        return this;
    }

    public void setUsedVfNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM);
        }
    }

    public boolean getUsedVfNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM);
    }

    public PciDeviceWhereInput usedVfNumGt(Integer usedVfNumGt) {

        this.usedVfNumGt = usedVfNumGt;
        return this;
    }

    /**
     * Get usedVfNumGt
     *
     * @return usedVfNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedVfNumGt() {
        return usedVfNumGt;
    }

    public void setUsedVfNumGt(Integer usedVfNumGt) {
        this.usedVfNumGt = usedVfNumGt;
    }

    public PciDeviceWhereInput usedVfNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_GT);
        return this;
    }

    public PciDeviceWhereInput usedVfNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_GT);
        return this;
    }

    public void setUsedVfNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_GT);
        }
    }

    public boolean getUsedVfNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_GT);
    }

    public PciDeviceWhereInput usedVfNumGte(Integer usedVfNumGte) {

        this.usedVfNumGte = usedVfNumGte;
        return this;
    }

    /**
     * Get usedVfNumGte
     *
     * @return usedVfNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedVfNumGte() {
        return usedVfNumGte;
    }

    public void setUsedVfNumGte(Integer usedVfNumGte) {
        this.usedVfNumGte = usedVfNumGte;
    }

    public PciDeviceWhereInput usedVfNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_GTE);
        return this;
    }

    public PciDeviceWhereInput usedVfNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_GTE);
        return this;
    }

    public void setUsedVfNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_GTE);
        }
    }

    public boolean getUsedVfNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_GTE);
    }

    public PciDeviceWhereInput usedVfNumIn(List<Integer> usedVfNumIn) {

        this.usedVfNumIn = usedVfNumIn;
        return this;
    }

    public PciDeviceWhereInput addUsedVfNumInItem(Integer usedVfNumInItem) {
        if (this.usedVfNumIn == null) {
            this.usedVfNumIn = new ArrayList<Integer>();
        }
        this.usedVfNumIn.add(usedVfNumInItem);
        return this;
    }

    /**
     * Get usedVfNumIn
     *
     * @return usedVfNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUsedVfNumIn() {
        return usedVfNumIn;
    }

    public void setUsedVfNumIn(List<Integer> usedVfNumIn) {
        this.usedVfNumIn = usedVfNumIn;
    }

    public PciDeviceWhereInput usedVfNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_IN);
        return this;
    }

    public PciDeviceWhereInput usedVfNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_IN);
        return this;
    }

    public void setUsedVfNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_IN);
        }
    }

    public boolean getUsedVfNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_IN);
    }

    public PciDeviceWhereInput usedVfNumLt(Integer usedVfNumLt) {

        this.usedVfNumLt = usedVfNumLt;
        return this;
    }

    /**
     * Get usedVfNumLt
     *
     * @return usedVfNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedVfNumLt() {
        return usedVfNumLt;
    }

    public void setUsedVfNumLt(Integer usedVfNumLt) {
        this.usedVfNumLt = usedVfNumLt;
    }

    public PciDeviceWhereInput usedVfNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_LT);
        return this;
    }

    public PciDeviceWhereInput usedVfNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_LT);
        return this;
    }

    public void setUsedVfNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_LT);
        }
    }

    public boolean getUsedVfNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_LT);
    }

    public PciDeviceWhereInput usedVfNumLte(Integer usedVfNumLte) {

        this.usedVfNumLte = usedVfNumLte;
        return this;
    }

    /**
     * Get usedVfNumLte
     *
     * @return usedVfNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedVfNumLte() {
        return usedVfNumLte;
    }

    public void setUsedVfNumLte(Integer usedVfNumLte) {
        this.usedVfNumLte = usedVfNumLte;
    }

    public PciDeviceWhereInput usedVfNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_LTE);
        return this;
    }

    public PciDeviceWhereInput usedVfNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_LTE);
        return this;
    }

    public void setUsedVfNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_LTE);
        }
    }

    public boolean getUsedVfNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_LTE);
    }

    public PciDeviceWhereInput usedVfNumNot(Integer usedVfNumNot) {

        this.usedVfNumNot = usedVfNumNot;
        return this;
    }

    /**
     * Get usedVfNumNot
     *
     * @return usedVfNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUsedVfNumNot() {
        return usedVfNumNot;
    }

    public void setUsedVfNumNot(Integer usedVfNumNot) {
        this.usedVfNumNot = usedVfNumNot;
    }

    public PciDeviceWhereInput usedVfNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_NOT);
        return this;
    }

    public PciDeviceWhereInput usedVfNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_NOT);
        return this;
    }

    public void setUsedVfNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_NOT);
        }
    }

    public boolean getUsedVfNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_NOT);
    }

    public PciDeviceWhereInput usedVfNumNotIn(List<Integer> usedVfNumNotIn) {

        this.usedVfNumNotIn = usedVfNumNotIn;
        return this;
    }

    public PciDeviceWhereInput addUsedVfNumNotInItem(Integer usedVfNumNotInItem) {
        if (this.usedVfNumNotIn == null) {
            this.usedVfNumNotIn = new ArrayList<Integer>();
        }
        this.usedVfNumNotIn.add(usedVfNumNotInItem);
        return this;
    }

    /**
     * Get usedVfNumNotIn
     *
     * @return usedVfNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getUsedVfNumNotIn() {
        return usedVfNumNotIn;
    }

    public void setUsedVfNumNotIn(List<Integer> usedVfNumNotIn) {
        this.usedVfNumNotIn = usedVfNumNotIn;
    }

    public PciDeviceWhereInput usedVfNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput usedVfNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_NOT_IN);
        return this;
    }

    public void setUsedVfNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_VF_NUM_NOT_IN);
        }
    }

    public boolean getUsedVfNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_VF_NUM_NOT_IN);
    }

    public PciDeviceWhereInput userUsage(PciDeviceUsage userUsage) {

        this.userUsage = userUsage;
        return this;
    }

    /**
     * Get userUsage
     *
     * @return userUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceUsage getUserUsage() {
        return userUsage;
    }

    public void setUserUsage(PciDeviceUsage userUsage) {
        this.userUsage = userUsage;
    }

    public PciDeviceWhereInput userUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_USAGE);
        return this;
    }

    public PciDeviceWhereInput userUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE);
        return this;
    }

    public void setUserUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE);
        }
    }

    public boolean getUserUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_USAGE);
    }

    public PciDeviceWhereInput userUsageIn(List<PciDeviceUsage> userUsageIn) {

        this.userUsageIn = userUsageIn;
        return this;
    }

    public PciDeviceWhereInput addUserUsageInItem(PciDeviceUsage userUsageInItem) {
        if (this.userUsageIn == null) {
            this.userUsageIn = new ArrayList<PciDeviceUsage>();
        }
        this.userUsageIn.add(userUsageInItem);
        return this;
    }

    /**
     * Get userUsageIn
     *
     * @return userUsageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceUsage> getUserUsageIn() {
        return userUsageIn;
    }

    public void setUserUsageIn(List<PciDeviceUsage> userUsageIn) {
        this.userUsageIn = userUsageIn;
    }

    public PciDeviceWhereInput userUsageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_USAGE_IN);
        return this;
    }

    public PciDeviceWhereInput userUsageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE_IN);
        return this;
    }

    public void setUserUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE_IN);
        }
    }

    public boolean getUserUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_USAGE_IN);
    }

    public PciDeviceWhereInput userUsageNot(PciDeviceUsage userUsageNot) {

        this.userUsageNot = userUsageNot;
        return this;
    }

    /**
     * Get userUsageNot
     *
     * @return userUsageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PciDeviceUsage getUserUsageNot() {
        return userUsageNot;
    }

    public void setUserUsageNot(PciDeviceUsage userUsageNot) {
        this.userUsageNot = userUsageNot;
    }

    public PciDeviceWhereInput userUsageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_USAGE_NOT);
        return this;
    }

    public PciDeviceWhereInput userUsageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE_NOT);
        return this;
    }

    public void setUserUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE_NOT);
        }
    }

    public boolean getUserUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_USAGE_NOT);
    }

    public PciDeviceWhereInput userUsageNotIn(List<PciDeviceUsage> userUsageNotIn) {

        this.userUsageNotIn = userUsageNotIn;
        return this;
    }

    public PciDeviceWhereInput addUserUsageNotInItem(PciDeviceUsage userUsageNotInItem) {
        if (this.userUsageNotIn == null) {
            this.userUsageNotIn = new ArrayList<PciDeviceUsage>();
        }
        this.userUsageNotIn.add(userUsageNotInItem);
        return this;
    }

    /**
     * Get userUsageNotIn
     *
     * @return userUsageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<PciDeviceUsage> getUserUsageNotIn() {
        return userUsageNotIn;
    }

    public void setUserUsageNotIn(List<PciDeviceUsage> userUsageNotIn) {
        this.userUsageNotIn = userUsageNotIn;
    }

    public PciDeviceWhereInput userUsageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_USAGE_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput userUsageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE_NOT_IN);
        return this;
    }

    public void setUserUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_USAGE_NOT_IN);
        }
    }

    public boolean getUserUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_USAGE_NOT_IN);
    }

    public PciDeviceWhereInput vendorId(String vendorId) {

        this.vendorId = vendorId;
        return this;
    }

    /**
     * Get vendorId
     *
     * @return vendorId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public PciDeviceWhereInput vendorId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID);
        return this;
    }

    public PciDeviceWhereInput vendorId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID);
        return this;
    }

    public void setVendorId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID);
        }
    }

    public boolean getVendorId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID);
    }

    public PciDeviceWhereInput vendorIdContains(String vendorIdContains) {

        this.vendorIdContains = vendorIdContains;
        return this;
    }

    /**
     * Get vendorIdContains
     *
     * @return vendorIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdContains() {
        return vendorIdContains;
    }

    public void setVendorIdContains(String vendorIdContains) {
        this.vendorIdContains = vendorIdContains;
    }

    public PciDeviceWhereInput vendorIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput vendorIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_CONTAINS);
        return this;
    }

    public void setVendorIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_CONTAINS);
        }
    }

    public boolean getVendorIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_CONTAINS);
    }

    public PciDeviceWhereInput vendorIdEndsWith(String vendorIdEndsWith) {

        this.vendorIdEndsWith = vendorIdEndsWith;
        return this;
    }

    /**
     * Get vendorIdEndsWith
     *
     * @return vendorIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdEndsWith() {
        return vendorIdEndsWith;
    }

    public void setVendorIdEndsWith(String vendorIdEndsWith) {
        this.vendorIdEndsWith = vendorIdEndsWith;
    }

    public PciDeviceWhereInput vendorIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput vendorIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_ENDS_WITH);
        return this;
    }

    public void setVendorIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_ENDS_WITH);
        }
    }

    public boolean getVendorIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_ENDS_WITH);
    }

    public PciDeviceWhereInput vendorIdGt(String vendorIdGt) {

        this.vendorIdGt = vendorIdGt;
        return this;
    }

    /**
     * Get vendorIdGt
     *
     * @return vendorIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdGt() {
        return vendorIdGt;
    }

    public void setVendorIdGt(String vendorIdGt) {
        this.vendorIdGt = vendorIdGt;
    }

    public PciDeviceWhereInput vendorIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_GT);
        return this;
    }

    public PciDeviceWhereInput vendorIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_GT);
        return this;
    }

    public void setVendorIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_GT);
        }
    }

    public boolean getVendorIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_GT);
    }

    public PciDeviceWhereInput vendorIdGte(String vendorIdGte) {

        this.vendorIdGte = vendorIdGte;
        return this;
    }

    /**
     * Get vendorIdGte
     *
     * @return vendorIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdGte() {
        return vendorIdGte;
    }

    public void setVendorIdGte(String vendorIdGte) {
        this.vendorIdGte = vendorIdGte;
    }

    public PciDeviceWhereInput vendorIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_GTE);
        return this;
    }

    public PciDeviceWhereInput vendorIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_GTE);
        return this;
    }

    public void setVendorIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_GTE);
        }
    }

    public boolean getVendorIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_GTE);
    }

    public PciDeviceWhereInput vendorIdIn(List<String> vendorIdIn) {

        this.vendorIdIn = vendorIdIn;
        return this;
    }

    public PciDeviceWhereInput addVendorIdInItem(String vendorIdInItem) {
        if (this.vendorIdIn == null) {
            this.vendorIdIn = new ArrayList<String>();
        }
        this.vendorIdIn.add(vendorIdInItem);
        return this;
    }

    /**
     * Get vendorIdIn
     *
     * @return vendorIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVendorIdIn() {
        return vendorIdIn;
    }

    public void setVendorIdIn(List<String> vendorIdIn) {
        this.vendorIdIn = vendorIdIn;
    }

    public PciDeviceWhereInput vendorIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_IN);
        return this;
    }

    public PciDeviceWhereInput vendorIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_IN);
        return this;
    }

    public void setVendorIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_IN);
        }
    }

    public boolean getVendorIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_IN);
    }

    public PciDeviceWhereInput vendorIdLt(String vendorIdLt) {

        this.vendorIdLt = vendorIdLt;
        return this;
    }

    /**
     * Get vendorIdLt
     *
     * @return vendorIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdLt() {
        return vendorIdLt;
    }

    public void setVendorIdLt(String vendorIdLt) {
        this.vendorIdLt = vendorIdLt;
    }

    public PciDeviceWhereInput vendorIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_LT);
        return this;
    }

    public PciDeviceWhereInput vendorIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_LT);
        return this;
    }

    public void setVendorIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_LT);
        }
    }

    public boolean getVendorIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_LT);
    }

    public PciDeviceWhereInput vendorIdLte(String vendorIdLte) {

        this.vendorIdLte = vendorIdLte;
        return this;
    }

    /**
     * Get vendorIdLte
     *
     * @return vendorIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdLte() {
        return vendorIdLte;
    }

    public void setVendorIdLte(String vendorIdLte) {
        this.vendorIdLte = vendorIdLte;
    }

    public PciDeviceWhereInput vendorIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_LTE);
        return this;
    }

    public PciDeviceWhereInput vendorIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_LTE);
        return this;
    }

    public void setVendorIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_LTE);
        }
    }

    public boolean getVendorIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_LTE);
    }

    public PciDeviceWhereInput vendorIdNot(String vendorIdNot) {

        this.vendorIdNot = vendorIdNot;
        return this;
    }

    /**
     * Get vendorIdNot
     *
     * @return vendorIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdNot() {
        return vendorIdNot;
    }

    public void setVendorIdNot(String vendorIdNot) {
        this.vendorIdNot = vendorIdNot;
    }

    public PciDeviceWhereInput vendorIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT);
        return this;
    }

    public PciDeviceWhereInput vendorIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT);
        return this;
    }

    public void setVendorIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT);
        }
    }

    public boolean getVendorIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_NOT);
    }

    public PciDeviceWhereInput vendorIdNotContains(String vendorIdNotContains) {

        this.vendorIdNotContains = vendorIdNotContains;
        return this;
    }

    /**
     * Get vendorIdNotContains
     *
     * @return vendorIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdNotContains() {
        return vendorIdNotContains;
    }

    public void setVendorIdNotContains(String vendorIdNotContains) {
        this.vendorIdNotContains = vendorIdNotContains;
    }

    public PciDeviceWhereInput vendorIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput vendorIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS);
        return this;
    }

    public void setVendorIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS);
        }
    }

    public boolean getVendorIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_NOT_CONTAINS);
    }

    public PciDeviceWhereInput vendorIdNotEndsWith(String vendorIdNotEndsWith) {

        this.vendorIdNotEndsWith = vendorIdNotEndsWith;
        return this;
    }

    /**
     * Get vendorIdNotEndsWith
     *
     * @return vendorIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdNotEndsWith() {
        return vendorIdNotEndsWith;
    }

    public void setVendorIdNotEndsWith(String vendorIdNotEndsWith) {
        this.vendorIdNotEndsWith = vendorIdNotEndsWith;
    }

    public PciDeviceWhereInput vendorIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput vendorIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setVendorIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getVendorIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput vendorIdNotIn(List<String> vendorIdNotIn) {

        this.vendorIdNotIn = vendorIdNotIn;
        return this;
    }

    public PciDeviceWhereInput addVendorIdNotInItem(String vendorIdNotInItem) {
        if (this.vendorIdNotIn == null) {
            this.vendorIdNotIn = new ArrayList<String>();
        }
        this.vendorIdNotIn.add(vendorIdNotInItem);
        return this;
    }

    /**
     * Get vendorIdNotIn
     *
     * @return vendorIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVendorIdNotIn() {
        return vendorIdNotIn;
    }

    public void setVendorIdNotIn(List<String> vendorIdNotIn) {
        this.vendorIdNotIn = vendorIdNotIn;
    }

    public PciDeviceWhereInput vendorIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput vendorIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_IN);
        return this;
    }

    public void setVendorIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_IN);
        }
    }

    public boolean getVendorIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_NOT_IN);
    }

    public PciDeviceWhereInput vendorIdNotStartsWith(String vendorIdNotStartsWith) {

        this.vendorIdNotStartsWith = vendorIdNotStartsWith;
        return this;
    }

    /**
     * Get vendorIdNotStartsWith
     *
     * @return vendorIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdNotStartsWith() {
        return vendorIdNotStartsWith;
    }

    public void setVendorIdNotStartsWith(String vendorIdNotStartsWith) {
        this.vendorIdNotStartsWith = vendorIdNotStartsWith;
    }

    public PciDeviceWhereInput vendorIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput vendorIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setVendorIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getVendorIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput vendorIdStartsWith(String vendorIdStartsWith) {

        this.vendorIdStartsWith = vendorIdStartsWith;
        return this;
    }

    /**
     * Get vendorIdStartsWith
     *
     * @return vendorIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVendorIdStartsWith() {
        return vendorIdStartsWith;
    }

    public void setVendorIdStartsWith(String vendorIdStartsWith) {
        this.vendorIdStartsWith = vendorIdStartsWith;
    }

    public PciDeviceWhereInput vendorIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput vendorIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_STARTS_WITH);
        return this;
    }

    public void setVendorIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VENDOR_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VENDOR_ID_STARTS_WITH);
        }
    }

    public boolean getVendorIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VENDOR_ID_STARTS_WITH);
    }

    public PciDeviceWhereInput verdorName(String verdorName) {

        this.verdorName = verdorName;
        return this;
    }

    /**
     * Get verdorName
     *
     * @return verdorName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorName() {
        return verdorName;
    }

    public void setVerdorName(String verdorName) {
        this.verdorName = verdorName;
    }

    public PciDeviceWhereInput verdorName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME);
        return this;
    }

    public PciDeviceWhereInput verdorName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME);
        return this;
    }

    public void setVerdorName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME);
        }
    }

    public boolean getVerdorName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME);
    }

    public PciDeviceWhereInput verdorNameContains(String verdorNameContains) {

        this.verdorNameContains = verdorNameContains;
        return this;
    }

    /**
     * Get verdorNameContains
     *
     * @return verdorNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameContains() {
        return verdorNameContains;
    }

    public void setVerdorNameContains(String verdorNameContains) {
        this.verdorNameContains = verdorNameContains;
    }

    public PciDeviceWhereInput verdorNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput verdorNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_CONTAINS);
        return this;
    }

    public void setVerdorNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_CONTAINS);
        }
    }

    public boolean getVerdorNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_CONTAINS);
    }

    public PciDeviceWhereInput verdorNameEndsWith(String verdorNameEndsWith) {

        this.verdorNameEndsWith = verdorNameEndsWith;
        return this;
    }

    /**
     * Get verdorNameEndsWith
     *
     * @return verdorNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameEndsWith() {
        return verdorNameEndsWith;
    }

    public void setVerdorNameEndsWith(String verdorNameEndsWith) {
        this.verdorNameEndsWith = verdorNameEndsWith;
    }

    public PciDeviceWhereInput verdorNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput verdorNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH);
        return this;
    }

    public void setVerdorNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH);
        }
    }

    public boolean getVerdorNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_ENDS_WITH);
    }

    public PciDeviceWhereInput verdorNameGt(String verdorNameGt) {

        this.verdorNameGt = verdorNameGt;
        return this;
    }

    /**
     * Get verdorNameGt
     *
     * @return verdorNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameGt() {
        return verdorNameGt;
    }

    public void setVerdorNameGt(String verdorNameGt) {
        this.verdorNameGt = verdorNameGt;
    }

    public PciDeviceWhereInput verdorNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_GT);
        return this;
    }

    public PciDeviceWhereInput verdorNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_GT);
        return this;
    }

    public void setVerdorNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_GT);
        }
    }

    public boolean getVerdorNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_GT);
    }

    public PciDeviceWhereInput verdorNameGte(String verdorNameGte) {

        this.verdorNameGte = verdorNameGte;
        return this;
    }

    /**
     * Get verdorNameGte
     *
     * @return verdorNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameGte() {
        return verdorNameGte;
    }

    public void setVerdorNameGte(String verdorNameGte) {
        this.verdorNameGte = verdorNameGte;
    }

    public PciDeviceWhereInput verdorNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_GTE);
        return this;
    }

    public PciDeviceWhereInput verdorNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_GTE);
        return this;
    }

    public void setVerdorNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_GTE);
        }
    }

    public boolean getVerdorNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_GTE);
    }

    public PciDeviceWhereInput verdorNameIn(List<String> verdorNameIn) {

        this.verdorNameIn = verdorNameIn;
        return this;
    }

    public PciDeviceWhereInput addVerdorNameInItem(String verdorNameInItem) {
        if (this.verdorNameIn == null) {
            this.verdorNameIn = new ArrayList<String>();
        }
        this.verdorNameIn.add(verdorNameInItem);
        return this;
    }

    /**
     * Get verdorNameIn
     *
     * @return verdorNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVerdorNameIn() {
        return verdorNameIn;
    }

    public void setVerdorNameIn(List<String> verdorNameIn) {
        this.verdorNameIn = verdorNameIn;
    }

    public PciDeviceWhereInput verdorNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_IN);
        return this;
    }

    public PciDeviceWhereInput verdorNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_IN);
        return this;
    }

    public void setVerdorNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_IN);
        }
    }

    public boolean getVerdorNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_IN);
    }

    public PciDeviceWhereInput verdorNameLt(String verdorNameLt) {

        this.verdorNameLt = verdorNameLt;
        return this;
    }

    /**
     * Get verdorNameLt
     *
     * @return verdorNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameLt() {
        return verdorNameLt;
    }

    public void setVerdorNameLt(String verdorNameLt) {
        this.verdorNameLt = verdorNameLt;
    }

    public PciDeviceWhereInput verdorNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_LT);
        return this;
    }

    public PciDeviceWhereInput verdorNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_LT);
        return this;
    }

    public void setVerdorNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_LT);
        }
    }

    public boolean getVerdorNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_LT);
    }

    public PciDeviceWhereInput verdorNameLte(String verdorNameLte) {

        this.verdorNameLte = verdorNameLte;
        return this;
    }

    /**
     * Get verdorNameLte
     *
     * @return verdorNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameLte() {
        return verdorNameLte;
    }

    public void setVerdorNameLte(String verdorNameLte) {
        this.verdorNameLte = verdorNameLte;
    }

    public PciDeviceWhereInput verdorNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_LTE);
        return this;
    }

    public PciDeviceWhereInput verdorNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_LTE);
        return this;
    }

    public void setVerdorNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_LTE);
        }
    }

    public boolean getVerdorNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_LTE);
    }

    public PciDeviceWhereInput verdorNameNot(String verdorNameNot) {

        this.verdorNameNot = verdorNameNot;
        return this;
    }

    /**
     * Get verdorNameNot
     *
     * @return verdorNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameNot() {
        return verdorNameNot;
    }

    public void setVerdorNameNot(String verdorNameNot) {
        this.verdorNameNot = verdorNameNot;
    }

    public PciDeviceWhereInput verdorNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT);
        return this;
    }

    public PciDeviceWhereInput verdorNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT);
        return this;
    }

    public void setVerdorNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT);
        }
    }

    public boolean getVerdorNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_NOT);
    }

    public PciDeviceWhereInput verdorNameNotContains(String verdorNameNotContains) {

        this.verdorNameNotContains = verdorNameNotContains;
        return this;
    }

    /**
     * Get verdorNameNotContains
     *
     * @return verdorNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameNotContains() {
        return verdorNameNotContains;
    }

    public void setVerdorNameNotContains(String verdorNameNotContains) {
        this.verdorNameNotContains = verdorNameNotContains;
    }

    public PciDeviceWhereInput verdorNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS);
        return this;
    }

    public PciDeviceWhereInput verdorNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS);
        return this;
    }

    public void setVerdorNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS);
        }
    }

    public boolean getVerdorNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_NOT_CONTAINS);
    }

    public PciDeviceWhereInput verdorNameNotEndsWith(String verdorNameNotEndsWith) {

        this.verdorNameNotEndsWith = verdorNameNotEndsWith;
        return this;
    }

    /**
     * Get verdorNameNotEndsWith
     *
     * @return verdorNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameNotEndsWith() {
        return verdorNameNotEndsWith;
    }

    public void setVerdorNameNotEndsWith(String verdorNameNotEndsWith) {
        this.verdorNameNotEndsWith = verdorNameNotEndsWith;
    }

    public PciDeviceWhereInput verdorNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH);
        return this;
    }

    public PciDeviceWhereInput verdorNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setVerdorNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getVerdorNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_NOT_ENDS_WITH);
    }

    public PciDeviceWhereInput verdorNameNotIn(List<String> verdorNameNotIn) {

        this.verdorNameNotIn = verdorNameNotIn;
        return this;
    }

    public PciDeviceWhereInput addVerdorNameNotInItem(String verdorNameNotInItem) {
        if (this.verdorNameNotIn == null) {
            this.verdorNameNotIn = new ArrayList<String>();
        }
        this.verdorNameNotIn.add(verdorNameNotInItem);
        return this;
    }

    /**
     * Get verdorNameNotIn
     *
     * @return verdorNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVerdorNameNotIn() {
        return verdorNameNotIn;
    }

    public void setVerdorNameNotIn(List<String> verdorNameNotIn) {
        this.verdorNameNotIn = verdorNameNotIn;
    }

    public PciDeviceWhereInput verdorNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_IN);
        return this;
    }

    public PciDeviceWhereInput verdorNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_IN);
        return this;
    }

    public void setVerdorNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_IN);
        }
    }

    public boolean getVerdorNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_NOT_IN);
    }

    public PciDeviceWhereInput verdorNameNotStartsWith(String verdorNameNotStartsWith) {

        this.verdorNameNotStartsWith = verdorNameNotStartsWith;
        return this;
    }

    /**
     * Get verdorNameNotStartsWith
     *
     * @return verdorNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameNotStartsWith() {
        return verdorNameNotStartsWith;
    }

    public void setVerdorNameNotStartsWith(String verdorNameNotStartsWith) {
        this.verdorNameNotStartsWith = verdorNameNotStartsWith;
    }

    public PciDeviceWhereInput verdorNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput verdorNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setVerdorNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getVerdorNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_NOT_STARTS_WITH);
    }

    public PciDeviceWhereInput verdorNameStartsWith(String verdorNameStartsWith) {

        this.verdorNameStartsWith = verdorNameStartsWith;
        return this;
    }

    /**
     * Get verdorNameStartsWith
     *
     * @return verdorNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVerdorNameStartsWith() {
        return verdorNameStartsWith;
    }

    public void setVerdorNameStartsWith(String verdorNameStartsWith) {
        this.verdorNameStartsWith = verdorNameStartsWith;
    }

    public PciDeviceWhereInput verdorNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH);
        return this;
    }

    public PciDeviceWhereInput verdorNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH);
        return this;
    }

    public void setVerdorNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH);
        }
    }

    public boolean getVerdorNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERDOR_NAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PciDeviceWhereInput pciDeviceWhereInput = (PciDeviceWhereInput) o;
        return Objects.equals(this.AND, pciDeviceWhereInput.AND)
                && Objects.equals(this.NOT, pciDeviceWhereInput.NOT)
                && Objects.equals(this.OR, pciDeviceWhereInput.OR)
                && Objects.equals(this.bus, pciDeviceWhereInput.bus)
                && Objects.equals(this.busContains, pciDeviceWhereInput.busContains)
                && Objects.equals(this.busEndsWith, pciDeviceWhereInput.busEndsWith)
                && Objects.equals(this.busGt, pciDeviceWhereInput.busGt)
                && Objects.equals(this.busGte, pciDeviceWhereInput.busGte)
                && Objects.equals(this.busIn, pciDeviceWhereInput.busIn)
                && Objects.equals(this.busLocation, pciDeviceWhereInput.busLocation)
                && Objects.equals(this.busLocationContains, pciDeviceWhereInput.busLocationContains)
                && Objects.equals(this.busLocationEndsWith, pciDeviceWhereInput.busLocationEndsWith)
                && Objects.equals(this.busLocationGt, pciDeviceWhereInput.busLocationGt)
                && Objects.equals(this.busLocationGte, pciDeviceWhereInput.busLocationGte)
                && Objects.equals(this.busLocationIn, pciDeviceWhereInput.busLocationIn)
                && Objects.equals(this.busLocationLt, pciDeviceWhereInput.busLocationLt)
                && Objects.equals(this.busLocationLte, pciDeviceWhereInput.busLocationLte)
                && Objects.equals(this.busLocationNot, pciDeviceWhereInput.busLocationNot)
                && Objects.equals(
                        this.busLocationNotContains, pciDeviceWhereInput.busLocationNotContains)
                && Objects.equals(
                        this.busLocationNotEndsWith, pciDeviceWhereInput.busLocationNotEndsWith)
                && Objects.equals(this.busLocationNotIn, pciDeviceWhereInput.busLocationNotIn)
                && Objects.equals(
                        this.busLocationNotStartsWith, pciDeviceWhereInput.busLocationNotStartsWith)
                && Objects.equals(
                        this.busLocationStartsWith, pciDeviceWhereInput.busLocationStartsWith)
                && Objects.equals(this.busLt, pciDeviceWhereInput.busLt)
                && Objects.equals(this.busLte, pciDeviceWhereInput.busLte)
                && Objects.equals(this.busNot, pciDeviceWhereInput.busNot)
                && Objects.equals(this.busNotContains, pciDeviceWhereInput.busNotContains)
                && Objects.equals(this.busNotEndsWith, pciDeviceWhereInput.busNotEndsWith)
                && Objects.equals(this.busNotIn, pciDeviceWhereInput.busNotIn)
                && Objects.equals(this.busNotStartsWith, pciDeviceWhereInput.busNotStartsWith)
                && Objects.equals(this.busStartsWith, pciDeviceWhereInput.busStartsWith)
                && Objects.equals(this.classCode, pciDeviceWhereInput.classCode)
                && Objects.equals(this.classCodeContains, pciDeviceWhereInput.classCodeContains)
                && Objects.equals(this.classCodeEndsWith, pciDeviceWhereInput.classCodeEndsWith)
                && Objects.equals(this.classCodeGt, pciDeviceWhereInput.classCodeGt)
                && Objects.equals(this.classCodeGte, pciDeviceWhereInput.classCodeGte)
                && Objects.equals(this.classCodeIn, pciDeviceWhereInput.classCodeIn)
                && Objects.equals(this.classCodeLt, pciDeviceWhereInput.classCodeLt)
                && Objects.equals(this.classCodeLte, pciDeviceWhereInput.classCodeLte)
                && Objects.equals(this.classCodeNot, pciDeviceWhereInput.classCodeNot)
                && Objects.equals(
                        this.classCodeNotContains, pciDeviceWhereInput.classCodeNotContains)
                && Objects.equals(
                        this.classCodeNotEndsWith, pciDeviceWhereInput.classCodeNotEndsWith)
                && Objects.equals(this.classCodeNotIn, pciDeviceWhereInput.classCodeNotIn)
                && Objects.equals(
                        this.classCodeNotStartsWith, pciDeviceWhereInput.classCodeNotStartsWith)
                && Objects.equals(this.classCodeStartsWith, pciDeviceWhereInput.classCodeStartsWith)
                && Objects.equals(this.deviceType, pciDeviceWhereInput.deviceType)
                && Objects.equals(this.deviceTypeContains, pciDeviceWhereInput.deviceTypeContains)
                && Objects.equals(this.deviceTypeEndsWith, pciDeviceWhereInput.deviceTypeEndsWith)
                && Objects.equals(this.deviceTypeGt, pciDeviceWhereInput.deviceTypeGt)
                && Objects.equals(this.deviceTypeGte, pciDeviceWhereInput.deviceTypeGte)
                && Objects.equals(this.deviceTypeIn, pciDeviceWhereInput.deviceTypeIn)
                && Objects.equals(this.deviceTypeLt, pciDeviceWhereInput.deviceTypeLt)
                && Objects.equals(this.deviceTypeLte, pciDeviceWhereInput.deviceTypeLte)
                && Objects.equals(this.deviceTypeNot, pciDeviceWhereInput.deviceTypeNot)
                && Objects.equals(
                        this.deviceTypeNotContains, pciDeviceWhereInput.deviceTypeNotContains)
                && Objects.equals(
                        this.deviceTypeNotEndsWith, pciDeviceWhereInput.deviceTypeNotEndsWith)
                && Objects.equals(this.deviceTypeNotIn, pciDeviceWhereInput.deviceTypeNotIn)
                && Objects.equals(
                        this.deviceTypeNotStartsWith, pciDeviceWhereInput.deviceTypeNotStartsWith)
                && Objects.equals(
                        this.deviceTypeStartsWith, pciDeviceWhereInput.deviceTypeStartsWith)
                && Objects.equals(this.entityAsyncStatus, pciDeviceWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, pciDeviceWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, pciDeviceWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, pciDeviceWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.functionNum, pciDeviceWhereInput.functionNum)
                && Objects.equals(this.functionNumContains, pciDeviceWhereInput.functionNumContains)
                && Objects.equals(this.functionNumEndsWith, pciDeviceWhereInput.functionNumEndsWith)
                && Objects.equals(this.functionNumGt, pciDeviceWhereInput.functionNumGt)
                && Objects.equals(this.functionNumGte, pciDeviceWhereInput.functionNumGte)
                && Objects.equals(this.functionNumIn, pciDeviceWhereInput.functionNumIn)
                && Objects.equals(this.functionNumLt, pciDeviceWhereInput.functionNumLt)
                && Objects.equals(this.functionNumLte, pciDeviceWhereInput.functionNumLte)
                && Objects.equals(this.functionNumNot, pciDeviceWhereInput.functionNumNot)
                && Objects.equals(
                        this.functionNumNotContains, pciDeviceWhereInput.functionNumNotContains)
                && Objects.equals(
                        this.functionNumNotEndsWith, pciDeviceWhereInput.functionNumNotEndsWith)
                && Objects.equals(this.functionNumNotIn, pciDeviceWhereInput.functionNumNotIn)
                && Objects.equals(
                        this.functionNumNotStartsWith, pciDeviceWhereInput.functionNumNotStartsWith)
                && Objects.equals(
                        this.functionNumStartsWith, pciDeviceWhereInput.functionNumStartsWith)
                && Objects.equals(this.host, pciDeviceWhereInput.host)
                && Objects.equals(this.id, pciDeviceWhereInput.id)
                && Objects.equals(this.idContains, pciDeviceWhereInput.idContains)
                && Objects.equals(this.idEndsWith, pciDeviceWhereInput.idEndsWith)
                && Objects.equals(this.idGt, pciDeviceWhereInput.idGt)
                && Objects.equals(this.idGte, pciDeviceWhereInput.idGte)
                && Objects.equals(this.idIn, pciDeviceWhereInput.idIn)
                && Objects.equals(this.idLt, pciDeviceWhereInput.idLt)
                && Objects.equals(this.idLte, pciDeviceWhereInput.idLte)
                && Objects.equals(this.idNot, pciDeviceWhereInput.idNot)
                && Objects.equals(this.idNotContains, pciDeviceWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, pciDeviceWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, pciDeviceWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, pciDeviceWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, pciDeviceWhereInput.idStartsWith)
                && Objects.equals(this.iommuStatus, pciDeviceWhereInput.iommuStatus)
                && Objects.equals(this.iommuStatusIn, pciDeviceWhereInput.iommuStatusIn)
                && Objects.equals(this.iommuStatusNot, pciDeviceWhereInput.iommuStatusNot)
                && Objects.equals(this.iommuStatusNotIn, pciDeviceWhereInput.iommuStatusNotIn)
                && Objects.equals(this.localId, pciDeviceWhereInput.localId)
                && Objects.equals(this.localIdContains, pciDeviceWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, pciDeviceWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, pciDeviceWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, pciDeviceWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, pciDeviceWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, pciDeviceWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, pciDeviceWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, pciDeviceWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, pciDeviceWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, pciDeviceWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, pciDeviceWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, pciDeviceWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, pciDeviceWhereInput.localIdStartsWith)
                && Objects.equals(this.mdevState, pciDeviceWhereInput.mdevState)
                && Objects.equals(this.mdevStateIn, pciDeviceWhereInput.mdevStateIn)
                && Objects.equals(this.mdevStateNot, pciDeviceWhereInput.mdevStateNot)
                && Objects.equals(this.mdevStateNotIn, pciDeviceWhereInput.mdevStateNotIn)
                && Objects.equals(this.mdevTypeId, pciDeviceWhereInput.mdevTypeId)
                && Objects.equals(this.mdevTypeIdContains, pciDeviceWhereInput.mdevTypeIdContains)
                && Objects.equals(this.mdevTypeIdEndsWith, pciDeviceWhereInput.mdevTypeIdEndsWith)
                && Objects.equals(this.mdevTypeIdGt, pciDeviceWhereInput.mdevTypeIdGt)
                && Objects.equals(this.mdevTypeIdGte, pciDeviceWhereInput.mdevTypeIdGte)
                && Objects.equals(this.mdevTypeIdIn, pciDeviceWhereInput.mdevTypeIdIn)
                && Objects.equals(this.mdevTypeIdLt, pciDeviceWhereInput.mdevTypeIdLt)
                && Objects.equals(this.mdevTypeIdLte, pciDeviceWhereInput.mdevTypeIdLte)
                && Objects.equals(this.mdevTypeIdNot, pciDeviceWhereInput.mdevTypeIdNot)
                && Objects.equals(
                        this.mdevTypeIdNotContains, pciDeviceWhereInput.mdevTypeIdNotContains)
                && Objects.equals(
                        this.mdevTypeIdNotEndsWith, pciDeviceWhereInput.mdevTypeIdNotEndsWith)
                && Objects.equals(this.mdevTypeIdNotIn, pciDeviceWhereInput.mdevTypeIdNotIn)
                && Objects.equals(
                        this.mdevTypeIdNotStartsWith, pciDeviceWhereInput.mdevTypeIdNotStartsWith)
                && Objects.equals(
                        this.mdevTypeIdStartsWith, pciDeviceWhereInput.mdevTypeIdStartsWith)
                && Objects.equals(this.name, pciDeviceWhereInput.name)
                && Objects.equals(this.nameContains, pciDeviceWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, pciDeviceWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, pciDeviceWhereInput.nameGt)
                && Objects.equals(this.nameGte, pciDeviceWhereInput.nameGte)
                && Objects.equals(this.nameIn, pciDeviceWhereInput.nameIn)
                && Objects.equals(this.nameLt, pciDeviceWhereInput.nameLt)
                && Objects.equals(this.nameLte, pciDeviceWhereInput.nameLte)
                && Objects.equals(this.nameNot, pciDeviceWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, pciDeviceWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, pciDeviceWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, pciDeviceWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, pciDeviceWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, pciDeviceWhereInput.nameStartsWith)
                && Objects.equals(this.partitioningState, pciDeviceWhereInput.partitioningState)
                && Objects.equals(this.partitioningStateIn, pciDeviceWhereInput.partitioningStateIn)
                && Objects.equals(
                        this.partitioningStateNot, pciDeviceWhereInput.partitioningStateNot)
                && Objects.equals(
                        this.partitioningStateNotIn, pciDeviceWhereInput.partitioningStateNotIn)
                && Objects.equals(this.productId, pciDeviceWhereInput.productId)
                && Objects.equals(this.productIdContains, pciDeviceWhereInput.productIdContains)
                && Objects.equals(this.productIdEndsWith, pciDeviceWhereInput.productIdEndsWith)
                && Objects.equals(this.productIdGt, pciDeviceWhereInput.productIdGt)
                && Objects.equals(this.productIdGte, pciDeviceWhereInput.productIdGte)
                && Objects.equals(this.productIdIn, pciDeviceWhereInput.productIdIn)
                && Objects.equals(this.productIdLt, pciDeviceWhereInput.productIdLt)
                && Objects.equals(this.productIdLte, pciDeviceWhereInput.productIdLte)
                && Objects.equals(this.productIdNot, pciDeviceWhereInput.productIdNot)
                && Objects.equals(
                        this.productIdNotContains, pciDeviceWhereInput.productIdNotContains)
                && Objects.equals(
                        this.productIdNotEndsWith, pciDeviceWhereInput.productIdNotEndsWith)
                && Objects.equals(this.productIdNotIn, pciDeviceWhereInput.productIdNotIn)
                && Objects.equals(
                        this.productIdNotStartsWith, pciDeviceWhereInput.productIdNotStartsWith)
                && Objects.equals(this.productIdStartsWith, pciDeviceWhereInput.productIdStartsWith)
                && Objects.equals(this.slot, pciDeviceWhereInput.slot)
                && Objects.equals(this.slotContains, pciDeviceWhereInput.slotContains)
                && Objects.equals(this.slotEndsWith, pciDeviceWhereInput.slotEndsWith)
                && Objects.equals(this.slotGt, pciDeviceWhereInput.slotGt)
                && Objects.equals(this.slotGte, pciDeviceWhereInput.slotGte)
                && Objects.equals(this.slotIn, pciDeviceWhereInput.slotIn)
                && Objects.equals(this.slotLt, pciDeviceWhereInput.slotLt)
                && Objects.equals(this.slotLte, pciDeviceWhereInput.slotLte)
                && Objects.equals(this.slotNot, pciDeviceWhereInput.slotNot)
                && Objects.equals(this.slotNotContains, pciDeviceWhereInput.slotNotContains)
                && Objects.equals(this.slotNotEndsWith, pciDeviceWhereInput.slotNotEndsWith)
                && Objects.equals(this.slotNotIn, pciDeviceWhereInput.slotNotIn)
                && Objects.equals(this.slotNotStartsWith, pciDeviceWhereInput.slotNotStartsWith)
                && Objects.equals(this.slotStartsWith, pciDeviceWhereInput.slotStartsWith)
                && Objects.equals(this.sriovState, pciDeviceWhereInput.sriovState)
                && Objects.equals(this.sriovStateIn, pciDeviceWhereInput.sriovStateIn)
                && Objects.equals(this.sriovStateNot, pciDeviceWhereInput.sriovStateNot)
                && Objects.equals(this.sriovStateNotIn, pciDeviceWhereInput.sriovStateNotIn)
                && Objects.equals(this.subsystemProductId, pciDeviceWhereInput.subsystemProductId)
                && Objects.equals(
                        this.subsystemProductIdContains,
                        pciDeviceWhereInput.subsystemProductIdContains)
                && Objects.equals(
                        this.subsystemProductIdEndsWith,
                        pciDeviceWhereInput.subsystemProductIdEndsWith)
                && Objects.equals(
                        this.subsystemProductIdGt, pciDeviceWhereInput.subsystemProductIdGt)
                && Objects.equals(
                        this.subsystemProductIdGte, pciDeviceWhereInput.subsystemProductIdGte)
                && Objects.equals(
                        this.subsystemProductIdIn, pciDeviceWhereInput.subsystemProductIdIn)
                && Objects.equals(
                        this.subsystemProductIdLt, pciDeviceWhereInput.subsystemProductIdLt)
                && Objects.equals(
                        this.subsystemProductIdLte, pciDeviceWhereInput.subsystemProductIdLte)
                && Objects.equals(
                        this.subsystemProductIdNot, pciDeviceWhereInput.subsystemProductIdNot)
                && Objects.equals(
                        this.subsystemProductIdNotContains,
                        pciDeviceWhereInput.subsystemProductIdNotContains)
                && Objects.equals(
                        this.subsystemProductIdNotEndsWith,
                        pciDeviceWhereInput.subsystemProductIdNotEndsWith)
                && Objects.equals(
                        this.subsystemProductIdNotIn, pciDeviceWhereInput.subsystemProductIdNotIn)
                && Objects.equals(
                        this.subsystemProductIdNotStartsWith,
                        pciDeviceWhereInput.subsystemProductIdNotStartsWith)
                && Objects.equals(
                        this.subsystemProductIdStartsWith,
                        pciDeviceWhereInput.subsystemProductIdStartsWith)
                && Objects.equals(this.subsystemVendorId, pciDeviceWhereInput.subsystemVendorId)
                && Objects.equals(
                        this.subsystemVendorIdContains,
                        pciDeviceWhereInput.subsystemVendorIdContains)
                && Objects.equals(
                        this.subsystemVendorIdEndsWith,
                        pciDeviceWhereInput.subsystemVendorIdEndsWith)
                && Objects.equals(this.subsystemVendorIdGt, pciDeviceWhereInput.subsystemVendorIdGt)
                && Objects.equals(
                        this.subsystemVendorIdGte, pciDeviceWhereInput.subsystemVendorIdGte)
                && Objects.equals(this.subsystemVendorIdIn, pciDeviceWhereInput.subsystemVendorIdIn)
                && Objects.equals(this.subsystemVendorIdLt, pciDeviceWhereInput.subsystemVendorIdLt)
                && Objects.equals(
                        this.subsystemVendorIdLte, pciDeviceWhereInput.subsystemVendorIdLte)
                && Objects.equals(
                        this.subsystemVendorIdNot, pciDeviceWhereInput.subsystemVendorIdNot)
                && Objects.equals(
                        this.subsystemVendorIdNotContains,
                        pciDeviceWhereInput.subsystemVendorIdNotContains)
                && Objects.equals(
                        this.subsystemVendorIdNotEndsWith,
                        pciDeviceWhereInput.subsystemVendorIdNotEndsWith)
                && Objects.equals(
                        this.subsystemVendorIdNotIn, pciDeviceWhereInput.subsystemVendorIdNotIn)
                && Objects.equals(
                        this.subsystemVendorIdNotStartsWith,
                        pciDeviceWhereInput.subsystemVendorIdNotStartsWith)
                && Objects.equals(
                        this.subsystemVendorIdStartsWith,
                        pciDeviceWhereInput.subsystemVendorIdStartsWith)
                && Objects.equals(this.totalMdevNum, pciDeviceWhereInput.totalMdevNum)
                && Objects.equals(this.totalMdevNumGt, pciDeviceWhereInput.totalMdevNumGt)
                && Objects.equals(this.totalMdevNumGte, pciDeviceWhereInput.totalMdevNumGte)
                && Objects.equals(this.totalMdevNumIn, pciDeviceWhereInput.totalMdevNumIn)
                && Objects.equals(this.totalMdevNumLt, pciDeviceWhereInput.totalMdevNumLt)
                && Objects.equals(this.totalMdevNumLte, pciDeviceWhereInput.totalMdevNumLte)
                && Objects.equals(this.totalMdevNumNot, pciDeviceWhereInput.totalMdevNumNot)
                && Objects.equals(this.totalMdevNumNotIn, pciDeviceWhereInput.totalMdevNumNotIn)
                && Objects.equals(
                        this.totalPartitioningNum, pciDeviceWhereInput.totalPartitioningNum)
                && Objects.equals(
                        this.totalPartitioningNumGt, pciDeviceWhereInput.totalPartitioningNumGt)
                && Objects.equals(
                        this.totalPartitioningNumGte, pciDeviceWhereInput.totalPartitioningNumGte)
                && Objects.equals(
                        this.totalPartitioningNumIn, pciDeviceWhereInput.totalPartitioningNumIn)
                && Objects.equals(
                        this.totalPartitioningNumLt, pciDeviceWhereInput.totalPartitioningNumLt)
                && Objects.equals(
                        this.totalPartitioningNumLte, pciDeviceWhereInput.totalPartitioningNumLte)
                && Objects.equals(
                        this.totalPartitioningNumNot, pciDeviceWhereInput.totalPartitioningNumNot)
                && Objects.equals(
                        this.totalPartitioningNumNotIn,
                        pciDeviceWhereInput.totalPartitioningNumNotIn)
                && Objects.equals(this.totalVfNum, pciDeviceWhereInput.totalVfNum)
                && Objects.equals(this.totalVfNumGt, pciDeviceWhereInput.totalVfNumGt)
                && Objects.equals(this.totalVfNumGte, pciDeviceWhereInput.totalVfNumGte)
                && Objects.equals(this.totalVfNumIn, pciDeviceWhereInput.totalVfNumIn)
                && Objects.equals(this.totalVfNumLt, pciDeviceWhereInput.totalVfNumLt)
                && Objects.equals(this.totalVfNumLte, pciDeviceWhereInput.totalVfNumLte)
                && Objects.equals(this.totalVfNumNot, pciDeviceWhereInput.totalVfNumNot)
                && Objects.equals(this.totalVfNumNotIn, pciDeviceWhereInput.totalVfNumNotIn)
                && Objects.equals(this.usageType, pciDeviceWhereInput.usageType)
                && Objects.equals(this.usageTypeIn, pciDeviceWhereInput.usageTypeIn)
                && Objects.equals(this.usageTypeNot, pciDeviceWhereInput.usageTypeNot)
                && Objects.equals(this.usageTypeNotIn, pciDeviceWhereInput.usageTypeNotIn)
                && Objects.equals(this.usedMdevNum, pciDeviceWhereInput.usedMdevNum)
                && Objects.equals(this.usedMdevNumGt, pciDeviceWhereInput.usedMdevNumGt)
                && Objects.equals(this.usedMdevNumGte, pciDeviceWhereInput.usedMdevNumGte)
                && Objects.equals(this.usedMdevNumIn, pciDeviceWhereInput.usedMdevNumIn)
                && Objects.equals(this.usedMdevNumLt, pciDeviceWhereInput.usedMdevNumLt)
                && Objects.equals(this.usedMdevNumLte, pciDeviceWhereInput.usedMdevNumLte)
                && Objects.equals(this.usedMdevNumNot, pciDeviceWhereInput.usedMdevNumNot)
                && Objects.equals(this.usedMdevNumNotIn, pciDeviceWhereInput.usedMdevNumNotIn)
                && Objects.equals(this.usedPartitioningNum, pciDeviceWhereInput.usedPartitioningNum)
                && Objects.equals(
                        this.usedPartitioningNumGt, pciDeviceWhereInput.usedPartitioningNumGt)
                && Objects.equals(
                        this.usedPartitioningNumGte, pciDeviceWhereInput.usedPartitioningNumGte)
                && Objects.equals(
                        this.usedPartitioningNumIn, pciDeviceWhereInput.usedPartitioningNumIn)
                && Objects.equals(
                        this.usedPartitioningNumLt, pciDeviceWhereInput.usedPartitioningNumLt)
                && Objects.equals(
                        this.usedPartitioningNumLte, pciDeviceWhereInput.usedPartitioningNumLte)
                && Objects.equals(
                        this.usedPartitioningNumNot, pciDeviceWhereInput.usedPartitioningNumNot)
                && Objects.equals(
                        this.usedPartitioningNumNotIn, pciDeviceWhereInput.usedPartitioningNumNotIn)
                && Objects.equals(this.usedVfNum, pciDeviceWhereInput.usedVfNum)
                && Objects.equals(this.usedVfNumGt, pciDeviceWhereInput.usedVfNumGt)
                && Objects.equals(this.usedVfNumGte, pciDeviceWhereInput.usedVfNumGte)
                && Objects.equals(this.usedVfNumIn, pciDeviceWhereInput.usedVfNumIn)
                && Objects.equals(this.usedVfNumLt, pciDeviceWhereInput.usedVfNumLt)
                && Objects.equals(this.usedVfNumLte, pciDeviceWhereInput.usedVfNumLte)
                && Objects.equals(this.usedVfNumNot, pciDeviceWhereInput.usedVfNumNot)
                && Objects.equals(this.usedVfNumNotIn, pciDeviceWhereInput.usedVfNumNotIn)
                && Objects.equals(this.userUsage, pciDeviceWhereInput.userUsage)
                && Objects.equals(this.userUsageIn, pciDeviceWhereInput.userUsageIn)
                && Objects.equals(this.userUsageNot, pciDeviceWhereInput.userUsageNot)
                && Objects.equals(this.userUsageNotIn, pciDeviceWhereInput.userUsageNotIn)
                && Objects.equals(this.vendorId, pciDeviceWhereInput.vendorId)
                && Objects.equals(this.vendorIdContains, pciDeviceWhereInput.vendorIdContains)
                && Objects.equals(this.vendorIdEndsWith, pciDeviceWhereInput.vendorIdEndsWith)
                && Objects.equals(this.vendorIdGt, pciDeviceWhereInput.vendorIdGt)
                && Objects.equals(this.vendorIdGte, pciDeviceWhereInput.vendorIdGte)
                && Objects.equals(this.vendorIdIn, pciDeviceWhereInput.vendorIdIn)
                && Objects.equals(this.vendorIdLt, pciDeviceWhereInput.vendorIdLt)
                && Objects.equals(this.vendorIdLte, pciDeviceWhereInput.vendorIdLte)
                && Objects.equals(this.vendorIdNot, pciDeviceWhereInput.vendorIdNot)
                && Objects.equals(this.vendorIdNotContains, pciDeviceWhereInput.vendorIdNotContains)
                && Objects.equals(this.vendorIdNotEndsWith, pciDeviceWhereInput.vendorIdNotEndsWith)
                && Objects.equals(this.vendorIdNotIn, pciDeviceWhereInput.vendorIdNotIn)
                && Objects.equals(
                        this.vendorIdNotStartsWith, pciDeviceWhereInput.vendorIdNotStartsWith)
                && Objects.equals(this.vendorIdStartsWith, pciDeviceWhereInput.vendorIdStartsWith)
                && Objects.equals(this.verdorName, pciDeviceWhereInput.verdorName)
                && Objects.equals(this.verdorNameContains, pciDeviceWhereInput.verdorNameContains)
                && Objects.equals(this.verdorNameEndsWith, pciDeviceWhereInput.verdorNameEndsWith)
                && Objects.equals(this.verdorNameGt, pciDeviceWhereInput.verdorNameGt)
                && Objects.equals(this.verdorNameGte, pciDeviceWhereInput.verdorNameGte)
                && Objects.equals(this.verdorNameIn, pciDeviceWhereInput.verdorNameIn)
                && Objects.equals(this.verdorNameLt, pciDeviceWhereInput.verdorNameLt)
                && Objects.equals(this.verdorNameLte, pciDeviceWhereInput.verdorNameLte)
                && Objects.equals(this.verdorNameNot, pciDeviceWhereInput.verdorNameNot)
                && Objects.equals(
                        this.verdorNameNotContains, pciDeviceWhereInput.verdorNameNotContains)
                && Objects.equals(
                        this.verdorNameNotEndsWith, pciDeviceWhereInput.verdorNameNotEndsWith)
                && Objects.equals(this.verdorNameNotIn, pciDeviceWhereInput.verdorNameNotIn)
                && Objects.equals(
                        this.verdorNameNotStartsWith, pciDeviceWhereInput.verdorNameNotStartsWith)
                && Objects.equals(
                        this.verdorNameStartsWith, pciDeviceWhereInput.verdorNameStartsWith);
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
                bus,
                busContains,
                busEndsWith,
                busGt,
                busGte,
                busIn,
                busLocation,
                busLocationContains,
                busLocationEndsWith,
                busLocationGt,
                busLocationGte,
                busLocationIn,
                busLocationLt,
                busLocationLte,
                busLocationNot,
                busLocationNotContains,
                busLocationNotEndsWith,
                busLocationNotIn,
                busLocationNotStartsWith,
                busLocationStartsWith,
                busLt,
                busLte,
                busNot,
                busNotContains,
                busNotEndsWith,
                busNotIn,
                busNotStartsWith,
                busStartsWith,
                classCode,
                classCodeContains,
                classCodeEndsWith,
                classCodeGt,
                classCodeGte,
                classCodeIn,
                classCodeLt,
                classCodeLte,
                classCodeNot,
                classCodeNotContains,
                classCodeNotEndsWith,
                classCodeNotIn,
                classCodeNotStartsWith,
                classCodeStartsWith,
                deviceType,
                deviceTypeContains,
                deviceTypeEndsWith,
                deviceTypeGt,
                deviceTypeGte,
                deviceTypeIn,
                deviceTypeLt,
                deviceTypeLte,
                deviceTypeNot,
                deviceTypeNotContains,
                deviceTypeNotEndsWith,
                deviceTypeNotIn,
                deviceTypeNotStartsWith,
                deviceTypeStartsWith,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                functionNum,
                functionNumContains,
                functionNumEndsWith,
                functionNumGt,
                functionNumGte,
                functionNumIn,
                functionNumLt,
                functionNumLte,
                functionNumNot,
                functionNumNotContains,
                functionNumNotEndsWith,
                functionNumNotIn,
                functionNumNotStartsWith,
                functionNumStartsWith,
                host,
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
                iommuStatus,
                iommuStatusIn,
                iommuStatusNot,
                iommuStatusNotIn,
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
                mdevState,
                mdevStateIn,
                mdevStateNot,
                mdevStateNotIn,
                mdevTypeId,
                mdevTypeIdContains,
                mdevTypeIdEndsWith,
                mdevTypeIdGt,
                mdevTypeIdGte,
                mdevTypeIdIn,
                mdevTypeIdLt,
                mdevTypeIdLte,
                mdevTypeIdNot,
                mdevTypeIdNotContains,
                mdevTypeIdNotEndsWith,
                mdevTypeIdNotIn,
                mdevTypeIdNotStartsWith,
                mdevTypeIdStartsWith,
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
                partitioningState,
                partitioningStateIn,
                partitioningStateNot,
                partitioningStateNotIn,
                productId,
                productIdContains,
                productIdEndsWith,
                productIdGt,
                productIdGte,
                productIdIn,
                productIdLt,
                productIdLte,
                productIdNot,
                productIdNotContains,
                productIdNotEndsWith,
                productIdNotIn,
                productIdNotStartsWith,
                productIdStartsWith,
                slot,
                slotContains,
                slotEndsWith,
                slotGt,
                slotGte,
                slotIn,
                slotLt,
                slotLte,
                slotNot,
                slotNotContains,
                slotNotEndsWith,
                slotNotIn,
                slotNotStartsWith,
                slotStartsWith,
                sriovState,
                sriovStateIn,
                sriovStateNot,
                sriovStateNotIn,
                subsystemProductId,
                subsystemProductIdContains,
                subsystemProductIdEndsWith,
                subsystemProductIdGt,
                subsystemProductIdGte,
                subsystemProductIdIn,
                subsystemProductIdLt,
                subsystemProductIdLte,
                subsystemProductIdNot,
                subsystemProductIdNotContains,
                subsystemProductIdNotEndsWith,
                subsystemProductIdNotIn,
                subsystemProductIdNotStartsWith,
                subsystemProductIdStartsWith,
                subsystemVendorId,
                subsystemVendorIdContains,
                subsystemVendorIdEndsWith,
                subsystemVendorIdGt,
                subsystemVendorIdGte,
                subsystemVendorIdIn,
                subsystemVendorIdLt,
                subsystemVendorIdLte,
                subsystemVendorIdNot,
                subsystemVendorIdNotContains,
                subsystemVendorIdNotEndsWith,
                subsystemVendorIdNotIn,
                subsystemVendorIdNotStartsWith,
                subsystemVendorIdStartsWith,
                totalMdevNum,
                totalMdevNumGt,
                totalMdevNumGte,
                totalMdevNumIn,
                totalMdevNumLt,
                totalMdevNumLte,
                totalMdevNumNot,
                totalMdevNumNotIn,
                totalPartitioningNum,
                totalPartitioningNumGt,
                totalPartitioningNumGte,
                totalPartitioningNumIn,
                totalPartitioningNumLt,
                totalPartitioningNumLte,
                totalPartitioningNumNot,
                totalPartitioningNumNotIn,
                totalVfNum,
                totalVfNumGt,
                totalVfNumGte,
                totalVfNumIn,
                totalVfNumLt,
                totalVfNumLte,
                totalVfNumNot,
                totalVfNumNotIn,
                usageType,
                usageTypeIn,
                usageTypeNot,
                usageTypeNotIn,
                usedMdevNum,
                usedMdevNumGt,
                usedMdevNumGte,
                usedMdevNumIn,
                usedMdevNumLt,
                usedMdevNumLte,
                usedMdevNumNot,
                usedMdevNumNotIn,
                usedPartitioningNum,
                usedPartitioningNumGt,
                usedPartitioningNumGte,
                usedPartitioningNumIn,
                usedPartitioningNumLt,
                usedPartitioningNumLte,
                usedPartitioningNumNot,
                usedPartitioningNumNotIn,
                usedVfNum,
                usedVfNumGt,
                usedVfNumGte,
                usedVfNumIn,
                usedVfNumLt,
                usedVfNumLte,
                usedVfNumNot,
                usedVfNumNotIn,
                userUsage,
                userUsageIn,
                userUsageNot,
                userUsageNotIn,
                vendorId,
                vendorIdContains,
                vendorIdEndsWith,
                vendorIdGt,
                vendorIdGte,
                vendorIdIn,
                vendorIdLt,
                vendorIdLte,
                vendorIdNot,
                vendorIdNotContains,
                vendorIdNotEndsWith,
                vendorIdNotIn,
                vendorIdNotStartsWith,
                vendorIdStartsWith,
                verdorName,
                verdorNameContains,
                verdorNameEndsWith,
                verdorNameGt,
                verdorNameGte,
                verdorNameIn,
                verdorNameLt,
                verdorNameLte,
                verdorNameNot,
                verdorNameNotContains,
                verdorNameNotEndsWith,
                verdorNameNotIn,
                verdorNameNotStartsWith,
                verdorNameStartsWith);
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
        sb.append("class PciDeviceWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    busContains: ").append(toIndentedString(busContains)).append("\n");
        sb.append("    busEndsWith: ").append(toIndentedString(busEndsWith)).append("\n");
        sb.append("    busGt: ").append(toIndentedString(busGt)).append("\n");
        sb.append("    busGte: ").append(toIndentedString(busGte)).append("\n");
        sb.append("    busIn: ").append(toIndentedString(busIn)).append("\n");
        sb.append("    busLocation: ").append(toIndentedString(busLocation)).append("\n");
        sb.append("    busLocationContains: ")
                .append(toIndentedString(busLocationContains))
                .append("\n");
        sb.append("    busLocationEndsWith: ")
                .append(toIndentedString(busLocationEndsWith))
                .append("\n");
        sb.append("    busLocationGt: ").append(toIndentedString(busLocationGt)).append("\n");
        sb.append("    busLocationGte: ").append(toIndentedString(busLocationGte)).append("\n");
        sb.append("    busLocationIn: ").append(toIndentedString(busLocationIn)).append("\n");
        sb.append("    busLocationLt: ").append(toIndentedString(busLocationLt)).append("\n");
        sb.append("    busLocationLte: ").append(toIndentedString(busLocationLte)).append("\n");
        sb.append("    busLocationNot: ").append(toIndentedString(busLocationNot)).append("\n");
        sb.append("    busLocationNotContains: ")
                .append(toIndentedString(busLocationNotContains))
                .append("\n");
        sb.append("    busLocationNotEndsWith: ")
                .append(toIndentedString(busLocationNotEndsWith))
                .append("\n");
        sb.append("    busLocationNotIn: ").append(toIndentedString(busLocationNotIn)).append("\n");
        sb.append("    busLocationNotStartsWith: ")
                .append(toIndentedString(busLocationNotStartsWith))
                .append("\n");
        sb.append("    busLocationStartsWith: ")
                .append(toIndentedString(busLocationStartsWith))
                .append("\n");
        sb.append("    busLt: ").append(toIndentedString(busLt)).append("\n");
        sb.append("    busLte: ").append(toIndentedString(busLte)).append("\n");
        sb.append("    busNot: ").append(toIndentedString(busNot)).append("\n");
        sb.append("    busNotContains: ").append(toIndentedString(busNotContains)).append("\n");
        sb.append("    busNotEndsWith: ").append(toIndentedString(busNotEndsWith)).append("\n");
        sb.append("    busNotIn: ").append(toIndentedString(busNotIn)).append("\n");
        sb.append("    busNotStartsWith: ").append(toIndentedString(busNotStartsWith)).append("\n");
        sb.append("    busStartsWith: ").append(toIndentedString(busStartsWith)).append("\n");
        sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
        sb.append("    classCodeContains: ")
                .append(toIndentedString(classCodeContains))
                .append("\n");
        sb.append("    classCodeEndsWith: ")
                .append(toIndentedString(classCodeEndsWith))
                .append("\n");
        sb.append("    classCodeGt: ").append(toIndentedString(classCodeGt)).append("\n");
        sb.append("    classCodeGte: ").append(toIndentedString(classCodeGte)).append("\n");
        sb.append("    classCodeIn: ").append(toIndentedString(classCodeIn)).append("\n");
        sb.append("    classCodeLt: ").append(toIndentedString(classCodeLt)).append("\n");
        sb.append("    classCodeLte: ").append(toIndentedString(classCodeLte)).append("\n");
        sb.append("    classCodeNot: ").append(toIndentedString(classCodeNot)).append("\n");
        sb.append("    classCodeNotContains: ")
                .append(toIndentedString(classCodeNotContains))
                .append("\n");
        sb.append("    classCodeNotEndsWith: ")
                .append(toIndentedString(classCodeNotEndsWith))
                .append("\n");
        sb.append("    classCodeNotIn: ").append(toIndentedString(classCodeNotIn)).append("\n");
        sb.append("    classCodeNotStartsWith: ")
                .append(toIndentedString(classCodeNotStartsWith))
                .append("\n");
        sb.append("    classCodeStartsWith: ")
                .append(toIndentedString(classCodeStartsWith))
                .append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    deviceTypeContains: ")
                .append(toIndentedString(deviceTypeContains))
                .append("\n");
        sb.append("    deviceTypeEndsWith: ")
                .append(toIndentedString(deviceTypeEndsWith))
                .append("\n");
        sb.append("    deviceTypeGt: ").append(toIndentedString(deviceTypeGt)).append("\n");
        sb.append("    deviceTypeGte: ").append(toIndentedString(deviceTypeGte)).append("\n");
        sb.append("    deviceTypeIn: ").append(toIndentedString(deviceTypeIn)).append("\n");
        sb.append("    deviceTypeLt: ").append(toIndentedString(deviceTypeLt)).append("\n");
        sb.append("    deviceTypeLte: ").append(toIndentedString(deviceTypeLte)).append("\n");
        sb.append("    deviceTypeNot: ").append(toIndentedString(deviceTypeNot)).append("\n");
        sb.append("    deviceTypeNotContains: ")
                .append(toIndentedString(deviceTypeNotContains))
                .append("\n");
        sb.append("    deviceTypeNotEndsWith: ")
                .append(toIndentedString(deviceTypeNotEndsWith))
                .append("\n");
        sb.append("    deviceTypeNotIn: ").append(toIndentedString(deviceTypeNotIn)).append("\n");
        sb.append("    deviceTypeNotStartsWith: ")
                .append(toIndentedString(deviceTypeNotStartsWith))
                .append("\n");
        sb.append("    deviceTypeStartsWith: ")
                .append(toIndentedString(deviceTypeStartsWith))
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
        sb.append("    functionNum: ").append(toIndentedString(functionNum)).append("\n");
        sb.append("    functionNumContains: ")
                .append(toIndentedString(functionNumContains))
                .append("\n");
        sb.append("    functionNumEndsWith: ")
                .append(toIndentedString(functionNumEndsWith))
                .append("\n");
        sb.append("    functionNumGt: ").append(toIndentedString(functionNumGt)).append("\n");
        sb.append("    functionNumGte: ").append(toIndentedString(functionNumGte)).append("\n");
        sb.append("    functionNumIn: ").append(toIndentedString(functionNumIn)).append("\n");
        sb.append("    functionNumLt: ").append(toIndentedString(functionNumLt)).append("\n");
        sb.append("    functionNumLte: ").append(toIndentedString(functionNumLte)).append("\n");
        sb.append("    functionNumNot: ").append(toIndentedString(functionNumNot)).append("\n");
        sb.append("    functionNumNotContains: ")
                .append(toIndentedString(functionNumNotContains))
                .append("\n");
        sb.append("    functionNumNotEndsWith: ")
                .append(toIndentedString(functionNumNotEndsWith))
                .append("\n");
        sb.append("    functionNumNotIn: ").append(toIndentedString(functionNumNotIn)).append("\n");
        sb.append("    functionNumNotStartsWith: ")
                .append(toIndentedString(functionNumNotStartsWith))
                .append("\n");
        sb.append("    functionNumStartsWith: ")
                .append(toIndentedString(functionNumStartsWith))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
        sb.append("    iommuStatus: ").append(toIndentedString(iommuStatus)).append("\n");
        sb.append("    iommuStatusIn: ").append(toIndentedString(iommuStatusIn)).append("\n");
        sb.append("    iommuStatusNot: ").append(toIndentedString(iommuStatusNot)).append("\n");
        sb.append("    iommuStatusNotIn: ").append(toIndentedString(iommuStatusNotIn)).append("\n");
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
        sb.append("    mdevState: ").append(toIndentedString(mdevState)).append("\n");
        sb.append("    mdevStateIn: ").append(toIndentedString(mdevStateIn)).append("\n");
        sb.append("    mdevStateNot: ").append(toIndentedString(mdevStateNot)).append("\n");
        sb.append("    mdevStateNotIn: ").append(toIndentedString(mdevStateNotIn)).append("\n");
        sb.append("    mdevTypeId: ").append(toIndentedString(mdevTypeId)).append("\n");
        sb.append("    mdevTypeIdContains: ")
                .append(toIndentedString(mdevTypeIdContains))
                .append("\n");
        sb.append("    mdevTypeIdEndsWith: ")
                .append(toIndentedString(mdevTypeIdEndsWith))
                .append("\n");
        sb.append("    mdevTypeIdGt: ").append(toIndentedString(mdevTypeIdGt)).append("\n");
        sb.append("    mdevTypeIdGte: ").append(toIndentedString(mdevTypeIdGte)).append("\n");
        sb.append("    mdevTypeIdIn: ").append(toIndentedString(mdevTypeIdIn)).append("\n");
        sb.append("    mdevTypeIdLt: ").append(toIndentedString(mdevTypeIdLt)).append("\n");
        sb.append("    mdevTypeIdLte: ").append(toIndentedString(mdevTypeIdLte)).append("\n");
        sb.append("    mdevTypeIdNot: ").append(toIndentedString(mdevTypeIdNot)).append("\n");
        sb.append("    mdevTypeIdNotContains: ")
                .append(toIndentedString(mdevTypeIdNotContains))
                .append("\n");
        sb.append("    mdevTypeIdNotEndsWith: ")
                .append(toIndentedString(mdevTypeIdNotEndsWith))
                .append("\n");
        sb.append("    mdevTypeIdNotIn: ").append(toIndentedString(mdevTypeIdNotIn)).append("\n");
        sb.append("    mdevTypeIdNotStartsWith: ")
                .append(toIndentedString(mdevTypeIdNotStartsWith))
                .append("\n");
        sb.append("    mdevTypeIdStartsWith: ")
                .append(toIndentedString(mdevTypeIdStartsWith))
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
        sb.append("    partitioningState: ")
                .append(toIndentedString(partitioningState))
                .append("\n");
        sb.append("    partitioningStateIn: ")
                .append(toIndentedString(partitioningStateIn))
                .append("\n");
        sb.append("    partitioningStateNot: ")
                .append(toIndentedString(partitioningStateNot))
                .append("\n");
        sb.append("    partitioningStateNotIn: ")
                .append(toIndentedString(partitioningStateNotIn))
                .append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productIdContains: ")
                .append(toIndentedString(productIdContains))
                .append("\n");
        sb.append("    productIdEndsWith: ")
                .append(toIndentedString(productIdEndsWith))
                .append("\n");
        sb.append("    productIdGt: ").append(toIndentedString(productIdGt)).append("\n");
        sb.append("    productIdGte: ").append(toIndentedString(productIdGte)).append("\n");
        sb.append("    productIdIn: ").append(toIndentedString(productIdIn)).append("\n");
        sb.append("    productIdLt: ").append(toIndentedString(productIdLt)).append("\n");
        sb.append("    productIdLte: ").append(toIndentedString(productIdLte)).append("\n");
        sb.append("    productIdNot: ").append(toIndentedString(productIdNot)).append("\n");
        sb.append("    productIdNotContains: ")
                .append(toIndentedString(productIdNotContains))
                .append("\n");
        sb.append("    productIdNotEndsWith: ")
                .append(toIndentedString(productIdNotEndsWith))
                .append("\n");
        sb.append("    productIdNotIn: ").append(toIndentedString(productIdNotIn)).append("\n");
        sb.append("    productIdNotStartsWith: ")
                .append(toIndentedString(productIdNotStartsWith))
                .append("\n");
        sb.append("    productIdStartsWith: ")
                .append(toIndentedString(productIdStartsWith))
                .append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    slotContains: ").append(toIndentedString(slotContains)).append("\n");
        sb.append("    slotEndsWith: ").append(toIndentedString(slotEndsWith)).append("\n");
        sb.append("    slotGt: ").append(toIndentedString(slotGt)).append("\n");
        sb.append("    slotGte: ").append(toIndentedString(slotGte)).append("\n");
        sb.append("    slotIn: ").append(toIndentedString(slotIn)).append("\n");
        sb.append("    slotLt: ").append(toIndentedString(slotLt)).append("\n");
        sb.append("    slotLte: ").append(toIndentedString(slotLte)).append("\n");
        sb.append("    slotNot: ").append(toIndentedString(slotNot)).append("\n");
        sb.append("    slotNotContains: ").append(toIndentedString(slotNotContains)).append("\n");
        sb.append("    slotNotEndsWith: ").append(toIndentedString(slotNotEndsWith)).append("\n");
        sb.append("    slotNotIn: ").append(toIndentedString(slotNotIn)).append("\n");
        sb.append("    slotNotStartsWith: ")
                .append(toIndentedString(slotNotStartsWith))
                .append("\n");
        sb.append("    slotStartsWith: ").append(toIndentedString(slotStartsWith)).append("\n");
        sb.append("    sriovState: ").append(toIndentedString(sriovState)).append("\n");
        sb.append("    sriovStateIn: ").append(toIndentedString(sriovStateIn)).append("\n");
        sb.append("    sriovStateNot: ").append(toIndentedString(sriovStateNot)).append("\n");
        sb.append("    sriovStateNotIn: ").append(toIndentedString(sriovStateNotIn)).append("\n");
        sb.append("    subsystemProductId: ")
                .append(toIndentedString(subsystemProductId))
                .append("\n");
        sb.append("    subsystemProductIdContains: ")
                .append(toIndentedString(subsystemProductIdContains))
                .append("\n");
        sb.append("    subsystemProductIdEndsWith: ")
                .append(toIndentedString(subsystemProductIdEndsWith))
                .append("\n");
        sb.append("    subsystemProductIdGt: ")
                .append(toIndentedString(subsystemProductIdGt))
                .append("\n");
        sb.append("    subsystemProductIdGte: ")
                .append(toIndentedString(subsystemProductIdGte))
                .append("\n");
        sb.append("    subsystemProductIdIn: ")
                .append(toIndentedString(subsystemProductIdIn))
                .append("\n");
        sb.append("    subsystemProductIdLt: ")
                .append(toIndentedString(subsystemProductIdLt))
                .append("\n");
        sb.append("    subsystemProductIdLte: ")
                .append(toIndentedString(subsystemProductIdLte))
                .append("\n");
        sb.append("    subsystemProductIdNot: ")
                .append(toIndentedString(subsystemProductIdNot))
                .append("\n");
        sb.append("    subsystemProductIdNotContains: ")
                .append(toIndentedString(subsystemProductIdNotContains))
                .append("\n");
        sb.append("    subsystemProductIdNotEndsWith: ")
                .append(toIndentedString(subsystemProductIdNotEndsWith))
                .append("\n");
        sb.append("    subsystemProductIdNotIn: ")
                .append(toIndentedString(subsystemProductIdNotIn))
                .append("\n");
        sb.append("    subsystemProductIdNotStartsWith: ")
                .append(toIndentedString(subsystemProductIdNotStartsWith))
                .append("\n");
        sb.append("    subsystemProductIdStartsWith: ")
                .append(toIndentedString(subsystemProductIdStartsWith))
                .append("\n");
        sb.append("    subsystemVendorId: ")
                .append(toIndentedString(subsystemVendorId))
                .append("\n");
        sb.append("    subsystemVendorIdContains: ")
                .append(toIndentedString(subsystemVendorIdContains))
                .append("\n");
        sb.append("    subsystemVendorIdEndsWith: ")
                .append(toIndentedString(subsystemVendorIdEndsWith))
                .append("\n");
        sb.append("    subsystemVendorIdGt: ")
                .append(toIndentedString(subsystemVendorIdGt))
                .append("\n");
        sb.append("    subsystemVendorIdGte: ")
                .append(toIndentedString(subsystemVendorIdGte))
                .append("\n");
        sb.append("    subsystemVendorIdIn: ")
                .append(toIndentedString(subsystemVendorIdIn))
                .append("\n");
        sb.append("    subsystemVendorIdLt: ")
                .append(toIndentedString(subsystemVendorIdLt))
                .append("\n");
        sb.append("    subsystemVendorIdLte: ")
                .append(toIndentedString(subsystemVendorIdLte))
                .append("\n");
        sb.append("    subsystemVendorIdNot: ")
                .append(toIndentedString(subsystemVendorIdNot))
                .append("\n");
        sb.append("    subsystemVendorIdNotContains: ")
                .append(toIndentedString(subsystemVendorIdNotContains))
                .append("\n");
        sb.append("    subsystemVendorIdNotEndsWith: ")
                .append(toIndentedString(subsystemVendorIdNotEndsWith))
                .append("\n");
        sb.append("    subsystemVendorIdNotIn: ")
                .append(toIndentedString(subsystemVendorIdNotIn))
                .append("\n");
        sb.append("    subsystemVendorIdNotStartsWith: ")
                .append(toIndentedString(subsystemVendorIdNotStartsWith))
                .append("\n");
        sb.append("    subsystemVendorIdStartsWith: ")
                .append(toIndentedString(subsystemVendorIdStartsWith))
                .append("\n");
        sb.append("    totalMdevNum: ").append(toIndentedString(totalMdevNum)).append("\n");
        sb.append("    totalMdevNumGt: ").append(toIndentedString(totalMdevNumGt)).append("\n");
        sb.append("    totalMdevNumGte: ").append(toIndentedString(totalMdevNumGte)).append("\n");
        sb.append("    totalMdevNumIn: ").append(toIndentedString(totalMdevNumIn)).append("\n");
        sb.append("    totalMdevNumLt: ").append(toIndentedString(totalMdevNumLt)).append("\n");
        sb.append("    totalMdevNumLte: ").append(toIndentedString(totalMdevNumLte)).append("\n");
        sb.append("    totalMdevNumNot: ").append(toIndentedString(totalMdevNumNot)).append("\n");
        sb.append("    totalMdevNumNotIn: ")
                .append(toIndentedString(totalMdevNumNotIn))
                .append("\n");
        sb.append("    totalPartitioningNum: ")
                .append(toIndentedString(totalPartitioningNum))
                .append("\n");
        sb.append("    totalPartitioningNumGt: ")
                .append(toIndentedString(totalPartitioningNumGt))
                .append("\n");
        sb.append("    totalPartitioningNumGte: ")
                .append(toIndentedString(totalPartitioningNumGte))
                .append("\n");
        sb.append("    totalPartitioningNumIn: ")
                .append(toIndentedString(totalPartitioningNumIn))
                .append("\n");
        sb.append("    totalPartitioningNumLt: ")
                .append(toIndentedString(totalPartitioningNumLt))
                .append("\n");
        sb.append("    totalPartitioningNumLte: ")
                .append(toIndentedString(totalPartitioningNumLte))
                .append("\n");
        sb.append("    totalPartitioningNumNot: ")
                .append(toIndentedString(totalPartitioningNumNot))
                .append("\n");
        sb.append("    totalPartitioningNumNotIn: ")
                .append(toIndentedString(totalPartitioningNumNotIn))
                .append("\n");
        sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
        sb.append("    totalVfNumGt: ").append(toIndentedString(totalVfNumGt)).append("\n");
        sb.append("    totalVfNumGte: ").append(toIndentedString(totalVfNumGte)).append("\n");
        sb.append("    totalVfNumIn: ").append(toIndentedString(totalVfNumIn)).append("\n");
        sb.append("    totalVfNumLt: ").append(toIndentedString(totalVfNumLt)).append("\n");
        sb.append("    totalVfNumLte: ").append(toIndentedString(totalVfNumLte)).append("\n");
        sb.append("    totalVfNumNot: ").append(toIndentedString(totalVfNumNot)).append("\n");
        sb.append("    totalVfNumNotIn: ").append(toIndentedString(totalVfNumNotIn)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    usageTypeIn: ").append(toIndentedString(usageTypeIn)).append("\n");
        sb.append("    usageTypeNot: ").append(toIndentedString(usageTypeNot)).append("\n");
        sb.append("    usageTypeNotIn: ").append(toIndentedString(usageTypeNotIn)).append("\n");
        sb.append("    usedMdevNum: ").append(toIndentedString(usedMdevNum)).append("\n");
        sb.append("    usedMdevNumGt: ").append(toIndentedString(usedMdevNumGt)).append("\n");
        sb.append("    usedMdevNumGte: ").append(toIndentedString(usedMdevNumGte)).append("\n");
        sb.append("    usedMdevNumIn: ").append(toIndentedString(usedMdevNumIn)).append("\n");
        sb.append("    usedMdevNumLt: ").append(toIndentedString(usedMdevNumLt)).append("\n");
        sb.append("    usedMdevNumLte: ").append(toIndentedString(usedMdevNumLte)).append("\n");
        sb.append("    usedMdevNumNot: ").append(toIndentedString(usedMdevNumNot)).append("\n");
        sb.append("    usedMdevNumNotIn: ").append(toIndentedString(usedMdevNumNotIn)).append("\n");
        sb.append("    usedPartitioningNum: ")
                .append(toIndentedString(usedPartitioningNum))
                .append("\n");
        sb.append("    usedPartitioningNumGt: ")
                .append(toIndentedString(usedPartitioningNumGt))
                .append("\n");
        sb.append("    usedPartitioningNumGte: ")
                .append(toIndentedString(usedPartitioningNumGte))
                .append("\n");
        sb.append("    usedPartitioningNumIn: ")
                .append(toIndentedString(usedPartitioningNumIn))
                .append("\n");
        sb.append("    usedPartitioningNumLt: ")
                .append(toIndentedString(usedPartitioningNumLt))
                .append("\n");
        sb.append("    usedPartitioningNumLte: ")
                .append(toIndentedString(usedPartitioningNumLte))
                .append("\n");
        sb.append("    usedPartitioningNumNot: ")
                .append(toIndentedString(usedPartitioningNumNot))
                .append("\n");
        sb.append("    usedPartitioningNumNotIn: ")
                .append(toIndentedString(usedPartitioningNumNotIn))
                .append("\n");
        sb.append("    usedVfNum: ").append(toIndentedString(usedVfNum)).append("\n");
        sb.append("    usedVfNumGt: ").append(toIndentedString(usedVfNumGt)).append("\n");
        sb.append("    usedVfNumGte: ").append(toIndentedString(usedVfNumGte)).append("\n");
        sb.append("    usedVfNumIn: ").append(toIndentedString(usedVfNumIn)).append("\n");
        sb.append("    usedVfNumLt: ").append(toIndentedString(usedVfNumLt)).append("\n");
        sb.append("    usedVfNumLte: ").append(toIndentedString(usedVfNumLte)).append("\n");
        sb.append("    usedVfNumNot: ").append(toIndentedString(usedVfNumNot)).append("\n");
        sb.append("    usedVfNumNotIn: ").append(toIndentedString(usedVfNumNotIn)).append("\n");
        sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
        sb.append("    userUsageIn: ").append(toIndentedString(userUsageIn)).append("\n");
        sb.append("    userUsageNot: ").append(toIndentedString(userUsageNot)).append("\n");
        sb.append("    userUsageNotIn: ").append(toIndentedString(userUsageNotIn)).append("\n");
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    vendorIdContains: ").append(toIndentedString(vendorIdContains)).append("\n");
        sb.append("    vendorIdEndsWith: ").append(toIndentedString(vendorIdEndsWith)).append("\n");
        sb.append("    vendorIdGt: ").append(toIndentedString(vendorIdGt)).append("\n");
        sb.append("    vendorIdGte: ").append(toIndentedString(vendorIdGte)).append("\n");
        sb.append("    vendorIdIn: ").append(toIndentedString(vendorIdIn)).append("\n");
        sb.append("    vendorIdLt: ").append(toIndentedString(vendorIdLt)).append("\n");
        sb.append("    vendorIdLte: ").append(toIndentedString(vendorIdLte)).append("\n");
        sb.append("    vendorIdNot: ").append(toIndentedString(vendorIdNot)).append("\n");
        sb.append("    vendorIdNotContains: ")
                .append(toIndentedString(vendorIdNotContains))
                .append("\n");
        sb.append("    vendorIdNotEndsWith: ")
                .append(toIndentedString(vendorIdNotEndsWith))
                .append("\n");
        sb.append("    vendorIdNotIn: ").append(toIndentedString(vendorIdNotIn)).append("\n");
        sb.append("    vendorIdNotStartsWith: ")
                .append(toIndentedString(vendorIdNotStartsWith))
                .append("\n");
        sb.append("    vendorIdStartsWith: ")
                .append(toIndentedString(vendorIdStartsWith))
                .append("\n");
        sb.append("    verdorName: ").append(toIndentedString(verdorName)).append("\n");
        sb.append("    verdorNameContains: ")
                .append(toIndentedString(verdorNameContains))
                .append("\n");
        sb.append("    verdorNameEndsWith: ")
                .append(toIndentedString(verdorNameEndsWith))
                .append("\n");
        sb.append("    verdorNameGt: ").append(toIndentedString(verdorNameGt)).append("\n");
        sb.append("    verdorNameGte: ").append(toIndentedString(verdorNameGte)).append("\n");
        sb.append("    verdorNameIn: ").append(toIndentedString(verdorNameIn)).append("\n");
        sb.append("    verdorNameLt: ").append(toIndentedString(verdorNameLt)).append("\n");
        sb.append("    verdorNameLte: ").append(toIndentedString(verdorNameLte)).append("\n");
        sb.append("    verdorNameNot: ").append(toIndentedString(verdorNameNot)).append("\n");
        sb.append("    verdorNameNotContains: ")
                .append(toIndentedString(verdorNameNotContains))
                .append("\n");
        sb.append("    verdorNameNotEndsWith: ")
                .append(toIndentedString(verdorNameNotEndsWith))
                .append("\n");
        sb.append("    verdorNameNotIn: ").append(toIndentedString(verdorNameNotIn)).append("\n");
        sb.append("    verdorNameNotStartsWith: ")
                .append(toIndentedString(verdorNameNotStartsWith))
                .append("\n");
        sb.append("    verdorNameStartsWith: ")
                .append(toIndentedString(verdorNameStartsWith))
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

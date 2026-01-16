package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VlanWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VlanWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VlanWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VlanWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VlanWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
    private String gatewayIp;

    public static final String SERIALIZED_NAME_GATEWAY_IP_CONTAINS = "gateway_ip_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_CONTAINS)
    private String gatewayIpContains;

    public static final String SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH = "gateway_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH)
    private String gatewayIpEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_IP_GT = "gateway_ip_gt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_GT)
    private String gatewayIpGt;

    public static final String SERIALIZED_NAME_GATEWAY_IP_GTE = "gateway_ip_gte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_GTE)
    private String gatewayIpGte;

    public static final String SERIALIZED_NAME_GATEWAY_IP_IN = "gateway_ip_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_IN)
    private List<String> gatewayIpIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_IP_LT = "gateway_ip_lt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_LT)
    private String gatewayIpLt;

    public static final String SERIALIZED_NAME_GATEWAY_IP_LTE = "gateway_ip_lte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_LTE)
    private String gatewayIpLte;

    public static final String SERIALIZED_NAME_GATEWAY_IP_NOT = "gateway_ip_not";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT)
    private String gatewayIpNot;

    public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS = "gateway_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS)
    private String gatewayIpNotContains;

    public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH =
            "gateway_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH)
    private String gatewayIpNotEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_IN = "gateway_ip_not_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_IN)
    private List<String> gatewayIpNotIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH =
            "gateway_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH)
    private String gatewayIpNotStartsWith;

    public static final String SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH = "gateway_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH)
    private String gatewayIpStartsWith;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK = "gateway_subnetmask";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK)
    private String gatewaySubnetmask;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS =
            "gateway_subnetmask_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS)
    private String gatewaySubnetmaskContains;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH =
            "gateway_subnetmask_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH)
    private String gatewaySubnetmaskEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT = "gateway_subnetmask_gt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT)
    private String gatewaySubnetmaskGt;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE = "gateway_subnetmask_gte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE)
    private String gatewaySubnetmaskGte;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN = "gateway_subnetmask_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN)
    private List<String> gatewaySubnetmaskIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT = "gateway_subnetmask_lt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT)
    private String gatewaySubnetmaskLt;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE = "gateway_subnetmask_lte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE)
    private String gatewaySubnetmaskLte;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT = "gateway_subnetmask_not";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT)
    private String gatewaySubnetmaskNot;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS =
            "gateway_subnetmask_not_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS)
    private String gatewaySubnetmaskNotContains;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH =
            "gateway_subnetmask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH)
    private String gatewaySubnetmaskNotEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN =
            "gateway_subnetmask_not_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN)
    private List<String> gatewaySubnetmaskNotIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH =
            "gateway_subnetmask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH)
    private String gatewaySubnetmaskNotStartsWith;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH =
            "gateway_subnetmask_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH)
    private String gatewaySubnetmaskStartsWith;

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

    public static final String SERIALIZED_NAME_MODE_TYPE = "mode_type";

    @SerializedName(SERIALIZED_NAME_MODE_TYPE)
    private VlanModeType modeType;

    public static final String SERIALIZED_NAME_MODE_TYPE_IN = "mode_type_in";

    @SerializedName(SERIALIZED_NAME_MODE_TYPE_IN)
    private List<VlanModeType> modeTypeIn = null;

    public static final String SERIALIZED_NAME_MODE_TYPE_NOT = "mode_type_not";

    @SerializedName(SERIALIZED_NAME_MODE_TYPE_NOT)
    private VlanModeType modeTypeNot;

    public static final String SERIALIZED_NAME_MODE_TYPE_NOT_IN = "mode_type_not_in";

    @SerializedName(SERIALIZED_NAME_MODE_TYPE_NOT_IN)
    private List<VlanModeType> modeTypeNotIn = null;

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

    public static final String SERIALIZED_NAME_QOS_BURST = "qos_burst";

    @SerializedName(SERIALIZED_NAME_QOS_BURST)
    private Double qosBurst;

    public static final String SERIALIZED_NAME_QOS_BURST_GT = "qos_burst_gt";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_GT)
    private Double qosBurstGt;

    public static final String SERIALIZED_NAME_QOS_BURST_GTE = "qos_burst_gte";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_GTE)
    private Double qosBurstGte;

    public static final String SERIALIZED_NAME_QOS_BURST_IN = "qos_burst_in";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_IN)
    private List<Double> qosBurstIn = null;

    public static final String SERIALIZED_NAME_QOS_BURST_LT = "qos_burst_lt";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_LT)
    private Double qosBurstLt;

    public static final String SERIALIZED_NAME_QOS_BURST_LTE = "qos_burst_lte";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_LTE)
    private Double qosBurstLte;

    public static final String SERIALIZED_NAME_QOS_BURST_NOT = "qos_burst_not";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_NOT)
    private Double qosBurstNot;

    public static final String SERIALIZED_NAME_QOS_BURST_NOT_IN = "qos_burst_not_in";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_NOT_IN)
    private List<Double> qosBurstNotIn = null;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH = "qos_max_bandwidth";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH)
    private Double qosMaxBandwidth;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT = "qos_max_bandwidth_gt";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT)
    private Double qosMaxBandwidthGt;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE = "qos_max_bandwidth_gte";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE)
    private Double qosMaxBandwidthGte;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN = "qos_max_bandwidth_in";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN)
    private List<Double> qosMaxBandwidthIn = null;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT = "qos_max_bandwidth_lt";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT)
    private Double qosMaxBandwidthLt;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE = "qos_max_bandwidth_lte";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE)
    private Double qosMaxBandwidthLte;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT = "qos_max_bandwidth_not";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT)
    private Double qosMaxBandwidthNot;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN =
            "qos_max_bandwidth_not_in";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN)
    private List<Double> qosMaxBandwidthNotIn = null;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH = "qos_min_bandwidth";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH)
    private Double qosMinBandwidth;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT = "qos_min_bandwidth_gt";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT)
    private Double qosMinBandwidthGt;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE = "qos_min_bandwidth_gte";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE)
    private Double qosMinBandwidthGte;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN = "qos_min_bandwidth_in";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN)
    private List<Double> qosMinBandwidthIn = null;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT = "qos_min_bandwidth_lt";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT)
    private Double qosMinBandwidthLt;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE = "qos_min_bandwidth_lte";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE)
    private Double qosMinBandwidthLte;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT = "qos_min_bandwidth_not";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT)
    private Double qosMinBandwidthNot;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN =
            "qos_min_bandwidth_not_in";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN)
    private List<Double> qosMinBandwidthNotIn = null;

    public static final String SERIALIZED_NAME_QOS_PRIORITY = "qos_priority";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY)
    private Integer qosPriority;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_GT = "qos_priority_gt";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_GT)
    private Integer qosPriorityGt;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_GTE = "qos_priority_gte";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_GTE)
    private Integer qosPriorityGte;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_IN = "qos_priority_in";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_IN)
    private List<Integer> qosPriorityIn = null;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_LT = "qos_priority_lt";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_LT)
    private Integer qosPriorityLt;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_LTE = "qos_priority_lte";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_LTE)
    private Integer qosPriorityLte;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_NOT = "qos_priority_not";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_NOT)
    private Integer qosPriorityNot;

    public static final String SERIALIZED_NAME_QOS_PRIORITY_NOT_IN = "qos_priority_not_in";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY_NOT_IN)
    private List<Integer> qosPriorityNotIn = null;

    public static final String SERIALIZED_NAME_SUBNETMASK = "subnetmask";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK)
    private String subnetmask;

    public static final String SERIALIZED_NAME_SUBNETMASK_CONTAINS = "subnetmask_contains";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_CONTAINS)
    private String subnetmaskContains;

    public static final String SERIALIZED_NAME_SUBNETMASK_ENDS_WITH = "subnetmask_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_ENDS_WITH)
    private String subnetmaskEndsWith;

    public static final String SERIALIZED_NAME_SUBNETMASK_GT = "subnetmask_gt";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_GT)
    private String subnetmaskGt;

    public static final String SERIALIZED_NAME_SUBNETMASK_GTE = "subnetmask_gte";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_GTE)
    private String subnetmaskGte;

    public static final String SERIALIZED_NAME_SUBNETMASK_IN = "subnetmask_in";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_IN)
    private List<String> subnetmaskIn = null;

    public static final String SERIALIZED_NAME_SUBNETMASK_LT = "subnetmask_lt";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_LT)
    private String subnetmaskLt;

    public static final String SERIALIZED_NAME_SUBNETMASK_LTE = "subnetmask_lte";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_LTE)
    private String subnetmaskLte;

    public static final String SERIALIZED_NAME_SUBNETMASK_NOT = "subnetmask_not";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_NOT)
    private String subnetmaskNot;

    public static final String SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS = "subnetmask_not_contains";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS)
    private String subnetmaskNotContains;

    public static final String SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH =
            "subnetmask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH)
    private String subnetmaskNotEndsWith;

    public static final String SERIALIZED_NAME_SUBNETMASK_NOT_IN = "subnetmask_not_in";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_NOT_IN)
    private List<String> subnetmaskNotIn = null;

    public static final String SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH =
            "subnetmask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH)
    private String subnetmaskNotStartsWith;

    public static final String SERIALIZED_NAME_SUBNETMASK_STARTS_WITH = "subnetmask_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK_STARTS_WITH)
    private String subnetmaskStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private NetworkType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<NetworkType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private NetworkType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<NetworkType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VDS = "vds";

    @SerializedName(SERIALIZED_NAME_VDS)
    private VdsWhereInput vds;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private Integer vlanId;

    public static final String SERIALIZED_NAME_VLAN_ID_GT = "vlan_id_gt";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_GT)
    private Integer vlanIdGt;

    public static final String SERIALIZED_NAME_VLAN_ID_GTE = "vlan_id_gte";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_GTE)
    private Integer vlanIdGte;

    public static final String SERIALIZED_NAME_VLAN_ID_IN = "vlan_id_in";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_IN)
    private List<Integer> vlanIdIn = null;

    public static final String SERIALIZED_NAME_VLAN_ID_LT = "vlan_id_lt";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_LT)
    private Integer vlanIdLt;

    public static final String SERIALIZED_NAME_VLAN_ID_LTE = "vlan_id_lte";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_LTE)
    private Integer vlanIdLte;

    public static final String SERIALIZED_NAME_VLAN_ID_NOT = "vlan_id_not";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_NOT)
    private Integer vlanIdNot;

    public static final String SERIALIZED_NAME_VLAN_ID_NOT_IN = "vlan_id_not_in";

    @SerializedName(SERIALIZED_NAME_VLAN_ID_NOT_IN)
    private List<Integer> vlanIdNotIn = null;

    public static final String SERIALIZED_NAME_VM_NICS_EVERY = "vm_nics_every";

    @SerializedName(SERIALIZED_NAME_VM_NICS_EVERY)
    private VmNicWhereInput vmNicsEvery;

    public static final String SERIALIZED_NAME_VM_NICS_NONE = "vm_nics_none";

    @SerializedName(SERIALIZED_NAME_VM_NICS_NONE)
    private VmNicWhereInput vmNicsNone;

    public static final String SERIALIZED_NAME_VM_NICS_SOME = "vm_nics_some";

    @SerializedName(SERIALIZED_NAME_VM_NICS_SOME)
    private VmNicWhereInput vmNicsSome;

    public VlanWhereInput() {}

    public VlanWhereInput AND(List<VlanWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VlanWhereInput addANDItem(VlanWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VlanWhereInput>();
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
    public List<VlanWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VlanWhereInput> AND) {
        this.AND = AND;
    }

    public VlanWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VlanWhereInput AND_ExplictlyNonNull() {
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

    public VlanWhereInput NOT(List<VlanWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VlanWhereInput addNOTItem(VlanWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VlanWhereInput>();
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
    public List<VlanWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VlanWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VlanWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VlanWhereInput NOT_ExplictlyNonNull() {
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

    public VlanWhereInput OR(List<VlanWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VlanWhereInput addORItem(VlanWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VlanWhereInput>();
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
    public List<VlanWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VlanWhereInput> OR) {
        this.OR = OR;
    }

    public VlanWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VlanWhereInput OR_ExplictlyNonNull() {
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

    public VlanWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VlanWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VlanWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VlanWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VlanWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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

    public VlanWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VlanWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VlanWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VlanWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VlanWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VlanWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VlanWhereInput addEntityAsyncStatusNotInItem(
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

    public VlanWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VlanWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VlanWhereInput gatewayIp(String gatewayIp) {

        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * Get gatewayIp
     *
     * @return gatewayIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public VlanWhereInput gatewayIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public VlanWhereInput gatewayIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public void setGatewayIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP);
        }
    }

    public boolean getGatewayIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP);
    }

    public VlanWhereInput gatewayIpContains(String gatewayIpContains) {

        this.gatewayIpContains = gatewayIpContains;
        return this;
    }

    /**
     * Get gatewayIpContains
     *
     * @return gatewayIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpContains() {
        return gatewayIpContains;
    }

    public void setGatewayIpContains(String gatewayIpContains) {
        this.gatewayIpContains = gatewayIpContains;
    }

    public VlanWhereInput gatewayIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_CONTAINS);
        return this;
    }

    public VlanWhereInput gatewayIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_CONTAINS);
        return this;
    }

    public void setGatewayIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_CONTAINS);
        }
    }

    public boolean getGatewayIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_CONTAINS);
    }

    public VlanWhereInput gatewayIpEndsWith(String gatewayIpEndsWith) {

        this.gatewayIpEndsWith = gatewayIpEndsWith;
        return this;
    }

    /**
     * Get gatewayIpEndsWith
     *
     * @return gatewayIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpEndsWith() {
        return gatewayIpEndsWith;
    }

    public void setGatewayIpEndsWith(String gatewayIpEndsWith) {
        this.gatewayIpEndsWith = gatewayIpEndsWith;
    }

    public VlanWhereInput gatewayIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH);
        return this;
    }

    public VlanWhereInput gatewayIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH);
        return this;
    }

    public void setGatewayIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH);
        }
    }

    public boolean getGatewayIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_ENDS_WITH);
    }

    public VlanWhereInput gatewayIpGt(String gatewayIpGt) {

        this.gatewayIpGt = gatewayIpGt;
        return this;
    }

    /**
     * Get gatewayIpGt
     *
     * @return gatewayIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpGt() {
        return gatewayIpGt;
    }

    public void setGatewayIpGt(String gatewayIpGt) {
        this.gatewayIpGt = gatewayIpGt;
    }

    public VlanWhereInput gatewayIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_GT);
        return this;
    }

    public VlanWhereInput gatewayIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_GT);
        return this;
    }

    public void setGatewayIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_GT);
        }
    }

    public boolean getGatewayIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_GT);
    }

    public VlanWhereInput gatewayIpGte(String gatewayIpGte) {

        this.gatewayIpGte = gatewayIpGte;
        return this;
    }

    /**
     * Get gatewayIpGte
     *
     * @return gatewayIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpGte() {
        return gatewayIpGte;
    }

    public void setGatewayIpGte(String gatewayIpGte) {
        this.gatewayIpGte = gatewayIpGte;
    }

    public VlanWhereInput gatewayIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_GTE);
        return this;
    }

    public VlanWhereInput gatewayIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_GTE);
        return this;
    }

    public void setGatewayIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_GTE);
        }
    }

    public boolean getGatewayIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_GTE);
    }

    public VlanWhereInput gatewayIpIn(List<String> gatewayIpIn) {

        this.gatewayIpIn = gatewayIpIn;
        return this;
    }

    public VlanWhereInput addGatewayIpInItem(String gatewayIpInItem) {
        if (this.gatewayIpIn == null) {
            this.gatewayIpIn = new ArrayList<String>();
        }
        this.gatewayIpIn.add(gatewayIpInItem);
        return this;
    }

    /**
     * Get gatewayIpIn
     *
     * @return gatewayIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewayIpIn() {
        return gatewayIpIn;
    }

    public void setGatewayIpIn(List<String> gatewayIpIn) {
        this.gatewayIpIn = gatewayIpIn;
    }

    public VlanWhereInput gatewayIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_IN);
        return this;
    }

    public VlanWhereInput gatewayIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_IN);
        return this;
    }

    public void setGatewayIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_IN);
        }
    }

    public boolean getGatewayIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_IN);
    }

    public VlanWhereInput gatewayIpLt(String gatewayIpLt) {

        this.gatewayIpLt = gatewayIpLt;
        return this;
    }

    /**
     * Get gatewayIpLt
     *
     * @return gatewayIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpLt() {
        return gatewayIpLt;
    }

    public void setGatewayIpLt(String gatewayIpLt) {
        this.gatewayIpLt = gatewayIpLt;
    }

    public VlanWhereInput gatewayIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_LT);
        return this;
    }

    public VlanWhereInput gatewayIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_LT);
        return this;
    }

    public void setGatewayIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_LT);
        }
    }

    public boolean getGatewayIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_LT);
    }

    public VlanWhereInput gatewayIpLte(String gatewayIpLte) {

        this.gatewayIpLte = gatewayIpLte;
        return this;
    }

    /**
     * Get gatewayIpLte
     *
     * @return gatewayIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpLte() {
        return gatewayIpLte;
    }

    public void setGatewayIpLte(String gatewayIpLte) {
        this.gatewayIpLte = gatewayIpLte;
    }

    public VlanWhereInput gatewayIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_LTE);
        return this;
    }

    public VlanWhereInput gatewayIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_LTE);
        return this;
    }

    public void setGatewayIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_LTE);
        }
    }

    public boolean getGatewayIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_LTE);
    }

    public VlanWhereInput gatewayIpNot(String gatewayIpNot) {

        this.gatewayIpNot = gatewayIpNot;
        return this;
    }

    /**
     * Get gatewayIpNot
     *
     * @return gatewayIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpNot() {
        return gatewayIpNot;
    }

    public void setGatewayIpNot(String gatewayIpNot) {
        this.gatewayIpNot = gatewayIpNot;
    }

    public VlanWhereInput gatewayIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT);
        return this;
    }

    public VlanWhereInput gatewayIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT);
        return this;
    }

    public void setGatewayIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT);
        }
    }

    public boolean getGatewayIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_NOT);
    }

    public VlanWhereInput gatewayIpNotContains(String gatewayIpNotContains) {

        this.gatewayIpNotContains = gatewayIpNotContains;
        return this;
    }

    /**
     * Get gatewayIpNotContains
     *
     * @return gatewayIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpNotContains() {
        return gatewayIpNotContains;
    }

    public void setGatewayIpNotContains(String gatewayIpNotContains) {
        this.gatewayIpNotContains = gatewayIpNotContains;
    }

    public VlanWhereInput gatewayIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS);
        return this;
    }

    public VlanWhereInput gatewayIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS);
        return this;
    }

    public void setGatewayIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS);
        }
    }

    public boolean getGatewayIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_NOT_CONTAINS);
    }

    public VlanWhereInput gatewayIpNotEndsWith(String gatewayIpNotEndsWith) {

        this.gatewayIpNotEndsWith = gatewayIpNotEndsWith;
        return this;
    }

    /**
     * Get gatewayIpNotEndsWith
     *
     * @return gatewayIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpNotEndsWith() {
        return gatewayIpNotEndsWith;
    }

    public void setGatewayIpNotEndsWith(String gatewayIpNotEndsWith) {
        this.gatewayIpNotEndsWith = gatewayIpNotEndsWith;
    }

    public VlanWhereInput gatewayIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH);
        return this;
    }

    public VlanWhereInput gatewayIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setGatewayIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getGatewayIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_NOT_ENDS_WITH);
    }

    public VlanWhereInput gatewayIpNotIn(List<String> gatewayIpNotIn) {

        this.gatewayIpNotIn = gatewayIpNotIn;
        return this;
    }

    public VlanWhereInput addGatewayIpNotInItem(String gatewayIpNotInItem) {
        if (this.gatewayIpNotIn == null) {
            this.gatewayIpNotIn = new ArrayList<String>();
        }
        this.gatewayIpNotIn.add(gatewayIpNotInItem);
        return this;
    }

    /**
     * Get gatewayIpNotIn
     *
     * @return gatewayIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewayIpNotIn() {
        return gatewayIpNotIn;
    }

    public void setGatewayIpNotIn(List<String> gatewayIpNotIn) {
        this.gatewayIpNotIn = gatewayIpNotIn;
    }

    public VlanWhereInput gatewayIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_IN);
        return this;
    }

    public VlanWhereInput gatewayIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_IN);
        return this;
    }

    public void setGatewayIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_IN);
        }
    }

    public boolean getGatewayIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_NOT_IN);
    }

    public VlanWhereInput gatewayIpNotStartsWith(String gatewayIpNotStartsWith) {

        this.gatewayIpNotStartsWith = gatewayIpNotStartsWith;
        return this;
    }

    /**
     * Get gatewayIpNotStartsWith
     *
     * @return gatewayIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpNotStartsWith() {
        return gatewayIpNotStartsWith;
    }

    public void setGatewayIpNotStartsWith(String gatewayIpNotStartsWith) {
        this.gatewayIpNotStartsWith = gatewayIpNotStartsWith;
    }

    public VlanWhereInput gatewayIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH);
        return this;
    }

    public VlanWhereInput gatewayIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setGatewayIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getGatewayIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_NOT_STARTS_WITH);
    }

    public VlanWhereInput gatewayIpStartsWith(String gatewayIpStartsWith) {

        this.gatewayIpStartsWith = gatewayIpStartsWith;
        return this;
    }

    /**
     * Get gatewayIpStartsWith
     *
     * @return gatewayIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIpStartsWith() {
        return gatewayIpStartsWith;
    }

    public void setGatewayIpStartsWith(String gatewayIpStartsWith) {
        this.gatewayIpStartsWith = gatewayIpStartsWith;
    }

    public VlanWhereInput gatewayIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH);
        return this;
    }

    public VlanWhereInput gatewayIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH);
        return this;
    }

    public void setGatewayIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH);
        }
    }

    public boolean getGatewayIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP_STARTS_WITH);
    }

    public VlanWhereInput gatewaySubnetmask(String gatewaySubnetmask) {

        this.gatewaySubnetmask = gatewaySubnetmask;
        return this;
    }

    /**
     * Get gatewaySubnetmask
     *
     * @return gatewaySubnetmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmask() {
        return gatewaySubnetmask;
    }

    public void setGatewaySubnetmask(String gatewaySubnetmask) {
        this.gatewaySubnetmask = gatewaySubnetmask;
    }

    public VlanWhereInput gatewaySubnetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK);
        return this;
    }

    public VlanWhereInput gatewaySubnetmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK);
        return this;
    }

    public void setGatewaySubnetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK);
        }
    }

    public boolean getGatewaySubnetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK);
    }

    public VlanWhereInput gatewaySubnetmaskContains(String gatewaySubnetmaskContains) {

        this.gatewaySubnetmaskContains = gatewaySubnetmaskContains;
        return this;
    }

    /**
     * Get gatewaySubnetmaskContains
     *
     * @return gatewaySubnetmaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskContains() {
        return gatewaySubnetmaskContains;
    }

    public void setGatewaySubnetmaskContains(String gatewaySubnetmaskContains) {
        this.gatewaySubnetmaskContains = gatewaySubnetmaskContains;
    }

    public VlanWhereInput gatewaySubnetmaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS);
        return this;
    }

    public void setGatewaySubnetmaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS);
        }
    }

    public boolean getGatewaySubnetmaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_CONTAINS);
    }

    public VlanWhereInput gatewaySubnetmaskEndsWith(String gatewaySubnetmaskEndsWith) {

        this.gatewaySubnetmaskEndsWith = gatewaySubnetmaskEndsWith;
        return this;
    }

    /**
     * Get gatewaySubnetmaskEndsWith
     *
     * @return gatewaySubnetmaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskEndsWith() {
        return gatewaySubnetmaskEndsWith;
    }

    public void setGatewaySubnetmaskEndsWith(String gatewaySubnetmaskEndsWith) {
        this.gatewaySubnetmaskEndsWith = gatewaySubnetmaskEndsWith;
    }

    public VlanWhereInput gatewaySubnetmaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH);
        return this;
    }

    public void setGatewaySubnetmaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH);
        }
    }

    public boolean getGatewaySubnetmaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_ENDS_WITH);
    }

    public VlanWhereInput gatewaySubnetmaskGt(String gatewaySubnetmaskGt) {

        this.gatewaySubnetmaskGt = gatewaySubnetmaskGt;
        return this;
    }

    /**
     * Get gatewaySubnetmaskGt
     *
     * @return gatewaySubnetmaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskGt() {
        return gatewaySubnetmaskGt;
    }

    public void setGatewaySubnetmaskGt(String gatewaySubnetmaskGt) {
        this.gatewaySubnetmaskGt = gatewaySubnetmaskGt;
    }

    public VlanWhereInput gatewaySubnetmaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT);
        return this;
    }

    public void setGatewaySubnetmaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT);
        }
    }

    public boolean getGatewaySubnetmaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GT);
    }

    public VlanWhereInput gatewaySubnetmaskGte(String gatewaySubnetmaskGte) {

        this.gatewaySubnetmaskGte = gatewaySubnetmaskGte;
        return this;
    }

    /**
     * Get gatewaySubnetmaskGte
     *
     * @return gatewaySubnetmaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskGte() {
        return gatewaySubnetmaskGte;
    }

    public void setGatewaySubnetmaskGte(String gatewaySubnetmaskGte) {
        this.gatewaySubnetmaskGte = gatewaySubnetmaskGte;
    }

    public VlanWhereInput gatewaySubnetmaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE);
        return this;
    }

    public void setGatewaySubnetmaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE);
        }
    }

    public boolean getGatewaySubnetmaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_GTE);
    }

    public VlanWhereInput gatewaySubnetmaskIn(List<String> gatewaySubnetmaskIn) {

        this.gatewaySubnetmaskIn = gatewaySubnetmaskIn;
        return this;
    }

    public VlanWhereInput addGatewaySubnetmaskInItem(String gatewaySubnetmaskInItem) {
        if (this.gatewaySubnetmaskIn == null) {
            this.gatewaySubnetmaskIn = new ArrayList<String>();
        }
        this.gatewaySubnetmaskIn.add(gatewaySubnetmaskInItem);
        return this;
    }

    /**
     * Get gatewaySubnetmaskIn
     *
     * @return gatewaySubnetmaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewaySubnetmaskIn() {
        return gatewaySubnetmaskIn;
    }

    public void setGatewaySubnetmaskIn(List<String> gatewaySubnetmaskIn) {
        this.gatewaySubnetmaskIn = gatewaySubnetmaskIn;
    }

    public VlanWhereInput gatewaySubnetmaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN);
        return this;
    }

    public void setGatewaySubnetmaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN);
        }
    }

    public boolean getGatewaySubnetmaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_IN);
    }

    public VlanWhereInput gatewaySubnetmaskLt(String gatewaySubnetmaskLt) {

        this.gatewaySubnetmaskLt = gatewaySubnetmaskLt;
        return this;
    }

    /**
     * Get gatewaySubnetmaskLt
     *
     * @return gatewaySubnetmaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskLt() {
        return gatewaySubnetmaskLt;
    }

    public void setGatewaySubnetmaskLt(String gatewaySubnetmaskLt) {
        this.gatewaySubnetmaskLt = gatewaySubnetmaskLt;
    }

    public VlanWhereInput gatewaySubnetmaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT);
        return this;
    }

    public void setGatewaySubnetmaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT);
        }
    }

    public boolean getGatewaySubnetmaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LT);
    }

    public VlanWhereInput gatewaySubnetmaskLte(String gatewaySubnetmaskLte) {

        this.gatewaySubnetmaskLte = gatewaySubnetmaskLte;
        return this;
    }

    /**
     * Get gatewaySubnetmaskLte
     *
     * @return gatewaySubnetmaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskLte() {
        return gatewaySubnetmaskLte;
    }

    public void setGatewaySubnetmaskLte(String gatewaySubnetmaskLte) {
        this.gatewaySubnetmaskLte = gatewaySubnetmaskLte;
    }

    public VlanWhereInput gatewaySubnetmaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE);
        return this;
    }

    public void setGatewaySubnetmaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE);
        }
    }

    public boolean getGatewaySubnetmaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_LTE);
    }

    public VlanWhereInput gatewaySubnetmaskNot(String gatewaySubnetmaskNot) {

        this.gatewaySubnetmaskNot = gatewaySubnetmaskNot;
        return this;
    }

    /**
     * Get gatewaySubnetmaskNot
     *
     * @return gatewaySubnetmaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskNot() {
        return gatewaySubnetmaskNot;
    }

    public void setGatewaySubnetmaskNot(String gatewaySubnetmaskNot) {
        this.gatewaySubnetmaskNot = gatewaySubnetmaskNot;
    }

    public VlanWhereInput gatewaySubnetmaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT);
        return this;
    }

    public void setGatewaySubnetmaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT);
        }
    }

    public boolean getGatewaySubnetmaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT);
    }

    public VlanWhereInput gatewaySubnetmaskNotContains(String gatewaySubnetmaskNotContains) {

        this.gatewaySubnetmaskNotContains = gatewaySubnetmaskNotContains;
        return this;
    }

    /**
     * Get gatewaySubnetmaskNotContains
     *
     * @return gatewaySubnetmaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskNotContains() {
        return gatewaySubnetmaskNotContains;
    }

    public void setGatewaySubnetmaskNotContains(String gatewaySubnetmaskNotContains) {
        this.gatewaySubnetmaskNotContains = gatewaySubnetmaskNotContains;
    }

    public VlanWhereInput gatewaySubnetmaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS);
        return this;
    }

    public void setGatewaySubnetmaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS);
        }
    }

    public boolean getGatewaySubnetmaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_CONTAINS);
    }

    public VlanWhereInput gatewaySubnetmaskNotEndsWith(String gatewaySubnetmaskNotEndsWith) {

        this.gatewaySubnetmaskNotEndsWith = gatewaySubnetmaskNotEndsWith;
        return this;
    }

    /**
     * Get gatewaySubnetmaskNotEndsWith
     *
     * @return gatewaySubnetmaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskNotEndsWith() {
        return gatewaySubnetmaskNotEndsWith;
    }

    public void setGatewaySubnetmaskNotEndsWith(String gatewaySubnetmaskNotEndsWith) {
        this.gatewaySubnetmaskNotEndsWith = gatewaySubnetmaskNotEndsWith;
    }

    public VlanWhereInput gatewaySubnetmaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH);
        return this;
    }

    public void setGatewaySubnetmaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH);
        }
    }

    public boolean getGatewaySubnetmaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_ENDS_WITH);
    }

    public VlanWhereInput gatewaySubnetmaskNotIn(List<String> gatewaySubnetmaskNotIn) {

        this.gatewaySubnetmaskNotIn = gatewaySubnetmaskNotIn;
        return this;
    }

    public VlanWhereInput addGatewaySubnetmaskNotInItem(String gatewaySubnetmaskNotInItem) {
        if (this.gatewaySubnetmaskNotIn == null) {
            this.gatewaySubnetmaskNotIn = new ArrayList<String>();
        }
        this.gatewaySubnetmaskNotIn.add(gatewaySubnetmaskNotInItem);
        return this;
    }

    /**
     * Get gatewaySubnetmaskNotIn
     *
     * @return gatewaySubnetmaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewaySubnetmaskNotIn() {
        return gatewaySubnetmaskNotIn;
    }

    public void setGatewaySubnetmaskNotIn(List<String> gatewaySubnetmaskNotIn) {
        this.gatewaySubnetmaskNotIn = gatewaySubnetmaskNotIn;
    }

    public VlanWhereInput gatewaySubnetmaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN);
        return this;
    }

    public void setGatewaySubnetmaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN);
        }
    }

    public boolean getGatewaySubnetmaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_IN);
    }

    public VlanWhereInput gatewaySubnetmaskNotStartsWith(String gatewaySubnetmaskNotStartsWith) {

        this.gatewaySubnetmaskNotStartsWith = gatewaySubnetmaskNotStartsWith;
        return this;
    }

    /**
     * Get gatewaySubnetmaskNotStartsWith
     *
     * @return gatewaySubnetmaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskNotStartsWith() {
        return gatewaySubnetmaskNotStartsWith;
    }

    public void setGatewaySubnetmaskNotStartsWith(String gatewaySubnetmaskNotStartsWith) {
        this.gatewaySubnetmaskNotStartsWith = gatewaySubnetmaskNotStartsWith;
    }

    public VlanWhereInput gatewaySubnetmaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH);
        return this;
    }

    public void setGatewaySubnetmaskNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH);
        }
    }

    public boolean getGatewaySubnetmaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_NOT_STARTS_WITH);
    }

    public VlanWhereInput gatewaySubnetmaskStartsWith(String gatewaySubnetmaskStartsWith) {

        this.gatewaySubnetmaskStartsWith = gatewaySubnetmaskStartsWith;
        return this;
    }

    /**
     * Get gatewaySubnetmaskStartsWith
     *
     * @return gatewaySubnetmaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewaySubnetmaskStartsWith() {
        return gatewaySubnetmaskStartsWith;
    }

    public void setGatewaySubnetmaskStartsWith(String gatewaySubnetmaskStartsWith) {
        this.gatewaySubnetmaskStartsWith = gatewaySubnetmaskStartsWith;
    }

    public VlanWhereInput gatewaySubnetmaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH);
        return this;
    }

    public VlanWhereInput gatewaySubnetmaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH);
        return this;
    }

    public void setGatewaySubnetmaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH);
        }
    }

    public boolean getGatewaySubnetmaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_SUBNETMASK_STARTS_WITH);
    }

    public VlanWhereInput id(String id) {

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

    public VlanWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VlanWhereInput id_ExplictlyNonNull() {
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

    public VlanWhereInput idContains(String idContains) {

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

    public VlanWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VlanWhereInput idContains_ExplictlyNonNull() {
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

    public VlanWhereInput idEndsWith(String idEndsWith) {

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

    public VlanWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VlanWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VlanWhereInput idGt(String idGt) {

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

    public VlanWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VlanWhereInput idGt_ExplictlyNonNull() {
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

    public VlanWhereInput idGte(String idGte) {

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

    public VlanWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VlanWhereInput idGte_ExplictlyNonNull() {
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

    public VlanWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VlanWhereInput addIdInItem(String idInItem) {
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

    public VlanWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VlanWhereInput idIn_ExplictlyNonNull() {
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

    public VlanWhereInput idLt(String idLt) {

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

    public VlanWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VlanWhereInput idLt_ExplictlyNonNull() {
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

    public VlanWhereInput idLte(String idLte) {

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

    public VlanWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VlanWhereInput idLte_ExplictlyNonNull() {
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

    public VlanWhereInput idNot(String idNot) {

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

    public VlanWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VlanWhereInput idNot_ExplictlyNonNull() {
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

    public VlanWhereInput idNotContains(String idNotContains) {

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

    public VlanWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VlanWhereInput idNotContains_ExplictlyNonNull() {
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

    public VlanWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VlanWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VlanWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VlanWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VlanWhereInput addIdNotInItem(String idNotInItem) {
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

    public VlanWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VlanWhereInput idNotIn_ExplictlyNonNull() {
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

    public VlanWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VlanWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VlanWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VlanWhereInput idStartsWith(String idStartsWith) {

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

    public VlanWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VlanWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VlanWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public VlanWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public VlanWhereInput labelsEvery_ExplictlyNonNull() {
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

    public VlanWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public VlanWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public VlanWhereInput labelsNone_ExplictlyNonNull() {
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

    public VlanWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public VlanWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public VlanWhereInput labelsSome_ExplictlyNonNull() {
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

    public VlanWhereInput localId(String localId) {

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

    public VlanWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VlanWhereInput localId_ExplictlyNonNull() {
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

    public VlanWhereInput localIdContains(String localIdContains) {

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

    public VlanWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VlanWhereInput localIdContains_ExplictlyNonNull() {
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

    public VlanWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VlanWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VlanWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VlanWhereInput localIdGt(String localIdGt) {

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

    public VlanWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VlanWhereInput localIdGt_ExplictlyNonNull() {
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

    public VlanWhereInput localIdGte(String localIdGte) {

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

    public VlanWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VlanWhereInput localIdGte_ExplictlyNonNull() {
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

    public VlanWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VlanWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VlanWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VlanWhereInput localIdIn_ExplictlyNonNull() {
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

    public VlanWhereInput localIdLt(String localIdLt) {

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

    public VlanWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VlanWhereInput localIdLt_ExplictlyNonNull() {
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

    public VlanWhereInput localIdLte(String localIdLte) {

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

    public VlanWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VlanWhereInput localIdLte_ExplictlyNonNull() {
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

    public VlanWhereInput localIdNot(String localIdNot) {

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

    public VlanWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VlanWhereInput localIdNot_ExplictlyNonNull() {
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

    public VlanWhereInput localIdNotContains(String localIdNotContains) {

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

    public VlanWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VlanWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VlanWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VlanWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VlanWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VlanWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VlanWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VlanWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VlanWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VlanWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VlanWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VlanWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VlanWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VlanWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VlanWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VlanWhereInput modeType(VlanModeType modeType) {

        this.modeType = modeType;
        return this;
    }

    /**
     * Get modeType
     *
     * @return modeType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanModeType getModeType() {
        return modeType;
    }

    public void setModeType(VlanModeType modeType) {
        this.modeType = modeType;
    }

    public VlanWhereInput modeType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE);
        return this;
    }

    public VlanWhereInput modeType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE);
        return this;
    }

    public void setModeType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE);
        }
    }

    public boolean getModeType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_TYPE);
    }

    public VlanWhereInput modeTypeIn(List<VlanModeType> modeTypeIn) {

        this.modeTypeIn = modeTypeIn;
        return this;
    }

    public VlanWhereInput addModeTypeInItem(VlanModeType modeTypeInItem) {
        if (this.modeTypeIn == null) {
            this.modeTypeIn = new ArrayList<VlanModeType>();
        }
        this.modeTypeIn.add(modeTypeInItem);
        return this;
    }

    /**
     * Get modeTypeIn
     *
     * @return modeTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VlanModeType> getModeTypeIn() {
        return modeTypeIn;
    }

    public void setModeTypeIn(List<VlanModeType> modeTypeIn) {
        this.modeTypeIn = modeTypeIn;
    }

    public VlanWhereInput modeTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE_IN);
        return this;
    }

    public VlanWhereInput modeTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE_IN);
        return this;
    }

    public void setModeTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE_IN);
        }
    }

    public boolean getModeTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_TYPE_IN);
    }

    public VlanWhereInput modeTypeNot(VlanModeType modeTypeNot) {

        this.modeTypeNot = modeTypeNot;
        return this;
    }

    /**
     * Get modeTypeNot
     *
     * @return modeTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanModeType getModeTypeNot() {
        return modeTypeNot;
    }

    public void setModeTypeNot(VlanModeType modeTypeNot) {
        this.modeTypeNot = modeTypeNot;
    }

    public VlanWhereInput modeTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE_NOT);
        return this;
    }

    public VlanWhereInput modeTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE_NOT);
        return this;
    }

    public void setModeTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE_NOT);
        }
    }

    public boolean getModeTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_TYPE_NOT);
    }

    public VlanWhereInput modeTypeNotIn(List<VlanModeType> modeTypeNotIn) {

        this.modeTypeNotIn = modeTypeNotIn;
        return this;
    }

    public VlanWhereInput addModeTypeNotInItem(VlanModeType modeTypeNotInItem) {
        if (this.modeTypeNotIn == null) {
            this.modeTypeNotIn = new ArrayList<VlanModeType>();
        }
        this.modeTypeNotIn.add(modeTypeNotInItem);
        return this;
    }

    /**
     * Get modeTypeNotIn
     *
     * @return modeTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VlanModeType> getModeTypeNotIn() {
        return modeTypeNotIn;
    }

    public void setModeTypeNotIn(List<VlanModeType> modeTypeNotIn) {
        this.modeTypeNotIn = modeTypeNotIn;
    }

    public VlanWhereInput modeTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE_NOT_IN);
        return this;
    }

    public VlanWhereInput modeTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE_NOT_IN);
        return this;
    }

    public void setModeTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE_NOT_IN);
        }
    }

    public boolean getModeTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_TYPE_NOT_IN);
    }

    public VlanWhereInput name(String name) {

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

    public VlanWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VlanWhereInput name_ExplictlyNonNull() {
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

    public VlanWhereInput nameContains(String nameContains) {

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

    public VlanWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VlanWhereInput nameContains_ExplictlyNonNull() {
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

    public VlanWhereInput nameEndsWith(String nameEndsWith) {

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

    public VlanWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VlanWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VlanWhereInput nameGt(String nameGt) {

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

    public VlanWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VlanWhereInput nameGt_ExplictlyNonNull() {
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

    public VlanWhereInput nameGte(String nameGte) {

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

    public VlanWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VlanWhereInput nameGte_ExplictlyNonNull() {
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

    public VlanWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VlanWhereInput addNameInItem(String nameInItem) {
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

    public VlanWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VlanWhereInput nameIn_ExplictlyNonNull() {
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

    public VlanWhereInput nameLt(String nameLt) {

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

    public VlanWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VlanWhereInput nameLt_ExplictlyNonNull() {
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

    public VlanWhereInput nameLte(String nameLte) {

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

    public VlanWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VlanWhereInput nameLte_ExplictlyNonNull() {
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

    public VlanWhereInput nameNot(String nameNot) {

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

    public VlanWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VlanWhereInput nameNot_ExplictlyNonNull() {
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

    public VlanWhereInput nameNotContains(String nameNotContains) {

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

    public VlanWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VlanWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VlanWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VlanWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VlanWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VlanWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VlanWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VlanWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VlanWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VlanWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VlanWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VlanWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VlanWhereInput nameStartsWith(String nameStartsWith) {

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

    public VlanWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VlanWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VlanWhereInput qosBurst(Double qosBurst) {

        this.qosBurst = qosBurst;
        return this;
    }

    /**
     * Get qosBurst
     *
     * @return qosBurst
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosBurst() {
        return qosBurst;
    }

    public void setQosBurst(Double qosBurst) {
        this.qosBurst = qosBurst;
    }

    public VlanWhereInput qosBurst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST);
        return this;
    }

    public VlanWhereInput qosBurst_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST);
        return this;
    }

    public void setQosBurst_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST);
        }
    }

    public boolean getQosBurst_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST);
    }

    public VlanWhereInput qosBurstGt(Double qosBurstGt) {

        this.qosBurstGt = qosBurstGt;
        return this;
    }

    /**
     * Get qosBurstGt
     *
     * @return qosBurstGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosBurstGt() {
        return qosBurstGt;
    }

    public void setQosBurstGt(Double qosBurstGt) {
        this.qosBurstGt = qosBurstGt;
    }

    public VlanWhereInput qosBurstGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_GT);
        return this;
    }

    public VlanWhereInput qosBurstGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_GT);
        return this;
    }

    public void setQosBurstGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_GT);
        }
    }

    public boolean getQosBurstGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_GT);
    }

    public VlanWhereInput qosBurstGte(Double qosBurstGte) {

        this.qosBurstGte = qosBurstGte;
        return this;
    }

    /**
     * Get qosBurstGte
     *
     * @return qosBurstGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosBurstGte() {
        return qosBurstGte;
    }

    public void setQosBurstGte(Double qosBurstGte) {
        this.qosBurstGte = qosBurstGte;
    }

    public VlanWhereInput qosBurstGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_GTE);
        return this;
    }

    public VlanWhereInput qosBurstGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_GTE);
        return this;
    }

    public void setQosBurstGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_GTE);
        }
    }

    public boolean getQosBurstGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_GTE);
    }

    public VlanWhereInput qosBurstIn(List<Double> qosBurstIn) {

        this.qosBurstIn = qosBurstIn;
        return this;
    }

    public VlanWhereInput addQosBurstInItem(Double qosBurstInItem) {
        if (this.qosBurstIn == null) {
            this.qosBurstIn = new ArrayList<Double>();
        }
        this.qosBurstIn.add(qosBurstInItem);
        return this;
    }

    /**
     * Get qosBurstIn
     *
     * @return qosBurstIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getQosBurstIn() {
        return qosBurstIn;
    }

    public void setQosBurstIn(List<Double> qosBurstIn) {
        this.qosBurstIn = qosBurstIn;
    }

    public VlanWhereInput qosBurstIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_IN);
        return this;
    }

    public VlanWhereInput qosBurstIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_IN);
        return this;
    }

    public void setQosBurstIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_IN);
        }
    }

    public boolean getQosBurstIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_IN);
    }

    public VlanWhereInput qosBurstLt(Double qosBurstLt) {

        this.qosBurstLt = qosBurstLt;
        return this;
    }

    /**
     * Get qosBurstLt
     *
     * @return qosBurstLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosBurstLt() {
        return qosBurstLt;
    }

    public void setQosBurstLt(Double qosBurstLt) {
        this.qosBurstLt = qosBurstLt;
    }

    public VlanWhereInput qosBurstLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_LT);
        return this;
    }

    public VlanWhereInput qosBurstLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_LT);
        return this;
    }

    public void setQosBurstLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_LT);
        }
    }

    public boolean getQosBurstLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_LT);
    }

    public VlanWhereInput qosBurstLte(Double qosBurstLte) {

        this.qosBurstLte = qosBurstLte;
        return this;
    }

    /**
     * Get qosBurstLte
     *
     * @return qosBurstLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosBurstLte() {
        return qosBurstLte;
    }

    public void setQosBurstLte(Double qosBurstLte) {
        this.qosBurstLte = qosBurstLte;
    }

    public VlanWhereInput qosBurstLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_LTE);
        return this;
    }

    public VlanWhereInput qosBurstLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_LTE);
        return this;
    }

    public void setQosBurstLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_LTE);
        }
    }

    public boolean getQosBurstLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_LTE);
    }

    public VlanWhereInput qosBurstNot(Double qosBurstNot) {

        this.qosBurstNot = qosBurstNot;
        return this;
    }

    /**
     * Get qosBurstNot
     *
     * @return qosBurstNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosBurstNot() {
        return qosBurstNot;
    }

    public void setQosBurstNot(Double qosBurstNot) {
        this.qosBurstNot = qosBurstNot;
    }

    public VlanWhereInput qosBurstNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_NOT);
        return this;
    }

    public VlanWhereInput qosBurstNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_NOT);
        return this;
    }

    public void setQosBurstNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_NOT);
        }
    }

    public boolean getQosBurstNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_NOT);
    }

    public VlanWhereInput qosBurstNotIn(List<Double> qosBurstNotIn) {

        this.qosBurstNotIn = qosBurstNotIn;
        return this;
    }

    public VlanWhereInput addQosBurstNotInItem(Double qosBurstNotInItem) {
        if (this.qosBurstNotIn == null) {
            this.qosBurstNotIn = new ArrayList<Double>();
        }
        this.qosBurstNotIn.add(qosBurstNotInItem);
        return this;
    }

    /**
     * Get qosBurstNotIn
     *
     * @return qosBurstNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getQosBurstNotIn() {
        return qosBurstNotIn;
    }

    public void setQosBurstNotIn(List<Double> qosBurstNotIn) {
        this.qosBurstNotIn = qosBurstNotIn;
    }

    public VlanWhereInput qosBurstNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_NOT_IN);
        return this;
    }

    public VlanWhereInput qosBurstNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_NOT_IN);
        return this;
    }

    public void setQosBurstNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_NOT_IN);
        }
    }

    public boolean getQosBurstNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_NOT_IN);
    }

    public VlanWhereInput qosMaxBandwidth(Double qosMaxBandwidth) {

        this.qosMaxBandwidth = qosMaxBandwidth;
        return this;
    }

    /**
     * Get qosMaxBandwidth
     *
     * @return qosMaxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMaxBandwidth() {
        return qosMaxBandwidth;
    }

    public void setQosMaxBandwidth(Double qosMaxBandwidth) {
        this.qosMaxBandwidth = qosMaxBandwidth;
    }

    public VlanWhereInput qosMaxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        return this;
    }

    public VlanWhereInput qosMaxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        return this;
    }

    public void setQosMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        }
    }

    public boolean getQosMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
    }

    public VlanWhereInput qosMaxBandwidthGt(Double qosMaxBandwidthGt) {

        this.qosMaxBandwidthGt = qosMaxBandwidthGt;
        return this;
    }

    /**
     * Get qosMaxBandwidthGt
     *
     * @return qosMaxBandwidthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMaxBandwidthGt() {
        return qosMaxBandwidthGt;
    }

    public void setQosMaxBandwidthGt(Double qosMaxBandwidthGt) {
        this.qosMaxBandwidthGt = qosMaxBandwidthGt;
    }

    public VlanWhereInput qosMaxBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT);
        return this;
    }

    public void setQosMaxBandwidthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT);
        }
    }

    public boolean getQosMaxBandwidthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GT);
    }

    public VlanWhereInput qosMaxBandwidthGte(Double qosMaxBandwidthGte) {

        this.qosMaxBandwidthGte = qosMaxBandwidthGte;
        return this;
    }

    /**
     * Get qosMaxBandwidthGte
     *
     * @return qosMaxBandwidthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMaxBandwidthGte() {
        return qosMaxBandwidthGte;
    }

    public void setQosMaxBandwidthGte(Double qosMaxBandwidthGte) {
        this.qosMaxBandwidthGte = qosMaxBandwidthGte;
    }

    public VlanWhereInput qosMaxBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE);
        return this;
    }

    public void setQosMaxBandwidthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE);
        }
    }

    public boolean getQosMaxBandwidthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_GTE);
    }

    public VlanWhereInput qosMaxBandwidthIn(List<Double> qosMaxBandwidthIn) {

        this.qosMaxBandwidthIn = qosMaxBandwidthIn;
        return this;
    }

    public VlanWhereInput addQosMaxBandwidthInItem(Double qosMaxBandwidthInItem) {
        if (this.qosMaxBandwidthIn == null) {
            this.qosMaxBandwidthIn = new ArrayList<Double>();
        }
        this.qosMaxBandwidthIn.add(qosMaxBandwidthInItem);
        return this;
    }

    /**
     * Get qosMaxBandwidthIn
     *
     * @return qosMaxBandwidthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getQosMaxBandwidthIn() {
        return qosMaxBandwidthIn;
    }

    public void setQosMaxBandwidthIn(List<Double> qosMaxBandwidthIn) {
        this.qosMaxBandwidthIn = qosMaxBandwidthIn;
    }

    public VlanWhereInput qosMaxBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN);
        return this;
    }

    public void setQosMaxBandwidthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN);
        }
    }

    public boolean getQosMaxBandwidthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_IN);
    }

    public VlanWhereInput qosMaxBandwidthLt(Double qosMaxBandwidthLt) {

        this.qosMaxBandwidthLt = qosMaxBandwidthLt;
        return this;
    }

    /**
     * Get qosMaxBandwidthLt
     *
     * @return qosMaxBandwidthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMaxBandwidthLt() {
        return qosMaxBandwidthLt;
    }

    public void setQosMaxBandwidthLt(Double qosMaxBandwidthLt) {
        this.qosMaxBandwidthLt = qosMaxBandwidthLt;
    }

    public VlanWhereInput qosMaxBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT);
        return this;
    }

    public void setQosMaxBandwidthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT);
        }
    }

    public boolean getQosMaxBandwidthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LT);
    }

    public VlanWhereInput qosMaxBandwidthLte(Double qosMaxBandwidthLte) {

        this.qosMaxBandwidthLte = qosMaxBandwidthLte;
        return this;
    }

    /**
     * Get qosMaxBandwidthLte
     *
     * @return qosMaxBandwidthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMaxBandwidthLte() {
        return qosMaxBandwidthLte;
    }

    public void setQosMaxBandwidthLte(Double qosMaxBandwidthLte) {
        this.qosMaxBandwidthLte = qosMaxBandwidthLte;
    }

    public VlanWhereInput qosMaxBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE);
        return this;
    }

    public void setQosMaxBandwidthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE);
        }
    }

    public boolean getQosMaxBandwidthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_LTE);
    }

    public VlanWhereInput qosMaxBandwidthNot(Double qosMaxBandwidthNot) {

        this.qosMaxBandwidthNot = qosMaxBandwidthNot;
        return this;
    }

    /**
     * Get qosMaxBandwidthNot
     *
     * @return qosMaxBandwidthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMaxBandwidthNot() {
        return qosMaxBandwidthNot;
    }

    public void setQosMaxBandwidthNot(Double qosMaxBandwidthNot) {
        this.qosMaxBandwidthNot = qosMaxBandwidthNot;
    }

    public VlanWhereInput qosMaxBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT);
        return this;
    }

    public void setQosMaxBandwidthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT);
        }
    }

    public boolean getQosMaxBandwidthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT);
    }

    public VlanWhereInput qosMaxBandwidthNotIn(List<Double> qosMaxBandwidthNotIn) {

        this.qosMaxBandwidthNotIn = qosMaxBandwidthNotIn;
        return this;
    }

    public VlanWhereInput addQosMaxBandwidthNotInItem(Double qosMaxBandwidthNotInItem) {
        if (this.qosMaxBandwidthNotIn == null) {
            this.qosMaxBandwidthNotIn = new ArrayList<Double>();
        }
        this.qosMaxBandwidthNotIn.add(qosMaxBandwidthNotInItem);
        return this;
    }

    /**
     * Get qosMaxBandwidthNotIn
     *
     * @return qosMaxBandwidthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getQosMaxBandwidthNotIn() {
        return qosMaxBandwidthNotIn;
    }

    public void setQosMaxBandwidthNotIn(List<Double> qosMaxBandwidthNotIn) {
        this.qosMaxBandwidthNotIn = qosMaxBandwidthNotIn;
    }

    public VlanWhereInput qosMaxBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public VlanWhereInput qosMaxBandwidthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public void setQosMaxBandwidthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN);
        }
    }

    public boolean getQosMaxBandwidthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_NOT_IN);
    }

    public VlanWhereInput qosMinBandwidth(Double qosMinBandwidth) {

        this.qosMinBandwidth = qosMinBandwidth;
        return this;
    }

    /**
     * Get qosMinBandwidth
     *
     * @return qosMinBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMinBandwidth() {
        return qosMinBandwidth;
    }

    public void setQosMinBandwidth(Double qosMinBandwidth) {
        this.qosMinBandwidth = qosMinBandwidth;
    }

    public VlanWhereInput qosMinBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        return this;
    }

    public VlanWhereInput qosMinBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        return this;
    }

    public void setQosMinBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        }
    }

    public boolean getQosMinBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
    }

    public VlanWhereInput qosMinBandwidthGt(Double qosMinBandwidthGt) {

        this.qosMinBandwidthGt = qosMinBandwidthGt;
        return this;
    }

    /**
     * Get qosMinBandwidthGt
     *
     * @return qosMinBandwidthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMinBandwidthGt() {
        return qosMinBandwidthGt;
    }

    public void setQosMinBandwidthGt(Double qosMinBandwidthGt) {
        this.qosMinBandwidthGt = qosMinBandwidthGt;
    }

    public VlanWhereInput qosMinBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT);
        return this;
    }

    public VlanWhereInput qosMinBandwidthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT);
        return this;
    }

    public void setQosMinBandwidthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT);
        }
    }

    public boolean getQosMinBandwidthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GT);
    }

    public VlanWhereInput qosMinBandwidthGte(Double qosMinBandwidthGte) {

        this.qosMinBandwidthGte = qosMinBandwidthGte;
        return this;
    }

    /**
     * Get qosMinBandwidthGte
     *
     * @return qosMinBandwidthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMinBandwidthGte() {
        return qosMinBandwidthGte;
    }

    public void setQosMinBandwidthGte(Double qosMinBandwidthGte) {
        this.qosMinBandwidthGte = qosMinBandwidthGte;
    }

    public VlanWhereInput qosMinBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE);
        return this;
    }

    public VlanWhereInput qosMinBandwidthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE);
        return this;
    }

    public void setQosMinBandwidthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE);
        }
    }

    public boolean getQosMinBandwidthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_GTE);
    }

    public VlanWhereInput qosMinBandwidthIn(List<Double> qosMinBandwidthIn) {

        this.qosMinBandwidthIn = qosMinBandwidthIn;
        return this;
    }

    public VlanWhereInput addQosMinBandwidthInItem(Double qosMinBandwidthInItem) {
        if (this.qosMinBandwidthIn == null) {
            this.qosMinBandwidthIn = new ArrayList<Double>();
        }
        this.qosMinBandwidthIn.add(qosMinBandwidthInItem);
        return this;
    }

    /**
     * Get qosMinBandwidthIn
     *
     * @return qosMinBandwidthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getQosMinBandwidthIn() {
        return qosMinBandwidthIn;
    }

    public void setQosMinBandwidthIn(List<Double> qosMinBandwidthIn) {
        this.qosMinBandwidthIn = qosMinBandwidthIn;
    }

    public VlanWhereInput qosMinBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN);
        return this;
    }

    public VlanWhereInput qosMinBandwidthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN);
        return this;
    }

    public void setQosMinBandwidthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN);
        }
    }

    public boolean getQosMinBandwidthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_IN);
    }

    public VlanWhereInput qosMinBandwidthLt(Double qosMinBandwidthLt) {

        this.qosMinBandwidthLt = qosMinBandwidthLt;
        return this;
    }

    /**
     * Get qosMinBandwidthLt
     *
     * @return qosMinBandwidthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMinBandwidthLt() {
        return qosMinBandwidthLt;
    }

    public void setQosMinBandwidthLt(Double qosMinBandwidthLt) {
        this.qosMinBandwidthLt = qosMinBandwidthLt;
    }

    public VlanWhereInput qosMinBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT);
        return this;
    }

    public VlanWhereInput qosMinBandwidthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT);
        return this;
    }

    public void setQosMinBandwidthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT);
        }
    }

    public boolean getQosMinBandwidthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LT);
    }

    public VlanWhereInput qosMinBandwidthLte(Double qosMinBandwidthLte) {

        this.qosMinBandwidthLte = qosMinBandwidthLte;
        return this;
    }

    /**
     * Get qosMinBandwidthLte
     *
     * @return qosMinBandwidthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMinBandwidthLte() {
        return qosMinBandwidthLte;
    }

    public void setQosMinBandwidthLte(Double qosMinBandwidthLte) {
        this.qosMinBandwidthLte = qosMinBandwidthLte;
    }

    public VlanWhereInput qosMinBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE);
        return this;
    }

    public VlanWhereInput qosMinBandwidthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE);
        return this;
    }

    public void setQosMinBandwidthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE);
        }
    }

    public boolean getQosMinBandwidthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_LTE);
    }

    public VlanWhereInput qosMinBandwidthNot(Double qosMinBandwidthNot) {

        this.qosMinBandwidthNot = qosMinBandwidthNot;
        return this;
    }

    /**
     * Get qosMinBandwidthNot
     *
     * @return qosMinBandwidthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosMinBandwidthNot() {
        return qosMinBandwidthNot;
    }

    public void setQosMinBandwidthNot(Double qosMinBandwidthNot) {
        this.qosMinBandwidthNot = qosMinBandwidthNot;
    }

    public VlanWhereInput qosMinBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT);
        return this;
    }

    public VlanWhereInput qosMinBandwidthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT);
        return this;
    }

    public void setQosMinBandwidthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT);
        }
    }

    public boolean getQosMinBandwidthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT);
    }

    public VlanWhereInput qosMinBandwidthNotIn(List<Double> qosMinBandwidthNotIn) {

        this.qosMinBandwidthNotIn = qosMinBandwidthNotIn;
        return this;
    }

    public VlanWhereInput addQosMinBandwidthNotInItem(Double qosMinBandwidthNotInItem) {
        if (this.qosMinBandwidthNotIn == null) {
            this.qosMinBandwidthNotIn = new ArrayList<Double>();
        }
        this.qosMinBandwidthNotIn.add(qosMinBandwidthNotInItem);
        return this;
    }

    /**
     * Get qosMinBandwidthNotIn
     *
     * @return qosMinBandwidthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getQosMinBandwidthNotIn() {
        return qosMinBandwidthNotIn;
    }

    public void setQosMinBandwidthNotIn(List<Double> qosMinBandwidthNotIn) {
        this.qosMinBandwidthNotIn = qosMinBandwidthNotIn;
    }

    public VlanWhereInput qosMinBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN);
        return this;
    }

    public VlanWhereInput qosMinBandwidthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN);
        return this;
    }

    public void setQosMinBandwidthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN);
        }
    }

    public boolean getQosMinBandwidthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_NOT_IN);
    }

    public VlanWhereInput qosPriority(Integer qosPriority) {

        this.qosPriority = qosPriority;
        return this;
    }

    /**
     * Get qosPriority
     *
     * @return qosPriority
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQosPriority() {
        return qosPriority;
    }

    public void setQosPriority(Integer qosPriority) {
        this.qosPriority = qosPriority;
    }

    public VlanWhereInput qosPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY);
        return this;
    }

    public VlanWhereInput qosPriority_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY);
        return this;
    }

    public void setQosPriority_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY);
        }
    }

    public boolean getQosPriority_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY);
    }

    public VlanWhereInput qosPriorityGt(Integer qosPriorityGt) {

        this.qosPriorityGt = qosPriorityGt;
        return this;
    }

    /**
     * Get qosPriorityGt
     *
     * @return qosPriorityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQosPriorityGt() {
        return qosPriorityGt;
    }

    public void setQosPriorityGt(Integer qosPriorityGt) {
        this.qosPriorityGt = qosPriorityGt;
    }

    public VlanWhereInput qosPriorityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_GT);
        return this;
    }

    public VlanWhereInput qosPriorityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_GT);
        return this;
    }

    public void setQosPriorityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_GT);
        }
    }

    public boolean getQosPriorityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_GT);
    }

    public VlanWhereInput qosPriorityGte(Integer qosPriorityGte) {

        this.qosPriorityGte = qosPriorityGte;
        return this;
    }

    /**
     * Get qosPriorityGte
     *
     * @return qosPriorityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQosPriorityGte() {
        return qosPriorityGte;
    }

    public void setQosPriorityGte(Integer qosPriorityGte) {
        this.qosPriorityGte = qosPriorityGte;
    }

    public VlanWhereInput qosPriorityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_GTE);
        return this;
    }

    public VlanWhereInput qosPriorityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_GTE);
        return this;
    }

    public void setQosPriorityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_GTE);
        }
    }

    public boolean getQosPriorityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_GTE);
    }

    public VlanWhereInput qosPriorityIn(List<Integer> qosPriorityIn) {

        this.qosPriorityIn = qosPriorityIn;
        return this;
    }

    public VlanWhereInput addQosPriorityInItem(Integer qosPriorityInItem) {
        if (this.qosPriorityIn == null) {
            this.qosPriorityIn = new ArrayList<Integer>();
        }
        this.qosPriorityIn.add(qosPriorityInItem);
        return this;
    }

    /**
     * Get qosPriorityIn
     *
     * @return qosPriorityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getQosPriorityIn() {
        return qosPriorityIn;
    }

    public void setQosPriorityIn(List<Integer> qosPriorityIn) {
        this.qosPriorityIn = qosPriorityIn;
    }

    public VlanWhereInput qosPriorityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_IN);
        return this;
    }

    public VlanWhereInput qosPriorityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_IN);
        return this;
    }

    public void setQosPriorityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_IN);
        }
    }

    public boolean getQosPriorityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_IN);
    }

    public VlanWhereInput qosPriorityLt(Integer qosPriorityLt) {

        this.qosPriorityLt = qosPriorityLt;
        return this;
    }

    /**
     * Get qosPriorityLt
     *
     * @return qosPriorityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQosPriorityLt() {
        return qosPriorityLt;
    }

    public void setQosPriorityLt(Integer qosPriorityLt) {
        this.qosPriorityLt = qosPriorityLt;
    }

    public VlanWhereInput qosPriorityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_LT);
        return this;
    }

    public VlanWhereInput qosPriorityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_LT);
        return this;
    }

    public void setQosPriorityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_LT);
        }
    }

    public boolean getQosPriorityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_LT);
    }

    public VlanWhereInput qosPriorityLte(Integer qosPriorityLte) {

        this.qosPriorityLte = qosPriorityLte;
        return this;
    }

    /**
     * Get qosPriorityLte
     *
     * @return qosPriorityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQosPriorityLte() {
        return qosPriorityLte;
    }

    public void setQosPriorityLte(Integer qosPriorityLte) {
        this.qosPriorityLte = qosPriorityLte;
    }

    public VlanWhereInput qosPriorityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_LTE);
        return this;
    }

    public VlanWhereInput qosPriorityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_LTE);
        return this;
    }

    public void setQosPriorityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_LTE);
        }
    }

    public boolean getQosPriorityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_LTE);
    }

    public VlanWhereInput qosPriorityNot(Integer qosPriorityNot) {

        this.qosPriorityNot = qosPriorityNot;
        return this;
    }

    /**
     * Get qosPriorityNot
     *
     * @return qosPriorityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQosPriorityNot() {
        return qosPriorityNot;
    }

    public void setQosPriorityNot(Integer qosPriorityNot) {
        this.qosPriorityNot = qosPriorityNot;
    }

    public VlanWhereInput qosPriorityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_NOT);
        return this;
    }

    public VlanWhereInput qosPriorityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_NOT);
        return this;
    }

    public void setQosPriorityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_NOT);
        }
    }

    public boolean getQosPriorityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_NOT);
    }

    public VlanWhereInput qosPriorityNotIn(List<Integer> qosPriorityNotIn) {

        this.qosPriorityNotIn = qosPriorityNotIn;
        return this;
    }

    public VlanWhereInput addQosPriorityNotInItem(Integer qosPriorityNotInItem) {
        if (this.qosPriorityNotIn == null) {
            this.qosPriorityNotIn = new ArrayList<Integer>();
        }
        this.qosPriorityNotIn.add(qosPriorityNotInItem);
        return this;
    }

    /**
     * Get qosPriorityNotIn
     *
     * @return qosPriorityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getQosPriorityNotIn() {
        return qosPriorityNotIn;
    }

    public void setQosPriorityNotIn(List<Integer> qosPriorityNotIn) {
        this.qosPriorityNotIn = qosPriorityNotIn;
    }

    public VlanWhereInput qosPriorityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_NOT_IN);
        return this;
    }

    public VlanWhereInput qosPriorityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_NOT_IN);
        return this;
    }

    public void setQosPriorityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY_NOT_IN);
        }
    }

    public boolean getQosPriorityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY_NOT_IN);
    }

    public VlanWhereInput subnetmask(String subnetmask) {

        this.subnetmask = subnetmask;
        return this;
    }

    /**
     * Get subnetmask
     *
     * @return subnetmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmask() {
        return subnetmask;
    }

    public void setSubnetmask(String subnetmask) {
        this.subnetmask = subnetmask;
    }

    public VlanWhereInput subnetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK);
        return this;
    }

    public VlanWhereInput subnetmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK);
        return this;
    }

    public void setSubnetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK);
        }
    }

    public boolean getSubnetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK);
    }

    public VlanWhereInput subnetmaskContains(String subnetmaskContains) {

        this.subnetmaskContains = subnetmaskContains;
        return this;
    }

    /**
     * Get subnetmaskContains
     *
     * @return subnetmaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskContains() {
        return subnetmaskContains;
    }

    public void setSubnetmaskContains(String subnetmaskContains) {
        this.subnetmaskContains = subnetmaskContains;
    }

    public VlanWhereInput subnetmaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_CONTAINS);
        return this;
    }

    public VlanWhereInput subnetmaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_CONTAINS);
        return this;
    }

    public void setSubnetmaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_CONTAINS);
        }
    }

    public boolean getSubnetmaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_CONTAINS);
    }

    public VlanWhereInput subnetmaskEndsWith(String subnetmaskEndsWith) {

        this.subnetmaskEndsWith = subnetmaskEndsWith;
        return this;
    }

    /**
     * Get subnetmaskEndsWith
     *
     * @return subnetmaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskEndsWith() {
        return subnetmaskEndsWith;
    }

    public void setSubnetmaskEndsWith(String subnetmaskEndsWith) {
        this.subnetmaskEndsWith = subnetmaskEndsWith;
    }

    public VlanWhereInput subnetmaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_ENDS_WITH);
        return this;
    }

    public VlanWhereInput subnetmaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_ENDS_WITH);
        return this;
    }

    public void setSubnetmaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_ENDS_WITH);
        }
    }

    public boolean getSubnetmaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_ENDS_WITH);
    }

    public VlanWhereInput subnetmaskGt(String subnetmaskGt) {

        this.subnetmaskGt = subnetmaskGt;
        return this;
    }

    /**
     * Get subnetmaskGt
     *
     * @return subnetmaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskGt() {
        return subnetmaskGt;
    }

    public void setSubnetmaskGt(String subnetmaskGt) {
        this.subnetmaskGt = subnetmaskGt;
    }

    public VlanWhereInput subnetmaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_GT);
        return this;
    }

    public VlanWhereInput subnetmaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_GT);
        return this;
    }

    public void setSubnetmaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_GT);
        }
    }

    public boolean getSubnetmaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_GT);
    }

    public VlanWhereInput subnetmaskGte(String subnetmaskGte) {

        this.subnetmaskGte = subnetmaskGte;
        return this;
    }

    /**
     * Get subnetmaskGte
     *
     * @return subnetmaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskGte() {
        return subnetmaskGte;
    }

    public void setSubnetmaskGte(String subnetmaskGte) {
        this.subnetmaskGte = subnetmaskGte;
    }

    public VlanWhereInput subnetmaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_GTE);
        return this;
    }

    public VlanWhereInput subnetmaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_GTE);
        return this;
    }

    public void setSubnetmaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_GTE);
        }
    }

    public boolean getSubnetmaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_GTE);
    }

    public VlanWhereInput subnetmaskIn(List<String> subnetmaskIn) {

        this.subnetmaskIn = subnetmaskIn;
        return this;
    }

    public VlanWhereInput addSubnetmaskInItem(String subnetmaskInItem) {
        if (this.subnetmaskIn == null) {
            this.subnetmaskIn = new ArrayList<String>();
        }
        this.subnetmaskIn.add(subnetmaskInItem);
        return this;
    }

    /**
     * Get subnetmaskIn
     *
     * @return subnetmaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubnetmaskIn() {
        return subnetmaskIn;
    }

    public void setSubnetmaskIn(List<String> subnetmaskIn) {
        this.subnetmaskIn = subnetmaskIn;
    }

    public VlanWhereInput subnetmaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_IN);
        return this;
    }

    public VlanWhereInput subnetmaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_IN);
        return this;
    }

    public void setSubnetmaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_IN);
        }
    }

    public boolean getSubnetmaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_IN);
    }

    public VlanWhereInput subnetmaskLt(String subnetmaskLt) {

        this.subnetmaskLt = subnetmaskLt;
        return this;
    }

    /**
     * Get subnetmaskLt
     *
     * @return subnetmaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskLt() {
        return subnetmaskLt;
    }

    public void setSubnetmaskLt(String subnetmaskLt) {
        this.subnetmaskLt = subnetmaskLt;
    }

    public VlanWhereInput subnetmaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_LT);
        return this;
    }

    public VlanWhereInput subnetmaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_LT);
        return this;
    }

    public void setSubnetmaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_LT);
        }
    }

    public boolean getSubnetmaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_LT);
    }

    public VlanWhereInput subnetmaskLte(String subnetmaskLte) {

        this.subnetmaskLte = subnetmaskLte;
        return this;
    }

    /**
     * Get subnetmaskLte
     *
     * @return subnetmaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskLte() {
        return subnetmaskLte;
    }

    public void setSubnetmaskLte(String subnetmaskLte) {
        this.subnetmaskLte = subnetmaskLte;
    }

    public VlanWhereInput subnetmaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_LTE);
        return this;
    }

    public VlanWhereInput subnetmaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_LTE);
        return this;
    }

    public void setSubnetmaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_LTE);
        }
    }

    public boolean getSubnetmaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_LTE);
    }

    public VlanWhereInput subnetmaskNot(String subnetmaskNot) {

        this.subnetmaskNot = subnetmaskNot;
        return this;
    }

    /**
     * Get subnetmaskNot
     *
     * @return subnetmaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskNot() {
        return subnetmaskNot;
    }

    public void setSubnetmaskNot(String subnetmaskNot) {
        this.subnetmaskNot = subnetmaskNot;
    }

    public VlanWhereInput subnetmaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT);
        return this;
    }

    public VlanWhereInput subnetmaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT);
        return this;
    }

    public void setSubnetmaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT);
        }
    }

    public boolean getSubnetmaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_NOT);
    }

    public VlanWhereInput subnetmaskNotContains(String subnetmaskNotContains) {

        this.subnetmaskNotContains = subnetmaskNotContains;
        return this;
    }

    /**
     * Get subnetmaskNotContains
     *
     * @return subnetmaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskNotContains() {
        return subnetmaskNotContains;
    }

    public void setSubnetmaskNotContains(String subnetmaskNotContains) {
        this.subnetmaskNotContains = subnetmaskNotContains;
    }

    public VlanWhereInput subnetmaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS);
        return this;
    }

    public VlanWhereInput subnetmaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS);
        return this;
    }

    public void setSubnetmaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS);
        }
    }

    public boolean getSubnetmaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_NOT_CONTAINS);
    }

    public VlanWhereInput subnetmaskNotEndsWith(String subnetmaskNotEndsWith) {

        this.subnetmaskNotEndsWith = subnetmaskNotEndsWith;
        return this;
    }

    /**
     * Get subnetmaskNotEndsWith
     *
     * @return subnetmaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskNotEndsWith() {
        return subnetmaskNotEndsWith;
    }

    public void setSubnetmaskNotEndsWith(String subnetmaskNotEndsWith) {
        this.subnetmaskNotEndsWith = subnetmaskNotEndsWith;
    }

    public VlanWhereInput subnetmaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH);
        return this;
    }

    public VlanWhereInput subnetmaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH);
        return this;
    }

    public void setSubnetmaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH);
        }
    }

    public boolean getSubnetmaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_NOT_ENDS_WITH);
    }

    public VlanWhereInput subnetmaskNotIn(List<String> subnetmaskNotIn) {

        this.subnetmaskNotIn = subnetmaskNotIn;
        return this;
    }

    public VlanWhereInput addSubnetmaskNotInItem(String subnetmaskNotInItem) {
        if (this.subnetmaskNotIn == null) {
            this.subnetmaskNotIn = new ArrayList<String>();
        }
        this.subnetmaskNotIn.add(subnetmaskNotInItem);
        return this;
    }

    /**
     * Get subnetmaskNotIn
     *
     * @return subnetmaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubnetmaskNotIn() {
        return subnetmaskNotIn;
    }

    public void setSubnetmaskNotIn(List<String> subnetmaskNotIn) {
        this.subnetmaskNotIn = subnetmaskNotIn;
    }

    public VlanWhereInput subnetmaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_IN);
        return this;
    }

    public VlanWhereInput subnetmaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_IN);
        return this;
    }

    public void setSubnetmaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_IN);
        }
    }

    public boolean getSubnetmaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_NOT_IN);
    }

    public VlanWhereInput subnetmaskNotStartsWith(String subnetmaskNotStartsWith) {

        this.subnetmaskNotStartsWith = subnetmaskNotStartsWith;
        return this;
    }

    /**
     * Get subnetmaskNotStartsWith
     *
     * @return subnetmaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskNotStartsWith() {
        return subnetmaskNotStartsWith;
    }

    public void setSubnetmaskNotStartsWith(String subnetmaskNotStartsWith) {
        this.subnetmaskNotStartsWith = subnetmaskNotStartsWith;
    }

    public VlanWhereInput subnetmaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH);
        return this;
    }

    public VlanWhereInput subnetmaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH);
        return this;
    }

    public void setSubnetmaskNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH);
        }
    }

    public boolean getSubnetmaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_NOT_STARTS_WITH);
    }

    public VlanWhereInput subnetmaskStartsWith(String subnetmaskStartsWith) {

        this.subnetmaskStartsWith = subnetmaskStartsWith;
        return this;
    }

    /**
     * Get subnetmaskStartsWith
     *
     * @return subnetmaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmaskStartsWith() {
        return subnetmaskStartsWith;
    }

    public void setSubnetmaskStartsWith(String subnetmaskStartsWith) {
        this.subnetmaskStartsWith = subnetmaskStartsWith;
    }

    public VlanWhereInput subnetmaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_STARTS_WITH);
        return this;
    }

    public VlanWhereInput subnetmaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_STARTS_WITH);
        return this;
    }

    public void setSubnetmaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK_STARTS_WITH);
        }
    }

    public boolean getSubnetmaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK_STARTS_WITH);
    }

    public VlanWhereInput type(NetworkType type) {

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
    public NetworkType getType() {
        return type;
    }

    public void setType(NetworkType type) {
        this.type = type;
    }

    public VlanWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VlanWhereInput type_ExplictlyNonNull() {
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

    public VlanWhereInput typeIn(List<NetworkType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VlanWhereInput addTypeInItem(NetworkType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<NetworkType>();
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
    public List<NetworkType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<NetworkType> typeIn) {
        this.typeIn = typeIn;
    }

    public VlanWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VlanWhereInput typeIn_ExplictlyNonNull() {
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

    public VlanWhereInput typeNot(NetworkType typeNot) {

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
    public NetworkType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(NetworkType typeNot) {
        this.typeNot = typeNot;
    }

    public VlanWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VlanWhereInput typeNot_ExplictlyNonNull() {
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

    public VlanWhereInput typeNotIn(List<NetworkType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VlanWhereInput addTypeNotInItem(NetworkType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<NetworkType>();
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
    public List<NetworkType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<NetworkType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VlanWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VlanWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VlanWhereInput vds(VdsWhereInput vds) {

        this.vds = vds;
        return this;
    }

    /**
     * Get vds
     *
     * @return vds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVds() {
        return vds;
    }

    public void setVds(VdsWhereInput vds) {
        this.vds = vds;
    }

    public VlanWhereInput vds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS);
        return this;
    }

    public VlanWhereInput vds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS);
        return this;
    }

    public void setVds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS);
        }
    }

    public boolean getVds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS);
    }

    public VlanWhereInput vlanId(Integer vlanId) {

        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get vlanId
     *
     * @return vlanId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public VlanWhereInput vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public VlanWhereInput vlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public void setVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        }
    }

    public boolean getVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID);
    }

    public VlanWhereInput vlanIdGt(Integer vlanIdGt) {

        this.vlanIdGt = vlanIdGt;
        return this;
    }

    /**
     * Get vlanIdGt
     *
     * @return vlanIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanIdGt() {
        return vlanIdGt;
    }

    public void setVlanIdGt(Integer vlanIdGt) {
        this.vlanIdGt = vlanIdGt;
    }

    public VlanWhereInput vlanIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_GT);
        return this;
    }

    public VlanWhereInput vlanIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_GT);
        return this;
    }

    public void setVlanIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_GT);
        }
    }

    public boolean getVlanIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_GT);
    }

    public VlanWhereInput vlanIdGte(Integer vlanIdGte) {

        this.vlanIdGte = vlanIdGte;
        return this;
    }

    /**
     * Get vlanIdGte
     *
     * @return vlanIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanIdGte() {
        return vlanIdGte;
    }

    public void setVlanIdGte(Integer vlanIdGte) {
        this.vlanIdGte = vlanIdGte;
    }

    public VlanWhereInput vlanIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_GTE);
        return this;
    }

    public VlanWhereInput vlanIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_GTE);
        return this;
    }

    public void setVlanIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_GTE);
        }
    }

    public boolean getVlanIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_GTE);
    }

    public VlanWhereInput vlanIdIn(List<Integer> vlanIdIn) {

        this.vlanIdIn = vlanIdIn;
        return this;
    }

    public VlanWhereInput addVlanIdInItem(Integer vlanIdInItem) {
        if (this.vlanIdIn == null) {
            this.vlanIdIn = new ArrayList<Integer>();
        }
        this.vlanIdIn.add(vlanIdInItem);
        return this;
    }

    /**
     * Get vlanIdIn
     *
     * @return vlanIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVlanIdIn() {
        return vlanIdIn;
    }

    public void setVlanIdIn(List<Integer> vlanIdIn) {
        this.vlanIdIn = vlanIdIn;
    }

    public VlanWhereInput vlanIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_IN);
        return this;
    }

    public VlanWhereInput vlanIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_IN);
        return this;
    }

    public void setVlanIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_IN);
        }
    }

    public boolean getVlanIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_IN);
    }

    public VlanWhereInput vlanIdLt(Integer vlanIdLt) {

        this.vlanIdLt = vlanIdLt;
        return this;
    }

    /**
     * Get vlanIdLt
     *
     * @return vlanIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanIdLt() {
        return vlanIdLt;
    }

    public void setVlanIdLt(Integer vlanIdLt) {
        this.vlanIdLt = vlanIdLt;
    }

    public VlanWhereInput vlanIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_LT);
        return this;
    }

    public VlanWhereInput vlanIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_LT);
        return this;
    }

    public void setVlanIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_LT);
        }
    }

    public boolean getVlanIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_LT);
    }

    public VlanWhereInput vlanIdLte(Integer vlanIdLte) {

        this.vlanIdLte = vlanIdLte;
        return this;
    }

    /**
     * Get vlanIdLte
     *
     * @return vlanIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanIdLte() {
        return vlanIdLte;
    }

    public void setVlanIdLte(Integer vlanIdLte) {
        this.vlanIdLte = vlanIdLte;
    }

    public VlanWhereInput vlanIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_LTE);
        return this;
    }

    public VlanWhereInput vlanIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_LTE);
        return this;
    }

    public void setVlanIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_LTE);
        }
    }

    public boolean getVlanIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_LTE);
    }

    public VlanWhereInput vlanIdNot(Integer vlanIdNot) {

        this.vlanIdNot = vlanIdNot;
        return this;
    }

    /**
     * Get vlanIdNot
     *
     * @return vlanIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanIdNot() {
        return vlanIdNot;
    }

    public void setVlanIdNot(Integer vlanIdNot) {
        this.vlanIdNot = vlanIdNot;
    }

    public VlanWhereInput vlanIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_NOT);
        return this;
    }

    public VlanWhereInput vlanIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_NOT);
        return this;
    }

    public void setVlanIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_NOT);
        }
    }

    public boolean getVlanIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_NOT);
    }

    public VlanWhereInput vlanIdNotIn(List<Integer> vlanIdNotIn) {

        this.vlanIdNotIn = vlanIdNotIn;
        return this;
    }

    public VlanWhereInput addVlanIdNotInItem(Integer vlanIdNotInItem) {
        if (this.vlanIdNotIn == null) {
            this.vlanIdNotIn = new ArrayList<Integer>();
        }
        this.vlanIdNotIn.add(vlanIdNotInItem);
        return this;
    }

    /**
     * Get vlanIdNotIn
     *
     * @return vlanIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVlanIdNotIn() {
        return vlanIdNotIn;
    }

    public void setVlanIdNotIn(List<Integer> vlanIdNotIn) {
        this.vlanIdNotIn = vlanIdNotIn;
    }

    public VlanWhereInput vlanIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_NOT_IN);
        return this;
    }

    public VlanWhereInput vlanIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_NOT_IN);
        return this;
    }

    public void setVlanIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID_NOT_IN);
        }
    }

    public boolean getVlanIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID_NOT_IN);
    }

    public VlanWhereInput vmNicsEvery(VmNicWhereInput vmNicsEvery) {

        this.vmNicsEvery = vmNicsEvery;
        return this;
    }

    /**
     * Get vmNicsEvery
     *
     * @return vmNicsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNicsEvery() {
        return vmNicsEvery;
    }

    public void setVmNicsEvery(VmNicWhereInput vmNicsEvery) {
        this.vmNicsEvery = vmNicsEvery;
    }

    public VlanWhereInput vmNicsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS_EVERY);
        return this;
    }

    public VlanWhereInput vmNicsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_EVERY);
        return this;
    }

    public void setVmNicsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_EVERY);
        }
    }

    public boolean getVmNicsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS_EVERY);
    }

    public VlanWhereInput vmNicsNone(VmNicWhereInput vmNicsNone) {

        this.vmNicsNone = vmNicsNone;
        return this;
    }

    /**
     * Get vmNicsNone
     *
     * @return vmNicsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNicsNone() {
        return vmNicsNone;
    }

    public void setVmNicsNone(VmNicWhereInput vmNicsNone) {
        this.vmNicsNone = vmNicsNone;
    }

    public VlanWhereInput vmNicsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS_NONE);
        return this;
    }

    public VlanWhereInput vmNicsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_NONE);
        return this;
    }

    public void setVmNicsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_NONE);
        }
    }

    public boolean getVmNicsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS_NONE);
    }

    public VlanWhereInput vmNicsSome(VmNicWhereInput vmNicsSome) {

        this.vmNicsSome = vmNicsSome;
        return this;
    }

    /**
     * Get vmNicsSome
     *
     * @return vmNicsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNicsSome() {
        return vmNicsSome;
    }

    public void setVmNicsSome(VmNicWhereInput vmNicsSome) {
        this.vmNicsSome = vmNicsSome;
    }

    public VlanWhereInput vmNicsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS_SOME);
        return this;
    }

    public VlanWhereInput vmNicsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_SOME);
        return this;
    }

    public void setVmNicsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_SOME);
        }
    }

    public boolean getVmNicsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VlanWhereInput vlanWhereInput = (VlanWhereInput) o;
        return Objects.equals(this.AND, vlanWhereInput.AND)
                && Objects.equals(this.NOT, vlanWhereInput.NOT)
                && Objects.equals(this.OR, vlanWhereInput.OR)
                && Objects.equals(this.entityAsyncStatus, vlanWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, vlanWhereInput.entityAsyncStatusIn)
                && Objects.equals(this.entityAsyncStatusNot, vlanWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, vlanWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.gatewayIp, vlanWhereInput.gatewayIp)
                && Objects.equals(this.gatewayIpContains, vlanWhereInput.gatewayIpContains)
                && Objects.equals(this.gatewayIpEndsWith, vlanWhereInput.gatewayIpEndsWith)
                && Objects.equals(this.gatewayIpGt, vlanWhereInput.gatewayIpGt)
                && Objects.equals(this.gatewayIpGte, vlanWhereInput.gatewayIpGte)
                && Objects.equals(this.gatewayIpIn, vlanWhereInput.gatewayIpIn)
                && Objects.equals(this.gatewayIpLt, vlanWhereInput.gatewayIpLt)
                && Objects.equals(this.gatewayIpLte, vlanWhereInput.gatewayIpLte)
                && Objects.equals(this.gatewayIpNot, vlanWhereInput.gatewayIpNot)
                && Objects.equals(this.gatewayIpNotContains, vlanWhereInput.gatewayIpNotContains)
                && Objects.equals(this.gatewayIpNotEndsWith, vlanWhereInput.gatewayIpNotEndsWith)
                && Objects.equals(this.gatewayIpNotIn, vlanWhereInput.gatewayIpNotIn)
                && Objects.equals(
                        this.gatewayIpNotStartsWith, vlanWhereInput.gatewayIpNotStartsWith)
                && Objects.equals(this.gatewayIpStartsWith, vlanWhereInput.gatewayIpStartsWith)
                && Objects.equals(this.gatewaySubnetmask, vlanWhereInput.gatewaySubnetmask)
                && Objects.equals(
                        this.gatewaySubnetmaskContains, vlanWhereInput.gatewaySubnetmaskContains)
                && Objects.equals(
                        this.gatewaySubnetmaskEndsWith, vlanWhereInput.gatewaySubnetmaskEndsWith)
                && Objects.equals(this.gatewaySubnetmaskGt, vlanWhereInput.gatewaySubnetmaskGt)
                && Objects.equals(this.gatewaySubnetmaskGte, vlanWhereInput.gatewaySubnetmaskGte)
                && Objects.equals(this.gatewaySubnetmaskIn, vlanWhereInput.gatewaySubnetmaskIn)
                && Objects.equals(this.gatewaySubnetmaskLt, vlanWhereInput.gatewaySubnetmaskLt)
                && Objects.equals(this.gatewaySubnetmaskLte, vlanWhereInput.gatewaySubnetmaskLte)
                && Objects.equals(this.gatewaySubnetmaskNot, vlanWhereInput.gatewaySubnetmaskNot)
                && Objects.equals(
                        this.gatewaySubnetmaskNotContains,
                        vlanWhereInput.gatewaySubnetmaskNotContains)
                && Objects.equals(
                        this.gatewaySubnetmaskNotEndsWith,
                        vlanWhereInput.gatewaySubnetmaskNotEndsWith)
                && Objects.equals(
                        this.gatewaySubnetmaskNotIn, vlanWhereInput.gatewaySubnetmaskNotIn)
                && Objects.equals(
                        this.gatewaySubnetmaskNotStartsWith,
                        vlanWhereInput.gatewaySubnetmaskNotStartsWith)
                && Objects.equals(
                        this.gatewaySubnetmaskStartsWith,
                        vlanWhereInput.gatewaySubnetmaskStartsWith)
                && Objects.equals(this.id, vlanWhereInput.id)
                && Objects.equals(this.idContains, vlanWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vlanWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vlanWhereInput.idGt)
                && Objects.equals(this.idGte, vlanWhereInput.idGte)
                && Objects.equals(this.idIn, vlanWhereInput.idIn)
                && Objects.equals(this.idLt, vlanWhereInput.idLt)
                && Objects.equals(this.idLte, vlanWhereInput.idLte)
                && Objects.equals(this.idNot, vlanWhereInput.idNot)
                && Objects.equals(this.idNotContains, vlanWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vlanWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vlanWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vlanWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vlanWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, vlanWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, vlanWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, vlanWhereInput.labelsSome)
                && Objects.equals(this.localId, vlanWhereInput.localId)
                && Objects.equals(this.localIdContains, vlanWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vlanWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vlanWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vlanWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vlanWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vlanWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vlanWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vlanWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, vlanWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, vlanWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vlanWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, vlanWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, vlanWhereInput.localIdStartsWith)
                && Objects.equals(this.modeType, vlanWhereInput.modeType)
                && Objects.equals(this.modeTypeIn, vlanWhereInput.modeTypeIn)
                && Objects.equals(this.modeTypeNot, vlanWhereInput.modeTypeNot)
                && Objects.equals(this.modeTypeNotIn, vlanWhereInput.modeTypeNotIn)
                && Objects.equals(this.name, vlanWhereInput.name)
                && Objects.equals(this.nameContains, vlanWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vlanWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vlanWhereInput.nameGt)
                && Objects.equals(this.nameGte, vlanWhereInput.nameGte)
                && Objects.equals(this.nameIn, vlanWhereInput.nameIn)
                && Objects.equals(this.nameLt, vlanWhereInput.nameLt)
                && Objects.equals(this.nameLte, vlanWhereInput.nameLte)
                && Objects.equals(this.nameNot, vlanWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vlanWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vlanWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vlanWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, vlanWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vlanWhereInput.nameStartsWith)
                && Objects.equals(this.qosBurst, vlanWhereInput.qosBurst)
                && Objects.equals(this.qosBurstGt, vlanWhereInput.qosBurstGt)
                && Objects.equals(this.qosBurstGte, vlanWhereInput.qosBurstGte)
                && Objects.equals(this.qosBurstIn, vlanWhereInput.qosBurstIn)
                && Objects.equals(this.qosBurstLt, vlanWhereInput.qosBurstLt)
                && Objects.equals(this.qosBurstLte, vlanWhereInput.qosBurstLte)
                && Objects.equals(this.qosBurstNot, vlanWhereInput.qosBurstNot)
                && Objects.equals(this.qosBurstNotIn, vlanWhereInput.qosBurstNotIn)
                && Objects.equals(this.qosMaxBandwidth, vlanWhereInput.qosMaxBandwidth)
                && Objects.equals(this.qosMaxBandwidthGt, vlanWhereInput.qosMaxBandwidthGt)
                && Objects.equals(this.qosMaxBandwidthGte, vlanWhereInput.qosMaxBandwidthGte)
                && Objects.equals(this.qosMaxBandwidthIn, vlanWhereInput.qosMaxBandwidthIn)
                && Objects.equals(this.qosMaxBandwidthLt, vlanWhereInput.qosMaxBandwidthLt)
                && Objects.equals(this.qosMaxBandwidthLte, vlanWhereInput.qosMaxBandwidthLte)
                && Objects.equals(this.qosMaxBandwidthNot, vlanWhereInput.qosMaxBandwidthNot)
                && Objects.equals(this.qosMaxBandwidthNotIn, vlanWhereInput.qosMaxBandwidthNotIn)
                && Objects.equals(this.qosMinBandwidth, vlanWhereInput.qosMinBandwidth)
                && Objects.equals(this.qosMinBandwidthGt, vlanWhereInput.qosMinBandwidthGt)
                && Objects.equals(this.qosMinBandwidthGte, vlanWhereInput.qosMinBandwidthGte)
                && Objects.equals(this.qosMinBandwidthIn, vlanWhereInput.qosMinBandwidthIn)
                && Objects.equals(this.qosMinBandwidthLt, vlanWhereInput.qosMinBandwidthLt)
                && Objects.equals(this.qosMinBandwidthLte, vlanWhereInput.qosMinBandwidthLte)
                && Objects.equals(this.qosMinBandwidthNot, vlanWhereInput.qosMinBandwidthNot)
                && Objects.equals(this.qosMinBandwidthNotIn, vlanWhereInput.qosMinBandwidthNotIn)
                && Objects.equals(this.qosPriority, vlanWhereInput.qosPriority)
                && Objects.equals(this.qosPriorityGt, vlanWhereInput.qosPriorityGt)
                && Objects.equals(this.qosPriorityGte, vlanWhereInput.qosPriorityGte)
                && Objects.equals(this.qosPriorityIn, vlanWhereInput.qosPriorityIn)
                && Objects.equals(this.qosPriorityLt, vlanWhereInput.qosPriorityLt)
                && Objects.equals(this.qosPriorityLte, vlanWhereInput.qosPriorityLte)
                && Objects.equals(this.qosPriorityNot, vlanWhereInput.qosPriorityNot)
                && Objects.equals(this.qosPriorityNotIn, vlanWhereInput.qosPriorityNotIn)
                && Objects.equals(this.subnetmask, vlanWhereInput.subnetmask)
                && Objects.equals(this.subnetmaskContains, vlanWhereInput.subnetmaskContains)
                && Objects.equals(this.subnetmaskEndsWith, vlanWhereInput.subnetmaskEndsWith)
                && Objects.equals(this.subnetmaskGt, vlanWhereInput.subnetmaskGt)
                && Objects.equals(this.subnetmaskGte, vlanWhereInput.subnetmaskGte)
                && Objects.equals(this.subnetmaskIn, vlanWhereInput.subnetmaskIn)
                && Objects.equals(this.subnetmaskLt, vlanWhereInput.subnetmaskLt)
                && Objects.equals(this.subnetmaskLte, vlanWhereInput.subnetmaskLte)
                && Objects.equals(this.subnetmaskNot, vlanWhereInput.subnetmaskNot)
                && Objects.equals(this.subnetmaskNotContains, vlanWhereInput.subnetmaskNotContains)
                && Objects.equals(this.subnetmaskNotEndsWith, vlanWhereInput.subnetmaskNotEndsWith)
                && Objects.equals(this.subnetmaskNotIn, vlanWhereInput.subnetmaskNotIn)
                && Objects.equals(
                        this.subnetmaskNotStartsWith, vlanWhereInput.subnetmaskNotStartsWith)
                && Objects.equals(this.subnetmaskStartsWith, vlanWhereInput.subnetmaskStartsWith)
                && Objects.equals(this.type, vlanWhereInput.type)
                && Objects.equals(this.typeIn, vlanWhereInput.typeIn)
                && Objects.equals(this.typeNot, vlanWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vlanWhereInput.typeNotIn)
                && Objects.equals(this.vds, vlanWhereInput.vds)
                && Objects.equals(this.vlanId, vlanWhereInput.vlanId)
                && Objects.equals(this.vlanIdGt, vlanWhereInput.vlanIdGt)
                && Objects.equals(this.vlanIdGte, vlanWhereInput.vlanIdGte)
                && Objects.equals(this.vlanIdIn, vlanWhereInput.vlanIdIn)
                && Objects.equals(this.vlanIdLt, vlanWhereInput.vlanIdLt)
                && Objects.equals(this.vlanIdLte, vlanWhereInput.vlanIdLte)
                && Objects.equals(this.vlanIdNot, vlanWhereInput.vlanIdNot)
                && Objects.equals(this.vlanIdNotIn, vlanWhereInput.vlanIdNotIn)
                && Objects.equals(this.vmNicsEvery, vlanWhereInput.vmNicsEvery)
                && Objects.equals(this.vmNicsNone, vlanWhereInput.vmNicsNone)
                && Objects.equals(this.vmNicsSome, vlanWhereInput.vmNicsSome);
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                gatewayIp,
                gatewayIpContains,
                gatewayIpEndsWith,
                gatewayIpGt,
                gatewayIpGte,
                gatewayIpIn,
                gatewayIpLt,
                gatewayIpLte,
                gatewayIpNot,
                gatewayIpNotContains,
                gatewayIpNotEndsWith,
                gatewayIpNotIn,
                gatewayIpNotStartsWith,
                gatewayIpStartsWith,
                gatewaySubnetmask,
                gatewaySubnetmaskContains,
                gatewaySubnetmaskEndsWith,
                gatewaySubnetmaskGt,
                gatewaySubnetmaskGte,
                gatewaySubnetmaskIn,
                gatewaySubnetmaskLt,
                gatewaySubnetmaskLte,
                gatewaySubnetmaskNot,
                gatewaySubnetmaskNotContains,
                gatewaySubnetmaskNotEndsWith,
                gatewaySubnetmaskNotIn,
                gatewaySubnetmaskNotStartsWith,
                gatewaySubnetmaskStartsWith,
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
                modeType,
                modeTypeIn,
                modeTypeNot,
                modeTypeNotIn,
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
                qosBurst,
                qosBurstGt,
                qosBurstGte,
                qosBurstIn,
                qosBurstLt,
                qosBurstLte,
                qosBurstNot,
                qosBurstNotIn,
                qosMaxBandwidth,
                qosMaxBandwidthGt,
                qosMaxBandwidthGte,
                qosMaxBandwidthIn,
                qosMaxBandwidthLt,
                qosMaxBandwidthLte,
                qosMaxBandwidthNot,
                qosMaxBandwidthNotIn,
                qosMinBandwidth,
                qosMinBandwidthGt,
                qosMinBandwidthGte,
                qosMinBandwidthIn,
                qosMinBandwidthLt,
                qosMinBandwidthLte,
                qosMinBandwidthNot,
                qosMinBandwidthNotIn,
                qosPriority,
                qosPriorityGt,
                qosPriorityGte,
                qosPriorityIn,
                qosPriorityLt,
                qosPriorityLte,
                qosPriorityNot,
                qosPriorityNotIn,
                subnetmask,
                subnetmaskContains,
                subnetmaskEndsWith,
                subnetmaskGt,
                subnetmaskGte,
                subnetmaskIn,
                subnetmaskLt,
                subnetmaskLte,
                subnetmaskNot,
                subnetmaskNotContains,
                subnetmaskNotEndsWith,
                subnetmaskNotIn,
                subnetmaskNotStartsWith,
                subnetmaskStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vds,
                vlanId,
                vlanIdGt,
                vlanIdGte,
                vlanIdIn,
                vlanIdLt,
                vlanIdLte,
                vlanIdNot,
                vlanIdNotIn,
                vmNicsEvery,
                vmNicsNone,
                vmNicsSome);
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
        sb.append("class VlanWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    gatewayIpContains: ")
                .append(toIndentedString(gatewayIpContains))
                .append("\n");
        sb.append("    gatewayIpEndsWith: ")
                .append(toIndentedString(gatewayIpEndsWith))
                .append("\n");
        sb.append("    gatewayIpGt: ").append(toIndentedString(gatewayIpGt)).append("\n");
        sb.append("    gatewayIpGte: ").append(toIndentedString(gatewayIpGte)).append("\n");
        sb.append("    gatewayIpIn: ").append(toIndentedString(gatewayIpIn)).append("\n");
        sb.append("    gatewayIpLt: ").append(toIndentedString(gatewayIpLt)).append("\n");
        sb.append("    gatewayIpLte: ").append(toIndentedString(gatewayIpLte)).append("\n");
        sb.append("    gatewayIpNot: ").append(toIndentedString(gatewayIpNot)).append("\n");
        sb.append("    gatewayIpNotContains: ")
                .append(toIndentedString(gatewayIpNotContains))
                .append("\n");
        sb.append("    gatewayIpNotEndsWith: ")
                .append(toIndentedString(gatewayIpNotEndsWith))
                .append("\n");
        sb.append("    gatewayIpNotIn: ").append(toIndentedString(gatewayIpNotIn)).append("\n");
        sb.append("    gatewayIpNotStartsWith: ")
                .append(toIndentedString(gatewayIpNotStartsWith))
                .append("\n");
        sb.append("    gatewayIpStartsWith: ")
                .append(toIndentedString(gatewayIpStartsWith))
                .append("\n");
        sb.append("    gatewaySubnetmask: ")
                .append(toIndentedString(gatewaySubnetmask))
                .append("\n");
        sb.append("    gatewaySubnetmaskContains: ")
                .append(toIndentedString(gatewaySubnetmaskContains))
                .append("\n");
        sb.append("    gatewaySubnetmaskEndsWith: ")
                .append(toIndentedString(gatewaySubnetmaskEndsWith))
                .append("\n");
        sb.append("    gatewaySubnetmaskGt: ")
                .append(toIndentedString(gatewaySubnetmaskGt))
                .append("\n");
        sb.append("    gatewaySubnetmaskGte: ")
                .append(toIndentedString(gatewaySubnetmaskGte))
                .append("\n");
        sb.append("    gatewaySubnetmaskIn: ")
                .append(toIndentedString(gatewaySubnetmaskIn))
                .append("\n");
        sb.append("    gatewaySubnetmaskLt: ")
                .append(toIndentedString(gatewaySubnetmaskLt))
                .append("\n");
        sb.append("    gatewaySubnetmaskLte: ")
                .append(toIndentedString(gatewaySubnetmaskLte))
                .append("\n");
        sb.append("    gatewaySubnetmaskNot: ")
                .append(toIndentedString(gatewaySubnetmaskNot))
                .append("\n");
        sb.append("    gatewaySubnetmaskNotContains: ")
                .append(toIndentedString(gatewaySubnetmaskNotContains))
                .append("\n");
        sb.append("    gatewaySubnetmaskNotEndsWith: ")
                .append(toIndentedString(gatewaySubnetmaskNotEndsWith))
                .append("\n");
        sb.append("    gatewaySubnetmaskNotIn: ")
                .append(toIndentedString(gatewaySubnetmaskNotIn))
                .append("\n");
        sb.append("    gatewaySubnetmaskNotStartsWith: ")
                .append(toIndentedString(gatewaySubnetmaskNotStartsWith))
                .append("\n");
        sb.append("    gatewaySubnetmaskStartsWith: ")
                .append(toIndentedString(gatewaySubnetmaskStartsWith))
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
        sb.append("    modeType: ").append(toIndentedString(modeType)).append("\n");
        sb.append("    modeTypeIn: ").append(toIndentedString(modeTypeIn)).append("\n");
        sb.append("    modeTypeNot: ").append(toIndentedString(modeTypeNot)).append("\n");
        sb.append("    modeTypeNotIn: ").append(toIndentedString(modeTypeNotIn)).append("\n");
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
        sb.append("    qosBurst: ").append(toIndentedString(qosBurst)).append("\n");
        sb.append("    qosBurstGt: ").append(toIndentedString(qosBurstGt)).append("\n");
        sb.append("    qosBurstGte: ").append(toIndentedString(qosBurstGte)).append("\n");
        sb.append("    qosBurstIn: ").append(toIndentedString(qosBurstIn)).append("\n");
        sb.append("    qosBurstLt: ").append(toIndentedString(qosBurstLt)).append("\n");
        sb.append("    qosBurstLte: ").append(toIndentedString(qosBurstLte)).append("\n");
        sb.append("    qosBurstNot: ").append(toIndentedString(qosBurstNot)).append("\n");
        sb.append("    qosBurstNotIn: ").append(toIndentedString(qosBurstNotIn)).append("\n");
        sb.append("    qosMaxBandwidth: ").append(toIndentedString(qosMaxBandwidth)).append("\n");
        sb.append("    qosMaxBandwidthGt: ")
                .append(toIndentedString(qosMaxBandwidthGt))
                .append("\n");
        sb.append("    qosMaxBandwidthGte: ")
                .append(toIndentedString(qosMaxBandwidthGte))
                .append("\n");
        sb.append("    qosMaxBandwidthIn: ")
                .append(toIndentedString(qosMaxBandwidthIn))
                .append("\n");
        sb.append("    qosMaxBandwidthLt: ")
                .append(toIndentedString(qosMaxBandwidthLt))
                .append("\n");
        sb.append("    qosMaxBandwidthLte: ")
                .append(toIndentedString(qosMaxBandwidthLte))
                .append("\n");
        sb.append("    qosMaxBandwidthNot: ")
                .append(toIndentedString(qosMaxBandwidthNot))
                .append("\n");
        sb.append("    qosMaxBandwidthNotIn: ")
                .append(toIndentedString(qosMaxBandwidthNotIn))
                .append("\n");
        sb.append("    qosMinBandwidth: ").append(toIndentedString(qosMinBandwidth)).append("\n");
        sb.append("    qosMinBandwidthGt: ")
                .append(toIndentedString(qosMinBandwidthGt))
                .append("\n");
        sb.append("    qosMinBandwidthGte: ")
                .append(toIndentedString(qosMinBandwidthGte))
                .append("\n");
        sb.append("    qosMinBandwidthIn: ")
                .append(toIndentedString(qosMinBandwidthIn))
                .append("\n");
        sb.append("    qosMinBandwidthLt: ")
                .append(toIndentedString(qosMinBandwidthLt))
                .append("\n");
        sb.append("    qosMinBandwidthLte: ")
                .append(toIndentedString(qosMinBandwidthLte))
                .append("\n");
        sb.append("    qosMinBandwidthNot: ")
                .append(toIndentedString(qosMinBandwidthNot))
                .append("\n");
        sb.append("    qosMinBandwidthNotIn: ")
                .append(toIndentedString(qosMinBandwidthNotIn))
                .append("\n");
        sb.append("    qosPriority: ").append(toIndentedString(qosPriority)).append("\n");
        sb.append("    qosPriorityGt: ").append(toIndentedString(qosPriorityGt)).append("\n");
        sb.append("    qosPriorityGte: ").append(toIndentedString(qosPriorityGte)).append("\n");
        sb.append("    qosPriorityIn: ").append(toIndentedString(qosPriorityIn)).append("\n");
        sb.append("    qosPriorityLt: ").append(toIndentedString(qosPriorityLt)).append("\n");
        sb.append("    qosPriorityLte: ").append(toIndentedString(qosPriorityLte)).append("\n");
        sb.append("    qosPriorityNot: ").append(toIndentedString(qosPriorityNot)).append("\n");
        sb.append("    qosPriorityNotIn: ").append(toIndentedString(qosPriorityNotIn)).append("\n");
        sb.append("    subnetmask: ").append(toIndentedString(subnetmask)).append("\n");
        sb.append("    subnetmaskContains: ")
                .append(toIndentedString(subnetmaskContains))
                .append("\n");
        sb.append("    subnetmaskEndsWith: ")
                .append(toIndentedString(subnetmaskEndsWith))
                .append("\n");
        sb.append("    subnetmaskGt: ").append(toIndentedString(subnetmaskGt)).append("\n");
        sb.append("    subnetmaskGte: ").append(toIndentedString(subnetmaskGte)).append("\n");
        sb.append("    subnetmaskIn: ").append(toIndentedString(subnetmaskIn)).append("\n");
        sb.append("    subnetmaskLt: ").append(toIndentedString(subnetmaskLt)).append("\n");
        sb.append("    subnetmaskLte: ").append(toIndentedString(subnetmaskLte)).append("\n");
        sb.append("    subnetmaskNot: ").append(toIndentedString(subnetmaskNot)).append("\n");
        sb.append("    subnetmaskNotContains: ")
                .append(toIndentedString(subnetmaskNotContains))
                .append("\n");
        sb.append("    subnetmaskNotEndsWith: ")
                .append(toIndentedString(subnetmaskNotEndsWith))
                .append("\n");
        sb.append("    subnetmaskNotIn: ").append(toIndentedString(subnetmaskNotIn)).append("\n");
        sb.append("    subnetmaskNotStartsWith: ")
                .append(toIndentedString(subnetmaskNotStartsWith))
                .append("\n");
        sb.append("    subnetmaskStartsWith: ")
                .append(toIndentedString(subnetmaskStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    vlanIdGt: ").append(toIndentedString(vlanIdGt)).append("\n");
        sb.append("    vlanIdGte: ").append(toIndentedString(vlanIdGte)).append("\n");
        sb.append("    vlanIdIn: ").append(toIndentedString(vlanIdIn)).append("\n");
        sb.append("    vlanIdLt: ").append(toIndentedString(vlanIdLt)).append("\n");
        sb.append("    vlanIdLte: ").append(toIndentedString(vlanIdLte)).append("\n");
        sb.append("    vlanIdNot: ").append(toIndentedString(vlanIdNot)).append("\n");
        sb.append("    vlanIdNotIn: ").append(toIndentedString(vlanIdNotIn)).append("\n");
        sb.append("    vmNicsEvery: ").append(toIndentedString(vmNicsEvery)).append("\n");
        sb.append("    vmNicsNone: ").append(toIndentedString(vmNicsNone)).append("\n");
        sb.append("    vmNicsSome: ").append(toIndentedString(vmNicsSome)).append("\n");
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

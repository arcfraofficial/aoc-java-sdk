package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmNicWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNicWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmNicWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmNicWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmNicWhereInput> OR = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT =
            "egress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double egressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT =
            "egress_rate_limit_burst_in_bit_gt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT)
    private Double egressRateLimitBurstInBitGt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE =
            "egress_rate_limit_burst_in_bit_gte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE)
    private Double egressRateLimitBurstInBitGte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN =
            "egress_rate_limit_burst_in_bit_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN)
    private List<Double> egressRateLimitBurstInBitIn = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT =
            "egress_rate_limit_burst_in_bit_lt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT)
    private Double egressRateLimitBurstInBitLt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE =
            "egress_rate_limit_burst_in_bit_lte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE)
    private Double egressRateLimitBurstInBitLte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT =
            "egress_rate_limit_burst_in_bit_not";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT)
    private Double egressRateLimitBurstInBitNot;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN =
            "egress_rate_limit_burst_in_bit_not_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN)
    private List<Double> egressRateLimitBurstInBitNotIn = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED =
            "egress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED)
    private Boolean egressRateLimitEnabled;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT =
            "egress_rate_limit_enabled_not";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT)
    private Boolean egressRateLimitEnabledNot;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "egress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double egressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT =
            "egress_rate_limit_max_rate_in_bitps_gt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT)
    private Double egressRateLimitMaxRateInBitpsGt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE =
            "egress_rate_limit_max_rate_in_bitps_gte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE)
    private Double egressRateLimitMaxRateInBitpsGte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN =
            "egress_rate_limit_max_rate_in_bitps_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN)
    private List<Double> egressRateLimitMaxRateInBitpsIn = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT =
            "egress_rate_limit_max_rate_in_bitps_lt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT)
    private Double egressRateLimitMaxRateInBitpsLt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE =
            "egress_rate_limit_max_rate_in_bitps_lte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE)
    private Double egressRateLimitMaxRateInBitpsLte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT =
            "egress_rate_limit_max_rate_in_bitps_not";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT)
    private Double egressRateLimitMaxRateInBitpsNot;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN =
            "egress_rate_limit_max_rate_in_bitps_not_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN)
    private List<Double> egressRateLimitMaxRateInBitpsNotIn = null;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ENABLED_NOT = "enabled_not";

    @SerializedName(SERIALIZED_NAME_ENABLED_NOT)
    private Boolean enabledNot;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_GATEWAY_CONTAINS = "gateway_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_CONTAINS)
    private String gatewayContains;

    public static final String SERIALIZED_NAME_GATEWAY_ENDS_WITH = "gateway_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_ENDS_WITH)
    private String gatewayEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_GT = "gateway_gt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_GT)
    private String gatewayGt;

    public static final String SERIALIZED_NAME_GATEWAY_GTE = "gateway_gte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_GTE)
    private String gatewayGte;

    public static final String SERIALIZED_NAME_GATEWAY_IN = "gateway_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IN)
    private List<String> gatewayIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_LT = "gateway_lt";

    @SerializedName(SERIALIZED_NAME_GATEWAY_LT)
    private String gatewayLt;

    public static final String SERIALIZED_NAME_GATEWAY_LTE = "gateway_lte";

    @SerializedName(SERIALIZED_NAME_GATEWAY_LTE)
    private String gatewayLte;

    public static final String SERIALIZED_NAME_GATEWAY_NOT = "gateway_not";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT)
    private String gatewayNot;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_CONTAINS = "gateway_not_contains";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS)
    private String gatewayNotContains;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH = "gateway_not_ends_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH)
    private String gatewayNotEndsWith;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_IN = "gateway_not_in";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_IN)
    private List<String> gatewayNotIn = null;

    public static final String SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH = "gateway_not_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH)
    private String gatewayNotStartsWith;

    public static final String SERIALIZED_NAME_GATEWAY_STARTS_WITH = "gateway_starts_with";

    @SerializedName(SERIALIZED_NAME_GATEWAY_STARTS_WITH)
    private String gatewayStartsWith;

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

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT =
            "ingress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double ingressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT =
            "ingress_rate_limit_burst_in_bit_gt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT)
    private Double ingressRateLimitBurstInBitGt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE =
            "ingress_rate_limit_burst_in_bit_gte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE)
    private Double ingressRateLimitBurstInBitGte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN =
            "ingress_rate_limit_burst_in_bit_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN)
    private List<Double> ingressRateLimitBurstInBitIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT =
            "ingress_rate_limit_burst_in_bit_lt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT)
    private Double ingressRateLimitBurstInBitLt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE =
            "ingress_rate_limit_burst_in_bit_lte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE)
    private Double ingressRateLimitBurstInBitLte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT =
            "ingress_rate_limit_burst_in_bit_not";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT)
    private Double ingressRateLimitBurstInBitNot;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN =
            "ingress_rate_limit_burst_in_bit_not_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN)
    private List<Double> ingressRateLimitBurstInBitNotIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED =
            "ingress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED)
    private Boolean ingressRateLimitEnabled;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT =
            "ingress_rate_limit_enabled_not";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT)
    private Boolean ingressRateLimitEnabledNot;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "ingress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double ingressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT =
            "ingress_rate_limit_max_rate_in_bitps_gt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT)
    private Double ingressRateLimitMaxRateInBitpsGt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE =
            "ingress_rate_limit_max_rate_in_bitps_gte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE)
    private Double ingressRateLimitMaxRateInBitpsGte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN =
            "ingress_rate_limit_max_rate_in_bitps_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN)
    private List<Double> ingressRateLimitMaxRateInBitpsIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT =
            "ingress_rate_limit_max_rate_in_bitps_lt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT)
    private Double ingressRateLimitMaxRateInBitpsLt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE =
            "ingress_rate_limit_max_rate_in_bitps_lte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE)
    private Double ingressRateLimitMaxRateInBitpsLte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT =
            "ingress_rate_limit_max_rate_in_bitps_not";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT)
    private Double ingressRateLimitMaxRateInBitpsNot;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN =
            "ingress_rate_limit_max_rate_in_bitps_not_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN)
    private List<Double> ingressRateLimitMaxRateInBitpsNotIn = null;

    public static final String SERIALIZED_NAME_INTERFACE_ID = "interface_id";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID)
    private String interfaceId;

    public static final String SERIALIZED_NAME_INTERFACE_ID_CONTAINS = "interface_id_contains";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_CONTAINS)
    private String interfaceIdContains;

    public static final String SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH = "interface_id_ends_with";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH)
    private String interfaceIdEndsWith;

    public static final String SERIALIZED_NAME_INTERFACE_ID_GT = "interface_id_gt";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_GT)
    private String interfaceIdGt;

    public static final String SERIALIZED_NAME_INTERFACE_ID_GTE = "interface_id_gte";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_GTE)
    private String interfaceIdGte;

    public static final String SERIALIZED_NAME_INTERFACE_ID_IN = "interface_id_in";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_IN)
    private List<String> interfaceIdIn = null;

    public static final String SERIALIZED_NAME_INTERFACE_ID_LT = "interface_id_lt";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_LT)
    private String interfaceIdLt;

    public static final String SERIALIZED_NAME_INTERFACE_ID_LTE = "interface_id_lte";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_LTE)
    private String interfaceIdLte;

    public static final String SERIALIZED_NAME_INTERFACE_ID_NOT = "interface_id_not";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_NOT)
    private String interfaceIdNot;

    public static final String SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS =
            "interface_id_not_contains";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS)
    private String interfaceIdNotContains;

    public static final String SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH =
            "interface_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH)
    private String interfaceIdNotEndsWith;

    public static final String SERIALIZED_NAME_INTERFACE_ID_NOT_IN = "interface_id_not_in";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_NOT_IN)
    private List<String> interfaceIdNotIn = null;

    public static final String SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH =
            "interface_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH)
    private String interfaceIdNotStartsWith;

    public static final String SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH =
            "interface_id_starts_with";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH)
    private String interfaceIdStartsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_IP_ADDRESS_CONTAINS = "ip_address_contains";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_CONTAINS)
    private String ipAddressContains;

    public static final String SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH = "ip_address_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH)
    private String ipAddressEndsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_GT = "ip_address_gt";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GT)
    private String ipAddressGt;

    public static final String SERIALIZED_NAME_IP_ADDRESS_GTE = "ip_address_gte";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GTE)
    private String ipAddressGte;

    public static final String SERIALIZED_NAME_IP_ADDRESS_IN = "ip_address_in";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_IN)
    private List<String> ipAddressIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS_LT = "ip_address_lt";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LT)
    private String ipAddressLt;

    public static final String SERIALIZED_NAME_IP_ADDRESS_LTE = "ip_address_lte";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LTE)
    private String ipAddressLte;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT = "ip_address_not";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT)
    private String ipAddressNot;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS = "ip_address_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS)
    private String ipAddressNotContains;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH =
            "ip_address_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH)
    private String ipAddressNotEndsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_IN = "ip_address_not_in";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_IN)
    private List<String> ipAddressNotIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH =
            "ip_address_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH)
    private String ipAddressNotStartsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH = "ip_address_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH)
    private String ipAddressStartsWith;

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

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_CONTAINS = "mac_address_contains";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS)
    private String macAddressContains;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH = "mac_address_ends_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH)
    private String macAddressEndsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_GT = "mac_address_gt";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GT)
    private String macAddressGt;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_GTE = "mac_address_gte";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GTE)
    private String macAddressGte;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_IN = "mac_address_in";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_IN)
    private List<String> macAddressIn = null;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_LT = "mac_address_lt";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LT)
    private String macAddressLt;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_LTE = "mac_address_lte";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LTE)
    private String macAddressLte;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT = "mac_address_not";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT)
    private String macAddressNot;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS =
            "mac_address_not_contains";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS)
    private String macAddressNotContains;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH =
            "mac_address_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH)
    private String macAddressNotEndsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_IN = "mac_address_not_in";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN)
    private List<String> macAddressNotIn = null;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH =
            "mac_address_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH)
    private String macAddressNotStartsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH = "mac_address_starts_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH)
    private String macAddressStartsWith;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MIRROR_NOT = "mirror_not";

    @SerializedName(SERIALIZED_NAME_MIRROR_NOT)
    private Boolean mirrorNot;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private VmNicModel model;

    public static final String SERIALIZED_NAME_MODEL_IN = "model_in";

    @SerializedName(SERIALIZED_NAME_MODEL_IN)
    private List<VmNicModel> modelIn = null;

    public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT)
    private VmNicModel modelNot;

    public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
    private List<VmNicModel> modelNotIn = null;

    public static final String SERIALIZED_NAME_NIC = "nic";

    @SerializedName(SERIALIZED_NAME_NIC)
    private NicWhereInput nic;

    public static final String SERIALIZED_NAME_ORDER = "order";

    @SerializedName(SERIALIZED_NAME_ORDER)
    private Integer order;

    public static final String SERIALIZED_NAME_ORDER_GT = "order_gt";

    @SerializedName(SERIALIZED_NAME_ORDER_GT)
    private Integer orderGt;

    public static final String SERIALIZED_NAME_ORDER_GTE = "order_gte";

    @SerializedName(SERIALIZED_NAME_ORDER_GTE)
    private Integer orderGte;

    public static final String SERIALIZED_NAME_ORDER_IN = "order_in";

    @SerializedName(SERIALIZED_NAME_ORDER_IN)
    private List<Integer> orderIn = null;

    public static final String SERIALIZED_NAME_ORDER_LT = "order_lt";

    @SerializedName(SERIALIZED_NAME_ORDER_LT)
    private Integer orderLt;

    public static final String SERIALIZED_NAME_ORDER_LTE = "order_lte";

    @SerializedName(SERIALIZED_NAME_ORDER_LTE)
    private Integer orderLte;

    public static final String SERIALIZED_NAME_ORDER_NOT = "order_not";

    @SerializedName(SERIALIZED_NAME_ORDER_NOT)
    private Integer orderNot;

    public static final String SERIALIZED_NAME_ORDER_NOT_IN = "order_not_in";

    @SerializedName(SERIALIZED_NAME_ORDER_NOT_IN)
    private List<Integer> orderNotIn = null;

    public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
    private String subnetMask;

    public static final String SERIALIZED_NAME_SUBNET_MASK_CONTAINS = "subnet_mask_contains";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_CONTAINS)
    private String subnetMaskContains;

    public static final String SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH = "subnet_mask_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH)
    private String subnetMaskEndsWith;

    public static final String SERIALIZED_NAME_SUBNET_MASK_GT = "subnet_mask_gt";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_GT)
    private String subnetMaskGt;

    public static final String SERIALIZED_NAME_SUBNET_MASK_GTE = "subnet_mask_gte";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_GTE)
    private String subnetMaskGte;

    public static final String SERIALIZED_NAME_SUBNET_MASK_IN = "subnet_mask_in";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_IN)
    private List<String> subnetMaskIn = null;

    public static final String SERIALIZED_NAME_SUBNET_MASK_LT = "subnet_mask_lt";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_LT)
    private String subnetMaskLt;

    public static final String SERIALIZED_NAME_SUBNET_MASK_LTE = "subnet_mask_lte";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_LTE)
    private String subnetMaskLte;

    public static final String SERIALIZED_NAME_SUBNET_MASK_NOT = "subnet_mask_not";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT)
    private String subnetMaskNot;

    public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS =
            "subnet_mask_not_contains";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS)
    private String subnetMaskNotContains;

    public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH =
            "subnet_mask_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH)
    private String subnetMaskNotEndsWith;

    public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_IN = "subnet_mask_not_in";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_IN)
    private List<String> subnetMaskNotIn = null;

    public static final String SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH =
            "subnet_mask_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH)
    private String subnetMaskNotStartsWith;

    public static final String SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH = "subnet_mask_starts_with";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH)
    private String subnetMaskStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<VmNicType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private VmNicType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<VmNicType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private VlanWhereInput vlan;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public VmNicWhereInput() {}

    public VmNicWhereInput AND(List<VmNicWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmNicWhereInput addANDItem(VmNicWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmNicWhereInput>();
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
    public List<VmNicWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmNicWhereInput> AND) {
        this.AND = AND;
    }

    public VmNicWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmNicWhereInput AND_ExplictlyNonNull() {
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

    public VmNicWhereInput NOT(List<VmNicWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmNicWhereInput addNOTItem(VmNicWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmNicWhereInput>();
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
    public List<VmNicWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmNicWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmNicWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmNicWhereInput NOT_ExplictlyNonNull() {
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

    public VmNicWhereInput OR(List<VmNicWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmNicWhereInput addORItem(VmNicWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmNicWhereInput>();
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
    public List<VmNicWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmNicWhereInput> OR) {
        this.OR = OR;
    }

    public VmNicWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmNicWhereInput OR_ExplictlyNonNull() {
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

    public VmNicWhereInput egressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {

        this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBit
     *
     * @return egressRateLimitBurstInBit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBit() {
        return egressRateLimitBurstInBit;
    }

    public void setEgressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
        this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
    }

    public VmNicWhereInput egressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public void setEgressRateLimitBurstInBit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        }
    }

    public boolean getEgressRateLimitBurstInBit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
    }

    public VmNicWhereInput egressRateLimitBurstInBitGt(Double egressRateLimitBurstInBitGt) {

        this.egressRateLimitBurstInBitGt = egressRateLimitBurstInBitGt;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitGt
     *
     * @return egressRateLimitBurstInBitGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitGt() {
        return egressRateLimitBurstInBitGt;
    }

    public void setEgressRateLimitBurstInBitGt(Double egressRateLimitBurstInBitGt) {
        this.egressRateLimitBurstInBitGt = egressRateLimitBurstInBitGt;
    }

    public VmNicWhereInput egressRateLimitBurstInBitGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public void setEgressRateLimitBurstInBitGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        }
    }

    public boolean getEgressRateLimitBurstInBitGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
    }

    public VmNicWhereInput egressRateLimitBurstInBitGte(Double egressRateLimitBurstInBitGte) {

        this.egressRateLimitBurstInBitGte = egressRateLimitBurstInBitGte;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitGte
     *
     * @return egressRateLimitBurstInBitGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitGte() {
        return egressRateLimitBurstInBitGte;
    }

    public void setEgressRateLimitBurstInBitGte(Double egressRateLimitBurstInBitGte) {
        this.egressRateLimitBurstInBitGte = egressRateLimitBurstInBitGte;
    }

    public VmNicWhereInput egressRateLimitBurstInBitGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public void setEgressRateLimitBurstInBitGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        }
    }

    public boolean getEgressRateLimitBurstInBitGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
    }

    public VmNicWhereInput egressRateLimitBurstInBitIn(List<Double> egressRateLimitBurstInBitIn) {

        this.egressRateLimitBurstInBitIn = egressRateLimitBurstInBitIn;
        return this;
    }

    public VmNicWhereInput addEgressRateLimitBurstInBitInItem(
            Double egressRateLimitBurstInBitInItem) {
        if (this.egressRateLimitBurstInBitIn == null) {
            this.egressRateLimitBurstInBitIn = new ArrayList<Double>();
        }
        this.egressRateLimitBurstInBitIn.add(egressRateLimitBurstInBitInItem);
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitIn
     *
     * @return egressRateLimitBurstInBitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitBurstInBitIn() {
        return egressRateLimitBurstInBitIn;
    }

    public void setEgressRateLimitBurstInBitIn(List<Double> egressRateLimitBurstInBitIn) {
        this.egressRateLimitBurstInBitIn = egressRateLimitBurstInBitIn;
    }

    public VmNicWhereInput egressRateLimitBurstInBitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public void setEgressRateLimitBurstInBitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        }
    }

    public boolean getEgressRateLimitBurstInBitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
    }

    public VmNicWhereInput egressRateLimitBurstInBitLt(Double egressRateLimitBurstInBitLt) {

        this.egressRateLimitBurstInBitLt = egressRateLimitBurstInBitLt;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitLt
     *
     * @return egressRateLimitBurstInBitLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitLt() {
        return egressRateLimitBurstInBitLt;
    }

    public void setEgressRateLimitBurstInBitLt(Double egressRateLimitBurstInBitLt) {
        this.egressRateLimitBurstInBitLt = egressRateLimitBurstInBitLt;
    }

    public VmNicWhereInput egressRateLimitBurstInBitLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public void setEgressRateLimitBurstInBitLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        }
    }

    public boolean getEgressRateLimitBurstInBitLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
    }

    public VmNicWhereInput egressRateLimitBurstInBitLte(Double egressRateLimitBurstInBitLte) {

        this.egressRateLimitBurstInBitLte = egressRateLimitBurstInBitLte;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitLte
     *
     * @return egressRateLimitBurstInBitLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitLte() {
        return egressRateLimitBurstInBitLte;
    }

    public void setEgressRateLimitBurstInBitLte(Double egressRateLimitBurstInBitLte) {
        this.egressRateLimitBurstInBitLte = egressRateLimitBurstInBitLte;
    }

    public VmNicWhereInput egressRateLimitBurstInBitLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public void setEgressRateLimitBurstInBitLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        }
    }

    public boolean getEgressRateLimitBurstInBitLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
    }

    public VmNicWhereInput egressRateLimitBurstInBitNot(Double egressRateLimitBurstInBitNot) {

        this.egressRateLimitBurstInBitNot = egressRateLimitBurstInBitNot;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitNot
     *
     * @return egressRateLimitBurstInBitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitNot() {
        return egressRateLimitBurstInBitNot;
    }

    public void setEgressRateLimitBurstInBitNot(Double egressRateLimitBurstInBitNot) {
        this.egressRateLimitBurstInBitNot = egressRateLimitBurstInBitNot;
    }

    public VmNicWhereInput egressRateLimitBurstInBitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public void setEgressRateLimitBurstInBitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        }
    }

    public boolean getEgressRateLimitBurstInBitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
    }

    public VmNicWhereInput egressRateLimitBurstInBitNotIn(
            List<Double> egressRateLimitBurstInBitNotIn) {

        this.egressRateLimitBurstInBitNotIn = egressRateLimitBurstInBitNotIn;
        return this;
    }

    public VmNicWhereInput addEgressRateLimitBurstInBitNotInItem(
            Double egressRateLimitBurstInBitNotInItem) {
        if (this.egressRateLimitBurstInBitNotIn == null) {
            this.egressRateLimitBurstInBitNotIn = new ArrayList<Double>();
        }
        this.egressRateLimitBurstInBitNotIn.add(egressRateLimitBurstInBitNotInItem);
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitNotIn
     *
     * @return egressRateLimitBurstInBitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitBurstInBitNotIn() {
        return egressRateLimitBurstInBitNotIn;
    }

    public void setEgressRateLimitBurstInBitNotIn(List<Double> egressRateLimitBurstInBitNotIn) {
        this.egressRateLimitBurstInBitNotIn = egressRateLimitBurstInBitNotIn;
    }

    public VmNicWhereInput egressRateLimitBurstInBitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public VmNicWhereInput egressRateLimitBurstInBitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public void setEgressRateLimitBurstInBitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        }
    }

    public boolean getEgressRateLimitBurstInBitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
    }

    public VmNicWhereInput egressRateLimitEnabled(Boolean egressRateLimitEnabled) {

        this.egressRateLimitEnabled = egressRateLimitEnabled;
        return this;
    }

    /**
     * Get egressRateLimitEnabled
     *
     * @return egressRateLimitEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEgressRateLimitEnabled() {
        return egressRateLimitEnabled;
    }

    public void setEgressRateLimitEnabled(Boolean egressRateLimitEnabled) {
        this.egressRateLimitEnabled = egressRateLimitEnabled;
    }

    public VmNicWhereInput egressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public VmNicWhereInput egressRateLimitEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public void setEgressRateLimitEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        }
    }

    public boolean getEgressRateLimitEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
    }

    public VmNicWhereInput egressRateLimitEnabledNot(Boolean egressRateLimitEnabledNot) {

        this.egressRateLimitEnabledNot = egressRateLimitEnabledNot;
        return this;
    }

    /**
     * Get egressRateLimitEnabledNot
     *
     * @return egressRateLimitEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEgressRateLimitEnabledNot() {
        return egressRateLimitEnabledNot;
    }

    public void setEgressRateLimitEnabledNot(Boolean egressRateLimitEnabledNot) {
        this.egressRateLimitEnabledNot = egressRateLimitEnabledNot;
    }

    public VmNicWhereInput egressRateLimitEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public VmNicWhereInput egressRateLimitEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public void setEgressRateLimitEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        }
    }

    public boolean getEgressRateLimitEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {

        this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitps
     *
     * @return egressRateLimitMaxRateInBitps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitps() {
        return egressRateLimitMaxRateInBitps;
    }

    public void setEgressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
        this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsGt(Double egressRateLimitMaxRateInBitpsGt) {

        this.egressRateLimitMaxRateInBitpsGt = egressRateLimitMaxRateInBitpsGt;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsGt
     *
     * @return egressRateLimitMaxRateInBitpsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsGt() {
        return egressRateLimitMaxRateInBitpsGt;
    }

    public void setEgressRateLimitMaxRateInBitpsGt(Double egressRateLimitMaxRateInBitpsGt) {
        this.egressRateLimitMaxRateInBitpsGt = egressRateLimitMaxRateInBitpsGt;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsGte(
            Double egressRateLimitMaxRateInBitpsGte) {

        this.egressRateLimitMaxRateInBitpsGte = egressRateLimitMaxRateInBitpsGte;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsGte
     *
     * @return egressRateLimitMaxRateInBitpsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsGte() {
        return egressRateLimitMaxRateInBitpsGte;
    }

    public void setEgressRateLimitMaxRateInBitpsGte(Double egressRateLimitMaxRateInBitpsGte) {
        this.egressRateLimitMaxRateInBitpsGte = egressRateLimitMaxRateInBitpsGte;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsIn(
            List<Double> egressRateLimitMaxRateInBitpsIn) {

        this.egressRateLimitMaxRateInBitpsIn = egressRateLimitMaxRateInBitpsIn;
        return this;
    }

    public VmNicWhereInput addEgressRateLimitMaxRateInBitpsInItem(
            Double egressRateLimitMaxRateInBitpsInItem) {
        if (this.egressRateLimitMaxRateInBitpsIn == null) {
            this.egressRateLimitMaxRateInBitpsIn = new ArrayList<Double>();
        }
        this.egressRateLimitMaxRateInBitpsIn.add(egressRateLimitMaxRateInBitpsInItem);
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsIn
     *
     * @return egressRateLimitMaxRateInBitpsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitMaxRateInBitpsIn() {
        return egressRateLimitMaxRateInBitpsIn;
    }

    public void setEgressRateLimitMaxRateInBitpsIn(List<Double> egressRateLimitMaxRateInBitpsIn) {
        this.egressRateLimitMaxRateInBitpsIn = egressRateLimitMaxRateInBitpsIn;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsLt(Double egressRateLimitMaxRateInBitpsLt) {

        this.egressRateLimitMaxRateInBitpsLt = egressRateLimitMaxRateInBitpsLt;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsLt
     *
     * @return egressRateLimitMaxRateInBitpsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsLt() {
        return egressRateLimitMaxRateInBitpsLt;
    }

    public void setEgressRateLimitMaxRateInBitpsLt(Double egressRateLimitMaxRateInBitpsLt) {
        this.egressRateLimitMaxRateInBitpsLt = egressRateLimitMaxRateInBitpsLt;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsLte(
            Double egressRateLimitMaxRateInBitpsLte) {

        this.egressRateLimitMaxRateInBitpsLte = egressRateLimitMaxRateInBitpsLte;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsLte
     *
     * @return egressRateLimitMaxRateInBitpsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsLte() {
        return egressRateLimitMaxRateInBitpsLte;
    }

    public void setEgressRateLimitMaxRateInBitpsLte(Double egressRateLimitMaxRateInBitpsLte) {
        this.egressRateLimitMaxRateInBitpsLte = egressRateLimitMaxRateInBitpsLte;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsNot(
            Double egressRateLimitMaxRateInBitpsNot) {

        this.egressRateLimitMaxRateInBitpsNot = egressRateLimitMaxRateInBitpsNot;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsNot
     *
     * @return egressRateLimitMaxRateInBitpsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsNot() {
        return egressRateLimitMaxRateInBitpsNot;
    }

    public void setEgressRateLimitMaxRateInBitpsNot(Double egressRateLimitMaxRateInBitpsNot) {
        this.egressRateLimitMaxRateInBitpsNot = egressRateLimitMaxRateInBitpsNot;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsNotIn(
            List<Double> egressRateLimitMaxRateInBitpsNotIn) {

        this.egressRateLimitMaxRateInBitpsNotIn = egressRateLimitMaxRateInBitpsNotIn;
        return this;
    }

    public VmNicWhereInput addEgressRateLimitMaxRateInBitpsNotInItem(
            Double egressRateLimitMaxRateInBitpsNotInItem) {
        if (this.egressRateLimitMaxRateInBitpsNotIn == null) {
            this.egressRateLimitMaxRateInBitpsNotIn = new ArrayList<Double>();
        }
        this.egressRateLimitMaxRateInBitpsNotIn.add(egressRateLimitMaxRateInBitpsNotInItem);
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsNotIn
     *
     * @return egressRateLimitMaxRateInBitpsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitMaxRateInBitpsNotIn() {
        return egressRateLimitMaxRateInBitpsNotIn;
    }

    public void setEgressRateLimitMaxRateInBitpsNotIn(
            List<Double> egressRateLimitMaxRateInBitpsNotIn) {
        this.egressRateLimitMaxRateInBitpsNotIn = egressRateLimitMaxRateInBitpsNotIn;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public VmNicWhereInput egressRateLimitMaxRateInBitpsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
    }

    public VmNicWhereInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public VmNicWhereInput enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmNicWhereInput enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public VmNicWhereInput enabledNot(Boolean enabledNot) {

        this.enabledNot = enabledNot;
        return this;
    }

    /**
     * Get enabledNot
     *
     * @return enabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabledNot() {
        return enabledNot;
    }

    public void setEnabledNot(Boolean enabledNot) {
        this.enabledNot = enabledNot;
    }

    public VmNicWhereInput enabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public VmNicWhereInput enabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public void setEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        }
    }

    public boolean getEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED_NOT);
    }

    public VmNicWhereInput gateway(String gateway) {

        this.gateway = gateway;
        return this;
    }

    /**
     * Get gateway
     *
     * @return gateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public VmNicWhereInput gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VmNicWhereInput gateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public void setGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        }
    }

    public boolean getGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY);
    }

    public VmNicWhereInput gatewayContains(String gatewayContains) {

        this.gatewayContains = gatewayContains;
        return this;
    }

    /**
     * Get gatewayContains
     *
     * @return gatewayContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayContains() {
        return gatewayContains;
    }

    public void setGatewayContains(String gatewayContains) {
        this.gatewayContains = gatewayContains;
    }

    public VmNicWhereInput gatewayContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_CONTAINS);
        return this;
    }

    public VmNicWhereInput gatewayContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_CONTAINS);
        return this;
    }

    public void setGatewayContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_CONTAINS);
        }
    }

    public boolean getGatewayContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_CONTAINS);
    }

    public VmNicWhereInput gatewayEndsWith(String gatewayEndsWith) {

        this.gatewayEndsWith = gatewayEndsWith;
        return this;
    }

    /**
     * Get gatewayEndsWith
     *
     * @return gatewayEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayEndsWith() {
        return gatewayEndsWith;
    }

    public void setGatewayEndsWith(String gatewayEndsWith) {
        this.gatewayEndsWith = gatewayEndsWith;
    }

    public VmNicWhereInput gatewayEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput gatewayEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        return this;
    }

    public void setGatewayEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
        }
    }

    public boolean getGatewayEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_ENDS_WITH);
    }

    public VmNicWhereInput gatewayGt(String gatewayGt) {

        this.gatewayGt = gatewayGt;
        return this;
    }

    /**
     * Get gatewayGt
     *
     * @return gatewayGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayGt() {
        return gatewayGt;
    }

    public void setGatewayGt(String gatewayGt) {
        this.gatewayGt = gatewayGt;
    }

    public VmNicWhereInput gatewayGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GT);
        return this;
    }

    public VmNicWhereInput gatewayGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GT);
        return this;
    }

    public void setGatewayGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GT);
        }
    }

    public boolean getGatewayGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_GT);
    }

    public VmNicWhereInput gatewayGte(String gatewayGte) {

        this.gatewayGte = gatewayGte;
        return this;
    }

    /**
     * Get gatewayGte
     *
     * @return gatewayGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayGte() {
        return gatewayGte;
    }

    public void setGatewayGte(String gatewayGte) {
        this.gatewayGte = gatewayGte;
    }

    public VmNicWhereInput gatewayGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GTE);
        return this;
    }

    public VmNicWhereInput gatewayGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GTE);
        return this;
    }

    public void setGatewayGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_GTE);
        }
    }

    public boolean getGatewayGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_GTE);
    }

    public VmNicWhereInput gatewayIn(List<String> gatewayIn) {

        this.gatewayIn = gatewayIn;
        return this;
    }

    public VmNicWhereInput addGatewayInItem(String gatewayInItem) {
        if (this.gatewayIn == null) {
            this.gatewayIn = new ArrayList<String>();
        }
        this.gatewayIn.add(gatewayInItem);
        return this;
    }

    /**
     * Get gatewayIn
     *
     * @return gatewayIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewayIn() {
        return gatewayIn;
    }

    public void setGatewayIn(List<String> gatewayIn) {
        this.gatewayIn = gatewayIn;
    }

    public VmNicWhereInput gatewayIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IN);
        return this;
    }

    public VmNicWhereInput gatewayIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IN);
        return this;
    }

    public void setGatewayIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IN);
        }
    }

    public boolean getGatewayIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IN);
    }

    public VmNicWhereInput gatewayLt(String gatewayLt) {

        this.gatewayLt = gatewayLt;
        return this;
    }

    /**
     * Get gatewayLt
     *
     * @return gatewayLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayLt() {
        return gatewayLt;
    }

    public void setGatewayLt(String gatewayLt) {
        this.gatewayLt = gatewayLt;
    }

    public VmNicWhereInput gatewayLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LT);
        return this;
    }

    public VmNicWhereInput gatewayLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LT);
        return this;
    }

    public void setGatewayLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LT);
        }
    }

    public boolean getGatewayLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_LT);
    }

    public VmNicWhereInput gatewayLte(String gatewayLte) {

        this.gatewayLte = gatewayLte;
        return this;
    }

    /**
     * Get gatewayLte
     *
     * @return gatewayLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayLte() {
        return gatewayLte;
    }

    public void setGatewayLte(String gatewayLte) {
        this.gatewayLte = gatewayLte;
    }

    public VmNicWhereInput gatewayLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LTE);
        return this;
    }

    public VmNicWhereInput gatewayLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LTE);
        return this;
    }

    public void setGatewayLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_LTE);
        }
    }

    public boolean getGatewayLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_LTE);
    }

    public VmNicWhereInput gatewayNot(String gatewayNot) {

        this.gatewayNot = gatewayNot;
        return this;
    }

    /**
     * Get gatewayNot
     *
     * @return gatewayNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNot() {
        return gatewayNot;
    }

    public void setGatewayNot(String gatewayNot) {
        this.gatewayNot = gatewayNot;
    }

    public VmNicWhereInput gatewayNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT);
        return this;
    }

    public VmNicWhereInput gatewayNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT);
        return this;
    }

    public void setGatewayNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT);
        }
    }

    public boolean getGatewayNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT);
    }

    public VmNicWhereInput gatewayNotContains(String gatewayNotContains) {

        this.gatewayNotContains = gatewayNotContains;
        return this;
    }

    /**
     * Get gatewayNotContains
     *
     * @return gatewayNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNotContains() {
        return gatewayNotContains;
    }

    public void setGatewayNotContains(String gatewayNotContains) {
        this.gatewayNotContains = gatewayNotContains;
    }

    public VmNicWhereInput gatewayNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput gatewayNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        return this;
    }

    public void setGatewayNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
        }
    }

    public boolean getGatewayNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_CONTAINS);
    }

    public VmNicWhereInput gatewayNotEndsWith(String gatewayNotEndsWith) {

        this.gatewayNotEndsWith = gatewayNotEndsWith;
        return this;
    }

    /**
     * Get gatewayNotEndsWith
     *
     * @return gatewayNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNotEndsWith() {
        return gatewayNotEndsWith;
    }

    public void setGatewayNotEndsWith(String gatewayNotEndsWith) {
        this.gatewayNotEndsWith = gatewayNotEndsWith;
    }

    public VmNicWhereInput gatewayNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput gatewayNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        return this;
    }

    public void setGatewayNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
        }
    }

    public boolean getGatewayNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_ENDS_WITH);
    }

    public VmNicWhereInput gatewayNotIn(List<String> gatewayNotIn) {

        this.gatewayNotIn = gatewayNotIn;
        return this;
    }

    public VmNicWhereInput addGatewayNotInItem(String gatewayNotInItem) {
        if (this.gatewayNotIn == null) {
            this.gatewayNotIn = new ArrayList<String>();
        }
        this.gatewayNotIn.add(gatewayNotInItem);
        return this;
    }

    /**
     * Get gatewayNotIn
     *
     * @return gatewayNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getGatewayNotIn() {
        return gatewayNotIn;
    }

    public void setGatewayNotIn(List<String> gatewayNotIn) {
        this.gatewayNotIn = gatewayNotIn;
    }

    public VmNicWhereInput gatewayNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_IN);
        return this;
    }

    public VmNicWhereInput gatewayNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_IN);
        return this;
    }

    public void setGatewayNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_IN);
        }
    }

    public boolean getGatewayNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_IN);
    }

    public VmNicWhereInput gatewayNotStartsWith(String gatewayNotStartsWith) {

        this.gatewayNotStartsWith = gatewayNotStartsWith;
        return this;
    }

    /**
     * Get gatewayNotStartsWith
     *
     * @return gatewayNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayNotStartsWith() {
        return gatewayNotStartsWith;
    }

    public void setGatewayNotStartsWith(String gatewayNotStartsWith) {
        this.gatewayNotStartsWith = gatewayNotStartsWith;
    }

    public VmNicWhereInput gatewayNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput gatewayNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        return this;
    }

    public void setGatewayNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
        }
    }

    public boolean getGatewayNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_NOT_STARTS_WITH);
    }

    public VmNicWhereInput gatewayStartsWith(String gatewayStartsWith) {

        this.gatewayStartsWith = gatewayStartsWith;
        return this;
    }

    /**
     * Get gatewayStartsWith
     *
     * @return gatewayStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayStartsWith() {
        return gatewayStartsWith;
    }

    public void setGatewayStartsWith(String gatewayStartsWith) {
        this.gatewayStartsWith = gatewayStartsWith;
    }

    public VmNicWhereInput gatewayStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput gatewayStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        return this;
    }

    public void setGatewayStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
        }
    }

    public boolean getGatewayStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_STARTS_WITH);
    }

    public VmNicWhereInput id(String id) {

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

    public VmNicWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmNicWhereInput id_ExplictlyNonNull() {
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

    public VmNicWhereInput idContains(String idContains) {

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

    public VmNicWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmNicWhereInput idContains_ExplictlyNonNull() {
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

    public VmNicWhereInput idEndsWith(String idEndsWith) {

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

    public VmNicWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput idGt(String idGt) {

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

    public VmNicWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmNicWhereInput idGt_ExplictlyNonNull() {
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

    public VmNicWhereInput idGte(String idGte) {

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

    public VmNicWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmNicWhereInput idGte_ExplictlyNonNull() {
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

    public VmNicWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmNicWhereInput addIdInItem(String idInItem) {
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

    public VmNicWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmNicWhereInput idIn_ExplictlyNonNull() {
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

    public VmNicWhereInput idLt(String idLt) {

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

    public VmNicWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmNicWhereInput idLt_ExplictlyNonNull() {
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

    public VmNicWhereInput idLte(String idLte) {

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

    public VmNicWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmNicWhereInput idLte_ExplictlyNonNull() {
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

    public VmNicWhereInput idNot(String idNot) {

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

    public VmNicWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmNicWhereInput idNot_ExplictlyNonNull() {
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

    public VmNicWhereInput idNotContains(String idNotContains) {

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

    public VmNicWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmNicWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmNicWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmNicWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmNicWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmNicWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmNicWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmNicWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput idStartsWith(String idStartsWith) {

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

    public VmNicWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput ingressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {

        this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBit
     *
     * @return ingressRateLimitBurstInBit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBit() {
        return ingressRateLimitBurstInBit;
    }

    public void setIngressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
        this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
    }

    public VmNicWhereInput ingressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public void setIngressRateLimitBurstInBit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        }
    }

    public boolean getIngressRateLimitBurstInBit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitGt(Double ingressRateLimitBurstInBitGt) {

        this.ingressRateLimitBurstInBitGt = ingressRateLimitBurstInBitGt;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitGt
     *
     * @return ingressRateLimitBurstInBitGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitGt() {
        return ingressRateLimitBurstInBitGt;
    }

    public void setIngressRateLimitBurstInBitGt(Double ingressRateLimitBurstInBitGt) {
        this.ingressRateLimitBurstInBitGt = ingressRateLimitBurstInBitGt;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public void setIngressRateLimitBurstInBitGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        }
    }

    public boolean getIngressRateLimitBurstInBitGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitGte(Double ingressRateLimitBurstInBitGte) {

        this.ingressRateLimitBurstInBitGte = ingressRateLimitBurstInBitGte;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitGte
     *
     * @return ingressRateLimitBurstInBitGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitGte() {
        return ingressRateLimitBurstInBitGte;
    }

    public void setIngressRateLimitBurstInBitGte(Double ingressRateLimitBurstInBitGte) {
        this.ingressRateLimitBurstInBitGte = ingressRateLimitBurstInBitGte;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public void setIngressRateLimitBurstInBitGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        }
    }

    public boolean getIngressRateLimitBurstInBitGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitIn(List<Double> ingressRateLimitBurstInBitIn) {

        this.ingressRateLimitBurstInBitIn = ingressRateLimitBurstInBitIn;
        return this;
    }

    public VmNicWhereInput addIngressRateLimitBurstInBitInItem(
            Double ingressRateLimitBurstInBitInItem) {
        if (this.ingressRateLimitBurstInBitIn == null) {
            this.ingressRateLimitBurstInBitIn = new ArrayList<Double>();
        }
        this.ingressRateLimitBurstInBitIn.add(ingressRateLimitBurstInBitInItem);
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitIn
     *
     * @return ingressRateLimitBurstInBitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitBurstInBitIn() {
        return ingressRateLimitBurstInBitIn;
    }

    public void setIngressRateLimitBurstInBitIn(List<Double> ingressRateLimitBurstInBitIn) {
        this.ingressRateLimitBurstInBitIn = ingressRateLimitBurstInBitIn;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public void setIngressRateLimitBurstInBitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        }
    }

    public boolean getIngressRateLimitBurstInBitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitLt(Double ingressRateLimitBurstInBitLt) {

        this.ingressRateLimitBurstInBitLt = ingressRateLimitBurstInBitLt;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitLt
     *
     * @return ingressRateLimitBurstInBitLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitLt() {
        return ingressRateLimitBurstInBitLt;
    }

    public void setIngressRateLimitBurstInBitLt(Double ingressRateLimitBurstInBitLt) {
        this.ingressRateLimitBurstInBitLt = ingressRateLimitBurstInBitLt;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public void setIngressRateLimitBurstInBitLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        }
    }

    public boolean getIngressRateLimitBurstInBitLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitLte(Double ingressRateLimitBurstInBitLte) {

        this.ingressRateLimitBurstInBitLte = ingressRateLimitBurstInBitLte;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitLte
     *
     * @return ingressRateLimitBurstInBitLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitLte() {
        return ingressRateLimitBurstInBitLte;
    }

    public void setIngressRateLimitBurstInBitLte(Double ingressRateLimitBurstInBitLte) {
        this.ingressRateLimitBurstInBitLte = ingressRateLimitBurstInBitLte;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public void setIngressRateLimitBurstInBitLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        }
    }

    public boolean getIngressRateLimitBurstInBitLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitNot(Double ingressRateLimitBurstInBitNot) {

        this.ingressRateLimitBurstInBitNot = ingressRateLimitBurstInBitNot;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitNot
     *
     * @return ingressRateLimitBurstInBitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitNot() {
        return ingressRateLimitBurstInBitNot;
    }

    public void setIngressRateLimitBurstInBitNot(Double ingressRateLimitBurstInBitNot) {
        this.ingressRateLimitBurstInBitNot = ingressRateLimitBurstInBitNot;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public void setIngressRateLimitBurstInBitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        }
    }

    public boolean getIngressRateLimitBurstInBitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
    }

    public VmNicWhereInput ingressRateLimitBurstInBitNotIn(
            List<Double> ingressRateLimitBurstInBitNotIn) {

        this.ingressRateLimitBurstInBitNotIn = ingressRateLimitBurstInBitNotIn;
        return this;
    }

    public VmNicWhereInput addIngressRateLimitBurstInBitNotInItem(
            Double ingressRateLimitBurstInBitNotInItem) {
        if (this.ingressRateLimitBurstInBitNotIn == null) {
            this.ingressRateLimitBurstInBitNotIn = new ArrayList<Double>();
        }
        this.ingressRateLimitBurstInBitNotIn.add(ingressRateLimitBurstInBitNotInItem);
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitNotIn
     *
     * @return ingressRateLimitBurstInBitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitBurstInBitNotIn() {
        return ingressRateLimitBurstInBitNotIn;
    }

    public void setIngressRateLimitBurstInBitNotIn(List<Double> ingressRateLimitBurstInBitNotIn) {
        this.ingressRateLimitBurstInBitNotIn = ingressRateLimitBurstInBitNotIn;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public VmNicWhereInput ingressRateLimitBurstInBitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public void setIngressRateLimitBurstInBitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        }
    }

    public boolean getIngressRateLimitBurstInBitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
    }

    public VmNicWhereInput ingressRateLimitEnabled(Boolean ingressRateLimitEnabled) {

        this.ingressRateLimitEnabled = ingressRateLimitEnabled;
        return this;
    }

    /**
     * Get ingressRateLimitEnabled
     *
     * @return ingressRateLimitEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIngressRateLimitEnabled() {
        return ingressRateLimitEnabled;
    }

    public void setIngressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
        this.ingressRateLimitEnabled = ingressRateLimitEnabled;
    }

    public VmNicWhereInput ingressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public VmNicWhereInput ingressRateLimitEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public void setIngressRateLimitEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        }
    }

    public boolean getIngressRateLimitEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
    }

    public VmNicWhereInput ingressRateLimitEnabledNot(Boolean ingressRateLimitEnabledNot) {

        this.ingressRateLimitEnabledNot = ingressRateLimitEnabledNot;
        return this;
    }

    /**
     * Get ingressRateLimitEnabledNot
     *
     * @return ingressRateLimitEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIngressRateLimitEnabledNot() {
        return ingressRateLimitEnabledNot;
    }

    public void setIngressRateLimitEnabledNot(Boolean ingressRateLimitEnabledNot) {
        this.ingressRateLimitEnabledNot = ingressRateLimitEnabledNot;
    }

    public VmNicWhereInput ingressRateLimitEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public void setIngressRateLimitEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        }
    }

    public boolean getIngressRateLimitEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {

        this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitps
     *
     * @return ingressRateLimitMaxRateInBitps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitps() {
        return ingressRateLimitMaxRateInBitps;
    }

    public void setIngressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
        this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsGt(
            Double ingressRateLimitMaxRateInBitpsGt) {

        this.ingressRateLimitMaxRateInBitpsGt = ingressRateLimitMaxRateInBitpsGt;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsGt
     *
     * @return ingressRateLimitMaxRateInBitpsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsGt() {
        return ingressRateLimitMaxRateInBitpsGt;
    }

    public void setIngressRateLimitMaxRateInBitpsGt(Double ingressRateLimitMaxRateInBitpsGt) {
        this.ingressRateLimitMaxRateInBitpsGt = ingressRateLimitMaxRateInBitpsGt;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsGte(
            Double ingressRateLimitMaxRateInBitpsGte) {

        this.ingressRateLimitMaxRateInBitpsGte = ingressRateLimitMaxRateInBitpsGte;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsGte
     *
     * @return ingressRateLimitMaxRateInBitpsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsGte() {
        return ingressRateLimitMaxRateInBitpsGte;
    }

    public void setIngressRateLimitMaxRateInBitpsGte(Double ingressRateLimitMaxRateInBitpsGte) {
        this.ingressRateLimitMaxRateInBitpsGte = ingressRateLimitMaxRateInBitpsGte;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsIn(
            List<Double> ingressRateLimitMaxRateInBitpsIn) {

        this.ingressRateLimitMaxRateInBitpsIn = ingressRateLimitMaxRateInBitpsIn;
        return this;
    }

    public VmNicWhereInput addIngressRateLimitMaxRateInBitpsInItem(
            Double ingressRateLimitMaxRateInBitpsInItem) {
        if (this.ingressRateLimitMaxRateInBitpsIn == null) {
            this.ingressRateLimitMaxRateInBitpsIn = new ArrayList<Double>();
        }
        this.ingressRateLimitMaxRateInBitpsIn.add(ingressRateLimitMaxRateInBitpsInItem);
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsIn
     *
     * @return ingressRateLimitMaxRateInBitpsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitMaxRateInBitpsIn() {
        return ingressRateLimitMaxRateInBitpsIn;
    }

    public void setIngressRateLimitMaxRateInBitpsIn(List<Double> ingressRateLimitMaxRateInBitpsIn) {
        this.ingressRateLimitMaxRateInBitpsIn = ingressRateLimitMaxRateInBitpsIn;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsLt(
            Double ingressRateLimitMaxRateInBitpsLt) {

        this.ingressRateLimitMaxRateInBitpsLt = ingressRateLimitMaxRateInBitpsLt;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsLt
     *
     * @return ingressRateLimitMaxRateInBitpsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsLt() {
        return ingressRateLimitMaxRateInBitpsLt;
    }

    public void setIngressRateLimitMaxRateInBitpsLt(Double ingressRateLimitMaxRateInBitpsLt) {
        this.ingressRateLimitMaxRateInBitpsLt = ingressRateLimitMaxRateInBitpsLt;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsLte(
            Double ingressRateLimitMaxRateInBitpsLte) {

        this.ingressRateLimitMaxRateInBitpsLte = ingressRateLimitMaxRateInBitpsLte;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsLte
     *
     * @return ingressRateLimitMaxRateInBitpsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsLte() {
        return ingressRateLimitMaxRateInBitpsLte;
    }

    public void setIngressRateLimitMaxRateInBitpsLte(Double ingressRateLimitMaxRateInBitpsLte) {
        this.ingressRateLimitMaxRateInBitpsLte = ingressRateLimitMaxRateInBitpsLte;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsNot(
            Double ingressRateLimitMaxRateInBitpsNot) {

        this.ingressRateLimitMaxRateInBitpsNot = ingressRateLimitMaxRateInBitpsNot;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsNot
     *
     * @return ingressRateLimitMaxRateInBitpsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsNot() {
        return ingressRateLimitMaxRateInBitpsNot;
    }

    public void setIngressRateLimitMaxRateInBitpsNot(Double ingressRateLimitMaxRateInBitpsNot) {
        this.ingressRateLimitMaxRateInBitpsNot = ingressRateLimitMaxRateInBitpsNot;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsNotIn(
            List<Double> ingressRateLimitMaxRateInBitpsNotIn) {

        this.ingressRateLimitMaxRateInBitpsNotIn = ingressRateLimitMaxRateInBitpsNotIn;
        return this;
    }

    public VmNicWhereInput addIngressRateLimitMaxRateInBitpsNotInItem(
            Double ingressRateLimitMaxRateInBitpsNotInItem) {
        if (this.ingressRateLimitMaxRateInBitpsNotIn == null) {
            this.ingressRateLimitMaxRateInBitpsNotIn = new ArrayList<Double>();
        }
        this.ingressRateLimitMaxRateInBitpsNotIn.add(ingressRateLimitMaxRateInBitpsNotInItem);
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsNotIn
     *
     * @return ingressRateLimitMaxRateInBitpsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitMaxRateInBitpsNotIn() {
        return ingressRateLimitMaxRateInBitpsNotIn;
    }

    public void setIngressRateLimitMaxRateInBitpsNotIn(
            List<Double> ingressRateLimitMaxRateInBitpsNotIn) {
        this.ingressRateLimitMaxRateInBitpsNotIn = ingressRateLimitMaxRateInBitpsNotIn;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public VmNicWhereInput ingressRateLimitMaxRateInBitpsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
    }

    public VmNicWhereInput interfaceId(String interfaceId) {

        this.interfaceId = interfaceId;
        return this;
    }

    /**
     * Get interfaceId
     *
     * @return interfaceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public VmNicWhereInput interfaceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID);
        return this;
    }

    public VmNicWhereInput interfaceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID);
        return this;
    }

    public void setInterfaceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID);
        }
    }

    public boolean getInterfaceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID);
    }

    public VmNicWhereInput interfaceIdContains(String interfaceIdContains) {

        this.interfaceIdContains = interfaceIdContains;
        return this;
    }

    /**
     * Get interfaceIdContains
     *
     * @return interfaceIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdContains() {
        return interfaceIdContains;
    }

    public void setInterfaceIdContains(String interfaceIdContains) {
        this.interfaceIdContains = interfaceIdContains;
    }

    public VmNicWhereInput interfaceIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_CONTAINS);
        return this;
    }

    public VmNicWhereInput interfaceIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_CONTAINS);
        return this;
    }

    public void setInterfaceIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_CONTAINS);
        }
    }

    public boolean getInterfaceIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_CONTAINS);
    }

    public VmNicWhereInput interfaceIdEndsWith(String interfaceIdEndsWith) {

        this.interfaceIdEndsWith = interfaceIdEndsWith;
        return this;
    }

    /**
     * Get interfaceIdEndsWith
     *
     * @return interfaceIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdEndsWith() {
        return interfaceIdEndsWith;
    }

    public void setInterfaceIdEndsWith(String interfaceIdEndsWith) {
        this.interfaceIdEndsWith = interfaceIdEndsWith;
    }

    public VmNicWhereInput interfaceIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput interfaceIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH);
        return this;
    }

    public void setInterfaceIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH);
        }
    }

    public boolean getInterfaceIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_ENDS_WITH);
    }

    public VmNicWhereInput interfaceIdGt(String interfaceIdGt) {

        this.interfaceIdGt = interfaceIdGt;
        return this;
    }

    /**
     * Get interfaceIdGt
     *
     * @return interfaceIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdGt() {
        return interfaceIdGt;
    }

    public void setInterfaceIdGt(String interfaceIdGt) {
        this.interfaceIdGt = interfaceIdGt;
    }

    public VmNicWhereInput interfaceIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_GT);
        return this;
    }

    public VmNicWhereInput interfaceIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_GT);
        return this;
    }

    public void setInterfaceIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_GT);
        }
    }

    public boolean getInterfaceIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_GT);
    }

    public VmNicWhereInput interfaceIdGte(String interfaceIdGte) {

        this.interfaceIdGte = interfaceIdGte;
        return this;
    }

    /**
     * Get interfaceIdGte
     *
     * @return interfaceIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdGte() {
        return interfaceIdGte;
    }

    public void setInterfaceIdGte(String interfaceIdGte) {
        this.interfaceIdGte = interfaceIdGte;
    }

    public VmNicWhereInput interfaceIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_GTE);
        return this;
    }

    public VmNicWhereInput interfaceIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_GTE);
        return this;
    }

    public void setInterfaceIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_GTE);
        }
    }

    public boolean getInterfaceIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_GTE);
    }

    public VmNicWhereInput interfaceIdIn(List<String> interfaceIdIn) {

        this.interfaceIdIn = interfaceIdIn;
        return this;
    }

    public VmNicWhereInput addInterfaceIdInItem(String interfaceIdInItem) {
        if (this.interfaceIdIn == null) {
            this.interfaceIdIn = new ArrayList<String>();
        }
        this.interfaceIdIn.add(interfaceIdInItem);
        return this;
    }

    /**
     * Get interfaceIdIn
     *
     * @return interfaceIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInterfaceIdIn() {
        return interfaceIdIn;
    }

    public void setInterfaceIdIn(List<String> interfaceIdIn) {
        this.interfaceIdIn = interfaceIdIn;
    }

    public VmNicWhereInput interfaceIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_IN);
        return this;
    }

    public VmNicWhereInput interfaceIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_IN);
        return this;
    }

    public void setInterfaceIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_IN);
        }
    }

    public boolean getInterfaceIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_IN);
    }

    public VmNicWhereInput interfaceIdLt(String interfaceIdLt) {

        this.interfaceIdLt = interfaceIdLt;
        return this;
    }

    /**
     * Get interfaceIdLt
     *
     * @return interfaceIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdLt() {
        return interfaceIdLt;
    }

    public void setInterfaceIdLt(String interfaceIdLt) {
        this.interfaceIdLt = interfaceIdLt;
    }

    public VmNicWhereInput interfaceIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_LT);
        return this;
    }

    public VmNicWhereInput interfaceIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_LT);
        return this;
    }

    public void setInterfaceIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_LT);
        }
    }

    public boolean getInterfaceIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_LT);
    }

    public VmNicWhereInput interfaceIdLte(String interfaceIdLte) {

        this.interfaceIdLte = interfaceIdLte;
        return this;
    }

    /**
     * Get interfaceIdLte
     *
     * @return interfaceIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdLte() {
        return interfaceIdLte;
    }

    public void setInterfaceIdLte(String interfaceIdLte) {
        this.interfaceIdLte = interfaceIdLte;
    }

    public VmNicWhereInput interfaceIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_LTE);
        return this;
    }

    public VmNicWhereInput interfaceIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_LTE);
        return this;
    }

    public void setInterfaceIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_LTE);
        }
    }

    public boolean getInterfaceIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_LTE);
    }

    public VmNicWhereInput interfaceIdNot(String interfaceIdNot) {

        this.interfaceIdNot = interfaceIdNot;
        return this;
    }

    /**
     * Get interfaceIdNot
     *
     * @return interfaceIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdNot() {
        return interfaceIdNot;
    }

    public void setInterfaceIdNot(String interfaceIdNot) {
        this.interfaceIdNot = interfaceIdNot;
    }

    public VmNicWhereInput interfaceIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT);
        return this;
    }

    public VmNicWhereInput interfaceIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT);
        return this;
    }

    public void setInterfaceIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT);
        }
    }

    public boolean getInterfaceIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_NOT);
    }

    public VmNicWhereInput interfaceIdNotContains(String interfaceIdNotContains) {

        this.interfaceIdNotContains = interfaceIdNotContains;
        return this;
    }

    /**
     * Get interfaceIdNotContains
     *
     * @return interfaceIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdNotContains() {
        return interfaceIdNotContains;
    }

    public void setInterfaceIdNotContains(String interfaceIdNotContains) {
        this.interfaceIdNotContains = interfaceIdNotContains;
    }

    public VmNicWhereInput interfaceIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput interfaceIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS);
        return this;
    }

    public void setInterfaceIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS);
        }
    }

    public boolean getInterfaceIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_NOT_CONTAINS);
    }

    public VmNicWhereInput interfaceIdNotEndsWith(String interfaceIdNotEndsWith) {

        this.interfaceIdNotEndsWith = interfaceIdNotEndsWith;
        return this;
    }

    /**
     * Get interfaceIdNotEndsWith
     *
     * @return interfaceIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdNotEndsWith() {
        return interfaceIdNotEndsWith;
    }

    public void setInterfaceIdNotEndsWith(String interfaceIdNotEndsWith) {
        this.interfaceIdNotEndsWith = interfaceIdNotEndsWith;
    }

    public VmNicWhereInput interfaceIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput interfaceIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setInterfaceIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getInterfaceIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_NOT_ENDS_WITH);
    }

    public VmNicWhereInput interfaceIdNotIn(List<String> interfaceIdNotIn) {

        this.interfaceIdNotIn = interfaceIdNotIn;
        return this;
    }

    public VmNicWhereInput addInterfaceIdNotInItem(String interfaceIdNotInItem) {
        if (this.interfaceIdNotIn == null) {
            this.interfaceIdNotIn = new ArrayList<String>();
        }
        this.interfaceIdNotIn.add(interfaceIdNotInItem);
        return this;
    }

    /**
     * Get interfaceIdNotIn
     *
     * @return interfaceIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInterfaceIdNotIn() {
        return interfaceIdNotIn;
    }

    public void setInterfaceIdNotIn(List<String> interfaceIdNotIn) {
        this.interfaceIdNotIn = interfaceIdNotIn;
    }

    public VmNicWhereInput interfaceIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_IN);
        return this;
    }

    public VmNicWhereInput interfaceIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_IN);
        return this;
    }

    public void setInterfaceIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_IN);
        }
    }

    public boolean getInterfaceIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_NOT_IN);
    }

    public VmNicWhereInput interfaceIdNotStartsWith(String interfaceIdNotStartsWith) {

        this.interfaceIdNotStartsWith = interfaceIdNotStartsWith;
        return this;
    }

    /**
     * Get interfaceIdNotStartsWith
     *
     * @return interfaceIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdNotStartsWith() {
        return interfaceIdNotStartsWith;
    }

    public void setInterfaceIdNotStartsWith(String interfaceIdNotStartsWith) {
        this.interfaceIdNotStartsWith = interfaceIdNotStartsWith;
    }

    public VmNicWhereInput interfaceIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput interfaceIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setInterfaceIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getInterfaceIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_NOT_STARTS_WITH);
    }

    public VmNicWhereInput interfaceIdStartsWith(String interfaceIdStartsWith) {

        this.interfaceIdStartsWith = interfaceIdStartsWith;
        return this;
    }

    /**
     * Get interfaceIdStartsWith
     *
     * @return interfaceIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInterfaceIdStartsWith() {
        return interfaceIdStartsWith;
    }

    public void setInterfaceIdStartsWith(String interfaceIdStartsWith) {
        this.interfaceIdStartsWith = interfaceIdStartsWith;
    }

    public VmNicWhereInput interfaceIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput interfaceIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH);
        return this;
    }

    public void setInterfaceIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH);
        }
    }

    public boolean getInterfaceIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERFACE_ID_STARTS_WITH);
    }

    public VmNicWhereInput ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public VmNicWhereInput ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public VmNicWhereInput ipAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public void setIpAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        }
    }

    public boolean getIpAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS);
    }

    public VmNicWhereInput ipAddressContains(String ipAddressContains) {

        this.ipAddressContains = ipAddressContains;
        return this;
    }

    /**
     * Get ipAddressContains
     *
     * @return ipAddressContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressContains() {
        return ipAddressContains;
    }

    public void setIpAddressContains(String ipAddressContains) {
        this.ipAddressContains = ipAddressContains;
    }

    public VmNicWhereInput ipAddressContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        return this;
    }

    public VmNicWhereInput ipAddressContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        return this;
    }

    public void setIpAddressContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        }
    }

    public boolean getIpAddressContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
    }

    public VmNicWhereInput ipAddressEndsWith(String ipAddressEndsWith) {

        this.ipAddressEndsWith = ipAddressEndsWith;
        return this;
    }

    /**
     * Get ipAddressEndsWith
     *
     * @return ipAddressEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressEndsWith() {
        return ipAddressEndsWith;
    }

    public void setIpAddressEndsWith(String ipAddressEndsWith) {
        this.ipAddressEndsWith = ipAddressEndsWith;
    }

    public VmNicWhereInput ipAddressEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput ipAddressEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        return this;
    }

    public void setIpAddressEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        }
    }

    public boolean getIpAddressEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
    }

    public VmNicWhereInput ipAddressGt(String ipAddressGt) {

        this.ipAddressGt = ipAddressGt;
        return this;
    }

    /**
     * Get ipAddressGt
     *
     * @return ipAddressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressGt() {
        return ipAddressGt;
    }

    public void setIpAddressGt(String ipAddressGt) {
        this.ipAddressGt = ipAddressGt;
    }

    public VmNicWhereInput ipAddressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GT);
        return this;
    }

    public VmNicWhereInput ipAddressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GT);
        return this;
    }

    public void setIpAddressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GT);
        }
    }

    public boolean getIpAddressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_GT);
    }

    public VmNicWhereInput ipAddressGte(String ipAddressGte) {

        this.ipAddressGte = ipAddressGte;
        return this;
    }

    /**
     * Get ipAddressGte
     *
     * @return ipAddressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressGte() {
        return ipAddressGte;
    }

    public void setIpAddressGte(String ipAddressGte) {
        this.ipAddressGte = ipAddressGte;
    }

    public VmNicWhereInput ipAddressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GTE);
        return this;
    }

    public VmNicWhereInput ipAddressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GTE);
        return this;
    }

    public void setIpAddressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GTE);
        }
    }

    public boolean getIpAddressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_GTE);
    }

    public VmNicWhereInput ipAddressIn(List<String> ipAddressIn) {

        this.ipAddressIn = ipAddressIn;
        return this;
    }

    public VmNicWhereInput addIpAddressInItem(String ipAddressInItem) {
        if (this.ipAddressIn == null) {
            this.ipAddressIn = new ArrayList<String>();
        }
        this.ipAddressIn.add(ipAddressInItem);
        return this;
    }

    /**
     * Get ipAddressIn
     *
     * @return ipAddressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddressIn() {
        return ipAddressIn;
    }

    public void setIpAddressIn(List<String> ipAddressIn) {
        this.ipAddressIn = ipAddressIn;
    }

    public VmNicWhereInput ipAddressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_IN);
        return this;
    }

    public VmNicWhereInput ipAddressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_IN);
        return this;
    }

    public void setIpAddressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_IN);
        }
    }

    public boolean getIpAddressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_IN);
    }

    public VmNicWhereInput ipAddressLt(String ipAddressLt) {

        this.ipAddressLt = ipAddressLt;
        return this;
    }

    /**
     * Get ipAddressLt
     *
     * @return ipAddressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressLt() {
        return ipAddressLt;
    }

    public void setIpAddressLt(String ipAddressLt) {
        this.ipAddressLt = ipAddressLt;
    }

    public VmNicWhereInput ipAddressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LT);
        return this;
    }

    public VmNicWhereInput ipAddressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LT);
        return this;
    }

    public void setIpAddressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LT);
        }
    }

    public boolean getIpAddressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_LT);
    }

    public VmNicWhereInput ipAddressLte(String ipAddressLte) {

        this.ipAddressLte = ipAddressLte;
        return this;
    }

    /**
     * Get ipAddressLte
     *
     * @return ipAddressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressLte() {
        return ipAddressLte;
    }

    public void setIpAddressLte(String ipAddressLte) {
        this.ipAddressLte = ipAddressLte;
    }

    public VmNicWhereInput ipAddressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LTE);
        return this;
    }

    public VmNicWhereInput ipAddressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LTE);
        return this;
    }

    public void setIpAddressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LTE);
        }
    }

    public boolean getIpAddressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_LTE);
    }

    public VmNicWhereInput ipAddressNot(String ipAddressNot) {

        this.ipAddressNot = ipAddressNot;
        return this;
    }

    /**
     * Get ipAddressNot
     *
     * @return ipAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNot() {
        return ipAddressNot;
    }

    public void setIpAddressNot(String ipAddressNot) {
        this.ipAddressNot = ipAddressNot;
    }

    public VmNicWhereInput ipAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT);
        return this;
    }

    public VmNicWhereInput ipAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT);
        return this;
    }

    public void setIpAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT);
        }
    }

    public boolean getIpAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT);
    }

    public VmNicWhereInput ipAddressNotContains(String ipAddressNotContains) {

        this.ipAddressNotContains = ipAddressNotContains;
        return this;
    }

    /**
     * Get ipAddressNotContains
     *
     * @return ipAddressNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotContains() {
        return ipAddressNotContains;
    }

    public void setIpAddressNotContains(String ipAddressNotContains) {
        this.ipAddressNotContains = ipAddressNotContains;
    }

    public VmNicWhereInput ipAddressNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput ipAddressNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public void setIpAddressNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        }
    }

    public boolean getIpAddressNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
    }

    public VmNicWhereInput ipAddressNotEndsWith(String ipAddressNotEndsWith) {

        this.ipAddressNotEndsWith = ipAddressNotEndsWith;
        return this;
    }

    /**
     * Get ipAddressNotEndsWith
     *
     * @return ipAddressNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotEndsWith() {
        return ipAddressNotEndsWith;
    }

    public void setIpAddressNotEndsWith(String ipAddressNotEndsWith) {
        this.ipAddressNotEndsWith = ipAddressNotEndsWith;
    }

    public VmNicWhereInput ipAddressNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput ipAddressNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public void setIpAddressNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        }
    }

    public boolean getIpAddressNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
    }

    public VmNicWhereInput ipAddressNotIn(List<String> ipAddressNotIn) {

        this.ipAddressNotIn = ipAddressNotIn;
        return this;
    }

    public VmNicWhereInput addIpAddressNotInItem(String ipAddressNotInItem) {
        if (this.ipAddressNotIn == null) {
            this.ipAddressNotIn = new ArrayList<String>();
        }
        this.ipAddressNotIn.add(ipAddressNotInItem);
        return this;
    }

    /**
     * Get ipAddressNotIn
     *
     * @return ipAddressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddressNotIn() {
        return ipAddressNotIn;
    }

    public void setIpAddressNotIn(List<String> ipAddressNotIn) {
        this.ipAddressNotIn = ipAddressNotIn;
    }

    public VmNicWhereInput ipAddressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        return this;
    }

    public VmNicWhereInput ipAddressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        return this;
    }

    public void setIpAddressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        }
    }

    public boolean getIpAddressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
    }

    public VmNicWhereInput ipAddressNotStartsWith(String ipAddressNotStartsWith) {

        this.ipAddressNotStartsWith = ipAddressNotStartsWith;
        return this;
    }

    /**
     * Get ipAddressNotStartsWith
     *
     * @return ipAddressNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotStartsWith() {
        return ipAddressNotStartsWith;
    }

    public void setIpAddressNotStartsWith(String ipAddressNotStartsWith) {
        this.ipAddressNotStartsWith = ipAddressNotStartsWith;
    }

    public VmNicWhereInput ipAddressNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput ipAddressNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public void setIpAddressNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        }
    }

    public boolean getIpAddressNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
    }

    public VmNicWhereInput ipAddressStartsWith(String ipAddressStartsWith) {

        this.ipAddressStartsWith = ipAddressStartsWith;
        return this;
    }

    /**
     * Get ipAddressStartsWith
     *
     * @return ipAddressStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressStartsWith() {
        return ipAddressStartsWith;
    }

    public void setIpAddressStartsWith(String ipAddressStartsWith) {
        this.ipAddressStartsWith = ipAddressStartsWith;
    }

    public VmNicWhereInput ipAddressStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput ipAddressStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        return this;
    }

    public void setIpAddressStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        }
    }

    public boolean getIpAddressStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
    }

    public VmNicWhereInput localId(String localId) {

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

    public VmNicWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmNicWhereInput localId_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdContains(String localIdContains) {

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

    public VmNicWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VmNicWhereInput localIdContains_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VmNicWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdGt(String localIdGt) {

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

    public VmNicWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VmNicWhereInput localIdGt_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdGte(String localIdGte) {

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

    public VmNicWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VmNicWhereInput localIdGte_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VmNicWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VmNicWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VmNicWhereInput localIdIn_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdLt(String localIdLt) {

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

    public VmNicWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VmNicWhereInput localIdLt_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdLte(String localIdLte) {

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

    public VmNicWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VmNicWhereInput localIdLte_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdNot(String localIdNot) {

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

    public VmNicWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VmNicWhereInput localIdNot_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdNotContains(String localIdNotContains) {

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

    public VmNicWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VmNicWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VmNicWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VmNicWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VmNicWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VmNicWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VmNicWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VmNicWhereInput macAddress(String macAddress) {

        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get macAddress
     *
     * @return macAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public VmNicWhereInput macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public VmNicWhereInput macAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public void setMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        }
    }

    public boolean getMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS);
    }

    public VmNicWhereInput macAddressContains(String macAddressContains) {

        this.macAddressContains = macAddressContains;
        return this;
    }

    /**
     * Get macAddressContains
     *
     * @return macAddressContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressContains() {
        return macAddressContains;
    }

    public void setMacAddressContains(String macAddressContains) {
        this.macAddressContains = macAddressContains;
    }

    public VmNicWhereInput macAddressContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        return this;
    }

    public VmNicWhereInput macAddressContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        return this;
    }

    public void setMacAddressContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        }
    }

    public boolean getMacAddressContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
    }

    public VmNicWhereInput macAddressEndsWith(String macAddressEndsWith) {

        this.macAddressEndsWith = macAddressEndsWith;
        return this;
    }

    /**
     * Get macAddressEndsWith
     *
     * @return macAddressEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressEndsWith() {
        return macAddressEndsWith;
    }

    public void setMacAddressEndsWith(String macAddressEndsWith) {
        this.macAddressEndsWith = macAddressEndsWith;
    }

    public VmNicWhereInput macAddressEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput macAddressEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        return this;
    }

    public void setMacAddressEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        }
    }

    public boolean getMacAddressEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
    }

    public VmNicWhereInput macAddressGt(String macAddressGt) {

        this.macAddressGt = macAddressGt;
        return this;
    }

    /**
     * Get macAddressGt
     *
     * @return macAddressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressGt() {
        return macAddressGt;
    }

    public void setMacAddressGt(String macAddressGt) {
        this.macAddressGt = macAddressGt;
    }

    public VmNicWhereInput macAddressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GT);
        return this;
    }

    public VmNicWhereInput macAddressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GT);
        return this;
    }

    public void setMacAddressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GT);
        }
    }

    public boolean getMacAddressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_GT);
    }

    public VmNicWhereInput macAddressGte(String macAddressGte) {

        this.macAddressGte = macAddressGte;
        return this;
    }

    /**
     * Get macAddressGte
     *
     * @return macAddressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressGte() {
        return macAddressGte;
    }

    public void setMacAddressGte(String macAddressGte) {
        this.macAddressGte = macAddressGte;
    }

    public VmNicWhereInput macAddressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        return this;
    }

    public VmNicWhereInput macAddressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        return this;
    }

    public void setMacAddressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        }
    }

    public boolean getMacAddressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_GTE);
    }

    public VmNicWhereInput macAddressIn(List<String> macAddressIn) {

        this.macAddressIn = macAddressIn;
        return this;
    }

    public VmNicWhereInput addMacAddressInItem(String macAddressInItem) {
        if (this.macAddressIn == null) {
            this.macAddressIn = new ArrayList<String>();
        }
        this.macAddressIn.add(macAddressInItem);
        return this;
    }

    /**
     * Get macAddressIn
     *
     * @return macAddressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMacAddressIn() {
        return macAddressIn;
    }

    public void setMacAddressIn(List<String> macAddressIn) {
        this.macAddressIn = macAddressIn;
    }

    public VmNicWhereInput macAddressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_IN);
        return this;
    }

    public VmNicWhereInput macAddressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_IN);
        return this;
    }

    public void setMacAddressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_IN);
        }
    }

    public boolean getMacAddressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_IN);
    }

    public VmNicWhereInput macAddressLt(String macAddressLt) {

        this.macAddressLt = macAddressLt;
        return this;
    }

    /**
     * Get macAddressLt
     *
     * @return macAddressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressLt() {
        return macAddressLt;
    }

    public void setMacAddressLt(String macAddressLt) {
        this.macAddressLt = macAddressLt;
    }

    public VmNicWhereInput macAddressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LT);
        return this;
    }

    public VmNicWhereInput macAddressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LT);
        return this;
    }

    public void setMacAddressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LT);
        }
    }

    public boolean getMacAddressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_LT);
    }

    public VmNicWhereInput macAddressLte(String macAddressLte) {

        this.macAddressLte = macAddressLte;
        return this;
    }

    /**
     * Get macAddressLte
     *
     * @return macAddressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressLte() {
        return macAddressLte;
    }

    public void setMacAddressLte(String macAddressLte) {
        this.macAddressLte = macAddressLte;
    }

    public VmNicWhereInput macAddressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        return this;
    }

    public VmNicWhereInput macAddressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        return this;
    }

    public void setMacAddressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        }
    }

    public boolean getMacAddressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_LTE);
    }

    public VmNicWhereInput macAddressNot(String macAddressNot) {

        this.macAddressNot = macAddressNot;
        return this;
    }

    /**
     * Get macAddressNot
     *
     * @return macAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNot() {
        return macAddressNot;
    }

    public void setMacAddressNot(String macAddressNot) {
        this.macAddressNot = macAddressNot;
    }

    public VmNicWhereInput macAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        return this;
    }

    public VmNicWhereInput macAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        return this;
    }

    public void setMacAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        }
    }

    public boolean getMacAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT);
    }

    public VmNicWhereInput macAddressNotContains(String macAddressNotContains) {

        this.macAddressNotContains = macAddressNotContains;
        return this;
    }

    /**
     * Get macAddressNotContains
     *
     * @return macAddressNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNotContains() {
        return macAddressNotContains;
    }

    public void setMacAddressNotContains(String macAddressNotContains) {
        this.macAddressNotContains = macAddressNotContains;
    }

    public VmNicWhereInput macAddressNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput macAddressNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public void setMacAddressNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        }
    }

    public boolean getMacAddressNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
    }

    public VmNicWhereInput macAddressNotEndsWith(String macAddressNotEndsWith) {

        this.macAddressNotEndsWith = macAddressNotEndsWith;
        return this;
    }

    /**
     * Get macAddressNotEndsWith
     *
     * @return macAddressNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNotEndsWith() {
        return macAddressNotEndsWith;
    }

    public void setMacAddressNotEndsWith(String macAddressNotEndsWith) {
        this.macAddressNotEndsWith = macAddressNotEndsWith;
    }

    public VmNicWhereInput macAddressNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput macAddressNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public void setMacAddressNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        }
    }

    public boolean getMacAddressNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
    }

    public VmNicWhereInput macAddressNotIn(List<String> macAddressNotIn) {

        this.macAddressNotIn = macAddressNotIn;
        return this;
    }

    public VmNicWhereInput addMacAddressNotInItem(String macAddressNotInItem) {
        if (this.macAddressNotIn == null) {
            this.macAddressNotIn = new ArrayList<String>();
        }
        this.macAddressNotIn.add(macAddressNotInItem);
        return this;
    }

    /**
     * Get macAddressNotIn
     *
     * @return macAddressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMacAddressNotIn() {
        return macAddressNotIn;
    }

    public void setMacAddressNotIn(List<String> macAddressNotIn) {
        this.macAddressNotIn = macAddressNotIn;
    }

    public VmNicWhereInput macAddressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        return this;
    }

    public VmNicWhereInput macAddressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        return this;
    }

    public void setMacAddressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        }
    }

    public boolean getMacAddressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
    }

    public VmNicWhereInput macAddressNotStartsWith(String macAddressNotStartsWith) {

        this.macAddressNotStartsWith = macAddressNotStartsWith;
        return this;
    }

    /**
     * Get macAddressNotStartsWith
     *
     * @return macAddressNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNotStartsWith() {
        return macAddressNotStartsWith;
    }

    public void setMacAddressNotStartsWith(String macAddressNotStartsWith) {
        this.macAddressNotStartsWith = macAddressNotStartsWith;
    }

    public VmNicWhereInput macAddressNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput macAddressNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public void setMacAddressNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        }
    }

    public boolean getMacAddressNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
    }

    public VmNicWhereInput macAddressStartsWith(String macAddressStartsWith) {

        this.macAddressStartsWith = macAddressStartsWith;
        return this;
    }

    /**
     * Get macAddressStartsWith
     *
     * @return macAddressStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressStartsWith() {
        return macAddressStartsWith;
    }

    public void setMacAddressStartsWith(String macAddressStartsWith) {
        this.macAddressStartsWith = macAddressStartsWith;
    }

    public VmNicWhereInput macAddressStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput macAddressStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        return this;
    }

    public void setMacAddressStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        }
    }

    public boolean getMacAddressStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
    }

    public VmNicWhereInput mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public VmNicWhereInput mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public VmNicWhereInput mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public VmNicWhereInput mirrorNot(Boolean mirrorNot) {

        this.mirrorNot = mirrorNot;
        return this;
    }

    /**
     * Get mirrorNot
     *
     * @return mirrorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirrorNot() {
        return mirrorNot;
    }

    public void setMirrorNot(Boolean mirrorNot) {
        this.mirrorNot = mirrorNot;
    }

    public VmNicWhereInput mirrorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR_NOT);
        return this;
    }

    public VmNicWhereInput mirrorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR_NOT);
        return this;
    }

    public void setMirrorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR_NOT);
        }
    }

    public boolean getMirrorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR_NOT);
    }

    public VmNicWhereInput model(VmNicModel model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModel() {
        return model;
    }

    public void setModel(VmNicModel model) {
        this.model = model;
    }

    public VmNicWhereInput model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public VmNicWhereInput model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public VmNicWhereInput modelIn(List<VmNicModel> modelIn) {

        this.modelIn = modelIn;
        return this;
    }

    public VmNicWhereInput addModelInItem(VmNicModel modelInItem) {
        if (this.modelIn == null) {
            this.modelIn = new ArrayList<VmNicModel>();
        }
        this.modelIn.add(modelInItem);
        return this;
    }

    /**
     * Get modelIn
     *
     * @return modelIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmNicModel> getModelIn() {
        return modelIn;
    }

    public void setModelIn(List<VmNicModel> modelIn) {
        this.modelIn = modelIn;
    }

    public VmNicWhereInput modelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public VmNicWhereInput modelIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public void setModelIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        }
    }

    public boolean getModelIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_IN);
    }

    public VmNicWhereInput modelNot(VmNicModel modelNot) {

        this.modelNot = modelNot;
        return this;
    }

    /**
     * Get modelNot
     *
     * @return modelNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModelNot() {
        return modelNot;
    }

    public void setModelNot(VmNicModel modelNot) {
        this.modelNot = modelNot;
    }

    public VmNicWhereInput modelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public VmNicWhereInput modelNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public void setModelNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        }
    }

    public boolean getModelNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT);
    }

    public VmNicWhereInput modelNotIn(List<VmNicModel> modelNotIn) {

        this.modelNotIn = modelNotIn;
        return this;
    }

    public VmNicWhereInput addModelNotInItem(VmNicModel modelNotInItem) {
        if (this.modelNotIn == null) {
            this.modelNotIn = new ArrayList<VmNicModel>();
        }
        this.modelNotIn.add(modelNotInItem);
        return this;
    }

    /**
     * Get modelNotIn
     *
     * @return modelNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmNicModel> getModelNotIn() {
        return modelNotIn;
    }

    public void setModelNotIn(List<VmNicModel> modelNotIn) {
        this.modelNotIn = modelNotIn;
    }

    public VmNicWhereInput modelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public VmNicWhereInput modelNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public void setModelNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        }
    }

    public boolean getModelNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_IN);
    }

    public VmNicWhereInput nic(NicWhereInput nic) {

        this.nic = nic;
        return this;
    }

    /**
     * Get nic
     *
     * @return nic
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNic() {
        return nic;
    }

    public void setNic(NicWhereInput nic) {
        this.nic = nic;
    }

    public VmNicWhereInput nic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC);
        return this;
    }

    public VmNicWhereInput nic_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC);
        return this;
    }

    public void setNic_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC);
        }
    }

    public boolean getNic_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC);
    }

    public VmNicWhereInput order(Integer order) {

        this.order = order;
        return this;
    }

    /**
     * Get order
     *
     * @return order
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public VmNicWhereInput order_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER);
        return this;
    }

    public VmNicWhereInput order_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER);
        return this;
    }

    public void setOrder_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER);
        }
    }

    public boolean getOrder_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER);
    }

    public VmNicWhereInput orderGt(Integer orderGt) {

        this.orderGt = orderGt;
        return this;
    }

    /**
     * Get orderGt
     *
     * @return orderGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getOrderGt() {
        return orderGt;
    }

    public void setOrderGt(Integer orderGt) {
        this.orderGt = orderGt;
    }

    public VmNicWhereInput orderGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_GT);
        return this;
    }

    public VmNicWhereInput orderGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_GT);
        return this;
    }

    public void setOrderGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_GT);
        }
    }

    public boolean getOrderGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_GT);
    }

    public VmNicWhereInput orderGte(Integer orderGte) {

        this.orderGte = orderGte;
        return this;
    }

    /**
     * Get orderGte
     *
     * @return orderGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getOrderGte() {
        return orderGte;
    }

    public void setOrderGte(Integer orderGte) {
        this.orderGte = orderGte;
    }

    public VmNicWhereInput orderGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_GTE);
        return this;
    }

    public VmNicWhereInput orderGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_GTE);
        return this;
    }

    public void setOrderGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_GTE);
        }
    }

    public boolean getOrderGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_GTE);
    }

    public VmNicWhereInput orderIn(List<Integer> orderIn) {

        this.orderIn = orderIn;
        return this;
    }

    public VmNicWhereInput addOrderInItem(Integer orderInItem) {
        if (this.orderIn == null) {
            this.orderIn = new ArrayList<Integer>();
        }
        this.orderIn.add(orderInItem);
        return this;
    }

    /**
     * Get orderIn
     *
     * @return orderIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getOrderIn() {
        return orderIn;
    }

    public void setOrderIn(List<Integer> orderIn) {
        this.orderIn = orderIn;
    }

    public VmNicWhereInput orderIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_IN);
        return this;
    }

    public VmNicWhereInput orderIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_IN);
        return this;
    }

    public void setOrderIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_IN);
        }
    }

    public boolean getOrderIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_IN);
    }

    public VmNicWhereInput orderLt(Integer orderLt) {

        this.orderLt = orderLt;
        return this;
    }

    /**
     * Get orderLt
     *
     * @return orderLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getOrderLt() {
        return orderLt;
    }

    public void setOrderLt(Integer orderLt) {
        this.orderLt = orderLt;
    }

    public VmNicWhereInput orderLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_LT);
        return this;
    }

    public VmNicWhereInput orderLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_LT);
        return this;
    }

    public void setOrderLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_LT);
        }
    }

    public boolean getOrderLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_LT);
    }

    public VmNicWhereInput orderLte(Integer orderLte) {

        this.orderLte = orderLte;
        return this;
    }

    /**
     * Get orderLte
     *
     * @return orderLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getOrderLte() {
        return orderLte;
    }

    public void setOrderLte(Integer orderLte) {
        this.orderLte = orderLte;
    }

    public VmNicWhereInput orderLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_LTE);
        return this;
    }

    public VmNicWhereInput orderLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_LTE);
        return this;
    }

    public void setOrderLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_LTE);
        }
    }

    public boolean getOrderLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_LTE);
    }

    public VmNicWhereInput orderNot(Integer orderNot) {

        this.orderNot = orderNot;
        return this;
    }

    /**
     * Get orderNot
     *
     * @return orderNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getOrderNot() {
        return orderNot;
    }

    public void setOrderNot(Integer orderNot) {
        this.orderNot = orderNot;
    }

    public VmNicWhereInput orderNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_NOT);
        return this;
    }

    public VmNicWhereInput orderNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_NOT);
        return this;
    }

    public void setOrderNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_NOT);
        }
    }

    public boolean getOrderNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_NOT);
    }

    public VmNicWhereInput orderNotIn(List<Integer> orderNotIn) {

        this.orderNotIn = orderNotIn;
        return this;
    }

    public VmNicWhereInput addOrderNotInItem(Integer orderNotInItem) {
        if (this.orderNotIn == null) {
            this.orderNotIn = new ArrayList<Integer>();
        }
        this.orderNotIn.add(orderNotInItem);
        return this;
    }

    /**
     * Get orderNotIn
     *
     * @return orderNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getOrderNotIn() {
        return orderNotIn;
    }

    public void setOrderNotIn(List<Integer> orderNotIn) {
        this.orderNotIn = orderNotIn;
    }

    public VmNicWhereInput orderNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER_NOT_IN);
        return this;
    }

    public VmNicWhereInput orderNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORDER_NOT_IN);
        return this;
    }

    public void setOrderNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORDER_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORDER_NOT_IN);
        }
    }

    public boolean getOrderNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORDER_NOT_IN);
    }

    public VmNicWhereInput subnetMask(String subnetMask) {

        this.subnetMask = subnetMask;
        return this;
    }

    /**
     * Get subnetMask
     *
     * @return subnetMask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public VmNicWhereInput subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public VmNicWhereInput subnetMask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public void setSubnetMask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK);
        }
    }

    public boolean getSubnetMask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK);
    }

    public VmNicWhereInput subnetMaskContains(String subnetMaskContains) {

        this.subnetMaskContains = subnetMaskContains;
        return this;
    }

    /**
     * Get subnetMaskContains
     *
     * @return subnetMaskContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskContains() {
        return subnetMaskContains;
    }

    public void setSubnetMaskContains(String subnetMaskContains) {
        this.subnetMaskContains = subnetMaskContains;
    }

    public VmNicWhereInput subnetMaskContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_CONTAINS);
        return this;
    }

    public VmNicWhereInput subnetMaskContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_CONTAINS);
        return this;
    }

    public void setSubnetMaskContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_CONTAINS);
        }
    }

    public boolean getSubnetMaskContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_CONTAINS);
    }

    public VmNicWhereInput subnetMaskEndsWith(String subnetMaskEndsWith) {

        this.subnetMaskEndsWith = subnetMaskEndsWith;
        return this;
    }

    /**
     * Get subnetMaskEndsWith
     *
     * @return subnetMaskEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskEndsWith() {
        return subnetMaskEndsWith;
    }

    public void setSubnetMaskEndsWith(String subnetMaskEndsWith) {
        this.subnetMaskEndsWith = subnetMaskEndsWith;
    }

    public VmNicWhereInput subnetMaskEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput subnetMaskEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH);
        return this;
    }

    public void setSubnetMaskEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH);
        }
    }

    public boolean getSubnetMaskEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_ENDS_WITH);
    }

    public VmNicWhereInput subnetMaskGt(String subnetMaskGt) {

        this.subnetMaskGt = subnetMaskGt;
        return this;
    }

    /**
     * Get subnetMaskGt
     *
     * @return subnetMaskGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskGt() {
        return subnetMaskGt;
    }

    public void setSubnetMaskGt(String subnetMaskGt) {
        this.subnetMaskGt = subnetMaskGt;
    }

    public VmNicWhereInput subnetMaskGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_GT);
        return this;
    }

    public VmNicWhereInput subnetMaskGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_GT);
        return this;
    }

    public void setSubnetMaskGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_GT);
        }
    }

    public boolean getSubnetMaskGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_GT);
    }

    public VmNicWhereInput subnetMaskGte(String subnetMaskGte) {

        this.subnetMaskGte = subnetMaskGte;
        return this;
    }

    /**
     * Get subnetMaskGte
     *
     * @return subnetMaskGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskGte() {
        return subnetMaskGte;
    }

    public void setSubnetMaskGte(String subnetMaskGte) {
        this.subnetMaskGte = subnetMaskGte;
    }

    public VmNicWhereInput subnetMaskGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_GTE);
        return this;
    }

    public VmNicWhereInput subnetMaskGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_GTE);
        return this;
    }

    public void setSubnetMaskGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_GTE);
        }
    }

    public boolean getSubnetMaskGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_GTE);
    }

    public VmNicWhereInput subnetMaskIn(List<String> subnetMaskIn) {

        this.subnetMaskIn = subnetMaskIn;
        return this;
    }

    public VmNicWhereInput addSubnetMaskInItem(String subnetMaskInItem) {
        if (this.subnetMaskIn == null) {
            this.subnetMaskIn = new ArrayList<String>();
        }
        this.subnetMaskIn.add(subnetMaskInItem);
        return this;
    }

    /**
     * Get subnetMaskIn
     *
     * @return subnetMaskIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubnetMaskIn() {
        return subnetMaskIn;
    }

    public void setSubnetMaskIn(List<String> subnetMaskIn) {
        this.subnetMaskIn = subnetMaskIn;
    }

    public VmNicWhereInput subnetMaskIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_IN);
        return this;
    }

    public VmNicWhereInput subnetMaskIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_IN);
        return this;
    }

    public void setSubnetMaskIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_IN);
        }
    }

    public boolean getSubnetMaskIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_IN);
    }

    public VmNicWhereInput subnetMaskLt(String subnetMaskLt) {

        this.subnetMaskLt = subnetMaskLt;
        return this;
    }

    /**
     * Get subnetMaskLt
     *
     * @return subnetMaskLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskLt() {
        return subnetMaskLt;
    }

    public void setSubnetMaskLt(String subnetMaskLt) {
        this.subnetMaskLt = subnetMaskLt;
    }

    public VmNicWhereInput subnetMaskLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_LT);
        return this;
    }

    public VmNicWhereInput subnetMaskLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_LT);
        return this;
    }

    public void setSubnetMaskLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_LT);
        }
    }

    public boolean getSubnetMaskLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_LT);
    }

    public VmNicWhereInput subnetMaskLte(String subnetMaskLte) {

        this.subnetMaskLte = subnetMaskLte;
        return this;
    }

    /**
     * Get subnetMaskLte
     *
     * @return subnetMaskLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskLte() {
        return subnetMaskLte;
    }

    public void setSubnetMaskLte(String subnetMaskLte) {
        this.subnetMaskLte = subnetMaskLte;
    }

    public VmNicWhereInput subnetMaskLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_LTE);
        return this;
    }

    public VmNicWhereInput subnetMaskLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_LTE);
        return this;
    }

    public void setSubnetMaskLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_LTE);
        }
    }

    public boolean getSubnetMaskLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_LTE);
    }

    public VmNicWhereInput subnetMaskNot(String subnetMaskNot) {

        this.subnetMaskNot = subnetMaskNot;
        return this;
    }

    /**
     * Get subnetMaskNot
     *
     * @return subnetMaskNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskNot() {
        return subnetMaskNot;
    }

    public void setSubnetMaskNot(String subnetMaskNot) {
        this.subnetMaskNot = subnetMaskNot;
    }

    public VmNicWhereInput subnetMaskNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT);
        return this;
    }

    public VmNicWhereInput subnetMaskNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT);
        return this;
    }

    public void setSubnetMaskNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT);
        }
    }

    public boolean getSubnetMaskNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_NOT);
    }

    public VmNicWhereInput subnetMaskNotContains(String subnetMaskNotContains) {

        this.subnetMaskNotContains = subnetMaskNotContains;
        return this;
    }

    /**
     * Get subnetMaskNotContains
     *
     * @return subnetMaskNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskNotContains() {
        return subnetMaskNotContains;
    }

    public void setSubnetMaskNotContains(String subnetMaskNotContains) {
        this.subnetMaskNotContains = subnetMaskNotContains;
    }

    public VmNicWhereInput subnetMaskNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public VmNicWhereInput subnetMaskNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS);
        return this;
    }

    public void setSubnetMaskNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS);
        }
    }

    public boolean getSubnetMaskNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_NOT_CONTAINS);
    }

    public VmNicWhereInput subnetMaskNotEndsWith(String subnetMaskNotEndsWith) {

        this.subnetMaskNotEndsWith = subnetMaskNotEndsWith;
        return this;
    }

    /**
     * Get subnetMaskNotEndsWith
     *
     * @return subnetMaskNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskNotEndsWith() {
        return subnetMaskNotEndsWith;
    }

    public void setSubnetMaskNotEndsWith(String subnetMaskNotEndsWith) {
        this.subnetMaskNotEndsWith = subnetMaskNotEndsWith;
    }

    public VmNicWhereInput subnetMaskNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public VmNicWhereInput subnetMaskNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH);
        return this;
    }

    public void setSubnetMaskNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH);
        }
    }

    public boolean getSubnetMaskNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_NOT_ENDS_WITH);
    }

    public VmNicWhereInput subnetMaskNotIn(List<String> subnetMaskNotIn) {

        this.subnetMaskNotIn = subnetMaskNotIn;
        return this;
    }

    public VmNicWhereInput addSubnetMaskNotInItem(String subnetMaskNotInItem) {
        if (this.subnetMaskNotIn == null) {
            this.subnetMaskNotIn = new ArrayList<String>();
        }
        this.subnetMaskNotIn.add(subnetMaskNotInItem);
        return this;
    }

    /**
     * Get subnetMaskNotIn
     *
     * @return subnetMaskNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSubnetMaskNotIn() {
        return subnetMaskNotIn;
    }

    public void setSubnetMaskNotIn(List<String> subnetMaskNotIn) {
        this.subnetMaskNotIn = subnetMaskNotIn;
    }

    public VmNicWhereInput subnetMaskNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_IN);
        return this;
    }

    public VmNicWhereInput subnetMaskNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_IN);
        return this;
    }

    public void setSubnetMaskNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_IN);
        }
    }

    public boolean getSubnetMaskNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_NOT_IN);
    }

    public VmNicWhereInput subnetMaskNotStartsWith(String subnetMaskNotStartsWith) {

        this.subnetMaskNotStartsWith = subnetMaskNotStartsWith;
        return this;
    }

    /**
     * Get subnetMaskNotStartsWith
     *
     * @return subnetMaskNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskNotStartsWith() {
        return subnetMaskNotStartsWith;
    }

    public void setSubnetMaskNotStartsWith(String subnetMaskNotStartsWith) {
        this.subnetMaskNotStartsWith = subnetMaskNotStartsWith;
    }

    public VmNicWhereInput subnetMaskNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput subnetMaskNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH);
        return this;
    }

    public void setSubnetMaskNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH);
        }
    }

    public boolean getSubnetMaskNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_NOT_STARTS_WITH);
    }

    public VmNicWhereInput subnetMaskStartsWith(String subnetMaskStartsWith) {

        this.subnetMaskStartsWith = subnetMaskStartsWith;
        return this;
    }

    /**
     * Get subnetMaskStartsWith
     *
     * @return subnetMaskStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMaskStartsWith() {
        return subnetMaskStartsWith;
    }

    public void setSubnetMaskStartsWith(String subnetMaskStartsWith) {
        this.subnetMaskStartsWith = subnetMaskStartsWith;
    }

    public VmNicWhereInput subnetMaskStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public VmNicWhereInput subnetMaskStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH);
        return this;
    }

    public void setSubnetMaskStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH);
        }
    }

    public boolean getSubnetMaskStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK_STARTS_WITH);
    }

    public VmNicWhereInput type(VmNicType type) {

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
    public VmNicType getType() {
        return type;
    }

    public void setType(VmNicType type) {
        this.type = type;
    }

    public VmNicWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmNicWhereInput type_ExplictlyNonNull() {
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

    public VmNicWhereInput typeIn(List<VmNicType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmNicWhereInput addTypeInItem(VmNicType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<VmNicType>();
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
    public List<VmNicType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<VmNicType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmNicWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmNicWhereInput typeIn_ExplictlyNonNull() {
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

    public VmNicWhereInput typeNot(VmNicType typeNot) {

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
    public VmNicType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(VmNicType typeNot) {
        this.typeNot = typeNot;
    }

    public VmNicWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmNicWhereInput typeNot_ExplictlyNonNull() {
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

    public VmNicWhereInput typeNotIn(List<VmNicType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmNicWhereInput addTypeNotInItem(VmNicType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<VmNicType>();
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
    public List<VmNicType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<VmNicType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmNicWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmNicWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmNicWhereInput vlan(VlanWhereInput vlan) {

        this.vlan = vlan;
        return this;
    }

    /**
     * Get vlan
     *
     * @return vlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlan() {
        return vlan;
    }

    public void setVlan(VlanWhereInput vlan) {
        this.vlan = vlan;
    }

    public VmNicWhereInput vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public VmNicWhereInput vlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        return this;
    }

    public void setVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        }
    }

    public boolean getVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN);
    }

    public VmNicWhereInput vm(VmWhereInput vm) {

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

    public VmNicWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmNicWhereInput vm_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmNicWhereInput vmNicWhereInput = (VmNicWhereInput) o;
        return Objects.equals(this.AND, vmNicWhereInput.AND)
                && Objects.equals(this.NOT, vmNicWhereInput.NOT)
                && Objects.equals(this.OR, vmNicWhereInput.OR)
                && Objects.equals(
                        this.egressRateLimitBurstInBit, vmNicWhereInput.egressRateLimitBurstInBit)
                && Objects.equals(
                        this.egressRateLimitBurstInBitGt,
                        vmNicWhereInput.egressRateLimitBurstInBitGt)
                && Objects.equals(
                        this.egressRateLimitBurstInBitGte,
                        vmNicWhereInput.egressRateLimitBurstInBitGte)
                && Objects.equals(
                        this.egressRateLimitBurstInBitIn,
                        vmNicWhereInput.egressRateLimitBurstInBitIn)
                && Objects.equals(
                        this.egressRateLimitBurstInBitLt,
                        vmNicWhereInput.egressRateLimitBurstInBitLt)
                && Objects.equals(
                        this.egressRateLimitBurstInBitLte,
                        vmNicWhereInput.egressRateLimitBurstInBitLte)
                && Objects.equals(
                        this.egressRateLimitBurstInBitNot,
                        vmNicWhereInput.egressRateLimitBurstInBitNot)
                && Objects.equals(
                        this.egressRateLimitBurstInBitNotIn,
                        vmNicWhereInput.egressRateLimitBurstInBitNotIn)
                && Objects.equals(
                        this.egressRateLimitEnabled, vmNicWhereInput.egressRateLimitEnabled)
                && Objects.equals(
                        this.egressRateLimitEnabledNot, vmNicWhereInput.egressRateLimitEnabledNot)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitps,
                        vmNicWhereInput.egressRateLimitMaxRateInBitps)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsGt,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsGt)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsGte,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsGte)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsIn,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsIn)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsLt,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsLt)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsLte,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsLte)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsNot,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsNot)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsNotIn,
                        vmNicWhereInput.egressRateLimitMaxRateInBitpsNotIn)
                && Objects.equals(this.enabled, vmNicWhereInput.enabled)
                && Objects.equals(this.enabledNot, vmNicWhereInput.enabledNot)
                && Objects.equals(this.gateway, vmNicWhereInput.gateway)
                && Objects.equals(this.gatewayContains, vmNicWhereInput.gatewayContains)
                && Objects.equals(this.gatewayEndsWith, vmNicWhereInput.gatewayEndsWith)
                && Objects.equals(this.gatewayGt, vmNicWhereInput.gatewayGt)
                && Objects.equals(this.gatewayGte, vmNicWhereInput.gatewayGte)
                && Objects.equals(this.gatewayIn, vmNicWhereInput.gatewayIn)
                && Objects.equals(this.gatewayLt, vmNicWhereInput.gatewayLt)
                && Objects.equals(this.gatewayLte, vmNicWhereInput.gatewayLte)
                && Objects.equals(this.gatewayNot, vmNicWhereInput.gatewayNot)
                && Objects.equals(this.gatewayNotContains, vmNicWhereInput.gatewayNotContains)
                && Objects.equals(this.gatewayNotEndsWith, vmNicWhereInput.gatewayNotEndsWith)
                && Objects.equals(this.gatewayNotIn, vmNicWhereInput.gatewayNotIn)
                && Objects.equals(this.gatewayNotStartsWith, vmNicWhereInput.gatewayNotStartsWith)
                && Objects.equals(this.gatewayStartsWith, vmNicWhereInput.gatewayStartsWith)
                && Objects.equals(this.id, vmNicWhereInput.id)
                && Objects.equals(this.idContains, vmNicWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmNicWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmNicWhereInput.idGt)
                && Objects.equals(this.idGte, vmNicWhereInput.idGte)
                && Objects.equals(this.idIn, vmNicWhereInput.idIn)
                && Objects.equals(this.idLt, vmNicWhereInput.idLt)
                && Objects.equals(this.idLte, vmNicWhereInput.idLte)
                && Objects.equals(this.idNot, vmNicWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmNicWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmNicWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmNicWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmNicWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmNicWhereInput.idStartsWith)
                && Objects.equals(
                        this.ingressRateLimitBurstInBit, vmNicWhereInput.ingressRateLimitBurstInBit)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitGt,
                        vmNicWhereInput.ingressRateLimitBurstInBitGt)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitGte,
                        vmNicWhereInput.ingressRateLimitBurstInBitGte)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitIn,
                        vmNicWhereInput.ingressRateLimitBurstInBitIn)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitLt,
                        vmNicWhereInput.ingressRateLimitBurstInBitLt)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitLte,
                        vmNicWhereInput.ingressRateLimitBurstInBitLte)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitNot,
                        vmNicWhereInput.ingressRateLimitBurstInBitNot)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitNotIn,
                        vmNicWhereInput.ingressRateLimitBurstInBitNotIn)
                && Objects.equals(
                        this.ingressRateLimitEnabled, vmNicWhereInput.ingressRateLimitEnabled)
                && Objects.equals(
                        this.ingressRateLimitEnabledNot, vmNicWhereInput.ingressRateLimitEnabledNot)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitps,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitps)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsGt,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsGt)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsGte,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsGte)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsIn,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsIn)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsLt,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsLt)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsLte,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsLte)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsNot,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsNot)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsNotIn,
                        vmNicWhereInput.ingressRateLimitMaxRateInBitpsNotIn)
                && Objects.equals(this.interfaceId, vmNicWhereInput.interfaceId)
                && Objects.equals(this.interfaceIdContains, vmNicWhereInput.interfaceIdContains)
                && Objects.equals(this.interfaceIdEndsWith, vmNicWhereInput.interfaceIdEndsWith)
                && Objects.equals(this.interfaceIdGt, vmNicWhereInput.interfaceIdGt)
                && Objects.equals(this.interfaceIdGte, vmNicWhereInput.interfaceIdGte)
                && Objects.equals(this.interfaceIdIn, vmNicWhereInput.interfaceIdIn)
                && Objects.equals(this.interfaceIdLt, vmNicWhereInput.interfaceIdLt)
                && Objects.equals(this.interfaceIdLte, vmNicWhereInput.interfaceIdLte)
                && Objects.equals(this.interfaceIdNot, vmNicWhereInput.interfaceIdNot)
                && Objects.equals(
                        this.interfaceIdNotContains, vmNicWhereInput.interfaceIdNotContains)
                && Objects.equals(
                        this.interfaceIdNotEndsWith, vmNicWhereInput.interfaceIdNotEndsWith)
                && Objects.equals(this.interfaceIdNotIn, vmNicWhereInput.interfaceIdNotIn)
                && Objects.equals(
                        this.interfaceIdNotStartsWith, vmNicWhereInput.interfaceIdNotStartsWith)
                && Objects.equals(this.interfaceIdStartsWith, vmNicWhereInput.interfaceIdStartsWith)
                && Objects.equals(this.ipAddress, vmNicWhereInput.ipAddress)
                && Objects.equals(this.ipAddressContains, vmNicWhereInput.ipAddressContains)
                && Objects.equals(this.ipAddressEndsWith, vmNicWhereInput.ipAddressEndsWith)
                && Objects.equals(this.ipAddressGt, vmNicWhereInput.ipAddressGt)
                && Objects.equals(this.ipAddressGte, vmNicWhereInput.ipAddressGte)
                && Objects.equals(this.ipAddressIn, vmNicWhereInput.ipAddressIn)
                && Objects.equals(this.ipAddressLt, vmNicWhereInput.ipAddressLt)
                && Objects.equals(this.ipAddressLte, vmNicWhereInput.ipAddressLte)
                && Objects.equals(this.ipAddressNot, vmNicWhereInput.ipAddressNot)
                && Objects.equals(this.ipAddressNotContains, vmNicWhereInput.ipAddressNotContains)
                && Objects.equals(this.ipAddressNotEndsWith, vmNicWhereInput.ipAddressNotEndsWith)
                && Objects.equals(this.ipAddressNotIn, vmNicWhereInput.ipAddressNotIn)
                && Objects.equals(
                        this.ipAddressNotStartsWith, vmNicWhereInput.ipAddressNotStartsWith)
                && Objects.equals(this.ipAddressStartsWith, vmNicWhereInput.ipAddressStartsWith)
                && Objects.equals(this.localId, vmNicWhereInput.localId)
                && Objects.equals(this.localIdContains, vmNicWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vmNicWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vmNicWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vmNicWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vmNicWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vmNicWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vmNicWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vmNicWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, vmNicWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, vmNicWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vmNicWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, vmNicWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, vmNicWhereInput.localIdStartsWith)
                && Objects.equals(this.macAddress, vmNicWhereInput.macAddress)
                && Objects.equals(this.macAddressContains, vmNicWhereInput.macAddressContains)
                && Objects.equals(this.macAddressEndsWith, vmNicWhereInput.macAddressEndsWith)
                && Objects.equals(this.macAddressGt, vmNicWhereInput.macAddressGt)
                && Objects.equals(this.macAddressGte, vmNicWhereInput.macAddressGte)
                && Objects.equals(this.macAddressIn, vmNicWhereInput.macAddressIn)
                && Objects.equals(this.macAddressLt, vmNicWhereInput.macAddressLt)
                && Objects.equals(this.macAddressLte, vmNicWhereInput.macAddressLte)
                && Objects.equals(this.macAddressNot, vmNicWhereInput.macAddressNot)
                && Objects.equals(this.macAddressNotContains, vmNicWhereInput.macAddressNotContains)
                && Objects.equals(this.macAddressNotEndsWith, vmNicWhereInput.macAddressNotEndsWith)
                && Objects.equals(this.macAddressNotIn, vmNicWhereInput.macAddressNotIn)
                && Objects.equals(
                        this.macAddressNotStartsWith, vmNicWhereInput.macAddressNotStartsWith)
                && Objects.equals(this.macAddressStartsWith, vmNicWhereInput.macAddressStartsWith)
                && Objects.equals(this.mirror, vmNicWhereInput.mirror)
                && Objects.equals(this.mirrorNot, vmNicWhereInput.mirrorNot)
                && Objects.equals(this.model, vmNicWhereInput.model)
                && Objects.equals(this.modelIn, vmNicWhereInput.modelIn)
                && Objects.equals(this.modelNot, vmNicWhereInput.modelNot)
                && Objects.equals(this.modelNotIn, vmNicWhereInput.modelNotIn)
                && Objects.equals(this.nic, vmNicWhereInput.nic)
                && Objects.equals(this.order, vmNicWhereInput.order)
                && Objects.equals(this.orderGt, vmNicWhereInput.orderGt)
                && Objects.equals(this.orderGte, vmNicWhereInput.orderGte)
                && Objects.equals(this.orderIn, vmNicWhereInput.orderIn)
                && Objects.equals(this.orderLt, vmNicWhereInput.orderLt)
                && Objects.equals(this.orderLte, vmNicWhereInput.orderLte)
                && Objects.equals(this.orderNot, vmNicWhereInput.orderNot)
                && Objects.equals(this.orderNotIn, vmNicWhereInput.orderNotIn)
                && Objects.equals(this.subnetMask, vmNicWhereInput.subnetMask)
                && Objects.equals(this.subnetMaskContains, vmNicWhereInput.subnetMaskContains)
                && Objects.equals(this.subnetMaskEndsWith, vmNicWhereInput.subnetMaskEndsWith)
                && Objects.equals(this.subnetMaskGt, vmNicWhereInput.subnetMaskGt)
                && Objects.equals(this.subnetMaskGte, vmNicWhereInput.subnetMaskGte)
                && Objects.equals(this.subnetMaskIn, vmNicWhereInput.subnetMaskIn)
                && Objects.equals(this.subnetMaskLt, vmNicWhereInput.subnetMaskLt)
                && Objects.equals(this.subnetMaskLte, vmNicWhereInput.subnetMaskLte)
                && Objects.equals(this.subnetMaskNot, vmNicWhereInput.subnetMaskNot)
                && Objects.equals(this.subnetMaskNotContains, vmNicWhereInput.subnetMaskNotContains)
                && Objects.equals(this.subnetMaskNotEndsWith, vmNicWhereInput.subnetMaskNotEndsWith)
                && Objects.equals(this.subnetMaskNotIn, vmNicWhereInput.subnetMaskNotIn)
                && Objects.equals(
                        this.subnetMaskNotStartsWith, vmNicWhereInput.subnetMaskNotStartsWith)
                && Objects.equals(this.subnetMaskStartsWith, vmNicWhereInput.subnetMaskStartsWith)
                && Objects.equals(this.type, vmNicWhereInput.type)
                && Objects.equals(this.typeIn, vmNicWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmNicWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmNicWhereInput.typeNotIn)
                && Objects.equals(this.vlan, vmNicWhereInput.vlan)
                && Objects.equals(this.vm, vmNicWhereInput.vm);
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
                egressRateLimitBurstInBit,
                egressRateLimitBurstInBitGt,
                egressRateLimitBurstInBitGte,
                egressRateLimitBurstInBitIn,
                egressRateLimitBurstInBitLt,
                egressRateLimitBurstInBitLte,
                egressRateLimitBurstInBitNot,
                egressRateLimitBurstInBitNotIn,
                egressRateLimitEnabled,
                egressRateLimitEnabledNot,
                egressRateLimitMaxRateInBitps,
                egressRateLimitMaxRateInBitpsGt,
                egressRateLimitMaxRateInBitpsGte,
                egressRateLimitMaxRateInBitpsIn,
                egressRateLimitMaxRateInBitpsLt,
                egressRateLimitMaxRateInBitpsLte,
                egressRateLimitMaxRateInBitpsNot,
                egressRateLimitMaxRateInBitpsNotIn,
                enabled,
                enabledNot,
                gateway,
                gatewayContains,
                gatewayEndsWith,
                gatewayGt,
                gatewayGte,
                gatewayIn,
                gatewayLt,
                gatewayLte,
                gatewayNot,
                gatewayNotContains,
                gatewayNotEndsWith,
                gatewayNotIn,
                gatewayNotStartsWith,
                gatewayStartsWith,
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
                ingressRateLimitBurstInBit,
                ingressRateLimitBurstInBitGt,
                ingressRateLimitBurstInBitGte,
                ingressRateLimitBurstInBitIn,
                ingressRateLimitBurstInBitLt,
                ingressRateLimitBurstInBitLte,
                ingressRateLimitBurstInBitNot,
                ingressRateLimitBurstInBitNotIn,
                ingressRateLimitEnabled,
                ingressRateLimitEnabledNot,
                ingressRateLimitMaxRateInBitps,
                ingressRateLimitMaxRateInBitpsGt,
                ingressRateLimitMaxRateInBitpsGte,
                ingressRateLimitMaxRateInBitpsIn,
                ingressRateLimitMaxRateInBitpsLt,
                ingressRateLimitMaxRateInBitpsLte,
                ingressRateLimitMaxRateInBitpsNot,
                ingressRateLimitMaxRateInBitpsNotIn,
                interfaceId,
                interfaceIdContains,
                interfaceIdEndsWith,
                interfaceIdGt,
                interfaceIdGte,
                interfaceIdIn,
                interfaceIdLt,
                interfaceIdLte,
                interfaceIdNot,
                interfaceIdNotContains,
                interfaceIdNotEndsWith,
                interfaceIdNotIn,
                interfaceIdNotStartsWith,
                interfaceIdStartsWith,
                ipAddress,
                ipAddressContains,
                ipAddressEndsWith,
                ipAddressGt,
                ipAddressGte,
                ipAddressIn,
                ipAddressLt,
                ipAddressLte,
                ipAddressNot,
                ipAddressNotContains,
                ipAddressNotEndsWith,
                ipAddressNotIn,
                ipAddressNotStartsWith,
                ipAddressStartsWith,
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
                macAddress,
                macAddressContains,
                macAddressEndsWith,
                macAddressGt,
                macAddressGte,
                macAddressIn,
                macAddressLt,
                macAddressLte,
                macAddressNot,
                macAddressNotContains,
                macAddressNotEndsWith,
                macAddressNotIn,
                macAddressNotStartsWith,
                macAddressStartsWith,
                mirror,
                mirrorNot,
                model,
                modelIn,
                modelNot,
                modelNotIn,
                nic,
                order,
                orderGt,
                orderGte,
                orderIn,
                orderLt,
                orderLte,
                orderNot,
                orderNotIn,
                subnetMask,
                subnetMaskContains,
                subnetMaskEndsWith,
                subnetMaskGt,
                subnetMaskGte,
                subnetMaskIn,
                subnetMaskLt,
                subnetMaskLte,
                subnetMaskNot,
                subnetMaskNotContains,
                subnetMaskNotEndsWith,
                subnetMaskNotIn,
                subnetMaskNotStartsWith,
                subnetMaskStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vlan,
                vm);
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
        sb.append("class VmNicWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    egressRateLimitBurstInBit: ")
                .append(toIndentedString(egressRateLimitBurstInBit))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitGt: ")
                .append(toIndentedString(egressRateLimitBurstInBitGt))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitGte: ")
                .append(toIndentedString(egressRateLimitBurstInBitGte))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitIn: ")
                .append(toIndentedString(egressRateLimitBurstInBitIn))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitLt: ")
                .append(toIndentedString(egressRateLimitBurstInBitLt))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitLte: ")
                .append(toIndentedString(egressRateLimitBurstInBitLte))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitNot: ")
                .append(toIndentedString(egressRateLimitBurstInBitNot))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitNotIn: ")
                .append(toIndentedString(egressRateLimitBurstInBitNotIn))
                .append("\n");
        sb.append("    egressRateLimitEnabled: ")
                .append(toIndentedString(egressRateLimitEnabled))
                .append("\n");
        sb.append("    egressRateLimitEnabledNot: ")
                .append(toIndentedString(egressRateLimitEnabledNot))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsGt: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsGt))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsGte: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsGte))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsIn: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsIn))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsLt: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsLt))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsLte: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsLte))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsNot: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsNot))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsNotIn: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsNotIn))
                .append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    enabledNot: ").append(toIndentedString(enabledNot)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    gatewayContains: ").append(toIndentedString(gatewayContains)).append("\n");
        sb.append("    gatewayEndsWith: ").append(toIndentedString(gatewayEndsWith)).append("\n");
        sb.append("    gatewayGt: ").append(toIndentedString(gatewayGt)).append("\n");
        sb.append("    gatewayGte: ").append(toIndentedString(gatewayGte)).append("\n");
        sb.append("    gatewayIn: ").append(toIndentedString(gatewayIn)).append("\n");
        sb.append("    gatewayLt: ").append(toIndentedString(gatewayLt)).append("\n");
        sb.append("    gatewayLte: ").append(toIndentedString(gatewayLte)).append("\n");
        sb.append("    gatewayNot: ").append(toIndentedString(gatewayNot)).append("\n");
        sb.append("    gatewayNotContains: ")
                .append(toIndentedString(gatewayNotContains))
                .append("\n");
        sb.append("    gatewayNotEndsWith: ")
                .append(toIndentedString(gatewayNotEndsWith))
                .append("\n");
        sb.append("    gatewayNotIn: ").append(toIndentedString(gatewayNotIn)).append("\n");
        sb.append("    gatewayNotStartsWith: ")
                .append(toIndentedString(gatewayNotStartsWith))
                .append("\n");
        sb.append("    gatewayStartsWith: ")
                .append(toIndentedString(gatewayStartsWith))
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
        sb.append("    ingressRateLimitBurstInBit: ")
                .append(toIndentedString(ingressRateLimitBurstInBit))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitGt: ")
                .append(toIndentedString(ingressRateLimitBurstInBitGt))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitGte: ")
                .append(toIndentedString(ingressRateLimitBurstInBitGte))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitIn: ")
                .append(toIndentedString(ingressRateLimitBurstInBitIn))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitLt: ")
                .append(toIndentedString(ingressRateLimitBurstInBitLt))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitLte: ")
                .append(toIndentedString(ingressRateLimitBurstInBitLte))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitNot: ")
                .append(toIndentedString(ingressRateLimitBurstInBitNot))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitNotIn: ")
                .append(toIndentedString(ingressRateLimitBurstInBitNotIn))
                .append("\n");
        sb.append("    ingressRateLimitEnabled: ")
                .append(toIndentedString(ingressRateLimitEnabled))
                .append("\n");
        sb.append("    ingressRateLimitEnabledNot: ")
                .append(toIndentedString(ingressRateLimitEnabledNot))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsGt: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsGt))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsGte: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsGte))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsIn: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsIn))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsLt: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsLt))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsLte: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsLte))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsNot: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsNot))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsNotIn: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsNotIn))
                .append("\n");
        sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
        sb.append("    interfaceIdContains: ")
                .append(toIndentedString(interfaceIdContains))
                .append("\n");
        sb.append("    interfaceIdEndsWith: ")
                .append(toIndentedString(interfaceIdEndsWith))
                .append("\n");
        sb.append("    interfaceIdGt: ").append(toIndentedString(interfaceIdGt)).append("\n");
        sb.append("    interfaceIdGte: ").append(toIndentedString(interfaceIdGte)).append("\n");
        sb.append("    interfaceIdIn: ").append(toIndentedString(interfaceIdIn)).append("\n");
        sb.append("    interfaceIdLt: ").append(toIndentedString(interfaceIdLt)).append("\n");
        sb.append("    interfaceIdLte: ").append(toIndentedString(interfaceIdLte)).append("\n");
        sb.append("    interfaceIdNot: ").append(toIndentedString(interfaceIdNot)).append("\n");
        sb.append("    interfaceIdNotContains: ")
                .append(toIndentedString(interfaceIdNotContains))
                .append("\n");
        sb.append("    interfaceIdNotEndsWith: ")
                .append(toIndentedString(interfaceIdNotEndsWith))
                .append("\n");
        sb.append("    interfaceIdNotIn: ").append(toIndentedString(interfaceIdNotIn)).append("\n");
        sb.append("    interfaceIdNotStartsWith: ")
                .append(toIndentedString(interfaceIdNotStartsWith))
                .append("\n");
        sb.append("    interfaceIdStartsWith: ")
                .append(toIndentedString(interfaceIdStartsWith))
                .append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipAddressContains: ")
                .append(toIndentedString(ipAddressContains))
                .append("\n");
        sb.append("    ipAddressEndsWith: ")
                .append(toIndentedString(ipAddressEndsWith))
                .append("\n");
        sb.append("    ipAddressGt: ").append(toIndentedString(ipAddressGt)).append("\n");
        sb.append("    ipAddressGte: ").append(toIndentedString(ipAddressGte)).append("\n");
        sb.append("    ipAddressIn: ").append(toIndentedString(ipAddressIn)).append("\n");
        sb.append("    ipAddressLt: ").append(toIndentedString(ipAddressLt)).append("\n");
        sb.append("    ipAddressLte: ").append(toIndentedString(ipAddressLte)).append("\n");
        sb.append("    ipAddressNot: ").append(toIndentedString(ipAddressNot)).append("\n");
        sb.append("    ipAddressNotContains: ")
                .append(toIndentedString(ipAddressNotContains))
                .append("\n");
        sb.append("    ipAddressNotEndsWith: ")
                .append(toIndentedString(ipAddressNotEndsWith))
                .append("\n");
        sb.append("    ipAddressNotIn: ").append(toIndentedString(ipAddressNotIn)).append("\n");
        sb.append("    ipAddressNotStartsWith: ")
                .append(toIndentedString(ipAddressNotStartsWith))
                .append("\n");
        sb.append("    ipAddressStartsWith: ")
                .append(toIndentedString(ipAddressStartsWith))
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
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    macAddressContains: ")
                .append(toIndentedString(macAddressContains))
                .append("\n");
        sb.append("    macAddressEndsWith: ")
                .append(toIndentedString(macAddressEndsWith))
                .append("\n");
        sb.append("    macAddressGt: ").append(toIndentedString(macAddressGt)).append("\n");
        sb.append("    macAddressGte: ").append(toIndentedString(macAddressGte)).append("\n");
        sb.append("    macAddressIn: ").append(toIndentedString(macAddressIn)).append("\n");
        sb.append("    macAddressLt: ").append(toIndentedString(macAddressLt)).append("\n");
        sb.append("    macAddressLte: ").append(toIndentedString(macAddressLte)).append("\n");
        sb.append("    macAddressNot: ").append(toIndentedString(macAddressNot)).append("\n");
        sb.append("    macAddressNotContains: ")
                .append(toIndentedString(macAddressNotContains))
                .append("\n");
        sb.append("    macAddressNotEndsWith: ")
                .append(toIndentedString(macAddressNotEndsWith))
                .append("\n");
        sb.append("    macAddressNotIn: ").append(toIndentedString(macAddressNotIn)).append("\n");
        sb.append("    macAddressNotStartsWith: ")
                .append(toIndentedString(macAddressNotStartsWith))
                .append("\n");
        sb.append("    macAddressStartsWith: ")
                .append(toIndentedString(macAddressStartsWith))
                .append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    mirrorNot: ").append(toIndentedString(mirrorNot)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
        sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
        sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
        sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    orderGt: ").append(toIndentedString(orderGt)).append("\n");
        sb.append("    orderGte: ").append(toIndentedString(orderGte)).append("\n");
        sb.append("    orderIn: ").append(toIndentedString(orderIn)).append("\n");
        sb.append("    orderLt: ").append(toIndentedString(orderLt)).append("\n");
        sb.append("    orderLte: ").append(toIndentedString(orderLte)).append("\n");
        sb.append("    orderNot: ").append(toIndentedString(orderNot)).append("\n");
        sb.append("    orderNotIn: ").append(toIndentedString(orderNotIn)).append("\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
        sb.append("    subnetMaskContains: ")
                .append(toIndentedString(subnetMaskContains))
                .append("\n");
        sb.append("    subnetMaskEndsWith: ")
                .append(toIndentedString(subnetMaskEndsWith))
                .append("\n");
        sb.append("    subnetMaskGt: ").append(toIndentedString(subnetMaskGt)).append("\n");
        sb.append("    subnetMaskGte: ").append(toIndentedString(subnetMaskGte)).append("\n");
        sb.append("    subnetMaskIn: ").append(toIndentedString(subnetMaskIn)).append("\n");
        sb.append("    subnetMaskLt: ").append(toIndentedString(subnetMaskLt)).append("\n");
        sb.append("    subnetMaskLte: ").append(toIndentedString(subnetMaskLte)).append("\n");
        sb.append("    subnetMaskNot: ").append(toIndentedString(subnetMaskNot)).append("\n");
        sb.append("    subnetMaskNotContains: ")
                .append(toIndentedString(subnetMaskNotContains))
                .append("\n");
        sb.append("    subnetMaskNotEndsWith: ")
                .append(toIndentedString(subnetMaskNotEndsWith))
                .append("\n");
        sb.append("    subnetMaskNotIn: ").append(toIndentedString(subnetMaskNotIn)).append("\n");
        sb.append("    subnetMaskNotStartsWith: ")
                .append(toIndentedString(subnetMaskNotStartsWith))
                .append("\n");
        sb.append("    subnetMaskStartsWith: ")
                .append(toIndentedString(subnetMaskStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

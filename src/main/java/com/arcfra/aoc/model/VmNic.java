package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmNic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNic extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT =
            "egress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double egressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED =
            "egress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED)
    private Boolean egressRateLimitEnabled;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "egress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double egressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT =
            "ingress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double ingressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED =
            "ingress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED)
    private Boolean ingressRateLimitEnabled;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "ingress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double ingressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_INTERFACE_ID = "interface_id";

    @SerializedName(SERIALIZED_NAME_INTERFACE_ID)
    private String interfaceId;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private VmNicModel model;

    public static final String SERIALIZED_NAME_NIC = "nic";

    @SerializedName(SERIALIZED_NAME_NIC)
    private NestedNic nic;

    public static final String SERIALIZED_NAME_ORDER = "order";

    @SerializedName(SERIALIZED_NAME_ORDER)
    private Integer order;

    public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
    private String subnetMask;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private NestedVlan vlan;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public VmNic() {}

    public VmNic egressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {

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

    public VmNic egressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public VmNic egressRateLimitBurstInBit_ExplictlyNonNull() {
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

    public VmNic egressRateLimitEnabled(Boolean egressRateLimitEnabled) {

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

    public VmNic egressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public VmNic egressRateLimitEnabled_ExplictlyNonNull() {
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

    public VmNic egressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {

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

    public VmNic egressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public VmNic egressRateLimitMaxRateInBitps_ExplictlyNonNull() {
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

    public VmNic enabled(Boolean enabled) {

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

    public VmNic enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmNic enabled_ExplictlyNonNull() {
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

    public VmNic gateway(String gateway) {

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

    public VmNic gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VmNic gateway_ExplictlyNonNull() {
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

    public VmNic id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VmNic id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmNic id_ExplictlyNonNull() {
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

    public VmNic ingressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {

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

    public VmNic ingressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public VmNic ingressRateLimitBurstInBit_ExplictlyNonNull() {
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

    public VmNic ingressRateLimitEnabled(Boolean ingressRateLimitEnabled) {

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

    public VmNic ingressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public VmNic ingressRateLimitEnabled_ExplictlyNonNull() {
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

    public VmNic ingressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {

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

    public VmNic ingressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public VmNic ingressRateLimitMaxRateInBitps_ExplictlyNonNull() {
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

    public VmNic interfaceId(String interfaceId) {

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

    public VmNic interfaceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERFACE_ID);
        return this;
    }

    public VmNic interfaceId_ExplictlyNonNull() {
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

    public VmNic ipAddress(String ipAddress) {

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

    public VmNic ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public VmNic ipAddress_ExplictlyNonNull() {
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

    public VmNic localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VmNic localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmNic localId_ExplictlyNonNull() {
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

    public VmNic macAddress(String macAddress) {

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

    public VmNic macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public VmNic macAddress_ExplictlyNonNull() {
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

    public VmNic mirror(Boolean mirror) {

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

    public VmNic mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public VmNic mirror_ExplictlyNonNull() {
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

    public VmNic model(VmNicModel model) {

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

    public VmNic model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public VmNic model_ExplictlyNonNull() {
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

    public VmNic nic(NestedNic nic) {

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
    public NestedNic getNic() {
        return nic;
    }

    public void setNic(NestedNic nic) {
        this.nic = nic;
    }

    public VmNic nic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC);
        return this;
    }

    public VmNic nic_ExplictlyNonNull() {
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

    public VmNic order(Integer order) {

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

    public VmNic order_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORDER);
        return this;
    }

    public VmNic order_ExplictlyNonNull() {
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

    public VmNic subnetMask(String subnetMask) {

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

    public VmNic subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public VmNic subnetMask_ExplictlyNonNull() {
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

    public VmNic type(VmNicType type) {

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

    public VmNic type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmNic type_ExplictlyNonNull() {
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

    public VmNic vlan(NestedVlan vlan) {

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
    public NestedVlan getVlan() {
        return vlan;
    }

    public void setVlan(NestedVlan vlan) {
        this.vlan = vlan;
    }

    public VmNic vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public VmNic vlan_ExplictlyNonNull() {
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

    public VmNic vm(NestedVm vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVm getVm() {
        return vm;
    }

    public void setVm(NestedVm vm) {
        this.vm = vm;
    }

    public VmNic vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmNic vm_ExplictlyNonNull() {
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
        VmNic vmNic = (VmNic) o;
        return Objects.equals(this.egressRateLimitBurstInBit, vmNic.egressRateLimitBurstInBit)
                && Objects.equals(this.egressRateLimitEnabled, vmNic.egressRateLimitEnabled)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitps, vmNic.egressRateLimitMaxRateInBitps)
                && Objects.equals(this.enabled, vmNic.enabled)
                && Objects.equals(this.gateway, vmNic.gateway)
                && Objects.equals(this.id, vmNic.id)
                && Objects.equals(this.ingressRateLimitBurstInBit, vmNic.ingressRateLimitBurstInBit)
                && Objects.equals(this.ingressRateLimitEnabled, vmNic.ingressRateLimitEnabled)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitps, vmNic.ingressRateLimitMaxRateInBitps)
                && Objects.equals(this.interfaceId, vmNic.interfaceId)
                && Objects.equals(this.ipAddress, vmNic.ipAddress)
                && Objects.equals(this.localId, vmNic.localId)
                && Objects.equals(this.macAddress, vmNic.macAddress)
                && Objects.equals(this.mirror, vmNic.mirror)
                && Objects.equals(this.model, vmNic.model)
                && Objects.equals(this.nic, vmNic.nic)
                && Objects.equals(this.order, vmNic.order)
                && Objects.equals(this.subnetMask, vmNic.subnetMask)
                && Objects.equals(this.type, vmNic.type)
                && Objects.equals(this.vlan, vmNic.vlan)
                && Objects.equals(this.vm, vmNic.vm);
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
                egressRateLimitBurstInBit,
                egressRateLimitEnabled,
                egressRateLimitMaxRateInBitps,
                enabled,
                gateway,
                id,
                ingressRateLimitBurstInBit,
                ingressRateLimitEnabled,
                ingressRateLimitMaxRateInBitps,
                interfaceId,
                ipAddress,
                localId,
                macAddress,
                mirror,
                model,
                nic,
                order,
                subnetMask,
                type,
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
        sb.append("class VmNic {\n");
        sb.append("    egressRateLimitBurstInBit: ")
                .append(toIndentedString(egressRateLimitBurstInBit))
                .append("\n");
        sb.append("    egressRateLimitEnabled: ")
                .append(toIndentedString(egressRateLimitEnabled))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ingressRateLimitBurstInBit: ")
                .append(toIndentedString(ingressRateLimitBurstInBit))
                .append("\n");
        sb.append("    ingressRateLimitEnabled: ")
                .append(toIndentedString(ingressRateLimitEnabled))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

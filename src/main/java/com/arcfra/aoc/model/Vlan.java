package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Vlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Vlan extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
    private String gatewayIp;

    public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK = "gateway_subnetmask";

    @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK)
    private String gatewaySubnetmask;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MODE_TYPE = "mode_type";

    @SerializedName(SERIALIZED_NAME_MODE_TYPE)
    private VlanModeType modeType;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NETWORK_IDS = "network_ids";

    @SerializedName(SERIALIZED_NAME_NETWORK_IDS)
    private List<String> networkIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_QOS_BURST = "qos_burst";

    @SerializedName(SERIALIZED_NAME_QOS_BURST)
    private Double qosBurst;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH = "qos_max_bandwidth";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH)
    private Double qosMaxBandwidth;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH = "qos_min_bandwidth";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH)
    private Double qosMinBandwidth;

    public static final String SERIALIZED_NAME_QOS_PRIORITY = "qos_priority";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY)
    private Integer qosPriority;

    public static final String SERIALIZED_NAME_SUBNETMASK = "subnetmask";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK)
    private String subnetmask;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private NetworkType type;

    public static final String SERIALIZED_NAME_VDS = "vds";

    @SerializedName(SERIALIZED_NAME_VDS)
    private NestedVds vds;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private Integer vlanId;

    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<NestedVmNic> vmNics = null;

    public Vlan() {}

    public Vlan entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Vlan entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Vlan entityAsyncStatus_ExplictlyNonNull() {
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

    public Vlan gatewayIp(String gatewayIp) {

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

    public Vlan gatewayIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public Vlan gatewayIp_ExplictlyNonNull() {
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

    public Vlan gatewaySubnetmask(String gatewaySubnetmask) {

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

    public Vlan gatewaySubnetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_SUBNETMASK);
        return this;
    }

    public Vlan gatewaySubnetmask_ExplictlyNonNull() {
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

    public Vlan id(String id) {

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

    public Vlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Vlan id_ExplictlyNonNull() {
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

    public Vlan labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Vlan addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public Vlan labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Vlan labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public Vlan localId(String localId) {

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

    public Vlan localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Vlan localId_ExplictlyNonNull() {
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

    public Vlan modeType(VlanModeType modeType) {

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

    public Vlan modeType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE);
        return this;
    }

    public Vlan modeType_ExplictlyNonNull() {
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

    public Vlan name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vlan name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Vlan name_ExplictlyNonNull() {
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

    public Vlan networkIds(List<String> networkIds) {

        this.networkIds = networkIds;
        return this;
    }

    public Vlan addNetworkIdsItem(String networkIdsItem) {
        this.networkIds.add(networkIdsItem);
        return this;
    }

    /**
     * Get networkIds
     *
     * @return networkIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getNetworkIds() {
        return networkIds;
    }

    public void setNetworkIds(List<String> networkIds) {
        this.networkIds = networkIds;
    }

    public Vlan networkIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_IDS);
        return this;
    }

    public Vlan networkIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_IDS);
        return this;
    }

    public void setNetworkIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_IDS);
        }
    }

    public boolean getNetworkIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_IDS);
    }

    public Vlan qosBurst(Double qosBurst) {

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

    public Vlan qosBurst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST);
        return this;
    }

    public Vlan qosBurst_ExplictlyNonNull() {
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

    public Vlan qosMaxBandwidth(Double qosMaxBandwidth) {

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

    public Vlan qosMaxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        return this;
    }

    public Vlan qosMaxBandwidth_ExplictlyNonNull() {
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

    public Vlan qosMinBandwidth(Double qosMinBandwidth) {

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

    public Vlan qosMinBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        return this;
    }

    public Vlan qosMinBandwidth_ExplictlyNonNull() {
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

    public Vlan qosPriority(Integer qosPriority) {

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

    public Vlan qosPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY);
        return this;
    }

    public Vlan qosPriority_ExplictlyNonNull() {
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

    public Vlan subnetmask(String subnetmask) {

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

    public Vlan subnetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK);
        return this;
    }

    public Vlan subnetmask_ExplictlyNonNull() {
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

    public Vlan type(NetworkType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NetworkType getType() {
        return type;
    }

    public void setType(NetworkType type) {
        this.type = type;
    }

    public Vlan type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Vlan type_ExplictlyNonNull() {
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

    public Vlan vds(NestedVds vds) {

        this.vds = vds;
        return this;
    }

    /**
     * Get vds
     *
     * @return vds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVds getVds() {
        return vds;
    }

    public void setVds(NestedVds vds) {
        this.vds = vds;
    }

    public Vlan vds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS);
        return this;
    }

    public Vlan vds_ExplictlyNonNull() {
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

    public Vlan vlanId(Integer vlanId) {

        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get vlanId
     *
     * @return vlanId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public Vlan vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public Vlan vlanId_ExplictlyNonNull() {
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

    public Vlan vmNics(List<NestedVmNic> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public Vlan addVmNicsItem(NestedVmNic vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<NestedVmNic>();
        }
        this.vmNics.add(vmNicsItem);
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmNic> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<NestedVmNic> vmNics) {
        this.vmNics = vmNics;
    }

    public Vlan vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public Vlan vmNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public void setVmNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        }
    }

    public boolean getVmNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vlan vlan = (Vlan) o;
        return Objects.equals(this.entityAsyncStatus, vlan.entityAsyncStatus)
                && Objects.equals(this.gatewayIp, vlan.gatewayIp)
                && Objects.equals(this.gatewaySubnetmask, vlan.gatewaySubnetmask)
                && Objects.equals(this.id, vlan.id)
                && Objects.equals(this.labels, vlan.labels)
                && Objects.equals(this.localId, vlan.localId)
                && Objects.equals(this.modeType, vlan.modeType)
                && Objects.equals(this.name, vlan.name)
                && Objects.equals(this.networkIds, vlan.networkIds)
                && Objects.equals(this.qosBurst, vlan.qosBurst)
                && Objects.equals(this.qosMaxBandwidth, vlan.qosMaxBandwidth)
                && Objects.equals(this.qosMinBandwidth, vlan.qosMinBandwidth)
                && Objects.equals(this.qosPriority, vlan.qosPriority)
                && Objects.equals(this.subnetmask, vlan.subnetmask)
                && Objects.equals(this.type, vlan.type)
                && Objects.equals(this.vds, vlan.vds)
                && Objects.equals(this.vlanId, vlan.vlanId)
                && Objects.equals(this.vmNics, vlan.vmNics);
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
                entityAsyncStatus,
                gatewayIp,
                gatewaySubnetmask,
                id,
                labels,
                localId,
                modeType,
                name,
                networkIds,
                qosBurst,
                qosMaxBandwidth,
                qosMinBandwidth,
                qosPriority,
                subnetmask,
                type,
                vds,
                vlanId,
                vmNics);
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
        sb.append("class Vlan {\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    gatewaySubnetmask: ")
                .append(toIndentedString(gatewaySubnetmask))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    modeType: ").append(toIndentedString(modeType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkIds: ").append(toIndentedString(networkIds)).append("\n");
        sb.append("    qosBurst: ").append(toIndentedString(qosBurst)).append("\n");
        sb.append("    qosMaxBandwidth: ").append(toIndentedString(qosMaxBandwidth)).append("\n");
        sb.append("    qosMinBandwidth: ").append(toIndentedString(qosMinBandwidth)).append("\n");
        sb.append("    qosPriority: ").append(toIndentedString(qosPriority)).append("\n");
        sb.append("    subnetmask: ").append(toIndentedString(subnetmask)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
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

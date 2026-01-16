package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Nic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Nic extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DRIVER = "driver";

    @SerializedName(SERIALIZED_NAME_DRIVER)
    private String driver;

    public static final String SERIALIZED_NAME_DRIVER_STATE = "driver_state";

    @SerializedName(SERIALIZED_NAME_DRIVER_STATE)
    private NicDriverState driverState;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
    private String gatewayIp;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_IBDEV = "ibdev";

    @SerializedName(SERIALIZED_NAME_IBDEV)
    private String ibdev;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IOMMU_STATUS = "iommu_status";

    @SerializedName(SERIALIZED_NAME_IOMMU_STATUS)
    private IommuStatus iommuStatus;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_IS_SRIOV = "is_sriov";

    @SerializedName(SERIALIZED_NAME_IS_SRIOV)
    private Boolean isSriov;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_MAX_VF_NUM = "max_vf_num";

    @SerializedName(SERIALIZED_NAME_MAX_VF_NUM)
    private Integer maxVfNum;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_MTU = "mtu";

    @SerializedName(SERIALIZED_NAME_MTU)
    private Integer mtu;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NIC_UUID = "nic_uuid";

    @SerializedName(SERIALIZED_NAME_NIC_UUID)
    private String nicUuid;

    public static final String SERIALIZED_NAME_PHYSICAL = "physical";

    @SerializedName(SERIALIZED_NAME_PHYSICAL)
    private Boolean physical;

    public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";

    @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
    private Boolean rdmaEnabled;

    public static final String SERIALIZED_NAME_RUNNING = "running";

    @SerializedName(SERIALIZED_NAME_RUNNING)
    private Boolean running;

    public static final String SERIALIZED_NAME_SPEED = "speed";

    @SerializedName(SERIALIZED_NAME_SPEED)
    private Long speed;

    public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
    private String subnetMask;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
    private Integer totalVfNum;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private NetworkType type;

    public static final String SERIALIZED_NAME_UP = "up";

    @SerializedName(SERIALIZED_NAME_UP)
    private Boolean up;

    public static final String SERIALIZED_NAME_USED_VF_NUM = "used_vf_num";

    @SerializedName(SERIALIZED_NAME_USED_VF_NUM)
    private Integer usedVfNum;

    public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";

    @SerializedName(SERIALIZED_NAME_USER_USAGE)
    private NicUserUsage userUsage;

    public static final String SERIALIZED_NAME_VDS = "vds";

    @SerializedName(SERIALIZED_NAME_VDS)
    private NestedVds vds;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public Nic() {}

    public Nic driver(String driver) {

        this.driver = driver;
        return this;
    }

    /**
     * Get driver
     *
     * @return driver
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Nic driver_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DRIVER);
        return this;
    }

    public Nic driver_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DRIVER);
        return this;
    }

    public void setDriver_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DRIVER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DRIVER);
        }
    }

    public boolean getDriver_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DRIVER);
    }

    public Nic driverState(NicDriverState driverState) {

        this.driverState = driverState;
        return this;
    }

    /**
     * Get driverState
     *
     * @return driverState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicDriverState getDriverState() {
        return driverState;
    }

    public void setDriverState(NicDriverState driverState) {
        this.driverState = driverState;
    }

    public Nic driverState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DRIVER_STATE);
        return this;
    }

    public Nic driverState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DRIVER_STATE);
        return this;
    }

    public void setDriverState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DRIVER_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DRIVER_STATE);
        }
    }

    public boolean getDriverState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DRIVER_STATE);
    }

    public Nic entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Nic entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Nic entityAsyncStatus_ExplictlyNonNull() {
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

    public Nic gatewayIp(String gatewayIp) {

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

    public Nic gatewayIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public Nic gatewayIp_ExplictlyNonNull() {
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

    public Nic host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public Nic host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public Nic host_ExplictlyNonNull() {
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

    public Nic ibdev(String ibdev) {

        this.ibdev = ibdev;
        return this;
    }

    /**
     * Get ibdev
     *
     * @return ibdev
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIbdev() {
        return ibdev;
    }

    public void setIbdev(String ibdev) {
        this.ibdev = ibdev;
    }

    public Nic ibdev_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IBDEV);
        return this;
    }

    public Nic ibdev_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IBDEV);
        return this;
    }

    public void setIbdev_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IBDEV);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IBDEV);
        }
    }

    public boolean getIbdev_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IBDEV);
    }

    public Nic id(String id) {

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

    public Nic id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Nic id_ExplictlyNonNull() {
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

    public Nic iommuStatus(IommuStatus iommuStatus) {

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

    public Nic iommuStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOMMU_STATUS);
        return this;
    }

    public Nic iommuStatus_ExplictlyNonNull() {
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

    public Nic ipAddress(String ipAddress) {

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

    public Nic ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public Nic ipAddress_ExplictlyNonNull() {
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

    public Nic isSriov(Boolean isSriov) {

        this.isSriov = isSriov;
        return this;
    }

    /**
     * Get isSriov
     *
     * @return isSriov
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsSriov() {
        return isSriov;
    }

    public void setIsSriov(Boolean isSriov) {
        this.isSriov = isSriov;
    }

    public Nic isSriov_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SRIOV);
        return this;
    }

    public Nic isSriov_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SRIOV);
        return this;
    }

    public void setIsSriov_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SRIOV);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SRIOV);
        }
    }

    public boolean getIsSriov_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SRIOV);
    }

    public Nic labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Nic addLabelsItem(NestedLabel labelsItem) {
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

    public Nic labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Nic labels_ExplictlyNonNull() {
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

    public Nic localId(String localId) {

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

    public Nic localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Nic localId_ExplictlyNonNull() {
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

    public Nic macAddress(String macAddress) {

        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get macAddress
     *
     * @return macAddress
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Nic macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public Nic macAddress_ExplictlyNonNull() {
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

    public Nic maxVfNum(Integer maxVfNum) {

        this.maxVfNum = maxVfNum;
        return this;
    }

    /**
     * Get maxVfNum
     *
     * @return maxVfNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxVfNum() {
        return maxVfNum;
    }

    public void setMaxVfNum(Integer maxVfNum) {
        this.maxVfNum = maxVfNum;
    }

    public Nic maxVfNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_VF_NUM);
        return this;
    }

    public Nic maxVfNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_VF_NUM);
        return this;
    }

    public void setMaxVfNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_VF_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_VF_NUM);
        }
    }

    public boolean getMaxVfNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_VF_NUM);
    }

    public Nic model(String model) {

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
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Nic model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public Nic model_ExplictlyNonNull() {
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

    public Nic mtu(Integer mtu) {

        this.mtu = mtu;
        return this;
    }

    /**
     * Get mtu
     *
     * @return mtu
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public Nic mtu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU);
        return this;
    }

    public Nic mtu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU);
        return this;
    }

    public void setMtu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU);
        }
    }

    public boolean getMtu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU);
    }

    public Nic name(String name) {

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

    public Nic name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Nic name_ExplictlyNonNull() {
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

    public Nic nicUuid(String nicUuid) {

        this.nicUuid = nicUuid;
        return this;
    }

    /**
     * Get nicUuid
     *
     * @return nicUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNicUuid() {
        return nicUuid;
    }

    public void setNicUuid(String nicUuid) {
        this.nicUuid = nicUuid;
    }

    public Nic nicUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_UUID);
        return this;
    }

    public Nic nicUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_UUID);
        return this;
    }

    public void setNicUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_UUID);
        }
    }

    public boolean getNicUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_UUID);
    }

    public Nic physical(Boolean physical) {

        this.physical = physical;
        return this;
    }

    /**
     * Get physical
     *
     * @return physical
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getPhysical() {
        return physical;
    }

    public void setPhysical(Boolean physical) {
        this.physical = physical;
    }

    public Nic physical_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL);
        return this;
    }

    public Nic physical_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL);
        return this;
    }

    public void setPhysical_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL);
        }
    }

    public boolean getPhysical_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL);
    }

    public Nic rdmaEnabled(Boolean rdmaEnabled) {

        this.rdmaEnabled = rdmaEnabled;
        return this;
    }

    /**
     * Get rdmaEnabled
     *
     * @return rdmaEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRdmaEnabled() {
        return rdmaEnabled;
    }

    public void setRdmaEnabled(Boolean rdmaEnabled) {
        this.rdmaEnabled = rdmaEnabled;
    }

    public Nic rdmaEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED);
        return this;
    }

    public Nic rdmaEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED);
        return this;
    }

    public void setRdmaEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED);
        }
    }

    public boolean getRdmaEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RDMA_ENABLED);
    }

    public Nic running(Boolean running) {

        this.running = running;
        return this;
    }

    /**
     * Get running
     *
     * @return running
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Nic running_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING);
        return this;
    }

    public Nic running_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING);
        return this;
    }

    public void setRunning_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING);
        }
    }

    public boolean getRunning_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING);
    }

    public Nic speed(Long speed) {

        this.speed = speed;
        return this;
    }

    /**
     * Get speed
     *
     * @return speed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Nic speed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED);
        return this;
    }

    public Nic speed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED);
        return this;
    }

    public void setSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED);
        }
    }

    public boolean getSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED);
    }

    public Nic subnetMask(String subnetMask) {

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

    public Nic subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public Nic subnetMask_ExplictlyNonNull() {
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

    public Nic totalVfNum(Integer totalVfNum) {

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

    public Nic totalVfNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM);
        return this;
    }

    public Nic totalVfNum_ExplictlyNonNull() {
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

    public Nic type(NetworkType type) {

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

    public Nic type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Nic type_ExplictlyNonNull() {
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

    public Nic up(Boolean up) {

        this.up = up;
        return this;
    }

    /**
     * Get up
     *
     * @return up
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getUp() {
        return up;
    }

    public void setUp(Boolean up) {
        this.up = up;
    }

    public Nic up_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UP);
        return this;
    }

    public Nic up_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UP);
        return this;
    }

    public void setUp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UP);
        }
    }

    public boolean getUp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UP);
    }

    public Nic usedVfNum(Integer usedVfNum) {

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

    public Nic usedVfNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_VF_NUM);
        return this;
    }

    public Nic usedVfNum_ExplictlyNonNull() {
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

    public Nic userUsage(NicUserUsage userUsage) {

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
    public NicUserUsage getUserUsage() {
        return userUsage;
    }

    public void setUserUsage(NicUserUsage userUsage) {
        this.userUsage = userUsage;
    }

    public Nic userUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_USAGE);
        return this;
    }

    public Nic userUsage_ExplictlyNonNull() {
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

    public Nic vds(NestedVds vds) {

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
    public NestedVds getVds() {
        return vds;
    }

    public void setVds(NestedVds vds) {
        this.vds = vds;
    }

    public Nic vds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS);
        return this;
    }

    public Nic vds_ExplictlyNonNull() {
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

    public Nic vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public Nic addVmsItem(NestedVm vmsItem) {
        if (this.vms == null) {
            this.vms = new ArrayList<NestedVm>();
        }
        this.vms.add(vmsItem);
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVm> getVms() {
        return vms;
    }

    public void setVms(List<NestedVm> vms) {
        this.vms = vms;
    }

    public Nic vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public Nic vms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS);
        return this;
    }

    public void setVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS);
        }
    }

    public boolean getVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nic nic = (Nic) o;
        return Objects.equals(this.driver, nic.driver)
                && Objects.equals(this.driverState, nic.driverState)
                && Objects.equals(this.entityAsyncStatus, nic.entityAsyncStatus)
                && Objects.equals(this.gatewayIp, nic.gatewayIp)
                && Objects.equals(this.host, nic.host)
                && Objects.equals(this.ibdev, nic.ibdev)
                && Objects.equals(this.id, nic.id)
                && Objects.equals(this.iommuStatus, nic.iommuStatus)
                && Objects.equals(this.ipAddress, nic.ipAddress)
                && Objects.equals(this.isSriov, nic.isSriov)
                && Objects.equals(this.labels, nic.labels)
                && Objects.equals(this.localId, nic.localId)
                && Objects.equals(this.macAddress, nic.macAddress)
                && Objects.equals(this.maxVfNum, nic.maxVfNum)
                && Objects.equals(this.model, nic.model)
                && Objects.equals(this.mtu, nic.mtu)
                && Objects.equals(this.name, nic.name)
                && Objects.equals(this.nicUuid, nic.nicUuid)
                && Objects.equals(this.physical, nic.physical)
                && Objects.equals(this.rdmaEnabled, nic.rdmaEnabled)
                && Objects.equals(this.running, nic.running)
                && Objects.equals(this.speed, nic.speed)
                && Objects.equals(this.subnetMask, nic.subnetMask)
                && Objects.equals(this.totalVfNum, nic.totalVfNum)
                && Objects.equals(this.type, nic.type)
                && Objects.equals(this.up, nic.up)
                && Objects.equals(this.usedVfNum, nic.usedVfNum)
                && Objects.equals(this.userUsage, nic.userUsage)
                && Objects.equals(this.vds, nic.vds)
                && Objects.equals(this.vms, nic.vms);
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
                driver,
                driverState,
                entityAsyncStatus,
                gatewayIp,
                host,
                ibdev,
                id,
                iommuStatus,
                ipAddress,
                isSriov,
                labels,
                localId,
                macAddress,
                maxVfNum,
                model,
                mtu,
                name,
                nicUuid,
                physical,
                rdmaEnabled,
                running,
                speed,
                subnetMask,
                totalVfNum,
                type,
                up,
                usedVfNum,
                userUsage,
                vds,
                vms);
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
        sb.append("class Nic {\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    driverState: ").append(toIndentedString(driverState)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    ibdev: ").append(toIndentedString(ibdev)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iommuStatus: ").append(toIndentedString(iommuStatus)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    isSriov: ").append(toIndentedString(isSriov)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    maxVfNum: ").append(toIndentedString(maxVfNum)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nicUuid: ").append(toIndentedString(nicUuid)).append("\n");
        sb.append("    physical: ").append(toIndentedString(physical)).append("\n");
        sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
        sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    up: ").append(toIndentedString(up)).append("\n");
        sb.append("    usedVfNum: ").append(toIndentedString(usedVfNum)).append("\n");
        sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
        sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GpuDevice */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GpuDevice extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM = "assigned_vgpus_num";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM)
    private Integer assignedVgpusNum;

    public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM = "available_vgpus_num";

    @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM)
    private Integer availableVgpusNum;

    public static final String SERIALIZED_NAME_BRAND = "brand";

    @SerializedName(SERIALIZED_NAME_BRAND)
    private String brand;

    public static final String SERIALIZED_NAME_BUS_LOCATION = "bus_location";

    @SerializedName(SERIALIZED_NAME_BUS_LOCATION)
    private String busLocation;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DRIVER_INFO = "driver_info";

    @SerializedName(SERIALIZED_NAME_DRIVER_INFO)
    private NestedGpuDriverInfo driverInfo;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY = "is_nvidia_tools_ready";

    @SerializedName(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY)
    private Boolean isNvidiaToolsReady;

    public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED = "is_nvidia_vfs_enabled";

    @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED)
    private Boolean isNvidiaVfsEnabled;

    public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED = "is_nvidia_vfs_supported";

    @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED)
    private Boolean isNvidiaVfsSupported;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MDEV_SUPPORTED_TYPES = "mdev_supported_types";

    @SerializedName(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES)
    private List<NestedVgpuType> mdevSupportedTypes = null;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private GpuDeviceStatus status;

    public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";

    @SerializedName(SERIALIZED_NAME_USER_USAGE)
    private GpuDeviceUsage userUsage;

    public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID = "user_vgpu_type_id";

    @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID)
    private String userVgpuTypeId;

    public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME = "user_vgpu_type_name";

    @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME)
    private String userVgpuTypeName;

    public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM = "vgpu_instance_num";

    @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM)
    private Integer vgpuInstanceNum;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public GpuDevice() {}

    public GpuDevice assignedVgpusNum(Integer assignedVgpusNum) {

        this.assignedVgpusNum = assignedVgpusNum;
        return this;
    }

    /**
     * Get assignedVgpusNum
     *
     * @return assignedVgpusNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAssignedVgpusNum() {
        return assignedVgpusNum;
    }

    public void setAssignedVgpusNum(Integer assignedVgpusNum) {
        this.assignedVgpusNum = assignedVgpusNum;
    }

    public GpuDevice assignedVgpusNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM);
        return this;
    }

    public GpuDevice assignedVgpusNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM);
        return this;
    }

    public void setAssignedVgpusNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM);
        }
    }

    public boolean getAssignedVgpusNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM);
    }

    public GpuDevice availableVgpusNum(Integer availableVgpusNum) {

        this.availableVgpusNum = availableVgpusNum;
        return this;
    }

    /**
     * Get availableVgpusNum
     *
     * @return availableVgpusNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAvailableVgpusNum() {
        return availableVgpusNum;
    }

    public void setAvailableVgpusNum(Integer availableVgpusNum) {
        this.availableVgpusNum = availableVgpusNum;
    }

    public GpuDevice availableVgpusNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM);
        return this;
    }

    public GpuDevice availableVgpusNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM);
        return this;
    }

    public void setAvailableVgpusNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM);
        }
    }

    public boolean getAvailableVgpusNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM);
    }

    public GpuDevice brand(String brand) {

        this.brand = brand;
        return this;
    }

    /**
     * Get brand
     *
     * @return brand
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public GpuDevice brand_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRAND);
        return this;
    }

    public GpuDevice brand_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRAND);
        return this;
    }

    public void setBrand_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRAND);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRAND);
        }
    }

    public boolean getBrand_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRAND);
    }

    public GpuDevice busLocation(String busLocation) {

        this.busLocation = busLocation;
        return this;
    }

    /**
     * Get busLocation
     *
     * @return busLocation
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getBusLocation() {
        return busLocation;
    }

    public void setBusLocation(String busLocation) {
        this.busLocation = busLocation;
    }

    public GpuDevice busLocation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS_LOCATION);
        return this;
    }

    public GpuDevice busLocation_ExplictlyNonNull() {
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

    public GpuDevice description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GpuDevice description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public GpuDevice description_ExplictlyNonNull() {
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

    public GpuDevice driverInfo(NestedGpuDriverInfo driverInfo) {

        this.driverInfo = driverInfo;
        return this;
    }

    /**
     * Get driverInfo
     *
     * @return driverInfo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedGpuDriverInfo getDriverInfo() {
        return driverInfo;
    }

    public void setDriverInfo(NestedGpuDriverInfo driverInfo) {
        this.driverInfo = driverInfo;
    }

    public GpuDevice driverInfo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DRIVER_INFO);
        return this;
    }

    public GpuDevice driverInfo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DRIVER_INFO);
        return this;
    }

    public void setDriverInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DRIVER_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DRIVER_INFO);
        }
    }

    public boolean getDriverInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DRIVER_INFO);
    }

    public GpuDevice entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public GpuDevice entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public GpuDevice entityAsyncStatus_ExplictlyNonNull() {
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

    public GpuDevice host(NestedHost host) {

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

    public GpuDevice host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public GpuDevice host_ExplictlyNonNull() {
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

    public GpuDevice id(String id) {

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

    public GpuDevice id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public GpuDevice id_ExplictlyNonNull() {
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

    public GpuDevice isNvidiaToolsReady(Boolean isNvidiaToolsReady) {

        this.isNvidiaToolsReady = isNvidiaToolsReady;
        return this;
    }

    /**
     * Get isNvidiaToolsReady
     *
     * @return isNvidiaToolsReady
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsNvidiaToolsReady() {
        return isNvidiaToolsReady;
    }

    public void setIsNvidiaToolsReady(Boolean isNvidiaToolsReady) {
        this.isNvidiaToolsReady = isNvidiaToolsReady;
    }

    public GpuDevice isNvidiaToolsReady_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY);
        return this;
    }

    public GpuDevice isNvidiaToolsReady_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY);
        return this;
    }

    public void setIsNvidiaToolsReady_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY);
        }
    }

    public boolean getIsNvidiaToolsReady_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY);
    }

    public GpuDevice isNvidiaVfsEnabled(Boolean isNvidiaVfsEnabled) {

        this.isNvidiaVfsEnabled = isNvidiaVfsEnabled;
        return this;
    }

    /**
     * Get isNvidiaVfsEnabled
     *
     * @return isNvidiaVfsEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsNvidiaVfsEnabled() {
        return isNvidiaVfsEnabled;
    }

    public void setIsNvidiaVfsEnabled(Boolean isNvidiaVfsEnabled) {
        this.isNvidiaVfsEnabled = isNvidiaVfsEnabled;
    }

    public GpuDevice isNvidiaVfsEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED);
        return this;
    }

    public GpuDevice isNvidiaVfsEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED);
        return this;
    }

    public void setIsNvidiaVfsEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED);
        }
    }

    public boolean getIsNvidiaVfsEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED);
    }

    public GpuDevice isNvidiaVfsSupported(Boolean isNvidiaVfsSupported) {

        this.isNvidiaVfsSupported = isNvidiaVfsSupported;
        return this;
    }

    /**
     * Get isNvidiaVfsSupported
     *
     * @return isNvidiaVfsSupported
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsNvidiaVfsSupported() {
        return isNvidiaVfsSupported;
    }

    public void setIsNvidiaVfsSupported(Boolean isNvidiaVfsSupported) {
        this.isNvidiaVfsSupported = isNvidiaVfsSupported;
    }

    public GpuDevice isNvidiaVfsSupported_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED);
        return this;
    }

    public GpuDevice isNvidiaVfsSupported_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED);
        return this;
    }

    public void setIsNvidiaVfsSupported_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED);
        }
    }

    public boolean getIsNvidiaVfsSupported_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED);
    }

    public GpuDevice labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public GpuDevice addLabelsItem(NestedLabel labelsItem) {
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

    public GpuDevice labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public GpuDevice labels_ExplictlyNonNull() {
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

    public GpuDevice localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public GpuDevice localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public GpuDevice localCreatedAt_ExplictlyNonNull() {
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

    public GpuDevice localId(String localId) {

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

    public GpuDevice localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public GpuDevice localId_ExplictlyNonNull() {
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

    public GpuDevice mdevSupportedTypes(List<NestedVgpuType> mdevSupportedTypes) {

        this.mdevSupportedTypes = mdevSupportedTypes;
        return this;
    }

    public GpuDevice addMdevSupportedTypesItem(NestedVgpuType mdevSupportedTypesItem) {
        if (this.mdevSupportedTypes == null) {
            this.mdevSupportedTypes = new ArrayList<NestedVgpuType>();
        }
        this.mdevSupportedTypes.add(mdevSupportedTypesItem);
        return this;
    }

    /**
     * Get mdevSupportedTypes
     *
     * @return mdevSupportedTypes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVgpuType> getMdevSupportedTypes() {
        return mdevSupportedTypes;
    }

    public void setMdevSupportedTypes(List<NestedVgpuType> mdevSupportedTypes) {
        this.mdevSupportedTypes = mdevSupportedTypes;
    }

    public GpuDevice mdevSupportedTypes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES);
        return this;
    }

    public GpuDevice mdevSupportedTypes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES);
        return this;
    }

    public void setMdevSupportedTypes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES);
        }
    }

    public boolean getMdevSupportedTypes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES);
    }

    public GpuDevice model(String model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GpuDevice model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public GpuDevice model_ExplictlyNonNull() {
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

    public GpuDevice name(String name) {

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

    public GpuDevice name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public GpuDevice name_ExplictlyNonNull() {
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

    public GpuDevice status(GpuDeviceStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public GpuDeviceStatus getStatus() {
        return status;
    }

    public void setStatus(GpuDeviceStatus status) {
        this.status = status;
    }

    public GpuDevice status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public GpuDevice status_ExplictlyNonNull() {
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

    public GpuDevice userUsage(GpuDeviceUsage userUsage) {

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
    public GpuDeviceUsage getUserUsage() {
        return userUsage;
    }

    public void setUserUsage(GpuDeviceUsage userUsage) {
        this.userUsage = userUsage;
    }

    public GpuDevice userUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_USAGE);
        return this;
    }

    public GpuDevice userUsage_ExplictlyNonNull() {
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

    public GpuDevice userVgpuTypeId(String userVgpuTypeId) {

        this.userVgpuTypeId = userVgpuTypeId;
        return this;
    }

    /**
     * Get userVgpuTypeId
     *
     * @return userVgpuTypeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUserVgpuTypeId() {
        return userVgpuTypeId;
    }

    public void setUserVgpuTypeId(String userVgpuTypeId) {
        this.userVgpuTypeId = userVgpuTypeId;
    }

    public GpuDevice userVgpuTypeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_VGPU_TYPE_ID);
        return this;
    }

    public GpuDevice userVgpuTypeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_VGPU_TYPE_ID);
        return this;
    }

    public void setUserVgpuTypeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_VGPU_TYPE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_VGPU_TYPE_ID);
        }
    }

    public boolean getUserVgpuTypeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_VGPU_TYPE_ID);
    }

    public GpuDevice userVgpuTypeName(String userVgpuTypeName) {

        this.userVgpuTypeName = userVgpuTypeName;
        return this;
    }

    /**
     * Get userVgpuTypeName
     *
     * @return userVgpuTypeName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUserVgpuTypeName() {
        return userVgpuTypeName;
    }

    public void setUserVgpuTypeName(String userVgpuTypeName) {
        this.userVgpuTypeName = userVgpuTypeName;
    }

    public GpuDevice userVgpuTypeName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_VGPU_TYPE_NAME);
        return this;
    }

    public GpuDevice userVgpuTypeName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_VGPU_TYPE_NAME);
        return this;
    }

    public void setUserVgpuTypeName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_VGPU_TYPE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_VGPU_TYPE_NAME);
        }
    }

    public boolean getUserVgpuTypeName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_VGPU_TYPE_NAME);
    }

    public GpuDevice vgpuInstanceNum(Integer vgpuInstanceNum) {

        this.vgpuInstanceNum = vgpuInstanceNum;
        return this;
    }

    /**
     * Get vgpuInstanceNum
     *
     * @return vgpuInstanceNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVgpuInstanceNum() {
        return vgpuInstanceNum;
    }

    public void setVgpuInstanceNum(Integer vgpuInstanceNum) {
        this.vgpuInstanceNum = vgpuInstanceNum;
    }

    public GpuDevice vgpuInstanceNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VGPU_INSTANCE_NUM);
        return this;
    }

    public GpuDevice vgpuInstanceNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VGPU_INSTANCE_NUM);
        return this;
    }

    public void setVgpuInstanceNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VGPU_INSTANCE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VGPU_INSTANCE_NUM);
        }
    }

    public boolean getVgpuInstanceNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VGPU_INSTANCE_NUM);
    }

    public GpuDevice vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public GpuDevice addVmsItem(NestedVm vmsItem) {
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

    public GpuDevice vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public GpuDevice vms_ExplictlyNonNull() {
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
        GpuDevice gpuDevice = (GpuDevice) o;
        return Objects.equals(this.assignedVgpusNum, gpuDevice.assignedVgpusNum)
                && Objects.equals(this.availableVgpusNum, gpuDevice.availableVgpusNum)
                && Objects.equals(this.brand, gpuDevice.brand)
                && Objects.equals(this.busLocation, gpuDevice.busLocation)
                && Objects.equals(this.description, gpuDevice.description)
                && Objects.equals(this.driverInfo, gpuDevice.driverInfo)
                && Objects.equals(this.entityAsyncStatus, gpuDevice.entityAsyncStatus)
                && Objects.equals(this.host, gpuDevice.host)
                && Objects.equals(this.id, gpuDevice.id)
                && Objects.equals(this.isNvidiaToolsReady, gpuDevice.isNvidiaToolsReady)
                && Objects.equals(this.isNvidiaVfsEnabled, gpuDevice.isNvidiaVfsEnabled)
                && Objects.equals(this.isNvidiaVfsSupported, gpuDevice.isNvidiaVfsSupported)
                && Objects.equals(this.labels, gpuDevice.labels)
                && Objects.equals(this.localCreatedAt, gpuDevice.localCreatedAt)
                && Objects.equals(this.localId, gpuDevice.localId)
                && Objects.equals(this.mdevSupportedTypes, gpuDevice.mdevSupportedTypes)
                && Objects.equals(this.model, gpuDevice.model)
                && Objects.equals(this.name, gpuDevice.name)
                && Objects.equals(this.status, gpuDevice.status)
                && Objects.equals(this.userUsage, gpuDevice.userUsage)
                && Objects.equals(this.userVgpuTypeId, gpuDevice.userVgpuTypeId)
                && Objects.equals(this.userVgpuTypeName, gpuDevice.userVgpuTypeName)
                && Objects.equals(this.vgpuInstanceNum, gpuDevice.vgpuInstanceNum)
                && Objects.equals(this.vms, gpuDevice.vms);
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
                assignedVgpusNum,
                availableVgpusNum,
                brand,
                busLocation,
                description,
                driverInfo,
                entityAsyncStatus,
                host,
                id,
                isNvidiaToolsReady,
                isNvidiaVfsEnabled,
                isNvidiaVfsSupported,
                labels,
                localCreatedAt,
                localId,
                mdevSupportedTypes,
                model,
                name,
                status,
                userUsage,
                userVgpuTypeId,
                userVgpuTypeName,
                vgpuInstanceNum,
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
        sb.append("class GpuDevice {\n");
        sb.append("    assignedVgpusNum: ").append(toIndentedString(assignedVgpusNum)).append("\n");
        sb.append("    availableVgpusNum: ")
                .append(toIndentedString(availableVgpusNum))
                .append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    busLocation: ").append(toIndentedString(busLocation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isNvidiaToolsReady: ")
                .append(toIndentedString(isNvidiaToolsReady))
                .append("\n");
        sb.append("    isNvidiaVfsEnabled: ")
                .append(toIndentedString(isNvidiaVfsEnabled))
                .append("\n");
        sb.append("    isNvidiaVfsSupported: ")
                .append(toIndentedString(isNvidiaVfsSupported))
                .append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    mdevSupportedTypes: ")
                .append(toIndentedString(mdevSupportedTypes))
                .append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
        sb.append("    userVgpuTypeId: ").append(toIndentedString(userVgpuTypeId)).append("\n");
        sb.append("    userVgpuTypeName: ").append(toIndentedString(userVgpuTypeName)).append("\n");
        sb.append("    vgpuInstanceNum: ").append(toIndentedString(vgpuInstanceNum)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedFrozenDisks */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedFrozenDisks extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_DISK_NAME = "disk_name";

    @SerializedName(SERIALIZED_NAME_DISK_NAME)
    private String diskName;

    public static final String SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID = "elf_image_local_id";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID)
    private String elfImageLocalId;

    public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
    private String imageName;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private Integer key;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Integer maxIops;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_RESIDENT_IN_CACHE = "resident_in_cache";

    @SerializedName(SERIALIZED_NAME_RESIDENT_IN_CACHE)
    private Boolean residentInCache;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_SNAPSHOT_LOCAL_ID = "snapshot_local_id";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_LOCAL_ID)
    private String snapshotLocalId;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_UUID = "storage_policy_uuid";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_UUID)
    private String storagePolicyUuid;

    public static final String SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID = "svt_image_local_id";

    @SerializedName(SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID)
    private String svtImageLocalId;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmDiskType type;

    public static final String SERIALIZED_NAME_VM_VOLUME_LOCAL_ID = "vm_volume_local_id";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_LOCAL_ID)
    private String vmVolumeLocalId;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID = "vm_volume_snapshot_uuid";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID)
    private String vmVolumeSnapshotUuid;

    public static final String SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID = "vm_volume_template_uuid";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID)
    private String vmVolumeTemplateUuid;

    public NestedFrozenDisks() {}

    public NestedFrozenDisks boot(Integer boot) {

        this.boot = boot;
        return this;
    }

    /**
     * Get boot
     *
     * @return boot
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getBoot() {
        return boot;
    }

    public void setBoot(Integer boot) {
        this.boot = boot;
    }

    public NestedFrozenDisks boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public NestedFrozenDisks boot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        return this;
    }

    public void setBoot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        }
    }

    public boolean getBoot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT);
    }

    public NestedFrozenDisks bus(Bus bus) {

        this.bus = bus;
        return this;
    }

    /**
     * Get bus
     *
     * @return bus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public NestedFrozenDisks bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public NestedFrozenDisks bus_ExplictlyNonNull() {
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

    public NestedFrozenDisks disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public NestedFrozenDisks disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public NestedFrozenDisks disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public NestedFrozenDisks diskName(String diskName) {

        this.diskName = diskName;
        return this;
    }

    /**
     * Get diskName
     *
     * @return diskName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public NestedFrozenDisks diskName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public NestedFrozenDisks diskName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public void setDiskName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_NAME);
        }
    }

    public boolean getDiskName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_NAME);
    }

    public NestedFrozenDisks elfImageLocalId(String elfImageLocalId) {

        this.elfImageLocalId = elfImageLocalId;
        return this;
    }

    /**
     * Get elfImageLocalId
     *
     * @return elfImageLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getElfImageLocalId() {
        return elfImageLocalId;
    }

    public void setElfImageLocalId(String elfImageLocalId) {
        this.elfImageLocalId = elfImageLocalId;
    }

    public NestedFrozenDisks elfImageLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID);
        return this;
    }

    public NestedFrozenDisks elfImageLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID);
        return this;
    }

    public void setElfImageLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID);
        }
    }

    public boolean getElfImageLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_LOCAL_ID);
    }

    public NestedFrozenDisks imageName(String imageName) {

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

    public NestedFrozenDisks imageName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME);
        return this;
    }

    public NestedFrozenDisks imageName_ExplictlyNonNull() {
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

    public NestedFrozenDisks index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public NestedFrozenDisks index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public NestedFrozenDisks index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public NestedFrozenDisks key(Integer key) {

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
    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public NestedFrozenDisks key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public NestedFrozenDisks key_ExplictlyNonNull() {
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

    public NestedFrozenDisks maxBandwidth(Long maxBandwidth) {

        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * Get maxBandwidth
     *
     * @return maxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public NestedFrozenDisks maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public NestedFrozenDisks maxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public void setMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        }
    }

    public boolean getMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH);
    }

    public NestedFrozenDisks maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

        this.maxBandwidthPolicy = maxBandwidthPolicy;
        return this;
    }

    /**
     * Get maxBandwidthPolicy
     *
     * @return maxBandwidthPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicy() {
        return maxBandwidthPolicy;
    }

    public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
        this.maxBandwidthPolicy = maxBandwidthPolicy;
    }

    public NestedFrozenDisks maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public NestedFrozenDisks maxBandwidthPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public void setMaxBandwidthPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        }
    }

    public boolean getMaxBandwidthPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
    }

    public NestedFrozenDisks maxIops(Integer maxIops) {

        this.maxIops = maxIops;
        return this;
    }

    /**
     * Get maxIops
     *
     * @return maxIops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Integer maxIops) {
        this.maxIops = maxIops;
    }

    public NestedFrozenDisks maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public NestedFrozenDisks maxIops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public void setMaxIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        }
    }

    public boolean getMaxIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS);
    }

    public NestedFrozenDisks maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

        this.maxIopsPolicy = maxIopsPolicy;
        return this;
    }

    /**
     * Get maxIopsPolicy
     *
     * @return maxIopsPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicy() {
        return maxIopsPolicy;
    }

    public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
        this.maxIopsPolicy = maxIopsPolicy;
    }

    public NestedFrozenDisks maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public NestedFrozenDisks maxIopsPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public void setMaxIopsPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        }
    }

    public boolean getMaxIopsPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY);
    }

    public NestedFrozenDisks path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public NestedFrozenDisks path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public NestedFrozenDisks path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public NestedFrozenDisks residentInCache(Boolean residentInCache) {

        this.residentInCache = residentInCache;
        return this;
    }

    /**
     * Get residentInCache
     *
     * @return residentInCache
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResidentInCache() {
        return residentInCache;
    }

    public void setResidentInCache(Boolean residentInCache) {
        this.residentInCache = residentInCache;
    }

    public NestedFrozenDisks residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public NestedFrozenDisks residentInCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public void setResidentInCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        }
    }

    public boolean getResidentInCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESIDENT_IN_CACHE);
    }

    public NestedFrozenDisks size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public NestedFrozenDisks size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public NestedFrozenDisks size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public NestedFrozenDisks snapshotLocalId(String snapshotLocalId) {

        this.snapshotLocalId = snapshotLocalId;
        return this;
    }

    /**
     * Get snapshotLocalId
     *
     * @return snapshotLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshotLocalId() {
        return snapshotLocalId;
    }

    public void setSnapshotLocalId(String snapshotLocalId) {
        this.snapshotLocalId = snapshotLocalId;
    }

    public NestedFrozenDisks snapshotLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_LOCAL_ID);
        return this;
    }

    public NestedFrozenDisks snapshotLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_LOCAL_ID);
        return this;
    }

    public void setSnapshotLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_LOCAL_ID);
        }
    }

    public boolean getSnapshotLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_LOCAL_ID);
    }

    public NestedFrozenDisks storagePolicyUuid(String storagePolicyUuid) {

        this.storagePolicyUuid = storagePolicyUuid;
        return this;
    }

    /**
     * Get storagePolicyUuid
     *
     * @return storagePolicyUuid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStoragePolicyUuid() {
        return storagePolicyUuid;
    }

    public void setStoragePolicyUuid(String storagePolicyUuid) {
        this.storagePolicyUuid = storagePolicyUuid;
    }

    public NestedFrozenDisks storagePolicyUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_UUID);
        return this;
    }

    public NestedFrozenDisks storagePolicyUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_UUID);
        return this;
    }

    public void setStoragePolicyUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_UUID);
        }
    }

    public boolean getStoragePolicyUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_UUID);
    }

    public NestedFrozenDisks svtImageLocalId(String svtImageLocalId) {

        this.svtImageLocalId = svtImageLocalId;
        return this;
    }

    /**
     * Get svtImageLocalId
     *
     * @return svtImageLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSvtImageLocalId() {
        return svtImageLocalId;
    }

    public void setSvtImageLocalId(String svtImageLocalId) {
        this.svtImageLocalId = svtImageLocalId;
    }

    public NestedFrozenDisks svtImageLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID);
        return this;
    }

    public NestedFrozenDisks svtImageLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID);
        return this;
    }

    public void setSvtImageLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID);
        }
    }

    public boolean getSvtImageLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SVT_IMAGE_LOCAL_ID);
    }

    public NestedFrozenDisks type(VmDiskType type) {

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
    public VmDiskType getType() {
        return type;
    }

    public void setType(VmDiskType type) {
        this.type = type;
    }

    public NestedFrozenDisks type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedFrozenDisks type_ExplictlyNonNull() {
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

    public NestedFrozenDisks vmVolumeLocalId(String vmVolumeLocalId) {

        this.vmVolumeLocalId = vmVolumeLocalId;
        return this;
    }

    /**
     * Get vmVolumeLocalId
     *
     * @return vmVolumeLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmVolumeLocalId() {
        return vmVolumeLocalId;
    }

    public void setVmVolumeLocalId(String vmVolumeLocalId) {
        this.vmVolumeLocalId = vmVolumeLocalId;
    }

    public NestedFrozenDisks vmVolumeLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_LOCAL_ID);
        return this;
    }

    public NestedFrozenDisks vmVolumeLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_LOCAL_ID);
        return this;
    }

    public void setVmVolumeLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_LOCAL_ID);
        }
    }

    public boolean getVmVolumeLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_LOCAL_ID);
    }

    public NestedFrozenDisks vmVolumeSnapshotUuid(String vmVolumeSnapshotUuid) {

        this.vmVolumeSnapshotUuid = vmVolumeSnapshotUuid;
        return this;
    }

    /**
     * Get vmVolumeSnapshotUuid
     *
     * @return vmVolumeSnapshotUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumeSnapshotUuid() {
        return vmVolumeSnapshotUuid;
    }

    public void setVmVolumeSnapshotUuid(String vmVolumeSnapshotUuid) {
        this.vmVolumeSnapshotUuid = vmVolumeSnapshotUuid;
    }

    public NestedFrozenDisks vmVolumeSnapshotUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID);
        return this;
    }

    public NestedFrozenDisks vmVolumeSnapshotUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID);
        return this;
    }

    public void setVmVolumeSnapshotUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID);
        }
    }

    public boolean getVmVolumeSnapshotUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_UUID);
    }

    public NestedFrozenDisks vmVolumeTemplateUuid(String vmVolumeTemplateUuid) {

        this.vmVolumeTemplateUuid = vmVolumeTemplateUuid;
        return this;
    }

    /**
     * Get vmVolumeTemplateUuid
     *
     * @return vmVolumeTemplateUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumeTemplateUuid() {
        return vmVolumeTemplateUuid;
    }

    public void setVmVolumeTemplateUuid(String vmVolumeTemplateUuid) {
        this.vmVolumeTemplateUuid = vmVolumeTemplateUuid;
    }

    public NestedFrozenDisks vmVolumeTemplateUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID);
        return this;
    }

    public NestedFrozenDisks vmVolumeTemplateUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID);
        return this;
    }

    public void setVmVolumeTemplateUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID);
        }
    }

    public boolean getVmVolumeTemplateUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_UUID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedFrozenDisks nestedFrozenDisks = (NestedFrozenDisks) o;
        return Objects.equals(this.boot, nestedFrozenDisks.boot)
                && Objects.equals(this.bus, nestedFrozenDisks.bus)
                && Objects.equals(this.disabled, nestedFrozenDisks.disabled)
                && Objects.equals(this.diskName, nestedFrozenDisks.diskName)
                && Objects.equals(this.elfImageLocalId, nestedFrozenDisks.elfImageLocalId)
                && Objects.equals(this.imageName, nestedFrozenDisks.imageName)
                && Objects.equals(this.index, nestedFrozenDisks.index)
                && Objects.equals(this.key, nestedFrozenDisks.key)
                && Objects.equals(this.maxBandwidth, nestedFrozenDisks.maxBandwidth)
                && Objects.equals(this.maxBandwidthPolicy, nestedFrozenDisks.maxBandwidthPolicy)
                && Objects.equals(this.maxIops, nestedFrozenDisks.maxIops)
                && Objects.equals(this.maxIopsPolicy, nestedFrozenDisks.maxIopsPolicy)
                && Objects.equals(this.path, nestedFrozenDisks.path)
                && Objects.equals(this.residentInCache, nestedFrozenDisks.residentInCache)
                && Objects.equals(this.size, nestedFrozenDisks.size)
                && Objects.equals(this.snapshotLocalId, nestedFrozenDisks.snapshotLocalId)
                && Objects.equals(this.storagePolicyUuid, nestedFrozenDisks.storagePolicyUuid)
                && Objects.equals(this.svtImageLocalId, nestedFrozenDisks.svtImageLocalId)
                && Objects.equals(this.type, nestedFrozenDisks.type)
                && Objects.equals(this.vmVolumeLocalId, nestedFrozenDisks.vmVolumeLocalId)
                && Objects.equals(this.vmVolumeSnapshotUuid, nestedFrozenDisks.vmVolumeSnapshotUuid)
                && Objects.equals(
                        this.vmVolumeTemplateUuid, nestedFrozenDisks.vmVolumeTemplateUuid);
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
                boot,
                bus,
                disabled,
                diskName,
                elfImageLocalId,
                imageName,
                index,
                key,
                maxBandwidth,
                maxBandwidthPolicy,
                maxIops,
                maxIopsPolicy,
                path,
                residentInCache,
                size,
                snapshotLocalId,
                storagePolicyUuid,
                svtImageLocalId,
                type,
                vmVolumeLocalId,
                vmVolumeSnapshotUuid,
                vmVolumeTemplateUuid);
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
        sb.append("class NestedFrozenDisks {\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
        sb.append("    elfImageLocalId: ").append(toIndentedString(elfImageLocalId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    snapshotLocalId: ").append(toIndentedString(snapshotLocalId)).append("\n");
        sb.append("    storagePolicyUuid: ")
                .append(toIndentedString(storagePolicyUuid))
                .append("\n");
        sb.append("    svtImageLocalId: ").append(toIndentedString(svtImageLocalId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vmVolumeLocalId: ").append(toIndentedString(vmVolumeLocalId)).append("\n");
        sb.append("    vmVolumeSnapshotUuid: ")
                .append(toIndentedString(vmVolumeSnapshotUuid))
                .append("\n");
        sb.append("    vmVolumeTemplateUuid: ")
                .append(toIndentedString(vmVolumeTemplateUuid))
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

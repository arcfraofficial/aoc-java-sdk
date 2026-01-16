package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedContentLibraryVmTemplateDisk */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedContentLibraryVmTemplateDisk
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID =
            "content_library_image_id";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID)
    private String contentLibraryImageId;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_DISK_NAME = "disk_name";

    @SerializedName(SERIALIZED_NAME_DISK_NAME)
    private String diskName;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K = "elf_storage_policy_ec_k";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K)
    private Integer elfStoragePolicyEcK;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M = "elf_storage_policy_ec_m";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M)
    private Integer elfStoragePolicyEcM;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM =
            "elf_storage_policy_replica_num";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM)
    private Integer elfStoragePolicyReplicaNum;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION =
            "elf_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION)
    private Boolean elfStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

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

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "storage_encrypted";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
    private Boolean storageEncrypted;

    public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType storagePolicy;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmDiskType type;

    public NestedContentLibraryVmTemplateDisk() {}

    public NestedContentLibraryVmTemplateDisk boot(Integer boot) {

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

    public NestedContentLibraryVmTemplateDisk boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk boot_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk bus(Bus bus) {

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

    public NestedContentLibraryVmTemplateDisk bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk bus_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk contentLibraryImageId(String contentLibraryImageId) {

        this.contentLibraryImageId = contentLibraryImageId;
        return this;
    }

    /**
     * Get contentLibraryImageId
     *
     * @return contentLibraryImageId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getContentLibraryImageId() {
        return contentLibraryImageId;
    }

    public void setContentLibraryImageId(String contentLibraryImageId) {
        this.contentLibraryImageId = contentLibraryImageId;
    }

    public NestedContentLibraryVmTemplateDisk contentLibraryImageId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk contentLibraryImageId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        return this;
    }

    public void setContentLibraryImageId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        }
    }

    public boolean getContentLibraryImageId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
    }

    public NestedContentLibraryVmTemplateDisk disabled(Boolean disabled) {

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

    public NestedContentLibraryVmTemplateDisk disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk disabled_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk diskName(String diskName) {

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

    public NestedContentLibraryVmTemplateDisk diskName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk diskName_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyEcK(Integer elfStoragePolicyEcK) {

        this.elfStoragePolicyEcK = elfStoragePolicyEcK;
        return this;
    }

    /**
     * Get elfStoragePolicyEcK
     *
     * @return elfStoragePolicyEcK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcK() {
        return elfStoragePolicyEcK;
    }

    public void setElfStoragePolicyEcK(Integer elfStoragePolicyEcK) {
        this.elfStoragePolicyEcK = elfStoragePolicyEcK;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyEcK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        return this;
    }

    public void setElfStoragePolicyEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
        }
    }

    public boolean getElfStoragePolicyEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_K);
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyEcM(Integer elfStoragePolicyEcM) {

        this.elfStoragePolicyEcM = elfStoragePolicyEcM;
        return this;
    }

    /**
     * Get elfStoragePolicyEcM
     *
     * @return elfStoragePolicyEcM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyEcM() {
        return elfStoragePolicyEcM;
    }

    public void setElfStoragePolicyEcM(Integer elfStoragePolicyEcM) {
        this.elfStoragePolicyEcM = elfStoragePolicyEcM;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyEcM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        return this;
    }

    public void setElfStoragePolicyEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
        }
    }

    public boolean getElfStoragePolicyEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_EC_M);
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyReplicaNum(
            Integer elfStoragePolicyReplicaNum) {

        this.elfStoragePolicyReplicaNum = elfStoragePolicyReplicaNum;
        return this;
    }

    /**
     * Get elfStoragePolicyReplicaNum
     *
     * @return elfStoragePolicyReplicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getElfStoragePolicyReplicaNum() {
        return elfStoragePolicyReplicaNum;
    }

    public void setElfStoragePolicyReplicaNum(Integer elfStoragePolicyReplicaNum) {
        this.elfStoragePolicyReplicaNum = elfStoragePolicyReplicaNum;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyReplicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public void setElfStoragePolicyReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
        }
    }

    public boolean getElfStoragePolicyReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_REPLICA_NUM);
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyThinProvision(
            Boolean elfStoragePolicyThinProvision) {

        this.elfStoragePolicyThinProvision = elfStoragePolicyThinProvision;
        return this;
    }

    /**
     * Get elfStoragePolicyThinProvision
     *
     * @return elfStoragePolicyThinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getElfStoragePolicyThinProvision() {
        return elfStoragePolicyThinProvision;
    }

    public void setElfStoragePolicyThinProvision(Boolean elfStoragePolicyThinProvision) {
        this.elfStoragePolicyThinProvision = elfStoragePolicyThinProvision;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk elfStoragePolicyThinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public void setElfStoragePolicyThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
        }
    }

    public boolean getElfStoragePolicyThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_THIN_PROVISION);
    }

    public NestedContentLibraryVmTemplateDisk index(Integer index) {

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

    public NestedContentLibraryVmTemplateDisk index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk index_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk maxBandwidth(Long maxBandwidth) {

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

    public NestedContentLibraryVmTemplateDisk maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk maxBandwidth_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk maxBandwidthPolicy(
            VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public NestedContentLibraryVmTemplateDisk maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk maxBandwidthPolicy_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk maxIops(Integer maxIops) {

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

    public NestedContentLibraryVmTemplateDisk maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk maxIops_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public NestedContentLibraryVmTemplateDisk maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk maxIopsPolicy_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public NestedContentLibraryVmTemplateDisk path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk path_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk residentInCache(Boolean residentInCache) {

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

    public NestedContentLibraryVmTemplateDisk residentInCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESIDENT_IN_CACHE);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk residentInCache_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public NestedContentLibraryVmTemplateDisk size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk size_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateDisk storageEncrypted(Boolean storageEncrypted) {

        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Get storageEncrypted
     *
     * @return storageEncrypted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public NestedContentLibraryVmTemplateDisk storageEncrypted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk storageEncrypted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public void setStorageEncrypted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        }
    }

    public boolean getStorageEncrypted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED);
    }

    public NestedContentLibraryVmTemplateDisk storagePolicy(
            VmVolumeElfStoragePolicyType storagePolicy) {

        this.storagePolicy = storagePolicy;
        return this;
    }

    /**
     * Get storagePolicy
     *
     * @return storagePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicy() {
        return storagePolicy;
    }

    public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
        this.storagePolicy = storagePolicy;
    }

    public NestedContentLibraryVmTemplateDisk storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk storagePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public void setStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        }
    }

    public boolean getStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY);
    }

    public NestedContentLibraryVmTemplateDisk type(VmDiskType type) {

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

    public NestedContentLibraryVmTemplateDisk type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedContentLibraryVmTemplateDisk type_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedContentLibraryVmTemplateDisk nestedContentLibraryVmTemplateDisk =
                (NestedContentLibraryVmTemplateDisk) o;
        return Objects.equals(this.boot, nestedContentLibraryVmTemplateDisk.boot)
                && Objects.equals(this.bus, nestedContentLibraryVmTemplateDisk.bus)
                && Objects.equals(
                        this.contentLibraryImageId,
                        nestedContentLibraryVmTemplateDisk.contentLibraryImageId)
                && Objects.equals(this.disabled, nestedContentLibraryVmTemplateDisk.disabled)
                && Objects.equals(this.diskName, nestedContentLibraryVmTemplateDisk.diskName)
                && Objects.equals(
                        this.elfStoragePolicyEcK,
                        nestedContentLibraryVmTemplateDisk.elfStoragePolicyEcK)
                && Objects.equals(
                        this.elfStoragePolicyEcM,
                        nestedContentLibraryVmTemplateDisk.elfStoragePolicyEcM)
                && Objects.equals(
                        this.elfStoragePolicyReplicaNum,
                        nestedContentLibraryVmTemplateDisk.elfStoragePolicyReplicaNum)
                && Objects.equals(
                        this.elfStoragePolicyThinProvision,
                        nestedContentLibraryVmTemplateDisk.elfStoragePolicyThinProvision)
                && Objects.equals(this.index, nestedContentLibraryVmTemplateDisk.index)
                && Objects.equals(
                        this.maxBandwidth, nestedContentLibraryVmTemplateDisk.maxBandwidth)
                && Objects.equals(
                        this.maxBandwidthPolicy,
                        nestedContentLibraryVmTemplateDisk.maxBandwidthPolicy)
                && Objects.equals(this.maxIops, nestedContentLibraryVmTemplateDisk.maxIops)
                && Objects.equals(
                        this.maxIopsPolicy, nestedContentLibraryVmTemplateDisk.maxIopsPolicy)
                && Objects.equals(this.path, nestedContentLibraryVmTemplateDisk.path)
                && Objects.equals(
                        this.residentInCache, nestedContentLibraryVmTemplateDisk.residentInCache)
                && Objects.equals(this.size, nestedContentLibraryVmTemplateDisk.size)
                && Objects.equals(
                        this.storageEncrypted, nestedContentLibraryVmTemplateDisk.storageEncrypted)
                && Objects.equals(
                        this.storagePolicy, nestedContentLibraryVmTemplateDisk.storagePolicy)
                && Objects.equals(this.type, nestedContentLibraryVmTemplateDisk.type);
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
                contentLibraryImageId,
                disabled,
                diskName,
                elfStoragePolicyEcK,
                elfStoragePolicyEcM,
                elfStoragePolicyReplicaNum,
                elfStoragePolicyThinProvision,
                index,
                maxBandwidth,
                maxBandwidthPolicy,
                maxIops,
                maxIopsPolicy,
                path,
                residentInCache,
                size,
                storageEncrypted,
                storagePolicy,
                type);
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
        sb.append("class NestedContentLibraryVmTemplateDisk {\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    contentLibraryImageId: ")
                .append(toIndentedString(contentLibraryImageId))
                .append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
        sb.append("    elfStoragePolicyEcK: ")
                .append(toIndentedString(elfStoragePolicyEcK))
                .append("\n");
        sb.append("    elfStoragePolicyEcM: ")
                .append(toIndentedString(elfStoragePolicyEcM))
                .append("\n");
        sb.append("    elfStoragePolicyReplicaNum: ")
                .append(toIndentedString(elfStoragePolicyReplicaNum))
                .append("\n");
        sb.append("    elfStoragePolicyThinProvision: ")
                .append(toIndentedString(elfStoragePolicyThinProvision))
                .append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    residentInCache: ").append(toIndentedString(residentInCache)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
        sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

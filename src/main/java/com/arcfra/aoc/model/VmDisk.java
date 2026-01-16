package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmDisk */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDisk extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME = "cloud_init_image_name";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME)
    private String cloudInitImageName;

    public static final String SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH = "cloud_init_image_path";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH)
    private String cloudInitImagePath;

    public static final String SERIALIZED_NAME_DEVICE = "device";

    @SerializedName(SERIALIZED_NAME_DEVICE)
    private String device;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_ELF_IMAGE = "elf_image";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE)
    private NestedElfImage elfImage;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

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

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SVT_IMAGE = "svt_image";

    @SerializedName(SERIALIZED_NAME_SVT_IMAGE)
    private NestedSvtImage svtImage;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmDiskType type;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_PATH = "unsafe_image_path";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_PATH)
    private String unsafeImagePath;

    public static final String SERIALIZED_NAME_UNSAFE_IMAGE_UUID = "unsafe_image_uuid";

    @SerializedName(SERIALIZED_NAME_UNSAFE_IMAGE_UUID)
    private String unsafeImageUuid;

    public static final String SERIALIZED_NAME_UNSAFE_PROVISION = "unsafe_provision";

    @SerializedName(SERIALIZED_NAME_UNSAFE_PROVISION)
    private String unsafeProvision;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME)
    private NestedVmVolume vmVolume;

    public VmDisk() {}

    public VmDisk boot(Integer boot) {

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

    public VmDisk boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public VmDisk boot_ExplictlyNonNull() {
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

    public VmDisk bus(Bus bus) {

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

    public VmDisk bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public VmDisk bus_ExplictlyNonNull() {
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

    public VmDisk cloudInitImageName(String cloudInitImageName) {

        this.cloudInitImageName = cloudInitImageName;
        return this;
    }

    /**
     * Get cloudInitImageName
     *
     * @return cloudInitImageName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImageName() {
        return cloudInitImageName;
    }

    public void setCloudInitImageName(String cloudInitImageName) {
        this.cloudInitImageName = cloudInitImageName;
    }

    public VmDisk cloudInitImageName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        return this;
    }

    public VmDisk cloudInitImageName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        return this;
    }

    public void setCloudInitImageName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
        }
    }

    public boolean getCloudInitImageName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_NAME);
    }

    public VmDisk cloudInitImagePath(String cloudInitImagePath) {

        this.cloudInitImagePath = cloudInitImagePath;
        return this;
    }

    /**
     * Get cloudInitImagePath
     *
     * @return cloudInitImagePath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitImagePath() {
        return cloudInitImagePath;
    }

    public void setCloudInitImagePath(String cloudInitImagePath) {
        this.cloudInitImagePath = cloudInitImagePath;
    }

    public VmDisk cloudInitImagePath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        return this;
    }

    public VmDisk cloudInitImagePath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        return this;
    }

    public void setCloudInitImagePath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
        }
    }

    public boolean getCloudInitImagePath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_IMAGE_PATH);
    }

    public VmDisk device(String device) {

        this.device = device;
        return this;
    }

    /**
     * Get device
     *
     * @return device
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public VmDisk device_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE);
        return this;
    }

    public VmDisk device_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE);
        return this;
    }

    public void setDevice_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE);
        }
    }

    public boolean getDevice_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE);
    }

    public VmDisk disabled(Boolean disabled) {

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

    public VmDisk disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public VmDisk disabled_ExplictlyNonNull() {
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

    public VmDisk elfImage(NestedElfImage elfImage) {

        this.elfImage = elfImage;
        return this;
    }

    /**
     * Get elfImage
     *
     * @return elfImage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedElfImage getElfImage() {
        return elfImage;
    }

    public void setElfImage(NestedElfImage elfImage) {
        this.elfImage = elfImage;
    }

    public VmDisk elfImage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE);
        return this;
    }

    public VmDisk elfImage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE);
        return this;
    }

    public void setElfImage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE);
        }
    }

    public boolean getElfImage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE);
    }

    public VmDisk id(String id) {

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

    public VmDisk id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmDisk id_ExplictlyNonNull() {
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

    public VmDisk key(Integer key) {

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

    public VmDisk key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public VmDisk key_ExplictlyNonNull() {
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

    public VmDisk maxBandwidth(Long maxBandwidth) {

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

    public VmDisk maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmDisk maxBandwidth_ExplictlyNonNull() {
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

    public VmDisk maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public VmDisk maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmDisk maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmDisk maxIops(Integer maxIops) {

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

    public VmDisk maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmDisk maxIops_ExplictlyNonNull() {
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

    public VmDisk maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmDisk maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmDisk maxIopsPolicy_ExplictlyNonNull() {
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

    public VmDisk serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public VmDisk serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public VmDisk serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public VmDisk svtImage(NestedSvtImage svtImage) {

        this.svtImage = svtImage;
        return this;
    }

    /**
     * Get svtImage
     *
     * @return svtImage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedSvtImage getSvtImage() {
        return svtImage;
    }

    public void setSvtImage(NestedSvtImage svtImage) {
        this.svtImage = svtImage;
    }

    public VmDisk svtImage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE);
        return this;
    }

    public VmDisk svtImage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE);
        return this;
    }

    public void setSvtImage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE);
        }
    }

    public boolean getSvtImage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SVT_IMAGE);
    }

    public VmDisk type(VmDiskType type) {

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

    public VmDisk type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmDisk type_ExplictlyNonNull() {
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

    public VmDisk unsafeImagePath(String unsafeImagePath) {

        this.unsafeImagePath = unsafeImagePath;
        return this;
    }

    /**
     * Get unsafeImagePath
     *
     * @return unsafeImagePath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImagePath() {
        return unsafeImagePath;
    }

    public void setUnsafeImagePath(String unsafeImagePath) {
        this.unsafeImagePath = unsafeImagePath;
    }

    public VmDisk unsafeImagePath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        return this;
    }

    public VmDisk unsafeImagePath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        return this;
    }

    public void setUnsafeImagePath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
        }
    }

    public boolean getUnsafeImagePath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_PATH);
    }

    public VmDisk unsafeImageUuid(String unsafeImageUuid) {

        this.unsafeImageUuid = unsafeImageUuid;
        return this;
    }

    /**
     * Get unsafeImageUuid
     *
     * @return unsafeImageUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeImageUuid() {
        return unsafeImageUuid;
    }

    public void setUnsafeImageUuid(String unsafeImageUuid) {
        this.unsafeImageUuid = unsafeImageUuid;
    }

    public VmDisk unsafeImageUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        return this;
    }

    public VmDisk unsafeImageUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        return this;
    }

    public void setUnsafeImageUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
        }
    }

    public boolean getUnsafeImageUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_IMAGE_UUID);
    }

    public VmDisk unsafeProvision(String unsafeProvision) {

        this.unsafeProvision = unsafeProvision;
        return this;
    }

    /**
     * Get unsafeProvision
     *
     * @return unsafeProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUnsafeProvision() {
        return unsafeProvision;
    }

    public void setUnsafeProvision(String unsafeProvision) {
        this.unsafeProvision = unsafeProvision;
    }

    public VmDisk unsafeProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION);
        return this;
    }

    public VmDisk unsafeProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION);
        return this;
    }

    public void setUnsafeProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNSAFE_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNSAFE_PROVISION);
        }
    }

    public boolean getUnsafeProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNSAFE_PROVISION);
    }

    public VmDisk vm(NestedVm vm) {

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

    public VmDisk vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmDisk vm_ExplictlyNonNull() {
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

    public VmDisk vmVolume(NestedVmVolume vmVolume) {

        this.vmVolume = vmVolume;
        return this;
    }

    /**
     * Get vmVolume
     *
     * @return vmVolume
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVmVolume getVmVolume() {
        return vmVolume;
    }

    public void setVmVolume(NestedVmVolume vmVolume) {
        this.vmVolume = vmVolume;
    }

    public VmDisk vmVolume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public VmDisk vmVolume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        return this;
    }

    public void setVmVolume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME);
        }
    }

    public boolean getVmVolume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmDisk vmDisk = (VmDisk) o;
        return Objects.equals(this.boot, vmDisk.boot)
                && Objects.equals(this.bus, vmDisk.bus)
                && Objects.equals(this.cloudInitImageName, vmDisk.cloudInitImageName)
                && Objects.equals(this.cloudInitImagePath, vmDisk.cloudInitImagePath)
                && Objects.equals(this.device, vmDisk.device)
                && Objects.equals(this.disabled, vmDisk.disabled)
                && Objects.equals(this.elfImage, vmDisk.elfImage)
                && Objects.equals(this.id, vmDisk.id)
                && Objects.equals(this.key, vmDisk.key)
                && Objects.equals(this.maxBandwidth, vmDisk.maxBandwidth)
                && Objects.equals(this.maxBandwidthPolicy, vmDisk.maxBandwidthPolicy)
                && Objects.equals(this.maxIops, vmDisk.maxIops)
                && Objects.equals(this.maxIopsPolicy, vmDisk.maxIopsPolicy)
                && Objects.equals(this.serial, vmDisk.serial)
                && Objects.equals(this.svtImage, vmDisk.svtImage)
                && Objects.equals(this.type, vmDisk.type)
                && Objects.equals(this.unsafeImagePath, vmDisk.unsafeImagePath)
                && Objects.equals(this.unsafeImageUuid, vmDisk.unsafeImageUuid)
                && Objects.equals(this.unsafeProvision, vmDisk.unsafeProvision)
                && Objects.equals(this.vm, vmDisk.vm)
                && Objects.equals(this.vmVolume, vmDisk.vmVolume);
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
                cloudInitImageName,
                cloudInitImagePath,
                device,
                disabled,
                elfImage,
                id,
                key,
                maxBandwidth,
                maxBandwidthPolicy,
                maxIops,
                maxIopsPolicy,
                serial,
                svtImage,
                type,
                unsafeImagePath,
                unsafeImageUuid,
                unsafeProvision,
                vm,
                vmVolume);
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
        sb.append("class VmDisk {\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    cloudInitImageName: ")
                .append(toIndentedString(cloudInitImageName))
                .append("\n");
        sb.append("    cloudInitImagePath: ")
                .append(toIndentedString(cloudInitImagePath))
                .append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    elfImage: ").append(toIndentedString(elfImage)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    svtImage: ").append(toIndentedString(svtImage)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unsafeImagePath: ").append(toIndentedString(unsafeImagePath)).append("\n");
        sb.append("    unsafeImageUuid: ").append(toIndentedString(unsafeImageUuid)).append("\n");
        sb.append("    unsafeProvision: ").append(toIndentedString(unsafeProvision)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
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

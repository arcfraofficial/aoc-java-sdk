package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVmTemplateConfigDisk */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVmTemplateConfigDisk
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_DISK_NAME = "disk_name";

    @SerializedName(SERIALIZED_NAME_DISK_NAME)
    private String diskName;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmDiskType type;

    public static final String SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE =
            "vm_volume_template_config_file";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE)
    private NestedVmVolumeTemplateConfigFile vmVolumeTemplateConfigFile;

    public static final String SERIALIZED_NAME_VOLUME_STORAGE_TYPE = "volume_storage_type";

    @SerializedName(SERIALIZED_NAME_VOLUME_STORAGE_TYPE)
    private VmTemplateConfigDiskVolumeStorageType volumeStorageType;

    public NestedVmTemplateConfigDisk() {}

    public NestedVmTemplateConfigDisk boot(Integer boot) {

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

    public NestedVmTemplateConfigDisk boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public NestedVmTemplateConfigDisk boot_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk bus(Bus bus) {

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

    public NestedVmTemplateConfigDisk bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public NestedVmTemplateConfigDisk bus_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk diskName(String diskName) {

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

    public NestedVmTemplateConfigDisk diskName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_NAME);
        return this;
    }

    public NestedVmTemplateConfigDisk diskName_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk id(String id) {

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

    public NestedVmTemplateConfigDisk id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVmTemplateConfigDisk id_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk index(Integer index) {

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

    public NestedVmTemplateConfigDisk index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public NestedVmTemplateConfigDisk index_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk size(Long size) {

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

    public NestedVmTemplateConfigDisk size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public NestedVmTemplateConfigDisk size_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk type(VmDiskType type) {

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

    public NestedVmTemplateConfigDisk type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedVmTemplateConfigDisk type_ExplictlyNonNull() {
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

    public NestedVmTemplateConfigDisk vmVolumeTemplateConfigFile(
            NestedVmVolumeTemplateConfigFile vmVolumeTemplateConfigFile) {

        this.vmVolumeTemplateConfigFile = vmVolumeTemplateConfigFile;
        return this;
    }

    /**
     * Get vmVolumeTemplateConfigFile
     *
     * @return vmVolumeTemplateConfigFile
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVmVolumeTemplateConfigFile getVmVolumeTemplateConfigFile() {
        return vmVolumeTemplateConfigFile;
    }

    public void setVmVolumeTemplateConfigFile(
            NestedVmVolumeTemplateConfigFile vmVolumeTemplateConfigFile) {
        this.vmVolumeTemplateConfigFile = vmVolumeTemplateConfigFile;
    }

    public NestedVmTemplateConfigDisk vmVolumeTemplateConfigFile_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        return this;
    }

    public NestedVmTemplateConfigDisk vmVolumeTemplateConfigFile_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        return this;
    }

    public void setVmVolumeTemplateConfigFile_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
        }
    }

    public boolean getVmVolumeTemplateConfigFile_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_TEMPLATE_CONFIG_FILE);
    }

    public NestedVmTemplateConfigDisk volumeStorageType(
            VmTemplateConfigDiskVolumeStorageType volumeStorageType) {

        this.volumeStorageType = volumeStorageType;
        return this;
    }

    /**
     * Get volumeStorageType
     *
     * @return volumeStorageType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmTemplateConfigDiskVolumeStorageType getVolumeStorageType() {
        return volumeStorageType;
    }

    public void setVolumeStorageType(VmTemplateConfigDiskVolumeStorageType volumeStorageType) {
        this.volumeStorageType = volumeStorageType;
    }

    public NestedVmTemplateConfigDisk volumeStorageType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        return this;
    }

    public NestedVmTemplateConfigDisk volumeStorageType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        return this;
    }

    public void setVolumeStorageType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
        }
    }

    public boolean getVolumeStorageType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_STORAGE_TYPE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVmTemplateConfigDisk nestedVmTemplateConfigDisk = (NestedVmTemplateConfigDisk) o;
        return Objects.equals(this.boot, nestedVmTemplateConfigDisk.boot)
                && Objects.equals(this.bus, nestedVmTemplateConfigDisk.bus)
                && Objects.equals(this.diskName, nestedVmTemplateConfigDisk.diskName)
                && Objects.equals(this.id, nestedVmTemplateConfigDisk.id)
                && Objects.equals(this.index, nestedVmTemplateConfigDisk.index)
                && Objects.equals(this.size, nestedVmTemplateConfigDisk.size)
                && Objects.equals(this.type, nestedVmTemplateConfigDisk.type)
                && Objects.equals(
                        this.vmVolumeTemplateConfigFile,
                        nestedVmTemplateConfigDisk.vmVolumeTemplateConfigFile)
                && Objects.equals(
                        this.volumeStorageType, nestedVmTemplateConfigDisk.volumeStorageType);
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
                diskName,
                id,
                index,
                size,
                type,
                vmVolumeTemplateConfigFile,
                volumeStorageType);
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
        sb.append("class NestedVmTemplateConfigDisk {\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vmVolumeTemplateConfigFile: ")
                .append(toIndentedString(vmVolumeTemplateConfigFile))
                .append("\n");
        sb.append("    volumeStorageType: ")
                .append(toIndentedString(volumeStorageType))
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

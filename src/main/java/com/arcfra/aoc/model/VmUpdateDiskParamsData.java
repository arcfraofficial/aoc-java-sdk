package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmUpdateDiskParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateDiskParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID =
            "content_library_image_id";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID)
    private String contentLibraryImageId;

    public static final String SERIALIZED_NAME_ELF_IMAGE_ID = "elf_image_id";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_ID)
    private String elfImageId;

    public static final String SERIALIZED_NAME_VM_VOLUME_ID = "vm_volume_id";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_ID)
    private String vmVolumeId;

    public static final String SERIALIZED_NAME_VM_DISK_ID = "vm_disk_id";

    @SerializedName(SERIALIZED_NAME_VM_DISK_ID)
    private String vmDiskId;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public VmUpdateDiskParamsData() {}

    public VmUpdateDiskParamsData contentLibraryImageId(String contentLibraryImageId) {

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

    public VmUpdateDiskParamsData contentLibraryImageId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        return this;
    }

    public VmUpdateDiskParamsData contentLibraryImageId_ExplictlyNonNull() {
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

    public VmUpdateDiskParamsData elfImageId(String elfImageId) {

        this.elfImageId = elfImageId;
        return this;
    }

    /**
     * Get elfImageId
     *
     * @return elfImageId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getElfImageId() {
        return elfImageId;
    }

    public void setElfImageId(String elfImageId) {
        this.elfImageId = elfImageId;
    }

    public VmUpdateDiskParamsData elfImageId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_ID);
        return this;
    }

    public VmUpdateDiskParamsData elfImageId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_ID);
        return this;
    }

    public void setElfImageId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_ID);
        }
    }

    public boolean getElfImageId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_ID);
    }

    public VmUpdateDiskParamsData vmVolumeId(String vmVolumeId) {

        this.vmVolumeId = vmVolumeId;
        return this;
    }

    /**
     * Get vmVolumeId
     *
     * @return vmVolumeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumeId() {
        return vmVolumeId;
    }

    public void setVmVolumeId(String vmVolumeId) {
        this.vmVolumeId = vmVolumeId;
    }

    public VmUpdateDiskParamsData vmVolumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_ID);
        return this;
    }

    public VmUpdateDiskParamsData vmVolumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_ID);
        return this;
    }

    public void setVmVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_ID);
        }
    }

    public boolean getVmVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_ID);
    }

    public VmUpdateDiskParamsData vmDiskId(String vmDiskId) {

        this.vmDiskId = vmDiskId;
        return this;
    }

    /**
     * Get vmDiskId
     *
     * @return vmDiskId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmDiskId() {
        return vmDiskId;
    }

    public void setVmDiskId(String vmDiskId) {
        this.vmDiskId = vmDiskId;
    }

    public VmUpdateDiskParamsData vmDiskId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISK_ID);
        return this;
    }

    public VmUpdateDiskParamsData vmDiskId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISK_ID);
        return this;
    }

    public void setVmDiskId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISK_ID);
        }
    }

    public boolean getVmDiskId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISK_ID);
    }

    public VmUpdateDiskParamsData bus(Bus bus) {

        this.bus = bus;
        return this;
    }

    /**
     * Get bus
     *
     * @return bus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public VmUpdateDiskParamsData bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public VmUpdateDiskParamsData bus_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateDiskParamsData vmUpdateDiskParamsData = (VmUpdateDiskParamsData) o;
        return Objects.equals(
                        this.contentLibraryImageId, vmUpdateDiskParamsData.contentLibraryImageId)
                && Objects.equals(this.elfImageId, vmUpdateDiskParamsData.elfImageId)
                && Objects.equals(this.vmVolumeId, vmUpdateDiskParamsData.vmVolumeId)
                && Objects.equals(this.vmDiskId, vmUpdateDiskParamsData.vmDiskId)
                && Objects.equals(this.bus, vmUpdateDiskParamsData.bus);
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
        return Objects.hash(contentLibraryImageId, elfImageId, vmVolumeId, vmDiskId, bus);
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
        sb.append("class VmUpdateDiskParamsData {\n");
        sb.append("    contentLibraryImageId: ")
                .append(toIndentedString(contentLibraryImageId))
                .append("\n");
        sb.append("    elfImageId: ").append(toIndentedString(elfImageId)).append("\n");
        sb.append("    vmVolumeId: ").append(toIndentedString(vmVolumeId)).append("\n");
        sb.append("    vmDiskId: ").append(toIndentedString(vmDiskId)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
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

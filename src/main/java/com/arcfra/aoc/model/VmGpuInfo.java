package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmGpuInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmGpuInfo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
    private List<VmGpuDetail> gpuDevices = new ArrayList<VmGpuDetail>();

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public VmGpuInfo() {}

    public VmGpuInfo gpuDevices(List<VmGpuDetail> gpuDevices) {

        this.gpuDevices = gpuDevices;
        return this;
    }

    public VmGpuInfo addGpuDevicesItem(VmGpuDetail gpuDevicesItem) {
        this.gpuDevices.add(gpuDevicesItem);
        return this;
    }

    /**
     * Get gpuDevices
     *
     * @return gpuDevices
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VmGpuDetail> getGpuDevices() {
        return gpuDevices;
    }

    public void setGpuDevices(List<VmGpuDetail> gpuDevices) {
        this.gpuDevices = gpuDevices;
    }

    public VmGpuInfo gpuDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public VmGpuInfo gpuDevices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public void setGpuDevices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES);
        }
    }

    public boolean getGpuDevices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICES);
    }

    public VmGpuInfo name(String name) {

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

    public VmGpuInfo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmGpuInfo name_ExplictlyNonNull() {
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

    public VmGpuInfo localId(String localId) {

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

    public VmGpuInfo localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmGpuInfo localId_ExplictlyNonNull() {
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

    public VmGpuInfo id(String id) {

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

    public VmGpuInfo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmGpuInfo id_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmGpuInfo vmGpuInfo = (VmGpuInfo) o;
        return Objects.equals(this.gpuDevices, vmGpuInfo.gpuDevices)
                && Objects.equals(this.name, vmGpuInfo.name)
                && Objects.equals(this.localId, vmGpuInfo.localId)
                && Objects.equals(this.id, vmGpuInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpuDevices, name, localId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmGpuInfo {\n");
        sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

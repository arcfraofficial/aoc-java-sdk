package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmTemplateCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmTemplateCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
    private Boolean cloudInitSupported;

    public static final String SERIALIZED_NAME_VM_ID = "vm_id";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VmTemplateCreationParams() {}

    public VmTemplateCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VmTemplateCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VmTemplateCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public VmTemplateCreationParams cloudInitSupported(Boolean cloudInitSupported) {

        this.cloudInitSupported = cloudInitSupported;
        return this;
    }

    /**
     * Get cloudInitSupported
     *
     * @return cloudInitSupported
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getCloudInitSupported() {
        return cloudInitSupported;
    }

    public void setCloudInitSupported(Boolean cloudInitSupported) {
        this.cloudInitSupported = cloudInitSupported;
    }

    public VmTemplateCreationParams cloudInitSupported_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public VmTemplateCreationParams cloudInitSupported_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public void setCloudInitSupported_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        }
    }

    public boolean getCloudInitSupported_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
    }

    public VmTemplateCreationParams vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * Get vmId
     *
     * @return vmId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public VmTemplateCreationParams vmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public VmTemplateCreationParams vmId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public void setVmId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        }
    }

    public boolean getVmId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_ID);
    }

    public VmTemplateCreationParams description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VmTemplateCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmTemplateCreationParams description_ExplictlyNonNull() {
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

    public VmTemplateCreationParams name(String name) {

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

    public VmTemplateCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmTemplateCreationParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmTemplateCreationParams vmTemplateCreationParams = (VmTemplateCreationParams) o;
        return Objects.equals(this.clusterId, vmTemplateCreationParams.clusterId)
                && Objects.equals(
                        this.cloudInitSupported, vmTemplateCreationParams.cloudInitSupported)
                && Objects.equals(this.vmId, vmTemplateCreationParams.vmId)
                && Objects.equals(this.description, vmTemplateCreationParams.description)
                && Objects.equals(this.name, vmTemplateCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, cloudInitSupported, vmId, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmTemplateCreationParams {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    cloudInitSupported: ")
                .append(toIndentedString(cloudInitSupported))
                .append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

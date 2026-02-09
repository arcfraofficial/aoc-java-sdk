package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmCreateVmFromContentLibraryTemplateBatchParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmCreateVmFromContentLibraryTemplateBatchParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<VmCreateVmFromContentLibraryTemplateBatchVmParams> vms =
            new ArrayList<VmCreateVmFromContentLibraryTemplateBatchVmParams>();

    public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";

    @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
    private String templateId;

    public VmCreateVmFromContentLibraryTemplateBatchParams() {}

    public VmCreateVmFromContentLibraryTemplateBatchParams vms(
            List<VmCreateVmFromContentLibraryTemplateBatchVmParams> vms) {

        this.vms = vms;
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchParams addVmsItem(
            VmCreateVmFromContentLibraryTemplateBatchVmParams vmsItem) {
        this.vms.add(vmsItem);
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VmCreateVmFromContentLibraryTemplateBatchVmParams> getVms() {
        return vms;
    }

    public void setVms(List<VmCreateVmFromContentLibraryTemplateBatchVmParams> vms) {
        this.vms = vms;
    }

    public VmCreateVmFromContentLibraryTemplateBatchParams vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchParams vms_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchParams templateId(String templateId) {

        this.templateId = templateId;
        return this;
    }

    /**
     * Get templateId
     *
     * @return templateId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public VmCreateVmFromContentLibraryTemplateBatchParams templateId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TEMPLATE_ID);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchParams templateId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TEMPLATE_ID);
        return this;
    }

    public void setTemplateId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TEMPLATE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TEMPLATE_ID);
        }
    }

    public boolean getTemplateId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TEMPLATE_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmCreateVmFromContentLibraryTemplateBatchParams
                vmCreateVmFromContentLibraryTemplateBatchParams =
                        (VmCreateVmFromContentLibraryTemplateBatchParams) o;
        return Objects.equals(this.vms, vmCreateVmFromContentLibraryTemplateBatchParams.vms)
                && Objects.equals(
                        this.templateId,
                        vmCreateVmFromContentLibraryTemplateBatchParams.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vms, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmCreateVmFromContentLibraryTemplateBatchParams {\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

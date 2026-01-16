package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmRemoveNicByWhereParamsEffect */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveNicByWhereParamsEffect
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_IDS = "vm_ids";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = null;

    public VmRemoveNicByWhereParamsEffect() {}

    public VmRemoveNicByWhereParamsEffect vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public VmRemoveNicByWhereParamsEffect addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<String>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * Get vmIds
     *
     * @return vmIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    public VmRemoveNicByWhereParamsEffect vmIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public VmRemoveNicByWhereParamsEffect vmIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public void setVmIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_IDS);
        }
    }

    public boolean getVmIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_IDS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmRemoveNicByWhereParamsEffect vmRemoveNicByWhereParamsEffect =
                (VmRemoveNicByWhereParamsEffect) o;
        return Objects.equals(this.vmIds, vmRemoveNicByWhereParamsEffect.vmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmRemoveNicByWhereParamsEffect {\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
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

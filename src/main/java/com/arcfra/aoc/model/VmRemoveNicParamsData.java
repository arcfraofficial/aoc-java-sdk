package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmRemoveNicParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveNicParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NIC_INDEX = "nic_index";

    @SerializedName(SERIALIZED_NAME_NIC_INDEX)
    private List<Integer> nicIndex = new ArrayList<Integer>();

    public VmRemoveNicParamsData() {}

    public VmRemoveNicParamsData nicIndex(List<Integer> nicIndex) {

        this.nicIndex = nicIndex;
        return this;
    }

    public VmRemoveNicParamsData addNicIndexItem(Integer nicIndexItem) {
        this.nicIndex.add(nicIndexItem);
        return this;
    }

    /**
     * Get nicIndex
     *
     * @return nicIndex
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<Integer> getNicIndex() {
        return nicIndex;
    }

    public void setNicIndex(List<Integer> nicIndex) {
        this.nicIndex = nicIndex;
    }

    public VmRemoveNicParamsData nicIndex_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_INDEX);
        return this;
    }

    public VmRemoveNicParamsData nicIndex_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_INDEX);
        return this;
    }

    public void setNicIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_INDEX);
        }
    }

    public boolean getNicIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_INDEX);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmRemoveNicParamsData vmRemoveNicParamsData = (VmRemoveNicParamsData) o;
        return Objects.equals(this.nicIndex, vmRemoveNicParamsData.nicIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmRemoveNicParamsData {\n");
        sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
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

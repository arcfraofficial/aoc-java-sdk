package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmEntityFilterResult */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmEntityFilterResult
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTITY_FILTER = "entityFilter";

    @SerializedName(SERIALIZED_NAME_ENTITY_FILTER)
    private NestedEntityFilter entityFilter;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_RESULT = "result";

    @SerializedName(SERIALIZED_NAME_RESULT)
    private List<Double> result = new ArrayList<Double>();

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public VmEntityFilterResult() {}

    public VmEntityFilterResult entityFilter(NestedEntityFilter entityFilter) {

        this.entityFilter = entityFilter;
        return this;
    }

    /**
     * Get entityFilter
     *
     * @return entityFilter
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedEntityFilter getEntityFilter() {
        return entityFilter;
    }

    public void setEntityFilter(NestedEntityFilter entityFilter) {
        this.entityFilter = entityFilter;
    }

    public VmEntityFilterResult entityFilter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_FILTER);
        return this;
    }

    public VmEntityFilterResult entityFilter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_FILTER);
        return this;
    }

    public void setEntityFilter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_FILTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_FILTER);
        }
    }

    public boolean getEntityFilter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_FILTER);
    }

    public VmEntityFilterResult id(String id) {

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

    public VmEntityFilterResult id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmEntityFilterResult id_ExplictlyNonNull() {
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

    public VmEntityFilterResult result(List<Double> result) {

        this.result = result;
        return this;
    }

    public VmEntityFilterResult addResultItem(Double resultItem) {
        this.result.add(resultItem);
        return this;
    }

    /**
     * Get result
     *
     * @return result
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<Double> getResult() {
        return result;
    }

    public void setResult(List<Double> result) {
        this.result = result;
    }

    public VmEntityFilterResult result_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT);
        return this;
    }

    public VmEntityFilterResult result_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        return this;
    }

    public void setResult_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        }
    }

    public boolean getResult_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT);
    }

    public VmEntityFilterResult vm(NestedVm vm) {

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

    public VmEntityFilterResult vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmEntityFilterResult vm_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmEntityFilterResult vmEntityFilterResult = (VmEntityFilterResult) o;
        return Objects.equals(this.entityFilter, vmEntityFilterResult.entityFilter)
                && Objects.equals(this.id, vmEntityFilterResult.id)
                && Objects.equals(this.result, vmEntityFilterResult.result)
                && Objects.equals(this.vm, vmEntityFilterResult.vm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityFilter, id, result, vm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmEntityFilterResult {\n");
        sb.append("    entityFilter: ").append(toIndentedString(entityFilter)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVirtualPrivateCloudIsolationPolicy */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudIsolationPolicy
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public NestedVirtualPrivateCloudIsolationPolicy() {}

    public NestedVirtualPrivateCloudIsolationPolicy id(String id) {

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

    public NestedVirtualPrivateCloudIsolationPolicy id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudIsolationPolicy id_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudIsolationPolicy vm(NestedVm vm) {

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

    public NestedVirtualPrivateCloudIsolationPolicy vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public NestedVirtualPrivateCloudIsolationPolicy vm_ExplictlyNonNull() {
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
        NestedVirtualPrivateCloudIsolationPolicy nestedVirtualPrivateCloudIsolationPolicy =
                (NestedVirtualPrivateCloudIsolationPolicy) o;
        return Objects.equals(this.id, nestedVirtualPrivateCloudIsolationPolicy.id)
                && Objects.equals(this.vm, nestedVirtualPrivateCloudIsolationPolicy.vm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVirtualPrivateCloudIsolationPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmFolderUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmFolderUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";

    @SerializedName(SERIALIZED_NAME_PARENT_ID)
    private String parentId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VmFolderUpdationParamsData() {}

    public VmFolderUpdationParamsData parentId(String parentId) {

        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     *
     * @return parentId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public VmFolderUpdationParamsData parentId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_ID);
        return this;
    }

    public VmFolderUpdationParamsData parentId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID);
        return this;
    }

    public void setParentId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_ID);
        }
    }

    public boolean getParentId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_ID);
    }

    public VmFolderUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VmFolderUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmFolderUpdationParamsData name_ExplictlyNonNull() {
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
        VmFolderUpdationParamsData vmFolderUpdationParamsData = (VmFolderUpdationParamsData) o;
        return Objects.equals(this.parentId, vmFolderUpdationParamsData.parentId)
                && Objects.equals(this.name, vmFolderUpdationParamsData.name);
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
        return Objects.hash(parentId, name);
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
        sb.append("class VmFolderUpdationParamsData {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

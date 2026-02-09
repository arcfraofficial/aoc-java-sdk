package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** UpdateAccessRestrictionParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdateAccessRestrictionParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACCESS_LIST = "access_list";

    @SerializedName(SERIALIZED_NAME_ACCESS_LIST)
    private List<String> accessList = new ArrayList<String>();

    public static final String SERIALIZED_NAME_ACCESS_MODE = "access_mode";

    @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
    private AccessMode accessMode;

    public UpdateAccessRestrictionParams() {}

    public UpdateAccessRestrictionParams accessList(List<String> accessList) {

        this.accessList = accessList;
        return this;
    }

    public UpdateAccessRestrictionParams addAccessListItem(String accessListItem) {
        this.accessList.add(accessListItem);
        return this;
    }

    /**
     * Get accessList
     *
     * @return accessList
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<String> accessList) {
        this.accessList = accessList;
    }

    public UpdateAccessRestrictionParams accessList_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACCESS_LIST);
        return this;
    }

    public UpdateAccessRestrictionParams accessList_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACCESS_LIST);
        return this;
    }

    public void setAccessList_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACCESS_LIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACCESS_LIST);
        }
    }

    public boolean getAccessList_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACCESS_LIST);
    }

    public UpdateAccessRestrictionParams accessMode(AccessMode accessMode) {

        this.accessMode = accessMode;
        return this;
    }

    /**
     * Get accessMode
     *
     * @return accessMode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public AccessMode getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessMode accessMode) {
        this.accessMode = accessMode;
    }

    public UpdateAccessRestrictionParams accessMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACCESS_MODE);
        return this;
    }

    public UpdateAccessRestrictionParams accessMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACCESS_MODE);
        return this;
    }

    public void setAccessMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACCESS_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACCESS_MODE);
        }
    }

    public boolean getAccessMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACCESS_MODE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAccessRestrictionParams updateAccessRestrictionParams =
                (UpdateAccessRestrictionParams) o;
        return Objects.equals(this.accessList, updateAccessRestrictionParams.accessList)
                && Objects.equals(this.accessMode, updateAccessRestrictionParams.accessMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessList, accessMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessRestrictionParams {\n");
        sb.append("    accessList: ").append(toIndentedString(accessList)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunDeletionParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunDeletionParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMOVE_SNAPSHOT = "remove_snapshot";

    @SerializedName(SERIALIZED_NAME_REMOVE_SNAPSHOT)
    private Boolean removeSnapshot;

    public IscsiLunDeletionParamsData() {}

    public IscsiLunDeletionParamsData removeSnapshot(Boolean removeSnapshot) {

        this.removeSnapshot = removeSnapshot;
        return this;
    }

    /**
     * Get removeSnapshot
     *
     * @return removeSnapshot
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getRemoveSnapshot() {
        return removeSnapshot;
    }

    public void setRemoveSnapshot(Boolean removeSnapshot) {
        this.removeSnapshot = removeSnapshot;
    }

    public IscsiLunDeletionParamsData removeSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMOVE_SNAPSHOT);
        return this;
    }

    public IscsiLunDeletionParamsData removeSnapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMOVE_SNAPSHOT);
        return this;
    }

    public void setRemoveSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMOVE_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMOVE_SNAPSHOT);
        }
    }

    public boolean getRemoveSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMOVE_SNAPSHOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiLunDeletionParamsData iscsiLunDeletionParamsData = (IscsiLunDeletionParamsData) o;
        return Objects.equals(this.removeSnapshot, iscsiLunDeletionParamsData.removeSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunDeletionParamsData {\n");
        sb.append("    removeSnapshot: ").append(toIndentedString(removeSnapshot)).append("\n");
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

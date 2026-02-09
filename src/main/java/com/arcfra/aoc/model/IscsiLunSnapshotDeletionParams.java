package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IscsiLunSnapshotDeletionParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunSnapshotDeletionParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private IscsiLunSnapshotWhereInput where;

    public IscsiLunSnapshotDeletionParams() {}

    public IscsiLunSnapshotDeletionParams where(IscsiLunSnapshotWhereInput where) {

        this.where = where;
        return this;
    }

    /**
     * Get where
     *
     * @return where
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public IscsiLunSnapshotWhereInput getWhere() {
        return where;
    }

    public void setWhere(IscsiLunSnapshotWhereInput where) {
        this.where = where;
    }

    public IscsiLunSnapshotDeletionParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public IscsiLunSnapshotDeletionParams where_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        return this;
    }

    public void setWhere_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WHERE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        }
    }

    public boolean getWhere_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WHERE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams =
                (IscsiLunSnapshotDeletionParams) o;
        return Objects.equals(this.where, iscsiLunSnapshotDeletionParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IscsiLunSnapshotDeletionParams {\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

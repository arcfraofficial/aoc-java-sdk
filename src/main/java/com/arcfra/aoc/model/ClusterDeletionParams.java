package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterDeletionParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterDeletionParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FORCE = "force";

    @SerializedName(SERIALIZED_NAME_FORCE)
    private Boolean force;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private ClusterWhereInput where;

    public ClusterDeletionParams() {}

    public ClusterDeletionParams force(Boolean force) {

        this.force = force;
        return this;
    }

    /**
     * Get force
     *
     * @return force
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public ClusterDeletionParams force_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FORCE);
        return this;
    }

    public ClusterDeletionParams force_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FORCE);
        return this;
    }

    public void setForce_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FORCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FORCE);
        }
    }

    public boolean getForce_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FORCE);
    }

    public ClusterDeletionParams where(ClusterWhereInput where) {

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
    public ClusterWhereInput getWhere() {
        return where;
    }

    public void setWhere(ClusterWhereInput where) {
        this.where = where;
    }

    public ClusterDeletionParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ClusterDeletionParams where_ExplictlyNonNull() {
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
        ClusterDeletionParams clusterDeletionParams = (ClusterDeletionParams) o;
        return Objects.equals(this.force, clusterDeletionParams.force)
                && Objects.equals(this.where, clusterDeletionParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(force, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDeletionParams {\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

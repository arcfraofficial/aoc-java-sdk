package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterEnableIscsiUpdationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterEnableIscsiUpdationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLE_ISCSI = "enable_iscsi";

    @SerializedName(SERIALIZED_NAME_ENABLE_ISCSI)
    private Boolean enableIscsi;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private ClusterWhereInput where;

    public ClusterEnableIscsiUpdationParams() {}

    public ClusterEnableIscsiUpdationParams enableIscsi(Boolean enableIscsi) {

        this.enableIscsi = enableIscsi;
        return this;
    }

    /**
     * Get enableIscsi
     *
     * @return enableIscsi
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnableIscsi() {
        return enableIscsi;
    }

    public void setEnableIscsi(Boolean enableIscsi) {
        this.enableIscsi = enableIscsi;
    }

    public ClusterEnableIscsiUpdationParams enableIscsi_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_ISCSI);
        return this;
    }

    public ClusterEnableIscsiUpdationParams enableIscsi_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_ISCSI);
        return this;
    }

    public void setEnableIscsi_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_ISCSI);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_ISCSI);
        }
    }

    public boolean getEnableIscsi_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_ISCSI);
    }

    public ClusterEnableIscsiUpdationParams where(ClusterWhereInput where) {

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

    public ClusterEnableIscsiUpdationParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ClusterEnableIscsiUpdationParams where_ExplictlyNonNull() {
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
        ClusterEnableIscsiUpdationParams clusterEnableIscsiUpdationParams =
                (ClusterEnableIscsiUpdationParams) o;
        return Objects.equals(this.enableIscsi, clusterEnableIscsiUpdationParams.enableIscsi)
                && Objects.equals(this.where, clusterEnableIscsiUpdationParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableIscsi, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEnableIscsiUpdationParams {\n");
        sb.append("    enableIscsi: ").append(toIndentedString(enableIscsi)).append("\n");
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

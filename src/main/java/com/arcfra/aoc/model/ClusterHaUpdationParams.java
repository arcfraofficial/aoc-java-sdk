package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterHaUpdationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterHaUpdationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private ClusterWhereInput where;

    public ClusterHaUpdationParams() {}

    public ClusterHaUpdationParams ha(Boolean ha) {

        this.ha = ha;
        return this;
    }

    /**
     * Get ha
     *
     * @return ha
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getHa() {
        return ha;
    }

    public void setHa(Boolean ha) {
        this.ha = ha;
    }

    public ClusterHaUpdationParams ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public ClusterHaUpdationParams ha_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA);
        return this;
    }

    public void setHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA);
        }
    }

    public boolean getHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA);
    }

    public ClusterHaUpdationParams where(ClusterWhereInput where) {

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

    public ClusterHaUpdationParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ClusterHaUpdationParams where_ExplictlyNonNull() {
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
        ClusterHaUpdationParams clusterHaUpdationParams = (ClusterHaUpdationParams) o;
        return Objects.equals(this.ha, clusterHaUpdationParams.ha)
                && Objects.equals(this.where, clusterHaUpdationParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ha, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterHaUpdationParams {\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterEnablePinInPerformanceDiskPoolType */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterEnablePinInPerformanceDiskPoolType
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";

    @SerializedName(SERIALIZED_NAME_PERCENTAGE)
    private Double percentage;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private DiskPoolWhereUniqueInput where;

    public ClusterEnablePinInPerformanceDiskPoolType() {}

    public ClusterEnablePinInPerformanceDiskPoolType percentage(Double percentage) {

        this.percentage = percentage;
        return this;
    }

    /**
     * Get percentage
     *
     * @return percentage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public ClusterEnablePinInPerformanceDiskPoolType percentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERCENTAGE);
        return this;
    }

    public ClusterEnablePinInPerformanceDiskPoolType percentage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERCENTAGE);
        return this;
    }

    public void setPercentage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERCENTAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERCENTAGE);
        }
    }

    public boolean getPercentage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERCENTAGE);
    }

    public ClusterEnablePinInPerformanceDiskPoolType where(DiskPoolWhereUniqueInput where) {

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
    public DiskPoolWhereUniqueInput getWhere() {
        return where;
    }

    public void setWhere(DiskPoolWhereUniqueInput where) {
        this.where = where;
    }

    public ClusterEnablePinInPerformanceDiskPoolType where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ClusterEnablePinInPerformanceDiskPoolType where_ExplictlyNonNull() {
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
        ClusterEnablePinInPerformanceDiskPoolType clusterEnablePinInPerformanceDiskPoolType =
                (ClusterEnablePinInPerformanceDiskPoolType) o;
        return Objects.equals(this.percentage, clusterEnablePinInPerformanceDiskPoolType.percentage)
                && Objects.equals(this.where, clusterEnablePinInPerformanceDiskPoolType.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentage, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEnablePinInPerformanceDiskPoolType {\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

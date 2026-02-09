package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ClusterEnablePinInPerformanceHostType */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterEnablePinInPerformanceHostType
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISK_POOLS = "disk_pools";

    @SerializedName(SERIALIZED_NAME_DISK_POOLS)
    private List<ClusterEnablePinInPerformanceDiskPoolType> diskPools = null;

    public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";

    @SerializedName(SERIALIZED_NAME_PERCENTAGE)
    private Double percentage;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private HostWhereUniqueInput where;

    public ClusterEnablePinInPerformanceHostType() {}

    public ClusterEnablePinInPerformanceHostType diskPools(
            List<ClusterEnablePinInPerformanceDiskPoolType> diskPools) {

        this.diskPools = diskPools;
        return this;
    }

    public ClusterEnablePinInPerformanceHostType addDiskPoolsItem(
            ClusterEnablePinInPerformanceDiskPoolType diskPoolsItem) {
        if (this.diskPools == null) {
            this.diskPools = new ArrayList<ClusterEnablePinInPerformanceDiskPoolType>();
        }
        this.diskPools.add(diskPoolsItem);
        return this;
    }

    /**
     * Get diskPools
     *
     * @return diskPools
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ClusterEnablePinInPerformanceDiskPoolType> getDiskPools() {
        return diskPools;
    }

    public void setDiskPools(List<ClusterEnablePinInPerformanceDiskPoolType> diskPools) {
        this.diskPools = diskPools;
    }

    public ClusterEnablePinInPerformanceHostType diskPools_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_POOLS);
        return this;
    }

    public ClusterEnablePinInPerformanceHostType diskPools_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_POOLS);
        return this;
    }

    public void setDiskPools_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_POOLS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_POOLS);
        }
    }

    public boolean getDiskPools_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_POOLS);
    }

    public ClusterEnablePinInPerformanceHostType percentage(Double percentage) {

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

    public ClusterEnablePinInPerformanceHostType percentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERCENTAGE);
        return this;
    }

    public ClusterEnablePinInPerformanceHostType percentage_ExplictlyNonNull() {
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

    public ClusterEnablePinInPerformanceHostType where(HostWhereUniqueInput where) {

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
    public HostWhereUniqueInput getWhere() {
        return where;
    }

    public void setWhere(HostWhereUniqueInput where) {
        this.where = where;
    }

    public ClusterEnablePinInPerformanceHostType where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ClusterEnablePinInPerformanceHostType where_ExplictlyNonNull() {
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
        ClusterEnablePinInPerformanceHostType clusterEnablePinInPerformanceHostType =
                (ClusterEnablePinInPerformanceHostType) o;
        return Objects.equals(this.diskPools, clusterEnablePinInPerformanceHostType.diskPools)
                && Objects.equals(this.percentage, clusterEnablePinInPerformanceHostType.percentage)
                && Objects.equals(this.where, clusterEnablePinInPerformanceHostType.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskPools, percentage, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEnablePinInPerformanceHostType {\n");
        sb.append("    diskPools: ").append(toIndentedString(diskPools)).append("\n");
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

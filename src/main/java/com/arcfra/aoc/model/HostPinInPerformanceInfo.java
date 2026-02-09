package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** HostPinInPerformanceInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostPinInPerformanceInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISK_POOLS = "disk_pools";

    @SerializedName(SERIALIZED_NAME_DISK_POOLS)
    private List<DiskPoolPinInPerformanceInfo> diskPools = null;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE =
            "allocated_prioritized_space";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE)
    private Long allocatedPrioritizedSpace;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE =
            "planned_prioritized_space";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE)
    private Long plannedPrioritizedSpace;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE =
            "allocated_prioritized_space_usage";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE)
    private Double allocatedPrioritizedSpaceUsage;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE =
            "with_faster_ssd_as_cache";

    @SerializedName(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE)
    private Boolean withFasterSsdAsCache;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public HostPinInPerformanceInfo() {}

    public HostPinInPerformanceInfo diskPools(List<DiskPoolPinInPerformanceInfo> diskPools) {

        this.diskPools = diskPools;
        return this;
    }

    public HostPinInPerformanceInfo addDiskPoolsItem(DiskPoolPinInPerformanceInfo diskPoolsItem) {
        if (this.diskPools == null) {
            this.diskPools = new ArrayList<DiskPoolPinInPerformanceInfo>();
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
    public List<DiskPoolPinInPerformanceInfo> getDiskPools() {
        return diskPools;
    }

    public void setDiskPools(List<DiskPoolPinInPerformanceInfo> diskPools) {
        this.diskPools = diskPools;
    }

    public HostPinInPerformanceInfo diskPools_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_POOLS);
        return this;
    }

    public HostPinInPerformanceInfo diskPools_ExplictlyNonNull() {
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

    public HostPinInPerformanceInfo allocatedPrioritizedSpace(Long allocatedPrioritizedSpace) {

        this.allocatedPrioritizedSpace = allocatedPrioritizedSpace;
        return this;
    }

    /**
     * Get allocatedPrioritizedSpace
     *
     * @return allocatedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAllocatedPrioritizedSpace() {
        return allocatedPrioritizedSpace;
    }

    public void setAllocatedPrioritizedSpace(Long allocatedPrioritizedSpace) {
        this.allocatedPrioritizedSpace = allocatedPrioritizedSpace;
    }

    public HostPinInPerformanceInfo allocatedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        return this;
    }

    public HostPinInPerformanceInfo allocatedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        return this;
    }

    public void setAllocatedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        }
    }

    public boolean getAllocatedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
    }

    public HostPinInPerformanceInfo plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
        return this;
    }

    /**
     * Get plannedPrioritizedSpace
     *
     * @return plannedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpace() {
        return plannedPrioritizedSpace;
    }

    public void setPlannedPrioritizedSpace(Long plannedPrioritizedSpace) {
        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
    }

    public HostPinInPerformanceInfo plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public HostPinInPerformanceInfo plannedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public void setPlannedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        }
    }

    public boolean getPlannedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
    }

    public HostPinInPerformanceInfo allocatedPrioritizedSpaceUsage(
            Double allocatedPrioritizedSpaceUsage) {

        this.allocatedPrioritizedSpaceUsage = allocatedPrioritizedSpaceUsage;
        return this;
    }

    /**
     * Get allocatedPrioritizedSpaceUsage
     *
     * @return allocatedPrioritizedSpaceUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getAllocatedPrioritizedSpaceUsage() {
        return allocatedPrioritizedSpaceUsage;
    }

    public void setAllocatedPrioritizedSpaceUsage(Double allocatedPrioritizedSpaceUsage) {
        this.allocatedPrioritizedSpaceUsage = allocatedPrioritizedSpaceUsage;
    }

    public HostPinInPerformanceInfo allocatedPrioritizedSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        return this;
    }

    public HostPinInPerformanceInfo allocatedPrioritizedSpaceUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        return this;
    }

    public void setAllocatedPrioritizedSpaceUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        }
    }

    public boolean getAllocatedPrioritizedSpaceUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
    }

    public HostPinInPerformanceInfo prioSpacePercentage(Double prioSpacePercentage) {

        this.prioSpacePercentage = prioSpacePercentage;
        return this;
    }

    /**
     * Get prioSpacePercentage
     *
     * @return prioSpacePercentage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentage() {
        return prioSpacePercentage;
    }

    public void setPrioSpacePercentage(Double prioSpacePercentage) {
        this.prioSpacePercentage = prioSpacePercentage;
    }

    public HostPinInPerformanceInfo prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public HostPinInPerformanceInfo prioSpacePercentage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public void setPrioSpacePercentage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        }
    }

    public boolean getPrioSpacePercentage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
    }

    public HostPinInPerformanceInfo withFasterSsdAsCache(Boolean withFasterSsdAsCache) {

        this.withFasterSsdAsCache = withFasterSsdAsCache;
        return this;
    }

    /**
     * Get withFasterSsdAsCache
     *
     * @return withFasterSsdAsCache
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getWithFasterSsdAsCache() {
        return withFasterSsdAsCache;
    }

    public void setWithFasterSsdAsCache(Boolean withFasterSsdAsCache) {
        this.withFasterSsdAsCache = withFasterSsdAsCache;
    }

    public HostPinInPerformanceInfo withFasterSsdAsCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        return this;
    }

    public HostPinInPerformanceInfo withFasterSsdAsCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        return this;
    }

    public void setWithFasterSsdAsCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        }
    }

    public boolean getWithFasterSsdAsCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
    }

    public HostPinInPerformanceInfo name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostPinInPerformanceInfo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public HostPinInPerformanceInfo name_ExplictlyNonNull() {
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

    public HostPinInPerformanceInfo id(String id) {

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

    public HostPinInPerformanceInfo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public HostPinInPerformanceInfo id_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostPinInPerformanceInfo hostPinInPerformanceInfo = (HostPinInPerformanceInfo) o;
        return Objects.equals(this.diskPools, hostPinInPerformanceInfo.diskPools)
                && Objects.equals(
                        this.allocatedPrioritizedSpace,
                        hostPinInPerformanceInfo.allocatedPrioritizedSpace)
                && Objects.equals(
                        this.plannedPrioritizedSpace,
                        hostPinInPerformanceInfo.plannedPrioritizedSpace)
                && Objects.equals(
                        this.allocatedPrioritizedSpaceUsage,
                        hostPinInPerformanceInfo.allocatedPrioritizedSpaceUsage)
                && Objects.equals(
                        this.prioSpacePercentage, hostPinInPerformanceInfo.prioSpacePercentage)
                && Objects.equals(
                        this.withFasterSsdAsCache, hostPinInPerformanceInfo.withFasterSsdAsCache)
                && Objects.equals(this.name, hostPinInPerformanceInfo.name)
                && Objects.equals(this.id, hostPinInPerformanceInfo.id);
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
        return Objects.hash(
                diskPools,
                allocatedPrioritizedSpace,
                plannedPrioritizedSpace,
                allocatedPrioritizedSpaceUsage,
                prioSpacePercentage,
                withFasterSsdAsCache,
                name,
                id);
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
        sb.append("class HostPinInPerformanceInfo {\n");
        sb.append("    diskPools: ").append(toIndentedString(diskPools)).append("\n");
        sb.append("    allocatedPrioritizedSpace: ")
                .append(toIndentedString(allocatedPrioritizedSpace))
                .append("\n");
        sb.append("    plannedPrioritizedSpace: ")
                .append(toIndentedString(plannedPrioritizedSpace))
                .append("\n");
        sb.append("    allocatedPrioritizedSpaceUsage: ")
                .append(toIndentedString(allocatedPrioritizedSpaceUsage))
                .append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
                .append("\n");
        sb.append("    withFasterSsdAsCache: ")
                .append(toIndentedString(withFasterSsdAsCache))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

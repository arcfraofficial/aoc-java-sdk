package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterPinInPerformanceInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterPinInPerformanceInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED =
            "pin_in_performance_enabled";

    @SerializedName(SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED)
    private Boolean pinInPerformanceEnabled;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private List<HostPinInPerformanceInfo> hosts = null;

    public static final String SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE = "total_prio_volume_size";

    @SerializedName(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE)
    private Long totalPrioVolumeSize;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE =
            "downgraded_prioritized_space";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE)
    private Long downgradedPrioritizedSpace;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE =
            "allocated_prioritized_space";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE)
    private Long allocatedPrioritizedSpace;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE =
            "planned_prioritized_space";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE)
    private Long plannedPrioritizedSpace;

    public static final String SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE =
            "total_prio_volume_size_usage";

    @SerializedName(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE)
    private Double totalPrioVolumeSizeUsage;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE =
            "allocated_prioritized_space_usage";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE)
    private Double allocatedPrioritizedSpaceUsage;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public ClusterPinInPerformanceInfo() {}

    public ClusterPinInPerformanceInfo pinInPerformanceEnabled(Boolean pinInPerformanceEnabled) {

        this.pinInPerformanceEnabled = pinInPerformanceEnabled;
        return this;
    }

    /**
     * Get pinInPerformanceEnabled
     *
     * @return pinInPerformanceEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPinInPerformanceEnabled() {
        return pinInPerformanceEnabled;
    }

    public void setPinInPerformanceEnabled(Boolean pinInPerformanceEnabled) {
        this.pinInPerformanceEnabled = pinInPerformanceEnabled;
    }

    public ClusterPinInPerformanceInfo pinInPerformanceEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED);
        return this;
    }

    public ClusterPinInPerformanceInfo pinInPerformanceEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED);
        return this;
    }

    public void setPinInPerformanceEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED);
        }
    }

    public boolean getPinInPerformanceEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PIN_IN_PERFORMANCE_ENABLED);
    }

    public ClusterPinInPerformanceInfo hosts(List<HostPinInPerformanceInfo> hosts) {

        this.hosts = hosts;
        return this;
    }

    public ClusterPinInPerformanceInfo addHostsItem(HostPinInPerformanceInfo hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<HostPinInPerformanceInfo>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<HostPinInPerformanceInfo> getHosts() {
        return hosts;
    }

    public void setHosts(List<HostPinInPerformanceInfo> hosts) {
        this.hosts = hosts;
    }

    public ClusterPinInPerformanceInfo hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public ClusterPinInPerformanceInfo hosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public void setHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        }
    }

    public boolean getHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS);
    }

    public ClusterPinInPerformanceInfo totalPrioVolumeSize(Long totalPrioVolumeSize) {

        this.totalPrioVolumeSize = totalPrioVolumeSize;
        return this;
    }

    /**
     * Get totalPrioVolumeSize
     *
     * @return totalPrioVolumeSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalPrioVolumeSize() {
        return totalPrioVolumeSize;
    }

    public void setTotalPrioVolumeSize(Long totalPrioVolumeSize) {
        this.totalPrioVolumeSize = totalPrioVolumeSize;
    }

    public ClusterPinInPerformanceInfo totalPrioVolumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        return this;
    }

    public ClusterPinInPerformanceInfo totalPrioVolumeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        return this;
    }

    public void setTotalPrioVolumeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        }
    }

    public boolean getTotalPrioVolumeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
    }

    public ClusterPinInPerformanceInfo downgradedPrioritizedSpace(Long downgradedPrioritizedSpace) {

        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpace
     *
     * @return downgradedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpace() {
        return downgradedPrioritizedSpace;
    }

    public void setDowngradedPrioritizedSpace(Long downgradedPrioritizedSpace) {
        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
    }

    public ClusterPinInPerformanceInfo downgradedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public ClusterPinInPerformanceInfo downgradedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public void setDowngradedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        }
    }

    public boolean getDowngradedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
    }

    public ClusterPinInPerformanceInfo allocatedPrioritizedSpace(Long allocatedPrioritizedSpace) {

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

    public ClusterPinInPerformanceInfo allocatedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        return this;
    }

    public ClusterPinInPerformanceInfo allocatedPrioritizedSpace_ExplictlyNonNull() {
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

    public ClusterPinInPerformanceInfo plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

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

    public ClusterPinInPerformanceInfo plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public ClusterPinInPerformanceInfo plannedPrioritizedSpace_ExplictlyNonNull() {
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

    public ClusterPinInPerformanceInfo totalPrioVolumeSizeUsage(Double totalPrioVolumeSizeUsage) {

        this.totalPrioVolumeSizeUsage = totalPrioVolumeSizeUsage;
        return this;
    }

    /**
     * Get totalPrioVolumeSizeUsage
     *
     * @return totalPrioVolumeSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getTotalPrioVolumeSizeUsage() {
        return totalPrioVolumeSizeUsage;
    }

    public void setTotalPrioVolumeSizeUsage(Double totalPrioVolumeSizeUsage) {
        this.totalPrioVolumeSizeUsage = totalPrioVolumeSizeUsage;
    }

    public ClusterPinInPerformanceInfo totalPrioVolumeSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        return this;
    }

    public ClusterPinInPerformanceInfo totalPrioVolumeSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        return this;
    }

    public void setTotalPrioVolumeSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        }
    }

    public boolean getTotalPrioVolumeSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
    }

    public ClusterPinInPerformanceInfo allocatedPrioritizedSpaceUsage(
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

    public ClusterPinInPerformanceInfo allocatedPrioritizedSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        return this;
    }

    public ClusterPinInPerformanceInfo allocatedPrioritizedSpaceUsage_ExplictlyNonNull() {
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

    public ClusterPinInPerformanceInfo prioSpacePercentage(Double prioSpacePercentage) {

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

    public ClusterPinInPerformanceInfo prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public ClusterPinInPerformanceInfo prioSpacePercentage_ExplictlyNonNull() {
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

    public ClusterPinInPerformanceInfo name(String name) {

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

    public ClusterPinInPerformanceInfo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterPinInPerformanceInfo name_ExplictlyNonNull() {
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

    public ClusterPinInPerformanceInfo id(String id) {

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

    public ClusterPinInPerformanceInfo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterPinInPerformanceInfo id_ExplictlyNonNull() {
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
        ClusterPinInPerformanceInfo clusterPinInPerformanceInfo = (ClusterPinInPerformanceInfo) o;
        return Objects.equals(
                        this.pinInPerformanceEnabled,
                        clusterPinInPerformanceInfo.pinInPerformanceEnabled)
                && Objects.equals(this.hosts, clusterPinInPerformanceInfo.hosts)
                && Objects.equals(
                        this.totalPrioVolumeSize, clusterPinInPerformanceInfo.totalPrioVolumeSize)
                && Objects.equals(
                        this.downgradedPrioritizedSpace,
                        clusterPinInPerformanceInfo.downgradedPrioritizedSpace)
                && Objects.equals(
                        this.allocatedPrioritizedSpace,
                        clusterPinInPerformanceInfo.allocatedPrioritizedSpace)
                && Objects.equals(
                        this.plannedPrioritizedSpace,
                        clusterPinInPerformanceInfo.plannedPrioritizedSpace)
                && Objects.equals(
                        this.totalPrioVolumeSizeUsage,
                        clusterPinInPerformanceInfo.totalPrioVolumeSizeUsage)
                && Objects.equals(
                        this.allocatedPrioritizedSpaceUsage,
                        clusterPinInPerformanceInfo.allocatedPrioritizedSpaceUsage)
                && Objects.equals(
                        this.prioSpacePercentage, clusterPinInPerformanceInfo.prioSpacePercentage)
                && Objects.equals(this.name, clusterPinInPerformanceInfo.name)
                && Objects.equals(this.id, clusterPinInPerformanceInfo.id);
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
                pinInPerformanceEnabled,
                hosts,
                totalPrioVolumeSize,
                downgradedPrioritizedSpace,
                allocatedPrioritizedSpace,
                plannedPrioritizedSpace,
                totalPrioVolumeSizeUsage,
                allocatedPrioritizedSpaceUsage,
                prioSpacePercentage,
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
        sb.append("class ClusterPinInPerformanceInfo {\n");
        sb.append("    pinInPerformanceEnabled: ")
                .append(toIndentedString(pinInPerformanceEnabled))
                .append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    totalPrioVolumeSize: ")
                .append(toIndentedString(totalPrioVolumeSize))
                .append("\n");
        sb.append("    downgradedPrioritizedSpace: ")
                .append(toIndentedString(downgradedPrioritizedSpace))
                .append("\n");
        sb.append("    allocatedPrioritizedSpace: ")
                .append(toIndentedString(allocatedPrioritizedSpace))
                .append("\n");
        sb.append("    plannedPrioritizedSpace: ")
                .append(toIndentedString(plannedPrioritizedSpace))
                .append("\n");
        sb.append("    totalPrioVolumeSizeUsage: ")
                .append(toIndentedString(totalPrioVolumeSizeUsage))
                .append("\n");
        sb.append("    allocatedPrioritizedSpaceUsage: ")
                .append(toIndentedString(allocatedPrioritizedSpaceUsage))
                .append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
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

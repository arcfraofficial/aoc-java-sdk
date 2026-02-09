package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ClusterEnablePinInPerformanceParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterEnablePinInPerformanceParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private List<ClusterEnablePinInPerformanceHostType> hosts =
            new ArrayList<ClusterEnablePinInPerformanceHostType>();

    public static final String SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE =
            "cluster_default_prio_percentage";

    @SerializedName(SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE)
    private Double clusterDefaultPrioPercentage;

    public ClusterEnablePinInPerformanceParamsData() {}

    public ClusterEnablePinInPerformanceParamsData hosts(
            List<ClusterEnablePinInPerformanceHostType> hosts) {

        this.hosts = hosts;
        return this;
    }

    public ClusterEnablePinInPerformanceParamsData addHostsItem(
            ClusterEnablePinInPerformanceHostType hostsItem) {
        this.hosts.add(hostsItem);
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<ClusterEnablePinInPerformanceHostType> getHosts() {
        return hosts;
    }

    public void setHosts(List<ClusterEnablePinInPerformanceHostType> hosts) {
        this.hosts = hosts;
    }

    public ClusterEnablePinInPerformanceParamsData hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public ClusterEnablePinInPerformanceParamsData hosts_ExplictlyNonNull() {
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

    public ClusterEnablePinInPerformanceParamsData clusterDefaultPrioPercentage(
            Double clusterDefaultPrioPercentage) {

        this.clusterDefaultPrioPercentage = clusterDefaultPrioPercentage;
        return this;
    }

    /**
     * Get clusterDefaultPrioPercentage
     *
     * @return clusterDefaultPrioPercentage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getClusterDefaultPrioPercentage() {
        return clusterDefaultPrioPercentage;
    }

    public void setClusterDefaultPrioPercentage(Double clusterDefaultPrioPercentage) {
        this.clusterDefaultPrioPercentage = clusterDefaultPrioPercentage;
    }

    public ClusterEnablePinInPerformanceParamsData clusterDefaultPrioPercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE);
        return this;
    }

    public ClusterEnablePinInPerformanceParamsData clusterDefaultPrioPercentage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE);
        return this;
    }

    public void setClusterDefaultPrioPercentage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE);
        }
    }

    public boolean getClusterDefaultPrioPercentage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_DEFAULT_PRIO_PERCENTAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterEnablePinInPerformanceParamsData clusterEnablePinInPerformanceParamsData =
                (ClusterEnablePinInPerformanceParamsData) o;
        return Objects.equals(this.hosts, clusterEnablePinInPerformanceParamsData.hosts)
                && Objects.equals(
                        this.clusterDefaultPrioPercentage,
                        clusterEnablePinInPerformanceParamsData.clusterDefaultPrioPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosts, clusterDefaultPrioPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEnablePinInPerformanceParamsData {\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    clusterDefaultPrioPercentage: ")
                .append(toIndentedString(clusterDefaultPrioPercentage))
                .append("\n");
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

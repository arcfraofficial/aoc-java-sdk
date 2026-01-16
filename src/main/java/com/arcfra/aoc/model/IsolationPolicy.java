package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** IsolationPolicy */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IsolationPolicy extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<NestedNetworkPolicyRule> egress = null;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private NestedEverouteCluster everouteCluster;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<NestedNetworkPolicyRule> ingress = null;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_MODE = "mode";

    @SerializedName(SERIALIZED_NAME_MODE)
    private IsolationMode mode;

    public static final String SERIALIZED_NAME_STATISTICS = "statistics";

    @SerializedName(SERIALIZED_NAME_STATISTICS)
    private NestedSecurityPolicyStatistics statistics;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public IsolationPolicy() {}

    public IsolationPolicy egress(List<NestedNetworkPolicyRule> egress) {

        this.egress = egress;
        return this;
    }

    public IsolationPolicy addEgressItem(NestedNetworkPolicyRule egressItem) {
        if (this.egress == null) {
            this.egress = new ArrayList<NestedNetworkPolicyRule>();
        }
        this.egress.add(egressItem);
        return this;
    }

    /**
     * Get egress
     *
     * @return egress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNetworkPolicyRule> getEgress() {
        return egress;
    }

    public void setEgress(List<NestedNetworkPolicyRule> egress) {
        this.egress = egress;
    }

    public IsolationPolicy egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public IsolationPolicy egress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public void setEgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        }
    }

    public boolean getEgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS);
    }

    public IsolationPolicy everouteCluster(NestedEverouteCluster everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedEverouteCluster getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public IsolationPolicy everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public IsolationPolicy everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public IsolationPolicy id(String id) {

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

    public IsolationPolicy id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public IsolationPolicy id_ExplictlyNonNull() {
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

    public IsolationPolicy ingress(List<NestedNetworkPolicyRule> ingress) {

        this.ingress = ingress;
        return this;
    }

    public IsolationPolicy addIngressItem(NestedNetworkPolicyRule ingressItem) {
        if (this.ingress == null) {
            this.ingress = new ArrayList<NestedNetworkPolicyRule>();
        }
        this.ingress.add(ingressItem);
        return this;
    }

    /**
     * Get ingress
     *
     * @return ingress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNetworkPolicyRule> getIngress() {
        return ingress;
    }

    public void setIngress(List<NestedNetworkPolicyRule> ingress) {
        this.ingress = ingress;
    }

    public IsolationPolicy ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public IsolationPolicy ingress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public void setIngress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        }
    }

    public boolean getIngress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS);
    }

    public IsolationPolicy labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public IsolationPolicy addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public IsolationPolicy labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public IsolationPolicy labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public IsolationPolicy mode(IsolationMode mode) {

        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     *
     * @return mode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public IsolationMode getMode() {
        return mode;
    }

    public void setMode(IsolationMode mode) {
        this.mode = mode;
    }

    public IsolationPolicy mode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE);
        return this;
    }

    public IsolationPolicy mode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE);
        return this;
    }

    public void setMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE);
        }
    }

    public boolean getMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE);
    }

    public IsolationPolicy statistics(NestedSecurityPolicyStatistics statistics) {

        this.statistics = statistics;
        return this;
    }

    /**
     * Get statistics
     *
     * @return statistics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedSecurityPolicyStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(NestedSecurityPolicyStatistics statistics) {
        this.statistics = statistics;
    }

    public IsolationPolicy statistics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATISTICS);
        return this;
    }

    public IsolationPolicy statistics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATISTICS);
        return this;
    }

    public void setStatistics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATISTICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATISTICS);
        }
    }

    public boolean getStatistics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATISTICS);
    }

    public IsolationPolicy vm(NestedVm vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVm getVm() {
        return vm;
    }

    public void setVm(NestedVm vm) {
        this.vm = vm;
    }

    public IsolationPolicy vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public IsolationPolicy vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IsolationPolicy isolationPolicy = (IsolationPolicy) o;
        return Objects.equals(this.egress, isolationPolicy.egress)
                && Objects.equals(this.everouteCluster, isolationPolicy.everouteCluster)
                && Objects.equals(this.id, isolationPolicy.id)
                && Objects.equals(this.ingress, isolationPolicy.ingress)
                && Objects.equals(this.labels, isolationPolicy.labels)
                && Objects.equals(this.mode, isolationPolicy.mode)
                && Objects.equals(this.statistics, isolationPolicy.statistics)
                && Objects.equals(this.vm, isolationPolicy.vm);
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
        return Objects.hash(egress, everouteCluster, id, ingress, labels, mode, statistics, vm);
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
        sb.append("class IsolationPolicy {\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

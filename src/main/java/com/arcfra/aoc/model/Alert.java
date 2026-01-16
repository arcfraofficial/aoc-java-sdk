package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Alert */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Alert extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CAUSE = "cause";

    @SerializedName(SERIALIZED_NAME_CAUSE)
    private String cause;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";

    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private String createTime;

    public static final String SERIALIZED_NAME_ENDED = "ended";

    @SerializedName(SERIALIZED_NAME_ENDED)
    private Boolean ended;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IMPACT = "impact";

    @SerializedName(SERIALIZED_NAME_IMPACT)
    private String impact;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private Object labels;

    public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME = "local_create_time";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME)
    private String localCreateTime;

    public static final String SERIALIZED_NAME_LOCAL_END_TIME = "local_end_time";

    @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME)
    private String localEndTime;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_START_TIME = "local_start_time";

    @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME)
    private String localStartTime;

    public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME = "local_update_time";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME)
    private String localUpdateTime;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_SEVERITY = "severity";

    @SerializedName(SERIALIZED_NAME_SEVERITY)
    private String severity;

    public static final String SERIALIZED_NAME_SOLUTION = "solution";

    @SerializedName(SERIALIZED_NAME_SOLUTION)
    private String solution;

    public static final String SERIALIZED_NAME_THRESHOLD = "threshold";

    @SerializedName(SERIALIZED_NAME_THRESHOLD)
    private Double threshold;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private Double value;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public Alert() {}

    public Alert cause(String cause) {

        this.cause = cause;
        return this;
    }

    /**
     * Get cause
     *
     * @return cause
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Alert cause_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE);
        return this;
    }

    public Alert cause_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE);
        return this;
    }

    public void setCause_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE);
        }
    }

    public boolean getCause_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE);
    }

    public Alert cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public Alert cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Alert cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public Alert createTime(String createTime) {

        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     *
     * @return createTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Alert createTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATE_TIME);
        return this;
    }

    public Alert createTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATE_TIME);
        return this;
    }

    public void setCreateTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATE_TIME);
        }
    }

    public boolean getCreateTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATE_TIME);
    }

    public Alert ended(Boolean ended) {

        this.ended = ended;
        return this;
    }

    /**
     * Get ended
     *
     * @return ended
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnded() {
        return ended;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public Alert ended_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDED);
        return this;
    }

    public Alert ended_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDED);
        return this;
    }

    public void setEnded_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDED);
        }
    }

    public boolean getEnded_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDED);
    }

    public Alert host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public Alert host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public Alert host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public Alert id(String id) {

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

    public Alert id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Alert id_ExplictlyNonNull() {
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

    public Alert impact(String impact) {

        this.impact = impact;
        return this;
    }

    /**
     * Get impact
     *
     * @return impact
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public Alert impact_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT);
        return this;
    }

    public Alert impact_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT);
        return this;
    }

    public void setImpact_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT);
        }
    }

    public boolean getImpact_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT);
    }

    public Alert labels(Object labels) {

        this.labels = labels;
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public Alert labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Alert labels_ExplictlyNonNull() {
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

    public Alert localCreateTime(String localCreateTime) {

        this.localCreateTime = localCreateTime;
        return this;
    }

    /**
     * Get localCreateTime
     *
     * @return localCreateTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreateTime() {
        return localCreateTime;
    }

    public void setLocalCreateTime(String localCreateTime) {
        this.localCreateTime = localCreateTime;
    }

    public Alert localCreateTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        return this;
    }

    public Alert localCreateTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        return this;
    }

    public void setLocalCreateTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATE_TIME);
        }
    }

    public boolean getLocalCreateTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATE_TIME);
    }

    public Alert localEndTime(String localEndTime) {

        this.localEndTime = localEndTime;
        return this;
    }

    /**
     * Get localEndTime
     *
     * @return localEndTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalEndTime() {
        return localEndTime;
    }

    public void setLocalEndTime(String localEndTime) {
        this.localEndTime = localEndTime;
    }

    public Alert localEndTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_END_TIME);
        return this;
    }

    public Alert localEndTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_END_TIME);
        return this;
    }

    public void setLocalEndTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_END_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_END_TIME);
        }
    }

    public boolean getLocalEndTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_END_TIME);
    }

    public Alert localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public Alert localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Alert localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public Alert localStartTime(String localStartTime) {

        this.localStartTime = localStartTime;
        return this;
    }

    /**
     * Get localStartTime
     *
     * @return localStartTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalStartTime() {
        return localStartTime;
    }

    public void setLocalStartTime(String localStartTime) {
        this.localStartTime = localStartTime;
    }

    public Alert localStartTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_START_TIME);
        return this;
    }

    public Alert localStartTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_START_TIME);
        return this;
    }

    public void setLocalStartTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_START_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_START_TIME);
        }
    }

    public boolean getLocalStartTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_START_TIME);
    }

    public Alert localUpdateTime(String localUpdateTime) {

        this.localUpdateTime = localUpdateTime;
        return this;
    }

    /**
     * Get localUpdateTime
     *
     * @return localUpdateTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalUpdateTime() {
        return localUpdateTime;
    }

    public void setLocalUpdateTime(String localUpdateTime) {
        this.localUpdateTime = localUpdateTime;
    }

    public Alert localUpdateTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATE_TIME);
        return this;
    }

    public Alert localUpdateTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATE_TIME);
        return this;
    }

    public void setLocalUpdateTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATE_TIME);
        }
    }

    public boolean getLocalUpdateTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATE_TIME);
    }

    public Alert message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Alert message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public Alert message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public Alert severity(String severity) {

        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     *
     * @return severity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Alert severity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SEVERITY);
        return this;
    }

    public Alert severity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SEVERITY);
        return this;
    }

    public void setSeverity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SEVERITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SEVERITY);
        }
    }

    public boolean getSeverity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SEVERITY);
    }

    public Alert solution(String solution) {

        this.solution = solution;
        return this;
    }

    /**
     * Get solution
     *
     * @return solution
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Alert solution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION);
        return this;
    }

    public Alert solution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION);
        return this;
    }

    public void setSolution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION);
        }
    }

    public boolean getSolution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION);
    }

    public Alert threshold(Double threshold) {

        this.threshold = threshold;
        return this;
    }

    /**
     * Get threshold
     *
     * @return threshold
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Alert threshold_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLD);
        return this;
    }

    public Alert threshold_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THRESHOLD);
        return this;
    }

    public void setThreshold_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THRESHOLD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THRESHOLD);
        }
    }

    public boolean getThreshold_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THRESHOLD);
    }

    public Alert value(Double value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Alert value_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE);
        return this;
    }

    public Alert value_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        return this;
    }

    public void setValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        }
    }

    public boolean getValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE);
    }

    public Alert vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public Alert addVmsItem(NestedVm vmsItem) {
        if (this.vms == null) {
            this.vms = new ArrayList<NestedVm>();
        }
        this.vms.add(vmsItem);
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVm> getVms() {
        return vms;
    }

    public void setVms(List<NestedVm> vms) {
        this.vms = vms;
    }

    public Alert vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public Alert vms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS);
        return this;
    }

    public void setVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS);
        }
    }

    public boolean getVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Alert alert = (Alert) o;
        return Objects.equals(this.cause, alert.cause)
                && Objects.equals(this.cluster, alert.cluster)
                && Objects.equals(this.createTime, alert.createTime)
                && Objects.equals(this.ended, alert.ended)
                && Objects.equals(this.host, alert.host)
                && Objects.equals(this.id, alert.id)
                && Objects.equals(this.impact, alert.impact)
                && Objects.equals(this.labels, alert.labels)
                && Objects.equals(this.localCreateTime, alert.localCreateTime)
                && Objects.equals(this.localEndTime, alert.localEndTime)
                && Objects.equals(this.localId, alert.localId)
                && Objects.equals(this.localStartTime, alert.localStartTime)
                && Objects.equals(this.localUpdateTime, alert.localUpdateTime)
                && Objects.equals(this.message, alert.message)
                && Objects.equals(this.severity, alert.severity)
                && Objects.equals(this.solution, alert.solution)
                && Objects.equals(this.threshold, alert.threshold)
                && Objects.equals(this.value, alert.value)
                && Objects.equals(this.vms, alert.vms);
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
                cause,
                cluster,
                createTime,
                ended,
                host,
                id,
                impact,
                labels,
                localCreateTime,
                localEndTime,
                localId,
                localStartTime,
                localUpdateTime,
                message,
                severity,
                solution,
                threshold,
                value,
                vms);
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
        sb.append("class Alert {\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreateTime: ").append(toIndentedString(localCreateTime)).append("\n");
        sb.append("    localEndTime: ").append(toIndentedString(localEndTime)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localStartTime: ").append(toIndentedString(localStartTime)).append("\n");
        sb.append("    localUpdateTime: ").append(toIndentedString(localUpdateTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterUpgradeHistory */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterUpgradeHistory
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DATE = "date";

    @SerializedName(SERIALIZED_NAME_DATE)
    private String date;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_PROGRESS = "progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Object progress;

    public static final String SERIALIZED_NAME_RESULT = "result";

    @SerializedName(SERIALIZED_NAME_RESULT)
    private String result;

    public static final String SERIALIZED_NAME_TASK_UUID = "task_uuid";

    @SerializedName(SERIALIZED_NAME_TASK_UUID)
    private String taskUuid;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public ClusterUpgradeHistory() {}

    public ClusterUpgradeHistory cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public ClusterUpgradeHistory cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterUpgradeHistory cluster_ExplictlyNonNull() {
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

    public ClusterUpgradeHistory date(String date) {

        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ClusterUpgradeHistory date_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATE);
        return this;
    }

    public ClusterUpgradeHistory date_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATE);
        return this;
    }

    public void setDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATE);
        }
    }

    public boolean getDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATE);
    }

    public ClusterUpgradeHistory id(String id) {

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

    public ClusterUpgradeHistory id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterUpgradeHistory id_ExplictlyNonNull() {
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

    public ClusterUpgradeHistory localId(String localId) {

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

    public ClusterUpgradeHistory localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterUpgradeHistory localId_ExplictlyNonNull() {
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

    public ClusterUpgradeHistory progress(Object progress) {

        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     *
     * @return progress
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getProgress() {
        return progress;
    }

    public void setProgress(Object progress) {
        this.progress = progress;
    }

    public ClusterUpgradeHistory progress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public ClusterUpgradeHistory progress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public void setProgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS);
        }
    }

    public boolean getProgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS);
    }

    public ClusterUpgradeHistory result(String result) {

        this.result = result;
        return this;
    }

    /**
     * Get result
     *
     * @return result
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ClusterUpgradeHistory result_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESULT);
        return this;
    }

    public ClusterUpgradeHistory result_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        return this;
    }

    public void setResult_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESULT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESULT);
        }
    }

    public boolean getResult_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESULT);
    }

    public ClusterUpgradeHistory taskUuid(String taskUuid) {

        this.taskUuid = taskUuid;
        return this;
    }

    /**
     * Get taskUuid
     *
     * @return taskUuid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    public ClusterUpgradeHistory taskUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_UUID);
        return this;
    }

    public ClusterUpgradeHistory taskUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID);
        return this;
    }

    public void setTaskUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_UUID);
        }
    }

    public boolean getTaskUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_UUID);
    }

    public ClusterUpgradeHistory version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterUpgradeHistory version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public ClusterUpgradeHistory version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterUpgradeHistory clusterUpgradeHistory = (ClusterUpgradeHistory) o;
        return Objects.equals(this.cluster, clusterUpgradeHistory.cluster)
                && Objects.equals(this.date, clusterUpgradeHistory.date)
                && Objects.equals(this.id, clusterUpgradeHistory.id)
                && Objects.equals(this.localId, clusterUpgradeHistory.localId)
                && Objects.equals(this.progress, clusterUpgradeHistory.progress)
                && Objects.equals(this.result, clusterUpgradeHistory.result)
                && Objects.equals(this.taskUuid, clusterUpgradeHistory.taskUuid)
                && Objects.equals(this.version, clusterUpgradeHistory.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster, date, id, localId, progress, result, taskUuid, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterUpgradeHistory {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    taskUuid: ").append(toIndentedString(taskUuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

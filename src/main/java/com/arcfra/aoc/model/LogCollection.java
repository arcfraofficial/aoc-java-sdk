package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** LogCollection */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LogCollection extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_GROUPS = "groups";

    @SerializedName(SERIALIZED_NAME_GROUPS)
    private List<String> groups = new ArrayList<String>();

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private List<NestedHost> hosts = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOG_ENDED_AT = "log_ended_at";

    @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT)
    private String logEndedAt;

    public static final String SERIALIZED_NAME_LOG_STARTED_AT = "log_started_at";

    @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT)
    private String logStartedAt;

    public static final String SERIALIZED_NAME_OWNER = "owner";

    @SerializedName(SERIALIZED_NAME_OWNER)
    private String owner;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PROGRESS = "progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Double progress;

    public static final String SERIALIZED_NAME_SERVICE_GROUPS = "service_groups";

    @SerializedName(SERIALIZED_NAME_SERVICE_GROUPS)
    private Object serviceGroups;

    public static final String SERIALIZED_NAME_SERVICES = "services";

    @SerializedName(SERIALIZED_NAME_SERVICES)
    private List<String> services = new ArrayList<String>();

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private LogCollectionStatus status;

    public static final String SERIALIZED_NAME_WITNESS = "witness";

    @SerializedName(SERIALIZED_NAME_WITNESS)
    private NestedWitness witness;

    public LogCollection() {}

    public LogCollection cluster(NestedCluster cluster) {

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

    public LogCollection cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public LogCollection cluster_ExplictlyNonNull() {
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

    public LogCollection groups(List<String> groups) {

        this.groups = groups;
        return this;
    }

    public LogCollection addGroupsItem(String groupsItem) {
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public LogCollection groups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GROUPS);
        return this;
    }

    public LogCollection groups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GROUPS);
        return this;
    }

    public void setGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GROUPS);
        }
    }

    public boolean getGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GROUPS);
    }

    public LogCollection hosts(List<NestedHost> hosts) {

        this.hosts = hosts;
        return this;
    }

    public LogCollection addHostsItem(NestedHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<NestedHost>();
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
    public List<NestedHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<NestedHost> hosts) {
        this.hosts = hosts;
    }

    public LogCollection hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public LogCollection hosts_ExplictlyNonNull() {
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

    public LogCollection id(String id) {

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

    public LogCollection id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public LogCollection id_ExplictlyNonNull() {
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

    public LogCollection localId(String localId) {

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

    public LogCollection localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public LogCollection localId_ExplictlyNonNull() {
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

    public LogCollection logEndedAt(String logEndedAt) {

        this.logEndedAt = logEndedAt;
        return this;
    }

    /**
     * Get logEndedAt
     *
     * @return logEndedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLogEndedAt() {
        return logEndedAt;
    }

    public void setLogEndedAt(String logEndedAt) {
        this.logEndedAt = logEndedAt;
    }

    public LogCollection logEndedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOG_ENDED_AT);
        return this;
    }

    public LogCollection logEndedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOG_ENDED_AT);
        return this;
    }

    public void setLogEndedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOG_ENDED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOG_ENDED_AT);
        }
    }

    public boolean getLogEndedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOG_ENDED_AT);
    }

    public LogCollection logStartedAt(String logStartedAt) {

        this.logStartedAt = logStartedAt;
        return this;
    }

    /**
     * Get logStartedAt
     *
     * @return logStartedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLogStartedAt() {
        return logStartedAt;
    }

    public void setLogStartedAt(String logStartedAt) {
        this.logStartedAt = logStartedAt;
    }

    public LogCollection logStartedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOG_STARTED_AT);
        return this;
    }

    public LogCollection logStartedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOG_STARTED_AT);
        return this;
    }

    public void setLogStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOG_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOG_STARTED_AT);
        }
    }

    public boolean getLogStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOG_STARTED_AT);
    }

    public LogCollection owner(String owner) {

        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LogCollection owner_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OWNER);
        return this;
    }

    public LogCollection owner_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OWNER);
        return this;
    }

    public void setOwner_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OWNER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OWNER);
        }
    }

    public boolean getOwner_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OWNER);
    }

    public LogCollection path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LogCollection path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public LogCollection path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public LogCollection progress(Double progress) {

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
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public LogCollection progress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public LogCollection progress_ExplictlyNonNull() {
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

    public LogCollection serviceGroups(Object serviceGroups) {

        this.serviceGroups = serviceGroups;
        return this;
    }

    /**
     * Get serviceGroups
     *
     * @return serviceGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Object getServiceGroups() {
        return serviceGroups;
    }

    public void setServiceGroups(Object serviceGroups) {
        this.serviceGroups = serviceGroups;
    }

    public LogCollection serviceGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_GROUPS);
        return this;
    }

    public LogCollection serviceGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_GROUPS);
        return this;
    }

    public void setServiceGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_GROUPS);
        }
    }

    public boolean getServiceGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_GROUPS);
    }

    public LogCollection services(List<String> services) {

        this.services = services;
        return this;
    }

    public LogCollection addServicesItem(String servicesItem) {
        this.services.add(servicesItem);
        return this;
    }

    /**
     * Get services
     *
     * @return services
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public LogCollection services_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICES);
        return this;
    }

    public LogCollection services_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICES);
        return this;
    }

    public void setServices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICES);
        }
    }

    public boolean getServices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICES);
    }

    public LogCollection size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public LogCollection size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public LogCollection size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public LogCollection startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public LogCollection startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public LogCollection startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public LogCollection status(LogCollectionStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public LogCollectionStatus getStatus() {
        return status;
    }

    public void setStatus(LogCollectionStatus status) {
        this.status = status;
    }

    public LogCollection status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public LogCollection status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public LogCollection witness(NestedWitness witness) {

        this.witness = witness;
        return this;
    }

    /**
     * Get witness
     *
     * @return witness
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedWitness getWitness() {
        return witness;
    }

    public void setWitness(NestedWitness witness) {
        this.witness = witness;
    }

    public LogCollection witness_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESS);
        return this;
    }

    public LogCollection witness_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESS);
        return this;
    }

    public void setWitness_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESS);
        }
    }

    public boolean getWitness_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogCollection logCollection = (LogCollection) o;
        return Objects.equals(this.cluster, logCollection.cluster)
                && Objects.equals(this.groups, logCollection.groups)
                && Objects.equals(this.hosts, logCollection.hosts)
                && Objects.equals(this.id, logCollection.id)
                && Objects.equals(this.localId, logCollection.localId)
                && Objects.equals(this.logEndedAt, logCollection.logEndedAt)
                && Objects.equals(this.logStartedAt, logCollection.logStartedAt)
                && Objects.equals(this.owner, logCollection.owner)
                && Objects.equals(this.path, logCollection.path)
                && Objects.equals(this.progress, logCollection.progress)
                && Objects.equals(this.serviceGroups, logCollection.serviceGroups)
                && Objects.equals(this.services, logCollection.services)
                && Objects.equals(this.size, logCollection.size)
                && Objects.equals(this.startedAt, logCollection.startedAt)
                && Objects.equals(this.status, logCollection.status)
                && Objects.equals(this.witness, logCollection.witness);
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
                cluster,
                groups,
                hosts,
                id,
                localId,
                logEndedAt,
                logStartedAt,
                owner,
                path,
                progress,
                serviceGroups,
                services,
                size,
                startedAt,
                status,
                witness);
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
        sb.append("class LogCollection {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    logEndedAt: ").append(toIndentedString(logEndedAt)).append("\n");
        sb.append("    logStartedAt: ").append(toIndentedString(logStartedAt)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    serviceGroups: ").append(toIndentedString(serviceGroups)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    witness: ").append(toIndentedString(witness)).append("\n");
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

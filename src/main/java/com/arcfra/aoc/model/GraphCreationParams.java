package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GraphCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GraphCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INSTANCE_IDS = "instance_ids";

    @SerializedName(SERIALIZED_NAME_INSTANCE_IDS)
    private List<String> instanceIds = null;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private NetworkType network;

    public static final String SERIALIZED_NAME_SERVICE = "service";

    @SerializedName(SERIALIZED_NAME_SERVICE)
    private String service;

    public static final String SERIALIZED_NAME_METRIC_TYPE = "metric_type";

    @SerializedName(SERIALIZED_NAME_METRIC_TYPE)
    private MetricType metricType;

    public static final String SERIALIZED_NAME_METRIC_COUNT = "metric_count";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT)
    private Integer metricCount;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private GraphType type;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_VIEW_ID = "view_id";

    @SerializedName(SERIALIZED_NAME_VIEW_ID)
    private String viewId;

    public static final String SERIALIZED_NAME_TITLE = "title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_CONNECT_ID = "connect_id";

    @SerializedName(SERIALIZED_NAME_CONNECT_ID)
    private List<String> connectId = new ArrayList<String>();

    public static final String SERIALIZED_NAME_METRIC_NAME = "metric_name";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME)
    private String metricName;

    public GraphCreationParams() {}

    public GraphCreationParams instanceIds(List<String> instanceIds) {

        this.instanceIds = instanceIds;
        return this;
    }

    public GraphCreationParams addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<String>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    /**
     * Get instanceIds
     *
     * @return instanceIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public GraphCreationParams instanceIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCE_IDS);
        return this;
    }

    public GraphCreationParams instanceIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTANCE_IDS);
        return this;
    }

    public void setInstanceIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTANCE_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTANCE_IDS);
        }
    }

    public boolean getInstanceIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTANCE_IDS);
    }

    public GraphCreationParams network(NetworkType network) {

        this.network = network;
        return this;
    }

    /**
     * Get network
     *
     * @return network
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NetworkType getNetwork() {
        return network;
    }

    public void setNetwork(NetworkType network) {
        this.network = network;
    }

    public GraphCreationParams network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public GraphCreationParams network_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public void setNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        }
    }

    public boolean getNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK);
    }

    public GraphCreationParams service(String service) {

        this.service = service;
        return this;
    }

    /**
     * Get service
     *
     * @return service
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public GraphCreationParams service_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public GraphCreationParams service_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public void setService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE);
        }
    }

    public boolean getService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE);
    }

    public GraphCreationParams metricType(MetricType metricType) {

        this.metricType = metricType;
        return this;
    }

    /**
     * Get metricType
     *
     * @return metricType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public MetricType getMetricType() {
        return metricType;
    }

    public void setMetricType(MetricType metricType) {
        this.metricType = metricType;
    }

    public GraphCreationParams metricType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE);
        return this;
    }

    public GraphCreationParams metricType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE);
        return this;
    }

    public void setMetricType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE);
        }
    }

    public boolean getMetricType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_TYPE);
    }

    public GraphCreationParams metricCount(Integer metricCount) {

        this.metricCount = metricCount;
        return this;
    }

    /**
     * Get metricCount
     *
     * @return metricCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMetricCount() {
        return metricCount;
    }

    public void setMetricCount(Integer metricCount) {
        this.metricCount = metricCount;
    }

    public GraphCreationParams metricCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT);
        return this;
    }

    public GraphCreationParams metricCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT);
        return this;
    }

    public void setMetricCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT);
        }
    }

    public boolean getMetricCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT);
    }

    public GraphCreationParams type(GraphType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public GraphType getType() {
        return type;
    }

    public void setType(GraphType type) {
        this.type = type;
    }

    public GraphCreationParams type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public GraphCreationParams type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public GraphCreationParams resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public GraphCreationParams resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public GraphCreationParams resourceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public void setResourceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        }
    }

    public boolean getResourceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE);
    }

    public GraphCreationParams viewId(String viewId) {

        this.viewId = viewId;
        return this;
    }

    /**
     * Get viewId
     *
     * @return viewId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public GraphCreationParams viewId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIEW_ID);
        return this;
    }

    public GraphCreationParams viewId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIEW_ID);
        return this;
    }

    public void setViewId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIEW_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIEW_ID);
        }
    }

    public boolean getViewId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIEW_ID);
    }

    public GraphCreationParams title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GraphCreationParams title_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE);
        return this;
    }

    public GraphCreationParams title_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE);
        return this;
    }

    public void setTitle_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE);
        }
    }

    public boolean getTitle_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE);
    }

    public GraphCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public GraphCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public GraphCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public GraphCreationParams connectId(List<String> connectId) {

        this.connectId = connectId;
        return this;
    }

    public GraphCreationParams addConnectIdItem(String connectIdItem) {
        this.connectId.add(connectIdItem);
        return this;
    }

    /**
     * Get connectId
     *
     * @return connectId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getConnectId() {
        return connectId;
    }

    public void setConnectId(List<String> connectId) {
        this.connectId = connectId;
    }

    public GraphCreationParams connectId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_ID);
        return this;
    }

    public GraphCreationParams connectId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_ID);
        return this;
    }

    public void setConnectId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_ID);
        }
    }

    public boolean getConnectId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_ID);
    }

    public GraphCreationParams metricName(String metricName) {

        this.metricName = metricName;
        return this;
    }

    /**
     * Get metricName
     *
     * @return metricName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public GraphCreationParams metricName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public GraphCreationParams metricName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public void setMetricName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME);
        }
    }

    public boolean getMetricName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GraphCreationParams graphCreationParams = (GraphCreationParams) o;
        return Objects.equals(this.instanceIds, graphCreationParams.instanceIds)
                && Objects.equals(this.network, graphCreationParams.network)
                && Objects.equals(this.service, graphCreationParams.service)
                && Objects.equals(this.metricType, graphCreationParams.metricType)
                && Objects.equals(this.metricCount, graphCreationParams.metricCount)
                && Objects.equals(this.type, graphCreationParams.type)
                && Objects.equals(this.resourceType, graphCreationParams.resourceType)
                && Objects.equals(this.viewId, graphCreationParams.viewId)
                && Objects.equals(this.title, graphCreationParams.title)
                && Objects.equals(this.clusterId, graphCreationParams.clusterId)
                && Objects.equals(this.connectId, graphCreationParams.connectId)
                && Objects.equals(this.metricName, graphCreationParams.metricName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                instanceIds,
                network,
                service,
                metricType,
                metricCount,
                type,
                resourceType,
                viewId,
                title,
                clusterId,
                connectId,
                metricName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphCreationParams {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    metricCount: ").append(toIndentedString(metricCount)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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

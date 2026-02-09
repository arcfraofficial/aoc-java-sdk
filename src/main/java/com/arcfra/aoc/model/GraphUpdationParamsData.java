package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GraphUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GraphUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INSTANCE_IDS = "instance_ids";

    @SerializedName(SERIALIZED_NAME_INSTANCE_IDS)
    private List<String> instanceIds = null;

    public static final String SERIALIZED_NAME_LUNS = "luns";

    @SerializedName(SERIALIZED_NAME_LUNS)
    private IscsiLunWhereInput luns;

    public static final String SERIALIZED_NAME_VM_NICS = "vmNics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private VmNicWhereInput vmNics;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private NicWhereInput nics;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private DiskWhereInput disks;

    public static final String SERIALIZED_NAME_VM_VOLUMES = "vmVolumes";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
    private VmVolumeWhereInput vmVolumes;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private VmWhereInput vms;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private HostWhereInput hosts;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private NetworkType network;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

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

    public static final String SERIALIZED_NAME_TITLE = "title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_METRIC_NAME = "metric_name";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME)
    private String metricName;

    public static final String SERIALIZED_NAME_CONNECT_ID = "connect_id";

    @SerializedName(SERIALIZED_NAME_CONNECT_ID)
    private List<String> connectId = null;

    public GraphUpdationParamsData() {}

    public GraphUpdationParamsData instanceIds(List<String> instanceIds) {

        this.instanceIds = instanceIds;
        return this;
    }

    public GraphUpdationParamsData addInstanceIdsItem(String instanceIdsItem) {
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

    public GraphUpdationParamsData instanceIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCE_IDS);
        return this;
    }

    public GraphUpdationParamsData instanceIds_ExplictlyNonNull() {
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

    public GraphUpdationParamsData luns(IscsiLunWhereInput luns) {

        this.luns = luns;
        return this;
    }

    /**
     * Get luns
     *
     * @return luns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getLuns() {
        return luns;
    }

    public void setLuns(IscsiLunWhereInput luns) {
        this.luns = luns;
    }

    public GraphUpdationParamsData luns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUNS);
        return this;
    }

    public GraphUpdationParamsData luns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUNS);
        return this;
    }

    public void setLuns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUNS);
        }
    }

    public boolean getLuns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUNS);
    }

    public GraphUpdationParamsData vmNics(VmNicWhereInput vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNics() {
        return vmNics;
    }

    public void setVmNics(VmNicWhereInput vmNics) {
        this.vmNics = vmNics;
    }

    public GraphUpdationParamsData vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public GraphUpdationParamsData vmNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public void setVmNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        }
    }

    public boolean getVmNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS);
    }

    public GraphUpdationParamsData nics(NicWhereInput nics) {

        this.nics = nics;
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNics() {
        return nics;
    }

    public void setNics(NicWhereInput nics) {
        this.nics = nics;
    }

    public GraphUpdationParamsData nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public GraphUpdationParamsData nics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS);
        return this;
    }

    public void setNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS);
        }
    }

    public boolean getNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS);
    }

    public GraphUpdationParamsData disks(DiskWhereInput disks) {

        this.disks = disks;
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisks() {
        return disks;
    }

    public void setDisks(DiskWhereInput disks) {
        this.disks = disks;
    }

    public GraphUpdationParamsData disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public GraphUpdationParamsData disks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        return this;
    }

    public void setDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        }
    }

    public boolean getDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS);
    }

    public GraphUpdationParamsData vmVolumes(VmVolumeWhereInput vmVolumes) {

        this.vmVolumes = vmVolumes;
        return this;
    }

    /**
     * Get vmVolumes
     *
     * @return vmVolumes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumes() {
        return vmVolumes;
    }

    public void setVmVolumes(VmVolumeWhereInput vmVolumes) {
        this.vmVolumes = vmVolumes;
    }

    public GraphUpdationParamsData vmVolumes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public GraphUpdationParamsData vmVolumes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public void setVmVolumes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES);
        }
    }

    public boolean getVmVolumes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES);
    }

    public GraphUpdationParamsData vms(VmWhereInput vms) {

        this.vms = vms;
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVms() {
        return vms;
    }

    public void setVms(VmWhereInput vms) {
        this.vms = vms;
    }

    public GraphUpdationParamsData vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public GraphUpdationParamsData vms_ExplictlyNonNull() {
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

    public GraphUpdationParamsData hosts(HostWhereInput hosts) {

        this.hosts = hosts;
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHosts() {
        return hosts;
    }

    public void setHosts(HostWhereInput hosts) {
        this.hosts = hosts;
    }

    public GraphUpdationParamsData hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public GraphUpdationParamsData hosts_ExplictlyNonNull() {
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

    public GraphUpdationParamsData network(NetworkType network) {

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

    public GraphUpdationParamsData network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public GraphUpdationParamsData network_ExplictlyNonNull() {
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

    public GraphUpdationParamsData cluster(ClusterWhereInput cluster) {

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
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public GraphUpdationParamsData cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public GraphUpdationParamsData cluster_ExplictlyNonNull() {
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

    public GraphUpdationParamsData service(String service) {

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

    public GraphUpdationParamsData service_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public GraphUpdationParamsData service_ExplictlyNonNull() {
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

    public GraphUpdationParamsData metricType(MetricType metricType) {

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

    public GraphUpdationParamsData metricType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE);
        return this;
    }

    public GraphUpdationParamsData metricType_ExplictlyNonNull() {
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

    public GraphUpdationParamsData metricCount(Integer metricCount) {

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

    public GraphUpdationParamsData metricCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT);
        return this;
    }

    public GraphUpdationParamsData metricCount_ExplictlyNonNull() {
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

    public GraphUpdationParamsData type(GraphType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GraphType getType() {
        return type;
    }

    public void setType(GraphType type) {
        this.type = type;
    }

    public GraphUpdationParamsData type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public GraphUpdationParamsData type_ExplictlyNonNull() {
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

    public GraphUpdationParamsData resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public GraphUpdationParamsData resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public GraphUpdationParamsData resourceType_ExplictlyNonNull() {
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

    public GraphUpdationParamsData title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GraphUpdationParamsData title_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE);
        return this;
    }

    public GraphUpdationParamsData title_ExplictlyNonNull() {
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

    public GraphUpdationParamsData metricName(String metricName) {

        this.metricName = metricName;
        return this;
    }

    /**
     * Get metricName
     *
     * @return metricName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public GraphUpdationParamsData metricName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public GraphUpdationParamsData metricName_ExplictlyNonNull() {
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

    public GraphUpdationParamsData connectId(List<String> connectId) {

        this.connectId = connectId;
        return this;
    }

    public GraphUpdationParamsData addConnectIdItem(String connectIdItem) {
        if (this.connectId == null) {
            this.connectId = new ArrayList<String>();
        }
        this.connectId.add(connectIdItem);
        return this;
    }

    /**
     * Get connectId
     *
     * @return connectId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getConnectId() {
        return connectId;
    }

    public void setConnectId(List<String> connectId) {
        this.connectId = connectId;
    }

    public GraphUpdationParamsData connectId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_ID);
        return this;
    }

    public GraphUpdationParamsData connectId_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GraphUpdationParamsData graphUpdationParamsData = (GraphUpdationParamsData) o;
        return Objects.equals(this.instanceIds, graphUpdationParamsData.instanceIds)
                && Objects.equals(this.luns, graphUpdationParamsData.luns)
                && Objects.equals(this.vmNics, graphUpdationParamsData.vmNics)
                && Objects.equals(this.nics, graphUpdationParamsData.nics)
                && Objects.equals(this.disks, graphUpdationParamsData.disks)
                && Objects.equals(this.vmVolumes, graphUpdationParamsData.vmVolumes)
                && Objects.equals(this.vms, graphUpdationParamsData.vms)
                && Objects.equals(this.hosts, graphUpdationParamsData.hosts)
                && Objects.equals(this.network, graphUpdationParamsData.network)
                && Objects.equals(this.cluster, graphUpdationParamsData.cluster)
                && Objects.equals(this.service, graphUpdationParamsData.service)
                && Objects.equals(this.metricType, graphUpdationParamsData.metricType)
                && Objects.equals(this.metricCount, graphUpdationParamsData.metricCount)
                && Objects.equals(this.type, graphUpdationParamsData.type)
                && Objects.equals(this.resourceType, graphUpdationParamsData.resourceType)
                && Objects.equals(this.title, graphUpdationParamsData.title)
                && Objects.equals(this.metricName, graphUpdationParamsData.metricName)
                && Objects.equals(this.connectId, graphUpdationParamsData.connectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                instanceIds,
                luns,
                vmNics,
                nics,
                disks,
                vmVolumes,
                vms,
                hosts,
                network,
                cluster,
                service,
                metricType,
                metricCount,
                type,
                resourceType,
                title,
                metricName,
                connectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphUpdationParamsData {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    luns: ").append(toIndentedString(luns)).append("\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    metricCount: ").append(toIndentedString(metricCount)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
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

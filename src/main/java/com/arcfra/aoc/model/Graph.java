package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Graph */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Graph extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private List<NestedDisk> disks = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private List<NestedHost> hosts = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INSTANCE_IDS = "instance_ids";

    @SerializedName(SERIALIZED_NAME_INSTANCE_IDS)
    private List<String> instanceIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LUNS = "luns";

    @SerializedName(SERIALIZED_NAME_LUNS)
    private List<NestedIscsiLun> luns = null;

    public static final String SERIALIZED_NAME_METRIC_COUNT = "metric_count";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT)
    private Integer metricCount;

    public static final String SERIALIZED_NAME_METRIC_NAME = "metric_name";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME)
    private String metricName;

    public static final String SERIALIZED_NAME_METRIC_TYPE = "metric_type";

    @SerializedName(SERIALIZED_NAME_METRIC_TYPE)
    private MetricType metricType;

    public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";

    @SerializedName(SERIALIZED_NAME_NAMESPACES)
    private List<NestedNvmfNamespace> namespaces = null;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private NetworkType network;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private List<NestedNic> nics = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_SERVICE = "service";

    @SerializedName(SERIALIZED_NAME_SERVICE)
    private String service;

    public static final String SERIALIZED_NAME_TARGETS = "targets";

    @SerializedName(SERIALIZED_NAME_TARGETS)
    private Object targets;

    public static final String SERIALIZED_NAME_TITLE = "title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private GraphType type;

    public static final String SERIALIZED_NAME_VIEW = "view";

    @SerializedName(SERIALIZED_NAME_VIEW)
    private NestedView view;

    public static final String SERIALIZED_NAME_VM_NICS = "vmNics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<NestedVmNic> vmNics = null;

    public static final String SERIALIZED_NAME_VM_VOLUMES = "vmVolumes";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
    private List<NestedVmVolume> vmVolumes = null;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public static final String SERIALIZED_NAME_WITNESSES = "witnesses";

    @SerializedName(SERIALIZED_NAME_WITNESSES)
    private List<NestedWitness> witnesses = null;

    public static final String SERIALIZED_NAME_ZONES = "zones";

    @SerializedName(SERIALIZED_NAME_ZONES)
    private List<NestedZone> zones = null;

    public Graph() {}

    public Graph cluster(NestedCluster cluster) {

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

    public Graph cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Graph cluster_ExplictlyNonNull() {
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

    public Graph disks(List<NestedDisk> disks) {

        this.disks = disks;
        return this;
    }

    public Graph addDisksItem(NestedDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<NestedDisk>();
        }
        this.disks.add(disksItem);
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<NestedDisk> disks) {
        this.disks = disks;
    }

    public Graph disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public Graph disks_ExplictlyNonNull() {
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

    public Graph entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public Graph entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Graph entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public Graph hosts(List<NestedHost> hosts) {

        this.hosts = hosts;
        return this;
    }

    public Graph addHostsItem(NestedHost hostsItem) {
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

    public Graph hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public Graph hosts_ExplictlyNonNull() {
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

    public Graph id(String id) {

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

    public Graph id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Graph id_ExplictlyNonNull() {
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

    public Graph instanceIds(List<String> instanceIds) {

        this.instanceIds = instanceIds;
        return this;
    }

    public Graph addInstanceIdsItem(String instanceIdsItem) {
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    /**
     * Get instanceIds
     *
     * @return instanceIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public Graph instanceIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCE_IDS);
        return this;
    }

    public Graph instanceIds_ExplictlyNonNull() {
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

    public Graph localId(String localId) {

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

    public Graph localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Graph localId_ExplictlyNonNull() {
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

    public Graph luns(List<NestedIscsiLun> luns) {

        this.luns = luns;
        return this;
    }

    public Graph addLunsItem(NestedIscsiLun lunsItem) {
        if (this.luns == null) {
            this.luns = new ArrayList<NestedIscsiLun>();
        }
        this.luns.add(lunsItem);
        return this;
    }

    /**
     * Get luns
     *
     * @return luns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiLun> getLuns() {
        return luns;
    }

    public void setLuns(List<NestedIscsiLun> luns) {
        this.luns = luns;
    }

    public Graph luns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUNS);
        return this;
    }

    public Graph luns_ExplictlyNonNull() {
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

    public Graph metricCount(Integer metricCount) {

        this.metricCount = metricCount;
        return this;
    }

    /**
     * Get metricCount
     *
     * @return metricCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getMetricCount() {
        return metricCount;
    }

    public void setMetricCount(Integer metricCount) {
        this.metricCount = metricCount;
    }

    public Graph metricCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT);
        return this;
    }

    public Graph metricCount_ExplictlyNonNull() {
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

    public Graph metricName(String metricName) {

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

    public Graph metricName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public Graph metricName_ExplictlyNonNull() {
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

    public Graph metricType(MetricType metricType) {

        this.metricType = metricType;
        return this;
    }

    /**
     * Get metricType
     *
     * @return metricType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public MetricType getMetricType() {
        return metricType;
    }

    public void setMetricType(MetricType metricType) {
        this.metricType = metricType;
    }

    public Graph metricType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE);
        return this;
    }

    public Graph metricType_ExplictlyNonNull() {
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

    public Graph namespaces(List<NestedNvmfNamespace> namespaces) {

        this.namespaces = namespaces;
        return this;
    }

    public Graph addNamespacesItem(NestedNvmfNamespace namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<NestedNvmfNamespace>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    /**
     * Get namespaces
     *
     * @return namespaces
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNvmfNamespace> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<NestedNvmfNamespace> namespaces) {
        this.namespaces = namespaces;
    }

    public Graph namespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES);
        return this;
    }

    public Graph namespaces_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES);
        return this;
    }

    public void setNamespaces_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES);
        }
    }

    public boolean getNamespaces_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES);
    }

    public Graph network(NetworkType network) {

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

    public Graph network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public Graph network_ExplictlyNonNull() {
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

    public Graph nics(List<NestedNic> nics) {

        this.nics = nics;
        return this;
    }

    public Graph addNicsItem(NestedNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<NestedNic>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNic> getNics() {
        return nics;
    }

    public void setNics(List<NestedNic> nics) {
        this.nics = nics;
    }

    public Graph nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public Graph nics_ExplictlyNonNull() {
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

    public Graph resourceType(String resourceType) {

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

    public Graph resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public Graph resourceType_ExplictlyNonNull() {
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

    public Graph service(String service) {

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

    public Graph service_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public Graph service_ExplictlyNonNull() {
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

    public Graph targets(Object targets) {

        this.targets = targets;
        return this;
    }

    /**
     * Get targets
     *
     * @return targets
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getTargets() {
        return targets;
    }

    public void setTargets(Object targets) {
        this.targets = targets;
    }

    public Graph targets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGETS);
        return this;
    }

    public Graph targets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGETS);
        return this;
    }

    public void setTargets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGETS);
        }
    }

    public boolean getTargets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGETS);
    }

    public Graph title(String title) {

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

    public Graph title_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE);
        return this;
    }

    public Graph title_ExplictlyNonNull() {
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

    public Graph type(GraphType type) {

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

    public Graph type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Graph type_ExplictlyNonNull() {
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

    public Graph view(NestedView view) {

        this.view = view;
        return this;
    }

    /**
     * Get view
     *
     * @return view
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedView getView() {
        return view;
    }

    public void setView(NestedView view) {
        this.view = view;
    }

    public Graph view_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIEW);
        return this;
    }

    public Graph view_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIEW);
        return this;
    }

    public void setView_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIEW);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIEW);
        }
    }

    public boolean getView_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIEW);
    }

    public Graph vmNics(List<NestedVmNic> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public Graph addVmNicsItem(NestedVmNic vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<NestedVmNic>();
        }
        this.vmNics.add(vmNicsItem);
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmNic> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<NestedVmNic> vmNics) {
        this.vmNics = vmNics;
    }

    public Graph vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public Graph vmNics_ExplictlyNonNull() {
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

    public Graph vmVolumes(List<NestedVmVolume> vmVolumes) {

        this.vmVolumes = vmVolumes;
        return this;
    }

    public Graph addVmVolumesItem(NestedVmVolume vmVolumesItem) {
        if (this.vmVolumes == null) {
            this.vmVolumes = new ArrayList<NestedVmVolume>();
        }
        this.vmVolumes.add(vmVolumesItem);
        return this;
    }

    /**
     * Get vmVolumes
     *
     * @return vmVolumes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmVolume> getVmVolumes() {
        return vmVolumes;
    }

    public void setVmVolumes(List<NestedVmVolume> vmVolumes) {
        this.vmVolumes = vmVolumes;
    }

    public Graph vmVolumes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public Graph vmVolumes_ExplictlyNonNull() {
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

    public Graph vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public Graph addVmsItem(NestedVm vmsItem) {
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

    public Graph vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public Graph vms_ExplictlyNonNull() {
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

    public Graph witnesses(List<NestedWitness> witnesses) {

        this.witnesses = witnesses;
        return this;
    }

    public Graph addWitnessesItem(NestedWitness witnessesItem) {
        if (this.witnesses == null) {
            this.witnesses = new ArrayList<NestedWitness>();
        }
        this.witnesses.add(witnessesItem);
        return this;
    }

    /**
     * Get witnesses
     *
     * @return witnesses
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedWitness> getWitnesses() {
        return witnesses;
    }

    public void setWitnesses(List<NestedWitness> witnesses) {
        this.witnesses = witnesses;
    }

    public Graph witnesses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESSES);
        return this;
    }

    public Graph witnesses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESSES);
        return this;
    }

    public void setWitnesses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESSES);
        }
    }

    public boolean getWitnesses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESSES);
    }

    public Graph zones(List<NestedZone> zones) {

        this.zones = zones;
        return this;
    }

    public Graph addZonesItem(NestedZone zonesItem) {
        if (this.zones == null) {
            this.zones = new ArrayList<NestedZone>();
        }
        this.zones.add(zonesItem);
        return this;
    }

    /**
     * Get zones
     *
     * @return zones
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedZone> getZones() {
        return zones;
    }

    public void setZones(List<NestedZone> zones) {
        this.zones = zones;
    }

    public Graph zones_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES);
        return this;
    }

    public Graph zones_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES);
        return this;
    }

    public void setZones_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES);
        }
    }

    public boolean getZones_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Graph graph = (Graph) o;
        return Objects.equals(this.cluster, graph.cluster)
                && Objects.equals(this.disks, graph.disks)
                && Objects.equals(this.entityAsyncStatus, graph.entityAsyncStatus)
                && Objects.equals(this.hosts, graph.hosts)
                && Objects.equals(this.id, graph.id)
                && Objects.equals(this.instanceIds, graph.instanceIds)
                && Objects.equals(this.localId, graph.localId)
                && Objects.equals(this.luns, graph.luns)
                && Objects.equals(this.metricCount, graph.metricCount)
                && Objects.equals(this.metricName, graph.metricName)
                && Objects.equals(this.metricType, graph.metricType)
                && Objects.equals(this.namespaces, graph.namespaces)
                && Objects.equals(this.network, graph.network)
                && Objects.equals(this.nics, graph.nics)
                && Objects.equals(this.resourceType, graph.resourceType)
                && Objects.equals(this.service, graph.service)
                && Objects.equals(this.targets, graph.targets)
                && Objects.equals(this.title, graph.title)
                && Objects.equals(this.type, graph.type)
                && Objects.equals(this.view, graph.view)
                && Objects.equals(this.vmNics, graph.vmNics)
                && Objects.equals(this.vmVolumes, graph.vmVolumes)
                && Objects.equals(this.vms, graph.vms)
                && Objects.equals(this.witnesses, graph.witnesses)
                && Objects.equals(this.zones, graph.zones);
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
                disks,
                entityAsyncStatus,
                hosts,
                id,
                instanceIds,
                localId,
                luns,
                metricCount,
                metricName,
                metricType,
                namespaces,
                network,
                nics,
                resourceType,
                service,
                targets,
                title,
                type,
                view,
                vmNics,
                vmVolumes,
                vms,
                witnesses,
                zones);
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
        sb.append("class Graph {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    luns: ").append(toIndentedString(luns)).append("\n");
        sb.append("    metricCount: ").append(toIndentedString(metricCount)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
        sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    witnesses: ").append(toIndentedString(witnesses)).append("\n");
        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

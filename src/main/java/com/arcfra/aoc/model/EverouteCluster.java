package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EverouteCluster */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EverouteCluster extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AGENT_ELF_CLUSTERS = "agent_elf_clusters";

    @SerializedName(SERIALIZED_NAME_AGENT_ELF_CLUSTERS)
    private List<NestedCluster> agentElfClusters = null;

    public static final String SERIALIZED_NAME_AGENT_ELF_VDSES = "agent_elf_vdses";

    @SerializedName(SERIALIZED_NAME_AGENT_ELF_VDSES)
    private List<NestedVds> agentElfVdses = null;

    public static final String SERIALIZED_NAME_CONTROLLER_INSTANCES = "controller_instances";

    @SerializedName(SERIALIZED_NAME_CONTROLLER_INSTANCES)
    private List<NestedEverouteControllerInstance> controllerInstances =
            new ArrayList<NestedEverouteControllerInstance>();

    public static final String SERIALIZED_NAME_CONTROLLER_TEMPLATE = "controller_template";

    @SerializedName(SERIALIZED_NAME_CONTROLLER_TEMPLATE)
    private NestedEverouteControllerTemplate controllerTemplate;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION = "global_default_action";

    @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION)
    private GlobalPolicyAction globalDefaultAction;

    public static final String SERIALIZED_NAME_GLOBAL_WHITELIST = "global_whitelist";

    @SerializedName(SERIALIZED_NAME_GLOBAL_WHITELIST)
    private NestedEverouteClusterWhitelist globalWhitelist;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INSTALLED = "installed";

    @SerializedName(SERIALIZED_NAME_INSTALLED)
    private Boolean installed;

    public static final String SERIALIZED_NAME_LOAD_BALANCER_SERVICE = "load_balancer_service";

    @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_SERVICE)
    private NestedLoadBalancerService loadBalancerService;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private EverouteClusterPhase phase;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private NestedEverouteClusterStatus status;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";

    @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
    private NestedVirtualPrivateCloudService vpcService;

    public EverouteCluster() {}

    public EverouteCluster agentElfClusters(List<NestedCluster> agentElfClusters) {

        this.agentElfClusters = agentElfClusters;
        return this;
    }

    public EverouteCluster addAgentElfClustersItem(NestedCluster agentElfClustersItem) {
        if (this.agentElfClusters == null) {
            this.agentElfClusters = new ArrayList<NestedCluster>();
        }
        this.agentElfClusters.add(agentElfClustersItem);
        return this;
    }

    /**
     * Get agentElfClusters
     *
     * @return agentElfClusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCluster> getAgentElfClusters() {
        return agentElfClusters;
    }

    public void setAgentElfClusters(List<NestedCluster> agentElfClusters) {
        this.agentElfClusters = agentElfClusters;
    }

    public EverouteCluster agentElfClusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AGENT_ELF_CLUSTERS);
        return this;
    }

    public EverouteCluster agentElfClusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AGENT_ELF_CLUSTERS);
        return this;
    }

    public void setAgentElfClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AGENT_ELF_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AGENT_ELF_CLUSTERS);
        }
    }

    public boolean getAgentElfClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AGENT_ELF_CLUSTERS);
    }

    public EverouteCluster agentElfVdses(List<NestedVds> agentElfVdses) {

        this.agentElfVdses = agentElfVdses;
        return this;
    }

    public EverouteCluster addAgentElfVdsesItem(NestedVds agentElfVdsesItem) {
        if (this.agentElfVdses == null) {
            this.agentElfVdses = new ArrayList<NestedVds>();
        }
        this.agentElfVdses.add(agentElfVdsesItem);
        return this;
    }

    /**
     * Get agentElfVdses
     *
     * @return agentElfVdses
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVds> getAgentElfVdses() {
        return agentElfVdses;
    }

    public void setAgentElfVdses(List<NestedVds> agentElfVdses) {
        this.agentElfVdses = agentElfVdses;
    }

    public EverouteCluster agentElfVdses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AGENT_ELF_VDSES);
        return this;
    }

    public EverouteCluster agentElfVdses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AGENT_ELF_VDSES);
        return this;
    }

    public void setAgentElfVdses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AGENT_ELF_VDSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AGENT_ELF_VDSES);
        }
    }

    public boolean getAgentElfVdses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AGENT_ELF_VDSES);
    }

    public EverouteCluster controllerInstances(
            List<NestedEverouteControllerInstance> controllerInstances) {

        this.controllerInstances = controllerInstances;
        return this;
    }

    public EverouteCluster addControllerInstancesItem(
            NestedEverouteControllerInstance controllerInstancesItem) {
        this.controllerInstances.add(controllerInstancesItem);
        return this;
    }

    /**
     * Get controllerInstances
     *
     * @return controllerInstances
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedEverouteControllerInstance> getControllerInstances() {
        return controllerInstances;
    }

    public void setControllerInstances(List<NestedEverouteControllerInstance> controllerInstances) {
        this.controllerInstances = controllerInstances;
    }

    public EverouteCluster controllerInstances_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTROLLER_INSTANCES);
        return this;
    }

    public EverouteCluster controllerInstances_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTROLLER_INSTANCES);
        return this;
    }

    public void setControllerInstances_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTROLLER_INSTANCES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTROLLER_INSTANCES);
        }
    }

    public boolean getControllerInstances_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTROLLER_INSTANCES);
    }

    public EverouteCluster controllerTemplate(NestedEverouteControllerTemplate controllerTemplate) {

        this.controllerTemplate = controllerTemplate;
        return this;
    }

    /**
     * Get controllerTemplate
     *
     * @return controllerTemplate
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedEverouteControllerTemplate getControllerTemplate() {
        return controllerTemplate;
    }

    public void setControllerTemplate(NestedEverouteControllerTemplate controllerTemplate) {
        this.controllerTemplate = controllerTemplate;
    }

    public EverouteCluster controllerTemplate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTROLLER_TEMPLATE);
        return this;
    }

    public EverouteCluster controllerTemplate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTROLLER_TEMPLATE);
        return this;
    }

    public void setControllerTemplate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTROLLER_TEMPLATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTROLLER_TEMPLATE);
        }
    }

    public boolean getControllerTemplate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTROLLER_TEMPLATE);
    }

    public EverouteCluster entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public EverouteCluster entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public EverouteCluster entityAsyncStatus_ExplictlyNonNull() {
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

    public EverouteCluster globalDefaultAction(GlobalPolicyAction globalDefaultAction) {

        this.globalDefaultAction = globalDefaultAction;
        return this;
    }

    /**
     * Get globalDefaultAction
     *
     * @return globalDefaultAction
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public GlobalPolicyAction getGlobalDefaultAction() {
        return globalDefaultAction;
    }

    public void setGlobalDefaultAction(GlobalPolicyAction globalDefaultAction) {
        this.globalDefaultAction = globalDefaultAction;
    }

    public EverouteCluster globalDefaultAction_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION);
        return this;
    }

    public EverouteCluster globalDefaultAction_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION);
        return this;
    }

    public void setGlobalDefaultAction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION);
        }
    }

    public boolean getGlobalDefaultAction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GLOBAL_DEFAULT_ACTION);
    }

    public EverouteCluster globalWhitelist(NestedEverouteClusterWhitelist globalWhitelist) {

        this.globalWhitelist = globalWhitelist;
        return this;
    }

    /**
     * Get globalWhitelist
     *
     * @return globalWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteClusterWhitelist getGlobalWhitelist() {
        return globalWhitelist;
    }

    public void setGlobalWhitelist(NestedEverouteClusterWhitelist globalWhitelist) {
        this.globalWhitelist = globalWhitelist;
    }

    public EverouteCluster globalWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GLOBAL_WHITELIST);
        return this;
    }

    public EverouteCluster globalWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_WHITELIST);
        return this;
    }

    public void setGlobalWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GLOBAL_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_WHITELIST);
        }
    }

    public boolean getGlobalWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GLOBAL_WHITELIST);
    }

    public EverouteCluster id(String id) {

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

    public EverouteCluster id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EverouteCluster id_ExplictlyNonNull() {
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

    public EverouteCluster installed(Boolean installed) {

        this.installed = installed;
        return this;
    }

    /**
     * Get installed
     *
     * @return installed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }

    public EverouteCluster installed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTALLED);
        return this;
    }

    public EverouteCluster installed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTALLED);
        return this;
    }

    public void setInstalled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTALLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTALLED);
        }
    }

    public boolean getInstalled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTALLED);
    }

    public EverouteCluster loadBalancerService(NestedLoadBalancerService loadBalancerService) {

        this.loadBalancerService = loadBalancerService;
        return this;
    }

    /**
     * Get loadBalancerService
     *
     * @return loadBalancerService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedLoadBalancerService getLoadBalancerService() {
        return loadBalancerService;
    }

    public void setLoadBalancerService(NestedLoadBalancerService loadBalancerService) {
        this.loadBalancerService = loadBalancerService;
    }

    public EverouteCluster loadBalancerService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        return this;
    }

    public EverouteCluster loadBalancerService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        return this;
    }

    public void setLoadBalancerService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
        }
    }

    public boolean getLoadBalancerService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOAD_BALANCER_SERVICE);
    }

    public EverouteCluster name(String name) {

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

    public EverouteCluster name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public EverouteCluster name_ExplictlyNonNull() {
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

    public EverouteCluster phase(EverouteClusterPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterPhase getPhase() {
        return phase;
    }

    public void setPhase(EverouteClusterPhase phase) {
        this.phase = phase;
    }

    public EverouteCluster phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public EverouteCluster phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public EverouteCluster status(NestedEverouteClusterStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteClusterStatus getStatus() {
        return status;
    }

    public void setStatus(NestedEverouteClusterStatus status) {
        this.status = status;
    }

    public EverouteCluster status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public EverouteCluster status_ExplictlyNonNull() {
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

    public EverouteCluster version(String version) {

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

    public EverouteCluster version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public EverouteCluster version_ExplictlyNonNull() {
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

    public EverouteCluster vpcService(NestedVirtualPrivateCloudService vpcService) {

        this.vpcService = vpcService;
        return this;
    }

    /**
     * Get vpcService
     *
     * @return vpcService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudService getVpcService() {
        return vpcService;
    }

    public void setVpcService(NestedVirtualPrivateCloudService vpcService) {
        this.vpcService = vpcService;
    }

    public EverouteCluster vpcService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public EverouteCluster vpcService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public void setVpcService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        }
    }

    public boolean getVpcService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SERVICE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EverouteCluster everouteCluster = (EverouteCluster) o;
        return Objects.equals(this.agentElfClusters, everouteCluster.agentElfClusters)
                && Objects.equals(this.agentElfVdses, everouteCluster.agentElfVdses)
                && Objects.equals(this.controllerInstances, everouteCluster.controllerInstances)
                && Objects.equals(this.controllerTemplate, everouteCluster.controllerTemplate)
                && Objects.equals(this.entityAsyncStatus, everouteCluster.entityAsyncStatus)
                && Objects.equals(this.globalDefaultAction, everouteCluster.globalDefaultAction)
                && Objects.equals(this.globalWhitelist, everouteCluster.globalWhitelist)
                && Objects.equals(this.id, everouteCluster.id)
                && Objects.equals(this.installed, everouteCluster.installed)
                && Objects.equals(this.loadBalancerService, everouteCluster.loadBalancerService)
                && Objects.equals(this.name, everouteCluster.name)
                && Objects.equals(this.phase, everouteCluster.phase)
                && Objects.equals(this.status, everouteCluster.status)
                && Objects.equals(this.version, everouteCluster.version)
                && Objects.equals(this.vpcService, everouteCluster.vpcService);
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
                agentElfClusters,
                agentElfVdses,
                controllerInstances,
                controllerTemplate,
                entityAsyncStatus,
                globalDefaultAction,
                globalWhitelist,
                id,
                installed,
                loadBalancerService,
                name,
                phase,
                status,
                version,
                vpcService);
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
        sb.append("class EverouteCluster {\n");
        sb.append("    agentElfClusters: ").append(toIndentedString(agentElfClusters)).append("\n");
        sb.append("    agentElfVdses: ").append(toIndentedString(agentElfVdses)).append("\n");
        sb.append("    controllerInstances: ")
                .append(toIndentedString(controllerInstances))
                .append("\n");
        sb.append("    controllerTemplate: ")
                .append(toIndentedString(controllerTemplate))
                .append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    globalDefaultAction: ")
                .append(toIndentedString(globalDefaultAction))
                .append("\n");
        sb.append("    globalWhitelist: ").append(toIndentedString(globalWhitelist)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
        sb.append("    loadBalancerService: ")
                .append(toIndentedString(loadBalancerService))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vpcService: ").append(toIndentedString(vpcService)).append("\n");
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

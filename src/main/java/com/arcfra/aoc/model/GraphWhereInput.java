package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GraphWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GraphWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<GraphWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<GraphWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<GraphWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DISKS_EVERY = "disks_every";

    @SerializedName(SERIALIZED_NAME_DISKS_EVERY)
    private DiskWhereInput disksEvery;

    public static final String SERIALIZED_NAME_DISKS_NONE = "disks_none";

    @SerializedName(SERIALIZED_NAME_DISKS_NONE)
    private DiskWhereInput disksNone;

    public static final String SERIALIZED_NAME_DISKS_SOME = "disks_some";

    @SerializedName(SERIALIZED_NAME_DISKS_SOME)
    private DiskWhereInput disksSome;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_HOSTS_EVERY = "hosts_every";

    @SerializedName(SERIALIZED_NAME_HOSTS_EVERY)
    private HostWhereInput hostsEvery;

    public static final String SERIALIZED_NAME_HOSTS_NONE = "hosts_none";

    @SerializedName(SERIALIZED_NAME_HOSTS_NONE)
    private HostWhereInput hostsNone;

    public static final String SERIALIZED_NAME_HOSTS_SOME = "hosts_some";

    @SerializedName(SERIALIZED_NAME_HOSTS_SOME)
    private HostWhereInput hostsSome;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_LUNS_EVERY = "luns_every";

    @SerializedName(SERIALIZED_NAME_LUNS_EVERY)
    private IscsiLunWhereInput lunsEvery;

    public static final String SERIALIZED_NAME_LUNS_NONE = "luns_none";

    @SerializedName(SERIALIZED_NAME_LUNS_NONE)
    private IscsiLunWhereInput lunsNone;

    public static final String SERIALIZED_NAME_LUNS_SOME = "luns_some";

    @SerializedName(SERIALIZED_NAME_LUNS_SOME)
    private IscsiLunWhereInput lunsSome;

    public static final String SERIALIZED_NAME_METRIC_COUNT = "metric_count";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT)
    private Integer metricCount;

    public static final String SERIALIZED_NAME_METRIC_COUNT_GT = "metric_count_gt";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_GT)
    private Integer metricCountGt;

    public static final String SERIALIZED_NAME_METRIC_COUNT_GTE = "metric_count_gte";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_GTE)
    private Integer metricCountGte;

    public static final String SERIALIZED_NAME_METRIC_COUNT_IN = "metric_count_in";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_IN)
    private List<Integer> metricCountIn = null;

    public static final String SERIALIZED_NAME_METRIC_COUNT_LT = "metric_count_lt";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_LT)
    private Integer metricCountLt;

    public static final String SERIALIZED_NAME_METRIC_COUNT_LTE = "metric_count_lte";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_LTE)
    private Integer metricCountLte;

    public static final String SERIALIZED_NAME_METRIC_COUNT_NOT = "metric_count_not";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_NOT)
    private Integer metricCountNot;

    public static final String SERIALIZED_NAME_METRIC_COUNT_NOT_IN = "metric_count_not_in";

    @SerializedName(SERIALIZED_NAME_METRIC_COUNT_NOT_IN)
    private List<Integer> metricCountNotIn = null;

    public static final String SERIALIZED_NAME_METRIC_NAME = "metric_name";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME)
    private String metricName;

    public static final String SERIALIZED_NAME_METRIC_NAME_CONTAINS = "metric_name_contains";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_CONTAINS)
    private String metricNameContains;

    public static final String SERIALIZED_NAME_METRIC_NAME_ENDS_WITH = "metric_name_ends_with";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_ENDS_WITH)
    private String metricNameEndsWith;

    public static final String SERIALIZED_NAME_METRIC_NAME_GT = "metric_name_gt";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_GT)
    private String metricNameGt;

    public static final String SERIALIZED_NAME_METRIC_NAME_GTE = "metric_name_gte";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_GTE)
    private String metricNameGte;

    public static final String SERIALIZED_NAME_METRIC_NAME_IN = "metric_name_in";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_IN)
    private List<String> metricNameIn = null;

    public static final String SERIALIZED_NAME_METRIC_NAME_LT = "metric_name_lt";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_LT)
    private String metricNameLt;

    public static final String SERIALIZED_NAME_METRIC_NAME_LTE = "metric_name_lte";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_LTE)
    private String metricNameLte;

    public static final String SERIALIZED_NAME_METRIC_NAME_NOT = "metric_name_not";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_NOT)
    private String metricNameNot;

    public static final String SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS =
            "metric_name_not_contains";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS)
    private String metricNameNotContains;

    public static final String SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH =
            "metric_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH)
    private String metricNameNotEndsWith;

    public static final String SERIALIZED_NAME_METRIC_NAME_NOT_IN = "metric_name_not_in";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_NOT_IN)
    private List<String> metricNameNotIn = null;

    public static final String SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH =
            "metric_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH)
    private String metricNameNotStartsWith;

    public static final String SERIALIZED_NAME_METRIC_NAME_STARTS_WITH = "metric_name_starts_with";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME_STARTS_WITH)
    private String metricNameStartsWith;

    public static final String SERIALIZED_NAME_METRIC_TYPE = "metric_type";

    @SerializedName(SERIALIZED_NAME_METRIC_TYPE)
    private MetricType metricType;

    public static final String SERIALIZED_NAME_METRIC_TYPE_IN = "metric_type_in";

    @SerializedName(SERIALIZED_NAME_METRIC_TYPE_IN)
    private List<MetricType> metricTypeIn = null;

    public static final String SERIALIZED_NAME_METRIC_TYPE_NOT = "metric_type_not";

    @SerializedName(SERIALIZED_NAME_METRIC_TYPE_NOT)
    private MetricType metricTypeNot;

    public static final String SERIALIZED_NAME_METRIC_TYPE_NOT_IN = "metric_type_not_in";

    @SerializedName(SERIALIZED_NAME_METRIC_TYPE_NOT_IN)
    private List<MetricType> metricTypeNotIn = null;

    public static final String SERIALIZED_NAME_NAMESPACES_EVERY = "namespaces_every";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_EVERY)
    private NvmfNamespaceWhereInput namespacesEvery;

    public static final String SERIALIZED_NAME_NAMESPACES_NONE = "namespaces_none";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_NONE)
    private NvmfNamespaceWhereInput namespacesNone;

    public static final String SERIALIZED_NAME_NAMESPACES_SOME = "namespaces_some";

    @SerializedName(SERIALIZED_NAME_NAMESPACES_SOME)
    private NvmfNamespaceWhereInput namespacesSome;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private NetworkType network;

    public static final String SERIALIZED_NAME_NETWORK_IN = "network_in";

    @SerializedName(SERIALIZED_NAME_NETWORK_IN)
    private List<NetworkType> networkIn = null;

    public static final String SERIALIZED_NAME_NETWORK_NOT = "network_not";

    @SerializedName(SERIALIZED_NAME_NETWORK_NOT)
    private NetworkType networkNot;

    public static final String SERIALIZED_NAME_NETWORK_NOT_IN = "network_not_in";

    @SerializedName(SERIALIZED_NAME_NETWORK_NOT_IN)
    private List<NetworkType> networkNotIn = null;

    public static final String SERIALIZED_NAME_NICS_EVERY = "nics_every";

    @SerializedName(SERIALIZED_NAME_NICS_EVERY)
    private NicWhereInput nicsEvery;

    public static final String SERIALIZED_NAME_NICS_NONE = "nics_none";

    @SerializedName(SERIALIZED_NAME_NICS_NONE)
    private NicWhereInput nicsNone;

    public static final String SERIALIZED_NAME_NICS_SOME = "nics_some";

    @SerializedName(SERIALIZED_NAME_NICS_SOME)
    private NicWhereInput nicsSome;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS = "resource_type_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS)
    private String resourceTypeContains;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH = "resource_type_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH)
    private String resourceTypeEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_GT = "resource_type_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GT)
    private String resourceTypeGt;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_GTE = "resource_type_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GTE)
    private String resourceTypeGte;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_IN = "resource_type_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_IN)
    private List<String> resourceTypeIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_LT = "resource_type_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LT)
    private String resourceTypeLt;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_LTE = "resource_type_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LTE)
    private String resourceTypeLte;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT = "resource_type_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT)
    private String resourceTypeNot;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS =
            "resource_type_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS)
    private String resourceTypeNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH =
            "resource_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH)
    private String resourceTypeNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN = "resource_type_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN)
    private List<String> resourceTypeNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH =
            "resource_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH)
    private String resourceTypeNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH =
            "resource_type_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH)
    private String resourceTypeStartsWith;

    public static final String SERIALIZED_NAME_SERVICE = "service";

    @SerializedName(SERIALIZED_NAME_SERVICE)
    private String service;

    public static final String SERIALIZED_NAME_SERVICE_CONTAINS = "service_contains";

    @SerializedName(SERIALIZED_NAME_SERVICE_CONTAINS)
    private String serviceContains;

    public static final String SERIALIZED_NAME_SERVICE_ENDS_WITH = "service_ends_with";

    @SerializedName(SERIALIZED_NAME_SERVICE_ENDS_WITH)
    private String serviceEndsWith;

    public static final String SERIALIZED_NAME_SERVICE_GT = "service_gt";

    @SerializedName(SERIALIZED_NAME_SERVICE_GT)
    private String serviceGt;

    public static final String SERIALIZED_NAME_SERVICE_GTE = "service_gte";

    @SerializedName(SERIALIZED_NAME_SERVICE_GTE)
    private String serviceGte;

    public static final String SERIALIZED_NAME_SERVICE_IN = "service_in";

    @SerializedName(SERIALIZED_NAME_SERVICE_IN)
    private List<String> serviceIn = null;

    public static final String SERIALIZED_NAME_SERVICE_LT = "service_lt";

    @SerializedName(SERIALIZED_NAME_SERVICE_LT)
    private String serviceLt;

    public static final String SERIALIZED_NAME_SERVICE_LTE = "service_lte";

    @SerializedName(SERIALIZED_NAME_SERVICE_LTE)
    private String serviceLte;

    public static final String SERIALIZED_NAME_SERVICE_NOT = "service_not";

    @SerializedName(SERIALIZED_NAME_SERVICE_NOT)
    private String serviceNot;

    public static final String SERIALIZED_NAME_SERVICE_NOT_CONTAINS = "service_not_contains";

    @SerializedName(SERIALIZED_NAME_SERVICE_NOT_CONTAINS)
    private String serviceNotContains;

    public static final String SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH = "service_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH)
    private String serviceNotEndsWith;

    public static final String SERIALIZED_NAME_SERVICE_NOT_IN = "service_not_in";

    @SerializedName(SERIALIZED_NAME_SERVICE_NOT_IN)
    private List<String> serviceNotIn = null;

    public static final String SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH = "service_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH)
    private String serviceNotStartsWith;

    public static final String SERIALIZED_NAME_SERVICE_STARTS_WITH = "service_starts_with";

    @SerializedName(SERIALIZED_NAME_SERVICE_STARTS_WITH)
    private String serviceStartsWith;

    public static final String SERIALIZED_NAME_TITLE = "title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_TITLE_CONTAINS = "title_contains";

    @SerializedName(SERIALIZED_NAME_TITLE_CONTAINS)
    private String titleContains;

    public static final String SERIALIZED_NAME_TITLE_ENDS_WITH = "title_ends_with";

    @SerializedName(SERIALIZED_NAME_TITLE_ENDS_WITH)
    private String titleEndsWith;

    public static final String SERIALIZED_NAME_TITLE_GT = "title_gt";

    @SerializedName(SERIALIZED_NAME_TITLE_GT)
    private String titleGt;

    public static final String SERIALIZED_NAME_TITLE_GTE = "title_gte";

    @SerializedName(SERIALIZED_NAME_TITLE_GTE)
    private String titleGte;

    public static final String SERIALIZED_NAME_TITLE_IN = "title_in";

    @SerializedName(SERIALIZED_NAME_TITLE_IN)
    private List<String> titleIn = null;

    public static final String SERIALIZED_NAME_TITLE_LT = "title_lt";

    @SerializedName(SERIALIZED_NAME_TITLE_LT)
    private String titleLt;

    public static final String SERIALIZED_NAME_TITLE_LTE = "title_lte";

    @SerializedName(SERIALIZED_NAME_TITLE_LTE)
    private String titleLte;

    public static final String SERIALIZED_NAME_TITLE_NOT = "title_not";

    @SerializedName(SERIALIZED_NAME_TITLE_NOT)
    private String titleNot;

    public static final String SERIALIZED_NAME_TITLE_NOT_CONTAINS = "title_not_contains";

    @SerializedName(SERIALIZED_NAME_TITLE_NOT_CONTAINS)
    private String titleNotContains;

    public static final String SERIALIZED_NAME_TITLE_NOT_ENDS_WITH = "title_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TITLE_NOT_ENDS_WITH)
    private String titleNotEndsWith;

    public static final String SERIALIZED_NAME_TITLE_NOT_IN = "title_not_in";

    @SerializedName(SERIALIZED_NAME_TITLE_NOT_IN)
    private List<String> titleNotIn = null;

    public static final String SERIALIZED_NAME_TITLE_NOT_STARTS_WITH = "title_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TITLE_NOT_STARTS_WITH)
    private String titleNotStartsWith;

    public static final String SERIALIZED_NAME_TITLE_STARTS_WITH = "title_starts_with";

    @SerializedName(SERIALIZED_NAME_TITLE_STARTS_WITH)
    private String titleStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private GraphType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<GraphType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private GraphType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<GraphType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VIEW = "view";

    @SerializedName(SERIALIZED_NAME_VIEW)
    private ViewWhereInput view;

    public static final String SERIALIZED_NAME_VM_NICS_EVERY = "vmNics_every";

    @SerializedName(SERIALIZED_NAME_VM_NICS_EVERY)
    private VmNicWhereInput vmNicsEvery;

    public static final String SERIALIZED_NAME_VM_NICS_NONE = "vmNics_none";

    @SerializedName(SERIALIZED_NAME_VM_NICS_NONE)
    private VmNicWhereInput vmNicsNone;

    public static final String SERIALIZED_NAME_VM_NICS_SOME = "vmNics_some";

    @SerializedName(SERIALIZED_NAME_VM_NICS_SOME)
    private VmNicWhereInput vmNicsSome;

    public static final String SERIALIZED_NAME_VM_VOLUMES_EVERY = "vmVolumes_every";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES_EVERY)
    private VmVolumeWhereInput vmVolumesEvery;

    public static final String SERIALIZED_NAME_VM_VOLUMES_NONE = "vmVolumes_none";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES_NONE)
    private VmVolumeWhereInput vmVolumesNone;

    public static final String SERIALIZED_NAME_VM_VOLUMES_SOME = "vmVolumes_some";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES_SOME)
    private VmVolumeWhereInput vmVolumesSome;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public static final String SERIALIZED_NAME_WITNESSES_EVERY = "witnesses_every";

    @SerializedName(SERIALIZED_NAME_WITNESSES_EVERY)
    private WitnessWhereInput witnessesEvery;

    public static final String SERIALIZED_NAME_WITNESSES_NONE = "witnesses_none";

    @SerializedName(SERIALIZED_NAME_WITNESSES_NONE)
    private WitnessWhereInput witnessesNone;

    public static final String SERIALIZED_NAME_WITNESSES_SOME = "witnesses_some";

    @SerializedName(SERIALIZED_NAME_WITNESSES_SOME)
    private WitnessWhereInput witnessesSome;

    public static final String SERIALIZED_NAME_ZONES_EVERY = "zones_every";

    @SerializedName(SERIALIZED_NAME_ZONES_EVERY)
    private ZoneWhereInput zonesEvery;

    public static final String SERIALIZED_NAME_ZONES_NONE = "zones_none";

    @SerializedName(SERIALIZED_NAME_ZONES_NONE)
    private ZoneWhereInput zonesNone;

    public static final String SERIALIZED_NAME_ZONES_SOME = "zones_some";

    @SerializedName(SERIALIZED_NAME_ZONES_SOME)
    private ZoneWhereInput zonesSome;

    public GraphWhereInput() {}

    public GraphWhereInput AND(List<GraphWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public GraphWhereInput addANDItem(GraphWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<GraphWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<GraphWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<GraphWhereInput> AND) {
        this.AND = AND;
    }

    public GraphWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public GraphWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public GraphWhereInput NOT(List<GraphWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public GraphWhereInput addNOTItem(GraphWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<GraphWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<GraphWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<GraphWhereInput> NOT) {
        this.NOT = NOT;
    }

    public GraphWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public GraphWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public GraphWhereInput OR(List<GraphWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public GraphWhereInput addORItem(GraphWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<GraphWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<GraphWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<GraphWhereInput> OR) {
        this.OR = OR;
    }

    public GraphWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public GraphWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public GraphWhereInput cluster(ClusterWhereInput cluster) {

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

    public GraphWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public GraphWhereInput cluster_ExplictlyNonNull() {
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

    public GraphWhereInput disksEvery(DiskWhereInput disksEvery) {

        this.disksEvery = disksEvery;
        return this;
    }

    /**
     * Get disksEvery
     *
     * @return disksEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisksEvery() {
        return disksEvery;
    }

    public void setDisksEvery(DiskWhereInput disksEvery) {
        this.disksEvery = disksEvery;
    }

    public GraphWhereInput disksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public GraphWhereInput disksEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public void setDisksEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_EVERY);
        }
    }

    public boolean getDisksEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_EVERY);
    }

    public GraphWhereInput disksNone(DiskWhereInput disksNone) {

        this.disksNone = disksNone;
        return this;
    }

    /**
     * Get disksNone
     *
     * @return disksNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisksNone() {
        return disksNone;
    }

    public void setDisksNone(DiskWhereInput disksNone) {
        this.disksNone = disksNone;
    }

    public GraphWhereInput disksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public GraphWhereInput disksNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public void setDisksNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_NONE);
        }
    }

    public boolean getDisksNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_NONE);
    }

    public GraphWhereInput disksSome(DiskWhereInput disksSome) {

        this.disksSome = disksSome;
        return this;
    }

    /**
     * Get disksSome
     *
     * @return disksSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisksSome() {
        return disksSome;
    }

    public void setDisksSome(DiskWhereInput disksSome) {
        this.disksSome = disksSome;
    }

    public GraphWhereInput disksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public GraphWhereInput disksSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public void setDisksSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS_SOME);
        }
    }

    public boolean getDisksSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS_SOME);
    }

    public GraphWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public GraphWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public GraphWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public GraphWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public GraphWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public GraphWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public GraphWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public GraphWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public GraphWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public GraphWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public GraphWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public GraphWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public GraphWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public GraphWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public GraphWhereInput hostsEvery(HostWhereInput hostsEvery) {

        this.hostsEvery = hostsEvery;
        return this;
    }

    /**
     * Get hostsEvery
     *
     * @return hostsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsEvery() {
        return hostsEvery;
    }

    public void setHostsEvery(HostWhereInput hostsEvery) {
        this.hostsEvery = hostsEvery;
    }

    public GraphWhereInput hostsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public GraphWhereInput hostsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public void setHostsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_EVERY);
        }
    }

    public boolean getHostsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_EVERY);
    }

    public GraphWhereInput hostsNone(HostWhereInput hostsNone) {

        this.hostsNone = hostsNone;
        return this;
    }

    /**
     * Get hostsNone
     *
     * @return hostsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsNone() {
        return hostsNone;
    }

    public void setHostsNone(HostWhereInput hostsNone) {
        this.hostsNone = hostsNone;
    }

    public GraphWhereInput hostsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public GraphWhereInput hostsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public void setHostsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_NONE);
        }
    }

    public boolean getHostsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_NONE);
    }

    public GraphWhereInput hostsSome(HostWhereInput hostsSome) {

        this.hostsSome = hostsSome;
        return this;
    }

    /**
     * Get hostsSome
     *
     * @return hostsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHostsSome() {
        return hostsSome;
    }

    public void setHostsSome(HostWhereInput hostsSome) {
        this.hostsSome = hostsSome;
    }

    public GraphWhereInput hostsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public GraphWhereInput hostsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public void setHostsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS_SOME);
        }
    }

    public boolean getHostsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS_SOME);
    }

    public GraphWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GraphWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public GraphWhereInput id_ExplictlyNonNull() {
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

    public GraphWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public GraphWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public GraphWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public GraphWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public GraphWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public GraphWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public GraphWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public GraphWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public GraphWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public GraphWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public GraphWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public GraphWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public GraphWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public GraphWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public GraphWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public GraphWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public GraphWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public GraphWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public GraphWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public GraphWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public GraphWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public GraphWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public GraphWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public GraphWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public GraphWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public GraphWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public GraphWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public GraphWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public GraphWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public GraphWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public GraphWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public GraphWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public GraphWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public GraphWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public GraphWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public GraphWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public GraphWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public GraphWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public GraphWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public GraphWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public GraphWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public GraphWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public GraphWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public GraphWhereInput localId_ExplictlyNonNull() {
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

    public GraphWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public GraphWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public GraphWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public GraphWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public GraphWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public GraphWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public GraphWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public GraphWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public GraphWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public GraphWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public GraphWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public GraphWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public GraphWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public GraphWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public GraphWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public GraphWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public GraphWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public GraphWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public GraphWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public GraphWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public GraphWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public GraphWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public GraphWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public GraphWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public GraphWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public GraphWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public GraphWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public GraphWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public GraphWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public GraphWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public GraphWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public GraphWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public GraphWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public GraphWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public GraphWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public GraphWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public GraphWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public GraphWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public GraphWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public GraphWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public GraphWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public GraphWhereInput lunsEvery(IscsiLunWhereInput lunsEvery) {

        this.lunsEvery = lunsEvery;
        return this;
    }

    /**
     * Get lunsEvery
     *
     * @return lunsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getLunsEvery() {
        return lunsEvery;
    }

    public void setLunsEvery(IscsiLunWhereInput lunsEvery) {
        this.lunsEvery = lunsEvery;
    }

    public GraphWhereInput lunsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUNS_EVERY);
        return this;
    }

    public GraphWhereInput lunsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUNS_EVERY);
        return this;
    }

    public void setLunsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUNS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUNS_EVERY);
        }
    }

    public boolean getLunsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUNS_EVERY);
    }

    public GraphWhereInput lunsNone(IscsiLunWhereInput lunsNone) {

        this.lunsNone = lunsNone;
        return this;
    }

    /**
     * Get lunsNone
     *
     * @return lunsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getLunsNone() {
        return lunsNone;
    }

    public void setLunsNone(IscsiLunWhereInput lunsNone) {
        this.lunsNone = lunsNone;
    }

    public GraphWhereInput lunsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUNS_NONE);
        return this;
    }

    public GraphWhereInput lunsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUNS_NONE);
        return this;
    }

    public void setLunsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUNS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUNS_NONE);
        }
    }

    public boolean getLunsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUNS_NONE);
    }

    public GraphWhereInput lunsSome(IscsiLunWhereInput lunsSome) {

        this.lunsSome = lunsSome;
        return this;
    }

    /**
     * Get lunsSome
     *
     * @return lunsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getLunsSome() {
        return lunsSome;
    }

    public void setLunsSome(IscsiLunWhereInput lunsSome) {
        this.lunsSome = lunsSome;
    }

    public GraphWhereInput lunsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUNS_SOME);
        return this;
    }

    public GraphWhereInput lunsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUNS_SOME);
        return this;
    }

    public void setLunsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUNS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUNS_SOME);
        }
    }

    public boolean getLunsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUNS_SOME);
    }

    public GraphWhereInput metricCount(Integer metricCount) {

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

    public GraphWhereInput metricCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT);
        return this;
    }

    public GraphWhereInput metricCount_ExplictlyNonNull() {
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

    public GraphWhereInput metricCountGt(Integer metricCountGt) {

        this.metricCountGt = metricCountGt;
        return this;
    }

    /**
     * Get metricCountGt
     *
     * @return metricCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMetricCountGt() {
        return metricCountGt;
    }

    public void setMetricCountGt(Integer metricCountGt) {
        this.metricCountGt = metricCountGt;
    }

    public GraphWhereInput metricCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_GT);
        return this;
    }

    public GraphWhereInput metricCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_GT);
        return this;
    }

    public void setMetricCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_GT);
        }
    }

    public boolean getMetricCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_GT);
    }

    public GraphWhereInput metricCountGte(Integer metricCountGte) {

        this.metricCountGte = metricCountGte;
        return this;
    }

    /**
     * Get metricCountGte
     *
     * @return metricCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMetricCountGte() {
        return metricCountGte;
    }

    public void setMetricCountGte(Integer metricCountGte) {
        this.metricCountGte = metricCountGte;
    }

    public GraphWhereInput metricCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_GTE);
        return this;
    }

    public GraphWhereInput metricCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_GTE);
        return this;
    }

    public void setMetricCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_GTE);
        }
    }

    public boolean getMetricCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_GTE);
    }

    public GraphWhereInput metricCountIn(List<Integer> metricCountIn) {

        this.metricCountIn = metricCountIn;
        return this;
    }

    public GraphWhereInput addMetricCountInItem(Integer metricCountInItem) {
        if (this.metricCountIn == null) {
            this.metricCountIn = new ArrayList<Integer>();
        }
        this.metricCountIn.add(metricCountInItem);
        return this;
    }

    /**
     * Get metricCountIn
     *
     * @return metricCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMetricCountIn() {
        return metricCountIn;
    }

    public void setMetricCountIn(List<Integer> metricCountIn) {
        this.metricCountIn = metricCountIn;
    }

    public GraphWhereInput metricCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_IN);
        return this;
    }

    public GraphWhereInput metricCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_IN);
        return this;
    }

    public void setMetricCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_IN);
        }
    }

    public boolean getMetricCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_IN);
    }

    public GraphWhereInput metricCountLt(Integer metricCountLt) {

        this.metricCountLt = metricCountLt;
        return this;
    }

    /**
     * Get metricCountLt
     *
     * @return metricCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMetricCountLt() {
        return metricCountLt;
    }

    public void setMetricCountLt(Integer metricCountLt) {
        this.metricCountLt = metricCountLt;
    }

    public GraphWhereInput metricCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_LT);
        return this;
    }

    public GraphWhereInput metricCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_LT);
        return this;
    }

    public void setMetricCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_LT);
        }
    }

    public boolean getMetricCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_LT);
    }

    public GraphWhereInput metricCountLte(Integer metricCountLte) {

        this.metricCountLte = metricCountLte;
        return this;
    }

    /**
     * Get metricCountLte
     *
     * @return metricCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMetricCountLte() {
        return metricCountLte;
    }

    public void setMetricCountLte(Integer metricCountLte) {
        this.metricCountLte = metricCountLte;
    }

    public GraphWhereInput metricCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_LTE);
        return this;
    }

    public GraphWhereInput metricCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_LTE);
        return this;
    }

    public void setMetricCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_LTE);
        }
    }

    public boolean getMetricCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_LTE);
    }

    public GraphWhereInput metricCountNot(Integer metricCountNot) {

        this.metricCountNot = metricCountNot;
        return this;
    }

    /**
     * Get metricCountNot
     *
     * @return metricCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMetricCountNot() {
        return metricCountNot;
    }

    public void setMetricCountNot(Integer metricCountNot) {
        this.metricCountNot = metricCountNot;
    }

    public GraphWhereInput metricCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_NOT);
        return this;
    }

    public GraphWhereInput metricCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_NOT);
        return this;
    }

    public void setMetricCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_NOT);
        }
    }

    public boolean getMetricCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_NOT);
    }

    public GraphWhereInput metricCountNotIn(List<Integer> metricCountNotIn) {

        this.metricCountNotIn = metricCountNotIn;
        return this;
    }

    public GraphWhereInput addMetricCountNotInItem(Integer metricCountNotInItem) {
        if (this.metricCountNotIn == null) {
            this.metricCountNotIn = new ArrayList<Integer>();
        }
        this.metricCountNotIn.add(metricCountNotInItem);
        return this;
    }

    /**
     * Get metricCountNotIn
     *
     * @return metricCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMetricCountNotIn() {
        return metricCountNotIn;
    }

    public void setMetricCountNotIn(List<Integer> metricCountNotIn) {
        this.metricCountNotIn = metricCountNotIn;
    }

    public GraphWhereInput metricCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_NOT_IN);
        return this;
    }

    public GraphWhereInput metricCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_NOT_IN);
        return this;
    }

    public void setMetricCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_COUNT_NOT_IN);
        }
    }

    public boolean getMetricCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_COUNT_NOT_IN);
    }

    public GraphWhereInput metricName(String metricName) {

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

    public GraphWhereInput metricName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public GraphWhereInput metricName_ExplictlyNonNull() {
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

    public GraphWhereInput metricNameContains(String metricNameContains) {

        this.metricNameContains = metricNameContains;
        return this;
    }

    /**
     * Get metricNameContains
     *
     * @return metricNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameContains() {
        return metricNameContains;
    }

    public void setMetricNameContains(String metricNameContains) {
        this.metricNameContains = metricNameContains;
    }

    public GraphWhereInput metricNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_CONTAINS);
        return this;
    }

    public GraphWhereInput metricNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_CONTAINS);
        return this;
    }

    public void setMetricNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_CONTAINS);
        }
    }

    public boolean getMetricNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_CONTAINS);
    }

    public GraphWhereInput metricNameEndsWith(String metricNameEndsWith) {

        this.metricNameEndsWith = metricNameEndsWith;
        return this;
    }

    /**
     * Get metricNameEndsWith
     *
     * @return metricNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameEndsWith() {
        return metricNameEndsWith;
    }

    public void setMetricNameEndsWith(String metricNameEndsWith) {
        this.metricNameEndsWith = metricNameEndsWith;
    }

    public GraphWhereInput metricNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_ENDS_WITH);
        return this;
    }

    public GraphWhereInput metricNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_ENDS_WITH);
        return this;
    }

    public void setMetricNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_ENDS_WITH);
        }
    }

    public boolean getMetricNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_ENDS_WITH);
    }

    public GraphWhereInput metricNameGt(String metricNameGt) {

        this.metricNameGt = metricNameGt;
        return this;
    }

    /**
     * Get metricNameGt
     *
     * @return metricNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameGt() {
        return metricNameGt;
    }

    public void setMetricNameGt(String metricNameGt) {
        this.metricNameGt = metricNameGt;
    }

    public GraphWhereInput metricNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_GT);
        return this;
    }

    public GraphWhereInput metricNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_GT);
        return this;
    }

    public void setMetricNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_GT);
        }
    }

    public boolean getMetricNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_GT);
    }

    public GraphWhereInput metricNameGte(String metricNameGte) {

        this.metricNameGte = metricNameGte;
        return this;
    }

    /**
     * Get metricNameGte
     *
     * @return metricNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameGte() {
        return metricNameGte;
    }

    public void setMetricNameGte(String metricNameGte) {
        this.metricNameGte = metricNameGte;
    }

    public GraphWhereInput metricNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_GTE);
        return this;
    }

    public GraphWhereInput metricNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_GTE);
        return this;
    }

    public void setMetricNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_GTE);
        }
    }

    public boolean getMetricNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_GTE);
    }

    public GraphWhereInput metricNameIn(List<String> metricNameIn) {

        this.metricNameIn = metricNameIn;
        return this;
    }

    public GraphWhereInput addMetricNameInItem(String metricNameInItem) {
        if (this.metricNameIn == null) {
            this.metricNameIn = new ArrayList<String>();
        }
        this.metricNameIn.add(metricNameInItem);
        return this;
    }

    /**
     * Get metricNameIn
     *
     * @return metricNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMetricNameIn() {
        return metricNameIn;
    }

    public void setMetricNameIn(List<String> metricNameIn) {
        this.metricNameIn = metricNameIn;
    }

    public GraphWhereInput metricNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_IN);
        return this;
    }

    public GraphWhereInput metricNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_IN);
        return this;
    }

    public void setMetricNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_IN);
        }
    }

    public boolean getMetricNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_IN);
    }

    public GraphWhereInput metricNameLt(String metricNameLt) {

        this.metricNameLt = metricNameLt;
        return this;
    }

    /**
     * Get metricNameLt
     *
     * @return metricNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameLt() {
        return metricNameLt;
    }

    public void setMetricNameLt(String metricNameLt) {
        this.metricNameLt = metricNameLt;
    }

    public GraphWhereInput metricNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_LT);
        return this;
    }

    public GraphWhereInput metricNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_LT);
        return this;
    }

    public void setMetricNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_LT);
        }
    }

    public boolean getMetricNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_LT);
    }

    public GraphWhereInput metricNameLte(String metricNameLte) {

        this.metricNameLte = metricNameLte;
        return this;
    }

    /**
     * Get metricNameLte
     *
     * @return metricNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameLte() {
        return metricNameLte;
    }

    public void setMetricNameLte(String metricNameLte) {
        this.metricNameLte = metricNameLte;
    }

    public GraphWhereInput metricNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_LTE);
        return this;
    }

    public GraphWhereInput metricNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_LTE);
        return this;
    }

    public void setMetricNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_LTE);
        }
    }

    public boolean getMetricNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_LTE);
    }

    public GraphWhereInput metricNameNot(String metricNameNot) {

        this.metricNameNot = metricNameNot;
        return this;
    }

    /**
     * Get metricNameNot
     *
     * @return metricNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameNot() {
        return metricNameNot;
    }

    public void setMetricNameNot(String metricNameNot) {
        this.metricNameNot = metricNameNot;
    }

    public GraphWhereInput metricNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT);
        return this;
    }

    public GraphWhereInput metricNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT);
        return this;
    }

    public void setMetricNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT);
        }
    }

    public boolean getMetricNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_NOT);
    }

    public GraphWhereInput metricNameNotContains(String metricNameNotContains) {

        this.metricNameNotContains = metricNameNotContains;
        return this;
    }

    /**
     * Get metricNameNotContains
     *
     * @return metricNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameNotContains() {
        return metricNameNotContains;
    }

    public void setMetricNameNotContains(String metricNameNotContains) {
        this.metricNameNotContains = metricNameNotContains;
    }

    public GraphWhereInput metricNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS);
        return this;
    }

    public GraphWhereInput metricNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS);
        return this;
    }

    public void setMetricNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS);
        }
    }

    public boolean getMetricNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_NOT_CONTAINS);
    }

    public GraphWhereInput metricNameNotEndsWith(String metricNameNotEndsWith) {

        this.metricNameNotEndsWith = metricNameNotEndsWith;
        return this;
    }

    /**
     * Get metricNameNotEndsWith
     *
     * @return metricNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameNotEndsWith() {
        return metricNameNotEndsWith;
    }

    public void setMetricNameNotEndsWith(String metricNameNotEndsWith) {
        this.metricNameNotEndsWith = metricNameNotEndsWith;
    }

    public GraphWhereInput metricNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH);
        return this;
    }

    public GraphWhereInput metricNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setMetricNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getMetricNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_NOT_ENDS_WITH);
    }

    public GraphWhereInput metricNameNotIn(List<String> metricNameNotIn) {

        this.metricNameNotIn = metricNameNotIn;
        return this;
    }

    public GraphWhereInput addMetricNameNotInItem(String metricNameNotInItem) {
        if (this.metricNameNotIn == null) {
            this.metricNameNotIn = new ArrayList<String>();
        }
        this.metricNameNotIn.add(metricNameNotInItem);
        return this;
    }

    /**
     * Get metricNameNotIn
     *
     * @return metricNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMetricNameNotIn() {
        return metricNameNotIn;
    }

    public void setMetricNameNotIn(List<String> metricNameNotIn) {
        this.metricNameNotIn = metricNameNotIn;
    }

    public GraphWhereInput metricNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_IN);
        return this;
    }

    public GraphWhereInput metricNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_IN);
        return this;
    }

    public void setMetricNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_IN);
        }
    }

    public boolean getMetricNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_NOT_IN);
    }

    public GraphWhereInput metricNameNotStartsWith(String metricNameNotStartsWith) {

        this.metricNameNotStartsWith = metricNameNotStartsWith;
        return this;
    }

    /**
     * Get metricNameNotStartsWith
     *
     * @return metricNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameNotStartsWith() {
        return metricNameNotStartsWith;
    }

    public void setMetricNameNotStartsWith(String metricNameNotStartsWith) {
        this.metricNameNotStartsWith = metricNameNotStartsWith;
    }

    public GraphWhereInput metricNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH);
        return this;
    }

    public GraphWhereInput metricNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setMetricNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getMetricNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_NOT_STARTS_WITH);
    }

    public GraphWhereInput metricNameStartsWith(String metricNameStartsWith) {

        this.metricNameStartsWith = metricNameStartsWith;
        return this;
    }

    /**
     * Get metricNameStartsWith
     *
     * @return metricNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricNameStartsWith() {
        return metricNameStartsWith;
    }

    public void setMetricNameStartsWith(String metricNameStartsWith) {
        this.metricNameStartsWith = metricNameStartsWith;
    }

    public GraphWhereInput metricNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_STARTS_WITH);
        return this;
    }

    public GraphWhereInput metricNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_STARTS_WITH);
        return this;
    }

    public void setMetricNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME_STARTS_WITH);
        }
    }

    public boolean getMetricNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME_STARTS_WITH);
    }

    public GraphWhereInput metricType(MetricType metricType) {

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

    public GraphWhereInput metricType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE);
        return this;
    }

    public GraphWhereInput metricType_ExplictlyNonNull() {
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

    public GraphWhereInput metricTypeIn(List<MetricType> metricTypeIn) {

        this.metricTypeIn = metricTypeIn;
        return this;
    }

    public GraphWhereInput addMetricTypeInItem(MetricType metricTypeInItem) {
        if (this.metricTypeIn == null) {
            this.metricTypeIn = new ArrayList<MetricType>();
        }
        this.metricTypeIn.add(metricTypeInItem);
        return this;
    }

    /**
     * Get metricTypeIn
     *
     * @return metricTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<MetricType> getMetricTypeIn() {
        return metricTypeIn;
    }

    public void setMetricTypeIn(List<MetricType> metricTypeIn) {
        this.metricTypeIn = metricTypeIn;
    }

    public GraphWhereInput metricTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE_IN);
        return this;
    }

    public GraphWhereInput metricTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE_IN);
        return this;
    }

    public void setMetricTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE_IN);
        }
    }

    public boolean getMetricTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_TYPE_IN);
    }

    public GraphWhereInput metricTypeNot(MetricType metricTypeNot) {

        this.metricTypeNot = metricTypeNot;
        return this;
    }

    /**
     * Get metricTypeNot
     *
     * @return metricTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public MetricType getMetricTypeNot() {
        return metricTypeNot;
    }

    public void setMetricTypeNot(MetricType metricTypeNot) {
        this.metricTypeNot = metricTypeNot;
    }

    public GraphWhereInput metricTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE_NOT);
        return this;
    }

    public GraphWhereInput metricTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE_NOT);
        return this;
    }

    public void setMetricTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE_NOT);
        }
    }

    public boolean getMetricTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_TYPE_NOT);
    }

    public GraphWhereInput metricTypeNotIn(List<MetricType> metricTypeNotIn) {

        this.metricTypeNotIn = metricTypeNotIn;
        return this;
    }

    public GraphWhereInput addMetricTypeNotInItem(MetricType metricTypeNotInItem) {
        if (this.metricTypeNotIn == null) {
            this.metricTypeNotIn = new ArrayList<MetricType>();
        }
        this.metricTypeNotIn.add(metricTypeNotInItem);
        return this;
    }

    /**
     * Get metricTypeNotIn
     *
     * @return metricTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<MetricType> getMetricTypeNotIn() {
        return metricTypeNotIn;
    }

    public void setMetricTypeNotIn(List<MetricType> metricTypeNotIn) {
        this.metricTypeNotIn = metricTypeNotIn;
    }

    public GraphWhereInput metricTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE_NOT_IN);
        return this;
    }

    public GraphWhereInput metricTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE_NOT_IN);
        return this;
    }

    public void setMetricTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_TYPE_NOT_IN);
        }
    }

    public boolean getMetricTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_TYPE_NOT_IN);
    }

    public GraphWhereInput namespacesEvery(NvmfNamespaceWhereInput namespacesEvery) {

        this.namespacesEvery = namespacesEvery;
        return this;
    }

    /**
     * Get namespacesEvery
     *
     * @return namespacesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNamespacesEvery() {
        return namespacesEvery;
    }

    public void setNamespacesEvery(NvmfNamespaceWhereInput namespacesEvery) {
        this.namespacesEvery = namespacesEvery;
    }

    public GraphWhereInput namespacesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_EVERY);
        return this;
    }

    public GraphWhereInput namespacesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_EVERY);
        return this;
    }

    public void setNamespacesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_EVERY);
        }
    }

    public boolean getNamespacesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_EVERY);
    }

    public GraphWhereInput namespacesNone(NvmfNamespaceWhereInput namespacesNone) {

        this.namespacesNone = namespacesNone;
        return this;
    }

    /**
     * Get namespacesNone
     *
     * @return namespacesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNamespacesNone() {
        return namespacesNone;
    }

    public void setNamespacesNone(NvmfNamespaceWhereInput namespacesNone) {
        this.namespacesNone = namespacesNone;
    }

    public GraphWhereInput namespacesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_NONE);
        return this;
    }

    public GraphWhereInput namespacesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_NONE);
        return this;
    }

    public void setNamespacesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_NONE);
        }
    }

    public boolean getNamespacesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_NONE);
    }

    public GraphWhereInput namespacesSome(NvmfNamespaceWhereInput namespacesSome) {

        this.namespacesSome = namespacesSome;
        return this;
    }

    /**
     * Get namespacesSome
     *
     * @return namespacesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNamespacesSome() {
        return namespacesSome;
    }

    public void setNamespacesSome(NvmfNamespaceWhereInput namespacesSome) {
        this.namespacesSome = namespacesSome;
    }

    public GraphWhereInput namespacesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_SOME);
        return this;
    }

    public GraphWhereInput namespacesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_SOME);
        return this;
    }

    public void setNamespacesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES_SOME);
        }
    }

    public boolean getNamespacesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES_SOME);
    }

    public GraphWhereInput network(NetworkType network) {

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

    public GraphWhereInput network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public GraphWhereInput network_ExplictlyNonNull() {
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

    public GraphWhereInput networkIn(List<NetworkType> networkIn) {

        this.networkIn = networkIn;
        return this;
    }

    public GraphWhereInput addNetworkInItem(NetworkType networkInItem) {
        if (this.networkIn == null) {
            this.networkIn = new ArrayList<NetworkType>();
        }
        this.networkIn.add(networkInItem);
        return this;
    }

    /**
     * Get networkIn
     *
     * @return networkIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NetworkType> getNetworkIn() {
        return networkIn;
    }

    public void setNetworkIn(List<NetworkType> networkIn) {
        this.networkIn = networkIn;
    }

    public GraphWhereInput networkIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_IN);
        return this;
    }

    public GraphWhereInput networkIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_IN);
        return this;
    }

    public void setNetworkIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_IN);
        }
    }

    public boolean getNetworkIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_IN);
    }

    public GraphWhereInput networkNot(NetworkType networkNot) {

        this.networkNot = networkNot;
        return this;
    }

    /**
     * Get networkNot
     *
     * @return networkNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NetworkType getNetworkNot() {
        return networkNot;
    }

    public void setNetworkNot(NetworkType networkNot) {
        this.networkNot = networkNot;
    }

    public GraphWhereInput networkNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_NOT);
        return this;
    }

    public GraphWhereInput networkNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_NOT);
        return this;
    }

    public void setNetworkNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_NOT);
        }
    }

    public boolean getNetworkNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_NOT);
    }

    public GraphWhereInput networkNotIn(List<NetworkType> networkNotIn) {

        this.networkNotIn = networkNotIn;
        return this;
    }

    public GraphWhereInput addNetworkNotInItem(NetworkType networkNotInItem) {
        if (this.networkNotIn == null) {
            this.networkNotIn = new ArrayList<NetworkType>();
        }
        this.networkNotIn.add(networkNotInItem);
        return this;
    }

    /**
     * Get networkNotIn
     *
     * @return networkNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NetworkType> getNetworkNotIn() {
        return networkNotIn;
    }

    public void setNetworkNotIn(List<NetworkType> networkNotIn) {
        this.networkNotIn = networkNotIn;
    }

    public GraphWhereInput networkNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_NOT_IN);
        return this;
    }

    public GraphWhereInput networkNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_NOT_IN);
        return this;
    }

    public void setNetworkNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_NOT_IN);
        }
    }

    public boolean getNetworkNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_NOT_IN);
    }

    public GraphWhereInput nicsEvery(NicWhereInput nicsEvery) {

        this.nicsEvery = nicsEvery;
        return this;
    }

    /**
     * Get nicsEvery
     *
     * @return nicsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsEvery() {
        return nicsEvery;
    }

    public void setNicsEvery(NicWhereInput nicsEvery) {
        this.nicsEvery = nicsEvery;
    }

    public GraphWhereInput nicsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_EVERY);
        return this;
    }

    public GraphWhereInput nicsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_EVERY);
        return this;
    }

    public void setNicsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_EVERY);
        }
    }

    public boolean getNicsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_EVERY);
    }

    public GraphWhereInput nicsNone(NicWhereInput nicsNone) {

        this.nicsNone = nicsNone;
        return this;
    }

    /**
     * Get nicsNone
     *
     * @return nicsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsNone() {
        return nicsNone;
    }

    public void setNicsNone(NicWhereInput nicsNone) {
        this.nicsNone = nicsNone;
    }

    public GraphWhereInput nicsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_NONE);
        return this;
    }

    public GraphWhereInput nicsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_NONE);
        return this;
    }

    public void setNicsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_NONE);
        }
    }

    public boolean getNicsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_NONE);
    }

    public GraphWhereInput nicsSome(NicWhereInput nicsSome) {

        this.nicsSome = nicsSome;
        return this;
    }

    /**
     * Get nicsSome
     *
     * @return nicsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNicsSome() {
        return nicsSome;
    }

    public void setNicsSome(NicWhereInput nicsSome) {
        this.nicsSome = nicsSome;
    }

    public GraphWhereInput nicsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS_SOME);
        return this;
    }

    public GraphWhereInput nicsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS_SOME);
        return this;
    }

    public void setNicsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS_SOME);
        }
    }

    public boolean getNicsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS_SOME);
    }

    public GraphWhereInput resourceType(String resourceType) {

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

    public GraphWhereInput resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public GraphWhereInput resourceType_ExplictlyNonNull() {
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

    public GraphWhereInput resourceTypeContains(String resourceTypeContains) {

        this.resourceTypeContains = resourceTypeContains;
        return this;
    }

    /**
     * Get resourceTypeContains
     *
     * @return resourceTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeContains() {
        return resourceTypeContains;
    }

    public void setResourceTypeContains(String resourceTypeContains) {
        this.resourceTypeContains = resourceTypeContains;
    }

    public GraphWhereInput resourceTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        return this;
    }

    public GraphWhereInput resourceTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        return this;
    }

    public void setResourceTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        }
    }

    public boolean getResourceTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
    }

    public GraphWhereInput resourceTypeEndsWith(String resourceTypeEndsWith) {

        this.resourceTypeEndsWith = resourceTypeEndsWith;
        return this;
    }

    /**
     * Get resourceTypeEndsWith
     *
     * @return resourceTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeEndsWith() {
        return resourceTypeEndsWith;
    }

    public void setResourceTypeEndsWith(String resourceTypeEndsWith) {
        this.resourceTypeEndsWith = resourceTypeEndsWith;
    }

    public GraphWhereInput resourceTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        return this;
    }

    public GraphWhereInput resourceTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        return this;
    }

    public void setResourceTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        }
    }

    public boolean getResourceTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
    }

    public GraphWhereInput resourceTypeGt(String resourceTypeGt) {

        this.resourceTypeGt = resourceTypeGt;
        return this;
    }

    /**
     * Get resourceTypeGt
     *
     * @return resourceTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeGt() {
        return resourceTypeGt;
    }

    public void setResourceTypeGt(String resourceTypeGt) {
        this.resourceTypeGt = resourceTypeGt;
    }

    public GraphWhereInput resourceTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        return this;
    }

    public GraphWhereInput resourceTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        return this;
    }

    public void setResourceTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        }
    }

    public boolean getResourceTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_GT);
    }

    public GraphWhereInput resourceTypeGte(String resourceTypeGte) {

        this.resourceTypeGte = resourceTypeGte;
        return this;
    }

    /**
     * Get resourceTypeGte
     *
     * @return resourceTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeGte() {
        return resourceTypeGte;
    }

    public void setResourceTypeGte(String resourceTypeGte) {
        this.resourceTypeGte = resourceTypeGte;
    }

    public GraphWhereInput resourceTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        return this;
    }

    public GraphWhereInput resourceTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        return this;
    }

    public void setResourceTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        }
    }

    public boolean getResourceTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
    }

    public GraphWhereInput resourceTypeIn(List<String> resourceTypeIn) {

        this.resourceTypeIn = resourceTypeIn;
        return this;
    }

    public GraphWhereInput addResourceTypeInItem(String resourceTypeInItem) {
        if (this.resourceTypeIn == null) {
            this.resourceTypeIn = new ArrayList<String>();
        }
        this.resourceTypeIn.add(resourceTypeInItem);
        return this;
    }

    /**
     * Get resourceTypeIn
     *
     * @return resourceTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceTypeIn() {
        return resourceTypeIn;
    }

    public void setResourceTypeIn(List<String> resourceTypeIn) {
        this.resourceTypeIn = resourceTypeIn;
    }

    public GraphWhereInput resourceTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        return this;
    }

    public GraphWhereInput resourceTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        return this;
    }

    public void setResourceTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        }
    }

    public boolean getResourceTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_IN);
    }

    public GraphWhereInput resourceTypeLt(String resourceTypeLt) {

        this.resourceTypeLt = resourceTypeLt;
        return this;
    }

    /**
     * Get resourceTypeLt
     *
     * @return resourceTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeLt() {
        return resourceTypeLt;
    }

    public void setResourceTypeLt(String resourceTypeLt) {
        this.resourceTypeLt = resourceTypeLt;
    }

    public GraphWhereInput resourceTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        return this;
    }

    public GraphWhereInput resourceTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        return this;
    }

    public void setResourceTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        }
    }

    public boolean getResourceTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_LT);
    }

    public GraphWhereInput resourceTypeLte(String resourceTypeLte) {

        this.resourceTypeLte = resourceTypeLte;
        return this;
    }

    /**
     * Get resourceTypeLte
     *
     * @return resourceTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeLte() {
        return resourceTypeLte;
    }

    public void setResourceTypeLte(String resourceTypeLte) {
        this.resourceTypeLte = resourceTypeLte;
    }

    public GraphWhereInput resourceTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        return this;
    }

    public GraphWhereInput resourceTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        return this;
    }

    public void setResourceTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        }
    }

    public boolean getResourceTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
    }

    public GraphWhereInput resourceTypeNot(String resourceTypeNot) {

        this.resourceTypeNot = resourceTypeNot;
        return this;
    }

    /**
     * Get resourceTypeNot
     *
     * @return resourceTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNot() {
        return resourceTypeNot;
    }

    public void setResourceTypeNot(String resourceTypeNot) {
        this.resourceTypeNot = resourceTypeNot;
    }

    public GraphWhereInput resourceTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        return this;
    }

    public GraphWhereInput resourceTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        return this;
    }

    public void setResourceTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        }
    }

    public boolean getResourceTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
    }

    public GraphWhereInput resourceTypeNotContains(String resourceTypeNotContains) {

        this.resourceTypeNotContains = resourceTypeNotContains;
        return this;
    }

    /**
     * Get resourceTypeNotContains
     *
     * @return resourceTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotContains() {
        return resourceTypeNotContains;
    }

    public void setResourceTypeNotContains(String resourceTypeNotContains) {
        this.resourceTypeNotContains = resourceTypeNotContains;
    }

    public GraphWhereInput resourceTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        return this;
    }

    public GraphWhereInput resourceTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setResourceTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getResourceTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
    }

    public GraphWhereInput resourceTypeNotEndsWith(String resourceTypeNotEndsWith) {

        this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
        return this;
    }

    /**
     * Get resourceTypeNotEndsWith
     *
     * @return resourceTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotEndsWith() {
        return resourceTypeNotEndsWith;
    }

    public void setResourceTypeNotEndsWith(String resourceTypeNotEndsWith) {
        this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
    }

    public GraphWhereInput resourceTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public GraphWhereInput resourceTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
    }

    public GraphWhereInput resourceTypeNotIn(List<String> resourceTypeNotIn) {

        this.resourceTypeNotIn = resourceTypeNotIn;
        return this;
    }

    public GraphWhereInput addResourceTypeNotInItem(String resourceTypeNotInItem) {
        if (this.resourceTypeNotIn == null) {
            this.resourceTypeNotIn = new ArrayList<String>();
        }
        this.resourceTypeNotIn.add(resourceTypeNotInItem);
        return this;
    }

    /**
     * Get resourceTypeNotIn
     *
     * @return resourceTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceTypeNotIn() {
        return resourceTypeNotIn;
    }

    public void setResourceTypeNotIn(List<String> resourceTypeNotIn) {
        this.resourceTypeNotIn = resourceTypeNotIn;
    }

    public GraphWhereInput resourceTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        return this;
    }

    public GraphWhereInput resourceTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        return this;
    }

    public void setResourceTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        }
    }

    public boolean getResourceTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
    }

    public GraphWhereInput resourceTypeNotStartsWith(String resourceTypeNotStartsWith) {

        this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
        return this;
    }

    /**
     * Get resourceTypeNotStartsWith
     *
     * @return resourceTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotStartsWith() {
        return resourceTypeNotStartsWith;
    }

    public void setResourceTypeNotStartsWith(String resourceTypeNotStartsWith) {
        this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
    }

    public GraphWhereInput resourceTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public GraphWhereInput resourceTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
    }

    public GraphWhereInput resourceTypeStartsWith(String resourceTypeStartsWith) {

        this.resourceTypeStartsWith = resourceTypeStartsWith;
        return this;
    }

    /**
     * Get resourceTypeStartsWith
     *
     * @return resourceTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeStartsWith() {
        return resourceTypeStartsWith;
    }

    public void setResourceTypeStartsWith(String resourceTypeStartsWith) {
        this.resourceTypeStartsWith = resourceTypeStartsWith;
    }

    public GraphWhereInput resourceTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        return this;
    }

    public GraphWhereInput resourceTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        return this;
    }

    public void setResourceTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        }
    }

    public boolean getResourceTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
    }

    public GraphWhereInput service(String service) {

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

    public GraphWhereInput service_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public GraphWhereInput service_ExplictlyNonNull() {
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

    public GraphWhereInput serviceContains(String serviceContains) {

        this.serviceContains = serviceContains;
        return this;
    }

    /**
     * Get serviceContains
     *
     * @return serviceContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceContains() {
        return serviceContains;
    }

    public void setServiceContains(String serviceContains) {
        this.serviceContains = serviceContains;
    }

    public GraphWhereInput serviceContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_CONTAINS);
        return this;
    }

    public GraphWhereInput serviceContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_CONTAINS);
        return this;
    }

    public void setServiceContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_CONTAINS);
        }
    }

    public boolean getServiceContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_CONTAINS);
    }

    public GraphWhereInput serviceEndsWith(String serviceEndsWith) {

        this.serviceEndsWith = serviceEndsWith;
        return this;
    }

    /**
     * Get serviceEndsWith
     *
     * @return serviceEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceEndsWith() {
        return serviceEndsWith;
    }

    public void setServiceEndsWith(String serviceEndsWith) {
        this.serviceEndsWith = serviceEndsWith;
    }

    public GraphWhereInput serviceEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_ENDS_WITH);
        return this;
    }

    public GraphWhereInput serviceEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_ENDS_WITH);
        return this;
    }

    public void setServiceEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_ENDS_WITH);
        }
    }

    public boolean getServiceEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_ENDS_WITH);
    }

    public GraphWhereInput serviceGt(String serviceGt) {

        this.serviceGt = serviceGt;
        return this;
    }

    /**
     * Get serviceGt
     *
     * @return serviceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceGt() {
        return serviceGt;
    }

    public void setServiceGt(String serviceGt) {
        this.serviceGt = serviceGt;
    }

    public GraphWhereInput serviceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_GT);
        return this;
    }

    public GraphWhereInput serviceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_GT);
        return this;
    }

    public void setServiceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_GT);
        }
    }

    public boolean getServiceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_GT);
    }

    public GraphWhereInput serviceGte(String serviceGte) {

        this.serviceGte = serviceGte;
        return this;
    }

    /**
     * Get serviceGte
     *
     * @return serviceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceGte() {
        return serviceGte;
    }

    public void setServiceGte(String serviceGte) {
        this.serviceGte = serviceGte;
    }

    public GraphWhereInput serviceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_GTE);
        return this;
    }

    public GraphWhereInput serviceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_GTE);
        return this;
    }

    public void setServiceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_GTE);
        }
    }

    public boolean getServiceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_GTE);
    }

    public GraphWhereInput serviceIn(List<String> serviceIn) {

        this.serviceIn = serviceIn;
        return this;
    }

    public GraphWhereInput addServiceInItem(String serviceInItem) {
        if (this.serviceIn == null) {
            this.serviceIn = new ArrayList<String>();
        }
        this.serviceIn.add(serviceInItem);
        return this;
    }

    /**
     * Get serviceIn
     *
     * @return serviceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getServiceIn() {
        return serviceIn;
    }

    public void setServiceIn(List<String> serviceIn) {
        this.serviceIn = serviceIn;
    }

    public GraphWhereInput serviceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_IN);
        return this;
    }

    public GraphWhereInput serviceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_IN);
        return this;
    }

    public void setServiceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_IN);
        }
    }

    public boolean getServiceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_IN);
    }

    public GraphWhereInput serviceLt(String serviceLt) {

        this.serviceLt = serviceLt;
        return this;
    }

    /**
     * Get serviceLt
     *
     * @return serviceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceLt() {
        return serviceLt;
    }

    public void setServiceLt(String serviceLt) {
        this.serviceLt = serviceLt;
    }

    public GraphWhereInput serviceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_LT);
        return this;
    }

    public GraphWhereInput serviceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_LT);
        return this;
    }

    public void setServiceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_LT);
        }
    }

    public boolean getServiceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_LT);
    }

    public GraphWhereInput serviceLte(String serviceLte) {

        this.serviceLte = serviceLte;
        return this;
    }

    /**
     * Get serviceLte
     *
     * @return serviceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceLte() {
        return serviceLte;
    }

    public void setServiceLte(String serviceLte) {
        this.serviceLte = serviceLte;
    }

    public GraphWhereInput serviceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_LTE);
        return this;
    }

    public GraphWhereInput serviceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_LTE);
        return this;
    }

    public void setServiceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_LTE);
        }
    }

    public boolean getServiceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_LTE);
    }

    public GraphWhereInput serviceNot(String serviceNot) {

        this.serviceNot = serviceNot;
        return this;
    }

    /**
     * Get serviceNot
     *
     * @return serviceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceNot() {
        return serviceNot;
    }

    public void setServiceNot(String serviceNot) {
        this.serviceNot = serviceNot;
    }

    public GraphWhereInput serviceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT);
        return this;
    }

    public GraphWhereInput serviceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT);
        return this;
    }

    public void setServiceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT);
        }
    }

    public boolean getServiceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_NOT);
    }

    public GraphWhereInput serviceNotContains(String serviceNotContains) {

        this.serviceNotContains = serviceNotContains;
        return this;
    }

    /**
     * Get serviceNotContains
     *
     * @return serviceNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceNotContains() {
        return serviceNotContains;
    }

    public void setServiceNotContains(String serviceNotContains) {
        this.serviceNotContains = serviceNotContains;
    }

    public GraphWhereInput serviceNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_CONTAINS);
        return this;
    }

    public GraphWhereInput serviceNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_CONTAINS);
        return this;
    }

    public void setServiceNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_CONTAINS);
        }
    }

    public boolean getServiceNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_NOT_CONTAINS);
    }

    public GraphWhereInput serviceNotEndsWith(String serviceNotEndsWith) {

        this.serviceNotEndsWith = serviceNotEndsWith;
        return this;
    }

    /**
     * Get serviceNotEndsWith
     *
     * @return serviceNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceNotEndsWith() {
        return serviceNotEndsWith;
    }

    public void setServiceNotEndsWith(String serviceNotEndsWith) {
        this.serviceNotEndsWith = serviceNotEndsWith;
    }

    public GraphWhereInput serviceNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH);
        return this;
    }

    public GraphWhereInput serviceNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH);
        return this;
    }

    public void setServiceNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH);
        }
    }

    public boolean getServiceNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_NOT_ENDS_WITH);
    }

    public GraphWhereInput serviceNotIn(List<String> serviceNotIn) {

        this.serviceNotIn = serviceNotIn;
        return this;
    }

    public GraphWhereInput addServiceNotInItem(String serviceNotInItem) {
        if (this.serviceNotIn == null) {
            this.serviceNotIn = new ArrayList<String>();
        }
        this.serviceNotIn.add(serviceNotInItem);
        return this;
    }

    /**
     * Get serviceNotIn
     *
     * @return serviceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getServiceNotIn() {
        return serviceNotIn;
    }

    public void setServiceNotIn(List<String> serviceNotIn) {
        this.serviceNotIn = serviceNotIn;
    }

    public GraphWhereInput serviceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_IN);
        return this;
    }

    public GraphWhereInput serviceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_IN);
        return this;
    }

    public void setServiceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_IN);
        }
    }

    public boolean getServiceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_NOT_IN);
    }

    public GraphWhereInput serviceNotStartsWith(String serviceNotStartsWith) {

        this.serviceNotStartsWith = serviceNotStartsWith;
        return this;
    }

    /**
     * Get serviceNotStartsWith
     *
     * @return serviceNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceNotStartsWith() {
        return serviceNotStartsWith;
    }

    public void setServiceNotStartsWith(String serviceNotStartsWith) {
        this.serviceNotStartsWith = serviceNotStartsWith;
    }

    public GraphWhereInput serviceNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH);
        return this;
    }

    public GraphWhereInput serviceNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH);
        return this;
    }

    public void setServiceNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH);
        }
    }

    public boolean getServiceNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_NOT_STARTS_WITH);
    }

    public GraphWhereInput serviceStartsWith(String serviceStartsWith) {

        this.serviceStartsWith = serviceStartsWith;
        return this;
    }

    /**
     * Get serviceStartsWith
     *
     * @return serviceStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getServiceStartsWith() {
        return serviceStartsWith;
    }

    public void setServiceStartsWith(String serviceStartsWith) {
        this.serviceStartsWith = serviceStartsWith;
    }

    public GraphWhereInput serviceStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE_STARTS_WITH);
        return this;
    }

    public GraphWhereInput serviceStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE_STARTS_WITH);
        return this;
    }

    public void setServiceStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE_STARTS_WITH);
        }
    }

    public boolean getServiceStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE_STARTS_WITH);
    }

    public GraphWhereInput title(String title) {

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

    public GraphWhereInput title_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE);
        return this;
    }

    public GraphWhereInput title_ExplictlyNonNull() {
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

    public GraphWhereInput titleContains(String titleContains) {

        this.titleContains = titleContains;
        return this;
    }

    /**
     * Get titleContains
     *
     * @return titleContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleContains() {
        return titleContains;
    }

    public void setTitleContains(String titleContains) {
        this.titleContains = titleContains;
    }

    public GraphWhereInput titleContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_CONTAINS);
        return this;
    }

    public GraphWhereInput titleContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_CONTAINS);
        return this;
    }

    public void setTitleContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_CONTAINS);
        }
    }

    public boolean getTitleContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_CONTAINS);
    }

    public GraphWhereInput titleEndsWith(String titleEndsWith) {

        this.titleEndsWith = titleEndsWith;
        return this;
    }

    /**
     * Get titleEndsWith
     *
     * @return titleEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleEndsWith() {
        return titleEndsWith;
    }

    public void setTitleEndsWith(String titleEndsWith) {
        this.titleEndsWith = titleEndsWith;
    }

    public GraphWhereInput titleEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_ENDS_WITH);
        return this;
    }

    public GraphWhereInput titleEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_ENDS_WITH);
        return this;
    }

    public void setTitleEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_ENDS_WITH);
        }
    }

    public boolean getTitleEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_ENDS_WITH);
    }

    public GraphWhereInput titleGt(String titleGt) {

        this.titleGt = titleGt;
        return this;
    }

    /**
     * Get titleGt
     *
     * @return titleGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleGt() {
        return titleGt;
    }

    public void setTitleGt(String titleGt) {
        this.titleGt = titleGt;
    }

    public GraphWhereInput titleGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_GT);
        return this;
    }

    public GraphWhereInput titleGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_GT);
        return this;
    }

    public void setTitleGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_GT);
        }
    }

    public boolean getTitleGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_GT);
    }

    public GraphWhereInput titleGte(String titleGte) {

        this.titleGte = titleGte;
        return this;
    }

    /**
     * Get titleGte
     *
     * @return titleGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleGte() {
        return titleGte;
    }

    public void setTitleGte(String titleGte) {
        this.titleGte = titleGte;
    }

    public GraphWhereInput titleGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_GTE);
        return this;
    }

    public GraphWhereInput titleGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_GTE);
        return this;
    }

    public void setTitleGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_GTE);
        }
    }

    public boolean getTitleGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_GTE);
    }

    public GraphWhereInput titleIn(List<String> titleIn) {

        this.titleIn = titleIn;
        return this;
    }

    public GraphWhereInput addTitleInItem(String titleInItem) {
        if (this.titleIn == null) {
            this.titleIn = new ArrayList<String>();
        }
        this.titleIn.add(titleInItem);
        return this;
    }

    /**
     * Get titleIn
     *
     * @return titleIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTitleIn() {
        return titleIn;
    }

    public void setTitleIn(List<String> titleIn) {
        this.titleIn = titleIn;
    }

    public GraphWhereInput titleIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_IN);
        return this;
    }

    public GraphWhereInput titleIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_IN);
        return this;
    }

    public void setTitleIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_IN);
        }
    }

    public boolean getTitleIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_IN);
    }

    public GraphWhereInput titleLt(String titleLt) {

        this.titleLt = titleLt;
        return this;
    }

    /**
     * Get titleLt
     *
     * @return titleLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleLt() {
        return titleLt;
    }

    public void setTitleLt(String titleLt) {
        this.titleLt = titleLt;
    }

    public GraphWhereInput titleLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_LT);
        return this;
    }

    public GraphWhereInput titleLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_LT);
        return this;
    }

    public void setTitleLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_LT);
        }
    }

    public boolean getTitleLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_LT);
    }

    public GraphWhereInput titleLte(String titleLte) {

        this.titleLte = titleLte;
        return this;
    }

    /**
     * Get titleLte
     *
     * @return titleLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleLte() {
        return titleLte;
    }

    public void setTitleLte(String titleLte) {
        this.titleLte = titleLte;
    }

    public GraphWhereInput titleLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_LTE);
        return this;
    }

    public GraphWhereInput titleLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_LTE);
        return this;
    }

    public void setTitleLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_LTE);
        }
    }

    public boolean getTitleLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_LTE);
    }

    public GraphWhereInput titleNot(String titleNot) {

        this.titleNot = titleNot;
        return this;
    }

    /**
     * Get titleNot
     *
     * @return titleNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleNot() {
        return titleNot;
    }

    public void setTitleNot(String titleNot) {
        this.titleNot = titleNot;
    }

    public GraphWhereInput titleNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT);
        return this;
    }

    public GraphWhereInput titleNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT);
        return this;
    }

    public void setTitleNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT);
        }
    }

    public boolean getTitleNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_NOT);
    }

    public GraphWhereInput titleNotContains(String titleNotContains) {

        this.titleNotContains = titleNotContains;
        return this;
    }

    /**
     * Get titleNotContains
     *
     * @return titleNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleNotContains() {
        return titleNotContains;
    }

    public void setTitleNotContains(String titleNotContains) {
        this.titleNotContains = titleNotContains;
    }

    public GraphWhereInput titleNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_CONTAINS);
        return this;
    }

    public GraphWhereInput titleNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_CONTAINS);
        return this;
    }

    public void setTitleNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_CONTAINS);
        }
    }

    public boolean getTitleNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_NOT_CONTAINS);
    }

    public GraphWhereInput titleNotEndsWith(String titleNotEndsWith) {

        this.titleNotEndsWith = titleNotEndsWith;
        return this;
    }

    /**
     * Get titleNotEndsWith
     *
     * @return titleNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleNotEndsWith() {
        return titleNotEndsWith;
    }

    public void setTitleNotEndsWith(String titleNotEndsWith) {
        this.titleNotEndsWith = titleNotEndsWith;
    }

    public GraphWhereInput titleNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_ENDS_WITH);
        return this;
    }

    public GraphWhereInput titleNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_ENDS_WITH);
        return this;
    }

    public void setTitleNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_ENDS_WITH);
        }
    }

    public boolean getTitleNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_NOT_ENDS_WITH);
    }

    public GraphWhereInput titleNotIn(List<String> titleNotIn) {

        this.titleNotIn = titleNotIn;
        return this;
    }

    public GraphWhereInput addTitleNotInItem(String titleNotInItem) {
        if (this.titleNotIn == null) {
            this.titleNotIn = new ArrayList<String>();
        }
        this.titleNotIn.add(titleNotInItem);
        return this;
    }

    /**
     * Get titleNotIn
     *
     * @return titleNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTitleNotIn() {
        return titleNotIn;
    }

    public void setTitleNotIn(List<String> titleNotIn) {
        this.titleNotIn = titleNotIn;
    }

    public GraphWhereInput titleNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_IN);
        return this;
    }

    public GraphWhereInput titleNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_IN);
        return this;
    }

    public void setTitleNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_IN);
        }
    }

    public boolean getTitleNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_NOT_IN);
    }

    public GraphWhereInput titleNotStartsWith(String titleNotStartsWith) {

        this.titleNotStartsWith = titleNotStartsWith;
        return this;
    }

    /**
     * Get titleNotStartsWith
     *
     * @return titleNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleNotStartsWith() {
        return titleNotStartsWith;
    }

    public void setTitleNotStartsWith(String titleNotStartsWith) {
        this.titleNotStartsWith = titleNotStartsWith;
    }

    public GraphWhereInput titleNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_STARTS_WITH);
        return this;
    }

    public GraphWhereInput titleNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_STARTS_WITH);
        return this;
    }

    public void setTitleNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_NOT_STARTS_WITH);
        }
    }

    public boolean getTitleNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_NOT_STARTS_WITH);
    }

    public GraphWhereInput titleStartsWith(String titleStartsWith) {

        this.titleStartsWith = titleStartsWith;
        return this;
    }

    /**
     * Get titleStartsWith
     *
     * @return titleStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTitleStartsWith() {
        return titleStartsWith;
    }

    public void setTitleStartsWith(String titleStartsWith) {
        this.titleStartsWith = titleStartsWith;
    }

    public GraphWhereInput titleStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TITLE_STARTS_WITH);
        return this;
    }

    public GraphWhereInput titleStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TITLE_STARTS_WITH);
        return this;
    }

    public void setTitleStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TITLE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TITLE_STARTS_WITH);
        }
    }

    public boolean getTitleStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TITLE_STARTS_WITH);
    }

    public GraphWhereInput type(GraphType type) {

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

    public GraphWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public GraphWhereInput type_ExplictlyNonNull() {
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

    public GraphWhereInput typeIn(List<GraphType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public GraphWhereInput addTypeInItem(GraphType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<GraphType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<GraphType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<GraphType> typeIn) {
        this.typeIn = typeIn;
    }

    public GraphWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public GraphWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public GraphWhereInput typeNot(GraphType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GraphType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(GraphType typeNot) {
        this.typeNot = typeNot;
    }

    public GraphWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public GraphWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public GraphWhereInput typeNotIn(List<GraphType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public GraphWhereInput addTypeNotInItem(GraphType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<GraphType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<GraphType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<GraphType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public GraphWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public GraphWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public GraphWhereInput view(ViewWhereInput view) {

        this.view = view;
        return this;
    }

    /**
     * Get view
     *
     * @return view
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ViewWhereInput getView() {
        return view;
    }

    public void setView(ViewWhereInput view) {
        this.view = view;
    }

    public GraphWhereInput view_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIEW);
        return this;
    }

    public GraphWhereInput view_ExplictlyNonNull() {
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

    public GraphWhereInput vmNicsEvery(VmNicWhereInput vmNicsEvery) {

        this.vmNicsEvery = vmNicsEvery;
        return this;
    }

    /**
     * Get vmNicsEvery
     *
     * @return vmNicsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNicsEvery() {
        return vmNicsEvery;
    }

    public void setVmNicsEvery(VmNicWhereInput vmNicsEvery) {
        this.vmNicsEvery = vmNicsEvery;
    }

    public GraphWhereInput vmNicsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS_EVERY);
        return this;
    }

    public GraphWhereInput vmNicsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_EVERY);
        return this;
    }

    public void setVmNicsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_EVERY);
        }
    }

    public boolean getVmNicsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS_EVERY);
    }

    public GraphWhereInput vmNicsNone(VmNicWhereInput vmNicsNone) {

        this.vmNicsNone = vmNicsNone;
        return this;
    }

    /**
     * Get vmNicsNone
     *
     * @return vmNicsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNicsNone() {
        return vmNicsNone;
    }

    public void setVmNicsNone(VmNicWhereInput vmNicsNone) {
        this.vmNicsNone = vmNicsNone;
    }

    public GraphWhereInput vmNicsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS_NONE);
        return this;
    }

    public GraphWhereInput vmNicsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_NONE);
        return this;
    }

    public void setVmNicsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_NONE);
        }
    }

    public boolean getVmNicsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS_NONE);
    }

    public GraphWhereInput vmNicsSome(VmNicWhereInput vmNicsSome) {

        this.vmNicsSome = vmNicsSome;
        return this;
    }

    /**
     * Get vmNicsSome
     *
     * @return vmNicsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicWhereInput getVmNicsSome() {
        return vmNicsSome;
    }

    public void setVmNicsSome(VmNicWhereInput vmNicsSome) {
        this.vmNicsSome = vmNicsSome;
    }

    public GraphWhereInput vmNicsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS_SOME);
        return this;
    }

    public GraphWhereInput vmNicsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_SOME);
        return this;
    }

    public void setVmNicsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS_SOME);
        }
    }

    public boolean getVmNicsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS_SOME);
    }

    public GraphWhereInput vmVolumesEvery(VmVolumeWhereInput vmVolumesEvery) {

        this.vmVolumesEvery = vmVolumesEvery;
        return this;
    }

    /**
     * Get vmVolumesEvery
     *
     * @return vmVolumesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumesEvery() {
        return vmVolumesEvery;
    }

    public void setVmVolumesEvery(VmVolumeWhereInput vmVolumesEvery) {
        this.vmVolumesEvery = vmVolumesEvery;
    }

    public GraphWhereInput vmVolumesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        return this;
    }

    public GraphWhereInput vmVolumesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        return this;
    }

    public void setVmVolumesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_EVERY);
        }
    }

    public boolean getVmVolumesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES_EVERY);
    }

    public GraphWhereInput vmVolumesNone(VmVolumeWhereInput vmVolumesNone) {

        this.vmVolumesNone = vmVolumesNone;
        return this;
    }

    /**
     * Get vmVolumesNone
     *
     * @return vmVolumesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumesNone() {
        return vmVolumesNone;
    }

    public void setVmVolumesNone(VmVolumeWhereInput vmVolumesNone) {
        this.vmVolumesNone = vmVolumesNone;
    }

    public GraphWhereInput vmVolumesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_NONE);
        return this;
    }

    public GraphWhereInput vmVolumesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_NONE);
        return this;
    }

    public void setVmVolumesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_NONE);
        }
    }

    public boolean getVmVolumesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES_NONE);
    }

    public GraphWhereInput vmVolumesSome(VmVolumeWhereInput vmVolumesSome) {

        this.vmVolumesSome = vmVolumesSome;
        return this;
    }

    /**
     * Get vmVolumesSome
     *
     * @return vmVolumesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumesSome() {
        return vmVolumesSome;
    }

    public void setVmVolumesSome(VmVolumeWhereInput vmVolumesSome) {
        this.vmVolumesSome = vmVolumesSome;
    }

    public GraphWhereInput vmVolumesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_SOME);
        return this;
    }

    public GraphWhereInput vmVolumesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_SOME);
        return this;
    }

    public void setVmVolumesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES_SOME);
        }
    }

    public boolean getVmVolumesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES_SOME);
    }

    public GraphWhereInput vmsEvery(VmWhereInput vmsEvery) {

        this.vmsEvery = vmsEvery;
        return this;
    }

    /**
     * Get vmsEvery
     *
     * @return vmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsEvery() {
        return vmsEvery;
    }

    public void setVmsEvery(VmWhereInput vmsEvery) {
        this.vmsEvery = vmsEvery;
    }

    public GraphWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public GraphWhereInput vmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public void setVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        }
    }

    public boolean getVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_EVERY);
    }

    public GraphWhereInput vmsNone(VmWhereInput vmsNone) {

        this.vmsNone = vmsNone;
        return this;
    }

    /**
     * Get vmsNone
     *
     * @return vmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsNone() {
        return vmsNone;
    }

    public void setVmsNone(VmWhereInput vmsNone) {
        this.vmsNone = vmsNone;
    }

    public GraphWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public GraphWhereInput vmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public void setVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        }
    }

    public boolean getVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_NONE);
    }

    public GraphWhereInput vmsSome(VmWhereInput vmsSome) {

        this.vmsSome = vmsSome;
        return this;
    }

    /**
     * Get vmsSome
     *
     * @return vmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsSome() {
        return vmsSome;
    }

    public void setVmsSome(VmWhereInput vmsSome) {
        this.vmsSome = vmsSome;
    }

    public GraphWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public GraphWhereInput vmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public void setVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        }
    }

    public boolean getVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_SOME);
    }

    public GraphWhereInput witnessesEvery(WitnessWhereInput witnessesEvery) {

        this.witnessesEvery = witnessesEvery;
        return this;
    }

    /**
     * Get witnessesEvery
     *
     * @return witnessesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public WitnessWhereInput getWitnessesEvery() {
        return witnessesEvery;
    }

    public void setWitnessesEvery(WitnessWhereInput witnessesEvery) {
        this.witnessesEvery = witnessesEvery;
    }

    public GraphWhereInput witnessesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESSES_EVERY);
        return this;
    }

    public GraphWhereInput witnessesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESSES_EVERY);
        return this;
    }

    public void setWitnessesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESSES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESSES_EVERY);
        }
    }

    public boolean getWitnessesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESSES_EVERY);
    }

    public GraphWhereInput witnessesNone(WitnessWhereInput witnessesNone) {

        this.witnessesNone = witnessesNone;
        return this;
    }

    /**
     * Get witnessesNone
     *
     * @return witnessesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public WitnessWhereInput getWitnessesNone() {
        return witnessesNone;
    }

    public void setWitnessesNone(WitnessWhereInput witnessesNone) {
        this.witnessesNone = witnessesNone;
    }

    public GraphWhereInput witnessesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESSES_NONE);
        return this;
    }

    public GraphWhereInput witnessesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESSES_NONE);
        return this;
    }

    public void setWitnessesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESSES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESSES_NONE);
        }
    }

    public boolean getWitnessesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESSES_NONE);
    }

    public GraphWhereInput witnessesSome(WitnessWhereInput witnessesSome) {

        this.witnessesSome = witnessesSome;
        return this;
    }

    /**
     * Get witnessesSome
     *
     * @return witnessesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public WitnessWhereInput getWitnessesSome() {
        return witnessesSome;
    }

    public void setWitnessesSome(WitnessWhereInput witnessesSome) {
        this.witnessesSome = witnessesSome;
    }

    public GraphWhereInput witnessesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESSES_SOME);
        return this;
    }

    public GraphWhereInput witnessesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESSES_SOME);
        return this;
    }

    public void setWitnessesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESSES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESSES_SOME);
        }
    }

    public boolean getWitnessesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESSES_SOME);
    }

    public GraphWhereInput zonesEvery(ZoneWhereInput zonesEvery) {

        this.zonesEvery = zonesEvery;
        return this;
    }

    /**
     * Get zonesEvery
     *
     * @return zonesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ZoneWhereInput getZonesEvery() {
        return zonesEvery;
    }

    public void setZonesEvery(ZoneWhereInput zonesEvery) {
        this.zonesEvery = zonesEvery;
    }

    public GraphWhereInput zonesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES_EVERY);
        return this;
    }

    public GraphWhereInput zonesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES_EVERY);
        return this;
    }

    public void setZonesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES_EVERY);
        }
    }

    public boolean getZonesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES_EVERY);
    }

    public GraphWhereInput zonesNone(ZoneWhereInput zonesNone) {

        this.zonesNone = zonesNone;
        return this;
    }

    /**
     * Get zonesNone
     *
     * @return zonesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ZoneWhereInput getZonesNone() {
        return zonesNone;
    }

    public void setZonesNone(ZoneWhereInput zonesNone) {
        this.zonesNone = zonesNone;
    }

    public GraphWhereInput zonesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES_NONE);
        return this;
    }

    public GraphWhereInput zonesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES_NONE);
        return this;
    }

    public void setZonesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES_NONE);
        }
    }

    public boolean getZonesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES_NONE);
    }

    public GraphWhereInput zonesSome(ZoneWhereInput zonesSome) {

        this.zonesSome = zonesSome;
        return this;
    }

    /**
     * Get zonesSome
     *
     * @return zonesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ZoneWhereInput getZonesSome() {
        return zonesSome;
    }

    public void setZonesSome(ZoneWhereInput zonesSome) {
        this.zonesSome = zonesSome;
    }

    public GraphWhereInput zonesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONES_SOME);
        return this;
    }

    public GraphWhereInput zonesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONES_SOME);
        return this;
    }

    public void setZonesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONES_SOME);
        }
    }

    public boolean getZonesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONES_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GraphWhereInput graphWhereInput = (GraphWhereInput) o;
        return Objects.equals(this.AND, graphWhereInput.AND)
                && Objects.equals(this.NOT, graphWhereInput.NOT)
                && Objects.equals(this.OR, graphWhereInput.OR)
                && Objects.equals(this.cluster, graphWhereInput.cluster)
                && Objects.equals(this.disksEvery, graphWhereInput.disksEvery)
                && Objects.equals(this.disksNone, graphWhereInput.disksNone)
                && Objects.equals(this.disksSome, graphWhereInput.disksSome)
                && Objects.equals(this.entityAsyncStatus, graphWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, graphWhereInput.entityAsyncStatusIn)
                && Objects.equals(this.entityAsyncStatusNot, graphWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, graphWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.hostsEvery, graphWhereInput.hostsEvery)
                && Objects.equals(this.hostsNone, graphWhereInput.hostsNone)
                && Objects.equals(this.hostsSome, graphWhereInput.hostsSome)
                && Objects.equals(this.id, graphWhereInput.id)
                && Objects.equals(this.idContains, graphWhereInput.idContains)
                && Objects.equals(this.idEndsWith, graphWhereInput.idEndsWith)
                && Objects.equals(this.idGt, graphWhereInput.idGt)
                && Objects.equals(this.idGte, graphWhereInput.idGte)
                && Objects.equals(this.idIn, graphWhereInput.idIn)
                && Objects.equals(this.idLt, graphWhereInput.idLt)
                && Objects.equals(this.idLte, graphWhereInput.idLte)
                && Objects.equals(this.idNot, graphWhereInput.idNot)
                && Objects.equals(this.idNotContains, graphWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, graphWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, graphWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, graphWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, graphWhereInput.idStartsWith)
                && Objects.equals(this.localId, graphWhereInput.localId)
                && Objects.equals(this.localIdContains, graphWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, graphWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, graphWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, graphWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, graphWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, graphWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, graphWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, graphWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, graphWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, graphWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, graphWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, graphWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, graphWhereInput.localIdStartsWith)
                && Objects.equals(this.lunsEvery, graphWhereInput.lunsEvery)
                && Objects.equals(this.lunsNone, graphWhereInput.lunsNone)
                && Objects.equals(this.lunsSome, graphWhereInput.lunsSome)
                && Objects.equals(this.metricCount, graphWhereInput.metricCount)
                && Objects.equals(this.metricCountGt, graphWhereInput.metricCountGt)
                && Objects.equals(this.metricCountGte, graphWhereInput.metricCountGte)
                && Objects.equals(this.metricCountIn, graphWhereInput.metricCountIn)
                && Objects.equals(this.metricCountLt, graphWhereInput.metricCountLt)
                && Objects.equals(this.metricCountLte, graphWhereInput.metricCountLte)
                && Objects.equals(this.metricCountNot, graphWhereInput.metricCountNot)
                && Objects.equals(this.metricCountNotIn, graphWhereInput.metricCountNotIn)
                && Objects.equals(this.metricName, graphWhereInput.metricName)
                && Objects.equals(this.metricNameContains, graphWhereInput.metricNameContains)
                && Objects.equals(this.metricNameEndsWith, graphWhereInput.metricNameEndsWith)
                && Objects.equals(this.metricNameGt, graphWhereInput.metricNameGt)
                && Objects.equals(this.metricNameGte, graphWhereInput.metricNameGte)
                && Objects.equals(this.metricNameIn, graphWhereInput.metricNameIn)
                && Objects.equals(this.metricNameLt, graphWhereInput.metricNameLt)
                && Objects.equals(this.metricNameLte, graphWhereInput.metricNameLte)
                && Objects.equals(this.metricNameNot, graphWhereInput.metricNameNot)
                && Objects.equals(this.metricNameNotContains, graphWhereInput.metricNameNotContains)
                && Objects.equals(this.metricNameNotEndsWith, graphWhereInput.metricNameNotEndsWith)
                && Objects.equals(this.metricNameNotIn, graphWhereInput.metricNameNotIn)
                && Objects.equals(
                        this.metricNameNotStartsWith, graphWhereInput.metricNameNotStartsWith)
                && Objects.equals(this.metricNameStartsWith, graphWhereInput.metricNameStartsWith)
                && Objects.equals(this.metricType, graphWhereInput.metricType)
                && Objects.equals(this.metricTypeIn, graphWhereInput.metricTypeIn)
                && Objects.equals(this.metricTypeNot, graphWhereInput.metricTypeNot)
                && Objects.equals(this.metricTypeNotIn, graphWhereInput.metricTypeNotIn)
                && Objects.equals(this.namespacesEvery, graphWhereInput.namespacesEvery)
                && Objects.equals(this.namespacesNone, graphWhereInput.namespacesNone)
                && Objects.equals(this.namespacesSome, graphWhereInput.namespacesSome)
                && Objects.equals(this.network, graphWhereInput.network)
                && Objects.equals(this.networkIn, graphWhereInput.networkIn)
                && Objects.equals(this.networkNot, graphWhereInput.networkNot)
                && Objects.equals(this.networkNotIn, graphWhereInput.networkNotIn)
                && Objects.equals(this.nicsEvery, graphWhereInput.nicsEvery)
                && Objects.equals(this.nicsNone, graphWhereInput.nicsNone)
                && Objects.equals(this.nicsSome, graphWhereInput.nicsSome)
                && Objects.equals(this.resourceType, graphWhereInput.resourceType)
                && Objects.equals(this.resourceTypeContains, graphWhereInput.resourceTypeContains)
                && Objects.equals(this.resourceTypeEndsWith, graphWhereInput.resourceTypeEndsWith)
                && Objects.equals(this.resourceTypeGt, graphWhereInput.resourceTypeGt)
                && Objects.equals(this.resourceTypeGte, graphWhereInput.resourceTypeGte)
                && Objects.equals(this.resourceTypeIn, graphWhereInput.resourceTypeIn)
                && Objects.equals(this.resourceTypeLt, graphWhereInput.resourceTypeLt)
                && Objects.equals(this.resourceTypeLte, graphWhereInput.resourceTypeLte)
                && Objects.equals(this.resourceTypeNot, graphWhereInput.resourceTypeNot)
                && Objects.equals(
                        this.resourceTypeNotContains, graphWhereInput.resourceTypeNotContains)
                && Objects.equals(
                        this.resourceTypeNotEndsWith, graphWhereInput.resourceTypeNotEndsWith)
                && Objects.equals(this.resourceTypeNotIn, graphWhereInput.resourceTypeNotIn)
                && Objects.equals(
                        this.resourceTypeNotStartsWith, graphWhereInput.resourceTypeNotStartsWith)
                && Objects.equals(
                        this.resourceTypeStartsWith, graphWhereInput.resourceTypeStartsWith)
                && Objects.equals(this.service, graphWhereInput.service)
                && Objects.equals(this.serviceContains, graphWhereInput.serviceContains)
                && Objects.equals(this.serviceEndsWith, graphWhereInput.serviceEndsWith)
                && Objects.equals(this.serviceGt, graphWhereInput.serviceGt)
                && Objects.equals(this.serviceGte, graphWhereInput.serviceGte)
                && Objects.equals(this.serviceIn, graphWhereInput.serviceIn)
                && Objects.equals(this.serviceLt, graphWhereInput.serviceLt)
                && Objects.equals(this.serviceLte, graphWhereInput.serviceLte)
                && Objects.equals(this.serviceNot, graphWhereInput.serviceNot)
                && Objects.equals(this.serviceNotContains, graphWhereInput.serviceNotContains)
                && Objects.equals(this.serviceNotEndsWith, graphWhereInput.serviceNotEndsWith)
                && Objects.equals(this.serviceNotIn, graphWhereInput.serviceNotIn)
                && Objects.equals(this.serviceNotStartsWith, graphWhereInput.serviceNotStartsWith)
                && Objects.equals(this.serviceStartsWith, graphWhereInput.serviceStartsWith)
                && Objects.equals(this.title, graphWhereInput.title)
                && Objects.equals(this.titleContains, graphWhereInput.titleContains)
                && Objects.equals(this.titleEndsWith, graphWhereInput.titleEndsWith)
                && Objects.equals(this.titleGt, graphWhereInput.titleGt)
                && Objects.equals(this.titleGte, graphWhereInput.titleGte)
                && Objects.equals(this.titleIn, graphWhereInput.titleIn)
                && Objects.equals(this.titleLt, graphWhereInput.titleLt)
                && Objects.equals(this.titleLte, graphWhereInput.titleLte)
                && Objects.equals(this.titleNot, graphWhereInput.titleNot)
                && Objects.equals(this.titleNotContains, graphWhereInput.titleNotContains)
                && Objects.equals(this.titleNotEndsWith, graphWhereInput.titleNotEndsWith)
                && Objects.equals(this.titleNotIn, graphWhereInput.titleNotIn)
                && Objects.equals(this.titleNotStartsWith, graphWhereInput.titleNotStartsWith)
                && Objects.equals(this.titleStartsWith, graphWhereInput.titleStartsWith)
                && Objects.equals(this.type, graphWhereInput.type)
                && Objects.equals(this.typeIn, graphWhereInput.typeIn)
                && Objects.equals(this.typeNot, graphWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, graphWhereInput.typeNotIn)
                && Objects.equals(this.view, graphWhereInput.view)
                && Objects.equals(this.vmNicsEvery, graphWhereInput.vmNicsEvery)
                && Objects.equals(this.vmNicsNone, graphWhereInput.vmNicsNone)
                && Objects.equals(this.vmNicsSome, graphWhereInput.vmNicsSome)
                && Objects.equals(this.vmVolumesEvery, graphWhereInput.vmVolumesEvery)
                && Objects.equals(this.vmVolumesNone, graphWhereInput.vmVolumesNone)
                && Objects.equals(this.vmVolumesSome, graphWhereInput.vmVolumesSome)
                && Objects.equals(this.vmsEvery, graphWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, graphWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, graphWhereInput.vmsSome)
                && Objects.equals(this.witnessesEvery, graphWhereInput.witnessesEvery)
                && Objects.equals(this.witnessesNone, graphWhereInput.witnessesNone)
                && Objects.equals(this.witnessesSome, graphWhereInput.witnessesSome)
                && Objects.equals(this.zonesEvery, graphWhereInput.zonesEvery)
                && Objects.equals(this.zonesNone, graphWhereInput.zonesNone)
                && Objects.equals(this.zonesSome, graphWhereInput.zonesSome);
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
                AND,
                NOT,
                OR,
                cluster,
                disksEvery,
                disksNone,
                disksSome,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                hostsEvery,
                hostsNone,
                hostsSome,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                lunsEvery,
                lunsNone,
                lunsSome,
                metricCount,
                metricCountGt,
                metricCountGte,
                metricCountIn,
                metricCountLt,
                metricCountLte,
                metricCountNot,
                metricCountNotIn,
                metricName,
                metricNameContains,
                metricNameEndsWith,
                metricNameGt,
                metricNameGte,
                metricNameIn,
                metricNameLt,
                metricNameLte,
                metricNameNot,
                metricNameNotContains,
                metricNameNotEndsWith,
                metricNameNotIn,
                metricNameNotStartsWith,
                metricNameStartsWith,
                metricType,
                metricTypeIn,
                metricTypeNot,
                metricTypeNotIn,
                namespacesEvery,
                namespacesNone,
                namespacesSome,
                network,
                networkIn,
                networkNot,
                networkNotIn,
                nicsEvery,
                nicsNone,
                nicsSome,
                resourceType,
                resourceTypeContains,
                resourceTypeEndsWith,
                resourceTypeGt,
                resourceTypeGte,
                resourceTypeIn,
                resourceTypeLt,
                resourceTypeLte,
                resourceTypeNot,
                resourceTypeNotContains,
                resourceTypeNotEndsWith,
                resourceTypeNotIn,
                resourceTypeNotStartsWith,
                resourceTypeStartsWith,
                service,
                serviceContains,
                serviceEndsWith,
                serviceGt,
                serviceGte,
                serviceIn,
                serviceLt,
                serviceLte,
                serviceNot,
                serviceNotContains,
                serviceNotEndsWith,
                serviceNotIn,
                serviceNotStartsWith,
                serviceStartsWith,
                title,
                titleContains,
                titleEndsWith,
                titleGt,
                titleGte,
                titleIn,
                titleLt,
                titleLte,
                titleNot,
                titleNotContains,
                titleNotEndsWith,
                titleNotIn,
                titleNotStartsWith,
                titleStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                view,
                vmNicsEvery,
                vmNicsNone,
                vmNicsSome,
                vmVolumesEvery,
                vmVolumesNone,
                vmVolumesSome,
                vmsEvery,
                vmsNone,
                vmsSome,
                witnessesEvery,
                witnessesNone,
                witnessesSome,
                zonesEvery,
                zonesNone,
                zonesSome);
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
        sb.append("class GraphWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    disksEvery: ").append(toIndentedString(disksEvery)).append("\n");
        sb.append("    disksNone: ").append(toIndentedString(disksNone)).append("\n");
        sb.append("    disksSome: ").append(toIndentedString(disksSome)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    hostsEvery: ").append(toIndentedString(hostsEvery)).append("\n");
        sb.append("    hostsNone: ").append(toIndentedString(hostsNone)).append("\n");
        sb.append("    hostsSome: ").append(toIndentedString(hostsSome)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    lunsEvery: ").append(toIndentedString(lunsEvery)).append("\n");
        sb.append("    lunsNone: ").append(toIndentedString(lunsNone)).append("\n");
        sb.append("    lunsSome: ").append(toIndentedString(lunsSome)).append("\n");
        sb.append("    metricCount: ").append(toIndentedString(metricCount)).append("\n");
        sb.append("    metricCountGt: ").append(toIndentedString(metricCountGt)).append("\n");
        sb.append("    metricCountGte: ").append(toIndentedString(metricCountGte)).append("\n");
        sb.append("    metricCountIn: ").append(toIndentedString(metricCountIn)).append("\n");
        sb.append("    metricCountLt: ").append(toIndentedString(metricCountLt)).append("\n");
        sb.append("    metricCountLte: ").append(toIndentedString(metricCountLte)).append("\n");
        sb.append("    metricCountNot: ").append(toIndentedString(metricCountNot)).append("\n");
        sb.append("    metricCountNotIn: ").append(toIndentedString(metricCountNotIn)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricNameContains: ")
                .append(toIndentedString(metricNameContains))
                .append("\n");
        sb.append("    metricNameEndsWith: ")
                .append(toIndentedString(metricNameEndsWith))
                .append("\n");
        sb.append("    metricNameGt: ").append(toIndentedString(metricNameGt)).append("\n");
        sb.append("    metricNameGte: ").append(toIndentedString(metricNameGte)).append("\n");
        sb.append("    metricNameIn: ").append(toIndentedString(metricNameIn)).append("\n");
        sb.append("    metricNameLt: ").append(toIndentedString(metricNameLt)).append("\n");
        sb.append("    metricNameLte: ").append(toIndentedString(metricNameLte)).append("\n");
        sb.append("    metricNameNot: ").append(toIndentedString(metricNameNot)).append("\n");
        sb.append("    metricNameNotContains: ")
                .append(toIndentedString(metricNameNotContains))
                .append("\n");
        sb.append("    metricNameNotEndsWith: ")
                .append(toIndentedString(metricNameNotEndsWith))
                .append("\n");
        sb.append("    metricNameNotIn: ").append(toIndentedString(metricNameNotIn)).append("\n");
        sb.append("    metricNameNotStartsWith: ")
                .append(toIndentedString(metricNameNotStartsWith))
                .append("\n");
        sb.append("    metricNameStartsWith: ")
                .append(toIndentedString(metricNameStartsWith))
                .append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    metricTypeIn: ").append(toIndentedString(metricTypeIn)).append("\n");
        sb.append("    metricTypeNot: ").append(toIndentedString(metricTypeNot)).append("\n");
        sb.append("    metricTypeNotIn: ").append(toIndentedString(metricTypeNotIn)).append("\n");
        sb.append("    namespacesEvery: ").append(toIndentedString(namespacesEvery)).append("\n");
        sb.append("    namespacesNone: ").append(toIndentedString(namespacesNone)).append("\n");
        sb.append("    namespacesSome: ").append(toIndentedString(namespacesSome)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    networkIn: ").append(toIndentedString(networkIn)).append("\n");
        sb.append("    networkNot: ").append(toIndentedString(networkNot)).append("\n");
        sb.append("    networkNotIn: ").append(toIndentedString(networkNotIn)).append("\n");
        sb.append("    nicsEvery: ").append(toIndentedString(nicsEvery)).append("\n");
        sb.append("    nicsNone: ").append(toIndentedString(nicsNone)).append("\n");
        sb.append("    nicsSome: ").append(toIndentedString(nicsSome)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceTypeContains: ")
                .append(toIndentedString(resourceTypeContains))
                .append("\n");
        sb.append("    resourceTypeEndsWith: ")
                .append(toIndentedString(resourceTypeEndsWith))
                .append("\n");
        sb.append("    resourceTypeGt: ").append(toIndentedString(resourceTypeGt)).append("\n");
        sb.append("    resourceTypeGte: ").append(toIndentedString(resourceTypeGte)).append("\n");
        sb.append("    resourceTypeIn: ").append(toIndentedString(resourceTypeIn)).append("\n");
        sb.append("    resourceTypeLt: ").append(toIndentedString(resourceTypeLt)).append("\n");
        sb.append("    resourceTypeLte: ").append(toIndentedString(resourceTypeLte)).append("\n");
        sb.append("    resourceTypeNot: ").append(toIndentedString(resourceTypeNot)).append("\n");
        sb.append("    resourceTypeNotContains: ")
                .append(toIndentedString(resourceTypeNotContains))
                .append("\n");
        sb.append("    resourceTypeNotEndsWith: ")
                .append(toIndentedString(resourceTypeNotEndsWith))
                .append("\n");
        sb.append("    resourceTypeNotIn: ")
                .append(toIndentedString(resourceTypeNotIn))
                .append("\n");
        sb.append("    resourceTypeNotStartsWith: ")
                .append(toIndentedString(resourceTypeNotStartsWith))
                .append("\n");
        sb.append("    resourceTypeStartsWith: ")
                .append(toIndentedString(resourceTypeStartsWith))
                .append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    serviceContains: ").append(toIndentedString(serviceContains)).append("\n");
        sb.append("    serviceEndsWith: ").append(toIndentedString(serviceEndsWith)).append("\n");
        sb.append("    serviceGt: ").append(toIndentedString(serviceGt)).append("\n");
        sb.append("    serviceGte: ").append(toIndentedString(serviceGte)).append("\n");
        sb.append("    serviceIn: ").append(toIndentedString(serviceIn)).append("\n");
        sb.append("    serviceLt: ").append(toIndentedString(serviceLt)).append("\n");
        sb.append("    serviceLte: ").append(toIndentedString(serviceLte)).append("\n");
        sb.append("    serviceNot: ").append(toIndentedString(serviceNot)).append("\n");
        sb.append("    serviceNotContains: ")
                .append(toIndentedString(serviceNotContains))
                .append("\n");
        sb.append("    serviceNotEndsWith: ")
                .append(toIndentedString(serviceNotEndsWith))
                .append("\n");
        sb.append("    serviceNotIn: ").append(toIndentedString(serviceNotIn)).append("\n");
        sb.append("    serviceNotStartsWith: ")
                .append(toIndentedString(serviceNotStartsWith))
                .append("\n");
        sb.append("    serviceStartsWith: ")
                .append(toIndentedString(serviceStartsWith))
                .append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    titleContains: ").append(toIndentedString(titleContains)).append("\n");
        sb.append("    titleEndsWith: ").append(toIndentedString(titleEndsWith)).append("\n");
        sb.append("    titleGt: ").append(toIndentedString(titleGt)).append("\n");
        sb.append("    titleGte: ").append(toIndentedString(titleGte)).append("\n");
        sb.append("    titleIn: ").append(toIndentedString(titleIn)).append("\n");
        sb.append("    titleLt: ").append(toIndentedString(titleLt)).append("\n");
        sb.append("    titleLte: ").append(toIndentedString(titleLte)).append("\n");
        sb.append("    titleNot: ").append(toIndentedString(titleNot)).append("\n");
        sb.append("    titleNotContains: ").append(toIndentedString(titleNotContains)).append("\n");
        sb.append("    titleNotEndsWith: ").append(toIndentedString(titleNotEndsWith)).append("\n");
        sb.append("    titleNotIn: ").append(toIndentedString(titleNotIn)).append("\n");
        sb.append("    titleNotStartsWith: ")
                .append(toIndentedString(titleNotStartsWith))
                .append("\n");
        sb.append("    titleStartsWith: ").append(toIndentedString(titleStartsWith)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    vmNicsEvery: ").append(toIndentedString(vmNicsEvery)).append("\n");
        sb.append("    vmNicsNone: ").append(toIndentedString(vmNicsNone)).append("\n");
        sb.append("    vmNicsSome: ").append(toIndentedString(vmNicsSome)).append("\n");
        sb.append("    vmVolumesEvery: ").append(toIndentedString(vmVolumesEvery)).append("\n");
        sb.append("    vmVolumesNone: ").append(toIndentedString(vmVolumesNone)).append("\n");
        sb.append("    vmVolumesSome: ").append(toIndentedString(vmVolumesSome)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
        sb.append("    witnessesEvery: ").append(toIndentedString(witnessesEvery)).append("\n");
        sb.append("    witnessesNone: ").append(toIndentedString(witnessesNone)).append("\n");
        sb.append("    witnessesSome: ").append(toIndentedString(witnessesSome)).append("\n");
        sb.append("    zonesEvery: ").append(toIndentedString(zonesEvery)).append("\n");
        sb.append("    zonesNone: ").append(toIndentedString(zonesNone)).append("\n");
        sb.append("    zonesSome: ").append(toIndentedString(zonesSome)).append("\n");
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

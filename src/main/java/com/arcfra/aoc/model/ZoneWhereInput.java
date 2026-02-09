package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ZoneWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ZoneWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ZoneWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ZoneWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ZoneWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DATACENTER = "datacenter";

    @SerializedName(SERIALIZED_NAME_DATACENTER)
    private DatacenterWhereInput datacenter;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
    private Long failureDataSpace;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_GT = "failure_data_space_gt";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT)
    private Long failureDataSpaceGt;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE = "failure_data_space_gte";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE)
    private Long failureDataSpaceGte;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_IN = "failure_data_space_in";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN)
    private List<Long> failureDataSpaceIn = null;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_LT = "failure_data_space_lt";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT)
    private Long failureDataSpaceLt;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE = "failure_data_space_lte";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE)
    private Long failureDataSpaceLte;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT = "failure_data_space_not";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT)
    private Long failureDataSpaceNot;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN =
            "failure_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN)
    private List<Long> failureDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_HOST_NUM = "host_num";

    @SerializedName(SERIALIZED_NAME_HOST_NUM)
    private Integer hostNum;

    public static final String SERIALIZED_NAME_HOST_NUM_GT = "host_num_gt";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_GT)
    private Integer hostNumGt;

    public static final String SERIALIZED_NAME_HOST_NUM_GTE = "host_num_gte";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_GTE)
    private Integer hostNumGte;

    public static final String SERIALIZED_NAME_HOST_NUM_IN = "host_num_in";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_IN)
    private List<Integer> hostNumIn = null;

    public static final String SERIALIZED_NAME_HOST_NUM_LT = "host_num_lt";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_LT)
    private Integer hostNumLt;

    public static final String SERIALIZED_NAME_HOST_NUM_LTE = "host_num_lte";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_LTE)
    private Integer hostNumLte;

    public static final String SERIALIZED_NAME_HOST_NUM_NOT = "host_num_not";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT)
    private Integer hostNumNot;

    public static final String SERIALIZED_NAME_HOST_NUM_NOT_IN = "host_num_not_in";

    @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT_IN)
    private List<Integer> hostNumNotIn = null;

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

    public static final String SERIALIZED_NAME_IS_PREFERRED = "is_preferred";

    @SerializedName(SERIALIZED_NAME_IS_PREFERRED)
    private Boolean isPreferred;

    public static final String SERIALIZED_NAME_IS_PREFERRED_NOT = "is_preferred_not";

    @SerializedName(SERIALIZED_NAME_IS_PREFERRED_NOT)
    private Boolean isPreferredNot;

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

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
    private Integer provisionedCpuCores;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM =
            "provisioned_cpu_cores_for_active_vm";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM)
    private Integer provisionedCpuCoresForActiveVm;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT =
            "provisioned_cpu_cores_for_active_vm_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT)
    private Integer provisionedCpuCoresForActiveVmGt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE =
            "provisioned_cpu_cores_for_active_vm_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE)
    private Integer provisionedCpuCoresForActiveVmGte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN =
            "provisioned_cpu_cores_for_active_vm_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN)
    private List<Integer> provisionedCpuCoresForActiveVmIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT =
            "provisioned_cpu_cores_for_active_vm_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT)
    private Integer provisionedCpuCoresForActiveVmLt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE =
            "provisioned_cpu_cores_for_active_vm_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE)
    private Integer provisionedCpuCoresForActiveVmLte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT =
            "provisioned_cpu_cores_for_active_vm_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT)
    private Integer provisionedCpuCoresForActiveVmNot;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN =
            "provisioned_cpu_cores_for_active_vm_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN)
    private List<Integer> provisionedCpuCoresForActiveVmNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT =
            "provisioned_cpu_cores_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT)
    private Integer provisionedCpuCoresGt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE =
            "provisioned_cpu_cores_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE)
    private Integer provisionedCpuCoresGte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN =
            "provisioned_cpu_cores_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN)
    private List<Integer> provisionedCpuCoresIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT =
            "provisioned_cpu_cores_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT)
    private Integer provisionedCpuCoresLt;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE =
            "provisioned_cpu_cores_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE)
    private Integer provisionedCpuCoresLte;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT =
            "provisioned_cpu_cores_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT)
    private Integer provisionedCpuCoresNot;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN =
            "provisioned_cpu_cores_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN)
    private List<Integer> provisionedCpuCoresNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE = "provisioned_data_space";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE)
    private Long provisionedDataSpace;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT =
            "provisioned_data_space_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT)
    private Long provisionedDataSpaceGt;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE =
            "provisioned_data_space_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE)
    private Long provisionedDataSpaceGte;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN =
            "provisioned_data_space_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN)
    private List<Long> provisionedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT =
            "provisioned_data_space_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT)
    private Long provisionedDataSpaceLt;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE =
            "provisioned_data_space_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE)
    private Long provisionedDataSpaceLte;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT =
            "provisioned_data_space_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT)
    private Long provisionedDataSpaceNot;

    public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN =
            "provisioned_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN)
    private List<Long> provisionedDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES =
            "provisioned_memory_bytes";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
    private Long provisionedMemoryBytes;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT =
            "provisioned_memory_bytes_gt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT)
    private Long provisionedMemoryBytesGt;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE =
            "provisioned_memory_bytes_gte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE)
    private Long provisionedMemoryBytesGte;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN =
            "provisioned_memory_bytes_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN)
    private List<Long> provisionedMemoryBytesIn = null;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT =
            "provisioned_memory_bytes_lt";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT)
    private Long provisionedMemoryBytesLt;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE =
            "provisioned_memory_bytes_lte";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE)
    private Long provisionedMemoryBytesLte;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT =
            "provisioned_memory_bytes_not";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT)
    private Long provisionedMemoryBytesNot;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN =
            "provisioned_memory_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN)
    private List<Long> provisionedMemoryBytesNotIn = null;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
    private Integer runningVmNum;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_GT = "running_vm_num_gt";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_GT)
    private Integer runningVmNumGt;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_GTE = "running_vm_num_gte";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_GTE)
    private Integer runningVmNumGte;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_IN = "running_vm_num_in";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_IN)
    private List<Integer> runningVmNumIn = null;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_LT = "running_vm_num_lt";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_LT)
    private Integer runningVmNumLt;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_LTE = "running_vm_num_lte";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_LTE)
    private Integer runningVmNumLte;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_NOT = "running_vm_num_not";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_NOT)
    private Integer runningVmNumNot;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN = "running_vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN)
    private List<Integer> runningVmNumNotIn = null;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
    private Integer stoppedVmNum;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_GT = "stopped_vm_num_gt";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_GT)
    private Integer stoppedVmNumGt;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_GTE = "stopped_vm_num_gte";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_GTE)
    private Integer stoppedVmNumGte;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_IN = "stopped_vm_num_in";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_IN)
    private List<Integer> stoppedVmNumIn = null;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_LT = "stopped_vm_num_lt";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_LT)
    private Integer stoppedVmNumLt;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_LTE = "stopped_vm_num_lte";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_LTE)
    private Integer stoppedVmNumLte;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_NOT = "stopped_vm_num_not";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_NOT)
    private Integer stoppedVmNumNot;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN = "stopped_vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN)
    private List<Integer> stoppedVmNumNotIn = null;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
    private Integer suspendedVmNum;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_GT = "suspended_vm_num_gt";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT)
    private Integer suspendedVmNumGt;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE = "suspended_vm_num_gte";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE)
    private Integer suspendedVmNumGte;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_IN = "suspended_vm_num_in";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN)
    private List<Integer> suspendedVmNumIn = null;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_LT = "suspended_vm_num_lt";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT)
    private Integer suspendedVmNumLt;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE = "suspended_vm_num_lte";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE)
    private Integer suspendedVmNumLte;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT = "suspended_vm_num_not";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT)
    private Integer suspendedVmNumNot;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN = "suspended_vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN)
    private List<Integer> suspendedVmNumNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
    private Long totalCacheCapacity;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT = "total_cache_capacity_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT)
    private Long totalCacheCapacityGt;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE =
            "total_cache_capacity_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE)
    private Long totalCacheCapacityGte;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN = "total_cache_capacity_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN)
    private List<Long> totalCacheCapacityIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT = "total_cache_capacity_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT)
    private Long totalCacheCapacityLt;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE =
            "total_cache_capacity_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE)
    private Long totalCacheCapacityLte;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT =
            "total_cache_capacity_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT)
    private Long totalCacheCapacityNot;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN =
            "total_cache_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN)
    private List<Long> totalCacheCapacityNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
    private Integer totalCpuCores;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_GT = "total_cpu_cores_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_GT)
    private Integer totalCpuCoresGt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_GTE = "total_cpu_cores_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE)
    private Integer totalCpuCoresGte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_IN = "total_cpu_cores_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_IN)
    private List<Integer> totalCpuCoresIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_LT = "total_cpu_cores_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_LT)
    private Integer totalCpuCoresLt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_LTE = "total_cpu_cores_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE)
    private Integer totalCpuCoresLte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_NOT = "total_cpu_cores_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT)
    private Integer totalCpuCoresNot;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN = "total_cpu_cores_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN)
    private List<Integer> totalCpuCoresNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
    private Long totalCpuHz;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_GT = "total_cpu_hz_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_GT)
    private Long totalCpuHzGt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_GTE = "total_cpu_hz_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE)
    private Long totalCpuHzGte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_IN = "total_cpu_hz_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_IN)
    private List<Long> totalCpuHzIn = null;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_LT = "total_cpu_hz_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_LT)
    private Long totalCpuHzLt;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_LTE = "total_cpu_hz_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE)
    private Long totalCpuHzLte;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_NOT = "total_cpu_hz_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT)
    private Long totalCpuHzNot;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN = "total_cpu_hz_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN)
    private List<Long> totalCpuHzNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
    private Long totalDataCapacity;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT = "total_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT)
    private Long totalDataCapacityGt;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE = "total_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE)
    private Long totalDataCapacityGte;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN = "total_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN)
    private List<Long> totalDataCapacityIn = null;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT = "total_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT)
    private Long totalDataCapacityLt;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE = "total_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE)
    private Long totalDataCapacityLte;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT = "total_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT)
    private Long totalDataCapacityNot;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN =
            "total_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN)
    private List<Long> totalDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
    private Long totalMemoryBytes;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT = "total_memory_bytes_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT)
    private Long totalMemoryBytesGt;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE = "total_memory_bytes_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE)
    private Long totalMemoryBytesGte;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN = "total_memory_bytes_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN)
    private List<Long> totalMemoryBytesIn = null;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT = "total_memory_bytes_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT)
    private Long totalMemoryBytesLt;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE = "total_memory_bytes_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE)
    private Long totalMemoryBytesLte;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT = "total_memory_bytes_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT)
    private Long totalMemoryBytesNot;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN =
            "total_memory_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN)
    private List<Long> totalMemoryBytesNotIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_GT = "used_data_space_gt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GT)
    private Long usedDataSpaceGt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_GTE = "used_data_space_gte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GTE)
    private Long usedDataSpaceGte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_IN = "used_data_space_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_IN)
    private List<Long> usedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_LT = "used_data_space_lt";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LT)
    private Long usedDataSpaceLt;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_LTE = "used_data_space_lte";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LTE)
    private Long usedDataSpaceLte;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT = "used_data_space_not";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT)
    private Long usedDataSpaceNot;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN = "used_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN)
    private List<Long> usedDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
    private Long validDataSpace;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GT = "valid_data_space_gt";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GT)
    private Long validDataSpaceGt;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GTE = "valid_data_space_gte";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GTE)
    private Long validDataSpaceGte;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_IN = "valid_data_space_in";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_IN)
    private List<Long> validDataSpaceIn = null;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LT = "valid_data_space_lt";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LT)
    private Long validDataSpaceLt;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LTE = "valid_data_space_lte";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LTE)
    private Long validDataSpaceLte;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT = "valid_data_space_not";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT)
    private Long validDataSpaceNot;

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN = "valid_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN)
    private List<Long> validDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_VM_NUM = "vm_num";

    @SerializedName(SERIALIZED_NAME_VM_NUM)
    private Integer vmNum;

    public static final String SERIALIZED_NAME_VM_NUM_GT = "vm_num_gt";

    @SerializedName(SERIALIZED_NAME_VM_NUM_GT)
    private Integer vmNumGt;

    public static final String SERIALIZED_NAME_VM_NUM_GTE = "vm_num_gte";

    @SerializedName(SERIALIZED_NAME_VM_NUM_GTE)
    private Integer vmNumGte;

    public static final String SERIALIZED_NAME_VM_NUM_IN = "vm_num_in";

    @SerializedName(SERIALIZED_NAME_VM_NUM_IN)
    private List<Integer> vmNumIn = null;

    public static final String SERIALIZED_NAME_VM_NUM_LT = "vm_num_lt";

    @SerializedName(SERIALIZED_NAME_VM_NUM_LT)
    private Integer vmNumLt;

    public static final String SERIALIZED_NAME_VM_NUM_LTE = "vm_num_lte";

    @SerializedName(SERIALIZED_NAME_VM_NUM_LTE)
    private Integer vmNumLte;

    public static final String SERIALIZED_NAME_VM_NUM_NOT = "vm_num_not";

    @SerializedName(SERIALIZED_NAME_VM_NUM_NOT)
    private Integer vmNumNot;

    public static final String SERIALIZED_NAME_VM_NUM_NOT_IN = "vm_num_not_in";

    @SerializedName(SERIALIZED_NAME_VM_NUM_NOT_IN)
    private List<Integer> vmNumNotIn = null;

    public ZoneWhereInput() {}

    public ZoneWhereInput AND(List<ZoneWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ZoneWhereInput addANDItem(ZoneWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ZoneWhereInput>();
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
    public List<ZoneWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ZoneWhereInput> AND) {
        this.AND = AND;
    }

    public ZoneWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ZoneWhereInput AND_ExplictlyNonNull() {
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

    public ZoneWhereInput NOT(List<ZoneWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ZoneWhereInput addNOTItem(ZoneWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ZoneWhereInput>();
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
    public List<ZoneWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ZoneWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ZoneWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ZoneWhereInput NOT_ExplictlyNonNull() {
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

    public ZoneWhereInput OR(List<ZoneWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ZoneWhereInput addORItem(ZoneWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ZoneWhereInput>();
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
    public List<ZoneWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ZoneWhereInput> OR) {
        this.OR = OR;
    }

    public ZoneWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ZoneWhereInput OR_ExplictlyNonNull() {
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

    public ZoneWhereInput cluster(ClusterWhereInput cluster) {

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

    public ZoneWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ZoneWhereInput cluster_ExplictlyNonNull() {
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

    public ZoneWhereInput datacenter(DatacenterWhereInput datacenter) {

        this.datacenter = datacenter;
        return this;
    }

    /**
     * Get datacenter
     *
     * @return datacenter
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(DatacenterWhereInput datacenter) {
        this.datacenter = datacenter;
    }

    public ZoneWhereInput datacenter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER);
        return this;
    }

    public ZoneWhereInput datacenter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER);
        return this;
    }

    public void setDatacenter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER);
        }
    }

    public boolean getDatacenter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER);
    }

    public ZoneWhereInput failureDataSpace(Long failureDataSpace) {

        this.failureDataSpace = failureDataSpace;
        return this;
    }

    /**
     * Get failureDataSpace
     *
     * @return failureDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpace() {
        return failureDataSpace;
    }

    public void setFailureDataSpace(Long failureDataSpace) {
        this.failureDataSpace = failureDataSpace;
    }

    public ZoneWhereInput failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public ZoneWhereInput failureDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public void setFailureDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        }
    }

    public boolean getFailureDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE);
    }

    public ZoneWhereInput failureDataSpaceGt(Long failureDataSpaceGt) {

        this.failureDataSpaceGt = failureDataSpaceGt;
        return this;
    }

    /**
     * Get failureDataSpaceGt
     *
     * @return failureDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceGt() {
        return failureDataSpaceGt;
    }

    public void setFailureDataSpaceGt(Long failureDataSpaceGt) {
        this.failureDataSpaceGt = failureDataSpaceGt;
    }

    public ZoneWhereInput failureDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public ZoneWhereInput failureDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public void setFailureDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        }
    }

    public boolean getFailureDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
    }

    public ZoneWhereInput failureDataSpaceGte(Long failureDataSpaceGte) {

        this.failureDataSpaceGte = failureDataSpaceGte;
        return this;
    }

    /**
     * Get failureDataSpaceGte
     *
     * @return failureDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceGte() {
        return failureDataSpaceGte;
    }

    public void setFailureDataSpaceGte(Long failureDataSpaceGte) {
        this.failureDataSpaceGte = failureDataSpaceGte;
    }

    public ZoneWhereInput failureDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public ZoneWhereInput failureDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public void setFailureDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        }
    }

    public boolean getFailureDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
    }

    public ZoneWhereInput failureDataSpaceIn(List<Long> failureDataSpaceIn) {

        this.failureDataSpaceIn = failureDataSpaceIn;
        return this;
    }

    public ZoneWhereInput addFailureDataSpaceInItem(Long failureDataSpaceInItem) {
        if (this.failureDataSpaceIn == null) {
            this.failureDataSpaceIn = new ArrayList<Long>();
        }
        this.failureDataSpaceIn.add(failureDataSpaceInItem);
        return this;
    }

    /**
     * Get failureDataSpaceIn
     *
     * @return failureDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFailureDataSpaceIn() {
        return failureDataSpaceIn;
    }

    public void setFailureDataSpaceIn(List<Long> failureDataSpaceIn) {
        this.failureDataSpaceIn = failureDataSpaceIn;
    }

    public ZoneWhereInput failureDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public ZoneWhereInput failureDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public void setFailureDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        }
    }

    public boolean getFailureDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
    }

    public ZoneWhereInput failureDataSpaceLt(Long failureDataSpaceLt) {

        this.failureDataSpaceLt = failureDataSpaceLt;
        return this;
    }

    /**
     * Get failureDataSpaceLt
     *
     * @return failureDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceLt() {
        return failureDataSpaceLt;
    }

    public void setFailureDataSpaceLt(Long failureDataSpaceLt) {
        this.failureDataSpaceLt = failureDataSpaceLt;
    }

    public ZoneWhereInput failureDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public ZoneWhereInput failureDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public void setFailureDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        }
    }

    public boolean getFailureDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
    }

    public ZoneWhereInput failureDataSpaceLte(Long failureDataSpaceLte) {

        this.failureDataSpaceLte = failureDataSpaceLte;
        return this;
    }

    /**
     * Get failureDataSpaceLte
     *
     * @return failureDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceLte() {
        return failureDataSpaceLte;
    }

    public void setFailureDataSpaceLte(Long failureDataSpaceLte) {
        this.failureDataSpaceLte = failureDataSpaceLte;
    }

    public ZoneWhereInput failureDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public ZoneWhereInput failureDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public void setFailureDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        }
    }

    public boolean getFailureDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
    }

    public ZoneWhereInput failureDataSpaceNot(Long failureDataSpaceNot) {

        this.failureDataSpaceNot = failureDataSpaceNot;
        return this;
    }

    /**
     * Get failureDataSpaceNot
     *
     * @return failureDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpaceNot() {
        return failureDataSpaceNot;
    }

    public void setFailureDataSpaceNot(Long failureDataSpaceNot) {
        this.failureDataSpaceNot = failureDataSpaceNot;
    }

    public ZoneWhereInput failureDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public ZoneWhereInput failureDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public void setFailureDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        }
    }

    public boolean getFailureDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
    }

    public ZoneWhereInput failureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {

        this.failureDataSpaceNotIn = failureDataSpaceNotIn;
        return this;
    }

    public ZoneWhereInput addFailureDataSpaceNotInItem(Long failureDataSpaceNotInItem) {
        if (this.failureDataSpaceNotIn == null) {
            this.failureDataSpaceNotIn = new ArrayList<Long>();
        }
        this.failureDataSpaceNotIn.add(failureDataSpaceNotInItem);
        return this;
    }

    /**
     * Get failureDataSpaceNotIn
     *
     * @return failureDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFailureDataSpaceNotIn() {
        return failureDataSpaceNotIn;
    }

    public void setFailureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {
        this.failureDataSpaceNotIn = failureDataSpaceNotIn;
    }

    public ZoneWhereInput failureDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public ZoneWhereInput failureDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setFailureDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getFailureDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
    }

    public ZoneWhereInput hostNum(Integer hostNum) {

        this.hostNum = hostNum;
        return this;
    }

    /**
     * Get hostNum
     *
     * @return hostNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ZoneWhereInput hostNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public ZoneWhereInput hostNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public void setHostNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        }
    }

    public boolean getHostNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM);
    }

    public ZoneWhereInput hostNumGt(Integer hostNumGt) {

        this.hostNumGt = hostNumGt;
        return this;
    }

    /**
     * Get hostNumGt
     *
     * @return hostNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumGt() {
        return hostNumGt;
    }

    public void setHostNumGt(Integer hostNumGt) {
        this.hostNumGt = hostNumGt;
    }

    public ZoneWhereInput hostNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GT);
        return this;
    }

    public ZoneWhereInput hostNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GT);
        return this;
    }

    public void setHostNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GT);
        }
    }

    public boolean getHostNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_GT);
    }

    public ZoneWhereInput hostNumGte(Integer hostNumGte) {

        this.hostNumGte = hostNumGte;
        return this;
    }

    /**
     * Get hostNumGte
     *
     * @return hostNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumGte() {
        return hostNumGte;
    }

    public void setHostNumGte(Integer hostNumGte) {
        this.hostNumGte = hostNumGte;
    }

    public ZoneWhereInput hostNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GTE);
        return this;
    }

    public ZoneWhereInput hostNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GTE);
        return this;
    }

    public void setHostNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_GTE);
        }
    }

    public boolean getHostNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_GTE);
    }

    public ZoneWhereInput hostNumIn(List<Integer> hostNumIn) {

        this.hostNumIn = hostNumIn;
        return this;
    }

    public ZoneWhereInput addHostNumInItem(Integer hostNumInItem) {
        if (this.hostNumIn == null) {
            this.hostNumIn = new ArrayList<Integer>();
        }
        this.hostNumIn.add(hostNumInItem);
        return this;
    }

    /**
     * Get hostNumIn
     *
     * @return hostNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHostNumIn() {
        return hostNumIn;
    }

    public void setHostNumIn(List<Integer> hostNumIn) {
        this.hostNumIn = hostNumIn;
    }

    public ZoneWhereInput hostNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_IN);
        return this;
    }

    public ZoneWhereInput hostNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_IN);
        return this;
    }

    public void setHostNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_IN);
        }
    }

    public boolean getHostNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_IN);
    }

    public ZoneWhereInput hostNumLt(Integer hostNumLt) {

        this.hostNumLt = hostNumLt;
        return this;
    }

    /**
     * Get hostNumLt
     *
     * @return hostNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumLt() {
        return hostNumLt;
    }

    public void setHostNumLt(Integer hostNumLt) {
        this.hostNumLt = hostNumLt;
    }

    public ZoneWhereInput hostNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LT);
        return this;
    }

    public ZoneWhereInput hostNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LT);
        return this;
    }

    public void setHostNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LT);
        }
    }

    public boolean getHostNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_LT);
    }

    public ZoneWhereInput hostNumLte(Integer hostNumLte) {

        this.hostNumLte = hostNumLte;
        return this;
    }

    /**
     * Get hostNumLte
     *
     * @return hostNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumLte() {
        return hostNumLte;
    }

    public void setHostNumLte(Integer hostNumLte) {
        this.hostNumLte = hostNumLte;
    }

    public ZoneWhereInput hostNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LTE);
        return this;
    }

    public ZoneWhereInput hostNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LTE);
        return this;
    }

    public void setHostNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_LTE);
        }
    }

    public boolean getHostNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_LTE);
    }

    public ZoneWhereInput hostNumNot(Integer hostNumNot) {

        this.hostNumNot = hostNumNot;
        return this;
    }

    /**
     * Get hostNumNot
     *
     * @return hostNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNumNot() {
        return hostNumNot;
    }

    public void setHostNumNot(Integer hostNumNot) {
        this.hostNumNot = hostNumNot;
    }

    public ZoneWhereInput hostNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT);
        return this;
    }

    public ZoneWhereInput hostNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT);
        return this;
    }

    public void setHostNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT);
        }
    }

    public boolean getHostNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_NOT);
    }

    public ZoneWhereInput hostNumNotIn(List<Integer> hostNumNotIn) {

        this.hostNumNotIn = hostNumNotIn;
        return this;
    }

    public ZoneWhereInput addHostNumNotInItem(Integer hostNumNotInItem) {
        if (this.hostNumNotIn == null) {
            this.hostNumNotIn = new ArrayList<Integer>();
        }
        this.hostNumNotIn.add(hostNumNotInItem);
        return this;
    }

    /**
     * Get hostNumNotIn
     *
     * @return hostNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHostNumNotIn() {
        return hostNumNotIn;
    }

    public void setHostNumNotIn(List<Integer> hostNumNotIn) {
        this.hostNumNotIn = hostNumNotIn;
    }

    public ZoneWhereInput hostNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        return this;
    }

    public ZoneWhereInput hostNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        return this;
    }

    public void setHostNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM_NOT_IN);
        }
    }

    public boolean getHostNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM_NOT_IN);
    }

    public ZoneWhereInput hostsEvery(HostWhereInput hostsEvery) {

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

    public ZoneWhereInput hostsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_EVERY);
        return this;
    }

    public ZoneWhereInput hostsEvery_ExplictlyNonNull() {
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

    public ZoneWhereInput hostsNone(HostWhereInput hostsNone) {

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

    public ZoneWhereInput hostsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_NONE);
        return this;
    }

    public ZoneWhereInput hostsNone_ExplictlyNonNull() {
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

    public ZoneWhereInput hostsSome(HostWhereInput hostsSome) {

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

    public ZoneWhereInput hostsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS_SOME);
        return this;
    }

    public ZoneWhereInput hostsSome_ExplictlyNonNull() {
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

    public ZoneWhereInput id(String id) {

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

    public ZoneWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ZoneWhereInput id_ExplictlyNonNull() {
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

    public ZoneWhereInput idContains(String idContains) {

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

    public ZoneWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ZoneWhereInput idContains_ExplictlyNonNull() {
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

    public ZoneWhereInput idEndsWith(String idEndsWith) {

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

    public ZoneWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ZoneWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput idGt(String idGt) {

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

    public ZoneWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ZoneWhereInput idGt_ExplictlyNonNull() {
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

    public ZoneWhereInput idGte(String idGte) {

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

    public ZoneWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ZoneWhereInput idGte_ExplictlyNonNull() {
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

    public ZoneWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ZoneWhereInput addIdInItem(String idInItem) {
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

    public ZoneWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ZoneWhereInput idIn_ExplictlyNonNull() {
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

    public ZoneWhereInput idLt(String idLt) {

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

    public ZoneWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ZoneWhereInput idLt_ExplictlyNonNull() {
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

    public ZoneWhereInput idLte(String idLte) {

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

    public ZoneWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ZoneWhereInput idLte_ExplictlyNonNull() {
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

    public ZoneWhereInput idNot(String idNot) {

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

    public ZoneWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ZoneWhereInput idNot_ExplictlyNonNull() {
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

    public ZoneWhereInput idNotContains(String idNotContains) {

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

    public ZoneWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ZoneWhereInput idNotContains_ExplictlyNonNull() {
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

    public ZoneWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ZoneWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ZoneWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ZoneWhereInput addIdNotInItem(String idNotInItem) {
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

    public ZoneWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ZoneWhereInput idNotIn_ExplictlyNonNull() {
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

    public ZoneWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ZoneWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ZoneWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput idStartsWith(String idStartsWith) {

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

    public ZoneWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ZoneWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput isPreferred(Boolean isPreferred) {

        this.isPreferred = isPreferred;
        return this;
    }

    /**
     * Get isPreferred
     *
     * @return isPreferred
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    public ZoneWhereInput isPreferred_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_PREFERRED);
        return this;
    }

    public ZoneWhereInput isPreferred_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_PREFERRED);
        return this;
    }

    public void setIsPreferred_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_PREFERRED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_PREFERRED);
        }
    }

    public boolean getIsPreferred_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_PREFERRED);
    }

    public ZoneWhereInput isPreferredNot(Boolean isPreferredNot) {

        this.isPreferredNot = isPreferredNot;
        return this;
    }

    /**
     * Get isPreferredNot
     *
     * @return isPreferredNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsPreferredNot() {
        return isPreferredNot;
    }

    public void setIsPreferredNot(Boolean isPreferredNot) {
        this.isPreferredNot = isPreferredNot;
    }

    public ZoneWhereInput isPreferredNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_PREFERRED_NOT);
        return this;
    }

    public ZoneWhereInput isPreferredNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_PREFERRED_NOT);
        return this;
    }

    public void setIsPreferredNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_PREFERRED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_PREFERRED_NOT);
        }
    }

    public boolean getIsPreferredNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_PREFERRED_NOT);
    }

    public ZoneWhereInput localId(String localId) {

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

    public ZoneWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ZoneWhereInput localId_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdContains(String localIdContains) {

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

    public ZoneWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ZoneWhereInput localIdContains_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ZoneWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ZoneWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdGt(String localIdGt) {

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

    public ZoneWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ZoneWhereInput localIdGt_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdGte(String localIdGte) {

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

    public ZoneWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ZoneWhereInput localIdGte_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ZoneWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ZoneWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ZoneWhereInput localIdIn_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdLt(String localIdLt) {

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

    public ZoneWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ZoneWhereInput localIdLt_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdLte(String localIdLte) {

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

    public ZoneWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ZoneWhereInput localIdLte_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdNot(String localIdNot) {

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

    public ZoneWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ZoneWhereInput localIdNot_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdNotContains(String localIdNotContains) {

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

    public ZoneWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ZoneWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public ZoneWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ZoneWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ZoneWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public ZoneWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ZoneWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public ZoneWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ZoneWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public ZoneWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ZoneWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ZoneWhereInput provisionedCpuCores(Integer provisionedCpuCores) {

        this.provisionedCpuCores = provisionedCpuCores;
        return this;
    }

    /**
     * Get provisionedCpuCores
     *
     * @return provisionedCpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCores() {
        return provisionedCpuCores;
    }

    public void setProvisionedCpuCores(Integer provisionedCpuCores) {
        this.provisionedCpuCores = provisionedCpuCores;
    }

    public ZoneWhereInput provisionedCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public ZoneWhereInput provisionedCpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public void setProvisionedCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        }
    }

    public boolean getProvisionedCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {

        this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVm
     *
     * @return provisionedCpuCoresForActiveVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVm() {
        return provisionedCpuCoresForActiveVm;
    }

    public void setProvisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
        this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmGt(
            Integer provisionedCpuCoresForActiveVmGt) {

        this.provisionedCpuCoresForActiveVmGt = provisionedCpuCoresForActiveVmGt;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmGt
     *
     * @return provisionedCpuCoresForActiveVmGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmGt() {
        return provisionedCpuCoresForActiveVmGt;
    }

    public void setProvisionedCpuCoresForActiveVmGt(Integer provisionedCpuCoresForActiveVmGt) {
        this.provisionedCpuCoresForActiveVmGt = provisionedCpuCoresForActiveVmGt;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GT);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmGte(
            Integer provisionedCpuCoresForActiveVmGte) {

        this.provisionedCpuCoresForActiveVmGte = provisionedCpuCoresForActiveVmGte;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmGte
     *
     * @return provisionedCpuCoresForActiveVmGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmGte() {
        return provisionedCpuCoresForActiveVmGte;
    }

    public void setProvisionedCpuCoresForActiveVmGte(Integer provisionedCpuCoresForActiveVmGte) {
        this.provisionedCpuCoresForActiveVmGte = provisionedCpuCoresForActiveVmGte;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_GTE);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmIn(
            List<Integer> provisionedCpuCoresForActiveVmIn) {

        this.provisionedCpuCoresForActiveVmIn = provisionedCpuCoresForActiveVmIn;
        return this;
    }

    public ZoneWhereInput addProvisionedCpuCoresForActiveVmInItem(
            Integer provisionedCpuCoresForActiveVmInItem) {
        if (this.provisionedCpuCoresForActiveVmIn == null) {
            this.provisionedCpuCoresForActiveVmIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresForActiveVmIn.add(provisionedCpuCoresForActiveVmInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmIn
     *
     * @return provisionedCpuCoresForActiveVmIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresForActiveVmIn() {
        return provisionedCpuCoresForActiveVmIn;
    }

    public void setProvisionedCpuCoresForActiveVmIn(
            List<Integer> provisionedCpuCoresForActiveVmIn) {
        this.provisionedCpuCoresForActiveVmIn = provisionedCpuCoresForActiveVmIn;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_IN);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmLt(
            Integer provisionedCpuCoresForActiveVmLt) {

        this.provisionedCpuCoresForActiveVmLt = provisionedCpuCoresForActiveVmLt;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmLt
     *
     * @return provisionedCpuCoresForActiveVmLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmLt() {
        return provisionedCpuCoresForActiveVmLt;
    }

    public void setProvisionedCpuCoresForActiveVmLt(Integer provisionedCpuCoresForActiveVmLt) {
        this.provisionedCpuCoresForActiveVmLt = provisionedCpuCoresForActiveVmLt;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LT);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmLte(
            Integer provisionedCpuCoresForActiveVmLte) {

        this.provisionedCpuCoresForActiveVmLte = provisionedCpuCoresForActiveVmLte;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmLte
     *
     * @return provisionedCpuCoresForActiveVmLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmLte() {
        return provisionedCpuCoresForActiveVmLte;
    }

    public void setProvisionedCpuCoresForActiveVmLte(Integer provisionedCpuCoresForActiveVmLte) {
        this.provisionedCpuCoresForActiveVmLte = provisionedCpuCoresForActiveVmLte;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_LTE);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmNot(
            Integer provisionedCpuCoresForActiveVmNot) {

        this.provisionedCpuCoresForActiveVmNot = provisionedCpuCoresForActiveVmNot;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmNot
     *
     * @return provisionedCpuCoresForActiveVmNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVmNot() {
        return provisionedCpuCoresForActiveVmNot;
    }

    public void setProvisionedCpuCoresForActiveVmNot(Integer provisionedCpuCoresForActiveVmNot) {
        this.provisionedCpuCoresForActiveVmNot = provisionedCpuCoresForActiveVmNot;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT);
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmNotIn(
            List<Integer> provisionedCpuCoresForActiveVmNotIn) {

        this.provisionedCpuCoresForActiveVmNotIn = provisionedCpuCoresForActiveVmNotIn;
        return this;
    }

    public ZoneWhereInput addProvisionedCpuCoresForActiveVmNotInItem(
            Integer provisionedCpuCoresForActiveVmNotInItem) {
        if (this.provisionedCpuCoresForActiveVmNotIn == null) {
            this.provisionedCpuCoresForActiveVmNotIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresForActiveVmNotIn.add(provisionedCpuCoresForActiveVmNotInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVmNotIn
     *
     * @return provisionedCpuCoresForActiveVmNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresForActiveVmNotIn() {
        return provisionedCpuCoresForActiveVmNotIn;
    }

    public void setProvisionedCpuCoresForActiveVmNotIn(
            List<Integer> provisionedCpuCoresForActiveVmNotIn) {
        this.provisionedCpuCoresForActiveVmNotIn = provisionedCpuCoresForActiveVmNotIn;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresForActiveVmNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVmNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVmNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_NOT_IN);
    }

    public ZoneWhereInput provisionedCpuCoresGt(Integer provisionedCpuCoresGt) {

        this.provisionedCpuCoresGt = provisionedCpuCoresGt;
        return this;
    }

    /**
     * Get provisionedCpuCoresGt
     *
     * @return provisionedCpuCoresGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresGt() {
        return provisionedCpuCoresGt;
    }

    public void setProvisionedCpuCoresGt(Integer provisionedCpuCoresGt) {
        this.provisionedCpuCoresGt = provisionedCpuCoresGt;
    }

    public ZoneWhereInput provisionedCpuCoresGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        return this;
    }

    public void setProvisionedCpuCoresGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
        }
    }

    public boolean getProvisionedCpuCoresGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT);
    }

    public ZoneWhereInput provisionedCpuCoresGte(Integer provisionedCpuCoresGte) {

        this.provisionedCpuCoresGte = provisionedCpuCoresGte;
        return this;
    }

    /**
     * Get provisionedCpuCoresGte
     *
     * @return provisionedCpuCoresGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresGte() {
        return provisionedCpuCoresGte;
    }

    public void setProvisionedCpuCoresGte(Integer provisionedCpuCoresGte) {
        this.provisionedCpuCoresGte = provisionedCpuCoresGte;
    }

    public ZoneWhereInput provisionedCpuCoresGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        return this;
    }

    public void setProvisionedCpuCoresGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
        }
    }

    public boolean getProvisionedCpuCoresGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE);
    }

    public ZoneWhereInput provisionedCpuCoresIn(List<Integer> provisionedCpuCoresIn) {

        this.provisionedCpuCoresIn = provisionedCpuCoresIn;
        return this;
    }

    public ZoneWhereInput addProvisionedCpuCoresInItem(Integer provisionedCpuCoresInItem) {
        if (this.provisionedCpuCoresIn == null) {
            this.provisionedCpuCoresIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresIn.add(provisionedCpuCoresInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresIn
     *
     * @return provisionedCpuCoresIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresIn() {
        return provisionedCpuCoresIn;
    }

    public void setProvisionedCpuCoresIn(List<Integer> provisionedCpuCoresIn) {
        this.provisionedCpuCoresIn = provisionedCpuCoresIn;
    }

    public ZoneWhereInput provisionedCpuCoresIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        return this;
    }

    public void setProvisionedCpuCoresIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
        }
    }

    public boolean getProvisionedCpuCoresIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN);
    }

    public ZoneWhereInput provisionedCpuCoresLt(Integer provisionedCpuCoresLt) {

        this.provisionedCpuCoresLt = provisionedCpuCoresLt;
        return this;
    }

    /**
     * Get provisionedCpuCoresLt
     *
     * @return provisionedCpuCoresLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresLt() {
        return provisionedCpuCoresLt;
    }

    public void setProvisionedCpuCoresLt(Integer provisionedCpuCoresLt) {
        this.provisionedCpuCoresLt = provisionedCpuCoresLt;
    }

    public ZoneWhereInput provisionedCpuCoresLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        return this;
    }

    public void setProvisionedCpuCoresLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
        }
    }

    public boolean getProvisionedCpuCoresLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT);
    }

    public ZoneWhereInput provisionedCpuCoresLte(Integer provisionedCpuCoresLte) {

        this.provisionedCpuCoresLte = provisionedCpuCoresLte;
        return this;
    }

    /**
     * Get provisionedCpuCoresLte
     *
     * @return provisionedCpuCoresLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresLte() {
        return provisionedCpuCoresLte;
    }

    public void setProvisionedCpuCoresLte(Integer provisionedCpuCoresLte) {
        this.provisionedCpuCoresLte = provisionedCpuCoresLte;
    }

    public ZoneWhereInput provisionedCpuCoresLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        return this;
    }

    public void setProvisionedCpuCoresLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
        }
    }

    public boolean getProvisionedCpuCoresLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE);
    }

    public ZoneWhereInput provisionedCpuCoresNot(Integer provisionedCpuCoresNot) {

        this.provisionedCpuCoresNot = provisionedCpuCoresNot;
        return this;
    }

    /**
     * Get provisionedCpuCoresNot
     *
     * @return provisionedCpuCoresNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresNot() {
        return provisionedCpuCoresNot;
    }

    public void setProvisionedCpuCoresNot(Integer provisionedCpuCoresNot) {
        this.provisionedCpuCoresNot = provisionedCpuCoresNot;
    }

    public ZoneWhereInput provisionedCpuCoresNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        return this;
    }

    public void setProvisionedCpuCoresNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
        }
    }

    public boolean getProvisionedCpuCoresNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT);
    }

    public ZoneWhereInput provisionedCpuCoresNotIn(List<Integer> provisionedCpuCoresNotIn) {

        this.provisionedCpuCoresNotIn = provisionedCpuCoresNotIn;
        return this;
    }

    public ZoneWhereInput addProvisionedCpuCoresNotInItem(Integer provisionedCpuCoresNotInItem) {
        if (this.provisionedCpuCoresNotIn == null) {
            this.provisionedCpuCoresNotIn = new ArrayList<Integer>();
        }
        this.provisionedCpuCoresNotIn.add(provisionedCpuCoresNotInItem);
        return this;
    }

    /**
     * Get provisionedCpuCoresNotIn
     *
     * @return provisionedCpuCoresNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getProvisionedCpuCoresNotIn() {
        return provisionedCpuCoresNotIn;
    }

    public void setProvisionedCpuCoresNotIn(List<Integer> provisionedCpuCoresNotIn) {
        this.provisionedCpuCoresNotIn = provisionedCpuCoresNotIn;
    }

    public ZoneWhereInput provisionedCpuCoresNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        return this;
    }

    public ZoneWhereInput provisionedCpuCoresNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        return this;
    }

    public void setProvisionedCpuCoresNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
        }
    }

    public boolean getProvisionedCpuCoresNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN);
    }

    public ZoneWhereInput provisionedDataSpace(Long provisionedDataSpace) {

        this.provisionedDataSpace = provisionedDataSpace;
        return this;
    }

    /**
     * Get provisionedDataSpace
     *
     * @return provisionedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedDataSpace() {
        return provisionedDataSpace;
    }

    public void setProvisionedDataSpace(Long provisionedDataSpace) {
        this.provisionedDataSpace = provisionedDataSpace;
    }

    public ZoneWhereInput provisionedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE);
        return this;
    }

    public ZoneWhereInput provisionedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE);
        return this;
    }

    public void setProvisionedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE);
        }
    }

    public boolean getProvisionedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE);
    }

    public ZoneWhereInput provisionedDataSpaceGt(Long provisionedDataSpaceGt) {

        this.provisionedDataSpaceGt = provisionedDataSpaceGt;
        return this;
    }

    /**
     * Get provisionedDataSpaceGt
     *
     * @return provisionedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedDataSpaceGt() {
        return provisionedDataSpaceGt;
    }

    public void setProvisionedDataSpaceGt(Long provisionedDataSpaceGt) {
        this.provisionedDataSpaceGt = provisionedDataSpaceGt;
    }

    public ZoneWhereInput provisionedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT);
        return this;
    }

    public void setProvisionedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT);
        }
    }

    public boolean getProvisionedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GT);
    }

    public ZoneWhereInput provisionedDataSpaceGte(Long provisionedDataSpaceGte) {

        this.provisionedDataSpaceGte = provisionedDataSpaceGte;
        return this;
    }

    /**
     * Get provisionedDataSpaceGte
     *
     * @return provisionedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedDataSpaceGte() {
        return provisionedDataSpaceGte;
    }

    public void setProvisionedDataSpaceGte(Long provisionedDataSpaceGte) {
        this.provisionedDataSpaceGte = provisionedDataSpaceGte;
    }

    public ZoneWhereInput provisionedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE);
        return this;
    }

    public void setProvisionedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE);
        }
    }

    public boolean getProvisionedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_GTE);
    }

    public ZoneWhereInput provisionedDataSpaceIn(List<Long> provisionedDataSpaceIn) {

        this.provisionedDataSpaceIn = provisionedDataSpaceIn;
        return this;
    }

    public ZoneWhereInput addProvisionedDataSpaceInItem(Long provisionedDataSpaceInItem) {
        if (this.provisionedDataSpaceIn == null) {
            this.provisionedDataSpaceIn = new ArrayList<Long>();
        }
        this.provisionedDataSpaceIn.add(provisionedDataSpaceInItem);
        return this;
    }

    /**
     * Get provisionedDataSpaceIn
     *
     * @return provisionedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getProvisionedDataSpaceIn() {
        return provisionedDataSpaceIn;
    }

    public void setProvisionedDataSpaceIn(List<Long> provisionedDataSpaceIn) {
        this.provisionedDataSpaceIn = provisionedDataSpaceIn;
    }

    public ZoneWhereInput provisionedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN);
        return this;
    }

    public void setProvisionedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN);
        }
    }

    public boolean getProvisionedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_IN);
    }

    public ZoneWhereInput provisionedDataSpaceLt(Long provisionedDataSpaceLt) {

        this.provisionedDataSpaceLt = provisionedDataSpaceLt;
        return this;
    }

    /**
     * Get provisionedDataSpaceLt
     *
     * @return provisionedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedDataSpaceLt() {
        return provisionedDataSpaceLt;
    }

    public void setProvisionedDataSpaceLt(Long provisionedDataSpaceLt) {
        this.provisionedDataSpaceLt = provisionedDataSpaceLt;
    }

    public ZoneWhereInput provisionedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT);
        return this;
    }

    public void setProvisionedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT);
        }
    }

    public boolean getProvisionedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LT);
    }

    public ZoneWhereInput provisionedDataSpaceLte(Long provisionedDataSpaceLte) {

        this.provisionedDataSpaceLte = provisionedDataSpaceLte;
        return this;
    }

    /**
     * Get provisionedDataSpaceLte
     *
     * @return provisionedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedDataSpaceLte() {
        return provisionedDataSpaceLte;
    }

    public void setProvisionedDataSpaceLte(Long provisionedDataSpaceLte) {
        this.provisionedDataSpaceLte = provisionedDataSpaceLte;
    }

    public ZoneWhereInput provisionedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE);
        return this;
    }

    public void setProvisionedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE);
        }
    }

    public boolean getProvisionedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_LTE);
    }

    public ZoneWhereInput provisionedDataSpaceNot(Long provisionedDataSpaceNot) {

        this.provisionedDataSpaceNot = provisionedDataSpaceNot;
        return this;
    }

    /**
     * Get provisionedDataSpaceNot
     *
     * @return provisionedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedDataSpaceNot() {
        return provisionedDataSpaceNot;
    }

    public void setProvisionedDataSpaceNot(Long provisionedDataSpaceNot) {
        this.provisionedDataSpaceNot = provisionedDataSpaceNot;
    }

    public ZoneWhereInput provisionedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT);
        return this;
    }

    public void setProvisionedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT);
        }
    }

    public boolean getProvisionedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT);
    }

    public ZoneWhereInput provisionedDataSpaceNotIn(List<Long> provisionedDataSpaceNotIn) {

        this.provisionedDataSpaceNotIn = provisionedDataSpaceNotIn;
        return this;
    }

    public ZoneWhereInput addProvisionedDataSpaceNotInItem(Long provisionedDataSpaceNotInItem) {
        if (this.provisionedDataSpaceNotIn == null) {
            this.provisionedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.provisionedDataSpaceNotIn.add(provisionedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get provisionedDataSpaceNotIn
     *
     * @return provisionedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getProvisionedDataSpaceNotIn() {
        return provisionedDataSpaceNotIn;
    }

    public void setProvisionedDataSpaceNotIn(List<Long> provisionedDataSpaceNotIn) {
        this.provisionedDataSpaceNotIn = provisionedDataSpaceNotIn;
    }

    public ZoneWhereInput provisionedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN);
        return this;
    }

    public ZoneWhereInput provisionedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setProvisionedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getProvisionedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_DATA_SPACE_NOT_IN);
    }

    public ZoneWhereInput provisionedMemoryBytes(Long provisionedMemoryBytes) {

        this.provisionedMemoryBytes = provisionedMemoryBytes;
        return this;
    }

    /**
     * Get provisionedMemoryBytes
     *
     * @return provisionedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytes() {
        return provisionedMemoryBytes;
    }

    public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
        this.provisionedMemoryBytes = provisionedMemoryBytes;
    }

    public ZoneWhereInput provisionedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public void setProvisionedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        }
    }

    public boolean getProvisionedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
    }

    public ZoneWhereInput provisionedMemoryBytesGt(Long provisionedMemoryBytesGt) {

        this.provisionedMemoryBytesGt = provisionedMemoryBytesGt;
        return this;
    }

    /**
     * Get provisionedMemoryBytesGt
     *
     * @return provisionedMemoryBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesGt() {
        return provisionedMemoryBytesGt;
    }

    public void setProvisionedMemoryBytesGt(Long provisionedMemoryBytesGt) {
        this.provisionedMemoryBytesGt = provisionedMemoryBytesGt;
    }

    public ZoneWhereInput provisionedMemoryBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        return this;
    }

    public void setProvisionedMemoryBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
        }
    }

    public boolean getProvisionedMemoryBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT);
    }

    public ZoneWhereInput provisionedMemoryBytesGte(Long provisionedMemoryBytesGte) {

        this.provisionedMemoryBytesGte = provisionedMemoryBytesGte;
        return this;
    }

    /**
     * Get provisionedMemoryBytesGte
     *
     * @return provisionedMemoryBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesGte() {
        return provisionedMemoryBytesGte;
    }

    public void setProvisionedMemoryBytesGte(Long provisionedMemoryBytesGte) {
        this.provisionedMemoryBytesGte = provisionedMemoryBytesGte;
    }

    public ZoneWhereInput provisionedMemoryBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        return this;
    }

    public void setProvisionedMemoryBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
        }
    }

    public boolean getProvisionedMemoryBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE);
    }

    public ZoneWhereInput provisionedMemoryBytesIn(List<Long> provisionedMemoryBytesIn) {

        this.provisionedMemoryBytesIn = provisionedMemoryBytesIn;
        return this;
    }

    public ZoneWhereInput addProvisionedMemoryBytesInItem(Long provisionedMemoryBytesInItem) {
        if (this.provisionedMemoryBytesIn == null) {
            this.provisionedMemoryBytesIn = new ArrayList<Long>();
        }
        this.provisionedMemoryBytesIn.add(provisionedMemoryBytesInItem);
        return this;
    }

    /**
     * Get provisionedMemoryBytesIn
     *
     * @return provisionedMemoryBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getProvisionedMemoryBytesIn() {
        return provisionedMemoryBytesIn;
    }

    public void setProvisionedMemoryBytesIn(List<Long> provisionedMemoryBytesIn) {
        this.provisionedMemoryBytesIn = provisionedMemoryBytesIn;
    }

    public ZoneWhereInput provisionedMemoryBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        return this;
    }

    public void setProvisionedMemoryBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
        }
    }

    public boolean getProvisionedMemoryBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN);
    }

    public ZoneWhereInput provisionedMemoryBytesLt(Long provisionedMemoryBytesLt) {

        this.provisionedMemoryBytesLt = provisionedMemoryBytesLt;
        return this;
    }

    /**
     * Get provisionedMemoryBytesLt
     *
     * @return provisionedMemoryBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesLt() {
        return provisionedMemoryBytesLt;
    }

    public void setProvisionedMemoryBytesLt(Long provisionedMemoryBytesLt) {
        this.provisionedMemoryBytesLt = provisionedMemoryBytesLt;
    }

    public ZoneWhereInput provisionedMemoryBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        return this;
    }

    public void setProvisionedMemoryBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
        }
    }

    public boolean getProvisionedMemoryBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT);
    }

    public ZoneWhereInput provisionedMemoryBytesLte(Long provisionedMemoryBytesLte) {

        this.provisionedMemoryBytesLte = provisionedMemoryBytesLte;
        return this;
    }

    /**
     * Get provisionedMemoryBytesLte
     *
     * @return provisionedMemoryBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesLte() {
        return provisionedMemoryBytesLte;
    }

    public void setProvisionedMemoryBytesLte(Long provisionedMemoryBytesLte) {
        this.provisionedMemoryBytesLte = provisionedMemoryBytesLte;
    }

    public ZoneWhereInput provisionedMemoryBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        return this;
    }

    public void setProvisionedMemoryBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
        }
    }

    public boolean getProvisionedMemoryBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE);
    }

    public ZoneWhereInput provisionedMemoryBytesNot(Long provisionedMemoryBytesNot) {

        this.provisionedMemoryBytesNot = provisionedMemoryBytesNot;
        return this;
    }

    /**
     * Get provisionedMemoryBytesNot
     *
     * @return provisionedMemoryBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytesNot() {
        return provisionedMemoryBytesNot;
    }

    public void setProvisionedMemoryBytesNot(Long provisionedMemoryBytesNot) {
        this.provisionedMemoryBytesNot = provisionedMemoryBytesNot;
    }

    public ZoneWhereInput provisionedMemoryBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        return this;
    }

    public void setProvisionedMemoryBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
        }
    }

    public boolean getProvisionedMemoryBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT);
    }

    public ZoneWhereInput provisionedMemoryBytesNotIn(List<Long> provisionedMemoryBytesNotIn) {

        this.provisionedMemoryBytesNotIn = provisionedMemoryBytesNotIn;
        return this;
    }

    public ZoneWhereInput addProvisionedMemoryBytesNotInItem(Long provisionedMemoryBytesNotInItem) {
        if (this.provisionedMemoryBytesNotIn == null) {
            this.provisionedMemoryBytesNotIn = new ArrayList<Long>();
        }
        this.provisionedMemoryBytesNotIn.add(provisionedMemoryBytesNotInItem);
        return this;
    }

    /**
     * Get provisionedMemoryBytesNotIn
     *
     * @return provisionedMemoryBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getProvisionedMemoryBytesNotIn() {
        return provisionedMemoryBytesNotIn;
    }

    public void setProvisionedMemoryBytesNotIn(List<Long> provisionedMemoryBytesNotIn) {
        this.provisionedMemoryBytesNotIn = provisionedMemoryBytesNotIn;
    }

    public ZoneWhereInput provisionedMemoryBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public ZoneWhereInput provisionedMemoryBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public void setProvisionedMemoryBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
        }
    }

    public boolean getProvisionedMemoryBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN);
    }

    public ZoneWhereInput runningVmNum(Integer runningVmNum) {

        this.runningVmNum = runningVmNum;
        return this;
    }

    /**
     * Get runningVmNum
     *
     * @return runningVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNum() {
        return runningVmNum;
    }

    public void setRunningVmNum(Integer runningVmNum) {
        this.runningVmNum = runningVmNum;
    }

    public ZoneWhereInput runningVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public ZoneWhereInput runningVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public void setRunningVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM);
        }
    }

    public boolean getRunningVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM);
    }

    public ZoneWhereInput runningVmNumGt(Integer runningVmNumGt) {

        this.runningVmNumGt = runningVmNumGt;
        return this;
    }

    /**
     * Get runningVmNumGt
     *
     * @return runningVmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumGt() {
        return runningVmNumGt;
    }

    public void setRunningVmNumGt(Integer runningVmNumGt) {
        this.runningVmNumGt = runningVmNumGt;
    }

    public ZoneWhereInput runningVmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        return this;
    }

    public ZoneWhereInput runningVmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        return this;
    }

    public void setRunningVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
        }
    }

    public boolean getRunningVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_GT);
    }

    public ZoneWhereInput runningVmNumGte(Integer runningVmNumGte) {

        this.runningVmNumGte = runningVmNumGte;
        return this;
    }

    /**
     * Get runningVmNumGte
     *
     * @return runningVmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumGte() {
        return runningVmNumGte;
    }

    public void setRunningVmNumGte(Integer runningVmNumGte) {
        this.runningVmNumGte = runningVmNumGte;
    }

    public ZoneWhereInput runningVmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        return this;
    }

    public ZoneWhereInput runningVmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        return this;
    }

    public void setRunningVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
        }
    }

    public boolean getRunningVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_GTE);
    }

    public ZoneWhereInput runningVmNumIn(List<Integer> runningVmNumIn) {

        this.runningVmNumIn = runningVmNumIn;
        return this;
    }

    public ZoneWhereInput addRunningVmNumInItem(Integer runningVmNumInItem) {
        if (this.runningVmNumIn == null) {
            this.runningVmNumIn = new ArrayList<Integer>();
        }
        this.runningVmNumIn.add(runningVmNumInItem);
        return this;
    }

    /**
     * Get runningVmNumIn
     *
     * @return runningVmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRunningVmNumIn() {
        return runningVmNumIn;
    }

    public void setRunningVmNumIn(List<Integer> runningVmNumIn) {
        this.runningVmNumIn = runningVmNumIn;
    }

    public ZoneWhereInput runningVmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        return this;
    }

    public ZoneWhereInput runningVmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        return this;
    }

    public void setRunningVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
        }
    }

    public boolean getRunningVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_IN);
    }

    public ZoneWhereInput runningVmNumLt(Integer runningVmNumLt) {

        this.runningVmNumLt = runningVmNumLt;
        return this;
    }

    /**
     * Get runningVmNumLt
     *
     * @return runningVmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumLt() {
        return runningVmNumLt;
    }

    public void setRunningVmNumLt(Integer runningVmNumLt) {
        this.runningVmNumLt = runningVmNumLt;
    }

    public ZoneWhereInput runningVmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        return this;
    }

    public ZoneWhereInput runningVmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        return this;
    }

    public void setRunningVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
        }
    }

    public boolean getRunningVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_LT);
    }

    public ZoneWhereInput runningVmNumLte(Integer runningVmNumLte) {

        this.runningVmNumLte = runningVmNumLte;
        return this;
    }

    /**
     * Get runningVmNumLte
     *
     * @return runningVmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumLte() {
        return runningVmNumLte;
    }

    public void setRunningVmNumLte(Integer runningVmNumLte) {
        this.runningVmNumLte = runningVmNumLte;
    }

    public ZoneWhereInput runningVmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        return this;
    }

    public ZoneWhereInput runningVmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        return this;
    }

    public void setRunningVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
        }
    }

    public boolean getRunningVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_LTE);
    }

    public ZoneWhereInput runningVmNumNot(Integer runningVmNumNot) {

        this.runningVmNumNot = runningVmNumNot;
        return this;
    }

    /**
     * Get runningVmNumNot
     *
     * @return runningVmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNumNot() {
        return runningVmNumNot;
    }

    public void setRunningVmNumNot(Integer runningVmNumNot) {
        this.runningVmNumNot = runningVmNumNot;
    }

    public ZoneWhereInput runningVmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        return this;
    }

    public ZoneWhereInput runningVmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        return this;
    }

    public void setRunningVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
        }
    }

    public boolean getRunningVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_NOT);
    }

    public ZoneWhereInput runningVmNumNotIn(List<Integer> runningVmNumNotIn) {

        this.runningVmNumNotIn = runningVmNumNotIn;
        return this;
    }

    public ZoneWhereInput addRunningVmNumNotInItem(Integer runningVmNumNotInItem) {
        if (this.runningVmNumNotIn == null) {
            this.runningVmNumNotIn = new ArrayList<Integer>();
        }
        this.runningVmNumNotIn.add(runningVmNumNotInItem);
        return this;
    }

    /**
     * Get runningVmNumNotIn
     *
     * @return runningVmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRunningVmNumNotIn() {
        return runningVmNumNotIn;
    }

    public void setRunningVmNumNotIn(List<Integer> runningVmNumNotIn) {
        this.runningVmNumNotIn = runningVmNumNotIn;
    }

    public ZoneWhereInput runningVmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        return this;
    }

    public ZoneWhereInput runningVmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        return this;
    }

    public void setRunningVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
        }
    }

    public boolean getRunningVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN);
    }

    public ZoneWhereInput stoppedVmNum(Integer stoppedVmNum) {

        this.stoppedVmNum = stoppedVmNum;
        return this;
    }

    /**
     * Get stoppedVmNum
     *
     * @return stoppedVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNum() {
        return stoppedVmNum;
    }

    public void setStoppedVmNum(Integer stoppedVmNum) {
        this.stoppedVmNum = stoppedVmNum;
    }

    public ZoneWhereInput stoppedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public ZoneWhereInput stoppedVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public void setStoppedVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM);
        }
    }

    public boolean getStoppedVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM);
    }

    public ZoneWhereInput stoppedVmNumGt(Integer stoppedVmNumGt) {

        this.stoppedVmNumGt = stoppedVmNumGt;
        return this;
    }

    /**
     * Get stoppedVmNumGt
     *
     * @return stoppedVmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumGt() {
        return stoppedVmNumGt;
    }

    public void setStoppedVmNumGt(Integer stoppedVmNumGt) {
        this.stoppedVmNumGt = stoppedVmNumGt;
    }

    public ZoneWhereInput stoppedVmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        return this;
    }

    public ZoneWhereInput stoppedVmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        return this;
    }

    public void setStoppedVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
        }
    }

    public boolean getStoppedVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_GT);
    }

    public ZoneWhereInput stoppedVmNumGte(Integer stoppedVmNumGte) {

        this.stoppedVmNumGte = stoppedVmNumGte;
        return this;
    }

    /**
     * Get stoppedVmNumGte
     *
     * @return stoppedVmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumGte() {
        return stoppedVmNumGte;
    }

    public void setStoppedVmNumGte(Integer stoppedVmNumGte) {
        this.stoppedVmNumGte = stoppedVmNumGte;
    }

    public ZoneWhereInput stoppedVmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        return this;
    }

    public ZoneWhereInput stoppedVmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        return this;
    }

    public void setStoppedVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
        }
    }

    public boolean getStoppedVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_GTE);
    }

    public ZoneWhereInput stoppedVmNumIn(List<Integer> stoppedVmNumIn) {

        this.stoppedVmNumIn = stoppedVmNumIn;
        return this;
    }

    public ZoneWhereInput addStoppedVmNumInItem(Integer stoppedVmNumInItem) {
        if (this.stoppedVmNumIn == null) {
            this.stoppedVmNumIn = new ArrayList<Integer>();
        }
        this.stoppedVmNumIn.add(stoppedVmNumInItem);
        return this;
    }

    /**
     * Get stoppedVmNumIn
     *
     * @return stoppedVmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getStoppedVmNumIn() {
        return stoppedVmNumIn;
    }

    public void setStoppedVmNumIn(List<Integer> stoppedVmNumIn) {
        this.stoppedVmNumIn = stoppedVmNumIn;
    }

    public ZoneWhereInput stoppedVmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        return this;
    }

    public ZoneWhereInput stoppedVmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        return this;
    }

    public void setStoppedVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
        }
    }

    public boolean getStoppedVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_IN);
    }

    public ZoneWhereInput stoppedVmNumLt(Integer stoppedVmNumLt) {

        this.stoppedVmNumLt = stoppedVmNumLt;
        return this;
    }

    /**
     * Get stoppedVmNumLt
     *
     * @return stoppedVmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumLt() {
        return stoppedVmNumLt;
    }

    public void setStoppedVmNumLt(Integer stoppedVmNumLt) {
        this.stoppedVmNumLt = stoppedVmNumLt;
    }

    public ZoneWhereInput stoppedVmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        return this;
    }

    public ZoneWhereInput stoppedVmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        return this;
    }

    public void setStoppedVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
        }
    }

    public boolean getStoppedVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_LT);
    }

    public ZoneWhereInput stoppedVmNumLte(Integer stoppedVmNumLte) {

        this.stoppedVmNumLte = stoppedVmNumLte;
        return this;
    }

    /**
     * Get stoppedVmNumLte
     *
     * @return stoppedVmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumLte() {
        return stoppedVmNumLte;
    }

    public void setStoppedVmNumLte(Integer stoppedVmNumLte) {
        this.stoppedVmNumLte = stoppedVmNumLte;
    }

    public ZoneWhereInput stoppedVmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        return this;
    }

    public ZoneWhereInput stoppedVmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        return this;
    }

    public void setStoppedVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
        }
    }

    public boolean getStoppedVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_LTE);
    }

    public ZoneWhereInput stoppedVmNumNot(Integer stoppedVmNumNot) {

        this.stoppedVmNumNot = stoppedVmNumNot;
        return this;
    }

    /**
     * Get stoppedVmNumNot
     *
     * @return stoppedVmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNumNot() {
        return stoppedVmNumNot;
    }

    public void setStoppedVmNumNot(Integer stoppedVmNumNot) {
        this.stoppedVmNumNot = stoppedVmNumNot;
    }

    public ZoneWhereInput stoppedVmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        return this;
    }

    public ZoneWhereInput stoppedVmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        return this;
    }

    public void setStoppedVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
        }
    }

    public boolean getStoppedVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_NOT);
    }

    public ZoneWhereInput stoppedVmNumNotIn(List<Integer> stoppedVmNumNotIn) {

        this.stoppedVmNumNotIn = stoppedVmNumNotIn;
        return this;
    }

    public ZoneWhereInput addStoppedVmNumNotInItem(Integer stoppedVmNumNotInItem) {
        if (this.stoppedVmNumNotIn == null) {
            this.stoppedVmNumNotIn = new ArrayList<Integer>();
        }
        this.stoppedVmNumNotIn.add(stoppedVmNumNotInItem);
        return this;
    }

    /**
     * Get stoppedVmNumNotIn
     *
     * @return stoppedVmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getStoppedVmNumNotIn() {
        return stoppedVmNumNotIn;
    }

    public void setStoppedVmNumNotIn(List<Integer> stoppedVmNumNotIn) {
        this.stoppedVmNumNotIn = stoppedVmNumNotIn;
    }

    public ZoneWhereInput stoppedVmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        return this;
    }

    public ZoneWhereInput stoppedVmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        return this;
    }

    public void setStoppedVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
        }
    }

    public boolean getStoppedVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN);
    }

    public ZoneWhereInput suspendedVmNum(Integer suspendedVmNum) {

        this.suspendedVmNum = suspendedVmNum;
        return this;
    }

    /**
     * Get suspendedVmNum
     *
     * @return suspendedVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNum() {
        return suspendedVmNum;
    }

    public void setSuspendedVmNum(Integer suspendedVmNum) {
        this.suspendedVmNum = suspendedVmNum;
    }

    public ZoneWhereInput suspendedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public ZoneWhereInput suspendedVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public void setSuspendedVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        }
    }

    public boolean getSuspendedVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM);
    }

    public ZoneWhereInput suspendedVmNumGt(Integer suspendedVmNumGt) {

        this.suspendedVmNumGt = suspendedVmNumGt;
        return this;
    }

    /**
     * Get suspendedVmNumGt
     *
     * @return suspendedVmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumGt() {
        return suspendedVmNumGt;
    }

    public void setSuspendedVmNumGt(Integer suspendedVmNumGt) {
        this.suspendedVmNumGt = suspendedVmNumGt;
    }

    public ZoneWhereInput suspendedVmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        return this;
    }

    public ZoneWhereInput suspendedVmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        return this;
    }

    public void setSuspendedVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
        }
    }

    public boolean getSuspendedVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT);
    }

    public ZoneWhereInput suspendedVmNumGte(Integer suspendedVmNumGte) {

        this.suspendedVmNumGte = suspendedVmNumGte;
        return this;
    }

    /**
     * Get suspendedVmNumGte
     *
     * @return suspendedVmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumGte() {
        return suspendedVmNumGte;
    }

    public void setSuspendedVmNumGte(Integer suspendedVmNumGte) {
        this.suspendedVmNumGte = suspendedVmNumGte;
    }

    public ZoneWhereInput suspendedVmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        return this;
    }

    public ZoneWhereInput suspendedVmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        return this;
    }

    public void setSuspendedVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
        }
    }

    public boolean getSuspendedVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE);
    }

    public ZoneWhereInput suspendedVmNumIn(List<Integer> suspendedVmNumIn) {

        this.suspendedVmNumIn = suspendedVmNumIn;
        return this;
    }

    public ZoneWhereInput addSuspendedVmNumInItem(Integer suspendedVmNumInItem) {
        if (this.suspendedVmNumIn == null) {
            this.suspendedVmNumIn = new ArrayList<Integer>();
        }
        this.suspendedVmNumIn.add(suspendedVmNumInItem);
        return this;
    }

    /**
     * Get suspendedVmNumIn
     *
     * @return suspendedVmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSuspendedVmNumIn() {
        return suspendedVmNumIn;
    }

    public void setSuspendedVmNumIn(List<Integer> suspendedVmNumIn) {
        this.suspendedVmNumIn = suspendedVmNumIn;
    }

    public ZoneWhereInput suspendedVmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        return this;
    }

    public ZoneWhereInput suspendedVmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        return this;
    }

    public void setSuspendedVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
        }
    }

    public boolean getSuspendedVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN);
    }

    public ZoneWhereInput suspendedVmNumLt(Integer suspendedVmNumLt) {

        this.suspendedVmNumLt = suspendedVmNumLt;
        return this;
    }

    /**
     * Get suspendedVmNumLt
     *
     * @return suspendedVmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumLt() {
        return suspendedVmNumLt;
    }

    public void setSuspendedVmNumLt(Integer suspendedVmNumLt) {
        this.suspendedVmNumLt = suspendedVmNumLt;
    }

    public ZoneWhereInput suspendedVmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        return this;
    }

    public ZoneWhereInput suspendedVmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        return this;
    }

    public void setSuspendedVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
        }
    }

    public boolean getSuspendedVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT);
    }

    public ZoneWhereInput suspendedVmNumLte(Integer suspendedVmNumLte) {

        this.suspendedVmNumLte = suspendedVmNumLte;
        return this;
    }

    /**
     * Get suspendedVmNumLte
     *
     * @return suspendedVmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumLte() {
        return suspendedVmNumLte;
    }

    public void setSuspendedVmNumLte(Integer suspendedVmNumLte) {
        this.suspendedVmNumLte = suspendedVmNumLte;
    }

    public ZoneWhereInput suspendedVmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        return this;
    }

    public ZoneWhereInput suspendedVmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        return this;
    }

    public void setSuspendedVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
        }
    }

    public boolean getSuspendedVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE);
    }

    public ZoneWhereInput suspendedVmNumNot(Integer suspendedVmNumNot) {

        this.suspendedVmNumNot = suspendedVmNumNot;
        return this;
    }

    /**
     * Get suspendedVmNumNot
     *
     * @return suspendedVmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNumNot() {
        return suspendedVmNumNot;
    }

    public void setSuspendedVmNumNot(Integer suspendedVmNumNot) {
        this.suspendedVmNumNot = suspendedVmNumNot;
    }

    public ZoneWhereInput suspendedVmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        return this;
    }

    public ZoneWhereInput suspendedVmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        return this;
    }

    public void setSuspendedVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
        }
    }

    public boolean getSuspendedVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT);
    }

    public ZoneWhereInput suspendedVmNumNotIn(List<Integer> suspendedVmNumNotIn) {

        this.suspendedVmNumNotIn = suspendedVmNumNotIn;
        return this;
    }

    public ZoneWhereInput addSuspendedVmNumNotInItem(Integer suspendedVmNumNotInItem) {
        if (this.suspendedVmNumNotIn == null) {
            this.suspendedVmNumNotIn = new ArrayList<Integer>();
        }
        this.suspendedVmNumNotIn.add(suspendedVmNumNotInItem);
        return this;
    }

    /**
     * Get suspendedVmNumNotIn
     *
     * @return suspendedVmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSuspendedVmNumNotIn() {
        return suspendedVmNumNotIn;
    }

    public void setSuspendedVmNumNotIn(List<Integer> suspendedVmNumNotIn) {
        this.suspendedVmNumNotIn = suspendedVmNumNotIn;
    }

    public ZoneWhereInput suspendedVmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        return this;
    }

    public ZoneWhereInput suspendedVmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        return this;
    }

    public void setSuspendedVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
        }
    }

    public boolean getSuspendedVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN);
    }

    public ZoneWhereInput totalCacheCapacity(Long totalCacheCapacity) {

        this.totalCacheCapacity = totalCacheCapacity;
        return this;
    }

    /**
     * Get totalCacheCapacity
     *
     * @return totalCacheCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacity() {
        return totalCacheCapacity;
    }

    public void setTotalCacheCapacity(Long totalCacheCapacity) {
        this.totalCacheCapacity = totalCacheCapacity;
    }

    public ZoneWhereInput totalCacheCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public ZoneWhereInput totalCacheCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public void setTotalCacheCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        }
    }

    public boolean getTotalCacheCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
    }

    public ZoneWhereInput totalCacheCapacityGt(Long totalCacheCapacityGt) {

        this.totalCacheCapacityGt = totalCacheCapacityGt;
        return this;
    }

    /**
     * Get totalCacheCapacityGt
     *
     * @return totalCacheCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityGt() {
        return totalCacheCapacityGt;
    }

    public void setTotalCacheCapacityGt(Long totalCacheCapacityGt) {
        this.totalCacheCapacityGt = totalCacheCapacityGt;
    }

    public ZoneWhereInput totalCacheCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        return this;
    }

    public void setTotalCacheCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        }
    }

    public boolean getTotalCacheCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
    }

    public ZoneWhereInput totalCacheCapacityGte(Long totalCacheCapacityGte) {

        this.totalCacheCapacityGte = totalCacheCapacityGte;
        return this;
    }

    /**
     * Get totalCacheCapacityGte
     *
     * @return totalCacheCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityGte() {
        return totalCacheCapacityGte;
    }

    public void setTotalCacheCapacityGte(Long totalCacheCapacityGte) {
        this.totalCacheCapacityGte = totalCacheCapacityGte;
    }

    public ZoneWhereInput totalCacheCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        return this;
    }

    public void setTotalCacheCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        }
    }

    public boolean getTotalCacheCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
    }

    public ZoneWhereInput totalCacheCapacityIn(List<Long> totalCacheCapacityIn) {

        this.totalCacheCapacityIn = totalCacheCapacityIn;
        return this;
    }

    public ZoneWhereInput addTotalCacheCapacityInItem(Long totalCacheCapacityInItem) {
        if (this.totalCacheCapacityIn == null) {
            this.totalCacheCapacityIn = new ArrayList<Long>();
        }
        this.totalCacheCapacityIn.add(totalCacheCapacityInItem);
        return this;
    }

    /**
     * Get totalCacheCapacityIn
     *
     * @return totalCacheCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCacheCapacityIn() {
        return totalCacheCapacityIn;
    }

    public void setTotalCacheCapacityIn(List<Long> totalCacheCapacityIn) {
        this.totalCacheCapacityIn = totalCacheCapacityIn;
    }

    public ZoneWhereInput totalCacheCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        return this;
    }

    public void setTotalCacheCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        }
    }

    public boolean getTotalCacheCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
    }

    public ZoneWhereInput totalCacheCapacityLt(Long totalCacheCapacityLt) {

        this.totalCacheCapacityLt = totalCacheCapacityLt;
        return this;
    }

    /**
     * Get totalCacheCapacityLt
     *
     * @return totalCacheCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityLt() {
        return totalCacheCapacityLt;
    }

    public void setTotalCacheCapacityLt(Long totalCacheCapacityLt) {
        this.totalCacheCapacityLt = totalCacheCapacityLt;
    }

    public ZoneWhereInput totalCacheCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        return this;
    }

    public void setTotalCacheCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        }
    }

    public boolean getTotalCacheCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
    }

    public ZoneWhereInput totalCacheCapacityLte(Long totalCacheCapacityLte) {

        this.totalCacheCapacityLte = totalCacheCapacityLte;
        return this;
    }

    /**
     * Get totalCacheCapacityLte
     *
     * @return totalCacheCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityLte() {
        return totalCacheCapacityLte;
    }

    public void setTotalCacheCapacityLte(Long totalCacheCapacityLte) {
        this.totalCacheCapacityLte = totalCacheCapacityLte;
    }

    public ZoneWhereInput totalCacheCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        return this;
    }

    public void setTotalCacheCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        }
    }

    public boolean getTotalCacheCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
    }

    public ZoneWhereInput totalCacheCapacityNot(Long totalCacheCapacityNot) {

        this.totalCacheCapacityNot = totalCacheCapacityNot;
        return this;
    }

    /**
     * Get totalCacheCapacityNot
     *
     * @return totalCacheCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacityNot() {
        return totalCacheCapacityNot;
    }

    public void setTotalCacheCapacityNot(Long totalCacheCapacityNot) {
        this.totalCacheCapacityNot = totalCacheCapacityNot;
    }

    public ZoneWhereInput totalCacheCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        return this;
    }

    public void setTotalCacheCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        }
    }

    public boolean getTotalCacheCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
    }

    public ZoneWhereInput totalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {

        this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
        return this;
    }

    public ZoneWhereInput addTotalCacheCapacityNotInItem(Long totalCacheCapacityNotInItem) {
        if (this.totalCacheCapacityNotIn == null) {
            this.totalCacheCapacityNotIn = new ArrayList<Long>();
        }
        this.totalCacheCapacityNotIn.add(totalCacheCapacityNotInItem);
        return this;
    }

    /**
     * Get totalCacheCapacityNotIn
     *
     * @return totalCacheCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCacheCapacityNotIn() {
        return totalCacheCapacityNotIn;
    }

    public void setTotalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {
        this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
    }

    public ZoneWhereInput totalCacheCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        return this;
    }

    public ZoneWhereInput totalCacheCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        return this;
    }

    public void setTotalCacheCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        }
    }

    public boolean getTotalCacheCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
    }

    public ZoneWhereInput totalCpuCores(Integer totalCpuCores) {

        this.totalCpuCores = totalCpuCores;
        return this;
    }

    /**
     * Get totalCpuCores
     *
     * @return totalCpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCores() {
        return totalCpuCores;
    }

    public void setTotalCpuCores(Integer totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
    }

    public ZoneWhereInput totalCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public ZoneWhereInput totalCpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public void setTotalCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES);
        }
    }

    public boolean getTotalCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES);
    }

    public ZoneWhereInput totalCpuCoresGt(Integer totalCpuCoresGt) {

        this.totalCpuCoresGt = totalCpuCoresGt;
        return this;
    }

    /**
     * Get totalCpuCoresGt
     *
     * @return totalCpuCoresGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresGt() {
        return totalCpuCoresGt;
    }

    public void setTotalCpuCoresGt(Integer totalCpuCoresGt) {
        this.totalCpuCoresGt = totalCpuCoresGt;
    }

    public ZoneWhereInput totalCpuCoresGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        return this;
    }

    public ZoneWhereInput totalCpuCoresGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        return this;
    }

    public void setTotalCpuCoresGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        }
    }

    public boolean getTotalCpuCoresGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
    }

    public ZoneWhereInput totalCpuCoresGte(Integer totalCpuCoresGte) {

        this.totalCpuCoresGte = totalCpuCoresGte;
        return this;
    }

    /**
     * Get totalCpuCoresGte
     *
     * @return totalCpuCoresGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresGte() {
        return totalCpuCoresGte;
    }

    public void setTotalCpuCoresGte(Integer totalCpuCoresGte) {
        this.totalCpuCoresGte = totalCpuCoresGte;
    }

    public ZoneWhereInput totalCpuCoresGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        return this;
    }

    public ZoneWhereInput totalCpuCoresGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        return this;
    }

    public void setTotalCpuCoresGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        }
    }

    public boolean getTotalCpuCoresGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
    }

    public ZoneWhereInput totalCpuCoresIn(List<Integer> totalCpuCoresIn) {

        this.totalCpuCoresIn = totalCpuCoresIn;
        return this;
    }

    public ZoneWhereInput addTotalCpuCoresInItem(Integer totalCpuCoresInItem) {
        if (this.totalCpuCoresIn == null) {
            this.totalCpuCoresIn = new ArrayList<Integer>();
        }
        this.totalCpuCoresIn.add(totalCpuCoresInItem);
        return this;
    }

    /**
     * Get totalCpuCoresIn
     *
     * @return totalCpuCoresIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCpuCoresIn() {
        return totalCpuCoresIn;
    }

    public void setTotalCpuCoresIn(List<Integer> totalCpuCoresIn) {
        this.totalCpuCoresIn = totalCpuCoresIn;
    }

    public ZoneWhereInput totalCpuCoresIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        return this;
    }

    public ZoneWhereInput totalCpuCoresIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        return this;
    }

    public void setTotalCpuCoresIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        }
    }

    public boolean getTotalCpuCoresIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
    }

    public ZoneWhereInput totalCpuCoresLt(Integer totalCpuCoresLt) {

        this.totalCpuCoresLt = totalCpuCoresLt;
        return this;
    }

    /**
     * Get totalCpuCoresLt
     *
     * @return totalCpuCoresLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresLt() {
        return totalCpuCoresLt;
    }

    public void setTotalCpuCoresLt(Integer totalCpuCoresLt) {
        this.totalCpuCoresLt = totalCpuCoresLt;
    }

    public ZoneWhereInput totalCpuCoresLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        return this;
    }

    public ZoneWhereInput totalCpuCoresLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        return this;
    }

    public void setTotalCpuCoresLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        }
    }

    public boolean getTotalCpuCoresLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
    }

    public ZoneWhereInput totalCpuCoresLte(Integer totalCpuCoresLte) {

        this.totalCpuCoresLte = totalCpuCoresLte;
        return this;
    }

    /**
     * Get totalCpuCoresLte
     *
     * @return totalCpuCoresLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresLte() {
        return totalCpuCoresLte;
    }

    public void setTotalCpuCoresLte(Integer totalCpuCoresLte) {
        this.totalCpuCoresLte = totalCpuCoresLte;
    }

    public ZoneWhereInput totalCpuCoresLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        return this;
    }

    public ZoneWhereInput totalCpuCoresLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        return this;
    }

    public void setTotalCpuCoresLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        }
    }

    public boolean getTotalCpuCoresLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
    }

    public ZoneWhereInput totalCpuCoresNot(Integer totalCpuCoresNot) {

        this.totalCpuCoresNot = totalCpuCoresNot;
        return this;
    }

    /**
     * Get totalCpuCoresNot
     *
     * @return totalCpuCoresNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCoresNot() {
        return totalCpuCoresNot;
    }

    public void setTotalCpuCoresNot(Integer totalCpuCoresNot) {
        this.totalCpuCoresNot = totalCpuCoresNot;
    }

    public ZoneWhereInput totalCpuCoresNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        return this;
    }

    public ZoneWhereInput totalCpuCoresNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        return this;
    }

    public void setTotalCpuCoresNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        }
    }

    public boolean getTotalCpuCoresNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
    }

    public ZoneWhereInput totalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {

        this.totalCpuCoresNotIn = totalCpuCoresNotIn;
        return this;
    }

    public ZoneWhereInput addTotalCpuCoresNotInItem(Integer totalCpuCoresNotInItem) {
        if (this.totalCpuCoresNotIn == null) {
            this.totalCpuCoresNotIn = new ArrayList<Integer>();
        }
        this.totalCpuCoresNotIn.add(totalCpuCoresNotInItem);
        return this;
    }

    /**
     * Get totalCpuCoresNotIn
     *
     * @return totalCpuCoresNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalCpuCoresNotIn() {
        return totalCpuCoresNotIn;
    }

    public void setTotalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {
        this.totalCpuCoresNotIn = totalCpuCoresNotIn;
    }

    public ZoneWhereInput totalCpuCoresNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        return this;
    }

    public ZoneWhereInput totalCpuCoresNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        return this;
    }

    public void setTotalCpuCoresNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        }
    }

    public boolean getTotalCpuCoresNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
    }

    public ZoneWhereInput totalCpuHz(Long totalCpuHz) {

        this.totalCpuHz = totalCpuHz;
        return this;
    }

    /**
     * Get totalCpuHz
     *
     * @return totalCpuHz
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHz() {
        return totalCpuHz;
    }

    public void setTotalCpuHz(Long totalCpuHz) {
        this.totalCpuHz = totalCpuHz;
    }

    public ZoneWhereInput totalCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public ZoneWhereInput totalCpuHz_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public void setTotalCpuHz_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ);
        }
    }

    public boolean getTotalCpuHz_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ);
    }

    public ZoneWhereInput totalCpuHzGt(Long totalCpuHzGt) {

        this.totalCpuHzGt = totalCpuHzGt;
        return this;
    }

    /**
     * Get totalCpuHzGt
     *
     * @return totalCpuHzGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzGt() {
        return totalCpuHzGt;
    }

    public void setTotalCpuHzGt(Long totalCpuHzGt) {
        this.totalCpuHzGt = totalCpuHzGt;
    }

    public ZoneWhereInput totalCpuHzGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        return this;
    }

    public ZoneWhereInput totalCpuHzGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        return this;
    }

    public void setTotalCpuHzGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        }
    }

    public boolean getTotalCpuHzGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
    }

    public ZoneWhereInput totalCpuHzGte(Long totalCpuHzGte) {

        this.totalCpuHzGte = totalCpuHzGte;
        return this;
    }

    /**
     * Get totalCpuHzGte
     *
     * @return totalCpuHzGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzGte() {
        return totalCpuHzGte;
    }

    public void setTotalCpuHzGte(Long totalCpuHzGte) {
        this.totalCpuHzGte = totalCpuHzGte;
    }

    public ZoneWhereInput totalCpuHzGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        return this;
    }

    public ZoneWhereInput totalCpuHzGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        return this;
    }

    public void setTotalCpuHzGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        }
    }

    public boolean getTotalCpuHzGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
    }

    public ZoneWhereInput totalCpuHzIn(List<Long> totalCpuHzIn) {

        this.totalCpuHzIn = totalCpuHzIn;
        return this;
    }

    public ZoneWhereInput addTotalCpuHzInItem(Long totalCpuHzInItem) {
        if (this.totalCpuHzIn == null) {
            this.totalCpuHzIn = new ArrayList<Long>();
        }
        this.totalCpuHzIn.add(totalCpuHzInItem);
        return this;
    }

    /**
     * Get totalCpuHzIn
     *
     * @return totalCpuHzIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCpuHzIn() {
        return totalCpuHzIn;
    }

    public void setTotalCpuHzIn(List<Long> totalCpuHzIn) {
        this.totalCpuHzIn = totalCpuHzIn;
    }

    public ZoneWhereInput totalCpuHzIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        return this;
    }

    public ZoneWhereInput totalCpuHzIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        return this;
    }

    public void setTotalCpuHzIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        }
    }

    public boolean getTotalCpuHzIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
    }

    public ZoneWhereInput totalCpuHzLt(Long totalCpuHzLt) {

        this.totalCpuHzLt = totalCpuHzLt;
        return this;
    }

    /**
     * Get totalCpuHzLt
     *
     * @return totalCpuHzLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzLt() {
        return totalCpuHzLt;
    }

    public void setTotalCpuHzLt(Long totalCpuHzLt) {
        this.totalCpuHzLt = totalCpuHzLt;
    }

    public ZoneWhereInput totalCpuHzLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        return this;
    }

    public ZoneWhereInput totalCpuHzLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        return this;
    }

    public void setTotalCpuHzLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        }
    }

    public boolean getTotalCpuHzLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
    }

    public ZoneWhereInput totalCpuHzLte(Long totalCpuHzLte) {

        this.totalCpuHzLte = totalCpuHzLte;
        return this;
    }

    /**
     * Get totalCpuHzLte
     *
     * @return totalCpuHzLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzLte() {
        return totalCpuHzLte;
    }

    public void setTotalCpuHzLte(Long totalCpuHzLte) {
        this.totalCpuHzLte = totalCpuHzLte;
    }

    public ZoneWhereInput totalCpuHzLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        return this;
    }

    public ZoneWhereInput totalCpuHzLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        return this;
    }

    public void setTotalCpuHzLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        }
    }

    public boolean getTotalCpuHzLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
    }

    public ZoneWhereInput totalCpuHzNot(Long totalCpuHzNot) {

        this.totalCpuHzNot = totalCpuHzNot;
        return this;
    }

    /**
     * Get totalCpuHzNot
     *
     * @return totalCpuHzNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHzNot() {
        return totalCpuHzNot;
    }

    public void setTotalCpuHzNot(Long totalCpuHzNot) {
        this.totalCpuHzNot = totalCpuHzNot;
    }

    public ZoneWhereInput totalCpuHzNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        return this;
    }

    public ZoneWhereInput totalCpuHzNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        return this;
    }

    public void setTotalCpuHzNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        }
    }

    public boolean getTotalCpuHzNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
    }

    public ZoneWhereInput totalCpuHzNotIn(List<Long> totalCpuHzNotIn) {

        this.totalCpuHzNotIn = totalCpuHzNotIn;
        return this;
    }

    public ZoneWhereInput addTotalCpuHzNotInItem(Long totalCpuHzNotInItem) {
        if (this.totalCpuHzNotIn == null) {
            this.totalCpuHzNotIn = new ArrayList<Long>();
        }
        this.totalCpuHzNotIn.add(totalCpuHzNotInItem);
        return this;
    }

    /**
     * Get totalCpuHzNotIn
     *
     * @return totalCpuHzNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalCpuHzNotIn() {
        return totalCpuHzNotIn;
    }

    public void setTotalCpuHzNotIn(List<Long> totalCpuHzNotIn) {
        this.totalCpuHzNotIn = totalCpuHzNotIn;
    }

    public ZoneWhereInput totalCpuHzNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        return this;
    }

    public ZoneWhereInput totalCpuHzNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        return this;
    }

    public void setTotalCpuHzNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        }
    }

    public boolean getTotalCpuHzNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
    }

    public ZoneWhereInput totalDataCapacity(Long totalDataCapacity) {

        this.totalDataCapacity = totalDataCapacity;
        return this;
    }

    /**
     * Get totalDataCapacity
     *
     * @return totalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacity() {
        return totalDataCapacity;
    }

    public void setTotalDataCapacity(Long totalDataCapacity) {
        this.totalDataCapacity = totalDataCapacity;
    }

    public ZoneWhereInput totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public ZoneWhereInput totalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public void setTotalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        }
    }

    public boolean getTotalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
    }

    public ZoneWhereInput totalDataCapacityGt(Long totalDataCapacityGt) {

        this.totalDataCapacityGt = totalDataCapacityGt;
        return this;
    }

    /**
     * Get totalDataCapacityGt
     *
     * @return totalDataCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityGt() {
        return totalDataCapacityGt;
    }

    public void setTotalDataCapacityGt(Long totalDataCapacityGt) {
        this.totalDataCapacityGt = totalDataCapacityGt;
    }

    public ZoneWhereInput totalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public ZoneWhereInput totalDataCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public void setTotalDataCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        }
    }

    public boolean getTotalDataCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
    }

    public ZoneWhereInput totalDataCapacityGte(Long totalDataCapacityGte) {

        this.totalDataCapacityGte = totalDataCapacityGte;
        return this;
    }

    /**
     * Get totalDataCapacityGte
     *
     * @return totalDataCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityGte() {
        return totalDataCapacityGte;
    }

    public void setTotalDataCapacityGte(Long totalDataCapacityGte) {
        this.totalDataCapacityGte = totalDataCapacityGte;
    }

    public ZoneWhereInput totalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public ZoneWhereInput totalDataCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public void setTotalDataCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        }
    }

    public boolean getTotalDataCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
    }

    public ZoneWhereInput totalDataCapacityIn(List<Long> totalDataCapacityIn) {

        this.totalDataCapacityIn = totalDataCapacityIn;
        return this;
    }

    public ZoneWhereInput addTotalDataCapacityInItem(Long totalDataCapacityInItem) {
        if (this.totalDataCapacityIn == null) {
            this.totalDataCapacityIn = new ArrayList<Long>();
        }
        this.totalDataCapacityIn.add(totalDataCapacityInItem);
        return this;
    }

    /**
     * Get totalDataCapacityIn
     *
     * @return totalDataCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalDataCapacityIn() {
        return totalDataCapacityIn;
    }

    public void setTotalDataCapacityIn(List<Long> totalDataCapacityIn) {
        this.totalDataCapacityIn = totalDataCapacityIn;
    }

    public ZoneWhereInput totalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public ZoneWhereInput totalDataCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public void setTotalDataCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        }
    }

    public boolean getTotalDataCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
    }

    public ZoneWhereInput totalDataCapacityLt(Long totalDataCapacityLt) {

        this.totalDataCapacityLt = totalDataCapacityLt;
        return this;
    }

    /**
     * Get totalDataCapacityLt
     *
     * @return totalDataCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityLt() {
        return totalDataCapacityLt;
    }

    public void setTotalDataCapacityLt(Long totalDataCapacityLt) {
        this.totalDataCapacityLt = totalDataCapacityLt;
    }

    public ZoneWhereInput totalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public ZoneWhereInput totalDataCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public void setTotalDataCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        }
    }

    public boolean getTotalDataCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
    }

    public ZoneWhereInput totalDataCapacityLte(Long totalDataCapacityLte) {

        this.totalDataCapacityLte = totalDataCapacityLte;
        return this;
    }

    /**
     * Get totalDataCapacityLte
     *
     * @return totalDataCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityLte() {
        return totalDataCapacityLte;
    }

    public void setTotalDataCapacityLte(Long totalDataCapacityLte) {
        this.totalDataCapacityLte = totalDataCapacityLte;
    }

    public ZoneWhereInput totalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public ZoneWhereInput totalDataCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public void setTotalDataCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        }
    }

    public boolean getTotalDataCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
    }

    public ZoneWhereInput totalDataCapacityNot(Long totalDataCapacityNot) {

        this.totalDataCapacityNot = totalDataCapacityNot;
        return this;
    }

    /**
     * Get totalDataCapacityNot
     *
     * @return totalDataCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacityNot() {
        return totalDataCapacityNot;
    }

    public void setTotalDataCapacityNot(Long totalDataCapacityNot) {
        this.totalDataCapacityNot = totalDataCapacityNot;
    }

    public ZoneWhereInput totalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public ZoneWhereInput totalDataCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public void setTotalDataCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        }
    }

    public boolean getTotalDataCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
    }

    public ZoneWhereInput totalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {

        this.totalDataCapacityNotIn = totalDataCapacityNotIn;
        return this;
    }

    public ZoneWhereInput addTotalDataCapacityNotInItem(Long totalDataCapacityNotInItem) {
        if (this.totalDataCapacityNotIn == null) {
            this.totalDataCapacityNotIn = new ArrayList<Long>();
        }
        this.totalDataCapacityNotIn.add(totalDataCapacityNotInItem);
        return this;
    }

    /**
     * Get totalDataCapacityNotIn
     *
     * @return totalDataCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalDataCapacityNotIn() {
        return totalDataCapacityNotIn;
    }

    public void setTotalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {
        this.totalDataCapacityNotIn = totalDataCapacityNotIn;
    }

    public ZoneWhereInput totalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public ZoneWhereInput totalDataCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public void setTotalDataCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        }
    }

    public boolean getTotalDataCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
    }

    public ZoneWhereInput totalMemoryBytes(Long totalMemoryBytes) {

        this.totalMemoryBytes = totalMemoryBytes;
        return this;
    }

    /**
     * Get totalMemoryBytes
     *
     * @return totalMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytes() {
        return totalMemoryBytes;
    }

    public void setTotalMemoryBytes(Long totalMemoryBytes) {
        this.totalMemoryBytes = totalMemoryBytes;
    }

    public ZoneWhereInput totalMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public ZoneWhereInput totalMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public void setTotalMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        }
    }

    public boolean getTotalMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
    }

    public ZoneWhereInput totalMemoryBytesGt(Long totalMemoryBytesGt) {

        this.totalMemoryBytesGt = totalMemoryBytesGt;
        return this;
    }

    /**
     * Get totalMemoryBytesGt
     *
     * @return totalMemoryBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesGt() {
        return totalMemoryBytesGt;
    }

    public void setTotalMemoryBytesGt(Long totalMemoryBytesGt) {
        this.totalMemoryBytesGt = totalMemoryBytesGt;
    }

    public ZoneWhereInput totalMemoryBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        return this;
    }

    public void setTotalMemoryBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        }
    }

    public boolean getTotalMemoryBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
    }

    public ZoneWhereInput totalMemoryBytesGte(Long totalMemoryBytesGte) {

        this.totalMemoryBytesGte = totalMemoryBytesGte;
        return this;
    }

    /**
     * Get totalMemoryBytesGte
     *
     * @return totalMemoryBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesGte() {
        return totalMemoryBytesGte;
    }

    public void setTotalMemoryBytesGte(Long totalMemoryBytesGte) {
        this.totalMemoryBytesGte = totalMemoryBytesGte;
    }

    public ZoneWhereInput totalMemoryBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        return this;
    }

    public void setTotalMemoryBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        }
    }

    public boolean getTotalMemoryBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
    }

    public ZoneWhereInput totalMemoryBytesIn(List<Long> totalMemoryBytesIn) {

        this.totalMemoryBytesIn = totalMemoryBytesIn;
        return this;
    }

    public ZoneWhereInput addTotalMemoryBytesInItem(Long totalMemoryBytesInItem) {
        if (this.totalMemoryBytesIn == null) {
            this.totalMemoryBytesIn = new ArrayList<Long>();
        }
        this.totalMemoryBytesIn.add(totalMemoryBytesInItem);
        return this;
    }

    /**
     * Get totalMemoryBytesIn
     *
     * @return totalMemoryBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalMemoryBytesIn() {
        return totalMemoryBytesIn;
    }

    public void setTotalMemoryBytesIn(List<Long> totalMemoryBytesIn) {
        this.totalMemoryBytesIn = totalMemoryBytesIn;
    }

    public ZoneWhereInput totalMemoryBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        return this;
    }

    public void setTotalMemoryBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        }
    }

    public boolean getTotalMemoryBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
    }

    public ZoneWhereInput totalMemoryBytesLt(Long totalMemoryBytesLt) {

        this.totalMemoryBytesLt = totalMemoryBytesLt;
        return this;
    }

    /**
     * Get totalMemoryBytesLt
     *
     * @return totalMemoryBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesLt() {
        return totalMemoryBytesLt;
    }

    public void setTotalMemoryBytesLt(Long totalMemoryBytesLt) {
        this.totalMemoryBytesLt = totalMemoryBytesLt;
    }

    public ZoneWhereInput totalMemoryBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        return this;
    }

    public void setTotalMemoryBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        }
    }

    public boolean getTotalMemoryBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
    }

    public ZoneWhereInput totalMemoryBytesLte(Long totalMemoryBytesLte) {

        this.totalMemoryBytesLte = totalMemoryBytesLte;
        return this;
    }

    /**
     * Get totalMemoryBytesLte
     *
     * @return totalMemoryBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesLte() {
        return totalMemoryBytesLte;
    }

    public void setTotalMemoryBytesLte(Long totalMemoryBytesLte) {
        this.totalMemoryBytesLte = totalMemoryBytesLte;
    }

    public ZoneWhereInput totalMemoryBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        return this;
    }

    public void setTotalMemoryBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        }
    }

    public boolean getTotalMemoryBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
    }

    public ZoneWhereInput totalMemoryBytesNot(Long totalMemoryBytesNot) {

        this.totalMemoryBytesNot = totalMemoryBytesNot;
        return this;
    }

    /**
     * Get totalMemoryBytesNot
     *
     * @return totalMemoryBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytesNot() {
        return totalMemoryBytesNot;
    }

    public void setTotalMemoryBytesNot(Long totalMemoryBytesNot) {
        this.totalMemoryBytesNot = totalMemoryBytesNot;
    }

    public ZoneWhereInput totalMemoryBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        return this;
    }

    public void setTotalMemoryBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        }
    }

    public boolean getTotalMemoryBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
    }

    public ZoneWhereInput totalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {

        this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
        return this;
    }

    public ZoneWhereInput addTotalMemoryBytesNotInItem(Long totalMemoryBytesNotInItem) {
        if (this.totalMemoryBytesNotIn == null) {
            this.totalMemoryBytesNotIn = new ArrayList<Long>();
        }
        this.totalMemoryBytesNotIn.add(totalMemoryBytesNotInItem);
        return this;
    }

    /**
     * Get totalMemoryBytesNotIn
     *
     * @return totalMemoryBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalMemoryBytesNotIn() {
        return totalMemoryBytesNotIn;
    }

    public void setTotalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {
        this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
    }

    public ZoneWhereInput totalMemoryBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public ZoneWhereInput totalMemoryBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public void setTotalMemoryBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        }
    }

    public boolean getTotalMemoryBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
    }

    public ZoneWhereInput usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public ZoneWhereInput usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public ZoneWhereInput usedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public void setUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        }
    }

    public boolean getUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE);
    }

    public ZoneWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {

        this.usedDataSpaceGt = usedDataSpaceGt;
        return this;
    }

    /**
     * Get usedDataSpaceGt
     *
     * @return usedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceGt() {
        return usedDataSpaceGt;
    }

    public void setUsedDataSpaceGt(Long usedDataSpaceGt) {
        this.usedDataSpaceGt = usedDataSpaceGt;
    }

    public ZoneWhereInput usedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public ZoneWhereInput usedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public void setUsedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        }
    }

    public boolean getUsedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_GT);
    }

    public ZoneWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {

        this.usedDataSpaceGte = usedDataSpaceGte;
        return this;
    }

    /**
     * Get usedDataSpaceGte
     *
     * @return usedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceGte() {
        return usedDataSpaceGte;
    }

    public void setUsedDataSpaceGte(Long usedDataSpaceGte) {
        this.usedDataSpaceGte = usedDataSpaceGte;
    }

    public ZoneWhereInput usedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public ZoneWhereInput usedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public void setUsedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        }
    }

    public boolean getUsedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
    }

    public ZoneWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {

        this.usedDataSpaceIn = usedDataSpaceIn;
        return this;
    }

    public ZoneWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
        if (this.usedDataSpaceIn == null) {
            this.usedDataSpaceIn = new ArrayList<Long>();
        }
        this.usedDataSpaceIn.add(usedDataSpaceInItem);
        return this;
    }

    /**
     * Get usedDataSpaceIn
     *
     * @return usedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedDataSpaceIn() {
        return usedDataSpaceIn;
    }

    public void setUsedDataSpaceIn(List<Long> usedDataSpaceIn) {
        this.usedDataSpaceIn = usedDataSpaceIn;
    }

    public ZoneWhereInput usedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public ZoneWhereInput usedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public void setUsedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        }
    }

    public boolean getUsedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_IN);
    }

    public ZoneWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {

        this.usedDataSpaceLt = usedDataSpaceLt;
        return this;
    }

    /**
     * Get usedDataSpaceLt
     *
     * @return usedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceLt() {
        return usedDataSpaceLt;
    }

    public void setUsedDataSpaceLt(Long usedDataSpaceLt) {
        this.usedDataSpaceLt = usedDataSpaceLt;
    }

    public ZoneWhereInput usedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public ZoneWhereInput usedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public void setUsedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        }
    }

    public boolean getUsedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_LT);
    }

    public ZoneWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {

        this.usedDataSpaceLte = usedDataSpaceLte;
        return this;
    }

    /**
     * Get usedDataSpaceLte
     *
     * @return usedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceLte() {
        return usedDataSpaceLte;
    }

    public void setUsedDataSpaceLte(Long usedDataSpaceLte) {
        this.usedDataSpaceLte = usedDataSpaceLte;
    }

    public ZoneWhereInput usedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public ZoneWhereInput usedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public void setUsedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        }
    }

    public boolean getUsedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
    }

    public ZoneWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {

        this.usedDataSpaceNot = usedDataSpaceNot;
        return this;
    }

    /**
     * Get usedDataSpaceNot
     *
     * @return usedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpaceNot() {
        return usedDataSpaceNot;
    }

    public void setUsedDataSpaceNot(Long usedDataSpaceNot) {
        this.usedDataSpaceNot = usedDataSpaceNot;
    }

    public ZoneWhereInput usedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public ZoneWhereInput usedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public void setUsedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        }
    }

    public boolean getUsedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
    }

    public ZoneWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {

        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
        return this;
    }

    public ZoneWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
        if (this.usedDataSpaceNotIn == null) {
            this.usedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.usedDataSpaceNotIn.add(usedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get usedDataSpaceNotIn
     *
     * @return usedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedDataSpaceNotIn() {
        return usedDataSpaceNotIn;
    }

    public void setUsedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
    }

    public ZoneWhereInput usedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public ZoneWhereInput usedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setUsedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getUsedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
    }

    public ZoneWhereInput validDataSpace(Long validDataSpace) {

        this.validDataSpace = validDataSpace;
        return this;
    }

    /**
     * Get validDataSpace
     *
     * @return validDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpace() {
        return validDataSpace;
    }

    public void setValidDataSpace(Long validDataSpace) {
        this.validDataSpace = validDataSpace;
    }

    public ZoneWhereInput validDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public ZoneWhereInput validDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public void setValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        }
    }

    public boolean getValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE);
    }

    public ZoneWhereInput validDataSpaceGt(Long validDataSpaceGt) {

        this.validDataSpaceGt = validDataSpaceGt;
        return this;
    }

    /**
     * Get validDataSpaceGt
     *
     * @return validDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceGt() {
        return validDataSpaceGt;
    }

    public void setValidDataSpaceGt(Long validDataSpaceGt) {
        this.validDataSpaceGt = validDataSpaceGt;
    }

    public ZoneWhereInput validDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        return this;
    }

    public ZoneWhereInput validDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        return this;
    }

    public void setValidDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
        }
    }

    public boolean getValidDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_GT);
    }

    public ZoneWhereInput validDataSpaceGte(Long validDataSpaceGte) {

        this.validDataSpaceGte = validDataSpaceGte;
        return this;
    }

    /**
     * Get validDataSpaceGte
     *
     * @return validDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceGte() {
        return validDataSpaceGte;
    }

    public void setValidDataSpaceGte(Long validDataSpaceGte) {
        this.validDataSpaceGte = validDataSpaceGte;
    }

    public ZoneWhereInput validDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        return this;
    }

    public ZoneWhereInput validDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        return this;
    }

    public void setValidDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
        }
    }

    public boolean getValidDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_GTE);
    }

    public ZoneWhereInput validDataSpaceIn(List<Long> validDataSpaceIn) {

        this.validDataSpaceIn = validDataSpaceIn;
        return this;
    }

    public ZoneWhereInput addValidDataSpaceInItem(Long validDataSpaceInItem) {
        if (this.validDataSpaceIn == null) {
            this.validDataSpaceIn = new ArrayList<Long>();
        }
        this.validDataSpaceIn.add(validDataSpaceInItem);
        return this;
    }

    /**
     * Get validDataSpaceIn
     *
     * @return validDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidDataSpaceIn() {
        return validDataSpaceIn;
    }

    public void setValidDataSpaceIn(List<Long> validDataSpaceIn) {
        this.validDataSpaceIn = validDataSpaceIn;
    }

    public ZoneWhereInput validDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        return this;
    }

    public ZoneWhereInput validDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        return this;
    }

    public void setValidDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
        }
    }

    public boolean getValidDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_IN);
    }

    public ZoneWhereInput validDataSpaceLt(Long validDataSpaceLt) {

        this.validDataSpaceLt = validDataSpaceLt;
        return this;
    }

    /**
     * Get validDataSpaceLt
     *
     * @return validDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceLt() {
        return validDataSpaceLt;
    }

    public void setValidDataSpaceLt(Long validDataSpaceLt) {
        this.validDataSpaceLt = validDataSpaceLt;
    }

    public ZoneWhereInput validDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        return this;
    }

    public ZoneWhereInput validDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        return this;
    }

    public void setValidDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
        }
    }

    public boolean getValidDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_LT);
    }

    public ZoneWhereInput validDataSpaceLte(Long validDataSpaceLte) {

        this.validDataSpaceLte = validDataSpaceLte;
        return this;
    }

    /**
     * Get validDataSpaceLte
     *
     * @return validDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceLte() {
        return validDataSpaceLte;
    }

    public void setValidDataSpaceLte(Long validDataSpaceLte) {
        this.validDataSpaceLte = validDataSpaceLte;
    }

    public ZoneWhereInput validDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        return this;
    }

    public ZoneWhereInput validDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        return this;
    }

    public void setValidDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
        }
    }

    public boolean getValidDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_LTE);
    }

    public ZoneWhereInput validDataSpaceNot(Long validDataSpaceNot) {

        this.validDataSpaceNot = validDataSpaceNot;
        return this;
    }

    /**
     * Get validDataSpaceNot
     *
     * @return validDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpaceNot() {
        return validDataSpaceNot;
    }

    public void setValidDataSpaceNot(Long validDataSpaceNot) {
        this.validDataSpaceNot = validDataSpaceNot;
    }

    public ZoneWhereInput validDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        return this;
    }

    public ZoneWhereInput validDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        return this;
    }

    public void setValidDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
        }
    }

    public boolean getValidDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_NOT);
    }

    public ZoneWhereInput validDataSpaceNotIn(List<Long> validDataSpaceNotIn) {

        this.validDataSpaceNotIn = validDataSpaceNotIn;
        return this;
    }

    public ZoneWhereInput addValidDataSpaceNotInItem(Long validDataSpaceNotInItem) {
        if (this.validDataSpaceNotIn == null) {
            this.validDataSpaceNotIn = new ArrayList<Long>();
        }
        this.validDataSpaceNotIn.add(validDataSpaceNotInItem);
        return this;
    }

    /**
     * Get validDataSpaceNotIn
     *
     * @return validDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidDataSpaceNotIn() {
        return validDataSpaceNotIn;
    }

    public void setValidDataSpaceNotIn(List<Long> validDataSpaceNotIn) {
        this.validDataSpaceNotIn = validDataSpaceNotIn;
    }

    public ZoneWhereInput validDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public ZoneWhereInput validDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setValidDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getValidDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN);
    }

    public ZoneWhereInput vmNum(Integer vmNum) {

        this.vmNum = vmNum;
        return this;
    }

    /**
     * Get vmNum
     *
     * @return vmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNum() {
        return vmNum;
    }

    public void setVmNum(Integer vmNum) {
        this.vmNum = vmNum;
    }

    public ZoneWhereInput vmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public ZoneWhereInput vmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public void setVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        }
    }

    public boolean getVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM);
    }

    public ZoneWhereInput vmNumGt(Integer vmNumGt) {

        this.vmNumGt = vmNumGt;
        return this;
    }

    /**
     * Get vmNumGt
     *
     * @return vmNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumGt() {
        return vmNumGt;
    }

    public void setVmNumGt(Integer vmNumGt) {
        this.vmNumGt = vmNumGt;
    }

    public ZoneWhereInput vmNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GT);
        return this;
    }

    public ZoneWhereInput vmNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GT);
        return this;
    }

    public void setVmNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GT);
        }
    }

    public boolean getVmNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_GT);
    }

    public ZoneWhereInput vmNumGte(Integer vmNumGte) {

        this.vmNumGte = vmNumGte;
        return this;
    }

    /**
     * Get vmNumGte
     *
     * @return vmNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumGte() {
        return vmNumGte;
    }

    public void setVmNumGte(Integer vmNumGte) {
        this.vmNumGte = vmNumGte;
    }

    public ZoneWhereInput vmNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GTE);
        return this;
    }

    public ZoneWhereInput vmNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GTE);
        return this;
    }

    public void setVmNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_GTE);
        }
    }

    public boolean getVmNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_GTE);
    }

    public ZoneWhereInput vmNumIn(List<Integer> vmNumIn) {

        this.vmNumIn = vmNumIn;
        return this;
    }

    public ZoneWhereInput addVmNumInItem(Integer vmNumInItem) {
        if (this.vmNumIn == null) {
            this.vmNumIn = new ArrayList<Integer>();
        }
        this.vmNumIn.add(vmNumInItem);
        return this;
    }

    /**
     * Get vmNumIn
     *
     * @return vmNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmNumIn() {
        return vmNumIn;
    }

    public void setVmNumIn(List<Integer> vmNumIn) {
        this.vmNumIn = vmNumIn;
    }

    public ZoneWhereInput vmNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_IN);
        return this;
    }

    public ZoneWhereInput vmNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_IN);
        return this;
    }

    public void setVmNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_IN);
        }
    }

    public boolean getVmNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_IN);
    }

    public ZoneWhereInput vmNumLt(Integer vmNumLt) {

        this.vmNumLt = vmNumLt;
        return this;
    }

    /**
     * Get vmNumLt
     *
     * @return vmNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumLt() {
        return vmNumLt;
    }

    public void setVmNumLt(Integer vmNumLt) {
        this.vmNumLt = vmNumLt;
    }

    public ZoneWhereInput vmNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LT);
        return this;
    }

    public ZoneWhereInput vmNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LT);
        return this;
    }

    public void setVmNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LT);
        }
    }

    public boolean getVmNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_LT);
    }

    public ZoneWhereInput vmNumLte(Integer vmNumLte) {

        this.vmNumLte = vmNumLte;
        return this;
    }

    /**
     * Get vmNumLte
     *
     * @return vmNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumLte() {
        return vmNumLte;
    }

    public void setVmNumLte(Integer vmNumLte) {
        this.vmNumLte = vmNumLte;
    }

    public ZoneWhereInput vmNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LTE);
        return this;
    }

    public ZoneWhereInput vmNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LTE);
        return this;
    }

    public void setVmNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_LTE);
        }
    }

    public boolean getVmNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_LTE);
    }

    public ZoneWhereInput vmNumNot(Integer vmNumNot) {

        this.vmNumNot = vmNumNot;
        return this;
    }

    /**
     * Get vmNumNot
     *
     * @return vmNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNumNot() {
        return vmNumNot;
    }

    public void setVmNumNot(Integer vmNumNot) {
        this.vmNumNot = vmNumNot;
    }

    public ZoneWhereInput vmNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT);
        return this;
    }

    public ZoneWhereInput vmNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT);
        return this;
    }

    public void setVmNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT);
        }
    }

    public boolean getVmNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_NOT);
    }

    public ZoneWhereInput vmNumNotIn(List<Integer> vmNumNotIn) {

        this.vmNumNotIn = vmNumNotIn;
        return this;
    }

    public ZoneWhereInput addVmNumNotInItem(Integer vmNumNotInItem) {
        if (this.vmNumNotIn == null) {
            this.vmNumNotIn = new ArrayList<Integer>();
        }
        this.vmNumNotIn.add(vmNumNotInItem);
        return this;
    }

    /**
     * Get vmNumNotIn
     *
     * @return vmNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVmNumNotIn() {
        return vmNumNotIn;
    }

    public void setVmNumNotIn(List<Integer> vmNumNotIn) {
        this.vmNumNotIn = vmNumNotIn;
    }

    public ZoneWhereInput vmNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT_IN);
        return this;
    }

    public ZoneWhereInput vmNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT_IN);
        return this;
    }

    public void setVmNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM_NOT_IN);
        }
    }

    public boolean getVmNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ZoneWhereInput zoneWhereInput = (ZoneWhereInput) o;
        return Objects.equals(this.AND, zoneWhereInput.AND)
                && Objects.equals(this.NOT, zoneWhereInput.NOT)
                && Objects.equals(this.OR, zoneWhereInput.OR)
                && Objects.equals(this.cluster, zoneWhereInput.cluster)
                && Objects.equals(this.datacenter, zoneWhereInput.datacenter)
                && Objects.equals(this.failureDataSpace, zoneWhereInput.failureDataSpace)
                && Objects.equals(this.failureDataSpaceGt, zoneWhereInput.failureDataSpaceGt)
                && Objects.equals(this.failureDataSpaceGte, zoneWhereInput.failureDataSpaceGte)
                && Objects.equals(this.failureDataSpaceIn, zoneWhereInput.failureDataSpaceIn)
                && Objects.equals(this.failureDataSpaceLt, zoneWhereInput.failureDataSpaceLt)
                && Objects.equals(this.failureDataSpaceLte, zoneWhereInput.failureDataSpaceLte)
                && Objects.equals(this.failureDataSpaceNot, zoneWhereInput.failureDataSpaceNot)
                && Objects.equals(this.failureDataSpaceNotIn, zoneWhereInput.failureDataSpaceNotIn)
                && Objects.equals(this.hostNum, zoneWhereInput.hostNum)
                && Objects.equals(this.hostNumGt, zoneWhereInput.hostNumGt)
                && Objects.equals(this.hostNumGte, zoneWhereInput.hostNumGte)
                && Objects.equals(this.hostNumIn, zoneWhereInput.hostNumIn)
                && Objects.equals(this.hostNumLt, zoneWhereInput.hostNumLt)
                && Objects.equals(this.hostNumLte, zoneWhereInput.hostNumLte)
                && Objects.equals(this.hostNumNot, zoneWhereInput.hostNumNot)
                && Objects.equals(this.hostNumNotIn, zoneWhereInput.hostNumNotIn)
                && Objects.equals(this.hostsEvery, zoneWhereInput.hostsEvery)
                && Objects.equals(this.hostsNone, zoneWhereInput.hostsNone)
                && Objects.equals(this.hostsSome, zoneWhereInput.hostsSome)
                && Objects.equals(this.id, zoneWhereInput.id)
                && Objects.equals(this.idContains, zoneWhereInput.idContains)
                && Objects.equals(this.idEndsWith, zoneWhereInput.idEndsWith)
                && Objects.equals(this.idGt, zoneWhereInput.idGt)
                && Objects.equals(this.idGte, zoneWhereInput.idGte)
                && Objects.equals(this.idIn, zoneWhereInput.idIn)
                && Objects.equals(this.idLt, zoneWhereInput.idLt)
                && Objects.equals(this.idLte, zoneWhereInput.idLte)
                && Objects.equals(this.idNot, zoneWhereInput.idNot)
                && Objects.equals(this.idNotContains, zoneWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, zoneWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, zoneWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, zoneWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, zoneWhereInput.idStartsWith)
                && Objects.equals(this.isPreferred, zoneWhereInput.isPreferred)
                && Objects.equals(this.isPreferredNot, zoneWhereInput.isPreferredNot)
                && Objects.equals(this.localId, zoneWhereInput.localId)
                && Objects.equals(this.localIdContains, zoneWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, zoneWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, zoneWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, zoneWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, zoneWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, zoneWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, zoneWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, zoneWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, zoneWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, zoneWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, zoneWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, zoneWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, zoneWhereInput.localIdStartsWith)
                && Objects.equals(this.provisionedCpuCores, zoneWhereInput.provisionedCpuCores)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVm,
                        zoneWhereInput.provisionedCpuCoresForActiveVm)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmGt,
                        zoneWhereInput.provisionedCpuCoresForActiveVmGt)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmGte,
                        zoneWhereInput.provisionedCpuCoresForActiveVmGte)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmIn,
                        zoneWhereInput.provisionedCpuCoresForActiveVmIn)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmLt,
                        zoneWhereInput.provisionedCpuCoresForActiveVmLt)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmLte,
                        zoneWhereInput.provisionedCpuCoresForActiveVmLte)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmNot,
                        zoneWhereInput.provisionedCpuCoresForActiveVmNot)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVmNotIn,
                        zoneWhereInput.provisionedCpuCoresForActiveVmNotIn)
                && Objects.equals(this.provisionedCpuCoresGt, zoneWhereInput.provisionedCpuCoresGt)
                && Objects.equals(
                        this.provisionedCpuCoresGte, zoneWhereInput.provisionedCpuCoresGte)
                && Objects.equals(this.provisionedCpuCoresIn, zoneWhereInput.provisionedCpuCoresIn)
                && Objects.equals(this.provisionedCpuCoresLt, zoneWhereInput.provisionedCpuCoresLt)
                && Objects.equals(
                        this.provisionedCpuCoresLte, zoneWhereInput.provisionedCpuCoresLte)
                && Objects.equals(
                        this.provisionedCpuCoresNot, zoneWhereInput.provisionedCpuCoresNot)
                && Objects.equals(
                        this.provisionedCpuCoresNotIn, zoneWhereInput.provisionedCpuCoresNotIn)
                && Objects.equals(this.provisionedDataSpace, zoneWhereInput.provisionedDataSpace)
                && Objects.equals(
                        this.provisionedDataSpaceGt, zoneWhereInput.provisionedDataSpaceGt)
                && Objects.equals(
                        this.provisionedDataSpaceGte, zoneWhereInput.provisionedDataSpaceGte)
                && Objects.equals(
                        this.provisionedDataSpaceIn, zoneWhereInput.provisionedDataSpaceIn)
                && Objects.equals(
                        this.provisionedDataSpaceLt, zoneWhereInput.provisionedDataSpaceLt)
                && Objects.equals(
                        this.provisionedDataSpaceLte, zoneWhereInput.provisionedDataSpaceLte)
                && Objects.equals(
                        this.provisionedDataSpaceNot, zoneWhereInput.provisionedDataSpaceNot)
                && Objects.equals(
                        this.provisionedDataSpaceNotIn, zoneWhereInput.provisionedDataSpaceNotIn)
                && Objects.equals(
                        this.provisionedMemoryBytes, zoneWhereInput.provisionedMemoryBytes)
                && Objects.equals(
                        this.provisionedMemoryBytesGt, zoneWhereInput.provisionedMemoryBytesGt)
                && Objects.equals(
                        this.provisionedMemoryBytesGte, zoneWhereInput.provisionedMemoryBytesGte)
                && Objects.equals(
                        this.provisionedMemoryBytesIn, zoneWhereInput.provisionedMemoryBytesIn)
                && Objects.equals(
                        this.provisionedMemoryBytesLt, zoneWhereInput.provisionedMemoryBytesLt)
                && Objects.equals(
                        this.provisionedMemoryBytesLte, zoneWhereInput.provisionedMemoryBytesLte)
                && Objects.equals(
                        this.provisionedMemoryBytesNot, zoneWhereInput.provisionedMemoryBytesNot)
                && Objects.equals(
                        this.provisionedMemoryBytesNotIn,
                        zoneWhereInput.provisionedMemoryBytesNotIn)
                && Objects.equals(this.runningVmNum, zoneWhereInput.runningVmNum)
                && Objects.equals(this.runningVmNumGt, zoneWhereInput.runningVmNumGt)
                && Objects.equals(this.runningVmNumGte, zoneWhereInput.runningVmNumGte)
                && Objects.equals(this.runningVmNumIn, zoneWhereInput.runningVmNumIn)
                && Objects.equals(this.runningVmNumLt, zoneWhereInput.runningVmNumLt)
                && Objects.equals(this.runningVmNumLte, zoneWhereInput.runningVmNumLte)
                && Objects.equals(this.runningVmNumNot, zoneWhereInput.runningVmNumNot)
                && Objects.equals(this.runningVmNumNotIn, zoneWhereInput.runningVmNumNotIn)
                && Objects.equals(this.stoppedVmNum, zoneWhereInput.stoppedVmNum)
                && Objects.equals(this.stoppedVmNumGt, zoneWhereInput.stoppedVmNumGt)
                && Objects.equals(this.stoppedVmNumGte, zoneWhereInput.stoppedVmNumGte)
                && Objects.equals(this.stoppedVmNumIn, zoneWhereInput.stoppedVmNumIn)
                && Objects.equals(this.stoppedVmNumLt, zoneWhereInput.stoppedVmNumLt)
                && Objects.equals(this.stoppedVmNumLte, zoneWhereInput.stoppedVmNumLte)
                && Objects.equals(this.stoppedVmNumNot, zoneWhereInput.stoppedVmNumNot)
                && Objects.equals(this.stoppedVmNumNotIn, zoneWhereInput.stoppedVmNumNotIn)
                && Objects.equals(this.suspendedVmNum, zoneWhereInput.suspendedVmNum)
                && Objects.equals(this.suspendedVmNumGt, zoneWhereInput.suspendedVmNumGt)
                && Objects.equals(this.suspendedVmNumGte, zoneWhereInput.suspendedVmNumGte)
                && Objects.equals(this.suspendedVmNumIn, zoneWhereInput.suspendedVmNumIn)
                && Objects.equals(this.suspendedVmNumLt, zoneWhereInput.suspendedVmNumLt)
                && Objects.equals(this.suspendedVmNumLte, zoneWhereInput.suspendedVmNumLte)
                && Objects.equals(this.suspendedVmNumNot, zoneWhereInput.suspendedVmNumNot)
                && Objects.equals(this.suspendedVmNumNotIn, zoneWhereInput.suspendedVmNumNotIn)
                && Objects.equals(this.totalCacheCapacity, zoneWhereInput.totalCacheCapacity)
                && Objects.equals(this.totalCacheCapacityGt, zoneWhereInput.totalCacheCapacityGt)
                && Objects.equals(this.totalCacheCapacityGte, zoneWhereInput.totalCacheCapacityGte)
                && Objects.equals(this.totalCacheCapacityIn, zoneWhereInput.totalCacheCapacityIn)
                && Objects.equals(this.totalCacheCapacityLt, zoneWhereInput.totalCacheCapacityLt)
                && Objects.equals(this.totalCacheCapacityLte, zoneWhereInput.totalCacheCapacityLte)
                && Objects.equals(this.totalCacheCapacityNot, zoneWhereInput.totalCacheCapacityNot)
                && Objects.equals(
                        this.totalCacheCapacityNotIn, zoneWhereInput.totalCacheCapacityNotIn)
                && Objects.equals(this.totalCpuCores, zoneWhereInput.totalCpuCores)
                && Objects.equals(this.totalCpuCoresGt, zoneWhereInput.totalCpuCoresGt)
                && Objects.equals(this.totalCpuCoresGte, zoneWhereInput.totalCpuCoresGte)
                && Objects.equals(this.totalCpuCoresIn, zoneWhereInput.totalCpuCoresIn)
                && Objects.equals(this.totalCpuCoresLt, zoneWhereInput.totalCpuCoresLt)
                && Objects.equals(this.totalCpuCoresLte, zoneWhereInput.totalCpuCoresLte)
                && Objects.equals(this.totalCpuCoresNot, zoneWhereInput.totalCpuCoresNot)
                && Objects.equals(this.totalCpuCoresNotIn, zoneWhereInput.totalCpuCoresNotIn)
                && Objects.equals(this.totalCpuHz, zoneWhereInput.totalCpuHz)
                && Objects.equals(this.totalCpuHzGt, zoneWhereInput.totalCpuHzGt)
                && Objects.equals(this.totalCpuHzGte, zoneWhereInput.totalCpuHzGte)
                && Objects.equals(this.totalCpuHzIn, zoneWhereInput.totalCpuHzIn)
                && Objects.equals(this.totalCpuHzLt, zoneWhereInput.totalCpuHzLt)
                && Objects.equals(this.totalCpuHzLte, zoneWhereInput.totalCpuHzLte)
                && Objects.equals(this.totalCpuHzNot, zoneWhereInput.totalCpuHzNot)
                && Objects.equals(this.totalCpuHzNotIn, zoneWhereInput.totalCpuHzNotIn)
                && Objects.equals(this.totalDataCapacity, zoneWhereInput.totalDataCapacity)
                && Objects.equals(this.totalDataCapacityGt, zoneWhereInput.totalDataCapacityGt)
                && Objects.equals(this.totalDataCapacityGte, zoneWhereInput.totalDataCapacityGte)
                && Objects.equals(this.totalDataCapacityIn, zoneWhereInput.totalDataCapacityIn)
                && Objects.equals(this.totalDataCapacityLt, zoneWhereInput.totalDataCapacityLt)
                && Objects.equals(this.totalDataCapacityLte, zoneWhereInput.totalDataCapacityLte)
                && Objects.equals(this.totalDataCapacityNot, zoneWhereInput.totalDataCapacityNot)
                && Objects.equals(
                        this.totalDataCapacityNotIn, zoneWhereInput.totalDataCapacityNotIn)
                && Objects.equals(this.totalMemoryBytes, zoneWhereInput.totalMemoryBytes)
                && Objects.equals(this.totalMemoryBytesGt, zoneWhereInput.totalMemoryBytesGt)
                && Objects.equals(this.totalMemoryBytesGte, zoneWhereInput.totalMemoryBytesGte)
                && Objects.equals(this.totalMemoryBytesIn, zoneWhereInput.totalMemoryBytesIn)
                && Objects.equals(this.totalMemoryBytesLt, zoneWhereInput.totalMemoryBytesLt)
                && Objects.equals(this.totalMemoryBytesLte, zoneWhereInput.totalMemoryBytesLte)
                && Objects.equals(this.totalMemoryBytesNot, zoneWhereInput.totalMemoryBytesNot)
                && Objects.equals(this.totalMemoryBytesNotIn, zoneWhereInput.totalMemoryBytesNotIn)
                && Objects.equals(this.usedDataSpace, zoneWhereInput.usedDataSpace)
                && Objects.equals(this.usedDataSpaceGt, zoneWhereInput.usedDataSpaceGt)
                && Objects.equals(this.usedDataSpaceGte, zoneWhereInput.usedDataSpaceGte)
                && Objects.equals(this.usedDataSpaceIn, zoneWhereInput.usedDataSpaceIn)
                && Objects.equals(this.usedDataSpaceLt, zoneWhereInput.usedDataSpaceLt)
                && Objects.equals(this.usedDataSpaceLte, zoneWhereInput.usedDataSpaceLte)
                && Objects.equals(this.usedDataSpaceNot, zoneWhereInput.usedDataSpaceNot)
                && Objects.equals(this.usedDataSpaceNotIn, zoneWhereInput.usedDataSpaceNotIn)
                && Objects.equals(this.validDataSpace, zoneWhereInput.validDataSpace)
                && Objects.equals(this.validDataSpaceGt, zoneWhereInput.validDataSpaceGt)
                && Objects.equals(this.validDataSpaceGte, zoneWhereInput.validDataSpaceGte)
                && Objects.equals(this.validDataSpaceIn, zoneWhereInput.validDataSpaceIn)
                && Objects.equals(this.validDataSpaceLt, zoneWhereInput.validDataSpaceLt)
                && Objects.equals(this.validDataSpaceLte, zoneWhereInput.validDataSpaceLte)
                && Objects.equals(this.validDataSpaceNot, zoneWhereInput.validDataSpaceNot)
                && Objects.equals(this.validDataSpaceNotIn, zoneWhereInput.validDataSpaceNotIn)
                && Objects.equals(this.vmNum, zoneWhereInput.vmNum)
                && Objects.equals(this.vmNumGt, zoneWhereInput.vmNumGt)
                && Objects.equals(this.vmNumGte, zoneWhereInput.vmNumGte)
                && Objects.equals(this.vmNumIn, zoneWhereInput.vmNumIn)
                && Objects.equals(this.vmNumLt, zoneWhereInput.vmNumLt)
                && Objects.equals(this.vmNumLte, zoneWhereInput.vmNumLte)
                && Objects.equals(this.vmNumNot, zoneWhereInput.vmNumNot)
                && Objects.equals(this.vmNumNotIn, zoneWhereInput.vmNumNotIn);
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
                datacenter,
                failureDataSpace,
                failureDataSpaceGt,
                failureDataSpaceGte,
                failureDataSpaceIn,
                failureDataSpaceLt,
                failureDataSpaceLte,
                failureDataSpaceNot,
                failureDataSpaceNotIn,
                hostNum,
                hostNumGt,
                hostNumGte,
                hostNumIn,
                hostNumLt,
                hostNumLte,
                hostNumNot,
                hostNumNotIn,
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
                isPreferred,
                isPreferredNot,
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
                provisionedCpuCores,
                provisionedCpuCoresForActiveVm,
                provisionedCpuCoresForActiveVmGt,
                provisionedCpuCoresForActiveVmGte,
                provisionedCpuCoresForActiveVmIn,
                provisionedCpuCoresForActiveVmLt,
                provisionedCpuCoresForActiveVmLte,
                provisionedCpuCoresForActiveVmNot,
                provisionedCpuCoresForActiveVmNotIn,
                provisionedCpuCoresGt,
                provisionedCpuCoresGte,
                provisionedCpuCoresIn,
                provisionedCpuCoresLt,
                provisionedCpuCoresLte,
                provisionedCpuCoresNot,
                provisionedCpuCoresNotIn,
                provisionedDataSpace,
                provisionedDataSpaceGt,
                provisionedDataSpaceGte,
                provisionedDataSpaceIn,
                provisionedDataSpaceLt,
                provisionedDataSpaceLte,
                provisionedDataSpaceNot,
                provisionedDataSpaceNotIn,
                provisionedMemoryBytes,
                provisionedMemoryBytesGt,
                provisionedMemoryBytesGte,
                provisionedMemoryBytesIn,
                provisionedMemoryBytesLt,
                provisionedMemoryBytesLte,
                provisionedMemoryBytesNot,
                provisionedMemoryBytesNotIn,
                runningVmNum,
                runningVmNumGt,
                runningVmNumGte,
                runningVmNumIn,
                runningVmNumLt,
                runningVmNumLte,
                runningVmNumNot,
                runningVmNumNotIn,
                stoppedVmNum,
                stoppedVmNumGt,
                stoppedVmNumGte,
                stoppedVmNumIn,
                stoppedVmNumLt,
                stoppedVmNumLte,
                stoppedVmNumNot,
                stoppedVmNumNotIn,
                suspendedVmNum,
                suspendedVmNumGt,
                suspendedVmNumGte,
                suspendedVmNumIn,
                suspendedVmNumLt,
                suspendedVmNumLte,
                suspendedVmNumNot,
                suspendedVmNumNotIn,
                totalCacheCapacity,
                totalCacheCapacityGt,
                totalCacheCapacityGte,
                totalCacheCapacityIn,
                totalCacheCapacityLt,
                totalCacheCapacityLte,
                totalCacheCapacityNot,
                totalCacheCapacityNotIn,
                totalCpuCores,
                totalCpuCoresGt,
                totalCpuCoresGte,
                totalCpuCoresIn,
                totalCpuCoresLt,
                totalCpuCoresLte,
                totalCpuCoresNot,
                totalCpuCoresNotIn,
                totalCpuHz,
                totalCpuHzGt,
                totalCpuHzGte,
                totalCpuHzIn,
                totalCpuHzLt,
                totalCpuHzLte,
                totalCpuHzNot,
                totalCpuHzNotIn,
                totalDataCapacity,
                totalDataCapacityGt,
                totalDataCapacityGte,
                totalDataCapacityIn,
                totalDataCapacityLt,
                totalDataCapacityLte,
                totalDataCapacityNot,
                totalDataCapacityNotIn,
                totalMemoryBytes,
                totalMemoryBytesGt,
                totalMemoryBytesGte,
                totalMemoryBytesIn,
                totalMemoryBytesLt,
                totalMemoryBytesLte,
                totalMemoryBytesNot,
                totalMemoryBytesNotIn,
                usedDataSpace,
                usedDataSpaceGt,
                usedDataSpaceGte,
                usedDataSpaceIn,
                usedDataSpaceLt,
                usedDataSpaceLte,
                usedDataSpaceNot,
                usedDataSpaceNotIn,
                validDataSpace,
                validDataSpaceGt,
                validDataSpaceGte,
                validDataSpaceIn,
                validDataSpaceLt,
                validDataSpaceLte,
                validDataSpaceNot,
                validDataSpaceNotIn,
                vmNum,
                vmNumGt,
                vmNumGte,
                vmNumIn,
                vmNumLt,
                vmNumLte,
                vmNumNot,
                vmNumNotIn);
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
        sb.append("class ZoneWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
        sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
        sb.append("    failureDataSpaceGt: ")
                .append(toIndentedString(failureDataSpaceGt))
                .append("\n");
        sb.append("    failureDataSpaceGte: ")
                .append(toIndentedString(failureDataSpaceGte))
                .append("\n");
        sb.append("    failureDataSpaceIn: ")
                .append(toIndentedString(failureDataSpaceIn))
                .append("\n");
        sb.append("    failureDataSpaceLt: ")
                .append(toIndentedString(failureDataSpaceLt))
                .append("\n");
        sb.append("    failureDataSpaceLte: ")
                .append(toIndentedString(failureDataSpaceLte))
                .append("\n");
        sb.append("    failureDataSpaceNot: ")
                .append(toIndentedString(failureDataSpaceNot))
                .append("\n");
        sb.append("    failureDataSpaceNotIn: ")
                .append(toIndentedString(failureDataSpaceNotIn))
                .append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    hostNumGt: ").append(toIndentedString(hostNumGt)).append("\n");
        sb.append("    hostNumGte: ").append(toIndentedString(hostNumGte)).append("\n");
        sb.append("    hostNumIn: ").append(toIndentedString(hostNumIn)).append("\n");
        sb.append("    hostNumLt: ").append(toIndentedString(hostNumLt)).append("\n");
        sb.append("    hostNumLte: ").append(toIndentedString(hostNumLte)).append("\n");
        sb.append("    hostNumNot: ").append(toIndentedString(hostNumNot)).append("\n");
        sb.append("    hostNumNotIn: ").append(toIndentedString(hostNumNotIn)).append("\n");
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
        sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
        sb.append("    isPreferredNot: ").append(toIndentedString(isPreferredNot)).append("\n");
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
        sb.append("    provisionedCpuCores: ")
                .append(toIndentedString(provisionedCpuCores))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVm: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVm))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmGt: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmGt))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmGte: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmGte))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmIn: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmIn))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmLt: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmLt))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmLte: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmLte))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmNot: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmNot))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVmNotIn: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVmNotIn))
                .append("\n");
        sb.append("    provisionedCpuCoresGt: ")
                .append(toIndentedString(provisionedCpuCoresGt))
                .append("\n");
        sb.append("    provisionedCpuCoresGte: ")
                .append(toIndentedString(provisionedCpuCoresGte))
                .append("\n");
        sb.append("    provisionedCpuCoresIn: ")
                .append(toIndentedString(provisionedCpuCoresIn))
                .append("\n");
        sb.append("    provisionedCpuCoresLt: ")
                .append(toIndentedString(provisionedCpuCoresLt))
                .append("\n");
        sb.append("    provisionedCpuCoresLte: ")
                .append(toIndentedString(provisionedCpuCoresLte))
                .append("\n");
        sb.append("    provisionedCpuCoresNot: ")
                .append(toIndentedString(provisionedCpuCoresNot))
                .append("\n");
        sb.append("    provisionedCpuCoresNotIn: ")
                .append(toIndentedString(provisionedCpuCoresNotIn))
                .append("\n");
        sb.append("    provisionedDataSpace: ")
                .append(toIndentedString(provisionedDataSpace))
                .append("\n");
        sb.append("    provisionedDataSpaceGt: ")
                .append(toIndentedString(provisionedDataSpaceGt))
                .append("\n");
        sb.append("    provisionedDataSpaceGte: ")
                .append(toIndentedString(provisionedDataSpaceGte))
                .append("\n");
        sb.append("    provisionedDataSpaceIn: ")
                .append(toIndentedString(provisionedDataSpaceIn))
                .append("\n");
        sb.append("    provisionedDataSpaceLt: ")
                .append(toIndentedString(provisionedDataSpaceLt))
                .append("\n");
        sb.append("    provisionedDataSpaceLte: ")
                .append(toIndentedString(provisionedDataSpaceLte))
                .append("\n");
        sb.append("    provisionedDataSpaceNot: ")
                .append(toIndentedString(provisionedDataSpaceNot))
                .append("\n");
        sb.append("    provisionedDataSpaceNotIn: ")
                .append(toIndentedString(provisionedDataSpaceNotIn))
                .append("\n");
        sb.append("    provisionedMemoryBytes: ")
                .append(toIndentedString(provisionedMemoryBytes))
                .append("\n");
        sb.append("    provisionedMemoryBytesGt: ")
                .append(toIndentedString(provisionedMemoryBytesGt))
                .append("\n");
        sb.append("    provisionedMemoryBytesGte: ")
                .append(toIndentedString(provisionedMemoryBytesGte))
                .append("\n");
        sb.append("    provisionedMemoryBytesIn: ")
                .append(toIndentedString(provisionedMemoryBytesIn))
                .append("\n");
        sb.append("    provisionedMemoryBytesLt: ")
                .append(toIndentedString(provisionedMemoryBytesLt))
                .append("\n");
        sb.append("    provisionedMemoryBytesLte: ")
                .append(toIndentedString(provisionedMemoryBytesLte))
                .append("\n");
        sb.append("    provisionedMemoryBytesNot: ")
                .append(toIndentedString(provisionedMemoryBytesNot))
                .append("\n");
        sb.append("    provisionedMemoryBytesNotIn: ")
                .append(toIndentedString(provisionedMemoryBytesNotIn))
                .append("\n");
        sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
        sb.append("    runningVmNumGt: ").append(toIndentedString(runningVmNumGt)).append("\n");
        sb.append("    runningVmNumGte: ").append(toIndentedString(runningVmNumGte)).append("\n");
        sb.append("    runningVmNumIn: ").append(toIndentedString(runningVmNumIn)).append("\n");
        sb.append("    runningVmNumLt: ").append(toIndentedString(runningVmNumLt)).append("\n");
        sb.append("    runningVmNumLte: ").append(toIndentedString(runningVmNumLte)).append("\n");
        sb.append("    runningVmNumNot: ").append(toIndentedString(runningVmNumNot)).append("\n");
        sb.append("    runningVmNumNotIn: ")
                .append(toIndentedString(runningVmNumNotIn))
                .append("\n");
        sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
        sb.append("    stoppedVmNumGt: ").append(toIndentedString(stoppedVmNumGt)).append("\n");
        sb.append("    stoppedVmNumGte: ").append(toIndentedString(stoppedVmNumGte)).append("\n");
        sb.append("    stoppedVmNumIn: ").append(toIndentedString(stoppedVmNumIn)).append("\n");
        sb.append("    stoppedVmNumLt: ").append(toIndentedString(stoppedVmNumLt)).append("\n");
        sb.append("    stoppedVmNumLte: ").append(toIndentedString(stoppedVmNumLte)).append("\n");
        sb.append("    stoppedVmNumNot: ").append(toIndentedString(stoppedVmNumNot)).append("\n");
        sb.append("    stoppedVmNumNotIn: ")
                .append(toIndentedString(stoppedVmNumNotIn))
                .append("\n");
        sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
        sb.append("    suspendedVmNumGt: ").append(toIndentedString(suspendedVmNumGt)).append("\n");
        sb.append("    suspendedVmNumGte: ")
                .append(toIndentedString(suspendedVmNumGte))
                .append("\n");
        sb.append("    suspendedVmNumIn: ").append(toIndentedString(suspendedVmNumIn)).append("\n");
        sb.append("    suspendedVmNumLt: ").append(toIndentedString(suspendedVmNumLt)).append("\n");
        sb.append("    suspendedVmNumLte: ")
                .append(toIndentedString(suspendedVmNumLte))
                .append("\n");
        sb.append("    suspendedVmNumNot: ")
                .append(toIndentedString(suspendedVmNumNot))
                .append("\n");
        sb.append("    suspendedVmNumNotIn: ")
                .append(toIndentedString(suspendedVmNumNotIn))
                .append("\n");
        sb.append("    totalCacheCapacity: ")
                .append(toIndentedString(totalCacheCapacity))
                .append("\n");
        sb.append("    totalCacheCapacityGt: ")
                .append(toIndentedString(totalCacheCapacityGt))
                .append("\n");
        sb.append("    totalCacheCapacityGte: ")
                .append(toIndentedString(totalCacheCapacityGte))
                .append("\n");
        sb.append("    totalCacheCapacityIn: ")
                .append(toIndentedString(totalCacheCapacityIn))
                .append("\n");
        sb.append("    totalCacheCapacityLt: ")
                .append(toIndentedString(totalCacheCapacityLt))
                .append("\n");
        sb.append("    totalCacheCapacityLte: ")
                .append(toIndentedString(totalCacheCapacityLte))
                .append("\n");
        sb.append("    totalCacheCapacityNot: ")
                .append(toIndentedString(totalCacheCapacityNot))
                .append("\n");
        sb.append("    totalCacheCapacityNotIn: ")
                .append(toIndentedString(totalCacheCapacityNotIn))
                .append("\n");
        sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
        sb.append("    totalCpuCoresGt: ").append(toIndentedString(totalCpuCoresGt)).append("\n");
        sb.append("    totalCpuCoresGte: ").append(toIndentedString(totalCpuCoresGte)).append("\n");
        sb.append("    totalCpuCoresIn: ").append(toIndentedString(totalCpuCoresIn)).append("\n");
        sb.append("    totalCpuCoresLt: ").append(toIndentedString(totalCpuCoresLt)).append("\n");
        sb.append("    totalCpuCoresLte: ").append(toIndentedString(totalCpuCoresLte)).append("\n");
        sb.append("    totalCpuCoresNot: ").append(toIndentedString(totalCpuCoresNot)).append("\n");
        sb.append("    totalCpuCoresNotIn: ")
                .append(toIndentedString(totalCpuCoresNotIn))
                .append("\n");
        sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
        sb.append("    totalCpuHzGt: ").append(toIndentedString(totalCpuHzGt)).append("\n");
        sb.append("    totalCpuHzGte: ").append(toIndentedString(totalCpuHzGte)).append("\n");
        sb.append("    totalCpuHzIn: ").append(toIndentedString(totalCpuHzIn)).append("\n");
        sb.append("    totalCpuHzLt: ").append(toIndentedString(totalCpuHzLt)).append("\n");
        sb.append("    totalCpuHzLte: ").append(toIndentedString(totalCpuHzLte)).append("\n");
        sb.append("    totalCpuHzNot: ").append(toIndentedString(totalCpuHzNot)).append("\n");
        sb.append("    totalCpuHzNotIn: ").append(toIndentedString(totalCpuHzNotIn)).append("\n");
        sb.append("    totalDataCapacity: ")
                .append(toIndentedString(totalDataCapacity))
                .append("\n");
        sb.append("    totalDataCapacityGt: ")
                .append(toIndentedString(totalDataCapacityGt))
                .append("\n");
        sb.append("    totalDataCapacityGte: ")
                .append(toIndentedString(totalDataCapacityGte))
                .append("\n");
        sb.append("    totalDataCapacityIn: ")
                .append(toIndentedString(totalDataCapacityIn))
                .append("\n");
        sb.append("    totalDataCapacityLt: ")
                .append(toIndentedString(totalDataCapacityLt))
                .append("\n");
        sb.append("    totalDataCapacityLte: ")
                .append(toIndentedString(totalDataCapacityLte))
                .append("\n");
        sb.append("    totalDataCapacityNot: ")
                .append(toIndentedString(totalDataCapacityNot))
                .append("\n");
        sb.append("    totalDataCapacityNotIn: ")
                .append(toIndentedString(totalDataCapacityNotIn))
                .append("\n");
        sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
        sb.append("    totalMemoryBytesGt: ")
                .append(toIndentedString(totalMemoryBytesGt))
                .append("\n");
        sb.append("    totalMemoryBytesGte: ")
                .append(toIndentedString(totalMemoryBytesGte))
                .append("\n");
        sb.append("    totalMemoryBytesIn: ")
                .append(toIndentedString(totalMemoryBytesIn))
                .append("\n");
        sb.append("    totalMemoryBytesLt: ")
                .append(toIndentedString(totalMemoryBytesLt))
                .append("\n");
        sb.append("    totalMemoryBytesLte: ")
                .append(toIndentedString(totalMemoryBytesLte))
                .append("\n");
        sb.append("    totalMemoryBytesNot: ")
                .append(toIndentedString(totalMemoryBytesNot))
                .append("\n");
        sb.append("    totalMemoryBytesNotIn: ")
                .append(toIndentedString(totalMemoryBytesNotIn))
                .append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    usedDataSpaceGt: ").append(toIndentedString(usedDataSpaceGt)).append("\n");
        sb.append("    usedDataSpaceGte: ").append(toIndentedString(usedDataSpaceGte)).append("\n");
        sb.append("    usedDataSpaceIn: ").append(toIndentedString(usedDataSpaceIn)).append("\n");
        sb.append("    usedDataSpaceLt: ").append(toIndentedString(usedDataSpaceLt)).append("\n");
        sb.append("    usedDataSpaceLte: ").append(toIndentedString(usedDataSpaceLte)).append("\n");
        sb.append("    usedDataSpaceNot: ").append(toIndentedString(usedDataSpaceNot)).append("\n");
        sb.append("    usedDataSpaceNotIn: ")
                .append(toIndentedString(usedDataSpaceNotIn))
                .append("\n");
        sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
        sb.append("    validDataSpaceGt: ").append(toIndentedString(validDataSpaceGt)).append("\n");
        sb.append("    validDataSpaceGte: ")
                .append(toIndentedString(validDataSpaceGte))
                .append("\n");
        sb.append("    validDataSpaceIn: ").append(toIndentedString(validDataSpaceIn)).append("\n");
        sb.append("    validDataSpaceLt: ").append(toIndentedString(validDataSpaceLt)).append("\n");
        sb.append("    validDataSpaceLte: ")
                .append(toIndentedString(validDataSpaceLte))
                .append("\n");
        sb.append("    validDataSpaceNot: ")
                .append(toIndentedString(validDataSpaceNot))
                .append("\n");
        sb.append("    validDataSpaceNotIn: ")
                .append(toIndentedString(validDataSpaceNotIn))
                .append("\n");
        sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
        sb.append("    vmNumGt: ").append(toIndentedString(vmNumGt)).append("\n");
        sb.append("    vmNumGte: ").append(toIndentedString(vmNumGte)).append("\n");
        sb.append("    vmNumIn: ").append(toIndentedString(vmNumIn)).append("\n");
        sb.append("    vmNumLt: ").append(toIndentedString(vmNumLt)).append("\n");
        sb.append("    vmNumLte: ").append(toIndentedString(vmNumLte)).append("\n");
        sb.append("    vmNumNot: ").append(toIndentedString(vmNumNot)).append("\n");
        sb.append("    vmNumNotIn: ").append(toIndentedString(vmNumNotIn)).append("\n");
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

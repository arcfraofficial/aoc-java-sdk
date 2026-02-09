package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DiskPoolWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskPoolWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<DiskPoolWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<DiskPoolWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<DiskPoolWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CHUNK_ID = "chunk_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID)
    private Integer chunkId;

    public static final String SERIALIZED_NAME_CHUNK_ID_GT = "chunk_id_gt";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_GT)
    private Integer chunkIdGt;

    public static final String SERIALIZED_NAME_CHUNK_ID_GTE = "chunk_id_gte";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_GTE)
    private Integer chunkIdGte;

    public static final String SERIALIZED_NAME_CHUNK_ID_IN = "chunk_id_in";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_IN)
    private List<Integer> chunkIdIn = null;

    public static final String SERIALIZED_NAME_CHUNK_ID_LT = "chunk_id_lt";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_LT)
    private Integer chunkIdLt;

    public static final String SERIALIZED_NAME_CHUNK_ID_LTE = "chunk_id_lte";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_LTE)
    private Integer chunkIdLte;

    public static final String SERIALIZED_NAME_CHUNK_ID_NOT = "chunk_id_not";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT)
    private Integer chunkIdNot;

    public static final String SERIALIZED_NAME_CHUNK_ID_NOT_IN = "chunk_id_not_in";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT_IN)
    private List<Integer> chunkIdNotIn = null;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID = "chunk_ins_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID)
    private Integer chunkInsId;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_GT = "chunk_ins_id_gt";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_GT)
    private Integer chunkInsIdGt;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_GTE = "chunk_ins_id_gte";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_GTE)
    private Integer chunkInsIdGte;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_IN = "chunk_ins_id_in";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_IN)
    private List<Integer> chunkInsIdIn = null;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_LT = "chunk_ins_id_lt";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_LT)
    private Integer chunkInsIdLt;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_LTE = "chunk_ins_id_lte";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_LTE)
    private Integer chunkInsIdLte;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_NOT = "chunk_ins_id_not";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_NOT)
    private Integer chunkInsIdNot;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN = "chunk_ins_id_not_in";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN)
    private List<Integer> chunkInsIdNotIn = null;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE = "data_space_usage";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE)
    private Double dataSpaceUsage;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_GT = "data_space_usage_gt";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_GT)
    private Double dataSpaceUsageGt;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_GTE = "data_space_usage_gte";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_GTE)
    private Double dataSpaceUsageGte;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_IN = "data_space_usage_in";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_IN)
    private List<Double> dataSpaceUsageIn = null;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_LT = "data_space_usage_lt";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_LT)
    private Double dataSpaceUsageLt;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_LTE = "data_space_usage_lte";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_LTE)
    private Double dataSpaceUsageLte;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_NOT = "data_space_usage_not";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT)
    private Double dataSpaceUsageNot;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN = "data_space_usage_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN)
    private List<Double> dataSpaceUsageNotIn = null;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE = "dirty_cache_space";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE)
    private Long dirtyCacheSpace;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT = "dirty_cache_space_gt";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT)
    private Long dirtyCacheSpaceGt;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE = "dirty_cache_space_gte";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE)
    private Long dirtyCacheSpaceGte;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN = "dirty_cache_space_in";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN)
    private List<Long> dirtyCacheSpaceIn = null;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT = "dirty_cache_space_lt";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT)
    private Long dirtyCacheSpaceLt;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE = "dirty_cache_space_lte";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE)
    private Long dirtyCacheSpaceLte;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT = "dirty_cache_space_not";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT)
    private Long dirtyCacheSpaceNot;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN =
            "dirty_cache_space_not_in";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN)
    private List<Long> dirtyCacheSpaceNotIn = null;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE = "dirty_cache_usage";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE)
    private Double dirtyCacheUsage;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT = "dirty_cache_usage_gt";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT)
    private Double dirtyCacheUsageGt;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE = "dirty_cache_usage_gte";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE)
    private Double dirtyCacheUsageGte;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN = "dirty_cache_usage_in";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN)
    private List<Double> dirtyCacheUsageIn = null;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT = "dirty_cache_usage_lt";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT)
    private Double dirtyCacheUsageLt;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE = "dirty_cache_usage_lte";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE)
    private Double dirtyCacheUsageLte;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT = "dirty_cache_usage_not";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT)
    private Double dirtyCacheUsageNot;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN =
            "dirty_cache_usage_not_in";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN)
    private List<Double> dirtyCacheUsageNotIn = null;

    public static final String SERIALIZED_NAME_DISKS_EVERY = "disks_every";

    @SerializedName(SERIALIZED_NAME_DISKS_EVERY)
    private DiskWhereInput disksEvery;

    public static final String SERIALIZED_NAME_DISKS_NONE = "disks_none";

    @SerializedName(SERIALIZED_NAME_DISKS_NONE)
    private DiskWhereInput disksNone;

    public static final String SERIALIZED_NAME_DISKS_SOME = "disks_some";

    @SerializedName(SERIALIZED_NAME_DISKS_SOME)
    private DiskWhereInput disksSome;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE = "failure_cache_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE)
    private Long failureCacheSpace;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT = "failure_cache_space_gt";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT)
    private Long failureCacheSpaceGt;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE = "failure_cache_space_gte";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE)
    private Long failureCacheSpaceGte;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN = "failure_cache_space_in";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN)
    private List<Long> failureCacheSpaceIn = null;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT = "failure_cache_space_lt";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT)
    private Long failureCacheSpaceLt;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE = "failure_cache_space_lte";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE)
    private Long failureCacheSpaceLte;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT = "failure_cache_space_not";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT)
    private Long failureCacheSpaceNot;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN =
            "failure_cache_space_not_in";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN)
    private List<Long> failureCacheSpaceNotIn = null;

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

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT = "hdd_disk_count";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT)
    private Integer hddDiskCount;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_GT = "hdd_disk_count_gt";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_GT)
    private Integer hddDiskCountGt;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_GTE = "hdd_disk_count_gte";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_GTE)
    private Integer hddDiskCountGte;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_IN = "hdd_disk_count_in";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_IN)
    private List<Integer> hddDiskCountIn = null;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_LT = "hdd_disk_count_lt";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_LT)
    private Integer hddDiskCountLt;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_LTE = "hdd_disk_count_lte";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_LTE)
    private Integer hddDiskCountLte;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_NOT = "hdd_disk_count_not";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_NOT)
    private Integer hddDiskCountNot;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN = "hdd_disk_count_not_in";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN)
    private List<Integer> hddDiskCountNotIn = null;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private HostWhereInput host;

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

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

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

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private String numaNode;

    public static final String SERIALIZED_NAME_NUMA_NODE_CONTAINS = "numa_node_contains";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_CONTAINS)
    private String numaNodeContains;

    public static final String SERIALIZED_NAME_NUMA_NODE_ENDS_WITH = "numa_node_ends_with";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_ENDS_WITH)
    private String numaNodeEndsWith;

    public static final String SERIALIZED_NAME_NUMA_NODE_GT = "numa_node_gt";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_GT)
    private String numaNodeGt;

    public static final String SERIALIZED_NAME_NUMA_NODE_GTE = "numa_node_gte";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_GTE)
    private String numaNodeGte;

    public static final String SERIALIZED_NAME_NUMA_NODE_IN = "numa_node_in";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_IN)
    private List<String> numaNodeIn = null;

    public static final String SERIALIZED_NAME_NUMA_NODE_LT = "numa_node_lt";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_LT)
    private String numaNodeLt;

    public static final String SERIALIZED_NAME_NUMA_NODE_LTE = "numa_node_lte";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_LTE)
    private String numaNodeLte;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT = "numa_node_not";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT)
    private String numaNodeNot;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS = "numa_node_not_contains";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS)
    private String numaNodeNotContains;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH = "numa_node_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH)
    private String numaNodeNotEndsWith;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT_IN = "numa_node_not_in";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT_IN)
    private List<String> numaNodeNotIn = null;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH =
            "numa_node_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH)
    private String numaNodeNotStartsWith;

    public static final String SERIALIZED_NAME_NUMA_NODE_STARTS_WITH = "numa_node_starts_with";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_STARTS_WITH)
    private String numaNodeStartsWith;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT = "nvme_ssd_disk_count";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT)
    private Integer nvmeSsdDiskCount;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT = "nvme_ssd_disk_count_gt";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT)
    private Integer nvmeSsdDiskCountGt;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE = "nvme_ssd_disk_count_gte";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE)
    private Integer nvmeSsdDiskCountGte;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN = "nvme_ssd_disk_count_in";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN)
    private List<Integer> nvmeSsdDiskCountIn = null;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT = "nvme_ssd_disk_count_lt";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT)
    private Integer nvmeSsdDiskCountLt;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE = "nvme_ssd_disk_count_lte";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE)
    private Integer nvmeSsdDiskCountLte;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT = "nvme_ssd_disk_count_not";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT)
    private Integer nvmeSsdDiskCountNot;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN =
            "nvme_ssd_disk_count_not_in";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN)
    private List<Integer> nvmeSsdDiskCountNotIn = null;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE =
            "perf_allocated_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE)
    private Long perfAllocatedDataSpace;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT =
            "perf_allocated_data_space_gt";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT)
    private Long perfAllocatedDataSpaceGt;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE =
            "perf_allocated_data_space_gte";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE)
    private Long perfAllocatedDataSpaceGte;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN =
            "perf_allocated_data_space_in";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN)
    private List<Long> perfAllocatedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT =
            "perf_allocated_data_space_lt";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT)
    private Long perfAllocatedDataSpaceLt;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE =
            "perf_allocated_data_space_lte";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE)
    private Long perfAllocatedDataSpaceLte;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT =
            "perf_allocated_data_space_not";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT)
    private Long perfAllocatedDataSpaceNot;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN =
            "perf_allocated_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN)
    private List<Long> perfAllocatedDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE = "perf_failure_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE)
    private Long perfFailureDataSpace;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT =
            "perf_failure_data_space_gt";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT)
    private Long perfFailureDataSpaceGt;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE =
            "perf_failure_data_space_gte";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE)
    private Long perfFailureDataSpaceGte;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN =
            "perf_failure_data_space_in";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN)
    private List<Long> perfFailureDataSpaceIn = null;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT =
            "perf_failure_data_space_lt";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT)
    private Long perfFailureDataSpaceLt;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE =
            "perf_failure_data_space_lte";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE)
    private Long perfFailureDataSpaceLte;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT =
            "perf_failure_data_space_not";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT)
    private Long perfFailureDataSpaceNot;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN =
            "perf_failure_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN)
    private List<Long> perfFailureDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY =
            "perf_total_data_capacity";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY)
    private Long perfTotalDataCapacity;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT =
            "perf_total_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT)
    private Long perfTotalDataCapacityGt;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE =
            "perf_total_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE)
    private Long perfTotalDataCapacityGte;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN =
            "perf_total_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN)
    private List<Long> perfTotalDataCapacityIn = null;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT =
            "perf_total_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT)
    private Long perfTotalDataCapacityLt;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE =
            "perf_total_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE)
    private Long perfTotalDataCapacityLte;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT =
            "perf_total_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT)
    private Long perfTotalDataCapacityNot;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN =
            "perf_total_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN)
    private List<Long> perfTotalDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE = "perf_used_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE)
    private Long perfUsedDataSpace;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT = "perf_used_data_space_gt";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT)
    private Long perfUsedDataSpaceGt;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE =
            "perf_used_data_space_gte";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE)
    private Long perfUsedDataSpaceGte;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN = "perf_used_data_space_in";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN)
    private List<Long> perfUsedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT = "perf_used_data_space_lt";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT)
    private Long perfUsedDataSpaceLt;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE =
            "perf_used_data_space_lte";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE)
    private Long perfUsedDataSpaceLte;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT =
            "perf_used_data_space_not";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT)
    private Long perfUsedDataSpaceNot;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN =
            "perf_used_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN)
    private List<Long> perfUsedDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE = "perf_valid_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE)
    private Long perfValidDataSpace;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT =
            "perf_valid_data_space_gt";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT)
    private Long perfValidDataSpaceGt;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE =
            "perf_valid_data_space_gte";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE)
    private Long perfValidDataSpaceGte;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN =
            "perf_valid_data_space_in";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN)
    private List<Long> perfValidDataSpaceIn = null;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT =
            "perf_valid_data_space_lt";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT)
    private Long perfValidDataSpaceLt;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE =
            "perf_valid_data_space_lte";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE)
    private Long perfValidDataSpaceLte;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT =
            "perf_valid_data_space_not";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT)
    private Long perfValidDataSpaceNot;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN =
            "perf_valid_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN)
    private List<Long> perfValidDataSpaceNotIn = null;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE =
            "planned_prioritized_space";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE)
    private Long plannedPrioritizedSpace;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT =
            "planned_prioritized_space_gt";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT)
    private Long plannedPrioritizedSpaceGt;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE =
            "planned_prioritized_space_gte";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE)
    private Long plannedPrioritizedSpaceGte;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN =
            "planned_prioritized_space_in";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN)
    private List<Long> plannedPrioritizedSpaceIn = null;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT =
            "planned_prioritized_space_lt";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT)
    private Long plannedPrioritizedSpaceLt;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE =
            "planned_prioritized_space_lte";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE)
    private Long plannedPrioritizedSpaceLte;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT =
            "planned_prioritized_space_not";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT)
    private Long plannedPrioritizedSpaceNot;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN =
            "planned_prioritized_space_not_in";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN)
    private List<Long> plannedPrioritizedSpaceNotIn = null;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT =
            "prio_space_percentage_gt";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT)
    private Double prioSpacePercentageGt;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE =
            "prio_space_percentage_gte";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE)
    private Double prioSpacePercentageGte;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN =
            "prio_space_percentage_in";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN)
    private List<Double> prioSpacePercentageIn = null;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT =
            "prio_space_percentage_lt";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT)
    private Double prioSpacePercentageLt;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE =
            "prio_space_percentage_lte";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE)
    private Double prioSpacePercentageLte;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT =
            "prio_space_percentage_not";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT)
    private Double prioSpacePercentageNot;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN =
            "prio_space_percentage_not_in";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN)
    private List<Double> prioSpacePercentageNotIn = null;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT =
            "sata_or_sas_ssd_disk_count";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT)
    private Integer sataOrSasSsdDiskCount;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT =
            "sata_or_sas_ssd_disk_count_gt";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT)
    private Integer sataOrSasSsdDiskCountGt;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE =
            "sata_or_sas_ssd_disk_count_gte";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE)
    private Integer sataOrSasSsdDiskCountGte;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN =
            "sata_or_sas_ssd_disk_count_in";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN)
    private List<Integer> sataOrSasSsdDiskCountIn = null;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT =
            "sata_or_sas_ssd_disk_count_lt";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT)
    private Integer sataOrSasSsdDiskCountLt;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE =
            "sata_or_sas_ssd_disk_count_lte";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE)
    private Integer sataOrSasSsdDiskCountLte;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT =
            "sata_or_sas_ssd_disk_count_not";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT)
    private Integer sataOrSasSsdDiskCountNot;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN =
            "sata_or_sas_ssd_disk_count_not_in";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN)
    private List<Integer> sataOrSasSsdDiskCountNotIn = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private DiskPoolStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<DiskPoolStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private DiskPoolStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<DiskPoolStatus> statusNotIn = null;

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

    public static final String SERIALIZED_NAME_USE_STATE = "use_state";

    @SerializedName(SERIALIZED_NAME_USE_STATE)
    private DiskPoolUseState useState;

    public static final String SERIALIZED_NAME_USE_STATE_IN = "use_state_in";

    @SerializedName(SERIALIZED_NAME_USE_STATE_IN)
    private List<DiskPoolUseState> useStateIn = null;

    public static final String SERIALIZED_NAME_USE_STATE_NOT = "use_state_not";

    @SerializedName(SERIALIZED_NAME_USE_STATE_NOT)
    private DiskPoolUseState useStateNot;

    public static final String SERIALIZED_NAME_USE_STATE_NOT_IN = "use_state_not_in";

    @SerializedName(SERIALIZED_NAME_USE_STATE_NOT_IN)
    private List<DiskPoolUseState> useStateNotIn = null;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE = "used_cache_space";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE)
    private Long usedCacheSpace;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_GT = "used_cache_space_gt";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_GT)
    private Long usedCacheSpaceGt;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_GTE = "used_cache_space_gte";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_GTE)
    private Long usedCacheSpaceGte;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_IN = "used_cache_space_in";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_IN)
    private List<Long> usedCacheSpaceIn = null;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_LT = "used_cache_space_lt";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_LT)
    private Long usedCacheSpaceLt;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_LTE = "used_cache_space_lte";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_LTE)
    private Long usedCacheSpaceLte;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_NOT = "used_cache_space_not";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_NOT)
    private Long usedCacheSpaceNot;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN = "used_cache_space_not_in";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN)
    private List<Long> usedCacheSpaceNotIn = null;

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

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE = "valid_cache_space";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE)
    private Long validCacheSpace;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_GT = "valid_cache_space_gt";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_GT)
    private Long validCacheSpaceGt;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_GTE = "valid_cache_space_gte";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_GTE)
    private Long validCacheSpaceGte;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_IN = "valid_cache_space_in";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_IN)
    private List<Long> validCacheSpaceIn = null;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_LT = "valid_cache_space_lt";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_LT)
    private Long validCacheSpaceLt;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_LTE = "valid_cache_space_lte";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_LTE)
    private Long validCacheSpaceLte;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_NOT = "valid_cache_space_not";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT)
    private Long validCacheSpaceNot;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN =
            "valid_cache_space_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN)
    private List<Long> validCacheSpaceNotIn = null;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE = "valid_free_cache_space";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE)
    private Long validFreeCacheSpace;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT =
            "valid_free_cache_space_gt";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT)
    private Long validFreeCacheSpaceGt;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE =
            "valid_free_cache_space_gte";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE)
    private Long validFreeCacheSpaceGte;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN =
            "valid_free_cache_space_in";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN)
    private List<Long> validFreeCacheSpaceIn = null;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT =
            "valid_free_cache_space_lt";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT)
    private Long validFreeCacheSpaceLt;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE =
            "valid_free_cache_space_lte";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE)
    private Long validFreeCacheSpaceLte;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT =
            "valid_free_cache_space_not";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT)
    private Long validFreeCacheSpaceNot;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN =
            "valid_free_cache_space_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN)
    private List<Long> validFreeCacheSpaceNotIn = null;

    public DiskPoolWhereInput() {}

    public DiskPoolWhereInput AND(List<DiskPoolWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public DiskPoolWhereInput addANDItem(DiskPoolWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<DiskPoolWhereInput>();
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
    public List<DiskPoolWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<DiskPoolWhereInput> AND) {
        this.AND = AND;
    }

    public DiskPoolWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public DiskPoolWhereInput AND_ExplictlyNonNull() {
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

    public DiskPoolWhereInput NOT(List<DiskPoolWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public DiskPoolWhereInput addNOTItem(DiskPoolWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<DiskPoolWhereInput>();
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
    public List<DiskPoolWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<DiskPoolWhereInput> NOT) {
        this.NOT = NOT;
    }

    public DiskPoolWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public DiskPoolWhereInput NOT_ExplictlyNonNull() {
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

    public DiskPoolWhereInput OR(List<DiskPoolWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public DiskPoolWhereInput addORItem(DiskPoolWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<DiskPoolWhereInput>();
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
    public List<DiskPoolWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<DiskPoolWhereInput> OR) {
        this.OR = OR;
    }

    public DiskPoolWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public DiskPoolWhereInput OR_ExplictlyNonNull() {
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

    public DiskPoolWhereInput chunkId(Integer chunkId) {

        this.chunkId = chunkId;
        return this;
    }

    /**
     * Get chunkId
     *
     * @return chunkId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkId() {
        return chunkId;
    }

    public void setChunkId(Integer chunkId) {
        this.chunkId = chunkId;
    }

    public DiskPoolWhereInput chunkId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public DiskPoolWhereInput chunkId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public void setChunkId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID);
        }
    }

    public boolean getChunkId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID);
    }

    public DiskPoolWhereInput chunkIdGt(Integer chunkIdGt) {

        this.chunkIdGt = chunkIdGt;
        return this;
    }

    /**
     * Get chunkIdGt
     *
     * @return chunkIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkIdGt() {
        return chunkIdGt;
    }

    public void setChunkIdGt(Integer chunkIdGt) {
        this.chunkIdGt = chunkIdGt;
    }

    public DiskPoolWhereInput chunkIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_GT);
        return this;
    }

    public DiskPoolWhereInput chunkIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_GT);
        return this;
    }

    public void setChunkIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_GT);
        }
    }

    public boolean getChunkIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_GT);
    }

    public DiskPoolWhereInput chunkIdGte(Integer chunkIdGte) {

        this.chunkIdGte = chunkIdGte;
        return this;
    }

    /**
     * Get chunkIdGte
     *
     * @return chunkIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkIdGte() {
        return chunkIdGte;
    }

    public void setChunkIdGte(Integer chunkIdGte) {
        this.chunkIdGte = chunkIdGte;
    }

    public DiskPoolWhereInput chunkIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_GTE);
        return this;
    }

    public DiskPoolWhereInput chunkIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_GTE);
        return this;
    }

    public void setChunkIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_GTE);
        }
    }

    public boolean getChunkIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_GTE);
    }

    public DiskPoolWhereInput chunkIdIn(List<Integer> chunkIdIn) {

        this.chunkIdIn = chunkIdIn;
        return this;
    }

    public DiskPoolWhereInput addChunkIdInItem(Integer chunkIdInItem) {
        if (this.chunkIdIn == null) {
            this.chunkIdIn = new ArrayList<Integer>();
        }
        this.chunkIdIn.add(chunkIdInItem);
        return this;
    }

    /**
     * Get chunkIdIn
     *
     * @return chunkIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getChunkIdIn() {
        return chunkIdIn;
    }

    public void setChunkIdIn(List<Integer> chunkIdIn) {
        this.chunkIdIn = chunkIdIn;
    }

    public DiskPoolWhereInput chunkIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_IN);
        return this;
    }

    public DiskPoolWhereInput chunkIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_IN);
        return this;
    }

    public void setChunkIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_IN);
        }
    }

    public boolean getChunkIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_IN);
    }

    public DiskPoolWhereInput chunkIdLt(Integer chunkIdLt) {

        this.chunkIdLt = chunkIdLt;
        return this;
    }

    /**
     * Get chunkIdLt
     *
     * @return chunkIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkIdLt() {
        return chunkIdLt;
    }

    public void setChunkIdLt(Integer chunkIdLt) {
        this.chunkIdLt = chunkIdLt;
    }

    public DiskPoolWhereInput chunkIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_LT);
        return this;
    }

    public DiskPoolWhereInput chunkIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_LT);
        return this;
    }

    public void setChunkIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_LT);
        }
    }

    public boolean getChunkIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_LT);
    }

    public DiskPoolWhereInput chunkIdLte(Integer chunkIdLte) {

        this.chunkIdLte = chunkIdLte;
        return this;
    }

    /**
     * Get chunkIdLte
     *
     * @return chunkIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkIdLte() {
        return chunkIdLte;
    }

    public void setChunkIdLte(Integer chunkIdLte) {
        this.chunkIdLte = chunkIdLte;
    }

    public DiskPoolWhereInput chunkIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_LTE);
        return this;
    }

    public DiskPoolWhereInput chunkIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_LTE);
        return this;
    }

    public void setChunkIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_LTE);
        }
    }

    public boolean getChunkIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_LTE);
    }

    public DiskPoolWhereInput chunkIdNot(Integer chunkIdNot) {

        this.chunkIdNot = chunkIdNot;
        return this;
    }

    /**
     * Get chunkIdNot
     *
     * @return chunkIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkIdNot() {
        return chunkIdNot;
    }

    public void setChunkIdNot(Integer chunkIdNot) {
        this.chunkIdNot = chunkIdNot;
    }

    public DiskPoolWhereInput chunkIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_NOT);
        return this;
    }

    public DiskPoolWhereInput chunkIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_NOT);
        return this;
    }

    public void setChunkIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_NOT);
        }
    }

    public boolean getChunkIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_NOT);
    }

    public DiskPoolWhereInput chunkIdNotIn(List<Integer> chunkIdNotIn) {

        this.chunkIdNotIn = chunkIdNotIn;
        return this;
    }

    public DiskPoolWhereInput addChunkIdNotInItem(Integer chunkIdNotInItem) {
        if (this.chunkIdNotIn == null) {
            this.chunkIdNotIn = new ArrayList<Integer>();
        }
        this.chunkIdNotIn.add(chunkIdNotInItem);
        return this;
    }

    /**
     * Get chunkIdNotIn
     *
     * @return chunkIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getChunkIdNotIn() {
        return chunkIdNotIn;
    }

    public void setChunkIdNotIn(List<Integer> chunkIdNotIn) {
        this.chunkIdNotIn = chunkIdNotIn;
    }

    public DiskPoolWhereInput chunkIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput chunkIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_NOT_IN);
        return this;
    }

    public void setChunkIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID_NOT_IN);
        }
    }

    public boolean getChunkIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID_NOT_IN);
    }

    public DiskPoolWhereInput chunkInsId(Integer chunkInsId) {

        this.chunkInsId = chunkInsId;
        return this;
    }

    /**
     * Get chunkInsId
     *
     * @return chunkInsId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsId() {
        return chunkInsId;
    }

    public void setChunkInsId(Integer chunkInsId) {
        this.chunkInsId = chunkInsId;
    }

    public DiskPoolWhereInput chunkInsId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID);
        return this;
    }

    public DiskPoolWhereInput chunkInsId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID);
        return this;
    }

    public void setChunkInsId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID);
        }
    }

    public boolean getChunkInsId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID);
    }

    public DiskPoolWhereInput chunkInsIdGt(Integer chunkInsIdGt) {

        this.chunkInsIdGt = chunkInsIdGt;
        return this;
    }

    /**
     * Get chunkInsIdGt
     *
     * @return chunkInsIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsIdGt() {
        return chunkInsIdGt;
    }

    public void setChunkInsIdGt(Integer chunkInsIdGt) {
        this.chunkInsIdGt = chunkInsIdGt;
    }

    public DiskPoolWhereInput chunkInsIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_GT);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_GT);
        return this;
    }

    public void setChunkInsIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_GT);
        }
    }

    public boolean getChunkInsIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_GT);
    }

    public DiskPoolWhereInput chunkInsIdGte(Integer chunkInsIdGte) {

        this.chunkInsIdGte = chunkInsIdGte;
        return this;
    }

    /**
     * Get chunkInsIdGte
     *
     * @return chunkInsIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsIdGte() {
        return chunkInsIdGte;
    }

    public void setChunkInsIdGte(Integer chunkInsIdGte) {
        this.chunkInsIdGte = chunkInsIdGte;
    }

    public DiskPoolWhereInput chunkInsIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_GTE);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_GTE);
        return this;
    }

    public void setChunkInsIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_GTE);
        }
    }

    public boolean getChunkInsIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_GTE);
    }

    public DiskPoolWhereInput chunkInsIdIn(List<Integer> chunkInsIdIn) {

        this.chunkInsIdIn = chunkInsIdIn;
        return this;
    }

    public DiskPoolWhereInput addChunkInsIdInItem(Integer chunkInsIdInItem) {
        if (this.chunkInsIdIn == null) {
            this.chunkInsIdIn = new ArrayList<Integer>();
        }
        this.chunkInsIdIn.add(chunkInsIdInItem);
        return this;
    }

    /**
     * Get chunkInsIdIn
     *
     * @return chunkInsIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getChunkInsIdIn() {
        return chunkInsIdIn;
    }

    public void setChunkInsIdIn(List<Integer> chunkInsIdIn) {
        this.chunkInsIdIn = chunkInsIdIn;
    }

    public DiskPoolWhereInput chunkInsIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_IN);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_IN);
        return this;
    }

    public void setChunkInsIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_IN);
        }
    }

    public boolean getChunkInsIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_IN);
    }

    public DiskPoolWhereInput chunkInsIdLt(Integer chunkInsIdLt) {

        this.chunkInsIdLt = chunkInsIdLt;
        return this;
    }

    /**
     * Get chunkInsIdLt
     *
     * @return chunkInsIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsIdLt() {
        return chunkInsIdLt;
    }

    public void setChunkInsIdLt(Integer chunkInsIdLt) {
        this.chunkInsIdLt = chunkInsIdLt;
    }

    public DiskPoolWhereInput chunkInsIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_LT);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_LT);
        return this;
    }

    public void setChunkInsIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_LT);
        }
    }

    public boolean getChunkInsIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_LT);
    }

    public DiskPoolWhereInput chunkInsIdLte(Integer chunkInsIdLte) {

        this.chunkInsIdLte = chunkInsIdLte;
        return this;
    }

    /**
     * Get chunkInsIdLte
     *
     * @return chunkInsIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsIdLte() {
        return chunkInsIdLte;
    }

    public void setChunkInsIdLte(Integer chunkInsIdLte) {
        this.chunkInsIdLte = chunkInsIdLte;
    }

    public DiskPoolWhereInput chunkInsIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_LTE);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_LTE);
        return this;
    }

    public void setChunkInsIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_LTE);
        }
    }

    public boolean getChunkInsIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_LTE);
    }

    public DiskPoolWhereInput chunkInsIdNot(Integer chunkInsIdNot) {

        this.chunkInsIdNot = chunkInsIdNot;
        return this;
    }

    /**
     * Get chunkInsIdNot
     *
     * @return chunkInsIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getChunkInsIdNot() {
        return chunkInsIdNot;
    }

    public void setChunkInsIdNot(Integer chunkInsIdNot) {
        this.chunkInsIdNot = chunkInsIdNot;
    }

    public DiskPoolWhereInput chunkInsIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_NOT);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_NOT);
        return this;
    }

    public void setChunkInsIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_NOT);
        }
    }

    public boolean getChunkInsIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_NOT);
    }

    public DiskPoolWhereInput chunkInsIdNotIn(List<Integer> chunkInsIdNotIn) {

        this.chunkInsIdNotIn = chunkInsIdNotIn;
        return this;
    }

    public DiskPoolWhereInput addChunkInsIdNotInItem(Integer chunkInsIdNotInItem) {
        if (this.chunkInsIdNotIn == null) {
            this.chunkInsIdNotIn = new ArrayList<Integer>();
        }
        this.chunkInsIdNotIn.add(chunkInsIdNotInItem);
        return this;
    }

    /**
     * Get chunkInsIdNotIn
     *
     * @return chunkInsIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getChunkInsIdNotIn() {
        return chunkInsIdNotIn;
    }

    public void setChunkInsIdNotIn(List<Integer> chunkInsIdNotIn) {
        this.chunkInsIdNotIn = chunkInsIdNotIn;
    }

    public DiskPoolWhereInput chunkInsIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput chunkInsIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN);
        return this;
    }

    public void setChunkInsIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN);
        }
    }

    public boolean getChunkInsIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID_NOT_IN);
    }

    public DiskPoolWhereInput dataSpaceUsage(Double dataSpaceUsage) {

        this.dataSpaceUsage = dataSpaceUsage;
        return this;
    }

    /**
     * Get dataSpaceUsage
     *
     * @return dataSpaceUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataSpaceUsage() {
        return dataSpaceUsage;
    }

    public void setDataSpaceUsage(Double dataSpaceUsage) {
        this.dataSpaceUsage = dataSpaceUsage;
    }

    public DiskPoolWhereInput dataSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE);
        return this;
    }

    public void setDataSpaceUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE);
        }
    }

    public boolean getDataSpaceUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE);
    }

    public DiskPoolWhereInput dataSpaceUsageGt(Double dataSpaceUsageGt) {

        this.dataSpaceUsageGt = dataSpaceUsageGt;
        return this;
    }

    /**
     * Get dataSpaceUsageGt
     *
     * @return dataSpaceUsageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataSpaceUsageGt() {
        return dataSpaceUsageGt;
    }

    public void setDataSpaceUsageGt(Double dataSpaceUsageGt) {
        this.dataSpaceUsageGt = dataSpaceUsageGt;
    }

    public DiskPoolWhereInput dataSpaceUsageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_GT);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_GT);
        return this;
    }

    public void setDataSpaceUsageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_GT);
        }
    }

    public boolean getDataSpaceUsageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_GT);
    }

    public DiskPoolWhereInput dataSpaceUsageGte(Double dataSpaceUsageGte) {

        this.dataSpaceUsageGte = dataSpaceUsageGte;
        return this;
    }

    /**
     * Get dataSpaceUsageGte
     *
     * @return dataSpaceUsageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataSpaceUsageGte() {
        return dataSpaceUsageGte;
    }

    public void setDataSpaceUsageGte(Double dataSpaceUsageGte) {
        this.dataSpaceUsageGte = dataSpaceUsageGte;
    }

    public DiskPoolWhereInput dataSpaceUsageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_GTE);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_GTE);
        return this;
    }

    public void setDataSpaceUsageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_GTE);
        }
    }

    public boolean getDataSpaceUsageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_GTE);
    }

    public DiskPoolWhereInput dataSpaceUsageIn(List<Double> dataSpaceUsageIn) {

        this.dataSpaceUsageIn = dataSpaceUsageIn;
        return this;
    }

    public DiskPoolWhereInput addDataSpaceUsageInItem(Double dataSpaceUsageInItem) {
        if (this.dataSpaceUsageIn == null) {
            this.dataSpaceUsageIn = new ArrayList<Double>();
        }
        this.dataSpaceUsageIn.add(dataSpaceUsageInItem);
        return this;
    }

    /**
     * Get dataSpaceUsageIn
     *
     * @return dataSpaceUsageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getDataSpaceUsageIn() {
        return dataSpaceUsageIn;
    }

    public void setDataSpaceUsageIn(List<Double> dataSpaceUsageIn) {
        this.dataSpaceUsageIn = dataSpaceUsageIn;
    }

    public DiskPoolWhereInput dataSpaceUsageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_IN);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_IN);
        return this;
    }

    public void setDataSpaceUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_IN);
        }
    }

    public boolean getDataSpaceUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_IN);
    }

    public DiskPoolWhereInput dataSpaceUsageLt(Double dataSpaceUsageLt) {

        this.dataSpaceUsageLt = dataSpaceUsageLt;
        return this;
    }

    /**
     * Get dataSpaceUsageLt
     *
     * @return dataSpaceUsageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataSpaceUsageLt() {
        return dataSpaceUsageLt;
    }

    public void setDataSpaceUsageLt(Double dataSpaceUsageLt) {
        this.dataSpaceUsageLt = dataSpaceUsageLt;
    }

    public DiskPoolWhereInput dataSpaceUsageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_LT);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_LT);
        return this;
    }

    public void setDataSpaceUsageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_LT);
        }
    }

    public boolean getDataSpaceUsageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_LT);
    }

    public DiskPoolWhereInput dataSpaceUsageLte(Double dataSpaceUsageLte) {

        this.dataSpaceUsageLte = dataSpaceUsageLte;
        return this;
    }

    /**
     * Get dataSpaceUsageLte
     *
     * @return dataSpaceUsageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataSpaceUsageLte() {
        return dataSpaceUsageLte;
    }

    public void setDataSpaceUsageLte(Double dataSpaceUsageLte) {
        this.dataSpaceUsageLte = dataSpaceUsageLte;
    }

    public DiskPoolWhereInput dataSpaceUsageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_LTE);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_LTE);
        return this;
    }

    public void setDataSpaceUsageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_LTE);
        }
    }

    public boolean getDataSpaceUsageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_LTE);
    }

    public DiskPoolWhereInput dataSpaceUsageNot(Double dataSpaceUsageNot) {

        this.dataSpaceUsageNot = dataSpaceUsageNot;
        return this;
    }

    /**
     * Get dataSpaceUsageNot
     *
     * @return dataSpaceUsageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataSpaceUsageNot() {
        return dataSpaceUsageNot;
    }

    public void setDataSpaceUsageNot(Double dataSpaceUsageNot) {
        this.dataSpaceUsageNot = dataSpaceUsageNot;
    }

    public DiskPoolWhereInput dataSpaceUsageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT);
        return this;
    }

    public void setDataSpaceUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT);
        }
    }

    public boolean getDataSpaceUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT);
    }

    public DiskPoolWhereInput dataSpaceUsageNotIn(List<Double> dataSpaceUsageNotIn) {

        this.dataSpaceUsageNotIn = dataSpaceUsageNotIn;
        return this;
    }

    public DiskPoolWhereInput addDataSpaceUsageNotInItem(Double dataSpaceUsageNotInItem) {
        if (this.dataSpaceUsageNotIn == null) {
            this.dataSpaceUsageNotIn = new ArrayList<Double>();
        }
        this.dataSpaceUsageNotIn.add(dataSpaceUsageNotInItem);
        return this;
    }

    /**
     * Get dataSpaceUsageNotIn
     *
     * @return dataSpaceUsageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getDataSpaceUsageNotIn() {
        return dataSpaceUsageNotIn;
    }

    public void setDataSpaceUsageNotIn(List<Double> dataSpaceUsageNotIn) {
        this.dataSpaceUsageNotIn = dataSpaceUsageNotIn;
    }

    public DiskPoolWhereInput dataSpaceUsageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput dataSpaceUsageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN);
        return this;
    }

    public void setDataSpaceUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN);
        }
    }

    public boolean getDataSpaceUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE_NOT_IN);
    }

    public DiskPoolWhereInput dirtyCacheSpace(Long dirtyCacheSpace) {

        this.dirtyCacheSpace = dirtyCacheSpace;
        return this;
    }

    /**
     * Get dirtyCacheSpace
     *
     * @return dirtyCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpace() {
        return dirtyCacheSpace;
    }

    public void setDirtyCacheSpace(Long dirtyCacheSpace) {
        this.dirtyCacheSpace = dirtyCacheSpace;
    }

    public DiskPoolWhereInput dirtyCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        return this;
    }

    public void setDirtyCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        }
    }

    public boolean getDirtyCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
    }

    public DiskPoolWhereInput dirtyCacheSpaceGt(Long dirtyCacheSpaceGt) {

        this.dirtyCacheSpaceGt = dirtyCacheSpaceGt;
        return this;
    }

    /**
     * Get dirtyCacheSpaceGt
     *
     * @return dirtyCacheSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpaceGt() {
        return dirtyCacheSpaceGt;
    }

    public void setDirtyCacheSpaceGt(Long dirtyCacheSpaceGt) {
        this.dirtyCacheSpaceGt = dirtyCacheSpaceGt;
    }

    public DiskPoolWhereInput dirtyCacheSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT);
        return this;
    }

    public void setDirtyCacheSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT);
        }
    }

    public boolean getDirtyCacheSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GT);
    }

    public DiskPoolWhereInput dirtyCacheSpaceGte(Long dirtyCacheSpaceGte) {

        this.dirtyCacheSpaceGte = dirtyCacheSpaceGte;
        return this;
    }

    /**
     * Get dirtyCacheSpaceGte
     *
     * @return dirtyCacheSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpaceGte() {
        return dirtyCacheSpaceGte;
    }

    public void setDirtyCacheSpaceGte(Long dirtyCacheSpaceGte) {
        this.dirtyCacheSpaceGte = dirtyCacheSpaceGte;
    }

    public DiskPoolWhereInput dirtyCacheSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE);
        return this;
    }

    public void setDirtyCacheSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE);
        }
    }

    public boolean getDirtyCacheSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_GTE);
    }

    public DiskPoolWhereInput dirtyCacheSpaceIn(List<Long> dirtyCacheSpaceIn) {

        this.dirtyCacheSpaceIn = dirtyCacheSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addDirtyCacheSpaceInItem(Long dirtyCacheSpaceInItem) {
        if (this.dirtyCacheSpaceIn == null) {
            this.dirtyCacheSpaceIn = new ArrayList<Long>();
        }
        this.dirtyCacheSpaceIn.add(dirtyCacheSpaceInItem);
        return this;
    }

    /**
     * Get dirtyCacheSpaceIn
     *
     * @return dirtyCacheSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getDirtyCacheSpaceIn() {
        return dirtyCacheSpaceIn;
    }

    public void setDirtyCacheSpaceIn(List<Long> dirtyCacheSpaceIn) {
        this.dirtyCacheSpaceIn = dirtyCacheSpaceIn;
    }

    public DiskPoolWhereInput dirtyCacheSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN);
        return this;
    }

    public void setDirtyCacheSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN);
        }
    }

    public boolean getDirtyCacheSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_IN);
    }

    public DiskPoolWhereInput dirtyCacheSpaceLt(Long dirtyCacheSpaceLt) {

        this.dirtyCacheSpaceLt = dirtyCacheSpaceLt;
        return this;
    }

    /**
     * Get dirtyCacheSpaceLt
     *
     * @return dirtyCacheSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpaceLt() {
        return dirtyCacheSpaceLt;
    }

    public void setDirtyCacheSpaceLt(Long dirtyCacheSpaceLt) {
        this.dirtyCacheSpaceLt = dirtyCacheSpaceLt;
    }

    public DiskPoolWhereInput dirtyCacheSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT);
        return this;
    }

    public void setDirtyCacheSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT);
        }
    }

    public boolean getDirtyCacheSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LT);
    }

    public DiskPoolWhereInput dirtyCacheSpaceLte(Long dirtyCacheSpaceLte) {

        this.dirtyCacheSpaceLte = dirtyCacheSpaceLte;
        return this;
    }

    /**
     * Get dirtyCacheSpaceLte
     *
     * @return dirtyCacheSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpaceLte() {
        return dirtyCacheSpaceLte;
    }

    public void setDirtyCacheSpaceLte(Long dirtyCacheSpaceLte) {
        this.dirtyCacheSpaceLte = dirtyCacheSpaceLte;
    }

    public DiskPoolWhereInput dirtyCacheSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE);
        return this;
    }

    public void setDirtyCacheSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE);
        }
    }

    public boolean getDirtyCacheSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_LTE);
    }

    public DiskPoolWhereInput dirtyCacheSpaceNot(Long dirtyCacheSpaceNot) {

        this.dirtyCacheSpaceNot = dirtyCacheSpaceNot;
        return this;
    }

    /**
     * Get dirtyCacheSpaceNot
     *
     * @return dirtyCacheSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpaceNot() {
        return dirtyCacheSpaceNot;
    }

    public void setDirtyCacheSpaceNot(Long dirtyCacheSpaceNot) {
        this.dirtyCacheSpaceNot = dirtyCacheSpaceNot;
    }

    public DiskPoolWhereInput dirtyCacheSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT);
        return this;
    }

    public void setDirtyCacheSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT);
        }
    }

    public boolean getDirtyCacheSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT);
    }

    public DiskPoolWhereInput dirtyCacheSpaceNotIn(List<Long> dirtyCacheSpaceNotIn) {

        this.dirtyCacheSpaceNotIn = dirtyCacheSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addDirtyCacheSpaceNotInItem(Long dirtyCacheSpaceNotInItem) {
        if (this.dirtyCacheSpaceNotIn == null) {
            this.dirtyCacheSpaceNotIn = new ArrayList<Long>();
        }
        this.dirtyCacheSpaceNotIn.add(dirtyCacheSpaceNotInItem);
        return this;
    }

    /**
     * Get dirtyCacheSpaceNotIn
     *
     * @return dirtyCacheSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getDirtyCacheSpaceNotIn() {
        return dirtyCacheSpaceNotIn;
    }

    public void setDirtyCacheSpaceNotIn(List<Long> dirtyCacheSpaceNotIn) {
        this.dirtyCacheSpaceNotIn = dirtyCacheSpaceNotIn;
    }

    public DiskPoolWhereInput dirtyCacheSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN);
        return this;
    }

    public void setDirtyCacheSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN);
        }
    }

    public boolean getDirtyCacheSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput dirtyCacheUsage(Double dirtyCacheUsage) {

        this.dirtyCacheUsage = dirtyCacheUsage;
        return this;
    }

    /**
     * Get dirtyCacheUsage
     *
     * @return dirtyCacheUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsage() {
        return dirtyCacheUsage;
    }

    public void setDirtyCacheUsage(Double dirtyCacheUsage) {
        this.dirtyCacheUsage = dirtyCacheUsage;
    }

    public DiskPoolWhereInput dirtyCacheUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        return this;
    }

    public void setDirtyCacheUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        }
    }

    public boolean getDirtyCacheUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
    }

    public DiskPoolWhereInput dirtyCacheUsageGt(Double dirtyCacheUsageGt) {

        this.dirtyCacheUsageGt = dirtyCacheUsageGt;
        return this;
    }

    /**
     * Get dirtyCacheUsageGt
     *
     * @return dirtyCacheUsageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsageGt() {
        return dirtyCacheUsageGt;
    }

    public void setDirtyCacheUsageGt(Double dirtyCacheUsageGt) {
        this.dirtyCacheUsageGt = dirtyCacheUsageGt;
    }

    public DiskPoolWhereInput dirtyCacheUsageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT);
        return this;
    }

    public void setDirtyCacheUsageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT);
        }
    }

    public boolean getDirtyCacheUsageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GT);
    }

    public DiskPoolWhereInput dirtyCacheUsageGte(Double dirtyCacheUsageGte) {

        this.dirtyCacheUsageGte = dirtyCacheUsageGte;
        return this;
    }

    /**
     * Get dirtyCacheUsageGte
     *
     * @return dirtyCacheUsageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsageGte() {
        return dirtyCacheUsageGte;
    }

    public void setDirtyCacheUsageGte(Double dirtyCacheUsageGte) {
        this.dirtyCacheUsageGte = dirtyCacheUsageGte;
    }

    public DiskPoolWhereInput dirtyCacheUsageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE);
        return this;
    }

    public void setDirtyCacheUsageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE);
        }
    }

    public boolean getDirtyCacheUsageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_GTE);
    }

    public DiskPoolWhereInput dirtyCacheUsageIn(List<Double> dirtyCacheUsageIn) {

        this.dirtyCacheUsageIn = dirtyCacheUsageIn;
        return this;
    }

    public DiskPoolWhereInput addDirtyCacheUsageInItem(Double dirtyCacheUsageInItem) {
        if (this.dirtyCacheUsageIn == null) {
            this.dirtyCacheUsageIn = new ArrayList<Double>();
        }
        this.dirtyCacheUsageIn.add(dirtyCacheUsageInItem);
        return this;
    }

    /**
     * Get dirtyCacheUsageIn
     *
     * @return dirtyCacheUsageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getDirtyCacheUsageIn() {
        return dirtyCacheUsageIn;
    }

    public void setDirtyCacheUsageIn(List<Double> dirtyCacheUsageIn) {
        this.dirtyCacheUsageIn = dirtyCacheUsageIn;
    }

    public DiskPoolWhereInput dirtyCacheUsageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN);
        return this;
    }

    public void setDirtyCacheUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN);
        }
    }

    public boolean getDirtyCacheUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_IN);
    }

    public DiskPoolWhereInput dirtyCacheUsageLt(Double dirtyCacheUsageLt) {

        this.dirtyCacheUsageLt = dirtyCacheUsageLt;
        return this;
    }

    /**
     * Get dirtyCacheUsageLt
     *
     * @return dirtyCacheUsageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsageLt() {
        return dirtyCacheUsageLt;
    }

    public void setDirtyCacheUsageLt(Double dirtyCacheUsageLt) {
        this.dirtyCacheUsageLt = dirtyCacheUsageLt;
    }

    public DiskPoolWhereInput dirtyCacheUsageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT);
        return this;
    }

    public void setDirtyCacheUsageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT);
        }
    }

    public boolean getDirtyCacheUsageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LT);
    }

    public DiskPoolWhereInput dirtyCacheUsageLte(Double dirtyCacheUsageLte) {

        this.dirtyCacheUsageLte = dirtyCacheUsageLte;
        return this;
    }

    /**
     * Get dirtyCacheUsageLte
     *
     * @return dirtyCacheUsageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsageLte() {
        return dirtyCacheUsageLte;
    }

    public void setDirtyCacheUsageLte(Double dirtyCacheUsageLte) {
        this.dirtyCacheUsageLte = dirtyCacheUsageLte;
    }

    public DiskPoolWhereInput dirtyCacheUsageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE);
        return this;
    }

    public void setDirtyCacheUsageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE);
        }
    }

    public boolean getDirtyCacheUsageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_LTE);
    }

    public DiskPoolWhereInput dirtyCacheUsageNot(Double dirtyCacheUsageNot) {

        this.dirtyCacheUsageNot = dirtyCacheUsageNot;
        return this;
    }

    /**
     * Get dirtyCacheUsageNot
     *
     * @return dirtyCacheUsageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsageNot() {
        return dirtyCacheUsageNot;
    }

    public void setDirtyCacheUsageNot(Double dirtyCacheUsageNot) {
        this.dirtyCacheUsageNot = dirtyCacheUsageNot;
    }

    public DiskPoolWhereInput dirtyCacheUsageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT);
        return this;
    }

    public void setDirtyCacheUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT);
        }
    }

    public boolean getDirtyCacheUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT);
    }

    public DiskPoolWhereInput dirtyCacheUsageNotIn(List<Double> dirtyCacheUsageNotIn) {

        this.dirtyCacheUsageNotIn = dirtyCacheUsageNotIn;
        return this;
    }

    public DiskPoolWhereInput addDirtyCacheUsageNotInItem(Double dirtyCacheUsageNotInItem) {
        if (this.dirtyCacheUsageNotIn == null) {
            this.dirtyCacheUsageNotIn = new ArrayList<Double>();
        }
        this.dirtyCacheUsageNotIn.add(dirtyCacheUsageNotInItem);
        return this;
    }

    /**
     * Get dirtyCacheUsageNotIn
     *
     * @return dirtyCacheUsageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getDirtyCacheUsageNotIn() {
        return dirtyCacheUsageNotIn;
    }

    public void setDirtyCacheUsageNotIn(List<Double> dirtyCacheUsageNotIn) {
        this.dirtyCacheUsageNotIn = dirtyCacheUsageNotIn;
    }

    public DiskPoolWhereInput dirtyCacheUsageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput dirtyCacheUsageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN);
        return this;
    }

    public void setDirtyCacheUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN);
        }
    }

    public boolean getDirtyCacheUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE_NOT_IN);
    }

    public DiskPoolWhereInput disksEvery(DiskWhereInput disksEvery) {

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

    public DiskPoolWhereInput disksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_EVERY);
        return this;
    }

    public DiskPoolWhereInput disksEvery_ExplictlyNonNull() {
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

    public DiskPoolWhereInput disksNone(DiskWhereInput disksNone) {

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

    public DiskPoolWhereInput disksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_NONE);
        return this;
    }

    public DiskPoolWhereInput disksNone_ExplictlyNonNull() {
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

    public DiskPoolWhereInput disksSome(DiskWhereInput disksSome) {

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

    public DiskPoolWhereInput disksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS_SOME);
        return this;
    }

    public DiskPoolWhereInput disksSome_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureCacheSpace(Long failureCacheSpace) {

        this.failureCacheSpace = failureCacheSpace;
        return this;
    }

    /**
     * Get failureCacheSpace
     *
     * @return failureCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpace() {
        return failureCacheSpace;
    }

    public void setFailureCacheSpace(Long failureCacheSpace) {
        this.failureCacheSpace = failureCacheSpace;
    }

    public DiskPoolWhereInput failureCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        return this;
    }

    public void setFailureCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        }
    }

    public boolean getFailureCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
    }

    public DiskPoolWhereInput failureCacheSpaceGt(Long failureCacheSpaceGt) {

        this.failureCacheSpaceGt = failureCacheSpaceGt;
        return this;
    }

    /**
     * Get failureCacheSpaceGt
     *
     * @return failureCacheSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpaceGt() {
        return failureCacheSpaceGt;
    }

    public void setFailureCacheSpaceGt(Long failureCacheSpaceGt) {
        this.failureCacheSpaceGt = failureCacheSpaceGt;
    }

    public DiskPoolWhereInput failureCacheSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT);
        return this;
    }

    public void setFailureCacheSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT);
        }
    }

    public boolean getFailureCacheSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GT);
    }

    public DiskPoolWhereInput failureCacheSpaceGte(Long failureCacheSpaceGte) {

        this.failureCacheSpaceGte = failureCacheSpaceGte;
        return this;
    }

    /**
     * Get failureCacheSpaceGte
     *
     * @return failureCacheSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpaceGte() {
        return failureCacheSpaceGte;
    }

    public void setFailureCacheSpaceGte(Long failureCacheSpaceGte) {
        this.failureCacheSpaceGte = failureCacheSpaceGte;
    }

    public DiskPoolWhereInput failureCacheSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE);
        return this;
    }

    public void setFailureCacheSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE);
        }
    }

    public boolean getFailureCacheSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_GTE);
    }

    public DiskPoolWhereInput failureCacheSpaceIn(List<Long> failureCacheSpaceIn) {

        this.failureCacheSpaceIn = failureCacheSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addFailureCacheSpaceInItem(Long failureCacheSpaceInItem) {
        if (this.failureCacheSpaceIn == null) {
            this.failureCacheSpaceIn = new ArrayList<Long>();
        }
        this.failureCacheSpaceIn.add(failureCacheSpaceInItem);
        return this;
    }

    /**
     * Get failureCacheSpaceIn
     *
     * @return failureCacheSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFailureCacheSpaceIn() {
        return failureCacheSpaceIn;
    }

    public void setFailureCacheSpaceIn(List<Long> failureCacheSpaceIn) {
        this.failureCacheSpaceIn = failureCacheSpaceIn;
    }

    public DiskPoolWhereInput failureCacheSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN);
        return this;
    }

    public void setFailureCacheSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN);
        }
    }

    public boolean getFailureCacheSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_IN);
    }

    public DiskPoolWhereInput failureCacheSpaceLt(Long failureCacheSpaceLt) {

        this.failureCacheSpaceLt = failureCacheSpaceLt;
        return this;
    }

    /**
     * Get failureCacheSpaceLt
     *
     * @return failureCacheSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpaceLt() {
        return failureCacheSpaceLt;
    }

    public void setFailureCacheSpaceLt(Long failureCacheSpaceLt) {
        this.failureCacheSpaceLt = failureCacheSpaceLt;
    }

    public DiskPoolWhereInput failureCacheSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT);
        return this;
    }

    public void setFailureCacheSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT);
        }
    }

    public boolean getFailureCacheSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LT);
    }

    public DiskPoolWhereInput failureCacheSpaceLte(Long failureCacheSpaceLte) {

        this.failureCacheSpaceLte = failureCacheSpaceLte;
        return this;
    }

    /**
     * Get failureCacheSpaceLte
     *
     * @return failureCacheSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpaceLte() {
        return failureCacheSpaceLte;
    }

    public void setFailureCacheSpaceLte(Long failureCacheSpaceLte) {
        this.failureCacheSpaceLte = failureCacheSpaceLte;
    }

    public DiskPoolWhereInput failureCacheSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE);
        return this;
    }

    public void setFailureCacheSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE);
        }
    }

    public boolean getFailureCacheSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_LTE);
    }

    public DiskPoolWhereInput failureCacheSpaceNot(Long failureCacheSpaceNot) {

        this.failureCacheSpaceNot = failureCacheSpaceNot;
        return this;
    }

    /**
     * Get failureCacheSpaceNot
     *
     * @return failureCacheSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpaceNot() {
        return failureCacheSpaceNot;
    }

    public void setFailureCacheSpaceNot(Long failureCacheSpaceNot) {
        this.failureCacheSpaceNot = failureCacheSpaceNot;
    }

    public DiskPoolWhereInput failureCacheSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT);
        return this;
    }

    public void setFailureCacheSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT);
        }
    }

    public boolean getFailureCacheSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT);
    }

    public DiskPoolWhereInput failureCacheSpaceNotIn(List<Long> failureCacheSpaceNotIn) {

        this.failureCacheSpaceNotIn = failureCacheSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addFailureCacheSpaceNotInItem(Long failureCacheSpaceNotInItem) {
        if (this.failureCacheSpaceNotIn == null) {
            this.failureCacheSpaceNotIn = new ArrayList<Long>();
        }
        this.failureCacheSpaceNotIn.add(failureCacheSpaceNotInItem);
        return this;
    }

    /**
     * Get failureCacheSpaceNotIn
     *
     * @return failureCacheSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFailureCacheSpaceNotIn() {
        return failureCacheSpaceNotIn;
    }

    public void setFailureCacheSpaceNotIn(List<Long> failureCacheSpaceNotIn) {
        this.failureCacheSpaceNotIn = failureCacheSpaceNotIn;
    }

    public DiskPoolWhereInput failureCacheSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput failureCacheSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN);
        return this;
    }

    public void setFailureCacheSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN);
        }
    }

    public boolean getFailureCacheSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput failureDataSpace(Long failureDataSpace) {

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

    public DiskPoolWhereInput failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public DiskPoolWhereInput failureDataSpace_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceGt(Long failureDataSpaceGt) {

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

    public DiskPoolWhereInput failureDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceGt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceGte(Long failureDataSpaceGte) {

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

    public DiskPoolWhereInput failureDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceGte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceIn(List<Long> failureDataSpaceIn) {

        this.failureDataSpaceIn = failureDataSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addFailureDataSpaceInItem(Long failureDataSpaceInItem) {
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

    public DiskPoolWhereInput failureDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceLt(Long failureDataSpaceLt) {

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

    public DiskPoolWhereInput failureDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceLt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceLte(Long failureDataSpaceLte) {

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

    public DiskPoolWhereInput failureDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceLte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceNot(Long failureDataSpaceNot) {

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

    public DiskPoolWhereInput failureDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceNot_ExplictlyNonNull() {
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

    public DiskPoolWhereInput failureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {

        this.failureDataSpaceNotIn = failureDataSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addFailureDataSpaceNotInItem(Long failureDataSpaceNotInItem) {
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

    public DiskPoolWhereInput failureDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput failureDataSpaceNotIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput hddDiskCount(Integer hddDiskCount) {

        this.hddDiskCount = hddDiskCount;
        return this;
    }

    /**
     * Get hddDiskCount
     *
     * @return hddDiskCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHddDiskCount() {
        return hddDiskCount;
    }

    public void setHddDiskCount(Integer hddDiskCount) {
        this.hddDiskCount = hddDiskCount;
    }

    public DiskPoolWhereInput hddDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT);
        return this;
    }

    public DiskPoolWhereInput hddDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT);
        return this;
    }

    public void setHddDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT);
        }
    }

    public boolean getHddDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT);
    }

    public DiskPoolWhereInput hddDiskCountGt(Integer hddDiskCountGt) {

        this.hddDiskCountGt = hddDiskCountGt;
        return this;
    }

    /**
     * Get hddDiskCountGt
     *
     * @return hddDiskCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHddDiskCountGt() {
        return hddDiskCountGt;
    }

    public void setHddDiskCountGt(Integer hddDiskCountGt) {
        this.hddDiskCountGt = hddDiskCountGt;
    }

    public DiskPoolWhereInput hddDiskCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_GT);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_GT);
        return this;
    }

    public void setHddDiskCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_GT);
        }
    }

    public boolean getHddDiskCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_GT);
    }

    public DiskPoolWhereInput hddDiskCountGte(Integer hddDiskCountGte) {

        this.hddDiskCountGte = hddDiskCountGte;
        return this;
    }

    /**
     * Get hddDiskCountGte
     *
     * @return hddDiskCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHddDiskCountGte() {
        return hddDiskCountGte;
    }

    public void setHddDiskCountGte(Integer hddDiskCountGte) {
        this.hddDiskCountGte = hddDiskCountGte;
    }

    public DiskPoolWhereInput hddDiskCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_GTE);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_GTE);
        return this;
    }

    public void setHddDiskCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_GTE);
        }
    }

    public boolean getHddDiskCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_GTE);
    }

    public DiskPoolWhereInput hddDiskCountIn(List<Integer> hddDiskCountIn) {

        this.hddDiskCountIn = hddDiskCountIn;
        return this;
    }

    public DiskPoolWhereInput addHddDiskCountInItem(Integer hddDiskCountInItem) {
        if (this.hddDiskCountIn == null) {
            this.hddDiskCountIn = new ArrayList<Integer>();
        }
        this.hddDiskCountIn.add(hddDiskCountInItem);
        return this;
    }

    /**
     * Get hddDiskCountIn
     *
     * @return hddDiskCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHddDiskCountIn() {
        return hddDiskCountIn;
    }

    public void setHddDiskCountIn(List<Integer> hddDiskCountIn) {
        this.hddDiskCountIn = hddDiskCountIn;
    }

    public DiskPoolWhereInput hddDiskCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_IN);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_IN);
        return this;
    }

    public void setHddDiskCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_IN);
        }
    }

    public boolean getHddDiskCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_IN);
    }

    public DiskPoolWhereInput hddDiskCountLt(Integer hddDiskCountLt) {

        this.hddDiskCountLt = hddDiskCountLt;
        return this;
    }

    /**
     * Get hddDiskCountLt
     *
     * @return hddDiskCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHddDiskCountLt() {
        return hddDiskCountLt;
    }

    public void setHddDiskCountLt(Integer hddDiskCountLt) {
        this.hddDiskCountLt = hddDiskCountLt;
    }

    public DiskPoolWhereInput hddDiskCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_LT);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_LT);
        return this;
    }

    public void setHddDiskCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_LT);
        }
    }

    public boolean getHddDiskCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_LT);
    }

    public DiskPoolWhereInput hddDiskCountLte(Integer hddDiskCountLte) {

        this.hddDiskCountLte = hddDiskCountLte;
        return this;
    }

    /**
     * Get hddDiskCountLte
     *
     * @return hddDiskCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHddDiskCountLte() {
        return hddDiskCountLte;
    }

    public void setHddDiskCountLte(Integer hddDiskCountLte) {
        this.hddDiskCountLte = hddDiskCountLte;
    }

    public DiskPoolWhereInput hddDiskCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_LTE);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_LTE);
        return this;
    }

    public void setHddDiskCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_LTE);
        }
    }

    public boolean getHddDiskCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_LTE);
    }

    public DiskPoolWhereInput hddDiskCountNot(Integer hddDiskCountNot) {

        this.hddDiskCountNot = hddDiskCountNot;
        return this;
    }

    /**
     * Get hddDiskCountNot
     *
     * @return hddDiskCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHddDiskCountNot() {
        return hddDiskCountNot;
    }

    public void setHddDiskCountNot(Integer hddDiskCountNot) {
        this.hddDiskCountNot = hddDiskCountNot;
    }

    public DiskPoolWhereInput hddDiskCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_NOT);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_NOT);
        return this;
    }

    public void setHddDiskCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_NOT);
        }
    }

    public boolean getHddDiskCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_NOT);
    }

    public DiskPoolWhereInput hddDiskCountNotIn(List<Integer> hddDiskCountNotIn) {

        this.hddDiskCountNotIn = hddDiskCountNotIn;
        return this;
    }

    public DiskPoolWhereInput addHddDiskCountNotInItem(Integer hddDiskCountNotInItem) {
        if (this.hddDiskCountNotIn == null) {
            this.hddDiskCountNotIn = new ArrayList<Integer>();
        }
        this.hddDiskCountNotIn.add(hddDiskCountNotInItem);
        return this;
    }

    /**
     * Get hddDiskCountNotIn
     *
     * @return hddDiskCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getHddDiskCountNotIn() {
        return hddDiskCountNotIn;
    }

    public void setHddDiskCountNotIn(List<Integer> hddDiskCountNotIn) {
        this.hddDiskCountNotIn = hddDiskCountNotIn;
    }

    public DiskPoolWhereInput hddDiskCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput hddDiskCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN);
        return this;
    }

    public void setHddDiskCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN);
        }
    }

    public boolean getHddDiskCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN);
    }

    public DiskPoolWhereInput host(HostWhereInput host) {

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
    public HostWhereInput getHost() {
        return host;
    }

    public void setHost(HostWhereInput host) {
        this.host = host;
    }

    public DiskPoolWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public DiskPoolWhereInput host_ExplictlyNonNull() {
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

    public DiskPoolWhereInput id(String id) {

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

    public DiskPoolWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public DiskPoolWhereInput id_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idContains(String idContains) {

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

    public DiskPoolWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public DiskPoolWhereInput idContains_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idEndsWith(String idEndsWith) {

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

    public DiskPoolWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public DiskPoolWhereInput idEndsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idGt(String idGt) {

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

    public DiskPoolWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public DiskPoolWhereInput idGt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idGte(String idGte) {

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

    public DiskPoolWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public DiskPoolWhereInput idGte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public DiskPoolWhereInput addIdInItem(String idInItem) {
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

    public DiskPoolWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public DiskPoolWhereInput idIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idLt(String idLt) {

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

    public DiskPoolWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public DiskPoolWhereInput idLt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idLte(String idLte) {

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

    public DiskPoolWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public DiskPoolWhereInput idLte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idNot(String idNot) {

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

    public DiskPoolWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public DiskPoolWhereInput idNot_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idNotContains(String idNotContains) {

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

    public DiskPoolWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public DiskPoolWhereInput idNotContains_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public DiskPoolWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public DiskPoolWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public DiskPoolWhereInput addIdNotInItem(String idNotInItem) {
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

    public DiskPoolWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput idNotIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public DiskPoolWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public DiskPoolWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput idStartsWith(String idStartsWith) {

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

    public DiskPoolWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public DiskPoolWhereInput idStartsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput labelsEvery(LabelWhereInput labelsEvery) {

        this.labelsEvery = labelsEvery;
        return this;
    }

    /**
     * Get labelsEvery
     *
     * @return labelsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsEvery() {
        return labelsEvery;
    }

    public void setLabelsEvery(LabelWhereInput labelsEvery) {
        this.labelsEvery = labelsEvery;
    }

    public DiskPoolWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public DiskPoolWhereInput labelsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public void setLabelsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        }
    }

    public boolean getLabelsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_EVERY);
    }

    public DiskPoolWhereInput labelsNone(LabelWhereInput labelsNone) {

        this.labelsNone = labelsNone;
        return this;
    }

    /**
     * Get labelsNone
     *
     * @return labelsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsNone() {
        return labelsNone;
    }

    public void setLabelsNone(LabelWhereInput labelsNone) {
        this.labelsNone = labelsNone;
    }

    public DiskPoolWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public DiskPoolWhereInput labelsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public void setLabelsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        }
    }

    public boolean getLabelsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_NONE);
    }

    public DiskPoolWhereInput labelsSome(LabelWhereInput labelsSome) {

        this.labelsSome = labelsSome;
        return this;
    }

    /**
     * Get labelsSome
     *
     * @return labelsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsSome() {
        return labelsSome;
    }

    public void setLabelsSome(LabelWhereInput labelsSome) {
        this.labelsSome = labelsSome;
    }

    public DiskPoolWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public DiskPoolWhereInput labelsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public void setLabelsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        }
    }

    public boolean getLabelsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_SOME);
    }

    public DiskPoolWhereInput localId(String localId) {

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

    public DiskPoolWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public DiskPoolWhereInput localId_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdContains(String localIdContains) {

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

    public DiskPoolWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public DiskPoolWhereInput localIdContains_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public DiskPoolWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public DiskPoolWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdGt(String localIdGt) {

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

    public DiskPoolWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public DiskPoolWhereInput localIdGt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdGte(String localIdGte) {

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

    public DiskPoolWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public DiskPoolWhereInput localIdGte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public DiskPoolWhereInput addLocalIdInItem(String localIdInItem) {
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

    public DiskPoolWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public DiskPoolWhereInput localIdIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdLt(String localIdLt) {

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

    public DiskPoolWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public DiskPoolWhereInput localIdLt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdLte(String localIdLte) {

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

    public DiskPoolWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public DiskPoolWhereInput localIdLte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdNot(String localIdNot) {

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

    public DiskPoolWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public DiskPoolWhereInput localIdNot_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdNotContains(String localIdNotContains) {

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

    public DiskPoolWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public DiskPoolWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public DiskPoolWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public DiskPoolWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public DiskPoolWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public DiskPoolWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public DiskPoolWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public DiskPoolWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public DiskPoolWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public DiskPoolWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public DiskPoolWhereInput numaNode(String numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(String numaNode) {
        this.numaNode = numaNode;
    }

    public DiskPoolWhereInput numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public DiskPoolWhereInput numaNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public void setNumaNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        }
    }

    public boolean getNumaNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE);
    }

    public DiskPoolWhereInput numaNodeContains(String numaNodeContains) {

        this.numaNodeContains = numaNodeContains;
        return this;
    }

    /**
     * Get numaNodeContains
     *
     * @return numaNodeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeContains() {
        return numaNodeContains;
    }

    public void setNumaNodeContains(String numaNodeContains) {
        this.numaNodeContains = numaNodeContains;
    }

    public DiskPoolWhereInput numaNodeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_CONTAINS);
        return this;
    }

    public DiskPoolWhereInput numaNodeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_CONTAINS);
        return this;
    }

    public void setNumaNodeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_CONTAINS);
        }
    }

    public boolean getNumaNodeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_CONTAINS);
    }

    public DiskPoolWhereInput numaNodeEndsWith(String numaNodeEndsWith) {

        this.numaNodeEndsWith = numaNodeEndsWith;
        return this;
    }

    /**
     * Get numaNodeEndsWith
     *
     * @return numaNodeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeEndsWith() {
        return numaNodeEndsWith;
    }

    public void setNumaNodeEndsWith(String numaNodeEndsWith) {
        this.numaNodeEndsWith = numaNodeEndsWith;
    }

    public DiskPoolWhereInput numaNodeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_ENDS_WITH);
        return this;
    }

    public DiskPoolWhereInput numaNodeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_ENDS_WITH);
        return this;
    }

    public void setNumaNodeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_ENDS_WITH);
        }
    }

    public boolean getNumaNodeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_ENDS_WITH);
    }

    public DiskPoolWhereInput numaNodeGt(String numaNodeGt) {

        this.numaNodeGt = numaNodeGt;
        return this;
    }

    /**
     * Get numaNodeGt
     *
     * @return numaNodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeGt() {
        return numaNodeGt;
    }

    public void setNumaNodeGt(String numaNodeGt) {
        this.numaNodeGt = numaNodeGt;
    }

    public DiskPoolWhereInput numaNodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GT);
        return this;
    }

    public DiskPoolWhereInput numaNodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GT);
        return this;
    }

    public void setNumaNodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GT);
        }
    }

    public boolean getNumaNodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_GT);
    }

    public DiskPoolWhereInput numaNodeGte(String numaNodeGte) {

        this.numaNodeGte = numaNodeGte;
        return this;
    }

    /**
     * Get numaNodeGte
     *
     * @return numaNodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeGte() {
        return numaNodeGte;
    }

    public void setNumaNodeGte(String numaNodeGte) {
        this.numaNodeGte = numaNodeGte;
    }

    public DiskPoolWhereInput numaNodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GTE);
        return this;
    }

    public DiskPoolWhereInput numaNodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GTE);
        return this;
    }

    public void setNumaNodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GTE);
        }
    }

    public boolean getNumaNodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_GTE);
    }

    public DiskPoolWhereInput numaNodeIn(List<String> numaNodeIn) {

        this.numaNodeIn = numaNodeIn;
        return this;
    }

    public DiskPoolWhereInput addNumaNodeInItem(String numaNodeInItem) {
        if (this.numaNodeIn == null) {
            this.numaNodeIn = new ArrayList<String>();
        }
        this.numaNodeIn.add(numaNodeInItem);
        return this;
    }

    /**
     * Get numaNodeIn
     *
     * @return numaNodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNumaNodeIn() {
        return numaNodeIn;
    }

    public void setNumaNodeIn(List<String> numaNodeIn) {
        this.numaNodeIn = numaNodeIn;
    }

    public DiskPoolWhereInput numaNodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_IN);
        return this;
    }

    public DiskPoolWhereInput numaNodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_IN);
        return this;
    }

    public void setNumaNodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_IN);
        }
    }

    public boolean getNumaNodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_IN);
    }

    public DiskPoolWhereInput numaNodeLt(String numaNodeLt) {

        this.numaNodeLt = numaNodeLt;
        return this;
    }

    /**
     * Get numaNodeLt
     *
     * @return numaNodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeLt() {
        return numaNodeLt;
    }

    public void setNumaNodeLt(String numaNodeLt) {
        this.numaNodeLt = numaNodeLt;
    }

    public DiskPoolWhereInput numaNodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LT);
        return this;
    }

    public DiskPoolWhereInput numaNodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LT);
        return this;
    }

    public void setNumaNodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LT);
        }
    }

    public boolean getNumaNodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_LT);
    }

    public DiskPoolWhereInput numaNodeLte(String numaNodeLte) {

        this.numaNodeLte = numaNodeLte;
        return this;
    }

    /**
     * Get numaNodeLte
     *
     * @return numaNodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeLte() {
        return numaNodeLte;
    }

    public void setNumaNodeLte(String numaNodeLte) {
        this.numaNodeLte = numaNodeLte;
    }

    public DiskPoolWhereInput numaNodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LTE);
        return this;
    }

    public DiskPoolWhereInput numaNodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LTE);
        return this;
    }

    public void setNumaNodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LTE);
        }
    }

    public boolean getNumaNodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_LTE);
    }

    public DiskPoolWhereInput numaNodeNot(String numaNodeNot) {

        this.numaNodeNot = numaNodeNot;
        return this;
    }

    /**
     * Get numaNodeNot
     *
     * @return numaNodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeNot() {
        return numaNodeNot;
    }

    public void setNumaNodeNot(String numaNodeNot) {
        this.numaNodeNot = numaNodeNot;
    }

    public DiskPoolWhereInput numaNodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT);
        return this;
    }

    public DiskPoolWhereInput numaNodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT);
        return this;
    }

    public void setNumaNodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT);
        }
    }

    public boolean getNumaNodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT);
    }

    public DiskPoolWhereInput numaNodeNotContains(String numaNodeNotContains) {

        this.numaNodeNotContains = numaNodeNotContains;
        return this;
    }

    /**
     * Get numaNodeNotContains
     *
     * @return numaNodeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeNotContains() {
        return numaNodeNotContains;
    }

    public void setNumaNodeNotContains(String numaNodeNotContains) {
        this.numaNodeNotContains = numaNodeNotContains;
    }

    public DiskPoolWhereInput numaNodeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS);
        return this;
    }

    public DiskPoolWhereInput numaNodeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS);
        return this;
    }

    public void setNumaNodeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS);
        }
    }

    public boolean getNumaNodeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT_CONTAINS);
    }

    public DiskPoolWhereInput numaNodeNotEndsWith(String numaNodeNotEndsWith) {

        this.numaNodeNotEndsWith = numaNodeNotEndsWith;
        return this;
    }

    /**
     * Get numaNodeNotEndsWith
     *
     * @return numaNodeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeNotEndsWith() {
        return numaNodeNotEndsWith;
    }

    public void setNumaNodeNotEndsWith(String numaNodeNotEndsWith) {
        this.numaNodeNotEndsWith = numaNodeNotEndsWith;
    }

    public DiskPoolWhereInput numaNodeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH);
        return this;
    }

    public DiskPoolWhereInput numaNodeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH);
        return this;
    }

    public void setNumaNodeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH);
        }
    }

    public boolean getNumaNodeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT_ENDS_WITH);
    }

    public DiskPoolWhereInput numaNodeNotIn(List<String> numaNodeNotIn) {

        this.numaNodeNotIn = numaNodeNotIn;
        return this;
    }

    public DiskPoolWhereInput addNumaNodeNotInItem(String numaNodeNotInItem) {
        if (this.numaNodeNotIn == null) {
            this.numaNodeNotIn = new ArrayList<String>();
        }
        this.numaNodeNotIn.add(numaNodeNotInItem);
        return this;
    }

    /**
     * Get numaNodeNotIn
     *
     * @return numaNodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNumaNodeNotIn() {
        return numaNodeNotIn;
    }

    public void setNumaNodeNotIn(List<String> numaNodeNotIn) {
        this.numaNodeNotIn = numaNodeNotIn;
    }

    public DiskPoolWhereInput numaNodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput numaNodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        return this;
    }

    public void setNumaNodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        }
    }

    public boolean getNumaNodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
    }

    public DiskPoolWhereInput numaNodeNotStartsWith(String numaNodeNotStartsWith) {

        this.numaNodeNotStartsWith = numaNodeNotStartsWith;
        return this;
    }

    /**
     * Get numaNodeNotStartsWith
     *
     * @return numaNodeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeNotStartsWith() {
        return numaNodeNotStartsWith;
    }

    public void setNumaNodeNotStartsWith(String numaNodeNotStartsWith) {
        this.numaNodeNotStartsWith = numaNodeNotStartsWith;
    }

    public DiskPoolWhereInput numaNodeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH);
        return this;
    }

    public DiskPoolWhereInput numaNodeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH);
        return this;
    }

    public void setNumaNodeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH);
        }
    }

    public boolean getNumaNodeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT_STARTS_WITH);
    }

    public DiskPoolWhereInput numaNodeStartsWith(String numaNodeStartsWith) {

        this.numaNodeStartsWith = numaNodeStartsWith;
        return this;
    }

    /**
     * Get numaNodeStartsWith
     *
     * @return numaNodeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNumaNodeStartsWith() {
        return numaNodeStartsWith;
    }

    public void setNumaNodeStartsWith(String numaNodeStartsWith) {
        this.numaNodeStartsWith = numaNodeStartsWith;
    }

    public DiskPoolWhereInput numaNodeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_STARTS_WITH);
        return this;
    }

    public DiskPoolWhereInput numaNodeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_STARTS_WITH);
        return this;
    }

    public void setNumaNodeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_STARTS_WITH);
        }
    }

    public boolean getNumaNodeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_STARTS_WITH);
    }

    public DiskPoolWhereInput nvmeSsdDiskCount(Integer nvmeSsdDiskCount) {

        this.nvmeSsdDiskCount = nvmeSsdDiskCount;
        return this;
    }

    /**
     * Get nvmeSsdDiskCount
     *
     * @return nvmeSsdDiskCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmeSsdDiskCount() {
        return nvmeSsdDiskCount;
    }

    public void setNvmeSsdDiskCount(Integer nvmeSsdDiskCount) {
        this.nvmeSsdDiskCount = nvmeSsdDiskCount;
    }

    public DiskPoolWhereInput nvmeSsdDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        return this;
    }

    public void setNvmeSsdDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        }
    }

    public boolean getNvmeSsdDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountGt(Integer nvmeSsdDiskCountGt) {

        this.nvmeSsdDiskCountGt = nvmeSsdDiskCountGt;
        return this;
    }

    /**
     * Get nvmeSsdDiskCountGt
     *
     * @return nvmeSsdDiskCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmeSsdDiskCountGt() {
        return nvmeSsdDiskCountGt;
    }

    public void setNvmeSsdDiskCountGt(Integer nvmeSsdDiskCountGt) {
        this.nvmeSsdDiskCountGt = nvmeSsdDiskCountGt;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT);
        return this;
    }

    public void setNvmeSsdDiskCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT);
        }
    }

    public boolean getNvmeSsdDiskCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GT);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountGte(Integer nvmeSsdDiskCountGte) {

        this.nvmeSsdDiskCountGte = nvmeSsdDiskCountGte;
        return this;
    }

    /**
     * Get nvmeSsdDiskCountGte
     *
     * @return nvmeSsdDiskCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmeSsdDiskCountGte() {
        return nvmeSsdDiskCountGte;
    }

    public void setNvmeSsdDiskCountGte(Integer nvmeSsdDiskCountGte) {
        this.nvmeSsdDiskCountGte = nvmeSsdDiskCountGte;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE);
        return this;
    }

    public void setNvmeSsdDiskCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE);
        }
    }

    public boolean getNvmeSsdDiskCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_GTE);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountIn(List<Integer> nvmeSsdDiskCountIn) {

        this.nvmeSsdDiskCountIn = nvmeSsdDiskCountIn;
        return this;
    }

    public DiskPoolWhereInput addNvmeSsdDiskCountInItem(Integer nvmeSsdDiskCountInItem) {
        if (this.nvmeSsdDiskCountIn == null) {
            this.nvmeSsdDiskCountIn = new ArrayList<Integer>();
        }
        this.nvmeSsdDiskCountIn.add(nvmeSsdDiskCountInItem);
        return this;
    }

    /**
     * Get nvmeSsdDiskCountIn
     *
     * @return nvmeSsdDiskCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmeSsdDiskCountIn() {
        return nvmeSsdDiskCountIn;
    }

    public void setNvmeSsdDiskCountIn(List<Integer> nvmeSsdDiskCountIn) {
        this.nvmeSsdDiskCountIn = nvmeSsdDiskCountIn;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN);
        return this;
    }

    public void setNvmeSsdDiskCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN);
        }
    }

    public boolean getNvmeSsdDiskCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_IN);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountLt(Integer nvmeSsdDiskCountLt) {

        this.nvmeSsdDiskCountLt = nvmeSsdDiskCountLt;
        return this;
    }

    /**
     * Get nvmeSsdDiskCountLt
     *
     * @return nvmeSsdDiskCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmeSsdDiskCountLt() {
        return nvmeSsdDiskCountLt;
    }

    public void setNvmeSsdDiskCountLt(Integer nvmeSsdDiskCountLt) {
        this.nvmeSsdDiskCountLt = nvmeSsdDiskCountLt;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT);
        return this;
    }

    public void setNvmeSsdDiskCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT);
        }
    }

    public boolean getNvmeSsdDiskCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LT);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountLte(Integer nvmeSsdDiskCountLte) {

        this.nvmeSsdDiskCountLte = nvmeSsdDiskCountLte;
        return this;
    }

    /**
     * Get nvmeSsdDiskCountLte
     *
     * @return nvmeSsdDiskCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmeSsdDiskCountLte() {
        return nvmeSsdDiskCountLte;
    }

    public void setNvmeSsdDiskCountLte(Integer nvmeSsdDiskCountLte) {
        this.nvmeSsdDiskCountLte = nvmeSsdDiskCountLte;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE);
        return this;
    }

    public void setNvmeSsdDiskCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE);
        }
    }

    public boolean getNvmeSsdDiskCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_LTE);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountNot(Integer nvmeSsdDiskCountNot) {

        this.nvmeSsdDiskCountNot = nvmeSsdDiskCountNot;
        return this;
    }

    /**
     * Get nvmeSsdDiskCountNot
     *
     * @return nvmeSsdDiskCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmeSsdDiskCountNot() {
        return nvmeSsdDiskCountNot;
    }

    public void setNvmeSsdDiskCountNot(Integer nvmeSsdDiskCountNot) {
        this.nvmeSsdDiskCountNot = nvmeSsdDiskCountNot;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT);
        return this;
    }

    public void setNvmeSsdDiskCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT);
        }
    }

    public boolean getNvmeSsdDiskCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT);
    }

    public DiskPoolWhereInput nvmeSsdDiskCountNotIn(List<Integer> nvmeSsdDiskCountNotIn) {

        this.nvmeSsdDiskCountNotIn = nvmeSsdDiskCountNotIn;
        return this;
    }

    public DiskPoolWhereInput addNvmeSsdDiskCountNotInItem(Integer nvmeSsdDiskCountNotInItem) {
        if (this.nvmeSsdDiskCountNotIn == null) {
            this.nvmeSsdDiskCountNotIn = new ArrayList<Integer>();
        }
        this.nvmeSsdDiskCountNotIn.add(nvmeSsdDiskCountNotInItem);
        return this;
    }

    /**
     * Get nvmeSsdDiskCountNotIn
     *
     * @return nvmeSsdDiskCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNvmeSsdDiskCountNotIn() {
        return nvmeSsdDiskCountNotIn;
    }

    public void setNvmeSsdDiskCountNotIn(List<Integer> nvmeSsdDiskCountNotIn) {
        this.nvmeSsdDiskCountNotIn = nvmeSsdDiskCountNotIn;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput nvmeSsdDiskCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN);
        return this;
    }

    public void setNvmeSsdDiskCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN);
        }
    }

    public boolean getNvmeSsdDiskCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT_NOT_IN);
    }

    public DiskPoolWhereInput perfAllocatedDataSpace(Long perfAllocatedDataSpace) {

        this.perfAllocatedDataSpace = perfAllocatedDataSpace;
        return this;
    }

    /**
     * Get perfAllocatedDataSpace
     *
     * @return perfAllocatedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpace() {
        return perfAllocatedDataSpace;
    }

    public void setPerfAllocatedDataSpace(Long perfAllocatedDataSpace) {
        this.perfAllocatedDataSpace = perfAllocatedDataSpace;
    }

    public DiskPoolWhereInput perfAllocatedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        return this;
    }

    public void setPerfAllocatedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        }
    }

    public boolean getPerfAllocatedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceGt(Long perfAllocatedDataSpaceGt) {

        this.perfAllocatedDataSpaceGt = perfAllocatedDataSpaceGt;
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceGt
     *
     * @return perfAllocatedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpaceGt() {
        return perfAllocatedDataSpaceGt;
    }

    public void setPerfAllocatedDataSpaceGt(Long perfAllocatedDataSpaceGt) {
        this.perfAllocatedDataSpaceGt = perfAllocatedDataSpaceGt;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT);
        return this;
    }

    public void setPerfAllocatedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT);
        }
    }

    public boolean getPerfAllocatedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GT);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceGte(Long perfAllocatedDataSpaceGte) {

        this.perfAllocatedDataSpaceGte = perfAllocatedDataSpaceGte;
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceGte
     *
     * @return perfAllocatedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpaceGte() {
        return perfAllocatedDataSpaceGte;
    }

    public void setPerfAllocatedDataSpaceGte(Long perfAllocatedDataSpaceGte) {
        this.perfAllocatedDataSpaceGte = perfAllocatedDataSpaceGte;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE);
        return this;
    }

    public void setPerfAllocatedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE);
        }
    }

    public boolean getPerfAllocatedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_GTE);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceIn(List<Long> perfAllocatedDataSpaceIn) {

        this.perfAllocatedDataSpaceIn = perfAllocatedDataSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addPerfAllocatedDataSpaceInItem(Long perfAllocatedDataSpaceInItem) {
        if (this.perfAllocatedDataSpaceIn == null) {
            this.perfAllocatedDataSpaceIn = new ArrayList<Long>();
        }
        this.perfAllocatedDataSpaceIn.add(perfAllocatedDataSpaceInItem);
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceIn
     *
     * @return perfAllocatedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfAllocatedDataSpaceIn() {
        return perfAllocatedDataSpaceIn;
    }

    public void setPerfAllocatedDataSpaceIn(List<Long> perfAllocatedDataSpaceIn) {
        this.perfAllocatedDataSpaceIn = perfAllocatedDataSpaceIn;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN);
        return this;
    }

    public void setPerfAllocatedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN);
        }
    }

    public boolean getPerfAllocatedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_IN);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceLt(Long perfAllocatedDataSpaceLt) {

        this.perfAllocatedDataSpaceLt = perfAllocatedDataSpaceLt;
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceLt
     *
     * @return perfAllocatedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpaceLt() {
        return perfAllocatedDataSpaceLt;
    }

    public void setPerfAllocatedDataSpaceLt(Long perfAllocatedDataSpaceLt) {
        this.perfAllocatedDataSpaceLt = perfAllocatedDataSpaceLt;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT);
        return this;
    }

    public void setPerfAllocatedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT);
        }
    }

    public boolean getPerfAllocatedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LT);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceLte(Long perfAllocatedDataSpaceLte) {

        this.perfAllocatedDataSpaceLte = perfAllocatedDataSpaceLte;
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceLte
     *
     * @return perfAllocatedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpaceLte() {
        return perfAllocatedDataSpaceLte;
    }

    public void setPerfAllocatedDataSpaceLte(Long perfAllocatedDataSpaceLte) {
        this.perfAllocatedDataSpaceLte = perfAllocatedDataSpaceLte;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE);
        return this;
    }

    public void setPerfAllocatedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE);
        }
    }

    public boolean getPerfAllocatedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_LTE);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceNot(Long perfAllocatedDataSpaceNot) {

        this.perfAllocatedDataSpaceNot = perfAllocatedDataSpaceNot;
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceNot
     *
     * @return perfAllocatedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpaceNot() {
        return perfAllocatedDataSpaceNot;
    }

    public void setPerfAllocatedDataSpaceNot(Long perfAllocatedDataSpaceNot) {
        this.perfAllocatedDataSpaceNot = perfAllocatedDataSpaceNot;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT);
        return this;
    }

    public void setPerfAllocatedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT);
        }
    }

    public boolean getPerfAllocatedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT);
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceNotIn(List<Long> perfAllocatedDataSpaceNotIn) {

        this.perfAllocatedDataSpaceNotIn = perfAllocatedDataSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addPerfAllocatedDataSpaceNotInItem(
            Long perfAllocatedDataSpaceNotInItem) {
        if (this.perfAllocatedDataSpaceNotIn == null) {
            this.perfAllocatedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.perfAllocatedDataSpaceNotIn.add(perfAllocatedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get perfAllocatedDataSpaceNotIn
     *
     * @return perfAllocatedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfAllocatedDataSpaceNotIn() {
        return perfAllocatedDataSpaceNotIn;
    }

    public void setPerfAllocatedDataSpaceNotIn(List<Long> perfAllocatedDataSpaceNotIn) {
        this.perfAllocatedDataSpaceNotIn = perfAllocatedDataSpaceNotIn;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput perfAllocatedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setPerfAllocatedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getPerfAllocatedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput perfFailureDataSpace(Long perfFailureDataSpace) {

        this.perfFailureDataSpace = perfFailureDataSpace;
        return this;
    }

    /**
     * Get perfFailureDataSpace
     *
     * @return perfFailureDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpace() {
        return perfFailureDataSpace;
    }

    public void setPerfFailureDataSpace(Long perfFailureDataSpace) {
        this.perfFailureDataSpace = perfFailureDataSpace;
    }

    public DiskPoolWhereInput perfFailureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        return this;
    }

    public void setPerfFailureDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        }
    }

    public boolean getPerfFailureDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
    }

    public DiskPoolWhereInput perfFailureDataSpaceGt(Long perfFailureDataSpaceGt) {

        this.perfFailureDataSpaceGt = perfFailureDataSpaceGt;
        return this;
    }

    /**
     * Get perfFailureDataSpaceGt
     *
     * @return perfFailureDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpaceGt() {
        return perfFailureDataSpaceGt;
    }

    public void setPerfFailureDataSpaceGt(Long perfFailureDataSpaceGt) {
        this.perfFailureDataSpaceGt = perfFailureDataSpaceGt;
    }

    public DiskPoolWhereInput perfFailureDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT);
        return this;
    }

    public void setPerfFailureDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT);
        }
    }

    public boolean getPerfFailureDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GT);
    }

    public DiskPoolWhereInput perfFailureDataSpaceGte(Long perfFailureDataSpaceGte) {

        this.perfFailureDataSpaceGte = perfFailureDataSpaceGte;
        return this;
    }

    /**
     * Get perfFailureDataSpaceGte
     *
     * @return perfFailureDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpaceGte() {
        return perfFailureDataSpaceGte;
    }

    public void setPerfFailureDataSpaceGte(Long perfFailureDataSpaceGte) {
        this.perfFailureDataSpaceGte = perfFailureDataSpaceGte;
    }

    public DiskPoolWhereInput perfFailureDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE);
        return this;
    }

    public void setPerfFailureDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE);
        }
    }

    public boolean getPerfFailureDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_GTE);
    }

    public DiskPoolWhereInput perfFailureDataSpaceIn(List<Long> perfFailureDataSpaceIn) {

        this.perfFailureDataSpaceIn = perfFailureDataSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addPerfFailureDataSpaceInItem(Long perfFailureDataSpaceInItem) {
        if (this.perfFailureDataSpaceIn == null) {
            this.perfFailureDataSpaceIn = new ArrayList<Long>();
        }
        this.perfFailureDataSpaceIn.add(perfFailureDataSpaceInItem);
        return this;
    }

    /**
     * Get perfFailureDataSpaceIn
     *
     * @return perfFailureDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfFailureDataSpaceIn() {
        return perfFailureDataSpaceIn;
    }

    public void setPerfFailureDataSpaceIn(List<Long> perfFailureDataSpaceIn) {
        this.perfFailureDataSpaceIn = perfFailureDataSpaceIn;
    }

    public DiskPoolWhereInput perfFailureDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN);
        return this;
    }

    public void setPerfFailureDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN);
        }
    }

    public boolean getPerfFailureDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_IN);
    }

    public DiskPoolWhereInput perfFailureDataSpaceLt(Long perfFailureDataSpaceLt) {

        this.perfFailureDataSpaceLt = perfFailureDataSpaceLt;
        return this;
    }

    /**
     * Get perfFailureDataSpaceLt
     *
     * @return perfFailureDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpaceLt() {
        return perfFailureDataSpaceLt;
    }

    public void setPerfFailureDataSpaceLt(Long perfFailureDataSpaceLt) {
        this.perfFailureDataSpaceLt = perfFailureDataSpaceLt;
    }

    public DiskPoolWhereInput perfFailureDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT);
        return this;
    }

    public void setPerfFailureDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT);
        }
    }

    public boolean getPerfFailureDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LT);
    }

    public DiskPoolWhereInput perfFailureDataSpaceLte(Long perfFailureDataSpaceLte) {

        this.perfFailureDataSpaceLte = perfFailureDataSpaceLte;
        return this;
    }

    /**
     * Get perfFailureDataSpaceLte
     *
     * @return perfFailureDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpaceLte() {
        return perfFailureDataSpaceLte;
    }

    public void setPerfFailureDataSpaceLte(Long perfFailureDataSpaceLte) {
        this.perfFailureDataSpaceLte = perfFailureDataSpaceLte;
    }

    public DiskPoolWhereInput perfFailureDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE);
        return this;
    }

    public void setPerfFailureDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE);
        }
    }

    public boolean getPerfFailureDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_LTE);
    }

    public DiskPoolWhereInput perfFailureDataSpaceNot(Long perfFailureDataSpaceNot) {

        this.perfFailureDataSpaceNot = perfFailureDataSpaceNot;
        return this;
    }

    /**
     * Get perfFailureDataSpaceNot
     *
     * @return perfFailureDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpaceNot() {
        return perfFailureDataSpaceNot;
    }

    public void setPerfFailureDataSpaceNot(Long perfFailureDataSpaceNot) {
        this.perfFailureDataSpaceNot = perfFailureDataSpaceNot;
    }

    public DiskPoolWhereInput perfFailureDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT);
        return this;
    }

    public void setPerfFailureDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT);
        }
    }

    public boolean getPerfFailureDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT);
    }

    public DiskPoolWhereInput perfFailureDataSpaceNotIn(List<Long> perfFailureDataSpaceNotIn) {

        this.perfFailureDataSpaceNotIn = perfFailureDataSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addPerfFailureDataSpaceNotInItem(Long perfFailureDataSpaceNotInItem) {
        if (this.perfFailureDataSpaceNotIn == null) {
            this.perfFailureDataSpaceNotIn = new ArrayList<Long>();
        }
        this.perfFailureDataSpaceNotIn.add(perfFailureDataSpaceNotInItem);
        return this;
    }

    /**
     * Get perfFailureDataSpaceNotIn
     *
     * @return perfFailureDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfFailureDataSpaceNotIn() {
        return perfFailureDataSpaceNotIn;
    }

    public void setPerfFailureDataSpaceNotIn(List<Long> perfFailureDataSpaceNotIn) {
        this.perfFailureDataSpaceNotIn = perfFailureDataSpaceNotIn;
    }

    public DiskPoolWhereInput perfFailureDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput perfFailureDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setPerfFailureDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getPerfFailureDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput perfTotalDataCapacity(Long perfTotalDataCapacity) {

        this.perfTotalDataCapacity = perfTotalDataCapacity;
        return this;
    }

    /**
     * Get perfTotalDataCapacity
     *
     * @return perfTotalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacity() {
        return perfTotalDataCapacity;
    }

    public void setPerfTotalDataCapacity(Long perfTotalDataCapacity) {
        this.perfTotalDataCapacity = perfTotalDataCapacity;
    }

    public DiskPoolWhereInput perfTotalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        return this;
    }

    public void setPerfTotalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        }
    }

    public boolean getPerfTotalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
    }

    public DiskPoolWhereInput perfTotalDataCapacityGt(Long perfTotalDataCapacityGt) {

        this.perfTotalDataCapacityGt = perfTotalDataCapacityGt;
        return this;
    }

    /**
     * Get perfTotalDataCapacityGt
     *
     * @return perfTotalDataCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacityGt() {
        return perfTotalDataCapacityGt;
    }

    public void setPerfTotalDataCapacityGt(Long perfTotalDataCapacityGt) {
        this.perfTotalDataCapacityGt = perfTotalDataCapacityGt;
    }

    public DiskPoolWhereInput perfTotalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public void setPerfTotalDataCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT);
        }
    }

    public boolean getPerfTotalDataCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GT);
    }

    public DiskPoolWhereInput perfTotalDataCapacityGte(Long perfTotalDataCapacityGte) {

        this.perfTotalDataCapacityGte = perfTotalDataCapacityGte;
        return this;
    }

    /**
     * Get perfTotalDataCapacityGte
     *
     * @return perfTotalDataCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacityGte() {
        return perfTotalDataCapacityGte;
    }

    public void setPerfTotalDataCapacityGte(Long perfTotalDataCapacityGte) {
        this.perfTotalDataCapacityGte = perfTotalDataCapacityGte;
    }

    public DiskPoolWhereInput perfTotalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public void setPerfTotalDataCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE);
        }
    }

    public boolean getPerfTotalDataCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_GTE);
    }

    public DiskPoolWhereInput perfTotalDataCapacityIn(List<Long> perfTotalDataCapacityIn) {

        this.perfTotalDataCapacityIn = perfTotalDataCapacityIn;
        return this;
    }

    public DiskPoolWhereInput addPerfTotalDataCapacityInItem(Long perfTotalDataCapacityInItem) {
        if (this.perfTotalDataCapacityIn == null) {
            this.perfTotalDataCapacityIn = new ArrayList<Long>();
        }
        this.perfTotalDataCapacityIn.add(perfTotalDataCapacityInItem);
        return this;
    }

    /**
     * Get perfTotalDataCapacityIn
     *
     * @return perfTotalDataCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfTotalDataCapacityIn() {
        return perfTotalDataCapacityIn;
    }

    public void setPerfTotalDataCapacityIn(List<Long> perfTotalDataCapacityIn) {
        this.perfTotalDataCapacityIn = perfTotalDataCapacityIn;
    }

    public DiskPoolWhereInput perfTotalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public void setPerfTotalDataCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN);
        }
    }

    public boolean getPerfTotalDataCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_IN);
    }

    public DiskPoolWhereInput perfTotalDataCapacityLt(Long perfTotalDataCapacityLt) {

        this.perfTotalDataCapacityLt = perfTotalDataCapacityLt;
        return this;
    }

    /**
     * Get perfTotalDataCapacityLt
     *
     * @return perfTotalDataCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacityLt() {
        return perfTotalDataCapacityLt;
    }

    public void setPerfTotalDataCapacityLt(Long perfTotalDataCapacityLt) {
        this.perfTotalDataCapacityLt = perfTotalDataCapacityLt;
    }

    public DiskPoolWhereInput perfTotalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public void setPerfTotalDataCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT);
        }
    }

    public boolean getPerfTotalDataCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LT);
    }

    public DiskPoolWhereInput perfTotalDataCapacityLte(Long perfTotalDataCapacityLte) {

        this.perfTotalDataCapacityLte = perfTotalDataCapacityLte;
        return this;
    }

    /**
     * Get perfTotalDataCapacityLte
     *
     * @return perfTotalDataCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacityLte() {
        return perfTotalDataCapacityLte;
    }

    public void setPerfTotalDataCapacityLte(Long perfTotalDataCapacityLte) {
        this.perfTotalDataCapacityLte = perfTotalDataCapacityLte;
    }

    public DiskPoolWhereInput perfTotalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public void setPerfTotalDataCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE);
        }
    }

    public boolean getPerfTotalDataCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_LTE);
    }

    public DiskPoolWhereInput perfTotalDataCapacityNot(Long perfTotalDataCapacityNot) {

        this.perfTotalDataCapacityNot = perfTotalDataCapacityNot;
        return this;
    }

    /**
     * Get perfTotalDataCapacityNot
     *
     * @return perfTotalDataCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacityNot() {
        return perfTotalDataCapacityNot;
    }

    public void setPerfTotalDataCapacityNot(Long perfTotalDataCapacityNot) {
        this.perfTotalDataCapacityNot = perfTotalDataCapacityNot;
    }

    public DiskPoolWhereInput perfTotalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public void setPerfTotalDataCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT);
        }
    }

    public boolean getPerfTotalDataCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT);
    }

    public DiskPoolWhereInput perfTotalDataCapacityNotIn(List<Long> perfTotalDataCapacityNotIn) {

        this.perfTotalDataCapacityNotIn = perfTotalDataCapacityNotIn;
        return this;
    }

    public DiskPoolWhereInput addPerfTotalDataCapacityNotInItem(
            Long perfTotalDataCapacityNotInItem) {
        if (this.perfTotalDataCapacityNotIn == null) {
            this.perfTotalDataCapacityNotIn = new ArrayList<Long>();
        }
        this.perfTotalDataCapacityNotIn.add(perfTotalDataCapacityNotInItem);
        return this;
    }

    /**
     * Get perfTotalDataCapacityNotIn
     *
     * @return perfTotalDataCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfTotalDataCapacityNotIn() {
        return perfTotalDataCapacityNotIn;
    }

    public void setPerfTotalDataCapacityNotIn(List<Long> perfTotalDataCapacityNotIn) {
        this.perfTotalDataCapacityNotIn = perfTotalDataCapacityNotIn;
    }

    public DiskPoolWhereInput perfTotalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput perfTotalDataCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public void setPerfTotalDataCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN);
        }
    }

    public boolean getPerfTotalDataCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY_NOT_IN);
    }

    public DiskPoolWhereInput perfUsedDataSpace(Long perfUsedDataSpace) {

        this.perfUsedDataSpace = perfUsedDataSpace;
        return this;
    }

    /**
     * Get perfUsedDataSpace
     *
     * @return perfUsedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpace() {
        return perfUsedDataSpace;
    }

    public void setPerfUsedDataSpace(Long perfUsedDataSpace) {
        this.perfUsedDataSpace = perfUsedDataSpace;
    }

    public DiskPoolWhereInput perfUsedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        return this;
    }

    public void setPerfUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        }
    }

    public boolean getPerfUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
    }

    public DiskPoolWhereInput perfUsedDataSpaceGt(Long perfUsedDataSpaceGt) {

        this.perfUsedDataSpaceGt = perfUsedDataSpaceGt;
        return this;
    }

    /**
     * Get perfUsedDataSpaceGt
     *
     * @return perfUsedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpaceGt() {
        return perfUsedDataSpaceGt;
    }

    public void setPerfUsedDataSpaceGt(Long perfUsedDataSpaceGt) {
        this.perfUsedDataSpaceGt = perfUsedDataSpaceGt;
    }

    public DiskPoolWhereInput perfUsedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT);
        return this;
    }

    public void setPerfUsedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT);
        }
    }

    public boolean getPerfUsedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GT);
    }

    public DiskPoolWhereInput perfUsedDataSpaceGte(Long perfUsedDataSpaceGte) {

        this.perfUsedDataSpaceGte = perfUsedDataSpaceGte;
        return this;
    }

    /**
     * Get perfUsedDataSpaceGte
     *
     * @return perfUsedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpaceGte() {
        return perfUsedDataSpaceGte;
    }

    public void setPerfUsedDataSpaceGte(Long perfUsedDataSpaceGte) {
        this.perfUsedDataSpaceGte = perfUsedDataSpaceGte;
    }

    public DiskPoolWhereInput perfUsedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE);
        return this;
    }

    public void setPerfUsedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE);
        }
    }

    public boolean getPerfUsedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_GTE);
    }

    public DiskPoolWhereInput perfUsedDataSpaceIn(List<Long> perfUsedDataSpaceIn) {

        this.perfUsedDataSpaceIn = perfUsedDataSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addPerfUsedDataSpaceInItem(Long perfUsedDataSpaceInItem) {
        if (this.perfUsedDataSpaceIn == null) {
            this.perfUsedDataSpaceIn = new ArrayList<Long>();
        }
        this.perfUsedDataSpaceIn.add(perfUsedDataSpaceInItem);
        return this;
    }

    /**
     * Get perfUsedDataSpaceIn
     *
     * @return perfUsedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfUsedDataSpaceIn() {
        return perfUsedDataSpaceIn;
    }

    public void setPerfUsedDataSpaceIn(List<Long> perfUsedDataSpaceIn) {
        this.perfUsedDataSpaceIn = perfUsedDataSpaceIn;
    }

    public DiskPoolWhereInput perfUsedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN);
        return this;
    }

    public void setPerfUsedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN);
        }
    }

    public boolean getPerfUsedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_IN);
    }

    public DiskPoolWhereInput perfUsedDataSpaceLt(Long perfUsedDataSpaceLt) {

        this.perfUsedDataSpaceLt = perfUsedDataSpaceLt;
        return this;
    }

    /**
     * Get perfUsedDataSpaceLt
     *
     * @return perfUsedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpaceLt() {
        return perfUsedDataSpaceLt;
    }

    public void setPerfUsedDataSpaceLt(Long perfUsedDataSpaceLt) {
        this.perfUsedDataSpaceLt = perfUsedDataSpaceLt;
    }

    public DiskPoolWhereInput perfUsedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT);
        return this;
    }

    public void setPerfUsedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT);
        }
    }

    public boolean getPerfUsedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LT);
    }

    public DiskPoolWhereInput perfUsedDataSpaceLte(Long perfUsedDataSpaceLte) {

        this.perfUsedDataSpaceLte = perfUsedDataSpaceLte;
        return this;
    }

    /**
     * Get perfUsedDataSpaceLte
     *
     * @return perfUsedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpaceLte() {
        return perfUsedDataSpaceLte;
    }

    public void setPerfUsedDataSpaceLte(Long perfUsedDataSpaceLte) {
        this.perfUsedDataSpaceLte = perfUsedDataSpaceLte;
    }

    public DiskPoolWhereInput perfUsedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE);
        return this;
    }

    public void setPerfUsedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE);
        }
    }

    public boolean getPerfUsedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_LTE);
    }

    public DiskPoolWhereInput perfUsedDataSpaceNot(Long perfUsedDataSpaceNot) {

        this.perfUsedDataSpaceNot = perfUsedDataSpaceNot;
        return this;
    }

    /**
     * Get perfUsedDataSpaceNot
     *
     * @return perfUsedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpaceNot() {
        return perfUsedDataSpaceNot;
    }

    public void setPerfUsedDataSpaceNot(Long perfUsedDataSpaceNot) {
        this.perfUsedDataSpaceNot = perfUsedDataSpaceNot;
    }

    public DiskPoolWhereInput perfUsedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT);
        return this;
    }

    public void setPerfUsedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT);
        }
    }

    public boolean getPerfUsedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT);
    }

    public DiskPoolWhereInput perfUsedDataSpaceNotIn(List<Long> perfUsedDataSpaceNotIn) {

        this.perfUsedDataSpaceNotIn = perfUsedDataSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addPerfUsedDataSpaceNotInItem(Long perfUsedDataSpaceNotInItem) {
        if (this.perfUsedDataSpaceNotIn == null) {
            this.perfUsedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.perfUsedDataSpaceNotIn.add(perfUsedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get perfUsedDataSpaceNotIn
     *
     * @return perfUsedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfUsedDataSpaceNotIn() {
        return perfUsedDataSpaceNotIn;
    }

    public void setPerfUsedDataSpaceNotIn(List<Long> perfUsedDataSpaceNotIn) {
        this.perfUsedDataSpaceNotIn = perfUsedDataSpaceNotIn;
    }

    public DiskPoolWhereInput perfUsedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput perfUsedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setPerfUsedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getPerfUsedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput perfValidDataSpace(Long perfValidDataSpace) {

        this.perfValidDataSpace = perfValidDataSpace;
        return this;
    }

    /**
     * Get perfValidDataSpace
     *
     * @return perfValidDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpace() {
        return perfValidDataSpace;
    }

    public void setPerfValidDataSpace(Long perfValidDataSpace) {
        this.perfValidDataSpace = perfValidDataSpace;
    }

    public DiskPoolWhereInput perfValidDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        return this;
    }

    public void setPerfValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        }
    }

    public boolean getPerfValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
    }

    public DiskPoolWhereInput perfValidDataSpaceGt(Long perfValidDataSpaceGt) {

        this.perfValidDataSpaceGt = perfValidDataSpaceGt;
        return this;
    }

    /**
     * Get perfValidDataSpaceGt
     *
     * @return perfValidDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpaceGt() {
        return perfValidDataSpaceGt;
    }

    public void setPerfValidDataSpaceGt(Long perfValidDataSpaceGt) {
        this.perfValidDataSpaceGt = perfValidDataSpaceGt;
    }

    public DiskPoolWhereInput perfValidDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT);
        return this;
    }

    public void setPerfValidDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT);
        }
    }

    public boolean getPerfValidDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GT);
    }

    public DiskPoolWhereInput perfValidDataSpaceGte(Long perfValidDataSpaceGte) {

        this.perfValidDataSpaceGte = perfValidDataSpaceGte;
        return this;
    }

    /**
     * Get perfValidDataSpaceGte
     *
     * @return perfValidDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpaceGte() {
        return perfValidDataSpaceGte;
    }

    public void setPerfValidDataSpaceGte(Long perfValidDataSpaceGte) {
        this.perfValidDataSpaceGte = perfValidDataSpaceGte;
    }

    public DiskPoolWhereInput perfValidDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE);
        return this;
    }

    public void setPerfValidDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE);
        }
    }

    public boolean getPerfValidDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_GTE);
    }

    public DiskPoolWhereInput perfValidDataSpaceIn(List<Long> perfValidDataSpaceIn) {

        this.perfValidDataSpaceIn = perfValidDataSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addPerfValidDataSpaceInItem(Long perfValidDataSpaceInItem) {
        if (this.perfValidDataSpaceIn == null) {
            this.perfValidDataSpaceIn = new ArrayList<Long>();
        }
        this.perfValidDataSpaceIn.add(perfValidDataSpaceInItem);
        return this;
    }

    /**
     * Get perfValidDataSpaceIn
     *
     * @return perfValidDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfValidDataSpaceIn() {
        return perfValidDataSpaceIn;
    }

    public void setPerfValidDataSpaceIn(List<Long> perfValidDataSpaceIn) {
        this.perfValidDataSpaceIn = perfValidDataSpaceIn;
    }

    public DiskPoolWhereInput perfValidDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN);
        return this;
    }

    public void setPerfValidDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN);
        }
    }

    public boolean getPerfValidDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_IN);
    }

    public DiskPoolWhereInput perfValidDataSpaceLt(Long perfValidDataSpaceLt) {

        this.perfValidDataSpaceLt = perfValidDataSpaceLt;
        return this;
    }

    /**
     * Get perfValidDataSpaceLt
     *
     * @return perfValidDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpaceLt() {
        return perfValidDataSpaceLt;
    }

    public void setPerfValidDataSpaceLt(Long perfValidDataSpaceLt) {
        this.perfValidDataSpaceLt = perfValidDataSpaceLt;
    }

    public DiskPoolWhereInput perfValidDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT);
        return this;
    }

    public void setPerfValidDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT);
        }
    }

    public boolean getPerfValidDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LT);
    }

    public DiskPoolWhereInput perfValidDataSpaceLte(Long perfValidDataSpaceLte) {

        this.perfValidDataSpaceLte = perfValidDataSpaceLte;
        return this;
    }

    /**
     * Get perfValidDataSpaceLte
     *
     * @return perfValidDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpaceLte() {
        return perfValidDataSpaceLte;
    }

    public void setPerfValidDataSpaceLte(Long perfValidDataSpaceLte) {
        this.perfValidDataSpaceLte = perfValidDataSpaceLte;
    }

    public DiskPoolWhereInput perfValidDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE);
        return this;
    }

    public void setPerfValidDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE);
        }
    }

    public boolean getPerfValidDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_LTE);
    }

    public DiskPoolWhereInput perfValidDataSpaceNot(Long perfValidDataSpaceNot) {

        this.perfValidDataSpaceNot = perfValidDataSpaceNot;
        return this;
    }

    /**
     * Get perfValidDataSpaceNot
     *
     * @return perfValidDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpaceNot() {
        return perfValidDataSpaceNot;
    }

    public void setPerfValidDataSpaceNot(Long perfValidDataSpaceNot) {
        this.perfValidDataSpaceNot = perfValidDataSpaceNot;
    }

    public DiskPoolWhereInput perfValidDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT);
        return this;
    }

    public void setPerfValidDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT);
        }
    }

    public boolean getPerfValidDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT);
    }

    public DiskPoolWhereInput perfValidDataSpaceNotIn(List<Long> perfValidDataSpaceNotIn) {

        this.perfValidDataSpaceNotIn = perfValidDataSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addPerfValidDataSpaceNotInItem(Long perfValidDataSpaceNotInItem) {
        if (this.perfValidDataSpaceNotIn == null) {
            this.perfValidDataSpaceNotIn = new ArrayList<Long>();
        }
        this.perfValidDataSpaceNotIn.add(perfValidDataSpaceNotInItem);
        return this;
    }

    /**
     * Get perfValidDataSpaceNotIn
     *
     * @return perfValidDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPerfValidDataSpaceNotIn() {
        return perfValidDataSpaceNotIn;
    }

    public void setPerfValidDataSpaceNotIn(List<Long> perfValidDataSpaceNotIn) {
        this.perfValidDataSpaceNotIn = perfValidDataSpaceNotIn;
    }

    public DiskPoolWhereInput perfValidDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput perfValidDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setPerfValidDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getPerfValidDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
        return this;
    }

    /**
     * Get plannedPrioritizedSpace
     *
     * @return plannedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpace() {
        return plannedPrioritizedSpace;
    }

    public void setPlannedPrioritizedSpace(Long plannedPrioritizedSpace) {
        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
    }

    public DiskPoolWhereInput plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public void setPlannedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        }
    }

    public boolean getPlannedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceGt(Long plannedPrioritizedSpaceGt) {

        this.plannedPrioritizedSpaceGt = plannedPrioritizedSpaceGt;
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceGt
     *
     * @return plannedPrioritizedSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpaceGt() {
        return plannedPrioritizedSpaceGt;
    }

    public void setPlannedPrioritizedSpaceGt(Long plannedPrioritizedSpaceGt) {
        this.plannedPrioritizedSpaceGt = plannedPrioritizedSpaceGt;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT);
        return this;
    }

    public void setPlannedPrioritizedSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT);
        }
    }

    public boolean getPlannedPrioritizedSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GT);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceGte(Long plannedPrioritizedSpaceGte) {

        this.plannedPrioritizedSpaceGte = plannedPrioritizedSpaceGte;
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceGte
     *
     * @return plannedPrioritizedSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpaceGte() {
        return plannedPrioritizedSpaceGte;
    }

    public void setPlannedPrioritizedSpaceGte(Long plannedPrioritizedSpaceGte) {
        this.plannedPrioritizedSpaceGte = plannedPrioritizedSpaceGte;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE);
        return this;
    }

    public void setPlannedPrioritizedSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE);
        }
    }

    public boolean getPlannedPrioritizedSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_GTE);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceIn(List<Long> plannedPrioritizedSpaceIn) {

        this.plannedPrioritizedSpaceIn = plannedPrioritizedSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addPlannedPrioritizedSpaceInItem(Long plannedPrioritizedSpaceInItem) {
        if (this.plannedPrioritizedSpaceIn == null) {
            this.plannedPrioritizedSpaceIn = new ArrayList<Long>();
        }
        this.plannedPrioritizedSpaceIn.add(plannedPrioritizedSpaceInItem);
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceIn
     *
     * @return plannedPrioritizedSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPlannedPrioritizedSpaceIn() {
        return plannedPrioritizedSpaceIn;
    }

    public void setPlannedPrioritizedSpaceIn(List<Long> plannedPrioritizedSpaceIn) {
        this.plannedPrioritizedSpaceIn = plannedPrioritizedSpaceIn;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN);
        return this;
    }

    public void setPlannedPrioritizedSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN);
        }
    }

    public boolean getPlannedPrioritizedSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_IN);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceLt(Long plannedPrioritizedSpaceLt) {

        this.plannedPrioritizedSpaceLt = plannedPrioritizedSpaceLt;
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceLt
     *
     * @return plannedPrioritizedSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpaceLt() {
        return plannedPrioritizedSpaceLt;
    }

    public void setPlannedPrioritizedSpaceLt(Long plannedPrioritizedSpaceLt) {
        this.plannedPrioritizedSpaceLt = plannedPrioritizedSpaceLt;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT);
        return this;
    }

    public void setPlannedPrioritizedSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT);
        }
    }

    public boolean getPlannedPrioritizedSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LT);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceLte(Long plannedPrioritizedSpaceLte) {

        this.plannedPrioritizedSpaceLte = plannedPrioritizedSpaceLte;
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceLte
     *
     * @return plannedPrioritizedSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpaceLte() {
        return plannedPrioritizedSpaceLte;
    }

    public void setPlannedPrioritizedSpaceLte(Long plannedPrioritizedSpaceLte) {
        this.plannedPrioritizedSpaceLte = plannedPrioritizedSpaceLte;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE);
        return this;
    }

    public void setPlannedPrioritizedSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE);
        }
    }

    public boolean getPlannedPrioritizedSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_LTE);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceNot(Long plannedPrioritizedSpaceNot) {

        this.plannedPrioritizedSpaceNot = plannedPrioritizedSpaceNot;
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceNot
     *
     * @return plannedPrioritizedSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpaceNot() {
        return plannedPrioritizedSpaceNot;
    }

    public void setPlannedPrioritizedSpaceNot(Long plannedPrioritizedSpaceNot) {
        this.plannedPrioritizedSpaceNot = plannedPrioritizedSpaceNot;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT);
        return this;
    }

    public void setPlannedPrioritizedSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT);
        }
    }

    public boolean getPlannedPrioritizedSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT);
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceNotIn(
            List<Long> plannedPrioritizedSpaceNotIn) {

        this.plannedPrioritizedSpaceNotIn = plannedPrioritizedSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addPlannedPrioritizedSpaceNotInItem(
            Long plannedPrioritizedSpaceNotInItem) {
        if (this.plannedPrioritizedSpaceNotIn == null) {
            this.plannedPrioritizedSpaceNotIn = new ArrayList<Long>();
        }
        this.plannedPrioritizedSpaceNotIn.add(plannedPrioritizedSpaceNotInItem);
        return this;
    }

    /**
     * Get plannedPrioritizedSpaceNotIn
     *
     * @return plannedPrioritizedSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPlannedPrioritizedSpaceNotIn() {
        return plannedPrioritizedSpaceNotIn;
    }

    public void setPlannedPrioritizedSpaceNotIn(List<Long> plannedPrioritizedSpaceNotIn) {
        this.plannedPrioritizedSpaceNotIn = plannedPrioritizedSpaceNotIn;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput plannedPrioritizedSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN);
        return this;
    }

    public void setPlannedPrioritizedSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN);
        }
    }

    public boolean getPlannedPrioritizedSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput prioSpacePercentage(Double prioSpacePercentage) {

        this.prioSpacePercentage = prioSpacePercentage;
        return this;
    }

    /**
     * Get prioSpacePercentage
     *
     * @return prioSpacePercentage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentage() {
        return prioSpacePercentage;
    }

    public void setPrioSpacePercentage(Double prioSpacePercentage) {
        this.prioSpacePercentage = prioSpacePercentage;
    }

    public DiskPoolWhereInput prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public void setPrioSpacePercentage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        }
    }

    public boolean getPrioSpacePercentage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
    }

    public DiskPoolWhereInput prioSpacePercentageGt(Double prioSpacePercentageGt) {

        this.prioSpacePercentageGt = prioSpacePercentageGt;
        return this;
    }

    /**
     * Get prioSpacePercentageGt
     *
     * @return prioSpacePercentageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentageGt() {
        return prioSpacePercentageGt;
    }

    public void setPrioSpacePercentageGt(Double prioSpacePercentageGt) {
        this.prioSpacePercentageGt = prioSpacePercentageGt;
    }

    public DiskPoolWhereInput prioSpacePercentageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT);
        return this;
    }

    public void setPrioSpacePercentageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT);
        }
    }

    public boolean getPrioSpacePercentageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GT);
    }

    public DiskPoolWhereInput prioSpacePercentageGte(Double prioSpacePercentageGte) {

        this.prioSpacePercentageGte = prioSpacePercentageGte;
        return this;
    }

    /**
     * Get prioSpacePercentageGte
     *
     * @return prioSpacePercentageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentageGte() {
        return prioSpacePercentageGte;
    }

    public void setPrioSpacePercentageGte(Double prioSpacePercentageGte) {
        this.prioSpacePercentageGte = prioSpacePercentageGte;
    }

    public DiskPoolWhereInput prioSpacePercentageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE);
        return this;
    }

    public void setPrioSpacePercentageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE);
        }
    }

    public boolean getPrioSpacePercentageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_GTE);
    }

    public DiskPoolWhereInput prioSpacePercentageIn(List<Double> prioSpacePercentageIn) {

        this.prioSpacePercentageIn = prioSpacePercentageIn;
        return this;
    }

    public DiskPoolWhereInput addPrioSpacePercentageInItem(Double prioSpacePercentageInItem) {
        if (this.prioSpacePercentageIn == null) {
            this.prioSpacePercentageIn = new ArrayList<Double>();
        }
        this.prioSpacePercentageIn.add(prioSpacePercentageInItem);
        return this;
    }

    /**
     * Get prioSpacePercentageIn
     *
     * @return prioSpacePercentageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getPrioSpacePercentageIn() {
        return prioSpacePercentageIn;
    }

    public void setPrioSpacePercentageIn(List<Double> prioSpacePercentageIn) {
        this.prioSpacePercentageIn = prioSpacePercentageIn;
    }

    public DiskPoolWhereInput prioSpacePercentageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN);
        return this;
    }

    public void setPrioSpacePercentageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN);
        }
    }

    public boolean getPrioSpacePercentageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_IN);
    }

    public DiskPoolWhereInput prioSpacePercentageLt(Double prioSpacePercentageLt) {

        this.prioSpacePercentageLt = prioSpacePercentageLt;
        return this;
    }

    /**
     * Get prioSpacePercentageLt
     *
     * @return prioSpacePercentageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentageLt() {
        return prioSpacePercentageLt;
    }

    public void setPrioSpacePercentageLt(Double prioSpacePercentageLt) {
        this.prioSpacePercentageLt = prioSpacePercentageLt;
    }

    public DiskPoolWhereInput prioSpacePercentageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT);
        return this;
    }

    public void setPrioSpacePercentageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT);
        }
    }

    public boolean getPrioSpacePercentageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LT);
    }

    public DiskPoolWhereInput prioSpacePercentageLte(Double prioSpacePercentageLte) {

        this.prioSpacePercentageLte = prioSpacePercentageLte;
        return this;
    }

    /**
     * Get prioSpacePercentageLte
     *
     * @return prioSpacePercentageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentageLte() {
        return prioSpacePercentageLte;
    }

    public void setPrioSpacePercentageLte(Double prioSpacePercentageLte) {
        this.prioSpacePercentageLte = prioSpacePercentageLte;
    }

    public DiskPoolWhereInput prioSpacePercentageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE);
        return this;
    }

    public void setPrioSpacePercentageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE);
        }
    }

    public boolean getPrioSpacePercentageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_LTE);
    }

    public DiskPoolWhereInput prioSpacePercentageNot(Double prioSpacePercentageNot) {

        this.prioSpacePercentageNot = prioSpacePercentageNot;
        return this;
    }

    /**
     * Get prioSpacePercentageNot
     *
     * @return prioSpacePercentageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentageNot() {
        return prioSpacePercentageNot;
    }

    public void setPrioSpacePercentageNot(Double prioSpacePercentageNot) {
        this.prioSpacePercentageNot = prioSpacePercentageNot;
    }

    public DiskPoolWhereInput prioSpacePercentageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT);
        return this;
    }

    public void setPrioSpacePercentageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT);
        }
    }

    public boolean getPrioSpacePercentageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT);
    }

    public DiskPoolWhereInput prioSpacePercentageNotIn(List<Double> prioSpacePercentageNotIn) {

        this.prioSpacePercentageNotIn = prioSpacePercentageNotIn;
        return this;
    }

    public DiskPoolWhereInput addPrioSpacePercentageNotInItem(Double prioSpacePercentageNotInItem) {
        if (this.prioSpacePercentageNotIn == null) {
            this.prioSpacePercentageNotIn = new ArrayList<Double>();
        }
        this.prioSpacePercentageNotIn.add(prioSpacePercentageNotInItem);
        return this;
    }

    /**
     * Get prioSpacePercentageNotIn
     *
     * @return prioSpacePercentageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getPrioSpacePercentageNotIn() {
        return prioSpacePercentageNotIn;
    }

    public void setPrioSpacePercentageNotIn(List<Double> prioSpacePercentageNotIn) {
        this.prioSpacePercentageNotIn = prioSpacePercentageNotIn;
    }

    public DiskPoolWhereInput prioSpacePercentageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput prioSpacePercentageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN);
        return this;
    }

    public void setPrioSpacePercentageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN);
        }
    }

    public boolean getPrioSpacePercentageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE_NOT_IN);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCount(Integer sataOrSasSsdDiskCount) {

        this.sataOrSasSsdDiskCount = sataOrSasSsdDiskCount;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCount
     *
     * @return sataOrSasSsdDiskCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSataOrSasSsdDiskCount() {
        return sataOrSasSsdDiskCount;
    }

    public void setSataOrSasSsdDiskCount(Integer sataOrSasSsdDiskCount) {
        this.sataOrSasSsdDiskCount = sataOrSasSsdDiskCount;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        return this;
    }

    public void setSataOrSasSsdDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        }
    }

    public boolean getSataOrSasSsdDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountGt(Integer sataOrSasSsdDiskCountGt) {

        this.sataOrSasSsdDiskCountGt = sataOrSasSsdDiskCountGt;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountGt
     *
     * @return sataOrSasSsdDiskCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSataOrSasSsdDiskCountGt() {
        return sataOrSasSsdDiskCountGt;
    }

    public void setSataOrSasSsdDiskCountGt(Integer sataOrSasSsdDiskCountGt) {
        this.sataOrSasSsdDiskCountGt = sataOrSasSsdDiskCountGt;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT);
        return this;
    }

    public void setSataOrSasSsdDiskCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT);
        }
    }

    public boolean getSataOrSasSsdDiskCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GT);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountGte(Integer sataOrSasSsdDiskCountGte) {

        this.sataOrSasSsdDiskCountGte = sataOrSasSsdDiskCountGte;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountGte
     *
     * @return sataOrSasSsdDiskCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSataOrSasSsdDiskCountGte() {
        return sataOrSasSsdDiskCountGte;
    }

    public void setSataOrSasSsdDiskCountGte(Integer sataOrSasSsdDiskCountGte) {
        this.sataOrSasSsdDiskCountGte = sataOrSasSsdDiskCountGte;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE);
        return this;
    }

    public void setSataOrSasSsdDiskCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE);
        }
    }

    public boolean getSataOrSasSsdDiskCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_GTE);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountIn(List<Integer> sataOrSasSsdDiskCountIn) {

        this.sataOrSasSsdDiskCountIn = sataOrSasSsdDiskCountIn;
        return this;
    }

    public DiskPoolWhereInput addSataOrSasSsdDiskCountInItem(Integer sataOrSasSsdDiskCountInItem) {
        if (this.sataOrSasSsdDiskCountIn == null) {
            this.sataOrSasSsdDiskCountIn = new ArrayList<Integer>();
        }
        this.sataOrSasSsdDiskCountIn.add(sataOrSasSsdDiskCountInItem);
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountIn
     *
     * @return sataOrSasSsdDiskCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSataOrSasSsdDiskCountIn() {
        return sataOrSasSsdDiskCountIn;
    }

    public void setSataOrSasSsdDiskCountIn(List<Integer> sataOrSasSsdDiskCountIn) {
        this.sataOrSasSsdDiskCountIn = sataOrSasSsdDiskCountIn;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN);
        return this;
    }

    public void setSataOrSasSsdDiskCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN);
        }
    }

    public boolean getSataOrSasSsdDiskCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_IN);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountLt(Integer sataOrSasSsdDiskCountLt) {

        this.sataOrSasSsdDiskCountLt = sataOrSasSsdDiskCountLt;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountLt
     *
     * @return sataOrSasSsdDiskCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSataOrSasSsdDiskCountLt() {
        return sataOrSasSsdDiskCountLt;
    }

    public void setSataOrSasSsdDiskCountLt(Integer sataOrSasSsdDiskCountLt) {
        this.sataOrSasSsdDiskCountLt = sataOrSasSsdDiskCountLt;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT);
        return this;
    }

    public void setSataOrSasSsdDiskCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT);
        }
    }

    public boolean getSataOrSasSsdDiskCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LT);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountLte(Integer sataOrSasSsdDiskCountLte) {

        this.sataOrSasSsdDiskCountLte = sataOrSasSsdDiskCountLte;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountLte
     *
     * @return sataOrSasSsdDiskCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSataOrSasSsdDiskCountLte() {
        return sataOrSasSsdDiskCountLte;
    }

    public void setSataOrSasSsdDiskCountLte(Integer sataOrSasSsdDiskCountLte) {
        this.sataOrSasSsdDiskCountLte = sataOrSasSsdDiskCountLte;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE);
        return this;
    }

    public void setSataOrSasSsdDiskCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE);
        }
    }

    public boolean getSataOrSasSsdDiskCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_LTE);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountNot(Integer sataOrSasSsdDiskCountNot) {

        this.sataOrSasSsdDiskCountNot = sataOrSasSsdDiskCountNot;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountNot
     *
     * @return sataOrSasSsdDiskCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSataOrSasSsdDiskCountNot() {
        return sataOrSasSsdDiskCountNot;
    }

    public void setSataOrSasSsdDiskCountNot(Integer sataOrSasSsdDiskCountNot) {
        this.sataOrSasSsdDiskCountNot = sataOrSasSsdDiskCountNot;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT);
        return this;
    }

    public void setSataOrSasSsdDiskCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT);
        }
    }

    public boolean getSataOrSasSsdDiskCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT);
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountNotIn(List<Integer> sataOrSasSsdDiskCountNotIn) {

        this.sataOrSasSsdDiskCountNotIn = sataOrSasSsdDiskCountNotIn;
        return this;
    }

    public DiskPoolWhereInput addSataOrSasSsdDiskCountNotInItem(
            Integer sataOrSasSsdDiskCountNotInItem) {
        if (this.sataOrSasSsdDiskCountNotIn == null) {
            this.sataOrSasSsdDiskCountNotIn = new ArrayList<Integer>();
        }
        this.sataOrSasSsdDiskCountNotIn.add(sataOrSasSsdDiskCountNotInItem);
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCountNotIn
     *
     * @return sataOrSasSsdDiskCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSataOrSasSsdDiskCountNotIn() {
        return sataOrSasSsdDiskCountNotIn;
    }

    public void setSataOrSasSsdDiskCountNotIn(List<Integer> sataOrSasSsdDiskCountNotIn) {
        this.sataOrSasSsdDiskCountNotIn = sataOrSasSsdDiskCountNotIn;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput sataOrSasSsdDiskCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN);
        return this;
    }

    public void setSataOrSasSsdDiskCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN);
        }
    }

    public boolean getSataOrSasSsdDiskCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT_NOT_IN);
    }

    public DiskPoolWhereInput status(DiskPoolStatus status) {

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
    public DiskPoolStatus getStatus() {
        return status;
    }

    public void setStatus(DiskPoolStatus status) {
        this.status = status;
    }

    public DiskPoolWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public DiskPoolWhereInput status_ExplictlyNonNull() {
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

    public DiskPoolWhereInput statusIn(List<DiskPoolStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public DiskPoolWhereInput addStatusInItem(DiskPoolStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<DiskPoolStatus>();
        }
        this.statusIn.add(statusInItem);
        return this;
    }

    /**
     * Get statusIn
     *
     * @return statusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskPoolStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<DiskPoolStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public DiskPoolWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public DiskPoolWhereInput statusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public void setStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        }
    }

    public boolean getStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_IN);
    }

    public DiskPoolWhereInput statusNot(DiskPoolStatus statusNot) {

        this.statusNot = statusNot;
        return this;
    }

    /**
     * Get statusNot
     *
     * @return statusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskPoolStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(DiskPoolStatus statusNot) {
        this.statusNot = statusNot;
    }

    public DiskPoolWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public DiskPoolWhereInput statusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public void setStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        }
    }

    public boolean getStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT);
    }

    public DiskPoolWhereInput statusNotIn(List<DiskPoolStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public DiskPoolWhereInput addStatusNotInItem(DiskPoolStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<DiskPoolStatus>();
        }
        this.statusNotIn.add(statusNotInItem);
        return this;
    }

    /**
     * Get statusNotIn
     *
     * @return statusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskPoolStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<DiskPoolStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public DiskPoolWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput statusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public void setStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        }
    }

    public boolean getStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT_IN);
    }

    public DiskPoolWhereInput totalCacheCapacity(Long totalCacheCapacity) {

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

    public DiskPoolWhereInput totalCacheCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacity_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityGt(Long totalCacheCapacityGt) {

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

    public DiskPoolWhereInput totalCacheCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityGt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityGte(Long totalCacheCapacityGte) {

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

    public DiskPoolWhereInput totalCacheCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityGte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityIn(List<Long> totalCacheCapacityIn) {

        this.totalCacheCapacityIn = totalCacheCapacityIn;
        return this;
    }

    public DiskPoolWhereInput addTotalCacheCapacityInItem(Long totalCacheCapacityInItem) {
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

    public DiskPoolWhereInput totalCacheCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityLt(Long totalCacheCapacityLt) {

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

    public DiskPoolWhereInput totalCacheCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityLt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityLte(Long totalCacheCapacityLte) {

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

    public DiskPoolWhereInput totalCacheCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityLte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityNot(Long totalCacheCapacityNot) {

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

    public DiskPoolWhereInput totalCacheCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityNot_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {

        this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
        return this;
    }

    public DiskPoolWhereInput addTotalCacheCapacityNotInItem(Long totalCacheCapacityNotInItem) {
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

    public DiskPoolWhereInput totalCacheCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput totalCacheCapacityNotIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacity(Long totalDataCapacity) {

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

    public DiskPoolWhereInput totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacity_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityGt(Long totalDataCapacityGt) {

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

    public DiskPoolWhereInput totalDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityGt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityGte(Long totalDataCapacityGte) {

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

    public DiskPoolWhereInput totalDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityGte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityIn(List<Long> totalDataCapacityIn) {

        this.totalDataCapacityIn = totalDataCapacityIn;
        return this;
    }

    public DiskPoolWhereInput addTotalDataCapacityInItem(Long totalDataCapacityInItem) {
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

    public DiskPoolWhereInput totalDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityLt(Long totalDataCapacityLt) {

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

    public DiskPoolWhereInput totalDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityLt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityLte(Long totalDataCapacityLte) {

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

    public DiskPoolWhereInput totalDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityLte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityNot(Long totalDataCapacityNot) {

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

    public DiskPoolWhereInput totalDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityNot_ExplictlyNonNull() {
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

    public DiskPoolWhereInput totalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {

        this.totalDataCapacityNotIn = totalDataCapacityNotIn;
        return this;
    }

    public DiskPoolWhereInput addTotalDataCapacityNotInItem(Long totalDataCapacityNotInItem) {
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

    public DiskPoolWhereInput totalDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput totalDataCapacityNotIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput useState(DiskPoolUseState useState) {

        this.useState = useState;
        return this;
    }

    /**
     * Get useState
     *
     * @return useState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskPoolUseState getUseState() {
        return useState;
    }

    public void setUseState(DiskPoolUseState useState) {
        this.useState = useState;
    }

    public DiskPoolWhereInput useState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_STATE);
        return this;
    }

    public DiskPoolWhereInput useState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_STATE);
        return this;
    }

    public void setUseState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_STATE);
        }
    }

    public boolean getUseState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_STATE);
    }

    public DiskPoolWhereInput useStateIn(List<DiskPoolUseState> useStateIn) {

        this.useStateIn = useStateIn;
        return this;
    }

    public DiskPoolWhereInput addUseStateInItem(DiskPoolUseState useStateInItem) {
        if (this.useStateIn == null) {
            this.useStateIn = new ArrayList<DiskPoolUseState>();
        }
        this.useStateIn.add(useStateInItem);
        return this;
    }

    /**
     * Get useStateIn
     *
     * @return useStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskPoolUseState> getUseStateIn() {
        return useStateIn;
    }

    public void setUseStateIn(List<DiskPoolUseState> useStateIn) {
        this.useStateIn = useStateIn;
    }

    public DiskPoolWhereInput useStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_STATE_IN);
        return this;
    }

    public DiskPoolWhereInput useStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_STATE_IN);
        return this;
    }

    public void setUseStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_STATE_IN);
        }
    }

    public boolean getUseStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_STATE_IN);
    }

    public DiskPoolWhereInput useStateNot(DiskPoolUseState useStateNot) {

        this.useStateNot = useStateNot;
        return this;
    }

    /**
     * Get useStateNot
     *
     * @return useStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskPoolUseState getUseStateNot() {
        return useStateNot;
    }

    public void setUseStateNot(DiskPoolUseState useStateNot) {
        this.useStateNot = useStateNot;
    }

    public DiskPoolWhereInput useStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_STATE_NOT);
        return this;
    }

    public DiskPoolWhereInput useStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_STATE_NOT);
        return this;
    }

    public void setUseStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_STATE_NOT);
        }
    }

    public boolean getUseStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_STATE_NOT);
    }

    public DiskPoolWhereInput useStateNotIn(List<DiskPoolUseState> useStateNotIn) {

        this.useStateNotIn = useStateNotIn;
        return this;
    }

    public DiskPoolWhereInput addUseStateNotInItem(DiskPoolUseState useStateNotInItem) {
        if (this.useStateNotIn == null) {
            this.useStateNotIn = new ArrayList<DiskPoolUseState>();
        }
        this.useStateNotIn.add(useStateNotInItem);
        return this;
    }

    /**
     * Get useStateNotIn
     *
     * @return useStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskPoolUseState> getUseStateNotIn() {
        return useStateNotIn;
    }

    public void setUseStateNotIn(List<DiskPoolUseState> useStateNotIn) {
        this.useStateNotIn = useStateNotIn;
    }

    public DiskPoolWhereInput useStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_STATE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput useStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_STATE_NOT_IN);
        return this;
    }

    public void setUseStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_STATE_NOT_IN);
        }
    }

    public boolean getUseStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_STATE_NOT_IN);
    }

    public DiskPoolWhereInput usedCacheSpace(Long usedCacheSpace) {

        this.usedCacheSpace = usedCacheSpace;
        return this;
    }

    /**
     * Get usedCacheSpace
     *
     * @return usedCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpace() {
        return usedCacheSpace;
    }

    public void setUsedCacheSpace(Long usedCacheSpace) {
        this.usedCacheSpace = usedCacheSpace;
    }

    public DiskPoolWhereInput usedCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE);
        return this;
    }

    public void setUsedCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE);
        }
    }

    public boolean getUsedCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE);
    }

    public DiskPoolWhereInput usedCacheSpaceGt(Long usedCacheSpaceGt) {

        this.usedCacheSpaceGt = usedCacheSpaceGt;
        return this;
    }

    /**
     * Get usedCacheSpaceGt
     *
     * @return usedCacheSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpaceGt() {
        return usedCacheSpaceGt;
    }

    public void setUsedCacheSpaceGt(Long usedCacheSpaceGt) {
        this.usedCacheSpaceGt = usedCacheSpaceGt;
    }

    public DiskPoolWhereInput usedCacheSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_GT);
        return this;
    }

    public void setUsedCacheSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_GT);
        }
    }

    public boolean getUsedCacheSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_GT);
    }

    public DiskPoolWhereInput usedCacheSpaceGte(Long usedCacheSpaceGte) {

        this.usedCacheSpaceGte = usedCacheSpaceGte;
        return this;
    }

    /**
     * Get usedCacheSpaceGte
     *
     * @return usedCacheSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpaceGte() {
        return usedCacheSpaceGte;
    }

    public void setUsedCacheSpaceGte(Long usedCacheSpaceGte) {
        this.usedCacheSpaceGte = usedCacheSpaceGte;
    }

    public DiskPoolWhereInput usedCacheSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_GTE);
        return this;
    }

    public void setUsedCacheSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_GTE);
        }
    }

    public boolean getUsedCacheSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_GTE);
    }

    public DiskPoolWhereInput usedCacheSpaceIn(List<Long> usedCacheSpaceIn) {

        this.usedCacheSpaceIn = usedCacheSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addUsedCacheSpaceInItem(Long usedCacheSpaceInItem) {
        if (this.usedCacheSpaceIn == null) {
            this.usedCacheSpaceIn = new ArrayList<Long>();
        }
        this.usedCacheSpaceIn.add(usedCacheSpaceInItem);
        return this;
    }

    /**
     * Get usedCacheSpaceIn
     *
     * @return usedCacheSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedCacheSpaceIn() {
        return usedCacheSpaceIn;
    }

    public void setUsedCacheSpaceIn(List<Long> usedCacheSpaceIn) {
        this.usedCacheSpaceIn = usedCacheSpaceIn;
    }

    public DiskPoolWhereInput usedCacheSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_IN);
        return this;
    }

    public void setUsedCacheSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_IN);
        }
    }

    public boolean getUsedCacheSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_IN);
    }

    public DiskPoolWhereInput usedCacheSpaceLt(Long usedCacheSpaceLt) {

        this.usedCacheSpaceLt = usedCacheSpaceLt;
        return this;
    }

    /**
     * Get usedCacheSpaceLt
     *
     * @return usedCacheSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpaceLt() {
        return usedCacheSpaceLt;
    }

    public void setUsedCacheSpaceLt(Long usedCacheSpaceLt) {
        this.usedCacheSpaceLt = usedCacheSpaceLt;
    }

    public DiskPoolWhereInput usedCacheSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_LT);
        return this;
    }

    public void setUsedCacheSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_LT);
        }
    }

    public boolean getUsedCacheSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_LT);
    }

    public DiskPoolWhereInput usedCacheSpaceLte(Long usedCacheSpaceLte) {

        this.usedCacheSpaceLte = usedCacheSpaceLte;
        return this;
    }

    /**
     * Get usedCacheSpaceLte
     *
     * @return usedCacheSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpaceLte() {
        return usedCacheSpaceLte;
    }

    public void setUsedCacheSpaceLte(Long usedCacheSpaceLte) {
        this.usedCacheSpaceLte = usedCacheSpaceLte;
    }

    public DiskPoolWhereInput usedCacheSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_LTE);
        return this;
    }

    public void setUsedCacheSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_LTE);
        }
    }

    public boolean getUsedCacheSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_LTE);
    }

    public DiskPoolWhereInput usedCacheSpaceNot(Long usedCacheSpaceNot) {

        this.usedCacheSpaceNot = usedCacheSpaceNot;
        return this;
    }

    /**
     * Get usedCacheSpaceNot
     *
     * @return usedCacheSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpaceNot() {
        return usedCacheSpaceNot;
    }

    public void setUsedCacheSpaceNot(Long usedCacheSpaceNot) {
        this.usedCacheSpaceNot = usedCacheSpaceNot;
    }

    public DiskPoolWhereInput usedCacheSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_NOT);
        return this;
    }

    public void setUsedCacheSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_NOT);
        }
    }

    public boolean getUsedCacheSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_NOT);
    }

    public DiskPoolWhereInput usedCacheSpaceNotIn(List<Long> usedCacheSpaceNotIn) {

        this.usedCacheSpaceNotIn = usedCacheSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addUsedCacheSpaceNotInItem(Long usedCacheSpaceNotInItem) {
        if (this.usedCacheSpaceNotIn == null) {
            this.usedCacheSpaceNotIn = new ArrayList<Long>();
        }
        this.usedCacheSpaceNotIn.add(usedCacheSpaceNotInItem);
        return this;
    }

    /**
     * Get usedCacheSpaceNotIn
     *
     * @return usedCacheSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedCacheSpaceNotIn() {
        return usedCacheSpaceNotIn;
    }

    public void setUsedCacheSpaceNotIn(List<Long> usedCacheSpaceNotIn) {
        this.usedCacheSpaceNotIn = usedCacheSpaceNotIn;
    }

    public DiskPoolWhereInput usedCacheSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput usedCacheSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN);
        return this;
    }

    public void setUsedCacheSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN);
        }
    }

    public boolean getUsedCacheSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput usedDataSpace(Long usedDataSpace) {

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

    public DiskPoolWhereInput usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public DiskPoolWhereInput usedDataSpace_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {

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

    public DiskPoolWhereInput usedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceGt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {

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

    public DiskPoolWhereInput usedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceGte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {

        this.usedDataSpaceIn = usedDataSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
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

    public DiskPoolWhereInput usedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {

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

    public DiskPoolWhereInput usedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceLt_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {

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

    public DiskPoolWhereInput usedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceLte_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {

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

    public DiskPoolWhereInput usedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceNot_ExplictlyNonNull() {
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

    public DiskPoolWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {

        this.usedDataSpaceNotIn = usedDataSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
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

    public DiskPoolWhereInput usedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput usedDataSpaceNotIn_ExplictlyNonNull() {
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

    public DiskPoolWhereInput validCacheSpace(Long validCacheSpace) {

        this.validCacheSpace = validCacheSpace;
        return this;
    }

    /**
     * Get validCacheSpace
     *
     * @return validCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpace() {
        return validCacheSpace;
    }

    public void setValidCacheSpace(Long validCacheSpace) {
        this.validCacheSpace = validCacheSpace;
    }

    public DiskPoolWhereInput validCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE);
        return this;
    }

    public DiskPoolWhereInput validCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE);
        return this;
    }

    public void setValidCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE);
        }
    }

    public boolean getValidCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE);
    }

    public DiskPoolWhereInput validCacheSpaceGt(Long validCacheSpaceGt) {

        this.validCacheSpaceGt = validCacheSpaceGt;
        return this;
    }

    /**
     * Get validCacheSpaceGt
     *
     * @return validCacheSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpaceGt() {
        return validCacheSpaceGt;
    }

    public void setValidCacheSpaceGt(Long validCacheSpaceGt) {
        this.validCacheSpaceGt = validCacheSpaceGt;
    }

    public DiskPoolWhereInput validCacheSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_GT);
        return this;
    }

    public void setValidCacheSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_GT);
        }
    }

    public boolean getValidCacheSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_GT);
    }

    public DiskPoolWhereInput validCacheSpaceGte(Long validCacheSpaceGte) {

        this.validCacheSpaceGte = validCacheSpaceGte;
        return this;
    }

    /**
     * Get validCacheSpaceGte
     *
     * @return validCacheSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpaceGte() {
        return validCacheSpaceGte;
    }

    public void setValidCacheSpaceGte(Long validCacheSpaceGte) {
        this.validCacheSpaceGte = validCacheSpaceGte;
    }

    public DiskPoolWhereInput validCacheSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_GTE);
        return this;
    }

    public void setValidCacheSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_GTE);
        }
    }

    public boolean getValidCacheSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_GTE);
    }

    public DiskPoolWhereInput validCacheSpaceIn(List<Long> validCacheSpaceIn) {

        this.validCacheSpaceIn = validCacheSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addValidCacheSpaceInItem(Long validCacheSpaceInItem) {
        if (this.validCacheSpaceIn == null) {
            this.validCacheSpaceIn = new ArrayList<Long>();
        }
        this.validCacheSpaceIn.add(validCacheSpaceInItem);
        return this;
    }

    /**
     * Get validCacheSpaceIn
     *
     * @return validCacheSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidCacheSpaceIn() {
        return validCacheSpaceIn;
    }

    public void setValidCacheSpaceIn(List<Long> validCacheSpaceIn) {
        this.validCacheSpaceIn = validCacheSpaceIn;
    }

    public DiskPoolWhereInput validCacheSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_IN);
        return this;
    }

    public void setValidCacheSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_IN);
        }
    }

    public boolean getValidCacheSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_IN);
    }

    public DiskPoolWhereInput validCacheSpaceLt(Long validCacheSpaceLt) {

        this.validCacheSpaceLt = validCacheSpaceLt;
        return this;
    }

    /**
     * Get validCacheSpaceLt
     *
     * @return validCacheSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpaceLt() {
        return validCacheSpaceLt;
    }

    public void setValidCacheSpaceLt(Long validCacheSpaceLt) {
        this.validCacheSpaceLt = validCacheSpaceLt;
    }

    public DiskPoolWhereInput validCacheSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_LT);
        return this;
    }

    public void setValidCacheSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_LT);
        }
    }

    public boolean getValidCacheSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_LT);
    }

    public DiskPoolWhereInput validCacheSpaceLte(Long validCacheSpaceLte) {

        this.validCacheSpaceLte = validCacheSpaceLte;
        return this;
    }

    /**
     * Get validCacheSpaceLte
     *
     * @return validCacheSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpaceLte() {
        return validCacheSpaceLte;
    }

    public void setValidCacheSpaceLte(Long validCacheSpaceLte) {
        this.validCacheSpaceLte = validCacheSpaceLte;
    }

    public DiskPoolWhereInput validCacheSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_LTE);
        return this;
    }

    public void setValidCacheSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_LTE);
        }
    }

    public boolean getValidCacheSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_LTE);
    }

    public DiskPoolWhereInput validCacheSpaceNot(Long validCacheSpaceNot) {

        this.validCacheSpaceNot = validCacheSpaceNot;
        return this;
    }

    /**
     * Get validCacheSpaceNot
     *
     * @return validCacheSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpaceNot() {
        return validCacheSpaceNot;
    }

    public void setValidCacheSpaceNot(Long validCacheSpaceNot) {
        this.validCacheSpaceNot = validCacheSpaceNot;
    }

    public DiskPoolWhereInput validCacheSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT);
        return this;
    }

    public void setValidCacheSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT);
        }
    }

    public boolean getValidCacheSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT);
    }

    public DiskPoolWhereInput validCacheSpaceNotIn(List<Long> validCacheSpaceNotIn) {

        this.validCacheSpaceNotIn = validCacheSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addValidCacheSpaceNotInItem(Long validCacheSpaceNotInItem) {
        if (this.validCacheSpaceNotIn == null) {
            this.validCacheSpaceNotIn = new ArrayList<Long>();
        }
        this.validCacheSpaceNotIn.add(validCacheSpaceNotInItem);
        return this;
    }

    /**
     * Get validCacheSpaceNotIn
     *
     * @return validCacheSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidCacheSpaceNotIn() {
        return validCacheSpaceNotIn;
    }

    public void setValidCacheSpaceNotIn(List<Long> validCacheSpaceNotIn) {
        this.validCacheSpaceNotIn = validCacheSpaceNotIn;
    }

    public DiskPoolWhereInput validCacheSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput validCacheSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN);
        return this;
    }

    public void setValidCacheSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN);
        }
    }

    public boolean getValidCacheSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE_NOT_IN);
    }

    public DiskPoolWhereInput validFreeCacheSpace(Long validFreeCacheSpace) {

        this.validFreeCacheSpace = validFreeCacheSpace;
        return this;
    }

    /**
     * Get validFreeCacheSpace
     *
     * @return validFreeCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpace() {
        return validFreeCacheSpace;
    }

    public void setValidFreeCacheSpace(Long validFreeCacheSpace) {
        this.validFreeCacheSpace = validFreeCacheSpace;
    }

    public DiskPoolWhereInput validFreeCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        return this;
    }

    public void setValidFreeCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        }
    }

    public boolean getValidFreeCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
    }

    public DiskPoolWhereInput validFreeCacheSpaceGt(Long validFreeCacheSpaceGt) {

        this.validFreeCacheSpaceGt = validFreeCacheSpaceGt;
        return this;
    }

    /**
     * Get validFreeCacheSpaceGt
     *
     * @return validFreeCacheSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpaceGt() {
        return validFreeCacheSpaceGt;
    }

    public void setValidFreeCacheSpaceGt(Long validFreeCacheSpaceGt) {
        this.validFreeCacheSpaceGt = validFreeCacheSpaceGt;
    }

    public DiskPoolWhereInput validFreeCacheSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT);
        return this;
    }

    public void setValidFreeCacheSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT);
        }
    }

    public boolean getValidFreeCacheSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GT);
    }

    public DiskPoolWhereInput validFreeCacheSpaceGte(Long validFreeCacheSpaceGte) {

        this.validFreeCacheSpaceGte = validFreeCacheSpaceGte;
        return this;
    }

    /**
     * Get validFreeCacheSpaceGte
     *
     * @return validFreeCacheSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpaceGte() {
        return validFreeCacheSpaceGte;
    }

    public void setValidFreeCacheSpaceGte(Long validFreeCacheSpaceGte) {
        this.validFreeCacheSpaceGte = validFreeCacheSpaceGte;
    }

    public DiskPoolWhereInput validFreeCacheSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE);
        return this;
    }

    public void setValidFreeCacheSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE);
        }
    }

    public boolean getValidFreeCacheSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_GTE);
    }

    public DiskPoolWhereInput validFreeCacheSpaceIn(List<Long> validFreeCacheSpaceIn) {

        this.validFreeCacheSpaceIn = validFreeCacheSpaceIn;
        return this;
    }

    public DiskPoolWhereInput addValidFreeCacheSpaceInItem(Long validFreeCacheSpaceInItem) {
        if (this.validFreeCacheSpaceIn == null) {
            this.validFreeCacheSpaceIn = new ArrayList<Long>();
        }
        this.validFreeCacheSpaceIn.add(validFreeCacheSpaceInItem);
        return this;
    }

    /**
     * Get validFreeCacheSpaceIn
     *
     * @return validFreeCacheSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidFreeCacheSpaceIn() {
        return validFreeCacheSpaceIn;
    }

    public void setValidFreeCacheSpaceIn(List<Long> validFreeCacheSpaceIn) {
        this.validFreeCacheSpaceIn = validFreeCacheSpaceIn;
    }

    public DiskPoolWhereInput validFreeCacheSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN);
        return this;
    }

    public void setValidFreeCacheSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN);
        }
    }

    public boolean getValidFreeCacheSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_IN);
    }

    public DiskPoolWhereInput validFreeCacheSpaceLt(Long validFreeCacheSpaceLt) {

        this.validFreeCacheSpaceLt = validFreeCacheSpaceLt;
        return this;
    }

    /**
     * Get validFreeCacheSpaceLt
     *
     * @return validFreeCacheSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpaceLt() {
        return validFreeCacheSpaceLt;
    }

    public void setValidFreeCacheSpaceLt(Long validFreeCacheSpaceLt) {
        this.validFreeCacheSpaceLt = validFreeCacheSpaceLt;
    }

    public DiskPoolWhereInput validFreeCacheSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT);
        return this;
    }

    public void setValidFreeCacheSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT);
        }
    }

    public boolean getValidFreeCacheSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LT);
    }

    public DiskPoolWhereInput validFreeCacheSpaceLte(Long validFreeCacheSpaceLte) {

        this.validFreeCacheSpaceLte = validFreeCacheSpaceLte;
        return this;
    }

    /**
     * Get validFreeCacheSpaceLte
     *
     * @return validFreeCacheSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpaceLte() {
        return validFreeCacheSpaceLte;
    }

    public void setValidFreeCacheSpaceLte(Long validFreeCacheSpaceLte) {
        this.validFreeCacheSpaceLte = validFreeCacheSpaceLte;
    }

    public DiskPoolWhereInput validFreeCacheSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE);
        return this;
    }

    public void setValidFreeCacheSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE);
        }
    }

    public boolean getValidFreeCacheSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_LTE);
    }

    public DiskPoolWhereInput validFreeCacheSpaceNot(Long validFreeCacheSpaceNot) {

        this.validFreeCacheSpaceNot = validFreeCacheSpaceNot;
        return this;
    }

    /**
     * Get validFreeCacheSpaceNot
     *
     * @return validFreeCacheSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpaceNot() {
        return validFreeCacheSpaceNot;
    }

    public void setValidFreeCacheSpaceNot(Long validFreeCacheSpaceNot) {
        this.validFreeCacheSpaceNot = validFreeCacheSpaceNot;
    }

    public DiskPoolWhereInput validFreeCacheSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT);
        return this;
    }

    public void setValidFreeCacheSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT);
        }
    }

    public boolean getValidFreeCacheSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT);
    }

    public DiskPoolWhereInput validFreeCacheSpaceNotIn(List<Long> validFreeCacheSpaceNotIn) {

        this.validFreeCacheSpaceNotIn = validFreeCacheSpaceNotIn;
        return this;
    }

    public DiskPoolWhereInput addValidFreeCacheSpaceNotInItem(Long validFreeCacheSpaceNotInItem) {
        if (this.validFreeCacheSpaceNotIn == null) {
            this.validFreeCacheSpaceNotIn = new ArrayList<Long>();
        }
        this.validFreeCacheSpaceNotIn.add(validFreeCacheSpaceNotInItem);
        return this;
    }

    /**
     * Get validFreeCacheSpaceNotIn
     *
     * @return validFreeCacheSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidFreeCacheSpaceNotIn() {
        return validFreeCacheSpaceNotIn;
    }

    public void setValidFreeCacheSpaceNotIn(List<Long> validFreeCacheSpaceNotIn) {
        this.validFreeCacheSpaceNotIn = validFreeCacheSpaceNotIn;
    }

    public DiskPoolWhereInput validFreeCacheSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN);
        return this;
    }

    public DiskPoolWhereInput validFreeCacheSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN);
        return this;
    }

    public void setValidFreeCacheSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN);
        }
    }

    public boolean getValidFreeCacheSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskPoolWhereInput diskPoolWhereInput = (DiskPoolWhereInput) o;
        return Objects.equals(this.AND, diskPoolWhereInput.AND)
                && Objects.equals(this.NOT, diskPoolWhereInput.NOT)
                && Objects.equals(this.OR, diskPoolWhereInput.OR)
                && Objects.equals(this.chunkId, diskPoolWhereInput.chunkId)
                && Objects.equals(this.chunkIdGt, diskPoolWhereInput.chunkIdGt)
                && Objects.equals(this.chunkIdGte, diskPoolWhereInput.chunkIdGte)
                && Objects.equals(this.chunkIdIn, diskPoolWhereInput.chunkIdIn)
                && Objects.equals(this.chunkIdLt, diskPoolWhereInput.chunkIdLt)
                && Objects.equals(this.chunkIdLte, diskPoolWhereInput.chunkIdLte)
                && Objects.equals(this.chunkIdNot, diskPoolWhereInput.chunkIdNot)
                && Objects.equals(this.chunkIdNotIn, diskPoolWhereInput.chunkIdNotIn)
                && Objects.equals(this.chunkInsId, diskPoolWhereInput.chunkInsId)
                && Objects.equals(this.chunkInsIdGt, diskPoolWhereInput.chunkInsIdGt)
                && Objects.equals(this.chunkInsIdGte, diskPoolWhereInput.chunkInsIdGte)
                && Objects.equals(this.chunkInsIdIn, diskPoolWhereInput.chunkInsIdIn)
                && Objects.equals(this.chunkInsIdLt, diskPoolWhereInput.chunkInsIdLt)
                && Objects.equals(this.chunkInsIdLte, diskPoolWhereInput.chunkInsIdLte)
                && Objects.equals(this.chunkInsIdNot, diskPoolWhereInput.chunkInsIdNot)
                && Objects.equals(this.chunkInsIdNotIn, diskPoolWhereInput.chunkInsIdNotIn)
                && Objects.equals(this.dataSpaceUsage, diskPoolWhereInput.dataSpaceUsage)
                && Objects.equals(this.dataSpaceUsageGt, diskPoolWhereInput.dataSpaceUsageGt)
                && Objects.equals(this.dataSpaceUsageGte, diskPoolWhereInput.dataSpaceUsageGte)
                && Objects.equals(this.dataSpaceUsageIn, diskPoolWhereInput.dataSpaceUsageIn)
                && Objects.equals(this.dataSpaceUsageLt, diskPoolWhereInput.dataSpaceUsageLt)
                && Objects.equals(this.dataSpaceUsageLte, diskPoolWhereInput.dataSpaceUsageLte)
                && Objects.equals(this.dataSpaceUsageNot, diskPoolWhereInput.dataSpaceUsageNot)
                && Objects.equals(this.dataSpaceUsageNotIn, diskPoolWhereInput.dataSpaceUsageNotIn)
                && Objects.equals(this.dirtyCacheSpace, diskPoolWhereInput.dirtyCacheSpace)
                && Objects.equals(this.dirtyCacheSpaceGt, diskPoolWhereInput.dirtyCacheSpaceGt)
                && Objects.equals(this.dirtyCacheSpaceGte, diskPoolWhereInput.dirtyCacheSpaceGte)
                && Objects.equals(this.dirtyCacheSpaceIn, diskPoolWhereInput.dirtyCacheSpaceIn)
                && Objects.equals(this.dirtyCacheSpaceLt, diskPoolWhereInput.dirtyCacheSpaceLt)
                && Objects.equals(this.dirtyCacheSpaceLte, diskPoolWhereInput.dirtyCacheSpaceLte)
                && Objects.equals(this.dirtyCacheSpaceNot, diskPoolWhereInput.dirtyCacheSpaceNot)
                && Objects.equals(
                        this.dirtyCacheSpaceNotIn, diskPoolWhereInput.dirtyCacheSpaceNotIn)
                && Objects.equals(this.dirtyCacheUsage, diskPoolWhereInput.dirtyCacheUsage)
                && Objects.equals(this.dirtyCacheUsageGt, diskPoolWhereInput.dirtyCacheUsageGt)
                && Objects.equals(this.dirtyCacheUsageGte, diskPoolWhereInput.dirtyCacheUsageGte)
                && Objects.equals(this.dirtyCacheUsageIn, diskPoolWhereInput.dirtyCacheUsageIn)
                && Objects.equals(this.dirtyCacheUsageLt, diskPoolWhereInput.dirtyCacheUsageLt)
                && Objects.equals(this.dirtyCacheUsageLte, diskPoolWhereInput.dirtyCacheUsageLte)
                && Objects.equals(this.dirtyCacheUsageNot, diskPoolWhereInput.dirtyCacheUsageNot)
                && Objects.equals(
                        this.dirtyCacheUsageNotIn, diskPoolWhereInput.dirtyCacheUsageNotIn)
                && Objects.equals(this.disksEvery, diskPoolWhereInput.disksEvery)
                && Objects.equals(this.disksNone, diskPoolWhereInput.disksNone)
                && Objects.equals(this.disksSome, diskPoolWhereInput.disksSome)
                && Objects.equals(this.failureCacheSpace, diskPoolWhereInput.failureCacheSpace)
                && Objects.equals(this.failureCacheSpaceGt, diskPoolWhereInput.failureCacheSpaceGt)
                && Objects.equals(
                        this.failureCacheSpaceGte, diskPoolWhereInput.failureCacheSpaceGte)
                && Objects.equals(this.failureCacheSpaceIn, diskPoolWhereInput.failureCacheSpaceIn)
                && Objects.equals(this.failureCacheSpaceLt, diskPoolWhereInput.failureCacheSpaceLt)
                && Objects.equals(
                        this.failureCacheSpaceLte, diskPoolWhereInput.failureCacheSpaceLte)
                && Objects.equals(
                        this.failureCacheSpaceNot, diskPoolWhereInput.failureCacheSpaceNot)
                && Objects.equals(
                        this.failureCacheSpaceNotIn, diskPoolWhereInput.failureCacheSpaceNotIn)
                && Objects.equals(this.failureDataSpace, diskPoolWhereInput.failureDataSpace)
                && Objects.equals(this.failureDataSpaceGt, diskPoolWhereInput.failureDataSpaceGt)
                && Objects.equals(this.failureDataSpaceGte, diskPoolWhereInput.failureDataSpaceGte)
                && Objects.equals(this.failureDataSpaceIn, diskPoolWhereInput.failureDataSpaceIn)
                && Objects.equals(this.failureDataSpaceLt, diskPoolWhereInput.failureDataSpaceLt)
                && Objects.equals(this.failureDataSpaceLte, diskPoolWhereInput.failureDataSpaceLte)
                && Objects.equals(this.failureDataSpaceNot, diskPoolWhereInput.failureDataSpaceNot)
                && Objects.equals(
                        this.failureDataSpaceNotIn, diskPoolWhereInput.failureDataSpaceNotIn)
                && Objects.equals(this.hddDiskCount, diskPoolWhereInput.hddDiskCount)
                && Objects.equals(this.hddDiskCountGt, diskPoolWhereInput.hddDiskCountGt)
                && Objects.equals(this.hddDiskCountGte, diskPoolWhereInput.hddDiskCountGte)
                && Objects.equals(this.hddDiskCountIn, diskPoolWhereInput.hddDiskCountIn)
                && Objects.equals(this.hddDiskCountLt, diskPoolWhereInput.hddDiskCountLt)
                && Objects.equals(this.hddDiskCountLte, diskPoolWhereInput.hddDiskCountLte)
                && Objects.equals(this.hddDiskCountNot, diskPoolWhereInput.hddDiskCountNot)
                && Objects.equals(this.hddDiskCountNotIn, diskPoolWhereInput.hddDiskCountNotIn)
                && Objects.equals(this.host, diskPoolWhereInput.host)
                && Objects.equals(this.id, diskPoolWhereInput.id)
                && Objects.equals(this.idContains, diskPoolWhereInput.idContains)
                && Objects.equals(this.idEndsWith, diskPoolWhereInput.idEndsWith)
                && Objects.equals(this.idGt, diskPoolWhereInput.idGt)
                && Objects.equals(this.idGte, diskPoolWhereInput.idGte)
                && Objects.equals(this.idIn, diskPoolWhereInput.idIn)
                && Objects.equals(this.idLt, diskPoolWhereInput.idLt)
                && Objects.equals(this.idLte, diskPoolWhereInput.idLte)
                && Objects.equals(this.idNot, diskPoolWhereInput.idNot)
                && Objects.equals(this.idNotContains, diskPoolWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, diskPoolWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, diskPoolWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, diskPoolWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, diskPoolWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, diskPoolWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, diskPoolWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, diskPoolWhereInput.labelsSome)
                && Objects.equals(this.localId, diskPoolWhereInput.localId)
                && Objects.equals(this.localIdContains, diskPoolWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, diskPoolWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, diskPoolWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, diskPoolWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, diskPoolWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, diskPoolWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, diskPoolWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, diskPoolWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, diskPoolWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, diskPoolWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, diskPoolWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, diskPoolWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, diskPoolWhereInput.localIdStartsWith)
                && Objects.equals(this.numaNode, diskPoolWhereInput.numaNode)
                && Objects.equals(this.numaNodeContains, diskPoolWhereInput.numaNodeContains)
                && Objects.equals(this.numaNodeEndsWith, diskPoolWhereInput.numaNodeEndsWith)
                && Objects.equals(this.numaNodeGt, diskPoolWhereInput.numaNodeGt)
                && Objects.equals(this.numaNodeGte, diskPoolWhereInput.numaNodeGte)
                && Objects.equals(this.numaNodeIn, diskPoolWhereInput.numaNodeIn)
                && Objects.equals(this.numaNodeLt, diskPoolWhereInput.numaNodeLt)
                && Objects.equals(this.numaNodeLte, diskPoolWhereInput.numaNodeLte)
                && Objects.equals(this.numaNodeNot, diskPoolWhereInput.numaNodeNot)
                && Objects.equals(this.numaNodeNotContains, diskPoolWhereInput.numaNodeNotContains)
                && Objects.equals(this.numaNodeNotEndsWith, diskPoolWhereInput.numaNodeNotEndsWith)
                && Objects.equals(this.numaNodeNotIn, diskPoolWhereInput.numaNodeNotIn)
                && Objects.equals(
                        this.numaNodeNotStartsWith, diskPoolWhereInput.numaNodeNotStartsWith)
                && Objects.equals(this.numaNodeStartsWith, diskPoolWhereInput.numaNodeStartsWith)
                && Objects.equals(this.nvmeSsdDiskCount, diskPoolWhereInput.nvmeSsdDiskCount)
                && Objects.equals(this.nvmeSsdDiskCountGt, diskPoolWhereInput.nvmeSsdDiskCountGt)
                && Objects.equals(this.nvmeSsdDiskCountGte, diskPoolWhereInput.nvmeSsdDiskCountGte)
                && Objects.equals(this.nvmeSsdDiskCountIn, diskPoolWhereInput.nvmeSsdDiskCountIn)
                && Objects.equals(this.nvmeSsdDiskCountLt, diskPoolWhereInput.nvmeSsdDiskCountLt)
                && Objects.equals(this.nvmeSsdDiskCountLte, diskPoolWhereInput.nvmeSsdDiskCountLte)
                && Objects.equals(this.nvmeSsdDiskCountNot, diskPoolWhereInput.nvmeSsdDiskCountNot)
                && Objects.equals(
                        this.nvmeSsdDiskCountNotIn, diskPoolWhereInput.nvmeSsdDiskCountNotIn)
                && Objects.equals(
                        this.perfAllocatedDataSpace, diskPoolWhereInput.perfAllocatedDataSpace)
                && Objects.equals(
                        this.perfAllocatedDataSpaceGt, diskPoolWhereInput.perfAllocatedDataSpaceGt)
                && Objects.equals(
                        this.perfAllocatedDataSpaceGte,
                        diskPoolWhereInput.perfAllocatedDataSpaceGte)
                && Objects.equals(
                        this.perfAllocatedDataSpaceIn, diskPoolWhereInput.perfAllocatedDataSpaceIn)
                && Objects.equals(
                        this.perfAllocatedDataSpaceLt, diskPoolWhereInput.perfAllocatedDataSpaceLt)
                && Objects.equals(
                        this.perfAllocatedDataSpaceLte,
                        diskPoolWhereInput.perfAllocatedDataSpaceLte)
                && Objects.equals(
                        this.perfAllocatedDataSpaceNot,
                        diskPoolWhereInput.perfAllocatedDataSpaceNot)
                && Objects.equals(
                        this.perfAllocatedDataSpaceNotIn,
                        diskPoolWhereInput.perfAllocatedDataSpaceNotIn)
                && Objects.equals(
                        this.perfFailureDataSpace, diskPoolWhereInput.perfFailureDataSpace)
                && Objects.equals(
                        this.perfFailureDataSpaceGt, diskPoolWhereInput.perfFailureDataSpaceGt)
                && Objects.equals(
                        this.perfFailureDataSpaceGte, diskPoolWhereInput.perfFailureDataSpaceGte)
                && Objects.equals(
                        this.perfFailureDataSpaceIn, diskPoolWhereInput.perfFailureDataSpaceIn)
                && Objects.equals(
                        this.perfFailureDataSpaceLt, diskPoolWhereInput.perfFailureDataSpaceLt)
                && Objects.equals(
                        this.perfFailureDataSpaceLte, diskPoolWhereInput.perfFailureDataSpaceLte)
                && Objects.equals(
                        this.perfFailureDataSpaceNot, diskPoolWhereInput.perfFailureDataSpaceNot)
                && Objects.equals(
                        this.perfFailureDataSpaceNotIn,
                        diskPoolWhereInput.perfFailureDataSpaceNotIn)
                && Objects.equals(
                        this.perfTotalDataCapacity, diskPoolWhereInput.perfTotalDataCapacity)
                && Objects.equals(
                        this.perfTotalDataCapacityGt, diskPoolWhereInput.perfTotalDataCapacityGt)
                && Objects.equals(
                        this.perfTotalDataCapacityGte, diskPoolWhereInput.perfTotalDataCapacityGte)
                && Objects.equals(
                        this.perfTotalDataCapacityIn, diskPoolWhereInput.perfTotalDataCapacityIn)
                && Objects.equals(
                        this.perfTotalDataCapacityLt, diskPoolWhereInput.perfTotalDataCapacityLt)
                && Objects.equals(
                        this.perfTotalDataCapacityLte, diskPoolWhereInput.perfTotalDataCapacityLte)
                && Objects.equals(
                        this.perfTotalDataCapacityNot, diskPoolWhereInput.perfTotalDataCapacityNot)
                && Objects.equals(
                        this.perfTotalDataCapacityNotIn,
                        diskPoolWhereInput.perfTotalDataCapacityNotIn)
                && Objects.equals(this.perfUsedDataSpace, diskPoolWhereInput.perfUsedDataSpace)
                && Objects.equals(this.perfUsedDataSpaceGt, diskPoolWhereInput.perfUsedDataSpaceGt)
                && Objects.equals(
                        this.perfUsedDataSpaceGte, diskPoolWhereInput.perfUsedDataSpaceGte)
                && Objects.equals(this.perfUsedDataSpaceIn, diskPoolWhereInput.perfUsedDataSpaceIn)
                && Objects.equals(this.perfUsedDataSpaceLt, diskPoolWhereInput.perfUsedDataSpaceLt)
                && Objects.equals(
                        this.perfUsedDataSpaceLte, diskPoolWhereInput.perfUsedDataSpaceLte)
                && Objects.equals(
                        this.perfUsedDataSpaceNot, diskPoolWhereInput.perfUsedDataSpaceNot)
                && Objects.equals(
                        this.perfUsedDataSpaceNotIn, diskPoolWhereInput.perfUsedDataSpaceNotIn)
                && Objects.equals(this.perfValidDataSpace, diskPoolWhereInput.perfValidDataSpace)
                && Objects.equals(
                        this.perfValidDataSpaceGt, diskPoolWhereInput.perfValidDataSpaceGt)
                && Objects.equals(
                        this.perfValidDataSpaceGte, diskPoolWhereInput.perfValidDataSpaceGte)
                && Objects.equals(
                        this.perfValidDataSpaceIn, diskPoolWhereInput.perfValidDataSpaceIn)
                && Objects.equals(
                        this.perfValidDataSpaceLt, diskPoolWhereInput.perfValidDataSpaceLt)
                && Objects.equals(
                        this.perfValidDataSpaceLte, diskPoolWhereInput.perfValidDataSpaceLte)
                && Objects.equals(
                        this.perfValidDataSpaceNot, diskPoolWhereInput.perfValidDataSpaceNot)
                && Objects.equals(
                        this.perfValidDataSpaceNotIn, diskPoolWhereInput.perfValidDataSpaceNotIn)
                && Objects.equals(
                        this.plannedPrioritizedSpace, diskPoolWhereInput.plannedPrioritizedSpace)
                && Objects.equals(
                        this.plannedPrioritizedSpaceGt,
                        diskPoolWhereInput.plannedPrioritizedSpaceGt)
                && Objects.equals(
                        this.plannedPrioritizedSpaceGte,
                        diskPoolWhereInput.plannedPrioritizedSpaceGte)
                && Objects.equals(
                        this.plannedPrioritizedSpaceIn,
                        diskPoolWhereInput.plannedPrioritizedSpaceIn)
                && Objects.equals(
                        this.plannedPrioritizedSpaceLt,
                        diskPoolWhereInput.plannedPrioritizedSpaceLt)
                && Objects.equals(
                        this.plannedPrioritizedSpaceLte,
                        diskPoolWhereInput.plannedPrioritizedSpaceLte)
                && Objects.equals(
                        this.plannedPrioritizedSpaceNot,
                        diskPoolWhereInput.plannedPrioritizedSpaceNot)
                && Objects.equals(
                        this.plannedPrioritizedSpaceNotIn,
                        diskPoolWhereInput.plannedPrioritizedSpaceNotIn)
                && Objects.equals(this.prioSpacePercentage, diskPoolWhereInput.prioSpacePercentage)
                && Objects.equals(
                        this.prioSpacePercentageGt, diskPoolWhereInput.prioSpacePercentageGt)
                && Objects.equals(
                        this.prioSpacePercentageGte, diskPoolWhereInput.prioSpacePercentageGte)
                && Objects.equals(
                        this.prioSpacePercentageIn, diskPoolWhereInput.prioSpacePercentageIn)
                && Objects.equals(
                        this.prioSpacePercentageLt, diskPoolWhereInput.prioSpacePercentageLt)
                && Objects.equals(
                        this.prioSpacePercentageLte, diskPoolWhereInput.prioSpacePercentageLte)
                && Objects.equals(
                        this.prioSpacePercentageNot, diskPoolWhereInput.prioSpacePercentageNot)
                && Objects.equals(
                        this.prioSpacePercentageNotIn, diskPoolWhereInput.prioSpacePercentageNotIn)
                && Objects.equals(
                        this.sataOrSasSsdDiskCount, diskPoolWhereInput.sataOrSasSsdDiskCount)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountGt, diskPoolWhereInput.sataOrSasSsdDiskCountGt)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountGte, diskPoolWhereInput.sataOrSasSsdDiskCountGte)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountIn, diskPoolWhereInput.sataOrSasSsdDiskCountIn)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountLt, diskPoolWhereInput.sataOrSasSsdDiskCountLt)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountLte, diskPoolWhereInput.sataOrSasSsdDiskCountLte)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountNot, diskPoolWhereInput.sataOrSasSsdDiskCountNot)
                && Objects.equals(
                        this.sataOrSasSsdDiskCountNotIn,
                        diskPoolWhereInput.sataOrSasSsdDiskCountNotIn)
                && Objects.equals(this.status, diskPoolWhereInput.status)
                && Objects.equals(this.statusIn, diskPoolWhereInput.statusIn)
                && Objects.equals(this.statusNot, diskPoolWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, diskPoolWhereInput.statusNotIn)
                && Objects.equals(this.totalCacheCapacity, diskPoolWhereInput.totalCacheCapacity)
                && Objects.equals(
                        this.totalCacheCapacityGt, diskPoolWhereInput.totalCacheCapacityGt)
                && Objects.equals(
                        this.totalCacheCapacityGte, diskPoolWhereInput.totalCacheCapacityGte)
                && Objects.equals(
                        this.totalCacheCapacityIn, diskPoolWhereInput.totalCacheCapacityIn)
                && Objects.equals(
                        this.totalCacheCapacityLt, diskPoolWhereInput.totalCacheCapacityLt)
                && Objects.equals(
                        this.totalCacheCapacityLte, diskPoolWhereInput.totalCacheCapacityLte)
                && Objects.equals(
                        this.totalCacheCapacityNot, diskPoolWhereInput.totalCacheCapacityNot)
                && Objects.equals(
                        this.totalCacheCapacityNotIn, diskPoolWhereInput.totalCacheCapacityNotIn)
                && Objects.equals(this.totalDataCapacity, diskPoolWhereInput.totalDataCapacity)
                && Objects.equals(this.totalDataCapacityGt, diskPoolWhereInput.totalDataCapacityGt)
                && Objects.equals(
                        this.totalDataCapacityGte, diskPoolWhereInput.totalDataCapacityGte)
                && Objects.equals(this.totalDataCapacityIn, diskPoolWhereInput.totalDataCapacityIn)
                && Objects.equals(this.totalDataCapacityLt, diskPoolWhereInput.totalDataCapacityLt)
                && Objects.equals(
                        this.totalDataCapacityLte, diskPoolWhereInput.totalDataCapacityLte)
                && Objects.equals(
                        this.totalDataCapacityNot, diskPoolWhereInput.totalDataCapacityNot)
                && Objects.equals(
                        this.totalDataCapacityNotIn, diskPoolWhereInput.totalDataCapacityNotIn)
                && Objects.equals(this.useState, diskPoolWhereInput.useState)
                && Objects.equals(this.useStateIn, diskPoolWhereInput.useStateIn)
                && Objects.equals(this.useStateNot, diskPoolWhereInput.useStateNot)
                && Objects.equals(this.useStateNotIn, diskPoolWhereInput.useStateNotIn)
                && Objects.equals(this.usedCacheSpace, diskPoolWhereInput.usedCacheSpace)
                && Objects.equals(this.usedCacheSpaceGt, diskPoolWhereInput.usedCacheSpaceGt)
                && Objects.equals(this.usedCacheSpaceGte, diskPoolWhereInput.usedCacheSpaceGte)
                && Objects.equals(this.usedCacheSpaceIn, diskPoolWhereInput.usedCacheSpaceIn)
                && Objects.equals(this.usedCacheSpaceLt, diskPoolWhereInput.usedCacheSpaceLt)
                && Objects.equals(this.usedCacheSpaceLte, diskPoolWhereInput.usedCacheSpaceLte)
                && Objects.equals(this.usedCacheSpaceNot, diskPoolWhereInput.usedCacheSpaceNot)
                && Objects.equals(this.usedCacheSpaceNotIn, diskPoolWhereInput.usedCacheSpaceNotIn)
                && Objects.equals(this.usedDataSpace, diskPoolWhereInput.usedDataSpace)
                && Objects.equals(this.usedDataSpaceGt, diskPoolWhereInput.usedDataSpaceGt)
                && Objects.equals(this.usedDataSpaceGte, diskPoolWhereInput.usedDataSpaceGte)
                && Objects.equals(this.usedDataSpaceIn, diskPoolWhereInput.usedDataSpaceIn)
                && Objects.equals(this.usedDataSpaceLt, diskPoolWhereInput.usedDataSpaceLt)
                && Objects.equals(this.usedDataSpaceLte, diskPoolWhereInput.usedDataSpaceLte)
                && Objects.equals(this.usedDataSpaceNot, diskPoolWhereInput.usedDataSpaceNot)
                && Objects.equals(this.usedDataSpaceNotIn, diskPoolWhereInput.usedDataSpaceNotIn)
                && Objects.equals(this.validCacheSpace, diskPoolWhereInput.validCacheSpace)
                && Objects.equals(this.validCacheSpaceGt, diskPoolWhereInput.validCacheSpaceGt)
                && Objects.equals(this.validCacheSpaceGte, diskPoolWhereInput.validCacheSpaceGte)
                && Objects.equals(this.validCacheSpaceIn, diskPoolWhereInput.validCacheSpaceIn)
                && Objects.equals(this.validCacheSpaceLt, diskPoolWhereInput.validCacheSpaceLt)
                && Objects.equals(this.validCacheSpaceLte, diskPoolWhereInput.validCacheSpaceLte)
                && Objects.equals(this.validCacheSpaceNot, diskPoolWhereInput.validCacheSpaceNot)
                && Objects.equals(
                        this.validCacheSpaceNotIn, diskPoolWhereInput.validCacheSpaceNotIn)
                && Objects.equals(this.validFreeCacheSpace, diskPoolWhereInput.validFreeCacheSpace)
                && Objects.equals(
                        this.validFreeCacheSpaceGt, diskPoolWhereInput.validFreeCacheSpaceGt)
                && Objects.equals(
                        this.validFreeCacheSpaceGte, diskPoolWhereInput.validFreeCacheSpaceGte)
                && Objects.equals(
                        this.validFreeCacheSpaceIn, diskPoolWhereInput.validFreeCacheSpaceIn)
                && Objects.equals(
                        this.validFreeCacheSpaceLt, diskPoolWhereInput.validFreeCacheSpaceLt)
                && Objects.equals(
                        this.validFreeCacheSpaceLte, diskPoolWhereInput.validFreeCacheSpaceLte)
                && Objects.equals(
                        this.validFreeCacheSpaceNot, diskPoolWhereInput.validFreeCacheSpaceNot)
                && Objects.equals(
                        this.validFreeCacheSpaceNotIn, diskPoolWhereInput.validFreeCacheSpaceNotIn);
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
                chunkId,
                chunkIdGt,
                chunkIdGte,
                chunkIdIn,
                chunkIdLt,
                chunkIdLte,
                chunkIdNot,
                chunkIdNotIn,
                chunkInsId,
                chunkInsIdGt,
                chunkInsIdGte,
                chunkInsIdIn,
                chunkInsIdLt,
                chunkInsIdLte,
                chunkInsIdNot,
                chunkInsIdNotIn,
                dataSpaceUsage,
                dataSpaceUsageGt,
                dataSpaceUsageGte,
                dataSpaceUsageIn,
                dataSpaceUsageLt,
                dataSpaceUsageLte,
                dataSpaceUsageNot,
                dataSpaceUsageNotIn,
                dirtyCacheSpace,
                dirtyCacheSpaceGt,
                dirtyCacheSpaceGte,
                dirtyCacheSpaceIn,
                dirtyCacheSpaceLt,
                dirtyCacheSpaceLte,
                dirtyCacheSpaceNot,
                dirtyCacheSpaceNotIn,
                dirtyCacheUsage,
                dirtyCacheUsageGt,
                dirtyCacheUsageGte,
                dirtyCacheUsageIn,
                dirtyCacheUsageLt,
                dirtyCacheUsageLte,
                dirtyCacheUsageNot,
                dirtyCacheUsageNotIn,
                disksEvery,
                disksNone,
                disksSome,
                failureCacheSpace,
                failureCacheSpaceGt,
                failureCacheSpaceGte,
                failureCacheSpaceIn,
                failureCacheSpaceLt,
                failureCacheSpaceLte,
                failureCacheSpaceNot,
                failureCacheSpaceNotIn,
                failureDataSpace,
                failureDataSpaceGt,
                failureDataSpaceGte,
                failureDataSpaceIn,
                failureDataSpaceLt,
                failureDataSpaceLte,
                failureDataSpaceNot,
                failureDataSpaceNotIn,
                hddDiskCount,
                hddDiskCountGt,
                hddDiskCountGte,
                hddDiskCountIn,
                hddDiskCountLt,
                hddDiskCountLte,
                hddDiskCountNot,
                hddDiskCountNotIn,
                host,
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
                labelsEvery,
                labelsNone,
                labelsSome,
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
                numaNode,
                numaNodeContains,
                numaNodeEndsWith,
                numaNodeGt,
                numaNodeGte,
                numaNodeIn,
                numaNodeLt,
                numaNodeLte,
                numaNodeNot,
                numaNodeNotContains,
                numaNodeNotEndsWith,
                numaNodeNotIn,
                numaNodeNotStartsWith,
                numaNodeStartsWith,
                nvmeSsdDiskCount,
                nvmeSsdDiskCountGt,
                nvmeSsdDiskCountGte,
                nvmeSsdDiskCountIn,
                nvmeSsdDiskCountLt,
                nvmeSsdDiskCountLte,
                nvmeSsdDiskCountNot,
                nvmeSsdDiskCountNotIn,
                perfAllocatedDataSpace,
                perfAllocatedDataSpaceGt,
                perfAllocatedDataSpaceGte,
                perfAllocatedDataSpaceIn,
                perfAllocatedDataSpaceLt,
                perfAllocatedDataSpaceLte,
                perfAllocatedDataSpaceNot,
                perfAllocatedDataSpaceNotIn,
                perfFailureDataSpace,
                perfFailureDataSpaceGt,
                perfFailureDataSpaceGte,
                perfFailureDataSpaceIn,
                perfFailureDataSpaceLt,
                perfFailureDataSpaceLte,
                perfFailureDataSpaceNot,
                perfFailureDataSpaceNotIn,
                perfTotalDataCapacity,
                perfTotalDataCapacityGt,
                perfTotalDataCapacityGte,
                perfTotalDataCapacityIn,
                perfTotalDataCapacityLt,
                perfTotalDataCapacityLte,
                perfTotalDataCapacityNot,
                perfTotalDataCapacityNotIn,
                perfUsedDataSpace,
                perfUsedDataSpaceGt,
                perfUsedDataSpaceGte,
                perfUsedDataSpaceIn,
                perfUsedDataSpaceLt,
                perfUsedDataSpaceLte,
                perfUsedDataSpaceNot,
                perfUsedDataSpaceNotIn,
                perfValidDataSpace,
                perfValidDataSpaceGt,
                perfValidDataSpaceGte,
                perfValidDataSpaceIn,
                perfValidDataSpaceLt,
                perfValidDataSpaceLte,
                perfValidDataSpaceNot,
                perfValidDataSpaceNotIn,
                plannedPrioritizedSpace,
                plannedPrioritizedSpaceGt,
                plannedPrioritizedSpaceGte,
                plannedPrioritizedSpaceIn,
                plannedPrioritizedSpaceLt,
                plannedPrioritizedSpaceLte,
                plannedPrioritizedSpaceNot,
                plannedPrioritizedSpaceNotIn,
                prioSpacePercentage,
                prioSpacePercentageGt,
                prioSpacePercentageGte,
                prioSpacePercentageIn,
                prioSpacePercentageLt,
                prioSpacePercentageLte,
                prioSpacePercentageNot,
                prioSpacePercentageNotIn,
                sataOrSasSsdDiskCount,
                sataOrSasSsdDiskCountGt,
                sataOrSasSsdDiskCountGte,
                sataOrSasSsdDiskCountIn,
                sataOrSasSsdDiskCountLt,
                sataOrSasSsdDiskCountLte,
                sataOrSasSsdDiskCountNot,
                sataOrSasSsdDiskCountNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                totalCacheCapacity,
                totalCacheCapacityGt,
                totalCacheCapacityGte,
                totalCacheCapacityIn,
                totalCacheCapacityLt,
                totalCacheCapacityLte,
                totalCacheCapacityNot,
                totalCacheCapacityNotIn,
                totalDataCapacity,
                totalDataCapacityGt,
                totalDataCapacityGte,
                totalDataCapacityIn,
                totalDataCapacityLt,
                totalDataCapacityLte,
                totalDataCapacityNot,
                totalDataCapacityNotIn,
                useState,
                useStateIn,
                useStateNot,
                useStateNotIn,
                usedCacheSpace,
                usedCacheSpaceGt,
                usedCacheSpaceGte,
                usedCacheSpaceIn,
                usedCacheSpaceLt,
                usedCacheSpaceLte,
                usedCacheSpaceNot,
                usedCacheSpaceNotIn,
                usedDataSpace,
                usedDataSpaceGt,
                usedDataSpaceGte,
                usedDataSpaceIn,
                usedDataSpaceLt,
                usedDataSpaceLte,
                usedDataSpaceNot,
                usedDataSpaceNotIn,
                validCacheSpace,
                validCacheSpaceGt,
                validCacheSpaceGte,
                validCacheSpaceIn,
                validCacheSpaceLt,
                validCacheSpaceLte,
                validCacheSpaceNot,
                validCacheSpaceNotIn,
                validFreeCacheSpace,
                validFreeCacheSpaceGt,
                validFreeCacheSpaceGte,
                validFreeCacheSpaceIn,
                validFreeCacheSpaceLt,
                validFreeCacheSpaceLte,
                validFreeCacheSpaceNot,
                validFreeCacheSpaceNotIn);
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
        sb.append("class DiskPoolWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
        sb.append("    chunkIdGt: ").append(toIndentedString(chunkIdGt)).append("\n");
        sb.append("    chunkIdGte: ").append(toIndentedString(chunkIdGte)).append("\n");
        sb.append("    chunkIdIn: ").append(toIndentedString(chunkIdIn)).append("\n");
        sb.append("    chunkIdLt: ").append(toIndentedString(chunkIdLt)).append("\n");
        sb.append("    chunkIdLte: ").append(toIndentedString(chunkIdLte)).append("\n");
        sb.append("    chunkIdNot: ").append(toIndentedString(chunkIdNot)).append("\n");
        sb.append("    chunkIdNotIn: ").append(toIndentedString(chunkIdNotIn)).append("\n");
        sb.append("    chunkInsId: ").append(toIndentedString(chunkInsId)).append("\n");
        sb.append("    chunkInsIdGt: ").append(toIndentedString(chunkInsIdGt)).append("\n");
        sb.append("    chunkInsIdGte: ").append(toIndentedString(chunkInsIdGte)).append("\n");
        sb.append("    chunkInsIdIn: ").append(toIndentedString(chunkInsIdIn)).append("\n");
        sb.append("    chunkInsIdLt: ").append(toIndentedString(chunkInsIdLt)).append("\n");
        sb.append("    chunkInsIdLte: ").append(toIndentedString(chunkInsIdLte)).append("\n");
        sb.append("    chunkInsIdNot: ").append(toIndentedString(chunkInsIdNot)).append("\n");
        sb.append("    chunkInsIdNotIn: ").append(toIndentedString(chunkInsIdNotIn)).append("\n");
        sb.append("    dataSpaceUsage: ").append(toIndentedString(dataSpaceUsage)).append("\n");
        sb.append("    dataSpaceUsageGt: ").append(toIndentedString(dataSpaceUsageGt)).append("\n");
        sb.append("    dataSpaceUsageGte: ")
                .append(toIndentedString(dataSpaceUsageGte))
                .append("\n");
        sb.append("    dataSpaceUsageIn: ").append(toIndentedString(dataSpaceUsageIn)).append("\n");
        sb.append("    dataSpaceUsageLt: ").append(toIndentedString(dataSpaceUsageLt)).append("\n");
        sb.append("    dataSpaceUsageLte: ")
                .append(toIndentedString(dataSpaceUsageLte))
                .append("\n");
        sb.append("    dataSpaceUsageNot: ")
                .append(toIndentedString(dataSpaceUsageNot))
                .append("\n");
        sb.append("    dataSpaceUsageNotIn: ")
                .append(toIndentedString(dataSpaceUsageNotIn))
                .append("\n");
        sb.append("    dirtyCacheSpace: ").append(toIndentedString(dirtyCacheSpace)).append("\n");
        sb.append("    dirtyCacheSpaceGt: ")
                .append(toIndentedString(dirtyCacheSpaceGt))
                .append("\n");
        sb.append("    dirtyCacheSpaceGte: ")
                .append(toIndentedString(dirtyCacheSpaceGte))
                .append("\n");
        sb.append("    dirtyCacheSpaceIn: ")
                .append(toIndentedString(dirtyCacheSpaceIn))
                .append("\n");
        sb.append("    dirtyCacheSpaceLt: ")
                .append(toIndentedString(dirtyCacheSpaceLt))
                .append("\n");
        sb.append("    dirtyCacheSpaceLte: ")
                .append(toIndentedString(dirtyCacheSpaceLte))
                .append("\n");
        sb.append("    dirtyCacheSpaceNot: ")
                .append(toIndentedString(dirtyCacheSpaceNot))
                .append("\n");
        sb.append("    dirtyCacheSpaceNotIn: ")
                .append(toIndentedString(dirtyCacheSpaceNotIn))
                .append("\n");
        sb.append("    dirtyCacheUsage: ").append(toIndentedString(dirtyCacheUsage)).append("\n");
        sb.append("    dirtyCacheUsageGt: ")
                .append(toIndentedString(dirtyCacheUsageGt))
                .append("\n");
        sb.append("    dirtyCacheUsageGte: ")
                .append(toIndentedString(dirtyCacheUsageGte))
                .append("\n");
        sb.append("    dirtyCacheUsageIn: ")
                .append(toIndentedString(dirtyCacheUsageIn))
                .append("\n");
        sb.append("    dirtyCacheUsageLt: ")
                .append(toIndentedString(dirtyCacheUsageLt))
                .append("\n");
        sb.append("    dirtyCacheUsageLte: ")
                .append(toIndentedString(dirtyCacheUsageLte))
                .append("\n");
        sb.append("    dirtyCacheUsageNot: ")
                .append(toIndentedString(dirtyCacheUsageNot))
                .append("\n");
        sb.append("    dirtyCacheUsageNotIn: ")
                .append(toIndentedString(dirtyCacheUsageNotIn))
                .append("\n");
        sb.append("    disksEvery: ").append(toIndentedString(disksEvery)).append("\n");
        sb.append("    disksNone: ").append(toIndentedString(disksNone)).append("\n");
        sb.append("    disksSome: ").append(toIndentedString(disksSome)).append("\n");
        sb.append("    failureCacheSpace: ")
                .append(toIndentedString(failureCacheSpace))
                .append("\n");
        sb.append("    failureCacheSpaceGt: ")
                .append(toIndentedString(failureCacheSpaceGt))
                .append("\n");
        sb.append("    failureCacheSpaceGte: ")
                .append(toIndentedString(failureCacheSpaceGte))
                .append("\n");
        sb.append("    failureCacheSpaceIn: ")
                .append(toIndentedString(failureCacheSpaceIn))
                .append("\n");
        sb.append("    failureCacheSpaceLt: ")
                .append(toIndentedString(failureCacheSpaceLt))
                .append("\n");
        sb.append("    failureCacheSpaceLte: ")
                .append(toIndentedString(failureCacheSpaceLte))
                .append("\n");
        sb.append("    failureCacheSpaceNot: ")
                .append(toIndentedString(failureCacheSpaceNot))
                .append("\n");
        sb.append("    failureCacheSpaceNotIn: ")
                .append(toIndentedString(failureCacheSpaceNotIn))
                .append("\n");
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
        sb.append("    hddDiskCount: ").append(toIndentedString(hddDiskCount)).append("\n");
        sb.append("    hddDiskCountGt: ").append(toIndentedString(hddDiskCountGt)).append("\n");
        sb.append("    hddDiskCountGte: ").append(toIndentedString(hddDiskCountGte)).append("\n");
        sb.append("    hddDiskCountIn: ").append(toIndentedString(hddDiskCountIn)).append("\n");
        sb.append("    hddDiskCountLt: ").append(toIndentedString(hddDiskCountLt)).append("\n");
        sb.append("    hddDiskCountLte: ").append(toIndentedString(hddDiskCountLte)).append("\n");
        sb.append("    hddDiskCountNot: ").append(toIndentedString(hddDiskCountNot)).append("\n");
        sb.append("    hddDiskCountNotIn: ")
                .append(toIndentedString(hddDiskCountNotIn))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    numaNodeContains: ").append(toIndentedString(numaNodeContains)).append("\n");
        sb.append("    numaNodeEndsWith: ").append(toIndentedString(numaNodeEndsWith)).append("\n");
        sb.append("    numaNodeGt: ").append(toIndentedString(numaNodeGt)).append("\n");
        sb.append("    numaNodeGte: ").append(toIndentedString(numaNodeGte)).append("\n");
        sb.append("    numaNodeIn: ").append(toIndentedString(numaNodeIn)).append("\n");
        sb.append("    numaNodeLt: ").append(toIndentedString(numaNodeLt)).append("\n");
        sb.append("    numaNodeLte: ").append(toIndentedString(numaNodeLte)).append("\n");
        sb.append("    numaNodeNot: ").append(toIndentedString(numaNodeNot)).append("\n");
        sb.append("    numaNodeNotContains: ")
                .append(toIndentedString(numaNodeNotContains))
                .append("\n");
        sb.append("    numaNodeNotEndsWith: ")
                .append(toIndentedString(numaNodeNotEndsWith))
                .append("\n");
        sb.append("    numaNodeNotIn: ").append(toIndentedString(numaNodeNotIn)).append("\n");
        sb.append("    numaNodeNotStartsWith: ")
                .append(toIndentedString(numaNodeNotStartsWith))
                .append("\n");
        sb.append("    numaNodeStartsWith: ")
                .append(toIndentedString(numaNodeStartsWith))
                .append("\n");
        sb.append("    nvmeSsdDiskCount: ").append(toIndentedString(nvmeSsdDiskCount)).append("\n");
        sb.append("    nvmeSsdDiskCountGt: ")
                .append(toIndentedString(nvmeSsdDiskCountGt))
                .append("\n");
        sb.append("    nvmeSsdDiskCountGte: ")
                .append(toIndentedString(nvmeSsdDiskCountGte))
                .append("\n");
        sb.append("    nvmeSsdDiskCountIn: ")
                .append(toIndentedString(nvmeSsdDiskCountIn))
                .append("\n");
        sb.append("    nvmeSsdDiskCountLt: ")
                .append(toIndentedString(nvmeSsdDiskCountLt))
                .append("\n");
        sb.append("    nvmeSsdDiskCountLte: ")
                .append(toIndentedString(nvmeSsdDiskCountLte))
                .append("\n");
        sb.append("    nvmeSsdDiskCountNot: ")
                .append(toIndentedString(nvmeSsdDiskCountNot))
                .append("\n");
        sb.append("    nvmeSsdDiskCountNotIn: ")
                .append(toIndentedString(nvmeSsdDiskCountNotIn))
                .append("\n");
        sb.append("    perfAllocatedDataSpace: ")
                .append(toIndentedString(perfAllocatedDataSpace))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceGt: ")
                .append(toIndentedString(perfAllocatedDataSpaceGt))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceGte: ")
                .append(toIndentedString(perfAllocatedDataSpaceGte))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceIn: ")
                .append(toIndentedString(perfAllocatedDataSpaceIn))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceLt: ")
                .append(toIndentedString(perfAllocatedDataSpaceLt))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceLte: ")
                .append(toIndentedString(perfAllocatedDataSpaceLte))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceNot: ")
                .append(toIndentedString(perfAllocatedDataSpaceNot))
                .append("\n");
        sb.append("    perfAllocatedDataSpaceNotIn: ")
                .append(toIndentedString(perfAllocatedDataSpaceNotIn))
                .append("\n");
        sb.append("    perfFailureDataSpace: ")
                .append(toIndentedString(perfFailureDataSpace))
                .append("\n");
        sb.append("    perfFailureDataSpaceGt: ")
                .append(toIndentedString(perfFailureDataSpaceGt))
                .append("\n");
        sb.append("    perfFailureDataSpaceGte: ")
                .append(toIndentedString(perfFailureDataSpaceGte))
                .append("\n");
        sb.append("    perfFailureDataSpaceIn: ")
                .append(toIndentedString(perfFailureDataSpaceIn))
                .append("\n");
        sb.append("    perfFailureDataSpaceLt: ")
                .append(toIndentedString(perfFailureDataSpaceLt))
                .append("\n");
        sb.append("    perfFailureDataSpaceLte: ")
                .append(toIndentedString(perfFailureDataSpaceLte))
                .append("\n");
        sb.append("    perfFailureDataSpaceNot: ")
                .append(toIndentedString(perfFailureDataSpaceNot))
                .append("\n");
        sb.append("    perfFailureDataSpaceNotIn: ")
                .append(toIndentedString(perfFailureDataSpaceNotIn))
                .append("\n");
        sb.append("    perfTotalDataCapacity: ")
                .append(toIndentedString(perfTotalDataCapacity))
                .append("\n");
        sb.append("    perfTotalDataCapacityGt: ")
                .append(toIndentedString(perfTotalDataCapacityGt))
                .append("\n");
        sb.append("    perfTotalDataCapacityGte: ")
                .append(toIndentedString(perfTotalDataCapacityGte))
                .append("\n");
        sb.append("    perfTotalDataCapacityIn: ")
                .append(toIndentedString(perfTotalDataCapacityIn))
                .append("\n");
        sb.append("    perfTotalDataCapacityLt: ")
                .append(toIndentedString(perfTotalDataCapacityLt))
                .append("\n");
        sb.append("    perfTotalDataCapacityLte: ")
                .append(toIndentedString(perfTotalDataCapacityLte))
                .append("\n");
        sb.append("    perfTotalDataCapacityNot: ")
                .append(toIndentedString(perfTotalDataCapacityNot))
                .append("\n");
        sb.append("    perfTotalDataCapacityNotIn: ")
                .append(toIndentedString(perfTotalDataCapacityNotIn))
                .append("\n");
        sb.append("    perfUsedDataSpace: ")
                .append(toIndentedString(perfUsedDataSpace))
                .append("\n");
        sb.append("    perfUsedDataSpaceGt: ")
                .append(toIndentedString(perfUsedDataSpaceGt))
                .append("\n");
        sb.append("    perfUsedDataSpaceGte: ")
                .append(toIndentedString(perfUsedDataSpaceGte))
                .append("\n");
        sb.append("    perfUsedDataSpaceIn: ")
                .append(toIndentedString(perfUsedDataSpaceIn))
                .append("\n");
        sb.append("    perfUsedDataSpaceLt: ")
                .append(toIndentedString(perfUsedDataSpaceLt))
                .append("\n");
        sb.append("    perfUsedDataSpaceLte: ")
                .append(toIndentedString(perfUsedDataSpaceLte))
                .append("\n");
        sb.append("    perfUsedDataSpaceNot: ")
                .append(toIndentedString(perfUsedDataSpaceNot))
                .append("\n");
        sb.append("    perfUsedDataSpaceNotIn: ")
                .append(toIndentedString(perfUsedDataSpaceNotIn))
                .append("\n");
        sb.append("    perfValidDataSpace: ")
                .append(toIndentedString(perfValidDataSpace))
                .append("\n");
        sb.append("    perfValidDataSpaceGt: ")
                .append(toIndentedString(perfValidDataSpaceGt))
                .append("\n");
        sb.append("    perfValidDataSpaceGte: ")
                .append(toIndentedString(perfValidDataSpaceGte))
                .append("\n");
        sb.append("    perfValidDataSpaceIn: ")
                .append(toIndentedString(perfValidDataSpaceIn))
                .append("\n");
        sb.append("    perfValidDataSpaceLt: ")
                .append(toIndentedString(perfValidDataSpaceLt))
                .append("\n");
        sb.append("    perfValidDataSpaceLte: ")
                .append(toIndentedString(perfValidDataSpaceLte))
                .append("\n");
        sb.append("    perfValidDataSpaceNot: ")
                .append(toIndentedString(perfValidDataSpaceNot))
                .append("\n");
        sb.append("    perfValidDataSpaceNotIn: ")
                .append(toIndentedString(perfValidDataSpaceNotIn))
                .append("\n");
        sb.append("    plannedPrioritizedSpace: ")
                .append(toIndentedString(plannedPrioritizedSpace))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceGt: ")
                .append(toIndentedString(plannedPrioritizedSpaceGt))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceGte: ")
                .append(toIndentedString(plannedPrioritizedSpaceGte))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceIn: ")
                .append(toIndentedString(plannedPrioritizedSpaceIn))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceLt: ")
                .append(toIndentedString(plannedPrioritizedSpaceLt))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceLte: ")
                .append(toIndentedString(plannedPrioritizedSpaceLte))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceNot: ")
                .append(toIndentedString(plannedPrioritizedSpaceNot))
                .append("\n");
        sb.append("    plannedPrioritizedSpaceNotIn: ")
                .append(toIndentedString(plannedPrioritizedSpaceNotIn))
                .append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
                .append("\n");
        sb.append("    prioSpacePercentageGt: ")
                .append(toIndentedString(prioSpacePercentageGt))
                .append("\n");
        sb.append("    prioSpacePercentageGte: ")
                .append(toIndentedString(prioSpacePercentageGte))
                .append("\n");
        sb.append("    prioSpacePercentageIn: ")
                .append(toIndentedString(prioSpacePercentageIn))
                .append("\n");
        sb.append("    prioSpacePercentageLt: ")
                .append(toIndentedString(prioSpacePercentageLt))
                .append("\n");
        sb.append("    prioSpacePercentageLte: ")
                .append(toIndentedString(prioSpacePercentageLte))
                .append("\n");
        sb.append("    prioSpacePercentageNot: ")
                .append(toIndentedString(prioSpacePercentageNot))
                .append("\n");
        sb.append("    prioSpacePercentageNotIn: ")
                .append(toIndentedString(prioSpacePercentageNotIn))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCount: ")
                .append(toIndentedString(sataOrSasSsdDiskCount))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountGt: ")
                .append(toIndentedString(sataOrSasSsdDiskCountGt))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountGte: ")
                .append(toIndentedString(sataOrSasSsdDiskCountGte))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountIn: ")
                .append(toIndentedString(sataOrSasSsdDiskCountIn))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountLt: ")
                .append(toIndentedString(sataOrSasSsdDiskCountLt))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountLte: ")
                .append(toIndentedString(sataOrSasSsdDiskCountLte))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountNot: ")
                .append(toIndentedString(sataOrSasSsdDiskCountNot))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCountNotIn: ")
                .append(toIndentedString(sataOrSasSsdDiskCountNotIn))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
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
        sb.append("    useState: ").append(toIndentedString(useState)).append("\n");
        sb.append("    useStateIn: ").append(toIndentedString(useStateIn)).append("\n");
        sb.append("    useStateNot: ").append(toIndentedString(useStateNot)).append("\n");
        sb.append("    useStateNotIn: ").append(toIndentedString(useStateNotIn)).append("\n");
        sb.append("    usedCacheSpace: ").append(toIndentedString(usedCacheSpace)).append("\n");
        sb.append("    usedCacheSpaceGt: ").append(toIndentedString(usedCacheSpaceGt)).append("\n");
        sb.append("    usedCacheSpaceGte: ")
                .append(toIndentedString(usedCacheSpaceGte))
                .append("\n");
        sb.append("    usedCacheSpaceIn: ").append(toIndentedString(usedCacheSpaceIn)).append("\n");
        sb.append("    usedCacheSpaceLt: ").append(toIndentedString(usedCacheSpaceLt)).append("\n");
        sb.append("    usedCacheSpaceLte: ")
                .append(toIndentedString(usedCacheSpaceLte))
                .append("\n");
        sb.append("    usedCacheSpaceNot: ")
                .append(toIndentedString(usedCacheSpaceNot))
                .append("\n");
        sb.append("    usedCacheSpaceNotIn: ")
                .append(toIndentedString(usedCacheSpaceNotIn))
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
        sb.append("    validCacheSpace: ").append(toIndentedString(validCacheSpace)).append("\n");
        sb.append("    validCacheSpaceGt: ")
                .append(toIndentedString(validCacheSpaceGt))
                .append("\n");
        sb.append("    validCacheSpaceGte: ")
                .append(toIndentedString(validCacheSpaceGte))
                .append("\n");
        sb.append("    validCacheSpaceIn: ")
                .append(toIndentedString(validCacheSpaceIn))
                .append("\n");
        sb.append("    validCacheSpaceLt: ")
                .append(toIndentedString(validCacheSpaceLt))
                .append("\n");
        sb.append("    validCacheSpaceLte: ")
                .append(toIndentedString(validCacheSpaceLte))
                .append("\n");
        sb.append("    validCacheSpaceNot: ")
                .append(toIndentedString(validCacheSpaceNot))
                .append("\n");
        sb.append("    validCacheSpaceNotIn: ")
                .append(toIndentedString(validCacheSpaceNotIn))
                .append("\n");
        sb.append("    validFreeCacheSpace: ")
                .append(toIndentedString(validFreeCacheSpace))
                .append("\n");
        sb.append("    validFreeCacheSpaceGt: ")
                .append(toIndentedString(validFreeCacheSpaceGt))
                .append("\n");
        sb.append("    validFreeCacheSpaceGte: ")
                .append(toIndentedString(validFreeCacheSpaceGte))
                .append("\n");
        sb.append("    validFreeCacheSpaceIn: ")
                .append(toIndentedString(validFreeCacheSpaceIn))
                .append("\n");
        sb.append("    validFreeCacheSpaceLt: ")
                .append(toIndentedString(validFreeCacheSpaceLt))
                .append("\n");
        sb.append("    validFreeCacheSpaceLte: ")
                .append(toIndentedString(validFreeCacheSpaceLte))
                .append("\n");
        sb.append("    validFreeCacheSpaceNot: ")
                .append(toIndentedString(validFreeCacheSpaceNot))
                .append("\n");
        sb.append("    validFreeCacheSpaceNotIn: ")
                .append(toIndentedString(validFreeCacheSpaceNotIn))
                .append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** WitnessWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class WitnessWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<WitnessWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<WitnessWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<WitnessWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE = "cpu_hz_per_core";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE)
    private Long cpuHzPerCore;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_GT = "cpu_hz_per_core_gt";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT)
    private Long cpuHzPerCoreGt;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE = "cpu_hz_per_core_gte";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE)
    private Long cpuHzPerCoreGte;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_IN = "cpu_hz_per_core_in";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN)
    private List<Long> cpuHzPerCoreIn = null;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_LT = "cpu_hz_per_core_lt";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT)
    private Long cpuHzPerCoreLt;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE = "cpu_hz_per_core_lte";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE)
    private Long cpuHzPerCoreLte;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT = "cpu_hz_per_core_not";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT)
    private Long cpuHzPerCoreNot;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN = "cpu_hz_per_core_not_in";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN)
    private List<Long> cpuHzPerCoreNotIn = null;

    public static final String SERIALIZED_NAME_DATA_IP = "data_ip";

    @SerializedName(SERIALIZED_NAME_DATA_IP)
    private String dataIp;

    public static final String SERIALIZED_NAME_DATA_IP_CONTAINS = "data_ip_contains";

    @SerializedName(SERIALIZED_NAME_DATA_IP_CONTAINS)
    private String dataIpContains;

    public static final String SERIALIZED_NAME_DATA_IP_ENDS_WITH = "data_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_DATA_IP_ENDS_WITH)
    private String dataIpEndsWith;

    public static final String SERIALIZED_NAME_DATA_IP_GT = "data_ip_gt";

    @SerializedName(SERIALIZED_NAME_DATA_IP_GT)
    private String dataIpGt;

    public static final String SERIALIZED_NAME_DATA_IP_GTE = "data_ip_gte";

    @SerializedName(SERIALIZED_NAME_DATA_IP_GTE)
    private String dataIpGte;

    public static final String SERIALIZED_NAME_DATA_IP_IN = "data_ip_in";

    @SerializedName(SERIALIZED_NAME_DATA_IP_IN)
    private List<String> dataIpIn = null;

    public static final String SERIALIZED_NAME_DATA_IP_LT = "data_ip_lt";

    @SerializedName(SERIALIZED_NAME_DATA_IP_LT)
    private String dataIpLt;

    public static final String SERIALIZED_NAME_DATA_IP_LTE = "data_ip_lte";

    @SerializedName(SERIALIZED_NAME_DATA_IP_LTE)
    private String dataIpLte;

    public static final String SERIALIZED_NAME_DATA_IP_NOT = "data_ip_not";

    @SerializedName(SERIALIZED_NAME_DATA_IP_NOT)
    private String dataIpNot;

    public static final String SERIALIZED_NAME_DATA_IP_NOT_CONTAINS = "data_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS)
    private String dataIpNotContains;

    public static final String SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH = "data_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH)
    private String dataIpNotEndsWith;

    public static final String SERIALIZED_NAME_DATA_IP_NOT_IN = "data_ip_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_IN)
    private List<String> dataIpNotIn = null;

    public static final String SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH = "data_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH)
    private String dataIpNotStartsWith;

    public static final String SERIALIZED_NAME_DATA_IP_STARTS_WITH = "data_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_DATA_IP_STARTS_WITH)
    private String dataIpStartsWith;

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

    public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
    private String managementIp;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS = "management_ip_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS)
    private String managementIpContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH = "management_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH)
    private String managementIpEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_GT = "management_ip_gt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_GT)
    private String managementIpGt;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_GTE = "management_ip_gte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_GTE)
    private String managementIpGte;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_IN = "management_ip_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_IN)
    private List<String> managementIpIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_LT = "management_ip_lt";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_LT)
    private String managementIpLt;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_LTE = "management_ip_lte";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_LTE)
    private String managementIpLte;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT = "management_ip_not";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT)
    private String managementIpNot;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS =
            "management_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS)
    private String managementIpNotContains;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH =
            "management_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH)
    private String managementIpNotEndsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN = "management_ip_not_in";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN)
    private List<String> managementIpNotIn = null;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH =
            "management_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH)
    private String managementIpNotStartsWith;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH =
            "management_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH)
    private String managementIpStartsWith;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY = "system_data_capacity";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY)
    private Long systemDataCapacity;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT = "system_data_capacity_gt";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT)
    private Long systemDataCapacityGt;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE =
            "system_data_capacity_gte";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE)
    private Long systemDataCapacityGte;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN = "system_data_capacity_in";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN)
    private List<Long> systemDataCapacityIn = null;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT = "system_data_capacity_lt";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT)
    private Long systemDataCapacityLt;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE =
            "system_data_capacity_lte";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE)
    private Long systemDataCapacityLte;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT =
            "system_data_capacity_not";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT)
    private Long systemDataCapacityNot;

    public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN =
            "system_data_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN)
    private List<Long> systemDataCapacityNotIn = null;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE = "system_used_data_space";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE)
    private Long systemUsedDataSpace;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT =
            "system_used_data_space_gt";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT)
    private Long systemUsedDataSpaceGt;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE =
            "system_used_data_space_gte";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE)
    private Long systemUsedDataSpaceGte;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN =
            "system_used_data_space_in";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN)
    private List<Long> systemUsedDataSpaceIn = null;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT =
            "system_used_data_space_lt";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT)
    private Long systemUsedDataSpaceLt;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE =
            "system_used_data_space_lte";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE)
    private Long systemUsedDataSpaceLte;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT =
            "system_used_data_space_not";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT)
    private Long systemUsedDataSpaceNot;

    public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN =
            "system_used_data_space_not_in";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN)
    private List<Long> systemUsedDataSpaceNotIn = null;

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

    public WitnessWhereInput() {}

    public WitnessWhereInput AND(List<WitnessWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public WitnessWhereInput addANDItem(WitnessWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<WitnessWhereInput>();
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
    public List<WitnessWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<WitnessWhereInput> AND) {
        this.AND = AND;
    }

    public WitnessWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public WitnessWhereInput AND_ExplictlyNonNull() {
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

    public WitnessWhereInput NOT(List<WitnessWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public WitnessWhereInput addNOTItem(WitnessWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<WitnessWhereInput>();
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
    public List<WitnessWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<WitnessWhereInput> NOT) {
        this.NOT = NOT;
    }

    public WitnessWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public WitnessWhereInput NOT_ExplictlyNonNull() {
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

    public WitnessWhereInput OR(List<WitnessWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public WitnessWhereInput addORItem(WitnessWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<WitnessWhereInput>();
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
    public List<WitnessWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<WitnessWhereInput> OR) {
        this.OR = OR;
    }

    public WitnessWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public WitnessWhereInput OR_ExplictlyNonNull() {
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

    public WitnessWhereInput cluster(ClusterWhereInput cluster) {

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

    public WitnessWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public WitnessWhereInput cluster_ExplictlyNonNull() {
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

    public WitnessWhereInput cpuHzPerCore(Long cpuHzPerCore) {

        this.cpuHzPerCore = cpuHzPerCore;
        return this;
    }

    /**
     * Get cpuHzPerCore
     *
     * @return cpuHzPerCore
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCpuHzPerCore() {
        return cpuHzPerCore;
    }

    public void setCpuHzPerCore(Long cpuHzPerCore) {
        this.cpuHzPerCore = cpuHzPerCore;
    }

    public WitnessWhereInput cpuHzPerCore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        return this;
    }

    public WitnessWhereInput cpuHzPerCore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        return this;
    }

    public void setCpuHzPerCore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        }
    }

    public boolean getCpuHzPerCore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE);
    }

    public WitnessWhereInput cpuHzPerCoreGt(Long cpuHzPerCoreGt) {

        this.cpuHzPerCoreGt = cpuHzPerCoreGt;
        return this;
    }

    /**
     * Get cpuHzPerCoreGt
     *
     * @return cpuHzPerCoreGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCpuHzPerCoreGt() {
        return cpuHzPerCoreGt;
    }

    public void setCpuHzPerCoreGt(Long cpuHzPerCoreGt) {
        this.cpuHzPerCoreGt = cpuHzPerCoreGt;
    }

    public WitnessWhereInput cpuHzPerCoreGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT);
        return this;
    }

    public void setCpuHzPerCoreGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT);
        }
    }

    public boolean getCpuHzPerCoreGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT);
    }

    public WitnessWhereInput cpuHzPerCoreGte(Long cpuHzPerCoreGte) {

        this.cpuHzPerCoreGte = cpuHzPerCoreGte;
        return this;
    }

    /**
     * Get cpuHzPerCoreGte
     *
     * @return cpuHzPerCoreGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCpuHzPerCoreGte() {
        return cpuHzPerCoreGte;
    }

    public void setCpuHzPerCoreGte(Long cpuHzPerCoreGte) {
        this.cpuHzPerCoreGte = cpuHzPerCoreGte;
    }

    public WitnessWhereInput cpuHzPerCoreGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE);
        return this;
    }

    public void setCpuHzPerCoreGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE);
        }
    }

    public boolean getCpuHzPerCoreGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE);
    }

    public WitnessWhereInput cpuHzPerCoreIn(List<Long> cpuHzPerCoreIn) {

        this.cpuHzPerCoreIn = cpuHzPerCoreIn;
        return this;
    }

    public WitnessWhereInput addCpuHzPerCoreInItem(Long cpuHzPerCoreInItem) {
        if (this.cpuHzPerCoreIn == null) {
            this.cpuHzPerCoreIn = new ArrayList<Long>();
        }
        this.cpuHzPerCoreIn.add(cpuHzPerCoreInItem);
        return this;
    }

    /**
     * Get cpuHzPerCoreIn
     *
     * @return cpuHzPerCoreIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getCpuHzPerCoreIn() {
        return cpuHzPerCoreIn;
    }

    public void setCpuHzPerCoreIn(List<Long> cpuHzPerCoreIn) {
        this.cpuHzPerCoreIn = cpuHzPerCoreIn;
    }

    public WitnessWhereInput cpuHzPerCoreIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN);
        return this;
    }

    public void setCpuHzPerCoreIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN);
        }
    }

    public boolean getCpuHzPerCoreIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN);
    }

    public WitnessWhereInput cpuHzPerCoreLt(Long cpuHzPerCoreLt) {

        this.cpuHzPerCoreLt = cpuHzPerCoreLt;
        return this;
    }

    /**
     * Get cpuHzPerCoreLt
     *
     * @return cpuHzPerCoreLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCpuHzPerCoreLt() {
        return cpuHzPerCoreLt;
    }

    public void setCpuHzPerCoreLt(Long cpuHzPerCoreLt) {
        this.cpuHzPerCoreLt = cpuHzPerCoreLt;
    }

    public WitnessWhereInput cpuHzPerCoreLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT);
        return this;
    }

    public void setCpuHzPerCoreLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT);
        }
    }

    public boolean getCpuHzPerCoreLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT);
    }

    public WitnessWhereInput cpuHzPerCoreLte(Long cpuHzPerCoreLte) {

        this.cpuHzPerCoreLte = cpuHzPerCoreLte;
        return this;
    }

    /**
     * Get cpuHzPerCoreLte
     *
     * @return cpuHzPerCoreLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCpuHzPerCoreLte() {
        return cpuHzPerCoreLte;
    }

    public void setCpuHzPerCoreLte(Long cpuHzPerCoreLte) {
        this.cpuHzPerCoreLte = cpuHzPerCoreLte;
    }

    public WitnessWhereInput cpuHzPerCoreLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE);
        return this;
    }

    public void setCpuHzPerCoreLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE);
        }
    }

    public boolean getCpuHzPerCoreLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE);
    }

    public WitnessWhereInput cpuHzPerCoreNot(Long cpuHzPerCoreNot) {

        this.cpuHzPerCoreNot = cpuHzPerCoreNot;
        return this;
    }

    /**
     * Get cpuHzPerCoreNot
     *
     * @return cpuHzPerCoreNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCpuHzPerCoreNot() {
        return cpuHzPerCoreNot;
    }

    public void setCpuHzPerCoreNot(Long cpuHzPerCoreNot) {
        this.cpuHzPerCoreNot = cpuHzPerCoreNot;
    }

    public WitnessWhereInput cpuHzPerCoreNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT);
        return this;
    }

    public void setCpuHzPerCoreNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT);
        }
    }

    public boolean getCpuHzPerCoreNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT);
    }

    public WitnessWhereInput cpuHzPerCoreNotIn(List<Long> cpuHzPerCoreNotIn) {

        this.cpuHzPerCoreNotIn = cpuHzPerCoreNotIn;
        return this;
    }

    public WitnessWhereInput addCpuHzPerCoreNotInItem(Long cpuHzPerCoreNotInItem) {
        if (this.cpuHzPerCoreNotIn == null) {
            this.cpuHzPerCoreNotIn = new ArrayList<Long>();
        }
        this.cpuHzPerCoreNotIn.add(cpuHzPerCoreNotInItem);
        return this;
    }

    /**
     * Get cpuHzPerCoreNotIn
     *
     * @return cpuHzPerCoreNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getCpuHzPerCoreNotIn() {
        return cpuHzPerCoreNotIn;
    }

    public void setCpuHzPerCoreNotIn(List<Long> cpuHzPerCoreNotIn) {
        this.cpuHzPerCoreNotIn = cpuHzPerCoreNotIn;
    }

    public WitnessWhereInput cpuHzPerCoreNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN);
        return this;
    }

    public WitnessWhereInput cpuHzPerCoreNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN);
        return this;
    }

    public void setCpuHzPerCoreNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN);
        }
    }

    public boolean getCpuHzPerCoreNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN);
    }

    public WitnessWhereInput dataIp(String dataIp) {

        this.dataIp = dataIp;
        return this;
    }

    /**
     * Get dataIp
     *
     * @return dataIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIp() {
        return dataIp;
    }

    public void setDataIp(String dataIp) {
        this.dataIp = dataIp;
    }

    public WitnessWhereInput dataIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP);
        return this;
    }

    public WitnessWhereInput dataIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP);
        return this;
    }

    public void setDataIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP);
        }
    }

    public boolean getDataIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP);
    }

    public WitnessWhereInput dataIpContains(String dataIpContains) {

        this.dataIpContains = dataIpContains;
        return this;
    }

    /**
     * Get dataIpContains
     *
     * @return dataIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpContains() {
        return dataIpContains;
    }

    public void setDataIpContains(String dataIpContains) {
        this.dataIpContains = dataIpContains;
    }

    public WitnessWhereInput dataIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_CONTAINS);
        return this;
    }

    public WitnessWhereInput dataIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_CONTAINS);
        return this;
    }

    public void setDataIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_CONTAINS);
        }
    }

    public boolean getDataIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_CONTAINS);
    }

    public WitnessWhereInput dataIpEndsWith(String dataIpEndsWith) {

        this.dataIpEndsWith = dataIpEndsWith;
        return this;
    }

    /**
     * Get dataIpEndsWith
     *
     * @return dataIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpEndsWith() {
        return dataIpEndsWith;
    }

    public void setDataIpEndsWith(String dataIpEndsWith) {
        this.dataIpEndsWith = dataIpEndsWith;
    }

    public WitnessWhereInput dataIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput dataIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_ENDS_WITH);
        return this;
    }

    public void setDataIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_ENDS_WITH);
        }
    }

    public boolean getDataIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_ENDS_WITH);
    }

    public WitnessWhereInput dataIpGt(String dataIpGt) {

        this.dataIpGt = dataIpGt;
        return this;
    }

    /**
     * Get dataIpGt
     *
     * @return dataIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpGt() {
        return dataIpGt;
    }

    public void setDataIpGt(String dataIpGt) {
        this.dataIpGt = dataIpGt;
    }

    public WitnessWhereInput dataIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_GT);
        return this;
    }

    public WitnessWhereInput dataIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_GT);
        return this;
    }

    public void setDataIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_GT);
        }
    }

    public boolean getDataIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_GT);
    }

    public WitnessWhereInput dataIpGte(String dataIpGte) {

        this.dataIpGte = dataIpGte;
        return this;
    }

    /**
     * Get dataIpGte
     *
     * @return dataIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpGte() {
        return dataIpGte;
    }

    public void setDataIpGte(String dataIpGte) {
        this.dataIpGte = dataIpGte;
    }

    public WitnessWhereInput dataIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_GTE);
        return this;
    }

    public WitnessWhereInput dataIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_GTE);
        return this;
    }

    public void setDataIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_GTE);
        }
    }

    public boolean getDataIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_GTE);
    }

    public WitnessWhereInput dataIpIn(List<String> dataIpIn) {

        this.dataIpIn = dataIpIn;
        return this;
    }

    public WitnessWhereInput addDataIpInItem(String dataIpInItem) {
        if (this.dataIpIn == null) {
            this.dataIpIn = new ArrayList<String>();
        }
        this.dataIpIn.add(dataIpInItem);
        return this;
    }

    /**
     * Get dataIpIn
     *
     * @return dataIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDataIpIn() {
        return dataIpIn;
    }

    public void setDataIpIn(List<String> dataIpIn) {
        this.dataIpIn = dataIpIn;
    }

    public WitnessWhereInput dataIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_IN);
        return this;
    }

    public WitnessWhereInput dataIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_IN);
        return this;
    }

    public void setDataIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_IN);
        }
    }

    public boolean getDataIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_IN);
    }

    public WitnessWhereInput dataIpLt(String dataIpLt) {

        this.dataIpLt = dataIpLt;
        return this;
    }

    /**
     * Get dataIpLt
     *
     * @return dataIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpLt() {
        return dataIpLt;
    }

    public void setDataIpLt(String dataIpLt) {
        this.dataIpLt = dataIpLt;
    }

    public WitnessWhereInput dataIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_LT);
        return this;
    }

    public WitnessWhereInput dataIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_LT);
        return this;
    }

    public void setDataIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_LT);
        }
    }

    public boolean getDataIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_LT);
    }

    public WitnessWhereInput dataIpLte(String dataIpLte) {

        this.dataIpLte = dataIpLte;
        return this;
    }

    /**
     * Get dataIpLte
     *
     * @return dataIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpLte() {
        return dataIpLte;
    }

    public void setDataIpLte(String dataIpLte) {
        this.dataIpLte = dataIpLte;
    }

    public WitnessWhereInput dataIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_LTE);
        return this;
    }

    public WitnessWhereInput dataIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_LTE);
        return this;
    }

    public void setDataIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_LTE);
        }
    }

    public boolean getDataIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_LTE);
    }

    public WitnessWhereInput dataIpNot(String dataIpNot) {

        this.dataIpNot = dataIpNot;
        return this;
    }

    /**
     * Get dataIpNot
     *
     * @return dataIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpNot() {
        return dataIpNot;
    }

    public void setDataIpNot(String dataIpNot) {
        this.dataIpNot = dataIpNot;
    }

    public WitnessWhereInput dataIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT);
        return this;
    }

    public WitnessWhereInput dataIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT);
        return this;
    }

    public void setDataIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT);
        }
    }

    public boolean getDataIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_NOT);
    }

    public WitnessWhereInput dataIpNotContains(String dataIpNotContains) {

        this.dataIpNotContains = dataIpNotContains;
        return this;
    }

    /**
     * Get dataIpNotContains
     *
     * @return dataIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpNotContains() {
        return dataIpNotContains;
    }

    public void setDataIpNotContains(String dataIpNotContains) {
        this.dataIpNotContains = dataIpNotContains;
    }

    public WitnessWhereInput dataIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS);
        return this;
    }

    public WitnessWhereInput dataIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS);
        return this;
    }

    public void setDataIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS);
        }
    }

    public boolean getDataIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS);
    }

    public WitnessWhereInput dataIpNotEndsWith(String dataIpNotEndsWith) {

        this.dataIpNotEndsWith = dataIpNotEndsWith;
        return this;
    }

    /**
     * Get dataIpNotEndsWith
     *
     * @return dataIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpNotEndsWith() {
        return dataIpNotEndsWith;
    }

    public void setDataIpNotEndsWith(String dataIpNotEndsWith) {
        this.dataIpNotEndsWith = dataIpNotEndsWith;
    }

    public WitnessWhereInput dataIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput dataIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setDataIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getDataIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH);
    }

    public WitnessWhereInput dataIpNotIn(List<String> dataIpNotIn) {

        this.dataIpNotIn = dataIpNotIn;
        return this;
    }

    public WitnessWhereInput addDataIpNotInItem(String dataIpNotInItem) {
        if (this.dataIpNotIn == null) {
            this.dataIpNotIn = new ArrayList<String>();
        }
        this.dataIpNotIn.add(dataIpNotInItem);
        return this;
    }

    /**
     * Get dataIpNotIn
     *
     * @return dataIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDataIpNotIn() {
        return dataIpNotIn;
    }

    public void setDataIpNotIn(List<String> dataIpNotIn) {
        this.dataIpNotIn = dataIpNotIn;
    }

    public WitnessWhereInput dataIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_IN);
        return this;
    }

    public WitnessWhereInput dataIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_IN);
        return this;
    }

    public void setDataIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_IN);
        }
    }

    public boolean getDataIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_NOT_IN);
    }

    public WitnessWhereInput dataIpNotStartsWith(String dataIpNotStartsWith) {

        this.dataIpNotStartsWith = dataIpNotStartsWith;
        return this;
    }

    /**
     * Get dataIpNotStartsWith
     *
     * @return dataIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpNotStartsWith() {
        return dataIpNotStartsWith;
    }

    public void setDataIpNotStartsWith(String dataIpNotStartsWith) {
        this.dataIpNotStartsWith = dataIpNotStartsWith;
    }

    public WitnessWhereInput dataIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput dataIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setDataIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getDataIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH);
    }

    public WitnessWhereInput dataIpStartsWith(String dataIpStartsWith) {

        this.dataIpStartsWith = dataIpStartsWith;
        return this;
    }

    /**
     * Get dataIpStartsWith
     *
     * @return dataIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIpStartsWith() {
        return dataIpStartsWith;
    }

    public void setDataIpStartsWith(String dataIpStartsWith) {
        this.dataIpStartsWith = dataIpStartsWith;
    }

    public WitnessWhereInput dataIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput dataIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_STARTS_WITH);
        return this;
    }

    public void setDataIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP_STARTS_WITH);
        }
    }

    public boolean getDataIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP_STARTS_WITH);
    }

    public WitnessWhereInput id(String id) {

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

    public WitnessWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public WitnessWhereInput id_ExplictlyNonNull() {
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

    public WitnessWhereInput idContains(String idContains) {

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

    public WitnessWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public WitnessWhereInput idContains_ExplictlyNonNull() {
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

    public WitnessWhereInput idEndsWith(String idEndsWith) {

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

    public WitnessWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput idEndsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput idGt(String idGt) {

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

    public WitnessWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public WitnessWhereInput idGt_ExplictlyNonNull() {
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

    public WitnessWhereInput idGte(String idGte) {

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

    public WitnessWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public WitnessWhereInput idGte_ExplictlyNonNull() {
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

    public WitnessWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public WitnessWhereInput addIdInItem(String idInItem) {
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

    public WitnessWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public WitnessWhereInput idIn_ExplictlyNonNull() {
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

    public WitnessWhereInput idLt(String idLt) {

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

    public WitnessWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public WitnessWhereInput idLt_ExplictlyNonNull() {
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

    public WitnessWhereInput idLte(String idLte) {

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

    public WitnessWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public WitnessWhereInput idLte_ExplictlyNonNull() {
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

    public WitnessWhereInput idNot(String idNot) {

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

    public WitnessWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public WitnessWhereInput idNot_ExplictlyNonNull() {
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

    public WitnessWhereInput idNotContains(String idNotContains) {

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

    public WitnessWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public WitnessWhereInput idNotContains_ExplictlyNonNull() {
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

    public WitnessWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public WitnessWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public WitnessWhereInput addIdNotInItem(String idNotInItem) {
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

    public WitnessWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public WitnessWhereInput idNotIn_ExplictlyNonNull() {
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

    public WitnessWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public WitnessWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput idStartsWith(String idStartsWith) {

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

    public WitnessWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput idStartsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput localId(String localId) {

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

    public WitnessWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public WitnessWhereInput localId_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdContains(String localIdContains) {

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

    public WitnessWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public WitnessWhereInput localIdContains_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public WitnessWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdGt(String localIdGt) {

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

    public WitnessWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public WitnessWhereInput localIdGt_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdGte(String localIdGte) {

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

    public WitnessWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public WitnessWhereInput localIdGte_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public WitnessWhereInput addLocalIdInItem(String localIdInItem) {
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

    public WitnessWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public WitnessWhereInput localIdIn_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdLt(String localIdLt) {

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

    public WitnessWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public WitnessWhereInput localIdLt_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdLte(String localIdLte) {

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

    public WitnessWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public WitnessWhereInput localIdLte_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdNot(String localIdNot) {

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

    public WitnessWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public WitnessWhereInput localIdNot_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdNotContains(String localIdNotContains) {

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

    public WitnessWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public WitnessWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public WitnessWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public WitnessWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public WitnessWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public WitnessWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public WitnessWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public WitnessWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public WitnessWhereInput managementIp(String managementIp) {

        this.managementIp = managementIp;
        return this;
    }

    /**
     * Get managementIp
     *
     * @return managementIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIp() {
        return managementIp;
    }

    public void setManagementIp(String managementIp) {
        this.managementIp = managementIp;
    }

    public WitnessWhereInput managementIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP);
        return this;
    }

    public WitnessWhereInput managementIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP);
        return this;
    }

    public void setManagementIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP);
        }
    }

    public boolean getManagementIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP);
    }

    public WitnessWhereInput managementIpContains(String managementIpContains) {

        this.managementIpContains = managementIpContains;
        return this;
    }

    /**
     * Get managementIpContains
     *
     * @return managementIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpContains() {
        return managementIpContains;
    }

    public void setManagementIpContains(String managementIpContains) {
        this.managementIpContains = managementIpContains;
    }

    public WitnessWhereInput managementIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS);
        return this;
    }

    public WitnessWhereInput managementIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS);
        return this;
    }

    public void setManagementIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS);
        }
    }

    public boolean getManagementIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS);
    }

    public WitnessWhereInput managementIpEndsWith(String managementIpEndsWith) {

        this.managementIpEndsWith = managementIpEndsWith;
        return this;
    }

    /**
     * Get managementIpEndsWith
     *
     * @return managementIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpEndsWith() {
        return managementIpEndsWith;
    }

    public void setManagementIpEndsWith(String managementIpEndsWith) {
        this.managementIpEndsWith = managementIpEndsWith;
    }

    public WitnessWhereInput managementIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput managementIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH);
        return this;
    }

    public void setManagementIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH);
        }
    }

    public boolean getManagementIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH);
    }

    public WitnessWhereInput managementIpGt(String managementIpGt) {

        this.managementIpGt = managementIpGt;
        return this;
    }

    /**
     * Get managementIpGt
     *
     * @return managementIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpGt() {
        return managementIpGt;
    }

    public void setManagementIpGt(String managementIpGt) {
        this.managementIpGt = managementIpGt;
    }

    public WitnessWhereInput managementIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_GT);
        return this;
    }

    public WitnessWhereInput managementIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_GT);
        return this;
    }

    public void setManagementIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_GT);
        }
    }

    public boolean getManagementIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_GT);
    }

    public WitnessWhereInput managementIpGte(String managementIpGte) {

        this.managementIpGte = managementIpGte;
        return this;
    }

    /**
     * Get managementIpGte
     *
     * @return managementIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpGte() {
        return managementIpGte;
    }

    public void setManagementIpGte(String managementIpGte) {
        this.managementIpGte = managementIpGte;
    }

    public WitnessWhereInput managementIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_GTE);
        return this;
    }

    public WitnessWhereInput managementIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_GTE);
        return this;
    }

    public void setManagementIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_GTE);
        }
    }

    public boolean getManagementIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_GTE);
    }

    public WitnessWhereInput managementIpIn(List<String> managementIpIn) {

        this.managementIpIn = managementIpIn;
        return this;
    }

    public WitnessWhereInput addManagementIpInItem(String managementIpInItem) {
        if (this.managementIpIn == null) {
            this.managementIpIn = new ArrayList<String>();
        }
        this.managementIpIn.add(managementIpInItem);
        return this;
    }

    /**
     * Get managementIpIn
     *
     * @return managementIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementIpIn() {
        return managementIpIn;
    }

    public void setManagementIpIn(List<String> managementIpIn) {
        this.managementIpIn = managementIpIn;
    }

    public WitnessWhereInput managementIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_IN);
        return this;
    }

    public WitnessWhereInput managementIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_IN);
        return this;
    }

    public void setManagementIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_IN);
        }
    }

    public boolean getManagementIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_IN);
    }

    public WitnessWhereInput managementIpLt(String managementIpLt) {

        this.managementIpLt = managementIpLt;
        return this;
    }

    /**
     * Get managementIpLt
     *
     * @return managementIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpLt() {
        return managementIpLt;
    }

    public void setManagementIpLt(String managementIpLt) {
        this.managementIpLt = managementIpLt;
    }

    public WitnessWhereInput managementIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_LT);
        return this;
    }

    public WitnessWhereInput managementIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_LT);
        return this;
    }

    public void setManagementIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_LT);
        }
    }

    public boolean getManagementIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_LT);
    }

    public WitnessWhereInput managementIpLte(String managementIpLte) {

        this.managementIpLte = managementIpLte;
        return this;
    }

    /**
     * Get managementIpLte
     *
     * @return managementIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpLte() {
        return managementIpLte;
    }

    public void setManagementIpLte(String managementIpLte) {
        this.managementIpLte = managementIpLte;
    }

    public WitnessWhereInput managementIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_LTE);
        return this;
    }

    public WitnessWhereInput managementIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_LTE);
        return this;
    }

    public void setManagementIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_LTE);
        }
    }

    public boolean getManagementIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_LTE);
    }

    public WitnessWhereInput managementIpNot(String managementIpNot) {

        this.managementIpNot = managementIpNot;
        return this;
    }

    /**
     * Get managementIpNot
     *
     * @return managementIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpNot() {
        return managementIpNot;
    }

    public void setManagementIpNot(String managementIpNot) {
        this.managementIpNot = managementIpNot;
    }

    public WitnessWhereInput managementIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT);
        return this;
    }

    public WitnessWhereInput managementIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT);
        return this;
    }

    public void setManagementIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT);
        }
    }

    public boolean getManagementIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_NOT);
    }

    public WitnessWhereInput managementIpNotContains(String managementIpNotContains) {

        this.managementIpNotContains = managementIpNotContains;
        return this;
    }

    /**
     * Get managementIpNotContains
     *
     * @return managementIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpNotContains() {
        return managementIpNotContains;
    }

    public void setManagementIpNotContains(String managementIpNotContains) {
        this.managementIpNotContains = managementIpNotContains;
    }

    public WitnessWhereInput managementIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS);
        return this;
    }

    public WitnessWhereInput managementIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS);
        return this;
    }

    public void setManagementIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS);
        }
    }

    public boolean getManagementIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS);
    }

    public WitnessWhereInput managementIpNotEndsWith(String managementIpNotEndsWith) {

        this.managementIpNotEndsWith = managementIpNotEndsWith;
        return this;
    }

    /**
     * Get managementIpNotEndsWith
     *
     * @return managementIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpNotEndsWith() {
        return managementIpNotEndsWith;
    }

    public void setManagementIpNotEndsWith(String managementIpNotEndsWith) {
        this.managementIpNotEndsWith = managementIpNotEndsWith;
    }

    public WitnessWhereInput managementIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput managementIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setManagementIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getManagementIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH);
    }

    public WitnessWhereInput managementIpNotIn(List<String> managementIpNotIn) {

        this.managementIpNotIn = managementIpNotIn;
        return this;
    }

    public WitnessWhereInput addManagementIpNotInItem(String managementIpNotInItem) {
        if (this.managementIpNotIn == null) {
            this.managementIpNotIn = new ArrayList<String>();
        }
        this.managementIpNotIn.add(managementIpNotInItem);
        return this;
    }

    /**
     * Get managementIpNotIn
     *
     * @return managementIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getManagementIpNotIn() {
        return managementIpNotIn;
    }

    public void setManagementIpNotIn(List<String> managementIpNotIn) {
        this.managementIpNotIn = managementIpNotIn;
    }

    public WitnessWhereInput managementIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN);
        return this;
    }

    public WitnessWhereInput managementIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN);
        return this;
    }

    public void setManagementIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN);
        }
    }

    public boolean getManagementIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN);
    }

    public WitnessWhereInput managementIpNotStartsWith(String managementIpNotStartsWith) {

        this.managementIpNotStartsWith = managementIpNotStartsWith;
        return this;
    }

    /**
     * Get managementIpNotStartsWith
     *
     * @return managementIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpNotStartsWith() {
        return managementIpNotStartsWith;
    }

    public void setManagementIpNotStartsWith(String managementIpNotStartsWith) {
        this.managementIpNotStartsWith = managementIpNotStartsWith;
    }

    public WitnessWhereInput managementIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput managementIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setManagementIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getManagementIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH);
    }

    public WitnessWhereInput managementIpStartsWith(String managementIpStartsWith) {

        this.managementIpStartsWith = managementIpStartsWith;
        return this;
    }

    /**
     * Get managementIpStartsWith
     *
     * @return managementIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementIpStartsWith() {
        return managementIpStartsWith;
    }

    public void setManagementIpStartsWith(String managementIpStartsWith) {
        this.managementIpStartsWith = managementIpStartsWith;
    }

    public WitnessWhereInput managementIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput managementIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH);
        return this;
    }

    public void setManagementIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH);
        }
    }

    public boolean getManagementIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH);
    }

    public WitnessWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WitnessWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public WitnessWhereInput name_ExplictlyNonNull() {
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

    public WitnessWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public WitnessWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public WitnessWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public WitnessWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public WitnessWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public WitnessWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public WitnessWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public WitnessWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public WitnessWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public WitnessWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public WitnessWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public WitnessWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public WitnessWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public WitnessWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public WitnessWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public WitnessWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public WitnessWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public WitnessWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public WitnessWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public WitnessWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public WitnessWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public WitnessWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public WitnessWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public WitnessWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public WitnessWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public WitnessWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public WitnessWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public WitnessWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public WitnessWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public WitnessWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public WitnessWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public WitnessWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public WitnessWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public WitnessWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public WitnessWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public WitnessWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public WitnessWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public WitnessWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public WitnessWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public WitnessWhereInput systemDataCapacity(Long systemDataCapacity) {

        this.systemDataCapacity = systemDataCapacity;
        return this;
    }

    /**
     * Get systemDataCapacity
     *
     * @return systemDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemDataCapacity() {
        return systemDataCapacity;
    }

    public void setSystemDataCapacity(Long systemDataCapacity) {
        this.systemDataCapacity = systemDataCapacity;
    }

    public WitnessWhereInput systemDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY);
        return this;
    }

    public WitnessWhereInput systemDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY);
        return this;
    }

    public void setSystemDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY);
        }
    }

    public boolean getSystemDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY);
    }

    public WitnessWhereInput systemDataCapacityGt(Long systemDataCapacityGt) {

        this.systemDataCapacityGt = systemDataCapacityGt;
        return this;
    }

    /**
     * Get systemDataCapacityGt
     *
     * @return systemDataCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemDataCapacityGt() {
        return systemDataCapacityGt;
    }

    public void setSystemDataCapacityGt(Long systemDataCapacityGt) {
        this.systemDataCapacityGt = systemDataCapacityGt;
    }

    public WitnessWhereInput systemDataCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT);
        return this;
    }

    public WitnessWhereInput systemDataCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT);
        return this;
    }

    public void setSystemDataCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT);
        }
    }

    public boolean getSystemDataCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GT);
    }

    public WitnessWhereInput systemDataCapacityGte(Long systemDataCapacityGte) {

        this.systemDataCapacityGte = systemDataCapacityGte;
        return this;
    }

    /**
     * Get systemDataCapacityGte
     *
     * @return systemDataCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemDataCapacityGte() {
        return systemDataCapacityGte;
    }

    public void setSystemDataCapacityGte(Long systemDataCapacityGte) {
        this.systemDataCapacityGte = systemDataCapacityGte;
    }

    public WitnessWhereInput systemDataCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE);
        return this;
    }

    public WitnessWhereInput systemDataCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE);
        return this;
    }

    public void setSystemDataCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE);
        }
    }

    public boolean getSystemDataCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_GTE);
    }

    public WitnessWhereInput systemDataCapacityIn(List<Long> systemDataCapacityIn) {

        this.systemDataCapacityIn = systemDataCapacityIn;
        return this;
    }

    public WitnessWhereInput addSystemDataCapacityInItem(Long systemDataCapacityInItem) {
        if (this.systemDataCapacityIn == null) {
            this.systemDataCapacityIn = new ArrayList<Long>();
        }
        this.systemDataCapacityIn.add(systemDataCapacityInItem);
        return this;
    }

    /**
     * Get systemDataCapacityIn
     *
     * @return systemDataCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSystemDataCapacityIn() {
        return systemDataCapacityIn;
    }

    public void setSystemDataCapacityIn(List<Long> systemDataCapacityIn) {
        this.systemDataCapacityIn = systemDataCapacityIn;
    }

    public WitnessWhereInput systemDataCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN);
        return this;
    }

    public WitnessWhereInput systemDataCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN);
        return this;
    }

    public void setSystemDataCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN);
        }
    }

    public boolean getSystemDataCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_IN);
    }

    public WitnessWhereInput systemDataCapacityLt(Long systemDataCapacityLt) {

        this.systemDataCapacityLt = systemDataCapacityLt;
        return this;
    }

    /**
     * Get systemDataCapacityLt
     *
     * @return systemDataCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemDataCapacityLt() {
        return systemDataCapacityLt;
    }

    public void setSystemDataCapacityLt(Long systemDataCapacityLt) {
        this.systemDataCapacityLt = systemDataCapacityLt;
    }

    public WitnessWhereInput systemDataCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT);
        return this;
    }

    public WitnessWhereInput systemDataCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT);
        return this;
    }

    public void setSystemDataCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT);
        }
    }

    public boolean getSystemDataCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LT);
    }

    public WitnessWhereInput systemDataCapacityLte(Long systemDataCapacityLte) {

        this.systemDataCapacityLte = systemDataCapacityLte;
        return this;
    }

    /**
     * Get systemDataCapacityLte
     *
     * @return systemDataCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemDataCapacityLte() {
        return systemDataCapacityLte;
    }

    public void setSystemDataCapacityLte(Long systemDataCapacityLte) {
        this.systemDataCapacityLte = systemDataCapacityLte;
    }

    public WitnessWhereInput systemDataCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE);
        return this;
    }

    public WitnessWhereInput systemDataCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE);
        return this;
    }

    public void setSystemDataCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE);
        }
    }

    public boolean getSystemDataCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_LTE);
    }

    public WitnessWhereInput systemDataCapacityNot(Long systemDataCapacityNot) {

        this.systemDataCapacityNot = systemDataCapacityNot;
        return this;
    }

    /**
     * Get systemDataCapacityNot
     *
     * @return systemDataCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemDataCapacityNot() {
        return systemDataCapacityNot;
    }

    public void setSystemDataCapacityNot(Long systemDataCapacityNot) {
        this.systemDataCapacityNot = systemDataCapacityNot;
    }

    public WitnessWhereInput systemDataCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT);
        return this;
    }

    public WitnessWhereInput systemDataCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT);
        return this;
    }

    public void setSystemDataCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT);
        }
    }

    public boolean getSystemDataCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT);
    }

    public WitnessWhereInput systemDataCapacityNotIn(List<Long> systemDataCapacityNotIn) {

        this.systemDataCapacityNotIn = systemDataCapacityNotIn;
        return this;
    }

    public WitnessWhereInput addSystemDataCapacityNotInItem(Long systemDataCapacityNotInItem) {
        if (this.systemDataCapacityNotIn == null) {
            this.systemDataCapacityNotIn = new ArrayList<Long>();
        }
        this.systemDataCapacityNotIn.add(systemDataCapacityNotInItem);
        return this;
    }

    /**
     * Get systemDataCapacityNotIn
     *
     * @return systemDataCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSystemDataCapacityNotIn() {
        return systemDataCapacityNotIn;
    }

    public void setSystemDataCapacityNotIn(List<Long> systemDataCapacityNotIn) {
        this.systemDataCapacityNotIn = systemDataCapacityNotIn;
    }

    public WitnessWhereInput systemDataCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public WitnessWhereInput systemDataCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN);
        return this;
    }

    public void setSystemDataCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN);
        }
    }

    public boolean getSystemDataCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY_NOT_IN);
    }

    public WitnessWhereInput systemUsedDataSpace(Long systemUsedDataSpace) {

        this.systemUsedDataSpace = systemUsedDataSpace;
        return this;
    }

    /**
     * Get systemUsedDataSpace
     *
     * @return systemUsedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemUsedDataSpace() {
        return systemUsedDataSpace;
    }

    public void setSystemUsedDataSpace(Long systemUsedDataSpace) {
        this.systemUsedDataSpace = systemUsedDataSpace;
    }

    public WitnessWhereInput systemUsedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE);
        return this;
    }

    public void setSystemUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE);
        }
    }

    public boolean getSystemUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE);
    }

    public WitnessWhereInput systemUsedDataSpaceGt(Long systemUsedDataSpaceGt) {

        this.systemUsedDataSpaceGt = systemUsedDataSpaceGt;
        return this;
    }

    /**
     * Get systemUsedDataSpaceGt
     *
     * @return systemUsedDataSpaceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemUsedDataSpaceGt() {
        return systemUsedDataSpaceGt;
    }

    public void setSystemUsedDataSpaceGt(Long systemUsedDataSpaceGt) {
        this.systemUsedDataSpaceGt = systemUsedDataSpaceGt;
    }

    public WitnessWhereInput systemUsedDataSpaceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT);
        return this;
    }

    public void setSystemUsedDataSpaceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT);
        }
    }

    public boolean getSystemUsedDataSpaceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GT);
    }

    public WitnessWhereInput systemUsedDataSpaceGte(Long systemUsedDataSpaceGte) {

        this.systemUsedDataSpaceGte = systemUsedDataSpaceGte;
        return this;
    }

    /**
     * Get systemUsedDataSpaceGte
     *
     * @return systemUsedDataSpaceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemUsedDataSpaceGte() {
        return systemUsedDataSpaceGte;
    }

    public void setSystemUsedDataSpaceGte(Long systemUsedDataSpaceGte) {
        this.systemUsedDataSpaceGte = systemUsedDataSpaceGte;
    }

    public WitnessWhereInput systemUsedDataSpaceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE);
        return this;
    }

    public void setSystemUsedDataSpaceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE);
        }
    }

    public boolean getSystemUsedDataSpaceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_GTE);
    }

    public WitnessWhereInput systemUsedDataSpaceIn(List<Long> systemUsedDataSpaceIn) {

        this.systemUsedDataSpaceIn = systemUsedDataSpaceIn;
        return this;
    }

    public WitnessWhereInput addSystemUsedDataSpaceInItem(Long systemUsedDataSpaceInItem) {
        if (this.systemUsedDataSpaceIn == null) {
            this.systemUsedDataSpaceIn = new ArrayList<Long>();
        }
        this.systemUsedDataSpaceIn.add(systemUsedDataSpaceInItem);
        return this;
    }

    /**
     * Get systemUsedDataSpaceIn
     *
     * @return systemUsedDataSpaceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSystemUsedDataSpaceIn() {
        return systemUsedDataSpaceIn;
    }

    public void setSystemUsedDataSpaceIn(List<Long> systemUsedDataSpaceIn) {
        this.systemUsedDataSpaceIn = systemUsedDataSpaceIn;
    }

    public WitnessWhereInput systemUsedDataSpaceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN);
        return this;
    }

    public void setSystemUsedDataSpaceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN);
        }
    }

    public boolean getSystemUsedDataSpaceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_IN);
    }

    public WitnessWhereInput systemUsedDataSpaceLt(Long systemUsedDataSpaceLt) {

        this.systemUsedDataSpaceLt = systemUsedDataSpaceLt;
        return this;
    }

    /**
     * Get systemUsedDataSpaceLt
     *
     * @return systemUsedDataSpaceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemUsedDataSpaceLt() {
        return systemUsedDataSpaceLt;
    }

    public void setSystemUsedDataSpaceLt(Long systemUsedDataSpaceLt) {
        this.systemUsedDataSpaceLt = systemUsedDataSpaceLt;
    }

    public WitnessWhereInput systemUsedDataSpaceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT);
        return this;
    }

    public void setSystemUsedDataSpaceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT);
        }
    }

    public boolean getSystemUsedDataSpaceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LT);
    }

    public WitnessWhereInput systemUsedDataSpaceLte(Long systemUsedDataSpaceLte) {

        this.systemUsedDataSpaceLte = systemUsedDataSpaceLte;
        return this;
    }

    /**
     * Get systemUsedDataSpaceLte
     *
     * @return systemUsedDataSpaceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemUsedDataSpaceLte() {
        return systemUsedDataSpaceLte;
    }

    public void setSystemUsedDataSpaceLte(Long systemUsedDataSpaceLte) {
        this.systemUsedDataSpaceLte = systemUsedDataSpaceLte;
    }

    public WitnessWhereInput systemUsedDataSpaceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE);
        return this;
    }

    public void setSystemUsedDataSpaceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE);
        }
    }

    public boolean getSystemUsedDataSpaceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_LTE);
    }

    public WitnessWhereInput systemUsedDataSpaceNot(Long systemUsedDataSpaceNot) {

        this.systemUsedDataSpaceNot = systemUsedDataSpaceNot;
        return this;
    }

    /**
     * Get systemUsedDataSpaceNot
     *
     * @return systemUsedDataSpaceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSystemUsedDataSpaceNot() {
        return systemUsedDataSpaceNot;
    }

    public void setSystemUsedDataSpaceNot(Long systemUsedDataSpaceNot) {
        this.systemUsedDataSpaceNot = systemUsedDataSpaceNot;
    }

    public WitnessWhereInput systemUsedDataSpaceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT);
        return this;
    }

    public void setSystemUsedDataSpaceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT);
        }
    }

    public boolean getSystemUsedDataSpaceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT);
    }

    public WitnessWhereInput systemUsedDataSpaceNotIn(List<Long> systemUsedDataSpaceNotIn) {

        this.systemUsedDataSpaceNotIn = systemUsedDataSpaceNotIn;
        return this;
    }

    public WitnessWhereInput addSystemUsedDataSpaceNotInItem(Long systemUsedDataSpaceNotInItem) {
        if (this.systemUsedDataSpaceNotIn == null) {
            this.systemUsedDataSpaceNotIn = new ArrayList<Long>();
        }
        this.systemUsedDataSpaceNotIn.add(systemUsedDataSpaceNotInItem);
        return this;
    }

    /**
     * Get systemUsedDataSpaceNotIn
     *
     * @return systemUsedDataSpaceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSystemUsedDataSpaceNotIn() {
        return systemUsedDataSpaceNotIn;
    }

    public void setSystemUsedDataSpaceNotIn(List<Long> systemUsedDataSpaceNotIn) {
        this.systemUsedDataSpaceNotIn = systemUsedDataSpaceNotIn;
    }

    public WitnessWhereInput systemUsedDataSpaceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public WitnessWhereInput systemUsedDataSpaceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN);
        return this;
    }

    public void setSystemUsedDataSpaceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN);
        }
    }

    public boolean getSystemUsedDataSpaceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE_NOT_IN);
    }

    public WitnessWhereInput totalCpuCores(Integer totalCpuCores) {

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

    public WitnessWhereInput totalCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public WitnessWhereInput totalCpuCores_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresGt(Integer totalCpuCoresGt) {

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

    public WitnessWhereInput totalCpuCoresGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GT);
        return this;
    }

    public WitnessWhereInput totalCpuCoresGt_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresGte(Integer totalCpuCoresGte) {

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

    public WitnessWhereInput totalCpuCoresGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE);
        return this;
    }

    public WitnessWhereInput totalCpuCoresGte_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresIn(List<Integer> totalCpuCoresIn) {

        this.totalCpuCoresIn = totalCpuCoresIn;
        return this;
    }

    public WitnessWhereInput addTotalCpuCoresInItem(Integer totalCpuCoresInItem) {
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

    public WitnessWhereInput totalCpuCoresIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_IN);
        return this;
    }

    public WitnessWhereInput totalCpuCoresIn_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresLt(Integer totalCpuCoresLt) {

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

    public WitnessWhereInput totalCpuCoresLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LT);
        return this;
    }

    public WitnessWhereInput totalCpuCoresLt_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresLte(Integer totalCpuCoresLte) {

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

    public WitnessWhereInput totalCpuCoresLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE);
        return this;
    }

    public WitnessWhereInput totalCpuCoresLte_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresNot(Integer totalCpuCoresNot) {

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

    public WitnessWhereInput totalCpuCoresNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT);
        return this;
    }

    public WitnessWhereInput totalCpuCoresNot_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {

        this.totalCpuCoresNotIn = totalCpuCoresNotIn;
        return this;
    }

    public WitnessWhereInput addTotalCpuCoresNotInItem(Integer totalCpuCoresNotInItem) {
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

    public WitnessWhereInput totalCpuCoresNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN);
        return this;
    }

    public WitnessWhereInput totalCpuCoresNotIn_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHz(Long totalCpuHz) {

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

    public WitnessWhereInput totalCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public WitnessWhereInput totalCpuHz_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzGt(Long totalCpuHzGt) {

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

    public WitnessWhereInput totalCpuHzGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GT);
        return this;
    }

    public WitnessWhereInput totalCpuHzGt_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzGte(Long totalCpuHzGte) {

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

    public WitnessWhereInput totalCpuHzGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE);
        return this;
    }

    public WitnessWhereInput totalCpuHzGte_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzIn(List<Long> totalCpuHzIn) {

        this.totalCpuHzIn = totalCpuHzIn;
        return this;
    }

    public WitnessWhereInput addTotalCpuHzInItem(Long totalCpuHzInItem) {
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

    public WitnessWhereInput totalCpuHzIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_IN);
        return this;
    }

    public WitnessWhereInput totalCpuHzIn_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzLt(Long totalCpuHzLt) {

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

    public WitnessWhereInput totalCpuHzLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LT);
        return this;
    }

    public WitnessWhereInput totalCpuHzLt_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzLte(Long totalCpuHzLte) {

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

    public WitnessWhereInput totalCpuHzLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE);
        return this;
    }

    public WitnessWhereInput totalCpuHzLte_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzNot(Long totalCpuHzNot) {

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

    public WitnessWhereInput totalCpuHzNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT);
        return this;
    }

    public WitnessWhereInput totalCpuHzNot_ExplictlyNonNull() {
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

    public WitnessWhereInput totalCpuHzNotIn(List<Long> totalCpuHzNotIn) {

        this.totalCpuHzNotIn = totalCpuHzNotIn;
        return this;
    }

    public WitnessWhereInput addTotalCpuHzNotInItem(Long totalCpuHzNotInItem) {
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

    public WitnessWhereInput totalCpuHzNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN);
        return this;
    }

    public WitnessWhereInput totalCpuHzNotIn_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytes(Long totalMemoryBytes) {

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

    public WitnessWhereInput totalMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public WitnessWhereInput totalMemoryBytes_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesGt(Long totalMemoryBytesGt) {

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

    public WitnessWhereInput totalMemoryBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesGt_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesGte(Long totalMemoryBytesGte) {

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

    public WitnessWhereInput totalMemoryBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesGte_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesIn(List<Long> totalMemoryBytesIn) {

        this.totalMemoryBytesIn = totalMemoryBytesIn;
        return this;
    }

    public WitnessWhereInput addTotalMemoryBytesInItem(Long totalMemoryBytesInItem) {
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

    public WitnessWhereInput totalMemoryBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesIn_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesLt(Long totalMemoryBytesLt) {

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

    public WitnessWhereInput totalMemoryBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesLt_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesLte(Long totalMemoryBytesLte) {

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

    public WitnessWhereInput totalMemoryBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesLte_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesNot(Long totalMemoryBytesNot) {

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

    public WitnessWhereInput totalMemoryBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesNot_ExplictlyNonNull() {
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

    public WitnessWhereInput totalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {

        this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
        return this;
    }

    public WitnessWhereInput addTotalMemoryBytesNotInItem(Long totalMemoryBytesNotInItem) {
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

    public WitnessWhereInput totalMemoryBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN);
        return this;
    }

    public WitnessWhereInput totalMemoryBytesNotIn_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WitnessWhereInput witnessWhereInput = (WitnessWhereInput) o;
        return Objects.equals(this.AND, witnessWhereInput.AND)
                && Objects.equals(this.NOT, witnessWhereInput.NOT)
                && Objects.equals(this.OR, witnessWhereInput.OR)
                && Objects.equals(this.cluster, witnessWhereInput.cluster)
                && Objects.equals(this.cpuHzPerCore, witnessWhereInput.cpuHzPerCore)
                && Objects.equals(this.cpuHzPerCoreGt, witnessWhereInput.cpuHzPerCoreGt)
                && Objects.equals(this.cpuHzPerCoreGte, witnessWhereInput.cpuHzPerCoreGte)
                && Objects.equals(this.cpuHzPerCoreIn, witnessWhereInput.cpuHzPerCoreIn)
                && Objects.equals(this.cpuHzPerCoreLt, witnessWhereInput.cpuHzPerCoreLt)
                && Objects.equals(this.cpuHzPerCoreLte, witnessWhereInput.cpuHzPerCoreLte)
                && Objects.equals(this.cpuHzPerCoreNot, witnessWhereInput.cpuHzPerCoreNot)
                && Objects.equals(this.cpuHzPerCoreNotIn, witnessWhereInput.cpuHzPerCoreNotIn)
                && Objects.equals(this.dataIp, witnessWhereInput.dataIp)
                && Objects.equals(this.dataIpContains, witnessWhereInput.dataIpContains)
                && Objects.equals(this.dataIpEndsWith, witnessWhereInput.dataIpEndsWith)
                && Objects.equals(this.dataIpGt, witnessWhereInput.dataIpGt)
                && Objects.equals(this.dataIpGte, witnessWhereInput.dataIpGte)
                && Objects.equals(this.dataIpIn, witnessWhereInput.dataIpIn)
                && Objects.equals(this.dataIpLt, witnessWhereInput.dataIpLt)
                && Objects.equals(this.dataIpLte, witnessWhereInput.dataIpLte)
                && Objects.equals(this.dataIpNot, witnessWhereInput.dataIpNot)
                && Objects.equals(this.dataIpNotContains, witnessWhereInput.dataIpNotContains)
                && Objects.equals(this.dataIpNotEndsWith, witnessWhereInput.dataIpNotEndsWith)
                && Objects.equals(this.dataIpNotIn, witnessWhereInput.dataIpNotIn)
                && Objects.equals(this.dataIpNotStartsWith, witnessWhereInput.dataIpNotStartsWith)
                && Objects.equals(this.dataIpStartsWith, witnessWhereInput.dataIpStartsWith)
                && Objects.equals(this.id, witnessWhereInput.id)
                && Objects.equals(this.idContains, witnessWhereInput.idContains)
                && Objects.equals(this.idEndsWith, witnessWhereInput.idEndsWith)
                && Objects.equals(this.idGt, witnessWhereInput.idGt)
                && Objects.equals(this.idGte, witnessWhereInput.idGte)
                && Objects.equals(this.idIn, witnessWhereInput.idIn)
                && Objects.equals(this.idLt, witnessWhereInput.idLt)
                && Objects.equals(this.idLte, witnessWhereInput.idLte)
                && Objects.equals(this.idNot, witnessWhereInput.idNot)
                && Objects.equals(this.idNotContains, witnessWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, witnessWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, witnessWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, witnessWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, witnessWhereInput.idStartsWith)
                && Objects.equals(this.localId, witnessWhereInput.localId)
                && Objects.equals(this.localIdContains, witnessWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, witnessWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, witnessWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, witnessWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, witnessWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, witnessWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, witnessWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, witnessWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, witnessWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, witnessWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, witnessWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, witnessWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, witnessWhereInput.localIdStartsWith)
                && Objects.equals(this.managementIp, witnessWhereInput.managementIp)
                && Objects.equals(this.managementIpContains, witnessWhereInput.managementIpContains)
                && Objects.equals(this.managementIpEndsWith, witnessWhereInput.managementIpEndsWith)
                && Objects.equals(this.managementIpGt, witnessWhereInput.managementIpGt)
                && Objects.equals(this.managementIpGte, witnessWhereInput.managementIpGte)
                && Objects.equals(this.managementIpIn, witnessWhereInput.managementIpIn)
                && Objects.equals(this.managementIpLt, witnessWhereInput.managementIpLt)
                && Objects.equals(this.managementIpLte, witnessWhereInput.managementIpLte)
                && Objects.equals(this.managementIpNot, witnessWhereInput.managementIpNot)
                && Objects.equals(
                        this.managementIpNotContains, witnessWhereInput.managementIpNotContains)
                && Objects.equals(
                        this.managementIpNotEndsWith, witnessWhereInput.managementIpNotEndsWith)
                && Objects.equals(this.managementIpNotIn, witnessWhereInput.managementIpNotIn)
                && Objects.equals(
                        this.managementIpNotStartsWith, witnessWhereInput.managementIpNotStartsWith)
                && Objects.equals(
                        this.managementIpStartsWith, witnessWhereInput.managementIpStartsWith)
                && Objects.equals(this.name, witnessWhereInput.name)
                && Objects.equals(this.nameContains, witnessWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, witnessWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, witnessWhereInput.nameGt)
                && Objects.equals(this.nameGte, witnessWhereInput.nameGte)
                && Objects.equals(this.nameIn, witnessWhereInput.nameIn)
                && Objects.equals(this.nameLt, witnessWhereInput.nameLt)
                && Objects.equals(this.nameLte, witnessWhereInput.nameLte)
                && Objects.equals(this.nameNot, witnessWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, witnessWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, witnessWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, witnessWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, witnessWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, witnessWhereInput.nameStartsWith)
                && Objects.equals(this.systemDataCapacity, witnessWhereInput.systemDataCapacity)
                && Objects.equals(this.systemDataCapacityGt, witnessWhereInput.systemDataCapacityGt)
                && Objects.equals(
                        this.systemDataCapacityGte, witnessWhereInput.systemDataCapacityGte)
                && Objects.equals(this.systemDataCapacityIn, witnessWhereInput.systemDataCapacityIn)
                && Objects.equals(this.systemDataCapacityLt, witnessWhereInput.systemDataCapacityLt)
                && Objects.equals(
                        this.systemDataCapacityLte, witnessWhereInput.systemDataCapacityLte)
                && Objects.equals(
                        this.systemDataCapacityNot, witnessWhereInput.systemDataCapacityNot)
                && Objects.equals(
                        this.systemDataCapacityNotIn, witnessWhereInput.systemDataCapacityNotIn)
                && Objects.equals(this.systemUsedDataSpace, witnessWhereInput.systemUsedDataSpace)
                && Objects.equals(
                        this.systemUsedDataSpaceGt, witnessWhereInput.systemUsedDataSpaceGt)
                && Objects.equals(
                        this.systemUsedDataSpaceGte, witnessWhereInput.systemUsedDataSpaceGte)
                && Objects.equals(
                        this.systemUsedDataSpaceIn, witnessWhereInput.systemUsedDataSpaceIn)
                && Objects.equals(
                        this.systemUsedDataSpaceLt, witnessWhereInput.systemUsedDataSpaceLt)
                && Objects.equals(
                        this.systemUsedDataSpaceLte, witnessWhereInput.systemUsedDataSpaceLte)
                && Objects.equals(
                        this.systemUsedDataSpaceNot, witnessWhereInput.systemUsedDataSpaceNot)
                && Objects.equals(
                        this.systemUsedDataSpaceNotIn, witnessWhereInput.systemUsedDataSpaceNotIn)
                && Objects.equals(this.totalCpuCores, witnessWhereInput.totalCpuCores)
                && Objects.equals(this.totalCpuCoresGt, witnessWhereInput.totalCpuCoresGt)
                && Objects.equals(this.totalCpuCoresGte, witnessWhereInput.totalCpuCoresGte)
                && Objects.equals(this.totalCpuCoresIn, witnessWhereInput.totalCpuCoresIn)
                && Objects.equals(this.totalCpuCoresLt, witnessWhereInput.totalCpuCoresLt)
                && Objects.equals(this.totalCpuCoresLte, witnessWhereInput.totalCpuCoresLte)
                && Objects.equals(this.totalCpuCoresNot, witnessWhereInput.totalCpuCoresNot)
                && Objects.equals(this.totalCpuCoresNotIn, witnessWhereInput.totalCpuCoresNotIn)
                && Objects.equals(this.totalCpuHz, witnessWhereInput.totalCpuHz)
                && Objects.equals(this.totalCpuHzGt, witnessWhereInput.totalCpuHzGt)
                && Objects.equals(this.totalCpuHzGte, witnessWhereInput.totalCpuHzGte)
                && Objects.equals(this.totalCpuHzIn, witnessWhereInput.totalCpuHzIn)
                && Objects.equals(this.totalCpuHzLt, witnessWhereInput.totalCpuHzLt)
                && Objects.equals(this.totalCpuHzLte, witnessWhereInput.totalCpuHzLte)
                && Objects.equals(this.totalCpuHzNot, witnessWhereInput.totalCpuHzNot)
                && Objects.equals(this.totalCpuHzNotIn, witnessWhereInput.totalCpuHzNotIn)
                && Objects.equals(this.totalMemoryBytes, witnessWhereInput.totalMemoryBytes)
                && Objects.equals(this.totalMemoryBytesGt, witnessWhereInput.totalMemoryBytesGt)
                && Objects.equals(this.totalMemoryBytesGte, witnessWhereInput.totalMemoryBytesGte)
                && Objects.equals(this.totalMemoryBytesIn, witnessWhereInput.totalMemoryBytesIn)
                && Objects.equals(this.totalMemoryBytesLt, witnessWhereInput.totalMemoryBytesLt)
                && Objects.equals(this.totalMemoryBytesLte, witnessWhereInput.totalMemoryBytesLte)
                && Objects.equals(this.totalMemoryBytesNot, witnessWhereInput.totalMemoryBytesNot)
                && Objects.equals(
                        this.totalMemoryBytesNotIn, witnessWhereInput.totalMemoryBytesNotIn);
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
                cpuHzPerCore,
                cpuHzPerCoreGt,
                cpuHzPerCoreGte,
                cpuHzPerCoreIn,
                cpuHzPerCoreLt,
                cpuHzPerCoreLte,
                cpuHzPerCoreNot,
                cpuHzPerCoreNotIn,
                dataIp,
                dataIpContains,
                dataIpEndsWith,
                dataIpGt,
                dataIpGte,
                dataIpIn,
                dataIpLt,
                dataIpLte,
                dataIpNot,
                dataIpNotContains,
                dataIpNotEndsWith,
                dataIpNotIn,
                dataIpNotStartsWith,
                dataIpStartsWith,
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
                managementIp,
                managementIpContains,
                managementIpEndsWith,
                managementIpGt,
                managementIpGte,
                managementIpIn,
                managementIpLt,
                managementIpLte,
                managementIpNot,
                managementIpNotContains,
                managementIpNotEndsWith,
                managementIpNotIn,
                managementIpNotStartsWith,
                managementIpStartsWith,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                systemDataCapacity,
                systemDataCapacityGt,
                systemDataCapacityGte,
                systemDataCapacityIn,
                systemDataCapacityLt,
                systemDataCapacityLte,
                systemDataCapacityNot,
                systemDataCapacityNotIn,
                systemUsedDataSpace,
                systemUsedDataSpaceGt,
                systemUsedDataSpaceGte,
                systemUsedDataSpaceIn,
                systemUsedDataSpaceLt,
                systemUsedDataSpaceLte,
                systemUsedDataSpaceNot,
                systemUsedDataSpaceNotIn,
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
                totalMemoryBytes,
                totalMemoryBytesGt,
                totalMemoryBytesGte,
                totalMemoryBytesIn,
                totalMemoryBytesLt,
                totalMemoryBytesLte,
                totalMemoryBytesNot,
                totalMemoryBytesNotIn);
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
        sb.append("class WitnessWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    cpuHzPerCore: ").append(toIndentedString(cpuHzPerCore)).append("\n");
        sb.append("    cpuHzPerCoreGt: ").append(toIndentedString(cpuHzPerCoreGt)).append("\n");
        sb.append("    cpuHzPerCoreGte: ").append(toIndentedString(cpuHzPerCoreGte)).append("\n");
        sb.append("    cpuHzPerCoreIn: ").append(toIndentedString(cpuHzPerCoreIn)).append("\n");
        sb.append("    cpuHzPerCoreLt: ").append(toIndentedString(cpuHzPerCoreLt)).append("\n");
        sb.append("    cpuHzPerCoreLte: ").append(toIndentedString(cpuHzPerCoreLte)).append("\n");
        sb.append("    cpuHzPerCoreNot: ").append(toIndentedString(cpuHzPerCoreNot)).append("\n");
        sb.append("    cpuHzPerCoreNotIn: ")
                .append(toIndentedString(cpuHzPerCoreNotIn))
                .append("\n");
        sb.append("    dataIp: ").append(toIndentedString(dataIp)).append("\n");
        sb.append("    dataIpContains: ").append(toIndentedString(dataIpContains)).append("\n");
        sb.append("    dataIpEndsWith: ").append(toIndentedString(dataIpEndsWith)).append("\n");
        sb.append("    dataIpGt: ").append(toIndentedString(dataIpGt)).append("\n");
        sb.append("    dataIpGte: ").append(toIndentedString(dataIpGte)).append("\n");
        sb.append("    dataIpIn: ").append(toIndentedString(dataIpIn)).append("\n");
        sb.append("    dataIpLt: ").append(toIndentedString(dataIpLt)).append("\n");
        sb.append("    dataIpLte: ").append(toIndentedString(dataIpLte)).append("\n");
        sb.append("    dataIpNot: ").append(toIndentedString(dataIpNot)).append("\n");
        sb.append("    dataIpNotContains: ")
                .append(toIndentedString(dataIpNotContains))
                .append("\n");
        sb.append("    dataIpNotEndsWith: ")
                .append(toIndentedString(dataIpNotEndsWith))
                .append("\n");
        sb.append("    dataIpNotIn: ").append(toIndentedString(dataIpNotIn)).append("\n");
        sb.append("    dataIpNotStartsWith: ")
                .append(toIndentedString(dataIpNotStartsWith))
                .append("\n");
        sb.append("    dataIpStartsWith: ").append(toIndentedString(dataIpStartsWith)).append("\n");
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
        sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
        sb.append("    managementIpContains: ")
                .append(toIndentedString(managementIpContains))
                .append("\n");
        sb.append("    managementIpEndsWith: ")
                .append(toIndentedString(managementIpEndsWith))
                .append("\n");
        sb.append("    managementIpGt: ").append(toIndentedString(managementIpGt)).append("\n");
        sb.append("    managementIpGte: ").append(toIndentedString(managementIpGte)).append("\n");
        sb.append("    managementIpIn: ").append(toIndentedString(managementIpIn)).append("\n");
        sb.append("    managementIpLt: ").append(toIndentedString(managementIpLt)).append("\n");
        sb.append("    managementIpLte: ").append(toIndentedString(managementIpLte)).append("\n");
        sb.append("    managementIpNot: ").append(toIndentedString(managementIpNot)).append("\n");
        sb.append("    managementIpNotContains: ")
                .append(toIndentedString(managementIpNotContains))
                .append("\n");
        sb.append("    managementIpNotEndsWith: ")
                .append(toIndentedString(managementIpNotEndsWith))
                .append("\n");
        sb.append("    managementIpNotIn: ")
                .append(toIndentedString(managementIpNotIn))
                .append("\n");
        sb.append("    managementIpNotStartsWith: ")
                .append(toIndentedString(managementIpNotStartsWith))
                .append("\n");
        sb.append("    managementIpStartsWith: ")
                .append(toIndentedString(managementIpStartsWith))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    systemDataCapacity: ")
                .append(toIndentedString(systemDataCapacity))
                .append("\n");
        sb.append("    systemDataCapacityGt: ")
                .append(toIndentedString(systemDataCapacityGt))
                .append("\n");
        sb.append("    systemDataCapacityGte: ")
                .append(toIndentedString(systemDataCapacityGte))
                .append("\n");
        sb.append("    systemDataCapacityIn: ")
                .append(toIndentedString(systemDataCapacityIn))
                .append("\n");
        sb.append("    systemDataCapacityLt: ")
                .append(toIndentedString(systemDataCapacityLt))
                .append("\n");
        sb.append("    systemDataCapacityLte: ")
                .append(toIndentedString(systemDataCapacityLte))
                .append("\n");
        sb.append("    systemDataCapacityNot: ")
                .append(toIndentedString(systemDataCapacityNot))
                .append("\n");
        sb.append("    systemDataCapacityNotIn: ")
                .append(toIndentedString(systemDataCapacityNotIn))
                .append("\n");
        sb.append("    systemUsedDataSpace: ")
                .append(toIndentedString(systemUsedDataSpace))
                .append("\n");
        sb.append("    systemUsedDataSpaceGt: ")
                .append(toIndentedString(systemUsedDataSpaceGt))
                .append("\n");
        sb.append("    systemUsedDataSpaceGte: ")
                .append(toIndentedString(systemUsedDataSpaceGte))
                .append("\n");
        sb.append("    systemUsedDataSpaceIn: ")
                .append(toIndentedString(systemUsedDataSpaceIn))
                .append("\n");
        sb.append("    systemUsedDataSpaceLt: ")
                .append(toIndentedString(systemUsedDataSpaceLt))
                .append("\n");
        sb.append("    systemUsedDataSpaceLte: ")
                .append(toIndentedString(systemUsedDataSpaceLte))
                .append("\n");
        sb.append("    systemUsedDataSpaceNot: ")
                .append(toIndentedString(systemUsedDataSpaceNot))
                .append("\n");
        sb.append("    systemUsedDataSpaceNotIn: ")
                .append(toIndentedString(systemUsedDataSpaceNotIn))
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

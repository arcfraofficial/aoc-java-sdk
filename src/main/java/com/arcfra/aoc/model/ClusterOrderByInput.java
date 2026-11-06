package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ClusterOrderByInput */
@JsonAdapter(ClusterOrderByInput.Adapter.class)
public enum ClusterOrderByInput {
    ACCESS_WRITE_COMPRESS_ENABLED_ASC("access_write_compress_enabled_ASC"),

    ACCESS_WRITE_COMPRESS_ENABLED_DESC("access_write_compress_enabled_DESC"),

    ALLOCATED_MEMORY_BYTES_ASC("allocated_memory_bytes_ASC"),

    ALLOCATED_MEMORY_BYTES_DESC("allocated_memory_bytes_DESC"),

    ALLOCATED_PRIORITIZED_SPACE_ASC("allocated_prioritized_space_ASC"),

    ALLOCATED_PRIORITIZED_SPACE_DESC("allocated_prioritized_space_DESC"),

    ALLOCATED_PRIORITIZED_SPACE_USAGE_ASC("allocated_prioritized_space_usage_ASC"),

    ALLOCATED_PRIORITIZED_SPACE_USAGE_DESC("allocated_prioritized_space_usage_DESC"),

    APPLICATION_HIGHEST_VERSION_ASC("application_highest_version_ASC"),

    APPLICATION_HIGHEST_VERSION_DESC("application_highest_version_DESC"),

    ARCHITECTURE_ASC("architecture_ASC"),

    ARCHITECTURE_DESC("architecture_DESC"),

    AUTO_CONVERGE_ASC("auto_converge_ASC"),

    AUTO_CONVERGE_DESC("auto_converge_DESC"),

    CAP_SNAPSHOT_UNIQUE_SIZE_ASC("cap_snapshot_unique_size_ASC"),

    CAP_SNAPSHOT_UNIQUE_SIZE_DESC("cap_snapshot_unique_size_DESC"),

    CAP_VOLUME_UNIQUE_SIZE_ASC("cap_volume_unique_size_ASC"),

    CAP_VOLUME_UNIQUE_SIZE_DESC("cap_volume_unique_size_DESC"),

    COMMITED_MEMORY_BYTES_ASC("commited_memory_bytes_ASC"),

    COMMITED_MEMORY_BYTES_DESC("commited_memory_bytes_DESC"),

    CONNECT_STATE_ASC("connect_state_ASC"),

    CONNECT_STATE_DESC("connect_state_DESC"),

    CURRENT_CPU_MODEL_ASC("current_cpu_model_ASC"),

    CURRENT_CPU_MODEL_DESC("current_cpu_model_DESC"),

    DATA_REDUCTION_RATIO_ASC("data_reduction_ratio_ASC"),

    DATA_REDUCTION_RATIO_DESC("data_reduction_ratio_DESC"),

    DATA_REDUCTION_SAVING_ASC("data_reduction_saving_ASC"),

    DATA_REDUCTION_SAVING_DESC("data_reduction_saving_DESC"),

    DIRTY_CACHE_SPACE_ASC("dirty_cache_space_ASC"),

    DIRTY_CACHE_SPACE_DESC("dirty_cache_space_DESC"),

    DIRTY_CACHE_USAGE_ASC("dirty_cache_usage_ASC"),

    DIRTY_CACHE_USAGE_DESC("dirty_cache_usage_DESC"),

    DISCONNECTED_DATE_ASC("disconnected_date_ASC"),

    DISCONNECTED_DATE_DESC("disconnected_date_DESC"),

    DISCONNECTED_REASON_ASC("disconnected_reason_ASC"),

    DISCONNECTED_REASON_DESC("disconnected_reason_DESC"),

    DOWNGRADED_PRIORITIZED_SPACE_ASC("downgraded_prioritized_space_ASC"),

    DOWNGRADED_PRIORITIZED_SPACE_DESC("downgraded_prioritized_space_DESC"),

    ENABLE_TIERING_ASC("enable_tiering_ASC"),

    ENABLE_TIERING_DESC("enable_tiering_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FAILURE_CACHE_SPACE_ASC("failure_cache_space_ASC"),

    FAILURE_CACHE_SPACE_DESC("failure_cache_space_DESC"),

    FAILURE_DATA_SPACE_ASC("failure_data_space_ASC"),

    FAILURE_DATA_SPACE_DESC("failure_data_space_DESC"),

    HAS_METROX_ASC("has_metrox_ASC"),

    HAS_METROX_DESC("has_metrox_DESC"),

    HOST_NUM_ASC("host_num_ASC"),

    HOST_NUM_DESC("host_num_DESC"),

    HYPERVISOR_ASC("hypervisor_ASC"),

    HYPERVISOR_DESC("hypervisor_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IP_ASC("ip_ASC"),

    IP_DESC("ip_DESC"),

    IS_ALL_FLASH_ASC("is_all_flash_ASC"),

    IS_ALL_FLASH_DESC("is_all_flash_DESC"),

    ISCSI_VIP_ASC("iscsi_vip_ASC"),

    ISCSI_VIP_DESC("iscsi_vip_DESC"),

    LICENSE_EXPIRE_DATE_ASC("license_expire_date_ASC"),

    LICENSE_EXPIRE_DATE_DESC("license_expire_date_DESC"),

    LICENSE_SERIAL_ASC("license_serial_ASC"),

    LICENSE_SERIAL_DESC("license_serial_DESC"),

    LICENSE_SIGN_DATE_ASC("license_sign_date_ASC"),

    LICENSE_SIGN_DATE_DESC("license_sign_date_DESC"),

    LICENSE_TYPE_ASC("license_type_ASC"),

    LICENSE_TYPE_DESC("license_type_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOGICAL_USED_DATA_SPACE_ASC("logical_used_data_space_ASC"),

    LOGICAL_USED_DATA_SPACE_DESC("logical_used_data_space_DESC"),

    MAINTENANCE_END_DATE_ASC("maintenance_end_date_ASC"),

    MAINTENANCE_END_DATE_DESC("maintenance_end_date_DESC"),

    MAINTENANCE_START_DATE_ASC("maintenance_start_date_ASC"),

    MAINTENANCE_START_DATE_DESC("maintenance_start_date_DESC"),

    MANAGEMENT_VIP_ASC("management_vip_ASC"),

    MANAGEMENT_VIP_DESC("management_vip_DESC"),

    MAX_CHUNK_NUM_ASC("max_chunk_num_ASC"),

    MAX_CHUNK_NUM_DESC("max_chunk_num_DESC"),

    MAX_PHYSICAL_DATA_CAPACITY_ASC("max_physical_data_capacity_ASC"),

    MAX_PHYSICAL_DATA_CAPACITY_DESC("max_physical_data_capacity_DESC"),

    MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_ASC("max_physical_data_capacity_per_node_ASC"),

    MAX_PHYSICAL_DATA_CAPACITY_PER_NODE_DESC("max_physical_data_capacity_per_node_DESC"),

    MEMORY_ALLOCATION_RATE_ASC("memory_allocation_rate_ASC"),

    MEMORY_ALLOCATION_RATE_DESC("memory_allocation_rate_DESC"),

    METRO_AVAILABILITY_CHECKLIST_ASC("metro_availability_checklist_ASC"),

    METRO_AVAILABILITY_CHECKLIST_DESC("metro_availability_checklist_DESC"),

    MGT_GATEWAY_ASC("mgt_gateway_ASC"),

    MGT_GATEWAY_DESC("mgt_gateway_DESC"),

    MGT_NETMASK_ASC("mgt_netmask_ASC"),

    MGT_NETMASK_DESC("mgt_netmask_DESC"),

    MIGRATION_DATA_SIZE_ASC("migration_data_size_ASC"),

    MIGRATION_DATA_SIZE_DESC("migration_data_size_DESC"),

    MIGRATION_SPEED_ASC("migration_speed_ASC"),

    MIGRATION_SPEED_DESC("migration_speed_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NO_PERFORMANCE_LAYER_ASC("no_performance_layer_ASC"),

    NO_PERFORMANCE_LAYER_DESC("no_performance_layer_DESC"),

    NTP_MODE_ASC("ntp_mode_ASC"),

    NTP_MODE_DESC("ntp_mode_DESC"),

    NVME_OVER_RDMA_ENABLED_ASC("nvme_over_rdma_enabled_ASC"),

    NVME_OVER_RDMA_ENABLED_DESC("nvme_over_rdma_enabled_DESC"),

    NVME_OVER_TCP_ENABLED_ASC("nvme_over_tcp_enabled_ASC"),

    NVME_OVER_TCP_ENABLED_DESC("nvme_over_tcp_enabled_DESC"),

    NVMF_ENABLED_ASC("nvmf_enabled_ASC"),

    NVMF_ENABLED_DESC("nvmf_enabled_DESC"),

    OVERALL_EFFICIENCY_ASC("overall_efficiency_ASC"),

    OVERALL_EFFICIENCY_DESC("overall_efficiency_DESC"),

    OVERCOMMIT_MEMORY_RATIO_ASC("overcommit_memory_ratio_ASC"),

    OVERCOMMIT_MEMORY_RATIO_DESC("overcommit_memory_ratio_DESC"),

    OVERPROVISION_RATIO_ASC("overprovision_ratio_ASC"),

    OVERPROVISION_RATIO_DESC("overprovision_ratio_DESC"),

    PERF_ALLOCATED_DATA_SPACE_ASC("perf_allocated_data_space_ASC"),

    PERF_ALLOCATED_DATA_SPACE_DESC("perf_allocated_data_space_DESC"),

    PERF_FAILURE_DATA_SPACE_ASC("perf_failure_data_space_ASC"),

    PERF_FAILURE_DATA_SPACE_DESC("perf_failure_data_space_DESC"),

    PERF_TOTAL_DATA_CAPACITY_ASC("perf_total_data_capacity_ASC"),

    PERF_TOTAL_DATA_CAPACITY_DESC("perf_total_data_capacity_DESC"),

    PERF_USED_DATA_SPACE_ASC("perf_used_data_space_ASC"),

    PERF_USED_DATA_SPACE_DESC("perf_used_data_space_DESC"),

    PERF_VALID_DATA_SPACE_ASC("perf_valid_data_space_ASC"),

    PERF_VALID_DATA_SPACE_DESC("perf_valid_data_space_DESC"),

    PLANNED_PRIORITIZED_SPACE_ASC("planned_prioritized_space_ASC"),

    PLANNED_PRIORITIZED_SPACE_DESC("planned_prioritized_space_DESC"),

    PMEM_ENABLED_ASC("pmem_enabled_ASC"),

    PMEM_ENABLED_DESC("pmem_enabled_DESC"),

    PRIO_SPACE_PERCENTAGE_ASC("prio_space_percentage_ASC"),

    PRIO_SPACE_PERCENTAGE_DESC("prio_space_percentage_DESC"),

    PROVISIONED_CPU_CORES_ASC("provisioned_cpu_cores_ASC"),

    PROVISIONED_CPU_CORES_DESC("provisioned_cpu_cores_DESC"),

    PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_ASC("provisioned_cpu_cores_for_active_vm_ASC"),

    PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_DESC("provisioned_cpu_cores_for_active_vm_DESC"),

    PROVISIONED_FOR_ACTIVE_VM_RATIO_ASC("provisioned_for_active_vm_ratio_ASC"),

    PROVISIONED_FOR_ACTIVE_VM_RATIO_DESC("provisioned_for_active_vm_ratio_DESC"),

    PROVISIONED_MEMORY_BYTES_ASC("provisioned_memory_bytes_ASC"),

    PROVISIONED_MEMORY_BYTES_DESC("provisioned_memory_bytes_DESC"),

    PROVISIONED_RATIO_ASC("provisioned_ratio_ASC"),

    PROVISIONED_RATIO_DESC("provisioned_ratio_DESC"),

    RDMA_ENABLED_ASC("rdma_enabled_ASC"),

    RDMA_ENABLED_DESC("rdma_enabled_DESC"),

    RECOVER_DATA_SIZE_ASC("recover_data_size_ASC"),

    RECOVER_DATA_SIZE_DESC("recover_data_size_DESC"),

    RECOVER_SPEED_ASC("recover_speed_ASC"),

    RECOVER_SPEED_DESC("recover_speed_DESC"),

    REPLICA_CAPACITY_ONLY_ASC("replica_capacity_only_ASC"),

    REPLICA_CAPACITY_ONLY_DESC("replica_capacity_only_DESC"),

    RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_ASC("reserved_cpu_cores_for_system_service_ASC"),

    RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE_DESC("reserved_cpu_cores_for_system_service_DESC"),

    RUNNING_VM_NUM_ASC("running_vm_num_ASC"),

    RUNNING_VM_NUM_DESC("running_vm_num_DESC"),

    SOFTWARE_EDITION_ASC("software_edition_ASC"),

    SOFTWARE_EDITION_DESC("software_edition_DESC"),

    STOPPED_VM_NUM_ASC("stopped_vm_num_ASC"),

    STOPPED_VM_NUM_DESC("stopped_vm_num_DESC"),

    STRETCH_ASC("stretch_ASC"),

    STRETCH_DESC("stretch_DESC"),

    SUSPENDED_VM_NUM_ASC("suspended_vm_num_ASC"),

    SUSPENDED_VM_NUM_DESC("suspended_vm_num_DESC"),

    TOTAL_CACHE_CAPACITY_ASC("total_cache_capacity_ASC"),

    TOTAL_CACHE_CAPACITY_DESC("total_cache_capacity_DESC"),

    TOTAL_CPU_CORES_ASC("total_cpu_cores_ASC"),

    TOTAL_CPU_CORES_DESC("total_cpu_cores_DESC"),

    TOTAL_CPU_HZ_ASC("total_cpu_hz_ASC"),

    TOTAL_CPU_HZ_DESC("total_cpu_hz_DESC"),

    TOTAL_CPU_SOCKETS_ASC("total_cpu_sockets_ASC"),

    TOTAL_CPU_SOCKETS_DESC("total_cpu_sockets_DESC"),

    TOTAL_DATA_CAPACITY_ASC("total_data_capacity_ASC"),

    TOTAL_DATA_CAPACITY_DESC("total_data_capacity_DESC"),

    TOTAL_MEMORY_BYTES_ASC("total_memory_bytes_ASC"),

    TOTAL_MEMORY_BYTES_DESC("total_memory_bytes_DESC"),

    TOTAL_PRIO_VOLUME_SIZE_ASC("total_prio_volume_size_ASC"),

    TOTAL_PRIO_VOLUME_SIZE_DESC("total_prio_volume_size_DESC"),

    TOTAL_PRIO_VOLUME_SIZE_USAGE_ASC("total_prio_volume_size_usage_ASC"),

    TOTAL_PRIO_VOLUME_SIZE_USAGE_DESC("total_prio_volume_size_usage_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UPGRADE_FOR_TIERING_ASC("upgrade_for_tiering_ASC"),

    UPGRADE_FOR_TIERING_DESC("upgrade_for_tiering_DESC"),

    UPGRADE_TOOL_VERSION_ASC("upgrade_tool_version_ASC"),

    UPGRADE_TOOL_VERSION_DESC("upgrade_tool_version_DESC"),

    USED_CACHE_SPACE_ASC("used_cache_space_ASC"),

    USED_CACHE_SPACE_DESC("used_cache_space_DESC"),

    USED_CPU_HZ_ASC("used_cpu_hz_ASC"),

    USED_CPU_HZ_DESC("used_cpu_hz_DESC"),

    USED_DATA_SPACE_ASC("used_data_space_ASC"),

    USED_DATA_SPACE_DESC("used_data_space_DESC"),

    USED_MEMORY_BYTES_ASC("used_memory_bytes_ASC"),

    USED_MEMORY_BYTES_DESC("used_memory_bytes_DESC"),

    VALID_CACHE_SPACE_ASC("valid_cache_space_ASC"),

    VALID_CACHE_SPACE_DESC("valid_cache_space_DESC"),

    VALID_DATA_SPACE_ASC("valid_data_space_ASC"),

    VALID_DATA_SPACE_DESC("valid_data_space_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    VHOST_ENABLED_ASC("vhost_enabled_ASC"),

    VHOST_ENABLED_DESC("vhost_enabled_DESC"),

    VM_NUM_ASC("vm_num_ASC"),

    VM_NUM_DESC("vm_num_DESC"),

    CLUSTERORDERBYINPUT_UNSUPPORTED_ENUM("CLUSTERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ClusterOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ClusterOrderByInput fromValue(String value) {
        for (ClusterOrderByInput b : ClusterOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ClusterOrderByInput.CLUSTERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ClusterOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ClusterOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ClusterOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ClusterOrderByInput.fromValue(value);
        }
    }
}

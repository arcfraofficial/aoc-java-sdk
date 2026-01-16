package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets HostOrderByInput */
@JsonAdapter(HostOrderByInput.Adapter.class)
public enum HostOrderByInput {
    ACCESS_IP_ASC("access_ip_ASC"),

    ACCESS_IP_DESC("access_ip_DESC"),

    ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_ASC("allocable_cpu_cores_for_vm_exclusive_ASC"),

    ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_DESC("allocable_cpu_cores_for_vm_exclusive_DESC"),

    ALLOCATABLE_MEMORY_BYTES_ASC("allocatable_memory_bytes_ASC"),

    ALLOCATABLE_MEMORY_BYTES_DESC("allocatable_memory_bytes_DESC"),

    ALLOCATED_PRIORITIZED_SPACE_ASC("allocated_prioritized_space_ASC"),

    ALLOCATED_PRIORITIZED_SPACE_DESC("allocated_prioritized_space_DESC"),

    ALLOCATED_PRIORITIZED_SPACE_USAGE_ASC("allocated_prioritized_space_usage_ASC"),

    ALLOCATED_PRIORITIZED_SPACE_USAGE_DESC("allocated_prioritized_space_usage_DESC"),

    CHUNK_ID_ASC("chunk_id_ASC"),

    CHUNK_ID_DESC("chunk_id_DESC"),

    COMMITED_MEMORY_BYTES_ASC("commited_memory_bytes_ASC"),

    COMMITED_MEMORY_BYTES_DESC("commited_memory_bytes_DESC"),

    CONNECT_STATUS_ASC("connect_status_ASC"),

    CONNECT_STATUS_DESC("connect_status_DESC"),

    CPU_BRAND_ASC("cpu_brand_ASC"),

    CPU_BRAND_DESC("cpu_brand_DESC"),

    CPU_FAN_SPEED_UNIT_ASC("cpu_fan_speed_unit_ASC"),

    CPU_FAN_SPEED_UNIT_DESC("cpu_fan_speed_unit_DESC"),

    CPU_HZ_PER_CORE_ASC("cpu_hz_per_core_ASC"),

    CPU_HZ_PER_CORE_DESC("cpu_hz_per_core_DESC"),

    CPU_MODEL_ASC("cpu_model_ASC"),

    CPU_MODEL_DESC("cpu_model_DESC"),

    CPU_VENDOR_ASC("cpu_vendor_ASC"),

    CPU_VENDOR_DESC("cpu_vendor_DESC"),

    DATA_IP_ASC("data_ip_ASC"),

    DATA_IP_DESC("data_ip_DESC"),

    DOWNGRADED_PRIORITIZED_SPACE_ASC("downgraded_prioritized_space_ASC"),

    DOWNGRADED_PRIORITIZED_SPACE_DESC("downgraded_prioritized_space_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FAILURE_DATA_SPACE_ASC("failure_data_space_ASC"),

    FAILURE_DATA_SPACE_DESC("failure_data_space_DESC"),

    HDD_DATA_CAPACITY_ASC("hdd_data_capacity_ASC"),

    HDD_DATA_CAPACITY_DESC("hdd_data_capacity_DESC"),

    HDD_DISK_COUNT_ASC("hdd_disk_count_ASC"),

    HDD_DISK_COUNT_DESC("hdd_disk_count_DESC"),

    HOST_STATE_ASC("host_state_ASC"),

    HOST_STATE_DESC("host_state_DESC"),

    HYPERVISOR_IP_ASC("hypervisor_ip_ASC"),

    HYPERVISOR_IP_DESC("hypervisor_ip_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IOMMU_ASC("iommu_ASC"),

    IOMMU_DESC("iommu_DESC"),

    IS_OS_IN_RAID1_ASC("is_os_in_raid1_ASC"),

    IS_OS_IN_RAID1_DESC("is_os_in_raid1_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LSM_CAP_DISK_SAFE_UMOUNT_ASC("lsm_cap_disk_safe_umount_ASC"),

    LSM_CAP_DISK_SAFE_UMOUNT_DESC("lsm_cap_disk_safe_umount_DESC"),

    MANAGEMENT_IP_ASC("management_ip_ASC"),

    MANAGEMENT_IP_DESC("management_ip_DESC"),

    MERGED_STATUS_ASC("merged_status_ASC"),

    MERGED_STATUS_DESC("merged_status_DESC"),

    MODEL_ASC("model_ASC"),

    MODEL_DESC("model_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NESTED_VIRTUALIZATION_ASC("nested_virtualization_ASC"),

    NESTED_VIRTUALIZATION_DESC("nested_virtualization_DESC"),

    NIC_COUNT_ASC("nic_count_ASC"),

    NIC_COUNT_DESC("nic_count_DESC"),

    NODE_TOPO_LOCAL_ID_ASC("node_topo_local_id_ASC"),

    NODE_TOPO_LOCAL_ID_DESC("node_topo_local_id_DESC"),

    OS_MEMORY_BYTES_ASC("os_memory_bytes_ASC"),

    OS_MEMORY_BYTES_DESC("os_memory_bytes_DESC"),

    OS_VERSION_ASC("os_version_ASC"),

    OS_VERSION_DESC("os_version_DESC"),

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

    PMEM_DIMM_CAPACITY_ASC("pmem_dimm_capacity_ASC"),

    PMEM_DIMM_CAPACITY_DESC("pmem_dimm_capacity_DESC"),

    PMEM_DIMM_COUNT_ASC("pmem_dimm_count_ASC"),

    PMEM_DIMM_COUNT_DESC("pmem_dimm_count_DESC"),

    PMEM_DISK_COUNT_ASC("pmem_disk_count_ASC"),

    PMEM_DISK_COUNT_DESC("pmem_disk_count_DESC"),

    PRIO_SPACE_PERCENTAGE_ASC("prio_space_percentage_ASC"),

    PRIO_SPACE_PERCENTAGE_DESC("prio_space_percentage_DESC"),

    PROVISIONED_CPU_CORES_ASC("provisioned_cpu_cores_ASC"),

    PROVISIONED_CPU_CORES_DESC("provisioned_cpu_cores_DESC"),

    PROVISIONED_MEMORY_BYTES_ASC("provisioned_memory_bytes_ASC"),

    PROVISIONED_MEMORY_BYTES_DESC("provisioned_memory_bytes_DESC"),

    RUNNING_PAUSE_VM_MEMORY_BYTES_ASC("running_pause_vm_memory_bytes_ASC"),

    RUNNING_PAUSE_VM_MEMORY_BYTES_DESC("running_pause_vm_memory_bytes_DESC"),

    RUNNING_VM_NUM_ASC("running_vm_num_ASC"),

    RUNNING_VM_NUM_DESC("running_vm_num_DESC"),

    SCVM_CPU_ASC("scvm_cpu_ASC"),

    SCVM_CPU_DESC("scvm_cpu_DESC"),

    SCVM_MEMORY_ASC("scvm_memory_ASC"),

    SCVM_MEMORY_DESC("scvm_memory_DESC"),

    SCVM_NAME_ASC("scvm_name_ASC"),

    SCVM_NAME_DESC("scvm_name_DESC"),

    SERIAL_ASC("serial_ASC"),

    SERIAL_DESC("serial_DESC"),

    SSD_DATA_CAPACITY_ASC("ssd_data_capacity_ASC"),

    SSD_DATA_CAPACITY_DESC("ssd_data_capacity_DESC"),

    SSD_DISK_COUNT_ASC("ssd_disk_count_ASC"),

    SSD_DISK_COUNT_DESC("ssd_disk_count_DESC"),

    STATE_ASC("state_ASC"),

    STATE_DESC("state_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    STOPPED_VM_NUM_ASC("stopped_vm_num_ASC"),

    STOPPED_VM_NUM_DESC("stopped_vm_num_DESC"),

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

    VALID_FREE_CACHE_SPACE_ASC("valid_free_cache_space_ASC"),

    VALID_FREE_CACHE_SPACE_DESC("valid_free_cache_space_DESC"),

    VM_NUM_ASC("vm_num_ASC"),

    VM_NUM_DESC("vm_num_DESC"),

    VMOTION_IP_ASC("vmotion_ip_ASC"),

    VMOTION_IP_DESC("vmotion_ip_DESC"),

    WITH_FASTER_SSD_AS_CACHE_ASC("with_faster_ssd_as_cache_ASC"),

    WITH_FASTER_SSD_AS_CACHE_DESC("with_faster_ssd_as_cache_DESC"),

    HOSTORDERBYINPUT_UNSUPPORTED_ENUM("HOSTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    HostOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HostOrderByInput fromValue(String value) {
        for (HostOrderByInput b : HostOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return HostOrderByInput.HOSTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<HostOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final HostOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HostOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HostOrderByInput.fromValue(value);
        }
    }
}

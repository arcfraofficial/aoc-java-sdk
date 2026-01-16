package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmOrderByInput */
@JsonAdapter(VmOrderByInput.Adapter.class)
public enum VmOrderByInput {
    BIOS_UUID_ASC("bios_uuid_ASC"),

    BIOS_UUID_DESC("bios_uuid_DESC"),

    CLOCK_OFFSET_ASC("clock_offset_ASC"),

    CLOCK_OFFSET_DESC("clock_offset_DESC"),

    CLOUD_INIT_SUPPORTED_ASC("cloud_init_supported_ASC"),

    CLOUD_INIT_SUPPORTED_DESC("cloud_init_supported_DESC"),

    CPU_ASC("cpu_ASC"),

    CPU_DESC("cpu_DESC"),

    CPU_MODEL_ASC("cpu_model_ASC"),

    CPU_MODEL_DESC("cpu_model_DESC"),

    CPU_USAGE_ASC("cpu_usage_ASC"),

    CPU_USAGE_DESC("cpu_usage_DESC"),

    DELETED_AT_ASC("deleted_at_ASC"),

    DELETED_AT_DESC("deleted_at_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    DNS_SERVERS_ASC("dns_servers_ASC"),

    DNS_SERVERS_DESC("dns_servers_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FIRMWARE_ASC("firmware_ASC"),

    FIRMWARE_DESC("firmware_DESC"),

    GUEST_CPU_MODEL_ASC("guest_cpu_model_ASC"),

    GUEST_CPU_MODEL_DESC("guest_cpu_model_DESC"),

    GUEST_OS_TYPE_ASC("guest_os_type_ASC"),

    GUEST_OS_TYPE_DESC("guest_os_type_DESC"),

    GUEST_SIZE_USAGE_ASC("guest_size_usage_ASC"),

    GUEST_SIZE_USAGE_DESC("guest_size_usage_DESC"),

    GUEST_USED_SIZE_ASC("guest_used_size_ASC"),

    GUEST_USED_SIZE_DESC("guest_used_size_DESC"),

    HA_ASC("ha_ASC"),

    HA_DESC("ha_DESC"),

    HA_PRIORITY_ASC("ha_priority_ASC"),

    HA_PRIORITY_DESC("ha_priority_DESC"),

    HOSTNAME_ASC("hostname_ASC"),

    HOSTNAME_DESC("hostname_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IN_RECYCLE_BIN_ASC("in_recycle_bin_ASC"),

    IN_RECYCLE_BIN_DESC("in_recycle_bin_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    IO_POLICY_ASC("io_policy_ASC"),

    IO_POLICY_DESC("io_policy_DESC"),

    IPS_ASC("ips_ASC"),

    IPS_DESC("ips_DESC"),

    KERNEL_INFO_ASC("kernel_info_ASC"),

    KERNEL_INFO_DESC("kernel_info_DESC"),

    LAST_SHUTDOWN_TIME_ASC("last_shutdown_time_ASC"),

    LAST_SHUTDOWN_TIME_DESC("last_shutdown_time_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    LOGICAL_SIZE_BYTES_ASC("logical_size_bytes_ASC"),

    LOGICAL_SIZE_BYTES_DESC("logical_size_bytes_DESC"),

    MAX_BANDWIDTH_ASC("max_bandwidth_ASC"),

    MAX_BANDWIDTH_DESC("max_bandwidth_DESC"),

    MAX_BANDWIDTH_POLICY_ASC("max_bandwidth_policy_ASC"),

    MAX_BANDWIDTH_POLICY_DESC("max_bandwidth_policy_DESC"),

    MAX_IOPS_ASC("max_iops_ASC"),

    MAX_IOPS_DESC("max_iops_DESC"),

    MAX_IOPS_POLICY_ASC("max_iops_policy_ASC"),

    MAX_IOPS_POLICY_DESC("max_iops_policy_DESC"),

    MEMORY_ASC("memory_ASC"),

    MEMORY_DESC("memory_DESC"),

    MEMORY_USAGE_ASC("memory_usage_ASC"),

    MEMORY_USAGE_DESC("memory_usage_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NESTED_VIRTUALIZATION_ASC("nested_virtualization_ASC"),

    NESTED_VIRTUALIZATION_DESC("nested_virtualization_DESC"),

    NODE_IP_ASC("node_ip_ASC"),

    NODE_IP_DESC("node_ip_DESC"),

    ORIGINAL_NAME_ASC("original_name_ASC"),

    ORIGINAL_NAME_DESC("original_name_DESC"),

    OS_ASC("os_ASC"),

    OS_DESC("os_DESC"),

    PROTECTED_ASC("protected_ASC"),

    PROTECTED_DESC("protected_DESC"),

    PROVISIONED_SIZE_ASC("provisioned_size_ASC"),

    PROVISIONED_SIZE_DESC("provisioned_size_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    UNIQUE_LOGICAL_SIZE_ASC("unique_logical_size_ASC"),

    UNIQUE_LOGICAL_SIZE_DESC("unique_logical_size_DESC"),

    UNIQUE_SIZE_ASC("unique_size_ASC"),

    UNIQUE_SIZE_DESC("unique_size_DESC"),

    USED_SIZE_ASC("used_size_ASC"),

    USED_SIZE_DESC("used_size_DESC"),

    USED_SIZE_USAGE_ASC("used_size_usage_ASC"),

    USED_SIZE_USAGE_DESC("used_size_usage_DESC"),

    VCPU_ASC("vcpu_ASC"),

    VCPU_DESC("vcpu_DESC"),

    VIDEO_TYPE_ASC("video_type_ASC"),

    VIDEO_TYPE_DESC("video_type_DESC"),

    VM_TOOLS_STATUS_ASC("vm_tools_status_ASC"),

    VM_TOOLS_STATUS_DESC("vm_tools_status_DESC"),

    VM_TOOLS_VERSION_ASC("vm_tools_version_ASC"),

    VM_TOOLS_VERSION_DESC("vm_tools_version_DESC"),

    VM_USAGE_ASC("vm_usage_ASC"),

    VM_USAGE_DESC("vm_usage_DESC"),

    WIN_OPT_ASC("win_opt_ASC"),

    WIN_OPT_DESC("win_opt_DESC"),

    VMORDERBYINPUT_UNSUPPORTED_ENUM("VMORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VmOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmOrderByInput fromValue(String value) {
        for (VmOrderByInput b : VmOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmOrderByInput.VMORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmOrderByInput.fromValue(value);
        }
    }
}

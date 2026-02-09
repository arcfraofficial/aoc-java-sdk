package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ZoneOrderByInput */
@JsonAdapter(ZoneOrderByInput.Adapter.class)
public enum ZoneOrderByInput {
    FAILURE_DATA_SPACE_ASC("failure_data_space_ASC"),

    FAILURE_DATA_SPACE_DESC("failure_data_space_DESC"),

    HOST_NUM_ASC("host_num_ASC"),

    HOST_NUM_DESC("host_num_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IS_PREFERRED_ASC("is_preferred_ASC"),

    IS_PREFERRED_DESC("is_preferred_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    PROVISIONED_CPU_CORES_ASC("provisioned_cpu_cores_ASC"),

    PROVISIONED_CPU_CORES_DESC("provisioned_cpu_cores_DESC"),

    PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_ASC("provisioned_cpu_cores_for_active_vm_ASC"),

    PROVISIONED_CPU_CORES_FOR_ACTIVE_VM_DESC("provisioned_cpu_cores_for_active_vm_DESC"),

    PROVISIONED_DATA_SPACE_ASC("provisioned_data_space_ASC"),

    PROVISIONED_DATA_SPACE_DESC("provisioned_data_space_DESC"),

    PROVISIONED_MEMORY_BYTES_ASC("provisioned_memory_bytes_ASC"),

    PROVISIONED_MEMORY_BYTES_DESC("provisioned_memory_bytes_DESC"),

    RUNNING_VM_NUM_ASC("running_vm_num_ASC"),

    RUNNING_VM_NUM_DESC("running_vm_num_DESC"),

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

    TOTAL_DATA_CAPACITY_ASC("total_data_capacity_ASC"),

    TOTAL_DATA_CAPACITY_DESC("total_data_capacity_DESC"),

    TOTAL_MEMORY_BYTES_ASC("total_memory_bytes_ASC"),

    TOTAL_MEMORY_BYTES_DESC("total_memory_bytes_DESC"),

    USED_DATA_SPACE_ASC("used_data_space_ASC"),

    USED_DATA_SPACE_DESC("used_data_space_DESC"),

    VALID_DATA_SPACE_ASC("valid_data_space_ASC"),

    VALID_DATA_SPACE_DESC("valid_data_space_DESC"),

    VM_NUM_ASC("vm_num_ASC"),

    VM_NUM_DESC("vm_num_DESC"),

    ZONEORDERBYINPUT_UNSUPPORTED_ENUM("ZONEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ZoneOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ZoneOrderByInput fromValue(String value) {
        for (ZoneOrderByInput b : ZoneOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ZoneOrderByInput.ZONEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ZoneOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final ZoneOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ZoneOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ZoneOrderByInput.fromValue(value);
        }
    }
}

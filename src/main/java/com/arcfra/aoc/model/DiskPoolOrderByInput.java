package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskPoolOrderByInput */
@JsonAdapter(DiskPoolOrderByInput.Adapter.class)
public enum DiskPoolOrderByInput {
    CHUNK_ID_ASC("chunk_id_ASC"),

    CHUNK_ID_DESC("chunk_id_DESC"),

    CHUNK_INS_ID_ASC("chunk_ins_id_ASC"),

    CHUNK_INS_ID_DESC("chunk_ins_id_DESC"),

    DATA_SPACE_USAGE_ASC("data_space_usage_ASC"),

    DATA_SPACE_USAGE_DESC("data_space_usage_DESC"),

    DIRTY_CACHE_SPACE_ASC("dirty_cache_space_ASC"),

    DIRTY_CACHE_SPACE_DESC("dirty_cache_space_DESC"),

    DIRTY_CACHE_USAGE_ASC("dirty_cache_usage_ASC"),

    DIRTY_CACHE_USAGE_DESC("dirty_cache_usage_DESC"),

    FAILURE_CACHE_SPACE_ASC("failure_cache_space_ASC"),

    FAILURE_CACHE_SPACE_DESC("failure_cache_space_DESC"),

    FAILURE_DATA_SPACE_ASC("failure_data_space_ASC"),

    FAILURE_DATA_SPACE_DESC("failure_data_space_DESC"),

    HDD_DISK_COUNT_ASC("hdd_disk_count_ASC"),

    HDD_DISK_COUNT_DESC("hdd_disk_count_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NUMA_NODE_ASC("numa_node_ASC"),

    NUMA_NODE_DESC("numa_node_DESC"),

    NVME_SSD_DISK_COUNT_ASC("nvme_ssd_disk_count_ASC"),

    NVME_SSD_DISK_COUNT_DESC("nvme_ssd_disk_count_DESC"),

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

    PRIO_SPACE_PERCENTAGE_ASC("prio_space_percentage_ASC"),

    PRIO_SPACE_PERCENTAGE_DESC("prio_space_percentage_DESC"),

    SATA_OR_SAS_SSD_DISK_COUNT_ASC("sata_or_sas_ssd_disk_count_ASC"),

    SATA_OR_SAS_SSD_DISK_COUNT_DESC("sata_or_sas_ssd_disk_count_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    TOTAL_CACHE_CAPACITY_ASC("total_cache_capacity_ASC"),

    TOTAL_CACHE_CAPACITY_DESC("total_cache_capacity_DESC"),

    TOTAL_DATA_CAPACITY_ASC("total_data_capacity_ASC"),

    TOTAL_DATA_CAPACITY_DESC("total_data_capacity_DESC"),

    USE_STATE_ASC("use_state_ASC"),

    USE_STATE_DESC("use_state_DESC"),

    USED_CACHE_SPACE_ASC("used_cache_space_ASC"),

    USED_CACHE_SPACE_DESC("used_cache_space_DESC"),

    USED_DATA_SPACE_ASC("used_data_space_ASC"),

    USED_DATA_SPACE_DESC("used_data_space_DESC"),

    VALID_CACHE_SPACE_ASC("valid_cache_space_ASC"),

    VALID_CACHE_SPACE_DESC("valid_cache_space_DESC"),

    VALID_FREE_CACHE_SPACE_ASC("valid_free_cache_space_ASC"),

    VALID_FREE_CACHE_SPACE_DESC("valid_free_cache_space_DESC"),

    DISKPOOLORDERBYINPUT_UNSUPPORTED_ENUM("DISKPOOLORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    DiskPoolOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskPoolOrderByInput fromValue(String value) {
        for (DiskPoolOrderByInput b : DiskPoolOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskPoolOrderByInput.DISKPOOLORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskPoolOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskPoolOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskPoolOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskPoolOrderByInput.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskOrderByInput */
@JsonAdapter(DiskOrderByInput.Adapter.class)
public enum DiskOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    FAILURE_INFORMATION_ASC("failure_information_ASC"),

    FAILURE_INFORMATION_DESC("failure_information_DESC"),

    FIRMWARE_ASC("firmware_ASC"),

    FIRMWARE_DESC("firmware_DESC"),

    FUNCTION_ASC("function_ASC"),

    FUNCTION_DESC("function_DESC"),

    HEALTH_STATUS_ASC("health_status_ASC"),

    HEALTH_STATUS_DESC("health_status_DESC"),

    HEALTHY_ASC("healthy_ASC"),

    HEALTHY_DESC("healthy_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MODEL_ASC("model_ASC"),

    MODEL_DESC("model_DESC"),

    MOUNTED_ASC("mounted_ASC"),

    MOUNTED_DESC("mounted_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NUMA_NODE_ASC("numa_node_ASC"),

    NUMA_NODE_DESC("numa_node_DESC"),

    OFFLINE_ASC("offline_ASC"),

    OFFLINE_DESC("offline_DESC"),

    PARTITIONS_ASC("partitions_ASC"),

    PARTITIONS_DESC("partitions_DESC"),

    PATH_ASC("path_ASC"),

    PATH_DESC("path_DESC"),

    PERSISTENT_MEMORY_TYPE_ASC("persistent_memory_type_ASC"),

    PERSISTENT_MEMORY_TYPE_DESC("persistent_memory_type_DESC"),

    PHYSICAL_SLOT_ON_BRICK_ASC("physical_slot_on_brick_ASC"),

    PHYSICAL_SLOT_ON_BRICK_DESC("physical_slot_on_brick_DESC"),

    RECOMMENDED_USAGE_ASC("recommended_usage_ASC"),

    RECOMMENDED_USAGE_DESC("recommended_usage_DESC"),

    REMAINING_LIFE_PERCENT_ASC("remaining_life_percent_ASC"),

    REMAINING_LIFE_PERCENT_DESC("remaining_life_percent_DESC"),

    SERIAL_ASC("serial_ASC"),

    SERIAL_DESC("serial_DESC"),

    SIZE_ASC("size_ASC"),

    SIZE_DESC("size_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    USAGE_ASC("usage_ASC"),

    USAGE_DESC("usage_DESC"),

    USAGE_STATUS_ASC("usage_status_ASC"),

    USAGE_STATUS_DESC("usage_status_DESC"),

    DISKORDERBYINPUT_UNSUPPORTED_ENUM("DISKORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    DiskOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskOrderByInput fromValue(String value) {
        for (DiskOrderByInput b : DiskOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskOrderByInput.DISKORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskOrderByInput.fromValue(value);
        }
    }
}

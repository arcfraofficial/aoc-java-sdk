package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DatacenterOrderByInput */
@JsonAdapter(DatacenterOrderByInput.Adapter.class)
public enum DatacenterOrderByInput {
    CLUSTER_NUM_ASC("cluster_num_ASC"),

    CLUSTER_NUM_DESC("cluster_num_DESC"),

    FAILURE_DATA_SPACE_ASC("failure_data_space_ASC"),

    FAILURE_DATA_SPACE_DESC("failure_data_space_DESC"),

    HOST_NUM_ASC("host_num_ASC"),

    HOST_NUM_DESC("host_num_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    TOTAL_CPU_HZ_ASC("total_cpu_hz_ASC"),

    TOTAL_CPU_HZ_DESC("total_cpu_hz_DESC"),

    TOTAL_DATA_CAPACITY_ASC("total_data_capacity_ASC"),

    TOTAL_DATA_CAPACITY_DESC("total_data_capacity_DESC"),

    TOTAL_MEMORY_BYTES_ASC("total_memory_bytes_ASC"),

    TOTAL_MEMORY_BYTES_DESC("total_memory_bytes_DESC"),

    USED_CPU_HZ_ASC("used_cpu_hz_ASC"),

    USED_CPU_HZ_DESC("used_cpu_hz_DESC"),

    USED_DATA_SPACE_ASC("used_data_space_ASC"),

    USED_DATA_SPACE_DESC("used_data_space_DESC"),

    USED_MEMORY_BYTES_ASC("used_memory_bytes_ASC"),

    USED_MEMORY_BYTES_DESC("used_memory_bytes_DESC"),

    VM_NUM_ASC("vm_num_ASC"),

    VM_NUM_DESC("vm_num_DESC"),

    DATACENTERORDERBYINPUT_UNSUPPORTED_ENUM("DATACENTERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    DatacenterOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DatacenterOrderByInput fromValue(String value) {
        for (DatacenterOrderByInput b : DatacenterOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DatacenterOrderByInput.DATACENTERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DatacenterOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final DatacenterOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DatacenterOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DatacenterOrderByInput.fromValue(value);
        }
    }
}

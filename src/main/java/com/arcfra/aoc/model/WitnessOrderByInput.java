package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets WitnessOrderByInput */
@JsonAdapter(WitnessOrderByInput.Adapter.class)
public enum WitnessOrderByInput {
    CPU_HZ_PER_CORE_ASC("cpu_hz_per_core_ASC"),

    CPU_HZ_PER_CORE_DESC("cpu_hz_per_core_DESC"),

    DATA_IP_ASC("data_ip_ASC"),

    DATA_IP_DESC("data_ip_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MANAGEMENT_IP_ASC("management_ip_ASC"),

    MANAGEMENT_IP_DESC("management_ip_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    SYSTEM_DATA_CAPACITY_ASC("system_data_capacity_ASC"),

    SYSTEM_DATA_CAPACITY_DESC("system_data_capacity_DESC"),

    SYSTEM_USED_DATA_SPACE_ASC("system_used_data_space_ASC"),

    SYSTEM_USED_DATA_SPACE_DESC("system_used_data_space_DESC"),

    TOTAL_CPU_CORES_ASC("total_cpu_cores_ASC"),

    TOTAL_CPU_CORES_DESC("total_cpu_cores_DESC"),

    TOTAL_CPU_HZ_ASC("total_cpu_hz_ASC"),

    TOTAL_CPU_HZ_DESC("total_cpu_hz_DESC"),

    TOTAL_MEMORY_BYTES_ASC("total_memory_bytes_ASC"),

    TOTAL_MEMORY_BYTES_DESC("total_memory_bytes_DESC"),

    WITNESSORDERBYINPUT_UNSUPPORTED_ENUM("WITNESSORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    WitnessOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WitnessOrderByInput fromValue(String value) {
        for (WitnessOrderByInput b : WitnessOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return WitnessOrderByInput.WITNESSORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<WitnessOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final WitnessOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public WitnessOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return WitnessOrderByInput.fromValue(value);
        }
    }
}

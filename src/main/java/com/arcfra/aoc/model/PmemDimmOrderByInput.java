package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PmemDimmOrderByInput */
@JsonAdapter(PmemDimmOrderByInput.Adapter.class)
public enum PmemDimmOrderByInput {
    CAPACITY_ASC("capacity_ASC"),

    CAPACITY_DESC("capacity_DESC"),

    DEVICE_LOCATOR_ASC("device_locator_ASC"),

    DEVICE_LOCATOR_DESC("device_locator_DESC"),

    HEALTH_STATUS_ASC("health_status_ASC"),

    HEALTH_STATUS_DESC("health_status_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NUMA_NODE_ASC("numa_node_ASC"),

    NUMA_NODE_DESC("numa_node_DESC"),

    PART_NUMBER_ASC("part_number_ASC"),

    PART_NUMBER_DESC("part_number_DESC"),

    REMAINING_LIFE_PERCENT_ASC("remaining_life_percent_ASC"),

    REMAINING_LIFE_PERCENT_DESC("remaining_life_percent_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    PMEMDIMMORDERBYINPUT_UNSUPPORTED_ENUM("PMEMDIMMORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    PmemDimmOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PmemDimmOrderByInput fromValue(String value) {
        for (PmemDimmOrderByInput b : PmemDimmOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PmemDimmOrderByInput.PMEMDIMMORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PmemDimmOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final PmemDimmOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PmemDimmOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PmemDimmOrderByInput.fromValue(value);
        }
    }
}

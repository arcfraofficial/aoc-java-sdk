package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnapshotPlanTaskOrderByInput */
@JsonAdapter(SnapshotPlanTaskOrderByInput.Adapter.class)
public enum SnapshotPlanTaskOrderByInput {
    END_TIME_ASC("end_time_ASC"),

    END_TIME_DESC("end_time_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    START_TIME_ASC("start_time_ASC"),

    START_TIME_DESC("start_time_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    SNAPSHOTPLANTASKORDERBYINPUT_UNSUPPORTED_ENUM("SNAPSHOTPLANTASKORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SnapshotPlanTaskOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnapshotPlanTaskOrderByInput fromValue(String value) {
        for (SnapshotPlanTaskOrderByInput b : SnapshotPlanTaskOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnapshotPlanTaskOrderByInput.SNAPSHOTPLANTASKORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnapshotPlanTaskOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final SnapshotPlanTaskOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnapshotPlanTaskOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnapshotPlanTaskOrderByInput.fromValue(value);
        }
    }
}

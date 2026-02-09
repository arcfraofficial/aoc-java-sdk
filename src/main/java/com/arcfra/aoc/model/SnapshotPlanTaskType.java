package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnapshotPlanTaskType */
@JsonAdapter(SnapshotPlanTaskType.Adapter.class)
public enum SnapshotPlanTaskType {
    CLONE("TASK_TYPE_CLONE"),

    PROTECT("TASK_TYPE_PROTECT"),

    ROLLBACK("TASK_TYPE_ROLLBACK"),

    SNAPSHOTPLANTASKTYPE_UNSUPPORTED_ENUM("SNAPSHOTPLANTASKTYPE_UNSUPPORTED_ENUM");
    private String value;

    SnapshotPlanTaskType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnapshotPlanTaskType fromValue(String value) {
        for (SnapshotPlanTaskType b : SnapshotPlanTaskType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnapshotPlanTaskType.SNAPSHOTPLANTASKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnapshotPlanTaskType> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnapshotPlanTaskType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnapshotPlanTaskType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnapshotPlanTaskType.fromValue(value);
        }
    }
}

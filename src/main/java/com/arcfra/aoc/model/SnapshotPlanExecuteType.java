package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnapshotPlanExecuteType */
@JsonAdapter(SnapshotPlanExecuteType.Adapter.class)
public enum SnapshotPlanExecuteType {
    DAY("DAY"),

    HOUR("HOUR"),

    MINUTE("MINUTE"),

    MONTH("MONTH"),

    WEEK("WEEK"),

    SNAPSHOTPLANEXECUTETYPE_UNSUPPORTED_ENUM("SNAPSHOTPLANEXECUTETYPE_UNSUPPORTED_ENUM");
    private String value;

    SnapshotPlanExecuteType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnapshotPlanExecuteType fromValue(String value) {
        for (SnapshotPlanExecuteType b : SnapshotPlanExecuteType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnapshotPlanExecuteType.SNAPSHOTPLANEXECUTETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnapshotPlanExecuteType> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnapshotPlanExecuteType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnapshotPlanExecuteType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnapshotPlanExecuteType.fromValue(value);
        }
    }
}

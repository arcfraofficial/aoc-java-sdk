package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnapshotPlanExecuteStatus */
@JsonAdapter(SnapshotPlanExecuteStatus.Adapter.class)
public enum SnapshotPlanExecuteStatus {
    CREATED("CREATED"),

    FAILED("FAILED"),

    IN_PROGRESS("IN_PROGRESS"),

    SUCCEED("SUCCEED"),

    UNSPECIFIED("UNSPECIFIED"),

    SNAPSHOTPLANEXECUTESTATUS_UNSUPPORTED_ENUM("SNAPSHOTPLANEXECUTESTATUS_UNSUPPORTED_ENUM");
    private String value;

    SnapshotPlanExecuteStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnapshotPlanExecuteStatus fromValue(String value) {
        for (SnapshotPlanExecuteStatus b : SnapshotPlanExecuteStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnapshotPlanExecuteStatus.SNAPSHOTPLANEXECUTESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnapshotPlanExecuteStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnapshotPlanExecuteStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnapshotPlanExecuteStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnapshotPlanExecuteStatus.fromValue(value);
        }
    }
}

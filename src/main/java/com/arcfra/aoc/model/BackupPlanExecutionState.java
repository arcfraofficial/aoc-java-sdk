package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanExecutionState */
@JsonAdapter(BackupPlanExecutionState.Adapter.class)
public enum BackupPlanExecutionState {
    FAILED("FAILED"),

    PARTLY_FAILED("PARTLY_FAILED"),

    PAUSED("PAUSED"),

    PAUSING("PAUSING"),

    RUNNING("RUNNING"),

    STARTING("STARTING"),

    SUCCEED("SUCCEED"),

    BACKUPPLANEXECUTIONSTATE_UNSUPPORTED_ENUM("BACKUPPLANEXECUTIONSTATE_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanExecutionState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanExecutionState fromValue(String value) {
        for (BackupPlanExecutionState b : BackupPlanExecutionState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanExecutionState.BACKUPPLANEXECUTIONSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanExecutionState> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanExecutionState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanExecutionState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanExecutionState.fromValue(value);
        }
    }
}

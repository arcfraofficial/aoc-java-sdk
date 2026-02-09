package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupExecutionState */
@JsonAdapter(BackupExecutionState.Adapter.class)
public enum BackupExecutionState {
    FAILED("FAILED"),

    PARTLY_FAILED("PARTLY_FAILED"),

    PAUSED("PAUSED"),

    PAUSING("PAUSING"),

    RUNNING("RUNNING"),

    STARTING("STARTING"),

    SUCCEED("SUCCEED"),

    BACKUPEXECUTIONSTATE_UNSUPPORTED_ENUM("BACKUPEXECUTIONSTATE_UNSUPPORTED_ENUM");
    private String value;

    BackupExecutionState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupExecutionState fromValue(String value) {
        for (BackupExecutionState b : BackupExecutionState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupExecutionState.BACKUPEXECUTIONSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupExecutionState> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupExecutionState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupExecutionState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupExecutionState.fromValue(value);
        }
    }
}

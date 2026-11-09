package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanExecutionStatus */
@JsonAdapter(BackupPlanExecutionStatus.Adapter.class)
public enum BackupPlanExecutionStatus {
    FAILED("FAILED"),

    NEVER_EXECUTE("NEVER_EXECUTE"),

    PARTIAL_SUCCESS("PARTIAL_SUCCESS"),

    PAUSED("PAUSED"),

    RUNNING("RUNNING"),

    SUCCESS("SUCCESS"),

    WAITING_EXECUTE("WAITING_EXECUTE"),

    BACKUPPLANEXECUTIONSTATUS_UNSUPPORTED_ENUM("BACKUPPLANEXECUTIONSTATUS_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanExecutionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanExecutionStatus fromValue(String value) {
        for (BackupPlanExecutionStatus b : BackupPlanExecutionStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanExecutionStatus.BACKUPPLANEXECUTIONSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanExecutionStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanExecutionStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanExecutionStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanExecutionStatus.fromValue(value);
        }
    }
}

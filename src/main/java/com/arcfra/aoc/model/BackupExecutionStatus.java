package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupExecutionStatus */
@JsonAdapter(BackupExecutionStatus.Adapter.class)
public enum BackupExecutionStatus {
    ABORTED("ABORTED"),

    FAILED("FAILED"),

    INITIALIZING("INITIALIZING"),

    PAUSED("PAUSED"),

    PENDING("PENDING"),

    RUNNING("RUNNING"),

    SUCCESS("SUCCESS"),

    BACKUPEXECUTIONSTATUS_UNSUPPORTED_ENUM("BACKUPEXECUTIONSTATUS_UNSUPPORTED_ENUM");
    private String value;

    BackupExecutionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupExecutionStatus fromValue(String value) {
        for (BackupExecutionStatus b : BackupExecutionStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupExecutionStatus.BACKUPEXECUTIONSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupExecutionStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupExecutionStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupExecutionStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupExecutionStatus.fromValue(value);
        }
    }
}

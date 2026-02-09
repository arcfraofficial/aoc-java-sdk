package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupJobPhase */
@JsonAdapter(BackupJobPhase.Adapter.class)
public enum BackupJobPhase {
    ABORTED("ABORTED"),

    ABORTING("ABORTING"),

    FINALIZING("FINALIZING"),

    INITIALIZING("INITIALIZING"),

    PAUSED("PAUSED"),

    RUNNING("RUNNING"),

    SKIPPED("SKIPPED"),

    SUCCESS("SUCCESS"),

    BACKUPJOBPHASE_UNSUPPORTED_ENUM("BACKUPJOBPHASE_UNSUPPORTED_ENUM");
    private String value;

    BackupJobPhase(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupJobPhase fromValue(String value) {
        for (BackupJobPhase b : BackupJobPhase.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupJobPhase.BACKUPJOBPHASE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupJobPhase> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupJobPhase enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupJobPhase read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupJobPhase.fromValue(value);
        }
    }
}

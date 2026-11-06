package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanStatus */
@JsonAdapter(BackupPlanStatus.Adapter.class)
public enum BackupPlanStatus {
    PAUSED("PAUSED"),

    STOPPED("STOPPED"),

    WORKING("WORKING"),

    BACKUPPLANSTATUS_UNSUPPORTED_ENUM("BACKUPPLANSTATUS_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanStatus fromValue(String value) {
        for (BackupPlanStatus b : BackupPlanStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanStatus.BACKUPPLANSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanStatus.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupServiceStatus */
@JsonAdapter(BackupServiceStatus.Adapter.class)
public enum BackupServiceStatus {
    ERROR("ERROR"),

    INITIALIZING("INITIALIZING"),

    INSTALLING("INSTALLING"),

    INSTALL_FAILED("INSTALL_FAILED"),

    RUNNING("RUNNING"),

    TERMINATE_FAILED("TERMINATE_FAILED"),

    TERMINATING("TERMINATING"),

    UPGRADE_FAILED("UPGRADE_FAILED"),

    UPGRADING("UPGRADING"),

    BACKUPSERVICESTATUS_UNSUPPORTED_ENUM("BACKUPSERVICESTATUS_UNSUPPORTED_ENUM");
    private String value;

    BackupServiceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupServiceStatus fromValue(String value) {
        for (BackupServiceStatus b : BackupServiceStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupServiceStatus.BACKUPSERVICESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupServiceStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupServiceStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupServiceStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupServiceStatus.fromValue(value);
        }
    }
}

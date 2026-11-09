package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupStoreStatus */
@JsonAdapter(BackupStoreStatus.Adapter.class)
public enum BackupStoreStatus {
    CONNECTED("CONNECTED"),

    CONNECTING("CONNECTING"),

    DISABLED("DISABLED"),

    ERROR("ERROR"),

    INIT("INIT"),

    INIT_ERROR("INIT_ERROR"),

    BACKUPSTORESTATUS_UNSUPPORTED_ENUM("BACKUPSTORESTATUS_UNSUPPORTED_ENUM");
    private String value;

    BackupStoreStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupStoreStatus fromValue(String value) {
        for (BackupStoreStatus b : BackupStoreStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupStoreStatus.BACKUPSTORESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupStoreStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupStoreStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupStoreStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupStoreStatus.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupRestorePointType */
@JsonAdapter(BackupRestorePointType.Adapter.class)
public enum BackupRestorePointType {
    FULL("FULL"),

    INCREMENTAL("INCREMENTAL"),

    SYNTHETIC_FULL("SYNTHETIC_FULL"),

    BACKUPRESTOREPOINTTYPE_UNSUPPORTED_ENUM("BACKUPRESTOREPOINTTYPE_UNSUPPORTED_ENUM");
    private String value;

    BackupRestorePointType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupRestorePointType fromValue(String value) {
        for (BackupRestorePointType b : BackupRestorePointType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupRestorePointType.BACKUPRESTOREPOINTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupRestorePointType> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupRestorePointType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupRestorePointType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupRestorePointType.fromValue(value);
        }
    }
}

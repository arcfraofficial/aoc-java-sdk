package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupRestoreExecutionMode */
@JsonAdapter(BackupRestoreExecutionMode.Adapter.class)
public enum BackupRestoreExecutionMode {
    INPLACE("INPLACE"),

    REBUILD("REBUILD"),

    BACKUPRESTOREEXECUTIONMODE_UNSUPPORTED_ENUM("BACKUPRESTOREEXECUTIONMODE_UNSUPPORTED_ENUM");
    private String value;

    BackupRestoreExecutionMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupRestoreExecutionMode fromValue(String value) {
        for (BackupRestoreExecutionMode b : BackupRestoreExecutionMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupRestoreExecutionMode.BACKUPRESTOREEXECUTIONMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupRestoreExecutionMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupRestoreExecutionMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupRestoreExecutionMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupRestoreExecutionMode.fromValue(value);
        }
    }
}

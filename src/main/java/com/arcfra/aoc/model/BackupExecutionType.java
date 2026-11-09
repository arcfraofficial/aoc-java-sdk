package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupExecutionType */
@JsonAdapter(BackupExecutionType.Adapter.class)
public enum BackupExecutionType {
    FULL("FULL"),

    INCREMENTAL("INCREMENTAL"),

    SYNTHETIC_FULL("SYNTHETIC_FULL"),

    BACKUPEXECUTIONTYPE_UNSUPPORTED_ENUM("BACKUPEXECUTIONTYPE_UNSUPPORTED_ENUM");
    private String value;

    BackupExecutionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupExecutionType fromValue(String value) {
        for (BackupExecutionType b : BackupExecutionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupExecutionType.BACKUPEXECUTIONTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupExecutionType> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupExecutionType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupExecutionType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupExecutionType.fromValue(value);
        }
    }
}

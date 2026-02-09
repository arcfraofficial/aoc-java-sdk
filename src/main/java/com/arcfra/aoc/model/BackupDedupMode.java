package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupDedupMode */
@JsonAdapter(BackupDedupMode.Adapter.class)
public enum BackupDedupMode {
    CHAIN("CHAIN"),

    NONE("NONE"),

    BACKUPDEDUPMODE_UNSUPPORTED_ENUM("BACKUPDEDUPMODE_UNSUPPORTED_ENUM");
    private String value;

    BackupDedupMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupDedupMode fromValue(String value) {
        for (BackupDedupMode b : BackupDedupMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupDedupMode.BACKUPDEDUPMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupDedupMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupDedupMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupDedupMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupDedupMode.fromValue(value);
        }
    }
}

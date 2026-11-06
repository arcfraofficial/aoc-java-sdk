package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanKeepPolicy */
@JsonAdapter(BackupPlanKeepPolicy.Adapter.class)
public enum BackupPlanKeepPolicy {
    COUNT("COUNT"),

    FOREVER("FOREVER"),

    TIME("TIME"),

    BACKUPPLANKEEPPOLICY_UNSUPPORTED_ENUM("BACKUPPLANKEEPPOLICY_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanKeepPolicy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanKeepPolicy fromValue(String value) {
        for (BackupPlanKeepPolicy b : BackupPlanKeepPolicy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanKeepPolicy.BACKUPPLANKEEPPOLICY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanKeepPolicy> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanKeepPolicy enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanKeepPolicy read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanKeepPolicy.fromValue(value);
        }
    }
}

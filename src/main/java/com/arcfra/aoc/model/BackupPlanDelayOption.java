package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanDelayOption */
@JsonAdapter(BackupPlanDelayOption.Adapter.class)
public enum BackupPlanDelayOption {
    KEEP_GO_ON("KEEP_GO_ON"),

    STOP_BACKUP("STOP_BACKUP"),

    BACKUPPLANDELAYOPTION_UNSUPPORTED_ENUM("BACKUPPLANDELAYOPTION_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanDelayOption(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanDelayOption fromValue(String value) {
        for (BackupPlanDelayOption b : BackupPlanDelayOption.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanDelayOption.BACKUPPLANDELAYOPTION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanDelayOption> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanDelayOption enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanDelayOption read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanDelayOption.fromValue(value);
        }
    }
}

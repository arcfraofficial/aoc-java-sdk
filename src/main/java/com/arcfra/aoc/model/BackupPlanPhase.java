package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanPhase */
@JsonAdapter(BackupPlanPhase.Adapter.class)
public enum BackupPlanPhase {
    INVALID("INVALID"),

    PAUSED("PAUSED"),

    SCHEDULING("SCHEDULING"),

    STOPPED("STOPPED"),

    VALIDATING("VALIDATING"),

    WAITING_SCHEDULE("WAITING_SCHEDULE"),

    BACKUPPLANPHASE_UNSUPPORTED_ENUM("BACKUPPLANPHASE_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanPhase(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanPhase fromValue(String value) {
        for (BackupPlanPhase b : BackupPlanPhase.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanPhase.BACKUPPLANPHASE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanPhase> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanPhase enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanPhase read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanPhase.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanDeleteStrategy */
@JsonAdapter(BackupPlanDeleteStrategy.Adapter.class)
public enum BackupPlanDeleteStrategy {
    DELETE_RESTORE_POINT("DELETE_RESTORE_POINT"),

    KEEP_RESTORE_POINT("KEEP_RESTORE_POINT"),

    BACKUPPLANDELETESTRATEGY_UNSUPPORTED_ENUM("BACKUPPLANDELETESTRATEGY_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanDeleteStrategy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanDeleteStrategy fromValue(String value) {
        for (BackupPlanDeleteStrategy b : BackupPlanDeleteStrategy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanDeleteStrategy.BACKUPPLANDELETESTRATEGY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanDeleteStrategy> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanDeleteStrategy enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanDeleteStrategy read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanDeleteStrategy.fromValue(value);
        }
    }
}

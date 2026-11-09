package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupPlanPeriod */
@JsonAdapter(BackupPlanPeriod.Adapter.class)
public enum BackupPlanPeriod {
    DAILY("DAILY"),

    HOURLY("HOURLY"),

    MINUTELY("MINUTELY"),

    MONTHLY("MONTHLY"),

    WEEKLY("WEEKLY"),

    YEARLY("YEARLY"),

    BACKUPPLANPERIOD_UNSUPPORTED_ENUM("BACKUPPLANPERIOD_UNSUPPORTED_ENUM");
    private String value;

    BackupPlanPeriod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupPlanPeriod fromValue(String value) {
        for (BackupPlanPeriod b : BackupPlanPeriod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupPlanPeriod.BACKUPPLANPERIOD_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupPlanPeriod> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupPlanPeriod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupPlanPeriod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupPlanPeriod.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationPlanPeriod */
@JsonAdapter(ReplicationPlanPeriod.Adapter.class)
public enum ReplicationPlanPeriod {
    DAILY("DAILY"),

    HOURLY("HOURLY"),

    MINUTELY("MINUTELY"),

    MONTHLY("MONTHLY"),

    WEEKLY("WEEKLY"),

    REPLICATIONPLANPERIOD_UNSUPPORTED_ENUM("REPLICATIONPLANPERIOD_UNSUPPORTED_ENUM");
    private String value;

    ReplicationPlanPeriod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationPlanPeriod fromValue(String value) {
        for (ReplicationPlanPeriod b : ReplicationPlanPeriod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationPlanPeriod.REPLICATIONPLANPERIOD_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationPlanPeriod> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicationPlanPeriod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationPlanPeriod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicationPlanPeriod.fromValue(value);
        }
    }
}

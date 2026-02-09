package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskHealthStatus */
@JsonAdapter(DiskHealthStatus.Adapter.class)
public enum DiskHealthStatus {
    HEALTHY("HEALTHY"),

    SMART_FAILED("SMART_FAILED"),

    SOFTWARE_RAID_FAILURE("SOFTWARE_RAID_FAILURE"),

    SUBHEALTHY("SUBHEALTHY"),

    UNHEALTHY("UNHEALTHY"),

    DISKHEALTHSTATUS_UNSUPPORTED_ENUM("DISKHEALTHSTATUS_UNSUPPORTED_ENUM");
    private String value;

    DiskHealthStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskHealthStatus fromValue(String value) {
        for (DiskHealthStatus b : DiskHealthStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskHealthStatus.DISKHEALTHSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskHealthStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskHealthStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskHealthStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskHealthStatus.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets HostMergedStatus */
@JsonAdapter(HostMergedStatus.Adapter.class)
public enum HostMergedStatus {
    DISCONNECTED("DISCONNECTED"),

    HEALTHY("HEALTHY"),

    INITIALIZING("INITIALIZING"),

    UNUSUAL("UNUSUAL"),

    HOSTMERGEDSTATUS_UNSUPPORTED_ENUM("HOSTMERGEDSTATUS_UNSUPPORTED_ENUM");
    private String value;

    HostMergedStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HostMergedStatus fromValue(String value) {
        for (HostMergedStatus b : HostMergedStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return HostMergedStatus.HOSTMERGEDSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<HostMergedStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final HostMergedStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HostMergedStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HostMergedStatus.fromValue(value);
        }
    }
}

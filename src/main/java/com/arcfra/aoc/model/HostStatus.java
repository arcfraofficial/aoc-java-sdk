package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets HostStatus */
@JsonAdapter(HostStatus.Adapter.class)
public enum HostStatus {
    CONNECTED_ERROR("CONNECTED_ERROR"),

    CONNECTED_HEALTHY("CONNECTED_HEALTHY"),

    CONNECTED_WARNING("CONNECTED_WARNING"),

    CONNECTING("CONNECTING"),

    INITIALIZING("INITIALIZING"),

    SESSION_EXPIRED("SESSION_EXPIRED"),

    HOSTSTATUS_UNSUPPORTED_ENUM("HOSTSTATUS_UNSUPPORTED_ENUM");
    private String value;

    HostStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HostStatus fromValue(String value) {
        for (HostStatus b : HostStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return HostStatus.HOSTSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<HostStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final HostStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HostStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HostStatus.fromValue(value);
        }
    }
}

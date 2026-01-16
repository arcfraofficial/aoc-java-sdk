package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets HostConnectStatus */
@JsonAdapter(HostConnectStatus.Adapter.class)
public enum HostConnectStatus {
    CONNECTED("CONNECTED"),

    DISCONNECTED("DISCONNECTED"),

    HOSTCONNECTSTATUS_UNSUPPORTED_ENUM("HOSTCONNECTSTATUS_UNSUPPORTED_ENUM");
    private String value;

    HostConnectStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HostConnectStatus fromValue(String value) {
        for (HostConnectStatus b : HostConnectStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return HostConnectStatus.HOSTCONNECTSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<HostConnectStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final HostConnectStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HostConnectStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HostConnectStatus.fromValue(value);
        }
    }
}

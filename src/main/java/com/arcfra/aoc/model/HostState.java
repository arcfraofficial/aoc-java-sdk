package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets HostState */
@JsonAdapter(HostState.Adapter.class)
public enum HostState {
    IDLE("IDLE"),

    IN_USE("IN_USE"),

    REMOVING("REMOVING"),

    HOSTSTATE_UNSUPPORTED_ENUM("HOSTSTATE_UNSUPPORTED_ENUM");
    private String value;

    HostState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HostState fromValue(String value) {
        for (HostState b : HostState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return HostState.HOSTSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<HostState> {
        @Override
        public void write(final JsonWriter jsonWriter, final HostState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HostState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HostState.fromValue(value);
        }
    }
}

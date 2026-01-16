package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ConnectState */
@JsonAdapter(ConnectState.Adapter.class)
public enum ConnectState {
    CONNECTED("CONNECTED"),

    DISCONNECTED("DISCONNECTED"),

    INITIALIZING("INITIALIZING"),

    REMOVING("REMOVING"),

    CONNECTSTATE_UNSUPPORTED_ENUM("CONNECTSTATE_UNSUPPORTED_ENUM");
    private String value;

    ConnectState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConnectState fromValue(String value) {
        for (ConnectState b : ConnectState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ConnectState.CONNECTSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ConnectState> {
        @Override
        public void write(final JsonWriter jsonWriter, final ConnectState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ConnectState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ConnectState.fromValue(value);
        }
    }
}

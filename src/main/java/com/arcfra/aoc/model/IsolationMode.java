package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IsolationMode */
@JsonAdapter(IsolationMode.Adapter.class)
public enum IsolationMode {
    ALL("ALL"),

    PARTIAL("PARTIAL"),

    ISOLATIONMODE_UNSUPPORTED_ENUM("ISOLATIONMODE_UNSUPPORTED_ENUM");
    private String value;

    IsolationMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IsolationMode fromValue(String value) {
        for (IsolationMode b : IsolationMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IsolationMode.ISOLATIONMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IsolationMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final IsolationMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IsolationMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IsolationMode.fromValue(value);
        }
    }
}

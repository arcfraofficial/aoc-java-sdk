package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets Architecture */
@JsonAdapter(Architecture.Adapter.class)
public enum Architecture {
    AARCH64("AARCH64"),

    X86_64("X86_64"),

    ARCHITECTURE_UNSUPPORTED_ENUM("ARCHITECTURE_UNSUPPORTED_ENUM");
    private String value;

    Architecture(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Architecture fromValue(String value) {
        for (Architecture b : Architecture.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return Architecture.ARCHITECTURE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<Architecture> {
        @Override
        public void write(final JsonWriter jsonWriter, final Architecture enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Architecture read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Architecture.fromValue(value);
        }
    }
}

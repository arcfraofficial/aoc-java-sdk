package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AccessMode */
@JsonAdapter(AccessMode.Adapter.class)
public enum AccessMode {
    ALLOW("ALLOW"),

    DENY("DENY"),

    NONE("NONE"),

    ACCESSMODE_UNSUPPORTED_ENUM("ACCESSMODE_UNSUPPORTED_ENUM");
    private String value;

    AccessMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccessMode fromValue(String value) {
        for (AccessMode b : AccessMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AccessMode.ACCESSMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AccessMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final AccessMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AccessMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AccessMode.fromValue(value);
        }
    }
}

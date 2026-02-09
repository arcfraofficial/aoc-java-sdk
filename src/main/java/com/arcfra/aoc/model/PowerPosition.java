package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PowerPosition */
@JsonAdapter(PowerPosition.Adapter.class)
public enum PowerPosition {
    LEFT("LEFT"),

    MIDDLE("MIDDLE"),

    RIGHT("RIGHT"),

    POWERPOSITION_UNSUPPORTED_ENUM("POWERPOSITION_UNSUPPORTED_ENUM");
    private String value;

    PowerPosition(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PowerPosition fromValue(String value) {
        for (PowerPosition b : PowerPosition.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PowerPosition.POWERPOSITION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PowerPosition> {
        @Override
        public void write(final JsonWriter jsonWriter, final PowerPosition enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PowerPosition read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PowerPosition.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ByteUnit */
@JsonAdapter(ByteUnit.Adapter.class)
public enum ByteUnit {
    B("B"),

    KB("KB"),

    MB("MB"),

    GB("GB"),

    TB("TB"),

    PB("PB"),

    BYTEUNIT_UNSUPPORTED_ENUM("BYTEUNIT_UNSUPPORTED_ENUM");
    private String value;

    ByteUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ByteUnit fromValue(String value) {
        for (ByteUnit b : ByteUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ByteUnit.BYTEUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ByteUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final ByteUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ByteUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ByteUnit.fromValue(value);
        }
    }
}

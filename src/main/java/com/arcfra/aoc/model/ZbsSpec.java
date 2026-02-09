package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ZbsSpec */
@JsonAdapter(ZbsSpec.Adapter.class)
public enum ZbsSpec {
    NORMAL("normal"),

    LARGE("large"),

    ZBSSPEC_UNSUPPORTED_ENUM("ZBSSPEC_UNSUPPORTED_ENUM");
    private String value;

    ZbsSpec(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ZbsSpec fromValue(String value) {
        for (ZbsSpec b : ZbsSpec.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ZbsSpec.ZBSSPEC_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ZbsSpec> {
        @Override
        public void write(final JsonWriter jsonWriter, final ZbsSpec enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ZbsSpec read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ZbsSpec.fromValue(value);
        }
    }
}

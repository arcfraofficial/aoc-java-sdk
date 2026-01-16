package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StepUnit */
@JsonAdapter(StepUnit.Adapter.class)
public enum StepUnit {
    BIT("BIT"),

    BYTE("BYTE"),

    COUNT("COUNT"),

    PERCENT("PERCENT"),

    STEPUNIT_UNSUPPORTED_ENUM("STEPUNIT_UNSUPPORTED_ENUM");
    private String value;

    StepUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StepUnit fromValue(String value) {
        for (StepUnit b : StepUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StepUnit.STEPUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StepUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final StepUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StepUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StepUnit.fromValue(value);
        }
    }
}

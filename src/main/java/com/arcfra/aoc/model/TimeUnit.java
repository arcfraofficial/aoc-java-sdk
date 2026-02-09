package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets TimeUnit */
@JsonAdapter(TimeUnit.Adapter.class)
public enum TimeUnit {
    DAY("DAY"),

    HOUR("HOUR"),

    MINUTE("MINUTE"),

    MONTH("MONTH"),

    TIMEUNIT_UNSUPPORTED_ENUM("TIMEUNIT_UNSUPPORTED_ENUM");
    private String value;

    TimeUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TimeUnit fromValue(String value) {
        for (TimeUnit b : TimeUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return TimeUnit.TIMEUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<TimeUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final TimeUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TimeUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TimeUnit.fromValue(value);
        }
    }
}

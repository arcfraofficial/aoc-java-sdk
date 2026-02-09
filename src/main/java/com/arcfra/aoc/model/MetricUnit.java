package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MetricUnit */
@JsonAdapter(MetricUnit.Adapter.class)
public enum MetricUnit {
    COUNT("COUNT"),

    DATA_RATE_BIT("DATA_RATE_BIT"),

    DATA_RATE_BYTE("DATA_RATE_BYTE"),

    DATA_SIZE("DATA_SIZE"),

    FREQUENCY("FREQUENCY"),

    LOAD("LOAD"),

    PERCENT("PERCENT"),

    RATIO("RATIO"),

    STORAGE_BAND_WIDTH("STORAGE_BAND_WIDTH"),

    TEMPERATURE("TEMPERATURE"),

    TIME("TIME"),

    METRICUNIT_UNSUPPORTED_ENUM("METRICUNIT_UNSUPPORTED_ENUM");
    private String value;

    MetricUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MetricUnit fromValue(String value) {
        for (MetricUnit b : MetricUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MetricUnit.METRICUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MetricUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final MetricUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MetricUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MetricUnit.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MetricType */
@JsonAdapter(MetricType.Adapter.class)
public enum MetricType {
    BOTTOMK("BOTTOMK"),

    NORMAL("NORMAL"),

    TOPK("TOPK"),

    METRICTYPE_UNSUPPORTED_ENUM("METRICTYPE_UNSUPPORTED_ENUM");
    private String value;

    MetricType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MetricType fromValue(String value) {
        for (MetricType b : MetricType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MetricType.METRICTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MetricType> {
        @Override
        public void write(final JsonWriter jsonWriter, final MetricType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MetricType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MetricType.fromValue(value);
        }
    }
}

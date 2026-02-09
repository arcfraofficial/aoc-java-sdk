package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets FilterStatus */
@JsonAdapter(FilterStatus.Adapter.class)
public enum FilterStatus {
    EXECUTING("EXECUTING"),

    FAILED("FAILED"),

    INITIALIZING("INITIALIZING"),

    PARTIAL_SUCCESSED("PARTIAL_SUCCESSED"),

    SUCCESSED("SUCCESSED"),

    FILTERSTATUS_UNSUPPORTED_ENUM("FILTERSTATUS_UNSUPPORTED_ENUM");
    private String value;

    FilterStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FilterStatus fromValue(String value) {
        for (FilterStatus b : FilterStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return FilterStatus.FILTERSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<FilterStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final FilterStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FilterStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FilterStatus.fromValue(value);
        }
    }
}

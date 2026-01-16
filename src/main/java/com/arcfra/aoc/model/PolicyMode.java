package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PolicyMode */
@JsonAdapter(PolicyMode.Adapter.class)
public enum PolicyMode {
    MONITOR("MONITOR"),

    WORK("WORK"),

    POLICYMODE_UNSUPPORTED_ENUM("POLICYMODE_UNSUPPORTED_ENUM");
    private String value;

    PolicyMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PolicyMode fromValue(String value) {
        for (PolicyMode b : PolicyMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PolicyMode.POLICYMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PolicyMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final PolicyMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PolicyMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PolicyMode.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ApplicationVmSpecAffinityPolicy */
@JsonAdapter(ApplicationVmSpecAffinityPolicy.Adapter.class)
public enum ApplicationVmSpecAffinityPolicy {
    MUST("MUST"),

    PREFER("PREFER"),

    APPLICATIONVMSPECAFFINITYPOLICY_UNSUPPORTED_ENUM(
            "APPLICATIONVMSPECAFFINITYPOLICY_UNSUPPORTED_ENUM");
    private String value;

    ApplicationVmSpecAffinityPolicy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationVmSpecAffinityPolicy fromValue(String value) {
        for (ApplicationVmSpecAffinityPolicy b : ApplicationVmSpecAffinityPolicy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ApplicationVmSpecAffinityPolicy.APPLICATIONVMSPECAFFINITYPOLICY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ApplicationVmSpecAffinityPolicy> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ApplicationVmSpecAffinityPolicy enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ApplicationVmSpecAffinityPolicy read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return ApplicationVmSpecAffinityPolicy.fromValue(value);
        }
    }
}

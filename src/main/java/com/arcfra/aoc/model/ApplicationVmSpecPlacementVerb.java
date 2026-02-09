package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ApplicationVmSpecPlacementVerb */
@JsonAdapter(ApplicationVmSpecPlacementVerb.Adapter.class)
public enum ApplicationVmSpecPlacementVerb {
    MUST("MUST"),

    PREFER("PREFER"),

    APPLICATIONVMSPECPLACEMENTVERB_UNSUPPORTED_ENUM(
            "APPLICATIONVMSPECPLACEMENTVERB_UNSUPPORTED_ENUM");
    private String value;

    ApplicationVmSpecPlacementVerb(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationVmSpecPlacementVerb fromValue(String value) {
        for (ApplicationVmSpecPlacementVerb b : ApplicationVmSpecPlacementVerb.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ApplicationVmSpecPlacementVerb.APPLICATIONVMSPECPLACEMENTVERB_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ApplicationVmSpecPlacementVerb> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ApplicationVmSpecPlacementVerb enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ApplicationVmSpecPlacementVerb read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ApplicationVmSpecPlacementVerb.fromValue(value);
        }
    }
}

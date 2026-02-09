package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ApplicationVmSpecPlacementSituation */
@JsonAdapter(ApplicationVmSpecPlacementSituation.Adapter.class)
public enum ApplicationVmSpecPlacementSituation {
    DIFFERENT("DIFFERENT"),

    SAME("SAME"),

    APPLICATIONVMSPECPLACEMENTSITUATION_UNSUPPORTED_ENUM(
            "APPLICATIONVMSPECPLACEMENTSITUATION_UNSUPPORTED_ENUM");
    private String value;

    ApplicationVmSpecPlacementSituation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationVmSpecPlacementSituation fromValue(String value) {
        for (ApplicationVmSpecPlacementSituation b : ApplicationVmSpecPlacementSituation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ApplicationVmSpecPlacementSituation
                .APPLICATIONVMSPECPLACEMENTSITUATION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ApplicationVmSpecPlacementSituation> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ApplicationVmSpecPlacementSituation enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ApplicationVmSpecPlacementSituation read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return ApplicationVmSpecPlacementSituation.fromValue(value);
        }
    }
}

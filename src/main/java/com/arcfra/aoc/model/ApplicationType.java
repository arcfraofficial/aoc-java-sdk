package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ApplicationType */
@JsonAdapter(ApplicationType.Adapter.class)
public enum ApplicationType {
    MONITOR("MONITOR"),

    APPLICATIONTYPE_UNSUPPORTED_ENUM("APPLICATIONTYPE_UNSUPPORTED_ENUM");
    private String value;

    ApplicationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationType fromValue(String value) {
        for (ApplicationType b : ApplicationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ApplicationType.APPLICATIONTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ApplicationType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ApplicationType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ApplicationType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ApplicationType.fromValue(value);
        }
    }
}

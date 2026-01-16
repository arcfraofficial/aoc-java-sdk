package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ResiliencyType */
@JsonAdapter(ResiliencyType.Adapter.class)
public enum ResiliencyType {
    EC("EC"),

    REPLICA("REPLICA"),

    RESILIENCYTYPE_UNSUPPORTED_ENUM("RESILIENCYTYPE_UNSUPPORTED_ENUM");
    private String value;

    ResiliencyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResiliencyType fromValue(String value) {
        for (ResiliencyType b : ResiliencyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ResiliencyType.RESILIENCYTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ResiliencyType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ResiliencyType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ResiliencyType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ResiliencyType.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GraphType */
@JsonAdapter(GraphType.Adapter.class)
public enum GraphType {
    AREA("AREA"),

    STACK("STACK"),

    GRAPHTYPE_UNSUPPORTED_ENUM("GRAPHTYPE_UNSUPPORTED_ENUM");
    private String value;

    GraphType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GraphType fromValue(String value) {
        for (GraphType b : GraphType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GraphType.GRAPHTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GraphType> {
        @Override
        public void write(final JsonWriter jsonWriter, final GraphType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GraphType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GraphType.fromValue(value);
        }
    }
}

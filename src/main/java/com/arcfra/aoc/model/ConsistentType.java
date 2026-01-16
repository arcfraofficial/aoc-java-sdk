package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ConsistentType */
@JsonAdapter(ConsistentType.Adapter.class)
public enum ConsistentType {
    CRASH_CONSISTENT("CRASH_CONSISTENT"),

    FILE_SYSTEM_CONSISTENT("FILE_SYSTEM_CONSISTENT"),

    CONSISTENTTYPE_UNSUPPORTED_ENUM("CONSISTENTTYPE_UNSUPPORTED_ENUM");
    private String value;

    ConsistentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConsistentType fromValue(String value) {
        for (ConsistentType b : ConsistentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ConsistentType.CONSISTENTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ConsistentType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ConsistentType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ConsistentType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ConsistentType.fromValue(value);
        }
    }
}

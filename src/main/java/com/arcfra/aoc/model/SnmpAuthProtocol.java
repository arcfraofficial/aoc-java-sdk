package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnmpAuthProtocol */
@JsonAdapter(SnmpAuthProtocol.Adapter.class)
public enum SnmpAuthProtocol {
    MD5("MD5"),

    SHA("SHA"),

    SNMPAUTHPROTOCOL_UNSUPPORTED_ENUM("SNMPAUTHPROTOCOL_UNSUPPORTED_ENUM");
    private String value;

    SnmpAuthProtocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnmpAuthProtocol fromValue(String value) {
        for (SnmpAuthProtocol b : SnmpAuthProtocol.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnmpAuthProtocol.SNMPAUTHPROTOCOL_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnmpAuthProtocol> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnmpAuthProtocol enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnmpAuthProtocol read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnmpAuthProtocol.fromValue(value);
        }
    }
}

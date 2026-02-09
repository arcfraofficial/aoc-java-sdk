package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnmpVersion */
@JsonAdapter(SnmpVersion.Adapter.class)
public enum SnmpVersion {
    V2C("V2C"),

    V3("V3"),

    SNMPVERSION_UNSUPPORTED_ENUM("SNMPVERSION_UNSUPPORTED_ENUM");
    private String value;

    SnmpVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnmpVersion fromValue(String value) {
        for (SnmpVersion b : SnmpVersion.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnmpVersion.SNMPVERSION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnmpVersion> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnmpVersion enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnmpVersion read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnmpVersion.fromValue(value);
        }
    }
}

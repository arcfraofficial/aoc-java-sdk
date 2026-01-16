package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BitPSUnit */
@JsonAdapter(BitPSUnit.Adapter.class)
public enum BitPSUnit {
    BPS("bps"),

    KBPS("Kbps"),

    MBPS("Mbps"),

    GBPS("Gbps"),

    TBPS("Tbps"),

    BITPSUNIT_UNSUPPORTED_ENUM("BITPSUNIT_UNSUPPORTED_ENUM");
    private String value;

    BitPSUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BitPSUnit fromValue(String value) {
        for (BitPSUnit b : BitPSUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BitPSUnit.BITPSUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BitPSUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final BitPSUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BitPSUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BitPSUnit.fromValue(value);
        }
    }
}

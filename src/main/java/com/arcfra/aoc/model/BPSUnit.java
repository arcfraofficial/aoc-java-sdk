package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BPSUnit */
@JsonAdapter(BPSUnit.Adapter.class)
public enum BPSUnit {
    BPS("Bps"),

    KBPS("KBps"),

    MBPS("MBps"),

    GBPS("GBps"),

    TBPS("TBps"),

    BPSUNIT_UNSUPPORTED_ENUM("BPSUNIT_UNSUPPORTED_ENUM");
    private String value;

    BPSUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BPSUnit fromValue(String value) {
        for (BPSUnit b : BPSUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BPSUnit.BPSUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BPSUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final BPSUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BPSUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BPSUnit.fromValue(value);
        }
    }
}

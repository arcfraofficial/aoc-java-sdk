package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets CpuFanSpeedUnit */
@JsonAdapter(CpuFanSpeedUnit.Adapter.class)
public enum CpuFanSpeedUnit {
    PERCENT("PERCENT"),

    RPM("RPM"),

    CPUFANSPEEDUNIT_UNSUPPORTED_ENUM("CPUFANSPEEDUNIT_UNSUPPORTED_ENUM");
    private String value;

    CpuFanSpeedUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CpuFanSpeedUnit fromValue(String value) {
        for (CpuFanSpeedUnit b : CpuFanSpeedUnit.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return CpuFanSpeedUnit.CPUFANSPEEDUNIT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<CpuFanSpeedUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final CpuFanSpeedUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CpuFanSpeedUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CpuFanSpeedUnit.fromValue(value);
        }
    }
}

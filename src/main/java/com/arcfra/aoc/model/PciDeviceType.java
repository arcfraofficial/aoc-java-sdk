package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PciDeviceType */
@JsonAdapter(PciDeviceType.Adapter.class)
public enum PciDeviceType {
    HSM("HSM"),

    PCIDEVICETYPE_UNSUPPORTED_ENUM("PCIDEVICETYPE_UNSUPPORTED_ENUM");
    private String value;

    PciDeviceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PciDeviceType fromValue(String value) {
        for (PciDeviceType b : PciDeviceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PciDeviceType.PCIDEVICETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PciDeviceType> {
        @Override
        public void write(final JsonWriter jsonWriter, final PciDeviceType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PciDeviceType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PciDeviceType.fromValue(value);
        }
    }
}

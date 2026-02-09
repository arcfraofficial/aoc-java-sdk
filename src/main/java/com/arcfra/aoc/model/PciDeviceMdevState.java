package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PciDeviceMdevState */
@JsonAdapter(PciDeviceMdevState.Adapter.class)
public enum PciDeviceMdevState {
    ENABLED("ENABLED"),

    NOT_ENABLED("NOT_ENABLED"),

    NOT_SUPPORT("NOT_SUPPORT"),

    PCIDEVICEMDEVSTATE_UNSUPPORTED_ENUM("PCIDEVICEMDEVSTATE_UNSUPPORTED_ENUM");
    private String value;

    PciDeviceMdevState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PciDeviceMdevState fromValue(String value) {
        for (PciDeviceMdevState b : PciDeviceMdevState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PciDeviceMdevState.PCIDEVICEMDEVSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PciDeviceMdevState> {
        @Override
        public void write(final JsonWriter jsonWriter, final PciDeviceMdevState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PciDeviceMdevState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PciDeviceMdevState.fromValue(value);
        }
    }
}

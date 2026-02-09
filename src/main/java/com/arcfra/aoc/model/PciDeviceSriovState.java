package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PciDeviceSriovState */
@JsonAdapter(PciDeviceSriovState.Adapter.class)
public enum PciDeviceSriovState {
    ENABLED("ENABLED"),

    NOT_ENABLED("NOT_ENABLED"),

    NOT_SUPPORT("NOT_SUPPORT"),

    PCIDEVICESRIOVSTATE_UNSUPPORTED_ENUM("PCIDEVICESRIOVSTATE_UNSUPPORTED_ENUM");
    private String value;

    PciDeviceSriovState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PciDeviceSriovState fromValue(String value) {
        for (PciDeviceSriovState b : PciDeviceSriovState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PciDeviceSriovState.PCIDEVICESRIOVSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PciDeviceSriovState> {
        @Override
        public void write(final JsonWriter jsonWriter, final PciDeviceSriovState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PciDeviceSriovState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PciDeviceSriovState.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PciDevicePartitionState */
@JsonAdapter(PciDevicePartitionState.Adapter.class)
public enum PciDevicePartitionState {
    ENABLED("ENABLED"),

    NOT_ENABLED("NOT_ENABLED"),

    NOT_SUPPORT("NOT_SUPPORT"),

    PCIDEVICEPARTITIONSTATE_UNSUPPORTED_ENUM("PCIDEVICEPARTITIONSTATE_UNSUPPORTED_ENUM");
    private String value;

    PciDevicePartitionState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PciDevicePartitionState fromValue(String value) {
        for (PciDevicePartitionState b : PciDevicePartitionState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PciDevicePartitionState.PCIDEVICEPARTITIONSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PciDevicePartitionState> {
        @Override
        public void write(final JsonWriter jsonWriter, final PciDevicePartitionState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PciDevicePartitionState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PciDevicePartitionState.fromValue(value);
        }
    }
}

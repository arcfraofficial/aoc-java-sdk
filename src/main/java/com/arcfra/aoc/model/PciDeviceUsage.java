package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets PciDeviceUsage */
@JsonAdapter(PciDeviceUsage.Adapter.class)
public enum PciDeviceUsage {
    MDEV("MDEV"),

    PASS_THROUGH("PASS_THROUGH"),

    SRIOV_VF("SRIOV_VF"),

    UNKNOWN("UNKNOWN"),

    PCIDEVICEUSAGE_UNSUPPORTED_ENUM("PCIDEVICEUSAGE_UNSUPPORTED_ENUM");
    private String value;

    PciDeviceUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PciDeviceUsage fromValue(String value) {
        for (PciDeviceUsage b : PciDeviceUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return PciDeviceUsage.PCIDEVICEUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<PciDeviceUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final PciDeviceUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PciDeviceUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PciDeviceUsage.fromValue(value);
        }
    }
}

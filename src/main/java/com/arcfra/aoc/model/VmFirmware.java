package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmFirmware */
@JsonAdapter(VmFirmware.Adapter.class)
public enum VmFirmware {
    BIOS("BIOS"),

    UEFI("UEFI"),

    VMFIRMWARE_UNSUPPORTED_ENUM("VMFIRMWARE_UNSUPPORTED_ENUM");
    private String value;

    VmFirmware(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmFirmware fromValue(String value) {
        for (VmFirmware b : VmFirmware.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmFirmware.VMFIRMWARE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmFirmware> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmFirmware enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmFirmware read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmFirmware.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmClockOffset */
@JsonAdapter(VmClockOffset.Adapter.class)
public enum VmClockOffset {
    LOCALTIME("LOCALTIME"),

    UTC("UTC"),

    VMCLOCKOFFSET_UNSUPPORTED_ENUM("VMCLOCKOFFSET_UNSUPPORTED_ENUM");
    private String value;

    VmClockOffset(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmClockOffset fromValue(String value) {
        for (VmClockOffset b : VmClockOffset.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmClockOffset.VMCLOCKOFFSET_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmClockOffset> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmClockOffset enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmClockOffset read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmClockOffset.fromValue(value);
        }
    }
}

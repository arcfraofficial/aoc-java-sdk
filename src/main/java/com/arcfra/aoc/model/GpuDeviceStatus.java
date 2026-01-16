package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GpuDeviceStatus */
@JsonAdapter(GpuDeviceStatus.Adapter.class)
public enum GpuDeviceStatus {
    NEED_REBOOT("NEED_REBOOT"),

    NOT_READY("NOT_READY"),

    READY("READY"),

    GPUDEVICESTATUS_UNSUPPORTED_ENUM("GPUDEVICESTATUS_UNSUPPORTED_ENUM");
    private String value;

    GpuDeviceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GpuDeviceStatus fromValue(String value) {
        for (GpuDeviceStatus b : GpuDeviceStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GpuDeviceStatus.GPUDEVICESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GpuDeviceStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final GpuDeviceStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GpuDeviceStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GpuDeviceStatus.fromValue(value);
        }
    }
}

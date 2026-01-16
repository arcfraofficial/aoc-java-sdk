package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets GpuDeviceUsage */
@JsonAdapter(GpuDeviceUsage.Adapter.class)
public enum GpuDeviceUsage {
    PASS_THROUGH("PASS_THROUGH"),

    VGPU("VGPU"),

    GPUDEVICEUSAGE_UNSUPPORTED_ENUM("GPUDEVICEUSAGE_UNSUPPORTED_ENUM");
    private String value;

    GpuDeviceUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GpuDeviceUsage fromValue(String value) {
        for (GpuDeviceUsage b : GpuDeviceUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return GpuDeviceUsage.GPUDEVICEUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<GpuDeviceUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final GpuDeviceUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GpuDeviceUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GpuDeviceUsage.fromValue(value);
        }
    }
}

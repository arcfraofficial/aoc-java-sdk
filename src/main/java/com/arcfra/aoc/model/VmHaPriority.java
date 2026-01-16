package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmHaPriority */
@JsonAdapter(VmHaPriority.Adapter.class)
public enum VmHaPriority {
    _1_LOW("LEVEL_1_LOW"),

    _2_MEDIUM("LEVEL_2_MEDIUM"),

    _3_HIGH("LEVEL_3_HIGH"),

    VMHAPRIORITY_UNSUPPORTED_ENUM("VMHAPRIORITY_UNSUPPORTED_ENUM");
    private String value;

    VmHaPriority(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmHaPriority fromValue(String value) {
        for (VmHaPriority b : VmHaPriority.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmHaPriority.VMHAPRIORITY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmHaPriority> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmHaPriority enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmHaPriority read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmHaPriority.fromValue(value);
        }
    }
}

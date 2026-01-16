package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVmPolicy */
@JsonAdapter(VmVmPolicy.Adapter.class)
public enum VmVmPolicy {
    MUST_DIFFERENT("MUST_DIFFERENT"),

    MUST_SAME("MUST_SAME"),

    PREFER_DIFFERENT("PREFER_DIFFERENT"),

    PREFER_SAME("PREFER_SAME"),

    VMVMPOLICY_UNSUPPORTED_ENUM("VMVMPOLICY_UNSUPPORTED_ENUM");
    private String value;

    VmVmPolicy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVmPolicy fromValue(String value) {
        for (VmVmPolicy b : VmVmPolicy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVmPolicy.VMVMPOLICY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVmPolicy> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmVmPolicy enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVmPolicy read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVmPolicy.fromValue(value);
        }
    }
}

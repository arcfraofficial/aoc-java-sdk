package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmDiskIoPolicy */
@JsonAdapter(VmDiskIoPolicy.Adapter.class)
public enum VmDiskIoPolicy {
    EACH_DISK("RESTRICT_EACH_DISK"),

    WHOLE_VM("RESTRICT_WHOLE_VM"),

    VMDISKIOPOLICY_UNSUPPORTED_ENUM("VMDISKIOPOLICY_UNSUPPORTED_ENUM");
    private String value;

    VmDiskIoPolicy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmDiskIoPolicy fromValue(String value) {
        for (VmDiskIoPolicy b : VmDiskIoPolicy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmDiskIoPolicy.VMDISKIOPOLICY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmDiskIoPolicy> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmDiskIoPolicy enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmDiskIoPolicy read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmDiskIoPolicy.fromValue(value);
        }
    }
}

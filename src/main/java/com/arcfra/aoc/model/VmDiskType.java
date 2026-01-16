package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmDiskType */
@JsonAdapter(VmDiskType.Adapter.class)
public enum VmDiskType {
    CD_ROM("CD_ROM"),

    DISK("DISK"),

    VMDISKTYPE_UNSUPPORTED_ENUM("VMDISKTYPE_UNSUPPORTED_ENUM");
    private String value;

    VmDiskType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmDiskType fromValue(String value) {
        for (VmDiskType b : VmDiskType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmDiskType.VMDISKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmDiskType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmDiskType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmDiskType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmDiskType.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmDiskIoRestrictType */
@JsonAdapter(VmDiskIoRestrictType.Adapter.class)
public enum VmDiskIoRestrictType {
    DYNAMIC("DYNAMIC"),

    FORCED("FORCED"),

    VMDISKIORESTRICTTYPE_UNSUPPORTED_ENUM("VMDISKIORESTRICTTYPE_UNSUPPORTED_ENUM");
    private String value;

    VmDiskIoRestrictType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmDiskIoRestrictType fromValue(String value) {
        for (VmDiskIoRestrictType b : VmDiskIoRestrictType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmDiskIoRestrictType.VMDISKIORESTRICTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmDiskIoRestrictType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmDiskIoRestrictType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmDiskIoRestrictType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmDiskIoRestrictType.fromValue(value);
        }
    }
}

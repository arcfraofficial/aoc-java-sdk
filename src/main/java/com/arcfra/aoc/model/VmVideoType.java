package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVideoType */
@JsonAdapter(VmVideoType.Adapter.class)
public enum VmVideoType {
    CIRRUS("CIRRUS"),

    QXL("QXL"),

    VGA("VGA"),

    VIRTIO("VIRTIO"),

    VMVIDEOTYPE_UNSUPPORTED_ENUM("VMVIDEOTYPE_UNSUPPORTED_ENUM");
    private String value;

    VmVideoType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVideoType fromValue(String value) {
        for (VmVideoType b : VmVideoType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVideoType.VMVIDEOTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVideoType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmVideoType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVideoType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVideoType.fromValue(value);
        }
    }
}

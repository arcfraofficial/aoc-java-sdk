package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVolumeType */
@JsonAdapter(VmVolumeType.Adapter.class)
public enum VmVolumeType {
    VOLUME("KVM_VOLUME"),

    VOLUME_ISCSI("KVM_VOLUME_ISCSI"),

    VMVOLUMETYPE_UNSUPPORTED_ENUM("VMVOLUMETYPE_UNSUPPORTED_ENUM");
    private String value;

    VmVolumeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVolumeType fromValue(String value) {
        for (VmVolumeType b : VmVolumeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVolumeType.VMVOLUMETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVolumeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmVolumeType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVolumeType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVolumeType.fromValue(value);
        }
    }
}

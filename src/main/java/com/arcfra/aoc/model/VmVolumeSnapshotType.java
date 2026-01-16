package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVolumeSnapshotType */
@JsonAdapter(VmVolumeSnapshotType.Adapter.class)
public enum VmVolumeSnapshotType {
    ISCSI_SNAPSHOT("KVM_VOLUME_ISCSI_SNAPSHOT"),

    SNAPSHOT("KVM_VOLUME_SNAPSHOT"),

    VMVOLUMESNAPSHOTTYPE_UNSUPPORTED_ENUM("VMVOLUMESNAPSHOTTYPE_UNSUPPORTED_ENUM");
    private String value;

    VmVolumeSnapshotType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVolumeSnapshotType fromValue(String value) {
        for (VmVolumeSnapshotType b : VmVolumeSnapshotType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVolumeSnapshotType.VMVOLUMESNAPSHOTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVolumeSnapshotType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmVolumeSnapshotType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVolumeSnapshotType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVolumeSnapshotType.fromValue(value);
        }
    }
}

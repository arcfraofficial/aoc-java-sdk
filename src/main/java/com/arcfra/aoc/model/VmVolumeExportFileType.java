package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVolumeExportFileType */
@JsonAdapter(VmVolumeExportFileType.Adapter.class)
public enum VmVolumeExportFileType {
    QCOW2("QCOW2"),

    RAW("RAW"),

    VMVOLUMEEXPORTFILETYPE_UNSUPPORTED_ENUM("VMVOLUMEEXPORTFILETYPE_UNSUPPORTED_ENUM");
    private String value;

    VmVolumeExportFileType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVolumeExportFileType fromValue(String value) {
        for (VmVolumeExportFileType b : VmVolumeExportFileType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVolumeExportFileType.VMVOLUMEEXPORTFILETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVolumeExportFileType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmVolumeExportFileType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVolumeExportFileType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVolumeExportFileType.fromValue(value);
        }
    }
}

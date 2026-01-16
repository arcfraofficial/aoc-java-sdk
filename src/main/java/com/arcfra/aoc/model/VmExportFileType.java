package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmExportFileType */
@JsonAdapter(VmExportFileType.Adapter.class)
public enum VmExportFileType {
    OVF("OVF"),

    QCOW2("QCOW2"),

    RAW("RAW"),

    VMDK("VMDK"),

    VMEXPORTFILETYPE_UNSUPPORTED_ENUM("VMEXPORTFILETYPE_UNSUPPORTED_ENUM");
    private String value;

    VmExportFileType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmExportFileType fromValue(String value) {
        for (VmExportFileType b : VmExportFileType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmExportFileType.VMEXPORTFILETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmExportFileType> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmExportFileType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmExportFileType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmExportFileType.fromValue(value);
        }
    }
}

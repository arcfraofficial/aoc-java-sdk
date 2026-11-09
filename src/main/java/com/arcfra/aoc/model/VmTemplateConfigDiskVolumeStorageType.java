package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmTemplateConfigDiskVolumeStorageType */
@JsonAdapter(VmTemplateConfigDiskVolumeStorageType.Adapter.class)
public enum VmTemplateConfigDiskVolumeStorageType {
    ISCSI_LUN("ISCSI_LUN"),

    ISCSI_LUN_SNAPSHOT("ISCSI_LUN_SNAPSHOT"),

    NONE("NONE"),

    VCFS_VOLUME_FILE("VCFS_VOLUME_FILE"),

    VMTEMPLATECONFIGDISKVOLUMESTORAGETYPE_UNSUPPORTED_ENUM(
            "VMTEMPLATECONFIGDISKVOLUMESTORAGETYPE_UNSUPPORTED_ENUM");
    private String value;

    VmTemplateConfigDiskVolumeStorageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmTemplateConfigDiskVolumeStorageType fromValue(String value) {
        for (VmTemplateConfigDiskVolumeStorageType b :
                VmTemplateConfigDiskVolumeStorageType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmTemplateConfigDiskVolumeStorageType
                .VMTEMPLATECONFIGDISKVOLUMESTORAGETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmTemplateConfigDiskVolumeStorageType> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VmTemplateConfigDiskVolumeStorageType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmTemplateConfigDiskVolumeStorageType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VmTemplateConfigDiskVolumeStorageType.fromValue(value);
        }
    }
}

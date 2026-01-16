package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVolumeElfStoragePolicyType */
@JsonAdapter(VmVolumeElfStoragePolicyType.Adapter.class)
public enum VmVolumeElfStoragePolicyType {
    EC("EC"),

    ELF_CP_REPLICA_2_THICK_PROVISION("ELF_CP_REPLICA_2_THICK_PROVISION"),

    ELF_CP_REPLICA_2_THIN_PROVISION("ELF_CP_REPLICA_2_THIN_PROVISION"),

    ELF_CP_REPLICA_3_THICK_PROVISION("ELF_CP_REPLICA_3_THICK_PROVISION"),

    ELF_CP_REPLICA_3_THIN_PROVISION("ELF_CP_REPLICA_3_THIN_PROVISION"),

    REPLICA_1_THICK_PROVISION("REPLICA_1_THICK_PROVISION"),

    REPLICA_1_THIN_PROVISION("REPLICA_1_THIN_PROVISION"),

    REPLICA_2_THICK_PROVISION("REPLICA_2_THICK_PROVISION"),

    REPLICA_2_THIN_PROVISION("REPLICA_2_THIN_PROVISION"),

    REPLICA_3_THICK_PROVISION("REPLICA_3_THICK_PROVISION"),

    REPLICA_3_THIN_PROVISION("REPLICA_3_THIN_PROVISION"),

    VMVOLUMEELFSTORAGEPOLICYTYPE_UNSUPPORTED_ENUM("VMVOLUMEELFSTORAGEPOLICYTYPE_UNSUPPORTED_ENUM");
    private String value;

    VmVolumeElfStoragePolicyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVolumeElfStoragePolicyType fromValue(String value) {
        for (VmVolumeElfStoragePolicyType b : VmVolumeElfStoragePolicyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVolumeElfStoragePolicyType.VMVOLUMEELFSTORAGEPOLICYTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVolumeElfStoragePolicyType> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final VmVolumeElfStoragePolicyType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVolumeElfStoragePolicyType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVolumeElfStoragePolicyType.fromValue(value);
        }
    }
}

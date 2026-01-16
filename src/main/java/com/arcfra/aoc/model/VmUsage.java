package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmUsage */
@JsonAdapter(VmUsage.Adapter.class)
public enum VmUsage {
    ADVANCED_MONITORING("ADVANCED_MONITORING"),

    AGENT_MESH_NODE("AGENT_MESH_NODE"),

    BACKUP_CONTROLLER("BACKUP_CONTROLLER"),

    BUNDLE_APPLICATION("BUNDLE_APPLICATION"),

    CLOUDTOWER("CLOUDTOWER"),

    EVEROUTE_CONTROLLER("EVEROUTE_CONTROLLER"),

    REGISTRY("REGISTRY"),

    REPLICATION_CONTROLLER("REPLICATION_CONTROLLER"),

    SFS_CONTROLLER("SFS_CONTROLLER"),

    SHARE_REGISTRY("SHARE_REGISTRY"),

    SKS_MANAGEMENT("SKS_MANAGEMENT"),

    VMUSAGE_UNSUPPORTED_ENUM("VMUSAGE_UNSUPPORTED_ENUM");
    private String value;

    VmUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmUsage fromValue(String value) {
        for (VmUsage b : VmUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmUsage.VMUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmUsage.fromValue(value);
        }
    }
}

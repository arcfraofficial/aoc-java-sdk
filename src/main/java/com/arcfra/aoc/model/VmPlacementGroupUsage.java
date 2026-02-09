package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmPlacementGroupUsage */
@JsonAdapter(VmPlacementGroupUsage.Adapter.class)
public enum VmPlacementGroupUsage {
    SVM("SVM"),

    VMPLACEMENTGROUPUSAGE_UNSUPPORTED_ENUM("VMPLACEMENTGROUPUSAGE_UNSUPPORTED_ENUM");
    private String value;

    VmPlacementGroupUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmPlacementGroupUsage fromValue(String value) {
        for (VmPlacementGroupUsage b : VmPlacementGroupUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmPlacementGroupUsage.VMPLACEMENTGROUPUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmPlacementGroupUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmPlacementGroupUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmPlacementGroupUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmPlacementGroupUsage.fromValue(value);
        }
    }
}

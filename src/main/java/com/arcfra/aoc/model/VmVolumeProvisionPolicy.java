package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VmVolumeProvisionPolicy */
@JsonAdapter(VmVolumeProvisionPolicy.Adapter.class)
public enum VmVolumeProvisionPolicy {
    THIN("thin"),

    THICK_LAZY_ZEROED("thick_lazy_zeroed"),

    THICK_EAGER_ZEROED("thick_eager_zeroed"),

    VMVOLUMEPROVISIONPOLICY_UNSUPPORTED_ENUM("VMVOLUMEPROVISIONPOLICY_UNSUPPORTED_ENUM");
    private String value;

    VmVolumeProvisionPolicy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VmVolumeProvisionPolicy fromValue(String value) {
        for (VmVolumeProvisionPolicy b : VmVolumeProvisionPolicy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VmVolumeProvisionPolicy.VMVOLUMEPROVISIONPOLICY_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VmVolumeProvisionPolicy> {
        @Override
        public void write(final JsonWriter jsonWriter, final VmVolumeProvisionPolicy enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VmVolumeProvisionPolicy read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VmVolumeProvisionPolicy.fromValue(value);
        }
    }
}

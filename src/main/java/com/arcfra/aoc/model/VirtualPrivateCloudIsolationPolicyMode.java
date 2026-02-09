package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudIsolationPolicyMode */
@JsonAdapter(VirtualPrivateCloudIsolationPolicyMode.Adapter.class)
public enum VirtualPrivateCloudIsolationPolicyMode {
    ALL("ALL"),

    PARTIAL("PARTIAL"),

    VIRTUALPRIVATECLOUDISOLATIONPOLICYMODE_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDISOLATIONPOLICYMODE_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudIsolationPolicyMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudIsolationPolicyMode fromValue(String value) {
        for (VirtualPrivateCloudIsolationPolicyMode b :
                VirtualPrivateCloudIsolationPolicyMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudIsolationPolicyMode
                .VIRTUALPRIVATECLOUDISOLATIONPOLICYMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudIsolationPolicyMode> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudIsolationPolicyMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudIsolationPolicyMode read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudIsolationPolicyMode.fromValue(value);
        }
    }
}

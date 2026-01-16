package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudSecurityPolicyMode */
@JsonAdapter(VirtualPrivateCloudSecurityPolicyMode.Adapter.class)
public enum VirtualPrivateCloudSecurityPolicyMode {
    MONITOR("MONITOR"),

    WORK("WORK"),

    VIRTUALPRIVATECLOUDSECURITYPOLICYMODE_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDSECURITYPOLICYMODE_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudSecurityPolicyMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudSecurityPolicyMode fromValue(String value) {
        for (VirtualPrivateCloudSecurityPolicyMode b :
                VirtualPrivateCloudSecurityPolicyMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudSecurityPolicyMode
                .VIRTUALPRIVATECLOUDSECURITYPOLICYMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudSecurityPolicyMode> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudSecurityPolicyMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudSecurityPolicyMode read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudSecurityPolicyMode.fromValue(value);
        }
    }
}

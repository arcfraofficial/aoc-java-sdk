package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudNetworkPolicyRuleType */
@JsonAdapter(VirtualPrivateCloudNetworkPolicyRuleType.Adapter.class)
public enum VirtualPrivateCloudNetworkPolicyRuleType {
    ALL("ALL"),

    IP_BLOCK("IP_BLOCK"),

    SECURITY_GROUP("SECURITY_GROUP"),

    SELECTOR("SELECTOR"),

    VIRTUALPRIVATECLOUDNETWORKPOLICYRULETYPE_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDNETWORKPOLICYRULETYPE_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudNetworkPolicyRuleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudNetworkPolicyRuleType fromValue(String value) {
        for (VirtualPrivateCloudNetworkPolicyRuleType b :
                VirtualPrivateCloudNetworkPolicyRuleType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudNetworkPolicyRuleType
                .VIRTUALPRIVATECLOUDNETWORKPOLICYRULETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudNetworkPolicyRuleType> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudNetworkPolicyRuleType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudNetworkPolicyRuleType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudNetworkPolicyRuleType.fromValue(value);
        }
    }
}

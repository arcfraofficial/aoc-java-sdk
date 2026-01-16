package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudNetworkPolicyRulePortProtocol */
@JsonAdapter(VirtualPrivateCloudNetworkPolicyRulePortProtocol.Adapter.class)
public enum VirtualPrivateCloudNetworkPolicyRulePortProtocol {
    ICMP("ICMP"),

    TCP("TCP"),

    UDP("UDP"),

    VIRTUALPRIVATECLOUDNETWORKPOLICYRULEPORTPROTOCOL_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDNETWORKPOLICYRULEPORTPROTOCOL_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudNetworkPolicyRulePortProtocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudNetworkPolicyRulePortProtocol fromValue(String value) {
        for (VirtualPrivateCloudNetworkPolicyRulePortProtocol b :
                VirtualPrivateCloudNetworkPolicyRulePortProtocol.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudNetworkPolicyRulePortProtocol
                .VIRTUALPRIVATECLOUDNETWORKPOLICYRULEPORTPROTOCOL_UNSUPPORTED_ENUM;
    }

    public static class Adapter
            extends TypeAdapter<VirtualPrivateCloudNetworkPolicyRulePortProtocol> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudNetworkPolicyRulePortProtocol enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudNetworkPolicyRulePortProtocol read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudNetworkPolicyRulePortProtocol.fromValue(value);
        }
    }
}

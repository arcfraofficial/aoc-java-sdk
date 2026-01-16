package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NetworkPolicyRulePortProtocol */
@JsonAdapter(NetworkPolicyRulePortProtocol.Adapter.class)
public enum NetworkPolicyRulePortProtocol {
    ALG("ALG"),

    ICMP("ICMP"),

    IPIP("IPIP"),

    TCP("TCP"),

    UDP("UDP"),

    NETWORKPOLICYRULEPORTPROTOCOL_UNSUPPORTED_ENUM(
            "NETWORKPOLICYRULEPORTPROTOCOL_UNSUPPORTED_ENUM");
    private String value;

    NetworkPolicyRulePortProtocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkPolicyRulePortProtocol fromValue(String value) {
        for (NetworkPolicyRulePortProtocol b : NetworkPolicyRulePortProtocol.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NetworkPolicyRulePortProtocol.NETWORKPOLICYRULEPORTPROTOCOL_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NetworkPolicyRulePortProtocol> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final NetworkPolicyRulePortProtocol enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NetworkPolicyRulePortProtocol read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NetworkPolicyRulePortProtocol.fromValue(value);
        }
    }
}

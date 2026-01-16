package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NetworkPolicyRuleAlgProtocol */
@JsonAdapter(NetworkPolicyRuleAlgProtocol.Adapter.class)
public enum NetworkPolicyRuleAlgProtocol {
    FTP("FTP"),

    TFTP("TFTP"),

    NETWORKPOLICYRULEALGPROTOCOL_UNSUPPORTED_ENUM("NETWORKPOLICYRULEALGPROTOCOL_UNSUPPORTED_ENUM");
    private String value;

    NetworkPolicyRuleAlgProtocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkPolicyRuleAlgProtocol fromValue(String value) {
        for (NetworkPolicyRuleAlgProtocol b : NetworkPolicyRuleAlgProtocol.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NetworkPolicyRuleAlgProtocol.NETWORKPOLICYRULEALGPROTOCOL_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NetworkPolicyRuleAlgProtocol> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final NetworkPolicyRuleAlgProtocol enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NetworkPolicyRuleAlgProtocol read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NetworkPolicyRuleAlgProtocol.fromValue(value);
        }
    }
}

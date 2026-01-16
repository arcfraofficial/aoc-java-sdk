package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NetworkPolicyRuleType */
@JsonAdapter(NetworkPolicyRuleType.Adapter.class)
public enum NetworkPolicyRuleType {
    ALL("ALL"),

    IP_BLOCK("IP_BLOCK"),

    SECURITY_GROUP("SECURITY_GROUP"),

    SELECTOR("SELECTOR"),

    NETWORKPOLICYRULETYPE_UNSUPPORTED_ENUM("NETWORKPOLICYRULETYPE_UNSUPPORTED_ENUM");
    private String value;

    NetworkPolicyRuleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkPolicyRuleType fromValue(String value) {
        for (NetworkPolicyRuleType b : NetworkPolicyRuleType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NetworkPolicyRuleType.NETWORKPOLICYRULETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NetworkPolicyRuleType> {
        @Override
        public void write(final JsonWriter jsonWriter, final NetworkPolicyRuleType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NetworkPolicyRuleType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NetworkPolicyRuleType.fromValue(value);
        }
    }
}

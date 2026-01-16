package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NetworkPolicyRuleServiceOrderByInput */
@JsonAdapter(NetworkPolicyRuleServiceOrderByInput.Adapter.class)
public enum NetworkPolicyRuleServiceOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    MEMBERS_ASC("members_ASC"),

    MEMBERS_DESC("members_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRESET_ASC("preset_ASC"),

    PRESET_DESC("preset_DESC"),

    NETWORKPOLICYRULESERVICEORDERBYINPUT_UNSUPPORTED_ENUM(
            "NETWORKPOLICYRULESERVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NetworkPolicyRuleServiceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkPolicyRuleServiceOrderByInput fromValue(String value) {
        for (NetworkPolicyRuleServiceOrderByInput b :
                NetworkPolicyRuleServiceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NetworkPolicyRuleServiceOrderByInput
                .NETWORKPOLICYRULESERVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NetworkPolicyRuleServiceOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final NetworkPolicyRuleServiceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NetworkPolicyRuleServiceOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return NetworkPolicyRuleServiceOrderByInput.fromValue(value);
        }
    }
}

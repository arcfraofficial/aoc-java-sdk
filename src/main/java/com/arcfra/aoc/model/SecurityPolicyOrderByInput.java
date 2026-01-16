package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SecurityPolicyOrderByInput */
@JsonAdapter(SecurityPolicyOrderByInput.Adapter.class)
public enum SecurityPolicyOrderByInput {
    APPLY_TO_ASC("apply_to_ASC"),

    APPLY_TO_DESC("apply_to_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EGRESS_ASC("egress_ASC"),

    EGRESS_DESC("egress_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INGRESS_ASC("ingress_ASC"),

    INGRESS_DESC("ingress_DESC"),

    IS_BLOCKLIST_ASC("is_blocklist_ASC"),

    IS_BLOCKLIST_DESC("is_blocklist_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    POLICY_MODE_ASC("policy_mode_ASC"),

    POLICY_MODE_DESC("policy_mode_DESC"),

    SECURITYPOLICYORDERBYINPUT_UNSUPPORTED_ENUM("SECURITYPOLICYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SecurityPolicyOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SecurityPolicyOrderByInput fromValue(String value) {
        for (SecurityPolicyOrderByInput b : SecurityPolicyOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SecurityPolicyOrderByInput.SECURITYPOLICYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SecurityPolicyOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final SecurityPolicyOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SecurityPolicyOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SecurityPolicyOrderByInput.fromValue(value);
        }
    }
}

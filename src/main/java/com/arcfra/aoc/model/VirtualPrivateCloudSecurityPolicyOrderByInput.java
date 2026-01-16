package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudSecurityPolicyOrderByInput */
@JsonAdapter(VirtualPrivateCloudSecurityPolicyOrderByInput.Adapter.class)
public enum VirtualPrivateCloudSecurityPolicyOrderByInput {
    APPLY_TO_ASC("apply_to_ASC"),

    APPLY_TO_DESC("apply_to_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    EGRESS_ASC("egress_ASC"),

    EGRESS_DESC("egress_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INGRESS_ASC("ingress_ASC"),

    INGRESS_DESC("ingress_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    POLICY_MODE_ASC("policy_mode_ASC"),

    POLICY_MODE_DESC("policy_mode_DESC"),

    VIRTUALPRIVATECLOUDSECURITYPOLICYORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDSECURITYPOLICYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudSecurityPolicyOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudSecurityPolicyOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudSecurityPolicyOrderByInput b :
                VirtualPrivateCloudSecurityPolicyOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudSecurityPolicyOrderByInput
                .VIRTUALPRIVATECLOUDSECURITYPOLICYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudSecurityPolicyOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudSecurityPolicyOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudSecurityPolicyOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudSecurityPolicyOrderByInput.fromValue(value);
        }
    }
}

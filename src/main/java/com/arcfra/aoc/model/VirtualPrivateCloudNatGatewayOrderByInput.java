package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudNatGatewayOrderByInput */
@JsonAdapter(VirtualPrivateCloudNatGatewayOrderByInput.Adapter.class)
public enum VirtualPrivateCloudNatGatewayOrderByInput {
    DNAT_RULES_ASC("dnat_rules_ASC"),

    DNAT_RULES_DESC("dnat_rules_DESC"),

    ENABLE_DNAT_ASC("enable_dnat_ASC"),

    ENABLE_DNAT_DESC("enable_dnat_DESC"),

    ENABLE_SNAT_ASC("enable_snat_ASC"),

    ENABLE_SNAT_DESC("enable_snat_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXTERNAL_IP_ASC("external_ip_ASC"),

    EXTERNAL_IP_DESC("external_ip_DESC"),

    EXTERNAL_IPS_ASC("external_ips_ASC"),

    EXTERNAL_IPS_DESC("external_ips_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    VIRTUALPRIVATECLOUDNATGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDNATGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudNatGatewayOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudNatGatewayOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudNatGatewayOrderByInput b :
                VirtualPrivateCloudNatGatewayOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudNatGatewayOrderByInput
                .VIRTUALPRIVATECLOUDNATGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudNatGatewayOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudNatGatewayOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudNatGatewayOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudNatGatewayOrderByInput.fromValue(value);
        }
    }
}

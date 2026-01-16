package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudRouterGatewayOrderByInput */
@JsonAdapter(VirtualPrivateCloudRouterGatewayOrderByInput.Adapter.class)
public enum VirtualPrivateCloudRouterGatewayOrderByInput {
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

    NEXTHOP_IP_ASC("nexthop_ip_ASC"),

    NEXTHOP_IP_DESC("nexthop_ip_DESC"),

    RULES_ASC("rules_ASC"),

    RULES_DESC("rules_DESC"),

    VIRTUALPRIVATECLOUDROUTERGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDROUTERGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudRouterGatewayOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudRouterGatewayOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudRouterGatewayOrderByInput b :
                VirtualPrivateCloudRouterGatewayOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudRouterGatewayOrderByInput
                .VIRTUALPRIVATECLOUDROUTERGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudRouterGatewayOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudRouterGatewayOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudRouterGatewayOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudRouterGatewayOrderByInput.fromValue(value);
        }
    }
}

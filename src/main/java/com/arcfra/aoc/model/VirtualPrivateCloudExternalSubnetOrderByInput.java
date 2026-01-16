package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudExternalSubnetOrderByInput */
@JsonAdapter(VirtualPrivateCloudExternalSubnetOrderByInput.Adapter.class)
public enum VirtualPrivateCloudExternalSubnetOrderByInput {
    CIDR_ASC("cidr_ASC"),

    CIDR_DESC("cidr_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXCLUSIVE_ASC("exclusive_ASC"),

    EXCLUSIVE_DESC("exclusive_DESC"),

    FLOATING_IP_CIDR_ASC("floating_ip_cidr_ASC"),

    FLOATING_IP_CIDR_DESC("floating_ip_cidr_DESC"),

    GATEWAY_ASC("gateway_ASC"),

    GATEWAY_DESC("gateway_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NAT_GATEWAY_CIDR_ASC("nat_gateway_cidr_ASC"),

    NAT_GATEWAY_CIDR_DESC("nat_gateway_cidr_DESC"),

    ROUTER_GATEWAY_CIDR_ASC("router_gateway_cidr_ASC"),

    ROUTER_GATEWAY_CIDR_DESC("router_gateway_cidr_DESC"),

    VIRTUALPRIVATECLOUDEXTERNALSUBNETORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDEXTERNALSUBNETORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudExternalSubnetOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudExternalSubnetOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudExternalSubnetOrderByInput b :
                VirtualPrivateCloudExternalSubnetOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudExternalSubnetOrderByInput
                .VIRTUALPRIVATECLOUDEXTERNALSUBNETORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudExternalSubnetOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudExternalSubnetOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudExternalSubnetOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudExternalSubnetOrderByInput.fromValue(value);
        }
    }
}

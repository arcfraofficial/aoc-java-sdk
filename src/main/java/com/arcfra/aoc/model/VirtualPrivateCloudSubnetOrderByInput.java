package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudSubnetOrderByInput */
@JsonAdapter(VirtualPrivateCloudSubnetOrderByInput.Adapter.class)
public enum VirtualPrivateCloudSubnetOrderByInput {
    CIDR_ASC("cidr_ASC"),

    CIDR_DESC("cidr_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    GATEWAY_ASC("gateway_ASC"),

    GATEWAY_DESC("gateway_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IP_POOLS_ASC("ip_pools_ASC"),

    IP_POOLS_DESC("ip_pools_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    TOTAL_IP_COUNT_ASC("total_ip_count_ASC"),

    TOTAL_IP_COUNT_DESC("total_ip_count_DESC"),

    UNUSED_IP_COUNT_ASC("unused_ip_count_ASC"),

    UNUSED_IP_COUNT_DESC("unused_ip_count_DESC"),

    VIRTUALPRIVATECLOUDSUBNETORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDSUBNETORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudSubnetOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudSubnetOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudSubnetOrderByInput b :
                VirtualPrivateCloudSubnetOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudSubnetOrderByInput
                .VIRTUALPRIVATECLOUDSUBNETORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudSubnetOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudSubnetOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudSubnetOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudSubnetOrderByInput.fromValue(value);
        }
    }
}

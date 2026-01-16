package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudFloatingIpOrderByInput */
@JsonAdapter(VirtualPrivateCloudFloatingIpOrderByInput.Adapter.class)
public enum VirtualPrivateCloudFloatingIpOrderByInput {
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

    VIRTUALPRIVATECLOUDFLOATINGIPORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDFLOATINGIPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudFloatingIpOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudFloatingIpOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudFloatingIpOrderByInput b :
                VirtualPrivateCloudFloatingIpOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudFloatingIpOrderByInput
                .VIRTUALPRIVATECLOUDFLOATINGIPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudFloatingIpOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudFloatingIpOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudFloatingIpOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudFloatingIpOrderByInput.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudClusterBindingOrderByInput */
@JsonAdapter(VirtualPrivateCloudClusterBindingOrderByInput.Adapter.class)
public enum VirtualPrivateCloudClusterBindingOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    MTU_ASC("mtu_ASC"),

    MTU_DESC("mtu_DESC"),

    VLAN_ID_ASC("vlan_id_ASC"),

    VLAN_ID_DESC("vlan_id_DESC"),

    VIRTUALPRIVATECLOUDCLUSTERBINDINGORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDCLUSTERBINDINGORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudClusterBindingOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudClusterBindingOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudClusterBindingOrderByInput b :
                VirtualPrivateCloudClusterBindingOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudClusterBindingOrderByInput
                .VIRTUALPRIVATECLOUDCLUSTERBINDINGORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudClusterBindingOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudClusterBindingOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudClusterBindingOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudClusterBindingOrderByInput.fromValue(value);
        }
    }
}

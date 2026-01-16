package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudRouteTableOrderByInput */
@JsonAdapter(VirtualPrivateCloudRouteTableOrderByInput.Adapter.class)
public enum VirtualPrivateCloudRouteTableOrderByInput {
    DEFAULT_FOR_VPC_ASC("default_for_vpc_ASC"),

    DEFAULT_FOR_VPC_DESC("default_for_vpc_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    VIRTUALPRIVATECLOUDROUTETABLEORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDROUTETABLEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudRouteTableOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudRouteTableOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudRouteTableOrderByInput b :
                VirtualPrivateCloudRouteTableOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudRouteTableOrderByInput
                .VIRTUALPRIVATECLOUDROUTETABLEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudRouteTableOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudRouteTableOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudRouteTableOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudRouteTableOrderByInput.fromValue(value);
        }
    }
}

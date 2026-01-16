package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudEdgeGatewayOrderByInput */
@JsonAdapter(VirtualPrivateCloudEdgeGatewayOrderByInput.Adapter.class)
public enum VirtualPrivateCloudEdgeGatewayOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    STATUS_ASC("status_ASC"),

    STATUS_DESC("status_DESC"),

    VIRTUALPRIVATECLOUDEDGEGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDEDGEGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudEdgeGatewayOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudEdgeGatewayOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudEdgeGatewayOrderByInput b :
                VirtualPrivateCloudEdgeGatewayOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudEdgeGatewayOrderByInput
                .VIRTUALPRIVATECLOUDEDGEGATEWAYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudEdgeGatewayOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudEdgeGatewayOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudEdgeGatewayOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudEdgeGatewayOrderByInput.fromValue(value);
        }
    }
}

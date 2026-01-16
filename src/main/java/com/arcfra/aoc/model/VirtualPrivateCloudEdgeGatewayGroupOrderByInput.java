package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudEdgeGatewayGroupOrderByInput */
@JsonAdapter(VirtualPrivateCloudEdgeGatewayGroupOrderByInput.Adapter.class)
public enum VirtualPrivateCloudEdgeGatewayGroupOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PRIMARY_EDGE_GATEWAY_ID_ASC("primary_edge_gateway_id_ASC"),

    PRIMARY_EDGE_GATEWAY_ID_DESC("primary_edge_gateway_id_DESC"),

    VIRTUALPRIVATECLOUDEDGEGATEWAYGROUPORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDEDGEGATEWAYGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudEdgeGatewayGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudEdgeGatewayGroupOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudEdgeGatewayGroupOrderByInput b :
                VirtualPrivateCloudEdgeGatewayGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudEdgeGatewayGroupOrderByInput
                .VIRTUALPRIVATECLOUDEDGEGATEWAYGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter
            extends TypeAdapter<VirtualPrivateCloudEdgeGatewayGroupOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudEdgeGatewayGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudEdgeGatewayGroupOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudEdgeGatewayGroupOrderByInput.fromValue(value);
        }
    }
}

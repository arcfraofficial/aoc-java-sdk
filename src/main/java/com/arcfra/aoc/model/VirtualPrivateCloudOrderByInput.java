package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudOrderByInput */
@JsonAdapter(VirtualPrivateCloudOrderByInput.Adapter.class)
public enum VirtualPrivateCloudOrderByInput {
    ASSOCIATE_EXTERNAL_SUBNET_NUM_ASC("associate_external_subnet_num_ASC"),

    ASSOCIATE_EXTERNAL_SUBNET_NUM_DESC("associate_external_subnet_num_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    MTU_ASC("mtu_ASC"),

    MTU_DESC("mtu_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    VIRTUALPRIVATECLOUDORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudOrderByInput b : VirtualPrivateCloudOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudOrderByInput.VIRTUALPRIVATECLOUDORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final VirtualPrivateCloudOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudOrderByInput.fromValue(value);
        }
    }
}

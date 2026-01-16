package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudExternalSubnetGroupOrderByInput */
@JsonAdapter(VirtualPrivateCloudExternalSubnetGroupOrderByInput.Adapter.class)
public enum VirtualPrivateCloudExternalSubnetGroupOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXCLUSIVE_ASC("exclusive_ASC"),

    EXCLUSIVE_DESC("exclusive_DESC"),

    EXTERNAL_SUBNETS_SPEC_ASC("external_subnets_spec_ASC"),

    EXTERNAL_SUBNETS_SPEC_DESC("external_subnets_spec_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    SHARED_IN_EDGE_GATEWAY_GROUP_ASC("shared_in_edge_gateway_group_ASC"),

    SHARED_IN_EDGE_GATEWAY_GROUP_DESC("shared_in_edge_gateway_group_DESC"),

    VIRTUALPRIVATECLOUDEXTERNALSUBNETGROUPORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDEXTERNALSUBNETGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudExternalSubnetGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudExternalSubnetGroupOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudExternalSubnetGroupOrderByInput b :
                VirtualPrivateCloudExternalSubnetGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudExternalSubnetGroupOrderByInput
                .VIRTUALPRIVATECLOUDEXTERNALSUBNETGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter
            extends TypeAdapter<VirtualPrivateCloudExternalSubnetGroupOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudExternalSubnetGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudExternalSubnetGroupOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudExternalSubnetGroupOrderByInput.fromValue(value);
        }
    }
}

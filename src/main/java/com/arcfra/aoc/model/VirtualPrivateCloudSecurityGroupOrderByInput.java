package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VirtualPrivateCloudSecurityGroupOrderByInput */
@JsonAdapter(VirtualPrivateCloudSecurityGroupOrderByInput.Adapter.class)
public enum VirtualPrivateCloudSecurityGroupOrderByInput {
    DEFAULT_FOR_VPC_ASC("default_for_vpc_ASC"),

    DEFAULT_FOR_VPC_DESC("default_for_vpc_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LABEL_GROUPS_ASC("label_groups_ASC"),

    LABEL_GROUPS_DESC("label_groups_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    VIRTUALPRIVATECLOUDSECURITYGROUPORDERBYINPUT_UNSUPPORTED_ENUM(
            "VIRTUALPRIVATECLOUDSECURITYGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VirtualPrivateCloudSecurityGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VirtualPrivateCloudSecurityGroupOrderByInput fromValue(String value) {
        for (VirtualPrivateCloudSecurityGroupOrderByInput b :
                VirtualPrivateCloudSecurityGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VirtualPrivateCloudSecurityGroupOrderByInput
                .VIRTUALPRIVATECLOUDSECURITYGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VirtualPrivateCloudSecurityGroupOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter,
                final VirtualPrivateCloudSecurityGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VirtualPrivateCloudSecurityGroupOrderByInput read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return VirtualPrivateCloudSecurityGroupOrderByInput.fromValue(value);
        }
    }
}

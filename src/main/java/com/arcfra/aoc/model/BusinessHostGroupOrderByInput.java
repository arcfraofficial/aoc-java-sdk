package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BusinessHostGroupOrderByInput */
@JsonAdapter(BusinessHostGroupOrderByInput.Adapter.class)
public enum BusinessHostGroupOrderByInput {
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

    BUSINESSHOSTGROUPORDERBYINPUT_UNSUPPORTED_ENUM(
            "BUSINESSHOSTGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BusinessHostGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessHostGroupOrderByInput fromValue(String value) {
        for (BusinessHostGroupOrderByInput b : BusinessHostGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BusinessHostGroupOrderByInput.BUSINESSHOSTGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BusinessHostGroupOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BusinessHostGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BusinessHostGroupOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BusinessHostGroupOrderByInput.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BusinessHostOrderByInput */
@JsonAdapter(BusinessHostOrderByInput.Adapter.class)
public enum BusinessHostOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INITIATORS_ASC("initiators_ASC"),

    INITIATORS_DESC("initiators_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    BUSINESSHOSTORDERBYINPUT_UNSUPPORTED_ENUM("BUSINESSHOSTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    BusinessHostOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessHostOrderByInput fromValue(String value) {
        for (BusinessHostOrderByInput b : BusinessHostOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BusinessHostOrderByInput.BUSINESSHOSTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BusinessHostOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final BusinessHostOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BusinessHostOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BusinessHostOrderByInput.fromValue(value);
        }
    }
}

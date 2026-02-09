package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ConsistencyGroupOrderByInput */
@JsonAdapter(ConsistencyGroupOrderByInput.Adapter.class)
public enum ConsistencyGroupOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATED_AT_ASC("local_created_at_ASC"),

    LOCAL_CREATED_AT_DESC("local_created_at_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    UNIQUE_SIZE_ASC("unique_size_ASC"),

    UNIQUE_SIZE_DESC("unique_size_DESC"),

    CONSISTENCYGROUPORDERBYINPUT_UNSUPPORTED_ENUM("CONSISTENCYGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    ConsistencyGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConsistencyGroupOrderByInput fromValue(String value) {
        for (ConsistencyGroupOrderByInput b : ConsistencyGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ConsistencyGroupOrderByInput.CONSISTENCYGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ConsistencyGroupOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ConsistencyGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ConsistencyGroupOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ConsistencyGroupOrderByInput.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NamespaceGroupOrderByInput */
@JsonAdapter(NamespaceGroupOrderByInput.Adapter.class)
public enum NamespaceGroupOrderByInput {
    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_CREATE_TIME_ASC("local_create_time_ASC"),

    LOCAL_CREATE_TIME_DESC("local_create_time_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NAMESPACEGROUPORDERBYINPUT_UNSUPPORTED_ENUM("NAMESPACEGROUPORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NamespaceGroupOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NamespaceGroupOrderByInput fromValue(String value) {
        for (NamespaceGroupOrderByInput b : NamespaceGroupOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NamespaceGroupOrderByInput.NAMESPACEGROUPORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NamespaceGroupOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final NamespaceGroupOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NamespaceGroupOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NamespaceGroupOrderByInput.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets RegistryServiceOrderByInput */
@JsonAdapter(RegistryServiceOrderByInput.Adapter.class)
public enum RegistryServiceOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    HOSTNAME_ASC("hostname_ASC"),

    HOSTNAME_DESC("hostname_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    USAGE_ASC("usage_ASC"),

    USAGE_DESC("usage_DESC"),

    REGISTRYSERVICEORDERBYINPUT_UNSUPPORTED_ENUM("REGISTRYSERVICEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    RegistryServiceOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RegistryServiceOrderByInput fromValue(String value) {
        for (RegistryServiceOrderByInput b : RegistryServiceOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return RegistryServiceOrderByInput.REGISTRYSERVICEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<RegistryServiceOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final RegistryServiceOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RegistryServiceOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RegistryServiceOrderByInput.fromValue(value);
        }
    }
}

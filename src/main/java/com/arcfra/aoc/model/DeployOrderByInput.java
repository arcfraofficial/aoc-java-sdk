package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DeployOrderByInput */
@JsonAdapter(DeployOrderByInput.Adapter.class)
public enum DeployOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    DEPLOYORDERBYINPUT_UNSUPPORTED_ENUM("DEPLOYORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    DeployOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeployOrderByInput fromValue(String value) {
        for (DeployOrderByInput b : DeployOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DeployOrderByInput.DEPLOYORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DeployOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final DeployOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DeployOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DeployOrderByInput.fromValue(value);
        }
    }
}

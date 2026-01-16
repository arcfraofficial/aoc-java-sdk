package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets OrganizationOrderByInput */
@JsonAdapter(OrganizationOrderByInput.Adapter.class)
public enum OrganizationOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    ORGANIZATIONORDERBYINPUT_UNSUPPORTED_ENUM("ORGANIZATIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    OrganizationOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrganizationOrderByInput fromValue(String value) {
        for (OrganizationOrderByInput b : OrganizationOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return OrganizationOrderByInput.ORGANIZATIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<OrganizationOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final OrganizationOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OrganizationOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OrganizationOrderByInput.fromValue(value);
        }
    }
}

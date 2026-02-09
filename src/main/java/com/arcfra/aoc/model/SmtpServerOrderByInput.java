package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SmtpServerOrderByInput */
@JsonAdapter(SmtpServerOrderByInput.Adapter.class)
public enum SmtpServerOrderByInput {
    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    HOST_ASC("host_ASC"),

    HOST_DESC("host_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PORT_ASC("port_ASC"),

    PORT_DESC("port_DESC"),

    SECURE_MODE_ASC("secure_mode_ASC"),

    SECURE_MODE_DESC("secure_mode_DESC"),

    USERNAME_ASC("username_ASC"),

    USERNAME_DESC("username_DESC"),

    SMTPSERVERORDERBYINPUT_UNSUPPORTED_ENUM("SMTPSERVERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SmtpServerOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SmtpServerOrderByInput fromValue(String value) {
        for (SmtpServerOrderByInput b : SmtpServerOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SmtpServerOrderByInput.SMTPSERVERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SmtpServerOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final SmtpServerOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SmtpServerOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SmtpServerOrderByInput.fromValue(value);
        }
    }
}

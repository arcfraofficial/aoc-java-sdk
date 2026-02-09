package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AlertNotifierOrderByInput */
@JsonAdapter(AlertNotifierOrderByInput.Adapter.class)
public enum AlertNotifierOrderByInput {
    DISABLED_ASC("disabled_ASC"),

    DISABLED_DESC("disabled_DESC"),

    EMAIL_FROM_ASC("email_from_ASC"),

    EMAIL_FROM_DESC("email_from_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LANGUAGE_CODE_ASC("language_code_ASC"),

    LANGUAGE_CODE_DESC("language_code_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    SECURITY_MODE_ASC("security_mode_ASC"),

    SECURITY_MODE_DESC("security_mode_DESC"),

    SMTP_SERVER_HOST_ASC("smtp_server_host_ASC"),

    SMTP_SERVER_HOST_DESC("smtp_server_host_DESC"),

    SMTP_SERVER_PORT_ASC("smtp_server_port_ASC"),

    SMTP_SERVER_PORT_DESC("smtp_server_port_DESC"),

    USERNAME_ASC("username_ASC"),

    USERNAME_DESC("username_DESC"),

    ALERTNOTIFIERORDERBYINPUT_UNSUPPORTED_ENUM("ALERTNOTIFIERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    AlertNotifierOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AlertNotifierOrderByInput fromValue(String value) {
        for (AlertNotifierOrderByInput b : AlertNotifierOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AlertNotifierOrderByInput.ALERTNOTIFIERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AlertNotifierOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final AlertNotifierOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AlertNotifierOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AlertNotifierOrderByInput.fromValue(value);
        }
    }
}

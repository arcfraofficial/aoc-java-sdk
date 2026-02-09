package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnmpTransportOrderByInput */
@JsonAdapter(SnmpTransportOrderByInput.Adapter.class)
public enum SnmpTransportOrderByInput {
    AUTH_PASS_PHRASE_ASC("auth_pass_phrase_ASC"),

    AUTH_PASS_PHRASE_DESC("auth_pass_phrase_DESC"),

    AUTH_PROTOCOL_ASC("auth_protocol_ASC"),

    AUTH_PROTOCOL_DESC("auth_protocol_DESC"),

    COMMUNITY_ASC("community_ASC"),

    COMMUNITY_DESC("community_DESC"),

    DISABLED_ASC("disabled_ASC"),

    DISABLED_DESC("disabled_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    PORT_ASC("port_ASC"),

    PORT_DESC("port_DESC"),

    PRIVACY_PASS_PHRASE_ASC("privacy_pass_phrase_ASC"),

    PRIVACY_PASS_PHRASE_DESC("privacy_pass_phrase_DESC"),

    PRIVACY_PROTOCOL_ASC("privacy_protocol_ASC"),

    PRIVACY_PROTOCOL_DESC("privacy_protocol_DESC"),

    PROTOCOL_ASC("protocol_ASC"),

    PROTOCOL_DESC("protocol_DESC"),

    USERNAME_ASC("username_ASC"),

    USERNAME_DESC("username_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    SNMPTRANSPORTORDERBYINPUT_UNSUPPORTED_ENUM("SNMPTRANSPORTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SnmpTransportOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnmpTransportOrderByInput fromValue(String value) {
        for (SnmpTransportOrderByInput b : SnmpTransportOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnmpTransportOrderByInput.SNMPTRANSPORTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnmpTransportOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnmpTransportOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnmpTransportOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnmpTransportOrderByInput.fromValue(value);
        }
    }
}

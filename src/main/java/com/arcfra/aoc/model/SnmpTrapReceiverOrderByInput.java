package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnmpTrapReceiverOrderByInput */
@JsonAdapter(SnmpTrapReceiverOrderByInput.Adapter.class)
public enum SnmpTrapReceiverOrderByInput {
    AUTH_PASS_PHRASE_ASC("auth_pass_phrase_ASC"),

    AUTH_PASS_PHRASE_DESC("auth_pass_phrase_DESC"),

    AUTH_PROTOCOL_ASC("auth_protocol_ASC"),

    AUTH_PROTOCOL_DESC("auth_protocol_DESC"),

    COMMUNITY_ASC("community_ASC"),

    COMMUNITY_DESC("community_DESC"),

    DISABLED_ASC("disabled_ASC"),

    DISABLED_DESC("disabled_DESC"),

    ENGINE_ID_ASC("engine_id_ASC"),

    ENGINE_ID_DESC("engine_id_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    HOST_ASC("host_ASC"),

    HOST_DESC("host_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INFORM_ASC("inform_ASC"),

    INFORM_DESC("inform_DESC"),

    LANGUAGE_CODE_ASC("language_code_ASC"),

    LANGUAGE_CODE_DESC("language_code_DESC"),

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

    SNMPTRAPRECEIVERORDERBYINPUT_UNSUPPORTED_ENUM("SNMPTRAPRECEIVERORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    SnmpTrapReceiverOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnmpTrapReceiverOrderByInput fromValue(String value) {
        for (SnmpTrapReceiverOrderByInput b : SnmpTrapReceiverOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnmpTrapReceiverOrderByInput.SNMPTRAPRECEIVERORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnmpTrapReceiverOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final SnmpTrapReceiverOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnmpTrapReceiverOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnmpTrapReceiverOrderByInput.fromValue(value);
        }
    }
}

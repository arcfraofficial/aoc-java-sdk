package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IscsiConnectionOrderByInput */
@JsonAdapter(IscsiConnectionOrderByInput.Adapter.class)
public enum IscsiConnectionOrderByInput {
    CLIENT_PORT_ASC("client_port_ASC"),

    CLIENT_PORT_DESC("client_port_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INITIATOR_IP_ASC("initiator_ip_ASC"),

    INITIATOR_IP_DESC("initiator_ip_DESC"),

    TR_TYPE_ASC("tr_type_ASC"),

    TR_TYPE_DESC("tr_type_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    ISCSICONNECTIONORDERBYINPUT_UNSUPPORTED_ENUM("ISCSICONNECTIONORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    IscsiConnectionOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IscsiConnectionOrderByInput fromValue(String value) {
        for (IscsiConnectionOrderByInput b : IscsiConnectionOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IscsiConnectionOrderByInput.ISCSICONNECTIONORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IscsiConnectionOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final IscsiConnectionOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IscsiConnectionOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IscsiConnectionOrderByInput.fromValue(value);
        }
    }
}

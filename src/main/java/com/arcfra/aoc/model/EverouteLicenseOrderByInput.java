package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EverouteLicenseOrderByInput */
@JsonAdapter(EverouteLicenseOrderByInput.Adapter.class)
public enum EverouteLicenseOrderByInput {
    CODE_ASC("code_ASC"),

    CODE_DESC("code_DESC"),

    EXPIRE_DATE_ASC("expire_date_ASC"),

    EXPIRE_DATE_DESC("expire_date_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    MAX_SOCKET_NUM_ASC("max_socket_num_ASC"),

    MAX_SOCKET_NUM_DESC("max_socket_num_DESC"),

    SERIAL_ASC("serial_ASC"),

    SERIAL_DESC("serial_DESC"),

    SIGN_DATE_ASC("sign_date_ASC"),

    SIGN_DATE_DESC("sign_date_DESC"),

    SOFTWARE_EDITION_ASC("software_edition_ASC"),

    SOFTWARE_EDITION_DESC("software_edition_DESC"),

    TYPE_ASC("type_ASC"),

    TYPE_DESC("type_DESC"),

    UID_ASC("uid_ASC"),

    UID_DESC("uid_DESC"),

    EVEROUTELICENSEORDERBYINPUT_UNSUPPORTED_ENUM("EVEROUTELICENSEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    EverouteLicenseOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EverouteLicenseOrderByInput fromValue(String value) {
        for (EverouteLicenseOrderByInput b : EverouteLicenseOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EverouteLicenseOrderByInput.EVEROUTELICENSEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EverouteLicenseOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final EverouteLicenseOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EverouteLicenseOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EverouteLicenseOrderByInput.fromValue(value);
        }
    }
}

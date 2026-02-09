package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VsphereEsxiAccountOrderByInput */
@JsonAdapter(VsphereEsxiAccountOrderByInput.Adapter.class)
public enum VsphereEsxiAccountOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IP_ASC("ip_ASC"),

    IP_DESC("ip_DESC"),

    IS_VALID_ASC("is_valid_ASC"),

    IS_VALID_DESC("is_valid_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    PORT_ASC("port_ASC"),

    PORT_DESC("port_DESC"),

    USERNAME_ASC("username_ASC"),

    USERNAME_DESC("username_DESC"),

    VSPHEREESXIACCOUNTORDERBYINPUT_UNSUPPORTED_ENUM(
            "VSPHEREESXIACCOUNTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VsphereEsxiAccountOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VsphereEsxiAccountOrderByInput fromValue(String value) {
        for (VsphereEsxiAccountOrderByInput b : VsphereEsxiAccountOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VsphereEsxiAccountOrderByInput.VSPHEREESXIACCOUNTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VsphereEsxiAccountOrderByInput> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final VsphereEsxiAccountOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VsphereEsxiAccountOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VsphereEsxiAccountOrderByInput.fromValue(value);
        }
    }
}

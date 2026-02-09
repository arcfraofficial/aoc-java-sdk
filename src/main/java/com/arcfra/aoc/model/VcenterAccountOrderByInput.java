package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets VcenterAccountOrderByInput */
@JsonAdapter(VcenterAccountOrderByInput.Adapter.class)
public enum VcenterAccountOrderByInput {
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

    VCENTERACCOUNTORDERBYINPUT_UNSUPPORTED_ENUM("VCENTERACCOUNTORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    VcenterAccountOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VcenterAccountOrderByInput fromValue(String value) {
        for (VcenterAccountOrderByInput b : VcenterAccountOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return VcenterAccountOrderByInput.VCENTERACCOUNTORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<VcenterAccountOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final VcenterAccountOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public VcenterAccountOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return VcenterAccountOrderByInput.fromValue(value);
        }
    }
}

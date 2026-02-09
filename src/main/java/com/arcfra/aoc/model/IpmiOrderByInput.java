package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IpmiOrderByInput */
@JsonAdapter(IpmiOrderByInput.Adapter.class)
public enum IpmiOrderByInput {
    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    IP_ASC("ip_ASC"),

    IP_DESC("ip_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    USERNAME_ASC("username_ASC"),

    USERNAME_DESC("username_DESC"),

    VALID_ASC("valid_ASC"),

    VALID_DESC("valid_DESC"),

    IPMIORDERBYINPUT_UNSUPPORTED_ENUM("IPMIORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    IpmiOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IpmiOrderByInput fromValue(String value) {
        for (IpmiOrderByInput b : IpmiOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IpmiOrderByInput.IPMIORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IpmiOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final IpmiOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IpmiOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IpmiOrderByInput.fromValue(value);
        }
    }
}

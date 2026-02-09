package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnmpPrivacyProtocol */
@JsonAdapter(SnmpPrivacyProtocol.Adapter.class)
public enum SnmpPrivacyProtocol {
    AES("AES"),

    DES("DES"),

    SNMPPRIVACYPROTOCOL_UNSUPPORTED_ENUM("SNMPPRIVACYPROTOCOL_UNSUPPORTED_ENUM");
    private String value;

    SnmpPrivacyProtocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnmpPrivacyProtocol fromValue(String value) {
        for (SnmpPrivacyProtocol b : SnmpPrivacyProtocol.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnmpPrivacyProtocol.SNMPPRIVACYPROTOCOL_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnmpPrivacyProtocol> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnmpPrivacyProtocol enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnmpPrivacyProtocol read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnmpPrivacyProtocol.fromValue(value);
        }
    }
}

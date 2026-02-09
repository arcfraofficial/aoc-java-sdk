package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SmtpSecureMode */
@JsonAdapter(SmtpSecureMode.Adapter.class)
public enum SmtpSecureMode {
    SSL("SSL"),

    STARTTLS("STARTTLS"),

    UNSPECIFIED("UNSPECIFIED"),

    SMTPSECUREMODE_UNSUPPORTED_ENUM("SMTPSECUREMODE_UNSUPPORTED_ENUM");
    private String value;

    SmtpSecureMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SmtpSecureMode fromValue(String value) {
        for (SmtpSecureMode b : SmtpSecureMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SmtpSecureMode.SMTPSECUREMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SmtpSecureMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final SmtpSecureMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SmtpSecureMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SmtpSecureMode.fromValue(value);
        }
    }
}

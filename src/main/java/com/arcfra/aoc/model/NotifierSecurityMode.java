package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NotifierSecurityMode */
@JsonAdapter(NotifierSecurityMode.Adapter.class)
public enum NotifierSecurityMode {
    SSL("SSL"),

    STARTTLS("STARTTLS"),

    UNSPECIFIED("UNSPECIFIED"),

    NOTIFIERSECURITYMODE_UNSUPPORTED_ENUM("NOTIFIERSECURITYMODE_UNSUPPORTED_ENUM");
    private String value;

    NotifierSecurityMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NotifierSecurityMode fromValue(String value) {
        for (NotifierSecurityMode b : NotifierSecurityMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NotifierSecurityMode.NOTIFIERSECURITYMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NotifierSecurityMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final NotifierSecurityMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NotifierSecurityMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NotifierSecurityMode.fromValue(value);
        }
    }
}

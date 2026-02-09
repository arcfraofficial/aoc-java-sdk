package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NotifierLanguageCode */
@JsonAdapter(NotifierLanguageCode.Adapter.class)
public enum NotifierLanguageCode {
    EN_US("EN_US"),

    ZH_CN("ZH_CN"),

    NOTIFIERLANGUAGECODE_UNSUPPORTED_ENUM("NOTIFIERLANGUAGECODE_UNSUPPORTED_ENUM");
    private String value;

    NotifierLanguageCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NotifierLanguageCode fromValue(String value) {
        for (NotifierLanguageCode b : NotifierLanguageCode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NotifierLanguageCode.NOTIFIERLANGUAGECODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NotifierLanguageCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final NotifierLanguageCode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NotifierLanguageCode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NotifierLanguageCode.fromValue(value);
        }
    }
}

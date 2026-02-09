package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SnmpLanguageCode */
@JsonAdapter(SnmpLanguageCode.Adapter.class)
public enum SnmpLanguageCode {
    EN_US("EN_US"),

    ZH_CN("ZH_CN"),

    SNMPLANGUAGECODE_UNSUPPORTED_ENUM("SNMPLANGUAGECODE_UNSUPPORTED_ENUM");
    private String value;

    SnmpLanguageCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SnmpLanguageCode fromValue(String value) {
        for (SnmpLanguageCode b : SnmpLanguageCode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SnmpLanguageCode.SNMPLANGUAGECODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SnmpLanguageCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final SnmpLanguageCode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SnmpLanguageCode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SnmpLanguageCode.fromValue(value);
        }
    }
}

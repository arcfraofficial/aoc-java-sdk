package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SeverityEnum */
@JsonAdapter(SeverityEnum.Adapter.class)
public enum SeverityEnum {
    CRITICAL("CRITICAL"),

    INFO("INFO"),

    NOTICE("NOTICE"),

    SEVERITY_UNSPECIFIED("SEVERITY_UNSPECIFIED"),

    SEVERITYENUM_UNSUPPORTED_ENUM("SEVERITYENUM_UNSUPPORTED_ENUM");
    private String value;

    SeverityEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
        for (SeverityEnum b : SeverityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SeverityEnum.SEVERITYENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SeverityEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SeverityEnum.fromValue(value);
        }
    }
}

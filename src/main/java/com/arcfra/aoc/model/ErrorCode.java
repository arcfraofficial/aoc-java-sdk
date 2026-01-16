package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ErrorCode */
@JsonAdapter(ErrorCode.Adapter.class)
public enum ErrorCode {
    RESOURCELOCKED("ResourceLocked"),

    ERRORCODE_UNSUPPORTED_ENUM("ERRORCODE_UNSUPPORTED_ENUM");
    private String value;

    ErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ErrorCode fromValue(String value) {
        for (ErrorCode b : ErrorCode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ErrorCode.ERRORCODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ErrorCode> {
        @Override
        public void write(final JsonWriter jsonWriter, final ErrorCode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ErrorCode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ErrorCode.fromValue(value);
        }
    }
}

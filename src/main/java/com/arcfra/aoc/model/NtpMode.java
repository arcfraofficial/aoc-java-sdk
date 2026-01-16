package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NtpMode */
@JsonAdapter(NtpMode.Adapter.class)
public enum NtpMode {
    EXTERNAL("EXTERNAL"),

    INTERNAL("INTERNAL"),

    NTPMODE_UNSUPPORTED_ENUM("NTPMODE_UNSUPPORTED_ENUM");
    private String value;

    NtpMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NtpMode fromValue(String value) {
        for (NtpMode b : NtpMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NtpMode.NTPMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NtpMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final NtpMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NtpMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NtpMode.fromValue(value);
        }
    }
}

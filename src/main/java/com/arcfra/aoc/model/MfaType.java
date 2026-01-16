package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MfaType */
@JsonAdapter(MfaType.Adapter.class)
public enum MfaType {
    MAIL("Mail"),

    SMS("Sms"),

    MFATYPE_UNSUPPORTED_ENUM("MFATYPE_UNSUPPORTED_ENUM");
    private String value;

    MfaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MfaType fromValue(String value) {
        for (MfaType b : MfaType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MfaType.MFATYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MfaType> {
        @Override
        public void write(final JsonWriter jsonWriter, final MfaType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MfaType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MfaType.fromValue(value);
        }
    }
}

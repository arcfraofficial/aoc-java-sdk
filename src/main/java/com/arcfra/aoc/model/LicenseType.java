package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets LicenseType */
@JsonAdapter(LicenseType.Adapter.class)
public enum LicenseType {
    PERPETUAL("PERPETUAL"),

    SUBSCRIPTION("SUBSCRIPTION"),

    TRIAL("TRIAL"),

    LICENSETYPE_UNSUPPORTED_ENUM("LICENSETYPE_UNSUPPORTED_ENUM");
    private String value;

    LicenseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LicenseType fromValue(String value) {
        for (LicenseType b : LicenseType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return LicenseType.LICENSETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<LicenseType> {
        @Override
        public void write(final JsonWriter jsonWriter, final LicenseType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LicenseType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LicenseType.fromValue(value);
        }
    }
}

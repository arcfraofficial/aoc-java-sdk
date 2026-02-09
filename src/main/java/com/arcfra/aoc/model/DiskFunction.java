package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskFunction */
@JsonAdapter(DiskFunction.Adapter.class)
public enum DiskFunction {
    BOOT("BOOT"),

    CACHE("CACHE"),

    DATA("DATA"),

    SMTX_SYSTEM("SMTX_SYSTEM"),

    UNMOUNT("UNMOUNT"),

    DISKFUNCTION_UNSUPPORTED_ENUM("DISKFUNCTION_UNSUPPORTED_ENUM");
    private String value;

    DiskFunction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskFunction fromValue(String value) {
        for (DiskFunction b : DiskFunction.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskFunction.DISKFUNCTION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskFunction> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskFunction enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskFunction read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskFunction.fromValue(value);
        }
    }
}

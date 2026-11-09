package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MigrateMode */
@JsonAdapter(MigrateMode.Adapter.class)
public enum MigrateMode {
    COMPUTE_RESOURCE_AND_STORAGE("CHANGE_COMPUTE_RESOURCE_AND_STORAGE"),

    COMPUTE_RESOURCE_ONLY("CHANGE_COMPUTE_RESOURCE_ONLY"),

    STORAGE_ONLY("CHANGE_STORAGE_ONLY"),

    MIGRATEMODE_UNSUPPORTED_ENUM("MIGRATEMODE_UNSUPPORTED_ENUM");
    private String value;

    MigrateMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MigrateMode fromValue(String value) {
        for (MigrateMode b : MigrateMode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MigrateMode.MIGRATEMODE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MigrateMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final MigrateMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MigrateMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MigrateMode.fromValue(value);
        }
    }
}

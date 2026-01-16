package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets MigrateType */
@JsonAdapter(MigrateType.Adapter.class)
public enum MigrateType {
    COLD_MIGRATE("COLD_MIGRATE"),

    CUTOVER_MIGRATE("CUTOVER_MIGRATE"),

    LIVE_MIGRATE("LIVE_MIGRATE"),

    MIGRATETYPE_UNSUPPORTED_ENUM("MIGRATETYPE_UNSUPPORTED_ENUM");
    private String value;

    MigrateType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MigrateType fromValue(String value) {
        for (MigrateType b : MigrateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return MigrateType.MIGRATETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<MigrateType> {
        @Override
        public void write(final JsonWriter jsonWriter, final MigrateType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MigrateType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MigrateType.fromValue(value);
        }
    }
}

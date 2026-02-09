package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskUsage */
@JsonAdapter(DiskUsage.Adapter.class)
public enum DiskUsage {
    BOOT("BOOT"),

    CACHE("CACHE"),

    CACHE_AND_META("CACHE_AND_META"),

    DATA("DATA"),

    DATA_AND_META("DATA_AND_META"),

    DISKUSAGE_UNSUPPORTED_ENUM("DISKUSAGE_UNSUPPORTED_ENUM");
    private String value;

    DiskUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskUsage fromValue(String value) {
        for (DiskUsage b : DiskUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskUsage.DISKUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskUsage.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskUsageStatus */
@JsonAdapter(DiskUsageStatus.Adapter.class)
public enum DiskUsageStatus {
    ISOLATED("ISOLATED"),

    MOUNTED("MOUNTED"),

    MOUNTING("MOUNTING"),

    PARTIAL_MOUNTED("PARTIAL_MOUNTED"),

    UNMOUNTED("UNMOUNTED"),

    UNMOUNTING("UNMOUNTING"),

    DISKUSAGESTATUS_UNSUPPORTED_ENUM("DISKUSAGESTATUS_UNSUPPORTED_ENUM");
    private String value;

    DiskUsageStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskUsageStatus fromValue(String value) {
        for (DiskUsageStatus b : DiskUsageStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskUsageStatus.DISKUSAGESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskUsageStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskUsageStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskUsageStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskUsageStatus.fromValue(value);
        }
    }
}

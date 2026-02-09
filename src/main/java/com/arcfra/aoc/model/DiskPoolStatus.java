package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskPoolStatus */
@JsonAdapter(DiskPoolStatus.Adapter.class)
public enum DiskPoolStatus {
    DISCONNECTED("DISCONNECTED"),

    ERROR("ERROR"),

    HEALTHY("HEALTHY"),

    INITIALIZING("INITIALIZING"),

    DISKPOOLSTATUS_UNSUPPORTED_ENUM("DISKPOOLSTATUS_UNSUPPORTED_ENUM");
    private String value;

    DiskPoolStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskPoolStatus fromValue(String value) {
        for (DiskPoolStatus b : DiskPoolStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskPoolStatus.DISKPOOLSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskPoolStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskPoolStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskPoolStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskPoolStatus.fromValue(value);
        }
    }
}

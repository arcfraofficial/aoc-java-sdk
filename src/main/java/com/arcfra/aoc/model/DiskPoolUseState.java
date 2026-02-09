package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DiskPoolUseState */
@JsonAdapter(DiskPoolUseState.Adapter.class)
public enum DiskPoolUseState {
    IDLE("IDLE"),

    IN_USE("IN_USE"),

    REMOVING("REMOVING"),

    DISKPOOLUSESTATE_UNSUPPORTED_ENUM("DISKPOOLUSESTATE_UNSUPPORTED_ENUM");
    private String value;

    DiskPoolUseState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiskPoolUseState fromValue(String value) {
        for (DiskPoolUseState b : DiskPoolUseState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DiskPoolUseState.DISKPOOLUSESTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DiskPoolUseState> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiskPoolUseState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DiskPoolUseState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DiskPoolUseState.fromValue(value);
        }
    }
}

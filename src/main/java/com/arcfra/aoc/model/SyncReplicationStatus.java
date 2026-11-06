package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SyncReplicationStatus */
@JsonAdapter(SyncReplicationStatus.Adapter.class)
public enum SyncReplicationStatus {
    INITIALIZING("INITIALIZING"),

    PAUSED("PAUSED"),

    PENDING("PENDING"),

    SYNCED("SYNCED"),

    SYNCING("SYNCING"),

    SYNCREPLICATIONSTATUS_UNSUPPORTED_ENUM("SYNCREPLICATIONSTATUS_UNSUPPORTED_ENUM");
    private String value;

    SyncReplicationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SyncReplicationStatus fromValue(String value) {
        for (SyncReplicationStatus b : SyncReplicationStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SyncReplicationStatus.SYNCREPLICATIONSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SyncReplicationStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final SyncReplicationStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SyncReplicationStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SyncReplicationStatus.fromValue(value);
        }
    }
}

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets SyncReplicationObjectStatus */
@JsonAdapter(SyncReplicationObjectStatus.Adapter.class)
public enum SyncReplicationObjectStatus {
    SOURCE_UNREACHABLE("SOURCE_UNREACHABLE"),

    TARGET_UNREACHABLE("TARGET_UNREACHABLE"),

    UNEXPECTED_VM_STATUS("UNEXPECTED_VM_STATUS"),

    SYNCREPLICATIONOBJECTSTATUS_UNSUPPORTED_ENUM("SYNCREPLICATIONOBJECTSTATUS_UNSUPPORTED_ENUM");
    private String value;

    SyncReplicationObjectStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SyncReplicationObjectStatus fromValue(String value) {
        for (SyncReplicationObjectStatus b : SyncReplicationObjectStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return SyncReplicationObjectStatus.SYNCREPLICATIONOBJECTSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<SyncReplicationObjectStatus> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final SyncReplicationObjectStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public SyncReplicationObjectStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return SyncReplicationObjectStatus.fromValue(value);
        }
    }
}

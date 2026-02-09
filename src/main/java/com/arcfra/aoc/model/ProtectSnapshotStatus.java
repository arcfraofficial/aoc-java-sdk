package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ProtectSnapshotStatus */
@JsonAdapter(ProtectSnapshotStatus.Adapter.class)
public enum ProtectSnapshotStatus {
    CREATED("PROTECT_SNAPSHOT_STATUS_CREATED"),

    CREATING("PROTECT_SNAPSHOT_STATUS_CREATING"),

    DELETED("PROTECT_SNAPSHOT_STATUS_DELETED"),

    FAILED("PROTECT_SNAPSHOT_STATUS_FAILED"),

    PROTECTSNAPSHOTSTATUS_UNSUPPORTED_ENUM("PROTECTSNAPSHOTSTATUS_UNSUPPORTED_ENUM");
    private String value;

    ProtectSnapshotStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProtectSnapshotStatus fromValue(String value) {
        for (ProtectSnapshotStatus b : ProtectSnapshotStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ProtectSnapshotStatus.PROTECTSNAPSHOTSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ProtectSnapshotStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final ProtectSnapshotStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ProtectSnapshotStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ProtectSnapshotStatus.fromValue(value);
        }
    }
}

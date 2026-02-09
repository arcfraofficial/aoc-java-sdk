package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupRestorePointCreation */
@JsonAdapter(BackupRestorePointCreation.Adapter.class)
public enum BackupRestorePointCreation {
    AUTO("AUTO"),

    FAILBACK("FAILBACK"),

    FAILOVER("FAILOVER"),

    FAILOVER_TEST("FAILOVER_TEST"),

    MANUAL("MANUAL"),

    SYNC_REPLICATION("SYNC_REPLICATION"),

    SYNC_REPLICATION_ERROR("SYNC_REPLICATION_ERROR"),

    SYNC_REPLICATION_INITIALIZATION("SYNC_REPLICATION_INITIALIZATION"),

    SYNC_REPLICATION_SYNCING("SYNC_REPLICATION_SYNCING"),

    BACKUPRESTOREPOINTCREATION_UNSUPPORTED_ENUM("BACKUPRESTOREPOINTCREATION_UNSUPPORTED_ENUM");
    private String value;

    BackupRestorePointCreation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupRestorePointCreation fromValue(String value) {
        for (BackupRestorePointCreation b : BackupRestorePointCreation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupRestorePointCreation.BACKUPRESTOREPOINTCREATION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupRestorePointCreation> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupRestorePointCreation enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupRestorePointCreation read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupRestorePointCreation.fromValue(value);
        }
    }
}

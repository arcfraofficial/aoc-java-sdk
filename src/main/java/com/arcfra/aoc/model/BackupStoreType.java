package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupStoreType */
@JsonAdapter(BackupStoreType.Adapter.class)
public enum BackupStoreType {
    BOOSTFS("BOOSTFS"),

    ISCSI("ISCSI"),

    NETBACKUP("NETBACKUP"),

    NFS3("NFS3"),

    NFS4("NFS4"),

    BACKUPSTORETYPE_UNSUPPORTED_ENUM("BACKUPSTORETYPE_UNSUPPORTED_ENUM");
    private String value;

    BackupStoreType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupStoreType fromValue(String value) {
        for (BackupStoreType b : BackupStoreType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupStoreType.BACKUPSTORETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupStoreType> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupStoreType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupStoreType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupStoreType.fromValue(value);
        }
    }
}

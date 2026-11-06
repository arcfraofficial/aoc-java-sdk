package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupServiceNetworkType */
@JsonAdapter(BackupServiceNetworkType.Adapter.class)
public enum BackupServiceNetworkType {
    MANAGEMENT("MANAGEMENT"),

    NEW_NIC("NEW_NIC"),

    STORAGE("STORAGE"),

    BACKUPSERVICENETWORKTYPE_UNSUPPORTED_ENUM("BACKUPSERVICENETWORKTYPE_UNSUPPORTED_ENUM");
    private String value;

    BackupServiceNetworkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupServiceNetworkType fromValue(String value) {
        for (BackupServiceNetworkType b : BackupServiceNetworkType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupServiceNetworkType.BACKUPSERVICENETWORKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupServiceNetworkType> {
        @Override
        public void write(final JsonWriter jsonWriter, final BackupServiceNetworkType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupServiceNetworkType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupServiceNetworkType.fromValue(value);
        }
    }
}

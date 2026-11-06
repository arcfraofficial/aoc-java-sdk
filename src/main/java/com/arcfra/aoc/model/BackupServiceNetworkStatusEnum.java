package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets BackupServiceNetworkStatusEnum */
@JsonAdapter(BackupServiceNetworkStatusEnum.Adapter.class)
public enum BackupServiceNetworkStatusEnum {
    CONNECTED("CONNECTED"),

    DISCONNECTED("DISCONNECTED"),

    BACKUPSERVICENETWORKSTATUSENUM_UNSUPPORTED_ENUM(
            "BACKUPSERVICENETWORKSTATUSENUM_UNSUPPORTED_ENUM");
    private String value;

    BackupServiceNetworkStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BackupServiceNetworkStatusEnum fromValue(String value) {
        for (BackupServiceNetworkStatusEnum b : BackupServiceNetworkStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return BackupServiceNetworkStatusEnum.BACKUPSERVICENETWORKSTATUSENUM_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<BackupServiceNetworkStatusEnum> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final BackupServiceNetworkStatusEnum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BackupServiceNetworkStatusEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BackupServiceNetworkStatusEnum.fromValue(value);
        }
    }
}

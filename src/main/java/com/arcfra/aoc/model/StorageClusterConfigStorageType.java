package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageClusterConfigStorageType */
@JsonAdapter(StorageClusterConfigStorageType.Adapter.class)
public enum StorageClusterConfigStorageType {
    DATASTORE("DATASTORE"),

    STORAGE_CLUSTER("STORAGE_CLUSTER"),

    STORAGECLUSTERCONFIGSTORAGETYPE_UNSUPPORTED_ENUM(
            "STORAGECLUSTERCONFIGSTORAGETYPE_UNSUPPORTED_ENUM");
    private String value;

    StorageClusterConfigStorageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageClusterConfigStorageType fromValue(String value) {
        for (StorageClusterConfigStorageType b : StorageClusterConfigStorageType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageClusterConfigStorageType.STORAGECLUSTERCONFIGSTORAGETYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageClusterConfigStorageType> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final StorageClusterConfigStorageType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageClusterConfigStorageType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return StorageClusterConfigStorageType.fromValue(value);
        }
    }
}

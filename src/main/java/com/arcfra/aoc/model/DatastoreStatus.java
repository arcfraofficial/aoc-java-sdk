package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DatastoreStatus */
@JsonAdapter(DatastoreStatus.Adapter.class)
public enum DatastoreStatus {
    ACTIVE("ACTIVE"),

    ATTACHING("ATTACHING"),

    CREATING("CREATING"),

    ERROR("ERROR"),

    INACTIVE("INACTIVE"),

    DATASTORESTATUS_UNSUPPORTED_ENUM("DATASTORESTATUS_UNSUPPORTED_ENUM");
    private String value;

    DatastoreStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DatastoreStatus fromValue(String value) {
        for (DatastoreStatus b : DatastoreStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DatastoreStatus.DATASTORESTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DatastoreStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final DatastoreStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DatastoreStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DatastoreStatus.fromValue(value);
        }
    }
}

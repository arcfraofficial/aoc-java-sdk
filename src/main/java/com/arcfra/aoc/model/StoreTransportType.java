package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StoreTransportType */
@JsonAdapter(StoreTransportType.Adapter.class)
public enum StoreTransportType {
    RDMA("RDMA"),

    TCP("TCP"),

    STORETRANSPORTTYPE_UNSUPPORTED_ENUM("STORETRANSPORTTYPE_UNSUPPORTED_ENUM");
    private String value;

    StoreTransportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StoreTransportType fromValue(String value) {
        for (StoreTransportType b : StoreTransportType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StoreTransportType.STORETRANSPORTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StoreTransportType> {
        @Override
        public void write(final JsonWriter jsonWriter, final StoreTransportType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StoreTransportType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StoreTransportType.fromValue(value);
        }
    }
}

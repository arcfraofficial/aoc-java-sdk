package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StoreConnectionType */
@JsonAdapter(StoreConnectionType.Adapter.class)
public enum StoreConnectionType {
    ISCSI("ISCSI"),

    NVME("NVMe"),

    STORECONNECTIONTYPE_UNSUPPORTED_ENUM("STORECONNECTIONTYPE_UNSUPPORTED_ENUM");
    private String value;

    StoreConnectionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StoreConnectionType fromValue(String value) {
        for (StoreConnectionType b : StoreConnectionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StoreConnectionType.STORECONNECTIONTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StoreConnectionType> {
        @Override
        public void write(final JsonWriter jsonWriter, final StoreConnectionType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StoreConnectionType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StoreConnectionType.fromValue(value);
        }
    }
}

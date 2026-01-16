package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NetworkType */
@JsonAdapter(NetworkType.Adapter.class)
public enum NetworkType {
    ACCESS("ACCESS"),

    MANAGEMENT("MANAGEMENT"),

    MIGRATION("MIGRATION"),

    STORAGE("STORAGE"),

    STORAGE_ACCESS("STORAGE_ACCESS"),

    VM("VM"),

    VPC_SYS("VPC_SYS"),

    VPC_VM("VPC_VM"),

    NETWORKTYPE_UNSUPPORTED_ENUM("NETWORKTYPE_UNSUPPORTED_ENUM");
    private String value;

    NetworkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkType fromValue(String value) {
        for (NetworkType b : NetworkType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NetworkType.NETWORKTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NetworkType> {
        @Override
        public void write(final JsonWriter jsonWriter, final NetworkType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NetworkType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NetworkType.fromValue(value);
        }
    }
}

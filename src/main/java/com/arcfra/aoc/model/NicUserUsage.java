package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NicUserUsage */
@JsonAdapter(NicUserUsage.Adapter.class)
public enum NicUserUsage {
    DEFAULT("DEFAULT"),

    PASS_THROUGH("PASS_THROUGH"),

    SRIOV("SRIOV"),

    NICUSERUSAGE_UNSUPPORTED_ENUM("NICUSERUSAGE_UNSUPPORTED_ENUM");
    private String value;

    NicUserUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NicUserUsage fromValue(String value) {
        for (NicUserUsage b : NicUserUsage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NicUserUsage.NICUSERUSAGE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NicUserUsage> {
        @Override
        public void write(final JsonWriter jsonWriter, final NicUserUsage enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NicUserUsage read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NicUserUsage.fromValue(value);
        }
    }
}

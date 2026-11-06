package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationMethod */
@JsonAdapter(ReplicationMethod.Adapter.class)
public enum ReplicationMethod {
    ASYNC("ASYNC"),

    SYNC("SYNC"),

    REPLICATIONMETHOD_UNSUPPORTED_ENUM("REPLICATIONMETHOD_UNSUPPORTED_ENUM");
    private String value;

    ReplicationMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationMethod fromValue(String value) {
        for (ReplicationMethod b : ReplicationMethod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationMethod.REPLICATIONMETHOD_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationMethod> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicationMethod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationMethod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicationMethod.fromValue(value);
        }
    }
}

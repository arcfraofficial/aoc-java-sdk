package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EntityAsyncStatus */
@JsonAdapter(EntityAsyncStatus.Adapter.class)
public enum EntityAsyncStatus {
    CREATING("CREATING"),

    DELETING("DELETING"),

    UPDATING("UPDATING"),

    ENTITYASYNCSTATUS_UNSUPPORTED_ENUM("ENTITYASYNCSTATUS_UNSUPPORTED_ENUM");
    private String value;

    EntityAsyncStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityAsyncStatus fromValue(String value) {
        for (EntityAsyncStatus b : EntityAsyncStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EntityAsyncStatus.ENTITYASYNCSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EntityAsyncStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final EntityAsyncStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EntityAsyncStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EntityAsyncStatus.fromValue(value);
        }
    }
}

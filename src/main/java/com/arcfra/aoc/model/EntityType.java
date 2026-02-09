package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EntityType */
@JsonAdapter(EntityType.Adapter.class)
public enum EntityType {
    VM("VM"),

    ENTITYTYPE_UNSUPPORTED_ENUM("ENTITYTYPE_UNSUPPORTED_ENUM");
    private String value;

    EntityType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityType fromValue(String value) {
        for (EntityType b : EntityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EntityType.ENTITYTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EntityType> {
        @Override
        public void write(final JsonWriter jsonWriter, final EntityType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EntityType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EntityType.fromValue(value);
        }
    }
}

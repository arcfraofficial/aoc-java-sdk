package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationPlanType */
@JsonAdapter(ReplicationPlanType.Adapter.class)
public enum ReplicationPlanType {
    STORAGE_VOLUME("STORAGE_VOLUME"),

    VM("VM"),

    REPLICATIONPLANTYPE_UNSUPPORTED_ENUM("REPLICATIONPLANTYPE_UNSUPPORTED_ENUM");
    private String value;

    ReplicationPlanType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationPlanType fromValue(String value) {
        for (ReplicationPlanType b : ReplicationPlanType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationPlanType.REPLICATIONPLANTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationPlanType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicationPlanType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationPlanType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicationPlanType.fromValue(value);
        }
    }
}

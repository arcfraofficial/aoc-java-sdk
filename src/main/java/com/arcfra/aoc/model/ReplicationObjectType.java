package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationObjectType */
@JsonAdapter(ReplicationObjectType.Adapter.class)
public enum ReplicationObjectType {
    CONSISTENCY_GROUP("CONSISTENCY_GROUP"),

    ISCSI_LUN("ISCSI_LUN"),

    NVMF_NAMESPACE("NVMF_NAMESPACE"),

    VM("VM"),

    REPLICATIONOBJECTTYPE_UNSUPPORTED_ENUM("REPLICATIONOBJECTTYPE_UNSUPPORTED_ENUM");
    private String value;

    ReplicationObjectType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationObjectType fromValue(String value) {
        for (ReplicationObjectType b : ReplicationObjectType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationObjectType.REPLICATIONOBJECTTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationObjectType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicationObjectType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationObjectType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicationObjectType.fromValue(value);
        }
    }
}

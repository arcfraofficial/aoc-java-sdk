package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicaNameRule */
@JsonAdapter(ReplicaNameRule.Adapter.class)
public enum ReplicaNameRule {
    ORIGIN("ORIGIN"),

    PREFIX("PREFIX"),

    SUFFIX("SUFFIX"),

    REPLICANAMERULE_UNSUPPORTED_ENUM("REPLICANAMERULE_UNSUPPORTED_ENUM");
    private String value;

    ReplicaNameRule(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicaNameRule fromValue(String value) {
        for (ReplicaNameRule b : ReplicaNameRule.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicaNameRule.REPLICANAMERULE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicaNameRule> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReplicaNameRule enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicaNameRule read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReplicaNameRule.fromValue(value);
        }
    }
}
